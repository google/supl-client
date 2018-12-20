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
import com.google.common.io.BaseEncoding;
import java.nio.ByteBuffer;
import java.util.Collection;

/**
 * Implements ASN.1 functionality.
 *
 * 
 */
public class Asn1OctetString extends Asn1Object {
  private static final BaseEncoding HEX = BaseEncoding.base16();
  private static final Collection<Asn1Tag> possibleFirstTags =
      ImmutableList.of(Asn1Tag.OCTET_STRING);
  private static final byte[] EMPTY_ARRAY = new byte[0];

  private int minimumSize = 0;
  private Integer maximumSize = null; // null == unbounded.
  private byte[] value = EMPTY_ARRAY;

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    return possibleFirstTags;
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
    Preconditions.checkNotNull(value);
    this.value = value;
  }

  @Override Asn1Tag getDefaultTag() {
    return Asn1Tag.OCTET_STRING;
  }

  @Override int getBerValueLength() {
    return value.length;
  }

  @Override void encodeBerValue(ByteBuffer buf) {
    buf.put(value);
  }

  @Override void decodeBerValue(ByteBuffer buf) {
    value = getRemaining(buf);
  }

  private Iterable<BitStream> encodePerImpl(boolean aligned) {
    Preconditions.checkState(
        maximumSize == null || value.length <= maximumSize, "Too large %s",
        value.length);
    if (maximumSize == null) {
      if (aligned) {
        return PerAlignedUtils.encodeSemiConstrainedLengthOfBytes(value);
      } else {
        return PerUnalignedUtils.encodeSemiConstrainedLengthOfBytes(value);
      }
    } else if (minimumSize == maximumSize) {
      if (maximumSize == 0) {
        return ImmutableList.of();
      }
      if (maximumSize < PerAlignedUtils.SIXTYFOUR_K) {
        BitStream result = new BitStream();
        for (int i = 0; i < maximumSize; i++) {
          result.appendByte(value[i]);
        }
        if (aligned && maximumSize > 2) {
          result.setBeginByteAligned();
        }
        return ImmutableList.of(result);
      }
    }
    if (aligned) {
      return PerAlignedUtils.encodeConstrainedLengthOfBytes(
          value, minimumSize, maximumSize);
    } else {
      return PerUnalignedUtils.encodeConstrainedLengthOfBytes(
          value, minimumSize, maximumSize);
    }
  }

  @Override public Iterable<BitStream> encodePerUnaligned() {
    return encodePerImpl(false);
  }

  @Override public Iterable<BitStream> encodePerAligned() {
    return encodePerImpl(true);
  }

  private void decodePerImpl(BitStreamReader reader, boolean aligned) {
    if (maximumSize == null) {
      if (aligned) {
        value = PerAlignedUtils.decodeSemiConstrainedLengthOfBytes(reader);
      } else {
        value = PerUnalignedUtils.decodeSemiConstrainedLengthOfBytes(reader);
      }
      return;
    } else if (minimumSize == maximumSize) {
      value = new byte[maximumSize];
      if (maximumSize == 0) {
        return;
      }
      if (maximumSize < PerAlignedUtils.SIXTYFOUR_K) {
        if (aligned && maximumSize > 2) {
          reader.spoolToByteBoundary();
        }
        for (int i = 0; i < maximumSize; i++) {
          value[i] = reader.readByte();
        }
        return;
      }
    }
    if (aligned) {
      value = PerAlignedUtils.decodeConstrainedLengthOfBytes(
          reader, minimumSize, maximumSize);
    } else {
      value = PerUnalignedUtils.decodeConstrainedLengthOfBytes(
          reader, minimumSize, maximumSize);
    }
  }

  @Override public void decodePerUnaligned(BitStreamReader reader) {
    decodePerImpl(reader, false);
  }

  @Override public void decodePerAligned(BitStreamReader reader) {
    decodePerImpl(reader, true);
  }

  @Override public String toString() {
    return toIndentedString("");
  }

  @Override
  public String toIndentedString(String indent) {
    return getTypeName() + " = [ " + HEX.encode(value) + " ];\n";
  }

  protected String getTypeName() {
    return "";
  }
}
