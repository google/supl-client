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
public  class GNSS_GenericAssistDataReqElement extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GNSS_GenericAssistDataReqElement
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GNSS_GenericAssistDataReqElement() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GNSS_GenericAssistDataReqElement;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GNSS_GenericAssistDataReqElement != null) {
      return ImmutableList.of(TAG_GNSS_GenericAssistDataReqElement);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GNSS_GenericAssistDataReqElement from encoded stream.
   */
  public static GNSS_GenericAssistDataReqElement fromPerUnaligned(byte[] encodedBytes) {
    GNSS_GenericAssistDataReqElement result = new GNSS_GenericAssistDataReqElement();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GNSS_GenericAssistDataReqElement from encoded stream.
   */
  public static GNSS_GenericAssistDataReqElement fromPerAligned(byte[] encodedBytes) {
    GNSS_GenericAssistDataReqElement result = new GNSS_GenericAssistDataReqElement();
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
  
  private GNSS_TimeModelListReq gnss_TimeModelsReq_;
  public GNSS_TimeModelListReq getGnss_TimeModelsReq() {
    return gnss_TimeModelsReq_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_TimeModelListReq
   */
  public void setGnss_TimeModelsReq(Asn1Object value) {
    this.gnss_TimeModelsReq_ = (GNSS_TimeModelListReq) value;
  }
  public GNSS_TimeModelListReq setGnss_TimeModelsReqToNewInstance() {
    gnss_TimeModelsReq_ = new GNSS_TimeModelListReq();
    return gnss_TimeModelsReq_;
  }
  
  private GNSS_DifferentialCorrectionsReq gnss_DifferentialCorrectionsReq_;
  public GNSS_DifferentialCorrectionsReq getGnss_DifferentialCorrectionsReq() {
    return gnss_DifferentialCorrectionsReq_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_DifferentialCorrectionsReq
   */
  public void setGnss_DifferentialCorrectionsReq(Asn1Object value) {
    this.gnss_DifferentialCorrectionsReq_ = (GNSS_DifferentialCorrectionsReq) value;
  }
  public GNSS_DifferentialCorrectionsReq setGnss_DifferentialCorrectionsReqToNewInstance() {
    gnss_DifferentialCorrectionsReq_ = new GNSS_DifferentialCorrectionsReq();
    return gnss_DifferentialCorrectionsReq_;
  }
  
  private GNSS_NavigationModelReq gnss_NavigationModelReq_;
  public GNSS_NavigationModelReq getGnss_NavigationModelReq() {
    return gnss_NavigationModelReq_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_NavigationModelReq
   */
  public void setGnss_NavigationModelReq(Asn1Object value) {
    this.gnss_NavigationModelReq_ = (GNSS_NavigationModelReq) value;
  }
  public GNSS_NavigationModelReq setGnss_NavigationModelReqToNewInstance() {
    gnss_NavigationModelReq_ = new GNSS_NavigationModelReq();
    return gnss_NavigationModelReq_;
  }
  
  private GNSS_RealTimeIntegrityReq gnss_RealTimeIntegrityReq_;
  public GNSS_RealTimeIntegrityReq getGnss_RealTimeIntegrityReq() {
    return gnss_RealTimeIntegrityReq_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_RealTimeIntegrityReq
   */
  public void setGnss_RealTimeIntegrityReq(Asn1Object value) {
    this.gnss_RealTimeIntegrityReq_ = (GNSS_RealTimeIntegrityReq) value;
  }
  public GNSS_RealTimeIntegrityReq setGnss_RealTimeIntegrityReqToNewInstance() {
    gnss_RealTimeIntegrityReq_ = new GNSS_RealTimeIntegrityReq();
    return gnss_RealTimeIntegrityReq_;
  }
  
  private GNSS_DataBitAssistanceReq gnss_DataBitAssistanceReq_;
  public GNSS_DataBitAssistanceReq getGnss_DataBitAssistanceReq() {
    return gnss_DataBitAssistanceReq_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_DataBitAssistanceReq
   */
  public void setGnss_DataBitAssistanceReq(Asn1Object value) {
    this.gnss_DataBitAssistanceReq_ = (GNSS_DataBitAssistanceReq) value;
  }
  public GNSS_DataBitAssistanceReq setGnss_DataBitAssistanceReqToNewInstance() {
    gnss_DataBitAssistanceReq_ = new GNSS_DataBitAssistanceReq();
    return gnss_DataBitAssistanceReq_;
  }
  
  private GNSS_AcquisitionAssistanceReq gnss_AcquisitionAssistanceReq_;
  public GNSS_AcquisitionAssistanceReq getGnss_AcquisitionAssistanceReq() {
    return gnss_AcquisitionAssistanceReq_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_AcquisitionAssistanceReq
   */
  public void setGnss_AcquisitionAssistanceReq(Asn1Object value) {
    this.gnss_AcquisitionAssistanceReq_ = (GNSS_AcquisitionAssistanceReq) value;
  }
  public GNSS_AcquisitionAssistanceReq setGnss_AcquisitionAssistanceReqToNewInstance() {
    gnss_AcquisitionAssistanceReq_ = new GNSS_AcquisitionAssistanceReq();
    return gnss_AcquisitionAssistanceReq_;
  }
  
  private GNSS_AlmanacReq gnss_AlmanacReq_;
  public GNSS_AlmanacReq getGnss_AlmanacReq() {
    return gnss_AlmanacReq_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_AlmanacReq
   */
  public void setGnss_AlmanacReq(Asn1Object value) {
    this.gnss_AlmanacReq_ = (GNSS_AlmanacReq) value;
  }
  public GNSS_AlmanacReq setGnss_AlmanacReqToNewInstance() {
    gnss_AlmanacReq_ = new GNSS_AlmanacReq();
    return gnss_AlmanacReq_;
  }
  
  private GNSS_UTC_ModelReq gnss_UTCModelReq_;
  public GNSS_UTC_ModelReq getGnss_UTCModelReq() {
    return gnss_UTCModelReq_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_UTC_ModelReq
   */
  public void setGnss_UTCModelReq(Asn1Object value) {
    this.gnss_UTCModelReq_ = (GNSS_UTC_ModelReq) value;
  }
  public GNSS_UTC_ModelReq setGnss_UTCModelReqToNewInstance() {
    gnss_UTCModelReq_ = new GNSS_UTC_ModelReq();
    return gnss_UTCModelReq_;
  }
  
  private GNSS_AuxiliaryInformationReq gnss_AuxiliaryInformationReq_;
  public GNSS_AuxiliaryInformationReq getGnss_AuxiliaryInformationReq() {
    return gnss_AuxiliaryInformationReq_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_AuxiliaryInformationReq
   */
  public void setGnss_AuxiliaryInformationReq(Asn1Object value) {
    this.gnss_AuxiliaryInformationReq_ = (GNSS_AuxiliaryInformationReq) value;
  }
  public GNSS_AuxiliaryInformationReq setGnss_AuxiliaryInformationReqToNewInstance() {
    gnss_AuxiliaryInformationReq_ = new GNSS_AuxiliaryInformationReq();
    return gnss_AuxiliaryInformationReq_;
  }
  

  
  private GNSS_GenericAssistDataReqElement.ext1Type  extensionExt1;
  public GNSS_GenericAssistDataReqElement.ext1Type getExtensionExt1() {
    return extensionExt1;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_GenericAssistDataReqElement.ext1Type
   */
  public void setExtensionExt1(Asn1Object value) {
    extensionExt1 = (GNSS_GenericAssistDataReqElement.ext1Type) value;
  }
  public void setExtensionExt1ToNewInstance() {
    extensionExt1 = new GNSS_GenericAssistDataReqElement.ext1Type();
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
            return getGnss_TimeModelsReq() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_TimeModelsReq();
          }

          @Override public void setToNewInstance() {
            setGnss_TimeModelsReqToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_TimeModelListReq.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_TimeModelsReq : "
                    + getGnss_TimeModelsReq().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getGnss_DifferentialCorrectionsReq() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_DifferentialCorrectionsReq();
          }

          @Override public void setToNewInstance() {
            setGnss_DifferentialCorrectionsReqToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_DifferentialCorrectionsReq.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_DifferentialCorrectionsReq : "
                    + getGnss_DifferentialCorrectionsReq().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getGnss_NavigationModelReq() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_NavigationModelReq();
          }

          @Override public void setToNewInstance() {
            setGnss_NavigationModelReqToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_NavigationModelReq.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_NavigationModelReq : "
                    + getGnss_NavigationModelReq().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getGnss_RealTimeIntegrityReq() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_RealTimeIntegrityReq();
          }

          @Override public void setToNewInstance() {
            setGnss_RealTimeIntegrityReqToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_RealTimeIntegrityReq.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_RealTimeIntegrityReq : "
                    + getGnss_RealTimeIntegrityReq().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getGnss_DataBitAssistanceReq() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_DataBitAssistanceReq();
          }

          @Override public void setToNewInstance() {
            setGnss_DataBitAssistanceReqToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_DataBitAssistanceReq.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_DataBitAssistanceReq : "
                    + getGnss_DataBitAssistanceReq().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 7);

          @Override public boolean isExplicitlySet() {
            return getGnss_AcquisitionAssistanceReq() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_AcquisitionAssistanceReq();
          }

          @Override public void setToNewInstance() {
            setGnss_AcquisitionAssistanceReqToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_AcquisitionAssistanceReq.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_AcquisitionAssistanceReq : "
                    + getGnss_AcquisitionAssistanceReq().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 8);

          @Override public boolean isExplicitlySet() {
            return getGnss_AlmanacReq() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_AlmanacReq();
          }

          @Override public void setToNewInstance() {
            setGnss_AlmanacReqToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_AlmanacReq.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_AlmanacReq : "
                    + getGnss_AlmanacReq().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 9);

          @Override public boolean isExplicitlySet() {
            return getGnss_UTCModelReq() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_UTCModelReq();
          }

          @Override public void setToNewInstance() {
            setGnss_UTCModelReqToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_UTC_ModelReq.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_UTCModelReq : "
                    + getGnss_UTCModelReq().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 10);

          @Override public boolean isExplicitlySet() {
            return getGnss_AuxiliaryInformationReq() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_AuxiliaryInformationReq();
          }

          @Override public void setToNewInstance() {
            setGnss_AuxiliaryInformationReqToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_AuxiliaryInformationReq.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_AuxiliaryInformationReq : "
                    + getGnss_AuxiliaryInformationReq().toIndentedString(indent);
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

  
  private BDS_DifferentialCorrectionsReq_r12 bds_DifferentialCorrectionsReq_r12_;
  public BDS_DifferentialCorrectionsReq_r12 getBds_DifferentialCorrectionsReq_r12() {
    return bds_DifferentialCorrectionsReq_r12_;
  }
  /**
   * @throws ClassCastException if value is not a BDS_DifferentialCorrectionsReq_r12
   */
  public void setBds_DifferentialCorrectionsReq_r12(Asn1Object value) {
    this.bds_DifferentialCorrectionsReq_r12_ = (BDS_DifferentialCorrectionsReq_r12) value;
  }
  public BDS_DifferentialCorrectionsReq_r12 setBds_DifferentialCorrectionsReq_r12ToNewInstance() {
    bds_DifferentialCorrectionsReq_r12_ = new BDS_DifferentialCorrectionsReq_r12();
    return bds_DifferentialCorrectionsReq_r12_;
  }
  
  private BDS_GridModelReq_r12 bds_GridModelReq_r12_;
  public BDS_GridModelReq_r12 getBds_GridModelReq_r12() {
    return bds_GridModelReq_r12_;
  }
  /**
   * @throws ClassCastException if value is not a BDS_GridModelReq_r12
   */
  public void setBds_GridModelReq_r12(Asn1Object value) {
    this.bds_GridModelReq_r12_ = (BDS_GridModelReq_r12) value;
  }
  public BDS_GridModelReq_r12 setBds_GridModelReq_r12ToNewInstance() {
    bds_GridModelReq_r12_ = new BDS_GridModelReq_r12();
    return bds_GridModelReq_r12_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getBds_DifferentialCorrectionsReq_r12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getBds_DifferentialCorrectionsReq_r12();
          }

          @Override public void setToNewInstance() {
            setBds_DifferentialCorrectionsReq_r12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? BDS_DifferentialCorrectionsReq_r12.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bds_DifferentialCorrectionsReq_r12 : "
                    + getBds_DifferentialCorrectionsReq_r12().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getBds_GridModelReq_r12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getBds_GridModelReq_r12();
          }

          @Override public void setToNewInstance() {
            setBds_GridModelReq_r12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? BDS_GridModelReq_r12.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bds_GridModelReq_r12 : "
                    + getBds_GridModelReq_r12().toIndentedString(indent);
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
    builder.append("GNSS_GenericAssistDataReqElement = {\n");
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
