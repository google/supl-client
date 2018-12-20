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
