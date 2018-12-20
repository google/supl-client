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

import com.google.common.collect.ImmutableList;

import java.nio.ByteBuffer;
import java.util.Collection;

/**
 * Implements ASN.1 functionality.
 *
 * 
 */
public class Asn1Boolean extends Asn1Object {
  private static final Collection<Asn1Tag> possibleFirstTags =
      ImmutableList.of(Asn1Tag.BOOLEAN);

  private boolean value;

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    return possibleFirstTags;
  }

  @Override Asn1Tag getDefaultTag() {
    return Asn1Tag.BOOLEAN;
  }

  @Override int getBerValueLength() {
    return 1;
  }

  @Override void encodeBerValue(ByteBuffer buf) {
    buf.put(value ? (byte) 0xFF : (byte) 0x00);
  }

  @Override void decodeBerValue(ByteBuffer buf) {
    if (buf.remaining() != 1) {
      throw new IllegalArgumentException("Invalid remaining bytes: " + buf.remaining());
    }
    value = (buf.get() != 0);
  }

  public boolean getValue() {
    return value;
  }

  public void setValue(boolean value) {
    this.value = value;
  }

  private Iterable<BitStream> encodePerImpl() {
    BitStream result = new BitStream();
    result.appendBit(value);
    return ImmutableList.of(result);
  }

  @Override public Iterable<BitStream> encodePerUnaligned() {
    return encodePerImpl();
  }

  @Override public Iterable<BitStream> encodePerAligned() {
    return encodePerImpl();
  }

  @Override public void decodePerUnaligned(BitStreamReader reader) {
    value = reader.readBit();
  }

  @Override public void decodePerAligned(BitStreamReader reader) {
    value = reader.readBit();
  }
}
