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
public  class AssistanceSupported extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_AssistanceSupported
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public AssistanceSupported() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_AssistanceSupported;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_AssistanceSupported != null) {
      return ImmutableList.of(TAG_AssistanceSupported);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new AssistanceSupported from encoded stream.
   */
  public static AssistanceSupported fromPerUnaligned(byte[] encodedBytes) {
    AssistanceSupported result = new AssistanceSupported();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new AssistanceSupported from encoded stream.
   */
  public static AssistanceSupported fromPerAligned(byte[] encodedBytes) {
    AssistanceSupported result = new AssistanceSupported();
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

  
  private GPSAssistance gpsAssistance_;
  public GPSAssistance getGpsAssistance() {
    return gpsAssistance_;
  }
  /**
   * @throws ClassCastException if value is not a GPSAssistance
   */
  public void setGpsAssistance(Asn1Object value) {
    this.gpsAssistance_ = (GPSAssistance) value;
  }
  public GPSAssistance setGpsAssistanceToNewInstance() {
    gpsAssistance_ = new GPSAssistance();
    return gpsAssistance_;
  }
  
  private GANSSAssistanceSet gANSSAssistanceSet_;
  public GANSSAssistanceSet getGANSSAssistanceSet() {
    return gANSSAssistanceSet_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSAssistanceSet
   */
  public void setGANSSAssistanceSet(Asn1Object value) {
    this.gANSSAssistanceSet_ = (GANSSAssistanceSet) value;
  }
  public GANSSAssistanceSet setGANSSAssistanceSetToNewInstance() {
    gANSSAssistanceSet_ = new GANSSAssistanceSet();
    return gANSSAssistanceSet_;
  }
  

  
  private GANSSAdditionalAssistanceChoices  extensionGANSSAdditionalAssistanceChoices;
  public GANSSAdditionalAssistanceChoices getExtensionGANSSAdditionalAssistanceChoices() {
    return extensionGANSSAdditionalAssistanceChoices;
  }
  /**
   * @throws ClassCastException if value is not a GANSSAdditionalAssistanceChoices
   */
  public void setExtensionGANSSAdditionalAssistanceChoices(Asn1Object value) {
    extensionGANSSAdditionalAssistanceChoices = (GANSSAdditionalAssistanceChoices) value;
  }
  public void setExtensionGANSSAdditionalAssistanceChoicesToNewInstance() {
    extensionGANSSAdditionalAssistanceChoices = new GANSSAdditionalAssistanceChoices();
  }
    

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getGpsAssistance() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGpsAssistance();
          }

          @Override public void setToNewInstance() {
            setGpsAssistanceToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GPSAssistance.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gpsAssistance : "
                    + getGpsAssistance().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getGANSSAssistanceSet() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGANSSAssistanceSet();
          }

          @Override public void setToNewInstance() {
            setGANSSAssistanceSetToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSAssistanceSet.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gANSSAssistanceSet : "
                    + getGANSSAssistanceSet().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      builder.add(new SequenceComponent() {
            @Override public boolean isExplicitlySet() {
              return getExtensionGANSSAdditionalAssistanceChoices() != null;
            }

            @Override public boolean hasDefaultValue() {
              return false;
            }

            @Override public boolean isOptional() {
              return true;
            }

            @Override public Asn1Object getComponentValue() {
              return getExtensionGANSSAdditionalAssistanceChoices();
            }

            @Override public void setToNewInstance() {
              setExtensionGANSSAdditionalAssistanceChoicesToNewInstance();
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
              return "gANSSAdditionalAssistanceChoices : "
                  + getExtensionGANSSAdditionalAssistanceChoices().toIndentedString(indent);
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
    builder.append("AssistanceSupported = {\n");
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
