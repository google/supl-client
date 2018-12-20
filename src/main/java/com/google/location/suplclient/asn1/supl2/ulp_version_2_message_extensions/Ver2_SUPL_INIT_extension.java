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

package com.google.location.suplclient.asn1.supl2.ulp_version_2_message_extensions;

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
import com.google.location.suplclient.asn1.supl2.supl_triggered_start.TriggerType;
import com.google.location.suplclient.asn1.supl2.ulp_components.SLPAddress;
import com.google.location.suplclient.asn1.supl2.ver2_ulp_components.GNSSPosTechnology;
import com.google.location.suplclient.asn1.supl2.ver2_ulp_components.SupportedNetworkInformation;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
* 
*/
public  class Ver2_SUPL_INIT_extension extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_Ver2_SUPL_INIT_extension
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public Ver2_SUPL_INIT_extension() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_Ver2_SUPL_INIT_extension;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_Ver2_SUPL_INIT_extension != null) {
      return ImmutableList.of(TAG_Ver2_SUPL_INIT_extension);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new Ver2_SUPL_INIT_extension from encoded stream.
   */
  public static Ver2_SUPL_INIT_extension fromPerUnaligned(byte[] encodedBytes) {
    Ver2_SUPL_INIT_extension result = new Ver2_SUPL_INIT_extension();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new Ver2_SUPL_INIT_extension from encoded stream.
   */
  public static Ver2_SUPL_INIT_extension fromPerAligned(byte[] encodedBytes) {
    Ver2_SUPL_INIT_extension result = new Ver2_SUPL_INIT_extension();
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

  
  private NotificationMode notificationMode_;
  public NotificationMode getNotificationMode() {
    return notificationMode_;
  }
  /**
   * @throws ClassCastException if value is not a NotificationMode
   */
  public void setNotificationMode(Asn1Object value) {
    this.notificationMode_ = (NotificationMode) value;
  }
  public NotificationMode setNotificationModeToNewInstance() {
    notificationMode_ = new NotificationMode();
    return notificationMode_;
  }
  
  private SupportedNetworkInformation supportedNetworkInformation_;
  public SupportedNetworkInformation getSupportedNetworkInformation() {
    return supportedNetworkInformation_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedNetworkInformation
   */
  public void setSupportedNetworkInformation(Asn1Object value) {
    this.supportedNetworkInformation_ = (SupportedNetworkInformation) value;
  }
  public SupportedNetworkInformation setSupportedNetworkInformationToNewInstance() {
    supportedNetworkInformation_ = new SupportedNetworkInformation();
    return supportedNetworkInformation_;
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
  
  private SLPAddress e_SLPAddress_;
  public SLPAddress getE_SLPAddress() {
    return e_SLPAddress_;
  }
  /**
   * @throws ClassCastException if value is not a SLPAddress
   */
  public void setE_SLPAddress(Asn1Object value) {
    this.e_SLPAddress_ = (SLPAddress) value;
  }
  public SLPAddress setE_SLPAddressToNewInstance() {
    e_SLPAddress_ = new SLPAddress();
    return e_SLPAddress_;
  }
  
  private HistoricReporting historicReporting_;
  public HistoricReporting getHistoricReporting() {
    return historicReporting_;
  }
  /**
   * @throws ClassCastException if value is not a HistoricReporting
   */
  public void setHistoricReporting(Asn1Object value) {
    this.historicReporting_ = (HistoricReporting) value;
  }
  public HistoricReporting setHistoricReportingToNewInstance() {
    historicReporting_ = new HistoricReporting();
    return historicReporting_;
  }
  
  private ProtectionLevel protectionLevel_;
  public ProtectionLevel getProtectionLevel() {
    return protectionLevel_;
  }
  /**
   * @throws ClassCastException if value is not a ProtectionLevel
   */
  public void setProtectionLevel(Asn1Object value) {
    this.protectionLevel_ = (ProtectionLevel) value;
  }
  public ProtectionLevel setProtectionLevelToNewInstance() {
    protectionLevel_ = new ProtectionLevel();
    return protectionLevel_;
  }
  
  private GNSSPosTechnology gnssPosTechnology_;
  public GNSSPosTechnology getGnssPosTechnology() {
    return gnssPosTechnology_;
  }
  /**
   * @throws ClassCastException if value is not a GNSSPosTechnology
   */
  public void setGnssPosTechnology(Asn1Object value) {
    this.gnssPosTechnology_ = (GNSSPosTechnology) value;
  }
  public GNSSPosTechnology setGnssPosTechnologyToNewInstance() {
    gnssPosTechnology_ = new GNSSPosTechnology();
    return gnssPosTechnology_;
  }
  
  private Ver2_SUPL_INIT_extension.minimumMajorVersionType minimumMajorVersion_;
  public Ver2_SUPL_INIT_extension.minimumMajorVersionType getMinimumMajorVersion() {
    return minimumMajorVersion_;
  }
  /**
   * @throws ClassCastException if value is not a Ver2_SUPL_INIT_extension.minimumMajorVersionType
   */
  public void setMinimumMajorVersion(Asn1Object value) {
    this.minimumMajorVersion_ = (Ver2_SUPL_INIT_extension.minimumMajorVersionType) value;
  }
  public Ver2_SUPL_INIT_extension.minimumMajorVersionType setMinimumMajorVersionToNewInstance() {
    minimumMajorVersion_ = new Ver2_SUPL_INIT_extension.minimumMajorVersionType();
    return minimumMajorVersion_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getNotificationMode() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getNotificationMode();
          }

          @Override public void setToNewInstance() {
            setNotificationModeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NotificationMode.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "notificationMode : "
                    + getNotificationMode().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getSupportedNetworkInformation() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getSupportedNetworkInformation();
          }

          @Override public void setToNewInstance() {
            setSupportedNetworkInformationToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedNetworkInformation.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "supportedNetworkInformation : "
                    + getSupportedNetworkInformation().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

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
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getE_SLPAddress() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getE_SLPAddress();
          }

          @Override public void setToNewInstance() {
            setE_SLPAddressToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SLPAddress.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "e_SLPAddress : "
                    + getE_SLPAddress().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getHistoricReporting() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getHistoricReporting();
          }

          @Override public void setToNewInstance() {
            setHistoricReportingToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? HistoricReporting.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "historicReporting : "
                    + getHistoricReporting().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getProtectionLevel() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getProtectionLevel();
          }

          @Override public void setToNewInstance() {
            setProtectionLevelToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ProtectionLevel.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "protectionLevel : "
                    + getProtectionLevel().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getGnssPosTechnology() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnssPosTechnology();
          }

          @Override public void setToNewInstance() {
            setGnssPosTechnologyToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSSPosTechnology.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnssPosTechnology : "
                    + getGnssPosTechnology().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 7);

          @Override public boolean isExplicitlySet() {
            return getMinimumMajorVersion() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getMinimumMajorVersion();
          }

          @Override public void setToNewInstance() {
            setMinimumMajorVersionToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Ver2_SUPL_INIT_extension.minimumMajorVersionType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "minimumMajorVersion : "
                    + getMinimumMajorVersion().toIndentedString(indent);
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
public static class minimumMajorVersionType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_minimumMajorVersionType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public minimumMajorVersionType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("255"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_minimumMajorVersionType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_minimumMajorVersionType != null) {
      return ImmutableList.of(TAG_minimumMajorVersionType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new minimumMajorVersionType from encoded stream.
   */
  public static minimumMajorVersionType fromPerUnaligned(byte[] encodedBytes) {
    minimumMajorVersionType result = new minimumMajorVersionType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new minimumMajorVersionType from encoded stream.
   */
  public static minimumMajorVersionType fromPerAligned(byte[] encodedBytes) {
    minimumMajorVersionType result = new minimumMajorVersionType();
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
    return "minimumMajorVersionType = " + getInteger() + ";\n";
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
    builder.append("Ver2_SUPL_INIT_extension = {\n");
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
