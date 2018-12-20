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
import java.nio.ByteBuffer;
import java.util.Collection;
import javax.annotation.Nullable;

/**
 * Implements ASN.1 functionality.
 *
 * 
 */
public class Asn1Integer extends Asn1Object {
  private static final Collection<Asn1Tag> possibleFirstTags =
      ImmutableList.of(Asn1Tag.INTEGER);

  private BigInteger minimumValue = null; // null == unbounded.
  private BigInteger maximumValue = null; // null == unbounded.
  private BigInteger value;

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    return possibleFirstTags;
  }

  @Override Asn1Tag getDefaultTag() {
    return Asn1Tag.INTEGER;
  }

  /**
   * Sets the allowed range of values. A null for either parameter means that the value is unbounded
   * in that direction.
   */
  protected void setValueRange(@Nullable BigInteger minimum, @Nullable BigInteger maximum) {
    minimumValue = minimum;
    maximumValue = maximum;
  }

  private Iterable<BitStream> encodeNormalizedIntegerWithRangeAligned(
      BigInteger normalizedValue, BigInteger range) {
    if (range.compareTo(BigInteger.valueOf(PerAlignedUtils.SIXTYFOUR_K)) < 0) {
      BitStream result = PerAlignedUtils.encodeNormalizedSmallConstrainedWholeNumber(
          normalizedValue.intValue(), range.intValue());
      return ImmutableList.of(result);
    } else {
      return PerAlignedUtils.encodeConstrainedLengthOfBytes(
          PerAlignedUtils.encodeBigNonNegativeWholeNumber(normalizedValue),
          1,
          PerAlignedUtils.encodeBigNonNegativeWholeNumber(range).length);
    }
  }

  private Iterable<BitStream> encodeNormalizedIntegerWithRangeUnaligned(
      BigInteger normalizedValue, BigInteger range) {
    BitStream result = PerUnalignedUtils.encodeNormalizedConstrainedWholeNumber(
        normalizedValue.longValue(), range.longValue());
    return ImmutableList.of(result);
  }

  private void validateValue() {
    Preconditions.checkNotNull(value, "No value set.");
    Preconditions.checkState(
        minimumValue == null || value.compareTo(minimumValue) >= 0,
        "Too small value %s", value);
    Preconditions.checkState(
        maximumValue == null || value.compareTo(maximumValue) <= 0,
        "Too large value %s", value);
  }

  @Override
  int getBerValueLength() {
    if (value.equals(BigInteger.ZERO)) {
      // BER requires 0 be encoded with one or more zero octets
      return 1;
    } else {
      return (value.bitLength() >> 3) + 1;
    }
  }

  @Override void encodeBerValue(ByteBuffer buf) {
    if (value.equals(BigInteger.ZERO)) {
      buf.put((byte) 0);
    } else {
      buf.put(value.toByteArray());
    }
  }

  @Override void decodeBerValue(ByteBuffer buf) {
    value = new BigInteger(getRemaining(buf));
  }

  private Iterable<BitStream> encodePerImpl(boolean aligned) {
    validateValue();
    if (maximumValue != null && minimumValue != null) {
      // Encodes a constrained whole numbers according to X.691-0207, 10.5.
      BigInteger normalizedValue = value.subtract(minimumValue);
      BigInteger range = maximumValue.subtract(minimumValue);
      return aligned
          ? encodeNormalizedIntegerWithRangeAligned(normalizedValue, range)
          : encodeNormalizedIntegerWithRangeUnaligned(normalizedValue, range);
    } else if (minimumValue != null) {
      // Encodes a semi-constrained whole numbers according to X.691-0207, 10.7.
      return aligned
          ? PerAlignedUtils.encodeSemiConstrainedLengthOfBytes(
              PerAlignedUtils.encodeBigNonNegativeWholeNumber(value.subtract(minimumValue)))
          : PerUnalignedUtils.encodeSemiConstrainedLengthOfBytes(
              PerUnalignedUtils.encodeBigNonNegativeWholeNumber(value.subtract(minimumValue)));
    } else {
      // Encodes an unconstrained whole number according to X.691-0207, 10.8.
      return aligned
          ? PerAlignedUtils.encodeUnconstrainedLengthOfBytes(value.toByteArray())
          : PerUnalignedUtils.encodeSemiConstrainedLengthOfBytes(value.toByteArray());
    }
  }

  @Override public Iterable<BitStream> encodePerUnaligned() {
    return encodePerImpl(false);
  }

  @Override public Iterable<BitStream> encodePerAligned() {
    return encodePerImpl(true);
  }

  public void setInteger(BigInteger value) {
    this.value = value;
  }

  public void setInteger(BigInteger value, boolean validateValue) {
    this.value = value;
    if (validateValue) {
      validateValue();
    }
  }

  public void setLong(long value) {
    setInteger(BigInteger.valueOf(value));
  }

  public void setLong(long value, boolean validateValue) {
    setInteger(BigInteger.valueOf(value), validateValue);
  }

  public BigInteger getInteger() {
    return value;
  }

  /**
   * Convenience function to return {@link BigInteger#longValue()} of the value. Only the low-order
   * 64 bits are returned, so it can lose information about the overall magnitude of the value as
   * well as return a result with the opposite sign.
   *
   * @return the lowest 64 bits of the value, as a long
   */
  public long getLong() {
    return value.longValue();
  }

  private BigInteger decodeNormalizedIntegerWithRangeAligned(
      BitStreamReader reader, BigInteger range) {
    if (range.compareTo(BigInteger.valueOf(PerAlignedUtils.SIXTYFOUR_K)) < 0) {
      int normalizedIntValue =
          PerAlignedUtils.decodeNormalizedSmallConstrainedWholeNumber(reader, range.intValue());
      return BigInteger.valueOf(normalizedIntValue);
    } else {
      return PerAlignedUtils.decodeBigNonNegativeWholeNumber(
          PerAlignedUtils.decodeConstrainedLengthOfBytes(
              reader, 1,
              PerAlignedUtils.encodeBigNonNegativeWholeNumber(range).length));
    }
  }

  private BigInteger decodeNormalizedIntegerWithRangeUnaligned(
      BitStreamReader reader, BigInteger range) {
    long normalizedIntValue =
        PerUnalignedUtils.decodeNormalizedConstrainedWholeNumber(
            reader, range.longValue());
    return BigInteger.valueOf(normalizedIntValue);
  }

  private void decodePerImpl(BitStreamReader reader, boolean aligned) {
    if (maximumValue != null && minimumValue != null) {
      // Decodes a constrained whole numbers according to X.691-0207, 10.5.
      BigInteger range = maximumValue.subtract(minimumValue);
      BigInteger normalizedValue = aligned
          ? decodeNormalizedIntegerWithRangeAligned(reader, range)
          : decodeNormalizedIntegerWithRangeUnaligned(reader, range);
      value = minimumValue.add(normalizedValue);
    } else if (minimumValue != null) {
      // Decodes a semi-constrained whole numbers according to X.691-0207, 10.7.
      byte[] intBytes = aligned
          ? PerAlignedUtils.decodeSemiConstrainedLengthOfBytes(reader)
          : PerUnalignedUtils.decodeSemiConstrainedLengthOfBytes(reader);
      value = new BigInteger(convertPositiveToSigned(intBytes)).add(minimumValue);
    } else {
      // Decodes an unconstrained whole number according to X.691-0207, 10.8.
      value = new BigInteger(aligned
          ? PerAlignedUtils.decodeUnconstrainedLengthOfBytes(reader)
          : PerUnalignedUtils.decodeSemiConstrainedLengthOfBytes(reader));
    }
  }

  private byte[] convertPositiveToSigned(byte[] rawData) {
    if ((rawData[0] & 0x80) != 0) {
      byte[] data = new byte[rawData.length + 1];
      System.arraycopy(rawData, 0, data, 1, rawData.length);
      return data;
    } else {
      return rawData;
    }
  }

  @Override public void decodePerUnaligned(BitStreamReader reader) {
    decodePerImpl(reader, false);
  }

  @Override public void decodePerAligned(BitStreamReader reader) {
    decodePerImpl(reader, true);
  }
}
