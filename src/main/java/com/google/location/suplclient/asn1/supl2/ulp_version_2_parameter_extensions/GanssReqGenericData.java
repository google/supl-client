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
import com.google.location.suplclient.asn1.base.Asn1BitString;
import com.google.location.suplclient.asn1.base.Asn1Boolean;
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
public  class GanssReqGenericData extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GanssReqGenericData
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GanssReqGenericData() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GanssReqGenericData;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GanssReqGenericData != null) {
      return ImmutableList.of(TAG_GanssReqGenericData);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GanssReqGenericData from encoded stream.
   */
  public static GanssReqGenericData fromPerUnaligned(byte[] encodedBytes) {
    GanssReqGenericData result = new GanssReqGenericData();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GanssReqGenericData from encoded stream.
   */
  public static GanssReqGenericData fromPerAligned(byte[] encodedBytes) {
    GanssReqGenericData result = new GanssReqGenericData();
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

  
  private GanssReqGenericData.ganssIdType ganssId_;
  public GanssReqGenericData.ganssIdType getGanssId() {
    return ganssId_;
  }
  /**
   * @throws ClassCastException if value is not a GanssReqGenericData.ganssIdType
   */
  public void setGanssId(Asn1Object value) {
    this.ganssId_ = (GanssReqGenericData.ganssIdType) value;
  }
  public GanssReqGenericData.ganssIdType setGanssIdToNewInstance() {
    ganssId_ = new GanssReqGenericData.ganssIdType();
    return ganssId_;
  }
  
  private GanssReqGenericData.ganssSBASidType ganssSBASid_;
  public GanssReqGenericData.ganssSBASidType getGanssSBASid() {
    return ganssSBASid_;
  }
  /**
   * @throws ClassCastException if value is not a GanssReqGenericData.ganssSBASidType
   */
  public void setGanssSBASid(Asn1Object value) {
    this.ganssSBASid_ = (GanssReqGenericData.ganssSBASidType) value;
  }
  public GanssReqGenericData.ganssSBASidType setGanssSBASidToNewInstance() {
    ganssSBASid_ = new GanssReqGenericData.ganssSBASidType();
    return ganssSBASid_;
  }
  
  private GanssReqGenericData.ganssRealTimeIntegrityType ganssRealTimeIntegrity_;
  public GanssReqGenericData.ganssRealTimeIntegrityType getGanssRealTimeIntegrity() {
    return ganssRealTimeIntegrity_;
  }
  /**
   * @throws ClassCastException if value is not a GanssReqGenericData.ganssRealTimeIntegrityType
   */
  public void setGanssRealTimeIntegrity(Asn1Object value) {
    this.ganssRealTimeIntegrity_ = (GanssReqGenericData.ganssRealTimeIntegrityType) value;
  }
  public GanssReqGenericData.ganssRealTimeIntegrityType setGanssRealTimeIntegrityToNewInstance() {
    ganssRealTimeIntegrity_ = new GanssReqGenericData.ganssRealTimeIntegrityType();
    return ganssRealTimeIntegrity_;
  }
  
  private DGANSS_Sig_Id_Req ganssDifferentialCorrection_;
  public DGANSS_Sig_Id_Req getGanssDifferentialCorrection() {
    return ganssDifferentialCorrection_;
  }
  /**
   * @throws ClassCastException if value is not a DGANSS_Sig_Id_Req
   */
  public void setGanssDifferentialCorrection(Asn1Object value) {
    this.ganssDifferentialCorrection_ = (DGANSS_Sig_Id_Req) value;
  }
  public DGANSS_Sig_Id_Req setGanssDifferentialCorrectionToNewInstance() {
    ganssDifferentialCorrection_ = new DGANSS_Sig_Id_Req();
    return ganssDifferentialCorrection_;
  }
  
  private GanssReqGenericData.ganssAlmanacType ganssAlmanac_;
  public GanssReqGenericData.ganssAlmanacType getGanssAlmanac() {
    return ganssAlmanac_;
  }
  /**
   * @throws ClassCastException if value is not a GanssReqGenericData.ganssAlmanacType
   */
  public void setGanssAlmanac(Asn1Object value) {
    this.ganssAlmanac_ = (GanssReqGenericData.ganssAlmanacType) value;
  }
  public GanssReqGenericData.ganssAlmanacType setGanssAlmanacToNewInstance() {
    ganssAlmanac_ = new GanssReqGenericData.ganssAlmanacType();
    return ganssAlmanac_;
  }
  
  private GanssNavigationModelData ganssNavigationModelData_;
  public GanssNavigationModelData getGanssNavigationModelData() {
    return ganssNavigationModelData_;
  }
  /**
   * @throws ClassCastException if value is not a GanssNavigationModelData
   */
  public void setGanssNavigationModelData(Asn1Object value) {
    this.ganssNavigationModelData_ = (GanssNavigationModelData) value;
  }
  public GanssNavigationModelData setGanssNavigationModelDataToNewInstance() {
    ganssNavigationModelData_ = new GanssNavigationModelData();
    return ganssNavigationModelData_;
  }
  
  private GanssReqGenericData.ganssTimeModelsType ganssTimeModels_;
  public GanssReqGenericData.ganssTimeModelsType getGanssTimeModels() {
    return ganssTimeModels_;
  }
  /**
   * @throws ClassCastException if value is not a GanssReqGenericData.ganssTimeModelsType
   */
  public void setGanssTimeModels(Asn1Object value) {
    this.ganssTimeModels_ = (GanssReqGenericData.ganssTimeModelsType) value;
  }
  public GanssReqGenericData.ganssTimeModelsType setGanssTimeModelsToNewInstance() {
    ganssTimeModels_ = new GanssReqGenericData.ganssTimeModelsType();
    return ganssTimeModels_;
  }
  
  private GanssReqGenericData.ganssReferenceMeasurementInfoType ganssReferenceMeasurementInfo_;
  public GanssReqGenericData.ganssReferenceMeasurementInfoType getGanssReferenceMeasurementInfo() {
    return ganssReferenceMeasurementInfo_;
  }
  /**
   * @throws ClassCastException if value is not a GanssReqGenericData.ganssReferenceMeasurementInfoType
   */
  public void setGanssReferenceMeasurementInfo(Asn1Object value) {
    this.ganssReferenceMeasurementInfo_ = (GanssReqGenericData.ganssReferenceMeasurementInfoType) value;
  }
  public GanssReqGenericData.ganssReferenceMeasurementInfoType setGanssReferenceMeasurementInfoToNewInstance() {
    ganssReferenceMeasurementInfo_ = new GanssReqGenericData.ganssReferenceMeasurementInfoType();
    return ganssReferenceMeasurementInfo_;
  }
  
  private GanssDataBits ganssDataBits_;
  public GanssDataBits getGanssDataBits() {
    return ganssDataBits_;
  }
  /**
   * @throws ClassCastException if value is not a GanssDataBits
   */
  public void setGanssDataBits(Asn1Object value) {
    this.ganssDataBits_ = (GanssDataBits) value;
  }
  public GanssDataBits setGanssDataBitsToNewInstance() {
    ganssDataBits_ = new GanssDataBits();
    return ganssDataBits_;
  }
  
  private GanssReqGenericData.ganssUTCModelType ganssUTCModel_;
  public GanssReqGenericData.ganssUTCModelType getGanssUTCModel() {
    return ganssUTCModel_;
  }
  /**
   * @throws ClassCastException if value is not a GanssReqGenericData.ganssUTCModelType
   */
  public void setGanssUTCModel(Asn1Object value) {
    this.ganssUTCModel_ = (GanssReqGenericData.ganssUTCModelType) value;
  }
  public GanssReqGenericData.ganssUTCModelType setGanssUTCModelToNewInstance() {
    ganssUTCModel_ = new GanssReqGenericData.ganssUTCModelType();
    return ganssUTCModel_;
  }
  
  private GanssAdditionalDataChoices ganssAdditionalDataChoices_;
  public GanssAdditionalDataChoices getGanssAdditionalDataChoices() {
    return ganssAdditionalDataChoices_;
  }
  /**
   * @throws ClassCastException if value is not a GanssAdditionalDataChoices
   */
  public void setGanssAdditionalDataChoices(Asn1Object value) {
    this.ganssAdditionalDataChoices_ = (GanssAdditionalDataChoices) value;
  }
  public GanssAdditionalDataChoices setGanssAdditionalDataChoicesToNewInstance() {
    ganssAdditionalDataChoices_ = new GanssAdditionalDataChoices();
    return ganssAdditionalDataChoices_;
  }
  
  private GanssReqGenericData.ganssAuxiliaryInformationType ganssAuxiliaryInformation_;
  public GanssReqGenericData.ganssAuxiliaryInformationType getGanssAuxiliaryInformation() {
    return ganssAuxiliaryInformation_;
  }
  /**
   * @throws ClassCastException if value is not a GanssReqGenericData.ganssAuxiliaryInformationType
   */
  public void setGanssAuxiliaryInformation(Asn1Object value) {
    this.ganssAuxiliaryInformation_ = (GanssReqGenericData.ganssAuxiliaryInformationType) value;
  }
  public GanssReqGenericData.ganssAuxiliaryInformationType setGanssAuxiliaryInformationToNewInstance() {
    ganssAuxiliaryInformation_ = new GanssReqGenericData.ganssAuxiliaryInformationType();
    return ganssAuxiliaryInformation_;
  }
  
  private ExtendedEphemeris ganssExtendedEphemeris_;
  public ExtendedEphemeris getGanssExtendedEphemeris() {
    return ganssExtendedEphemeris_;
  }
  /**
   * @throws ClassCastException if value is not a ExtendedEphemeris
   */
  public void setGanssExtendedEphemeris(Asn1Object value) {
    this.ganssExtendedEphemeris_ = (ExtendedEphemeris) value;
  }
  public ExtendedEphemeris setGanssExtendedEphemerisToNewInstance() {
    ganssExtendedEphemeris_ = new ExtendedEphemeris();
    return ganssExtendedEphemeris_;
  }
  
  private GanssExtendedEphCheck ganssExtendedEphemerisCheck_;
  public GanssExtendedEphCheck getGanssExtendedEphemerisCheck() {
    return ganssExtendedEphemerisCheck_;
  }
  /**
   * @throws ClassCastException if value is not a GanssExtendedEphCheck
   */
  public void setGanssExtendedEphemerisCheck(Asn1Object value) {
    this.ganssExtendedEphemerisCheck_ = (GanssExtendedEphCheck) value;
  }
  public GanssExtendedEphCheck setGanssExtendedEphemerisCheckToNewInstance() {
    ganssExtendedEphemerisCheck_ = new GanssExtendedEphCheck();
    return ganssExtendedEphemerisCheck_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getGanssId() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssId();
          }

          @Override public void setToNewInstance() {
            setGanssIdToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GanssReqGenericData.ganssIdType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssId : "
                    + getGanssId().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getGanssSBASid() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssSBASid();
          }

          @Override public void setToNewInstance() {
            setGanssSBASidToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GanssReqGenericData.ganssSBASidType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssSBASid : "
                    + getGanssSBASid().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getGanssRealTimeIntegrity() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssRealTimeIntegrity();
          }

          @Override public void setToNewInstance() {
            setGanssRealTimeIntegrityToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GanssReqGenericData.ganssRealTimeIntegrityType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssRealTimeIntegrity : "
                    + getGanssRealTimeIntegrity().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getGanssDifferentialCorrection() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssDifferentialCorrection();
          }

          @Override public void setToNewInstance() {
            setGanssDifferentialCorrectionToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? DGANSS_Sig_Id_Req.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssDifferentialCorrection : "
                    + getGanssDifferentialCorrection().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getGanssAlmanac() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssAlmanac();
          }

          @Override public void setToNewInstance() {
            setGanssAlmanacToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GanssReqGenericData.ganssAlmanacType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssAlmanac : "
                    + getGanssAlmanac().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getGanssNavigationModelData() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssNavigationModelData();
          }

          @Override public void setToNewInstance() {
            setGanssNavigationModelDataToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GanssNavigationModelData.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssNavigationModelData : "
                    + getGanssNavigationModelData().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getGanssTimeModels() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssTimeModels();
          }

          @Override public void setToNewInstance() {
            setGanssTimeModelsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GanssReqGenericData.ganssTimeModelsType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssTimeModels : "
                    + getGanssTimeModels().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 7);

          @Override public boolean isExplicitlySet() {
            return getGanssReferenceMeasurementInfo() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssReferenceMeasurementInfo();
          }

          @Override public void setToNewInstance() {
            setGanssReferenceMeasurementInfoToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GanssReqGenericData.ganssReferenceMeasurementInfoType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssReferenceMeasurementInfo : "
                    + getGanssReferenceMeasurementInfo().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 8);

          @Override public boolean isExplicitlySet() {
            return getGanssDataBits() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssDataBits();
          }

          @Override public void setToNewInstance() {
            setGanssDataBitsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GanssDataBits.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssDataBits : "
                    + getGanssDataBits().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 9);

          @Override public boolean isExplicitlySet() {
            return getGanssUTCModel() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssUTCModel();
          }

          @Override public void setToNewInstance() {
            setGanssUTCModelToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GanssReqGenericData.ganssUTCModelType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssUTCModel : "
                    + getGanssUTCModel().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 10);

          @Override public boolean isExplicitlySet() {
            return getGanssAdditionalDataChoices() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssAdditionalDataChoices();
          }

          @Override public void setToNewInstance() {
            setGanssAdditionalDataChoicesToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GanssAdditionalDataChoices.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssAdditionalDataChoices : "
                    + getGanssAdditionalDataChoices().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 11);

          @Override public boolean isExplicitlySet() {
            return getGanssAuxiliaryInformation() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssAuxiliaryInformation();
          }

          @Override public void setToNewInstance() {
            setGanssAuxiliaryInformationToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GanssReqGenericData.ganssAuxiliaryInformationType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssAuxiliaryInformation : "
                    + getGanssAuxiliaryInformation().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 12);

          @Override public boolean isExplicitlySet() {
            return getGanssExtendedEphemeris() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssExtendedEphemeris();
          }

          @Override public void setToNewInstance() {
            setGanssExtendedEphemerisToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ExtendedEphemeris.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssExtendedEphemeris : "
                    + getGanssExtendedEphemeris().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 13);

          @Override public boolean isExplicitlySet() {
            return getGanssExtendedEphemerisCheck() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssExtendedEphemerisCheck();
          }

          @Override public void setToNewInstance() {
            setGanssExtendedEphemerisCheckToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GanssExtendedEphCheck.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssExtendedEphemerisCheck : "
                    + getGanssExtendedEphemerisCheck().toIndentedString(indent);
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
public static class ganssIdType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ganssIdType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ganssIdType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("15"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ganssIdType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ganssIdType != null) {
      return ImmutableList.of(TAG_ganssIdType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ganssIdType from encoded stream.
   */
  public static ganssIdType fromPerUnaligned(byte[] encodedBytes) {
    ganssIdType result = new ganssIdType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ganssIdType from encoded stream.
   */
  public static ganssIdType fromPerAligned(byte[] encodedBytes) {
    ganssIdType result = new ganssIdType();
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
    return "ganssIdType = " + getInteger() + ";\n";
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
public static class ganssSBASidType extends Asn1BitString {
  //

  // defined bit positions, if any
  

  // setters
  

  // clearers
  


  private static final Asn1Tag TAG_ganssSBASidType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ganssSBASidType() {
    super();
    setMinSize(3);
setMaxSize(3);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ganssSBASidType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ganssSBASidType != null) {
      return ImmutableList.of(TAG_ganssSBASidType);
    } else {
      return Asn1BitString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ganssSBASidType from encoded stream.
   */
  public static ganssSBASidType fromPerUnaligned(byte[] encodedBytes) {
    ganssSBASidType result = new ganssSBASidType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ganssSBASidType from encoded stream.
   */
  public static ganssSBASidType fromPerAligned(byte[] encodedBytes) {
    ganssSBASidType result = new ganssSBASidType();
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
    return "ganssSBASidType = " + getValue() + ";\n";
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
public static class ganssRealTimeIntegrityType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_ganssRealTimeIntegrityType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ganssRealTimeIntegrityType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ganssRealTimeIntegrityType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ganssRealTimeIntegrityType != null) {
      return ImmutableList.of(TAG_ganssRealTimeIntegrityType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ganssRealTimeIntegrityType from encoded stream.
   */
  public static ganssRealTimeIntegrityType fromPerUnaligned(byte[] encodedBytes) {
    ganssRealTimeIntegrityType result = new ganssRealTimeIntegrityType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ganssRealTimeIntegrityType from encoded stream.
   */
  public static ganssRealTimeIntegrityType fromPerAligned(byte[] encodedBytes) {
    ganssRealTimeIntegrityType result = new ganssRealTimeIntegrityType();
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
    return "ganssRealTimeIntegrityType = " + getValue() + ";\n";
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
public static class ganssAlmanacType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_ganssAlmanacType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ganssAlmanacType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ganssAlmanacType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ganssAlmanacType != null) {
      return ImmutableList.of(TAG_ganssAlmanacType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ganssAlmanacType from encoded stream.
   */
  public static ganssAlmanacType fromPerUnaligned(byte[] encodedBytes) {
    ganssAlmanacType result = new ganssAlmanacType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ganssAlmanacType from encoded stream.
   */
  public static ganssAlmanacType fromPerAligned(byte[] encodedBytes) {
    ganssAlmanacType result = new ganssAlmanacType();
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
    return "ganssAlmanacType = " + getValue() + ";\n";
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
public static class ganssTimeModelsType extends Asn1BitString {
  //

  // defined bit positions, if any
  

  // setters
  

  // clearers
  


  private static final Asn1Tag TAG_ganssTimeModelsType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ganssTimeModelsType() {
    super();
    setMinSize(16);
setMaxSize(16);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ganssTimeModelsType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ganssTimeModelsType != null) {
      return ImmutableList.of(TAG_ganssTimeModelsType);
    } else {
      return Asn1BitString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ganssTimeModelsType from encoded stream.
   */
  public static ganssTimeModelsType fromPerUnaligned(byte[] encodedBytes) {
    ganssTimeModelsType result = new ganssTimeModelsType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ganssTimeModelsType from encoded stream.
   */
  public static ganssTimeModelsType fromPerAligned(byte[] encodedBytes) {
    ganssTimeModelsType result = new ganssTimeModelsType();
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
    return "ganssTimeModelsType = " + getValue() + ";\n";
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
public static class ganssReferenceMeasurementInfoType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_ganssReferenceMeasurementInfoType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ganssReferenceMeasurementInfoType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ganssReferenceMeasurementInfoType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ganssReferenceMeasurementInfoType != null) {
      return ImmutableList.of(TAG_ganssReferenceMeasurementInfoType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ganssReferenceMeasurementInfoType from encoded stream.
   */
  public static ganssReferenceMeasurementInfoType fromPerUnaligned(byte[] encodedBytes) {
    ganssReferenceMeasurementInfoType result = new ganssReferenceMeasurementInfoType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ganssReferenceMeasurementInfoType from encoded stream.
   */
  public static ganssReferenceMeasurementInfoType fromPerAligned(byte[] encodedBytes) {
    ganssReferenceMeasurementInfoType result = new ganssReferenceMeasurementInfoType();
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
    return "ganssReferenceMeasurementInfoType = " + getValue() + ";\n";
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
public static class ganssUTCModelType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_ganssUTCModelType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ganssUTCModelType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ganssUTCModelType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ganssUTCModelType != null) {
      return ImmutableList.of(TAG_ganssUTCModelType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ganssUTCModelType from encoded stream.
   */
  public static ganssUTCModelType fromPerUnaligned(byte[] encodedBytes) {
    ganssUTCModelType result = new ganssUTCModelType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ganssUTCModelType from encoded stream.
   */
  public static ganssUTCModelType fromPerAligned(byte[] encodedBytes) {
    ganssUTCModelType result = new ganssUTCModelType();
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
    return "ganssUTCModelType = " + getValue() + ";\n";
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
public static class ganssAuxiliaryInformationType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_ganssAuxiliaryInformationType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ganssAuxiliaryInformationType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ganssAuxiliaryInformationType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ganssAuxiliaryInformationType != null) {
      return ImmutableList.of(TAG_ganssAuxiliaryInformationType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ganssAuxiliaryInformationType from encoded stream.
   */
  public static ganssAuxiliaryInformationType fromPerUnaligned(byte[] encodedBytes) {
    ganssAuxiliaryInformationType result = new ganssAuxiliaryInformationType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ganssAuxiliaryInformationType from encoded stream.
   */
  public static ganssAuxiliaryInformationType fromPerAligned(byte[] encodedBytes) {
    ganssAuxiliaryInformationType result = new ganssAuxiliaryInformationType();
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
    return "ganssAuxiliaryInformationType = " + getValue() + ";\n";
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
    builder.append("GanssReqGenericData = {\n");
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
