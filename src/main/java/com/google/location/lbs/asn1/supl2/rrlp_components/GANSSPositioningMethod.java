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
 * @author Torbjorn Gannholm (tobe@google.com)
 */
public  class GANSSPositioningMethod extends Asn1BitString {
  //

  // defined bit positions, if any
  

  // setters
  

  // clearers
  


  private static final Asn1Tag TAG_GANSSPositioningMethod
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GANSSPositioningMethod() {
    super();
    setMinSize(2);
setMaxSize(16);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GANSSPositioningMethod;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GANSSPositioningMethod != null) {
      return ImmutableList.of(TAG_GANSSPositioningMethod);
    } else {
      return Asn1BitString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GANSSPositioningMethod from encoded stream.
   */
  public static GANSSPositioningMethod fromPerUnaligned(byte[] encodedBytes) {
    GANSSPositioningMethod result = new GANSSPositioningMethod();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GANSSPositioningMethod from encoded stream.
   */
  public static GANSSPositioningMethod fromPerAligned(byte[] encodedBytes) {
    GANSSPositioningMethod result = new GANSSPositioningMethod();
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
    return "GANSSPositioningMethod = " + getValue() + ";\n";
  }
}
