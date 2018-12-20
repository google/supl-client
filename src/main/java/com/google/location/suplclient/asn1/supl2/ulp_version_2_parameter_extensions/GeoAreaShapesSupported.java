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

package com.google.location.suplclient.asn1.supl2.ulp_version_2_parameter_extensions;

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
public  class GeoAreaShapesSupported extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GeoAreaShapesSupported
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GeoAreaShapesSupported() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GeoAreaShapesSupported;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GeoAreaShapesSupported != null) {
      return ImmutableList.of(TAG_GeoAreaShapesSupported);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GeoAreaShapesSupported from encoded stream.
   */
  public static GeoAreaShapesSupported fromPerUnaligned(byte[] encodedBytes) {
    GeoAreaShapesSupported result = new GeoAreaShapesSupported();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GeoAreaShapesSupported from encoded stream.
   */
  public static GeoAreaShapesSupported fromPerAligned(byte[] encodedBytes) {
    GeoAreaShapesSupported result = new GeoAreaShapesSupported();
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

  
  private GeoAreaShapesSupported.ellipticalAreaType ellipticalArea_;
  public GeoAreaShapesSupported.ellipticalAreaType getEllipticalArea() {
    return ellipticalArea_;
  }
  /**
   * @throws ClassCastException if value is not a GeoAreaShapesSupported.ellipticalAreaType
   */
  public void setEllipticalArea(Asn1Object value) {
    this.ellipticalArea_ = (GeoAreaShapesSupported.ellipticalAreaType) value;
  }
  public GeoAreaShapesSupported.ellipticalAreaType setEllipticalAreaToNewInstance() {
    ellipticalArea_ = new GeoAreaShapesSupported.ellipticalAreaType();
    return ellipticalArea_;
  }
  
  private GeoAreaShapesSupported.polygonAreaType polygonArea_;
  public GeoAreaShapesSupported.polygonAreaType getPolygonArea() {
    return polygonArea_;
  }
  /**
   * @throws ClassCastException if value is not a GeoAreaShapesSupported.polygonAreaType
   */
  public void setPolygonArea(Asn1Object value) {
    this.polygonArea_ = (GeoAreaShapesSupported.polygonAreaType) value;
  }
  public GeoAreaShapesSupported.polygonAreaType setPolygonAreaToNewInstance() {
    polygonArea_ = new GeoAreaShapesSupported.polygonAreaType();
    return polygonArea_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getEllipticalArea() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getEllipticalArea();
          }

          @Override public void setToNewInstance() {
            setEllipticalAreaToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GeoAreaShapesSupported.ellipticalAreaType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ellipticalArea : "
                    + getEllipticalArea().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getPolygonArea() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getPolygonArea();
          }

          @Override public void setToNewInstance() {
            setPolygonAreaToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GeoAreaShapesSupported.polygonAreaType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "polygonArea : "
                    + getPolygonArea().toIndentedString(indent);
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
public static class ellipticalAreaType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_ellipticalAreaType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ellipticalAreaType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ellipticalAreaType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ellipticalAreaType != null) {
      return ImmutableList.of(TAG_ellipticalAreaType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ellipticalAreaType from encoded stream.
   */
  public static ellipticalAreaType fromPerUnaligned(byte[] encodedBytes) {
    ellipticalAreaType result = new ellipticalAreaType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ellipticalAreaType from encoded stream.
   */
  public static ellipticalAreaType fromPerAligned(byte[] encodedBytes) {
    ellipticalAreaType result = new ellipticalAreaType();
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
    return "ellipticalAreaType = " + getValue() + ";\n";
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
public static class polygonAreaType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_polygonAreaType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public polygonAreaType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_polygonAreaType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_polygonAreaType != null) {
      return ImmutableList.of(TAG_polygonAreaType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new polygonAreaType from encoded stream.
   */
  public static polygonAreaType fromPerUnaligned(byte[] encodedBytes) {
    polygonAreaType result = new polygonAreaType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new polygonAreaType from encoded stream.
   */
  public static polygonAreaType fromPerAligned(byte[] encodedBytes) {
    polygonAreaType result = new polygonAreaType();
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
    return "polygonAreaType = " + getValue() + ";\n";
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
    builder.append("GeoAreaShapesSupported = {\n");
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
