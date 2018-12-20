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

package com.google.location.suplclient.asn1.supl2.rrlp_components;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.google.location.suplclient.asn1.base.Asn1OctetString;
import com.google.location.suplclient.asn1.base.Asn1SequenceOf;
import com.google.location.suplclient.asn1.base.Asn1Tag;
import com.google.location.suplclient.asn1.base.BitStream;
import com.google.location.suplclient.asn1.base.BitStreamReader;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
 * 
 */
public  class GANSSDeltaElementList
    extends Asn1SequenceOf<GANSSDeltaElementList.GANSSDeltaElementListComponentType> {
  //

  private static final Asn1Tag TAG_GANSSDeltaElementList
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GANSSDeltaElementList() {
    super();
    setMinSize(1);
setMaxSize(32);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GANSSDeltaElementList;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GANSSDeltaElementList != null) {
      return ImmutableList.of(TAG_GANSSDeltaElementList);
    } else {
      return Asn1SequenceOf.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GANSSDeltaElementList from encoded stream.
   */
  public static GANSSDeltaElementList fromPerUnaligned(byte[] encodedBytes) {
    GANSSDeltaElementList result = new GANSSDeltaElementList();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GANSSDeltaElementList from encoded stream.
   */
  public static GANSSDeltaElementList fromPerAligned(byte[] encodedBytes) {
    GANSSDeltaElementList result = new GANSSDeltaElementList();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  
  @Override public GANSSDeltaElementList.GANSSDeltaElementListComponentType createAndAddValue() {
    GANSSDeltaElementList.GANSSDeltaElementListComponentType value = new GANSSDeltaElementList.GANSSDeltaElementListComponentType();
    add(value);
    return value;
  }

 // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class GANSSDeltaElementListComponentType extends Asn1OctetString {
  //

  private static final Asn1Tag TAG_GANSSDeltaElementListComponentType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GANSSDeltaElementListComponentType() {
    super();
    setMinSize(1);
setMaxSize(49);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GANSSDeltaElementListComponentType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GANSSDeltaElementListComponentType != null) {
      return ImmutableList.of(TAG_GANSSDeltaElementListComponentType);
    } else {
      return Asn1OctetString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GANSSDeltaElementListComponentType from encoded stream.
   */
  public static GANSSDeltaElementListComponentType fromPerUnaligned(byte[] encodedBytes) {
    GANSSDeltaElementListComponentType result = new GANSSDeltaElementListComponentType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GANSSDeltaElementListComponentType from encoded stream.
   */
  public static GANSSDeltaElementListComponentType fromPerAligned(byte[] encodedBytes) {
    GANSSDeltaElementListComponentType result = new GANSSDeltaElementListComponentType();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  @Override public Iterable<BitStream> encodePerUnaligned() {
    return super.encodePerUnaligned();
  }

  @Override public Iterable<BitStream> encodePerAligned() {
    return super.encodePerAligned();
  }

  @Override public void decodePerUnaligned(BitStreamReader reader) {
    super.decodePerUnaligned(reader);
  }

  @Override public void decodePerAligned(BitStreamReader reader) {
    super.decodePerAligned(reader);
  }

  @Override protected String getTypeName() {
    return "GANSSDeltaElementListComponentType";
  }
}
 

  @Override public Iterable<BitStream> encodePerUnaligned() {
    return super.encodePerUnaligned();
  }

  @Override public Iterable<BitStream> encodePerAligned() {
    return super.encodePerAligned();
  }

  @Override public void decodePerUnaligned(BitStreamReader reader) {
    super.decodePerUnaligned(reader);
  }

  @Override public void decodePerAligned(BitStreamReader reader) {
    super.decodePerAligned(reader);
  }

  @Override public String toString() {
    return toIndentedString("");
  }

  public String toIndentedString(String indent) {
    StringBuilder builder = new StringBuilder();
    builder.append("GANSSDeltaElementList = [\n");
    final String internalIndent = indent + "  ";
    for (GANSSDeltaElementList.GANSSDeltaElementListComponentType value : getValues()) {
      builder.append(internalIndent)
          .append(value.toIndentedString(internalIndent));
    }
    builder.append(indent).append("];\n");
    return builder.toString();
  }
}
