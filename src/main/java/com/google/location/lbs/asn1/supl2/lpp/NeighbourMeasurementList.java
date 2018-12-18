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
public  class NeighbourMeasurementList
    extends Asn1SequenceOf<NeighbourMeasurementElement> {
  //

  private static final Asn1Tag TAG_NeighbourMeasurementList
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public NeighbourMeasurementList() {
    super();
    setMinSize(1);
setMaxSize(24);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_NeighbourMeasurementList;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_NeighbourMeasurementList != null) {
      return ImmutableList.of(TAG_NeighbourMeasurementList);
    } else {
      return Asn1SequenceOf.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new NeighbourMeasurementList from encoded stream.
   */
  public static NeighbourMeasurementList fromPerUnaligned(byte[] encodedBytes) {
    NeighbourMeasurementList result = new NeighbourMeasurementList();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new NeighbourMeasurementList from encoded stream.
   */
  public static NeighbourMeasurementList fromPerAligned(byte[] encodedBytes) {
    NeighbourMeasurementList result = new NeighbourMeasurementList();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  
  @Override public NeighbourMeasurementElement createAndAddValue() {
    NeighbourMeasurementElement value = new NeighbourMeasurementElement();
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
    builder.append("NeighbourMeasurementList = [\n");
    final String internalIndent = indent + "  ";
    for (NeighbourMeasurementElement value : getValues()) {
      builder.append(internalIndent)
          .append(value.toIndentedString(internalIndent));
    }
    builder.append(indent).append("];\n");
    return builder.toString();
  }
}
