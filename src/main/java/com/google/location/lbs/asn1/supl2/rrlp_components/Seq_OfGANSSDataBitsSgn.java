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
public  class Seq_OfGANSSDataBitsSgn
    extends Asn1SequenceOf<GANSSDataBitsSgnElement> {
  //

  private static final Asn1Tag TAG_Seq_OfGANSSDataBitsSgn
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public Seq_OfGANSSDataBitsSgn() {
    super();
    setMinSize(1);
setMaxSize(8);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_Seq_OfGANSSDataBitsSgn;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_Seq_OfGANSSDataBitsSgn != null) {
      return ImmutableList.of(TAG_Seq_OfGANSSDataBitsSgn);
    } else {
      return Asn1SequenceOf.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new Seq_OfGANSSDataBitsSgn from encoded stream.
   */
  public static Seq_OfGANSSDataBitsSgn fromPerUnaligned(byte[] encodedBytes) {
    Seq_OfGANSSDataBitsSgn result = new Seq_OfGANSSDataBitsSgn();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new Seq_OfGANSSDataBitsSgn from encoded stream.
   */
  public static Seq_OfGANSSDataBitsSgn fromPerAligned(byte[] encodedBytes) {
    Seq_OfGANSSDataBitsSgn result = new Seq_OfGANSSDataBitsSgn();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  
  @Override public GANSSDataBitsSgnElement createAndAddValue() {
    GANSSDataBitsSgnElement value = new GANSSDataBitsSgnElement();
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
    builder.append("Seq_OfGANSSDataBitsSgn = [\n");
    final String internalIndent = indent + "  ";
    for (GANSSDataBitsSgnElement value : getValues()) {
      builder.append(internalIndent)
          .append(value.toIndentedString(internalIndent));
    }
    builder.append(indent).append("];\n");
    return builder.toString();
  }
}
