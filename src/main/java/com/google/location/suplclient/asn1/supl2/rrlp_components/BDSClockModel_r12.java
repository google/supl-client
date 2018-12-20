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
public  class BDSClockModel_r12 extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_BDSClockModel_r12
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public BDSClockModel_r12() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_BDSClockModel_r12;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_BDSClockModel_r12 != null) {
      return ImmutableList.of(TAG_BDSClockModel_r12);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new BDSClockModel_r12 from encoded stream.
   */
  public static BDSClockModel_r12 fromPerUnaligned(byte[] encodedBytes) {
    BDSClockModel_r12 result = new BDSClockModel_r12();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new BDSClockModel_r12 from encoded stream.
   */
  public static BDSClockModel_r12 fromPerAligned(byte[] encodedBytes) {
    BDSClockModel_r12 result = new BDSClockModel_r12();
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

  
  private BDSClockModel_r12.bdsAODC_r12Type bdsAODC_r12_;
  public BDSClockModel_r12.bdsAODC_r12Type getBdsAODC_r12() {
    return bdsAODC_r12_;
  }
  /**
   * @throws ClassCastException if value is not a BDSClockModel_r12.bdsAODC_r12Type
   */
  public void setBdsAODC_r12(Asn1Object value) {
    this.bdsAODC_r12_ = (BDSClockModel_r12.bdsAODC_r12Type) value;
  }
  public BDSClockModel_r12.bdsAODC_r12Type setBdsAODC_r12ToNewInstance() {
    bdsAODC_r12_ = new BDSClockModel_r12.bdsAODC_r12Type();
    return bdsAODC_r12_;
  }
  
  private BDSClockModel_r12.bdsToc_r12Type bdsToc_r12_;
  public BDSClockModel_r12.bdsToc_r12Type getBdsToc_r12() {
    return bdsToc_r12_;
  }
  /**
   * @throws ClassCastException if value is not a BDSClockModel_r12.bdsToc_r12Type
   */
  public void setBdsToc_r12(Asn1Object value) {
    this.bdsToc_r12_ = (BDSClockModel_r12.bdsToc_r12Type) value;
  }
  public BDSClockModel_r12.bdsToc_r12Type setBdsToc_r12ToNewInstance() {
    bdsToc_r12_ = new BDSClockModel_r12.bdsToc_r12Type();
    return bdsToc_r12_;
  }
  
  private BDSClockModel_r12.bdsA0_r12Type bdsA0_r12_;
  public BDSClockModel_r12.bdsA0_r12Type getBdsA0_r12() {
    return bdsA0_r12_;
  }
  /**
   * @throws ClassCastException if value is not a BDSClockModel_r12.bdsA0_r12Type
   */
  public void setBdsA0_r12(Asn1Object value) {
    this.bdsA0_r12_ = (BDSClockModel_r12.bdsA0_r12Type) value;
  }
  public BDSClockModel_r12.bdsA0_r12Type setBdsA0_r12ToNewInstance() {
    bdsA0_r12_ = new BDSClockModel_r12.bdsA0_r12Type();
    return bdsA0_r12_;
  }
  
  private BDSClockModel_r12.bdsA1_r12Type bdsA1_r12_;
  public BDSClockModel_r12.bdsA1_r12Type getBdsA1_r12() {
    return bdsA1_r12_;
  }
  /**
   * @throws ClassCastException if value is not a BDSClockModel_r12.bdsA1_r12Type
   */
  public void setBdsA1_r12(Asn1Object value) {
    this.bdsA1_r12_ = (BDSClockModel_r12.bdsA1_r12Type) value;
  }
  public BDSClockModel_r12.bdsA1_r12Type setBdsA1_r12ToNewInstance() {
    bdsA1_r12_ = new BDSClockModel_r12.bdsA1_r12Type();
    return bdsA1_r12_;
  }
  
  private BDSClockModel_r12.bdsA2_r12Type bdsA2_r12_;
  public BDSClockModel_r12.bdsA2_r12Type getBdsA2_r12() {
    return bdsA2_r12_;
  }
  /**
   * @throws ClassCastException if value is not a BDSClockModel_r12.bdsA2_r12Type
   */
  public void setBdsA2_r12(Asn1Object value) {
    this.bdsA2_r12_ = (BDSClockModel_r12.bdsA2_r12Type) value;
  }
  public BDSClockModel_r12.bdsA2_r12Type setBdsA2_r12ToNewInstance() {
    bdsA2_r12_ = new BDSClockModel_r12.bdsA2_r12Type();
    return bdsA2_r12_;
  }
  
  private BDSClockModel_r12.bdsTgd1_r12Type bdsTgd1_r12_;
  public BDSClockModel_r12.bdsTgd1_r12Type getBdsTgd1_r12() {
    return bdsTgd1_r12_;
  }
  /**
   * @throws ClassCastException if value is not a BDSClockModel_r12.bdsTgd1_r12Type
   */
  public void setBdsTgd1_r12(Asn1Object value) {
    this.bdsTgd1_r12_ = (BDSClockModel_r12.bdsTgd1_r12Type) value;
  }
  public BDSClockModel_r12.bdsTgd1_r12Type setBdsTgd1_r12ToNewInstance() {
    bdsTgd1_r12_ = new BDSClockModel_r12.bdsTgd1_r12Type();
    return bdsTgd1_r12_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getBdsAODC_r12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBdsAODC_r12();
          }

          @Override public void setToNewInstance() {
            setBdsAODC_r12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? BDSClockModel_r12.bdsAODC_r12Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bdsAODC_r12 : "
                    + getBdsAODC_r12().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getBdsToc_r12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBdsToc_r12();
          }

          @Override public void setToNewInstance() {
            setBdsToc_r12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? BDSClockModel_r12.bdsToc_r12Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bdsToc_r12 : "
                    + getBdsToc_r12().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getBdsA0_r12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBdsA0_r12();
          }

          @Override public void setToNewInstance() {
            setBdsA0_r12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? BDSClockModel_r12.bdsA0_r12Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bdsA0_r12 : "
                    + getBdsA0_r12().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getBdsA1_r12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBdsA1_r12();
          }

          @Override public void setToNewInstance() {
            setBdsA1_r12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? BDSClockModel_r12.bdsA1_r12Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bdsA1_r12 : "
                    + getBdsA1_r12().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getBdsA2_r12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBdsA2_r12();
          }

          @Override public void setToNewInstance() {
            setBdsA2_r12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? BDSClockModel_r12.bdsA2_r12Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bdsA2_r12 : "
                    + getBdsA2_r12().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getBdsTgd1_r12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBdsTgd1_r12();
          }

          @Override public void setToNewInstance() {
            setBdsTgd1_r12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? BDSClockModel_r12.bdsTgd1_r12Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bdsTgd1_r12 : "
                    + getBdsTgd1_r12().toIndentedString(indent);
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
public static class bdsAODC_r12Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bdsAODC_r12Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bdsAODC_r12Type() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("31"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bdsAODC_r12Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bdsAODC_r12Type != null) {
      return ImmutableList.of(TAG_bdsAODC_r12Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bdsAODC_r12Type from encoded stream.
   */
  public static bdsAODC_r12Type fromPerUnaligned(byte[] encodedBytes) {
    bdsAODC_r12Type result = new bdsAODC_r12Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bdsAODC_r12Type from encoded stream.
   */
  public static bdsAODC_r12Type fromPerAligned(byte[] encodedBytes) {
    bdsAODC_r12Type result = new bdsAODC_r12Type();
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
    return "bdsAODC_r12Type = " + getInteger() + ";\n";
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
public static class bdsToc_r12Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bdsToc_r12Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bdsToc_r12Type() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("131071"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bdsToc_r12Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bdsToc_r12Type != null) {
      return ImmutableList.of(TAG_bdsToc_r12Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bdsToc_r12Type from encoded stream.
   */
  public static bdsToc_r12Type fromPerUnaligned(byte[] encodedBytes) {
    bdsToc_r12Type result = new bdsToc_r12Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bdsToc_r12Type from encoded stream.
   */
  public static bdsToc_r12Type fromPerAligned(byte[] encodedBytes) {
    bdsToc_r12Type result = new bdsToc_r12Type();
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
    return "bdsToc_r12Type = " + getInteger() + ";\n";
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
public static class bdsA0_r12Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bdsA0_r12Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bdsA0_r12Type() {
    super();
    setValueRange(new java.math.BigInteger("-8388608"), new java.math.BigInteger("8388607"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bdsA0_r12Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bdsA0_r12Type != null) {
      return ImmutableList.of(TAG_bdsA0_r12Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bdsA0_r12Type from encoded stream.
   */
  public static bdsA0_r12Type fromPerUnaligned(byte[] encodedBytes) {
    bdsA0_r12Type result = new bdsA0_r12Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bdsA0_r12Type from encoded stream.
   */
  public static bdsA0_r12Type fromPerAligned(byte[] encodedBytes) {
    bdsA0_r12Type result = new bdsA0_r12Type();
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
    return "bdsA0_r12Type = " + getInteger() + ";\n";
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
public static class bdsA1_r12Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bdsA1_r12Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bdsA1_r12Type() {
    super();
    setValueRange(new java.math.BigInteger("-2097152"), new java.math.BigInteger("2097151"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bdsA1_r12Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bdsA1_r12Type != null) {
      return ImmutableList.of(TAG_bdsA1_r12Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bdsA1_r12Type from encoded stream.
   */
  public static bdsA1_r12Type fromPerUnaligned(byte[] encodedBytes) {
    bdsA1_r12Type result = new bdsA1_r12Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bdsA1_r12Type from encoded stream.
   */
  public static bdsA1_r12Type fromPerAligned(byte[] encodedBytes) {
    bdsA1_r12Type result = new bdsA1_r12Type();
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
    return "bdsA1_r12Type = " + getInteger() + ";\n";
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
public static class bdsA2_r12Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bdsA2_r12Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bdsA2_r12Type() {
    super();
    setValueRange(new java.math.BigInteger("-1024"), new java.math.BigInteger("1023"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bdsA2_r12Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bdsA2_r12Type != null) {
      return ImmutableList.of(TAG_bdsA2_r12Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bdsA2_r12Type from encoded stream.
   */
  public static bdsA2_r12Type fromPerUnaligned(byte[] encodedBytes) {
    bdsA2_r12Type result = new bdsA2_r12Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bdsA2_r12Type from encoded stream.
   */
  public static bdsA2_r12Type fromPerAligned(byte[] encodedBytes) {
    bdsA2_r12Type result = new bdsA2_r12Type();
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
    return "bdsA2_r12Type = " + getInteger() + ";\n";
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
public static class bdsTgd1_r12Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bdsTgd1_r12Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bdsTgd1_r12Type() {
    super();
    setValueRange(new java.math.BigInteger("-512"), new java.math.BigInteger("511"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bdsTgd1_r12Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bdsTgd1_r12Type != null) {
      return ImmutableList.of(TAG_bdsTgd1_r12Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bdsTgd1_r12Type from encoded stream.
   */
  public static bdsTgd1_r12Type fromPerUnaligned(byte[] encodedBytes) {
    bdsTgd1_r12Type result = new bdsTgd1_r12Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bdsTgd1_r12Type from encoded stream.
   */
  public static bdsTgd1_r12Type fromPerAligned(byte[] encodedBytes) {
    bdsTgd1_r12Type result = new bdsTgd1_r12Type();
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
    return "bdsTgd1_r12Type = " + getInteger() + ";\n";
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
    builder.append("BDSClockModel_r12 = {\n");
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
