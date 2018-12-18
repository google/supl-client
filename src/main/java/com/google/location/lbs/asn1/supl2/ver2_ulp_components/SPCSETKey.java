package com.google.location.lbs.asn1.supl2.ver2_ulp_components;

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
 * @author Torbjorn Gannholm (tobe@google.com)
 */
public  class SPCSETKey extends Asn1BitString {
  //

  // defined bit positions, if any
  

  // setters
  

  // clearers
  


  private static final Asn1Tag TAG_SPCSETKey
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public SPCSETKey() {
    super();
    setMinSize(128);
setMaxSize(128);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_SPCSETKey;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_SPCSETKey != null) {
      return ImmutableList.of(TAG_SPCSETKey);
    } else {
      return Asn1BitString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new SPCSETKey from encoded stream.
   */
  public static SPCSETKey fromPerUnaligned(byte[] encodedBytes) {
    SPCSETKey result = new SPCSETKey();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new SPCSETKey from encoded stream.
   */
  public static SPCSETKey fromPerAligned(byte[] encodedBytes) {
    SPCSETKey result = new SPCSETKey();
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
    return "SPCSETKey = " + getValue() + ";\n";
  }
}
