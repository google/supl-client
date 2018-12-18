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
public  class GNSS_MeasurementList
    extends Asn1SequenceOf<GNSS_MeasurementForOneGNSS> {
  //

  private static final Asn1Tag TAG_GNSS_MeasurementList
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GNSS_MeasurementList() {
    super();
    setMinSize(1);
setMaxSize(16);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GNSS_MeasurementList;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GNSS_MeasurementList != null) {
      return ImmutableList.of(TAG_GNSS_MeasurementList);
    } else {
      return Asn1SequenceOf.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GNSS_MeasurementList from encoded stream.
   */
  public static GNSS_MeasurementList fromPerUnaligned(byte[] encodedBytes) {
    GNSS_MeasurementList result = new GNSS_MeasurementList();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GNSS_MeasurementList from encoded stream.
   */
  public static GNSS_MeasurementList fromPerAligned(byte[] encodedBytes) {
    GNSS_MeasurementList result = new GNSS_MeasurementList();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  
  @Override public GNSS_MeasurementForOneGNSS createAndAddValue() {
    GNSS_MeasurementForOneGNSS value = new GNSS_MeasurementForOneGNSS();
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
    builder.append("GNSS_MeasurementList = [\n");
    final String internalIndent = indent + "  ";
    for (GNSS_MeasurementForOneGNSS value : getValues()) {
      builder.append(internalIndent)
          .append(value.toIndentedString(internalIndent));
    }
    builder.append(indent).append("];\n");
    return builder.toString();
  }
}
