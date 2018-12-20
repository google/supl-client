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

package com.google.location.suplclient.asn1.base;

import com.google.common.annotations.VisibleForTesting;

import java.math.BigInteger;
import java.nio.ByteBuffer;

import javax.annotation.Nullable;

/**
 * Represents the tag of (class and number) of an ASN.1 type.
 */
public class Asn1Tag {
  public static final Asn1Tag BOOLEAN = new Asn1Tag(Asn1TagClass.UNIVERSAL, 1);
  public static final Asn1Tag INTEGER = new Asn1Tag(Asn1TagClass.UNIVERSAL, 2);
  public static final Asn1Tag BIT_STRING = new Asn1Tag(Asn1TagClass.UNIVERSAL, 3);
  public static final Asn1Tag OCTET_STRING = new Asn1Tag(Asn1TagClass.UNIVERSAL, 4);
  public static final Asn1Tag NULL = new Asn1Tag(Asn1TagClass.UNIVERSAL, 5);
  public static final Asn1Tag OBJECT_IDENTIFIER = new Asn1Tag(Asn1TagClass.UNIVERSAL, 6);
  public static final Asn1Tag OBJECT_DESCRIPTOR = new Asn1Tag(Asn1TagClass.UNIVERSAL, 7);
  public static final Asn1Tag REAL = new Asn1Tag(Asn1TagClass.UNIVERSAL, 9);
  public static final Asn1Tag ENUMERATED = new Asn1Tag(Asn1TagClass.UNIVERSAL, 10);
  public static final Asn1Tag UTF8STRING = new Asn1Tag(Asn1TagClass.UNIVERSAL, 12);
  public static final Asn1Tag SEQUENCE = new Asn1Tag(Asn1TagClass.UNIVERSAL, 16);
  public static final Asn1Tag SET = new Asn1Tag(Asn1TagClass.UNIVERSAL, 17);
  public static final Asn1Tag NUMERIC_STRING = new Asn1Tag(Asn1TagClass.UNIVERSAL, 18);
  public static final Asn1Tag PRINTABLE_STRING = new Asn1Tag(Asn1TagClass.UNIVERSAL, 19);
  public static final Asn1Tag TELETEX_STRING = new Asn1Tag(Asn1TagClass.UNIVERSAL, 20);
  public static final Asn1Tag VIDEOTEX_STRING = new Asn1Tag(Asn1TagClass.UNIVERSAL, 21);
  public static final Asn1Tag IA5_STRING = new Asn1Tag(Asn1TagClass.UNIVERSAL, 22);
  public static final Asn1Tag UTC_TIME = new Asn1Tag(Asn1TagClass.UNIVERSAL, 23);
  public static final Asn1Tag GENERALIZED_TIME = new Asn1Tag(Asn1TagClass.UNIVERSAL, 24);
  public static final Asn1Tag GRAPHIC_STRING = new Asn1Tag(Asn1TagClass.UNIVERSAL, 25);
  public static final Asn1Tag VISIBLE_STRING = new Asn1Tag(Asn1TagClass.UNIVERSAL, 26);
  public static final Asn1Tag GENERAL_STRING = new Asn1Tag(Asn1TagClass.UNIVERSAL, 27);
  public static final Asn1Tag UNIVERSAL_STRING = new Asn1Tag(Asn1TagClass.UNIVERSAL, 28);
  public static final Asn1Tag BMP_STRING = new Asn1Tag(Asn1TagClass.UNIVERSAL, 30);
  public static final int CONSTRUCTED_BIT = 0x20;
  public static final BigInteger MAX_INTEGER_VALUE = BigInteger.valueOf(Integer.MAX_VALUE);

  private final Asn1TagClass tagClass;
  private final int tagNumber;

  public Asn1Tag(Asn1TagClass tagClass, int tagNumber) {
    this.tagClass = tagClass;
    this.tagNumber = tagNumber;
  }

  public int getTaggedLength(int valueLength) {
    if (tagNumber > 30) {
      throw new IllegalArgumentException("Tags with value > 30 not supported");
    }
    return 1 + getLengthLength(valueLength) + valueLength;
  }

  /**
   * Returns the number of octets needed for the length field for a value
   * of the specified size. The returned number will be the smallest possible
   * number of octets needed for the length field.
   *
   * @param valueLength number of octets used to BER encode the value
   */
  @VisibleForTesting
  static int getLengthLength(int valueLength) {
    if (valueLength < 0) {
      throw new IllegalArgumentException("valueLength=" + valueLength);
    }
    if (valueLength < (1 << 7)) {
      // short form
      return 1;
    } else if (valueLength < (1 << 8)) {
      return 2;
    } else if (valueLength < (1 << 16)) {
      return 3;
    } else if (valueLength < (1 << 24)) {
      return 4;
    } else {
      return 5;
    }
  }

