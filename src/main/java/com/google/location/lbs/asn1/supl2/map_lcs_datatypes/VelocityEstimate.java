package com.google.location.lbs.asn1.supl2.map_lcs_datatypes;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.google.location.lbs.asn1.base.Asn1OctetString;
import com.google.location.lbs.asn1.base.Asn1Tag;
import com.google.location.lbs.asn1.base.BitStream;
import com.google.location.lbs.asn1.base.BitStreamReader;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
 * 
 */
public  class VelocityEstimate extends Asn1OctetString {
  //

  private static final Asn1Tag TAG_VelocityEstimate
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public VelocityEstimate() {
    super();
    setMinSize(4);
setMaxSize(7);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_VelocityEstimate;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_VelocityEstimate != null) {
      return ImmutableList.of(TAG_VelocityEstimate);
    } else {
      return Asn1OctetString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new VelocityEstimate from encoded stream.
   */
  public static VelocityEstimate fromPerUnaligned(byte[] encodedBytes) {
    VelocityEstimate result = new VelocityEstimate();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new VelocityEstimate from encoded stream.
   */
  public static VelocityEstimate fromPerAligned(byte[] encodedBytes) {
    VelocityEstimate result = new VelocityEstimate();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
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

  @Override protected String getTypeName() {
    return "VelocityEstimate";
  }
}
