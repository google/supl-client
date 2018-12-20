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
import com.google.location.suplclient.asn1.base.Asn1Object;
import com.google.location.suplclient.asn1.base.Asn1Sequence;
import com.google.location.suplclient.asn1.base.Asn1Tag;
import com.google.location.suplclient.asn1.base.BitStream;
import com.google.location.suplclient.asn1.base.BitStreamReader;
import com.google.location.suplclient.asn1.base.SequenceComponent;
import com.google.location.suplclient.asn1.supl2.supl_start.SETCapabilities;
import com.google.location.suplclient.asn1.supl2.ulp_components.LocationId;
import com.google.location.suplclient.asn1.supl2.ulp_components.Position;
import com.google.location.suplclient.asn1.supl2.ulp_components.QoP;
import com.google.location.suplclient.asn1.supl2.ulp_components.Ver;
import com.google.location.suplclient.asn1.supl2.ver2_ulp_components.ApplicationID;
import com.google.location.suplclient.asn1.supl2.ver2_ulp_components.CauseCode;
import com.google.location.suplclient.asn1.supl2.ver2_ulp_components.MultipleLocationIds;
import com.google.location.suplclient.asn1.supl2.ver2_ulp_components.ReportingCap;
import com.google.location.suplclient.asn1.supl2.ver2_ulp_components.ThirdParty;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
* 
*/
public  class Ver2_SUPLTRIGGEREDSTART extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_Ver2_SUPLTRIGGEREDSTART
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public Ver2_SUPLTRIGGEREDSTART() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_Ver2_SUPLTRIGGEREDSTART;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_Ver2_SUPLTRIGGEREDSTART != null) {
      return ImmutableList.of(TAG_Ver2_SUPLTRIGGEREDSTART);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new Ver2_SUPLTRIGGEREDSTART from encoded stream.
   */
  public static Ver2_SUPLTRIGGEREDSTART fromPerUnaligned(byte[] encodedBytes) {
    Ver2_SUPLTRIGGEREDSTART result = new Ver2_SUPLTRIGGEREDSTART();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new Ver2_SUPLTRIGGEREDSTART from encoded stream.
   */
  public static Ver2_SUPLTRIGGEREDSTART fromPerAligned(byte[] encodedBytes) {
    Ver2_SUPLTRIGGEREDSTART result = new Ver2_SUPLTRIGGEREDSTART();
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

  
  private SETCapabilities sETCapabilities_;
  public SETCapabilities getSETCapabilities() {
    return sETCapabilities_;
  }
  /**
   * @throws ClassCastException if value is not a SETCapabilities
   */
  public void setSETCapabilities(Asn1Object value) {
    this.sETCapabilities_ = (SETCapabilities) value;
  }
  public SETCapabilities setSETCapabilitiesToNewInstance() {
    sETCapabilities_ = new SETCapabilities();
    return sETCapabilities_;
  }
  
  private LocationId locationId_;
  public LocationId getLocationId() {
    return locationId_;
  }
  /**
   * @throws ClassCastException if value is not a LocationId
   */
  public void setLocationId(Asn1Object value) {
    this.locationId_ = (LocationId) value;
  }
  public LocationId setLocationIdToNewInstance() {
    locationId_ = new LocationId();
    return locationId_;
  }
  
  private Ver ver_;
  public Ver getVer() {
    return ver_;
  }
  /**
   * @throws ClassCastException if value is not a Ver
   */
  public void setVer(Asn1Object value) {
    this.ver_ = (Ver) value;
  }
  public Ver setVerToNewInstance() {
    ver_ = new Ver();
    return ver_;
  }
  
  private QoP qoP_;
  public QoP getQoP() {
    return qoP_;
  }
  /**
   * @throws ClassCastException if value is not a QoP
   */
  public void setQoP(Asn1Object value) {
    this.qoP_ = (QoP) value;
  }
  public QoP setQoPToNewInstance() {
    qoP_ = new QoP();
    return qoP_;
  }
  
  private MultipleLocationIds multipleLocationIds_;
  public MultipleLocationIds getMultipleLocationIds() {
    return multipleLocationIds_;
  }
  /**
   * @throws ClassCastException if value is not a MultipleLocationIds
   */
  public void setMultipleLocationIds(Asn1Object value) {
    this.multipleLocationIds_ = (MultipleLocationIds) value;
  }
  public MultipleLocationIds setMultipleLocationIdsToNewInstance() {
    multipleLocationIds_ = new MultipleLocationIds();
    return multipleLocationIds_;
  }
  
  private ThirdParty thirdParty_;
  public ThirdParty getThirdParty() {
    return thirdParty_;
  }
  /**
   * @throws ClassCastException if value is not a ThirdParty
   */
  public void setThirdParty(Asn1Object value) {
    this.thirdParty_ = (ThirdParty) value;
  }
  public ThirdParty setThirdPartyToNewInstance() {
    thirdParty_ = new ThirdParty();
    return thirdParty_;
  }
  
  private ApplicationID applicationID_;
  public ApplicationID getApplicationID() {
    return applicationID_;
  }
  /**
   * @throws ClassCastException if value is not a ApplicationID
   */
  public void setApplicationID(Asn1Object value) {
    this.applicationID_ = (ApplicationID) value;
  }
  public ApplicationID setApplicationIDToNewInstance() {
    applicationID_ = new ApplicationID();
    return applicationID_;
  }
  
  private TriggerType triggerType_;
  public TriggerType getTriggerType() {
    return triggerType_;
  }
  /**
   * @throws ClassCastException if value is not a TriggerType
   */
  public void setTriggerType(Asn1Object value) {
    this.triggerType_ = (TriggerType) value;
  }
  public TriggerType setTriggerTypeToNewInstance() {
    triggerType_ = new TriggerType();
    return triggerType_;
  }
  
  private TriggerParams triggerParams_;
  public TriggerParams getTriggerParams() {
    return triggerParams_;
  }
  /**
   * @throws ClassCastException if value is not a TriggerParams
   */
  public void setTriggerParams(Asn1Object value) {
    this.triggerParams_ = (TriggerParams) value;
  }
  public TriggerParams setTriggerParamsToNewInstance() {
    triggerParams_ = new TriggerParams();
    return triggerParams_;
  }
  
  private Position position_;
  public Position getPosition() {
    return position_;
  }
  /**
   * @throws ClassCastException if value is not a Position
   */
  public void setPosition(Asn1Object value) {
    this.position_ = (Position) value;
  }
  public Position setPositionToNewInstance() {
    position_ = new Position();
    return position_;
  }
  
  private ReportingCap reportingCap_;
  public ReportingCap getReportingCap() {
    return reportingCap_;
  }
  /**
   * @throws ClassCastException if value is not a ReportingCap
   */
  public void setReportingCap(Asn1Object value) {
    this.reportingCap_ = (ReportingCap) value;
  }
  public ReportingCap setReportingCapToNewInstance() {
    reportingCap_ = new ReportingCap();
    return reportingCap_;
  }
  
  private CauseCode causeCode_;
  public CauseCode getCauseCode() {
    return causeCode_;
  }
  /**
   * @throws ClassCastException if value is not a CauseCode
   */
  public void setCauseCode(Asn1Object value) {
    this.causeCode_ = (CauseCode) value;
  }
  public CauseCode setCauseCodeToNewInstance() {
    causeCode_ = new CauseCode();
    return causeCode_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getSETCapabilities() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getSETCapabilities();
          }

          @Override public void setToNewInstance() {
            setSETCapabilitiesToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SETCapabilities.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "sETCapabilities : "
                    + getSETCapabilities().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getLocationId() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getLocationId();
          }

          @Override public void setToNewInstance() {
            setLocationIdToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? LocationId.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "locationId : "
                    + getLocationId().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getVer() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getVer();
          }

          @Override public void setToNewInstance() {
            setVerToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Ver.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ver : "
                    + getVer().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getQoP() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getQoP();
          }

          @Override public void setToNewInstance() {
            setQoPToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? QoP.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "qoP : "
                    + getQoP().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getMultipleLocationIds() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getMultipleLocationIds();
          }

          @Override public void setToNewInstance() {
            setMultipleLocationIdsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? MultipleLocationIds.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "multipleLocationIds : "
                    + getMultipleLocationIds().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getThirdParty() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getThirdParty();
          }

          @Override public void setToNewInstance() {
            setThirdPartyToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ThirdParty.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "thirdParty : "
                    + getThirdParty().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getApplicationID() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getApplicationID();
          }

          @Override public void setToNewInstance() {
            setApplicationIDToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ApplicationID.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "applicationID : "
                    + getApplicationID().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 7);

          @Override public boolean isExplicitlySet() {
            return getTriggerType() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getTriggerType();
          }

          @Override public void setToNewInstance() {
            setTriggerTypeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? TriggerType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "triggerType : "
                    + getTriggerType().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 8);

          @Override public boolean isExplicitlySet() {
            return getTriggerParams() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getTriggerParams();
          }

          @Override public void setToNewInstance() {
            setTriggerParamsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? TriggerParams.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "triggerParams : "
                    + getTriggerParams().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 9);

          @Override public boolean isExplicitlySet() {
            return getPosition() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getPosition();
          }

          @Override public void setToNewInstance() {
            setPositionToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Position.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "position : "
                    + getPosition().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 10);

          @Override public boolean isExplicitlySet() {
            return getReportingCap() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getReportingCap();
          }

          @Override public void setToNewInstance() {
            setReportingCapToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ReportingCap.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "reportingCap : "
                    + getReportingCap().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 11);

          @Override public boolean isExplicitlySet() {
            return getCauseCode() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getCauseCode();
          }

          @Override public void setToNewInstance() {
            setCauseCodeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? CauseCode.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "causeCode : "
                    + getCauseCode().toIndentedString(indent);
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
    builder.append("Ver2_SUPLTRIGGEREDSTART = {\n");
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
