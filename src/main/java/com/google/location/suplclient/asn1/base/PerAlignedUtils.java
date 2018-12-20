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

import java.math.BigInteger;
import java.util.Arrays;

/**
 * Basic algorithms for aligned PER encoding and decoding, ASN.1 X.691-0207.
 *
 * 
 */
public class PerAlignedUtils {

  public static final int ONE_K = 1024;
  public static final int SIXTEEN_K = 16 * ONE_K;
  public static final int SIXTYFOUR_K = 64 * ONE_K;


  /**
   * Encodes whole numbers up to 64K range according to X.691-0207, 10.5.
   */
  public static BitStream encodeSmallConstrainedWholeNumber(int value,
                                                            int minimumValue,
                                                            int maximumValue) {
    int normalizedValue = value - minimumValue;
    // Note: range here means one less than in ASN.1 X.691-0207, 10.5.
    int range = maximumValue - minimumValue;
    return encodeNormalizedSmallConstrainedWholeNumber(normalizedValue, range);
  }

  /**
   * Encodes the difference between the actual value and the minimum allowed
   * value, the {@code normalizedValue}, for whole numbers up to 64K range
   * according to X.691-0207, 10.5.
   *
   * <p>Note: range here means one less than in ASN.1 X.691-0207, 10.5., i.e.
   * here it is the difference between the maximum allowed value and the minimum
   * allowed value.
   */
  public static BitStream encodeNormalizedSmallConstrainedWholeNumber(
      int normalizedValue, int range) {
    Preconditions.checkArgument(range < SIXTYFOUR_K, "range >= 64K");
    Preconditions.checkArgument(normalizedValue >= 0,
                                "negative normalized value");
    BitStream result = new BitStream();
    if (range == 0) {
      return result;
    }
    if (range < 128) {
      result.appendLowBits(leastBitsToEncode((byte) range),
                           (byte) normalizedValue);
      return result;
    }
    if (range >= 255) {
      result.setBeginByteAligned();
    }
    if (range < 256) {
      result.appendByte((byte) (normalizedValue));
      return result;
    }
    result.appendByte((byte) ((normalizedValue & 0xFF00) >>> 8));
    result.appendByte((byte) (normalizedValue & 0x00FF));
    return result;
  }

  /**
   * Decodes whole numbers up to 64K range according to X.691-0207, 10.5.
   */
  public static int decodeSmallConstrainedWholeNumber(BitStreamReader reader,
                                                      int minimumValue,
                                                      int maximumValue) {
    // Note: range here means one less than in ASN.1 X.691-0207, 10.5.
    int range = maximumValue - minimumValue;
    int normalizedResult =
        decodeNormalizedSmallConstrainedWholeNumber(reader, range);
    return normalizedResult + minimumValue;
  }

  /**
   * Decodes the difference between the actual value and the minimum allowed
   * value for whole numbers up to 64K range according to X.691-0207, 10.5.
   *
   * <p>Note: range here means one less than in ASN.1 X.691-0207, 10.5., i.e.
   * here it is the difference between the maximum allowed value and the minimum
   * allowed value.
   */
  public static int decodeNormalizedSmallConstrainedWholeNumber(
      BitStreamReader reader, int range) {
    if (range < 0) {
      throw new IllegalArgumentException("range < 0");
    }
    if (range >= SIXTYFOUR_K) {
      throw new IllegalArgumentException("range >= 64K");
    }
    if (range == 0) {
      return 0;
    }
    if (range < 128) {
      return reader.readLowBits(leastBitsToEncode((byte) range));
    }
    if (range >= 255) {
      reader.spoolToByteBoundary();
    }
    if (range < 256) {
      return (reader.readByte() & 0xFF);
    }
    return ((reader.readByte() & 0xFF) << 8)
        + (reader.readByte() & 0xFF);
  }

  private static int leastBitsToEncode(byte value) {
    int unsignedByte = value & 0xFF;
    for (int bits = 1; bits < 8; bits++) {
      if (unsignedByte < (1 << bits)) {
        return bits;
      }
    }
    return 8;
  }

  public static Iterable<BitStream> encodeNormallySmallWholeNumber(int value) {
    if (value < 64) {
      BitStream result = new BitStream();
      result.appendBit(false);
      result.appendLowBits(6, (byte) value);
      return ImmutableList.of(result);
    }
    throw new UnsupportedOperationException("normally small numbers >= 64 "
                                            + "unimplemented");
  }

  public static int decodeNormallySmallWholeNumber(BitStreamReader reader) {
    if (reader.readBit()) {
      throw new UnsupportedOperationException("normally small numbers >= 64 "
                                              + "unimplemented");
    }
    return reader.readLowBits(6) & 0xFF;
  }

  /**
   * Encodes length determinant for a constrained length byte[] according to
   * X.691-0207, 10.9.3.3 and up.
   */
  public static Iterable<BitStream> encodeConstrainedLengthOfBytes(
      byte[] bytes, int minimumLength, int maximumLength) {
    if (maximumLength >= SIXTYFOUR_K) {
      return encodeSemiConstrainedLengthOfBytes(bytes);
    }

    BitStream lengthDeterminant = encodeSmallConstrainedWholeNumber(
        bytes.length, minimumLength, maximumLength);
    if (bytes.length == 0) {
      return ImmutableList.of(lengthDeterminant);
    }
    BitStream value = new BitStream();
    value.setBeginByteAligned();
    for (byte aByte : bytes) {
      value.appendByte(aByte);
    }
    return ImmutableList.of(lengthDeterminant, value);
    
  }

