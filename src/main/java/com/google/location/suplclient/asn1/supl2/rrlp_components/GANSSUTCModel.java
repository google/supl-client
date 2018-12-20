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
public  class GANSSUTCModel extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GANSSUTCModel
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GANSSUTCModel() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GANSSUTCModel;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GANSSUTCModel != null) {
      return ImmutableList.of(TAG_GANSSUTCModel);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GANSSUTCModel from encoded stream.
   */
  public static GANSSUTCModel fromPerUnaligned(byte[] encodedBytes) {
    GANSSUTCModel result = new GANSSUTCModel();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GANSSUTCModel from encoded stream.
   */
  public static GANSSUTCModel fromPerAligned(byte[] encodedBytes) {
    GANSSUTCModel result = new GANSSUTCModel();
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

  
  private GANSSUTCModel.ganssUtcA1Type ganssUtcA1_;
  public GANSSUTCModel.ganssUtcA1Type getGanssUtcA1() {
    return ganssUtcA1_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSUTCModel.ganssUtcA1Type
   */
  public void setGanssUtcA1(Asn1Object value) {
    this.ganssUtcA1_ = (GANSSUTCModel.ganssUtcA1Type) value;
  }
  public GANSSUTCModel.ganssUtcA1Type setGanssUtcA1ToNewInstance() {
    ganssUtcA1_ = new GANSSUTCModel.ganssUtcA1Type();
    return ganssUtcA1_;
  }
  
  private GANSSUTCModel.ganssUtcA0Type ganssUtcA0_;
  public GANSSUTCModel.ganssUtcA0Type getGanssUtcA0() {
    return ganssUtcA0_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSUTCModel.ganssUtcA0Type
   */
  public void setGanssUtcA0(Asn1Object value) {
    this.ganssUtcA0_ = (GANSSUTCModel.ganssUtcA0Type) value;
  }
  public GANSSUTCModel.ganssUtcA0Type setGanssUtcA0ToNewInstance() {
    ganssUtcA0_ = new GANSSUTCModel.ganssUtcA0Type();
    return ganssUtcA0_;
  }
  
  private GANSSUTCModel.ganssUtcTotType ganssUtcTot_;
  public GANSSUTCModel.ganssUtcTotType getGanssUtcTot() {
    return ganssUtcTot_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSUTCModel.ganssUtcTotType
   */
  public void setGanssUtcTot(Asn1Object value) {
    this.ganssUtcTot_ = (GANSSUTCModel.ganssUtcTotType) value;
  }
  public GANSSUTCModel.ganssUtcTotType setGanssUtcTotToNewInstance() {
    ganssUtcTot_ = new GANSSUTCModel.ganssUtcTotType();
    return ganssUtcTot_;
  }
  
  private GANSSUTCModel.ganssUtcWNtType ganssUtcWNt_;
  public GANSSUTCModel.ganssUtcWNtType getGanssUtcWNt() {
    return ganssUtcWNt_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSUTCModel.ganssUtcWNtType
   */
  public void setGanssUtcWNt(Asn1Object value) {
    this.ganssUtcWNt_ = (GANSSUTCModel.ganssUtcWNtType) value;
  }
  public GANSSUTCModel.ganssUtcWNtType setGanssUtcWNtToNewInstance() {
    ganssUtcWNt_ = new GANSSUTCModel.ganssUtcWNtType();
    return ganssUtcWNt_;
  }
  
  private GANSSUTCModel.ganssUtcDeltaTlsType ganssUtcDeltaTls_;
  public GANSSUTCModel.ganssUtcDeltaTlsType getGanssUtcDeltaTls() {
    return ganssUtcDeltaTls_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSUTCModel.ganssUtcDeltaTlsType
   */
  public void setGanssUtcDeltaTls(Asn1Object value) {
    this.ganssUtcDeltaTls_ = (GANSSUTCModel.ganssUtcDeltaTlsType) value;
  }
  public GANSSUTCModel.ganssUtcDeltaTlsType setGanssUtcDeltaTlsToNewInstance() {
    ganssUtcDeltaTls_ = new GANSSUTCModel.ganssUtcDeltaTlsType();
    return ganssUtcDeltaTls_;
  }
  
  private GANSSUTCModel.ganssUtcWNlsfType ganssUtcWNlsf_;
  public GANSSUTCModel.ganssUtcWNlsfType getGanssUtcWNlsf() {
    return ganssUtcWNlsf_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSUTCModel.ganssUtcWNlsfType
   */
  public void setGanssUtcWNlsf(Asn1Object value) {
    this.ganssUtcWNlsf_ = (GANSSUTCModel.ganssUtcWNlsfType) value;
  }
  public GANSSUTCModel.ganssUtcWNlsfType setGanssUtcWNlsfToNewInstance() {
    ganssUtcWNlsf_ = new GANSSUTCModel.ganssUtcWNlsfType();
    return ganssUtcWNlsf_;
  }
  
  private GANSSUTCModel.ganssUtcDNType ganssUtcDN_;
  public GANSSUTCModel.ganssUtcDNType getGanssUtcDN() {
    return ganssUtcDN_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSUTCModel.ganssUtcDNType
   */
  public void setGanssUtcDN(Asn1Object value) {
    this.ganssUtcDN_ = (GANSSUTCModel.ganssUtcDNType) value;
  }
  public GANSSUTCModel.ganssUtcDNType setGanssUtcDNToNewInstance() {
    ganssUtcDN_ = new GANSSUTCModel.ganssUtcDNType();
    return ganssUtcDN_;
  }
  
  private GANSSUTCModel.ganssUtcDeltaTlsfType ganssUtcDeltaTlsf_;
  public GANSSUTCModel.ganssUtcDeltaTlsfType getGanssUtcDeltaTlsf() {
    return ganssUtcDeltaTlsf_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSUTCModel.ganssUtcDeltaTlsfType
   */
  public void setGanssUtcDeltaTlsf(Asn1Object value) {
    this.ganssUtcDeltaTlsf_ = (GANSSUTCModel.ganssUtcDeltaTlsfType) value;
  }
  public GANSSUTCModel.ganssUtcDeltaTlsfType setGanssUtcDeltaTlsfToNewInstance() {
    ganssUtcDeltaTlsf_ = new GANSSUTCModel.ganssUtcDeltaTlsfType();
    return ganssUtcDeltaTlsf_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getGanssUtcA1() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssUtcA1();
          }

          @Override public void setToNewInstance() {
            setGanssUtcA1ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSUTCModel.ganssUtcA1Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssUtcA1 : "
                    + getGanssUtcA1().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getGanssUtcA0() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssUtcA0();
          }

          @Override public void setToNewInstance() {
            setGanssUtcA0ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSUTCModel.ganssUtcA0Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssUtcA0 : "
                    + getGanssUtcA0().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getGanssUtcTot() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssUtcTot();
          }

          @Override public void setToNewInstance() {
            setGanssUtcTotToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSUTCModel.ganssUtcTotType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssUtcTot : "
                    + getGanssUtcTot().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getGanssUtcWNt() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssUtcWNt();
          }

          @Override public void setToNewInstance() {
            setGanssUtcWNtToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSUTCModel.ganssUtcWNtType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssUtcWNt : "
                    + getGanssUtcWNt().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getGanssUtcDeltaTls() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssUtcDeltaTls();
          }

          @Override public void setToNewInstance() {
            setGanssUtcDeltaTlsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSUTCModel.ganssUtcDeltaTlsType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssUtcDeltaTls : "
                    + getGanssUtcDeltaTls().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getGanssUtcWNlsf() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssUtcWNlsf();
          }

          @Override public void setToNewInstance() {
            setGanssUtcWNlsfToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSUTCModel.ganssUtcWNlsfType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssUtcWNlsf : "
                    + getGanssUtcWNlsf().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getGanssUtcDN() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssUtcDN();
          }

          @Override public void setToNewInstance() {
            setGanssUtcDNToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSUTCModel.ganssUtcDNType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssUtcDN : "
                    + getGanssUtcDN().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 7);

          @Override public boolean isExplicitlySet() {
            return getGanssUtcDeltaTlsf() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssUtcDeltaTlsf();
          }

          @Override public void setToNewInstance() {
            setGanssUtcDeltaTlsfToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSUTCModel.ganssUtcDeltaTlsfType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssUtcDeltaTlsf : "
                    + getGanssUtcDeltaTlsf().toIndentedString(indent);
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
public static class ganssUtcA1Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ganssUtcA1Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ganssUtcA1Type() {
    super();
    setValueRange(new java.math.BigInteger("-8388608"), new java.math.BigInteger("8388607"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ganssUtcA1Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ganssUtcA1Type != null) {
      return ImmutableList.of(TAG_ganssUtcA1Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ganssUtcA1Type from encoded stream.
   */
  public static ganssUtcA1Type fromPerUnaligned(byte[] encodedBytes) {
    ganssUtcA1Type result = new ganssUtcA1Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ganssUtcA1Type from encoded stream.
   */
  public static ganssUtcA1Type fromPerAligned(byte[] encodedBytes) {
    ganssUtcA1Type result = new ganssUtcA1Type();
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
    return "ganssUtcA1Type = " + getInteger() + ";\n";
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
public static class ganssUtcA0Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ganssUtcA0Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ganssUtcA0Type() {
    super();
    setValueRange(new java.math.BigInteger("-2147483648"), new java.math.BigInteger("2147483647"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ganssUtcA0Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ganssUtcA0Type != null) {
      return ImmutableList.of(TAG_ganssUtcA0Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ganssUtcA0Type from encoded stream.
   */
  public static ganssUtcA0Type fromPerUnaligned(byte[] encodedBytes) {
    ganssUtcA0Type result = new ganssUtcA0Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ganssUtcA0Type from encoded stream.
   */
  public static ganssUtcA0Type fromPerAligned(byte[] encodedBytes) {
    ganssUtcA0Type result = new ganssUtcA0Type();
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
    return "ganssUtcA0Type = " + getInteger() + ";\n";
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
public static class ganssUtcTotType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ganssUtcTotType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ganssUtcTotType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("255"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ganssUtcTotType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ganssUtcTotType != null) {
      return ImmutableList.of(TAG_ganssUtcTotType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ganssUtcTotType from encoded stream.
   */
  public static ganssUtcTotType fromPerUnaligned(byte[] encodedBytes) {
    ganssUtcTotType result = new ganssUtcTotType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ganssUtcTotType from encoded stream.
   */
  public static ganssUtcTotType fromPerAligned(byte[] encodedBytes) {
    ganssUtcTotType result = new ganssUtcTotType();
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
    return "ganssUtcTotType = " + getInteger() + ";\n";
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
public static class ganssUtcWNtType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ganssUtcWNtType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ganssUtcWNtType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("255"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ganssUtcWNtType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ganssUtcWNtType != null) {
      return ImmutableList.of(TAG_ganssUtcWNtType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ganssUtcWNtType from encoded stream.
   */
  public static ganssUtcWNtType fromPerUnaligned(byte[] encodedBytes) {
    ganssUtcWNtType result = new ganssUtcWNtType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ganssUtcWNtType from encoded stream.
   */
  public static ganssUtcWNtType fromPerAligned(byte[] encodedBytes) {
    ganssUtcWNtType result = new ganssUtcWNtType();
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
    return "ganssUtcWNtType = " + getInteger() + ";\n";
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
public static class ganssUtcDeltaTlsType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ganssUtcDeltaTlsType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ganssUtcDeltaTlsType() {
    super();
    setValueRange(new java.math.BigInteger("-128"), new java.math.BigInteger("127"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ganssUtcDeltaTlsType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ganssUtcDeltaTlsType != null) {
      return ImmutableList.of(TAG_ganssUtcDeltaTlsType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ganssUtcDeltaTlsType from encoded stream.
   */
  public static ganssUtcDeltaTlsType fromPerUnaligned(byte[] encodedBytes) {
    ganssUtcDeltaTlsType result = new ganssUtcDeltaTlsType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ganssUtcDeltaTlsType from encoded stream.
   */
  public static ganssUtcDeltaTlsType fromPerAligned(byte[] encodedBytes) {
    ganssUtcDeltaTlsType result = new ganssUtcDeltaTlsType();
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
    return "ganssUtcDeltaTlsType = " + getInteger() + ";\n";
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
public static class ganssUtcWNlsfType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ganssUtcWNlsfType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ganssUtcWNlsfType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("255"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ganssUtcWNlsfType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ganssUtcWNlsfType != null) {
      return ImmutableList.of(TAG_ganssUtcWNlsfType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ganssUtcWNlsfType from encoded stream.
   */
  public static ganssUtcWNlsfType fromPerUnaligned(byte[] encodedBytes) {
    ganssUtcWNlsfType result = new ganssUtcWNlsfType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ganssUtcWNlsfType from encoded stream.
   */
  public static ganssUtcWNlsfType fromPerAligned(byte[] encodedBytes) {
    ganssUtcWNlsfType result = new ganssUtcWNlsfType();
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
    return "ganssUtcWNlsfType = " + getInteger() + ";\n";
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
public static class ganssUtcDNType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ganssUtcDNType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ganssUtcDNType() {
    super();
    setValueRange(new java.math.BigInteger("-128"), new java.math.BigInteger("127"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ganssUtcDNType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ganssUtcDNType != null) {
      return ImmutableList.of(TAG_ganssUtcDNType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ganssUtcDNType from encoded stream.
   */
  public static ganssUtcDNType fromPerUnaligned(byte[] encodedBytes) {
    ganssUtcDNType result = new ganssUtcDNType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ganssUtcDNType from encoded stream.
   */
  public static ganssUtcDNType fromPerAligned(byte[] encodedBytes) {
    ganssUtcDNType result = new ganssUtcDNType();
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
    return "ganssUtcDNType = " + getInteger() + ";\n";
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
public static class ganssUtcDeltaTlsfType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ganssUtcDeltaTlsfType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ganssUtcDeltaTlsfType() {
    super();
    setValueRange(new java.math.BigInteger("-128"), new java.math.BigInteger("127"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ganssUtcDeltaTlsfType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ganssUtcDeltaTlsfType != null) {
      return ImmutableList.of(TAG_ganssUtcDeltaTlsfType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ganssUtcDeltaTlsfType from encoded stream.
   */
  public static ganssUtcDeltaTlsfType fromPerUnaligned(byte[] encodedBytes) {
    ganssUtcDeltaTlsfType result = new ganssUtcDeltaTlsfType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ganssUtcDeltaTlsfType from encoded stream.
   */
  public static ganssUtcDeltaTlsfType fromPerAligned(byte[] encodedBytes) {
    ganssUtcDeltaTlsfType result = new ganssUtcDeltaTlsfType();
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
    return "ganssUtcDeltaTlsfType = " + getInteger() + ";\n";
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
    builder.append("GANSSUTCModel = {\n");
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
