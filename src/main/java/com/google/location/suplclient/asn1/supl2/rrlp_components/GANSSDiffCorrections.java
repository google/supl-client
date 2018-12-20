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
public  class GANSSDiffCorrections extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GANSSDiffCorrections
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GANSSDiffCorrections() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GANSSDiffCorrections;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GANSSDiffCorrections != null) {
      return ImmutableList.of(TAG_GANSSDiffCorrections);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GANSSDiffCorrections from encoded stream.
   */
  public static GANSSDiffCorrections fromPerUnaligned(byte[] encodedBytes) {
    GANSSDiffCorrections result = new GANSSDiffCorrections();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GANSSDiffCorrections from encoded stream.
   */
  public static GANSSDiffCorrections fromPerAligned(byte[] encodedBytes) {
    GANSSDiffCorrections result = new GANSSDiffCorrections();
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

  
  private GANSSDiffCorrections.dganssRefTimeType dganssRefTime_;
  public GANSSDiffCorrections.dganssRefTimeType getDganssRefTime() {
    return dganssRefTime_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSDiffCorrections.dganssRefTimeType
   */
  public void setDganssRefTime(Asn1Object value) {
    this.dganssRefTime_ = (GANSSDiffCorrections.dganssRefTimeType) value;
  }
  public GANSSDiffCorrections.dganssRefTimeType setDganssRefTimeToNewInstance() {
    dganssRefTime_ = new GANSSDiffCorrections.dganssRefTimeType();
    return dganssRefTime_;
  }
  
  private SeqOfSgnTypeElement sgnTypeList_;
  public SeqOfSgnTypeElement getSgnTypeList() {
    return sgnTypeList_;
  }
  /**
   * @throws ClassCastException if value is not a SeqOfSgnTypeElement
   */
  public void setSgnTypeList(Asn1Object value) {
    this.sgnTypeList_ = (SeqOfSgnTypeElement) value;
  }
  public SeqOfSgnTypeElement setSgnTypeListToNewInstance() {
    sgnTypeList_ = new SeqOfSgnTypeElement();
    return sgnTypeList_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getDganssRefTime() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getDganssRefTime();
          }

          @Override public void setToNewInstance() {
            setDganssRefTimeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSDiffCorrections.dganssRefTimeType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "dganssRefTime : "
                    + getDganssRefTime().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getSgnTypeList() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getSgnTypeList();
          }

          @Override public void setToNewInstance() {
            setSgnTypeListToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SeqOfSgnTypeElement.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "sgnTypeList : "
                    + getSgnTypeList().toIndentedString(indent);
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
public static class dganssRefTimeType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_dganssRefTimeType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public dganssRefTimeType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("119"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_dganssRefTimeType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_dganssRefTimeType != null) {
      return ImmutableList.of(TAG_dganssRefTimeType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new dganssRefTimeType from encoded stream.
   */
  public static dganssRefTimeType fromPerUnaligned(byte[] encodedBytes) {
    dganssRefTimeType result = new dganssRefTimeType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new dganssRefTimeType from encoded stream.
   */
  public static dganssRefTimeType fromPerAligned(byte[] encodedBytes) {
    dganssRefTimeType result = new dganssRefTimeType();
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
    return "dganssRefTimeType = " + getInteger() + ";\n";
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
    builder.append("GANSSDiffCorrections = {\n");
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
