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

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;
import java.util.Collection;

import javax.annotation.Nullable;

/**
 * Specifies ASN.1 functionality needed for all ASN.1 objects.
 *
 * 
 */
public abstract class Asn1Object {
  /**
   * Returns the tags that can decode to this type. Subclasses are expected to "fauxverride".
   */
  public static Collection<Asn1Tag> getPossibleFirstTags() {
    throw new UnsupportedOperationException("No first tags defined");
  }

  /**
   * Returns the universal tag defined for the base type.
   */
  abstract Asn1Tag getDefaultTag();

  /**
   * Returns the declared tag for this type. Tagged subclasses must override, the
   * default implementation returns null.
   */
  @Nullable protected Asn1Tag getTag() {
    return null;
  }

  /**
   * Returns true if implicit tagging is to be applied to the type. Tagged subclasses must
   * override, the default implementation throws.
   */
  protected boolean isTagImplicit() {
    throw new IllegalStateException("Not a tagged subclass");
  }

  /**
   * Returns true if this object is "constructed", that is, it's composed of further TLVs
   * (as opposed to being primitive).
   */
  boolean isConstructed() {
    return false;
  }

  /**
   * Returns the number of octets in the BER encoding of this object. Called by
   * {@link #encodeBer()} to allocate a buffer of the correct size before starting
   * the encoding.
   */
  int getBerLength() {
    int valueLen = getBerValueLength();
    Asn1Tag tag = getTag();
    if (tag == null) {
      tag = getDefaultTag();
    } else if (!isTagImplicit()) {
      valueLen = getDefaultTag().getTaggedLength(valueLen);
    }
    return tag.getTaggedLength(valueLen);
  }

  /**
   * Returns the number of octets required to encoded the value of this {@link Asn1Object}.
   */
  abstract int getBerValueLength();

  /**
   * Returns the BER encoding of this object.
   */
  public byte[] encodeBer() {
    ByteBuffer buf = ByteBuffer.allocate(getBerLength());
    encodeBer(buf);
    return buf.array();
  }

  void encodeBer(ByteBuffer buf) {
    int valueLen = getBerValueLength();
    Asn1Tag tag = getTag();
    if (tag == null) {
      tag = getDefaultTag();
    } else {
      if (!isTagImplicit()) {
        int innerValueLen = getDefaultTag().getTaggedLength(valueLen);
        tag.writeTagAndLength(buf, true, innerValueLen);
        tag = getDefaultTag();
      }
    }
    tag.writeTagAndLength(buf, isConstructed(), valueLen);
    encodeBerValue(buf);
  }

  /**
   * Writes the BER encoded value of this {@link Asn1Object} into the specified buffer.
   *
   * @param buf the byte buffer to write to
   * @throws BufferOverflowException If there is insufficient space in the buffer
   * @throws ReadOnlyBufferException If the buffer is read-only
   */
  abstract void encodeBerValue(ByteBuffer buf);

  /**
   * BER decodes the provided buffer. Should only be called on newly created instances as subclasses
   * may not write optional fields not explicitly present in the input.
   *
   * @param data the BER encoded input
   * @throws IllegalArgumentException in case of parsing failure
   */
  public void decodeBer(byte[] data) {
    decodeBer(ByteBuffer.wrap(data));
  }

  void decodeBer(ByteBuffer buf) {
    Asn1Tag tag = Asn1Tag.readTag(buf);
    int valueLen = Asn1Tag.readLength(buf);

    if (valueLen != buf.remaining()) {
      throw new IllegalArgumentException("Length mismatch: expected=" + buf.remaining()
          + ", actual=" + valueLen);
    }

    if (getTag() != null) {
      checkTag(tag, getTag());
      if (!isTagImplicit()) {
        // read inner tag and length
        Asn1Tag innerTag = Asn1Tag.readTag(buf);
        int innerValueLen = Asn1Tag.readLength(buf);
        if (innerValueLen != buf.remaining()) {
          throw new IllegalArgumentException("Length mismatch: expected=" + buf.remaining()
              + ", actual=" + innerValueLen);
        }
        checkTag(innerTag, getDefaultTag());
      }
    }

    decodeBerValue(buf);

    if (buf.hasRemaining()) {
      throw new IllegalArgumentException("BER encoded input not fully read");
    }
  }

  void checkTag(Asn1Tag actual, Asn1Tag expected) {
    if (!expected.equals(actual)) {
      throw new IllegalArgumentException("Invalid tag: expected=" + expected
          + ", actual=" + actual);
    }
  }

  /**
   * Decodes the BER encoded value of this {@link Asn1Object}. On return from this method the
   * provided buffer should be empty.
   */
  abstract void decodeBerValue(ByteBuffer buf);

  /**
   * Returns remaining bytes in the {@link ByteBuffer} in a newly allocated byte array of exactly
   * the right size. The ByteBuffer will be empty upon return.
   */
  static byte[] getRemaining(ByteBuffer buf) {
    byte[] bytes = new byte[buf.remaining()];
    buf.get(bytes);
    return bytes;
  }

  public abstract Iterable<BitStream> encodePerAligned();

  public abstract Iterable<BitStream> encodePerUnaligned();

  /**
   * This method should only be called on a newly created instance to avoid
   * having residue state in it.
   */
  public abstract void decodePerUnaligned(BitStreamReader reader);


  /**
   * This method should only be called on a newly created instance to avoid
   * having residue state in it.
   */
  public abstract void decodePerAligned(BitStreamReader reader);

  public String toIndentedString(String indent) {
    return indent + toString();
  }
}
