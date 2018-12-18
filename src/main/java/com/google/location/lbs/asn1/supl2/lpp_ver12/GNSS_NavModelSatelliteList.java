package com.google.location.lbs.asn1.supl2.lpp_ver12;

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
public  class GNSS_NavModelSatelliteList
    extends Asn1SequenceOf<GNSS_NavModelSatelliteElement> {
  //

  private static final Asn1Tag TAG_GNSS_NavModelSatelliteList
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GNSS_NavModelSatelliteList() {
    super();
    setMinSize(1);
setMaxSize(64);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GNSS_NavModelSatelliteList;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GNSS_NavModelSatelliteList != null) {
      return ImmutableList.of(TAG_GNSS_NavModelSatelliteList);
    } else {
      return Asn1SequenceOf.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GNSS_NavModelSatelliteList from encoded stream.
   */
  public static GNSS_NavModelSatelliteList fromPerUnaligned(byte[] encodedBytes) {
    GNSS_NavModelSatelliteList result = new GNSS_NavModelSatelliteList();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GNSS_NavModelSatelliteList from encoded stream.
   */
  public static GNSS_NavModelSatelliteList fromPerAligned(byte[] encodedBytes) {
    GNSS_NavModelSatelliteList result = new GNSS_NavModelSatelliteList();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  
  @Override public GNSS_NavModelSatelliteElement createAndAddValue() {
    GNSS_NavModelSatelliteElement value = new GNSS_NavModelSatelliteElement();
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
    builder.append("GNSS_NavModelSatelliteList = [\n");
    final String internalIndent = indent + "  ";
    for (GNSS_NavModelSatelliteElement value : getValues()) {
      builder.append(internalIndent)
          .append(value.toIndentedString(internalIndent));
    }
    builder.append(indent).append("];\n");
    return builder.toString();
  }
}
