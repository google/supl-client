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
public  class GNSS_CommonAssistDataReq extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GNSS_CommonAssistDataReq
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GNSS_CommonAssistDataReq() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GNSS_CommonAssistDataReq;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GNSS_CommonAssistDataReq != null) {
      return ImmutableList.of(TAG_GNSS_CommonAssistDataReq);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GNSS_CommonAssistDataReq from encoded stream.
   */
  public static GNSS_CommonAssistDataReq fromPerUnaligned(byte[] encodedBytes) {
    GNSS_CommonAssistDataReq result = new GNSS_CommonAssistDataReq();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GNSS_CommonAssistDataReq from encoded stream.
   */
  public static GNSS_CommonAssistDataReq fromPerAligned(byte[] encodedBytes) {
    GNSS_CommonAssistDataReq result = new GNSS_CommonAssistDataReq();
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

  
  private GNSS_ReferenceTimeReq gnss_ReferenceTimeReq_;
  public GNSS_ReferenceTimeReq getGnss_ReferenceTimeReq() {
    return gnss_ReferenceTimeReq_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_ReferenceTimeReq
   */
  public void setGnss_ReferenceTimeReq(Asn1Object value) {
    this.gnss_ReferenceTimeReq_ = (GNSS_ReferenceTimeReq) value;
  }
  public GNSS_ReferenceTimeReq setGnss_ReferenceTimeReqToNewInstance() {
    gnss_ReferenceTimeReq_ = new GNSS_ReferenceTimeReq();
    return gnss_ReferenceTimeReq_;
  }
  
  private GNSS_ReferenceLocationReq gnss_ReferenceLocationReq_;
  public GNSS_ReferenceLocationReq getGnss_ReferenceLocationReq() {
    return gnss_ReferenceLocationReq_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_ReferenceLocationReq
   */
  public void setGnss_ReferenceLocationReq(Asn1Object value) {
    this.gnss_ReferenceLocationReq_ = (GNSS_ReferenceLocationReq) value;
  }
  public GNSS_ReferenceLocationReq setGnss_ReferenceLocationReqToNewInstance() {
    gnss_ReferenceLocationReq_ = new GNSS_ReferenceLocationReq();
    return gnss_ReferenceLocationReq_;
  }
  
  private GNSS_IonosphericModelReq gnss_IonosphericModelReq_;
  public GNSS_IonosphericModelReq getGnss_IonosphericModelReq() {
    return gnss_IonosphericModelReq_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_IonosphericModelReq
   */
  public void setGnss_IonosphericModelReq(Asn1Object value) {
    this.gnss_IonosphericModelReq_ = (GNSS_IonosphericModelReq) value;
  }
  public GNSS_IonosphericModelReq setGnss_IonosphericModelReqToNewInstance() {
    gnss_IonosphericModelReq_ = new GNSS_IonosphericModelReq();
    return gnss_IonosphericModelReq_;
  }
  
  private GNSS_EarthOrientationParametersReq gnss_EarthOrientationParametersReq_;
  public GNSS_EarthOrientationParametersReq getGnss_EarthOrientationParametersReq() {
    return gnss_EarthOrientationParametersReq_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_EarthOrientationParametersReq
   */
  public void setGnss_EarthOrientationParametersReq(Asn1Object value) {
    this.gnss_EarthOrientationParametersReq_ = (GNSS_EarthOrientationParametersReq) value;
  }
  public GNSS_EarthOrientationParametersReq setGnss_EarthOrientationParametersReqToNewInstance() {
    gnss_EarthOrientationParametersReq_ = new GNSS_EarthOrientationParametersReq();
    return gnss_EarthOrientationParametersReq_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getGnss_ReferenceTimeReq() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_ReferenceTimeReq();
          }

          @Override public void setToNewInstance() {
            setGnss_ReferenceTimeReqToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_ReferenceTimeReq.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_ReferenceTimeReq : "
                    + getGnss_ReferenceTimeReq().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getGnss_ReferenceLocationReq() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_ReferenceLocationReq();
          }

          @Override public void setToNewInstance() {
            setGnss_ReferenceLocationReqToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_ReferenceLocationReq.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_ReferenceLocationReq : "
                    + getGnss_ReferenceLocationReq().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getGnss_IonosphericModelReq() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_IonosphericModelReq();
          }

          @Override public void setToNewInstance() {
            setGnss_IonosphericModelReqToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_IonosphericModelReq.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_IonosphericModelReq : "
                    + getGnss_IonosphericModelReq().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getGnss_EarthOrientationParametersReq() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_EarthOrientationParametersReq();
          }

          @Override public void setToNewInstance() {
            setGnss_EarthOrientationParametersReqToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_EarthOrientationParametersReq.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_EarthOrientationParametersReq : "
                    + getGnss_EarthOrientationParametersReq().toIndentedString(indent);
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
    builder.append("GNSS_CommonAssistDataReq = {\n");
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
