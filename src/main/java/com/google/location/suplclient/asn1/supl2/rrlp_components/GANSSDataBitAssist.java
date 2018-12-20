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
public  class GANSSDataBitAssist extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GANSSDataBitAssist
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GANSSDataBitAssist() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GANSSDataBitAssist;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GANSSDataBitAssist != null) {
      return ImmutableList.of(TAG_GANSSDataBitAssist);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GANSSDataBitAssist from encoded stream.
   */
  public static GANSSDataBitAssist fromPerUnaligned(byte[] encodedBytes) {
    GANSSDataBitAssist result = new GANSSDataBitAssist();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GANSSDataBitAssist from encoded stream.
   */
  public static GANSSDataBitAssist fromPerAligned(byte[] encodedBytes) {
    GANSSDataBitAssist result = new GANSSDataBitAssist();
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

  
  private GANSSDataBitAssist.ganssTODType ganssTOD_;
  public GANSSDataBitAssist.ganssTODType getGanssTOD() {
    return ganssTOD_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSDataBitAssist.ganssTODType
   */
  public void setGanssTOD(Asn1Object value) {
    this.ganssTOD_ = (GANSSDataBitAssist.ganssTODType) value;
  }
  public GANSSDataBitAssist.ganssTODType setGanssTODToNewInstance() {
    ganssTOD_ = new GANSSDataBitAssist.ganssTODType();
    return ganssTOD_;
  }
  
  private SeqOfGanssDataBitsElement ganssDataBitsSatList_;
  public SeqOfGanssDataBitsElement getGanssDataBitsSatList() {
    return ganssDataBitsSatList_;
  }
  /**
   * @throws ClassCastException if value is not a SeqOfGanssDataBitsElement
   */
  public void setGanssDataBitsSatList(Asn1Object value) {
    this.ganssDataBitsSatList_ = (SeqOfGanssDataBitsElement) value;
  }
  public SeqOfGanssDataBitsElement setGanssDataBitsSatListToNewInstance() {
    ganssDataBitsSatList_ = new SeqOfGanssDataBitsElement();
    return ganssDataBitsSatList_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getGanssTOD() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssTOD();
          }

          @Override public void setToNewInstance() {
            setGanssTODToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSDataBitAssist.ganssTODType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssTOD : "
                    + getGanssTOD().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getGanssDataBitsSatList() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssDataBitsSatList();
          }

          @Override public void setToNewInstance() {
            setGanssDataBitsSatListToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SeqOfGanssDataBitsElement.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssDataBitsSatList : "
                    + getGanssDataBitsSatList().toIndentedString(indent);
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
public static class ganssTODType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ganssTODType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ganssTODType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("59"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ganssTODType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ganssTODType != null) {
      return ImmutableList.of(TAG_ganssTODType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ganssTODType from encoded stream.
   */
  public static ganssTODType fromPerUnaligned(byte[] encodedBytes) {
    ganssTODType result = new ganssTODType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ganssTODType from encoded stream.
   */
  public static ganssTODType fromPerAligned(byte[] encodedBytes) {
    ganssTODType result = new ganssTODType();
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
    return "ganssTODType = " + getInteger() + ";\n";
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
    builder.append("GANSSDataBitAssist = {\n");
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
