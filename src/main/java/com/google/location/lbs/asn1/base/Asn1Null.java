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
public class Asn1Null extends Asn1Object {
  private static final Collection<Asn1Tag> possibleFirstTags =
      ImmutableList.of(Asn1Tag.NULL);

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    return possibleFirstTags;
  }

  @Override Asn1Tag getDefaultTag() {
    return Asn1Tag.NULL;
  }

  @Override int getBerValueLength() {
    return 0;
  }

  @Override void encodeBerValue(ByteBuffer buf) {
  }

  @Override void decodeBerValue(ByteBuffer buf) {
    if (buf.remaining() != 0) {
      throw new IllegalArgumentException("Invalid remaining bytes: " + buf.remaining());
    }
  }

  @Override public Iterable<BitStream> encodePerUnaligned() {
    return ImmutableList.of();
  }

  @Override public Iterable<BitStream> encodePerAligned() {
    return ImmutableList.of();
  }

  @Override public void decodePerUnaligned(BitStreamReader reader) {
  }

  @Override public void decodePerAligned(BitStreamReader reader) {
  }
}
