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
public  class AssistanceData extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_AssistanceData
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public AssistanceData() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_AssistanceData;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_AssistanceData != null) {
      return ImmutableList.of(TAG_AssistanceData);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new AssistanceData from encoded stream.
   */
  public static AssistanceData fromPerUnaligned(byte[] encodedBytes) {
    AssistanceData result = new AssistanceData();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new AssistanceData from encoded stream.
   */
  public static AssistanceData fromPerAligned(byte[] encodedBytes) {
    AssistanceData result = new AssistanceData();
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
  
  private MoreAssDataToBeSent moreAssDataToBeSent_;
  public MoreAssDataToBeSent getMoreAssDataToBeSent() {
    return moreAssDataToBeSent_;
  }
  /**
   * @throws ClassCastException if value is not a MoreAssDataToBeSent
   */
  public void setMoreAssDataToBeSent(Asn1Object value) {
    this.moreAssDataToBeSent_ = (MoreAssDataToBeSent) value;
  }
  public MoreAssDataToBeSent setMoreAssDataToBeSentToNewInstance() {
    moreAssDataToBeSent_ = new MoreAssDataToBeSent();
    return moreAssDataToBeSent_;
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
  

  
  private Rel98_AssistanceData_Extension  extensionRel98_AssistanceData_Extension;
  public Rel98_AssistanceData_Extension getExtensionRel98_AssistanceData_Extension() {
    return extensionRel98_AssistanceData_Extension;
  }
  /**
   * @throws ClassCastException if value is not a Rel98_AssistanceData_Extension
   */
  public void setExtensionRel98_AssistanceData_Extension(Asn1Object value) {
    extensionRel98_AssistanceData_Extension = (Rel98_AssistanceData_Extension) value;
  }
  public void setExtensionRel98_AssistanceData_ExtensionToNewInstance() {
    extensionRel98_AssistanceData_Extension = new Rel98_AssistanceData_Extension();
  }
    
  private Rel5_AssistanceData_Extension  extensionRel5_AssistanceData_Extension;
  public Rel5_AssistanceData_Extension getExtensionRel5_AssistanceData_Extension() {
    return extensionRel5_AssistanceData_Extension;
  }
  /**
   * @throws ClassCastException if value is not a Rel5_AssistanceData_Extension
   */
  public void setExtensionRel5_AssistanceData_Extension(Asn1Object value) {
    extensionRel5_AssistanceData_Extension = (Rel5_AssistanceData_Extension) value;
  }
  public void setExtensionRel5_AssistanceData_ExtensionToNewInstance() {
    extensionRel5_AssistanceData_Extension = new Rel5_AssistanceData_Extension();
  }
    
  private Rel7_AssistanceData_Extension  extensionRel7_AssistanceData_Extension;
  public Rel7_AssistanceData_Extension getExtensionRel7_AssistanceData_Extension() {
    return extensionRel7_AssistanceData_Extension;
  }
  /**
   * @throws ClassCastException if value is not a Rel7_AssistanceData_Extension
   */
  public void setExtensionRel7_AssistanceData_Extension(Asn1Object value) {
    extensionRel7_AssistanceData_Extension = (Rel7_AssistanceData_Extension) value;
  }
  public void setExtensionRel7_AssistanceData_ExtensionToNewInstance() {
    extensionRel7_AssistanceData_Extension = new Rel7_AssistanceData_Extension();
  }
    

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

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
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

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
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

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
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

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
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getMoreAssDataToBeSent() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getMoreAssDataToBeSent();
          }

          @Override public void setToNewInstance() {
            setMoreAssDataToBeSentToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? MoreAssDataToBeSent.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "moreAssDataToBeSent : "
                    + getMoreAssDataToBeSent().toIndentedString(indent);
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
              return getExtensionRel98_AssistanceData_Extension() != null;
            }

            @Override public boolean hasDefaultValue() {
              return false;
            }

            @Override public boolean isOptional() {
              return true;
            }

            @Override public Asn1Object getComponentValue() {
              return getExtensionRel98_AssistanceData_Extension();
            }

            @Override public void setToNewInstance() {
              setExtensionRel98_AssistanceData_ExtensionToNewInstance();
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
              return "rel98_AssistanceData_Extension : "
                  + getExtensionRel98_AssistanceData_Extension().toIndentedString(indent);
            }
      });
      
      builder.add(new SequenceComponent() {
            @Override public boolean isExplicitlySet() {
              return getExtensionRel5_AssistanceData_Extension() != null;
            }

            @Override public boolean hasDefaultValue() {
              return false;
            }

            @Override public boolean isOptional() {
              return true;
            }

            @Override public Asn1Object getComponentValue() {
              return getExtensionRel5_AssistanceData_Extension();
            }

            @Override public void setToNewInstance() {
              setExtensionRel5_AssistanceData_ExtensionToNewInstance();
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
              return "rel5_AssistanceData_Extension : "
                  + getExtensionRel5_AssistanceData_Extension().toIndentedString(indent);
            }
      });
      
      builder.add(new SequenceComponent() {
            @Override public boolean isExplicitlySet() {
              return getExtensionRel7_AssistanceData_Extension() != null;
            }

            @Override public boolean hasDefaultValue() {
              return false;
            }

            @Override public boolean isOptional() {
              return true;
            }

            @Override public Asn1Object getComponentValue() {
              return getExtensionRel7_AssistanceData_Extension();
            }

            @Override public void setToNewInstance() {
              setExtensionRel7_AssistanceData_ExtensionToNewInstance();
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
              return "rel7_AssistanceData_Extension : "
                  + getExtensionRel7_AssistanceData_Extension().toIndentedString(indent);
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
    builder.append("AssistanceData = {\n");
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
