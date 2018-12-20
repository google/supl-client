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
import com.google.location.suplclient.asn1.base.Asn1BitString;
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
public  class UTC_ModelSet2 extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_UTC_ModelSet2
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public UTC_ModelSet2() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_UTC_ModelSet2;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_UTC_ModelSet2 != null) {
      return ImmutableList.of(TAG_UTC_ModelSet2);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new UTC_ModelSet2 from encoded stream.
   */
  public static UTC_ModelSet2 fromPerUnaligned(byte[] encodedBytes) {
    UTC_ModelSet2 result = new UTC_ModelSet2();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new UTC_ModelSet2 from encoded stream.
   */
  public static UTC_ModelSet2 fromPerAligned(byte[] encodedBytes) {
    UTC_ModelSet2 result = new UTC_ModelSet2();
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

  
  private UTC_ModelSet2.utcA0Type utcA0_;
  public UTC_ModelSet2.utcA0Type getUtcA0() {
    return utcA0_;
  }
  /**
   * @throws ClassCastException if value is not a UTC_ModelSet2.utcA0Type
   */
  public void setUtcA0(Asn1Object value) {
    this.utcA0_ = (UTC_ModelSet2.utcA0Type) value;
  }
  public UTC_ModelSet2.utcA0Type setUtcA0ToNewInstance() {
    utcA0_ = new UTC_ModelSet2.utcA0Type();
    return utcA0_;
  }
  
  private UTC_ModelSet2.utcA1Type utcA1_;
  public UTC_ModelSet2.utcA1Type getUtcA1() {
    return utcA1_;
  }
  /**
   * @throws ClassCastException if value is not a UTC_ModelSet2.utcA1Type
   */
  public void setUtcA1(Asn1Object value) {
    this.utcA1_ = (UTC_ModelSet2.utcA1Type) value;
  }
  public UTC_ModelSet2.utcA1Type setUtcA1ToNewInstance() {
    utcA1_ = new UTC_ModelSet2.utcA1Type();
    return utcA1_;
  }
  
  private UTC_ModelSet2.utcA2Type utcA2_;
  public UTC_ModelSet2.utcA2Type getUtcA2() {
    return utcA2_;
  }
  /**
   * @throws ClassCastException if value is not a UTC_ModelSet2.utcA2Type
   */
  public void setUtcA2(Asn1Object value) {
    this.utcA2_ = (UTC_ModelSet2.utcA2Type) value;
  }
  public UTC_ModelSet2.utcA2Type setUtcA2ToNewInstance() {
    utcA2_ = new UTC_ModelSet2.utcA2Type();
    return utcA2_;
  }
  
  private UTC_ModelSet2.utcDeltaTlsType utcDeltaTls_;
  public UTC_ModelSet2.utcDeltaTlsType getUtcDeltaTls() {
    return utcDeltaTls_;
  }
  /**
   * @throws ClassCastException if value is not a UTC_ModelSet2.utcDeltaTlsType
   */
  public void setUtcDeltaTls(Asn1Object value) {
    this.utcDeltaTls_ = (UTC_ModelSet2.utcDeltaTlsType) value;
  }
  public UTC_ModelSet2.utcDeltaTlsType setUtcDeltaTlsToNewInstance() {
    utcDeltaTls_ = new UTC_ModelSet2.utcDeltaTlsType();
    return utcDeltaTls_;
  }
  
  private UTC_ModelSet2.utcTotType utcTot_;
  public UTC_ModelSet2.utcTotType getUtcTot() {
    return utcTot_;
  }
  /**
   * @throws ClassCastException if value is not a UTC_ModelSet2.utcTotType
   */
  public void setUtcTot(Asn1Object value) {
    this.utcTot_ = (UTC_ModelSet2.utcTotType) value;
  }
  public UTC_ModelSet2.utcTotType setUtcTotToNewInstance() {
    utcTot_ = new UTC_ModelSet2.utcTotType();
    return utcTot_;
  }
  
  private UTC_ModelSet2.utcWNotType utcWNot_;
  public UTC_ModelSet2.utcWNotType getUtcWNot() {
    return utcWNot_;
  }
  /**
   * @throws ClassCastException if value is not a UTC_ModelSet2.utcWNotType
   */
  public void setUtcWNot(Asn1Object value) {
    this.utcWNot_ = (UTC_ModelSet2.utcWNotType) value;
  }
  public UTC_ModelSet2.utcWNotType setUtcWNotToNewInstance() {
    utcWNot_ = new UTC_ModelSet2.utcWNotType();
    return utcWNot_;
  }
  
  private UTC_ModelSet2.utcWNlsfType utcWNlsf_;
  public UTC_ModelSet2.utcWNlsfType getUtcWNlsf() {
    return utcWNlsf_;
  }
  /**
   * @throws ClassCastException if value is not a UTC_ModelSet2.utcWNlsfType
   */
  public void setUtcWNlsf(Asn1Object value) {
    this.utcWNlsf_ = (UTC_ModelSet2.utcWNlsfType) value;
  }
  public UTC_ModelSet2.utcWNlsfType setUtcWNlsfToNewInstance() {
    utcWNlsf_ = new UTC_ModelSet2.utcWNlsfType();
    return utcWNlsf_;
  }
  
  private UTC_ModelSet2.utcDNType utcDN_;
  public UTC_ModelSet2.utcDNType getUtcDN() {
    return utcDN_;
  }
  /**
   * @throws ClassCastException if value is not a UTC_ModelSet2.utcDNType
   */
  public void setUtcDN(Asn1Object value) {
    this.utcDN_ = (UTC_ModelSet2.utcDNType) value;
  }
  public UTC_ModelSet2.utcDNType setUtcDNToNewInstance() {
    utcDN_ = new UTC_ModelSet2.utcDNType();
    return utcDN_;
  }
  
  private UTC_ModelSet2.utcDeltaTlsfType utcDeltaTlsf_;
  public UTC_ModelSet2.utcDeltaTlsfType getUtcDeltaTlsf() {
    return utcDeltaTlsf_;
  }
  /**
   * @throws ClassCastException if value is not a UTC_ModelSet2.utcDeltaTlsfType
   */
  public void setUtcDeltaTlsf(Asn1Object value) {
    this.utcDeltaTlsf_ = (UTC_ModelSet2.utcDeltaTlsfType) value;
  }
  public UTC_ModelSet2.utcDeltaTlsfType setUtcDeltaTlsfToNewInstance() {
    utcDeltaTlsf_ = new UTC_ModelSet2.utcDeltaTlsfType();
    return utcDeltaTlsf_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getUtcA0() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getUtcA0();
          }

          @Override public void setToNewInstance() {
            setUtcA0ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UTC_ModelSet2.utcA0Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "utcA0 : "
                    + getUtcA0().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getUtcA1() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getUtcA1();
          }

          @Override public void setToNewInstance() {
            setUtcA1ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UTC_ModelSet2.utcA1Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "utcA1 : "
                    + getUtcA1().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getUtcA2() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getUtcA2();
          }

          @Override public void setToNewInstance() {
            setUtcA2ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UTC_ModelSet2.utcA2Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "utcA2 : "
                    + getUtcA2().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getUtcDeltaTls() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getUtcDeltaTls();
          }

          @Override public void setToNewInstance() {
            setUtcDeltaTlsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UTC_ModelSet2.utcDeltaTlsType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "utcDeltaTls : "
                    + getUtcDeltaTls().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getUtcTot() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getUtcTot();
          }

          @Override public void setToNewInstance() {
            setUtcTotToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UTC_ModelSet2.utcTotType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "utcTot : "
                    + getUtcTot().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getUtcWNot() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getUtcWNot();
          }

          @Override public void setToNewInstance() {
            setUtcWNotToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UTC_ModelSet2.utcWNotType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "utcWNot : "
                    + getUtcWNot().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getUtcWNlsf() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getUtcWNlsf();
          }

          @Override public void setToNewInstance() {
            setUtcWNlsfToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UTC_ModelSet2.utcWNlsfType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "utcWNlsf : "
                    + getUtcWNlsf().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 7);

          @Override public boolean isExplicitlySet() {
            return getUtcDN() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getUtcDN();
          }

          @Override public void setToNewInstance() {
            setUtcDNToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UTC_ModelSet2.utcDNType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "utcDN : "
                    + getUtcDN().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 8);

          @Override public boolean isExplicitlySet() {
            return getUtcDeltaTlsf() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getUtcDeltaTlsf();
          }

          @Override public void setToNewInstance() {
            setUtcDeltaTlsfToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UTC_ModelSet2.utcDeltaTlsfType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "utcDeltaTlsf : "
                    + getUtcDeltaTlsf().toIndentedString(indent);
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
public static class utcA0Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_utcA0Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public utcA0Type() {
    super();
    setValueRange(new java.math.BigInteger("-32768"), new java.math.BigInteger("32767"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_utcA0Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_utcA0Type != null) {
      return ImmutableList.of(TAG_utcA0Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new utcA0Type from encoded stream.
   */
  public static utcA0Type fromPerUnaligned(byte[] encodedBytes) {
    utcA0Type result = new utcA0Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new utcA0Type from encoded stream.
   */
  public static utcA0Type fromPerAligned(byte[] encodedBytes) {
    utcA0Type result = new utcA0Type();
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
    return "utcA0Type = " + getInteger() + ";\n";
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
public static class utcA1Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_utcA1Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public utcA1Type() {
    super();
    setValueRange(new java.math.BigInteger("-4096"), new java.math.BigInteger("4095"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_utcA1Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_utcA1Type != null) {
      return ImmutableList.of(TAG_utcA1Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new utcA1Type from encoded stream.
   */
  public static utcA1Type fromPerUnaligned(byte[] encodedBytes) {
    utcA1Type result = new utcA1Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new utcA1Type from encoded stream.
   */
  public static utcA1Type fromPerAligned(byte[] encodedBytes) {
    utcA1Type result = new utcA1Type();
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
    return "utcA1Type = " + getInteger() + ";\n";
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
public static class utcA2Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_utcA2Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public utcA2Type() {
    super();
    setValueRange(new java.math.BigInteger("-64"), new java.math.BigInteger("63"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_utcA2Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_utcA2Type != null) {
      return ImmutableList.of(TAG_utcA2Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new utcA2Type from encoded stream.
   */
  public static utcA2Type fromPerUnaligned(byte[] encodedBytes) {
    utcA2Type result = new utcA2Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new utcA2Type from encoded stream.
   */
  public static utcA2Type fromPerAligned(byte[] encodedBytes) {
    utcA2Type result = new utcA2Type();
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
    return "utcA2Type = " + getInteger() + ";\n";
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
public static class utcDeltaTlsType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_utcDeltaTlsType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public utcDeltaTlsType() {
    super();
    setValueRange(new java.math.BigInteger("-128"), new java.math.BigInteger("127"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_utcDeltaTlsType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_utcDeltaTlsType != null) {
      return ImmutableList.of(TAG_utcDeltaTlsType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new utcDeltaTlsType from encoded stream.
   */
  public static utcDeltaTlsType fromPerUnaligned(byte[] encodedBytes) {
    utcDeltaTlsType result = new utcDeltaTlsType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new utcDeltaTlsType from encoded stream.
   */
  public static utcDeltaTlsType fromPerAligned(byte[] encodedBytes) {
    utcDeltaTlsType result = new utcDeltaTlsType();
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
    return "utcDeltaTlsType = " + getInteger() + ";\n";
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
public static class utcTotType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_utcTotType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public utcTotType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("65535"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_utcTotType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_utcTotType != null) {
      return ImmutableList.of(TAG_utcTotType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new utcTotType from encoded stream.
   */
  public static utcTotType fromPerUnaligned(byte[] encodedBytes) {
    utcTotType result = new utcTotType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new utcTotType from encoded stream.
   */
  public static utcTotType fromPerAligned(byte[] encodedBytes) {
    utcTotType result = new utcTotType();
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
    return "utcTotType = " + getInteger() + ";\n";
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
public static class utcWNotType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_utcWNotType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public utcWNotType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("8191"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_utcWNotType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_utcWNotType != null) {
      return ImmutableList.of(TAG_utcWNotType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new utcWNotType from encoded stream.
   */
  public static utcWNotType fromPerUnaligned(byte[] encodedBytes) {
    utcWNotType result = new utcWNotType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new utcWNotType from encoded stream.
   */
  public static utcWNotType fromPerAligned(byte[] encodedBytes) {
    utcWNotType result = new utcWNotType();
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
    return "utcWNotType = " + getInteger() + ";\n";
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
public static class utcWNlsfType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_utcWNlsfType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public utcWNlsfType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("255"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_utcWNlsfType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_utcWNlsfType != null) {
      return ImmutableList.of(TAG_utcWNlsfType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new utcWNlsfType from encoded stream.
   */
  public static utcWNlsfType fromPerUnaligned(byte[] encodedBytes) {
    utcWNlsfType result = new utcWNlsfType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new utcWNlsfType from encoded stream.
   */
  public static utcWNlsfType fromPerAligned(byte[] encodedBytes) {
    utcWNlsfType result = new utcWNlsfType();
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
    return "utcWNlsfType = " + getInteger() + ";\n";
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
public static class utcDNType extends Asn1BitString {
  //

  // defined bit positions, if any
  

  // setters
  

  // clearers
  


  private static final Asn1Tag TAG_utcDNType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public utcDNType() {
    super();
    setMinSize(4);
setMaxSize(4);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_utcDNType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_utcDNType != null) {
      return ImmutableList.of(TAG_utcDNType);
    } else {
      return Asn1BitString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new utcDNType from encoded stream.
   */
  public static utcDNType fromPerUnaligned(byte[] encodedBytes) {
    utcDNType result = new utcDNType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new utcDNType from encoded stream.
   */
  public static utcDNType fromPerAligned(byte[] encodedBytes) {
    utcDNType result = new utcDNType();
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
    return "utcDNType = " + getValue() + ";\n";
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
public static class utcDeltaTlsfType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_utcDeltaTlsfType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public utcDeltaTlsfType() {
    super();
    setValueRange(new java.math.BigInteger("-128"), new java.math.BigInteger("127"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_utcDeltaTlsfType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_utcDeltaTlsfType != null) {
      return ImmutableList.of(TAG_utcDeltaTlsfType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new utcDeltaTlsfType from encoded stream.
   */
  public static utcDeltaTlsfType fromPerUnaligned(byte[] encodedBytes) {
    utcDeltaTlsfType result = new utcDeltaTlsfType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new utcDeltaTlsfType from encoded stream.
   */
  public static utcDeltaTlsfType fromPerAligned(byte[] encodedBytes) {
    utcDeltaTlsfType result = new utcDeltaTlsfType();
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
    return "utcDeltaTlsfType = " + getInteger() + ";\n";
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
    builder.append("UTC_ModelSet2 = {\n");
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
