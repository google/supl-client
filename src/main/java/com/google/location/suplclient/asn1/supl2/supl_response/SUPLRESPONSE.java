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

package com.google.location.suplclient.asn1.supl2.supl_response;

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
import com.google.location.suplclient.asn1.supl2.ulp_components.PosMethod;
import com.google.location.suplclient.asn1.supl2.ulp_components.SLPAddress;
import com.google.location.suplclient.asn1.supl2.ulp_version_2_message_extensions.Ver2_SUPL_RESPONSE_extension;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
* 
*/
public  class SUPLRESPONSE extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_SUPLRESPONSE
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public SUPLRESPONSE() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_SUPLRESPONSE;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_SUPLRESPONSE != null) {
      return ImmutableList.of(TAG_SUPLRESPONSE);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new SUPLRESPONSE from encoded stream.
   */
  public static SUPLRESPONSE fromPerUnaligned(byte[] encodedBytes) {
    SUPLRESPONSE result = new SUPLRESPONSE();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new SUPLRESPONSE from encoded stream.
   */
  public static SUPLRESPONSE fromPerAligned(byte[] encodedBytes) {
    SUPLRESPONSE result = new SUPLRESPONSE();
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

  
  private PosMethod posMethod_;
  public PosMethod getPosMethod() {
    return posMethod_;
  }
  /**
   * @throws ClassCastException if value is not a PosMethod
   */
  public void setPosMethod(Asn1Object value) {
    this.posMethod_ = (PosMethod) value;
  }
  public PosMethod setPosMethodToNewInstance() {
    posMethod_ = new PosMethod();
    return posMethod_;
  }
  
  private SLPAddress sLPAddress_;
  public SLPAddress getSLPAddress() {
    return sLPAddress_;
  }
  /**
   * @throws ClassCastException if value is not a SLPAddress
   */
  public void setSLPAddress(Asn1Object value) {
    this.sLPAddress_ = (SLPAddress) value;
  }
  public SLPAddress setSLPAddressToNewInstance() {
    sLPAddress_ = new SLPAddress();
    return sLPAddress_;
  }
  
  private SETAuthKey sETAuthKey_;
  public SETAuthKey getSETAuthKey() {
    return sETAuthKey_;
  }
  /**
   * @throws ClassCastException if value is not a SETAuthKey
   */
  public void setSETAuthKey(Asn1Object value) {
    this.sETAuthKey_ = (SETAuthKey) value;
  }
  public SETAuthKey setSETAuthKeyToNewInstance() {
    sETAuthKey_ = new SETAuthKey();
    return sETAuthKey_;
  }
  
  private KeyIdentity4 keyIdentity4_;
  public KeyIdentity4 getKeyIdentity4() {
    return keyIdentity4_;
  }
  /**
   * @throws ClassCastException if value is not a KeyIdentity4
   */
  public void setKeyIdentity4(Asn1Object value) {
    this.keyIdentity4_ = (KeyIdentity4) value;
  }
  public KeyIdentity4 setKeyIdentity4ToNewInstance() {
    keyIdentity4_ = new KeyIdentity4();
    return keyIdentity4_;
  }
  

  
  private Ver2_SUPL_RESPONSE_extension extensionVer2_SUPL_RESPONSE_extension;
  public Ver2_SUPL_RESPONSE_extension getExtensionVer2_SUPL_RESPONSE_extension() {
    return extensionVer2_SUPL_RESPONSE_extension;
  }
  /**
   * @throws ClassCastException if value is not a Ver2_SUPL_RESPONSE_extension
   */
  public void setExtensionVer2_SUPL_RESPONSE_extension(Asn1Object value) {
    extensionVer2_SUPL_RESPONSE_extension = (Ver2_SUPL_RESPONSE_extension) value;
  }
  public void setExtensionVer2_SUPL_RESPONSE_extensionToNewInstance() {
    extensionVer2_SUPL_RESPONSE_extension = new Ver2_SUPL_RESPONSE_extension();
  }
    

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getPosMethod() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getPosMethod();
          }

          @Override public void setToNewInstance() {
            setPosMethodToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? PosMethod.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "posMethod : "
                    + getPosMethod().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getSLPAddress() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getSLPAddress();
          }

          @Override public void setToNewInstance() {
            setSLPAddressToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SLPAddress.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "sLPAddress : "
                    + getSLPAddress().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getSETAuthKey() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getSETAuthKey();
          }

          @Override public void setToNewInstance() {
            setSETAuthKeyToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SETAuthKey.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "sETAuthKey : "
                    + getSETAuthKey().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getKeyIdentity4() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getKeyIdentity4();
          }

          @Override public void setToNewInstance() {
            setKeyIdentity4ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? KeyIdentity4.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "keyIdentity4 : "
                    + getKeyIdentity4().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      builder.add(new SequenceComponent() {
            @Override public boolean isExplicitlySet() {
              return getExtensionVer2_SUPL_RESPONSE_extension() != null;
            }

            @Override public boolean hasDefaultValue() {
              return false;
            }

            @Override public boolean isOptional() {
              return true;
            }

            @Override public Asn1Object getComponentValue() {
              return getExtensionVer2_SUPL_RESPONSE_extension();
            }

            @Override public void setToNewInstance() {
              setExtensionVer2_SUPL_RESPONSE_extensionToNewInstance();
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
              return "ver2_SUPL_RESPONSE_extension : "
                  + getExtensionVer2_SUPL_RESPONSE_extension().toIndentedString(indent);
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
    builder.append("SUPLRESPONSE = {\n");
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
