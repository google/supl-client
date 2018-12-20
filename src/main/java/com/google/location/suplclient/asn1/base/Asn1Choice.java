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

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import javax.annotation.Nullable;

/**
 * Implements ASN.1 functionality.
 *
 * 
 */
public abstract class Asn1Choice extends Asn1Object {
  /**
   * Dummy non-tag used as default tag for CHOICE, which reflects the BER encoding idea
   * that CHOICE is not an object in itself, it just gets coded as its value. This means
   * that it doesn't matter whether the choice object tag is designated as IMPLICIT or
   * EXPLICIT, it gets coded the same way anyway.
   */
  private static final Asn1Tag DUMMY_DEFAULT_TAG = new Asn1Tag(null, Integer.MIN_VALUE) {
    @Override
    public int getTaggedLength(int valueLength) {
      return valueLength;
    }

    @Override
    public void writeTagAndLength(ByteBuffer buf, boolean constructed, int valueLength) {
      // Do nothing.
    }

    @Override
    int getValue() {
      throw new UnsupportedOperationException("This is not a real tag.");
    }
  };

  /**
   * Returns true if the type has an extension marker.
   */
  protected abstract boolean isExtensible();

  /**
   * Returns true if the value set is an extension value.
   */
  protected abstract boolean hasExtensionValue();

  /**
   * Returns the ordinal of the chosen value (extension values re-start at 0),
   * or null if no value is set.
   */
  @Nullable protected abstract Integer getSelectionOrdinal();

  @Nullable protected abstract ChoiceComponent getSelectedComponent();

  /** Returns the chosen value. */
  public abstract Asn1Object getValue();

  /**
   * Returns the number of choices available for the current value of
   * {@code hasExtensionValue()}. If no value has been set, the number of
   * choices for a non-extension value is returned.
   */
  protected abstract int getOptionCount();

  /**
   * Creates a new instance of the type specified by the parameters, sets
   * the current value of this instance to it and returns the newly created
   * value.
   */
  protected abstract Asn1Object createAndSetValue(boolean isExtensionValue,
                                                  int ordinal);

  /**
   * Given an Asn1Tag, creates and sets the value of this enumeration to a newly created object.
   * Used in BER decoding.
   *
   * @param tag the tag read from the input stream (less the "constructed" bit)
   * @return the newly created enumeration component
   * @throws IllegalArgumentException if the tag is not recognized. This currently includes
   * extension values.
   */
  protected abstract ChoiceComponent createAndSetValue(Asn1Tag tag);

  @Override Asn1Tag getDefaultTag() {
    return DUMMY_DEFAULT_TAG;
  }

  @Override boolean isConstructed() {
    return true;
  }


  @Override
  public int getBerValueLength() {
    if (hasExtensionValue()) {
      throw new UnsupportedOperationException("BER for extension values is unsupported");
    }
    ChoiceComponent select = getSelectedComponent();
    if (select == null) {
      throw new NullPointerException("No component set");
    }
    if (select.getTag() != null) {
      int valueLen;
      if (select.isImplicitTagging()) {
        valueLen = getValue().getBerValueLength();
      } else {
        valueLen = getValue().getBerLength();
      }
      return select.getTag().getTaggedLength(valueLen);
    }
    return getValue().getBerLength();
  }

  @Override
  public void encodeBerValue(ByteBuffer buf) {
    if (hasExtensionValue()) {
      throw new UnsupportedOperationException("BER for extension values is unsupported");
    }
    ChoiceComponent select = getSelectedComponent();
    if (select == null) {
      throw new NullPointerException("No component set");
    }
    Asn1Object value = getValue();
    if (select.getTag() != null) {
      if (select.isImplicitTagging()) {
        select.getTag().writeTagAndLength(buf, value.isConstructed(), value.getBerValueLength());
        value.encodeBerValue(buf);
      } else {
        select.getTag().writeTagAndLength(buf, true, value.getBerLength());
        value.encodeBer(buf);
      }
    } else {
      value.encodeBer(buf);
    }
  }

