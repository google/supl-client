package com.google.location.lbs.asn1.supl2.rrlp_components;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.google.location.lbs.asn1.base.Asn1Integer;
import com.google.location.lbs.asn1.base.Asn1Null;
import com.google.location.lbs.asn1.base.Asn1Object;
import com.google.location.lbs.asn1.base.Asn1Sequence;
import com.google.location.lbs.asn1.base.Asn1Tag;
import com.google.location.lbs.asn1.base.BitStream;
import com.google.location.lbs.asn1.base.BitStreamReader;
import com.google.location.lbs.asn1.base.SequenceComponent;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
* @author Torbjorn Gannholm (tobe@google.com)
*/
public  class EOTDQuality extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_EOTDQuality
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public EOTDQuality() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_EOTDQuality;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_EOTDQuality != null) {
      return ImmutableList.of(TAG_EOTDQuality);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new EOTDQuality from encoded stream.
   */
  public static EOTDQuality fromPerUnaligned(byte[] encodedBytes) {
    EOTDQuality result = new EOTDQuality();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new EOTDQuality from encoded stream.
   */
  public static EOTDQuality fromPerAligned(byte[] encodedBytes) {
    EOTDQuality result = new EOTDQuality();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }



  @Override protected boolean isExtensible() {
    return false;
  }

  @Override public boolean containsExtensionValues() {
    for (SequenceComponent extensionComponent : getExtensionComponents()) {
      if (extensionComponent.isExplicitlySet()) return true;
    }
    return false;
  }

  
  private EOTDQuality.nbrOfMeasurementsType nbrOfMeasurements_;
  public EOTDQuality.nbrOfMeasurementsType getNbrOfMeasurements() {
    return nbrOfMeasurements_;
  }
  /**
   * @throws ClassCastException if value is not a EOTDQuality.nbrOfMeasurementsType
   */
  public void setNbrOfMeasurements(Asn1Object value) {
    this.nbrOfMeasurements_ = (EOTDQuality.nbrOfMeasurementsType) value;
  }
  public EOTDQuality.nbrOfMeasurementsType setNbrOfMeasurementsToNewInstance() {
    nbrOfMeasurements_ = new EOTDQuality.nbrOfMeasurementsType();
    return nbrOfMeasurements_;
  }
  
  private EOTDQuality.stdOfEOTDType stdOfEOTD_;
  public EOTDQuality.stdOfEOTDType getStdOfEOTD() {
    return stdOfEOTD_;
  }
  /**
   * @throws ClassCastException if value is not a EOTDQuality.stdOfEOTDType
   */
  public void setStdOfEOTD(Asn1Object value) {
    this.stdOfEOTD_ = (EOTDQuality.stdOfEOTDType) value;
  }
  public EOTDQuality.stdOfEOTDType setStdOfEOTDToNewInstance() {
    stdOfEOTD_ = new EOTDQuality.stdOfEOTDType();
    return stdOfEOTD_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getNbrOfMeasurements() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getNbrOfMeasurements();
          }

          @Override public void setToNewInstance() {
            setNbrOfMeasurementsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? EOTDQuality.nbrOfMeasurementsType.getPossibleFirstTags() : ImmutableList.of(tag);
          }

          @Override
          public Asn1Tag getTag() {
            return tag;
          }

          @Override
          public boolean isImplicitTagging() {
            return true;
          }

          @Override public String toIndentedString(String indent) {
                return "nbrOfMeasurements : "
                    + getNbrOfMeasurements().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getStdOfEOTD() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getStdOfEOTD();
          }

          @Override public void setToNewInstance() {
            setStdOfEOTDToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? EOTDQuality.stdOfEOTDType.getPossibleFirstTags() : ImmutableList.of(tag);
          }

          @Override
          public Asn1Tag getTag() {
            return tag;
          }

          @Override
          public boolean isImplicitTagging() {
            return true;
          }

          @Override public String toIndentedString(String indent) {
                return "stdOfEOTD : "
                    + getStdOfEOTD().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      return builder.build();
    }

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * @author Torbjorn Gannholm (tobe@google.com)
 */
public static class nbrOfMeasurementsType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_nbrOfMeasurementsType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public nbrOfMeasurementsType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("7"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_nbrOfMeasurementsType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_nbrOfMeasurementsType != null) {
      return ImmutableList.of(TAG_nbrOfMeasurementsType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new nbrOfMeasurementsType from encoded stream.
   */
  public static nbrOfMeasurementsType fromPerUnaligned(byte[] encodedBytes) {
    nbrOfMeasurementsType result = new nbrOfMeasurementsType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new nbrOfMeasurementsType from encoded stream.
   */
  public static nbrOfMeasurementsType fromPerAligned(byte[] encodedBytes) {
    nbrOfMeasurementsType result = new nbrOfMeasurementsType();
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
    return "nbrOfMeasurementsType = " + getInteger() + ";\n";
  }
}

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * @author Torbjorn Gannholm (tobe@google.com)
 */
public static class stdOfEOTDType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_stdOfEOTDType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public stdOfEOTDType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("31"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_stdOfEOTDType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_stdOfEOTDType != null) {
      return ImmutableList.of(TAG_stdOfEOTDType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new stdOfEOTDType from encoded stream.
   */
  public static stdOfEOTDType fromPerUnaligned(byte[] encodedBytes) {
    stdOfEOTDType result = new stdOfEOTDType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new stdOfEOTDType from encoded stream.
   */
  public static stdOfEOTDType fromPerAligned(byte[] encodedBytes) {
    stdOfEOTDType result = new stdOfEOTDType();
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
    return "stdOfEOTDType = " + getInteger() + ";\n";
  }
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
    builder.append("EOTDQuality = {\n");
    final String internalIndent = indent + "  ";
    for (SequenceComponent component : getComponents()) {
      if (component.isExplicitlySet()) {
        builder.append(internalIndent)
            .append(component.toIndentedString(internalIndent));
      }
    }
    if (isExtensible()) {
      builder.append(internalIndent).append("...\n");
      for (SequenceComponent component : getExtensionComponents()) {
        if (component.isExplicitlySet()) {
          builder.append(internalIndent)
              .append(component.toIndentedString(internalIndent));
        }
      }
    }
    builder.append(indent).append("};\n");
    return builder.toString();
  }
}
