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
import java.util.Collection;

/**
 * A general string is any ISO 646 related 8-bit encoding, presumably agreed on
 * by other means.
 *
 * Implements ASN.1 functionality.
 *
 * 
 */
public class Asn1GeneralString extends Asn1Object {
  private static final Collection<Asn1Tag> possibleFirstTags =
      ImmutableList.of(Asn1Tag.GENERAL_STRING);

  private byte[] value;
  private int minimumSize = 0;
  private Integer maximumSize = null; // Null == unconstrained.

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    return possibleFirstTags;
  }

  @Override Asn1Tag getDefaultTag() {
    return Asn1Tag.GENERAL_STRING;
  }

  @Override int getBerValueLength() {
    throw new UnsupportedOperationException();
  }

  @Override void encodeBerValue(ByteBuffer buf) {
    throw new UnsupportedOperationException();
  }

  @Override void decodeBerValue(ByteBuffer buf) {
    throw new UnsupportedOperationException();
  }

  protected void setMinSize(int min) {
    minimumSize = min;
  }

  protected void setMaxSize(int max) {
    maximumSize = max;
  }

  public byte[] getValue() {
    return value;
  }

  public void setValue(byte[] value) {
    this.value = value;
  }

  private Iterable<BitStream> encodePerImpl(boolean aligned) {
    Preconditions.checkNotNull(value, "No value set.");
    Preconditions.checkState(value.length >= minimumSize, "Value too short.");
    Preconditions.checkState(maximumSize == null || value.length <= maximumSize,
                             "Value too long.");
    int characterBitCount = 8;
    if (maximumSize == null) {
      throw new UnsupportedOperationException("unconstrained unimplemented");
    }

    BitStream result = new BitStream();
    for (byte b : value) {
      result.appendByte(b);
    }
    if (aligned && maximumSize * characterBitCount > 16) {
      result.setBeginByteAligned();
    }

    if (minimumSize == maximumSize
        && maximumSize < PerAlignedUtils.SIXTYFOUR_K) {
      return ImmutableList.of(result);
    }

    if (maximumSize >= PerAlignedUtils.SIXTYFOUR_K) {
      throw new UnsupportedOperationException("large string unimplemented");
    }

    // A little oddity when maximumSize != minimumSize.
    if (aligned && maximumSize * characterBitCount == 16) {
      result.setBeginByteAligned();
    }

    // Must be preceded by a count. The count and the bit field may be
    // independently aligned.
    BitStream count = null;
    if (aligned) {
      count = PerAlignedUtils.encodeSmallConstrainedWholeNumber(
          value.length, minimumSize, maximumSize);
    } else {
      count = PerUnalignedUtils.encodeConstrainedWholeNumber(
          value.length, minimumSize, maximumSize);
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
    int characterBitCount = 8;
    if (maximumSize == null) {
      throw new UnsupportedOperationException("unconstrained unimplemented");
    }

    if (minimumSize == maximumSize
        && maximumSize < PerAlignedUtils.SIXTYFOUR_K) {
      if (aligned && maximumSize * characterBitCount > 16) {
        reader.spoolToByteBoundary();
      }
      value = new byte[maximumSize];
      for (int i = 0; i < maximumSize; i++) {
        value[i] = reader.readByte();
      }
      return;
    }

    if (maximumSize >= PerAlignedUtils.SIXTYFOUR_K) {
      throw new UnsupportedOperationException("large string unimplemented");
    }

    // Value is preceded by a count.
    int count = 0;
    if (aligned) {
      count = PerAlignedUtils.decodeSmallConstrainedWholeNumber(
          reader, minimumSize, maximumSize);
    } else {
      count = PerUnalignedUtils.decodeConstrainedWholeNumber(
          reader, minimumSize, maximumSize);
    }

    if (aligned && maximumSize * characterBitCount >= 16) {
      reader.spoolToByteBoundary();
    }

    value = new byte[count];
    for (int i = 0; i < count; i++) {
      value[i] = reader.readByte();
    }
  }

  @Override public void decodePerUnaligned(BitStreamReader reader) {
    decodePerImpl(reader, false);
  }

  @Override public void decodePerAligned(BitStreamReader reader) {
    decodePerImpl(reader, true);
  }
}
