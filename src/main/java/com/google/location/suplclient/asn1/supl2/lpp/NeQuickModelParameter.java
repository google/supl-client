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

package com.google.location.suplclient.asn1.supl2.lpp;

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
public  class NeQuickModelParameter extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_NeQuickModelParameter
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public NeQuickModelParameter() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_NeQuickModelParameter;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_NeQuickModelParameter != null) {
      return ImmutableList.of(TAG_NeQuickModelParameter);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new NeQuickModelParameter from encoded stream.
   */
  public static NeQuickModelParameter fromPerUnaligned(byte[] encodedBytes) {
    NeQuickModelParameter result = new NeQuickModelParameter();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new NeQuickModelParameter from encoded stream.
   */
  public static NeQuickModelParameter fromPerAligned(byte[] encodedBytes) {
    NeQuickModelParameter result = new NeQuickModelParameter();
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

  
  private NeQuickModelParameter.ai0Type ai0_;
  public NeQuickModelParameter.ai0Type getAi0() {
    return ai0_;
  }
  /**
   * @throws ClassCastException if value is not a NeQuickModelParameter.ai0Type
   */
  public void setAi0(Asn1Object value) {
    this.ai0_ = (NeQuickModelParameter.ai0Type) value;
  }
  public NeQuickModelParameter.ai0Type setAi0ToNewInstance() {
    ai0_ = new NeQuickModelParameter.ai0Type();
    return ai0_;
  }
  
  private NeQuickModelParameter.ai1Type ai1_;
  public NeQuickModelParameter.ai1Type getAi1() {
    return ai1_;
  }
  /**
   * @throws ClassCastException if value is not a NeQuickModelParameter.ai1Type
   */
  public void setAi1(Asn1Object value) {
    this.ai1_ = (NeQuickModelParameter.ai1Type) value;
  }
  public NeQuickModelParameter.ai1Type setAi1ToNewInstance() {
    ai1_ = new NeQuickModelParameter.ai1Type();
    return ai1_;
  }
  
  private NeQuickModelParameter.ai2Type ai2_;
  public NeQuickModelParameter.ai2Type getAi2() {
    return ai2_;
  }
  /**
   * @throws ClassCastException if value is not a NeQuickModelParameter.ai2Type
   */
  public void setAi2(Asn1Object value) {
    this.ai2_ = (NeQuickModelParameter.ai2Type) value;
  }
  public NeQuickModelParameter.ai2Type setAi2ToNewInstance() {
    ai2_ = new NeQuickModelParameter.ai2Type();
    return ai2_;
  }
  
  private NeQuickModelParameter.ionoStormFlag1Type ionoStormFlag1_;
  public NeQuickModelParameter.ionoStormFlag1Type getIonoStormFlag1() {
    return ionoStormFlag1_;
  }
  /**
   * @throws ClassCastException if value is not a NeQuickModelParameter.ionoStormFlag1Type
   */
  public void setIonoStormFlag1(Asn1Object value) {
    this.ionoStormFlag1_ = (NeQuickModelParameter.ionoStormFlag1Type) value;
  }
  public NeQuickModelParameter.ionoStormFlag1Type setIonoStormFlag1ToNewInstance() {
    ionoStormFlag1_ = new NeQuickModelParameter.ionoStormFlag1Type();
    return ionoStormFlag1_;
  }
  
  private NeQuickModelParameter.ionoStormFlag2Type ionoStormFlag2_;
  public NeQuickModelParameter.ionoStormFlag2Type getIonoStormFlag2() {
    return ionoStormFlag2_;
  }
  /**
   * @throws ClassCastException if value is not a NeQuickModelParameter.ionoStormFlag2Type
   */
  public void setIonoStormFlag2(Asn1Object value) {
    this.ionoStormFlag2_ = (NeQuickModelParameter.ionoStormFlag2Type) value;
  }
  public NeQuickModelParameter.ionoStormFlag2Type setIonoStormFlag2ToNewInstance() {
    ionoStormFlag2_ = new NeQuickModelParameter.ionoStormFlag2Type();
    return ionoStormFlag2_;
  }
  
  private NeQuickModelParameter.ionoStormFlag3Type ionoStormFlag3_;
  public NeQuickModelParameter.ionoStormFlag3Type getIonoStormFlag3() {
    return ionoStormFlag3_;
  }
  /**
   * @throws ClassCastException if value is not a NeQuickModelParameter.ionoStormFlag3Type
   */
  public void setIonoStormFlag3(Asn1Object value) {
    this.ionoStormFlag3_ = (NeQuickModelParameter.ionoStormFlag3Type) value;
  }
  public NeQuickModelParameter.ionoStormFlag3Type setIonoStormFlag3ToNewInstance() {
    ionoStormFlag3_ = new NeQuickModelParameter.ionoStormFlag3Type();
    return ionoStormFlag3_;
  }
  
  private NeQuickModelParameter.ionoStormFlag4Type ionoStormFlag4_;
  public NeQuickModelParameter.ionoStormFlag4Type getIonoStormFlag4() {
    return ionoStormFlag4_;
  }
  /**
   * @throws ClassCastException if value is not a NeQuickModelParameter.ionoStormFlag4Type
   */
  public void setIonoStormFlag4(Asn1Object value) {
    this.ionoStormFlag4_ = (NeQuickModelParameter.ionoStormFlag4Type) value;
  }
  public NeQuickModelParameter.ionoStormFlag4Type setIonoStormFlag4ToNewInstance() {
    ionoStormFlag4_ = new NeQuickModelParameter.ionoStormFlag4Type();
    return ionoStormFlag4_;
  }
  
  private NeQuickModelParameter.ionoStormFlag5Type ionoStormFlag5_;
  public NeQuickModelParameter.ionoStormFlag5Type getIonoStormFlag5() {
    return ionoStormFlag5_;
  }
  /**
   * @throws ClassCastException if value is not a NeQuickModelParameter.ionoStormFlag5Type
   */
  public void setIonoStormFlag5(Asn1Object value) {
    this.ionoStormFlag5_ = (NeQuickModelParameter.ionoStormFlag5Type) value;
  }
  public NeQuickModelParameter.ionoStormFlag5Type setIonoStormFlag5ToNewInstance() {
    ionoStormFlag5_ = new NeQuickModelParameter.ionoStormFlag5Type();
    return ionoStormFlag5_;
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
            return tag == null ? NeQuickModelParameter.ai0Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? NeQuickModelParameter.ai1Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? NeQuickModelParameter.ai2Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getIonoStormFlag1() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getIonoStormFlag1();
          }

          @Override public void setToNewInstance() {
            setIonoStormFlag1ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NeQuickModelParameter.ionoStormFlag1Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ionoStormFlag1 : "
                    + getIonoStormFlag1().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getIonoStormFlag2() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getIonoStormFlag2();
          }

          @Override public void setToNewInstance() {
            setIonoStormFlag2ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NeQuickModelParameter.ionoStormFlag2Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ionoStormFlag2 : "
                    + getIonoStormFlag2().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getIonoStormFlag3() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getIonoStormFlag3();
          }

          @Override public void setToNewInstance() {
            setIonoStormFlag3ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NeQuickModelParameter.ionoStormFlag3Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ionoStormFlag3 : "
                    + getIonoStormFlag3().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getIonoStormFlag4() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getIonoStormFlag4();
          }

          @Override public void setToNewInstance() {
            setIonoStormFlag4ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NeQuickModelParameter.ionoStormFlag4Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ionoStormFlag4 : "
                    + getIonoStormFlag4().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 7);

          @Override public boolean isExplicitlySet() {
            return getIonoStormFlag5() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getIonoStormFlag5();
          }

          @Override public void setToNewInstance() {
            setIonoStormFlag5ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NeQuickModelParameter.ionoStormFlag5Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ionoStormFlag5 : "
                    + getIonoStormFlag5().toIndentedString(indent);
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
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("4095"));

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
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("4095"));

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
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("4095"));

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

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class ionoStormFlag1Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ionoStormFlag1Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ionoStormFlag1Type() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("1"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ionoStormFlag1Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ionoStormFlag1Type != null) {
      return ImmutableList.of(TAG_ionoStormFlag1Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ionoStormFlag1Type from encoded stream.
   */
  public static ionoStormFlag1Type fromPerUnaligned(byte[] encodedBytes) {
    ionoStormFlag1Type result = new ionoStormFlag1Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ionoStormFlag1Type from encoded stream.
   */
  public static ionoStormFlag1Type fromPerAligned(byte[] encodedBytes) {
    ionoStormFlag1Type result = new ionoStormFlag1Type();
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
    return "ionoStormFlag1Type = " + getInteger() + ";\n";
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
public static class ionoStormFlag2Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ionoStormFlag2Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ionoStormFlag2Type() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("1"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ionoStormFlag2Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ionoStormFlag2Type != null) {
      return ImmutableList.of(TAG_ionoStormFlag2Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ionoStormFlag2Type from encoded stream.
   */
  public static ionoStormFlag2Type fromPerUnaligned(byte[] encodedBytes) {
    ionoStormFlag2Type result = new ionoStormFlag2Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ionoStormFlag2Type from encoded stream.
   */
  public static ionoStormFlag2Type fromPerAligned(byte[] encodedBytes) {
    ionoStormFlag2Type result = new ionoStormFlag2Type();
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
    return "ionoStormFlag2Type = " + getInteger() + ";\n";
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
public static class ionoStormFlag3Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ionoStormFlag3Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ionoStormFlag3Type() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("1"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ionoStormFlag3Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ionoStormFlag3Type != null) {
      return ImmutableList.of(TAG_ionoStormFlag3Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ionoStormFlag3Type from encoded stream.
   */
  public static ionoStormFlag3Type fromPerUnaligned(byte[] encodedBytes) {
    ionoStormFlag3Type result = new ionoStormFlag3Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ionoStormFlag3Type from encoded stream.
   */
  public static ionoStormFlag3Type fromPerAligned(byte[] encodedBytes) {
    ionoStormFlag3Type result = new ionoStormFlag3Type();
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
    return "ionoStormFlag3Type = " + getInteger() + ";\n";
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
public static class ionoStormFlag4Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ionoStormFlag4Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ionoStormFlag4Type() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("1"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ionoStormFlag4Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ionoStormFlag4Type != null) {
      return ImmutableList.of(TAG_ionoStormFlag4Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ionoStormFlag4Type from encoded stream.
   */
  public static ionoStormFlag4Type fromPerUnaligned(byte[] encodedBytes) {
    ionoStormFlag4Type result = new ionoStormFlag4Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ionoStormFlag4Type from encoded stream.
   */
  public static ionoStormFlag4Type fromPerAligned(byte[] encodedBytes) {
    ionoStormFlag4Type result = new ionoStormFlag4Type();
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
    return "ionoStormFlag4Type = " + getInteger() + ";\n";
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
public static class ionoStormFlag5Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ionoStormFlag5Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ionoStormFlag5Type() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("1"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ionoStormFlag5Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ionoStormFlag5Type != null) {
      return ImmutableList.of(TAG_ionoStormFlag5Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ionoStormFlag5Type from encoded stream.
   */
  public static ionoStormFlag5Type fromPerUnaligned(byte[] encodedBytes) {
    ionoStormFlag5Type result = new ionoStormFlag5Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ionoStormFlag5Type from encoded stream.
   */
  public static ionoStormFlag5Type fromPerAligned(byte[] encodedBytes) {
    ionoStormFlag5Type result = new ionoStormFlag5Type();
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
    return "ionoStormFlag5Type = " + getInteger() + ";\n";
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
    builder.append("NeQuickModelParameter = {\n");
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
