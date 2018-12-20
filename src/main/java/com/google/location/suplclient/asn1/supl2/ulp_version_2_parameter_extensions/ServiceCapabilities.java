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
import com.google.location.suplclient.asn1.base.Asn1Object;
import com.google.location.suplclient.asn1.base.Asn1Sequence;
import com.google.location.suplclient.asn1.base.Asn1Tag;
import com.google.location.suplclient.asn1.base.BitStream;
import com.google.location.suplclient.asn1.base.BitStreamReader;
import com.google.location.suplclient.asn1.base.SequenceComponent;
import com.google.location.suplclient.asn1.supl2.ver2_ulp_components.ReportingCap;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
* 
*/
public  class ServiceCapabilities extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_ServiceCapabilities
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ServiceCapabilities() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ServiceCapabilities;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ServiceCapabilities != null) {
      return ImmutableList.of(TAG_ServiceCapabilities);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ServiceCapabilities from encoded stream.
   */
  public static ServiceCapabilities fromPerUnaligned(byte[] encodedBytes) {
    ServiceCapabilities result = new ServiceCapabilities();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ServiceCapabilities from encoded stream.
   */
  public static ServiceCapabilities fromPerAligned(byte[] encodedBytes) {
    ServiceCapabilities result = new ServiceCapabilities();
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

  
  private ServicesSupported servicesSupported_;
  public ServicesSupported getServicesSupported() {
    return servicesSupported_;
  }
  /**
   * @throws ClassCastException if value is not a ServicesSupported
   */
  public void setServicesSupported(Asn1Object value) {
    this.servicesSupported_ = (ServicesSupported) value;
  }
  public ServicesSupported setServicesSupportedToNewInstance() {
    servicesSupported_ = new ServicesSupported();
    return servicesSupported_;
  }
  
  private ReportingCap reportingCapabilities_;
  public ReportingCap getReportingCapabilities() {
    return reportingCapabilities_;
  }
  /**
   * @throws ClassCastException if value is not a ReportingCap
   */
  public void setReportingCapabilities(Asn1Object value) {
    this.reportingCapabilities_ = (ReportingCap) value;
  }
  public ReportingCap setReportingCapabilitiesToNewInstance() {
    reportingCapabilities_ = new ReportingCap();
    return reportingCapabilities_;
  }
  
  private EventTriggerCapabilities eventTriggerCapabilities_;
  public EventTriggerCapabilities getEventTriggerCapabilities() {
    return eventTriggerCapabilities_;
  }
  /**
   * @throws ClassCastException if value is not a EventTriggerCapabilities
   */
  public void setEventTriggerCapabilities(Asn1Object value) {
    this.eventTriggerCapabilities_ = (EventTriggerCapabilities) value;
  }
  public EventTriggerCapabilities setEventTriggerCapabilitiesToNewInstance() {
    eventTriggerCapabilities_ = new EventTriggerCapabilities();
    return eventTriggerCapabilities_;
  }
  
  private SessionCapabilities sessionCapabilities_;
  public SessionCapabilities getSessionCapabilities() {
    return sessionCapabilities_;
  }
  /**
   * @throws ClassCastException if value is not a SessionCapabilities
   */
  public void setSessionCapabilities(Asn1Object value) {
    this.sessionCapabilities_ = (SessionCapabilities) value;
  }
  public SessionCapabilities setSessionCapabilitiesToNewInstance() {
    sessionCapabilities_ = new SessionCapabilities();
    return sessionCapabilities_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getServicesSupported() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getServicesSupported();
          }

          @Override public void setToNewInstance() {
            setServicesSupportedToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ServicesSupported.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "servicesSupported : "
                    + getServicesSupported().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getReportingCapabilities() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getReportingCapabilities();
          }

          @Override public void setToNewInstance() {
            setReportingCapabilitiesToNewInstance();
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
                return "reportingCapabilities : "
                    + getReportingCapabilities().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getEventTriggerCapabilities() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getEventTriggerCapabilities();
          }

          @Override public void setToNewInstance() {
            setEventTriggerCapabilitiesToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? EventTriggerCapabilities.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "eventTriggerCapabilities : "
                    + getEventTriggerCapabilities().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getSessionCapabilities() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getSessionCapabilities();
          }

          @Override public void setToNewInstance() {
            setSessionCapabilitiesToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SessionCapabilities.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "sessionCapabilities : "
                    + getSessionCapabilities().toIndentedString(indent);
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
    builder.append("ServiceCapabilities = {\n");
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
