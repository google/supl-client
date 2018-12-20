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
public  class IonosphericModel extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_IonosphericModel
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public IonosphericModel() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_IonosphericModel;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_IonosphericModel != null) {
      return ImmutableList.of(TAG_IonosphericModel);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new IonosphericModel from encoded stream.
   */
  public static IonosphericModel fromPerUnaligned(byte[] encodedBytes) {
    IonosphericModel result = new IonosphericModel();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new IonosphericModel from encoded stream.
   */
  public static IonosphericModel fromPerAligned(byte[] encodedBytes) {
    IonosphericModel result = new IonosphericModel();
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

  
  private IonosphericModel.alfa0Type alfa0_;
  public IonosphericModel.alfa0Type getAlfa0() {
    return alfa0_;
  }
  /**
   * @throws ClassCastException if value is not a IonosphericModel.alfa0Type
   */
  public void setAlfa0(Asn1Object value) {
    this.alfa0_ = (IonosphericModel.alfa0Type) value;
  }
  public IonosphericModel.alfa0Type setAlfa0ToNewInstance() {
    alfa0_ = new IonosphericModel.alfa0Type();
    return alfa0_;
  }
  
  private IonosphericModel.alfa1Type alfa1_;
  public IonosphericModel.alfa1Type getAlfa1() {
    return alfa1_;
  }
  /**
   * @throws ClassCastException if value is not a IonosphericModel.alfa1Type
   */
  public void setAlfa1(Asn1Object value) {
    this.alfa1_ = (IonosphericModel.alfa1Type) value;
  }
  public IonosphericModel.alfa1Type setAlfa1ToNewInstance() {
    alfa1_ = new IonosphericModel.alfa1Type();
    return alfa1_;
  }
  
  private IonosphericModel.alfa2Type alfa2_;
  public IonosphericModel.alfa2Type getAlfa2() {
    return alfa2_;
  }
  /**
   * @throws ClassCastException if value is not a IonosphericModel.alfa2Type
   */
  public void setAlfa2(Asn1Object value) {
    this.alfa2_ = (IonosphericModel.alfa2Type) value;
  }
  public IonosphericModel.alfa2Type setAlfa2ToNewInstance() {
    alfa2_ = new IonosphericModel.alfa2Type();
    return alfa2_;
  }
  
  private IonosphericModel.alfa3Type alfa3_;
  public IonosphericModel.alfa3Type getAlfa3() {
    return alfa3_;
  }
  /**
   * @throws ClassCastException if value is not a IonosphericModel.alfa3Type
   */
  public void setAlfa3(Asn1Object value) {
    this.alfa3_ = (IonosphericModel.alfa3Type) value;
  }
  public IonosphericModel.alfa3Type setAlfa3ToNewInstance() {
    alfa3_ = new IonosphericModel.alfa3Type();
    return alfa3_;
  }
  
  private IonosphericModel.beta0Type beta0_;
  public IonosphericModel.beta0Type getBeta0() {
    return beta0_;
  }
  /**
   * @throws ClassCastException if value is not a IonosphericModel.beta0Type
   */
  public void setBeta0(Asn1Object value) {
    this.beta0_ = (IonosphericModel.beta0Type) value;
  }
  public IonosphericModel.beta0Type setBeta0ToNewInstance() {
    beta0_ = new IonosphericModel.beta0Type();
    return beta0_;
  }
  
  private IonosphericModel.beta1Type beta1_;
  public IonosphericModel.beta1Type getBeta1() {
    return beta1_;
  }
  /**
   * @throws ClassCastException if value is not a IonosphericModel.beta1Type
   */
  public void setBeta1(Asn1Object value) {
    this.beta1_ = (IonosphericModel.beta1Type) value;
  }
  public IonosphericModel.beta1Type setBeta1ToNewInstance() {
    beta1_ = new IonosphericModel.beta1Type();
    return beta1_;
  }
  
  private IonosphericModel.beta2Type beta2_;
  public IonosphericModel.beta2Type getBeta2() {
    return beta2_;
  }
  /**
   * @throws ClassCastException if value is not a IonosphericModel.beta2Type
   */
  public void setBeta2(Asn1Object value) {
    this.beta2_ = (IonosphericModel.beta2Type) value;
  }
  public IonosphericModel.beta2Type setBeta2ToNewInstance() {
    beta2_ = new IonosphericModel.beta2Type();
    return beta2_;
  }
  
  private IonosphericModel.beta3Type beta3_;
  public IonosphericModel.beta3Type getBeta3() {
    return beta3_;
  }
  /**
   * @throws ClassCastException if value is not a IonosphericModel.beta3Type
   */
  public void setBeta3(Asn1Object value) {
    this.beta3_ = (IonosphericModel.beta3Type) value;
  }
  public IonosphericModel.beta3Type setBeta3ToNewInstance() {
    beta3_ = new IonosphericModel.beta3Type();
    return beta3_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getAlfa0() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getAlfa0();
          }

          @Override public void setToNewInstance() {
            setAlfa0ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? IonosphericModel.alfa0Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "alfa0 : "
                    + getAlfa0().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getAlfa1() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getAlfa1();
          }

          @Override public void setToNewInstance() {
            setAlfa1ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? IonosphericModel.alfa1Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "alfa1 : "
                    + getAlfa1().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getAlfa2() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getAlfa2();
          }

          @Override public void setToNewInstance() {
            setAlfa2ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? IonosphericModel.alfa2Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "alfa2 : "
                    + getAlfa2().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getAlfa3() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getAlfa3();
          }

          @Override public void setToNewInstance() {
            setAlfa3ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? IonosphericModel.alfa3Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "alfa3 : "
                    + getAlfa3().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getBeta0() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBeta0();
          }

          @Override public void setToNewInstance() {
            setBeta0ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? IonosphericModel.beta0Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "beta0 : "
                    + getBeta0().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getBeta1() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBeta1();
          }

          @Override public void setToNewInstance() {
            setBeta1ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? IonosphericModel.beta1Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "beta1 : "
                    + getBeta1().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getBeta2() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBeta2();
          }

          @Override public void setToNewInstance() {
            setBeta2ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? IonosphericModel.beta2Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "beta2 : "
                    + getBeta2().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 7);

          @Override public boolean isExplicitlySet() {
            return getBeta3() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBeta3();
          }

          @Override public void setToNewInstance() {
            setBeta3ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? IonosphericModel.beta3Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "beta3 : "
                    + getBeta3().toIndentedString(indent);
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
public static class alfa0Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_alfa0Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public alfa0Type() {
    super();
    setValueRange(new java.math.BigInteger("-128"), new java.math.BigInteger("127"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_alfa0Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_alfa0Type != null) {
      return ImmutableList.of(TAG_alfa0Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new alfa0Type from encoded stream.
   */
  public static alfa0Type fromPerUnaligned(byte[] encodedBytes) {
    alfa0Type result = new alfa0Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new alfa0Type from encoded stream.
   */
  public static alfa0Type fromPerAligned(byte[] encodedBytes) {
    alfa0Type result = new alfa0Type();
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
    return "alfa0Type = " + getInteger() + ";\n";
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
public static class alfa1Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_alfa1Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public alfa1Type() {
    super();
    setValueRange(new java.math.BigInteger("-128"), new java.math.BigInteger("127"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_alfa1Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_alfa1Type != null) {
      return ImmutableList.of(TAG_alfa1Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new alfa1Type from encoded stream.
   */
  public static alfa1Type fromPerUnaligned(byte[] encodedBytes) {
    alfa1Type result = new alfa1Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new alfa1Type from encoded stream.
   */
  public static alfa1Type fromPerAligned(byte[] encodedBytes) {
    alfa1Type result = new alfa1Type();
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
    return "alfa1Type = " + getInteger() + ";\n";
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
public static class alfa2Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_alfa2Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public alfa2Type() {
    super();
    setValueRange(new java.math.BigInteger("-128"), new java.math.BigInteger("127"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_alfa2Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_alfa2Type != null) {
      return ImmutableList.of(TAG_alfa2Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new alfa2Type from encoded stream.
   */
  public static alfa2Type fromPerUnaligned(byte[] encodedBytes) {
    alfa2Type result = new alfa2Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new alfa2Type from encoded stream.
   */
  public static alfa2Type fromPerAligned(byte[] encodedBytes) {
    alfa2Type result = new alfa2Type();
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
    return "alfa2Type = " + getInteger() + ";\n";
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
public static class alfa3Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_alfa3Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public alfa3Type() {
    super();
    setValueRange(new java.math.BigInteger("-128"), new java.math.BigInteger("127"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_alfa3Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_alfa3Type != null) {
      return ImmutableList.of(TAG_alfa3Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new alfa3Type from encoded stream.
   */
  public static alfa3Type fromPerUnaligned(byte[] encodedBytes) {
    alfa3Type result = new alfa3Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new alfa3Type from encoded stream.
   */
  public static alfa3Type fromPerAligned(byte[] encodedBytes) {
    alfa3Type result = new alfa3Type();
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
    return "alfa3Type = " + getInteger() + ";\n";
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
public static class beta0Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_beta0Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public beta0Type() {
    super();
    setValueRange(new java.math.BigInteger("-128"), new java.math.BigInteger("127"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_beta0Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_beta0Type != null) {
      return ImmutableList.of(TAG_beta0Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new beta0Type from encoded stream.
   */
  public static beta0Type fromPerUnaligned(byte[] encodedBytes) {
    beta0Type result = new beta0Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new beta0Type from encoded stream.
   */
  public static beta0Type fromPerAligned(byte[] encodedBytes) {
    beta0Type result = new beta0Type();
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
    return "beta0Type = " + getInteger() + ";\n";
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
public static class beta1Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_beta1Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public beta1Type() {
    super();
    setValueRange(new java.math.BigInteger("-128"), new java.math.BigInteger("127"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_beta1Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_beta1Type != null) {
      return ImmutableList.of(TAG_beta1Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new beta1Type from encoded stream.
   */
  public static beta1Type fromPerUnaligned(byte[] encodedBytes) {
    beta1Type result = new beta1Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new beta1Type from encoded stream.
   */
  public static beta1Type fromPerAligned(byte[] encodedBytes) {
    beta1Type result = new beta1Type();
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
    return "beta1Type = " + getInteger() + ";\n";
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
public static class beta2Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_beta2Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public beta2Type() {
    super();
    setValueRange(new java.math.BigInteger("-128"), new java.math.BigInteger("127"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_beta2Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_beta2Type != null) {
      return ImmutableList.of(TAG_beta2Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new beta2Type from encoded stream.
   */
  public static beta2Type fromPerUnaligned(byte[] encodedBytes) {
    beta2Type result = new beta2Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new beta2Type from encoded stream.
   */
  public static beta2Type fromPerAligned(byte[] encodedBytes) {
    beta2Type result = new beta2Type();
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
    return "beta2Type = " + getInteger() + ";\n";
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
public static class beta3Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_beta3Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public beta3Type() {
    super();
    setValueRange(new java.math.BigInteger("-128"), new java.math.BigInteger("127"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_beta3Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_beta3Type != null) {
      return ImmutableList.of(TAG_beta3Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new beta3Type from encoded stream.
   */
  public static beta3Type fromPerUnaligned(byte[] encodedBytes) {
    beta3Type result = new beta3Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new beta3Type from encoded stream.
   */
  public static beta3Type fromPerAligned(byte[] encodedBytes) {
    beta3Type result = new beta3Type();
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
    return "beta3Type = " + getInteger() + ";\n";
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
    builder.append("IonosphericModel = {\n");
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
