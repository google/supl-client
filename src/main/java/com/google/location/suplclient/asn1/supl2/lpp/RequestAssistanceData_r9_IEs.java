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
public  class RequestAssistanceData_r9_IEs extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_RequestAssistanceData_r9_IEs
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public RequestAssistanceData_r9_IEs() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_RequestAssistanceData_r9_IEs;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_RequestAssistanceData_r9_IEs != null) {
      return ImmutableList.of(TAG_RequestAssistanceData_r9_IEs);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new RequestAssistanceData_r9_IEs from encoded stream.
   */
  public static RequestAssistanceData_r9_IEs fromPerUnaligned(byte[] encodedBytes) {
    RequestAssistanceData_r9_IEs result = new RequestAssistanceData_r9_IEs();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new RequestAssistanceData_r9_IEs from encoded stream.
   */
  public static RequestAssistanceData_r9_IEs fromPerAligned(byte[] encodedBytes) {
    RequestAssistanceData_r9_IEs result = new RequestAssistanceData_r9_IEs();
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

  
  private CommonIEsRequestAssistanceData commonIEsRequestAssistanceData_;
  public CommonIEsRequestAssistanceData getCommonIEsRequestAssistanceData() {
    return commonIEsRequestAssistanceData_;
  }
  /**
   * @throws ClassCastException if value is not a CommonIEsRequestAssistanceData
   */
  public void setCommonIEsRequestAssistanceData(Asn1Object value) {
    this.commonIEsRequestAssistanceData_ = (CommonIEsRequestAssistanceData) value;
  }
  public CommonIEsRequestAssistanceData setCommonIEsRequestAssistanceDataToNewInstance() {
    commonIEsRequestAssistanceData_ = new CommonIEsRequestAssistanceData();
    return commonIEsRequestAssistanceData_;
  }
  
  private A_GNSS_RequestAssistanceData a_gnss_RequestAssistanceData_;
  public A_GNSS_RequestAssistanceData getA_gnss_RequestAssistanceData() {
    return a_gnss_RequestAssistanceData_;
  }
  /**
   * @throws ClassCastException if value is not a A_GNSS_RequestAssistanceData
   */
  public void setA_gnss_RequestAssistanceData(Asn1Object value) {
    this.a_gnss_RequestAssistanceData_ = (A_GNSS_RequestAssistanceData) value;
  }
  public A_GNSS_RequestAssistanceData setA_gnss_RequestAssistanceDataToNewInstance() {
    a_gnss_RequestAssistanceData_ = new A_GNSS_RequestAssistanceData();
    return a_gnss_RequestAssistanceData_;
  }
  
  private OTDOA_RequestAssistanceData otdoa_RequestAssistanceData_;
  public OTDOA_RequestAssistanceData getOtdoa_RequestAssistanceData() {
    return otdoa_RequestAssistanceData_;
  }
  /**
   * @throws ClassCastException if value is not a OTDOA_RequestAssistanceData
   */
  public void setOtdoa_RequestAssistanceData(Asn1Object value) {
    this.otdoa_RequestAssistanceData_ = (OTDOA_RequestAssistanceData) value;
  }
  public OTDOA_RequestAssistanceData setOtdoa_RequestAssistanceDataToNewInstance() {
    otdoa_RequestAssistanceData_ = new OTDOA_RequestAssistanceData();
    return otdoa_RequestAssistanceData_;
  }
  
  private EPDU_Sequence epdu_RequestAssistanceData_;
  public EPDU_Sequence getEpdu_RequestAssistanceData() {
    return epdu_RequestAssistanceData_;
  }
  /**
   * @throws ClassCastException if value is not a EPDU_Sequence
   */
  public void setEpdu_RequestAssistanceData(Asn1Object value) {
    this.epdu_RequestAssistanceData_ = (EPDU_Sequence) value;
  }
  public EPDU_Sequence setEpdu_RequestAssistanceDataToNewInstance() {
    epdu_RequestAssistanceData_ = new EPDU_Sequence();
    return epdu_RequestAssistanceData_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getCommonIEsRequestAssistanceData() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getCommonIEsRequestAssistanceData();
          }

          @Override public void setToNewInstance() {
            setCommonIEsRequestAssistanceDataToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? CommonIEsRequestAssistanceData.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "commonIEsRequestAssistanceData : "
                    + getCommonIEsRequestAssistanceData().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getA_gnss_RequestAssistanceData() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getA_gnss_RequestAssistanceData();
          }

          @Override public void setToNewInstance() {
            setA_gnss_RequestAssistanceDataToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? A_GNSS_RequestAssistanceData.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "a_gnss_RequestAssistanceData : "
                    + getA_gnss_RequestAssistanceData().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getOtdoa_RequestAssistanceData() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getOtdoa_RequestAssistanceData();
          }

          @Override public void setToNewInstance() {
            setOtdoa_RequestAssistanceDataToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? OTDOA_RequestAssistanceData.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "otdoa_RequestAssistanceData : "
                    + getOtdoa_RequestAssistanceData().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getEpdu_RequestAssistanceData() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getEpdu_RequestAssistanceData();
          }

          @Override public void setToNewInstance() {
            setEpdu_RequestAssistanceDataToNewInstance();
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
                return "epdu_RequestAssistanceData : "
                    + getEpdu_RequestAssistanceData().toIndentedString(indent);
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
    builder.append("RequestAssistanceData_r9_IEs = {\n");
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
