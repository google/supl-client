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
 * A BMP string is a string from the Basic Multilingual Plane of Unicode, i.e.
 * codepoints 0x0000 to 0xFFFF.
 *
 * Implements ASN.1 functionality.
 *
 * 
 */
public class Asn1BMPString extends Asn1Object {
  private static final Collection<Asn1Tag> possibleFirstTags =
      ImmutableList.of(Asn1Tag.BMP_STRING);

  private String value;
  private int minimumSize = 0;
  private Integer maximumSize = null; // Null == unconstrained.

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    return possibleFirstTags;
  }

  @Override Asn1Tag getDefaultTag() {
    return Asn1Tag.BMP_STRING;
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

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  private Iterable<BitStream> encodePerImpl(boolean aligned) {
    Preconditions.checkNotNull(value, "No value set.");
    int length = Character.codePointCount(value, 0, value.length());
    Preconditions.checkState(length >= minimumSize, "Value too short.");
    Preconditions.checkState(maximumSize == null || length <= maximumSize,
                             "Value too long.");
    int characterBitCount = 16; // Unless tight alphabet constraint.
    if (maximumSize == null) {
      throw new UnsupportedOperationException("unconstrained unimplemented");
    }

    BitStream encodedCharacters = encodeCharactersPer();
    if (aligned && maximumSize * characterBitCount > 16) {
      encodedCharacters.setBeginByteAligned();
    }

    if (minimumSize == maximumSize
        && maximumSize < PerAlignedUtils.SIXTYFOUR_K) {
      return ImmutableList.of(encodedCharacters);
    }

    if (maximumSize >= PerAlignedUtils.SIXTYFOUR_K) {
      throw new UnsupportedOperationException("large string unimplemented");
    }

    // A little oddity when maximumSize != minimumSize.
    if (aligned && maximumSize * characterBitCount == 16) {
      encodedCharacters.setBeginByteAligned();
    }

    // Must be preceded by a count. The count and the bit field may be
    // independently aligned.
    BitStream count = null;
    if (aligned) {
      count = PerAlignedUtils.encodeSmallConstrainedWholeNumber(
          value.length(), minimumSize, maximumSize);
    } else {
      count = PerUnalignedUtils.encodeConstrainedWholeNumber(
          value.length(), minimumSize, maximumSize);
    }
    return ImmutableList.of(count, encodedCharacters);
  }

  @Override public Iterable<BitStream> encodePerUnaligned() {
    return encodePerImpl(false);
  }

  @Override public Iterable<BitStream> encodePerAligned() {
    return encodePerImpl(true);
  }

  private BitStream encodeCharactersPer() {
    BitStream result = new BitStream();
    int position = 0;
    while (position < value.length()) {
      int codepoint = Character.codePointAt(value, position);
      Preconditions.checkState(codepoint <= 0xFFFF,
          "Illegal character atposition %s", position);
      // When characterBitCount == 16.
      result.appendByte((byte) ((codepoint & 0xFF00) >> 8));
      result.appendByte((byte) (codepoint & 0xFF));

      position += Character.charCount(codepoint);
    }
    return result;
  }

  private void decodePerImpl(BitStreamReader reader, boolean aligned) {
    int characterBitCount = 16; // Unless tight alphabet constraint.
    if (maximumSize == null) {
      throw new UnsupportedOperationException("unconstrained unimplemented");
    }

    if (minimumSize == maximumSize
        && maximumSize < PerAlignedUtils.SIXTYFOUR_K) {
      if (aligned && maximumSize * characterBitCount > 16) {
        reader.spoolToByteBoundary();
      }
      value = decodeCharactersPer(reader, maximumSize);
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

    value = decodeCharactersPer(reader, count);
  }

  @Override public void decodePerUnaligned(BitStreamReader reader) {
    decodePerImpl(reader, false);
  }

  @Override public void decodePerAligned(BitStreamReader reader) {
    decodePerImpl(reader, true);
  }

  private String decodeCharactersPer(BitStreamReader reader,
                                            int howMany) {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < howMany; i++) {
      int codepoint = (reader.readByte() & 0xFF) << 8;
      codepoint += reader.readByte() & 0xFF;
      builder.append(Character.toChars(codepoint));
    }
    return builder.toString();
  }
}
