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
import com.google.location.suplclient.asn1.base.Asn1Integer;
import com.google.location.suplclient.asn1.base.Asn1Object;
import com.google.location.suplclient.asn1.base.Asn1Sequence;
import com.google.location.suplclient.asn1.base.Asn1Tag;
import com.google.location.suplclient.asn1.base.BitStream;
import com.google.location.suplclient.asn1.base.BitStreamReader;
import com.google.location.suplclient.asn1.base.SequenceComponent;
import com.google.location.suplclient.asn1.supl2.rrlp_components.GANSSAddUTCModel;
import com.google.location.suplclient.asn1.supl2.rrlp_components.GANSSAlmanacModel_R10_Ext;
import com.google.location.suplclient.asn1.supl2.rrlp_components.GANSSAlmanacModel_R12_Ext;
import com.google.location.suplclient.asn1.supl2.rrlp_components.GANSSAuxiliaryInformation;
import com.google.location.suplclient.asn1.supl2.rrlp_components.GANSSDataBitAssist;
import com.google.location.suplclient.asn1.supl2.rrlp_components.GANSSDiffCorrections;
import com.google.location.suplclient.asn1.supl2.rrlp_components.GANSSDiffCorrectionsValidityPeriod;
import com.google.location.suplclient.asn1.supl2.rrlp_components.GANSSEphemerisExtensionCheck;
import com.google.location.suplclient.asn1.supl2.rrlp_components.GANSSRealTimeIntegrity;
import com.google.location.suplclient.asn1.supl2.rrlp_components.GANSSRefMeasurementAssist;
import com.google.location.suplclient.asn1.supl2.rrlp_components.GANSSRefMeasurementAssist_R10_Ext;
import com.google.location.suplclient.asn1.supl2.rrlp_components.GANSSUTCModel;
import com.google.location.suplclient.asn1.supl2.rrlp_components.SeqOfGANSSTimeModel;
import com.google.location.suplclient.asn1.supl2.rrlp_components.SeqOfGANSSTimeModel_R10_Ext;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
* 
*/
public  class GANSSGenericAssistDataElement extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GANSSGenericAssistDataElement
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GANSSGenericAssistDataElement() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GANSSGenericAssistDataElement;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GANSSGenericAssistDataElement != null) {
      return ImmutableList.of(TAG_GANSSGenericAssistDataElement);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GANSSGenericAssistDataElement from encoded stream.
   */
  public static GANSSGenericAssistDataElement fromPerUnaligned(byte[] encodedBytes) {
    GANSSGenericAssistDataElement result = new GANSSGenericAssistDataElement();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GANSSGenericAssistDataElement from encoded stream.
   */
  public static GANSSGenericAssistDataElement fromPerAligned(byte[] encodedBytes) {
    GANSSGenericAssistDataElement result = new GANSSGenericAssistDataElement();
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

  
  private GANSSGenericAssistDataElement.ganssIDType ganssID_;
  public GANSSGenericAssistDataElement.ganssIDType getGanssID() {
    return ganssID_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSGenericAssistDataElement.ganssIDType
   */
  public void setGanssID(Asn1Object value) {
    this.ganssID_ = (GANSSGenericAssistDataElement.ganssIDType) value;
  }
  public GANSSGenericAssistDataElement.ganssIDType setGanssIDToNewInstance() {
    ganssID_ = new GANSSGenericAssistDataElement.ganssIDType();
    return ganssID_;
  }
  
  private SeqOfGANSSTimeModel ganssTimeModel_;
  public SeqOfGANSSTimeModel getGanssTimeModel() {
    return ganssTimeModel_;
  }
  /**
   * @throws ClassCastException if value is not a SeqOfGANSSTimeModel
   */
  public void setGanssTimeModel(Asn1Object value) {
    this.ganssTimeModel_ = (SeqOfGANSSTimeModel) value;
  }
  public SeqOfGANSSTimeModel setGanssTimeModelToNewInstance() {
    ganssTimeModel_ = new SeqOfGANSSTimeModel();
    return ganssTimeModel_;
  }
  
  private GANSSDiffCorrections ganssDiffCorrections_;
  public GANSSDiffCorrections getGanssDiffCorrections() {
    return ganssDiffCorrections_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSDiffCorrections
   */
  public void setGanssDiffCorrections(Asn1Object value) {
    this.ganssDiffCorrections_ = (GANSSDiffCorrections) value;
  }
  public GANSSDiffCorrections setGanssDiffCorrectionsToNewInstance() {
    ganssDiffCorrections_ = new GANSSDiffCorrections();
    return ganssDiffCorrections_;
  }
  
  private GANSSNavModel ganssNavigationModel_;
  public GANSSNavModel getGanssNavigationModel() {
    return ganssNavigationModel_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSNavModel
   */
  public void setGanssNavigationModel(Asn1Object value) {
    this.ganssNavigationModel_ = (GANSSNavModel) value;
  }
  public GANSSNavModel setGanssNavigationModelToNewInstance() {
    ganssNavigationModel_ = new GANSSNavModel();
    return ganssNavigationModel_;
  }
  
  private GANSSRealTimeIntegrity ganssRealTimeIntegrity_;
  public GANSSRealTimeIntegrity getGanssRealTimeIntegrity() {
    return ganssRealTimeIntegrity_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSRealTimeIntegrity
   */
  public void setGanssRealTimeIntegrity(Asn1Object value) {
    this.ganssRealTimeIntegrity_ = (GANSSRealTimeIntegrity) value;
  }
  public GANSSRealTimeIntegrity setGanssRealTimeIntegrityToNewInstance() {
    ganssRealTimeIntegrity_ = new GANSSRealTimeIntegrity();
    return ganssRealTimeIntegrity_;
  }
  
  private GANSSDataBitAssist ganssDataBitAssist_;
  public GANSSDataBitAssist getGanssDataBitAssist() {
    return ganssDataBitAssist_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSDataBitAssist
   */
  public void setGanssDataBitAssist(Asn1Object value) {
    this.ganssDataBitAssist_ = (GANSSDataBitAssist) value;
  }
  public GANSSDataBitAssist setGanssDataBitAssistToNewInstance() {
    ganssDataBitAssist_ = new GANSSDataBitAssist();
    return ganssDataBitAssist_;
  }
  
  private GANSSRefMeasurementAssist ganssRefMeasurementAssist_;
  public GANSSRefMeasurementAssist getGanssRefMeasurementAssist() {
    return ganssRefMeasurementAssist_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSRefMeasurementAssist
   */
  public void setGanssRefMeasurementAssist(Asn1Object value) {
    this.ganssRefMeasurementAssist_ = (GANSSRefMeasurementAssist) value;
  }
  public GANSSRefMeasurementAssist setGanssRefMeasurementAssistToNewInstance() {
    ganssRefMeasurementAssist_ = new GANSSRefMeasurementAssist();
    return ganssRefMeasurementAssist_;
  }
  
  private GANSSAlmanacModel ganssAlmanacModel_;
  public GANSSAlmanacModel getGanssAlmanacModel() {
    return ganssAlmanacModel_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSAlmanacModel
   */
  public void setGanssAlmanacModel(Asn1Object value) {
    this.ganssAlmanacModel_ = (GANSSAlmanacModel) value;
  }
  public GANSSAlmanacModel setGanssAlmanacModelToNewInstance() {
    ganssAlmanacModel_ = new GANSSAlmanacModel();
    return ganssAlmanacModel_;
  }
  
  private GANSSUTCModel ganssUTCModel_;
  public GANSSUTCModel getGanssUTCModel() {
    return ganssUTCModel_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSUTCModel
   */
  public void setGanssUTCModel(Asn1Object value) {
    this.ganssUTCModel_ = (GANSSUTCModel) value;
  }
  public GANSSUTCModel setGanssUTCModelToNewInstance() {
    ganssUTCModel_ = new GANSSUTCModel();
    return ganssUTCModel_;
  }
  
  private GANSSEphemerisExtension ganssEphemerisExtension_;
  public GANSSEphemerisExtension getGanssEphemerisExtension() {
    return ganssEphemerisExtension_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSEphemerisExtension
   */
  public void setGanssEphemerisExtension(Asn1Object value) {
    this.ganssEphemerisExtension_ = (GANSSEphemerisExtension) value;
  }
  public GANSSEphemerisExtension setGanssEphemerisExtensionToNewInstance() {
    ganssEphemerisExtension_ = new GANSSEphemerisExtension();
    return ganssEphemerisExtension_;
  }
  
  private GANSSEphemerisExtensionCheck ganssEphemerisExtCheck_;
  public GANSSEphemerisExtensionCheck getGanssEphemerisExtCheck() {
    return ganssEphemerisExtCheck_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSEphemerisExtensionCheck
   */
  public void setGanssEphemerisExtCheck(Asn1Object value) {
    this.ganssEphemerisExtCheck_ = (GANSSEphemerisExtensionCheck) value;
  }
  public GANSSEphemerisExtensionCheck setGanssEphemerisExtCheckToNewInstance() {
    ganssEphemerisExtCheck_ = new GANSSEphemerisExtensionCheck();
    return ganssEphemerisExtCheck_;
  }
  

  
  private GANSSGenericAssistDataElement.sbasIDType  extensionSbasID;
  public GANSSGenericAssistDataElement.sbasIDType getExtensionSbasID() {
    return extensionSbasID;
  }
  /**
   * @throws ClassCastException if value is not a GANSSGenericAssistDataElement.sbasIDType
   */
  public void setExtensionSbasID(Asn1Object value) {
    extensionSbasID = (GANSSGenericAssistDataElement.sbasIDType) value;
  }
  public void setExtensionSbasIDToNewInstance() {
    extensionSbasID = new GANSSGenericAssistDataElement.sbasIDType();
  }
    
  private GANSSAddUTCModel  extensionGanssAddUTCModel;
  public GANSSAddUTCModel getExtensionGanssAddUTCModel() {
    return extensionGanssAddUTCModel;
  }
  /**
   * @throws ClassCastException if value is not a GANSSAddUTCModel
   */
  public void setExtensionGanssAddUTCModel(Asn1Object value) {
    extensionGanssAddUTCModel = (GANSSAddUTCModel) value;
  }
  public void setExtensionGanssAddUTCModelToNewInstance() {
    extensionGanssAddUTCModel = new GANSSAddUTCModel();
  }
    
  private GANSSAuxiliaryInformation  extensionGanssAuxiliaryInfo;
  public GANSSAuxiliaryInformation getExtensionGanssAuxiliaryInfo() {
    return extensionGanssAuxiliaryInfo;
  }
  /**
   * @throws ClassCastException if value is not a GANSSAuxiliaryInformation
   */
  public void setExtensionGanssAuxiliaryInfo(Asn1Object value) {
    extensionGanssAuxiliaryInfo = (GANSSAuxiliaryInformation) value;
  }
  public void setExtensionGanssAuxiliaryInfoToNewInstance() {
    extensionGanssAuxiliaryInfo = new GANSSAuxiliaryInformation();
  }
    
  private GANSSDiffCorrectionsValidityPeriod  extensionGanssDiffCorrectionsValidityPeriod;
  public GANSSDiffCorrectionsValidityPeriod getExtensionGanssDiffCorrectionsValidityPeriod() {
    return extensionGanssDiffCorrectionsValidityPeriod;
  }
  /**
   * @throws ClassCastException if value is not a GANSSDiffCorrectionsValidityPeriod
   */
  public void setExtensionGanssDiffCorrectionsValidityPeriod(Asn1Object value) {
    extensionGanssDiffCorrectionsValidityPeriod = (GANSSDiffCorrectionsValidityPeriod) value;
  }
  public void setExtensionGanssDiffCorrectionsValidityPeriodToNewInstance() {
    extensionGanssDiffCorrectionsValidityPeriod = new GANSSDiffCorrectionsValidityPeriod();
  }
    
  private SeqOfGANSSTimeModel_R10_Ext  extensionGanssTimeModel_R10_Ext;
  public SeqOfGANSSTimeModel_R10_Ext getExtensionGanssTimeModel_R10_Ext() {
    return extensionGanssTimeModel_R10_Ext;
  }
  /**
   * @throws ClassCastException if value is not a SeqOfGANSSTimeModel_R10_Ext
   */
  public void setExtensionGanssTimeModel_R10_Ext(Asn1Object value) {
    extensionGanssTimeModel_R10_Ext = (SeqOfGANSSTimeModel_R10_Ext) value;
  }
  public void setExtensionGanssTimeModel_R10_ExtToNewInstance() {
    extensionGanssTimeModel_R10_Ext = new SeqOfGANSSTimeModel_R10_Ext();
  }
    
  private GANSSRefMeasurementAssist_R10_Ext  extensionGanssRefMeasurementAssist_R10_Ext;
  public GANSSRefMeasurementAssist_R10_Ext getExtensionGanssRefMeasurementAssist_R10_Ext() {
    return extensionGanssRefMeasurementAssist_R10_Ext;
  }
  /**
   * @throws ClassCastException if value is not a GANSSRefMeasurementAssist_R10_Ext
   */
  public void setExtensionGanssRefMeasurementAssist_R10_Ext(Asn1Object value) {
    extensionGanssRefMeasurementAssist_R10_Ext = (GANSSRefMeasurementAssist_R10_Ext) value;
  }
  public void setExtensionGanssRefMeasurementAssist_R10_ExtToNewInstance() {
    extensionGanssRefMeasurementAssist_R10_Ext = new GANSSRefMeasurementAssist_R10_Ext();
  }
    
  private GANSSAlmanacModel_R10_Ext  extensionGanssAlmanacModel_R10_Ext;
  public GANSSAlmanacModel_R10_Ext getExtensionGanssAlmanacModel_R10_Ext() {
    return extensionGanssAlmanacModel_R10_Ext;
  }
  /**
   * @throws ClassCastException if value is not a GANSSAlmanacModel_R10_Ext
   */
  public void setExtensionGanssAlmanacModel_R10_Ext(Asn1Object value) {
    extensionGanssAlmanacModel_R10_Ext = (GANSSAlmanacModel_R10_Ext) value;
  }
  public void setExtensionGanssAlmanacModel_R10_ExtToNewInstance() {
    extensionGanssAlmanacModel_R10_Ext = new GANSSAlmanacModel_R10_Ext();
  }
    
  private GANSSAlmanacModel_R12_Ext  extensionGanssAlmanacModel_R12_Ext;
  public GANSSAlmanacModel_R12_Ext getExtensionGanssAlmanacModel_R12_Ext() {
    return extensionGanssAlmanacModel_R12_Ext;
  }
  /**
   * @throws ClassCastException if value is not a GANSSAlmanacModel_R12_Ext
   */
  public void setExtensionGanssAlmanacModel_R12_Ext(Asn1Object value) {
    extensionGanssAlmanacModel_R12_Ext = (GANSSAlmanacModel_R12_Ext) value;
  }
  public void setExtensionGanssAlmanacModel_R12_ExtToNewInstance() {
    extensionGanssAlmanacModel_R12_Ext = new GANSSAlmanacModel_R12_Ext();
  }
    

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getGanssID() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssID();
          }

          @Override public void setToNewInstance() {
            setGanssIDToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSGenericAssistDataElement.ganssIDType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssID : "
                    + getGanssID().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getGanssTimeModel() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssTimeModel();
          }

          @Override public void setToNewInstance() {
            setGanssTimeModelToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SeqOfGANSSTimeModel.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssTimeModel : "
                    + getGanssTimeModel().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getGanssDiffCorrections() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssDiffCorrections();
          }

          @Override public void setToNewInstance() {
            setGanssDiffCorrectionsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSDiffCorrections.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssDiffCorrections : "
                    + getGanssDiffCorrections().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getGanssNavigationModel() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssNavigationModel();
          }

          @Override public void setToNewInstance() {
            setGanssNavigationModelToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSNavModel.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssNavigationModel : "
                    + getGanssNavigationModel().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getGanssRealTimeIntegrity() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssRealTimeIntegrity();
          }

          @Override public void setToNewInstance() {
            setGanssRealTimeIntegrityToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSRealTimeIntegrity.getPossibleFirstTags() : ImmutableList.of(tag);
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
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getGanssDataBitAssist() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssDataBitAssist();
          }

          @Override public void setToNewInstance() {
            setGanssDataBitAssistToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSDataBitAssist.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssDataBitAssist : "
                    + getGanssDataBitAssist().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getGanssRefMeasurementAssist() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssRefMeasurementAssist();
          }

          @Override public void setToNewInstance() {
            setGanssRefMeasurementAssistToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSRefMeasurementAssist.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssRefMeasurementAssist : "
                    + getGanssRefMeasurementAssist().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 7);

          @Override public boolean isExplicitlySet() {
            return getGanssAlmanacModel() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssAlmanacModel();
          }

          @Override public void setToNewInstance() {
            setGanssAlmanacModelToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSAlmanacModel.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssAlmanacModel : "
                    + getGanssAlmanacModel().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 8);

          @Override public boolean isExplicitlySet() {
            return getGanssUTCModel() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssUTCModel();
          }

          @Override public void setToNewInstance() {
            setGanssUTCModelToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSUTCModel.getPossibleFirstTags() : ImmutableList.of(tag);
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
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 9);

          @Override public boolean isExplicitlySet() {
            return getGanssEphemerisExtension() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssEphemerisExtension();
          }

          @Override public void setToNewInstance() {
            setGanssEphemerisExtensionToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSEphemerisExtension.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssEphemerisExtension : "
                    + getGanssEphemerisExtension().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 10);

          @Override public boolean isExplicitlySet() {
            return getGanssEphemerisExtCheck() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssEphemerisExtCheck();
          }

          @Override public void setToNewInstance() {
            setGanssEphemerisExtCheckToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSEphemerisExtensionCheck.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssEphemerisExtCheck : "
                    + getGanssEphemerisExtCheck().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      builder.add(new SequenceComponent() {
            @Override public boolean isExplicitlySet() {
              return getExtensionSbasID() != null;
            }

            @Override public boolean hasDefaultValue() {
              return false;
            }

            @Override public boolean isOptional() {
              return true;
            }

            @Override public Asn1Object getComponentValue() {
              return getExtensionSbasID();
            }

            @Override public void setToNewInstance() {
              setExtensionSbasIDToNewInstance();
            }

            @Override public Collection<Asn1Tag> getPossibleFirstTags() {
              throw new UnsupportedOperationException(
                  "BER decoding not supported for extension elements");
            }

            @Override
            public Asn1Tag getTag() {
              throw new UnsupportedOperationException(
                  "BER is not supported for extension elements");
            }

            @Override
            public boolean isImplicitTagging() {
              throw new UnsupportedOperationException(
                  "BER is not supported for extension elements");
            }

            @Override public String toIndentedString(String indent) {
              return "sbasID : "
                  + getExtensionSbasID().toIndentedString(indent);
            }
      });
      
      builder.add(new SequenceComponent() {
            @Override public boolean isExplicitlySet() {
              return getExtensionGanssAddUTCModel() != null;
            }

            @Override public boolean hasDefaultValue() {
              return false;
            }

            @Override public boolean isOptional() {
              return true;
            }

            @Override public Asn1Object getComponentValue() {
              return getExtensionGanssAddUTCModel();
            }

            @Override public void setToNewInstance() {
              setExtensionGanssAddUTCModelToNewInstance();
            }

            @Override public Collection<Asn1Tag> getPossibleFirstTags() {
              throw new UnsupportedOperationException(
                  "BER decoding not supported for extension elements");
            }

            @Override
            public Asn1Tag getTag() {
              throw new UnsupportedOperationException(
                  "BER is not supported for extension elements");
            }

            @Override
            public boolean isImplicitTagging() {
              throw new UnsupportedOperationException(
                  "BER is not supported for extension elements");
            }

            @Override public String toIndentedString(String indent) {
              return "ganssAddUTCModel : "
                  + getExtensionGanssAddUTCModel().toIndentedString(indent);
            }
      });
      
      builder.add(new SequenceComponent() {
            @Override public boolean isExplicitlySet() {
              return getExtensionGanssAuxiliaryInfo() != null;
            }

            @Override public boolean hasDefaultValue() {
              return false;
            }

            @Override public boolean isOptional() {
              return true;
            }

            @Override public Asn1Object getComponentValue() {
              return getExtensionGanssAuxiliaryInfo();
            }

            @Override public void setToNewInstance() {
              setExtensionGanssAuxiliaryInfoToNewInstance();
            }

            @Override public Collection<Asn1Tag> getPossibleFirstTags() {
              throw new UnsupportedOperationException(
                  "BER decoding not supported for extension elements");
            }

            @Override
            public Asn1Tag getTag() {
              throw new UnsupportedOperationException(
                  "BER is not supported for extension elements");
            }

            @Override
            public boolean isImplicitTagging() {
              throw new UnsupportedOperationException(
                  "BER is not supported for extension elements");
            }

            @Override public String toIndentedString(String indent) {
              return "ganssAuxiliaryInfo : "
                  + getExtensionGanssAuxiliaryInfo().toIndentedString(indent);
            }
      });
      
      builder.add(new SequenceComponent() {
            @Override public boolean isExplicitlySet() {
              return getExtensionGanssDiffCorrectionsValidityPeriod() != null;
            }

            @Override public boolean hasDefaultValue() {
              return false;
            }

            @Override public boolean isOptional() {
              return true;
            }

            @Override public Asn1Object getComponentValue() {
              return getExtensionGanssDiffCorrectionsValidityPeriod();
            }

            @Override public void setToNewInstance() {
              setExtensionGanssDiffCorrectionsValidityPeriodToNewInstance();
            }

            @Override public Collection<Asn1Tag> getPossibleFirstTags() {
              throw new UnsupportedOperationException(
                  "BER decoding not supported for extension elements");
            }

            @Override
            public Asn1Tag getTag() {
              throw new UnsupportedOperationException(
                  "BER is not supported for extension elements");
            }

            @Override
            public boolean isImplicitTagging() {
              throw new UnsupportedOperationException(
                  "BER is not supported for extension elements");
            }

            @Override public String toIndentedString(String indent) {
              return "ganssDiffCorrectionsValidityPeriod : "
                  + getExtensionGanssDiffCorrectionsValidityPeriod().toIndentedString(indent);
            }
      });
      
      builder.add(new SequenceComponent() {
            @Override public boolean isExplicitlySet() {
              return getExtensionGanssTimeModel_R10_Ext() != null;
            }

            @Override public boolean hasDefaultValue() {
              return false;
            }

            @Override public boolean isOptional() {
              return true;
            }

            @Override public Asn1Object getComponentValue() {
              return getExtensionGanssTimeModel_R10_Ext();
            }

            @Override public void setToNewInstance() {
              setExtensionGanssTimeModel_R10_ExtToNewInstance();
            }

            @Override public Collection<Asn1Tag> getPossibleFirstTags() {
              throw new UnsupportedOperationException(
                  "BER decoding not supported for extension elements");
            }

            @Override
            public Asn1Tag getTag() {
              throw new UnsupportedOperationException(
                  "BER is not supported for extension elements");
            }

            @Override
            public boolean isImplicitTagging() {
              throw new UnsupportedOperationException(
                  "BER is not supported for extension elements");
            }

            @Override public String toIndentedString(String indent) {
              return "ganssTimeModel_R10_Ext : "
                  + getExtensionGanssTimeModel_R10_Ext().toIndentedString(indent);
            }
      });
      
      builder.add(new SequenceComponent() {
            @Override public boolean isExplicitlySet() {
              return getExtensionGanssRefMeasurementAssist_R10_Ext() != null;
            }

            @Override public boolean hasDefaultValue() {
              return false;
            }

            @Override public boolean isOptional() {
              return true;
            }

            @Override public Asn1Object getComponentValue() {
              return getExtensionGanssRefMeasurementAssist_R10_Ext();
            }

            @Override public void setToNewInstance() {
              setExtensionGanssRefMeasurementAssist_R10_ExtToNewInstance();
            }

            @Override public Collection<Asn1Tag> getPossibleFirstTags() {
              throw new UnsupportedOperationException(
                  "BER decoding not supported for extension elements");
            }

            @Override
            public Asn1Tag getTag() {
              throw new UnsupportedOperationException(
                  "BER is not supported for extension elements");
            }

            @Override
            public boolean isImplicitTagging() {
              throw new UnsupportedOperationException(
                  "BER is not supported for extension elements");
            }

            @Override public String toIndentedString(String indent) {
              return "ganssRefMeasurementAssist_R10_Ext : "
                  + getExtensionGanssRefMeasurementAssist_R10_Ext().toIndentedString(indent);
            }
      });
      
      builder.add(new SequenceComponent() {
            @Override public boolean isExplicitlySet() {
              return getExtensionGanssAlmanacModel_R10_Ext() != null;
            }

            @Override public boolean hasDefaultValue() {
              return false;
            }

            @Override public boolean isOptional() {
              return true;
            }

            @Override public Asn1Object getComponentValue() {
              return getExtensionGanssAlmanacModel_R10_Ext();
            }

            @Override public void setToNewInstance() {
              setExtensionGanssAlmanacModel_R10_ExtToNewInstance();
            }

            @Override public Collection<Asn1Tag> getPossibleFirstTags() {
              throw new UnsupportedOperationException(
                  "BER decoding not supported for extension elements");
            }

            @Override
            public Asn1Tag getTag() {
              throw new UnsupportedOperationException(
                  "BER is not supported for extension elements");
            }

            @Override
            public boolean isImplicitTagging() {
              throw new UnsupportedOperationException(
                  "BER is not supported for extension elements");
            }

            @Override public String toIndentedString(String indent) {
              return "ganssAlmanacModel_R10_Ext : "
                  + getExtensionGanssAlmanacModel_R10_Ext().toIndentedString(indent);
            }
      });
      
      builder.add(new SequenceComponent() {
            @Override public boolean isExplicitlySet() {
              return getExtensionGanssAlmanacModel_R12_Ext() != null;
            }

            @Override public boolean hasDefaultValue() {
              return false;
            }

            @Override public boolean isOptional() {
              return true;
            }

            @Override public Asn1Object getComponentValue() {
              return getExtensionGanssAlmanacModel_R12_Ext();
            }

            @Override public void setToNewInstance() {
              setExtensionGanssAlmanacModel_R12_ExtToNewInstance();
            }

            @Override public Collection<Asn1Tag> getPossibleFirstTags() {
              throw new UnsupportedOperationException(
                  "BER decoding not supported for extension elements");
            }

            @Override
            public Asn1Tag getTag() {
              throw new UnsupportedOperationException(
                  "BER is not supported for extension elements");
            }

            @Override
            public boolean isImplicitTagging() {
              throw new UnsupportedOperationException(
                  "BER is not supported for extension elements");
            }

            @Override public String toIndentedString(String indent) {
              return "ganssAlmanacModel_R12_Ext : "
                  + getExtensionGanssAlmanacModel_R12_Ext().toIndentedString(indent);
            }
      });
      
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
public static class ganssIDType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ganssIDType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ganssIDType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("7"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ganssIDType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ganssIDType != null) {
      return ImmutableList.of(TAG_ganssIDType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ganssIDType from encoded stream.
   */
  public static ganssIDType fromPerUnaligned(byte[] encodedBytes) {
    ganssIDType result = new ganssIDType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ganssIDType from encoded stream.
   */
  public static ganssIDType fromPerAligned(byte[] encodedBytes) {
    ganssIDType result = new ganssIDType();
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
    return "ganssIDType = " + getInteger() + ";\n";
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
public static class sbasIDType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_sbasIDType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public sbasIDType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("7"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_sbasIDType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_sbasIDType != null) {
      return ImmutableList.of(TAG_sbasIDType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new sbasIDType from encoded stream.
   */
  public static sbasIDType fromPerUnaligned(byte[] encodedBytes) {
    sbasIDType result = new sbasIDType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new sbasIDType from encoded stream.
   */
  public static sbasIDType fromPerAligned(byte[] encodedBytes) {
    sbasIDType result = new sbasIDType();
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
    return "sbasIDType = " + getInteger() + ";\n";
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
    builder.append("GANSSGenericAssistDataElement = {\n");
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
