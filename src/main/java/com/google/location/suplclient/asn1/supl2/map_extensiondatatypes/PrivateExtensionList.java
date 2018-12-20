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

package com.google.location.suplclient.asn1.supl2.map_extensiondatatypes;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
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
public  class PrivateExtensionList
    extends Asn1SequenceOf<PrivateExtension> {
  //

  private static final Asn1Tag TAG_PrivateExtensionList
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public PrivateExtensionList() {
    super();
    setMinSize(1);
setMaxSize(10);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_PrivateExtensionList;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_PrivateExtensionList != null) {
      return ImmutableList.of(TAG_PrivateExtensionList);
    } else {
      return Asn1SequenceOf.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new PrivateExtensionList from encoded stream.
   */
  public static PrivateExtensionList fromPerUnaligned(byte[] encodedBytes) {
    PrivateExtensionList result = new PrivateExtensionList();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new PrivateExtensionList from encoded stream.
   */
  public static PrivateExtensionList fromPerAligned(byte[] encodedBytes) {
    PrivateExtensionList result = new PrivateExtensionList();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  
  @Override public PrivateExtension createAndAddValue() {
    PrivateExtension value = new PrivateExtension();
    add(value);
    return value;
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
    builder.append("PrivateExtensionList = [\n");
    final String internalIndent = indent + "  ";
    for (PrivateExtension value : getValues()) {
      builder.append(internalIndent)
          .append(value.toIndentedString(internalIndent));
    }
    builder.append(indent).append("];\n");
    return builder.toString();
  }
}
