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
public  class GanssNavigationModelData extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GanssNavigationModelData
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GanssNavigationModelData() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GanssNavigationModelData;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GanssNavigationModelData != null) {
      return ImmutableList.of(TAG_GanssNavigationModelData);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GanssNavigationModelData from encoded stream.
   */
  public static GanssNavigationModelData fromPerUnaligned(byte[] encodedBytes) {
    GanssNavigationModelData result = new GanssNavigationModelData();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GanssNavigationModelData from encoded stream.
   */
  public static GanssNavigationModelData fromPerAligned(byte[] encodedBytes) {
    GanssNavigationModelData result = new GanssNavigationModelData();
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

  
  private GanssNavigationModelData.ganssWeekType ganssWeek_;
  public GanssNavigationModelData.ganssWeekType getGanssWeek() {
    return ganssWeek_;
  }
  /**
   * @throws ClassCastException if value is not a GanssNavigationModelData.ganssWeekType
   */
  public void setGanssWeek(Asn1Object value) {
    this.ganssWeek_ = (GanssNavigationModelData.ganssWeekType) value;
  }
  public GanssNavigationModelData.ganssWeekType setGanssWeekToNewInstance() {
    ganssWeek_ = new GanssNavigationModelData.ganssWeekType();
    return ganssWeek_;
  }
  
  private GanssNavigationModelData.ganssToeType ganssToe_;
  public GanssNavigationModelData.ganssToeType getGanssToe() {
    return ganssToe_;
  }
  /**
   * @throws ClassCastException if value is not a GanssNavigationModelData.ganssToeType
   */
  public void setGanssToe(Asn1Object value) {
    this.ganssToe_ = (GanssNavigationModelData.ganssToeType) value;
  }
  public GanssNavigationModelData.ganssToeType setGanssToeToNewInstance() {
    ganssToe_ = new GanssNavigationModelData.ganssToeType();
    return ganssToe_;
  }
  
  private GanssNavigationModelData.t_toeLimitType t_toeLimit_;
  public GanssNavigationModelData.t_toeLimitType getT_toeLimit() {
    return t_toeLimit_;
  }
  /**
   * @throws ClassCastException if value is not a GanssNavigationModelData.t_toeLimitType
   */
  public void setT_toeLimit(Asn1Object value) {
    this.t_toeLimit_ = (GanssNavigationModelData.t_toeLimitType) value;
  }
  public GanssNavigationModelData.t_toeLimitType setT_toeLimitToNewInstance() {
    t_toeLimit_ = new GanssNavigationModelData.t_toeLimitType();
    return t_toeLimit_;
  }
  
  private SatellitesListRelatedDataList satellitesListRelatedDataList_;
  public SatellitesListRelatedDataList getSatellitesListRelatedDataList() {
    return satellitesListRelatedDataList_;
  }
  /**
   * @throws ClassCastException if value is not a SatellitesListRelatedDataList
   */
  public void setSatellitesListRelatedDataList(Asn1Object value) {
    this.satellitesListRelatedDataList_ = (SatellitesListRelatedDataList) value;
  }
  public SatellitesListRelatedDataList setSatellitesListRelatedDataListToNewInstance() {
    satellitesListRelatedDataList_ = new SatellitesListRelatedDataList();
    return satellitesListRelatedDataList_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getGanssWeek() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssWeek();
          }

          @Override public void setToNewInstance() {
            setGanssWeekToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GanssNavigationModelData.ganssWeekType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssWeek : "
                    + getGanssWeek().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getGanssToe() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssToe();
          }

          @Override public void setToNewInstance() {
            setGanssToeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GanssNavigationModelData.ganssToeType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssToe : "
                    + getGanssToe().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getT_toeLimit() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getT_toeLimit();
          }

          @Override public void setToNewInstance() {
            setT_toeLimitToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GanssNavigationModelData.t_toeLimitType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "t_toeLimit : "
                    + getT_toeLimit().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getSatellitesListRelatedDataList() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getSatellitesListRelatedDataList();
          }

          @Override public void setToNewInstance() {
            setSatellitesListRelatedDataListToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SatellitesListRelatedDataList.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "satellitesListRelatedDataList : "
                    + getSatellitesListRelatedDataList().toIndentedString(indent);
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
public static class ganssWeekType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ganssWeekType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ganssWeekType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("4095"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ganssWeekType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ganssWeekType != null) {
      return ImmutableList.of(TAG_ganssWeekType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ganssWeekType from encoded stream.
   */
  public static ganssWeekType fromPerUnaligned(byte[] encodedBytes) {
    ganssWeekType result = new ganssWeekType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ganssWeekType from encoded stream.
   */
  public static ganssWeekType fromPerAligned(byte[] encodedBytes) {
    ganssWeekType result = new ganssWeekType();
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
    return "ganssWeekType = " + getInteger() + ";\n";
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
public static class ganssToeType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ganssToeType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ganssToeType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("167"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ganssToeType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ganssToeType != null) {
      return ImmutableList.of(TAG_ganssToeType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ganssToeType from encoded stream.
   */
  public static ganssToeType fromPerUnaligned(byte[] encodedBytes) {
    ganssToeType result = new ganssToeType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ganssToeType from encoded stream.
   */
  public static ganssToeType fromPerAligned(byte[] encodedBytes) {
    ganssToeType result = new ganssToeType();
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
    return "ganssToeType = " + getInteger() + ";\n";
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
public static class t_toeLimitType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_t_toeLimitType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public t_toeLimitType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("15"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_t_toeLimitType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_t_toeLimitType != null) {
      return ImmutableList.of(TAG_t_toeLimitType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new t_toeLimitType from encoded stream.
   */
  public static t_toeLimitType fromPerUnaligned(byte[] encodedBytes) {
    t_toeLimitType result = new t_toeLimitType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new t_toeLimitType from encoded stream.
   */
  public static t_toeLimitType fromPerAligned(byte[] encodedBytes) {
    t_toeLimitType result = new t_toeLimitType();
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
    return "t_toeLimitType = " + getInteger() + ";\n";
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
    builder.append("GanssNavigationModelData = {\n");
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
