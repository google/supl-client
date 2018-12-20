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
import com.google.location.suplclient.asn1.base.Asn1Boolean;
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
public  class LocationCoordinateTypes extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_LocationCoordinateTypes
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public LocationCoordinateTypes() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_LocationCoordinateTypes;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_LocationCoordinateTypes != null) {
      return ImmutableList.of(TAG_LocationCoordinateTypes);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new LocationCoordinateTypes from encoded stream.
   */
  public static LocationCoordinateTypes fromPerUnaligned(byte[] encodedBytes) {
    LocationCoordinateTypes result = new LocationCoordinateTypes();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new LocationCoordinateTypes from encoded stream.
   */
  public static LocationCoordinateTypes fromPerAligned(byte[] encodedBytes) {
    LocationCoordinateTypes result = new LocationCoordinateTypes();
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

  
  private LocationCoordinateTypes.ellipsoidPointType ellipsoidPoint_;
  public LocationCoordinateTypes.ellipsoidPointType getEllipsoidPoint() {
    return ellipsoidPoint_;
  }
  /**
   * @throws ClassCastException if value is not a LocationCoordinateTypes.ellipsoidPointType
   */
  public void setEllipsoidPoint(Asn1Object value) {
    this.ellipsoidPoint_ = (LocationCoordinateTypes.ellipsoidPointType) value;
  }
  public LocationCoordinateTypes.ellipsoidPointType setEllipsoidPointToNewInstance() {
    ellipsoidPoint_ = new LocationCoordinateTypes.ellipsoidPointType();
    return ellipsoidPoint_;
  }
  
  private LocationCoordinateTypes.ellipsoidPointWithUncertaintyCircleType ellipsoidPointWithUncertaintyCircle_;
  public LocationCoordinateTypes.ellipsoidPointWithUncertaintyCircleType getEllipsoidPointWithUncertaintyCircle() {
    return ellipsoidPointWithUncertaintyCircle_;
  }
  /**
   * @throws ClassCastException if value is not a LocationCoordinateTypes.ellipsoidPointWithUncertaintyCircleType
   */
  public void setEllipsoidPointWithUncertaintyCircle(Asn1Object value) {
    this.ellipsoidPointWithUncertaintyCircle_ = (LocationCoordinateTypes.ellipsoidPointWithUncertaintyCircleType) value;
  }
  public LocationCoordinateTypes.ellipsoidPointWithUncertaintyCircleType setEllipsoidPointWithUncertaintyCircleToNewInstance() {
    ellipsoidPointWithUncertaintyCircle_ = new LocationCoordinateTypes.ellipsoidPointWithUncertaintyCircleType();
    return ellipsoidPointWithUncertaintyCircle_;
  }
  
  private LocationCoordinateTypes.ellipsoidPointWithUncertaintyEllipseType ellipsoidPointWithUncertaintyEllipse_;
  public LocationCoordinateTypes.ellipsoidPointWithUncertaintyEllipseType getEllipsoidPointWithUncertaintyEllipse() {
    return ellipsoidPointWithUncertaintyEllipse_;
  }
  /**
   * @throws ClassCastException if value is not a LocationCoordinateTypes.ellipsoidPointWithUncertaintyEllipseType
   */
  public void setEllipsoidPointWithUncertaintyEllipse(Asn1Object value) {
    this.ellipsoidPointWithUncertaintyEllipse_ = (LocationCoordinateTypes.ellipsoidPointWithUncertaintyEllipseType) value;
  }
  public LocationCoordinateTypes.ellipsoidPointWithUncertaintyEllipseType setEllipsoidPointWithUncertaintyEllipseToNewInstance() {
    ellipsoidPointWithUncertaintyEllipse_ = new LocationCoordinateTypes.ellipsoidPointWithUncertaintyEllipseType();
    return ellipsoidPointWithUncertaintyEllipse_;
  }
  
  private LocationCoordinateTypes.polygonType polygon_;
  public LocationCoordinateTypes.polygonType getPolygon() {
    return polygon_;
  }
  /**
   * @throws ClassCastException if value is not a LocationCoordinateTypes.polygonType
   */
  public void setPolygon(Asn1Object value) {
    this.polygon_ = (LocationCoordinateTypes.polygonType) value;
  }
  public LocationCoordinateTypes.polygonType setPolygonToNewInstance() {
    polygon_ = new LocationCoordinateTypes.polygonType();
    return polygon_;
  }
  
  private LocationCoordinateTypes.ellipsoidPointWithAltitudeType ellipsoidPointWithAltitude_;
  public LocationCoordinateTypes.ellipsoidPointWithAltitudeType getEllipsoidPointWithAltitude() {
    return ellipsoidPointWithAltitude_;
  }
  /**
   * @throws ClassCastException if value is not a LocationCoordinateTypes.ellipsoidPointWithAltitudeType
   */
  public void setEllipsoidPointWithAltitude(Asn1Object value) {
    this.ellipsoidPointWithAltitude_ = (LocationCoordinateTypes.ellipsoidPointWithAltitudeType) value;
  }
  public LocationCoordinateTypes.ellipsoidPointWithAltitudeType setEllipsoidPointWithAltitudeToNewInstance() {
    ellipsoidPointWithAltitude_ = new LocationCoordinateTypes.ellipsoidPointWithAltitudeType();
    return ellipsoidPointWithAltitude_;
  }
  
  private LocationCoordinateTypes.ellipsoidPointWithAltitudeAndUncertaintyEllipsoidType ellipsoidPointWithAltitudeAndUncertaintyEllipsoid_;
  public LocationCoordinateTypes.ellipsoidPointWithAltitudeAndUncertaintyEllipsoidType getEllipsoidPointWithAltitudeAndUncertaintyEllipsoid() {
    return ellipsoidPointWithAltitudeAndUncertaintyEllipsoid_;
  }
  /**
   * @throws ClassCastException if value is not a LocationCoordinateTypes.ellipsoidPointWithAltitudeAndUncertaintyEllipsoidType
   */
  public void setEllipsoidPointWithAltitudeAndUncertaintyEllipsoid(Asn1Object value) {
    this.ellipsoidPointWithAltitudeAndUncertaintyEllipsoid_ = (LocationCoordinateTypes.ellipsoidPointWithAltitudeAndUncertaintyEllipsoidType) value;
  }
  public LocationCoordinateTypes.ellipsoidPointWithAltitudeAndUncertaintyEllipsoidType setEllipsoidPointWithAltitudeAndUncertaintyEllipsoidToNewInstance() {
    ellipsoidPointWithAltitudeAndUncertaintyEllipsoid_ = new LocationCoordinateTypes.ellipsoidPointWithAltitudeAndUncertaintyEllipsoidType();
    return ellipsoidPointWithAltitudeAndUncertaintyEllipsoid_;
  }
  
  private LocationCoordinateTypes.ellipsoidArcType ellipsoidArc_;
  public LocationCoordinateTypes.ellipsoidArcType getEllipsoidArc() {
    return ellipsoidArc_;
  }
  /**
   * @throws ClassCastException if value is not a LocationCoordinateTypes.ellipsoidArcType
   */
  public void setEllipsoidArc(Asn1Object value) {
    this.ellipsoidArc_ = (LocationCoordinateTypes.ellipsoidArcType) value;
  }
  public LocationCoordinateTypes.ellipsoidArcType setEllipsoidArcToNewInstance() {
    ellipsoidArc_ = new LocationCoordinateTypes.ellipsoidArcType();
    return ellipsoidArc_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getEllipsoidPoint() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getEllipsoidPoint();
          }

          @Override public void setToNewInstance() {
            setEllipsoidPointToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? LocationCoordinateTypes.ellipsoidPointType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ellipsoidPoint : "
                    + getEllipsoidPoint().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getEllipsoidPointWithUncertaintyCircle() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getEllipsoidPointWithUncertaintyCircle();
          }

          @Override public void setToNewInstance() {
            setEllipsoidPointWithUncertaintyCircleToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? LocationCoordinateTypes.ellipsoidPointWithUncertaintyCircleType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ellipsoidPointWithUncertaintyCircle : "
                    + getEllipsoidPointWithUncertaintyCircle().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getEllipsoidPointWithUncertaintyEllipse() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getEllipsoidPointWithUncertaintyEllipse();
          }

          @Override public void setToNewInstance() {
            setEllipsoidPointWithUncertaintyEllipseToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? LocationCoordinateTypes.ellipsoidPointWithUncertaintyEllipseType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ellipsoidPointWithUncertaintyEllipse : "
                    + getEllipsoidPointWithUncertaintyEllipse().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getPolygon() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getPolygon();
          }

          @Override public void setToNewInstance() {
            setPolygonToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? LocationCoordinateTypes.polygonType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "polygon : "
                    + getPolygon().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getEllipsoidPointWithAltitude() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getEllipsoidPointWithAltitude();
          }

          @Override public void setToNewInstance() {
            setEllipsoidPointWithAltitudeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? LocationCoordinateTypes.ellipsoidPointWithAltitudeType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ellipsoidPointWithAltitude : "
                    + getEllipsoidPointWithAltitude().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getEllipsoidPointWithAltitudeAndUncertaintyEllipsoid() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getEllipsoidPointWithAltitudeAndUncertaintyEllipsoid();
          }

          @Override public void setToNewInstance() {
            setEllipsoidPointWithAltitudeAndUncertaintyEllipsoidToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? LocationCoordinateTypes.ellipsoidPointWithAltitudeAndUncertaintyEllipsoidType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ellipsoidPointWithAltitudeAndUncertaintyEllipsoid : "
                    + getEllipsoidPointWithAltitudeAndUncertaintyEllipsoid().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getEllipsoidArc() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getEllipsoidArc();
          }

          @Override public void setToNewInstance() {
            setEllipsoidArcToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? LocationCoordinateTypes.ellipsoidArcType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ellipsoidArc : "
                    + getEllipsoidArc().toIndentedString(indent);
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
public static class ellipsoidPointType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_ellipsoidPointType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ellipsoidPointType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ellipsoidPointType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ellipsoidPointType != null) {
      return ImmutableList.of(TAG_ellipsoidPointType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ellipsoidPointType from encoded stream.
   */
  public static ellipsoidPointType fromPerUnaligned(byte[] encodedBytes) {
    ellipsoidPointType result = new ellipsoidPointType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ellipsoidPointType from encoded stream.
   */
  public static ellipsoidPointType fromPerAligned(byte[] encodedBytes) {
    ellipsoidPointType result = new ellipsoidPointType();
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
    return "ellipsoidPointType = " + getValue() + ";\n";
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
public static class ellipsoidPointWithUncertaintyCircleType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_ellipsoidPointWithUncertaintyCircleType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ellipsoidPointWithUncertaintyCircleType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ellipsoidPointWithUncertaintyCircleType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ellipsoidPointWithUncertaintyCircleType != null) {
      return ImmutableList.of(TAG_ellipsoidPointWithUncertaintyCircleType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ellipsoidPointWithUncertaintyCircleType from encoded stream.
   */
  public static ellipsoidPointWithUncertaintyCircleType fromPerUnaligned(byte[] encodedBytes) {
    ellipsoidPointWithUncertaintyCircleType result = new ellipsoidPointWithUncertaintyCircleType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ellipsoidPointWithUncertaintyCircleType from encoded stream.
   */
  public static ellipsoidPointWithUncertaintyCircleType fromPerAligned(byte[] encodedBytes) {
    ellipsoidPointWithUncertaintyCircleType result = new ellipsoidPointWithUncertaintyCircleType();
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
    return "ellipsoidPointWithUncertaintyCircleType = " + getValue() + ";\n";
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
public static class ellipsoidPointWithUncertaintyEllipseType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_ellipsoidPointWithUncertaintyEllipseType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ellipsoidPointWithUncertaintyEllipseType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ellipsoidPointWithUncertaintyEllipseType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ellipsoidPointWithUncertaintyEllipseType != null) {
      return ImmutableList.of(TAG_ellipsoidPointWithUncertaintyEllipseType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ellipsoidPointWithUncertaintyEllipseType from encoded stream.
   */
  public static ellipsoidPointWithUncertaintyEllipseType fromPerUnaligned(byte[] encodedBytes) {
    ellipsoidPointWithUncertaintyEllipseType result = new ellipsoidPointWithUncertaintyEllipseType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ellipsoidPointWithUncertaintyEllipseType from encoded stream.
   */
  public static ellipsoidPointWithUncertaintyEllipseType fromPerAligned(byte[] encodedBytes) {
    ellipsoidPointWithUncertaintyEllipseType result = new ellipsoidPointWithUncertaintyEllipseType();
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
    return "ellipsoidPointWithUncertaintyEllipseType = " + getValue() + ";\n";
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
public static class polygonType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_polygonType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public polygonType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_polygonType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_polygonType != null) {
      return ImmutableList.of(TAG_polygonType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new polygonType from encoded stream.
   */
  public static polygonType fromPerUnaligned(byte[] encodedBytes) {
    polygonType result = new polygonType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new polygonType from encoded stream.
   */
  public static polygonType fromPerAligned(byte[] encodedBytes) {
    polygonType result = new polygonType();
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
    return "polygonType = " + getValue() + ";\n";
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
public static class ellipsoidPointWithAltitudeType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_ellipsoidPointWithAltitudeType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ellipsoidPointWithAltitudeType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ellipsoidPointWithAltitudeType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ellipsoidPointWithAltitudeType != null) {
      return ImmutableList.of(TAG_ellipsoidPointWithAltitudeType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ellipsoidPointWithAltitudeType from encoded stream.
   */
  public static ellipsoidPointWithAltitudeType fromPerUnaligned(byte[] encodedBytes) {
    ellipsoidPointWithAltitudeType result = new ellipsoidPointWithAltitudeType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ellipsoidPointWithAltitudeType from encoded stream.
   */
  public static ellipsoidPointWithAltitudeType fromPerAligned(byte[] encodedBytes) {
    ellipsoidPointWithAltitudeType result = new ellipsoidPointWithAltitudeType();
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
    return "ellipsoidPointWithAltitudeType = " + getValue() + ";\n";
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
public static class ellipsoidPointWithAltitudeAndUncertaintyEllipsoidType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_ellipsoidPointWithAltitudeAndUncertaintyEllipsoidType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ellipsoidPointWithAltitudeAndUncertaintyEllipsoidType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ellipsoidPointWithAltitudeAndUncertaintyEllipsoidType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ellipsoidPointWithAltitudeAndUncertaintyEllipsoidType != null) {
      return ImmutableList.of(TAG_ellipsoidPointWithAltitudeAndUncertaintyEllipsoidType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ellipsoidPointWithAltitudeAndUncertaintyEllipsoidType from encoded stream.
   */
  public static ellipsoidPointWithAltitudeAndUncertaintyEllipsoidType fromPerUnaligned(byte[] encodedBytes) {
    ellipsoidPointWithAltitudeAndUncertaintyEllipsoidType result = new ellipsoidPointWithAltitudeAndUncertaintyEllipsoidType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ellipsoidPointWithAltitudeAndUncertaintyEllipsoidType from encoded stream.
   */
  public static ellipsoidPointWithAltitudeAndUncertaintyEllipsoidType fromPerAligned(byte[] encodedBytes) {
    ellipsoidPointWithAltitudeAndUncertaintyEllipsoidType result = new ellipsoidPointWithAltitudeAndUncertaintyEllipsoidType();
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
    return "ellipsoidPointWithAltitudeAndUncertaintyEllipsoidType = " + getValue() + ";\n";
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
public static class ellipsoidArcType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_ellipsoidArcType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ellipsoidArcType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ellipsoidArcType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ellipsoidArcType != null) {
      return ImmutableList.of(TAG_ellipsoidArcType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ellipsoidArcType from encoded stream.
   */
  public static ellipsoidArcType fromPerUnaligned(byte[] encodedBytes) {
    ellipsoidArcType result = new ellipsoidArcType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ellipsoidArcType from encoded stream.
   */
  public static ellipsoidArcType fromPerAligned(byte[] encodedBytes) {
    ellipsoidArcType result = new ellipsoidArcType();
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
    return "ellipsoidArcType = " + getValue() + ";\n";
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
    builder.append("LocationCoordinateTypes = {\n");
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
