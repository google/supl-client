package com.google.location.lbs.asn1.supl2.lpp_ver12;

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
public  class SequenceNumber extends Asn1Integer {
  //

  private static final Asn1Tag TAG_SequenceNumber
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public SequenceNumber() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("255"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_SequenceNumber;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_SequenceNumber != null) {
      return ImmutableList.of(TAG_SequenceNumber);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new SequenceNumber from encoded stream.
   */
  public static SequenceNumber fromPerUnaligned(byte[] encodedBytes) {
    SequenceNumber result = new SequenceNumber();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new SequenceNumber from encoded stream.
   */
  public static SequenceNumber fromPerAligned(byte[] encodedBytes) {
    SequenceNumber result = new SequenceNumber();
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
    return "SequenceNumber = " + getInteger() + ";\n";
  }
}
