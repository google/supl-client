// Copyright 2008 Google Inc. All Rights Reserved.

package com.google.location.lbs.asn1.base;

import java.nio.ByteBuffer;
import java.util.Collection;

/**
 * 
 */
public class Asn1ParameterObject extends Asn1Object {

  private Asn1Object realObject;

  protected Asn1Object getRealObject() {
    return realObject;
  }

  protected void setRealObject(Asn1Object realObject) {
    this.realObject = realObject;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    throw new UnsupportedOperationException("Not implemented for BER");
  }

  @Override Asn1Tag getDefaultTag() {
    throw new UnsupportedOperationException("Not implemented for BER");
  }

  @Override int getBerValueLength() {
    throw new UnsupportedOperationException("Not implemented for BER");
  }

  @Override void encodeBerValue(ByteBuffer buf) {
    throw new UnsupportedOperationException("Not implemented for BER");
  }

  @Override void decodeBerValue(ByteBuffer buf) {
    throw new UnsupportedOperationException("Not implemented for BER");
  }

  @Override public Iterable<BitStream> encodePerUnaligned() {
    return realObject.encodePerUnaligned();
  }

  @Override
  public Iterable<BitStream> encodePerAligned() {
    return realObject.encodePerAligned();
  }

  @Override
  public void decodePerUnaligned(BitStreamReader reader) {
    realObject.decodePerUnaligned(reader);
  }

  @Override
  public void decodePerAligned(BitStreamReader reader) {
    realObject.decodePerAligned(reader);
  }
}
