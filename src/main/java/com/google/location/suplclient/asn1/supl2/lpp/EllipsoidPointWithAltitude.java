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
public  class EllipsoidPointWithAltitude extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_EllipsoidPointWithAltitude
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public EllipsoidPointWithAltitude() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_EllipsoidPointWithAltitude;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_EllipsoidPointWithAltitude != null) {
      return ImmutableList.of(TAG_EllipsoidPointWithAltitude);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new EllipsoidPointWithAltitude from encoded stream.
   */
  public static EllipsoidPointWithAltitude fromPerUnaligned(byte[] encodedBytes) {
    EllipsoidPointWithAltitude result = new EllipsoidPointWithAltitude();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new EllipsoidPointWithAltitude from encoded stream.
   */
  public static EllipsoidPointWithAltitude fromPerAligned(byte[] encodedBytes) {
    EllipsoidPointWithAltitude result = new EllipsoidPointWithAltitude();
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

  
  private EllipsoidPointWithAltitude.latitudeSignType latitudeSign_;
  public EllipsoidPointWithAltitude.latitudeSignType getLatitudeSign() {
    return latitudeSign_;
  }
  /**
   * @throws ClassCastException if value is not a EllipsoidPointWithAltitude.latitudeSignType
   */
  public void setLatitudeSign(Asn1Object value) {
    this.latitudeSign_ = (EllipsoidPointWithAltitude.latitudeSignType) value;
  }
  public EllipsoidPointWithAltitude.latitudeSignType setLatitudeSignToNewInstance() {
    latitudeSign_ = new EllipsoidPointWithAltitude.latitudeSignType();
    return latitudeSign_;
  }
  
  private EllipsoidPointWithAltitude.degreesLatitudeType degreesLatitude_;
  public EllipsoidPointWithAltitude.degreesLatitudeType getDegreesLatitude() {
    return degreesLatitude_;
  }
  /**
   * @throws ClassCastException if value is not a EllipsoidPointWithAltitude.degreesLatitudeType
   */
  public void setDegreesLatitude(Asn1Object value) {
    this.degreesLatitude_ = (EllipsoidPointWithAltitude.degreesLatitudeType) value;
  }
  public EllipsoidPointWithAltitude.degreesLatitudeType setDegreesLatitudeToNewInstance() {
    degreesLatitude_ = new EllipsoidPointWithAltitude.degreesLatitudeType();
    return degreesLatitude_;
  }
  
  private EllipsoidPointWithAltitude.degreesLongitudeType degreesLongitude_;
  public EllipsoidPointWithAltitude.degreesLongitudeType getDegreesLongitude() {
    return degreesLongitude_;
  }
  /**
   * @throws ClassCastException if value is not a EllipsoidPointWithAltitude.degreesLongitudeType
   */
  public void setDegreesLongitude(Asn1Object value) {
    this.degreesLongitude_ = (EllipsoidPointWithAltitude.degreesLongitudeType) value;
  }
  public EllipsoidPointWithAltitude.degreesLongitudeType setDegreesLongitudeToNewInstance() {
    degreesLongitude_ = new EllipsoidPointWithAltitude.degreesLongitudeType();
    return degreesLongitude_;
  }
  
  private EllipsoidPointWithAltitude.altitudeDirectionType altitudeDirection_;
  public EllipsoidPointWithAltitude.altitudeDirectionType getAltitudeDirection() {
    return altitudeDirection_;
  }
  /**
   * @throws ClassCastException if value is not a EllipsoidPointWithAltitude.altitudeDirectionType
   */
  public void setAltitudeDirection(Asn1Object value) {
    this.altitudeDirection_ = (EllipsoidPointWithAltitude.altitudeDirectionType) value;
  }
  public EllipsoidPointWithAltitude.altitudeDirectionType setAltitudeDirectionToNewInstance() {
    altitudeDirection_ = new EllipsoidPointWithAltitude.altitudeDirectionType();
    return altitudeDirection_;
  }
  
  private EllipsoidPointWithAltitude.altitudeType altitude_;
  public EllipsoidPointWithAltitude.altitudeType getAltitude() {
    return altitude_;
  }
  /**
   * @throws ClassCastException if value is not a EllipsoidPointWithAltitude.altitudeType
   */
  public void setAltitude(Asn1Object value) {
    this.altitude_ = (EllipsoidPointWithAltitude.altitudeType) value;
  }
  public EllipsoidPointWithAltitude.altitudeType setAltitudeToNewInstance() {
    altitude_ = new EllipsoidPointWithAltitude.altitudeType();
    return altitude_;
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
            return tag == null ? EllipsoidPointWithAltitude.latitudeSignType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? EllipsoidPointWithAltitude.degreesLatitudeType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? EllipsoidPointWithAltitude.degreesLongitudeType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return getAltitudeDirection() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getAltitudeDirection();
          }

          @Override public void setToNewInstance() {
            setAltitudeDirectionToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? EllipsoidPointWithAltitude.altitudeDirectionType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "altitudeDirection : "
                    + getAltitudeDirection().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getAltitude() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getAltitude();
          }

          @Override public void setToNewInstance() {
            setAltitudeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? EllipsoidPointWithAltitude.altitudeType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "altitude : "
                    + getAltitude().toIndentedString(indent);
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
 * AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class altitudeDirectionType extends Asn1Enumerated {
  public enum Value implements Asn1Enumerated.Value {
    height(0),
    depth(1),
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


  
  public void setTo_height() {
    setValue(Value.height);
  }
  
  public void setTo_depth() {
    setValue(Value.depth);
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

  

  

  private static final Asn1Tag TAG_altitudeDirectionType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public altitudeDirectionType() {
    super();
    // use template substitution instead of calling getDefaultValue(), since
    // calling virtual methods from a ctor is frowned upon here.
    setValue(null
);
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_altitudeDirectionType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_altitudeDirectionType != null) {
      return ImmutableList.of(TAG_altitudeDirectionType);
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
   * Creates a new altitudeDirectionType from encoded stream.
   */
  public static altitudeDirectionType fromPerUnaligned(byte[] encodedBytes) {
    altitudeDirectionType result = new altitudeDirectionType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new altitudeDirectionType from encoded stream.
   */
  public static altitudeDirectionType fromPerAligned(byte[] encodedBytes) {
    altitudeDirectionType result = new altitudeDirectionType();
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
    return "altitudeDirectionType = " + getValue() + ";\n";
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
public static class altitudeType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_altitudeType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public altitudeType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("32767"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_altitudeType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_altitudeType != null) {
      return ImmutableList.of(TAG_altitudeType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new altitudeType from encoded stream.
   */
  public static altitudeType fromPerUnaligned(byte[] encodedBytes) {
    altitudeType result = new altitudeType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new altitudeType from encoded stream.
   */
  public static altitudeType fromPerAligned(byte[] encodedBytes) {
    altitudeType result = new altitudeType();
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
    return "altitudeType = " + getInteger() + ";\n";
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
    builder.append("EllipsoidPointWithAltitude = {\n");
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
