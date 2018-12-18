package com.google.location.lbs.asn1.supl2.rrlp_components;

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
public  class SeqOfOTD_MsrElementRest
    extends Asn1SequenceOf<OTD_MsrElementRest> {
  //

  private static final Asn1Tag TAG_SeqOfOTD_MsrElementRest
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public SeqOfOTD_MsrElementRest() {
    super();
    setMinSize(1);
setMaxSize(2);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_SeqOfOTD_MsrElementRest;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_SeqOfOTD_MsrElementRest != null) {
      return ImmutableList.of(TAG_SeqOfOTD_MsrElementRest);
    } else {
      return Asn1SequenceOf.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new SeqOfOTD_MsrElementRest from encoded stream.
   */
  public static SeqOfOTD_MsrElementRest fromPerUnaligned(byte[] encodedBytes) {
    SeqOfOTD_MsrElementRest result = new SeqOfOTD_MsrElementRest();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new SeqOfOTD_MsrElementRest from encoded stream.
   */
  public static SeqOfOTD_MsrElementRest fromPerAligned(byte[] encodedBytes) {
    SeqOfOTD_MsrElementRest result = new SeqOfOTD_MsrElementRest();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  
  @Override public OTD_MsrElementRest createAndAddValue() {
    OTD_MsrElementRest value = new OTD_MsrElementRest();
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
    builder.append("SeqOfOTD_MsrElementRest = [\n");
    final String internalIndent = indent + "  ";
    for (OTD_MsrElementRest value : getValues()) {
      builder.append(internalIndent)
          .append(value.toIndentedString(internalIndent));
    }
    builder.append(indent).append("];\n");
    return builder.toString();
  }
}
