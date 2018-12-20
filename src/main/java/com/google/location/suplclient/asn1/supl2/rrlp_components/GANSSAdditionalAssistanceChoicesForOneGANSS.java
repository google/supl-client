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
import com.google.location.suplclient.asn1.base.Asn1Integer;
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
public  class GANSSAdditionalAssistanceChoicesForOneGANSS extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GANSSAdditionalAssistanceChoicesForOneGANSS
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GANSSAdditionalAssistanceChoicesForOneGANSS() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GANSSAdditionalAssistanceChoicesForOneGANSS;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GANSSAdditionalAssistanceChoicesForOneGANSS != null) {
      return ImmutableList.of(TAG_GANSSAdditionalAssistanceChoicesForOneGANSS);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GANSSAdditionalAssistanceChoicesForOneGANSS from encoded stream.
   */
  public static GANSSAdditionalAssistanceChoicesForOneGANSS fromPerUnaligned(byte[] encodedBytes) {
    GANSSAdditionalAssistanceChoicesForOneGANSS result = new GANSSAdditionalAssistanceChoicesForOneGANSS();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GANSSAdditionalAssistanceChoicesForOneGANSS from encoded stream.
   */
  public static GANSSAdditionalAssistanceChoicesForOneGANSS fromPerAligned(byte[] encodedBytes) {
    GANSSAdditionalAssistanceChoicesForOneGANSS result = new GANSSAdditionalAssistanceChoicesForOneGANSS();
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

  
  private GANSSAdditionalAssistanceChoicesForOneGANSS.ganssIDType ganssID_;
  public GANSSAdditionalAssistanceChoicesForOneGANSS.ganssIDType getGanssID() {
    return ganssID_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSAdditionalAssistanceChoicesForOneGANSS.ganssIDType
   */
  public void setGanssID(Asn1Object value) {
    this.ganssID_ = (GANSSAdditionalAssistanceChoicesForOneGANSS.ganssIDType) value;
  }
  public GANSSAdditionalAssistanceChoicesForOneGANSS.ganssIDType setGanssIDToNewInstance() {
    ganssID_ = new GANSSAdditionalAssistanceChoicesForOneGANSS.ganssIDType();
    return ganssID_;
  }
  
  private GANSSModelID ganssClockModelChoice_;
  public GANSSModelID getGanssClockModelChoice() {
    return ganssClockModelChoice_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSModelID
   */
  public void setGanssClockModelChoice(Asn1Object value) {
    this.ganssClockModelChoice_ = (GANSSModelID) value;
  }
  public GANSSModelID setGanssClockModelChoiceToNewInstance() {
    ganssClockModelChoice_ = new GANSSModelID();
    return ganssClockModelChoice_;
  }
  
  private GANSSModelID gannsOrbitModelChoice_;
  public GANSSModelID getGannsOrbitModelChoice() {
    return gannsOrbitModelChoice_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSModelID
   */
  public void setGannsOrbitModelChoice(Asn1Object value) {
    this.gannsOrbitModelChoice_ = (GANSSModelID) value;
  }
  public GANSSModelID setGannsOrbitModelChoiceToNewInstance() {
    gannsOrbitModelChoice_ = new GANSSModelID();
    return gannsOrbitModelChoice_;
  }
  
  private GANSSModelID ganssAlmanacModelChoice_;
  public GANSSModelID getGanssAlmanacModelChoice() {
    return ganssAlmanacModelChoice_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSModelID
   */
  public void setGanssAlmanacModelChoice(Asn1Object value) {
    this.ganssAlmanacModelChoice_ = (GANSSModelID) value;
  }
  public GANSSModelID setGanssAlmanacModelChoiceToNewInstance() {
    ganssAlmanacModelChoice_ = new GANSSModelID();
    return ganssAlmanacModelChoice_;
  }
  
  private GANSSModelID ganssAdditionalUTCModelChoice_;
  public GANSSModelID getGanssAdditionalUTCModelChoice() {
    return ganssAdditionalUTCModelChoice_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSModelID
   */
  public void setGanssAdditionalUTCModelChoice(Asn1Object value) {
    this.ganssAdditionalUTCModelChoice_ = (GANSSModelID) value;
  }
  public GANSSModelID setGanssAdditionalUTCModelChoiceToNewInstance() {
    ganssAdditionalUTCModelChoice_ = new GANSSModelID();
    return ganssAdditionalUTCModelChoice_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getGanssID() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssID();
          }

          @Override public void setToNewInstance() {
            setGanssIDToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSAdditionalAssistanceChoicesForOneGANSS.ganssIDType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssID : "
                    + getGanssID().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getGanssClockModelChoice() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssClockModelChoice();
          }

          @Override public void setToNewInstance() {
            setGanssClockModelChoiceToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSModelID.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssClockModelChoice : "
                    + getGanssClockModelChoice().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getGannsOrbitModelChoice() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGannsOrbitModelChoice();
          }

          @Override public void setToNewInstance() {
            setGannsOrbitModelChoiceToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSModelID.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gannsOrbitModelChoice : "
                    + getGannsOrbitModelChoice().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getGanssAlmanacModelChoice() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssAlmanacModelChoice();
          }

          @Override public void setToNewInstance() {
            setGanssAlmanacModelChoiceToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSModelID.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssAlmanacModelChoice : "
                    + getGanssAlmanacModelChoice().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getGanssAdditionalUTCModelChoice() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssAdditionalUTCModelChoice();
          }

          @Override public void setToNewInstance() {
            setGanssAdditionalUTCModelChoiceToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSModelID.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssAdditionalUTCModelChoice : "
                    + getGanssAdditionalUTCModelChoice().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      return builder.build();
    }

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class ganssIDType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ganssIDType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ganssIDType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("7"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ganssIDType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ganssIDType != null) {
      return ImmutableList.of(TAG_ganssIDType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ganssIDType from encoded stream.
   */
  public static ganssIDType fromPerUnaligned(byte[] encodedBytes) {
    ganssIDType result = new ganssIDType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ganssIDType from encoded stream.
   */
  public static ganssIDType fromPerAligned(byte[] encodedBytes) {
    ganssIDType result = new ganssIDType();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
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
    return "ganssIDType = " + getInteger() + ";\n";
  }
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
    builder.append("GANSSAdditionalAssistanceChoicesForOneGANSS = {\n");
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
