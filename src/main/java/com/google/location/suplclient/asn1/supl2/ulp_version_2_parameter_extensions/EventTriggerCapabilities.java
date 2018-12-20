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
public  class EventTriggerCapabilities extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_EventTriggerCapabilities
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public EventTriggerCapabilities() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_EventTriggerCapabilities;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_EventTriggerCapabilities != null) {
      return ImmutableList.of(TAG_EventTriggerCapabilities);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new EventTriggerCapabilities from encoded stream.
   */
  public static EventTriggerCapabilities fromPerUnaligned(byte[] encodedBytes) {
    EventTriggerCapabilities result = new EventTriggerCapabilities();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new EventTriggerCapabilities from encoded stream.
   */
  public static EventTriggerCapabilities fromPerAligned(byte[] encodedBytes) {
    EventTriggerCapabilities result = new EventTriggerCapabilities();
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

  
  private GeoAreaShapesSupported geoAreaShapesSupported_;
  public GeoAreaShapesSupported getGeoAreaShapesSupported() {
    return geoAreaShapesSupported_;
  }
  /**
   * @throws ClassCastException if value is not a GeoAreaShapesSupported
   */
  public void setGeoAreaShapesSupported(Asn1Object value) {
    this.geoAreaShapesSupported_ = (GeoAreaShapesSupported) value;
  }
  public GeoAreaShapesSupported setGeoAreaShapesSupportedToNewInstance() {
    geoAreaShapesSupported_ = new GeoAreaShapesSupported();
    return geoAreaShapesSupported_;
  }
  
  private EventTriggerCapabilities.maxNumGeoAreaSupportedType maxNumGeoAreaSupported_;
  public EventTriggerCapabilities.maxNumGeoAreaSupportedType getMaxNumGeoAreaSupported() {
    return maxNumGeoAreaSupported_;
  }
  /**
   * @throws ClassCastException if value is not a EventTriggerCapabilities.maxNumGeoAreaSupportedType
   */
  public void setMaxNumGeoAreaSupported(Asn1Object value) {
    this.maxNumGeoAreaSupported_ = (EventTriggerCapabilities.maxNumGeoAreaSupportedType) value;
  }
  public EventTriggerCapabilities.maxNumGeoAreaSupportedType setMaxNumGeoAreaSupportedToNewInstance() {
    maxNumGeoAreaSupported_ = new EventTriggerCapabilities.maxNumGeoAreaSupportedType();
    return maxNumGeoAreaSupported_;
  }
  
  private EventTriggerCapabilities.maxAreaIdListSupportedType maxAreaIdListSupported_;
  public EventTriggerCapabilities.maxAreaIdListSupportedType getMaxAreaIdListSupported() {
    return maxAreaIdListSupported_;
  }
  /**
   * @throws ClassCastException if value is not a EventTriggerCapabilities.maxAreaIdListSupportedType
   */
  public void setMaxAreaIdListSupported(Asn1Object value) {
    this.maxAreaIdListSupported_ = (EventTriggerCapabilities.maxAreaIdListSupportedType) value;
  }
  public EventTriggerCapabilities.maxAreaIdListSupportedType setMaxAreaIdListSupportedToNewInstance() {
    maxAreaIdListSupported_ = new EventTriggerCapabilities.maxAreaIdListSupportedType();
    return maxAreaIdListSupported_;
  }
  
  private EventTriggerCapabilities.maxAreaIdSupportedPerListType maxAreaIdSupportedPerList_;
  public EventTriggerCapabilities.maxAreaIdSupportedPerListType getMaxAreaIdSupportedPerList() {
    return maxAreaIdSupportedPerList_;
  }
  /**
   * @throws ClassCastException if value is not a EventTriggerCapabilities.maxAreaIdSupportedPerListType
   */
  public void setMaxAreaIdSupportedPerList(Asn1Object value) {
    this.maxAreaIdSupportedPerList_ = (EventTriggerCapabilities.maxAreaIdSupportedPerListType) value;
  }
  public EventTriggerCapabilities.maxAreaIdSupportedPerListType setMaxAreaIdSupportedPerListToNewInstance() {
    maxAreaIdSupportedPerList_ = new EventTriggerCapabilities.maxAreaIdSupportedPerListType();
    return maxAreaIdSupportedPerList_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getGeoAreaShapesSupported() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGeoAreaShapesSupported();
          }

          @Override public void setToNewInstance() {
            setGeoAreaShapesSupportedToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GeoAreaShapesSupported.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "geoAreaShapesSupported : "
                    + getGeoAreaShapesSupported().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getMaxNumGeoAreaSupported() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getMaxNumGeoAreaSupported();
          }

          @Override public void setToNewInstance() {
            setMaxNumGeoAreaSupportedToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? EventTriggerCapabilities.maxNumGeoAreaSupportedType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "maxNumGeoAreaSupported : "
                    + getMaxNumGeoAreaSupported().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getMaxAreaIdListSupported() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getMaxAreaIdListSupported();
          }

          @Override public void setToNewInstance() {
            setMaxAreaIdListSupportedToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? EventTriggerCapabilities.maxAreaIdListSupportedType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "maxAreaIdListSupported : "
                    + getMaxAreaIdListSupported().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getMaxAreaIdSupportedPerList() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getMaxAreaIdSupportedPerList();
          }

          @Override public void setToNewInstance() {
            setMaxAreaIdSupportedPerListToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? EventTriggerCapabilities.maxAreaIdSupportedPerListType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "maxAreaIdSupportedPerList : "
                    + getMaxAreaIdSupportedPerList().toIndentedString(indent);
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
public static class maxNumGeoAreaSupportedType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_maxNumGeoAreaSupportedType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public maxNumGeoAreaSupportedType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("32"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_maxNumGeoAreaSupportedType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_maxNumGeoAreaSupportedType != null) {
      return ImmutableList.of(TAG_maxNumGeoAreaSupportedType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new maxNumGeoAreaSupportedType from encoded stream.
   */
  public static maxNumGeoAreaSupportedType fromPerUnaligned(byte[] encodedBytes) {
    maxNumGeoAreaSupportedType result = new maxNumGeoAreaSupportedType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new maxNumGeoAreaSupportedType from encoded stream.
   */
  public static maxNumGeoAreaSupportedType fromPerAligned(byte[] encodedBytes) {
    maxNumGeoAreaSupportedType result = new maxNumGeoAreaSupportedType();
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
    return "maxNumGeoAreaSupportedType = " + getInteger() + ";\n";
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
public static class maxAreaIdListSupportedType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_maxAreaIdListSupportedType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public maxAreaIdListSupportedType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("32"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_maxAreaIdListSupportedType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_maxAreaIdListSupportedType != null) {
      return ImmutableList.of(TAG_maxAreaIdListSupportedType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new maxAreaIdListSupportedType from encoded stream.
   */
  public static maxAreaIdListSupportedType fromPerUnaligned(byte[] encodedBytes) {
    maxAreaIdListSupportedType result = new maxAreaIdListSupportedType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new maxAreaIdListSupportedType from encoded stream.
   */
  public static maxAreaIdListSupportedType fromPerAligned(byte[] encodedBytes) {
    maxAreaIdListSupportedType result = new maxAreaIdListSupportedType();
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
    return "maxAreaIdListSupportedType = " + getInteger() + ";\n";
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
public static class maxAreaIdSupportedPerListType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_maxAreaIdSupportedPerListType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public maxAreaIdSupportedPerListType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("256"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_maxAreaIdSupportedPerListType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_maxAreaIdSupportedPerListType != null) {
      return ImmutableList.of(TAG_maxAreaIdSupportedPerListType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new maxAreaIdSupportedPerListType from encoded stream.
   */
  public static maxAreaIdSupportedPerListType fromPerUnaligned(byte[] encodedBytes) {
    maxAreaIdSupportedPerListType result = new maxAreaIdSupportedPerListType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new maxAreaIdSupportedPerListType from encoded stream.
   */
  public static maxAreaIdSupportedPerListType fromPerAligned(byte[] encodedBytes) {
    maxAreaIdSupportedPerListType result = new maxAreaIdSupportedPerListType();
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
    return "maxAreaIdSupportedPerListType = " + getInteger() + ";\n";
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
    builder.append("EventTriggerCapabilities = {\n");
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
