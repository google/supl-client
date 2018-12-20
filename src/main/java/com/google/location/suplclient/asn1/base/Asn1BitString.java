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
import java.util.BitSet;
import java.util.Collection;

/**
 * Implements ASN.1 functionality.
 * as an asn1 BIT STRING does.
 *
 * <P>This class is not thread-safe without external synchronization.
 *
 * 
 */
public class Asn1BitString extends Asn1Object {
  private static final Collection<Asn1Tag> possibleFirstTags =
      ImmutableList.of(Asn1Tag.BIT_STRING);

  private int minimumSize = 0;
  private Integer maximumSize = null; // null == unbounded.
  private BitSet value;

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    return possibleFirstTags;
  }

  protected void setMinSize(int min) {
    minimumSize = min;
  }

  protected void setMaxSize(int max) {
    maximumSize = max;
  }

  public BitSet getValue() {
    return value;
  }

  /** Sets the value to a new {@link BitSet} if value is null. */
  protected void ensureValuePopulated() {
    if (null == value) {
      value = new BitSet();
    }
  }

  public void setValue(BitSet value) {
    this.value = value;
  }

  @Override Asn1Tag getDefaultTag() {
    return Asn1Tag.BIT_STRING;
  }

  @Override int getBerValueLength() {
    Preconditions.checkNotNull(value, "No value set.");
    // the +1 is for the extra leading octet indicating the number of unused bits in last octet
    return (value.length() + 7) / 8 + 1;
  }

  private void validateValue() {
    Preconditions.checkNotNull(value, "No value set.");
    Preconditions.checkState(
        maximumSize == null || value.length() <= maximumSize, "Too large %s",
        value.length());
  }

  @Override
  void encodeBerValue(ByteBuffer buf) {
    validateValue();

    int bitsToEncode = Math.max(minimumSize, value.length());
    BitStream bitStream = new BitStream();
    for (int i = 0; i < bitsToEncode; i++) {
      bitStream.appendBit(value.get(i));
    }

    buf.put((byte) ((8 - (value.length() % 8)) % 8));
    buf.put(bitStream.getPaddedBytes());
  }

  @Override void decodeBerValue(ByteBuffer buf) {
    int unusedBits = buf.get() & 0xFF;
    byte[] valueBytes = getRemaining(buf);
    final int numBits = valueBytes.length * 8 - unusedBits;
    value = new BitSet(numBits);
    BitStreamReader reader = new BitStreamReader(valueBytes);
    for (int i = 0; i < numBits; i++) {
      value.set(i, reader.readBit());
    }
  }

  private Iterable<BitStream> encodePerImpl(boolean aligned) {
    validateValue();
    if (maximumSize == null) {
      throw new UnsupportedOperationException("unconstrained unimplemented");
    }

    if (minimumSize == maximumSize) {
      if (maximumSize == 0) {
        return ImmutableList.of();
      }
      if (maximumSize < PerAlignedUtils.SIXTYFOUR_K) {
        BitStream result = new BitStream();
        for (int i = 0; i < maximumSize; i++) {
          result.appendBit(value.get(i));
        }
        if (aligned && maximumSize > 16) {
          result.setBeginByteAligned();
        }
        return ImmutableList.of(result);
      }
      // Fall through to the general case.
    }

    if (maximumSize >= PerAlignedUtils.SIXTYFOUR_K) {
      throw new UnsupportedOperationException("large set unimplemented");
    }

    int bitsToEncode = Math.max(minimumSize, value.length());
    BitStream count = null;
    if (aligned) {
      count = PerAlignedUtils.encodeSmallConstrainedWholeNumber(
          bitsToEncode, minimumSize, maximumSize);
    } else {
      count = PerUnalignedUtils.encodeConstrainedWholeNumber(
          bitsToEncode, minimumSize, maximumSize);
    }
    BitStream result = new BitStream();
    if (aligned) {
      result.setBeginByteAligned();
    }
    for (int i = 0; i < bitsToEncode; i++) {
      result.appendBit(value.get(i));
    }
    return ImmutableList.of(count, result);
  }

  @Override public Iterable<BitStream> encodePerUnaligned() {
    return encodePerImpl(false);
  }

  @Override public Iterable<BitStream> encodePerAligned() {
    return encodePerImpl(true);
  }

  private void decodePerImpl(BitStreamReader reader, boolean aligned) {
    value = new BitSet();
    if (maximumSize == null) {
      throw new UnsupportedOperationException("unconstrained unimplemented");
    }

    if (minimumSize == maximumSize) {
      if (maximumSize == 0) {
        return;
      }
      if (maximumSize < PerAlignedUtils.SIXTYFOUR_K) {
        if (aligned && maximumSize > 16) {
          reader.spoolToByteBoundary();
        }
        for (int i = 0; i < maximumSize; i++) {
          value.set(i, reader.readBit());
        }
        return;
      }
      // Fall through to the general case.
    }

    if (maximumSize >= PerAlignedUtils.SIXTYFOUR_K) {
      throw new UnsupportedOperationException("large set unimplemented");
    }

    int length = 0;
    if (aligned) {
      length = PerAlignedUtils.decodeSmallConstrainedWholeNumber(
          reader, minimumSize, maximumSize);
      reader.spoolToByteBoundary();
    } else {
      length = PerUnalignedUtils.decodeConstrainedWholeNumber(
          reader, minimumSize, maximumSize);
    }
    for (int i = 0; i < length; i++) {
      value.set(i, reader.readBit());
    }
  }

  @Override public void decodePerUnaligned(BitStreamReader reader) {
    decodePerImpl(reader, false);
  }

  @Override public void decodePerAligned(BitStreamReader reader) {
    decodePerImpl(reader, true);
  }
}
