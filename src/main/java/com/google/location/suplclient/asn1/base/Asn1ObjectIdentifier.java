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
import com.google.common.collect.Lists;

import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Object identifiers are similar in concept to URIs (indeed
 * urn:oid:0.0.8.245.0.13 is the OID URI for "itu-t(0) recommendation(0) h(8)
 * 245 version(0) 13"). See, for example, http://www.alvestrand.no/objectid/ and
 * http://www.oid-info.com/
 *
 * Implements ASN.1 functionality.
 *
 * 
 */
public class Asn1ObjectIdentifier extends Asn1Object {
  private static final Collection<Asn1Tag> possibleFirstTags =
      ImmutableList.of(Asn1Tag.OBJECT_IDENTIFIER);

  private List<Integer> value;

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    return possibleFirstTags;
  }

  @Override Asn1Tag getDefaultTag() {
    return Asn1Tag.OBJECT_IDENTIFIER;
  }

  @Override int getBerValueLength() {
    byte[] ber = encodeBerInternal();
    return ber.length;
  }

  @Override void encodeBerValue(ByteBuffer buf) {
    buf.put(encodeBerInternal());
  }

  @Override void decodeBerValue(ByteBuffer buf) {
    decodeBerInternal(getRemaining(buf));
  }

  public List<Integer> getValue() {
    return value;
  }

  public void setValue(List<Integer> value) {
    this.value = value;
  }

  private byte[] encodeBerInternal() {
    Preconditions.checkNotNull(value);
    // Encode according to BER.
    BitStream basicEncoding = new BitStream();
    Iterator<Integer> valueIterator = value.iterator();
    int firstComponent = valueIterator.next() * 40 + valueIterator.next();
    encodeComponent(basicEncoding, firstComponent, false);
    while (valueIterator.hasNext()) {
      encodeComponent(basicEncoding, valueIterator.next(), false);
    }
    return basicEncoding.getPaddedBytes();
  }

  @Override public Iterable<BitStream> encodePerUnaligned() {
    // Stuff it according to PER. Strange, less packed (but faster to ignore).
    return PerUnalignedUtils.encodeSemiConstrainedLengthOfBytes(encodeBerInternal());
  }

  @Override public Iterable<BitStream> encodePerAligned() {
    // Stuff it according to PER. Strange, less packed (but faster to ignore).
    return PerAlignedUtils.encodeSemiConstrainedLengthOfBytes(encodeBerInternal());
  }

  private void encodeComponent(BitStream basicEncoding,
                               int component,
                               boolean hasSuffix) {
    if (component > 0x7F) {
      encodeComponent(basicEncoding, component >>> 7, true);
    }
    basicEncoding.appendBit(hasSuffix);
    basicEncoding.appendLowBits(7, (byte) (component & 0x7F));
  }

  @Override public void decodePerUnaligned(BitStreamReader reader) {
    byte[] basicEncoding = PerUnalignedUtils.decodeSemiConstrainedLengthOfBytes(reader);
    decodeBerInternal(basicEncoding);
  }

  @Override public void decodePerAligned(BitStreamReader reader) {
    byte[] basicEncoding = PerAlignedUtils.decodeSemiConstrainedLengthOfBytes(reader);
    decodeBerInternal(basicEncoding);
  }

  private void decodeBerInternal(byte[] encodedBytes) {
    List<Integer> components = Lists.newLinkedList();
    int currentComponent = 0;
    for (int i = 0; i < encodedBytes.length; i++) {
      boolean completesComponent = ((encodedBytes[i] & 0x80) == 0);
      int componentPart = encodedBytes[i] & 0x7F;
      currentComponent = (currentComponent << 7) + componentPart;
      if (completesComponent) {
        if (components.isEmpty()) {
          int firstComponent = currentComponent / 40;
          int secondComponent = currentComponent % 40;
          components.add(firstComponent);
          components.add(secondComponent);
        } else {
          components.add(currentComponent);
        }
        currentComponent = 0;
      }
    }
    value = ImmutableList.copyOf(components);
  }
}
