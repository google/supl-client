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

package com.google.location.suplclient.asn1.supl2.ver2_ulp_components;

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
public  class UTRAN_GANSSReferenceTimeResult extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_UTRAN_GANSSReferenceTimeResult
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public UTRAN_GANSSReferenceTimeResult() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_UTRAN_GANSSReferenceTimeResult;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_UTRAN_GANSSReferenceTimeResult != null) {
      return ImmutableList.of(TAG_UTRAN_GANSSReferenceTimeResult);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new UTRAN_GANSSReferenceTimeResult from encoded stream.
   */
  public static UTRAN_GANSSReferenceTimeResult fromPerUnaligned(byte[] encodedBytes) {
    UTRAN_GANSSReferenceTimeResult result = new UTRAN_GANSSReferenceTimeResult();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new UTRAN_GANSSReferenceTimeResult from encoded stream.
   */
  public static UTRAN_GANSSReferenceTimeResult fromPerAligned(byte[] encodedBytes) {
    UTRAN_GANSSReferenceTimeResult result = new UTRAN_GANSSReferenceTimeResult();
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

  
  private UTRAN_GANSSReferenceTimeResult.ganssTimeIDType ganssTimeID_;
  public UTRAN_GANSSReferenceTimeResult.ganssTimeIDType getGanssTimeID() {
    return ganssTimeID_;
  }
  /**
   * @throws ClassCastException if value is not a UTRAN_GANSSReferenceTimeResult.ganssTimeIDType
   */
  public void setGanssTimeID(Asn1Object value) {
    this.ganssTimeID_ = (UTRAN_GANSSReferenceTimeResult.ganssTimeIDType) value;
  }
  public UTRAN_GANSSReferenceTimeResult.ganssTimeIDType setGanssTimeIDToNewInstance() {
    ganssTimeID_ = new UTRAN_GANSSReferenceTimeResult.ganssTimeIDType();
    return ganssTimeID_;
  }
  
  private SET_GANSSReferenceTime set_GANSSReferenceTime_;
  public SET_GANSSReferenceTime getSet_GANSSReferenceTime() {
    return set_GANSSReferenceTime_;
  }
  /**
   * @throws ClassCastException if value is not a SET_GANSSReferenceTime
   */
  public void setSet_GANSSReferenceTime(Asn1Object value) {
    this.set_GANSSReferenceTime_ = (SET_GANSSReferenceTime) value;
  }
  public SET_GANSSReferenceTime setSet_GANSSReferenceTimeToNewInstance() {
    set_GANSSReferenceTime_ = new SET_GANSSReferenceTime();
    return set_GANSSReferenceTime_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getGanssTimeID() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssTimeID();
          }

          @Override public void setToNewInstance() {
            setGanssTimeIDToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UTRAN_GANSSReferenceTimeResult.ganssTimeIDType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssTimeID : "
                    + getGanssTimeID().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getSet_GANSSReferenceTime() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getSet_GANSSReferenceTime();
          }

          @Override public void setToNewInstance() {
            setSet_GANSSReferenceTimeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SET_GANSSReferenceTime.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "set_GANSSReferenceTime : "
                    + getSet_GANSSReferenceTime().toIndentedString(indent);
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
public static class ganssTimeIDType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ganssTimeIDType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ganssTimeIDType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("15"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ganssTimeIDType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ganssTimeIDType != null) {
      return ImmutableList.of(TAG_ganssTimeIDType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ganssTimeIDType from encoded stream.
   */
  public static ganssTimeIDType fromPerUnaligned(byte[] encodedBytes) {
    ganssTimeIDType result = new ganssTimeIDType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ganssTimeIDType from encoded stream.
   */
  public static ganssTimeIDType fromPerAligned(byte[] encodedBytes) {
    ganssTimeIDType result = new ganssTimeIDType();
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
    return "ganssTimeIDType = " + getInteger() + ";\n";
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
    builder.append("UTRAN_GANSSReferenceTimeResult = {\n");
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
