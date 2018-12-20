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
public  class ProvideLocationInformation_r9_IEs extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_ProvideLocationInformation_r9_IEs
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ProvideLocationInformation_r9_IEs() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ProvideLocationInformation_r9_IEs;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ProvideLocationInformation_r9_IEs != null) {
      return ImmutableList.of(TAG_ProvideLocationInformation_r9_IEs);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ProvideLocationInformation_r9_IEs from encoded stream.
   */
  public static ProvideLocationInformation_r9_IEs fromPerUnaligned(byte[] encodedBytes) {
    ProvideLocationInformation_r9_IEs result = new ProvideLocationInformation_r9_IEs();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ProvideLocationInformation_r9_IEs from encoded stream.
   */
  public static ProvideLocationInformation_r9_IEs fromPerAligned(byte[] encodedBytes) {
    ProvideLocationInformation_r9_IEs result = new ProvideLocationInformation_r9_IEs();
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

  
  private CommonIEsProvideLocationInformation commonIEsProvideLocationInformation_;
  public CommonIEsProvideLocationInformation getCommonIEsProvideLocationInformation() {
    return commonIEsProvideLocationInformation_;
  }
  /**
   * @throws ClassCastException if value is not a CommonIEsProvideLocationInformation
   */
  public void setCommonIEsProvideLocationInformation(Asn1Object value) {
    this.commonIEsProvideLocationInformation_ = (CommonIEsProvideLocationInformation) value;
  }
  public CommonIEsProvideLocationInformation setCommonIEsProvideLocationInformationToNewInstance() {
    commonIEsProvideLocationInformation_ = new CommonIEsProvideLocationInformation();
    return commonIEsProvideLocationInformation_;
  }
  
  private A_GNSS_ProvideLocationInformation a_gnss_ProvideLocationInformation_;
  public A_GNSS_ProvideLocationInformation getA_gnss_ProvideLocationInformation() {
    return a_gnss_ProvideLocationInformation_;
  }
  /**
   * @throws ClassCastException if value is not a A_GNSS_ProvideLocationInformation
   */
  public void setA_gnss_ProvideLocationInformation(Asn1Object value) {
    this.a_gnss_ProvideLocationInformation_ = (A_GNSS_ProvideLocationInformation) value;
  }
  public A_GNSS_ProvideLocationInformation setA_gnss_ProvideLocationInformationToNewInstance() {
    a_gnss_ProvideLocationInformation_ = new A_GNSS_ProvideLocationInformation();
    return a_gnss_ProvideLocationInformation_;
  }
  
  private OTDOA_ProvideLocationInformation otdoa_ProvideLocationInformation_;
  public OTDOA_ProvideLocationInformation getOtdoa_ProvideLocationInformation() {
    return otdoa_ProvideLocationInformation_;
  }
  /**
   * @throws ClassCastException if value is not a OTDOA_ProvideLocationInformation
   */
  public void setOtdoa_ProvideLocationInformation(Asn1Object value) {
    this.otdoa_ProvideLocationInformation_ = (OTDOA_ProvideLocationInformation) value;
  }
  public OTDOA_ProvideLocationInformation setOtdoa_ProvideLocationInformationToNewInstance() {
    otdoa_ProvideLocationInformation_ = new OTDOA_ProvideLocationInformation();
    return otdoa_ProvideLocationInformation_;
  }
  
  private ECID_ProvideLocationInformation ecid_ProvideLocationInformation_;
  public ECID_ProvideLocationInformation getEcid_ProvideLocationInformation() {
    return ecid_ProvideLocationInformation_;
  }
  /**
   * @throws ClassCastException if value is not a ECID_ProvideLocationInformation
   */
  public void setEcid_ProvideLocationInformation(Asn1Object value) {
    this.ecid_ProvideLocationInformation_ = (ECID_ProvideLocationInformation) value;
  }
  public ECID_ProvideLocationInformation setEcid_ProvideLocationInformationToNewInstance() {
    ecid_ProvideLocationInformation_ = new ECID_ProvideLocationInformation();
    return ecid_ProvideLocationInformation_;
  }
  
  private EPDU_Sequence epdu_ProvideLocationInformation_;
  public EPDU_Sequence getEpdu_ProvideLocationInformation() {
    return epdu_ProvideLocationInformation_;
  }
  /**
   * @throws ClassCastException if value is not a EPDU_Sequence
   */
  public void setEpdu_ProvideLocationInformation(Asn1Object value) {
    this.epdu_ProvideLocationInformation_ = (EPDU_Sequence) value;
  }
  public EPDU_Sequence setEpdu_ProvideLocationInformationToNewInstance() {
    epdu_ProvideLocationInformation_ = new EPDU_Sequence();
    return epdu_ProvideLocationInformation_;
  }
  

  
  private ProvideLocationInformation_r9_IEs.ext1Type  extensionExt1;
  public ProvideLocationInformation_r9_IEs.ext1Type getExtensionExt1() {
    return extensionExt1;
  }
  /**
   * @throws ClassCastException if value is not a ProvideLocationInformation_r9_IEs.ext1Type
   */
  public void setExtensionExt1(Asn1Object value) {
    extensionExt1 = (ProvideLocationInformation_r9_IEs.ext1Type) value;
  }
  public void setExtensionExt1ToNewInstance() {
    extensionExt1 = new ProvideLocationInformation_r9_IEs.ext1Type();
  }
    

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getCommonIEsProvideLocationInformation() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getCommonIEsProvideLocationInformation();
          }

          @Override public void setToNewInstance() {
            setCommonIEsProvideLocationInformationToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? CommonIEsProvideLocationInformation.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "commonIEsProvideLocationInformation : "
                    + getCommonIEsProvideLocationInformation().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getA_gnss_ProvideLocationInformation() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getA_gnss_ProvideLocationInformation();
          }

          @Override public void setToNewInstance() {
            setA_gnss_ProvideLocationInformationToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? A_GNSS_ProvideLocationInformation.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "a_gnss_ProvideLocationInformation : "
                    + getA_gnss_ProvideLocationInformation().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getOtdoa_ProvideLocationInformation() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getOtdoa_ProvideLocationInformation();
          }

          @Override public void setToNewInstance() {
            setOtdoa_ProvideLocationInformationToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? OTDOA_ProvideLocationInformation.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "otdoa_ProvideLocationInformation : "
                    + getOtdoa_ProvideLocationInformation().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getEcid_ProvideLocationInformation() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getEcid_ProvideLocationInformation();
          }

          @Override public void setToNewInstance() {
            setEcid_ProvideLocationInformationToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ECID_ProvideLocationInformation.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ecid_ProvideLocationInformation : "
                    + getEcid_ProvideLocationInformation().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getEpdu_ProvideLocationInformation() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getEpdu_ProvideLocationInformation();
          }

          @Override public void setToNewInstance() {
            setEpdu_ProvideLocationInformationToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? EPDU_Sequence.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "epdu_ProvideLocationInformation : "
                    + getEpdu_ProvideLocationInformation().toIndentedString(indent);
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

  
  private Sensor_ProvideLocationInformation_r13 sensor_ProvideLocationInformation_r13_;
  public Sensor_ProvideLocationInformation_r13 getSensor_ProvideLocationInformation_r13() {
    return sensor_ProvideLocationInformation_r13_;
  }
  /**
   * @throws ClassCastException if value is not a Sensor_ProvideLocationInformation_r13
   */
  public void setSensor_ProvideLocationInformation_r13(Asn1Object value) {
    this.sensor_ProvideLocationInformation_r13_ = (Sensor_ProvideLocationInformation_r13) value;
  }
  public Sensor_ProvideLocationInformation_r13 setSensor_ProvideLocationInformation_r13ToNewInstance() {
    sensor_ProvideLocationInformation_r13_ = new Sensor_ProvideLocationInformation_r13();
    return sensor_ProvideLocationInformation_r13_;
  }
  
  private TBS_ProvideLocationInformation_r13 tbs_ProvideLocationInformation_r13_;
  public TBS_ProvideLocationInformation_r13 getTbs_ProvideLocationInformation_r13() {
    return tbs_ProvideLocationInformation_r13_;
  }
  /**
   * @throws ClassCastException if value is not a TBS_ProvideLocationInformation_r13
   */
  public void setTbs_ProvideLocationInformation_r13(Asn1Object value) {
    this.tbs_ProvideLocationInformation_r13_ = (TBS_ProvideLocationInformation_r13) value;
  }
  public TBS_ProvideLocationInformation_r13 setTbs_ProvideLocationInformation_r13ToNewInstance() {
    tbs_ProvideLocationInformation_r13_ = new TBS_ProvideLocationInformation_r13();
    return tbs_ProvideLocationInformation_r13_;
  }
  
  private WLAN_ProvideLocationInformation_r13 wlan_ProvideLocationInformation_r13_;
  public WLAN_ProvideLocationInformation_r13 getWlan_ProvideLocationInformation_r13() {
    return wlan_ProvideLocationInformation_r13_;
  }
  /**
   * @throws ClassCastException if value is not a WLAN_ProvideLocationInformation_r13
   */
  public void setWlan_ProvideLocationInformation_r13(Asn1Object value) {
    this.wlan_ProvideLocationInformation_r13_ = (WLAN_ProvideLocationInformation_r13) value;
  }
  public WLAN_ProvideLocationInformation_r13 setWlan_ProvideLocationInformation_r13ToNewInstance() {
    wlan_ProvideLocationInformation_r13_ = new WLAN_ProvideLocationInformation_r13();
    return wlan_ProvideLocationInformation_r13_;
  }
  
  private BT_ProvideLocationInformation_r13 bt_ProvideLocationInformation_r13_;
  public BT_ProvideLocationInformation_r13 getBt_ProvideLocationInformation_r13() {
    return bt_ProvideLocationInformation_r13_;
  }
  /**
   * @throws ClassCastException if value is not a BT_ProvideLocationInformation_r13
   */
  public void setBt_ProvideLocationInformation_r13(Asn1Object value) {
    this.bt_ProvideLocationInformation_r13_ = (BT_ProvideLocationInformation_r13) value;
  }
  public BT_ProvideLocationInformation_r13 setBt_ProvideLocationInformation_r13ToNewInstance() {
    bt_ProvideLocationInformation_r13_ = new BT_ProvideLocationInformation_r13();
    return bt_ProvideLocationInformation_r13_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getSensor_ProvideLocationInformation_r13() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getSensor_ProvideLocationInformation_r13();
          }

          @Override public void setToNewInstance() {
            setSensor_ProvideLocationInformation_r13ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Sensor_ProvideLocationInformation_r13.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "sensor_ProvideLocationInformation_r13 : "
                    + getSensor_ProvideLocationInformation_r13().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getTbs_ProvideLocationInformation_r13() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getTbs_ProvideLocationInformation_r13();
          }

          @Override public void setToNewInstance() {
            setTbs_ProvideLocationInformation_r13ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? TBS_ProvideLocationInformation_r13.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "tbs_ProvideLocationInformation_r13 : "
                    + getTbs_ProvideLocationInformation_r13().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getWlan_ProvideLocationInformation_r13() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getWlan_ProvideLocationInformation_r13();
          }

          @Override public void setToNewInstance() {
            setWlan_ProvideLocationInformation_r13ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? WLAN_ProvideLocationInformation_r13.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "wlan_ProvideLocationInformation_r13 : "
                    + getWlan_ProvideLocationInformation_r13().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getBt_ProvideLocationInformation_r13() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getBt_ProvideLocationInformation_r13();
          }

          @Override public void setToNewInstance() {
            setBt_ProvideLocationInformation_r13ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? BT_ProvideLocationInformation_r13.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bt_ProvideLocationInformation_r13 : "
                    + getBt_ProvideLocationInformation_r13().toIndentedString(indent);
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
    builder.append("ProvideLocationInformation_r9_IEs = {\n");
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
