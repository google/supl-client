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
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
* 
*/
public  class GPSTOWAssistElement extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GPSTOWAssistElement
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GPSTOWAssistElement() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GPSTOWAssistElement;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GPSTOWAssistElement != null) {
      return ImmutableList.of(TAG_GPSTOWAssistElement);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GPSTOWAssistElement from encoded stream.
   */
  public static GPSTOWAssistElement fromPerUnaligned(byte[] encodedBytes) {
    GPSTOWAssistElement result = new GPSTOWAssistElement();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GPSTOWAssistElement from encoded stream.
   */
  public static GPSTOWAssistElement fromPerAligned(byte[] encodedBytes) {
    GPSTOWAssistElement result = new GPSTOWAssistElement();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }



  @Override protected boolean isExtensible() {
    return false;
  }

  @Override public boolean containsExtensionValues() {
    for (SequenceComponent extensionComponent : getExtensionComponents()) {
      if (extensionComponent.isExplicitlySet()) return true;
    }
    return false;
  }

  
  private SatelliteID satelliteID_;
  public SatelliteID getSatelliteID() {
    return satelliteID_;
  }
  /**
   * @throws ClassCastException if value is not a SatelliteID
   */
  public void setSatelliteID(Asn1Object value) {
    this.satelliteID_ = (SatelliteID) value;
  }
  public SatelliteID setSatelliteIDToNewInstance() {
    satelliteID_ = new SatelliteID();
    return satelliteID_;
  }
  
  private TLMWord tlmWord_;
  public TLMWord getTlmWord() {
    return tlmWord_;
  }
  /**
   * @throws ClassCastException if value is not a TLMWord
   */
  public void setTlmWord(Asn1Object value) {
    this.tlmWord_ = (TLMWord) value;
  }
  public TLMWord setTlmWordToNewInstance() {
    tlmWord_ = new TLMWord();
    return tlmWord_;
  }
  
  private AntiSpoofFlag antiSpoof_;
  public AntiSpoofFlag getAntiSpoof() {
    return antiSpoof_;
  }
  /**
   * @throws ClassCastException if value is not a AntiSpoofFlag
   */
  public void setAntiSpoof(Asn1Object value) {
    this.antiSpoof_ = (AntiSpoofFlag) value;
  }
  public AntiSpoofFlag setAntiSpoofToNewInstance() {
    antiSpoof_ = new AntiSpoofFlag();
    return antiSpoof_;
  }
  
  private AlertFlag alert_;
  public AlertFlag getAlert() {
    return alert_;
  }
  /**
   * @throws ClassCastException if value is not a AlertFlag
   */
  public void setAlert(Asn1Object value) {
    this.alert_ = (AlertFlag) value;
  }
  public AlertFlag setAlertToNewInstance() {
    alert_ = new AlertFlag();
    return alert_;
  }
  
  private TLMReservedBits tlmRsvdBits_;
  public TLMReservedBits getTlmRsvdBits() {
    return tlmRsvdBits_;
  }
  /**
   * @throws ClassCastException if value is not a TLMReservedBits
   */
  public void setTlmRsvdBits(Asn1Object value) {
    this.tlmRsvdBits_ = (TLMReservedBits) value;
  }
  public TLMReservedBits setTlmRsvdBitsToNewInstance() {
    tlmRsvdBits_ = new TLMReservedBits();
    return tlmRsvdBits_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getSatelliteID() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getSatelliteID();
          }

          @Override public void setToNewInstance() {
            setSatelliteIDToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SatelliteID.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "satelliteID : "
                    + getSatelliteID().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getTlmWord() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getTlmWord();
          }

          @Override public void setToNewInstance() {
            setTlmWordToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? TLMWord.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "tlmWord : "
                    + getTlmWord().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getAntiSpoof() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getAntiSpoof();
          }

          @Override public void setToNewInstance() {
            setAntiSpoofToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? AntiSpoofFlag.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "antiSpoof : "
                    + getAntiSpoof().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getAlert() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getAlert();
          }

          @Override public void setToNewInstance() {
            setAlertToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? AlertFlag.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "alert : "
                    + getAlert().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getTlmRsvdBits() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getTlmRsvdBits();
          }

          @Override public void setToNewInstance() {
            setTlmRsvdBitsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? TLMReservedBits.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "tlmRsvdBits : "
                    + getTlmRsvdBits().toIndentedString(indent);
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
    builder.append("GPSTOWAssistElement = {\n");
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