  public void writeTagAndLength(ByteBuffer buf, boolean constructed, int valueLength) {
    this.writeTag(buf, constructed);
    writeLength(buf, valueLength);
  }

  private void writeTag(ByteBuffer buf, boolean constructed) {
    if (tagNumber > 30) {
      throw new IllegalArgumentException("Tags with value > 30 not supported");
    }
    if (constructed) {
      buf.put((byte) (getValue() | CONSTRUCTED_BIT));
    } else {
      buf.put((byte) getValue());
    }
  }

  static Asn1Tag readTag(ByteBuffer buf) {
    return Asn1Tag.fromValue(buf.get() & 0xFF);
  }

  /**
   * Returns the tag at the head of the buffer without advancing the position.
   */
  static Asn1Tag peekTag(ByteBuffer buf) {
    return Asn1Tag.fromValue(buf.get(buf.position()) & 0xFF);
  }

  /**
   * Returns the value of the tag octet - including class and tag ID but excluding
   * the 'C' (composed) bit.
   */
  int getValue() {
    return (tagClass.getValue() << 6) + tagNumber;
  }

  @VisibleForTesting
  static void writeLength(ByteBuffer buf, int valueLength) {
    if (valueLength < 0) {
      throw new IllegalArgumentException("valueLength=" + valueLength);
    }
    if (valueLength < (1 << 7)) {
      buf.put((byte) valueLength);
    } else {
      // Long form: the low 7 bits of the first octet encodes the number of following
      // octets that holds the actual length. The top bit is 1 to indicate long form.
      byte[] lengthBytes = BigInteger.valueOf(valueLength).toByteArray();
      if (lengthBytes[0] == (byte) 0x00) {
        // the length bytes are unsigned so throw away the leading zero octet.
        // For example, 128 becomes { 0x00, 0x80 } and we drop the first 0x00.
        int len = lengthBytes.length - 1;
        byte[] newLengthBytes = new byte[len];
        System.arraycopy(lengthBytes, 1, newLengthBytes, 0, len);
        lengthBytes = newLengthBytes;
      }
      buf.put((byte) (lengthBytes.length | (1 << 7)));
      buf.put(lengthBytes);
    }
  }

  public static int readLength(ByteBuffer buf) {
    int n = buf.get() & 0xFF;
    if (n < (1 << 7)) {
      // short form of the length field - single octet with high order bit 0
      return n;
    } else {
      // long form - first octet contains number of subsequent octets used to encode the length
      n = n & 0x7F;
      if (n > 5) {
        throw new IllegalArgumentException("Length length too big: " + n + " octets");
      }
      byte[] val = new byte[n];
      for (int i = 0; i < n; i++) {
        val[i] = buf.get();
      }
      val = prependZeroByteIfHighBitSet(val);
      BigInteger bi = new BigInteger(val);
      if (bi.compareTo(MAX_INTEGER_VALUE) > 0) {
        throw new IllegalArgumentException("Lengths bigger than 2^^31-1 unsupported: " + bi);
      }
      return bi.intValue();
    }
  }

  private static byte[] prependZeroByteIfHighBitSet(byte[] ba) {
    if ((ba[0] & 0x80) != 0) {
      byte[] newba = new byte[ba.length + 1];
      System.arraycopy(ba, 0, newba, 1, ba.length);
      newba[0] = 0;
      ba = newba;
    }
    return ba;
  }

  /**
   * Returns the tag with the specified value (including tag and length, excluding "constructed"
   * bit).
   */
  private static Asn1Tag fromValue(int value) {
    Asn1Tag result = new Asn1Tag(Asn1TagClass.fromValue(value >> 6), value & 0x1F);
    if (result.tagNumber > 30) {
      throw new IllegalArgumentException("Tags with value > 30 not supported (" + result.tagNumber
          + ")");
    }
    return result;
  }

  /**
   * Returns the tag corresponding to the given class and number.
   *
   * <p>By convention, null is returned for impossible tag class < 0. Used in code generation.
   */
  @Nullable public static Asn1Tag fromClassAndNumber(int tagClass, int tagNumber) {
    if (tagClass < 0) {
      return null;
    }
    return new Asn1Tag(Asn1TagClass.fromValue(tagClass), tagNumber);
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Asn1Tag)) {
      return false;
    }
    Asn1Tag tag = (Asn1Tag) o;
    return tagClass == tag.tagClass && tagNumber == tag.tagNumber;
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + tagClass.hashCode();
    result = 31 * result + tagNumber;
    return result;
  }

  @Override
  public String toString() {
    return "Asn1Tag[" + tagClass + ", " + tagNumber + "]";
  }
}
