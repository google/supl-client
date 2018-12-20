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
public  class GANSSAssistanceSet extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GANSSAssistanceSet
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GANSSAssistanceSet() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GANSSAssistanceSet;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GANSSAssistanceSet != null) {
      return ImmutableList.of(TAG_GANSSAssistanceSet);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GANSSAssistanceSet from encoded stream.
   */
  public static GANSSAssistanceSet fromPerUnaligned(byte[] encodedBytes) {
    GANSSAssistanceSet result = new GANSSAssistanceSet();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GANSSAssistanceSet from encoded stream.
   */
  public static GANSSAssistanceSet fromPerAligned(byte[] encodedBytes) {
    GANSSAssistanceSet result = new GANSSAssistanceSet();
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

  
  private CommonGANSSAssistance commonGANSSAssistance_;
  public CommonGANSSAssistance getCommonGANSSAssistance() {
    return commonGANSSAssistance_;
  }
  /**
   * @throws ClassCastException if value is not a CommonGANSSAssistance
   */
  public void setCommonGANSSAssistance(Asn1Object value) {
    this.commonGANSSAssistance_ = (CommonGANSSAssistance) value;
  }
  public CommonGANSSAssistance setCommonGANSSAssistanceToNewInstance() {
    commonGANSSAssistance_ = new CommonGANSSAssistance();
    return commonGANSSAssistance_;
  }
  
  private SpecificGANSSAssistance specificGANSSAssistance_;
  public SpecificGANSSAssistance getSpecificGANSSAssistance() {
    return specificGANSSAssistance_;
  }
  /**
   * @throws ClassCastException if value is not a SpecificGANSSAssistance
   */
  public void setSpecificGANSSAssistance(Asn1Object value) {
    this.specificGANSSAssistance_ = (SpecificGANSSAssistance) value;
  }
  public SpecificGANSSAssistance setSpecificGANSSAssistanceToNewInstance() {
    specificGANSSAssistance_ = new SpecificGANSSAssistance();
    return specificGANSSAssistance_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getCommonGANSSAssistance() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCommonGANSSAssistance();
          }

          @Override public void setToNewInstance() {
            setCommonGANSSAssistanceToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? CommonGANSSAssistance.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "commonGANSSAssistance : "
                    + getCommonGANSSAssistance().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getSpecificGANSSAssistance() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getSpecificGANSSAssistance();
          }

          @Override public void setToNewInstance() {
            setSpecificGANSSAssistanceToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SpecificGANSSAssistance.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "specificGANSSAssistance : "
                    + getSpecificGANSSAssistance().toIndentedString(indent);
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
    builder.append("GANSSAssistanceSet = {\n");
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
