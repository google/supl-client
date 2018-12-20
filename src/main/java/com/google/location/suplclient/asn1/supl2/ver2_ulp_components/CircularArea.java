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
public  class CircularArea extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_CircularArea
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public CircularArea() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_CircularArea;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_CircularArea != null) {
      return ImmutableList.of(TAG_CircularArea);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new CircularArea from encoded stream.
   */
  public static CircularArea fromPerUnaligned(byte[] encodedBytes) {
    CircularArea result = new CircularArea();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new CircularArea from encoded stream.
   */
  public static CircularArea fromPerAligned(byte[] encodedBytes) {
    CircularArea result = new CircularArea();
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
  
  private CircularArea.radiusType radius_;
  public CircularArea.radiusType getRadius() {
    return radius_;
  }
  /**
   * @throws ClassCastException if value is not a CircularArea.radiusType
   */
  public void setRadius(Asn1Object value) {
    this.radius_ = (CircularArea.radiusType) value;
  }
  public CircularArea.radiusType setRadiusToNewInstance() {
    radius_ = new CircularArea.radiusType();
    return radius_;
  }
  
  private CircularArea.radius_minType radius_min_;
  public CircularArea.radius_minType getRadius_min() {
    return radius_min_;
  }
  /**
   * @throws ClassCastException if value is not a CircularArea.radius_minType
   */
  public void setRadius_min(Asn1Object value) {
    this.radius_min_ = (CircularArea.radius_minType) value;
  }
  public CircularArea.radius_minType setRadius_minToNewInstance() {
    radius_min_ = new CircularArea.radius_minType();
    return radius_min_;
  }
  
  private CircularArea.radius_maxType radius_max_;
  public CircularArea.radius_maxType getRadius_max() {
    return radius_max_;
  }
  /**
   * @throws ClassCastException if value is not a CircularArea.radius_maxType
   */
  public void setRadius_max(Asn1Object value) {
    this.radius_max_ = (CircularArea.radius_maxType) value;
  }
  public CircularArea.radius_maxType setRadius_maxToNewInstance() {
    radius_max_ = new CircularArea.radius_maxType();
    return radius_max_;
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
            return getRadius() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getRadius();
          }

          @Override public void setToNewInstance() {
            setRadiusToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? CircularArea.radiusType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "radius : "
                    + getRadius().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getRadius_min() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getRadius_min();
          }

          @Override public void setToNewInstance() {
            setRadius_minToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? CircularArea.radius_minType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "radius_min : "
                    + getRadius_min().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getRadius_max() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getRadius_max();
          }

          @Override public void setToNewInstance() {
            setRadius_maxToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? CircularArea.radius_maxType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "radius_max : "
                    + getRadius_max().toIndentedString(indent);
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
public static class radiusType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_radiusType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public radiusType() {
    super();
    setValueRange(new java.math.BigInteger("1"), new java.math.BigInteger("1000000"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_radiusType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_radiusType != null) {
      return ImmutableList.of(TAG_radiusType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new radiusType from encoded stream.
   */
  public static radiusType fromPerUnaligned(byte[] encodedBytes) {
    radiusType result = new radiusType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new radiusType from encoded stream.
   */
  public static radiusType fromPerAligned(byte[] encodedBytes) {
    radiusType result = new radiusType();
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
    return "radiusType = " + getInteger() + ";\n";
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
public static class radius_minType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_radius_minType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public radius_minType() {
    super();
    setValueRange(new java.math.BigInteger("1"), new java.math.BigInteger("1000000"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_radius_minType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_radius_minType != null) {
      return ImmutableList.of(TAG_radius_minType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new radius_minType from encoded stream.
   */
  public static radius_minType fromPerUnaligned(byte[] encodedBytes) {
    radius_minType result = new radius_minType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new radius_minType from encoded stream.
   */
  public static radius_minType fromPerAligned(byte[] encodedBytes) {
    radius_minType result = new radius_minType();
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
    return "radius_minType = " + getInteger() + ";\n";
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
public static class radius_maxType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_radius_maxType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public radius_maxType() {
    super();
    setValueRange(new java.math.BigInteger("1"), new java.math.BigInteger("1500000"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_radius_maxType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_radius_maxType != null) {
      return ImmutableList.of(TAG_radius_maxType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new radius_maxType from encoded stream.
   */
  public static radius_maxType fromPerUnaligned(byte[] encodedBytes) {
    radius_maxType result = new radius_maxType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new radius_maxType from encoded stream.
   */
  public static radius_maxType fromPerAligned(byte[] encodedBytes) {
    radius_maxType result = new radius_maxType();
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
    return "radius_maxType = " + getInteger() + ";\n";
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
    builder.append("CircularArea = {\n");
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
