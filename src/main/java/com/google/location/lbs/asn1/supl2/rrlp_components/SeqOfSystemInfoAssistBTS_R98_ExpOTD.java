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
 * 
 */
public  class SeqOfSystemInfoAssistBTS_R98_ExpOTD
    extends Asn1SequenceOf<SystemInfoAssistBTS_R98_ExpOTD> {
  //

  private static final Asn1Tag TAG_SeqOfSystemInfoAssistBTS_R98_ExpOTD
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public SeqOfSystemInfoAssistBTS_R98_ExpOTD() {
    super();
    setMinSize(1);
setMaxSize(32);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_SeqOfSystemInfoAssistBTS_R98_ExpOTD;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_SeqOfSystemInfoAssistBTS_R98_ExpOTD != null) {
      return ImmutableList.of(TAG_SeqOfSystemInfoAssistBTS_R98_ExpOTD);
    } else {
      return Asn1SequenceOf.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new SeqOfSystemInfoAssistBTS_R98_ExpOTD from encoded stream.
   */
  public static SeqOfSystemInfoAssistBTS_R98_ExpOTD fromPerUnaligned(byte[] encodedBytes) {
    SeqOfSystemInfoAssistBTS_R98_ExpOTD result = new SeqOfSystemInfoAssistBTS_R98_ExpOTD();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new SeqOfSystemInfoAssistBTS_R98_ExpOTD from encoded stream.
   */
  public static SeqOfSystemInfoAssistBTS_R98_ExpOTD fromPerAligned(byte[] encodedBytes) {
    SeqOfSystemInfoAssistBTS_R98_ExpOTD result = new SeqOfSystemInfoAssistBTS_R98_ExpOTD();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  
  @Override public SystemInfoAssistBTS_R98_ExpOTD createAndAddValue() {
    SystemInfoAssistBTS_R98_ExpOTD value = new SystemInfoAssistBTS_R98_ExpOTD();
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
    builder.append("SeqOfSystemInfoAssistBTS_R98_ExpOTD = [\n");
    final String internalIndent = indent + "  ";
    for (SystemInfoAssistBTS_R98_ExpOTD value : getValues()) {
      builder.append(internalIndent)
          .append(value.toIndentedString(internalIndent));
    }
    builder.append(indent).append("];\n");
    return builder.toString();
  }
}
