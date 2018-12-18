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
public  class GANSSRefMeasurementAssist_R10_Ext
    extends Asn1SequenceOf<GANSSRefMeasurement_R10_Ext_Element> {
  //

  private static final Asn1Tag TAG_GANSSRefMeasurementAssist_R10_Ext
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GANSSRefMeasurementAssist_R10_Ext() {
    super();
    setMinSize(1);
setMaxSize(16);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GANSSRefMeasurementAssist_R10_Ext;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GANSSRefMeasurementAssist_R10_Ext != null) {
      return ImmutableList.of(TAG_GANSSRefMeasurementAssist_R10_Ext);
    } else {
      return Asn1SequenceOf.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GANSSRefMeasurementAssist_R10_Ext from encoded stream.
   */
  public static GANSSRefMeasurementAssist_R10_Ext fromPerUnaligned(byte[] encodedBytes) {
    GANSSRefMeasurementAssist_R10_Ext result = new GANSSRefMeasurementAssist_R10_Ext();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GANSSRefMeasurementAssist_R10_Ext from encoded stream.
   */
  public static GANSSRefMeasurementAssist_R10_Ext fromPerAligned(byte[] encodedBytes) {
    GANSSRefMeasurementAssist_R10_Ext result = new GANSSRefMeasurementAssist_R10_Ext();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  
  @Override public GANSSRefMeasurement_R10_Ext_Element createAndAddValue() {
    GANSSRefMeasurement_R10_Ext_Element value = new GANSSRefMeasurement_R10_Ext_Element();
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
    builder.append("GANSSRefMeasurementAssist_R10_Ext = [\n");
    final String internalIndent = indent + "  ";
    for (GANSSRefMeasurement_R10_Ext_Element value : getValues()) {
      builder.append(internalIndent)
          .append(value.toIndentedString(internalIndent));
    }
    builder.append(indent).append("];\n");
    return builder.toString();
  }
}
