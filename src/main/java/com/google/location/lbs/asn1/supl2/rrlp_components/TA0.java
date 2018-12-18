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
 * 
 */
public  class TA0 extends Asn1Integer {
  //

  private static final Asn1Tag TAG_TA0
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public TA0() {
    super();
    setValueRange(new java.math.BigInteger("-2147483648"), new java.math.BigInteger("2147483647"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_TA0;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_TA0 != null) {
      return ImmutableList.of(TAG_TA0);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new TA0 from encoded stream.
   */
  public static TA0 fromPerUnaligned(byte[] encodedBytes) {
    TA0 result = new TA0();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new TA0 from encoded stream.
   */
  public static TA0 fromPerAligned(byte[] encodedBytes) {
    TA0 result = new TA0();
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
    return "TA0 = " + getInteger() + ";\n";
  }
}
