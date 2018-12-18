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
public  class SatListRelatedDataList
    extends Asn1SequenceOf<SatListRelatedDataElement> {
  //

  private static final Asn1Tag TAG_SatListRelatedDataList
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public SatListRelatedDataList() {
    super();
    setMinSize(1);
setMaxSize(64);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_SatListRelatedDataList;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_SatListRelatedDataList != null) {
      return ImmutableList.of(TAG_SatListRelatedDataList);
    } else {
      return Asn1SequenceOf.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new SatListRelatedDataList from encoded stream.
   */
  public static SatListRelatedDataList fromPerUnaligned(byte[] encodedBytes) {
    SatListRelatedDataList result = new SatListRelatedDataList();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new SatListRelatedDataList from encoded stream.
   */
  public static SatListRelatedDataList fromPerAligned(byte[] encodedBytes) {
    SatListRelatedDataList result = new SatListRelatedDataList();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  
  @Override public SatListRelatedDataElement createAndAddValue() {
    SatListRelatedDataElement value = new SatListRelatedDataElement();
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
    builder.append("SatListRelatedDataList = [\n");
    final String internalIndent = indent + "  ";
    for (SatListRelatedDataElement value : getValues()) {
      builder.append(internalIndent)
          .append(value.toIndentedString(internalIndent));
    }
    builder.append(indent).append("];\n");
    return builder.toString();
  }
}
