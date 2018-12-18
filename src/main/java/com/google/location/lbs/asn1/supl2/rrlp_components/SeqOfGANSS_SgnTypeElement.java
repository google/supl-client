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
public  class SeqOfGANSS_SgnTypeElement
    extends Asn1SequenceOf<GANSS_SgnTypeElement> {
  //

  private static final Asn1Tag TAG_SeqOfGANSS_SgnTypeElement
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public SeqOfGANSS_SgnTypeElement() {
    super();
    setMinSize(1);
setMaxSize(8);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_SeqOfGANSS_SgnTypeElement;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_SeqOfGANSS_SgnTypeElement != null) {
      return ImmutableList.of(TAG_SeqOfGANSS_SgnTypeElement);
    } else {
      return Asn1SequenceOf.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new SeqOfGANSS_SgnTypeElement from encoded stream.
   */
  public static SeqOfGANSS_SgnTypeElement fromPerUnaligned(byte[] encodedBytes) {
    SeqOfGANSS_SgnTypeElement result = new SeqOfGANSS_SgnTypeElement();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new SeqOfGANSS_SgnTypeElement from encoded stream.
   */
  public static SeqOfGANSS_SgnTypeElement fromPerAligned(byte[] encodedBytes) {
    SeqOfGANSS_SgnTypeElement result = new SeqOfGANSS_SgnTypeElement();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  
  @Override public GANSS_SgnTypeElement createAndAddValue() {
    GANSS_SgnTypeElement value = new GANSS_SgnTypeElement();
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
    builder.append("SeqOfGANSS_SgnTypeElement = [\n");
    final String internalIndent = indent + "  ";
    for (GANSS_SgnTypeElement value : getValues()) {
      builder.append(internalIndent)
          .append(value.toIndentedString(internalIndent));
    }
    builder.append(indent).append("];\n");
    return builder.toString();
  }
}
