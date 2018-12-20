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

package com.google.location.suplclient.asn1.supl2.ver2_ulp_components;

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
public  class EllipticalArea extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_EllipticalArea
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public EllipticalArea() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_EllipticalArea;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_EllipticalArea != null) {
      return ImmutableList.of(TAG_EllipticalArea);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new EllipticalArea from encoded stream.
   */
  public static EllipticalArea fromPerUnaligned(byte[] encodedBytes) {
    EllipticalArea result = new EllipticalArea();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new EllipticalArea from encoded stream.
   */
  public static EllipticalArea fromPerAligned(byte[] encodedBytes) {
    EllipticalArea result = new EllipticalArea();
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

  
  private Coordinate coordinate_;
  public Coordinate getCoordinate() {
    return coordinate_;
  }
  /**
   * @throws ClassCastException if value is not a Coordinate
   */
  public void setCoordinate(Asn1Object value) {
    this.coordinate_ = (Coordinate) value;
  }
  public Coordinate setCoordinateToNewInstance() {
    coordinate_ = new Coordinate();
    return coordinate_;
  }
  
  private EllipticalArea.semiMajorType semiMajor_;
  public EllipticalArea.semiMajorType getSemiMajor() {
    return semiMajor_;
  }
  /**
   * @throws ClassCastException if value is not a EllipticalArea.semiMajorType
   */
  public void setSemiMajor(Asn1Object value) {
    this.semiMajor_ = (EllipticalArea.semiMajorType) value;
  }
  public EllipticalArea.semiMajorType setSemiMajorToNewInstance() {
    semiMajor_ = new EllipticalArea.semiMajorType();
    return semiMajor_;
  }
  
  private EllipticalArea.semiMajor_minType semiMajor_min_;
  public EllipticalArea.semiMajor_minType getSemiMajor_min() {
    return semiMajor_min_;
  }
  /**
   * @throws ClassCastException if value is not a EllipticalArea.semiMajor_minType
   */
  public void setSemiMajor_min(Asn1Object value) {
    this.semiMajor_min_ = (EllipticalArea.semiMajor_minType) value;
  }
  public EllipticalArea.semiMajor_minType setSemiMajor_minToNewInstance() {
    semiMajor_min_ = new EllipticalArea.semiMajor_minType();
    return semiMajor_min_;
  }
  
  private EllipticalArea.semiMajor_maxType semiMajor_max_;
  public EllipticalArea.semiMajor_maxType getSemiMajor_max() {
    return semiMajor_max_;
  }
  /**
   * @throws ClassCastException if value is not a EllipticalArea.semiMajor_maxType
   */
  public void setSemiMajor_max(Asn1Object value) {
    this.semiMajor_max_ = (EllipticalArea.semiMajor_maxType) value;
  }
  public EllipticalArea.semiMajor_maxType setSemiMajor_maxToNewInstance() {
    semiMajor_max_ = new EllipticalArea.semiMajor_maxType();
    return semiMajor_max_;
  }
  
  private EllipticalArea.semiMinorType semiMinor_;
  public EllipticalArea.semiMinorType getSemiMinor() {
    return semiMinor_;
  }
  /**
   * @throws ClassCastException if value is not a EllipticalArea.semiMinorType
   */
  public void setSemiMinor(Asn1Object value) {
    this.semiMinor_ = (EllipticalArea.semiMinorType) value;
  }
  public EllipticalArea.semiMinorType setSemiMinorToNewInstance() {
    semiMinor_ = new EllipticalArea.semiMinorType();
    return semiMinor_;
  }
  
  private EllipticalArea.semiMinor_minType semiMinor_min_;
  public EllipticalArea.semiMinor_minType getSemiMinor_min() {
    return semiMinor_min_;
  }
  /**
   * @throws ClassCastException if value is not a EllipticalArea.semiMinor_minType
   */
  public void setSemiMinor_min(Asn1Object value) {
    this.semiMinor_min_ = (EllipticalArea.semiMinor_minType) value;
  }
  public EllipticalArea.semiMinor_minType setSemiMinor_minToNewInstance() {
    semiMinor_min_ = new EllipticalArea.semiMinor_minType();
    return semiMinor_min_;
  }
  
  private EllipticalArea.semiMinor_maxType semiMinor_max_;
  public EllipticalArea.semiMinor_maxType getSemiMinor_max() {
    return semiMinor_max_;
  }
  /**
   * @throws ClassCastException if value is not a EllipticalArea.semiMinor_maxType
   */
  public void setSemiMinor_max(Asn1Object value) {
    this.semiMinor_max_ = (EllipticalArea.semiMinor_maxType) value;
  }
  public EllipticalArea.semiMinor_maxType setSemiMinor_maxToNewInstance() {
    semiMinor_max_ = new EllipticalArea.semiMinor_maxType();
    return semiMinor_max_;
  }
  
  private EllipticalArea.angleType angle_;
  public EllipticalArea.angleType getAngle() {
    return angle_;
  }
  /**
   * @throws ClassCastException if value is not a EllipticalArea.angleType
   */
  public void setAngle(Asn1Object value) {
    this.angle_ = (EllipticalArea.angleType) value;
  }
  public EllipticalArea.angleType setAngleToNewInstance() {
    angle_ = new EllipticalArea.angleType();
    return angle_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getCoordinate() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCoordinate();
          }

          @Override public void setToNewInstance() {
            setCoordinateToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Coordinate.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "coordinate : "
                    + getCoordinate().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getSemiMajor() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getSemiMajor();
          }

          @Override public void setToNewInstance() {
            setSemiMajorToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? EllipticalArea.semiMajorType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "semiMajor : "
                    + getSemiMajor().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getSemiMajor_min() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getSemiMajor_min();
          }

          @Override public void setToNewInstance() {
            setSemiMajor_minToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? EllipticalArea.semiMajor_minType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "semiMajor_min : "
                    + getSemiMajor_min().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getSemiMajor_max() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getSemiMajor_max();
          }

          @Override public void setToNewInstance() {
            setSemiMajor_maxToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? EllipticalArea.semiMajor_maxType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "semiMajor_max : "
                    + getSemiMajor_max().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getSemiMinor() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getSemiMinor();
          }

          @Override public void setToNewInstance() {
            setSemiMinorToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? EllipticalArea.semiMinorType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "semiMinor : "
                    + getSemiMinor().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getSemiMinor_min() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getSemiMinor_min();
          }

          @Override public void setToNewInstance() {
            setSemiMinor_minToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? EllipticalArea.semiMinor_minType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "semiMinor_min : "
                    + getSemiMinor_min().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getSemiMinor_max() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getSemiMinor_max();
          }

          @Override public void setToNewInstance() {
            setSemiMinor_maxToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? EllipticalArea.semiMinor_maxType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "semiMinor_max : "
                    + getSemiMinor_max().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 7);

          @Override public boolean isExplicitlySet() {
            return getAngle() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getAngle();
          }

          @Override public void setToNewInstance() {
            setAngleToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? EllipticalArea.angleType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "angle : "
                    + getAngle().toIndentedString(indent);
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
public static class semiMajorType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_semiMajorType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public semiMajorType() {
    super();
    setValueRange(new java.math.BigInteger("1"), new java.math.BigInteger("1000000"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_semiMajorType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_semiMajorType != null) {
      return ImmutableList.of(TAG_semiMajorType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new semiMajorType from encoded stream.
   */
  public static semiMajorType fromPerUnaligned(byte[] encodedBytes) {
    semiMajorType result = new semiMajorType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new semiMajorType from encoded stream.
   */
  public static semiMajorType fromPerAligned(byte[] encodedBytes) {
    semiMajorType result = new semiMajorType();
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
    return "semiMajorType = " + getInteger() + ";\n";
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
public static class semiMajor_minType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_semiMajor_minType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public semiMajor_minType() {
    super();
    setValueRange(new java.math.BigInteger("1"), new java.math.BigInteger("1000000"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_semiMajor_minType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_semiMajor_minType != null) {
      return ImmutableList.of(TAG_semiMajor_minType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new semiMajor_minType from encoded stream.
   */
  public static semiMajor_minType fromPerUnaligned(byte[] encodedBytes) {
    semiMajor_minType result = new semiMajor_minType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new semiMajor_minType from encoded stream.
   */
  public static semiMajor_minType fromPerAligned(byte[] encodedBytes) {
    semiMajor_minType result = new semiMajor_minType();
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
    return "semiMajor_minType = " + getInteger() + ";\n";
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
public static class semiMajor_maxType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_semiMajor_maxType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public semiMajor_maxType() {
    super();
    setValueRange(new java.math.BigInteger("1"), new java.math.BigInteger("1500000"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_semiMajor_maxType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_semiMajor_maxType != null) {
      return ImmutableList.of(TAG_semiMajor_maxType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new semiMajor_maxType from encoded stream.
   */
  public static semiMajor_maxType fromPerUnaligned(byte[] encodedBytes) {
    semiMajor_maxType result = new semiMajor_maxType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new semiMajor_maxType from encoded stream.
   */
  public static semiMajor_maxType fromPerAligned(byte[] encodedBytes) {
    semiMajor_maxType result = new semiMajor_maxType();
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
    return "semiMajor_maxType = " + getInteger() + ";\n";
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
public static class semiMinorType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_semiMinorType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public semiMinorType() {
    super();
    setValueRange(new java.math.BigInteger("1"), new java.math.BigInteger("1000000"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_semiMinorType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_semiMinorType != null) {
      return ImmutableList.of(TAG_semiMinorType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new semiMinorType from encoded stream.
   */
  public static semiMinorType fromPerUnaligned(byte[] encodedBytes) {
    semiMinorType result = new semiMinorType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new semiMinorType from encoded stream.
   */
  public static semiMinorType fromPerAligned(byte[] encodedBytes) {
    semiMinorType result = new semiMinorType();
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
    return "semiMinorType = " + getInteger() + ";\n";
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
public static class semiMinor_minType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_semiMinor_minType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public semiMinor_minType() {
    super();
    setValueRange(new java.math.BigInteger("1"), new java.math.BigInteger("1000000"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_semiMinor_minType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_semiMinor_minType != null) {
      return ImmutableList.of(TAG_semiMinor_minType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new semiMinor_minType from encoded stream.
   */
  public static semiMinor_minType fromPerUnaligned(byte[] encodedBytes) {
    semiMinor_minType result = new semiMinor_minType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new semiMinor_minType from encoded stream.
   */
  public static semiMinor_minType fromPerAligned(byte[] encodedBytes) {
    semiMinor_minType result = new semiMinor_minType();
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
    return "semiMinor_minType = " + getInteger() + ";\n";
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
public static class semiMinor_maxType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_semiMinor_maxType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public semiMinor_maxType() {
    super();
    setValueRange(new java.math.BigInteger("1"), new java.math.BigInteger("1500000"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_semiMinor_maxType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_semiMinor_maxType != null) {
      return ImmutableList.of(TAG_semiMinor_maxType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new semiMinor_maxType from encoded stream.
   */
  public static semiMinor_maxType fromPerUnaligned(byte[] encodedBytes) {
    semiMinor_maxType result = new semiMinor_maxType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new semiMinor_maxType from encoded stream.
   */
  public static semiMinor_maxType fromPerAligned(byte[] encodedBytes) {
    semiMinor_maxType result = new semiMinor_maxType();
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
    return "semiMinor_maxType = " + getInteger() + ";\n";
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
public static class angleType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_angleType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public angleType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("179"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_angleType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_angleType != null) {
      return ImmutableList.of(TAG_angleType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new angleType from encoded stream.
   */
  public static angleType fromPerUnaligned(byte[] encodedBytes) {
    angleType result = new angleType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new angleType from encoded stream.
   */
  public static angleType fromPerAligned(byte[] encodedBytes) {
    angleType result = new angleType();
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
    return "angleType = " + getInteger() + ";\n";
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
    builder.append("EllipticalArea = {\n");
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
