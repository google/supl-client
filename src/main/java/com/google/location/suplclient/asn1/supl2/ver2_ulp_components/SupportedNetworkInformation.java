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

package com.google.location.suplclient.asn1.supl2.ver2_ulp_components;

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
public  class SupportedNetworkInformation extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_SupportedNetworkInformation
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public SupportedNetworkInformation() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_SupportedNetworkInformation;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_SupportedNetworkInformation != null) {
      return ImmutableList.of(TAG_SupportedNetworkInformation);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new SupportedNetworkInformation from encoded stream.
   */
  public static SupportedNetworkInformation fromPerUnaligned(byte[] encodedBytes) {
    SupportedNetworkInformation result = new SupportedNetworkInformation();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new SupportedNetworkInformation from encoded stream.
   */
  public static SupportedNetworkInformation fromPerAligned(byte[] encodedBytes) {
    SupportedNetworkInformation result = new SupportedNetworkInformation();
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

  
  private SupportedNetworkInformation.wLANType wLAN_;
  public SupportedNetworkInformation.wLANType getWLAN() {
    return wLAN_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedNetworkInformation.wLANType
   */
  public void setWLAN(Asn1Object value) {
    this.wLAN_ = (SupportedNetworkInformation.wLANType) value;
  }
  public SupportedNetworkInformation.wLANType setWLANToNewInstance() {
    wLAN_ = new SupportedNetworkInformation.wLANType();
    return wLAN_;
  }
  
  private SupportedWLANInfo supportedWLANInfo_;
  public SupportedWLANInfo getSupportedWLANInfo() {
    return supportedWLANInfo_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedWLANInfo
   */
  public void setSupportedWLANInfo(Asn1Object value) {
    this.supportedWLANInfo_ = (SupportedWLANInfo) value;
  }
  public SupportedWLANInfo setSupportedWLANInfoToNewInstance() {
    supportedWLANInfo_ = new SupportedWLANInfo();
    return supportedWLANInfo_;
  }
  
  private SupportedWLANApsList supportedWLANApsList_;
  public SupportedWLANApsList getSupportedWLANApsList() {
    return supportedWLANApsList_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedWLANApsList
   */
  public void setSupportedWLANApsList(Asn1Object value) {
    this.supportedWLANApsList_ = (SupportedWLANApsList) value;
  }
  public SupportedWLANApsList setSupportedWLANApsListToNewInstance() {
    supportedWLANApsList_ = new SupportedWLANApsList();
    return supportedWLANApsList_;
  }
  
  private SupportedNetworkInformation.gSMType gSM_;
  public SupportedNetworkInformation.gSMType getGSM() {
    return gSM_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedNetworkInformation.gSMType
   */
  public void setGSM(Asn1Object value) {
    this.gSM_ = (SupportedNetworkInformation.gSMType) value;
  }
  public SupportedNetworkInformation.gSMType setGSMToNewInstance() {
    gSM_ = new SupportedNetworkInformation.gSMType();
    return gSM_;
  }
  
  private SupportedNetworkInformation.wCDMAType wCDMA_;
  public SupportedNetworkInformation.wCDMAType getWCDMA() {
    return wCDMA_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedNetworkInformation.wCDMAType
   */
  public void setWCDMA(Asn1Object value) {
    this.wCDMA_ = (SupportedNetworkInformation.wCDMAType) value;
  }
  public SupportedNetworkInformation.wCDMAType setWCDMAToNewInstance() {
    wCDMA_ = new SupportedNetworkInformation.wCDMAType();
    return wCDMA_;
  }
  
  private SupportedWCDMAInfo supportedWCDMAInfo_;
  public SupportedWCDMAInfo getSupportedWCDMAInfo() {
    return supportedWCDMAInfo_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedWCDMAInfo
   */
  public void setSupportedWCDMAInfo(Asn1Object value) {
    this.supportedWCDMAInfo_ = (SupportedWCDMAInfo) value;
  }
  public SupportedWCDMAInfo setSupportedWCDMAInfoToNewInstance() {
    supportedWCDMAInfo_ = new SupportedWCDMAInfo();
    return supportedWCDMAInfo_;
  }
  
  private SupportedNetworkInformation.cDMAType cDMA_;
  public SupportedNetworkInformation.cDMAType getCDMA() {
    return cDMA_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedNetworkInformation.cDMAType
   */
  public void setCDMA(Asn1Object value) {
    this.cDMA_ = (SupportedNetworkInformation.cDMAType) value;
  }
  public SupportedNetworkInformation.cDMAType setCDMAToNewInstance() {
    cDMA_ = new SupportedNetworkInformation.cDMAType();
    return cDMA_;
  }
  
  private SupportedNetworkInformation.hRDPType hRDP_;
  public SupportedNetworkInformation.hRDPType getHRDP() {
    return hRDP_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedNetworkInformation.hRDPType
   */
  public void setHRDP(Asn1Object value) {
    this.hRDP_ = (SupportedNetworkInformation.hRDPType) value;
  }
  public SupportedNetworkInformation.hRDPType setHRDPToNewInstance() {
    hRDP_ = new SupportedNetworkInformation.hRDPType();
    return hRDP_;
  }
  
  private SupportedNetworkInformation.uMBType uMB_;
  public SupportedNetworkInformation.uMBType getUMB() {
    return uMB_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedNetworkInformation.uMBType
   */
  public void setUMB(Asn1Object value) {
    this.uMB_ = (SupportedNetworkInformation.uMBType) value;
  }
  public SupportedNetworkInformation.uMBType setUMBToNewInstance() {
    uMB_ = new SupportedNetworkInformation.uMBType();
    return uMB_;
  }
  
  private SupportedNetworkInformation.lTEType lTE_;
  public SupportedNetworkInformation.lTEType getLTE() {
    return lTE_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedNetworkInformation.lTEType
   */
  public void setLTE(Asn1Object value) {
    this.lTE_ = (SupportedNetworkInformation.lTEType) value;
  }
  public SupportedNetworkInformation.lTEType setLTEToNewInstance() {
    lTE_ = new SupportedNetworkInformation.lTEType();
    return lTE_;
  }
  
  private SupportedNetworkInformation.wIMAXType wIMAX_;
  public SupportedNetworkInformation.wIMAXType getWIMAX() {
    return wIMAX_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedNetworkInformation.wIMAXType
   */
  public void setWIMAX(Asn1Object value) {
    this.wIMAX_ = (SupportedNetworkInformation.wIMAXType) value;
  }
  public SupportedNetworkInformation.wIMAXType setWIMAXToNewInstance() {
    wIMAX_ = new SupportedNetworkInformation.wIMAXType();
    return wIMAX_;
  }
  
  private SupportedNetworkInformation.historicType historic_;
  public SupportedNetworkInformation.historicType getHistoric() {
    return historic_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedNetworkInformation.historicType
   */
  public void setHistoric(Asn1Object value) {
    this.historic_ = (SupportedNetworkInformation.historicType) value;
  }
  public SupportedNetworkInformation.historicType setHistoricToNewInstance() {
    historic_ = new SupportedNetworkInformation.historicType();
    return historic_;
  }
  
  private SupportedNetworkInformation.nonServingType nonServing_;
  public SupportedNetworkInformation.nonServingType getNonServing() {
    return nonServing_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedNetworkInformation.nonServingType
   */
  public void setNonServing(Asn1Object value) {
    this.nonServing_ = (SupportedNetworkInformation.nonServingType) value;
  }
  public SupportedNetworkInformation.nonServingType setNonServingToNewInstance() {
    nonServing_ = new SupportedNetworkInformation.nonServingType();
    return nonServing_;
  }
  
  private SupportedNetworkInformation.uTRANGPSReferenceTimeType uTRANGPSReferenceTime_;
  public SupportedNetworkInformation.uTRANGPSReferenceTimeType getUTRANGPSReferenceTime() {
    return uTRANGPSReferenceTime_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedNetworkInformation.uTRANGPSReferenceTimeType
   */
  public void setUTRANGPSReferenceTime(Asn1Object value) {
    this.uTRANGPSReferenceTime_ = (SupportedNetworkInformation.uTRANGPSReferenceTimeType) value;
  }
  public SupportedNetworkInformation.uTRANGPSReferenceTimeType setUTRANGPSReferenceTimeToNewInstance() {
    uTRANGPSReferenceTime_ = new SupportedNetworkInformation.uTRANGPSReferenceTimeType();
    return uTRANGPSReferenceTime_;
  }
  
  private SupportedNetworkInformation.uTRANGANSSReferenceTimeType uTRANGANSSReferenceTime_;
  public SupportedNetworkInformation.uTRANGANSSReferenceTimeType getUTRANGANSSReferenceTime() {
    return uTRANGANSSReferenceTime_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedNetworkInformation.uTRANGANSSReferenceTimeType
   */
  public void setUTRANGANSSReferenceTime(Asn1Object value) {
    this.uTRANGANSSReferenceTime_ = (SupportedNetworkInformation.uTRANGANSSReferenceTimeType) value;
  }
  public SupportedNetworkInformation.uTRANGANSSReferenceTimeType setUTRANGANSSReferenceTimeToNewInstance() {
    uTRANGANSSReferenceTime_ = new SupportedNetworkInformation.uTRANGANSSReferenceTimeType();
    return uTRANGANSSReferenceTime_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getWLAN() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getWLAN();
          }

          @Override public void setToNewInstance() {
            setWLANToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedNetworkInformation.wLANType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "wLAN : "
                    + getWLAN().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getSupportedWLANInfo() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getSupportedWLANInfo();
          }

          @Override public void setToNewInstance() {
            setSupportedWLANInfoToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedWLANInfo.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "supportedWLANInfo : "
                    + getSupportedWLANInfo().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getSupportedWLANApsList() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getSupportedWLANApsList();
          }

          @Override public void setToNewInstance() {
            setSupportedWLANApsListToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedWLANApsList.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "supportedWLANApsList : "
                    + getSupportedWLANApsList().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getGSM() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGSM();
          }

          @Override public void setToNewInstance() {
            setGSMToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedNetworkInformation.gSMType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gSM : "
                    + getGSM().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getWCDMA() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getWCDMA();
          }

          @Override public void setToNewInstance() {
            setWCDMAToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedNetworkInformation.wCDMAType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "wCDMA : "
                    + getWCDMA().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getSupportedWCDMAInfo() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getSupportedWCDMAInfo();
          }

          @Override public void setToNewInstance() {
            setSupportedWCDMAInfoToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedWCDMAInfo.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "supportedWCDMAInfo : "
                    + getSupportedWCDMAInfo().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getCDMA() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCDMA();
          }

          @Override public void setToNewInstance() {
            setCDMAToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedNetworkInformation.cDMAType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "cDMA : "
                    + getCDMA().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 7);

          @Override public boolean isExplicitlySet() {
            return getHRDP() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getHRDP();
          }

          @Override public void setToNewInstance() {
            setHRDPToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedNetworkInformation.hRDPType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "hRDP : "
                    + getHRDP().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 8);

          @Override public boolean isExplicitlySet() {
            return getUMB() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getUMB();
          }

          @Override public void setToNewInstance() {
            setUMBToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedNetworkInformation.uMBType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "uMB : "
                    + getUMB().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 9);

          @Override public boolean isExplicitlySet() {
            return getLTE() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getLTE();
          }

          @Override public void setToNewInstance() {
            setLTEToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedNetworkInformation.lTEType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "lTE : "
                    + getLTE().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 10);

          @Override public boolean isExplicitlySet() {
            return getWIMAX() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getWIMAX();
          }

          @Override public void setToNewInstance() {
            setWIMAXToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedNetworkInformation.wIMAXType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "wIMAX : "
                    + getWIMAX().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 11);

          @Override public boolean isExplicitlySet() {
            return getHistoric() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getHistoric();
          }

          @Override public void setToNewInstance() {
            setHistoricToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedNetworkInformation.historicType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "historic : "
                    + getHistoric().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 12);

          @Override public boolean isExplicitlySet() {
            return getNonServing() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getNonServing();
          }

          @Override public void setToNewInstance() {
            setNonServingToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedNetworkInformation.nonServingType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "nonServing : "
                    + getNonServing().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 13);

          @Override public boolean isExplicitlySet() {
            return getUTRANGPSReferenceTime() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getUTRANGPSReferenceTime();
          }

          @Override public void setToNewInstance() {
            setUTRANGPSReferenceTimeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedNetworkInformation.uTRANGPSReferenceTimeType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "uTRANGPSReferenceTime : "
                    + getUTRANGPSReferenceTime().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 14);

          @Override public boolean isExplicitlySet() {
            return getUTRANGANSSReferenceTime() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getUTRANGANSSReferenceTime();
          }

          @Override public void setToNewInstance() {
            setUTRANGANSSReferenceTimeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedNetworkInformation.uTRANGANSSReferenceTimeType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "uTRANGANSSReferenceTime : "
                    + getUTRANGANSSReferenceTime().toIndentedString(indent);
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
public static class wLANType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_wLANType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public wLANType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_wLANType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_wLANType != null) {
      return ImmutableList.of(TAG_wLANType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new wLANType from encoded stream.
   */
  public static wLANType fromPerUnaligned(byte[] encodedBytes) {
    wLANType result = new wLANType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new wLANType from encoded stream.
   */
  public static wLANType fromPerAligned(byte[] encodedBytes) {
    wLANType result = new wLANType();
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
    return "wLANType = " + getValue() + ";\n";
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
public static class gSMType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_gSMType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gSMType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gSMType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gSMType != null) {
      return ImmutableList.of(TAG_gSMType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gSMType from encoded stream.
   */
  public static gSMType fromPerUnaligned(byte[] encodedBytes) {
    gSMType result = new gSMType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gSMType from encoded stream.
   */
  public static gSMType fromPerAligned(byte[] encodedBytes) {
    gSMType result = new gSMType();
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
    return "gSMType = " + getValue() + ";\n";
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
public static class wCDMAType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_wCDMAType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public wCDMAType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_wCDMAType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_wCDMAType != null) {
      return ImmutableList.of(TAG_wCDMAType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new wCDMAType from encoded stream.
   */
  public static wCDMAType fromPerUnaligned(byte[] encodedBytes) {
    wCDMAType result = new wCDMAType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new wCDMAType from encoded stream.
   */
  public static wCDMAType fromPerAligned(byte[] encodedBytes) {
    wCDMAType result = new wCDMAType();
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
    return "wCDMAType = " + getValue() + ";\n";
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
public static class cDMAType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_cDMAType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public cDMAType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_cDMAType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_cDMAType != null) {
      return ImmutableList.of(TAG_cDMAType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new cDMAType from encoded stream.
   */
  public static cDMAType fromPerUnaligned(byte[] encodedBytes) {
    cDMAType result = new cDMAType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new cDMAType from encoded stream.
   */
  public static cDMAType fromPerAligned(byte[] encodedBytes) {
    cDMAType result = new cDMAType();
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
    return "cDMAType = " + getValue() + ";\n";
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
public static class hRDPType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_hRDPType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public hRDPType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_hRDPType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_hRDPType != null) {
      return ImmutableList.of(TAG_hRDPType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new hRDPType from encoded stream.
   */
  public static hRDPType fromPerUnaligned(byte[] encodedBytes) {
    hRDPType result = new hRDPType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new hRDPType from encoded stream.
   */
  public static hRDPType fromPerAligned(byte[] encodedBytes) {
    hRDPType result = new hRDPType();
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
    return "hRDPType = " + getValue() + ";\n";
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
public static class uMBType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_uMBType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public uMBType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_uMBType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_uMBType != null) {
      return ImmutableList.of(TAG_uMBType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new uMBType from encoded stream.
   */
  public static uMBType fromPerUnaligned(byte[] encodedBytes) {
    uMBType result = new uMBType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new uMBType from encoded stream.
   */
  public static uMBType fromPerAligned(byte[] encodedBytes) {
    uMBType result = new uMBType();
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
    return "uMBType = " + getValue() + ";\n";
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
public static class lTEType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_lTEType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public lTEType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_lTEType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_lTEType != null) {
      return ImmutableList.of(TAG_lTEType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new lTEType from encoded stream.
   */
  public static lTEType fromPerUnaligned(byte[] encodedBytes) {
    lTEType result = new lTEType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new lTEType from encoded stream.
   */
  public static lTEType fromPerAligned(byte[] encodedBytes) {
    lTEType result = new lTEType();
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
    return "lTEType = " + getValue() + ";\n";
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
public static class wIMAXType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_wIMAXType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public wIMAXType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_wIMAXType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_wIMAXType != null) {
      return ImmutableList.of(TAG_wIMAXType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new wIMAXType from encoded stream.
   */
  public static wIMAXType fromPerUnaligned(byte[] encodedBytes) {
    wIMAXType result = new wIMAXType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new wIMAXType from encoded stream.
   */
  public static wIMAXType fromPerAligned(byte[] encodedBytes) {
    wIMAXType result = new wIMAXType();
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
    return "wIMAXType = " + getValue() + ";\n";
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
public static class historicType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_historicType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public historicType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_historicType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_historicType != null) {
      return ImmutableList.of(TAG_historicType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new historicType from encoded stream.
   */
  public static historicType fromPerUnaligned(byte[] encodedBytes) {
    historicType result = new historicType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new historicType from encoded stream.
   */
  public static historicType fromPerAligned(byte[] encodedBytes) {
    historicType result = new historicType();
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
    return "historicType = " + getValue() + ";\n";
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
public static class nonServingType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_nonServingType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public nonServingType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_nonServingType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_nonServingType != null) {
      return ImmutableList.of(TAG_nonServingType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new nonServingType from encoded stream.
   */
  public static nonServingType fromPerUnaligned(byte[] encodedBytes) {
    nonServingType result = new nonServingType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new nonServingType from encoded stream.
   */
  public static nonServingType fromPerAligned(byte[] encodedBytes) {
    nonServingType result = new nonServingType();
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
    return "nonServingType = " + getValue() + ";\n";
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
public static class uTRANGPSReferenceTimeType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_uTRANGPSReferenceTimeType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public uTRANGPSReferenceTimeType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_uTRANGPSReferenceTimeType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_uTRANGPSReferenceTimeType != null) {
      return ImmutableList.of(TAG_uTRANGPSReferenceTimeType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new uTRANGPSReferenceTimeType from encoded stream.
   */
  public static uTRANGPSReferenceTimeType fromPerUnaligned(byte[] encodedBytes) {
    uTRANGPSReferenceTimeType result = new uTRANGPSReferenceTimeType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new uTRANGPSReferenceTimeType from encoded stream.
   */
  public static uTRANGPSReferenceTimeType fromPerAligned(byte[] encodedBytes) {
    uTRANGPSReferenceTimeType result = new uTRANGPSReferenceTimeType();
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
    return "uTRANGPSReferenceTimeType = " + getValue() + ";\n";
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
public static class uTRANGANSSReferenceTimeType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_uTRANGANSSReferenceTimeType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public uTRANGANSSReferenceTimeType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_uTRANGANSSReferenceTimeType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_uTRANGANSSReferenceTimeType != null) {
      return ImmutableList.of(TAG_uTRANGANSSReferenceTimeType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new uTRANGANSSReferenceTimeType from encoded stream.
   */
  public static uTRANGANSSReferenceTimeType fromPerUnaligned(byte[] encodedBytes) {
    uTRANGANSSReferenceTimeType result = new uTRANGANSSReferenceTimeType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new uTRANGANSSReferenceTimeType from encoded stream.
   */
  public static uTRANGANSSReferenceTimeType fromPerAligned(byte[] encodedBytes) {
    uTRANGANSSReferenceTimeType result = new uTRANGANSSReferenceTimeType();
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
    return "uTRANGANSSReferenceTimeType = " + getValue() + ";\n";
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
    builder.append("SupportedNetworkInformation = {\n");
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
