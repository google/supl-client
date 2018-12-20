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
public  class SgnTypeElement extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_SgnTypeElement
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public SgnTypeElement() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_SgnTypeElement;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_SgnTypeElement != null) {
      return ImmutableList.of(TAG_SgnTypeElement);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new SgnTypeElement from encoded stream.
   */
  public static SgnTypeElement fromPerUnaligned(byte[] encodedBytes) {
    SgnTypeElement result = new SgnTypeElement();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new SgnTypeElement from encoded stream.
   */
  public static SgnTypeElement fromPerAligned(byte[] encodedBytes) {
    SgnTypeElement result = new SgnTypeElement();
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
  
  private SgnTypeElement.ganssStatusHealthType ganssStatusHealth_;
  public SgnTypeElement.ganssStatusHealthType getGanssStatusHealth() {
    return ganssStatusHealth_;
  }
  /**
   * @throws ClassCastException if value is not a SgnTypeElement.ganssStatusHealthType
   */
  public void setGanssStatusHealth(Asn1Object value) {
    this.ganssStatusHealth_ = (SgnTypeElement.ganssStatusHealthType) value;
  }
  public SgnTypeElement.ganssStatusHealthType setGanssStatusHealthToNewInstance() {
    ganssStatusHealth_ = new SgnTypeElement.ganssStatusHealthType();
    return ganssStatusHealth_;
  }
  
  private SeqOfDGANSSSgnElement dganssSgnList_;
  public SeqOfDGANSSSgnElement getDganssSgnList() {
    return dganssSgnList_;
  }
  /**
   * @throws ClassCastException if value is not a SeqOfDGANSSSgnElement
   */
  public void setDganssSgnList(Asn1Object value) {
    this.dganssSgnList_ = (SeqOfDGANSSSgnElement) value;
  }
  public SeqOfDGANSSSgnElement setDganssSgnListToNewInstance() {
    dganssSgnList_ = new SeqOfDGANSSSgnElement();
    return dganssSgnList_;
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
            return getGanssStatusHealth() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssStatusHealth();
          }

          @Override public void setToNewInstance() {
            setGanssStatusHealthToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SgnTypeElement.ganssStatusHealthType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssStatusHealth : "
                    + getGanssStatusHealth().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getDganssSgnList() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getDganssSgnList();
          }

          @Override public void setToNewInstance() {
            setDganssSgnListToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SeqOfDGANSSSgnElement.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "dganssSgnList : "
                    + getDganssSgnList().toIndentedString(indent);
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
public static class ganssStatusHealthType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ganssStatusHealthType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ganssStatusHealthType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("7"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ganssStatusHealthType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ganssStatusHealthType != null) {
      return ImmutableList.of(TAG_ganssStatusHealthType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ganssStatusHealthType from encoded stream.
   */
  public static ganssStatusHealthType fromPerUnaligned(byte[] encodedBytes) {
    ganssStatusHealthType result = new ganssStatusHealthType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ganssStatusHealthType from encoded stream.
   */
  public static ganssStatusHealthType fromPerAligned(byte[] encodedBytes) {
    ganssStatusHealthType result = new ganssStatusHealthType();
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
    return "ganssStatusHealthType = " + getInteger() + ";\n";
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
    builder.append("SgnTypeElement = {\n");
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
