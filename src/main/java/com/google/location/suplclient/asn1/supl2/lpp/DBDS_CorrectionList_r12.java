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

package com.google.location.suplclient.asn1.supl2.lpp;

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
public  class DBDS_CorrectionList_r12
    extends Asn1SequenceOf<DBDS_CorrectionElement_r12> {
  //

  private static final Asn1Tag TAG_DBDS_CorrectionList_r12
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public DBDS_CorrectionList_r12() {
    super();
    setMinSize(1);
setMaxSize(64);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_DBDS_CorrectionList_r12;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_DBDS_CorrectionList_r12 != null) {
      return ImmutableList.of(TAG_DBDS_CorrectionList_r12);
    } else {
      return Asn1SequenceOf.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new DBDS_CorrectionList_r12 from encoded stream.
   */
  public static DBDS_CorrectionList_r12 fromPerUnaligned(byte[] encodedBytes) {
    DBDS_CorrectionList_r12 result = new DBDS_CorrectionList_r12();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new DBDS_CorrectionList_r12 from encoded stream.
   */
  public static DBDS_CorrectionList_r12 fromPerAligned(byte[] encodedBytes) {
    DBDS_CorrectionList_r12 result = new DBDS_CorrectionList_r12();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  
  @Override public DBDS_CorrectionElement_r12 createAndAddValue() {
    DBDS_CorrectionElement_r12 value = new DBDS_CorrectionElement_r12();
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
    builder.append("DBDS_CorrectionList_r12 = [\n");
    final String internalIndent = indent + "  ";
    for (DBDS_CorrectionElement_r12 value : getValues()) {
      builder.append(internalIndent)
          .append(value.toIndentedString(internalIndent));
    }
    builder.append(indent).append("];\n");
    return builder.toString();
  }
}
