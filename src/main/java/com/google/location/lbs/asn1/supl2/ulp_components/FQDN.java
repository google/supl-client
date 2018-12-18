package com.google.location.lbs.asn1.supl2.ulp_components;

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
 * @author Lifu Tang (lifu@google.com)
 */
public  class FQDN extends Asn1VisibleString {
  //

  private static final Asn1Tag TAG_FQDN
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public FQDN() {
    super();
    setMinSize(1);
setMaxSize(255);

    setAlphabet("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789.-");

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_FQDN;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_FQDN != null) {
      return ImmutableList.of(TAG_FQDN);
    } else {
      return Asn1VisibleString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new FQDN from encoded stream.
   */
  public static FQDN fromPerUnaligned(byte[] encodedBytes) {
    FQDN result = new FQDN();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new FQDN from encoded stream.
   */
  public static FQDN fromPerAligned(byte[] encodedBytes) {
    FQDN result = new FQDN();
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
    return "FQDN = " + getValue() + ";\n";
  }
}
