// Copyright 2018 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

// Copyright 2008 Google Inc. All Rights Reserved.

package com.google.location.suplclient.asn1.base;

import com.google.common.collect.ImmutableList;

import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.NoSuchElementException;

/**
 * Implements ASN.1 functionality.
 *
 * 
 */
public abstract class Asn1Sequence extends Asn1Object {
  private static final Collection<Asn1Tag> possibleFirstTags =
      ImmutableList.of(Asn1Tag.SEQUENCE);

  protected abstract boolean isExtensible();

  protected abstract boolean containsExtensionValues();

  protected abstract Iterable<? extends SequenceComponent> getComponents();

  protected abstract Iterable<? extends SequenceComponent> getExtensionComponents();

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    return possibleFirstTags;
  }

  @Override Asn1Tag getDefaultTag() {
    return Asn1Tag.SEQUENCE;
  }

  @Override boolean isConstructed() {
    return true;
  }

  @Override
  public int getBerValueLength() {
    int length = 0;
    for (SequenceComponent component : getComponents()) {
      if (component.isExplicitlySet()) {
        Asn1Tag tag = component.getTag();
        Asn1Object value = component.getComponentValue();
        if (tag == null) {
          length += value.getBerLength();
        } else {
          int valueLen = component.isImplicitTagging()
              ? value.getBerValueLength() : value.getBerLength();
          length += tag.getTaggedLength(valueLen);
        }
      }
    }
    return length;
  }

  @Override
  public void encodeBerValue(ByteBuffer buf) {
    for (SequenceComponent component : getComponents()) {
      if (component.isExplicitlySet()) {
        Asn1Object obj = component.getComponentValue();
        Asn1Tag componentTag = component.getTag();
        if (componentTag == null) {
          obj.encodeBer(buf);
        } else {
          if (component.isImplicitTagging()) {
            componentTag.writeTagAndLength(buf, obj.isConstructed(), obj.getBerValueLength());
            obj.encodeBerValue(buf);
          } else {
            componentTag.writeTagAndLength(buf, true, obj.getBerLength());
            obj.encodeBer(buf);
          }
        }
      } else if (!component.isOptional() && !component.hasDefaultValue()) {
        throw new IllegalStateException("Mandatory component "
            + component.getClass().getName()
            + " not set.");
      }
    }
  }

  @Override
  public void decodeBerValue(ByteBuffer buf) {
    Iterable<? extends SequenceComponent> components = getComponents();

    while (buf.hasRemaining()) {
      int bufStartPos = buf.position();
      int bufEndPos = buf.limit();
      Asn1Tag tag = Asn1Tag.readTag(buf);
      SequenceComponent component = getComponent(components, tag);
      if (component.isExplicitlySet()) {
        throw new IllegalArgumentException("Encountered duplicate field");
      }
      component.setToNewInstance();
      int valueLength = Asn1Tag.readLength(buf);
      buf.limit(buf.position() + valueLength);
      if (component.getTag() != null) {
        if (component.isImplicitTagging()) {
          component.getComponentValue().decodeBerValue(buf);
        } else {
          component.getComponentValue().decodeBer(buf);
        }
      } else {
        buf.position(bufStartPos); // rewind to before tag
        component.getComponentValue().decodeBer(buf);
      }
      buf.limit(bufEndPos); // set the limit back to the real end position
    }

    checkMandatoryFieldsPresent(components);
  }

  /**
   * Throws {@link IllegalArgumentException} if all mandatory fields not set on this sequence.
   */
  private void checkMandatoryFieldsPresent(Iterable<? extends SequenceComponent> components) {
    for (SequenceComponent component : components) {
      if (!component.isOptional() && !component.isExplicitlySet()) {
        throw new IllegalArgumentException("Mandatory field not present");
      }
    }
  }

  /**
   * Returns the child component that can start with the specified tag.
   * @throws NoSuchElementException if no child component can start with the tag
   */
  private SequenceComponent getComponent(Iterable<? extends SequenceComponent> components,
      Asn1Tag tag) {
    for (SequenceComponent component : components) {
      if (component.getPossibleFirstTags().contains(tag)) {
        return component;
      }
    }
    throw new NoSuchElementException("SEQUENCE=" + this + ", tag=" + tag);
  }

  private Iterable<BitStream> encodePerImpl(boolean aligned) {
    ImmutableList.Builder<BitStream> listBuilder = ImmutableList.builder();
    BitStream prefix = new BitStream();

    if (isExtensible()) {
      prefix.appendBit(containsExtensionValues());
    }

    Iterable<? extends SequenceComponent> components = getComponents();
    int bitFieldSize = calculateBitFieldSize(components);
    if (bitFieldSize >= PerAlignedUtils.SIXTYFOUR_K) {
      throw new UnsupportedOperationException("unimplemented");
    }
    for (SequenceComponent component : components) {
      if (component.isOptional() || component.hasDefaultValue()) {
        prefix.appendBit(component.isExplicitlySet());
      } else if (!component.isExplicitlySet()) {
        throw new IllegalStateException("Mandatory component "
                                        + component.getClass().getName()
                                        + " not set.");
      }
    }
    listBuilder.add(prefix);

    for (SequenceComponent component : components) {
      if (component.isExplicitlySet()) {
        Asn1Object value = component.getComponentValue();
        Iterable<BitStream> encodedValue = null;
        if (aligned) {
          encodedValue = value.encodePerAligned();
        } else {
          encodedValue = value.encodePerUnaligned();
        }
        listBuilder.addAll(encodedValue);
      }
    }

    if (isExtensible() && containsExtensionValues()) {
      Iterable<? extends SequenceComponent> extensionComponents =
          getExtensionComponents();
      BitStream extensions = new BitStream();
      int extensionBitFieldSize = 0;
      /*
       * Adding a bit marker per extension addition as ITU spec, however some
       * H323 implementations seem to only add markers up to the last set
       * extension.
       */
      for (SequenceComponent component : extensionComponents) {
        if (!component.isOptional() && !component.isExplicitlySet()) {
          throw new IllegalStateException("Mandatory extension component "
                                          + component.getClass().getName()
                                          + " not set.");
        }
        extensions.appendBit(component.isExplicitlySet());
        extensionBitFieldSize++;
      }
      if (extensionBitFieldSize <= 64) {
        //encode length to x.691-0207 10.9.3.4 (i.e. length -1)
        BitStream lengthDeterminant = new BitStream();
        lengthDeterminant.appendBit(false);
        lengthDeterminant.appendLowBits(6, (byte) (extensionBitFieldSize - 1));
        listBuilder.add(lengthDeterminant);
      } else {
        BitStream marker = new BitStream();
        marker.appendBit(true);
        listBuilder.add(marker);
        BitStream lengthDeterminant = null;
        if (aligned) {
          lengthDeterminant =
              PerAlignedUtils.encodeSemiConstrainedLength(extensionBitFieldSize);
          lengthDeterminant.setBeginByteAligned();
        } else {
          lengthDeterminant =
              PerUnalignedUtils.encodeSemiConstrainedLength(extensionBitFieldSize);
        }
        listBuilder.add(lengthDeterminant);
      }
      listBuilder.add(extensions);
      for (SequenceComponent component : extensionComponents) {
        if (component.isExplicitlySet()) {
          Iterable<BitStream> extensionValues = null;
          if (aligned) {
            extensionValues = PerAlignedUtils.
                encodeOpenTypeField(component.getComponentValue());
          } else {
            extensionValues = PerUnalignedUtils.encodeOpenTypeField(component.getComponentValue());
          }
          listBuilder.addAll(extensionValues);
        }
      }
    }
    return listBuilder.build();
  }

  @Override public Iterable<BitStream> encodePerUnaligned() {
    return encodePerImpl(false);
  }

  @Override
  public Iterable<BitStream> encodePerAligned() {
    return encodePerImpl(true);
  }

  private int calculateBitFieldSize(
      Iterable<? extends SequenceComponent> components) {
    int bitFieldSize = 0;
    for (SequenceComponent component : components) {
      if (component.isOptional() || component.hasDefaultValue()) {
        bitFieldSize++;
      }
    }
    return bitFieldSize;
  }

  private void decodePerImpl(BitStreamReader reader, boolean aligned) {
    boolean hasExtensionValuesToDecode = false;
    if (isExtensible()) {
      hasExtensionValuesToDecode = reader.readBit();
    }

    Iterable<? extends SequenceComponent> components = getComponents();
    int bitFieldSize = calculateBitFieldSize(components);
    if (bitFieldSize >= PerAlignedUtils.SIXTYFOUR_K) {
      throw new UnsupportedOperationException("unimplemented");
    }
    for (SequenceComponent component : components) {
      if (component.isOptional() || component.hasDefaultValue()) {
        if (reader.readBit()) {
          component.setToNewInstance();
        }
      } else {
        component.setToNewInstance();
      }
    }

    for (SequenceComponent component : components) {
      if (component.isExplicitlySet()) {
        if (aligned) {
          component.getComponentValue().decodePerAligned(reader);
        } else {
          component.getComponentValue().decodePerUnaligned(reader);
        }
      }
    }

    if (hasExtensionValuesToDecode) {
      Iterable<? extends SequenceComponent> extensionComponents =
          getExtensionComponents();
      int extensionBitFieldSize;
      if (reader.readBit()) {
        if (aligned) {
          reader.spoolToByteBoundary();
          extensionBitFieldSize =
              PerAlignedUtils.decodeSemiConstrainedLength(reader);
        } else {
          extensionBitFieldSize =
              PerUnalignedUtils.decodeSemiConstrainedLength(reader);
        }
      } else {
        extensionBitFieldSize = 1 + reader.readLowBits(6);
      }
      for (SequenceComponent component : extensionComponents) {
        if (extensionBitFieldSize > 0) {
          --extensionBitFieldSize;
          if (reader.readBit()) {
            component.setToNewInstance();
          }
        }
      }
      int unknownExtensionCount = 0;
      for (; extensionBitFieldSize > 0; --extensionBitFieldSize) {
        if (reader.readBit()) {
          ++unknownExtensionCount;
        }
      }
      for (SequenceComponent component : extensionComponents) {
        if (component.isExplicitlySet()) {
          if (aligned) {
            byte[] encodedComponent =
                PerAlignedUtils.decodeSemiConstrainedLengthOfBytes(reader);
            component.getComponentValue().decodePerAligned(new BitStreamReader(encodedComponent));
          } else {
            byte[] encodedComponent =
                PerUnalignedUtils.decodeSemiConstrainedLengthOfBytes(reader);
            component.getComponentValue().decodePerUnaligned(new BitStreamReader(encodedComponent));
          }
        }
      }
      for (; unknownExtensionCount > 0; --unknownExtensionCount) {
        if (aligned) {
          byte[] unknownEncodedExtension =
              PerAlignedUtils.decodeSemiConstrainedLengthOfBytes(reader);
        } else {
          byte[] unknownEncodedExtension =
              PerUnalignedUtils.decodeSemiConstrainedLengthOfBytes(reader);
        }
      }
    }
  }

  @Override public void decodePerUnaligned(BitStreamReader reader) {
    decodePerImpl(reader, false);
  }

  @Override public void decodePerAligned(BitStreamReader reader) {
    decodePerImpl(reader, true);
  }
}

