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

package com.google.location.suplclient.asn1.supl2.lpp;

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
public  class EllipsoidArc extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_EllipsoidArc
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public EllipsoidArc() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_EllipsoidArc;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_EllipsoidArc != null) {
      return ImmutableList.of(TAG_EllipsoidArc);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new EllipsoidArc from encoded stream.
   */
  public static EllipsoidArc fromPerUnaligned(byte[] encodedBytes) {
    EllipsoidArc result = new EllipsoidArc();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new EllipsoidArc from encoded stream.
   */
  public static EllipsoidArc fromPerAligned(byte[] encodedBytes) {
    EllipsoidArc result = new EllipsoidArc();
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

  
  private EllipsoidArc.latitudeSignType latitudeSign_;
  public EllipsoidArc.latitudeSignType getLatitudeSign() {
    return latitudeSign_;
  }
  /**
   * @throws ClassCastException if value is not a EllipsoidArc.latitudeSignType
   */
  public void setLatitudeSign(Asn1Object value) {
    this.latitudeSign_ = (EllipsoidArc.latitudeSignType) value;
  }
  public EllipsoidArc.latitudeSignType setLatitudeSignToNewInstance() {
    latitudeSign_ = new EllipsoidArc.latitudeSignType();
    return latitudeSign_;
  }
  
  private EllipsoidArc.degreesLatitudeType degreesLatitude_;
  public EllipsoidArc.degreesLatitudeType getDegreesLatitude() {
    return degreesLatitude_;
  }
  /**
   * @throws ClassCastException if value is not a EllipsoidArc.degreesLatitudeType
   */
  public void setDegreesLatitude(Asn1Object value) {
    this.degreesLatitude_ = (EllipsoidArc.degreesLatitudeType) value;
  }
  public EllipsoidArc.degreesLatitudeType setDegreesLatitudeToNewInstance() {
    degreesLatitude_ = new EllipsoidArc.degreesLatitudeType();
    return degreesLatitude_;
  }
  
  private EllipsoidArc.degreesLongitudeType degreesLongitude_;
  public EllipsoidArc.degreesLongitudeType getDegreesLongitude() {
    return degreesLongitude_;
  }
  /**
   * @throws ClassCastException if value is not a EllipsoidArc.degreesLongitudeType
   */
  public void setDegreesLongitude(Asn1Object value) {
    this.degreesLongitude_ = (EllipsoidArc.degreesLongitudeType) value;
  }
  public EllipsoidArc.degreesLongitudeType setDegreesLongitudeToNewInstance() {
    degreesLongitude_ = new EllipsoidArc.degreesLongitudeType();
    return degreesLongitude_;
  }
  
  private EllipsoidArc.innerRadiusType innerRadius_;
  public EllipsoidArc.innerRadiusType getInnerRadius() {
    return innerRadius_;
  }
  /**
   * @throws ClassCastException if value is not a EllipsoidArc.innerRadiusType
   */
  public void setInnerRadius(Asn1Object value) {
    this.innerRadius_ = (EllipsoidArc.innerRadiusType) value;
  }
  public EllipsoidArc.innerRadiusType setInnerRadiusToNewInstance() {
    innerRadius_ = new EllipsoidArc.innerRadiusType();
    return innerRadius_;
  }
  
  private EllipsoidArc.uncertaintyRadiusType uncertaintyRadius_;
  public EllipsoidArc.uncertaintyRadiusType getUncertaintyRadius() {
    return uncertaintyRadius_;
  }
  /**
   * @throws ClassCastException if value is not a EllipsoidArc.uncertaintyRadiusType
   */
  public void setUncertaintyRadius(Asn1Object value) {
    this.uncertaintyRadius_ = (EllipsoidArc.uncertaintyRadiusType) value;
  }
  public EllipsoidArc.uncertaintyRadiusType setUncertaintyRadiusToNewInstance() {
    uncertaintyRadius_ = new EllipsoidArc.uncertaintyRadiusType();
    return uncertaintyRadius_;
  }
  
  private EllipsoidArc.offsetAngleType offsetAngle_;
  public EllipsoidArc.offsetAngleType getOffsetAngle() {
    return offsetAngle_;
  }
  /**
   * @throws ClassCastException if value is not a EllipsoidArc.offsetAngleType
   */
  public void setOffsetAngle(Asn1Object value) {
    this.offsetAngle_ = (EllipsoidArc.offsetAngleType) value;
  }
  public EllipsoidArc.offsetAngleType setOffsetAngleToNewInstance() {
    offsetAngle_ = new EllipsoidArc.offsetAngleType();
    return offsetAngle_;
  }
  
  private EllipsoidArc.includedAngleType includedAngle_;
  public EllipsoidArc.includedAngleType getIncludedAngle() {
    return includedAngle_;
  }
  /**
   * @throws ClassCastException if value is not a EllipsoidArc.includedAngleType
   */
  public void setIncludedAngle(Asn1Object value) {
    this.includedAngle_ = (EllipsoidArc.includedAngleType) value;
  }
  public EllipsoidArc.includedAngleType setIncludedAngleToNewInstance() {
    includedAngle_ = new EllipsoidArc.includedAngleType();
    return includedAngle_;
  }
  
  private EllipsoidArc.confidenceType confidence_;
  public EllipsoidArc.confidenceType getConfidence() {
    return confidence_;
  }
  /**
   * @throws ClassCastException if value is not a EllipsoidArc.confidenceType
   */
  public void setConfidence(Asn1Object value) {
    this.confidence_ = (EllipsoidArc.confidenceType) value;
  }
  public EllipsoidArc.confidenceType setConfidenceToNewInstance() {
    confidence_ = new EllipsoidArc.confidenceType();
    return confidence_;
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
            return tag == null ? EllipsoidArc.latitudeSignType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return getDegreesLatitude() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getDegreesLatitude();
          }

          @Override public void setToNewInstance() {
            setDegreesLatitudeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? EllipsoidArc.degreesLatitudeType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "degreesLatitude : "
                    + getDegreesLatitude().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getDegreesLongitude() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getDegreesLongitude();
          }

          @Override public void setToNewInstance() {
            setDegreesLongitudeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? EllipsoidArc.degreesLongitudeType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "degreesLongitude : "
                    + getDegreesLongitude().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getInnerRadius() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getInnerRadius();
          }

          @Override public void setToNewInstance() {
            setInnerRadiusToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? EllipsoidArc.innerRadiusType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "innerRadius : "
                    + getInnerRadius().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getUncertaintyRadius() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getUncertaintyRadius();
          }

          @Override public void setToNewInstance() {
            setUncertaintyRadiusToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? EllipsoidArc.uncertaintyRadiusType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "uncertaintyRadius : "
                    + getUncertaintyRadius().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getOffsetAngle() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getOffsetAngle();
          }

          @Override public void setToNewInstance() {
            setOffsetAngleToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? EllipsoidArc.offsetAngleType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "offsetAngle : "
                    + getOffsetAngle().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getIncludedAngle() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getIncludedAngle();
          }

          @Override public void setToNewInstance() {
            setIncludedAngleToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? EllipsoidArc.includedAngleType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "includedAngle : "
                    + getIncludedAngle().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 7);

          @Override public boolean isExplicitlySet() {
            return getConfidence() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getConfidence();
          }

          @Override public void setToNewInstance() {
            setConfidenceToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? EllipsoidArc.confidenceType.getPossibleFirstTags() : ImmutableList.of(tag);
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
public static class degreesLatitudeType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_degreesLatitudeType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public degreesLatitudeType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("8388607"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_degreesLatitudeType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_degreesLatitudeType != null) {
      return ImmutableList.of(TAG_degreesLatitudeType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new degreesLatitudeType from encoded stream.
   */
  public static degreesLatitudeType fromPerUnaligned(byte[] encodedBytes) {
    degreesLatitudeType result = new degreesLatitudeType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new degreesLatitudeType from encoded stream.
   */
  public static degreesLatitudeType fromPerAligned(byte[] encodedBytes) {
    degreesLatitudeType result = new degreesLatitudeType();
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
    return "degreesLatitudeType = " + getInteger() + ";\n";
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
public static class degreesLongitudeType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_degreesLongitudeType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public degreesLongitudeType() {
    super();
    setValueRange(new java.math.BigInteger("-8388608"), new java.math.BigInteger("8388607"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_degreesLongitudeType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_degreesLongitudeType != null) {
      return ImmutableList.of(TAG_degreesLongitudeType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new degreesLongitudeType from encoded stream.
   */
  public static degreesLongitudeType fromPerUnaligned(byte[] encodedBytes) {
    degreesLongitudeType result = new degreesLongitudeType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new degreesLongitudeType from encoded stream.
   */
  public static degreesLongitudeType fromPerAligned(byte[] encodedBytes) {
    degreesLongitudeType result = new degreesLongitudeType();
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
    return "degreesLongitudeType = " + getInteger() + ";\n";
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
public static class innerRadiusType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_innerRadiusType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public innerRadiusType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("65535"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_innerRadiusType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_innerRadiusType != null) {
      return ImmutableList.of(TAG_innerRadiusType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new innerRadiusType from encoded stream.
   */
  public static innerRadiusType fromPerUnaligned(byte[] encodedBytes) {
    innerRadiusType result = new innerRadiusType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new innerRadiusType from encoded stream.
   */
  public static innerRadiusType fromPerAligned(byte[] encodedBytes) {
    innerRadiusType result = new innerRadiusType();
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
    return "innerRadiusType = " + getInteger() + ";\n";
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
public static class uncertaintyRadiusType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_uncertaintyRadiusType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public uncertaintyRadiusType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("127"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_uncertaintyRadiusType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_uncertaintyRadiusType != null) {
      return ImmutableList.of(TAG_uncertaintyRadiusType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new uncertaintyRadiusType from encoded stream.
   */
  public static uncertaintyRadiusType fromPerUnaligned(byte[] encodedBytes) {
    uncertaintyRadiusType result = new uncertaintyRadiusType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new uncertaintyRadiusType from encoded stream.
   */
  public static uncertaintyRadiusType fromPerAligned(byte[] encodedBytes) {
    uncertaintyRadiusType result = new uncertaintyRadiusType();
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
    return "uncertaintyRadiusType = " + getInteger() + ";\n";
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
public static class offsetAngleType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_offsetAngleType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public offsetAngleType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("179"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_offsetAngleType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_offsetAngleType != null) {
      return ImmutableList.of(TAG_offsetAngleType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new offsetAngleType from encoded stream.
   */
  public static offsetAngleType fromPerUnaligned(byte[] encodedBytes) {
    offsetAngleType result = new offsetAngleType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new offsetAngleType from encoded stream.
   */
  public static offsetAngleType fromPerAligned(byte[] encodedBytes) {
    offsetAngleType result = new offsetAngleType();
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
    return "offsetAngleType = " + getInteger() + ";\n";
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
public static class includedAngleType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_includedAngleType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public includedAngleType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("179"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_includedAngleType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_includedAngleType != null) {
      return ImmutableList.of(TAG_includedAngleType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new includedAngleType from encoded stream.
   */
  public static includedAngleType fromPerUnaligned(byte[] encodedBytes) {
    includedAngleType result = new includedAngleType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new includedAngleType from encoded stream.
   */
  public static includedAngleType fromPerAligned(byte[] encodedBytes) {
    includedAngleType result = new includedAngleType();
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
    return "includedAngleType = " + getInteger() + ";\n";
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
    builder.append("EllipsoidArc = {\n");
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
