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
public  class GNSS_GenericAssistDataElement extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GNSS_GenericAssistDataElement
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GNSS_GenericAssistDataElement() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GNSS_GenericAssistDataElement;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GNSS_GenericAssistDataElement != null) {
      return ImmutableList.of(TAG_GNSS_GenericAssistDataElement);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GNSS_GenericAssistDataElement from encoded stream.
   */
  public static GNSS_GenericAssistDataElement fromPerUnaligned(byte[] encodedBytes) {
    GNSS_GenericAssistDataElement result = new GNSS_GenericAssistDataElement();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GNSS_GenericAssistDataElement from encoded stream.
   */
  public static GNSS_GenericAssistDataElement fromPerAligned(byte[] encodedBytes) {
    GNSS_GenericAssistDataElement result = new GNSS_GenericAssistDataElement();
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

  
  private GNSS_ID gnss_ID_;
  public GNSS_ID getGnss_ID() {
    return gnss_ID_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_ID
   */
  public void setGnss_ID(Asn1Object value) {
    this.gnss_ID_ = (GNSS_ID) value;
  }
  public GNSS_ID setGnss_IDToNewInstance() {
    gnss_ID_ = new GNSS_ID();
    return gnss_ID_;
  }
  
  private SBAS_ID sbas_ID_;
  public SBAS_ID getSbas_ID() {
    return sbas_ID_;
  }
  /**
   * @throws ClassCastException if value is not a SBAS_ID
   */
  public void setSbas_ID(Asn1Object value) {
    this.sbas_ID_ = (SBAS_ID) value;
  }
  public SBAS_ID setSbas_IDToNewInstance() {
    sbas_ID_ = new SBAS_ID();
    return sbas_ID_;
  }
  
  private GNSS_TimeModelList gnss_TimeModels_;
  public GNSS_TimeModelList getGnss_TimeModels() {
    return gnss_TimeModels_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_TimeModelList
   */
  public void setGnss_TimeModels(Asn1Object value) {
    this.gnss_TimeModels_ = (GNSS_TimeModelList) value;
  }
  public GNSS_TimeModelList setGnss_TimeModelsToNewInstance() {
    gnss_TimeModels_ = new GNSS_TimeModelList();
    return gnss_TimeModels_;
  }
  
  private GNSS_DifferentialCorrections gnss_DifferentialCorrections_;
  public GNSS_DifferentialCorrections getGnss_DifferentialCorrections() {
    return gnss_DifferentialCorrections_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_DifferentialCorrections
   */
  public void setGnss_DifferentialCorrections(Asn1Object value) {
    this.gnss_DifferentialCorrections_ = (GNSS_DifferentialCorrections) value;
  }
  public GNSS_DifferentialCorrections setGnss_DifferentialCorrectionsToNewInstance() {
    gnss_DifferentialCorrections_ = new GNSS_DifferentialCorrections();
    return gnss_DifferentialCorrections_;
  }
  
  private GNSS_NavigationModel gnss_NavigationModel_;
  public GNSS_NavigationModel getGnss_NavigationModel() {
    return gnss_NavigationModel_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_NavigationModel
   */
  public void setGnss_NavigationModel(Asn1Object value) {
    this.gnss_NavigationModel_ = (GNSS_NavigationModel) value;
  }
  public GNSS_NavigationModel setGnss_NavigationModelToNewInstance() {
    gnss_NavigationModel_ = new GNSS_NavigationModel();
    return gnss_NavigationModel_;
  }
  
  private GNSS_RealTimeIntegrity gnss_RealTimeIntegrity_;
  public GNSS_RealTimeIntegrity getGnss_RealTimeIntegrity() {
    return gnss_RealTimeIntegrity_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_RealTimeIntegrity
   */
  public void setGnss_RealTimeIntegrity(Asn1Object value) {
    this.gnss_RealTimeIntegrity_ = (GNSS_RealTimeIntegrity) value;
  }
  public GNSS_RealTimeIntegrity setGnss_RealTimeIntegrityToNewInstance() {
    gnss_RealTimeIntegrity_ = new GNSS_RealTimeIntegrity();
    return gnss_RealTimeIntegrity_;
  }
  
  private GNSS_DataBitAssistance gnss_DataBitAssistance_;
  public GNSS_DataBitAssistance getGnss_DataBitAssistance() {
    return gnss_DataBitAssistance_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_DataBitAssistance
   */
  public void setGnss_DataBitAssistance(Asn1Object value) {
    this.gnss_DataBitAssistance_ = (GNSS_DataBitAssistance) value;
  }
  public GNSS_DataBitAssistance setGnss_DataBitAssistanceToNewInstance() {
    gnss_DataBitAssistance_ = new GNSS_DataBitAssistance();
    return gnss_DataBitAssistance_;
  }
  
  private GNSS_AcquisitionAssistance gnss_AcquisitionAssistance_;
  public GNSS_AcquisitionAssistance getGnss_AcquisitionAssistance() {
    return gnss_AcquisitionAssistance_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_AcquisitionAssistance
   */
  public void setGnss_AcquisitionAssistance(Asn1Object value) {
    this.gnss_AcquisitionAssistance_ = (GNSS_AcquisitionAssistance) value;
  }
  public GNSS_AcquisitionAssistance setGnss_AcquisitionAssistanceToNewInstance() {
    gnss_AcquisitionAssistance_ = new GNSS_AcquisitionAssistance();
    return gnss_AcquisitionAssistance_;
  }
  
  private GNSS_Almanac gnss_Almanac_;
  public GNSS_Almanac getGnss_Almanac() {
    return gnss_Almanac_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_Almanac
   */
  public void setGnss_Almanac(Asn1Object value) {
    this.gnss_Almanac_ = (GNSS_Almanac) value;
  }
  public GNSS_Almanac setGnss_AlmanacToNewInstance() {
    gnss_Almanac_ = new GNSS_Almanac();
    return gnss_Almanac_;
  }
  
  private GNSS_UTC_Model gnss_UTC_Model_;
  public GNSS_UTC_Model getGnss_UTC_Model() {
    return gnss_UTC_Model_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_UTC_Model
   */
  public void setGnss_UTC_Model(Asn1Object value) {
    this.gnss_UTC_Model_ = (GNSS_UTC_Model) value;
  }
  public GNSS_UTC_Model setGnss_UTC_ModelToNewInstance() {
    gnss_UTC_Model_ = new GNSS_UTC_Model();
    return gnss_UTC_Model_;
  }
  
  private GNSS_AuxiliaryInformation gnss_AuxiliaryInformation_;
  public GNSS_AuxiliaryInformation getGnss_AuxiliaryInformation() {
    return gnss_AuxiliaryInformation_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_AuxiliaryInformation
   */
  public void setGnss_AuxiliaryInformation(Asn1Object value) {
    this.gnss_AuxiliaryInformation_ = (GNSS_AuxiliaryInformation) value;
  }
  public GNSS_AuxiliaryInformation setGnss_AuxiliaryInformationToNewInstance() {
    gnss_AuxiliaryInformation_ = new GNSS_AuxiliaryInformation();
    return gnss_AuxiliaryInformation_;
  }
  

  
  private GNSS_GenericAssistDataElement.ext1Type  extensionExt1;
  public GNSS_GenericAssistDataElement.ext1Type getExtensionExt1() {
    return extensionExt1;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_GenericAssistDataElement.ext1Type
   */
  public void setExtensionExt1(Asn1Object value) {
    extensionExt1 = (GNSS_GenericAssistDataElement.ext1Type) value;
  }
  public void setExtensionExt1ToNewInstance() {
    extensionExt1 = new GNSS_GenericAssistDataElement.ext1Type();
  }
    

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getGnss_ID() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_ID();
          }

          @Override public void setToNewInstance() {
            setGnss_IDToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_ID.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_ID : "
                    + getGnss_ID().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getSbas_ID() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getSbas_ID();
          }

          @Override public void setToNewInstance() {
            setSbas_IDToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SBAS_ID.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "sbas_ID : "
                    + getSbas_ID().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getGnss_TimeModels() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_TimeModels();
          }

          @Override public void setToNewInstance() {
            setGnss_TimeModelsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_TimeModelList.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_TimeModels : "
                    + getGnss_TimeModels().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getGnss_DifferentialCorrections() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_DifferentialCorrections();
          }

          @Override public void setToNewInstance() {
            setGnss_DifferentialCorrectionsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_DifferentialCorrections.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_DifferentialCorrections : "
                    + getGnss_DifferentialCorrections().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getGnss_NavigationModel() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_NavigationModel();
          }

          @Override public void setToNewInstance() {
            setGnss_NavigationModelToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_NavigationModel.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_NavigationModel : "
                    + getGnss_NavigationModel().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getGnss_RealTimeIntegrity() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_RealTimeIntegrity();
          }

          @Override public void setToNewInstance() {
            setGnss_RealTimeIntegrityToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_RealTimeIntegrity.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_RealTimeIntegrity : "
                    + getGnss_RealTimeIntegrity().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getGnss_DataBitAssistance() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_DataBitAssistance();
          }

          @Override public void setToNewInstance() {
            setGnss_DataBitAssistanceToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_DataBitAssistance.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_DataBitAssistance : "
                    + getGnss_DataBitAssistance().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 7);

          @Override public boolean isExplicitlySet() {
            return getGnss_AcquisitionAssistance() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_AcquisitionAssistance();
          }

          @Override public void setToNewInstance() {
            setGnss_AcquisitionAssistanceToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_AcquisitionAssistance.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_AcquisitionAssistance : "
                    + getGnss_AcquisitionAssistance().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 8);

          @Override public boolean isExplicitlySet() {
            return getGnss_Almanac() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_Almanac();
          }

          @Override public void setToNewInstance() {
            setGnss_AlmanacToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_Almanac.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_Almanac : "
                    + getGnss_Almanac().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 9);

          @Override public boolean isExplicitlySet() {
            return getGnss_UTC_Model() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_UTC_Model();
          }

          @Override public void setToNewInstance() {
            setGnss_UTC_ModelToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_UTC_Model.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_UTC_Model : "
                    + getGnss_UTC_Model().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 10);

          @Override public boolean isExplicitlySet() {
            return getGnss_AuxiliaryInformation() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_AuxiliaryInformation();
          }

          @Override public void setToNewInstance() {
            setGnss_AuxiliaryInformationToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_AuxiliaryInformation.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_AuxiliaryInformation : "
                    + getGnss_AuxiliaryInformation().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      builder.add(new SequenceComponent() {
            @Override public boolean isExplicitlySet() {
              return getExtensionExt1() != null;
            }

            @Override public boolean hasDefaultValue() {
              return false;
            }

            @Override public boolean isOptional() {
              return false;
            }

            @Override public Asn1Object getComponentValue() {
              return getExtensionExt1();
            }

            @Override public void setToNewInstance() {
              setExtensionExt1ToNewInstance();
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
              return "ext1 : "
                  + getExtensionExt1().toIndentedString(indent);
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
public static class ext1Type extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_ext1Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ext1Type() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ext1Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ext1Type != null) {
      return ImmutableList.of(TAG_ext1Type);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ext1Type from encoded stream.
   */
  public static ext1Type fromPerUnaligned(byte[] encodedBytes) {
    ext1Type result = new ext1Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ext1Type from encoded stream.
   */
  public static ext1Type fromPerAligned(byte[] encodedBytes) {
    ext1Type result = new ext1Type();
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

  
  private BDS_DifferentialCorrections_r12 bds_DifferentialCorrections_r12_;
  public BDS_DifferentialCorrections_r12 getBds_DifferentialCorrections_r12() {
    return bds_DifferentialCorrections_r12_;
  }
  /**
   * @throws ClassCastException if value is not a BDS_DifferentialCorrections_r12
   */
  public void setBds_DifferentialCorrections_r12(Asn1Object value) {
    this.bds_DifferentialCorrections_r12_ = (BDS_DifferentialCorrections_r12) value;
  }
  public BDS_DifferentialCorrections_r12 setBds_DifferentialCorrections_r12ToNewInstance() {
    bds_DifferentialCorrections_r12_ = new BDS_DifferentialCorrections_r12();
    return bds_DifferentialCorrections_r12_;
  }
  
  private BDS_GridModelParameter_r12 bds_GridModel_r12_;
  public BDS_GridModelParameter_r12 getBds_GridModel_r12() {
    return bds_GridModel_r12_;
  }
  /**
   * @throws ClassCastException if value is not a BDS_GridModelParameter_r12
   */
  public void setBds_GridModel_r12(Asn1Object value) {
    this.bds_GridModel_r12_ = (BDS_GridModelParameter_r12) value;
  }
  public BDS_GridModelParameter_r12 setBds_GridModel_r12ToNewInstance() {
    bds_GridModel_r12_ = new BDS_GridModelParameter_r12();
    return bds_GridModel_r12_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getBds_DifferentialCorrections_r12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getBds_DifferentialCorrections_r12();
          }

          @Override public void setToNewInstance() {
            setBds_DifferentialCorrections_r12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? BDS_DifferentialCorrections_r12.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bds_DifferentialCorrections_r12 : "
                    + getBds_DifferentialCorrections_r12().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getBds_GridModel_r12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getBds_GridModel_r12();
          }

          @Override public void setToNewInstance() {
            setBds_GridModel_r12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? BDS_GridModelParameter_r12.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bds_GridModel_r12 : "
                    + getBds_GridModel_r12().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      return builder.build();
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
    builder.append("ext1Type = {\n");
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
    builder.append("GNSS_GenericAssistDataElement = {\n");
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
