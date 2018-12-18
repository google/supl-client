package com.google.location.lbs.asn1.supl2.rrlp_components;

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
 * @author Torbjorn Gannholm (tobe@google.com)
 */
public  class FineRTD extends Asn1Integer {
  //

  private static final Asn1Tag TAG_FineRTD
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public FineRTD() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("255"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_FineRTD;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_FineRTD != null) {
      return ImmutableList.of(TAG_FineRTD);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new FineRTD from encoded stream.
   */
  public static FineRTD fromPerUnaligned(byte[] encodedBytes) {
    FineRTD result = new FineRTD();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new FineRTD from encoded stream.
   */
  public static FineRTD fromPerAligned(byte[] encodedBytes) {
    FineRTD result = new FineRTD();
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
    return "FineRTD = " + getInteger() + ";\n";
  }
}
