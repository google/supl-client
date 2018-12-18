package com.google.location.lbs.asn1.supl2.ver2_ulp_components;

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
public  class MNC
    extends Asn1SequenceOf<MCC_MNC_Digit> {
  //

  private static final Asn1Tag TAG_MNC
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public MNC() {
    super();
    setMinSize(2);
setMaxSize(3);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_MNC;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_MNC != null) {
      return ImmutableList.of(TAG_MNC);
    } else {
      return Asn1SequenceOf.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new MNC from encoded stream.
   */
  public static MNC fromPerUnaligned(byte[] encodedBytes) {
    MNC result = new MNC();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new MNC from encoded stream.
   */
  public static MNC fromPerAligned(byte[] encodedBytes) {
    MNC result = new MNC();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  
  @Override public MCC_MNC_Digit createAndAddValue() {
    MCC_MNC_Digit value = new MCC_MNC_Digit();
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
    builder.append("MNC = [\n");
    final String internalIndent = indent + "  ";
    for (MCC_MNC_Digit value : getValues()) {
      builder.append(internalIndent)
          .append(value.toIndentedString(internalIndent));
    }
    builder.append(indent).append("];\n");
    return builder.toString();
  }
}
