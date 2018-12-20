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

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Collection;

/**
 * Base class for representing ASN.1 objects of type UTF8String.
 */
public class Asn1Utf8String extends Asn1Object {
  private static final Collection<Asn1Tag> possibleFirstTags =
      ImmutableList.of(Asn1Tag.UTF8STRING);

  private int minimumSize = 0;
  private Integer maximumSize = null; // null == unbounded.
  private String value;

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

  private byte[] getValueBytes() {
    return value.getBytes(StandardCharsets.UTF_8);
  }

  private void setValueBytes(byte[] bytes) {
    value = new String(bytes, StandardCharsets.UTF_8);
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    return possibleFirstTags;
  }

  @Override Asn1Tag getDefaultTag() {
    return Asn1Tag.UTF8STRING;
  }

  @Override int getBerValueLength() {
    Preconditions.checkNotNull(value, "No value set.");
    return getValueBytes().length;
  }

  @Override void encodeBerValue(ByteBuffer buf) {
    Preconditions.checkNotNull(value, "No value set.");
    buf.put(getValueBytes());
  }

  @Override public void decodeBerValue(ByteBuffer buf) {
    setValueBytes(getRemaining(buf));
  }

  private Iterable<BitStream> encodePerImpl(boolean aligned) {
    Preconditions.checkNotNull(value, "No value set.");
    Preconditions.checkState(
        maximumSize == null || value.length() <= maximumSize, "Too large %s",
        value.length());
    byte[] bytes = getValueBytes();
    if (aligned) {
      return PerAlignedUtils.encodeSemiConstrainedLengthOfBytes(bytes);
    } else {
      return PerUnalignedUtils.encodeSemiConstrainedLengthOfBytes(bytes);
    }
  }

  @Override public Iterable<BitStream> encodePerUnaligned() {
    return encodePerImpl(false);
  }

  @Override public Iterable<BitStream> encodePerAligned() {
    return encodePerImpl(true);
  }

  private void decodePerImpl(BitStreamReader reader, boolean aligned) {
    if (aligned) {
      setValueBytes(PerAlignedUtils.decodeSemiConstrainedLengthOfBytes(reader));
    } else {
      setValueBytes(PerUnalignedUtils.decodeSemiConstrainedLengthOfBytes(reader));
    }
  }

  @Override public void decodePerUnaligned(BitStreamReader reader) {
    decodePerImpl(reader, false);
  }

  @Override public void decodePerAligned(BitStreamReader reader) {
    decodePerImpl(reader, true);
  }
}
