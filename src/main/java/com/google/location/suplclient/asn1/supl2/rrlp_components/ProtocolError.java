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
public  class ProtocolError extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_ProtocolError
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ProtocolError() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ProtocolError;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ProtocolError != null) {
      return ImmutableList.of(TAG_ProtocolError);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ProtocolError from encoded stream.
   */
  public static ProtocolError fromPerUnaligned(byte[] encodedBytes) {
    ProtocolError result = new ProtocolError();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ProtocolError from encoded stream.
   */
  public static ProtocolError fromPerAligned(byte[] encodedBytes) {
    ProtocolError result = new ProtocolError();
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

  
  private ErrorCodes errorCause_;
  public ErrorCodes getErrorCause() {
    return errorCause_;
  }
  /**
   * @throws ClassCastException if value is not a ErrorCodes
   */
  public void setErrorCause(Asn1Object value) {
    this.errorCause_ = (ErrorCodes) value;
  }
  public ErrorCodes setErrorCauseToNewInstance() {
    errorCause_ = new ErrorCodes();
    return errorCause_;
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
  

  
  private Rel_5_ProtocolError_Extension  extensionRel_5_ProtocolError_Extension;
  public Rel_5_ProtocolError_Extension getExtensionRel_5_ProtocolError_Extension() {
    return extensionRel_5_ProtocolError_Extension;
  }
  /**
   * @throws ClassCastException if value is not a Rel_5_ProtocolError_Extension
   */
  public void setExtensionRel_5_ProtocolError_Extension(Asn1Object value) {
    extensionRel_5_ProtocolError_Extension = (Rel_5_ProtocolError_Extension) value;
  }
  public void setExtensionRel_5_ProtocolError_ExtensionToNewInstance() {
    extensionRel_5_ProtocolError_Extension = new Rel_5_ProtocolError_Extension();
  }
    

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getErrorCause() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getErrorCause();
          }

          @Override public void setToNewInstance() {
            setErrorCauseToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ErrorCodes.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "errorCause : "
                    + getErrorCause().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

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
              return getExtensionRel_5_ProtocolError_Extension() != null;
            }

            @Override public boolean hasDefaultValue() {
              return false;
            }

            @Override public boolean isOptional() {
              return true;
            }

            @Override public Asn1Object getComponentValue() {
              return getExtensionRel_5_ProtocolError_Extension();
            }

            @Override public void setToNewInstance() {
              setExtensionRel_5_ProtocolError_ExtensionToNewInstance();
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
              return "rel_5_ProtocolError_Extension : "
                  + getExtensionRel_5_ProtocolError_Extension().toIndentedString(indent);
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
    builder.append("ProtocolError = {\n");
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
