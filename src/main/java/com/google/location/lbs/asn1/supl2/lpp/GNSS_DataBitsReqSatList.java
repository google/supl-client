package com.google.location.lbs.asn1.supl2.lpp;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.google.location.lbs.asn1.base.Asn1Null;
import com.google.location.lbs.asn1.base.Asn1SequenceOf;
import com.google.location.lbs.asn1.base.Asn1Tag;
import com.google.location.lbs.asn1.base.BitStream;
import com.google.location.lbs.asn1.base.BitStreamReader;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
 * @author Torbjorn Gannholm (tobe@google.com)
 */
public  class GNSS_DataBitsReqSatList
    extends Asn1SequenceOf<GNSS_DataBitsReqSatElement> {
  //

  private static final Asn1Tag TAG_GNSS_DataBitsReqSatList
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GNSS_DataBitsReqSatList() {
    super();
    setMinSize(1);
setMaxSize(64);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GNSS_DataBitsReqSatList;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GNSS_DataBitsReqSatList != null) {
      return ImmutableList.of(TAG_GNSS_DataBitsReqSatList);
    } else {
      return Asn1SequenceOf.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GNSS_DataBitsReqSatList from encoded stream.
   */
  public static GNSS_DataBitsReqSatList fromPerUnaligned(byte[] encodedBytes) {
    GNSS_DataBitsReqSatList result = new GNSS_DataBitsReqSatList();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GNSS_DataBitsReqSatList from encoded stream.
   */
  public static GNSS_DataBitsReqSatList fromPerAligned(byte[] encodedBytes) {
    GNSS_DataBitsReqSatList result = new GNSS_DataBitsReqSatList();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  
  @Override public GNSS_DataBitsReqSatElement createAndAddValue() {
    GNSS_DataBitsReqSatElement value = new GNSS_DataBitsReqSatElement();
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
    builder.append("GNSS_DataBitsReqSatList = [\n");
    final String internalIndent = indent + "  ";
    for (GNSS_DataBitsReqSatElement value : getValues()) {
      builder.append(internalIndent)
          .append(value.toIndentedString(internalIndent));
    }
    builder.append(indent).append("];\n");
    return builder.toString();
  }
}
