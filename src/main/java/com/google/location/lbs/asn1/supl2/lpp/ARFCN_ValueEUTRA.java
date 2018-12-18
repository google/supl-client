package com.google.location.lbs.asn1.supl2.lpp;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.google.location.lbs.asn1.base.Asn1Integer;
import com.google.location.lbs.asn1.base.Asn1Tag;
import com.google.location.lbs.asn1.base.BitStream;
import com.google.location.lbs.asn1.base.BitStreamReader;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
 * 
 */
public  class ARFCN_ValueEUTRA extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ARFCN_ValueEUTRA
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ARFCN_ValueEUTRA() {
    super();
    setValueRange(new java.math.BigInteger("0"), maxEARFCN.VALUE);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ARFCN_ValueEUTRA;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ARFCN_ValueEUTRA != null) {
      return ImmutableList.of(TAG_ARFCN_ValueEUTRA);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ARFCN_ValueEUTRA from encoded stream.
   */
  public static ARFCN_ValueEUTRA fromPerUnaligned(byte[] encodedBytes) {
    ARFCN_ValueEUTRA result = new ARFCN_ValueEUTRA();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ARFCN_ValueEUTRA from encoded stream.
   */
  public static ARFCN_ValueEUTRA fromPerAligned(byte[] encodedBytes) {
    ARFCN_ValueEUTRA result = new ARFCN_ValueEUTRA();
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

  @Override public String toString() {
    return toIndentedString("");
  }

  public String toIndentedString(String indent) {
    return "ARFCN_ValueEUTRA = " + getInteger() + ";\n";
  }
}
