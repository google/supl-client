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
public  class GANSS_SgnTypeElement extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GANSS_SgnTypeElement
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GANSS_SgnTypeElement() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GANSS_SgnTypeElement;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GANSS_SgnTypeElement != null) {
      return ImmutableList.of(TAG_GANSS_SgnTypeElement);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GANSS_SgnTypeElement from encoded stream.
   */
  public static GANSS_SgnTypeElement fromPerUnaligned(byte[] encodedBytes) {
    GANSS_SgnTypeElement result = new GANSS_SgnTypeElement();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GANSS_SgnTypeElement from encoded stream.
   */
  public static GANSS_SgnTypeElement fromPerAligned(byte[] encodedBytes) {
    GANSS_SgnTypeElement result = new GANSS_SgnTypeElement();
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

  
  private GANSSSignalID ganssSignalID_;
  public GANSSSignalID getGanssSignalID() {
    return ganssSignalID_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSSignalID
   */
  public void setGanssSignalID(Asn1Object value) {
    this.ganssSignalID_ = (GANSSSignalID) value;
  }
  public GANSSSignalID setGanssSignalIDToNewInstance() {
    ganssSignalID_ = new GANSSSignalID();
    return ganssSignalID_;
  }
  
  private GANSS_SgnTypeElement.ganssCodePhaseAmbiguityType ganssCodePhaseAmbiguity_;
  public GANSS_SgnTypeElement.ganssCodePhaseAmbiguityType getGanssCodePhaseAmbiguity() {
    return ganssCodePhaseAmbiguity_;
  }
  /**
   * @throws ClassCastException if value is not a GANSS_SgnTypeElement.ganssCodePhaseAmbiguityType
   */
  public void setGanssCodePhaseAmbiguity(Asn1Object value) {
    this.ganssCodePhaseAmbiguity_ = (GANSS_SgnTypeElement.ganssCodePhaseAmbiguityType) value;
  }
  public GANSS_SgnTypeElement.ganssCodePhaseAmbiguityType setGanssCodePhaseAmbiguityToNewInstance() {
    ganssCodePhaseAmbiguity_ = new GANSS_SgnTypeElement.ganssCodePhaseAmbiguityType();
    return ganssCodePhaseAmbiguity_;
  }
  
  private SeqOfGANSS_SgnElement ganss_SgnList_;
  public SeqOfGANSS_SgnElement getGanss_SgnList() {
    return ganss_SgnList_;
  }
  /**
   * @throws ClassCastException if value is not a SeqOfGANSS_SgnElement
   */
  public void setGanss_SgnList(Asn1Object value) {
    this.ganss_SgnList_ = (SeqOfGANSS_SgnElement) value;
  }
  public SeqOfGANSS_SgnElement setGanss_SgnListToNewInstance() {
    ganss_SgnList_ = new SeqOfGANSS_SgnElement();
    return ganss_SgnList_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getGanssSignalID() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssSignalID();
          }

          @Override public void setToNewInstance() {
            setGanssSignalIDToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSSignalID.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssSignalID : "
                    + getGanssSignalID().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getGanssCodePhaseAmbiguity() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssCodePhaseAmbiguity();
          }

          @Override public void setToNewInstance() {
            setGanssCodePhaseAmbiguityToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSS_SgnTypeElement.ganssCodePhaseAmbiguityType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssCodePhaseAmbiguity : "
                    + getGanssCodePhaseAmbiguity().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getGanss_SgnList() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanss_SgnList();
          }

          @Override public void setToNewInstance() {
            setGanss_SgnListToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SeqOfGANSS_SgnElement.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganss_SgnList : "
                    + getGanss_SgnList().toIndentedString(indent);
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
public static class ganssCodePhaseAmbiguityType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ganssCodePhaseAmbiguityType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ganssCodePhaseAmbiguityType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("127"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ganssCodePhaseAmbiguityType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ganssCodePhaseAmbiguityType != null) {
      return ImmutableList.of(TAG_ganssCodePhaseAmbiguityType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ganssCodePhaseAmbiguityType from encoded stream.
   */
  public static ganssCodePhaseAmbiguityType fromPerUnaligned(byte[] encodedBytes) {
    ganssCodePhaseAmbiguityType result = new ganssCodePhaseAmbiguityType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ganssCodePhaseAmbiguityType from encoded stream.
   */
  public static ganssCodePhaseAmbiguityType fromPerAligned(byte[] encodedBytes) {
    ganssCodePhaseAmbiguityType result = new ganssCodePhaseAmbiguityType();
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
    return "ganssCodePhaseAmbiguityType = " + getInteger() + ";\n";
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
    builder.append("GANSS_SgnTypeElement = {\n");
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
