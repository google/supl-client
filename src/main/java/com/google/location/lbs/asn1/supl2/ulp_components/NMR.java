package com.google.location.lbs.asn1.supl2.ulp_components;

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
public  class NMR
    extends Asn1SequenceOf<NMRelement> {
  //

  private static final Asn1Tag TAG_NMR
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public NMR() {
    super();
    setMinSize(1);
setMaxSize(15);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_NMR;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_NMR != null) {
      return ImmutableList.of(TAG_NMR);
    } else {
      return Asn1SequenceOf.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new NMR from encoded stream.
   */
  public static NMR fromPerUnaligned(byte[] encodedBytes) {
    NMR result = new NMR();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new NMR from encoded stream.
   */
  public static NMR fromPerAligned(byte[] encodedBytes) {
    NMR result = new NMR();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  
  @Override public NMRelement createAndAddValue() {
    NMRelement value = new NMRelement();
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
    builder.append("NMR = [\n");
    final String internalIndent = indent + "  ";
    for (NMRelement value : getValues()) {
      builder.append(internalIndent)
          .append(value.toIndentedString(internalIndent));
    }
    builder.append(indent).append("];\n");
    return builder.toString();
  }
}
