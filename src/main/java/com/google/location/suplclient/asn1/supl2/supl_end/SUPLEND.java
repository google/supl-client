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

package com.google.location.suplclient.asn1.supl2.supl_end;

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
import com.google.location.suplclient.asn1.supl2.ulp_components.Position;
import com.google.location.suplclient.asn1.supl2.ulp_components.StatusCode;
import com.google.location.suplclient.asn1.supl2.ulp_components.Ver;
import com.google.location.suplclient.asn1.supl2.ulp_version_2_message_extensions.Ver2_SUPL_END_extension;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
* 
*/
public  class SUPLEND extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_SUPLEND
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public SUPLEND() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_SUPLEND;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_SUPLEND != null) {
      return ImmutableList.of(TAG_SUPLEND);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new SUPLEND from encoded stream.
   */
  public static SUPLEND fromPerUnaligned(byte[] encodedBytes) {
    SUPLEND result = new SUPLEND();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new SUPLEND from encoded stream.
   */
  public static SUPLEND fromPerAligned(byte[] encodedBytes) {
    SUPLEND result = new SUPLEND();
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

  
  private Position position_;
  public Position getPosition() {
    return position_;
  }
  /**
   * @throws ClassCastException if value is not a Position
   */
  public void setPosition(Asn1Object value) {
    this.position_ = (Position) value;
  }
  public Position setPositionToNewInstance() {
    position_ = new Position();
    return position_;
  }
  
  private StatusCode statusCode_;
  public StatusCode getStatusCode() {
    return statusCode_;
  }
  /**
   * @throws ClassCastException if value is not a StatusCode
   */
  public void setStatusCode(Asn1Object value) {
    this.statusCode_ = (StatusCode) value;
  }
  public StatusCode setStatusCodeToNewInstance() {
    statusCode_ = new StatusCode();
    return statusCode_;
  }
  
  private Ver ver_;
  public Ver getVer() {
    return ver_;
  }
  /**
   * @throws ClassCastException if value is not a Ver
   */
  public void setVer(Asn1Object value) {
    this.ver_ = (Ver) value;
  }
  public Ver setVerToNewInstance() {
    ver_ = new Ver();
    return ver_;
  }
  

  
  private Ver2_SUPL_END_extension extensionVer2_SUPL_END_extension;
  public Ver2_SUPL_END_extension getExtensionVer2_SUPL_END_extension() {
    return extensionVer2_SUPL_END_extension;
  }
  /**
   * @throws ClassCastException if value is not a Ver2_SUPL_END_extension
   */
  public void setExtensionVer2_SUPL_END_extension(Asn1Object value) {
    extensionVer2_SUPL_END_extension = (Ver2_SUPL_END_extension) value;
  }
  public void setExtensionVer2_SUPL_END_extensionToNewInstance() {
    extensionVer2_SUPL_END_extension = new Ver2_SUPL_END_extension();
  }
    

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getPosition() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getPosition();
          }

          @Override public void setToNewInstance() {
            setPositionToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Position.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "position : "
                    + getPosition().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getStatusCode() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getStatusCode();
          }

          @Override public void setToNewInstance() {
            setStatusCodeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? StatusCode.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "statusCode : "
                    + getStatusCode().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getVer() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getVer();
          }

          @Override public void setToNewInstance() {
            setVerToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Ver.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ver : "
                    + getVer().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      builder.add(new SequenceComponent() {
            @Override public boolean isExplicitlySet() {
              return getExtensionVer2_SUPL_END_extension() != null;
            }

            @Override public boolean hasDefaultValue() {
              return false;
            }

            @Override public boolean isOptional() {
              return true;
            }

            @Override public Asn1Object getComponentValue() {
              return getExtensionVer2_SUPL_END_extension();
            }

            @Override public void setToNewInstance() {
              setExtensionVer2_SUPL_END_extensionToNewInstance();
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
              return "ver2_SUPL_END_extension : "
                  + getExtensionVer2_SUPL_END_extension().toIndentedString(indent);
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
    builder.append("SUPLEND = {\n");
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
