package com.google.location.lbs.asn1.supl2.supl_init;

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
public  class KeyIdentity extends Asn1BitString {
  //

  // defined bit positions, if any
  

  // setters
  

  // clearers
  


  private static final Asn1Tag TAG_KeyIdentity
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public KeyIdentity() {
    super();
    setMinSize(128);
setMaxSize(128);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_KeyIdentity;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_KeyIdentity != null) {
      return ImmutableList.of(TAG_KeyIdentity);
    } else {
      return Asn1BitString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new KeyIdentity from encoded stream.
   */
  public static KeyIdentity fromPerUnaligned(byte[] encodedBytes) {
    KeyIdentity result = new KeyIdentity();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new KeyIdentity from encoded stream.
   */
  public static KeyIdentity fromPerAligned(byte[] encodedBytes) {
    KeyIdentity result = new KeyIdentity();
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
    return "KeyIdentity = " + getValue() + ";\n";
  }
}
