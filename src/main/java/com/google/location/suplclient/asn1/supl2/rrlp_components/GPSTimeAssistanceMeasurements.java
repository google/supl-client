// Copyright 2018 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.location.suplclient.asn1.supl2.rrlp_components;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.google.location.suplclient.asn1.base.Asn1Integer;
import com.google.location.suplclient.asn1.base.Asn1Object;
import com.google.location.suplclient.asn1.base.Asn1Sequence;
import com.google.location.suplclient.asn1.base.Asn1Tag;
import com.google.location.suplclient.asn1.base.BitStream;
import com.google.location.suplclient.asn1.base.BitStreamReader;
import com.google.location.suplclient.asn1.base.SequenceComponent;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
* 
*/
public  class GPSTimeAssistanceMeasurements extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GPSTimeAssistanceMeasurements
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GPSTimeAssistanceMeasurements() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GPSTimeAssistanceMeasurements;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GPSTimeAssistanceMeasurements != null) {
      return ImmutableList.of(TAG_GPSTimeAssistanceMeasurements);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GPSTimeAssistanceMeasurements from encoded stream.
   */
  public static GPSTimeAssistanceMeasurements fromPerUnaligned(byte[] encodedBytes) {
    GPSTimeAssistanceMeasurements result = new GPSTimeAssistanceMeasurements();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GPSTimeAssistanceMeasurements from encoded stream.
   */
  public static GPSTimeAssistanceMeasurements fromPerAligned(byte[] encodedBytes) {
    GPSTimeAssistanceMeasurements result = new GPSTimeAssistanceMeasurements();
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

  
  private GPSTimeAssistanceMeasurements.referenceFrameMSBType referenceFrameMSB_;
  public GPSTimeAssistanceMeasurements.referenceFrameMSBType getReferenceFrameMSB() {
    return referenceFrameMSB_;
  }
  /**
   * @throws ClassCastException if value is not a GPSTimeAssistanceMeasurements.referenceFrameMSBType
   */
  public void setReferenceFrameMSB(Asn1Object value) {
    this.referenceFrameMSB_ = (GPSTimeAssistanceMeasurements.referenceFrameMSBType) value;
  }
  public GPSTimeAssistanceMeasurements.referenceFrameMSBType setReferenceFrameMSBToNewInstance() {
    referenceFrameMSB_ = new GPSTimeAssistanceMeasurements.referenceFrameMSBType();
    return referenceFrameMSB_;
  }
  
  private GPSTimeAssistanceMeasurements.gpsTowSubmsType gpsTowSubms_;
  public GPSTimeAssistanceMeasurements.gpsTowSubmsType getGpsTowSubms() {
    return gpsTowSubms_;
  }
  /**
   * @throws ClassCastException if value is not a GPSTimeAssistanceMeasurements.gpsTowSubmsType
   */
  public void setGpsTowSubms(Asn1Object value) {
    this.gpsTowSubms_ = (GPSTimeAssistanceMeasurements.gpsTowSubmsType) value;
  }
  public GPSTimeAssistanceMeasurements.gpsTowSubmsType setGpsTowSubmsToNewInstance() {
    gpsTowSubms_ = new GPSTimeAssistanceMeasurements.gpsTowSubmsType();
    return gpsTowSubms_;
  }
  
  private GPSTimeAssistanceMeasurements.deltaTowType deltaTow_;
  public GPSTimeAssistanceMeasurements.deltaTowType getDeltaTow() {
    return deltaTow_;
  }
  /**
   * @throws ClassCastException if value is not a GPSTimeAssistanceMeasurements.deltaTowType
   */
  public void setDeltaTow(Asn1Object value) {
    this.deltaTow_ = (GPSTimeAssistanceMeasurements.deltaTowType) value;
  }
  public GPSTimeAssistanceMeasurements.deltaTowType setDeltaTowToNewInstance() {
    deltaTow_ = new GPSTimeAssistanceMeasurements.deltaTowType();
    return deltaTow_;
  }
  
  private GPSReferenceTimeUncertainty gpsReferenceTimeUncertainty_;
  public GPSReferenceTimeUncertainty getGpsReferenceTimeUncertainty() {
    return gpsReferenceTimeUncertainty_;
  }
  /**
   * @throws ClassCastException if value is not a GPSReferenceTimeUncertainty
   */
  public void setGpsReferenceTimeUncertainty(Asn1Object value) {
    this.gpsReferenceTimeUncertainty_ = (GPSReferenceTimeUncertainty) value;
  }
  public GPSReferenceTimeUncertainty setGpsReferenceTimeUncertaintyToNewInstance() {
    gpsReferenceTimeUncertainty_ = new GPSReferenceTimeUncertainty();
    return gpsReferenceTimeUncertainty_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getReferenceFrameMSB() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getReferenceFrameMSB();
          }

          @Override public void setToNewInstance() {
            setReferenceFrameMSBToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GPSTimeAssistanceMeasurements.referenceFrameMSBType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "referenceFrameMSB : "
                    + getReferenceFrameMSB().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getGpsTowSubms() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGpsTowSubms();
          }

          @Override public void setToNewInstance() {
            setGpsTowSubmsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GPSTimeAssistanceMeasurements.gpsTowSubmsType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gpsTowSubms : "
                    + getGpsTowSubms().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getDeltaTow() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getDeltaTow();
          }

          @Override public void setToNewInstance() {
            setDeltaTowToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GPSTimeAssistanceMeasurements.deltaTowType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "deltaTow : "
                    + getDeltaTow().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getGpsReferenceTimeUncertainty() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGpsReferenceTimeUncertainty();
          }

          @Override public void setToNewInstance() {
            setGpsReferenceTimeUncertaintyToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GPSReferenceTimeUncertainty.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gpsReferenceTimeUncertainty : "
                    + getGpsReferenceTimeUncertainty().toIndentedString(indent);
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
 * 
 */
public static class referenceFrameMSBType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_referenceFrameMSBType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public referenceFrameMSBType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("63"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_referenceFrameMSBType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_referenceFrameMSBType != null) {
      return ImmutableList.of(TAG_referenceFrameMSBType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new referenceFrameMSBType from encoded stream.
   */
  public static referenceFrameMSBType fromPerUnaligned(byte[] encodedBytes) {
    referenceFrameMSBType result = new referenceFrameMSBType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new referenceFrameMSBType from encoded stream.
   */
  public static referenceFrameMSBType fromPerAligned(byte[] encodedBytes) {
    referenceFrameMSBType result = new referenceFrameMSBType();
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
    return "referenceFrameMSBType = " + getInteger() + ";\n";
  }
}

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class gpsTowSubmsType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_gpsTowSubmsType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gpsTowSubmsType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("9999"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gpsTowSubmsType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gpsTowSubmsType != null) {
      return ImmutableList.of(TAG_gpsTowSubmsType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gpsTowSubmsType from encoded stream.
   */
  public static gpsTowSubmsType fromPerUnaligned(byte[] encodedBytes) {
    gpsTowSubmsType result = new gpsTowSubmsType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gpsTowSubmsType from encoded stream.
   */
  public static gpsTowSubmsType fromPerAligned(byte[] encodedBytes) {
    gpsTowSubmsType result = new gpsTowSubmsType();
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
    return "gpsTowSubmsType = " + getInteger() + ";\n";
  }
}

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class deltaTowType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_deltaTowType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public deltaTowType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("127"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_deltaTowType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_deltaTowType != null) {
      return ImmutableList.of(TAG_deltaTowType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new deltaTowType from encoded stream.
   */
  public static deltaTowType fromPerUnaligned(byte[] encodedBytes) {
    deltaTowType result = new deltaTowType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new deltaTowType from encoded stream.
   */
  public static deltaTowType fromPerAligned(byte[] encodedBytes) {
    deltaTowType result = new deltaTowType();
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
    return "deltaTowType = " + getInteger() + ";\n";
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
    builder.append("GPSTimeAssistanceMeasurements = {\n");
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
