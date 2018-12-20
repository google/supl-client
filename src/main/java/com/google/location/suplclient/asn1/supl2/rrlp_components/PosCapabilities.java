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
public  class PosCapabilities extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_PosCapabilities
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public PosCapabilities() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_PosCapabilities;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_PosCapabilities != null) {
      return ImmutableList.of(TAG_PosCapabilities);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new PosCapabilities from encoded stream.
   */
  public static PosCapabilities fromPerUnaligned(byte[] encodedBytes) {
    PosCapabilities result = new PosCapabilities();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new PosCapabilities from encoded stream.
   */
  public static PosCapabilities fromPerAligned(byte[] encodedBytes) {
    PosCapabilities result = new PosCapabilities();
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

  
  private NonGANSSPositionMethods nonGANSSpositionMethods_;
  public NonGANSSPositionMethods getNonGANSSpositionMethods() {
    return nonGANSSpositionMethods_;
  }
  /**
   * @throws ClassCastException if value is not a NonGANSSPositionMethods
   */
  public void setNonGANSSpositionMethods(Asn1Object value) {
    this.nonGANSSpositionMethods_ = (NonGANSSPositionMethods) value;
  }
  public NonGANSSPositionMethods setNonGANSSpositionMethodsToNewInstance() {
    nonGANSSpositionMethods_ = new NonGANSSPositionMethods();
    return nonGANSSpositionMethods_;
  }
  
  private GANSSPositionMethods gANSSPositionMethods_;
  public GANSSPositionMethods getGANSSPositionMethods() {
    return gANSSPositionMethods_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSPositionMethods
   */
  public void setGANSSPositionMethods(Asn1Object value) {
    this.gANSSPositionMethods_ = (GANSSPositionMethods) value;
  }
  public GANSSPositionMethods setGANSSPositionMethodsToNewInstance() {
    gANSSPositionMethods_ = new GANSSPositionMethods();
    return gANSSPositionMethods_;
  }
  
  private MultipleMeasurementSets multipleMeasurementSets_;
  public MultipleMeasurementSets getMultipleMeasurementSets() {
    return multipleMeasurementSets_;
  }
  /**
   * @throws ClassCastException if value is not a MultipleMeasurementSets
   */
  public void setMultipleMeasurementSets(Asn1Object value) {
    this.multipleMeasurementSets_ = (MultipleMeasurementSets) value;
  }
  public MultipleMeasurementSets setMultipleMeasurementSetsToNewInstance() {
    multipleMeasurementSets_ = new MultipleMeasurementSets();
    return multipleMeasurementSets_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getNonGANSSpositionMethods() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getNonGANSSpositionMethods();
          }

          @Override public void setToNewInstance() {
            setNonGANSSpositionMethodsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NonGANSSPositionMethods.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "nonGANSSpositionMethods : "
                    + getNonGANSSpositionMethods().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getGANSSPositionMethods() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGANSSPositionMethods();
          }

          @Override public void setToNewInstance() {
            setGANSSPositionMethodsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSPositionMethods.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gANSSPositionMethods : "
                    + getGANSSPositionMethods().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getMultipleMeasurementSets() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getMultipleMeasurementSets();
          }

          @Override public void setToNewInstance() {
            setMultipleMeasurementSetsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? MultipleMeasurementSets.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "multipleMeasurementSets : "
                    + getMultipleMeasurementSets().toIndentedString(indent);
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
    builder.append("PosCapabilities = {\n");
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
