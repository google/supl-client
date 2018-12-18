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
public  class SeqOfSystemInfoAssistBTS
    extends Asn1SequenceOf<SystemInfoAssistBTS> {
  //

  private static final Asn1Tag TAG_SeqOfSystemInfoAssistBTS
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public SeqOfSystemInfoAssistBTS() {
    super();
    setMinSize(1);
setMaxSize(32);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_SeqOfSystemInfoAssistBTS;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_SeqOfSystemInfoAssistBTS != null) {
      return ImmutableList.of(TAG_SeqOfSystemInfoAssistBTS);
    } else {
      return Asn1SequenceOf.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new SeqOfSystemInfoAssistBTS from encoded stream.
   */
  public static SeqOfSystemInfoAssistBTS fromPerUnaligned(byte[] encodedBytes) {
    SeqOfSystemInfoAssistBTS result = new SeqOfSystemInfoAssistBTS();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new SeqOfSystemInfoAssistBTS from encoded stream.
   */
  public static SeqOfSystemInfoAssistBTS fromPerAligned(byte[] encodedBytes) {
    SeqOfSystemInfoAssistBTS result = new SeqOfSystemInfoAssistBTS();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  
  @Override public SystemInfoAssistBTS createAndAddValue() {
    SystemInfoAssistBTS value = new SystemInfoAssistBTS();
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
    builder.append("SeqOfSystemInfoAssistBTS = [\n");
    final String internalIndent = indent + "  ";
    for (SystemInfoAssistBTS value : getValues()) {
      builder.append(internalIndent)
          .append(value.toIndentedString(internalIndent));
    }
    builder.append(indent).append("];\n");
    return builder.toString();
  }
}
