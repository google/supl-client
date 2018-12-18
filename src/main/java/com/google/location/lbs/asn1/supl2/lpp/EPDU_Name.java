package com.google.location.lbs.asn1.supl2.lpp;

/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.google.location.lbs.asn1.base.Asn1Tag;
import com.google.location.lbs.asn1.base.Asn1VisibleString;
import com.google.location.lbs.asn1.base.BitStream;
import com.google.location.lbs.asn1.base.BitStreamReader;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
 * 
 */
public  class EPDU_Name extends Asn1VisibleString {
  //

  private static final Asn1Tag TAG_EPDU_Name
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public EPDU_Name() {
    super();
    setMinSize(1);
setMaxSize(32);

    
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_EPDU_Name;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_EPDU_Name != null) {
      return ImmutableList.of(TAG_EPDU_Name);
    } else {
      return Asn1VisibleString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new EPDU_Name from encoded stream.
   */
  public static EPDU_Name fromPerUnaligned(byte[] encodedBytes) {
    EPDU_Name result = new EPDU_Name();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new EPDU_Name from encoded stream.
   */
  public static EPDU_Name fromPerAligned(byte[] encodedBytes) {
    EPDU_Name result = new EPDU_Name();
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
    return "EPDU_Name = " + getValue() + ";\n";
  }
}
