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
public  class RequestLocationInformation_r9_IEs extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_RequestLocationInformation_r9_IEs
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public RequestLocationInformation_r9_IEs() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_RequestLocationInformation_r9_IEs;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_RequestLocationInformation_r9_IEs != null) {
      return ImmutableList.of(TAG_RequestLocationInformation_r9_IEs);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new RequestLocationInformation_r9_IEs from encoded stream.
   */
  public static RequestLocationInformation_r9_IEs fromPerUnaligned(byte[] encodedBytes) {
    RequestLocationInformation_r9_IEs result = new RequestLocationInformation_r9_IEs();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new RequestLocationInformation_r9_IEs from encoded stream.
   */
  public static RequestLocationInformation_r9_IEs fromPerAligned(byte[] encodedBytes) {
    RequestLocationInformation_r9_IEs result = new RequestLocationInformation_r9_IEs();
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

  
  private CommonIEsRequestLocationInformation commonIEsRequestLocationInformation_;
  public CommonIEsRequestLocationInformation getCommonIEsRequestLocationInformation() {
    return commonIEsRequestLocationInformation_;
  }
  /**
   * @throws ClassCastException if value is not a CommonIEsRequestLocationInformation
   */
  public void setCommonIEsRequestLocationInformation(Asn1Object value) {
    this.commonIEsRequestLocationInformation_ = (CommonIEsRequestLocationInformation) value;
  }
  public CommonIEsRequestLocationInformation setCommonIEsRequestLocationInformationToNewInstance() {
    commonIEsRequestLocationInformation_ = new CommonIEsRequestLocationInformation();
    return commonIEsRequestLocationInformation_;
  }
  
  private A_GNSS_RequestLocationInformation a_gnss_RequestLocationInformation_;
  public A_GNSS_RequestLocationInformation getA_gnss_RequestLocationInformation() {
    return a_gnss_RequestLocationInformation_;
  }
  /**
   * @throws ClassCastException if value is not a A_GNSS_RequestLocationInformation
   */
  public void setA_gnss_RequestLocationInformation(Asn1Object value) {
    this.a_gnss_RequestLocationInformation_ = (A_GNSS_RequestLocationInformation) value;
  }
  public A_GNSS_RequestLocationInformation setA_gnss_RequestLocationInformationToNewInstance() {
    a_gnss_RequestLocationInformation_ = new A_GNSS_RequestLocationInformation();
    return a_gnss_RequestLocationInformation_;
  }
  
  private OTDOA_RequestLocationInformation otdoa_RequestLocationInformation_;
  public OTDOA_RequestLocationInformation getOtdoa_RequestLocationInformation() {
    return otdoa_RequestLocationInformation_;
  }
  /**
   * @throws ClassCastException if value is not a OTDOA_RequestLocationInformation
   */
  public void setOtdoa_RequestLocationInformation(Asn1Object value) {
    this.otdoa_RequestLocationInformation_ = (OTDOA_RequestLocationInformation) value;
  }
  public OTDOA_RequestLocationInformation setOtdoa_RequestLocationInformationToNewInstance() {
    otdoa_RequestLocationInformation_ = new OTDOA_RequestLocationInformation();
    return otdoa_RequestLocationInformation_;
  }
  
  private ECID_RequestLocationInformation ecid_RequestLocationInformation_;
  public ECID_RequestLocationInformation getEcid_RequestLocationInformation() {
    return ecid_RequestLocationInformation_;
  }
  /**
   * @throws ClassCastException if value is not a ECID_RequestLocationInformation
   */
  public void setEcid_RequestLocationInformation(Asn1Object value) {
    this.ecid_RequestLocationInformation_ = (ECID_RequestLocationInformation) value;
  }
  public ECID_RequestLocationInformation setEcid_RequestLocationInformationToNewInstance() {
    ecid_RequestLocationInformation_ = new ECID_RequestLocationInformation();
    return ecid_RequestLocationInformation_;
  }
  
  private EPDU_Sequence epdu_RequestLocationInformation_;
  public EPDU_Sequence getEpdu_RequestLocationInformation() {
    return epdu_RequestLocationInformation_;
  }
  /**
   * @throws ClassCastException if value is not a EPDU_Sequence
   */
  public void setEpdu_RequestLocationInformation(Asn1Object value) {
    this.epdu_RequestLocationInformation_ = (EPDU_Sequence) value;
  }
  public EPDU_Sequence setEpdu_RequestLocationInformationToNewInstance() {
    epdu_RequestLocationInformation_ = new EPDU_Sequence();
    return epdu_RequestLocationInformation_;
  }
  

  
  private RequestLocationInformation_r9_IEs.ext1Type  extensionExt1;
  public RequestLocationInformation_r9_IEs.ext1Type getExtensionExt1() {
    return extensionExt1;
  }
  /**
   * @throws ClassCastException if value is not a RequestLocationInformation_r9_IEs.ext1Type
   */
  public void setExtensionExt1(Asn1Object value) {
    extensionExt1 = (RequestLocationInformation_r9_IEs.ext1Type) value;
  }
  public void setExtensionExt1ToNewInstance() {
    extensionExt1 = new RequestLocationInformation_r9_IEs.ext1Type();
  }
    

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getCommonIEsRequestLocationInformation() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getCommonIEsRequestLocationInformation();
          }

          @Override public void setToNewInstance() {
            setCommonIEsRequestLocationInformationToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? CommonIEsRequestLocationInformation.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "commonIEsRequestLocationInformation : "
                    + getCommonIEsRequestLocationInformation().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getA_gnss_RequestLocationInformation() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getA_gnss_RequestLocationInformation();
          }

          @Override public void setToNewInstance() {
            setA_gnss_RequestLocationInformationToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? A_GNSS_RequestLocationInformation.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "a_gnss_RequestLocationInformation : "
                    + getA_gnss_RequestLocationInformation().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getOtdoa_RequestLocationInformation() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getOtdoa_RequestLocationInformation();
          }

          @Override public void setToNewInstance() {
            setOtdoa_RequestLocationInformationToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? OTDOA_RequestLocationInformation.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "otdoa_RequestLocationInformation : "
                    + getOtdoa_RequestLocationInformation().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getEcid_RequestLocationInformation() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getEcid_RequestLocationInformation();
          }

          @Override public void setToNewInstance() {
            setEcid_RequestLocationInformationToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ECID_RequestLocationInformation.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ecid_RequestLocationInformation : "
                    + getEcid_RequestLocationInformation().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getEpdu_RequestLocationInformation() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getEpdu_RequestLocationInformation();
          }

          @Override public void setToNewInstance() {
            setEpdu_RequestLocationInformationToNewInstance();
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
                return "epdu_RequestLocationInformation : "
                    + getEpdu_RequestLocationInformation().toIndentedString(indent);
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

  
  private Sensor_RequestLocationInformation_r13 sensor_RequestLocationInformation_r13_;
  public Sensor_RequestLocationInformation_r13 getSensor_RequestLocationInformation_r13() {
    return sensor_RequestLocationInformation_r13_;
  }
  /**
   * @throws ClassCastException if value is not a Sensor_RequestLocationInformation_r13
   */
  public void setSensor_RequestLocationInformation_r13(Asn1Object value) {
    this.sensor_RequestLocationInformation_r13_ = (Sensor_RequestLocationInformation_r13) value;
  }
  public Sensor_RequestLocationInformation_r13 setSensor_RequestLocationInformation_r13ToNewInstance() {
    sensor_RequestLocationInformation_r13_ = new Sensor_RequestLocationInformation_r13();
    return sensor_RequestLocationInformation_r13_;
  }
  
  private TBS_RequestLocationInformation_r13 tbs_RequestLocationInformation_r13_;
  public TBS_RequestLocationInformation_r13 getTbs_RequestLocationInformation_r13() {
    return tbs_RequestLocationInformation_r13_;
  }
  /**
   * @throws ClassCastException if value is not a TBS_RequestLocationInformation_r13
   */
  public void setTbs_RequestLocationInformation_r13(Asn1Object value) {
    this.tbs_RequestLocationInformation_r13_ = (TBS_RequestLocationInformation_r13) value;
  }
  public TBS_RequestLocationInformation_r13 setTbs_RequestLocationInformation_r13ToNewInstance() {
    tbs_RequestLocationInformation_r13_ = new TBS_RequestLocationInformation_r13();
    return tbs_RequestLocationInformation_r13_;
  }
  
  private WLAN_RequestLocationInformation_r13 wlan_RequestLocationInformation_r13_;
  public WLAN_RequestLocationInformation_r13 getWlan_RequestLocationInformation_r13() {
    return wlan_RequestLocationInformation_r13_;
  }
  /**
   * @throws ClassCastException if value is not a WLAN_RequestLocationInformation_r13
   */
  public void setWlan_RequestLocationInformation_r13(Asn1Object value) {
    this.wlan_RequestLocationInformation_r13_ = (WLAN_RequestLocationInformation_r13) value;
  }
  public WLAN_RequestLocationInformation_r13 setWlan_RequestLocationInformation_r13ToNewInstance() {
    wlan_RequestLocationInformation_r13_ = new WLAN_RequestLocationInformation_r13();
    return wlan_RequestLocationInformation_r13_;
  }
  
  private BT_RequestLocationInformation_r13 bt_RequestLocationInformation_r13_;
  public BT_RequestLocationInformation_r13 getBt_RequestLocationInformation_r13() {
    return bt_RequestLocationInformation_r13_;
  }
  /**
   * @throws ClassCastException if value is not a BT_RequestLocationInformation_r13
   */
  public void setBt_RequestLocationInformation_r13(Asn1Object value) {
    this.bt_RequestLocationInformation_r13_ = (BT_RequestLocationInformation_r13) value;
  }
  public BT_RequestLocationInformation_r13 setBt_RequestLocationInformation_r13ToNewInstance() {
    bt_RequestLocationInformation_r13_ = new BT_RequestLocationInformation_r13();
    return bt_RequestLocationInformation_r13_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getSensor_RequestLocationInformation_r13() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getSensor_RequestLocationInformation_r13();
          }

          @Override public void setToNewInstance() {
            setSensor_RequestLocationInformation_r13ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Sensor_RequestLocationInformation_r13.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "sensor_RequestLocationInformation_r13 : "
                    + getSensor_RequestLocationInformation_r13().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getTbs_RequestLocationInformation_r13() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getTbs_RequestLocationInformation_r13();
          }

          @Override public void setToNewInstance() {
            setTbs_RequestLocationInformation_r13ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? TBS_RequestLocationInformation_r13.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "tbs_RequestLocationInformation_r13 : "
                    + getTbs_RequestLocationInformation_r13().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getWlan_RequestLocationInformation_r13() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getWlan_RequestLocationInformation_r13();
          }

          @Override public void setToNewInstance() {
            setWlan_RequestLocationInformation_r13ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? WLAN_RequestLocationInformation_r13.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "wlan_RequestLocationInformation_r13 : "
                    + getWlan_RequestLocationInformation_r13().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getBt_RequestLocationInformation_r13() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getBt_RequestLocationInformation_r13();
          }

          @Override public void setToNewInstance() {
            setBt_RequestLocationInformation_r13ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? BT_RequestLocationInformation_r13.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bt_RequestLocationInformation_r13 : "
                    + getBt_RequestLocationInformation_r13().toIndentedString(indent);
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
    builder.append("RequestLocationInformation_r9_IEs = {\n");
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
