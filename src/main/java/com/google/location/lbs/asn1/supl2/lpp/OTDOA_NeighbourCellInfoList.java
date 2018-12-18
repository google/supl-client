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
public  class OTDOA_NeighbourCellInfoList
    extends Asn1SequenceOf<OTDOA_NeighbourFreqInfo> {
  //

  private static final Asn1Tag TAG_OTDOA_NeighbourCellInfoList
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public OTDOA_NeighbourCellInfoList() {
    super();
    setMinSize(1);
setMaxSize(maxFreqLayers.VALUE.intValue());

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_OTDOA_NeighbourCellInfoList;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_OTDOA_NeighbourCellInfoList != null) {
      return ImmutableList.of(TAG_OTDOA_NeighbourCellInfoList);
    } else {
      return Asn1SequenceOf.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new OTDOA_NeighbourCellInfoList from encoded stream.
   */
  public static OTDOA_NeighbourCellInfoList fromPerUnaligned(byte[] encodedBytes) {
    OTDOA_NeighbourCellInfoList result = new OTDOA_NeighbourCellInfoList();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new OTDOA_NeighbourCellInfoList from encoded stream.
   */
  public static OTDOA_NeighbourCellInfoList fromPerAligned(byte[] encodedBytes) {
    OTDOA_NeighbourCellInfoList result = new OTDOA_NeighbourCellInfoList();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  
  @Override public OTDOA_NeighbourFreqInfo createAndAddValue() {
    OTDOA_NeighbourFreqInfo value = new OTDOA_NeighbourFreqInfo();
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
    builder.append("OTDOA_NeighbourCellInfoList = [\n");
    final String internalIndent = indent + "  ";
    for (OTDOA_NeighbourFreqInfo value : getValues()) {
      builder.append(internalIndent)
          .append(value.toIndentedString(internalIndent));
    }
    builder.append(indent).append("];\n");
    return builder.toString();
  }
}
