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
public  class GNSS_GenericAssistDataReq
    extends Asn1SequenceOf<GNSS_GenericAssistDataReqElement> {
  //

  private static final Asn1Tag TAG_GNSS_GenericAssistDataReq
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GNSS_GenericAssistDataReq() {
    super();
    setMinSize(1);
setMaxSize(16);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GNSS_GenericAssistDataReq;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GNSS_GenericAssistDataReq != null) {
      return ImmutableList.of(TAG_GNSS_GenericAssistDataReq);
    } else {
      return Asn1SequenceOf.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GNSS_GenericAssistDataReq from encoded stream.
   */
  public static GNSS_GenericAssistDataReq fromPerUnaligned(byte[] encodedBytes) {
    GNSS_GenericAssistDataReq result = new GNSS_GenericAssistDataReq();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GNSS_GenericAssistDataReq from encoded stream.
   */
  public static GNSS_GenericAssistDataReq fromPerAligned(byte[] encodedBytes) {
    GNSS_GenericAssistDataReq result = new GNSS_GenericAssistDataReq();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  
  @Override public GNSS_GenericAssistDataReqElement createAndAddValue() {
    GNSS_GenericAssistDataReqElement value = new GNSS_GenericAssistDataReqElement();
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
    builder.append("GNSS_GenericAssistDataReq = [\n");
    final String internalIndent = indent + "  ";
    for (GNSS_GenericAssistDataReqElement value : getValues()) {
      builder.append(internalIndent)
          .append(value.toIndentedString(internalIndent));
    }
    builder.append(indent).append("];\n");
    return builder.toString();
  }
}
