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

package com.google.location.suplclient.asn1.supl2.supl_triggered_start;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.google.location.suplclient.asn1.base.Asn1Boolean;
import com.google.location.suplclient.asn1.base.Asn1Integer;
import com.google.location.suplclient.asn1.base.Asn1Object;
import com.google.location.suplclient.asn1.base.Asn1Sequence;
import com.google.location.suplclient.asn1.base.Asn1SequenceOf;
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
public  class AreaEventParams extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_AreaEventParams
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public AreaEventParams() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_AreaEventParams;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_AreaEventParams != null) {
      return ImmutableList.of(TAG_AreaEventParams);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new AreaEventParams from encoded stream.
   */
  public static AreaEventParams fromPerUnaligned(byte[] encodedBytes) {
    AreaEventParams result = new AreaEventParams();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new AreaEventParams from encoded stream.
   */
  public static AreaEventParams fromPerAligned(byte[] encodedBytes) {
    AreaEventParams result = new AreaEventParams();
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

  
  private AreaEventType areaEventType_;
  public AreaEventType getAreaEventType() {
    return areaEventType_;
  }
  /**
   * @throws ClassCastException if value is not a AreaEventType
   */
  public void setAreaEventType(Asn1Object value) {
    this.areaEventType_ = (AreaEventType) value;
  }
  public AreaEventType setAreaEventTypeToNewInstance() {
    areaEventType_ = new AreaEventType();
    return areaEventType_;
  }
  
  private AreaEventParams.locationEstimateType locationEstimate_;
  public AreaEventParams.locationEstimateType getLocationEstimate() {
    return locationEstimate_;
  }
  /**
   * @throws ClassCastException if value is not a AreaEventParams.locationEstimateType
   */
  public void setLocationEstimate(Asn1Object value) {
    this.locationEstimate_ = (AreaEventParams.locationEstimateType) value;
  }
  public AreaEventParams.locationEstimateType setLocationEstimateToNewInstance() {
    locationEstimate_ = new AreaEventParams.locationEstimateType();
    return locationEstimate_;
  }
  
  private RepeatedReportingParams repeatedReportingParams_;
  public RepeatedReportingParams getRepeatedReportingParams() {
    return repeatedReportingParams_;
  }
  /**
   * @throws ClassCastException if value is not a RepeatedReportingParams
   */
  public void setRepeatedReportingParams(Asn1Object value) {
    this.repeatedReportingParams_ = (RepeatedReportingParams) value;
  }
  public RepeatedReportingParams setRepeatedReportingParamsToNewInstance() {
    repeatedReportingParams_ = new RepeatedReportingParams();
    return repeatedReportingParams_;
  }
  
  private AreaEventParams.startTimeType startTime_;
  public AreaEventParams.startTimeType getStartTime() {
    return startTime_;
  }
  /**
   * @throws ClassCastException if value is not a AreaEventParams.startTimeType
   */
  public void setStartTime(Asn1Object value) {
    this.startTime_ = (AreaEventParams.startTimeType) value;
  }
  public AreaEventParams.startTimeType setStartTimeToNewInstance() {
    startTime_ = new AreaEventParams.startTimeType();
    return startTime_;
  }
  
  private AreaEventParams.stopTimeType stopTime_;
  public AreaEventParams.stopTimeType getStopTime() {
    return stopTime_;
  }
  /**
   * @throws ClassCastException if value is not a AreaEventParams.stopTimeType
   */
  public void setStopTime(Asn1Object value) {
    this.stopTime_ = (AreaEventParams.stopTimeType) value;
  }
  public AreaEventParams.stopTimeType setStopTimeToNewInstance() {
    stopTime_ = new AreaEventParams.stopTimeType();
    return stopTime_;
  }
  
  private GeographicTargetAreaList geographicTargetAreaList_;
  public GeographicTargetAreaList getGeographicTargetAreaList() {
    return geographicTargetAreaList_;
  }
  /**
   * @throws ClassCastException if value is not a GeographicTargetAreaList
   */
  public void setGeographicTargetAreaList(Asn1Object value) {
    this.geographicTargetAreaList_ = (GeographicTargetAreaList) value;
  }
  public GeographicTargetAreaList setGeographicTargetAreaListToNewInstance() {
    geographicTargetAreaList_ = new GeographicTargetAreaList();
    return geographicTargetAreaList_;
  }
  
  private AreaEventParams.areaIdListsType areaIdLists_;
  public AreaEventParams.areaIdListsType getAreaIdLists() {
    return areaIdLists_;
  }
  /**
   * @throws ClassCastException if value is not a AreaEventParams.areaIdListsType
   */
  public void setAreaIdLists(Asn1Object value) {
    this.areaIdLists_ = (AreaEventParams.areaIdListsType) value;
  }
  public AreaEventParams.areaIdListsType setAreaIdListsToNewInstance() {
    areaIdLists_ = new AreaEventParams.areaIdListsType();
    return areaIdLists_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getAreaEventType() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getAreaEventType();
          }

          @Override public void setToNewInstance() {
            setAreaEventTypeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? AreaEventType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "areaEventType : "
                    + getAreaEventType().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getLocationEstimate() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getLocationEstimate();
          }

          @Override public void setToNewInstance() {
            setLocationEstimateToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? AreaEventParams.locationEstimateType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "locationEstimate : "
                    + getLocationEstimate().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getRepeatedReportingParams() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getRepeatedReportingParams();
          }

          @Override public void setToNewInstance() {
            setRepeatedReportingParamsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? RepeatedReportingParams.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "repeatedReportingParams : "
                    + getRepeatedReportingParams().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getStartTime() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getStartTime();
          }

          @Override public void setToNewInstance() {
            setStartTimeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? AreaEventParams.startTimeType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "startTime : "
                    + getStartTime().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getStopTime() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getStopTime();
          }

          @Override public void setToNewInstance() {
            setStopTimeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? AreaEventParams.stopTimeType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "stopTime : "
                    + getStopTime().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getGeographicTargetAreaList() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGeographicTargetAreaList();
          }

          @Override public void setToNewInstance() {
            setGeographicTargetAreaListToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GeographicTargetAreaList.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "geographicTargetAreaList : "
                    + getGeographicTargetAreaList().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getAreaIdLists() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getAreaIdLists();
          }

          @Override public void setToNewInstance() {
            setAreaIdListsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? AreaEventParams.areaIdListsType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "areaIdLists : "
                    + getAreaIdLists().toIndentedString(indent);
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
public static class locationEstimateType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_locationEstimateType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public locationEstimateType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_locationEstimateType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_locationEstimateType != null) {
      return ImmutableList.of(TAG_locationEstimateType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new locationEstimateType from encoded stream.
   */
  public static locationEstimateType fromPerUnaligned(byte[] encodedBytes) {
    locationEstimateType result = new locationEstimateType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new locationEstimateType from encoded stream.
   */
  public static locationEstimateType fromPerAligned(byte[] encodedBytes) {
    locationEstimateType result = new locationEstimateType();
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
    return "locationEstimateType = " + getValue() + ";\n";
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
public static class startTimeType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_startTimeType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public startTimeType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("2678400"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_startTimeType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_startTimeType != null) {
      return ImmutableList.of(TAG_startTimeType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new startTimeType from encoded stream.
   */
  public static startTimeType fromPerUnaligned(byte[] encodedBytes) {
    startTimeType result = new startTimeType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new startTimeType from encoded stream.
   */
  public static startTimeType fromPerAligned(byte[] encodedBytes) {
    startTimeType result = new startTimeType();
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
    return "startTimeType = " + getInteger() + ";\n";
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
public static class stopTimeType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_stopTimeType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public stopTimeType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("11318399"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_stopTimeType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_stopTimeType != null) {
      return ImmutableList.of(TAG_stopTimeType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new stopTimeType from encoded stream.
   */
  public static stopTimeType fromPerUnaligned(byte[] encodedBytes) {
    stopTimeType result = new stopTimeType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new stopTimeType from encoded stream.
   */
  public static stopTimeType fromPerAligned(byte[] encodedBytes) {
    stopTimeType result = new stopTimeType();
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
    return "stopTimeType = " + getInteger() + ";\n";
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
public static class areaIdListsType
    extends Asn1SequenceOf<AreaIdList> {
  //

  private static final Asn1Tag TAG_areaIdListsType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public areaIdListsType() {
    super();
    setMinSize(1);
setMaxSize(32);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_areaIdListsType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_areaIdListsType != null) {
      return ImmutableList.of(TAG_areaIdListsType);
    } else {
      return Asn1SequenceOf.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new areaIdListsType from encoded stream.
   */
  public static areaIdListsType fromPerUnaligned(byte[] encodedBytes) {
    areaIdListsType result = new areaIdListsType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new areaIdListsType from encoded stream.
   */
  public static areaIdListsType fromPerAligned(byte[] encodedBytes) {
    areaIdListsType result = new areaIdListsType();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  
  @Override public AreaIdList createAndAddValue() {
    AreaIdList value = new AreaIdList();
    add(value);
    return value;
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
    builder.append("areaIdListsType = [\n");
    final String internalIndent = indent + "  ";
    for (AreaIdList value : getValues()) {
      builder.append(internalIndent)
          .append(value.toIndentedString(internalIndent));
    }
    builder.append(indent).append("];\n");
    return builder.toString();
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
    builder.append("AreaEventParams = {\n");
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
