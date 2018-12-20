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
import com.google.location.suplclient.asn1.base.Asn1BitString;
import com.google.location.suplclient.asn1.base.Asn1Enumerated;
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
public  class WlanAPInformation extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_WlanAPInformation
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public WlanAPInformation() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_WlanAPInformation;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_WlanAPInformation != null) {
      return ImmutableList.of(TAG_WlanAPInformation);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new WlanAPInformation from encoded stream.
   */
  public static WlanAPInformation fromPerUnaligned(byte[] encodedBytes) {
    WlanAPInformation result = new WlanAPInformation();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new WlanAPInformation from encoded stream.
   */
  public static WlanAPInformation fromPerAligned(byte[] encodedBytes) {
    WlanAPInformation result = new WlanAPInformation();
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

  
  private WlanAPInformation.apMACAddressType apMACAddress_;
  public WlanAPInformation.apMACAddressType getApMACAddress() {
    return apMACAddress_;
  }
  /**
   * @throws ClassCastException if value is not a WlanAPInformation.apMACAddressType
   */
  public void setApMACAddress(Asn1Object value) {
    this.apMACAddress_ = (WlanAPInformation.apMACAddressType) value;
  }
  public WlanAPInformation.apMACAddressType setApMACAddressToNewInstance() {
    apMACAddress_ = new WlanAPInformation.apMACAddressType();
    return apMACAddress_;
  }
  
  private WlanAPInformation.apTransmitPowerType apTransmitPower_;
  public WlanAPInformation.apTransmitPowerType getApTransmitPower() {
    return apTransmitPower_;
  }
  /**
   * @throws ClassCastException if value is not a WlanAPInformation.apTransmitPowerType
   */
  public void setApTransmitPower(Asn1Object value) {
    this.apTransmitPower_ = (WlanAPInformation.apTransmitPowerType) value;
  }
  public WlanAPInformation.apTransmitPowerType setApTransmitPowerToNewInstance() {
    apTransmitPower_ = new WlanAPInformation.apTransmitPowerType();
    return apTransmitPower_;
  }
  
  private WlanAPInformation.apAntennaGainType apAntennaGain_;
  public WlanAPInformation.apAntennaGainType getApAntennaGain() {
    return apAntennaGain_;
  }
  /**
   * @throws ClassCastException if value is not a WlanAPInformation.apAntennaGainType
   */
  public void setApAntennaGain(Asn1Object value) {
    this.apAntennaGain_ = (WlanAPInformation.apAntennaGainType) value;
  }
  public WlanAPInformation.apAntennaGainType setApAntennaGainToNewInstance() {
    apAntennaGain_ = new WlanAPInformation.apAntennaGainType();
    return apAntennaGain_;
  }
  
  private WlanAPInformation.apSignaltoNoiseType apSignaltoNoise_;
  public WlanAPInformation.apSignaltoNoiseType getApSignaltoNoise() {
    return apSignaltoNoise_;
  }
  /**
   * @throws ClassCastException if value is not a WlanAPInformation.apSignaltoNoiseType
   */
  public void setApSignaltoNoise(Asn1Object value) {
    this.apSignaltoNoise_ = (WlanAPInformation.apSignaltoNoiseType) value;
  }
  public WlanAPInformation.apSignaltoNoiseType setApSignaltoNoiseToNewInstance() {
    apSignaltoNoise_ = new WlanAPInformation.apSignaltoNoiseType();
    return apSignaltoNoise_;
  }
  
  private WlanAPInformation.apDeviceTypeType apDeviceType_;
  public WlanAPInformation.apDeviceTypeType getApDeviceType() {
    return apDeviceType_;
  }
  /**
   * @throws ClassCastException if value is not a WlanAPInformation.apDeviceTypeType
   */
  public void setApDeviceType(Asn1Object value) {
    this.apDeviceType_ = (WlanAPInformation.apDeviceTypeType) value;
  }
  public WlanAPInformation.apDeviceTypeType setApDeviceTypeToNewInstance() {
    apDeviceType_ = new WlanAPInformation.apDeviceTypeType();
    return apDeviceType_;
  }
  
  private WlanAPInformation.apSignalStrengthType apSignalStrength_;
  public WlanAPInformation.apSignalStrengthType getApSignalStrength() {
    return apSignalStrength_;
  }
  /**
   * @throws ClassCastException if value is not a WlanAPInformation.apSignalStrengthType
   */
  public void setApSignalStrength(Asn1Object value) {
    this.apSignalStrength_ = (WlanAPInformation.apSignalStrengthType) value;
  }
  public WlanAPInformation.apSignalStrengthType setApSignalStrengthToNewInstance() {
    apSignalStrength_ = new WlanAPInformation.apSignalStrengthType();
    return apSignalStrength_;
  }
  
  private WlanAPInformation.apChannelFrequencyType apChannelFrequency_;
  public WlanAPInformation.apChannelFrequencyType getApChannelFrequency() {
    return apChannelFrequency_;
  }
  /**
   * @throws ClassCastException if value is not a WlanAPInformation.apChannelFrequencyType
   */
  public void setApChannelFrequency(Asn1Object value) {
    this.apChannelFrequency_ = (WlanAPInformation.apChannelFrequencyType) value;
  }
  public WlanAPInformation.apChannelFrequencyType setApChannelFrequencyToNewInstance() {
    apChannelFrequency_ = new WlanAPInformation.apChannelFrequencyType();
    return apChannelFrequency_;
  }
  
  private RTD apRoundTripDelay_;
  public RTD getApRoundTripDelay() {
    return apRoundTripDelay_;
  }
  /**
   * @throws ClassCastException if value is not a RTD
   */
  public void setApRoundTripDelay(Asn1Object value) {
    this.apRoundTripDelay_ = (RTD) value;
  }
  public RTD setApRoundTripDelayToNewInstance() {
    apRoundTripDelay_ = new RTD();
    return apRoundTripDelay_;
  }
  
  private WlanAPInformation.setTransmitPowerType setTransmitPower_;
  public WlanAPInformation.setTransmitPowerType getSetTransmitPower() {
    return setTransmitPower_;
  }
  /**
   * @throws ClassCastException if value is not a WlanAPInformation.setTransmitPowerType
   */
  public void setSetTransmitPower(Asn1Object value) {
    this.setTransmitPower_ = (WlanAPInformation.setTransmitPowerType) value;
  }
  public WlanAPInformation.setTransmitPowerType setSetTransmitPowerToNewInstance() {
    setTransmitPower_ = new WlanAPInformation.setTransmitPowerType();
    return setTransmitPower_;
  }
  
  private WlanAPInformation.setAntennaGainType setAntennaGain_;
  public WlanAPInformation.setAntennaGainType getSetAntennaGain() {
    return setAntennaGain_;
  }
  /**
   * @throws ClassCastException if value is not a WlanAPInformation.setAntennaGainType
   */
  public void setSetAntennaGain(Asn1Object value) {
    this.setAntennaGain_ = (WlanAPInformation.setAntennaGainType) value;
  }
  public WlanAPInformation.setAntennaGainType setSetAntennaGainToNewInstance() {
    setAntennaGain_ = new WlanAPInformation.setAntennaGainType();
    return setAntennaGain_;
  }
  
  private WlanAPInformation.setSignaltoNoiseType setSignaltoNoise_;
  public WlanAPInformation.setSignaltoNoiseType getSetSignaltoNoise() {
    return setSignaltoNoise_;
  }
  /**
   * @throws ClassCastException if value is not a WlanAPInformation.setSignaltoNoiseType
   */
  public void setSetSignaltoNoise(Asn1Object value) {
    this.setSignaltoNoise_ = (WlanAPInformation.setSignaltoNoiseType) value;
  }
  public WlanAPInformation.setSignaltoNoiseType setSetSignaltoNoiseToNewInstance() {
    setSignaltoNoise_ = new WlanAPInformation.setSignaltoNoiseType();
    return setSignaltoNoise_;
  }
  
  private WlanAPInformation.setSignalStrengthType setSignalStrength_;
  public WlanAPInformation.setSignalStrengthType getSetSignalStrength() {
    return setSignalStrength_;
  }
  /**
   * @throws ClassCastException if value is not a WlanAPInformation.setSignalStrengthType
   */
  public void setSetSignalStrength(Asn1Object value) {
    this.setSignalStrength_ = (WlanAPInformation.setSignalStrengthType) value;
  }
  public WlanAPInformation.setSignalStrengthType setSetSignalStrengthToNewInstance() {
    setSignalStrength_ = new WlanAPInformation.setSignalStrengthType();
    return setSignalStrength_;
  }
  
  private ReportedLocation apReportedLocation_;
  public ReportedLocation getApReportedLocation() {
    return apReportedLocation_;
  }
  /**
   * @throws ClassCastException if value is not a ReportedLocation
   */
  public void setApReportedLocation(Asn1Object value) {
    this.apReportedLocation_ = (ReportedLocation) value;
  }
  public ReportedLocation setApReportedLocationToNewInstance() {
    apReportedLocation_ = new ReportedLocation();
    return apReportedLocation_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getApMACAddress() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getApMACAddress();
          }

          @Override public void setToNewInstance() {
            setApMACAddressToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? WlanAPInformation.apMACAddressType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "apMACAddress : "
                    + getApMACAddress().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getApTransmitPower() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getApTransmitPower();
          }

          @Override public void setToNewInstance() {
            setApTransmitPowerToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? WlanAPInformation.apTransmitPowerType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "apTransmitPower : "
                    + getApTransmitPower().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getApAntennaGain() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getApAntennaGain();
          }

          @Override public void setToNewInstance() {
            setApAntennaGainToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? WlanAPInformation.apAntennaGainType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "apAntennaGain : "
                    + getApAntennaGain().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getApSignaltoNoise() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getApSignaltoNoise();
          }

          @Override public void setToNewInstance() {
            setApSignaltoNoiseToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? WlanAPInformation.apSignaltoNoiseType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "apSignaltoNoise : "
                    + getApSignaltoNoise().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getApDeviceType() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getApDeviceType();
          }

          @Override public void setToNewInstance() {
            setApDeviceTypeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? WlanAPInformation.apDeviceTypeType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "apDeviceType : "
                    + getApDeviceType().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getApSignalStrength() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getApSignalStrength();
          }

          @Override public void setToNewInstance() {
            setApSignalStrengthToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? WlanAPInformation.apSignalStrengthType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "apSignalStrength : "
                    + getApSignalStrength().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getApChannelFrequency() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getApChannelFrequency();
          }

          @Override public void setToNewInstance() {
            setApChannelFrequencyToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? WlanAPInformation.apChannelFrequencyType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "apChannelFrequency : "
                    + getApChannelFrequency().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 7);

          @Override public boolean isExplicitlySet() {
            return getApRoundTripDelay() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getApRoundTripDelay();
          }

          @Override public void setToNewInstance() {
            setApRoundTripDelayToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? RTD.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "apRoundTripDelay : "
                    + getApRoundTripDelay().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 8);

          @Override public boolean isExplicitlySet() {
            return getSetTransmitPower() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getSetTransmitPower();
          }

          @Override public void setToNewInstance() {
            setSetTransmitPowerToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? WlanAPInformation.setTransmitPowerType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "setTransmitPower : "
                    + getSetTransmitPower().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 9);

          @Override public boolean isExplicitlySet() {
            return getSetAntennaGain() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getSetAntennaGain();
          }

          @Override public void setToNewInstance() {
            setSetAntennaGainToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? WlanAPInformation.setAntennaGainType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "setAntennaGain : "
                    + getSetAntennaGain().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 10);

          @Override public boolean isExplicitlySet() {
            return getSetSignaltoNoise() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getSetSignaltoNoise();
          }

          @Override public void setToNewInstance() {
            setSetSignaltoNoiseToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? WlanAPInformation.setSignaltoNoiseType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "setSignaltoNoise : "
                    + getSetSignaltoNoise().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 11);

          @Override public boolean isExplicitlySet() {
            return getSetSignalStrength() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getSetSignalStrength();
          }

          @Override public void setToNewInstance() {
            setSetSignalStrengthToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? WlanAPInformation.setSignalStrengthType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "setSignalStrength : "
                    + getSetSignalStrength().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 12);

          @Override public boolean isExplicitlySet() {
            return getApReportedLocation() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getApReportedLocation();
          }

          @Override public void setToNewInstance() {
            setApReportedLocationToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ReportedLocation.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "apReportedLocation : "
                    + getApReportedLocation().toIndentedString(indent);
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
public static class apMACAddressType extends Asn1BitString {
  //

  // defined bit positions, if any
  

  // setters
  

  // clearers
  


  private static final Asn1Tag TAG_apMACAddressType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public apMACAddressType() {
    super();
    setMinSize(48);
setMaxSize(48);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_apMACAddressType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_apMACAddressType != null) {
      return ImmutableList.of(TAG_apMACAddressType);
    } else {
      return Asn1BitString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new apMACAddressType from encoded stream.
   */
  public static apMACAddressType fromPerUnaligned(byte[] encodedBytes) {
    apMACAddressType result = new apMACAddressType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new apMACAddressType from encoded stream.
   */
  public static apMACAddressType fromPerAligned(byte[] encodedBytes) {
    apMACAddressType result = new apMACAddressType();
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
    return "apMACAddressType = " + getValue() + ";\n";
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
public static class apTransmitPowerType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_apTransmitPowerType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public apTransmitPowerType() {
    super();
    setValueRange(new java.math.BigInteger("-127"), new java.math.BigInteger("128"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_apTransmitPowerType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_apTransmitPowerType != null) {
      return ImmutableList.of(TAG_apTransmitPowerType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new apTransmitPowerType from encoded stream.
   */
  public static apTransmitPowerType fromPerUnaligned(byte[] encodedBytes) {
    apTransmitPowerType result = new apTransmitPowerType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new apTransmitPowerType from encoded stream.
   */
  public static apTransmitPowerType fromPerAligned(byte[] encodedBytes) {
    apTransmitPowerType result = new apTransmitPowerType();
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
    return "apTransmitPowerType = " + getInteger() + ";\n";
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
public static class apAntennaGainType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_apAntennaGainType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public apAntennaGainType() {
    super();
    setValueRange(new java.math.BigInteger("-127"), new java.math.BigInteger("128"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_apAntennaGainType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_apAntennaGainType != null) {
      return ImmutableList.of(TAG_apAntennaGainType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new apAntennaGainType from encoded stream.
   */
  public static apAntennaGainType fromPerUnaligned(byte[] encodedBytes) {
    apAntennaGainType result = new apAntennaGainType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new apAntennaGainType from encoded stream.
   */
  public static apAntennaGainType fromPerAligned(byte[] encodedBytes) {
    apAntennaGainType result = new apAntennaGainType();
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
    return "apAntennaGainType = " + getInteger() + ";\n";
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
public static class apSignaltoNoiseType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_apSignaltoNoiseType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public apSignaltoNoiseType() {
    super();
    setValueRange(new java.math.BigInteger("-127"), new java.math.BigInteger("128"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_apSignaltoNoiseType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_apSignaltoNoiseType != null) {
      return ImmutableList.of(TAG_apSignaltoNoiseType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new apSignaltoNoiseType from encoded stream.
   */
  public static apSignaltoNoiseType fromPerUnaligned(byte[] encodedBytes) {
    apSignaltoNoiseType result = new apSignaltoNoiseType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new apSignaltoNoiseType from encoded stream.
   */
  public static apSignaltoNoiseType fromPerAligned(byte[] encodedBytes) {
    apSignaltoNoiseType result = new apSignaltoNoiseType();
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
    return "apSignaltoNoiseType = " + getInteger() + ";\n";
  }
}

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class apDeviceTypeType extends Asn1Enumerated {
  public enum Value implements Asn1Enumerated.Value {
    wlan802_11a(0),
    wlan802_11b(1),
    wlan802_11g(2),
    ;

    Value(int i) {
      value = i;
    }

    private int value;
    public int getAssignedValue() {
      return value;
    }

    @Override public boolean isExtensionValue() {
      return false;
    }
  }

  @Override
  protected Value getDefaultValue() {
    return null
;
  }

  @SuppressWarnings("unchecked")
  public Value enumValue() {
    return (Value) getValue();
  }


  
  public void setTo_wlan802_11a() {
    setValue(Value.wlan802_11a);
  }
  
  public void setTo_wlan802_11b() {
    setValue(Value.wlan802_11b);
  }
  
  public void setTo_wlan802_11g() {
    setValue(Value.wlan802_11g);
  }
  


  public enum ExtensionValue implements Asn1Enumerated.Value {
    ;

    ExtensionValue(int i) {
      value = i;
    }

    private int value;
    @Override public int getAssignedValue() {
      return value;
    }

    @Override public boolean isExtensionValue() {
      return true;
    }
  }

  @SuppressWarnings("unchecked")
  public ExtensionValue extEnumValue() {
    return (ExtensionValue) getValue();
  }

  

  

  private static final Asn1Tag TAG_apDeviceTypeType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public apDeviceTypeType() {
    super();
    // use template substitution instead of calling getDefaultValue(), since
    // calling virtual methods from a ctor is frowned upon here.
    setValue(null
);
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_apDeviceTypeType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_apDeviceTypeType != null) {
      return ImmutableList.of(TAG_apDeviceTypeType);
    } else {
      return Asn1Enumerated.getPossibleFirstTags();
    }
  }

  @Override protected boolean isExtensible() {
    return true;
  }

  @Override protected Asn1Enumerated.Value lookupValue(int ordinal) {
    return Value.values()[ordinal];
  }

  @Override protected Asn1Enumerated.Value lookupExtensionValue(int ordinal) {
    return ExtensionValue.values()[ordinal];
  }

  @Override protected int getValueCount() {
    return Value.values().length;
  }

  /**
   * Creates a new apDeviceTypeType from encoded stream.
   */
  public static apDeviceTypeType fromPerUnaligned(byte[] encodedBytes) {
    apDeviceTypeType result = new apDeviceTypeType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new apDeviceTypeType from encoded stream.
   */
  public static apDeviceTypeType fromPerAligned(byte[] encodedBytes) {
    apDeviceTypeType result = new apDeviceTypeType();
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
    return "apDeviceTypeType = " + getValue() + ";\n";
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
public static class apSignalStrengthType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_apSignalStrengthType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public apSignalStrengthType() {
    super();
    setValueRange(new java.math.BigInteger("-127"), new java.math.BigInteger("128"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_apSignalStrengthType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_apSignalStrengthType != null) {
      return ImmutableList.of(TAG_apSignalStrengthType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new apSignalStrengthType from encoded stream.
   */
  public static apSignalStrengthType fromPerUnaligned(byte[] encodedBytes) {
    apSignalStrengthType result = new apSignalStrengthType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new apSignalStrengthType from encoded stream.
   */
  public static apSignalStrengthType fromPerAligned(byte[] encodedBytes) {
    apSignalStrengthType result = new apSignalStrengthType();
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
    return "apSignalStrengthType = " + getInteger() + ";\n";
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
public static class apChannelFrequencyType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_apChannelFrequencyType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public apChannelFrequencyType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("256"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_apChannelFrequencyType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_apChannelFrequencyType != null) {
      return ImmutableList.of(TAG_apChannelFrequencyType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new apChannelFrequencyType from encoded stream.
   */
  public static apChannelFrequencyType fromPerUnaligned(byte[] encodedBytes) {
    apChannelFrequencyType result = new apChannelFrequencyType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new apChannelFrequencyType from encoded stream.
   */
  public static apChannelFrequencyType fromPerAligned(byte[] encodedBytes) {
    apChannelFrequencyType result = new apChannelFrequencyType();
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
    return "apChannelFrequencyType = " + getInteger() + ";\n";
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
public static class setTransmitPowerType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_setTransmitPowerType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public setTransmitPowerType() {
    super();
    setValueRange(new java.math.BigInteger("-127"), new java.math.BigInteger("128"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_setTransmitPowerType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_setTransmitPowerType != null) {
      return ImmutableList.of(TAG_setTransmitPowerType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new setTransmitPowerType from encoded stream.
   */
  public static setTransmitPowerType fromPerUnaligned(byte[] encodedBytes) {
    setTransmitPowerType result = new setTransmitPowerType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new setTransmitPowerType from encoded stream.
   */
  public static setTransmitPowerType fromPerAligned(byte[] encodedBytes) {
    setTransmitPowerType result = new setTransmitPowerType();
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
    return "setTransmitPowerType = " + getInteger() + ";\n";
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
public static class setAntennaGainType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_setAntennaGainType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public setAntennaGainType() {
    super();
    setValueRange(new java.math.BigInteger("-127"), new java.math.BigInteger("128"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_setAntennaGainType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_setAntennaGainType != null) {
      return ImmutableList.of(TAG_setAntennaGainType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new setAntennaGainType from encoded stream.
   */
  public static setAntennaGainType fromPerUnaligned(byte[] encodedBytes) {
    setAntennaGainType result = new setAntennaGainType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new setAntennaGainType from encoded stream.
   */
  public static setAntennaGainType fromPerAligned(byte[] encodedBytes) {
    setAntennaGainType result = new setAntennaGainType();
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
    return "setAntennaGainType = " + getInteger() + ";\n";
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
public static class setSignaltoNoiseType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_setSignaltoNoiseType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public setSignaltoNoiseType() {
    super();
    setValueRange(new java.math.BigInteger("-127"), new java.math.BigInteger("128"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_setSignaltoNoiseType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_setSignaltoNoiseType != null) {
      return ImmutableList.of(TAG_setSignaltoNoiseType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new setSignaltoNoiseType from encoded stream.
   */
  public static setSignaltoNoiseType fromPerUnaligned(byte[] encodedBytes) {
    setSignaltoNoiseType result = new setSignaltoNoiseType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new setSignaltoNoiseType from encoded stream.
   */
  public static setSignaltoNoiseType fromPerAligned(byte[] encodedBytes) {
    setSignaltoNoiseType result = new setSignaltoNoiseType();
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
    return "setSignaltoNoiseType = " + getInteger() + ";\n";
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
public static class setSignalStrengthType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_setSignalStrengthType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public setSignalStrengthType() {
    super();
    setValueRange(new java.math.BigInteger("-127"), new java.math.BigInteger("128"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_setSignalStrengthType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_setSignalStrengthType != null) {
      return ImmutableList.of(TAG_setSignalStrengthType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new setSignalStrengthType from encoded stream.
   */
  public static setSignalStrengthType fromPerUnaligned(byte[] encodedBytes) {
    setSignalStrengthType result = new setSignalStrengthType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new setSignalStrengthType from encoded stream.
   */
  public static setSignalStrengthType fromPerAligned(byte[] encodedBytes) {
    setSignalStrengthType result = new setSignalStrengthType();
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
    return "setSignalStrengthType = " + getInteger() + ";\n";
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
    builder.append("WlanAPInformation = {\n");
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
