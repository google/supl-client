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

package com.google.location.suplclient.asn1.supl2.rrlp_components_ver12;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.google.location.suplclient.asn1.base.Asn1Null;
import com.google.location.suplclient.asn1.base.Asn1Object;
import com.google.location.suplclient.asn1.base.Asn1Sequence;
import com.google.location.suplclient.asn1.base.Asn1Tag;
import com.google.location.suplclient.asn1.base.BitStream;
import com.google.location.suplclient.asn1.base.BitStreamReader;
import com.google.location.suplclient.asn1.base.SequenceComponent;
import com.google.location.suplclient.asn1.supl2.rrlp_components.Add_GPS_AssistData;
import com.google.location.suplclient.asn1.supl2.rrlp_components.GANSSPositioningMethod;
import com.google.location.suplclient.asn1.supl2.rrlp_components.RequiredResponseTime;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
* 
*/
public  class Rel7_MsrPosition_Req_Extension extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_Rel7_MsrPosition_Req_Extension
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public Rel7_MsrPosition_Req_Extension() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_Rel7_MsrPosition_Req_Extension;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_Rel7_MsrPosition_Req_Extension != null) {
      return ImmutableList.of(TAG_Rel7_MsrPosition_Req_Extension);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new Rel7_MsrPosition_Req_Extension from encoded stream.
   */
  public static Rel7_MsrPosition_Req_Extension fromPerUnaligned(byte[] encodedBytes) {
    Rel7_MsrPosition_Req_Extension result = new Rel7_MsrPosition_Req_Extension();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new Rel7_MsrPosition_Req_Extension from encoded stream.
   */
  public static Rel7_MsrPosition_Req_Extension fromPerAligned(byte[] encodedBytes) {
    Rel7_MsrPosition_Req_Extension result = new Rel7_MsrPosition_Req_Extension();
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

  
  private Rel7_MsrPosition_Req_Extension.velocityRequestedType velocityRequested_;
  public Rel7_MsrPosition_Req_Extension.velocityRequestedType getVelocityRequested() {
    return velocityRequested_;
  }
  /**
   * @throws ClassCastException if value is not a Rel7_MsrPosition_Req_Extension.velocityRequestedType
   */
  public void setVelocityRequested(Asn1Object value) {
    this.velocityRequested_ = (Rel7_MsrPosition_Req_Extension.velocityRequestedType) value;
  }
  public Rel7_MsrPosition_Req_Extension.velocityRequestedType setVelocityRequestedToNewInstance() {
    velocityRequested_ = new Rel7_MsrPosition_Req_Extension.velocityRequestedType();
    return velocityRequested_;
  }
  
  private GANSSPositioningMethod ganssPositionMethod_;
  public GANSSPositioningMethod getGanssPositionMethod() {
    return ganssPositionMethod_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSPositioningMethod
   */
  public void setGanssPositionMethod(Asn1Object value) {
    this.ganssPositionMethod_ = (GANSSPositioningMethod) value;
  }
  public GANSSPositioningMethod setGanssPositionMethodToNewInstance() {
    ganssPositionMethod_ = new GANSSPositioningMethod();
    return ganssPositionMethod_;
  }
  
  private GANSS_AssistData ganss_AssistData_;
  public GANSS_AssistData getGanss_AssistData() {
    return ganss_AssistData_;
  }
  /**
   * @throws ClassCastException if value is not a GANSS_AssistData
   */
  public void setGanss_AssistData(Asn1Object value) {
    this.ganss_AssistData_ = (GANSS_AssistData) value;
  }
  public GANSS_AssistData setGanss_AssistDataToNewInstance() {
    ganss_AssistData_ = new GANSS_AssistData();
    return ganss_AssistData_;
  }
  
  private Rel7_MsrPosition_Req_Extension.ganssCarrierPhaseMeasurementRequestType ganssCarrierPhaseMeasurementRequest_;
  public Rel7_MsrPosition_Req_Extension.ganssCarrierPhaseMeasurementRequestType getGanssCarrierPhaseMeasurementRequest() {
    return ganssCarrierPhaseMeasurementRequest_;
  }
  /**
   * @throws ClassCastException if value is not a Rel7_MsrPosition_Req_Extension.ganssCarrierPhaseMeasurementRequestType
   */
  public void setGanssCarrierPhaseMeasurementRequest(Asn1Object value) {
    this.ganssCarrierPhaseMeasurementRequest_ = (Rel7_MsrPosition_Req_Extension.ganssCarrierPhaseMeasurementRequestType) value;
  }
  public Rel7_MsrPosition_Req_Extension.ganssCarrierPhaseMeasurementRequestType setGanssCarrierPhaseMeasurementRequestToNewInstance() {
    ganssCarrierPhaseMeasurementRequest_ = new Rel7_MsrPosition_Req_Extension.ganssCarrierPhaseMeasurementRequestType();
    return ganssCarrierPhaseMeasurementRequest_;
  }
  
  private Rel7_MsrPosition_Req_Extension.ganssTODGSMTimeAssociationMeasurementRequestType ganssTODGSMTimeAssociationMeasurementRequest_;
  public Rel7_MsrPosition_Req_Extension.ganssTODGSMTimeAssociationMeasurementRequestType getGanssTODGSMTimeAssociationMeasurementRequest() {
    return ganssTODGSMTimeAssociationMeasurementRequest_;
  }
  /**
   * @throws ClassCastException if value is not a Rel7_MsrPosition_Req_Extension.ganssTODGSMTimeAssociationMeasurementRequestType
   */
  public void setGanssTODGSMTimeAssociationMeasurementRequest(Asn1Object value) {
    this.ganssTODGSMTimeAssociationMeasurementRequest_ = (Rel7_MsrPosition_Req_Extension.ganssTODGSMTimeAssociationMeasurementRequestType) value;
  }
  public Rel7_MsrPosition_Req_Extension.ganssTODGSMTimeAssociationMeasurementRequestType setGanssTODGSMTimeAssociationMeasurementRequestToNewInstance() {
    ganssTODGSMTimeAssociationMeasurementRequest_ = new Rel7_MsrPosition_Req_Extension.ganssTODGSMTimeAssociationMeasurementRequestType();
    return ganssTODGSMTimeAssociationMeasurementRequest_;
  }
  
  private RequiredResponseTime requiredResponseTime_;
  public RequiredResponseTime getRequiredResponseTime() {
    return requiredResponseTime_;
  }
  /**
   * @throws ClassCastException if value is not a RequiredResponseTime
   */
  public void setRequiredResponseTime(Asn1Object value) {
    this.requiredResponseTime_ = (RequiredResponseTime) value;
  }
  public RequiredResponseTime setRequiredResponseTimeToNewInstance() {
    requiredResponseTime_ = new RequiredResponseTime();
    return requiredResponseTime_;
  }
  
  private Add_GPS_AssistData add_GPS_AssistData_;
  public Add_GPS_AssistData getAdd_GPS_AssistData() {
    return add_GPS_AssistData_;
  }
  /**
   * @throws ClassCastException if value is not a Add_GPS_AssistData
   */
  public void setAdd_GPS_AssistData(Asn1Object value) {
    this.add_GPS_AssistData_ = (Add_GPS_AssistData) value;
  }
  public Add_GPS_AssistData setAdd_GPS_AssistDataToNewInstance() {
    add_GPS_AssistData_ = new Add_GPS_AssistData();
    return add_GPS_AssistData_;
  }
  
  private Rel7_MsrPosition_Req_Extension.ganssMultiFreqMeasurementRequestType ganssMultiFreqMeasurementRequest_;
  public Rel7_MsrPosition_Req_Extension.ganssMultiFreqMeasurementRequestType getGanssMultiFreqMeasurementRequest() {
    return ganssMultiFreqMeasurementRequest_;
  }
  /**
   * @throws ClassCastException if value is not a Rel7_MsrPosition_Req_Extension.ganssMultiFreqMeasurementRequestType
   */
  public void setGanssMultiFreqMeasurementRequest(Asn1Object value) {
    this.ganssMultiFreqMeasurementRequest_ = (Rel7_MsrPosition_Req_Extension.ganssMultiFreqMeasurementRequestType) value;
  }
  public Rel7_MsrPosition_Req_Extension.ganssMultiFreqMeasurementRequestType setGanssMultiFreqMeasurementRequestToNewInstance() {
    ganssMultiFreqMeasurementRequest_ = new Rel7_MsrPosition_Req_Extension.ganssMultiFreqMeasurementRequestType();
    return ganssMultiFreqMeasurementRequest_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getVelocityRequested() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getVelocityRequested();
          }

          @Override public void setToNewInstance() {
            setVelocityRequestedToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Rel7_MsrPosition_Req_Extension.velocityRequestedType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "velocityRequested : "
                    + getVelocityRequested().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getGanssPositionMethod() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssPositionMethod();
          }

          @Override public void setToNewInstance() {
            setGanssPositionMethodToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSPositioningMethod.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssPositionMethod : "
                    + getGanssPositionMethod().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getGanss_AssistData() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanss_AssistData();
          }

          @Override public void setToNewInstance() {
            setGanss_AssistDataToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSS_AssistData.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganss_AssistData : "
                    + getGanss_AssistData().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getGanssCarrierPhaseMeasurementRequest() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssCarrierPhaseMeasurementRequest();
          }

          @Override public void setToNewInstance() {
            setGanssCarrierPhaseMeasurementRequestToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Rel7_MsrPosition_Req_Extension.ganssCarrierPhaseMeasurementRequestType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssCarrierPhaseMeasurementRequest : "
                    + getGanssCarrierPhaseMeasurementRequest().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getGanssTODGSMTimeAssociationMeasurementRequest() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssTODGSMTimeAssociationMeasurementRequest();
          }

          @Override public void setToNewInstance() {
            setGanssTODGSMTimeAssociationMeasurementRequestToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Rel7_MsrPosition_Req_Extension.ganssTODGSMTimeAssociationMeasurementRequestType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssTODGSMTimeAssociationMeasurementRequest : "
                    + getGanssTODGSMTimeAssociationMeasurementRequest().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getRequiredResponseTime() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getRequiredResponseTime();
          }

          @Override public void setToNewInstance() {
            setRequiredResponseTimeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? RequiredResponseTime.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "requiredResponseTime : "
                    + getRequiredResponseTime().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getAdd_GPS_AssistData() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getAdd_GPS_AssistData();
          }

          @Override public void setToNewInstance() {
            setAdd_GPS_AssistDataToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Add_GPS_AssistData.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "add_GPS_AssistData : "
                    + getAdd_GPS_AssistData().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 7);

          @Override public boolean isExplicitlySet() {
            return getGanssMultiFreqMeasurementRequest() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssMultiFreqMeasurementRequest();
          }

          @Override public void setToNewInstance() {
            setGanssMultiFreqMeasurementRequestToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Rel7_MsrPosition_Req_Extension.ganssMultiFreqMeasurementRequestType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssMultiFreqMeasurementRequest : "
                    + getGanssMultiFreqMeasurementRequest().toIndentedString(indent);
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
public static class velocityRequestedType extends Asn1Null {
  //

  private static final Asn1Tag TAG_velocityRequestedType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public velocityRequestedType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_velocityRequestedType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_velocityRequestedType != null) {
      return ImmutableList.of(TAG_velocityRequestedType);
    } else {
      return Asn1Null.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new velocityRequestedType from encoded stream.
   */
  public static velocityRequestedType fromPerUnaligned(byte[] encodedBytes) {
    velocityRequestedType result = new velocityRequestedType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new velocityRequestedType from encoded stream.
   */
  public static velocityRequestedType fromPerAligned(byte[] encodedBytes) {
    velocityRequestedType result = new velocityRequestedType();
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
    return "velocityRequestedType (null value);\n";
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
public static class ganssCarrierPhaseMeasurementRequestType extends Asn1Null {
  //

  private static final Asn1Tag TAG_ganssCarrierPhaseMeasurementRequestType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ganssCarrierPhaseMeasurementRequestType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ganssCarrierPhaseMeasurementRequestType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ganssCarrierPhaseMeasurementRequestType != null) {
      return ImmutableList.of(TAG_ganssCarrierPhaseMeasurementRequestType);
    } else {
      return Asn1Null.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ganssCarrierPhaseMeasurementRequestType from encoded stream.
   */
  public static ganssCarrierPhaseMeasurementRequestType fromPerUnaligned(byte[] encodedBytes) {
    ganssCarrierPhaseMeasurementRequestType result = new ganssCarrierPhaseMeasurementRequestType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ganssCarrierPhaseMeasurementRequestType from encoded stream.
   */
  public static ganssCarrierPhaseMeasurementRequestType fromPerAligned(byte[] encodedBytes) {
    ganssCarrierPhaseMeasurementRequestType result = new ganssCarrierPhaseMeasurementRequestType();
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
    return "ganssCarrierPhaseMeasurementRequestType (null value);\n";
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
public static class ganssTODGSMTimeAssociationMeasurementRequestType extends Asn1Null {
  //

  private static final Asn1Tag TAG_ganssTODGSMTimeAssociationMeasurementRequestType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ganssTODGSMTimeAssociationMeasurementRequestType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ganssTODGSMTimeAssociationMeasurementRequestType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ganssTODGSMTimeAssociationMeasurementRequestType != null) {
      return ImmutableList.of(TAG_ganssTODGSMTimeAssociationMeasurementRequestType);
    } else {
      return Asn1Null.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ganssTODGSMTimeAssociationMeasurementRequestType from encoded stream.
   */
  public static ganssTODGSMTimeAssociationMeasurementRequestType fromPerUnaligned(byte[] encodedBytes) {
    ganssTODGSMTimeAssociationMeasurementRequestType result = new ganssTODGSMTimeAssociationMeasurementRequestType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ganssTODGSMTimeAssociationMeasurementRequestType from encoded stream.
   */
  public static ganssTODGSMTimeAssociationMeasurementRequestType fromPerAligned(byte[] encodedBytes) {
    ganssTODGSMTimeAssociationMeasurementRequestType result = new ganssTODGSMTimeAssociationMeasurementRequestType();
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
    return "ganssTODGSMTimeAssociationMeasurementRequestType (null value);\n";
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
public static class ganssMultiFreqMeasurementRequestType extends Asn1Null {
  //

  private static final Asn1Tag TAG_ganssMultiFreqMeasurementRequestType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ganssMultiFreqMeasurementRequestType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ganssMultiFreqMeasurementRequestType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ganssMultiFreqMeasurementRequestType != null) {
      return ImmutableList.of(TAG_ganssMultiFreqMeasurementRequestType);
    } else {
      return Asn1Null.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ganssMultiFreqMeasurementRequestType from encoded stream.
   */
  public static ganssMultiFreqMeasurementRequestType fromPerUnaligned(byte[] encodedBytes) {
    ganssMultiFreqMeasurementRequestType result = new ganssMultiFreqMeasurementRequestType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ganssMultiFreqMeasurementRequestType from encoded stream.
   */
  public static ganssMultiFreqMeasurementRequestType fromPerAligned(byte[] encodedBytes) {
    ganssMultiFreqMeasurementRequestType result = new ganssMultiFreqMeasurementRequestType();
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
    return "ganssMultiFreqMeasurementRequestType (null value);\n";
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
    builder.append("Rel7_MsrPosition_Req_Extension = {\n");
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
