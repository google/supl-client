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
public  class GANSSIonosphereModelV12 extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GANSSIonosphereModelV12
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GANSSIonosphereModelV12() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GANSSIonosphereModelV12;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GANSSIonosphereModelV12 != null) {
      return ImmutableList.of(TAG_GANSSIonosphereModelV12);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GANSSIonosphereModelV12 from encoded stream.
   */
  public static GANSSIonosphereModelV12 fromPerUnaligned(byte[] encodedBytes) {
    GANSSIonosphereModelV12 result = new GANSSIonosphereModelV12();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GANSSIonosphereModelV12 from encoded stream.
   */
  public static GANSSIonosphereModelV12 fromPerAligned(byte[] encodedBytes) {
    GANSSIonosphereModelV12 result = new GANSSIonosphereModelV12();
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

  
  private GANSSIonosphereModelV12.ai0Type ai0_;
  public GANSSIonosphereModelV12.ai0Type getAi0() {
    return ai0_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSIonosphereModelV12.ai0Type
   */
  public void setAi0(Asn1Object value) {
    this.ai0_ = (GANSSIonosphereModelV12.ai0Type) value;
  }
  public GANSSIonosphereModelV12.ai0Type setAi0ToNewInstance() {
    ai0_ = new GANSSIonosphereModelV12.ai0Type();
    return ai0_;
  }
  
  private GANSSIonosphereModelV12.ai1Type ai1_;
  public GANSSIonosphereModelV12.ai1Type getAi1() {
    return ai1_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSIonosphereModelV12.ai1Type
   */
  public void setAi1(Asn1Object value) {
    this.ai1_ = (GANSSIonosphereModelV12.ai1Type) value;
  }
  public GANSSIonosphereModelV12.ai1Type setAi1ToNewInstance() {
    ai1_ = new GANSSIonosphereModelV12.ai1Type();
    return ai1_;
  }
  
  private GANSSIonosphereModelV12.ai2Type ai2_;
  public GANSSIonosphereModelV12.ai2Type getAi2() {
    return ai2_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSIonosphereModelV12.ai2Type
   */
  public void setAi2(Asn1Object value) {
    this.ai2_ = (GANSSIonosphereModelV12.ai2Type) value;
  }
  public GANSSIonosphereModelV12.ai2Type setAi2ToNewInstance() {
    ai2_ = new GANSSIonosphereModelV12.ai2Type();
    return ai2_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getAi0() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getAi0();
          }

          @Override public void setToNewInstance() {
            setAi0ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSIonosphereModelV12.ai0Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ai0 : "
                    + getAi0().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getAi1() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getAi1();
          }

          @Override public void setToNewInstance() {
            setAi1ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSIonosphereModelV12.ai1Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ai1 : "
                    + getAi1().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getAi2() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getAi2();
          }

          @Override public void setToNewInstance() {
            setAi2ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSIonosphereModelV12.ai2Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ai2 : "
                    + getAi2().toIndentedString(indent);
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
public static class ai0Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ai0Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ai0Type() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("2047"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ai0Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ai0Type != null) {
      return ImmutableList.of(TAG_ai0Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ai0Type from encoded stream.
   */
  public static ai0Type fromPerUnaligned(byte[] encodedBytes) {
    ai0Type result = new ai0Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ai0Type from encoded stream.
   */
  public static ai0Type fromPerAligned(byte[] encodedBytes) {
    ai0Type result = new ai0Type();
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
    return "ai0Type = " + getInteger() + ";\n";
  }
}

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class ai1Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ai1Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ai1Type() {
    super();
    setValueRange(new java.math.BigInteger("-1024"), new java.math.BigInteger("1023"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ai1Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ai1Type != null) {
      return ImmutableList.of(TAG_ai1Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ai1Type from encoded stream.
   */
  public static ai1Type fromPerUnaligned(byte[] encodedBytes) {
    ai1Type result = new ai1Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ai1Type from encoded stream.
   */
  public static ai1Type fromPerAligned(byte[] encodedBytes) {
    ai1Type result = new ai1Type();
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
    return "ai1Type = " + getInteger() + ";\n";
  }
}

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class ai2Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ai2Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ai2Type() {
    super();
    setValueRange(new java.math.BigInteger("-8192"), new java.math.BigInteger("8191"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ai2Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ai2Type != null) {
      return ImmutableList.of(TAG_ai2Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ai2Type from encoded stream.
   */
  public static ai2Type fromPerUnaligned(byte[] encodedBytes) {
    ai2Type result = new ai2Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ai2Type from encoded stream.
   */
  public static ai2Type fromPerAligned(byte[] encodedBytes) {
    ai2Type result = new ai2Type();
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
    return "ai2Type = " + getInteger() + ";\n";
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
    builder.append("GANSSIonosphereModelV12 = {\n");
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
