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
public  class GANSSEphemerisExtension extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GANSSEphemerisExtension
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GANSSEphemerisExtension() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GANSSEphemerisExtension;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GANSSEphemerisExtension != null) {
      return ImmutableList.of(TAG_GANSSEphemerisExtension);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GANSSEphemerisExtension from encoded stream.
   */
  public static GANSSEphemerisExtension fromPerUnaligned(byte[] encodedBytes) {
    GANSSEphemerisExtension result = new GANSSEphemerisExtension();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GANSSEphemerisExtension from encoded stream.
   */
  public static GANSSEphemerisExtension fromPerAligned(byte[] encodedBytes) {
    GANSSEphemerisExtension result = new GANSSEphemerisExtension();
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

  
  private GANSSEphemerisExtensionHeader ganssEphemerisHeader_;
  public GANSSEphemerisExtensionHeader getGanssEphemerisHeader() {
    return ganssEphemerisHeader_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSEphemerisExtensionHeader
   */
  public void setGanssEphemerisHeader(Asn1Object value) {
    this.ganssEphemerisHeader_ = (GANSSEphemerisExtensionHeader) value;
  }
  public GANSSEphemerisExtensionHeader setGanssEphemerisHeaderToNewInstance() {
    ganssEphemerisHeader_ = new GANSSEphemerisExtensionHeader();
    return ganssEphemerisHeader_;
  }
  
  private SeqOfGANSSRefOrbit ganssReferenceSet_;
  public SeqOfGANSSRefOrbit getGanssReferenceSet() {
    return ganssReferenceSet_;
  }
  /**
   * @throws ClassCastException if value is not a SeqOfGANSSRefOrbit
   */
  public void setGanssReferenceSet(Asn1Object value) {
    this.ganssReferenceSet_ = (SeqOfGANSSRefOrbit) value;
  }
  public SeqOfGANSSRefOrbit setGanssReferenceSetToNewInstance() {
    ganssReferenceSet_ = new SeqOfGANSSRefOrbit();
    return ganssReferenceSet_;
  }
  
  private GANSSEphemerisDeltaMatrix ganssephemerisDeltasMatrix_;
  public GANSSEphemerisDeltaMatrix getGanssephemerisDeltasMatrix() {
    return ganssephemerisDeltasMatrix_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSEphemerisDeltaMatrix
   */
  public void setGanssephemerisDeltasMatrix(Asn1Object value) {
    this.ganssephemerisDeltasMatrix_ = (GANSSEphemerisDeltaMatrix) value;
  }
  public GANSSEphemerisDeltaMatrix setGanssephemerisDeltasMatrixToNewInstance() {
    ganssephemerisDeltasMatrix_ = new GANSSEphemerisDeltaMatrix();
    return ganssephemerisDeltasMatrix_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getGanssEphemerisHeader() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssEphemerisHeader();
          }

          @Override public void setToNewInstance() {
            setGanssEphemerisHeaderToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSEphemerisExtensionHeader.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssEphemerisHeader : "
                    + getGanssEphemerisHeader().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getGanssReferenceSet() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssReferenceSet();
          }

          @Override public void setToNewInstance() {
            setGanssReferenceSetToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SeqOfGANSSRefOrbit.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssReferenceSet : "
                    + getGanssReferenceSet().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getGanssephemerisDeltasMatrix() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssephemerisDeltasMatrix();
          }

          @Override public void setToNewInstance() {
            setGanssephemerisDeltasMatrixToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSEphemerisDeltaMatrix.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssephemerisDeltasMatrix : "
                    + getGanssephemerisDeltasMatrix().toIndentedString(indent);
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
    builder.append("GANSSEphemerisExtension = {\n");
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
