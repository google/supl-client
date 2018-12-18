package com.google.location.lbs.asn1.supl2.supl_report;

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
 * @author Torbjorn Gannholm (tobe@google.com)
 */
public  class GANSSsignalsInfo
    extends Asn1SequenceOf<GANSSSignalsDescription> {
  //

  private static final Asn1Tag TAG_GANSSsignalsInfo
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GANSSsignalsInfo() {
    super();
    setMinSize(1);
setMaxSize(16);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GANSSsignalsInfo;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GANSSsignalsInfo != null) {
      return ImmutableList.of(TAG_GANSSsignalsInfo);
    } else {
      return Asn1SequenceOf.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GANSSsignalsInfo from encoded stream.
   */
  public static GANSSsignalsInfo fromPerUnaligned(byte[] encodedBytes) {
    GANSSsignalsInfo result = new GANSSsignalsInfo();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GANSSsignalsInfo from encoded stream.
   */
  public static GANSSsignalsInfo fromPerAligned(byte[] encodedBytes) {
    GANSSsignalsInfo result = new GANSSsignalsInfo();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  
  @Override public GANSSSignalsDescription createAndAddValue() {
    GANSSSignalsDescription value = new GANSSSignalsDescription();
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
    builder.append("GANSSsignalsInfo = [\n");
    final String internalIndent = indent + "  ";
    for (GANSSSignalsDescription value : getValues()) {
      builder.append(internalIndent)
          .append(value.toIndentedString(internalIndent));
    }
    builder.append(indent).append("];\n");
    return builder.toString();
  }
}
