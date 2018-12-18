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
public  class SeqOf_GANSSDataBits
    extends Asn1SequenceOf<GANSSDataBit> {
  //

  private static final Asn1Tag TAG_SeqOf_GANSSDataBits
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public SeqOf_GANSSDataBits() {
    super();
    setMinSize(1);
setMaxSize(1024);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_SeqOf_GANSSDataBits;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_SeqOf_GANSSDataBits != null) {
      return ImmutableList.of(TAG_SeqOf_GANSSDataBits);
    } else {
      return Asn1SequenceOf.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new SeqOf_GANSSDataBits from encoded stream.
   */
  public static SeqOf_GANSSDataBits fromPerUnaligned(byte[] encodedBytes) {
    SeqOf_GANSSDataBits result = new SeqOf_GANSSDataBits();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new SeqOf_GANSSDataBits from encoded stream.
   */
  public static SeqOf_GANSSDataBits fromPerAligned(byte[] encodedBytes) {
    SeqOf_GANSSDataBits result = new SeqOf_GANSSDataBits();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  
  @Override public GANSSDataBit createAndAddValue() {
    GANSSDataBit value = new GANSSDataBit();
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
    builder.append("SeqOf_GANSSDataBits = [\n");
    final String internalIndent = indent + "  ";
    for (GANSSDataBit value : getValues()) {
      builder.append(internalIndent)
          .append(value.toIndentedString(internalIndent));
    }
    builder.append(indent).append("];\n");
    return builder.toString();
  }
}
