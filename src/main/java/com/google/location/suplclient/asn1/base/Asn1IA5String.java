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
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collection;

/**
 * Represents strings in 7-bit US ASCII (actually pages 1 and 6 of ISO
 * International Register of Coded Character Sets plus SPACE and DELETE).
 *
 * Implements ASN.1 functionality.
 *
 * 
 */
public class Asn1IA5String extends Asn1Object {
  private static final Collection<Asn1Tag> possibleFirstTags =
      ImmutableList.of(Asn1Tag.IA5_STRING);

  private String alphabet = null;
  private byte largestCanonicalValue = 127;
  private String value;
  private int minimumSize = 0;
  private Integer maximumSize = null; // Null == unconstrained.

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    return possibleFirstTags;
  }

  @Override Asn1Tag getDefaultTag() {
    return Asn1Tag.IA5_STRING;
  }

  @Override int getBerValueLength() {
    Preconditions.checkNotNull(value, "No value set.");
    return value.length();
  }

  @Override void encodeBerValue(ByteBuffer buf) {
    Preconditions.checkNotNull(value, "No value set.");
    buf.put(value.getBytes(StandardCharsets.US_ASCII));
  }

  @Override void decodeBerValue(ByteBuffer buf) {
    setValue(new String(getRemaining(buf), StandardCharsets.US_ASCII));
  }

  protected void setAlphabet(String alphabet) {
    Preconditions.checkNotNull(alphabet);
    Preconditions.checkArgument(alphabet.length() > 0, "Empty alphabet");
    try {
      ByteBuffer buffer = StandardCharsets.US_ASCII.newEncoder().encode(CharBuffer.wrap(alphabet));
      byte[] canonicalValues = buffer.array();
      Arrays.sort(canonicalValues);
      largestCanonicalValue = canonicalValues[canonicalValues.length - 1];
      this.alphabet = new String(canonicalValues, StandardCharsets.US_ASCII);
    } catch (CharacterCodingException e) {
      throw new IllegalArgumentException("Invalid alphabet " + alphabet, e);
    }
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
    Preconditions.checkArgument(value.length() >= minimumSize,
                                "Value too short.");
    Preconditions.checkArgument(maximumSize == null
                                || value.length() <= maximumSize,
                                "Value too long.");
    try {
      Charset charset = (alphabet != null) ? new RestrictedCharset() : StandardCharsets.US_ASCII;
      charset.newEncoder().encode(CharBuffer.wrap(value));
      this.value = value;
    } catch (CharacterCodingException e) {
      throw new IllegalArgumentException("Illegal value '" + value + "'", e);
    }
  }

  private Iterable<BitStream> encodePerImpl(boolean aligned) {
    Preconditions.checkNotNull(value, "No value set.");

    int characterBitCount = calculateBitsPerCharacter(aligned);

    // Use real character values if they fit.
    boolean recodeValues = largestCanonicalValue >= (1 << characterBitCount);

    // In aligned case, pad unless result size is known to be 16 bits or less [X.691-0207, 27.5.6-7]
    BitStream result = encodeValueCharacters(characterBitCount, recodeValues);
    if (aligned && (maximumSize == null || maximumSize * characterBitCount > 16)) {
      result.setBeginByteAligned();
    }

    if (maximumSize != null) {
      if (minimumSize == maximumSize && maximumSize < PerAlignedUtils.SIXTYFOUR_K) {
        return ImmutableList.of(result);
      }

      if (maximumSize >= PerAlignedUtils.SIXTYFOUR_K) {
        throw new UnsupportedOperationException("large string unimplemented");
      }

      // A little oddity when maximumSize != minimumSize [X.691-0207, 27.5.7].
      if (aligned && maximumSize * characterBitCount == 16) {
        result.setBeginByteAligned();
      }
    }

    // Must be preceded by a count. The count and the bit field may be independently aligned.
    BitStream count = null;
    if (maximumSize == null) {
      count = aligned
          ? PerAlignedUtils.encodeSemiConstrainedLength(value.length())
          : PerUnalignedUtils.encodeSemiConstrainedLength(value.length());
    } else {
      if (aligned) {
        count = PerAlignedUtils.encodeSmallConstrainedWholeNumber(
            value.length(), minimumSize, maximumSize);
      } else {
        count = PerUnalignedUtils.encodeConstrainedWholeNumber(
            value.length(), minimumSize, maximumSize);
      }
    }
    return ImmutableList.of(count, result);
  }

  @Override public Iterable<BitStream> encodePerUnaligned() {
    return encodePerImpl(false);
  }

  @Override public Iterable<BitStream> encodePerAligned() {
    return encodePerImpl(true);
  }

  private BitStream encodeValueCharacters(int characterBitCount,
                                          boolean recodeValues) {
    BitStream result = new BitStream();
    try {
      Charset charset = recodeValues ? new RestrictedCharset() : StandardCharsets.US_ASCII;
      ByteBuffer buffer = charset.newEncoder().encode(CharBuffer.wrap(value));
      while (buffer.hasRemaining()) {
        byte b = buffer.get();
        if (characterBitCount == 8) {
          result.appendByte(b);
        } else {
          result.appendLowBits(characterBitCount, b);
        }
      }
    } catch (CharacterCodingException e) {
      throw new IllegalStateException("Invalid value", e);
    }
    return result;
  }

  private int calculateBitsPerCharacter(boolean aligned) {
    // must be power of 2 in aligned version.
    int characterBitCount = aligned ? 8 : 7;
    if (alphabet != null) {
      for (int i = 1; i < characterBitCount; i += aligned ? i : 1) {
        if (1 << i >= alphabet.length()) {
          characterBitCount = i;
          break;
        }
      }
    }
    return characterBitCount;
  }

  private void decodePerImpl(BitStreamReader reader, boolean aligned) {

    int characterBitCount = calculateBitsPerCharacter(aligned);

    // Use real character values if they fit.
    boolean recodeValues = largestCanonicalValue >= (1 << characterBitCount);

    if (maximumSize != null && minimumSize == maximumSize && maximumSize < PerAlignedUtils.SIXTYFOUR_K) {
      if (aligned && maximumSize * characterBitCount > 16) {
        reader.spoolToByteBoundary();
      }
      decodeValueCharacters(reader, maximumSize,
                            characterBitCount, recodeValues);
      return;
    }

    if (maximumSize != null && maximumSize >= PerAlignedUtils.SIXTYFOUR_K) {
      throw new UnsupportedOperationException("large string unimplemented");
    }

    int count = 0;
    if (maximumSize == null) {
      count = aligned
          ? PerAlignedUtils.decodeSemiConstrainedLength(reader)
          : PerUnalignedUtils.decodeSemiConstrainedLength(reader);
    } else {
      if (aligned) {
        count = PerAlignedUtils.decodeSmallConstrainedWholeNumber(
              reader, minimumSize, maximumSize);
      } else {
        count = PerUnalignedUtils.decodeConstrainedWholeNumber(
              reader, minimumSize, maximumSize);
      }
    }

    if (aligned && (maximumSize == null || maximumSize * characterBitCount >= 16)) {
      reader.spoolToByteBoundary();
    }
    decodeValueCharacters(reader, count,
                          characterBitCount, recodeValues);
  }

  @Override public void decodePerUnaligned(BitStreamReader reader) {
    decodePerImpl(reader, false);
  }

  @Override public void decodePerAligned(BitStreamReader reader) {
    decodePerImpl(reader, true);
  }

  private void decodeValueCharacters(BitStreamReader reader, int count,
                                     int characterBitCount,
                                     boolean recodeValues) {
    ByteBuffer exploded = ByteBuffer.allocate(count);
    for (int i = 0; i < count; i++) {
      if (characterBitCount == 8) {
        exploded.put(reader.readByte());
      } else {
        exploded.put((byte) reader.readLowBits(characterBitCount));
      }
    }
    exploded.flip();
    Charset charset = recodeValues ? new RestrictedCharset() : StandardCharsets.US_ASCII;
    try {
      CharBuffer valueCharacters = charset.newDecoder().decode(exploded);
      value = valueCharacters.toString();
    } catch (CharacterCodingException e) {
      throw new IllegalStateException("Invalid character", e);
    }
  }

  private class RestrictedCharset extends Charset {
    RestrictedCharset() {
      super("Restricted_IA5", new String[0]);
    }

    @Override
    public boolean contains(Charset cs) {
      return false;
    }

    @Override
    public CharsetDecoder newDecoder() {
      return new RestrictedCharsetDecoder(this);
    }

    @Override
    public CharsetEncoder newEncoder() {
      return new RestrictedCharsetEncoder(this);
    }
  }

  private class RestrictedCharsetEncoder extends CharsetEncoder {
    RestrictedCharsetEncoder(RestrictedCharset restrictedCharset) {
      super(restrictedCharset, 1, 1, new byte[] {0});
    }

    @Override
    protected CoderResult encodeLoop(CharBuffer in, ByteBuffer out) {
      while (in.hasRemaining() && out.hasRemaining()) {
        char c = in.get();
        int encodedValue = alphabet.indexOf(c);
        if (encodedValue < 0) {
          return CoderResult.unmappableForLength(1);
        }
        out.put((byte) encodedValue);
      }
      if (in.hasRemaining()) {
        return CoderResult.OVERFLOW;
      }
      return CoderResult.UNDERFLOW;
    }
  }

  private class RestrictedCharsetDecoder extends CharsetDecoder {
    RestrictedCharsetDecoder(RestrictedCharset restrictedCharset) {
      super(restrictedCharset, 1, 1);
    }

    @Override
    protected CoderResult decodeLoop(ByteBuffer in, CharBuffer out) {
      while (in.hasRemaining() && out.hasRemaining()) {
        byte b = in.get();
        int position = b & 0xFF;
        if (position >= alphabet.length()) {
          return CoderResult.unmappableForLength(1);
        }
        char decodedValue = alphabet.charAt(position);
        out.put(decodedValue);
      }
      if (in.hasRemaining()) {
        return CoderResult.OVERFLOW;
      }
      return CoderResult.UNDERFLOW;
    }
  }
}
