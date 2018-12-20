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
public  class CommonIEsRequestLocationInformation extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_CommonIEsRequestLocationInformation
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public CommonIEsRequestLocationInformation() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_CommonIEsRequestLocationInformation;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_CommonIEsRequestLocationInformation != null) {
      return ImmutableList.of(TAG_CommonIEsRequestLocationInformation);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new CommonIEsRequestLocationInformation from encoded stream.
   */
  public static CommonIEsRequestLocationInformation fromPerUnaligned(byte[] encodedBytes) {
    CommonIEsRequestLocationInformation result = new CommonIEsRequestLocationInformation();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new CommonIEsRequestLocationInformation from encoded stream.
   */
  public static CommonIEsRequestLocationInformation fromPerAligned(byte[] encodedBytes) {
    CommonIEsRequestLocationInformation result = new CommonIEsRequestLocationInformation();
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

  
  private LocationInformationType locationInformationType_;
  public LocationInformationType getLocationInformationType() {
    return locationInformationType_;
  }
  /**
   * @throws ClassCastException if value is not a LocationInformationType
   */
  public void setLocationInformationType(Asn1Object value) {
    this.locationInformationType_ = (LocationInformationType) value;
  }
  public LocationInformationType setLocationInformationTypeToNewInstance() {
    locationInformationType_ = new LocationInformationType();
    return locationInformationType_;
  }
  
  private TriggeredReportingCriteria triggeredReporting_;
  public TriggeredReportingCriteria getTriggeredReporting() {
    return triggeredReporting_;
  }
  /**
   * @throws ClassCastException if value is not a TriggeredReportingCriteria
   */
  public void setTriggeredReporting(Asn1Object value) {
    this.triggeredReporting_ = (TriggeredReportingCriteria) value;
  }
  public TriggeredReportingCriteria setTriggeredReportingToNewInstance() {
    triggeredReporting_ = new TriggeredReportingCriteria();
    return triggeredReporting_;
  }
  
  private PeriodicalReportingCriteria periodicalReporting_;
  public PeriodicalReportingCriteria getPeriodicalReporting() {
    return periodicalReporting_;
  }
  /**
   * @throws ClassCastException if value is not a PeriodicalReportingCriteria
   */
  public void setPeriodicalReporting(Asn1Object value) {
    this.periodicalReporting_ = (PeriodicalReportingCriteria) value;
  }
  public PeriodicalReportingCriteria setPeriodicalReportingToNewInstance() {
    periodicalReporting_ = new PeriodicalReportingCriteria();
    return periodicalReporting_;
  }
  
  private AdditionalInformation additionalInformation_;
  public AdditionalInformation getAdditionalInformation() {
    return additionalInformation_;
  }
  /**
   * @throws ClassCastException if value is not a AdditionalInformation
   */
  public void setAdditionalInformation(Asn1Object value) {
    this.additionalInformation_ = (AdditionalInformation) value;
  }
  public AdditionalInformation setAdditionalInformationToNewInstance() {
    additionalInformation_ = new AdditionalInformation();
    return additionalInformation_;
  }
  
  private QoS qos_;
  public QoS getQos() {
    return qos_;
  }
  /**
   * @throws ClassCastException if value is not a QoS
   */
  public void setQos(Asn1Object value) {
    this.qos_ = (QoS) value;
  }
  public QoS setQosToNewInstance() {
    qos_ = new QoS();
    return qos_;
  }
  
  private Environment environment_;
  public Environment getEnvironment() {
    return environment_;
  }
  /**
   * @throws ClassCastException if value is not a Environment
   */
  public void setEnvironment(Asn1Object value) {
    this.environment_ = (Environment) value;
  }
  public Environment setEnvironmentToNewInstance() {
    environment_ = new Environment();
    return environment_;
  }
  
  private LocationCoordinateTypes locationCoordinateTypes_;
  public LocationCoordinateTypes getLocationCoordinateTypes() {
    return locationCoordinateTypes_;
  }
  /**
   * @throws ClassCastException if value is not a LocationCoordinateTypes
   */
  public void setLocationCoordinateTypes(Asn1Object value) {
    this.locationCoordinateTypes_ = (LocationCoordinateTypes) value;
  }
  public LocationCoordinateTypes setLocationCoordinateTypesToNewInstance() {
    locationCoordinateTypes_ = new LocationCoordinateTypes();
    return locationCoordinateTypes_;
  }
  
  private VelocityTypes velocityTypes_;
  public VelocityTypes getVelocityTypes() {
    return velocityTypes_;
  }
  /**
   * @throws ClassCastException if value is not a VelocityTypes
   */
  public void setVelocityTypes(Asn1Object value) {
    this.velocityTypes_ = (VelocityTypes) value;
  }
  public VelocityTypes setVelocityTypesToNewInstance() {
    velocityTypes_ = new VelocityTypes();
    return velocityTypes_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getLocationInformationType() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getLocationInformationType();
          }

          @Override public void setToNewInstance() {
            setLocationInformationTypeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? LocationInformationType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "locationInformationType : "
                    + getLocationInformationType().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getTriggeredReporting() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getTriggeredReporting();
          }

          @Override public void setToNewInstance() {
            setTriggeredReportingToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? TriggeredReportingCriteria.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "triggeredReporting : "
                    + getTriggeredReporting().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getPeriodicalReporting() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getPeriodicalReporting();
          }

          @Override public void setToNewInstance() {
            setPeriodicalReportingToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? PeriodicalReportingCriteria.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "periodicalReporting : "
                    + getPeriodicalReporting().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getAdditionalInformation() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getAdditionalInformation();
          }

          @Override public void setToNewInstance() {
            setAdditionalInformationToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? AdditionalInformation.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "additionalInformation : "
                    + getAdditionalInformation().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getQos() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getQos();
          }

          @Override public void setToNewInstance() {
            setQosToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? QoS.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "qos : "
                    + getQos().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getEnvironment() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getEnvironment();
          }

          @Override public void setToNewInstance() {
            setEnvironmentToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Environment.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "environment : "
                    + getEnvironment().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getLocationCoordinateTypes() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getLocationCoordinateTypes();
          }

          @Override public void setToNewInstance() {
            setLocationCoordinateTypesToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? LocationCoordinateTypes.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "locationCoordinateTypes : "
                    + getLocationCoordinateTypes().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 7);

          @Override public boolean isExplicitlySet() {
            return getVelocityTypes() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getVelocityTypes();
          }

          @Override public void setToNewInstance() {
            setVelocityTypesToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? VelocityTypes.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "velocityTypes : "
                    + getVelocityTypes().toIndentedString(indent);
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
    builder.append("CommonIEsRequestLocationInformation = {\n");
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