  @Override
  public void decodeBerValue(ByteBuffer buf) {
    Asn1Tag tag = Asn1Tag.peekTag(buf);
    ChoiceComponent select = createAndSetValue(tag);
    if (select == null) {
      throw new IllegalArgumentException("Unknown selection tag: " + tag);
    }
    Asn1Object element = getValue();
    if (select.getTag() != null) {
      Asn1Tag.readTag(buf); // Read the tag off.
      int valueLen = Asn1Tag.readLength(buf);

      if (valueLen != buf.remaining()) {
        throw new IllegalArgumentException("Length mismatch: expected=" + buf.remaining()
            + ", actual=" + valueLen);
      }

      if (select.isImplicitTagging()) {
        element.decodeBerValue(buf);
        return;
      }
    }
    element.decodeBer(buf);
  }

  @Override
  public void decodeBer(ByteBuffer buf) {
    if (getTag() != null) {
      // This CHOICE is tagged
      Asn1Tag tag = Asn1Tag.readTag(buf);
      Asn1Tag.readLength(buf); // read len, but not used.
      checkTag(tag, getTag());
    }
    decodeBerValue(buf);
  }

  private Iterable<BitStream> encodePerImpl(boolean aligned) {
    ImmutableList.Builder<BitStream> listBuilder = ImmutableList.builder();
    if (isExtensible()) {
      BitStream extensionMarker = new BitStream();
      extensionMarker.appendBit(hasExtensionValue());
      listBuilder.add(extensionMarker);
    }

    int optionCount = getOptionCount();
    Integer selectionOrdinal = getSelectionOrdinal();
    Preconditions.checkState(optionCount == 0 || selectionOrdinal != null,
                             "No value set.");
    if (hasExtensionValue()) {
      if (aligned) {
        listBuilder.addAll(
            PerAlignedUtils.encodeNormallySmallWholeNumber(selectionOrdinal));
      } else {
        listBuilder.addAll(
            PerUnalignedUtils.encodeNormallySmallWholeNumber(
              selectionOrdinal));
      }
    } else if (optionCount > 1) {
      if (aligned) {
        listBuilder.add(
            PerAlignedUtils.encodeSmallConstrainedWholeNumber(
                selectionOrdinal, 0, optionCount - 1));
      } else {
        listBuilder.add(
            PerUnalignedUtils.encodeConstrainedWholeNumber(
                selectionOrdinal, 0, optionCount - 1));
      }
    }

    if (optionCount > 0) {
      Asn1Object value = getValue();
      if (hasExtensionValue()) {
        if (aligned) {
          listBuilder.addAll(PerAlignedUtils.encodeOpenTypeField(value));
        } else {
          listBuilder.addAll(
              PerUnalignedUtils.encodeOpenTypeField(value));
        }
      } else {
        if (aligned) {
          listBuilder.addAll(value.encodePerAligned());
        } else {
          listBuilder.addAll(value.encodePerUnaligned());
        }
      }
    }
    return listBuilder.build();
  }

  @Override public Iterable<BitStream> encodePerUnaligned() {
    return encodePerImpl(false);
  }

  @Override public Iterable<BitStream> encodePerAligned() {
    return encodePerImpl(true);
  }

  private void decodePerImpl(BitStreamReader reader, boolean aligned) {
    boolean extensionValued = false;
    Integer selectionOrdinal = 0;
    if (isExtensible()) {
      extensionValued = reader.readBit();
    }
    if (extensionValued) {
      if (aligned) {
        selectionOrdinal = PerAlignedUtils.decodeNormallySmallWholeNumber(reader);
      } else {
        selectionOrdinal = PerUnalignedUtils.decodeNormallySmallWholeNumber(reader);
      }
    } else if (getOptionCount() > 1) {
      if (aligned) {
        selectionOrdinal = PerAlignedUtils.decodeSmallConstrainedWholeNumber(
            reader, 0, getOptionCount() - 1);
      } else {
        selectionOrdinal = PerUnalignedUtils.decodeConstrainedWholeNumber(
            reader, 0, getOptionCount() - 1);
      }
    }
    if (extensionValued) {
      Asn1Object element = createAndSetValue(extensionValued, selectionOrdinal);
      if (aligned) {
        PerAlignedUtils.decodeOpenTypeField(reader, element);
      } else {
        PerUnalignedUtils.decodeOpenTypeField(reader, element);
      }
    } else if (getOptionCount() > 0) {
      Asn1Object element = createAndSetValue(extensionValued, selectionOrdinal);
      if (aligned) {
        element.decodePerAligned(reader);
      } else {
        element.decodePerUnaligned(reader);
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
