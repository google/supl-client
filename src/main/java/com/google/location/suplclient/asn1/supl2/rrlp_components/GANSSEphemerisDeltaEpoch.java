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
public  class GANSSEphemerisDeltaEpoch extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GANSSEphemerisDeltaEpoch
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GANSSEphemerisDeltaEpoch() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GANSSEphemerisDeltaEpoch;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GANSSEphemerisDeltaEpoch != null) {
      return ImmutableList.of(TAG_GANSSEphemerisDeltaEpoch);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GANSSEphemerisDeltaEpoch from encoded stream.
   */
  public static GANSSEphemerisDeltaEpoch fromPerUnaligned(byte[] encodedBytes) {
    GANSSEphemerisDeltaEpoch result = new GANSSEphemerisDeltaEpoch();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GANSSEphemerisDeltaEpoch from encoded stream.
   */
  public static GANSSEphemerisDeltaEpoch fromPerAligned(byte[] encodedBytes) {
    GANSSEphemerisDeltaEpoch result = new GANSSEphemerisDeltaEpoch();
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

  
  private GANSSDeltaEpochHeader ganssDeltaEpochHeader_;
  public GANSSDeltaEpochHeader getGanssDeltaEpochHeader() {
    return ganssDeltaEpochHeader_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSDeltaEpochHeader
   */
  public void setGanssDeltaEpochHeader(Asn1Object value) {
    this.ganssDeltaEpochHeader_ = (GANSSDeltaEpochHeader) value;
  }
  public GANSSDeltaEpochHeader setGanssDeltaEpochHeaderToNewInstance() {
    ganssDeltaEpochHeader_ = new GANSSDeltaEpochHeader();
    return ganssDeltaEpochHeader_;
  }
  
  private GANSSDeltaElementList ganssDeltaElementList_;
  public GANSSDeltaElementList getGanssDeltaElementList() {
    return ganssDeltaElementList_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSDeltaElementList
   */
  public void setGanssDeltaElementList(Asn1Object value) {
    this.ganssDeltaElementList_ = (GANSSDeltaElementList) value;
  }
  public GANSSDeltaElementList setGanssDeltaElementListToNewInstance() {
    ganssDeltaElementList_ = new GANSSDeltaElementList();
    return ganssDeltaElementList_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getGanssDeltaEpochHeader() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssDeltaEpochHeader();
          }

          @Override public void setToNewInstance() {
            setGanssDeltaEpochHeaderToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSDeltaEpochHeader.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssDeltaEpochHeader : "
                    + getGanssDeltaEpochHeader().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getGanssDeltaElementList() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssDeltaElementList();
          }

          @Override public void setToNewInstance() {
            setGanssDeltaElementListToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSDeltaElementList.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssDeltaElementList : "
                    + getGanssDeltaElementList().toIndentedString(indent);
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
    builder.append("GANSSEphemerisDeltaEpoch = {\n");
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
