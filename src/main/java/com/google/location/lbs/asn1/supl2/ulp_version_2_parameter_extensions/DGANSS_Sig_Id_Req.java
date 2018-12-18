package com.google.location.lbs.asn1.supl2.ulp_version_2_parameter_extensions;

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
public  class DGANSS_Sig_Id_Req extends Asn1BitString {
  //

  // defined bit positions, if any
  

  // setters
  

  // clearers
  


  private static final Asn1Tag TAG_DGANSS_Sig_Id_Req
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public DGANSS_Sig_Id_Req() {
    super();
    setMinSize(8);
setMaxSize(8);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_DGANSS_Sig_Id_Req;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_DGANSS_Sig_Id_Req != null) {
      return ImmutableList.of(TAG_DGANSS_Sig_Id_Req);
    } else {
      return Asn1BitString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new DGANSS_Sig_Id_Req from encoded stream.
   */
  public static DGANSS_Sig_Id_Req fromPerUnaligned(byte[] encodedBytes) {
    DGANSS_Sig_Id_Req result = new DGANSS_Sig_Id_Req();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new DGANSS_Sig_Id_Req from encoded stream.
   */
  public static DGANSS_Sig_Id_Req fromPerAligned(byte[] encodedBytes) {
    DGANSS_Sig_Id_Req result = new DGANSS_Sig_Id_Req();
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
    return "DGANSS_Sig_Id_Req = " + getValue() + ";\n";
  }
}
