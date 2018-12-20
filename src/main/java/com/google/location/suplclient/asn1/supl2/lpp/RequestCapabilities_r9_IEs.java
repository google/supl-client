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
public  class RequestCapabilities_r9_IEs extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_RequestCapabilities_r9_IEs
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public RequestCapabilities_r9_IEs() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_RequestCapabilities_r9_IEs;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_RequestCapabilities_r9_IEs != null) {
      return ImmutableList.of(TAG_RequestCapabilities_r9_IEs);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new RequestCapabilities_r9_IEs from encoded stream.
   */
  public static RequestCapabilities_r9_IEs fromPerUnaligned(byte[] encodedBytes) {
    RequestCapabilities_r9_IEs result = new RequestCapabilities_r9_IEs();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new RequestCapabilities_r9_IEs from encoded stream.
   */
  public static RequestCapabilities_r9_IEs fromPerAligned(byte[] encodedBytes) {
    RequestCapabilities_r9_IEs result = new RequestCapabilities_r9_IEs();
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

  
  private CommonIEsRequestCapabilities commonIEsRequestCapabilities_;
  public CommonIEsRequestCapabilities getCommonIEsRequestCapabilities() {
    return commonIEsRequestCapabilities_;
  }
  /**
   * @throws ClassCastException if value is not a CommonIEsRequestCapabilities
   */
  public void setCommonIEsRequestCapabilities(Asn1Object value) {
    this.commonIEsRequestCapabilities_ = (CommonIEsRequestCapabilities) value;
  }
  public CommonIEsRequestCapabilities setCommonIEsRequestCapabilitiesToNewInstance() {
    commonIEsRequestCapabilities_ = new CommonIEsRequestCapabilities();
    return commonIEsRequestCapabilities_;
  }
  
  private A_GNSS_RequestCapabilities a_gnss_RequestCapabilities_;
  public A_GNSS_RequestCapabilities getA_gnss_RequestCapabilities() {
    return a_gnss_RequestCapabilities_;
  }
  /**
   * @throws ClassCastException if value is not a A_GNSS_RequestCapabilities
   */
  public void setA_gnss_RequestCapabilities(Asn1Object value) {
    this.a_gnss_RequestCapabilities_ = (A_GNSS_RequestCapabilities) value;
  }
  public A_GNSS_RequestCapabilities setA_gnss_RequestCapabilitiesToNewInstance() {
    a_gnss_RequestCapabilities_ = new A_GNSS_RequestCapabilities();
    return a_gnss_RequestCapabilities_;
  }
  
  private OTDOA_RequestCapabilities otdoa_RequestCapabilities_;
  public OTDOA_RequestCapabilities getOtdoa_RequestCapabilities() {
    return otdoa_RequestCapabilities_;
  }
  /**
   * @throws ClassCastException if value is not a OTDOA_RequestCapabilities
   */
  public void setOtdoa_RequestCapabilities(Asn1Object value) {
    this.otdoa_RequestCapabilities_ = (OTDOA_RequestCapabilities) value;
  }
  public OTDOA_RequestCapabilities setOtdoa_RequestCapabilitiesToNewInstance() {
    otdoa_RequestCapabilities_ = new OTDOA_RequestCapabilities();
    return otdoa_RequestCapabilities_;
  }
  
  private ECID_RequestCapabilities ecid_RequestCapabilities_;
  public ECID_RequestCapabilities getEcid_RequestCapabilities() {
    return ecid_RequestCapabilities_;
  }
  /**
   * @throws ClassCastException if value is not a ECID_RequestCapabilities
   */
  public void setEcid_RequestCapabilities(Asn1Object value) {
    this.ecid_RequestCapabilities_ = (ECID_RequestCapabilities) value;
  }
  public ECID_RequestCapabilities setEcid_RequestCapabilitiesToNewInstance() {
    ecid_RequestCapabilities_ = new ECID_RequestCapabilities();
    return ecid_RequestCapabilities_;
  }
  
  private EPDU_Sequence epdu_RequestCapabilities_;
  public EPDU_Sequence getEpdu_RequestCapabilities() {
    return epdu_RequestCapabilities_;
  }
  /**
   * @throws ClassCastException if value is not a EPDU_Sequence
   */
  public void setEpdu_RequestCapabilities(Asn1Object value) {
    this.epdu_RequestCapabilities_ = (EPDU_Sequence) value;
  }
  public EPDU_Sequence setEpdu_RequestCapabilitiesToNewInstance() {
    epdu_RequestCapabilities_ = new EPDU_Sequence();
    return epdu_RequestCapabilities_;
  }
  

  
  private RequestCapabilities_r9_IEs.ext1Type  extensionExt1;
  public RequestCapabilities_r9_IEs.ext1Type getExtensionExt1() {
    return extensionExt1;
  }
  /**
   * @throws ClassCastException if value is not a RequestCapabilities_r9_IEs.ext1Type
   */
  public void setExtensionExt1(Asn1Object value) {
    extensionExt1 = (RequestCapabilities_r9_IEs.ext1Type) value;
  }
  public void setExtensionExt1ToNewInstance() {
    extensionExt1 = new RequestCapabilities_r9_IEs.ext1Type();
  }
    

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getCommonIEsRequestCapabilities() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getCommonIEsRequestCapabilities();
          }

          @Override public void setToNewInstance() {
            setCommonIEsRequestCapabilitiesToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? CommonIEsRequestCapabilities.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "commonIEsRequestCapabilities : "
                    + getCommonIEsRequestCapabilities().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getA_gnss_RequestCapabilities() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getA_gnss_RequestCapabilities();
          }

          @Override public void setToNewInstance() {
            setA_gnss_RequestCapabilitiesToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? A_GNSS_RequestCapabilities.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "a_gnss_RequestCapabilities : "
                    + getA_gnss_RequestCapabilities().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getOtdoa_RequestCapabilities() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getOtdoa_RequestCapabilities();
          }

          @Override public void setToNewInstance() {
            setOtdoa_RequestCapabilitiesToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? OTDOA_RequestCapabilities.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "otdoa_RequestCapabilities : "
                    + getOtdoa_RequestCapabilities().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getEcid_RequestCapabilities() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getEcid_RequestCapabilities();
          }

          @Override public void setToNewInstance() {
            setEcid_RequestCapabilitiesToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ECID_RequestCapabilities.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ecid_RequestCapabilities : "
                    + getEcid_RequestCapabilities().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getEpdu_RequestCapabilities() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getEpdu_RequestCapabilities();
          }

          @Override public void setToNewInstance() {
            setEpdu_RequestCapabilitiesToNewInstance();
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
                return "epdu_RequestCapabilities : "
                    + getEpdu_RequestCapabilities().toIndentedString(indent);
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

  
  private Sensor_RequestCapabilities_r13 sensor_RequestCapabilities_r13_;
  public Sensor_RequestCapabilities_r13 getSensor_RequestCapabilities_r13() {
    return sensor_RequestCapabilities_r13_;
  }
  /**
   * @throws ClassCastException if value is not a Sensor_RequestCapabilities_r13
   */
  public void setSensor_RequestCapabilities_r13(Asn1Object value) {
    this.sensor_RequestCapabilities_r13_ = (Sensor_RequestCapabilities_r13) value;
  }
  public Sensor_RequestCapabilities_r13 setSensor_RequestCapabilities_r13ToNewInstance() {
    sensor_RequestCapabilities_r13_ = new Sensor_RequestCapabilities_r13();
    return sensor_RequestCapabilities_r13_;
  }
  
  private TBS_RequestCapabilities_r13 tbs_RequestCapabilities_r13_;
  public TBS_RequestCapabilities_r13 getTbs_RequestCapabilities_r13() {
    return tbs_RequestCapabilities_r13_;
  }
  /**
   * @throws ClassCastException if value is not a TBS_RequestCapabilities_r13
   */
  public void setTbs_RequestCapabilities_r13(Asn1Object value) {
    this.tbs_RequestCapabilities_r13_ = (TBS_RequestCapabilities_r13) value;
  }
  public TBS_RequestCapabilities_r13 setTbs_RequestCapabilities_r13ToNewInstance() {
    tbs_RequestCapabilities_r13_ = new TBS_RequestCapabilities_r13();
    return tbs_RequestCapabilities_r13_;
  }
  
  private WLAN_RequestCapabilities_r13 wlan_RequestCapabilities_r13_;
  public WLAN_RequestCapabilities_r13 getWlan_RequestCapabilities_r13() {
    return wlan_RequestCapabilities_r13_;
  }
  /**
   * @throws ClassCastException if value is not a WLAN_RequestCapabilities_r13
   */
  public void setWlan_RequestCapabilities_r13(Asn1Object value) {
    this.wlan_RequestCapabilities_r13_ = (WLAN_RequestCapabilities_r13) value;
  }
  public WLAN_RequestCapabilities_r13 setWlan_RequestCapabilities_r13ToNewInstance() {
    wlan_RequestCapabilities_r13_ = new WLAN_RequestCapabilities_r13();
    return wlan_RequestCapabilities_r13_;
  }
  
  private BT_RequestCapabilities_r13 bt_RequestCapabilities_r13_;
  public BT_RequestCapabilities_r13 getBt_RequestCapabilities_r13() {
    return bt_RequestCapabilities_r13_;
  }
  /**
   * @throws ClassCastException if value is not a BT_RequestCapabilities_r13
   */
  public void setBt_RequestCapabilities_r13(Asn1Object value) {
    this.bt_RequestCapabilities_r13_ = (BT_RequestCapabilities_r13) value;
  }
  public BT_RequestCapabilities_r13 setBt_RequestCapabilities_r13ToNewInstance() {
    bt_RequestCapabilities_r13_ = new BT_RequestCapabilities_r13();
    return bt_RequestCapabilities_r13_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getSensor_RequestCapabilities_r13() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getSensor_RequestCapabilities_r13();
          }

          @Override public void setToNewInstance() {
            setSensor_RequestCapabilities_r13ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Sensor_RequestCapabilities_r13.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "sensor_RequestCapabilities_r13 : "
                    + getSensor_RequestCapabilities_r13().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getTbs_RequestCapabilities_r13() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getTbs_RequestCapabilities_r13();
          }

          @Override public void setToNewInstance() {
            setTbs_RequestCapabilities_r13ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? TBS_RequestCapabilities_r13.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "tbs_RequestCapabilities_r13 : "
                    + getTbs_RequestCapabilities_r13().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getWlan_RequestCapabilities_r13() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getWlan_RequestCapabilities_r13();
          }

          @Override public void setToNewInstance() {
            setWlan_RequestCapabilities_r13ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? WLAN_RequestCapabilities_r13.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "wlan_RequestCapabilities_r13 : "
                    + getWlan_RequestCapabilities_r13().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getBt_RequestCapabilities_r13() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getBt_RequestCapabilities_r13();
          }

          @Override public void setToNewInstance() {
            setBt_RequestCapabilities_r13ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? BT_RequestCapabilities_r13.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bt_RequestCapabilities_r13 : "
                    + getBt_RequestCapabilities_r13().toIndentedString(indent);
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
    builder.append("RequestCapabilities_r9_IEs = {\n");
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
