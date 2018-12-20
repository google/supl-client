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

package com.google.location.suplclient.asn1.supl2.supl_init;

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
import com.google.location.suplclient.asn1.supl2.ulp_components.QoP;
import com.google.location.suplclient.asn1.supl2.ulp_components.SLPAddress;
import com.google.location.suplclient.asn1.supl2.ulp_version_2_message_extensions.Ver2_SUPL_INIT_extension;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
* 
*/
public  class SUPLINIT extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_SUPLINIT
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public SUPLINIT() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_SUPLINIT;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_SUPLINIT != null) {
      return ImmutableList.of(TAG_SUPLINIT);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new SUPLINIT from encoded stream.
   */
  public static SUPLINIT fromPerUnaligned(byte[] encodedBytes) {
    SUPLINIT result = new SUPLINIT();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new SUPLINIT from encoded stream.
   */
  public static SUPLINIT fromPerAligned(byte[] encodedBytes) {
    SUPLINIT result = new SUPLINIT();
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
  
  private Notification notification_;
  public Notification getNotification() {
    return notification_;
  }
  /**
   * @throws ClassCastException if value is not a Notification
   */
  public void setNotification(Asn1Object value) {
    this.notification_ = (Notification) value;
  }
  public Notification setNotificationToNewInstance() {
    notification_ = new Notification();
    return notification_;
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
  
  private QoP qoP_;
  public QoP getQoP() {
    return qoP_;
  }
  /**
   * @throws ClassCastException if value is not a QoP
   */
  public void setQoP(Asn1Object value) {
    this.qoP_ = (QoP) value;
  }
  public QoP setQoPToNewInstance() {
    qoP_ = new QoP();
    return qoP_;
  }
  
  private SLPMode sLPMode_;
  public SLPMode getSLPMode() {
    return sLPMode_;
  }
  /**
   * @throws ClassCastException if value is not a SLPMode
   */
  public void setSLPMode(Asn1Object value) {
    this.sLPMode_ = (SLPMode) value;
  }
  public SLPMode setSLPModeToNewInstance() {
    sLPMode_ = new SLPMode();
    return sLPMode_;
  }
  
  private MAC mAC_;
  public MAC getMAC() {
    return mAC_;
  }
  /**
   * @throws ClassCastException if value is not a MAC
   */
  public void setMAC(Asn1Object value) {
    this.mAC_ = (MAC) value;
  }
  public MAC setMACToNewInstance() {
    mAC_ = new MAC();
    return mAC_;
  }
  
  private KeyIdentity keyIdentity_;
  public KeyIdentity getKeyIdentity() {
    return keyIdentity_;
  }
  /**
   * @throws ClassCastException if value is not a KeyIdentity
   */
  public void setKeyIdentity(Asn1Object value) {
    this.keyIdentity_ = (KeyIdentity) value;
  }
  public KeyIdentity setKeyIdentityToNewInstance() {
    keyIdentity_ = new KeyIdentity();
    return keyIdentity_;
  }
  

  
  private Ver2_SUPL_INIT_extension extensionVer2_SUPL_INIT_extension;
  public Ver2_SUPL_INIT_extension getExtensionVer2_SUPL_INIT_extension() {
    return extensionVer2_SUPL_INIT_extension;
  }
  /**
   * @throws ClassCastException if value is not a Ver2_SUPL_INIT_extension
   */
  public void setExtensionVer2_SUPL_INIT_extension(Asn1Object value) {
    extensionVer2_SUPL_INIT_extension = (Ver2_SUPL_INIT_extension) value;
  }
  public void setExtensionVer2_SUPL_INIT_extensionToNewInstance() {
    extensionVer2_SUPL_INIT_extension = new Ver2_SUPL_INIT_extension();
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
            return getNotification() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getNotification();
          }

          @Override public void setToNewInstance() {
            setNotificationToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Notification.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "notification : "
                    + getNotification().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

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
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getQoP() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getQoP();
          }

          @Override public void setToNewInstance() {
            setQoPToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? QoP.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "qoP : "
                    + getQoP().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getSLPMode() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getSLPMode();
          }

          @Override public void setToNewInstance() {
            setSLPModeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SLPMode.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "sLPMode : "
                    + getSLPMode().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getMAC() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getMAC();
          }

          @Override public void setToNewInstance() {
            setMACToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? MAC.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "mAC : "
                    + getMAC().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getKeyIdentity() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getKeyIdentity();
          }

          @Override public void setToNewInstance() {
            setKeyIdentityToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? KeyIdentity.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "keyIdentity : "
                    + getKeyIdentity().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      builder.add(new SequenceComponent() {
            @Override public boolean isExplicitlySet() {
              return getExtensionVer2_SUPL_INIT_extension() != null;
            }

            @Override public boolean hasDefaultValue() {
              return false;
            }

            @Override public boolean isOptional() {
              return true;
            }

            @Override public Asn1Object getComponentValue() {
              return getExtensionVer2_SUPL_INIT_extension();
            }

            @Override public void setToNewInstance() {
              setExtensionVer2_SUPL_INIT_extensionToNewInstance();
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
              return "ver2_SUPL_INIT_extension : "
                  + getExtensionVer2_SUPL_INIT_extension().toIndentedString(indent);
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
    builder.append("SUPLINIT = {\n");
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
