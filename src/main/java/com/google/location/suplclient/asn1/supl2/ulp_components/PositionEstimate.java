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

package com.google.location.suplclient.asn1.supl2.ulp_components;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.google.location.suplclient.asn1.base.Asn1Enumerated;
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
public  class PositionEstimate extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_PositionEstimate
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public PositionEstimate() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_PositionEstimate;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_PositionEstimate != null) {
      return ImmutableList.of(TAG_PositionEstimate);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new PositionEstimate from encoded stream.
   */
  public static PositionEstimate fromPerUnaligned(byte[] encodedBytes) {
    PositionEstimate result = new PositionEstimate();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new PositionEstimate from encoded stream.
   */
  public static PositionEstimate fromPerAligned(byte[] encodedBytes) {
    PositionEstimate result = new PositionEstimate();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }



  @Override protected boolean isExtensible() {
    return true;
  }

  @Override public boolean containsExtensionValues() {
    for (SequenceComponent extensionComponent : getExtensionComponents()) {
      if (extensionComponent.isExplicitlySet()) return true;
    }
    return false;
  }

  
  private PositionEstimate.latitudeSignType latitudeSign_;
  public PositionEstimate.latitudeSignType getLatitudeSign() {
    return latitudeSign_;
  }
  /**
   * @throws ClassCastException if value is not a PositionEstimate.latitudeSignType
   */
  public void setLatitudeSign(Asn1Object value) {
    this.latitudeSign_ = (PositionEstimate.latitudeSignType) value;
  }
  public PositionEstimate.latitudeSignType setLatitudeSignToNewInstance() {
    latitudeSign_ = new PositionEstimate.latitudeSignType();
    return latitudeSign_;
  }
  
  private PositionEstimate.latitudeType latitude_;
  public PositionEstimate.latitudeType getLatitude() {
    return latitude_;
  }
  /**
   * @throws ClassCastException if value is not a PositionEstimate.latitudeType
   */
  public void setLatitude(Asn1Object value) {
    this.latitude_ = (PositionEstimate.latitudeType) value;
  }
  public PositionEstimate.latitudeType setLatitudeToNewInstance() {
    latitude_ = new PositionEstimate.latitudeType();
    return latitude_;
  }
  
  private PositionEstimate.longitudeType longitude_;
  public PositionEstimate.longitudeType getLongitude() {
    return longitude_;
  }
  /**
   * @throws ClassCastException if value is not a PositionEstimate.longitudeType
   */
  public void setLongitude(Asn1Object value) {
    this.longitude_ = (PositionEstimate.longitudeType) value;
  }
  public PositionEstimate.longitudeType setLongitudeToNewInstance() {
    longitude_ = new PositionEstimate.longitudeType();
    return longitude_;
  }
  
  private PositionEstimate.uncertaintyType uncertainty_;
  public PositionEstimate.uncertaintyType getUncertainty() {
    return uncertainty_;
  }
  /**
   * @throws ClassCastException if value is not a PositionEstimate.uncertaintyType
   */
  public void setUncertainty(Asn1Object value) {
    this.uncertainty_ = (PositionEstimate.uncertaintyType) value;
  }
  public PositionEstimate.uncertaintyType setUncertaintyToNewInstance() {
    uncertainty_ = new PositionEstimate.uncertaintyType();
    return uncertainty_;
  }
  
  private PositionEstimate.confidenceType confidence_;
  public PositionEstimate.confidenceType getConfidence() {
    return confidence_;
  }
  /**
   * @throws ClassCastException if value is not a PositionEstimate.confidenceType
   */
  public void setConfidence(Asn1Object value) {
    this.confidence_ = (PositionEstimate.confidenceType) value;
  }
  public PositionEstimate.confidenceType setConfidenceToNewInstance() {
    confidence_ = new PositionEstimate.confidenceType();
    return confidence_;
  }
  
  private AltitudeInfo altitudeInfo_;
  public AltitudeInfo getAltitudeInfo() {
    return altitudeInfo_;
  }
  /**
   * @throws ClassCastException if value is not a AltitudeInfo
   */
  public void setAltitudeInfo(Asn1Object value) {
    this.altitudeInfo_ = (AltitudeInfo) value;
  }
  public AltitudeInfo setAltitudeInfoToNewInstance() {
    altitudeInfo_ = new AltitudeInfo();
    return altitudeInfo_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getLatitudeSign() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getLatitudeSign();
          }

          @Override public void setToNewInstance() {
            setLatitudeSignToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? PositionEstimate.latitudeSignType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "latitudeSign : "
                    + getLatitudeSign().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getLatitude() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getLatitude();
          }

          @Override public void setToNewInstance() {
            setLatitudeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? PositionEstimate.latitudeType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "latitude : "
                    + getLatitude().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getLongitude() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getLongitude();
          }

          @Override public void setToNewInstance() {
            setLongitudeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? PositionEstimate.longitudeType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "longitude : "
                    + getLongitude().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getUncertainty() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getUncertainty();
          }

          @Override public void setToNewInstance() {
            setUncertaintyToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? PositionEstimate.uncertaintyType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "uncertainty : "
                    + getUncertainty().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getConfidence() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getConfidence();
          }

          @Override public void setToNewInstance() {
            setConfidenceToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? PositionEstimate.confidenceType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "confidence : "
                    + getConfidence().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getAltitudeInfo() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getAltitudeInfo();
          }

          @Override public void setToNewInstance() {
            setAltitudeInfoToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? AltitudeInfo.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "altitudeInfo : "
                    + getAltitudeInfo().toIndentedString(indent);
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
 * AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class latitudeSignType extends Asn1Enumerated {
  public enum Value implements Asn1Enumerated.Value {
    north(0),
    south(1),
    ;

    Value(int i) {
      value = i;
    }

    private int value;
    public int getAssignedValue() {
      return value;
    }

    @Override public boolean isExtensionValue() {
      return false;
    }
  }

  @Override
  protected Value getDefaultValue() {
    return null
;
  }

  @SuppressWarnings("unchecked")
  public Value enumValue() {
    return (Value) getValue();
  }


  
  public void setTo_north() {
    setValue(Value.north);
  }
  
  public void setTo_south() {
    setValue(Value.south);
  }
  


  public enum ExtensionValue implements Asn1Enumerated.Value {
    ;

    ExtensionValue(int i) {
      value = i;
    }

    private int value;
    @Override public int getAssignedValue() {
      return value;
    }

    @Override public boolean isExtensionValue() {
      return true;
    }
  }

  @SuppressWarnings("unchecked")
  public ExtensionValue extEnumValue() {
    return (ExtensionValue) getValue();
  }

  

  

  private static final Asn1Tag TAG_latitudeSignType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public latitudeSignType() {
    super();
    // use template substitution instead of calling getDefaultValue(), since
    // calling virtual methods from a ctor is frowned upon here.
    setValue(null
);
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_latitudeSignType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_latitudeSignType != null) {
      return ImmutableList.of(TAG_latitudeSignType);
    } else {
      return Asn1Enumerated.getPossibleFirstTags();
    }
  }

  @Override protected boolean isExtensible() {
    return false;
  }

  @Override protected Asn1Enumerated.Value lookupValue(int ordinal) {
    return Value.values()[ordinal];
  }

  @Override protected Asn1Enumerated.Value lookupExtensionValue(int ordinal) {
    return ExtensionValue.values()[ordinal];
  }

  @Override protected int getValueCount() {
    return Value.values().length;
  }

  /**
   * Creates a new latitudeSignType from encoded stream.
   */
  public static latitudeSignType fromPerUnaligned(byte[] encodedBytes) {
    latitudeSignType result = new latitudeSignType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new latitudeSignType from encoded stream.
   */
  public static latitudeSignType fromPerAligned(byte[] encodedBytes) {
    latitudeSignType result = new latitudeSignType();
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
    return "latitudeSignType = " + getValue() + ";\n";
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
public static class latitudeType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_latitudeType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public latitudeType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("8388607"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_latitudeType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_latitudeType != null) {
      return ImmutableList.of(TAG_latitudeType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new latitudeType from encoded stream.
   */
  public static latitudeType fromPerUnaligned(byte[] encodedBytes) {
    latitudeType result = new latitudeType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new latitudeType from encoded stream.
   */
  public static latitudeType fromPerAligned(byte[] encodedBytes) {
    latitudeType result = new latitudeType();
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
    return "latitudeType = " + getInteger() + ";\n";
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
public static class longitudeType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_longitudeType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public longitudeType() {
    super();
    setValueRange(new java.math.BigInteger("-8388608"), new java.math.BigInteger("8388607"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_longitudeType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_longitudeType != null) {
      return ImmutableList.of(TAG_longitudeType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new longitudeType from encoded stream.
   */
  public static longitudeType fromPerUnaligned(byte[] encodedBytes) {
    longitudeType result = new longitudeType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new longitudeType from encoded stream.
   */
  public static longitudeType fromPerAligned(byte[] encodedBytes) {
    longitudeType result = new longitudeType();
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
    return "longitudeType = " + getInteger() + ";\n";
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
public static class uncertaintyType extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_uncertaintyType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public uncertaintyType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_uncertaintyType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_uncertaintyType != null) {
      return ImmutableList.of(TAG_uncertaintyType);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new uncertaintyType from encoded stream.
   */
  public static uncertaintyType fromPerUnaligned(byte[] encodedBytes) {
    uncertaintyType result = new uncertaintyType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new uncertaintyType from encoded stream.
   */
  public static uncertaintyType fromPerAligned(byte[] encodedBytes) {
    uncertaintyType result = new uncertaintyType();
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

  
  private uncertaintyType.uncertaintySemiMajorType uncertaintySemiMajor_;
  public uncertaintyType.uncertaintySemiMajorType getUncertaintySemiMajor() {
    return uncertaintySemiMajor_;
  }
  /**
   * @throws ClassCastException if value is not a uncertaintyType.uncertaintySemiMajorType
   */
  public void setUncertaintySemiMajor(Asn1Object value) {
    this.uncertaintySemiMajor_ = (uncertaintyType.uncertaintySemiMajorType) value;
  }
  public uncertaintyType.uncertaintySemiMajorType setUncertaintySemiMajorToNewInstance() {
    uncertaintySemiMajor_ = new uncertaintyType.uncertaintySemiMajorType();
    return uncertaintySemiMajor_;
  }
  
  private uncertaintyType.uncertaintySemiMinorType uncertaintySemiMinor_;
  public uncertaintyType.uncertaintySemiMinorType getUncertaintySemiMinor() {
    return uncertaintySemiMinor_;
  }
  /**
   * @throws ClassCastException if value is not a uncertaintyType.uncertaintySemiMinorType
   */
  public void setUncertaintySemiMinor(Asn1Object value) {
    this.uncertaintySemiMinor_ = (uncertaintyType.uncertaintySemiMinorType) value;
  }
  public uncertaintyType.uncertaintySemiMinorType setUncertaintySemiMinorToNewInstance() {
    uncertaintySemiMinor_ = new uncertaintyType.uncertaintySemiMinorType();
    return uncertaintySemiMinor_;
  }
  
  private uncertaintyType.orientationMajorAxisType orientationMajorAxis_;
  public uncertaintyType.orientationMajorAxisType getOrientationMajorAxis() {
    return orientationMajorAxis_;
  }
  /**
   * @throws ClassCastException if value is not a uncertaintyType.orientationMajorAxisType
   */
  public void setOrientationMajorAxis(Asn1Object value) {
    this.orientationMajorAxis_ = (uncertaintyType.orientationMajorAxisType) value;
  }
  public uncertaintyType.orientationMajorAxisType setOrientationMajorAxisToNewInstance() {
    orientationMajorAxis_ = new uncertaintyType.orientationMajorAxisType();
    return orientationMajorAxis_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getUncertaintySemiMajor() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getUncertaintySemiMajor();
          }

          @Override public void setToNewInstance() {
            setUncertaintySemiMajorToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? uncertaintyType.uncertaintySemiMajorType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "uncertaintySemiMajor : "
                    + getUncertaintySemiMajor().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getUncertaintySemiMinor() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getUncertaintySemiMinor();
          }

          @Override public void setToNewInstance() {
            setUncertaintySemiMinorToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? uncertaintyType.uncertaintySemiMinorType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "uncertaintySemiMinor : "
                    + getUncertaintySemiMinor().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getOrientationMajorAxis() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getOrientationMajorAxis();
          }

          @Override public void setToNewInstance() {
            setOrientationMajorAxisToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? uncertaintyType.orientationMajorAxisType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "orientationMajorAxis : "
                    + getOrientationMajorAxis().toIndentedString(indent);
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
public static class uncertaintySemiMajorType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_uncertaintySemiMajorType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public uncertaintySemiMajorType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("127"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_uncertaintySemiMajorType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_uncertaintySemiMajorType != null) {
      return ImmutableList.of(TAG_uncertaintySemiMajorType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new uncertaintySemiMajorType from encoded stream.
   */
  public static uncertaintySemiMajorType fromPerUnaligned(byte[] encodedBytes) {
    uncertaintySemiMajorType result = new uncertaintySemiMajorType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new uncertaintySemiMajorType from encoded stream.
   */
  public static uncertaintySemiMajorType fromPerAligned(byte[] encodedBytes) {
    uncertaintySemiMajorType result = new uncertaintySemiMajorType();
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
    return "uncertaintySemiMajorType = " + getInteger() + ";\n";
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
public static class uncertaintySemiMinorType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_uncertaintySemiMinorType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public uncertaintySemiMinorType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("127"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_uncertaintySemiMinorType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_uncertaintySemiMinorType != null) {
      return ImmutableList.of(TAG_uncertaintySemiMinorType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new uncertaintySemiMinorType from encoded stream.
   */
  public static uncertaintySemiMinorType fromPerUnaligned(byte[] encodedBytes) {
    uncertaintySemiMinorType result = new uncertaintySemiMinorType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new uncertaintySemiMinorType from encoded stream.
   */
  public static uncertaintySemiMinorType fromPerAligned(byte[] encodedBytes) {
    uncertaintySemiMinorType result = new uncertaintySemiMinorType();
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
    return "uncertaintySemiMinorType = " + getInteger() + ";\n";
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
public static class orientationMajorAxisType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_orientationMajorAxisType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public orientationMajorAxisType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("180"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_orientationMajorAxisType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_orientationMajorAxisType != null) {
      return ImmutableList.of(TAG_orientationMajorAxisType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new orientationMajorAxisType from encoded stream.
   */
  public static orientationMajorAxisType fromPerUnaligned(byte[] encodedBytes) {
    orientationMajorAxisType result = new orientationMajorAxisType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new orientationMajorAxisType from encoded stream.
   */
  public static orientationMajorAxisType fromPerAligned(byte[] encodedBytes) {
    orientationMajorAxisType result = new orientationMajorAxisType();
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
    return "orientationMajorAxisType = " + getInteger() + ";\n";
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
    builder.append("uncertaintyType = {\n");
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

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class confidenceType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_confidenceType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public confidenceType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("100"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_confidenceType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_confidenceType != null) {
      return ImmutableList.of(TAG_confidenceType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new confidenceType from encoded stream.
   */
  public static confidenceType fromPerUnaligned(byte[] encodedBytes) {
    confidenceType result = new confidenceType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new confidenceType from encoded stream.
   */
  public static confidenceType fromPerAligned(byte[] encodedBytes) {
    confidenceType result = new confidenceType();
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
    return "confidenceType = " + getInteger() + ";\n";
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
    builder.append("PositionEstimate = {\n");
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
