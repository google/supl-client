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

package com.google.location.suplclient.asn1.supl2.rrlp_components;

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
import com.google.location.suplclient.asn1.supl2.map_extensiondatatypes.ExtensionContainer;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
* 
*/
public  class MsrPosition_Req extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_MsrPosition_Req
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public MsrPosition_Req() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_MsrPosition_Req;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_MsrPosition_Req != null) {
      return ImmutableList.of(TAG_MsrPosition_Req);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new MsrPosition_Req from encoded stream.
   */
  public static MsrPosition_Req fromPerUnaligned(byte[] encodedBytes) {
    MsrPosition_Req result = new MsrPosition_Req();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new MsrPosition_Req from encoded stream.
   */
  public static MsrPosition_Req fromPerAligned(byte[] encodedBytes) {
    MsrPosition_Req result = new MsrPosition_Req();
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

  
  private PositionInstruct positionInstruct_;
  public PositionInstruct getPositionInstruct() {
    return positionInstruct_;
  }
  /**
   * @throws ClassCastException if value is not a PositionInstruct
   */
  public void setPositionInstruct(Asn1Object value) {
    this.positionInstruct_ = (PositionInstruct) value;
  }
  public PositionInstruct setPositionInstructToNewInstance() {
    positionInstruct_ = new PositionInstruct();
    return positionInstruct_;
  }
  
  private ReferenceAssistData referenceAssistData_;
  public ReferenceAssistData getReferenceAssistData() {
    return referenceAssistData_;
  }
  /**
   * @throws ClassCastException if value is not a ReferenceAssistData
   */
  public void setReferenceAssistData(Asn1Object value) {
    this.referenceAssistData_ = (ReferenceAssistData) value;
  }
  public ReferenceAssistData setReferenceAssistDataToNewInstance() {
    referenceAssistData_ = new ReferenceAssistData();
    return referenceAssistData_;
  }
  
  private MsrAssistData msrAssistData_;
  public MsrAssistData getMsrAssistData() {
    return msrAssistData_;
  }
  /**
   * @throws ClassCastException if value is not a MsrAssistData
   */
  public void setMsrAssistData(Asn1Object value) {
    this.msrAssistData_ = (MsrAssistData) value;
  }
  public MsrAssistData setMsrAssistDataToNewInstance() {
    msrAssistData_ = new MsrAssistData();
    return msrAssistData_;
  }
  
  private SystemInfoAssistData systemInfoAssistData_;
  public SystemInfoAssistData getSystemInfoAssistData() {
    return systemInfoAssistData_;
  }
  /**
   * @throws ClassCastException if value is not a SystemInfoAssistData
   */
  public void setSystemInfoAssistData(Asn1Object value) {
    this.systemInfoAssistData_ = (SystemInfoAssistData) value;
  }
  public SystemInfoAssistData setSystemInfoAssistDataToNewInstance() {
    systemInfoAssistData_ = new SystemInfoAssistData();
    return systemInfoAssistData_;
  }
  
  private GPS_AssistData gps_AssistData_;
  public GPS_AssistData getGps_AssistData() {
    return gps_AssistData_;
  }
  /**
   * @throws ClassCastException if value is not a GPS_AssistData
   */
  public void setGps_AssistData(Asn1Object value) {
    this.gps_AssistData_ = (GPS_AssistData) value;
  }
  public GPS_AssistData setGps_AssistDataToNewInstance() {
    gps_AssistData_ = new GPS_AssistData();
    return gps_AssistData_;
  }
  
  private ExtensionContainer extensionContainer_;
  public ExtensionContainer getExtensionContainer() {
    return extensionContainer_;
  }
  /**
   * @throws ClassCastException if value is not a ExtensionContainer
   */
  public void setExtensionContainer(Asn1Object value) {
    this.extensionContainer_ = (ExtensionContainer) value;
  }
  public ExtensionContainer setExtensionContainerToNewInstance() {
    extensionContainer_ = new ExtensionContainer();
    return extensionContainer_;
  }
  

  
  private Rel98_MsrPosition_Req_Extension  extensionRel98_MsrPosition_Req_extension;
  public Rel98_MsrPosition_Req_Extension getExtensionRel98_MsrPosition_Req_extension() {
    return extensionRel98_MsrPosition_Req_extension;
  }
  /**
   * @throws ClassCastException if value is not a Rel98_MsrPosition_Req_Extension
   */
  public void setExtensionRel98_MsrPosition_Req_extension(Asn1Object value) {
    extensionRel98_MsrPosition_Req_extension = (Rel98_MsrPosition_Req_Extension) value;
  }
  public void setExtensionRel98_MsrPosition_Req_extensionToNewInstance() {
    extensionRel98_MsrPosition_Req_extension = new Rel98_MsrPosition_Req_Extension();
  }
    
  private Rel5_MsrPosition_Req_Extension  extensionRel5_MsrPosition_Req_extension;
  public Rel5_MsrPosition_Req_Extension getExtensionRel5_MsrPosition_Req_extension() {
    return extensionRel5_MsrPosition_Req_extension;
  }
  /**
   * @throws ClassCastException if value is not a Rel5_MsrPosition_Req_Extension
   */
  public void setExtensionRel5_MsrPosition_Req_extension(Asn1Object value) {
    extensionRel5_MsrPosition_Req_extension = (Rel5_MsrPosition_Req_Extension) value;
  }
  public void setExtensionRel5_MsrPosition_Req_extensionToNewInstance() {
    extensionRel5_MsrPosition_Req_extension = new Rel5_MsrPosition_Req_Extension();
  }
    
  private Rel7_MsrPosition_Req_Extension  extensionRel7_MsrPosition_Req_extension;
  public Rel7_MsrPosition_Req_Extension getExtensionRel7_MsrPosition_Req_extension() {
    return extensionRel7_MsrPosition_Req_extension;
  }
  /**
   * @throws ClassCastException if value is not a Rel7_MsrPosition_Req_Extension
   */
  public void setExtensionRel7_MsrPosition_Req_extension(Asn1Object value) {
    extensionRel7_MsrPosition_Req_extension = (Rel7_MsrPosition_Req_Extension) value;
  }
  public void setExtensionRel7_MsrPosition_Req_extensionToNewInstance() {
    extensionRel7_MsrPosition_Req_extension = new Rel7_MsrPosition_Req_Extension();
  }
    

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getPositionInstruct() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getPositionInstruct();
          }

          @Override public void setToNewInstance() {
            setPositionInstructToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? PositionInstruct.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "positionInstruct : "
                    + getPositionInstruct().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getReferenceAssistData() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getReferenceAssistData();
          }

          @Override public void setToNewInstance() {
            setReferenceAssistDataToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ReferenceAssistData.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "referenceAssistData : "
                    + getReferenceAssistData().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getMsrAssistData() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getMsrAssistData();
          }

          @Override public void setToNewInstance() {
            setMsrAssistDataToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? MsrAssistData.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "msrAssistData : "
                    + getMsrAssistData().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getSystemInfoAssistData() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getSystemInfoAssistData();
          }

          @Override public void setToNewInstance() {
            setSystemInfoAssistDataToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SystemInfoAssistData.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "systemInfoAssistData : "
                    + getSystemInfoAssistData().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getGps_AssistData() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGps_AssistData();
          }

          @Override public void setToNewInstance() {
            setGps_AssistDataToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GPS_AssistData.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gps_AssistData : "
                    + getGps_AssistData().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getExtensionContainer() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getExtensionContainer();
          }

          @Override public void setToNewInstance() {
            setExtensionContainerToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ExtensionContainer.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "extensionContainer : "
                    + getExtensionContainer().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      builder.add(new SequenceComponent() {
            @Override public boolean isExplicitlySet() {
              return getExtensionRel98_MsrPosition_Req_extension() != null;
            }

            @Override public boolean hasDefaultValue() {
              return false;
            }

            @Override public boolean isOptional() {
              return true;
            }

            @Override public Asn1Object getComponentValue() {
              return getExtensionRel98_MsrPosition_Req_extension();
            }

            @Override public void setToNewInstance() {
              setExtensionRel98_MsrPosition_Req_extensionToNewInstance();
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
              return "rel98_MsrPosition_Req_extension : "
                  + getExtensionRel98_MsrPosition_Req_extension().toIndentedString(indent);
            }
      });
      
      builder.add(new SequenceComponent() {
            @Override public boolean isExplicitlySet() {
              return getExtensionRel5_MsrPosition_Req_extension() != null;
            }

            @Override public boolean hasDefaultValue() {
              return false;
            }

            @Override public boolean isOptional() {
              return true;
            }

            @Override public Asn1Object getComponentValue() {
              return getExtensionRel5_MsrPosition_Req_extension();
            }

            @Override public void setToNewInstance() {
              setExtensionRel5_MsrPosition_Req_extensionToNewInstance();
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
              return "rel5_MsrPosition_Req_extension : "
                  + getExtensionRel5_MsrPosition_Req_extension().toIndentedString(indent);
            }
      });
      
      builder.add(new SequenceComponent() {
            @Override public boolean isExplicitlySet() {
              return getExtensionRel7_MsrPosition_Req_extension() != null;
            }

            @Override public boolean hasDefaultValue() {
              return false;
            }

            @Override public boolean isOptional() {
              return true;
            }

            @Override public Asn1Object getComponentValue() {
              return getExtensionRel7_MsrPosition_Req_extension();
            }

            @Override public void setToNewInstance() {
              setExtensionRel7_MsrPosition_Req_extensionToNewInstance();
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
              return "rel7_MsrPosition_Req_extension : "
                  + getExtensionRel7_MsrPosition_Req_extension().toIndentedString(indent);
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
    builder.append("MsrPosition_Req = {\n");
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
