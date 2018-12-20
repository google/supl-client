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
public  class DGANSSExtensionSgnTypeElement extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_DGANSSExtensionSgnTypeElement
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public DGANSSExtensionSgnTypeElement() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_DGANSSExtensionSgnTypeElement;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_DGANSSExtensionSgnTypeElement != null) {
      return ImmutableList.of(TAG_DGANSSExtensionSgnTypeElement);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new DGANSSExtensionSgnTypeElement from encoded stream.
   */
  public static DGANSSExtensionSgnTypeElement fromPerUnaligned(byte[] encodedBytes) {
    DGANSSExtensionSgnTypeElement result = new DGANSSExtensionSgnTypeElement();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new DGANSSExtensionSgnTypeElement from encoded stream.
   */
  public static DGANSSExtensionSgnTypeElement fromPerAligned(byte[] encodedBytes) {
    DGANSSExtensionSgnTypeElement result = new DGANSSExtensionSgnTypeElement();
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
  
  private SeqOfDGANSSExtensionSgnElement dganssExtensionSgnList_;
  public SeqOfDGANSSExtensionSgnElement getDganssExtensionSgnList() {
    return dganssExtensionSgnList_;
  }
  /**
   * @throws ClassCastException if value is not a SeqOfDGANSSExtensionSgnElement
   */
  public void setDganssExtensionSgnList(Asn1Object value) {
    this.dganssExtensionSgnList_ = (SeqOfDGANSSExtensionSgnElement) value;
  }
  public SeqOfDGANSSExtensionSgnElement setDganssExtensionSgnListToNewInstance() {
    dganssExtensionSgnList_ = new SeqOfDGANSSExtensionSgnElement();
    return dganssExtensionSgnList_;
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
            return getDganssExtensionSgnList() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getDganssExtensionSgnList();
          }

          @Override public void setToNewInstance() {
            setDganssExtensionSgnListToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SeqOfDGANSSExtensionSgnElement.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "dganssExtensionSgnList : "
                    + getDganssExtensionSgnList().toIndentedString(indent);
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
    builder.append("DGANSSExtensionSgnTypeElement = {\n");
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
