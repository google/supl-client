package com.google.location.lbs.asn1.supl2.rrlp_components;

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
public  class SeqOfGPSRefOrbit
    extends Asn1SequenceOf<GPSReferenceOrbit> {
  //

  private static final Asn1Tag TAG_SeqOfGPSRefOrbit
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public SeqOfGPSRefOrbit() {
    super();
    setMinSize(1);
setMaxSize(32);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_SeqOfGPSRefOrbit;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_SeqOfGPSRefOrbit != null) {
      return ImmutableList.of(TAG_SeqOfGPSRefOrbit);
    } else {
      return Asn1SequenceOf.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new SeqOfGPSRefOrbit from encoded stream.
   */
  public static SeqOfGPSRefOrbit fromPerUnaligned(byte[] encodedBytes) {
    SeqOfGPSRefOrbit result = new SeqOfGPSRefOrbit();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new SeqOfGPSRefOrbit from encoded stream.
   */
  public static SeqOfGPSRefOrbit fromPerAligned(byte[] encodedBytes) {
    SeqOfGPSRefOrbit result = new SeqOfGPSRefOrbit();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  
  @Override public GPSReferenceOrbit createAndAddValue() {
    GPSReferenceOrbit value = new GPSReferenceOrbit();
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
    builder.append("SeqOfGPSRefOrbit = [\n");
    final String internalIndent = indent + "  ";
    for (GPSReferenceOrbit value : getValues()) {
      builder.append(internalIndent)
          .append(value.toIndentedString(internalIndent));
    }
    builder.append(indent).append("];\n");
    return builder.toString();
  }
}
