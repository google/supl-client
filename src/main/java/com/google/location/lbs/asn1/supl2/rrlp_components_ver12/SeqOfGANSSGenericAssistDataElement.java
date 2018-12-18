package com.google.location.lbs.asn1.supl2.rrlp_components_ver12;

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
public  class SeqOfGANSSGenericAssistDataElement
    extends Asn1SequenceOf<GANSSGenericAssistDataElement> {
  //

  private static final Asn1Tag TAG_SeqOfGANSSGenericAssistDataElement
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public SeqOfGANSSGenericAssistDataElement() {
    super();
    setMinSize(1);
setMaxSize(8);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_SeqOfGANSSGenericAssistDataElement;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_SeqOfGANSSGenericAssistDataElement != null) {
      return ImmutableList.of(TAG_SeqOfGANSSGenericAssistDataElement);
    } else {
      return Asn1SequenceOf.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new SeqOfGANSSGenericAssistDataElement from encoded stream.
   */
  public static SeqOfGANSSGenericAssistDataElement fromPerUnaligned(byte[] encodedBytes) {
    SeqOfGANSSGenericAssistDataElement result = new SeqOfGANSSGenericAssistDataElement();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new SeqOfGANSSGenericAssistDataElement from encoded stream.
   */
  public static SeqOfGANSSGenericAssistDataElement fromPerAligned(byte[] encodedBytes) {
    SeqOfGANSSGenericAssistDataElement result = new SeqOfGANSSGenericAssistDataElement();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  
  @Override public GANSSGenericAssistDataElement createAndAddValue() {
    GANSSGenericAssistDataElement value = new GANSSGenericAssistDataElement();
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
    builder.append("SeqOfGANSSGenericAssistDataElement = [\n");
    final String internalIndent = indent + "  ";
    for (GANSSGenericAssistDataElement value : getValues()) {
      builder.append(internalIndent)
          .append(value.toIndentedString(internalIndent));
    }
    builder.append(indent).append("];\n");
    return builder.toString();
  }
}
