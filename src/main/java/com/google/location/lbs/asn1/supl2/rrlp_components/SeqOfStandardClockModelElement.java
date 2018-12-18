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
import com.google.location.lbs.asn1.supl2.rrlp_components.StandardClockModelElement;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
 * @author Torbjorn Gannholm (tobe@google.com)
 */
public  class SeqOfStandardClockModelElement
    extends Asn1SequenceOf<StandardClockModelElement> {
  //

  private static final Asn1Tag TAG_SeqOfStandardClockModelElement
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public SeqOfStandardClockModelElement() {
    super();
    setMinSize(1);
setMaxSize(2);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_SeqOfStandardClockModelElement;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_SeqOfStandardClockModelElement != null) {
      return ImmutableList.of(TAG_SeqOfStandardClockModelElement);
    } else {
      return Asn1SequenceOf.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new SeqOfStandardClockModelElement from encoded stream.
   */
  public static SeqOfStandardClockModelElement fromPerUnaligned(byte[] encodedBytes) {
    SeqOfStandardClockModelElement result = new SeqOfStandardClockModelElement();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new SeqOfStandardClockModelElement from encoded stream.
   */
  public static SeqOfStandardClockModelElement fromPerAligned(byte[] encodedBytes) {
    SeqOfStandardClockModelElement result = new SeqOfStandardClockModelElement();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  
  @Override public StandardClockModelElement createAndAddValue() {
    StandardClockModelElement value = new StandardClockModelElement();
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
    builder.append("SeqOfStandardClockModelElement = [\n");
    final String internalIndent = indent + "  ";
    for (StandardClockModelElement value : getValues()) {
      builder.append(internalIndent)
          .append(value.toIndentedString(internalIndent));
    }
    builder.append(indent).append("];\n");
    return builder.toString();
  }
}
