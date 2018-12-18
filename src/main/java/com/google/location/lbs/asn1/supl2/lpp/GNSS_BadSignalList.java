package com.google.location.lbs.asn1.supl2.lpp;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.google.location.lbs.asn1.base.Asn1Null;
import com.google.location.lbs.asn1.base.Asn1SequenceOf;
import com.google.location.lbs.asn1.base.Asn1Tag;
import com.google.location.lbs.asn1.base.BitStream;
import com.google.location.lbs.asn1.base.BitStreamReader;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
 * 
 */
public  class GNSS_BadSignalList
    extends Asn1SequenceOf<BadSignalElement> {
  //

  private static final Asn1Tag TAG_GNSS_BadSignalList
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GNSS_BadSignalList() {
    super();
    setMinSize(1);
setMaxSize(64);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GNSS_BadSignalList;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GNSS_BadSignalList != null) {
      return ImmutableList.of(TAG_GNSS_BadSignalList);
    } else {
      return Asn1SequenceOf.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GNSS_BadSignalList from encoded stream.
   */
  public static GNSS_BadSignalList fromPerUnaligned(byte[] encodedBytes) {
    GNSS_BadSignalList result = new GNSS_BadSignalList();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GNSS_BadSignalList from encoded stream.
   */
  public static GNSS_BadSignalList fromPerAligned(byte[] encodedBytes) {
    GNSS_BadSignalList result = new GNSS_BadSignalList();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  
  @Override public BadSignalElement createAndAddValue() {
    BadSignalElement value = new BadSignalElement();
    add(value);
    return value;
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
    StringBuilder builder = new StringBuilder();
    builder.append("GNSS_BadSignalList = [\n");
    final String internalIndent = indent + "  ";
    for (BadSignalElement value : getValues()) {
      builder.append(internalIndent)
          .append(value.toIndentedString(internalIndent));
    }
    builder.append(indent).append("];\n");
    return builder.toString();
  }
}
