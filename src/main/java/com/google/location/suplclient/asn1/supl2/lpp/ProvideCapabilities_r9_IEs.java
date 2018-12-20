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
public  class ProvideCapabilities_r9_IEs extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_ProvideCapabilities_r9_IEs
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ProvideCapabilities_r9_IEs() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ProvideCapabilities_r9_IEs;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ProvideCapabilities_r9_IEs != null) {
      return ImmutableList.of(TAG_ProvideCapabilities_r9_IEs);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ProvideCapabilities_r9_IEs from encoded stream.
   */
  public static ProvideCapabilities_r9_IEs fromPerUnaligned(byte[] encodedBytes) {
    ProvideCapabilities_r9_IEs result = new ProvideCapabilities_r9_IEs();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ProvideCapabilities_r9_IEs from encoded stream.
   */
  public static ProvideCapabilities_r9_IEs fromPerAligned(byte[] encodedBytes) {
    ProvideCapabilities_r9_IEs result = new ProvideCapabilities_r9_IEs();
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

  
  private CommonIEsProvideCapabilities commonIEsProvideCapabilities_;
  public CommonIEsProvideCapabilities getCommonIEsProvideCapabilities() {
    return commonIEsProvideCapabilities_;
  }
  /**
   * @throws ClassCastException if value is not a CommonIEsProvideCapabilities
   */
  public void setCommonIEsProvideCapabilities(Asn1Object value) {
    this.commonIEsProvideCapabilities_ = (CommonIEsProvideCapabilities) value;
  }
  public CommonIEsProvideCapabilities setCommonIEsProvideCapabilitiesToNewInstance() {
    commonIEsProvideCapabilities_ = new CommonIEsProvideCapabilities();
    return commonIEsProvideCapabilities_;
  }
  
  private A_GNSS_ProvideCapabilities a_gnss_ProvideCapabilities_;
  public A_GNSS_ProvideCapabilities getA_gnss_ProvideCapabilities() {
    return a_gnss_ProvideCapabilities_;
  }
  /**
   * @throws ClassCastException if value is not a A_GNSS_ProvideCapabilities
   */
  public void setA_gnss_ProvideCapabilities(Asn1Object value) {
    this.a_gnss_ProvideCapabilities_ = (A_GNSS_ProvideCapabilities) value;
  }
  public A_GNSS_ProvideCapabilities setA_gnss_ProvideCapabilitiesToNewInstance() {
    a_gnss_ProvideCapabilities_ = new A_GNSS_ProvideCapabilities();
    return a_gnss_ProvideCapabilities_;
  }
  
  private OTDOA_ProvideCapabilities otdoa_ProvideCapabilities_;
  public OTDOA_ProvideCapabilities getOtdoa_ProvideCapabilities() {
    return otdoa_ProvideCapabilities_;
  }
  /**
   * @throws ClassCastException if value is not a OTDOA_ProvideCapabilities
   */
  public void setOtdoa_ProvideCapabilities(Asn1Object value) {
    this.otdoa_ProvideCapabilities_ = (OTDOA_ProvideCapabilities) value;
  }
  public OTDOA_ProvideCapabilities setOtdoa_ProvideCapabilitiesToNewInstance() {
    otdoa_ProvideCapabilities_ = new OTDOA_ProvideCapabilities();
    return otdoa_ProvideCapabilities_;
  }
  
  private ECID_ProvideCapabilities ecid_ProvideCapabilities_;
  public ECID_ProvideCapabilities getEcid_ProvideCapabilities() {
    return ecid_ProvideCapabilities_;
  }
  /**
   * @throws ClassCastException if value is not a ECID_ProvideCapabilities
   */
  public void setEcid_ProvideCapabilities(Asn1Object value) {
    this.ecid_ProvideCapabilities_ = (ECID_ProvideCapabilities) value;
  }
  public ECID_ProvideCapabilities setEcid_ProvideCapabilitiesToNewInstance() {
    ecid_ProvideCapabilities_ = new ECID_ProvideCapabilities();
    return ecid_ProvideCapabilities_;
  }
  
  private EPDU_Sequence epdu_ProvideCapabilities_;
  public EPDU_Sequence getEpdu_ProvideCapabilities() {
    return epdu_ProvideCapabilities_;
  }
  /**
   * @throws ClassCastException if value is not a EPDU_Sequence
   */
  public void setEpdu_ProvideCapabilities(Asn1Object value) {
    this.epdu_ProvideCapabilities_ = (EPDU_Sequence) value;
  }
  public EPDU_Sequence setEpdu_ProvideCapabilitiesToNewInstance() {
    epdu_ProvideCapabilities_ = new EPDU_Sequence();
    return epdu_ProvideCapabilities_;
  }
  

  
  private ProvideCapabilities_r9_IEs.ext1Type  extensionExt1;
  public ProvideCapabilities_r9_IEs.ext1Type getExtensionExt1() {
    return extensionExt1;
  }
  /**
   * @throws ClassCastException if value is not a ProvideCapabilities_r9_IEs.ext1Type
   */
  public void setExtensionExt1(Asn1Object value) {
    extensionExt1 = (ProvideCapabilities_r9_IEs.ext1Type) value;
  }
  public void setExtensionExt1ToNewInstance() {
    extensionExt1 = new ProvideCapabilities_r9_IEs.ext1Type();
  }
    

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getCommonIEsProvideCapabilities() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getCommonIEsProvideCapabilities();
          }

          @Override public void setToNewInstance() {
            setCommonIEsProvideCapabilitiesToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? CommonIEsProvideCapabilities.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "commonIEsProvideCapabilities : "
                    + getCommonIEsProvideCapabilities().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getA_gnss_ProvideCapabilities() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getA_gnss_ProvideCapabilities();
          }

          @Override public void setToNewInstance() {
            setA_gnss_ProvideCapabilitiesToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? A_GNSS_ProvideCapabilities.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "a_gnss_ProvideCapabilities : "
                    + getA_gnss_ProvideCapabilities().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getOtdoa_ProvideCapabilities() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getOtdoa_ProvideCapabilities();
          }

          @Override public void setToNewInstance() {
            setOtdoa_ProvideCapabilitiesToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? OTDOA_ProvideCapabilities.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "otdoa_ProvideCapabilities : "
                    + getOtdoa_ProvideCapabilities().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getEcid_ProvideCapabilities() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getEcid_ProvideCapabilities();
          }

          @Override public void setToNewInstance() {
            setEcid_ProvideCapabilitiesToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ECID_ProvideCapabilities.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ecid_ProvideCapabilities : "
                    + getEcid_ProvideCapabilities().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getEpdu_ProvideCapabilities() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getEpdu_ProvideCapabilities();
          }

          @Override public void setToNewInstance() {
            setEpdu_ProvideCapabilitiesToNewInstance();
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
                return "epdu_ProvideCapabilities : "
                    + getEpdu_ProvideCapabilities().toIndentedString(indent);
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

  
  private Sensor_ProvideCapabilities_r13 sensor_ProvideCapabilities_r13_;
  public Sensor_ProvideCapabilities_r13 getSensor_ProvideCapabilities_r13() {
    return sensor_ProvideCapabilities_r13_;
  }
  /**
   * @throws ClassCastException if value is not a Sensor_ProvideCapabilities_r13
   */
  public void setSensor_ProvideCapabilities_r13(Asn1Object value) {
    this.sensor_ProvideCapabilities_r13_ = (Sensor_ProvideCapabilities_r13) value;
  }
  public Sensor_ProvideCapabilities_r13 setSensor_ProvideCapabilities_r13ToNewInstance() {
    sensor_ProvideCapabilities_r13_ = new Sensor_ProvideCapabilities_r13();
    return sensor_ProvideCapabilities_r13_;
  }
  
  private TBS_ProvideCapabilities_r13 tbs_ProvideCapabilities_r13_;
  public TBS_ProvideCapabilities_r13 getTbs_ProvideCapabilities_r13() {
    return tbs_ProvideCapabilities_r13_;
  }
  /**
   * @throws ClassCastException if value is not a TBS_ProvideCapabilities_r13
   */
  public void setTbs_ProvideCapabilities_r13(Asn1Object value) {
    this.tbs_ProvideCapabilities_r13_ = (TBS_ProvideCapabilities_r13) value;
  }
  public TBS_ProvideCapabilities_r13 setTbs_ProvideCapabilities_r13ToNewInstance() {
    tbs_ProvideCapabilities_r13_ = new TBS_ProvideCapabilities_r13();
    return tbs_ProvideCapabilities_r13_;
  }
  
  private WLAN_ProvideCapabilities_r13 wlan_ProvideCapabilities_r13_;
  public WLAN_ProvideCapabilities_r13 getWlan_ProvideCapabilities_r13() {
    return wlan_ProvideCapabilities_r13_;
  }
  /**
   * @throws ClassCastException if value is not a WLAN_ProvideCapabilities_r13
   */
  public void setWlan_ProvideCapabilities_r13(Asn1Object value) {
    this.wlan_ProvideCapabilities_r13_ = (WLAN_ProvideCapabilities_r13) value;
  }
  public WLAN_ProvideCapabilities_r13 setWlan_ProvideCapabilities_r13ToNewInstance() {
    wlan_ProvideCapabilities_r13_ = new WLAN_ProvideCapabilities_r13();
    return wlan_ProvideCapabilities_r13_;
  }
  
  private BT_ProvideCapabilities_r13 bt_ProvideCapabilities_r13_;
  public BT_ProvideCapabilities_r13 getBt_ProvideCapabilities_r13() {
    return bt_ProvideCapabilities_r13_;
  }
  /**
   * @throws ClassCastException if value is not a BT_ProvideCapabilities_r13
   */
  public void setBt_ProvideCapabilities_r13(Asn1Object value) {
    this.bt_ProvideCapabilities_r13_ = (BT_ProvideCapabilities_r13) value;
  }
  public BT_ProvideCapabilities_r13 setBt_ProvideCapabilities_r13ToNewInstance() {
    bt_ProvideCapabilities_r13_ = new BT_ProvideCapabilities_r13();
    return bt_ProvideCapabilities_r13_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getSensor_ProvideCapabilities_r13() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getSensor_ProvideCapabilities_r13();
          }

          @Override public void setToNewInstance() {
            setSensor_ProvideCapabilities_r13ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Sensor_ProvideCapabilities_r13.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "sensor_ProvideCapabilities_r13 : "
                    + getSensor_ProvideCapabilities_r13().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getTbs_ProvideCapabilities_r13() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getTbs_ProvideCapabilities_r13();
          }

          @Override public void setToNewInstance() {
            setTbs_ProvideCapabilities_r13ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? TBS_ProvideCapabilities_r13.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "tbs_ProvideCapabilities_r13 : "
                    + getTbs_ProvideCapabilities_r13().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getWlan_ProvideCapabilities_r13() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getWlan_ProvideCapabilities_r13();
          }

          @Override public void setToNewInstance() {
            setWlan_ProvideCapabilities_r13ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? WLAN_ProvideCapabilities_r13.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "wlan_ProvideCapabilities_r13 : "
                    + getWlan_ProvideCapabilities_r13().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getBt_ProvideCapabilities_r13() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getBt_ProvideCapabilities_r13();
          }

          @Override public void setToNewInstance() {
            setBt_ProvideCapabilities_r13ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? BT_ProvideCapabilities_r13.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bt_ProvideCapabilities_r13 : "
                    + getBt_ProvideCapabilities_r13().toIndentedString(indent);
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
    builder.append("ProvideCapabilities_r9_IEs = {\n");
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
