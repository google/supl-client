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

package com.google.location.suplclient.asn1.supl2.rrlp_components_ver12;

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
import com.google.location.suplclient.asn1.supl2.rrlp_components.GANSSAddIonosphericModel;
import com.google.location.suplclient.asn1.supl2.rrlp_components.GANSSEarthOrientParam;
import com.google.location.suplclient.asn1.supl2.rrlp_components.GANSSRefLocation;
import com.google.location.suplclient.asn1.supl2.rrlp_components.GANSSReferenceTime;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
* 
*/
public  class GANSSCommonAssistData extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GANSSCommonAssistData
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GANSSCommonAssistData() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GANSSCommonAssistData;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GANSSCommonAssistData != null) {
      return ImmutableList.of(TAG_GANSSCommonAssistData);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GANSSCommonAssistData from encoded stream.
   */
  public static GANSSCommonAssistData fromPerUnaligned(byte[] encodedBytes) {
    GANSSCommonAssistData result = new GANSSCommonAssistData();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GANSSCommonAssistData from encoded stream.
   */
  public static GANSSCommonAssistData fromPerAligned(byte[] encodedBytes) {
    GANSSCommonAssistData result = new GANSSCommonAssistData();
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

  
  private GANSSReferenceTime ganssReferenceTime_;
  public GANSSReferenceTime getGanssReferenceTime() {
    return ganssReferenceTime_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSReferenceTime
   */
  public void setGanssReferenceTime(Asn1Object value) {
    this.ganssReferenceTime_ = (GANSSReferenceTime) value;
  }
  public GANSSReferenceTime setGanssReferenceTimeToNewInstance() {
    ganssReferenceTime_ = new GANSSReferenceTime();
    return ganssReferenceTime_;
  }
  
  private GANSSRefLocation ganssRefLocation_;
  public GANSSRefLocation getGanssRefLocation() {
    return ganssRefLocation_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSRefLocation
   */
  public void setGanssRefLocation(Asn1Object value) {
    this.ganssRefLocation_ = (GANSSRefLocation) value;
  }
  public GANSSRefLocation setGanssRefLocationToNewInstance() {
    ganssRefLocation_ = new GANSSRefLocation();
    return ganssRefLocation_;
  }
  
  private GANSSIonosphericModel ganssIonosphericModel_;
  public GANSSIonosphericModel getGanssIonosphericModel() {
    return ganssIonosphericModel_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSIonosphericModel
   */
  public void setGanssIonosphericModel(Asn1Object value) {
    this.ganssIonosphericModel_ = (GANSSIonosphericModel) value;
  }
  public GANSSIonosphericModel setGanssIonosphericModelToNewInstance() {
    ganssIonosphericModel_ = new GANSSIonosphericModel();
    return ganssIonosphericModel_;
  }
  

  
  private GANSSAddIonosphericModel  extensionGanssAddIonosphericModel;
  public GANSSAddIonosphericModel getExtensionGanssAddIonosphericModel() {
    return extensionGanssAddIonosphericModel;
  }
  /**
   * @throws ClassCastException if value is not a GANSSAddIonosphericModel
   */
  public void setExtensionGanssAddIonosphericModel(Asn1Object value) {
    extensionGanssAddIonosphericModel = (GANSSAddIonosphericModel) value;
  }
  public void setExtensionGanssAddIonosphericModelToNewInstance() {
    extensionGanssAddIonosphericModel = new GANSSAddIonosphericModel();
  }
    
  private GANSSEarthOrientParam  extensionGanssEarthOrientParam;
  public GANSSEarthOrientParam getExtensionGanssEarthOrientParam() {
    return extensionGanssEarthOrientParam;
  }
  /**
   * @throws ClassCastException if value is not a GANSSEarthOrientParam
   */
  public void setExtensionGanssEarthOrientParam(Asn1Object value) {
    extensionGanssEarthOrientParam = (GANSSEarthOrientParam) value;
  }
  public void setExtensionGanssEarthOrientParamToNewInstance() {
    extensionGanssEarthOrientParam = new GANSSEarthOrientParam();
  }
    

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getGanssReferenceTime() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssReferenceTime();
          }

          @Override public void setToNewInstance() {
            setGanssReferenceTimeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSReferenceTime.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssReferenceTime : "
                    + getGanssReferenceTime().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getGanssRefLocation() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssRefLocation();
          }

          @Override public void setToNewInstance() {
            setGanssRefLocationToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSRefLocation.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssRefLocation : "
                    + getGanssRefLocation().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getGanssIonosphericModel() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssIonosphericModel();
          }

          @Override public void setToNewInstance() {
            setGanssIonosphericModelToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSIonosphericModel.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssIonosphericModel : "
                    + getGanssIonosphericModel().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      builder.add(new SequenceComponent() {
            @Override public boolean isExplicitlySet() {
              return getExtensionGanssAddIonosphericModel() != null;
            }

            @Override public boolean hasDefaultValue() {
              return false;
            }

            @Override public boolean isOptional() {
              return true;
            }

            @Override public Asn1Object getComponentValue() {
              return getExtensionGanssAddIonosphericModel();
            }

            @Override public void setToNewInstance() {
              setExtensionGanssAddIonosphericModelToNewInstance();
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
              return "ganssAddIonosphericModel : "
                  + getExtensionGanssAddIonosphericModel().toIndentedString(indent);
            }
      });
      
      builder.add(new SequenceComponent() {
            @Override public boolean isExplicitlySet() {
              return getExtensionGanssEarthOrientParam() != null;
            }

            @Override public boolean hasDefaultValue() {
              return false;
            }

            @Override public boolean isOptional() {
              return true;
            }

            @Override public Asn1Object getComponentValue() {
              return getExtensionGanssEarthOrientParam();
            }

            @Override public void setToNewInstance() {
              setExtensionGanssEarthOrientParamToNewInstance();
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
              return "ganssEarthOrientParam : "
                  + getExtensionGanssEarthOrientParam().toIndentedString(indent);
            }
      });
      
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
    builder.append("GANSSCommonAssistData = {\n");
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
