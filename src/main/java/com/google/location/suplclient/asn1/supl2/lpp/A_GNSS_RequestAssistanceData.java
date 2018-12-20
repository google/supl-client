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
public  class A_GNSS_RequestAssistanceData extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_A_GNSS_RequestAssistanceData
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public A_GNSS_RequestAssistanceData() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_A_GNSS_RequestAssistanceData;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_A_GNSS_RequestAssistanceData != null) {
      return ImmutableList.of(TAG_A_GNSS_RequestAssistanceData);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new A_GNSS_RequestAssistanceData from encoded stream.
   */
  public static A_GNSS_RequestAssistanceData fromPerUnaligned(byte[] encodedBytes) {
    A_GNSS_RequestAssistanceData result = new A_GNSS_RequestAssistanceData();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new A_GNSS_RequestAssistanceData from encoded stream.
   */
  public static A_GNSS_RequestAssistanceData fromPerAligned(byte[] encodedBytes) {
    A_GNSS_RequestAssistanceData result = new A_GNSS_RequestAssistanceData();
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

  
  private GNSS_CommonAssistDataReq gnss_CommonAssistDataReq_;
  public GNSS_CommonAssistDataReq getGnss_CommonAssistDataReq() {
    return gnss_CommonAssistDataReq_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_CommonAssistDataReq
   */
  public void setGnss_CommonAssistDataReq(Asn1Object value) {
    this.gnss_CommonAssistDataReq_ = (GNSS_CommonAssistDataReq) value;
  }
  public GNSS_CommonAssistDataReq setGnss_CommonAssistDataReqToNewInstance() {
    gnss_CommonAssistDataReq_ = new GNSS_CommonAssistDataReq();
    return gnss_CommonAssistDataReq_;
  }
  
  private GNSS_GenericAssistDataReq gnss_GenericAssistDataReq_;
  public GNSS_GenericAssistDataReq getGnss_GenericAssistDataReq() {
    return gnss_GenericAssistDataReq_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_GenericAssistDataReq
   */
  public void setGnss_GenericAssistDataReq(Asn1Object value) {
    this.gnss_GenericAssistDataReq_ = (GNSS_GenericAssistDataReq) value;
  }
  public GNSS_GenericAssistDataReq setGnss_GenericAssistDataReqToNewInstance() {
    gnss_GenericAssistDataReq_ = new GNSS_GenericAssistDataReq();
    return gnss_GenericAssistDataReq_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getGnss_CommonAssistDataReq() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_CommonAssistDataReq();
          }

          @Override public void setToNewInstance() {
            setGnss_CommonAssistDataReqToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_CommonAssistDataReq.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_CommonAssistDataReq : "
                    + getGnss_CommonAssistDataReq().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getGnss_GenericAssistDataReq() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_GenericAssistDataReq();
          }

          @Override public void setToNewInstance() {
            setGnss_GenericAssistDataReqToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_GenericAssistDataReq.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_GenericAssistDataReq : "
                    + getGnss_GenericAssistDataReq().toIndentedString(indent);
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
    builder.append("A_GNSS_RequestAssistanceData = {\n");
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
