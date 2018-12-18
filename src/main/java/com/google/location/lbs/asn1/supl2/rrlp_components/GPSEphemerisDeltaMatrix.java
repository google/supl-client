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
public  class GPSEphemerisDeltaMatrix
    extends Asn1SequenceOf<GPSEphemerisDeltaEpoch> {
  //

  private static final Asn1Tag TAG_GPSEphemerisDeltaMatrix
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GPSEphemerisDeltaMatrix() {
    super();
    setMinSize(1);
setMaxSize(128);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GPSEphemerisDeltaMatrix;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GPSEphemerisDeltaMatrix != null) {
      return ImmutableList.of(TAG_GPSEphemerisDeltaMatrix);
    } else {
      return Asn1SequenceOf.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GPSEphemerisDeltaMatrix from encoded stream.
   */
  public static GPSEphemerisDeltaMatrix fromPerUnaligned(byte[] encodedBytes) {
    GPSEphemerisDeltaMatrix result = new GPSEphemerisDeltaMatrix();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GPSEphemerisDeltaMatrix from encoded stream.
   */
  public static GPSEphemerisDeltaMatrix fromPerAligned(byte[] encodedBytes) {
    GPSEphemerisDeltaMatrix result = new GPSEphemerisDeltaMatrix();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  
  @Override public GPSEphemerisDeltaEpoch createAndAddValue() {
    GPSEphemerisDeltaEpoch value = new GPSEphemerisDeltaEpoch();
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
    builder.append("GPSEphemerisDeltaMatrix = [\n");
    final String internalIndent = indent + "  ";
    for (GPSEphemerisDeltaEpoch value : getValues()) {
      builder.append(internalIndent)
          .append(value.toIndentedString(internalIndent));
    }
    builder.append(indent).append("];\n");
    return builder.toString();
  }
}
