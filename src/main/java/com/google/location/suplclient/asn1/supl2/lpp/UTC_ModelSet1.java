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
public  class UTC_ModelSet1 extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_UTC_ModelSet1
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public UTC_ModelSet1() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_UTC_ModelSet1;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_UTC_ModelSet1 != null) {
      return ImmutableList.of(TAG_UTC_ModelSet1);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new UTC_ModelSet1 from encoded stream.
   */
  public static UTC_ModelSet1 fromPerUnaligned(byte[] encodedBytes) {
    UTC_ModelSet1 result = new UTC_ModelSet1();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new UTC_ModelSet1 from encoded stream.
   */
  public static UTC_ModelSet1 fromPerAligned(byte[] encodedBytes) {
    UTC_ModelSet1 result = new UTC_ModelSet1();
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

  
  private UTC_ModelSet1.gnss_Utc_A1Type gnss_Utc_A1_;
  public UTC_ModelSet1.gnss_Utc_A1Type getGnss_Utc_A1() {
    return gnss_Utc_A1_;
  }
  /**
   * @throws ClassCastException if value is not a UTC_ModelSet1.gnss_Utc_A1Type
   */
  public void setGnss_Utc_A1(Asn1Object value) {
    this.gnss_Utc_A1_ = (UTC_ModelSet1.gnss_Utc_A1Type) value;
  }
  public UTC_ModelSet1.gnss_Utc_A1Type setGnss_Utc_A1ToNewInstance() {
    gnss_Utc_A1_ = new UTC_ModelSet1.gnss_Utc_A1Type();
    return gnss_Utc_A1_;
  }
  
  private UTC_ModelSet1.gnss_Utc_A0Type gnss_Utc_A0_;
  public UTC_ModelSet1.gnss_Utc_A0Type getGnss_Utc_A0() {
    return gnss_Utc_A0_;
  }
  /**
   * @throws ClassCastException if value is not a UTC_ModelSet1.gnss_Utc_A0Type
   */
  public void setGnss_Utc_A0(Asn1Object value) {
    this.gnss_Utc_A0_ = (UTC_ModelSet1.gnss_Utc_A0Type) value;
  }
  public UTC_ModelSet1.gnss_Utc_A0Type setGnss_Utc_A0ToNewInstance() {
    gnss_Utc_A0_ = new UTC_ModelSet1.gnss_Utc_A0Type();
    return gnss_Utc_A0_;
  }
  
  private UTC_ModelSet1.gnss_Utc_TotType gnss_Utc_Tot_;
  public UTC_ModelSet1.gnss_Utc_TotType getGnss_Utc_Tot() {
    return gnss_Utc_Tot_;
  }
  /**
   * @throws ClassCastException if value is not a UTC_ModelSet1.gnss_Utc_TotType
   */
  public void setGnss_Utc_Tot(Asn1Object value) {
    this.gnss_Utc_Tot_ = (UTC_ModelSet1.gnss_Utc_TotType) value;
  }
  public UTC_ModelSet1.gnss_Utc_TotType setGnss_Utc_TotToNewInstance() {
    gnss_Utc_Tot_ = new UTC_ModelSet1.gnss_Utc_TotType();
    return gnss_Utc_Tot_;
  }
  
  private UTC_ModelSet1.gnss_Utc_WNtType gnss_Utc_WNt_;
  public UTC_ModelSet1.gnss_Utc_WNtType getGnss_Utc_WNt() {
    return gnss_Utc_WNt_;
  }
  /**
   * @throws ClassCastException if value is not a UTC_ModelSet1.gnss_Utc_WNtType
   */
  public void setGnss_Utc_WNt(Asn1Object value) {
    this.gnss_Utc_WNt_ = (UTC_ModelSet1.gnss_Utc_WNtType) value;
  }
  public UTC_ModelSet1.gnss_Utc_WNtType setGnss_Utc_WNtToNewInstance() {
    gnss_Utc_WNt_ = new UTC_ModelSet1.gnss_Utc_WNtType();
    return gnss_Utc_WNt_;
  }
  
  private UTC_ModelSet1.gnss_Utc_DeltaTlsType gnss_Utc_DeltaTls_;
  public UTC_ModelSet1.gnss_Utc_DeltaTlsType getGnss_Utc_DeltaTls() {
    return gnss_Utc_DeltaTls_;
  }
  /**
   * @throws ClassCastException if value is not a UTC_ModelSet1.gnss_Utc_DeltaTlsType
   */
  public void setGnss_Utc_DeltaTls(Asn1Object value) {
    this.gnss_Utc_DeltaTls_ = (UTC_ModelSet1.gnss_Utc_DeltaTlsType) value;
  }
  public UTC_ModelSet1.gnss_Utc_DeltaTlsType setGnss_Utc_DeltaTlsToNewInstance() {
    gnss_Utc_DeltaTls_ = new UTC_ModelSet1.gnss_Utc_DeltaTlsType();
    return gnss_Utc_DeltaTls_;
  }
  
  private UTC_ModelSet1.gnss_Utc_WNlsfType gnss_Utc_WNlsf_;
  public UTC_ModelSet1.gnss_Utc_WNlsfType getGnss_Utc_WNlsf() {
    return gnss_Utc_WNlsf_;
  }
  /**
   * @throws ClassCastException if value is not a UTC_ModelSet1.gnss_Utc_WNlsfType
   */
  public void setGnss_Utc_WNlsf(Asn1Object value) {
    this.gnss_Utc_WNlsf_ = (UTC_ModelSet1.gnss_Utc_WNlsfType) value;
  }
  public UTC_ModelSet1.gnss_Utc_WNlsfType setGnss_Utc_WNlsfToNewInstance() {
    gnss_Utc_WNlsf_ = new UTC_ModelSet1.gnss_Utc_WNlsfType();
    return gnss_Utc_WNlsf_;
  }
  
  private UTC_ModelSet1.gnss_Utc_DNType gnss_Utc_DN_;
  public UTC_ModelSet1.gnss_Utc_DNType getGnss_Utc_DN() {
    return gnss_Utc_DN_;
  }
  /**
   * @throws ClassCastException if value is not a UTC_ModelSet1.gnss_Utc_DNType
   */
  public void setGnss_Utc_DN(Asn1Object value) {
    this.gnss_Utc_DN_ = (UTC_ModelSet1.gnss_Utc_DNType) value;
  }
  public UTC_ModelSet1.gnss_Utc_DNType setGnss_Utc_DNToNewInstance() {
    gnss_Utc_DN_ = new UTC_ModelSet1.gnss_Utc_DNType();
    return gnss_Utc_DN_;
  }
  
  private UTC_ModelSet1.gnss_Utc_DeltaTlsfType gnss_Utc_DeltaTlsf_;
  public UTC_ModelSet1.gnss_Utc_DeltaTlsfType getGnss_Utc_DeltaTlsf() {
    return gnss_Utc_DeltaTlsf_;
  }
  /**
   * @throws ClassCastException if value is not a UTC_ModelSet1.gnss_Utc_DeltaTlsfType
   */
  public void setGnss_Utc_DeltaTlsf(Asn1Object value) {
    this.gnss_Utc_DeltaTlsf_ = (UTC_ModelSet1.gnss_Utc_DeltaTlsfType) value;
  }
  public UTC_ModelSet1.gnss_Utc_DeltaTlsfType setGnss_Utc_DeltaTlsfToNewInstance() {
    gnss_Utc_DeltaTlsf_ = new UTC_ModelSet1.gnss_Utc_DeltaTlsfType();
    return gnss_Utc_DeltaTlsf_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getGnss_Utc_A1() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_Utc_A1();
          }

          @Override public void setToNewInstance() {
            setGnss_Utc_A1ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UTC_ModelSet1.gnss_Utc_A1Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_Utc_A1 : "
                    + getGnss_Utc_A1().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getGnss_Utc_A0() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_Utc_A0();
          }

          @Override public void setToNewInstance() {
            setGnss_Utc_A0ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UTC_ModelSet1.gnss_Utc_A0Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_Utc_A0 : "
                    + getGnss_Utc_A0().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getGnss_Utc_Tot() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_Utc_Tot();
          }

          @Override public void setToNewInstance() {
            setGnss_Utc_TotToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UTC_ModelSet1.gnss_Utc_TotType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_Utc_Tot : "
                    + getGnss_Utc_Tot().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getGnss_Utc_WNt() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_Utc_WNt();
          }

          @Override public void setToNewInstance() {
            setGnss_Utc_WNtToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UTC_ModelSet1.gnss_Utc_WNtType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_Utc_WNt : "
                    + getGnss_Utc_WNt().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getGnss_Utc_DeltaTls() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_Utc_DeltaTls();
          }

          @Override public void setToNewInstance() {
            setGnss_Utc_DeltaTlsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UTC_ModelSet1.gnss_Utc_DeltaTlsType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_Utc_DeltaTls : "
                    + getGnss_Utc_DeltaTls().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getGnss_Utc_WNlsf() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_Utc_WNlsf();
          }

          @Override public void setToNewInstance() {
            setGnss_Utc_WNlsfToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UTC_ModelSet1.gnss_Utc_WNlsfType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_Utc_WNlsf : "
                    + getGnss_Utc_WNlsf().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getGnss_Utc_DN() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_Utc_DN();
          }

          @Override public void setToNewInstance() {
            setGnss_Utc_DNToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UTC_ModelSet1.gnss_Utc_DNType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_Utc_DN : "
                    + getGnss_Utc_DN().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 7);

          @Override public boolean isExplicitlySet() {
            return getGnss_Utc_DeltaTlsf() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_Utc_DeltaTlsf();
          }

          @Override public void setToNewInstance() {
            setGnss_Utc_DeltaTlsfToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UTC_ModelSet1.gnss_Utc_DeltaTlsfType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_Utc_DeltaTlsf : "
                    + getGnss_Utc_DeltaTlsf().toIndentedString(indent);
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
public static class gnss_Utc_A1Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_gnss_Utc_A1Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gnss_Utc_A1Type() {
    super();
    setValueRange(new java.math.BigInteger("-8388608"), new java.math.BigInteger("8388607"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gnss_Utc_A1Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gnss_Utc_A1Type != null) {
      return ImmutableList.of(TAG_gnss_Utc_A1Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gnss_Utc_A1Type from encoded stream.
   */
  public static gnss_Utc_A1Type fromPerUnaligned(byte[] encodedBytes) {
    gnss_Utc_A1Type result = new gnss_Utc_A1Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gnss_Utc_A1Type from encoded stream.
   */
  public static gnss_Utc_A1Type fromPerAligned(byte[] encodedBytes) {
    gnss_Utc_A1Type result = new gnss_Utc_A1Type();
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
    return "gnss_Utc_A1Type = " + getInteger() + ";\n";
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
public static class gnss_Utc_A0Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_gnss_Utc_A0Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gnss_Utc_A0Type() {
    super();
    setValueRange(new java.math.BigInteger("-2147483648"), new java.math.BigInteger("2147483647"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gnss_Utc_A0Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gnss_Utc_A0Type != null) {
      return ImmutableList.of(TAG_gnss_Utc_A0Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gnss_Utc_A0Type from encoded stream.
   */
  public static gnss_Utc_A0Type fromPerUnaligned(byte[] encodedBytes) {
    gnss_Utc_A0Type result = new gnss_Utc_A0Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gnss_Utc_A0Type from encoded stream.
   */
  public static gnss_Utc_A0Type fromPerAligned(byte[] encodedBytes) {
    gnss_Utc_A0Type result = new gnss_Utc_A0Type();
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
    return "gnss_Utc_A0Type = " + getInteger() + ";\n";
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
public static class gnss_Utc_TotType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_gnss_Utc_TotType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gnss_Utc_TotType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("255"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gnss_Utc_TotType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gnss_Utc_TotType != null) {
      return ImmutableList.of(TAG_gnss_Utc_TotType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gnss_Utc_TotType from encoded stream.
   */
  public static gnss_Utc_TotType fromPerUnaligned(byte[] encodedBytes) {
    gnss_Utc_TotType result = new gnss_Utc_TotType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gnss_Utc_TotType from encoded stream.
   */
  public static gnss_Utc_TotType fromPerAligned(byte[] encodedBytes) {
    gnss_Utc_TotType result = new gnss_Utc_TotType();
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
    return "gnss_Utc_TotType = " + getInteger() + ";\n";
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
public static class gnss_Utc_WNtType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_gnss_Utc_WNtType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gnss_Utc_WNtType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("255"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gnss_Utc_WNtType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gnss_Utc_WNtType != null) {
      return ImmutableList.of(TAG_gnss_Utc_WNtType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gnss_Utc_WNtType from encoded stream.
   */
  public static gnss_Utc_WNtType fromPerUnaligned(byte[] encodedBytes) {
    gnss_Utc_WNtType result = new gnss_Utc_WNtType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gnss_Utc_WNtType from encoded stream.
   */
  public static gnss_Utc_WNtType fromPerAligned(byte[] encodedBytes) {
    gnss_Utc_WNtType result = new gnss_Utc_WNtType();
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
    return "gnss_Utc_WNtType = " + getInteger() + ";\n";
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
public static class gnss_Utc_DeltaTlsType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_gnss_Utc_DeltaTlsType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gnss_Utc_DeltaTlsType() {
    super();
    setValueRange(new java.math.BigInteger("-128"), new java.math.BigInteger("127"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gnss_Utc_DeltaTlsType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gnss_Utc_DeltaTlsType != null) {
      return ImmutableList.of(TAG_gnss_Utc_DeltaTlsType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gnss_Utc_DeltaTlsType from encoded stream.
   */
  public static gnss_Utc_DeltaTlsType fromPerUnaligned(byte[] encodedBytes) {
    gnss_Utc_DeltaTlsType result = new gnss_Utc_DeltaTlsType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gnss_Utc_DeltaTlsType from encoded stream.
   */
  public static gnss_Utc_DeltaTlsType fromPerAligned(byte[] encodedBytes) {
    gnss_Utc_DeltaTlsType result = new gnss_Utc_DeltaTlsType();
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
    return "gnss_Utc_DeltaTlsType = " + getInteger() + ";\n";
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
public static class gnss_Utc_WNlsfType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_gnss_Utc_WNlsfType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gnss_Utc_WNlsfType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("255"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gnss_Utc_WNlsfType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gnss_Utc_WNlsfType != null) {
      return ImmutableList.of(TAG_gnss_Utc_WNlsfType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gnss_Utc_WNlsfType from encoded stream.
   */
  public static gnss_Utc_WNlsfType fromPerUnaligned(byte[] encodedBytes) {
    gnss_Utc_WNlsfType result = new gnss_Utc_WNlsfType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gnss_Utc_WNlsfType from encoded stream.
   */
  public static gnss_Utc_WNlsfType fromPerAligned(byte[] encodedBytes) {
    gnss_Utc_WNlsfType result = new gnss_Utc_WNlsfType();
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
    return "gnss_Utc_WNlsfType = " + getInteger() + ";\n";
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
public static class gnss_Utc_DNType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_gnss_Utc_DNType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gnss_Utc_DNType() {
    super();
    setValueRange(new java.math.BigInteger("-128"), new java.math.BigInteger("127"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gnss_Utc_DNType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gnss_Utc_DNType != null) {
      return ImmutableList.of(TAG_gnss_Utc_DNType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gnss_Utc_DNType from encoded stream.
   */
  public static gnss_Utc_DNType fromPerUnaligned(byte[] encodedBytes) {
    gnss_Utc_DNType result = new gnss_Utc_DNType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gnss_Utc_DNType from encoded stream.
   */
  public static gnss_Utc_DNType fromPerAligned(byte[] encodedBytes) {
    gnss_Utc_DNType result = new gnss_Utc_DNType();
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
    return "gnss_Utc_DNType = " + getInteger() + ";\n";
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
public static class gnss_Utc_DeltaTlsfType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_gnss_Utc_DeltaTlsfType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gnss_Utc_DeltaTlsfType() {
    super();
    setValueRange(new java.math.BigInteger("-128"), new java.math.BigInteger("127"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gnss_Utc_DeltaTlsfType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gnss_Utc_DeltaTlsfType != null) {
      return ImmutableList.of(TAG_gnss_Utc_DeltaTlsfType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gnss_Utc_DeltaTlsfType from encoded stream.
   */
  public static gnss_Utc_DeltaTlsfType fromPerUnaligned(byte[] encodedBytes) {
    gnss_Utc_DeltaTlsfType result = new gnss_Utc_DeltaTlsfType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gnss_Utc_DeltaTlsfType from encoded stream.
   */
  public static gnss_Utc_DeltaTlsfType fromPerAligned(byte[] encodedBytes) {
    gnss_Utc_DeltaTlsfType result = new gnss_Utc_DeltaTlsfType();
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
    return "gnss_Utc_DeltaTlsfType = " + getInteger() + ";\n";
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
    builder.append("UTC_ModelSet1 = {\n");
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
