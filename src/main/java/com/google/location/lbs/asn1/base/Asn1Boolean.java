// Copyright 2008 Google Inc. All Rights Reserved.

package com.google.location.lbs.asn1.base;

import com.google.common.collect.ImmutableList;

import java.nio.ByteBuffer;
import java.util.Collection;

/**
 * Implements ASN.1 functionality.
 *
 * @author tobe@google.com (Torbjorn Gannholm)
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
