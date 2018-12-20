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
public  class ProvideAssistanceData_r9_IEs extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_ProvideAssistanceData_r9_IEs
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ProvideAssistanceData_r9_IEs() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ProvideAssistanceData_r9_IEs;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ProvideAssistanceData_r9_IEs != null) {
      return ImmutableList.of(TAG_ProvideAssistanceData_r9_IEs);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ProvideAssistanceData_r9_IEs from encoded stream.
   */
  public static ProvideAssistanceData_r9_IEs fromPerUnaligned(byte[] encodedBytes) {
    ProvideAssistanceData_r9_IEs result = new ProvideAssistanceData_r9_IEs();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ProvideAssistanceData_r9_IEs from encoded stream.
   */
  public static ProvideAssistanceData_r9_IEs fromPerAligned(byte[] encodedBytes) {
    ProvideAssistanceData_r9_IEs result = new ProvideAssistanceData_r9_IEs();
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

  
  private CommonIEsProvideAssistanceData commonIEsProvideAssistanceData_;
  public CommonIEsProvideAssistanceData getCommonIEsProvideAssistanceData() {
    return commonIEsProvideAssistanceData_;
  }
  /**
   * @throws ClassCastException if value is not a CommonIEsProvideAssistanceData
   */
  public void setCommonIEsProvideAssistanceData(Asn1Object value) {
    this.commonIEsProvideAssistanceData_ = (CommonIEsProvideAssistanceData) value;
  }
  public CommonIEsProvideAssistanceData setCommonIEsProvideAssistanceDataToNewInstance() {
    commonIEsProvideAssistanceData_ = new CommonIEsProvideAssistanceData();
    return commonIEsProvideAssistanceData_;
  }
  
  private A_GNSS_ProvideAssistanceData a_gnss_ProvideAssistanceData_;
  public A_GNSS_ProvideAssistanceData getA_gnss_ProvideAssistanceData() {
    return a_gnss_ProvideAssistanceData_;
  }
  /**
   * @throws ClassCastException if value is not a A_GNSS_ProvideAssistanceData
   */
  public void setA_gnss_ProvideAssistanceData(Asn1Object value) {
    this.a_gnss_ProvideAssistanceData_ = (A_GNSS_ProvideAssistanceData) value;
  }
  public A_GNSS_ProvideAssistanceData setA_gnss_ProvideAssistanceDataToNewInstance() {
    a_gnss_ProvideAssistanceData_ = new A_GNSS_ProvideAssistanceData();
    return a_gnss_ProvideAssistanceData_;
  }
  
  private OTDOA_ProvideAssistanceData otdoa_ProvideAssistanceData_;
  public OTDOA_ProvideAssistanceData getOtdoa_ProvideAssistanceData() {
    return otdoa_ProvideAssistanceData_;
  }
  /**
   * @throws ClassCastException if value is not a OTDOA_ProvideAssistanceData
   */
  public void setOtdoa_ProvideAssistanceData(Asn1Object value) {
    this.otdoa_ProvideAssistanceData_ = (OTDOA_ProvideAssistanceData) value;
  }
  public OTDOA_ProvideAssistanceData setOtdoa_ProvideAssistanceDataToNewInstance() {
    otdoa_ProvideAssistanceData_ = new OTDOA_ProvideAssistanceData();
    return otdoa_ProvideAssistanceData_;
  }
  
  private EPDU_Sequence epdu_Provide_Assistance_Data_;
  public EPDU_Sequence getEpdu_Provide_Assistance_Data() {
    return epdu_Provide_Assistance_Data_;
  }
  /**
   * @throws ClassCastException if value is not a EPDU_Sequence
   */
  public void setEpdu_Provide_Assistance_Data(Asn1Object value) {
    this.epdu_Provide_Assistance_Data_ = (EPDU_Sequence) value;
  }
  public EPDU_Sequence setEpdu_Provide_Assistance_DataToNewInstance() {
    epdu_Provide_Assistance_Data_ = new EPDU_Sequence();
    return epdu_Provide_Assistance_Data_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getCommonIEsProvideAssistanceData() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getCommonIEsProvideAssistanceData();
          }

          @Override public void setToNewInstance() {
            setCommonIEsProvideAssistanceDataToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? CommonIEsProvideAssistanceData.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "commonIEsProvideAssistanceData : "
                    + getCommonIEsProvideAssistanceData().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getA_gnss_ProvideAssistanceData() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getA_gnss_ProvideAssistanceData();
          }

          @Override public void setToNewInstance() {
            setA_gnss_ProvideAssistanceDataToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? A_GNSS_ProvideAssistanceData.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "a_gnss_ProvideAssistanceData : "
                    + getA_gnss_ProvideAssistanceData().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getOtdoa_ProvideAssistanceData() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getOtdoa_ProvideAssistanceData();
          }

          @Override public void setToNewInstance() {
            setOtdoa_ProvideAssistanceDataToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? OTDOA_ProvideAssistanceData.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "otdoa_ProvideAssistanceData : "
                    + getOtdoa_ProvideAssistanceData().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getEpdu_Provide_Assistance_Data() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getEpdu_Provide_Assistance_Data();
          }

          @Override public void setToNewInstance() {
            setEpdu_Provide_Assistance_DataToNewInstance();
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
                return "epdu_Provide_Assistance_Data : "
                    + getEpdu_Provide_Assistance_Data().toIndentedString(indent);
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
    builder.append("ProvideAssistanceData_r9_IEs = {\n");
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
