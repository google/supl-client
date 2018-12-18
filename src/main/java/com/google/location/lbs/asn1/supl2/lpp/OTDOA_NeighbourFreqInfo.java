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
 * 
 */
public  class OTDOA_NeighbourFreqInfo
    extends Asn1SequenceOf<OTDOA_NeighbourCellInfoElement> {
  //

  private static final Asn1Tag TAG_OTDOA_NeighbourFreqInfo
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public OTDOA_NeighbourFreqInfo() {
    super();
    setMinSize(1);
setMaxSize(24);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_OTDOA_NeighbourFreqInfo;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_OTDOA_NeighbourFreqInfo != null) {
      return ImmutableList.of(TAG_OTDOA_NeighbourFreqInfo);
    } else {
      return Asn1SequenceOf.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new OTDOA_NeighbourFreqInfo from encoded stream.
   */
  public static OTDOA_NeighbourFreqInfo fromPerUnaligned(byte[] encodedBytes) {
    OTDOA_NeighbourFreqInfo result = new OTDOA_NeighbourFreqInfo();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new OTDOA_NeighbourFreqInfo from encoded stream.
   */
  public static OTDOA_NeighbourFreqInfo fromPerAligned(byte[] encodedBytes) {
    OTDOA_NeighbourFreqInfo result = new OTDOA_NeighbourFreqInfo();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  
  @Override public OTDOA_NeighbourCellInfoElement createAndAddValue() {
    OTDOA_NeighbourCellInfoElement value = new OTDOA_NeighbourCellInfoElement();
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
    builder.append("OTDOA_NeighbourFreqInfo = [\n");
    final String internalIndent = indent + "  ";
    for (OTDOA_NeighbourCellInfoElement value : getValues()) {
      builder.append(internalIndent)
          .append(value.toIndentedString(internalIndent));
    }
    builder.append(indent).append("];\n");
    return builder.toString();
  }
}
