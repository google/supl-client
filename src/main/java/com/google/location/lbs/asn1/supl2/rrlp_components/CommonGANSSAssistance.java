package com.google.location.lbs.asn1.supl2.rrlp_components;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.google.location.lbs.asn1.base.Asn1BitString;
import com.google.location.lbs.asn1.base.Asn1Tag;
import com.google.location.lbs.asn1.base.BitStream;
import com.google.location.lbs.asn1.base.BitStreamReader;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
 * 
 */
public  class CommonGANSSAssistance extends Asn1BitString {
  //

  // defined bit positions, if any
  

  // setters
  

  // clearers
  


  private static final Asn1Tag TAG_CommonGANSSAssistance
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public CommonGANSSAssistance() {
    super();
    setMinSize(1);
setMaxSize(8);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_CommonGANSSAssistance;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_CommonGANSSAssistance != null) {
      return ImmutableList.of(TAG_CommonGANSSAssistance);
    } else {
      return Asn1BitString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new CommonGANSSAssistance from encoded stream.
   */
  public static CommonGANSSAssistance fromPerUnaligned(byte[] encodedBytes) {
    CommonGANSSAssistance result = new CommonGANSSAssistance();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new CommonGANSSAssistance from encoded stream.
   */
  public static CommonGANSSAssistance fromPerAligned(byte[] encodedBytes) {
    CommonGANSSAssistance result = new CommonGANSSAssistance();
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
    return "CommonGANSSAssistance = " + getValue() + ";\n";
  }
}
