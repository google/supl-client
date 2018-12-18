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
public  class SeqOfBadSignalElement
    extends Asn1SequenceOf<BadSignalElement> {
  //

  private static final Asn1Tag TAG_SeqOfBadSignalElement
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public SeqOfBadSignalElement() {
    super();
    setMinSize(1);
setMaxSize(16);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_SeqOfBadSignalElement;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_SeqOfBadSignalElement != null) {
      return ImmutableList.of(TAG_SeqOfBadSignalElement);
    } else {
      return Asn1SequenceOf.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new SeqOfBadSignalElement from encoded stream.
   */
  public static SeqOfBadSignalElement fromPerUnaligned(byte[] encodedBytes) {
    SeqOfBadSignalElement result = new SeqOfBadSignalElement();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new SeqOfBadSignalElement from encoded stream.
   */
  public static SeqOfBadSignalElement fromPerAligned(byte[] encodedBytes) {
    SeqOfBadSignalElement result = new SeqOfBadSignalElement();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  
  @Override public BadSignalElement createAndAddValue() {
    BadSignalElement value = new BadSignalElement();
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
    builder.append("SeqOfBadSignalElement = [\n");
    final String internalIndent = indent + "  ";
    for (BadSignalElement value : getValues()) {
      builder.append(internalIndent)
          .append(value.toIndentedString(internalIndent));
    }
    builder.append(indent).append("];\n");
    return builder.toString();
  }
}
