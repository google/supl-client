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

package com.google.location.suplclient.asn1.supl2.supl_start;

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
import com.google.location.suplclient.asn1.supl2.ulp_version_2_parameter_extensions.Ver2_SETCapabilities_extension;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
* 
*/
public  class SETCapabilities extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_SETCapabilities
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public SETCapabilities() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_SETCapabilities;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_SETCapabilities != null) {
      return ImmutableList.of(TAG_SETCapabilities);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new SETCapabilities from encoded stream.
   */
  public static SETCapabilities fromPerUnaligned(byte[] encodedBytes) {
    SETCapabilities result = new SETCapabilities();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new SETCapabilities from encoded stream.
   */
  public static SETCapabilities fromPerAligned(byte[] encodedBytes) {
    SETCapabilities result = new SETCapabilities();
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

  
  private PosTechnology posTechnology_;
  public PosTechnology getPosTechnology() {
    return posTechnology_;
  }
  /**
   * @throws ClassCastException if value is not a PosTechnology
   */
  public void setPosTechnology(Asn1Object value) {
    this.posTechnology_ = (PosTechnology) value;
  }
  public PosTechnology setPosTechnologyToNewInstance() {
    posTechnology_ = new PosTechnology();
    return posTechnology_;
  }
  
  private PrefMethod prefMethod_;
  public PrefMethod getPrefMethod() {
    return prefMethod_;
  }
  /**
   * @throws ClassCastException if value is not a PrefMethod
   */
  public void setPrefMethod(Asn1Object value) {
    this.prefMethod_ = (PrefMethod) value;
  }
  public PrefMethod setPrefMethodToNewInstance() {
    prefMethod_ = new PrefMethod();
    return prefMethod_;
  }
  
  private PosProtocol posProtocol_;
  public PosProtocol getPosProtocol() {
    return posProtocol_;
  }
  /**
   * @throws ClassCastException if value is not a PosProtocol
   */
  public void setPosProtocol(Asn1Object value) {
    this.posProtocol_ = (PosProtocol) value;
  }
  public PosProtocol setPosProtocolToNewInstance() {
    posProtocol_ = new PosProtocol();
    return posProtocol_;
  }
  

  
  private Ver2_SETCapabilities_extension extensionVer2_SETCapabilities_extension;
  public Ver2_SETCapabilities_extension getExtensionVer2_SETCapabilities_extension() {
    return extensionVer2_SETCapabilities_extension;
  }
  /**
   * @throws ClassCastException if value is not a Ver2_SETCapabilities_extension
   */
  public void setExtensionVer2_SETCapabilities_extension(Asn1Object value) {
    extensionVer2_SETCapabilities_extension = (Ver2_SETCapabilities_extension) value;
  }
  public void setExtensionVer2_SETCapabilities_extensionToNewInstance() {
    extensionVer2_SETCapabilities_extension = new Ver2_SETCapabilities_extension();
  }
    

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getPosTechnology() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getPosTechnology();
          }

          @Override public void setToNewInstance() {
            setPosTechnologyToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? PosTechnology.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "posTechnology : "
                    + getPosTechnology().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getPrefMethod() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getPrefMethod();
          }

          @Override public void setToNewInstance() {
            setPrefMethodToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? PrefMethod.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "prefMethod : "
                    + getPrefMethod().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getPosProtocol() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getPosProtocol();
          }

          @Override public void setToNewInstance() {
            setPosProtocolToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? PosProtocol.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "posProtocol : "
                    + getPosProtocol().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      builder.add(new SequenceComponent() {
            @Override public boolean isExplicitlySet() {
              return getExtensionVer2_SETCapabilities_extension() != null;
            }

            @Override public boolean hasDefaultValue() {
              return false;
            }

            @Override public boolean isOptional() {
              return true;
            }

            @Override public Asn1Object getComponentValue() {
              return getExtensionVer2_SETCapabilities_extension();
            }

            @Override public void setToNewInstance() {
              setExtensionVer2_SETCapabilities_extensionToNewInstance();
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
              return "ver2_SETCapabilities_extension : "
                  + getExtensionVer2_SETCapabilities_extension().toIndentedString(indent);
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
    builder.append("SETCapabilities = {\n");
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