  /**
   * Decodes a constrained length byte[] with length determinant according to
   * X.691-0207, 10.9.3.3 and up.
   */
  public static byte[] decodeConstrainedLengthOfBytes(
      BitStreamReader reader, int minimumLength, int maximumLength) {
    if (maximumLength >= SIXTYFOUR_K) {
      return decodeSemiConstrainedLengthOfBytes(reader);
    }
    int length = decodeSmallConstrainedWholeNumber(
        reader, minimumLength, maximumLength);
    if (length == 0) {
      return new byte[0];
    }
    byte[] result = new byte[length];
    reader.spoolToByteBoundary();
    for (int i = 0; i < length; i++) {
      result[i] = reader.readByte();
    }
    return result;
  }

  /**
   * Encodes length determinant for a semi-constrained length byte[] according
   * to X.691-0207, 10.9.3.5.
   */
  public static Iterable<BitStream> encodeSemiConstrainedLengthOfBytes(
      byte[] bytes) {
    int n = bytes.length;
    if (n < SIXTEEN_K) {
      BitStream result = encodeSemiConstrainedLength(n);
      result.setBeginByteAligned();
      for (byte b : bytes) {
        result.appendByte(b);
      }
      return ImmutableList.of(result);
    }
    throw new UnsupportedOperationException("Arrays > 16K unimplemented.");
  }
  /**
   * Encodes length determinant for a semi-constrained length byte[] according
   * to X.691-0207, 10.9.3.5.
   */
  public static Iterable<BitStream> encodeUnconstrainedLengthOfBytes(
      byte[] bytes) {
    // Length for unconsrtained and semiconstrained integers is encoded by the
    // same rules.
    return encodeSemiConstrainedLengthOfBytes(bytes);
  }
  /**
   * Decodes length determinant for a semi-constrained length byte[] according
   * to X.691-0207, 10.9.3.5.
   */
  public static byte[] decodeSemiConstrainedLengthOfBytes(
      BitStreamReader reader) {
    reader.spoolToByteBoundary();
    int length = decodeSemiConstrainedLength(reader);
    byte[] result = new byte[length];
    for (int i = 0; i < length; i++) {
      result[i] = reader.readByte();
    }
    return result;
  }
  /**
   * Decodes length determinant for a semi-constrained length byte[] according
   * to X.691-0207, 10.9.3.5.
   */
  public static byte[] decodeUnconstrainedLengthOfBytes(
      BitStreamReader reader) {
    // Length for unconsrtained and semiconstrained integers is encoded by the
    // same rules.
    return decodeSemiConstrainedLengthOfBytes(reader);
  }
  /**
   * Encodes non-negative numbers according to X.691-0207, 10.3.
   */
  public static byte[] encodeBigNonNegativeWholeNumber(BigInteger bigInteger) {
    byte[] twosComplement = bigInteger.toByteArray();
    return twosComplement[0] == 0
           ? Arrays.copyOfRange(twosComplement, 1, twosComplement.length)
           : twosComplement;
  }

  /**
    * Decodes non-negative numbers according to X.691-0207, 10.3.
    */
   public static BigInteger decodeBigNonNegativeWholeNumber(byte[] encoded) {
    return new BigInteger(1, encoded);
  }

  /**
   * Encodes length determinant according to X.691-0207, 10.9.3.6.
   */
  public static BitStream encodeSemiConstrainedLength(int value) {
    if (value <= 127) {
      BitStream result = new BitStream();
      result.setBeginByteAligned();
      result.appendBit(false);
      result.appendLowBits(7, (byte) value);
      return result;
    } else if (value < SIXTEEN_K) {
      BitStream result = new BitStream();
      result.setBeginByteAligned();
      result.appendBit(true);
      result.appendBit(false);
      result.appendLowBits(6, (byte) (value >>> 8));
      result.appendByte((byte) (value & 0xFF));
      return result;
    }
    throw new UnsupportedOperationException("Length values > " +
                                             SIXTEEN_K + "unimplemented");
  }

  /**
   * Decodes length determinant according to X.691-0207, 10.9.3.6.
   */
  public static int decodeSemiConstrainedLength(BitStreamReader reader) {
    reader.spoolToByteBoundary();
    if (!reader.readBit()) {
      return reader.readLowBits(7);
    } else if (!reader.readBit()) {
      return (reader.readLowBits(6) << 8) + (reader.readByte() & 0xFF);
    } else {
      throw new UnsupportedOperationException("Length values > " +
                                               SIXTEEN_K + "unimplemented");
    }
  }

  /*
   * Encodes an Asn1Object into a  Open type field (X.691-0207, 10.2), used
   * mostly for encoding Sequence and SetOf extension additions. A decode method
   * hasn't been added as the extension additions should decoded
   * by their relevent Asn1Object decoders.
   */
  public static Iterable<BitStream> encodeOpenTypeField(
                                                    Asn1Object object){
    PacketBuilder packetBuilder = new PacketBuilder();
    packetBuilder.appendAll(object.encodePerAligned());
    return encodeSemiConstrainedLengthOfBytes(packetBuilder.getPaddedBytes());
  }

  public static Asn1Object decodeOpenTypeField(
                              BitStreamReader reader, Asn1Object asn1Object) {
    byte [] encodedBytes = decodeSemiConstrainedLengthOfBytes(reader);
    asn1Object.decodePerAligned(new BitStreamReader(encodedBytes));
    return asn1Object;
  }
}
