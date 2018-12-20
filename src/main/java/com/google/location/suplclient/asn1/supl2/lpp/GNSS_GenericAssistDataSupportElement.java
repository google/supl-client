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
public  class GNSS_GenericAssistDataSupportElement extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GNSS_GenericAssistDataSupportElement
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GNSS_GenericAssistDataSupportElement() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GNSS_GenericAssistDataSupportElement;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GNSS_GenericAssistDataSupportElement != null) {
      return ImmutableList.of(TAG_GNSS_GenericAssistDataSupportElement);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GNSS_GenericAssistDataSupportElement from encoded stream.
   */
  public static GNSS_GenericAssistDataSupportElement fromPerUnaligned(byte[] encodedBytes) {
    GNSS_GenericAssistDataSupportElement result = new GNSS_GenericAssistDataSupportElement();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GNSS_GenericAssistDataSupportElement from encoded stream.
   */
  public static GNSS_GenericAssistDataSupportElement fromPerAligned(byte[] encodedBytes) {
    GNSS_GenericAssistDataSupportElement result = new GNSS_GenericAssistDataSupportElement();
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
  
  private GNSS_TimeModelListSupport gnss_TimeModelsSupport_;
  public GNSS_TimeModelListSupport getGnss_TimeModelsSupport() {
    return gnss_TimeModelsSupport_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_TimeModelListSupport
   */
  public void setGnss_TimeModelsSupport(Asn1Object value) {
    this.gnss_TimeModelsSupport_ = (GNSS_TimeModelListSupport) value;
  }
  public GNSS_TimeModelListSupport setGnss_TimeModelsSupportToNewInstance() {
    gnss_TimeModelsSupport_ = new GNSS_TimeModelListSupport();
    return gnss_TimeModelsSupport_;
  }
  
  private GNSS_DifferentialCorrectionsSupport gnss_DifferentialCorrectionsSupport_;
  public GNSS_DifferentialCorrectionsSupport getGnss_DifferentialCorrectionsSupport() {
    return gnss_DifferentialCorrectionsSupport_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_DifferentialCorrectionsSupport
   */
  public void setGnss_DifferentialCorrectionsSupport(Asn1Object value) {
    this.gnss_DifferentialCorrectionsSupport_ = (GNSS_DifferentialCorrectionsSupport) value;
  }
  public GNSS_DifferentialCorrectionsSupport setGnss_DifferentialCorrectionsSupportToNewInstance() {
    gnss_DifferentialCorrectionsSupport_ = new GNSS_DifferentialCorrectionsSupport();
    return gnss_DifferentialCorrectionsSupport_;
  }
  
  private GNSS_NavigationModelSupport gnss_NavigationModelSupport_;
  public GNSS_NavigationModelSupport getGnss_NavigationModelSupport() {
    return gnss_NavigationModelSupport_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_NavigationModelSupport
   */
  public void setGnss_NavigationModelSupport(Asn1Object value) {
    this.gnss_NavigationModelSupport_ = (GNSS_NavigationModelSupport) value;
  }
  public GNSS_NavigationModelSupport setGnss_NavigationModelSupportToNewInstance() {
    gnss_NavigationModelSupport_ = new GNSS_NavigationModelSupport();
    return gnss_NavigationModelSupport_;
  }
  
  private GNSS_RealTimeIntegritySupport gnss_RealTimeIntegritySupport_;
  public GNSS_RealTimeIntegritySupport getGnss_RealTimeIntegritySupport() {
    return gnss_RealTimeIntegritySupport_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_RealTimeIntegritySupport
   */
  public void setGnss_RealTimeIntegritySupport(Asn1Object value) {
    this.gnss_RealTimeIntegritySupport_ = (GNSS_RealTimeIntegritySupport) value;
  }
  public GNSS_RealTimeIntegritySupport setGnss_RealTimeIntegritySupportToNewInstance() {
    gnss_RealTimeIntegritySupport_ = new GNSS_RealTimeIntegritySupport();
    return gnss_RealTimeIntegritySupport_;
  }
  
  private GNSS_DataBitAssistanceSupport gnss_DataBitAssistanceSupport_;
  public GNSS_DataBitAssistanceSupport getGnss_DataBitAssistanceSupport() {
    return gnss_DataBitAssistanceSupport_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_DataBitAssistanceSupport
   */
  public void setGnss_DataBitAssistanceSupport(Asn1Object value) {
    this.gnss_DataBitAssistanceSupport_ = (GNSS_DataBitAssistanceSupport) value;
  }
  public GNSS_DataBitAssistanceSupport setGnss_DataBitAssistanceSupportToNewInstance() {
    gnss_DataBitAssistanceSupport_ = new GNSS_DataBitAssistanceSupport();
    return gnss_DataBitAssistanceSupport_;
  }
  
  private GNSS_AcquisitionAssistanceSupport gnss_AcquisitionAssistanceSupport_;
  public GNSS_AcquisitionAssistanceSupport getGnss_AcquisitionAssistanceSupport() {
    return gnss_AcquisitionAssistanceSupport_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_AcquisitionAssistanceSupport
   */
  public void setGnss_AcquisitionAssistanceSupport(Asn1Object value) {
    this.gnss_AcquisitionAssistanceSupport_ = (GNSS_AcquisitionAssistanceSupport) value;
  }
  public GNSS_AcquisitionAssistanceSupport setGnss_AcquisitionAssistanceSupportToNewInstance() {
    gnss_AcquisitionAssistanceSupport_ = new GNSS_AcquisitionAssistanceSupport();
    return gnss_AcquisitionAssistanceSupport_;
  }
  
  private GNSS_AlmanacSupport gnss_AlmanacSupport_;
  public GNSS_AlmanacSupport getGnss_AlmanacSupport() {
    return gnss_AlmanacSupport_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_AlmanacSupport
   */
  public void setGnss_AlmanacSupport(Asn1Object value) {
    this.gnss_AlmanacSupport_ = (GNSS_AlmanacSupport) value;
  }
  public GNSS_AlmanacSupport setGnss_AlmanacSupportToNewInstance() {
    gnss_AlmanacSupport_ = new GNSS_AlmanacSupport();
    return gnss_AlmanacSupport_;
  }
  
  private GNSS_UTC_ModelSupport gnss_UTC_ModelSupport_;
  public GNSS_UTC_ModelSupport getGnss_UTC_ModelSupport() {
    return gnss_UTC_ModelSupport_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_UTC_ModelSupport
   */
  public void setGnss_UTC_ModelSupport(Asn1Object value) {
    this.gnss_UTC_ModelSupport_ = (GNSS_UTC_ModelSupport) value;
  }
  public GNSS_UTC_ModelSupport setGnss_UTC_ModelSupportToNewInstance() {
    gnss_UTC_ModelSupport_ = new GNSS_UTC_ModelSupport();
    return gnss_UTC_ModelSupport_;
  }
  
  private GNSS_AuxiliaryInformationSupport gnss_AuxiliaryInformationSupport_;
  public GNSS_AuxiliaryInformationSupport getGnss_AuxiliaryInformationSupport() {
    return gnss_AuxiliaryInformationSupport_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_AuxiliaryInformationSupport
   */
  public void setGnss_AuxiliaryInformationSupport(Asn1Object value) {
    this.gnss_AuxiliaryInformationSupport_ = (GNSS_AuxiliaryInformationSupport) value;
  }
  public GNSS_AuxiliaryInformationSupport setGnss_AuxiliaryInformationSupportToNewInstance() {
    gnss_AuxiliaryInformationSupport_ = new GNSS_AuxiliaryInformationSupport();
    return gnss_AuxiliaryInformationSupport_;
  }
  

  
  private GNSS_GenericAssistDataSupportElement.ext1Type  extensionExt1;
  public GNSS_GenericAssistDataSupportElement.ext1Type getExtensionExt1() {
    return extensionExt1;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_GenericAssistDataSupportElement.ext1Type
   */
  public void setExtensionExt1(Asn1Object value) {
    extensionExt1 = (GNSS_GenericAssistDataSupportElement.ext1Type) value;
  }
  public void setExtensionExt1ToNewInstance() {
    extensionExt1 = new GNSS_GenericAssistDataSupportElement.ext1Type();
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
            return getGnss_TimeModelsSupport() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_TimeModelsSupport();
          }

          @Override public void setToNewInstance() {
            setGnss_TimeModelsSupportToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_TimeModelListSupport.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_TimeModelsSupport : "
                    + getGnss_TimeModelsSupport().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getGnss_DifferentialCorrectionsSupport() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_DifferentialCorrectionsSupport();
          }

          @Override public void setToNewInstance() {
            setGnss_DifferentialCorrectionsSupportToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_DifferentialCorrectionsSupport.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_DifferentialCorrectionsSupport : "
                    + getGnss_DifferentialCorrectionsSupport().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getGnss_NavigationModelSupport() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_NavigationModelSupport();
          }

          @Override public void setToNewInstance() {
            setGnss_NavigationModelSupportToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_NavigationModelSupport.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_NavigationModelSupport : "
                    + getGnss_NavigationModelSupport().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getGnss_RealTimeIntegritySupport() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_RealTimeIntegritySupport();
          }

          @Override public void setToNewInstance() {
            setGnss_RealTimeIntegritySupportToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_RealTimeIntegritySupport.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_RealTimeIntegritySupport : "
                    + getGnss_RealTimeIntegritySupport().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getGnss_DataBitAssistanceSupport() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_DataBitAssistanceSupport();
          }

          @Override public void setToNewInstance() {
            setGnss_DataBitAssistanceSupportToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_DataBitAssistanceSupport.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_DataBitAssistanceSupport : "
                    + getGnss_DataBitAssistanceSupport().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 7);

          @Override public boolean isExplicitlySet() {
            return getGnss_AcquisitionAssistanceSupport() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_AcquisitionAssistanceSupport();
          }

          @Override public void setToNewInstance() {
            setGnss_AcquisitionAssistanceSupportToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_AcquisitionAssistanceSupport.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_AcquisitionAssistanceSupport : "
                    + getGnss_AcquisitionAssistanceSupport().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 8);

          @Override public boolean isExplicitlySet() {
            return getGnss_AlmanacSupport() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_AlmanacSupport();
          }

          @Override public void setToNewInstance() {
            setGnss_AlmanacSupportToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_AlmanacSupport.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_AlmanacSupport : "
                    + getGnss_AlmanacSupport().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 9);

          @Override public boolean isExplicitlySet() {
            return getGnss_UTC_ModelSupport() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_UTC_ModelSupport();
          }

          @Override public void setToNewInstance() {
            setGnss_UTC_ModelSupportToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_UTC_ModelSupport.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_UTC_ModelSupport : "
                    + getGnss_UTC_ModelSupport().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 10);

          @Override public boolean isExplicitlySet() {
            return getGnss_AuxiliaryInformationSupport() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_AuxiliaryInformationSupport();
          }

          @Override public void setToNewInstance() {
            setGnss_AuxiliaryInformationSupportToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_AuxiliaryInformationSupport.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_AuxiliaryInformationSupport : "
                    + getGnss_AuxiliaryInformationSupport().toIndentedString(indent);
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

  
  private BDS_DifferentialCorrectionsSupport_r12 bds_DifferentialCorrectionsSupport_r12_;
  public BDS_DifferentialCorrectionsSupport_r12 getBds_DifferentialCorrectionsSupport_r12() {
    return bds_DifferentialCorrectionsSupport_r12_;
  }
  /**
   * @throws ClassCastException if value is not a BDS_DifferentialCorrectionsSupport_r12
   */
  public void setBds_DifferentialCorrectionsSupport_r12(Asn1Object value) {
    this.bds_DifferentialCorrectionsSupport_r12_ = (BDS_DifferentialCorrectionsSupport_r12) value;
  }
  public BDS_DifferentialCorrectionsSupport_r12 setBds_DifferentialCorrectionsSupport_r12ToNewInstance() {
    bds_DifferentialCorrectionsSupport_r12_ = new BDS_DifferentialCorrectionsSupport_r12();
    return bds_DifferentialCorrectionsSupport_r12_;
  }
  
  private BDS_GridModelSupport_r12 bds_GridModelSupport_r12_;
  public BDS_GridModelSupport_r12 getBds_GridModelSupport_r12() {
    return bds_GridModelSupport_r12_;
  }
  /**
   * @throws ClassCastException if value is not a BDS_GridModelSupport_r12
   */
  public void setBds_GridModelSupport_r12(Asn1Object value) {
    this.bds_GridModelSupport_r12_ = (BDS_GridModelSupport_r12) value;
  }
  public BDS_GridModelSupport_r12 setBds_GridModelSupport_r12ToNewInstance() {
    bds_GridModelSupport_r12_ = new BDS_GridModelSupport_r12();
    return bds_GridModelSupport_r12_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getBds_DifferentialCorrectionsSupport_r12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getBds_DifferentialCorrectionsSupport_r12();
          }

          @Override public void setToNewInstance() {
            setBds_DifferentialCorrectionsSupport_r12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? BDS_DifferentialCorrectionsSupport_r12.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bds_DifferentialCorrectionsSupport_r12 : "
                    + getBds_DifferentialCorrectionsSupport_r12().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getBds_GridModelSupport_r12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getBds_GridModelSupport_r12();
          }

          @Override public void setToNewInstance() {
            setBds_GridModelSupport_r12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? BDS_GridModelSupport_r12.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bds_GridModelSupport_r12 : "
                    + getBds_GridModelSupport_r12().toIndentedString(indent);
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
    builder.append("GNSS_GenericAssistDataSupportElement = {\n");
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
