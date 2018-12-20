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
public  class GANSSNavModel extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GANSSNavModel
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GANSSNavModel() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GANSSNavModel;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GANSSNavModel != null) {
      return ImmutableList.of(TAG_GANSSNavModel);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GANSSNavModel from encoded stream.
   */
  public static GANSSNavModel fromPerUnaligned(byte[] encodedBytes) {
    GANSSNavModel result = new GANSSNavModel();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GANSSNavModel from encoded stream.
   */
  public static GANSSNavModel fromPerAligned(byte[] encodedBytes) {
    GANSSNavModel result = new GANSSNavModel();
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

  
  private GANSSNavModel.nonBroadcastIndFlagType nonBroadcastIndFlag_;
  public GANSSNavModel.nonBroadcastIndFlagType getNonBroadcastIndFlag() {
    return nonBroadcastIndFlag_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSNavModel.nonBroadcastIndFlagType
   */
  public void setNonBroadcastIndFlag(Asn1Object value) {
    this.nonBroadcastIndFlag_ = (GANSSNavModel.nonBroadcastIndFlagType) value;
  }
  public GANSSNavModel.nonBroadcastIndFlagType setNonBroadcastIndFlagToNewInstance() {
    nonBroadcastIndFlag_ = new GANSSNavModel.nonBroadcastIndFlagType();
    return nonBroadcastIndFlag_;
  }
  
  private SeqOfGANSSSatelliteElement ganssSatelliteList_;
  public SeqOfGANSSSatelliteElement getGanssSatelliteList() {
    return ganssSatelliteList_;
  }
  /**
   * @throws ClassCastException if value is not a SeqOfGANSSSatelliteElement
   */
  public void setGanssSatelliteList(Asn1Object value) {
    this.ganssSatelliteList_ = (SeqOfGANSSSatelliteElement) value;
  }
  public SeqOfGANSSSatelliteElement setGanssSatelliteListToNewInstance() {
    ganssSatelliteList_ = new SeqOfGANSSSatelliteElement();
    return ganssSatelliteList_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getNonBroadcastIndFlag() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getNonBroadcastIndFlag();
          }

          @Override public void setToNewInstance() {
            setNonBroadcastIndFlagToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSNavModel.nonBroadcastIndFlagType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "nonBroadcastIndFlag : "
                    + getNonBroadcastIndFlag().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getGanssSatelliteList() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssSatelliteList();
          }

          @Override public void setToNewInstance() {
            setGanssSatelliteListToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SeqOfGANSSSatelliteElement.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssSatelliteList : "
                    + getGanssSatelliteList().toIndentedString(indent);
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
public static class nonBroadcastIndFlagType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_nonBroadcastIndFlagType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public nonBroadcastIndFlagType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("1"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_nonBroadcastIndFlagType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_nonBroadcastIndFlagType != null) {
      return ImmutableList.of(TAG_nonBroadcastIndFlagType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new nonBroadcastIndFlagType from encoded stream.
   */
  public static nonBroadcastIndFlagType fromPerUnaligned(byte[] encodedBytes) {
    nonBroadcastIndFlagType result = new nonBroadcastIndFlagType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new nonBroadcastIndFlagType from encoded stream.
   */
  public static nonBroadcastIndFlagType fromPerAligned(byte[] encodedBytes) {
    nonBroadcastIndFlagType result = new nonBroadcastIndFlagType();
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
    return "nonBroadcastIndFlagType = " + getInteger() + ";\n";
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
    builder.append("GANSSNavModel = {\n");
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
