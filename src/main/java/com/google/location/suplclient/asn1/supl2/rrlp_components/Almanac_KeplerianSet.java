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
public  class Almanac_KeplerianSet extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_Almanac_KeplerianSet
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public Almanac_KeplerianSet() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_Almanac_KeplerianSet;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_Almanac_KeplerianSet != null) {
      return ImmutableList.of(TAG_Almanac_KeplerianSet);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new Almanac_KeplerianSet from encoded stream.
   */
  public static Almanac_KeplerianSet fromPerUnaligned(byte[] encodedBytes) {
    Almanac_KeplerianSet result = new Almanac_KeplerianSet();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new Almanac_KeplerianSet from encoded stream.
   */
  public static Almanac_KeplerianSet fromPerAligned(byte[] encodedBytes) {
    Almanac_KeplerianSet result = new Almanac_KeplerianSet();
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

  
  private SVID svID_;
  public SVID getSvID() {
    return svID_;
  }
  /**
   * @throws ClassCastException if value is not a SVID
   */
  public void setSvID(Asn1Object value) {
    this.svID_ = (SVID) value;
  }
  public SVID setSvIDToNewInstance() {
    svID_ = new SVID();
    return svID_;
  }
  
  private Almanac_KeplerianSet.kepAlmanacEType kepAlmanacE_;
  public Almanac_KeplerianSet.kepAlmanacEType getKepAlmanacE() {
    return kepAlmanacE_;
  }
  /**
   * @throws ClassCastException if value is not a Almanac_KeplerianSet.kepAlmanacEType
   */
  public void setKepAlmanacE(Asn1Object value) {
    this.kepAlmanacE_ = (Almanac_KeplerianSet.kepAlmanacEType) value;
  }
  public Almanac_KeplerianSet.kepAlmanacEType setKepAlmanacEToNewInstance() {
    kepAlmanacE_ = new Almanac_KeplerianSet.kepAlmanacEType();
    return kepAlmanacE_;
  }
  
  private Almanac_KeplerianSet.kepAlmanacDeltaIType kepAlmanacDeltaI_;
  public Almanac_KeplerianSet.kepAlmanacDeltaIType getKepAlmanacDeltaI() {
    return kepAlmanacDeltaI_;
  }
  /**
   * @throws ClassCastException if value is not a Almanac_KeplerianSet.kepAlmanacDeltaIType
   */
  public void setKepAlmanacDeltaI(Asn1Object value) {
    this.kepAlmanacDeltaI_ = (Almanac_KeplerianSet.kepAlmanacDeltaIType) value;
  }
  public Almanac_KeplerianSet.kepAlmanacDeltaIType setKepAlmanacDeltaIToNewInstance() {
    kepAlmanacDeltaI_ = new Almanac_KeplerianSet.kepAlmanacDeltaIType();
    return kepAlmanacDeltaI_;
  }
  
  private Almanac_KeplerianSet.kepAlmanacOmegaDotType kepAlmanacOmegaDot_;
  public Almanac_KeplerianSet.kepAlmanacOmegaDotType getKepAlmanacOmegaDot() {
    return kepAlmanacOmegaDot_;
  }
  /**
   * @throws ClassCastException if value is not a Almanac_KeplerianSet.kepAlmanacOmegaDotType
   */
  public void setKepAlmanacOmegaDot(Asn1Object value) {
    this.kepAlmanacOmegaDot_ = (Almanac_KeplerianSet.kepAlmanacOmegaDotType) value;
  }
  public Almanac_KeplerianSet.kepAlmanacOmegaDotType setKepAlmanacOmegaDotToNewInstance() {
    kepAlmanacOmegaDot_ = new Almanac_KeplerianSet.kepAlmanacOmegaDotType();
    return kepAlmanacOmegaDot_;
  }
  
  private Almanac_KeplerianSet.kepSVHealthType kepSVHealth_;
  public Almanac_KeplerianSet.kepSVHealthType getKepSVHealth() {
    return kepSVHealth_;
  }
  /**
   * @throws ClassCastException if value is not a Almanac_KeplerianSet.kepSVHealthType
   */
  public void setKepSVHealth(Asn1Object value) {
    this.kepSVHealth_ = (Almanac_KeplerianSet.kepSVHealthType) value;
  }
  public Almanac_KeplerianSet.kepSVHealthType setKepSVHealthToNewInstance() {
    kepSVHealth_ = new Almanac_KeplerianSet.kepSVHealthType();
    return kepSVHealth_;
  }
  
  private Almanac_KeplerianSet.kepAlmanacAPowerHalfType kepAlmanacAPowerHalf_;
  public Almanac_KeplerianSet.kepAlmanacAPowerHalfType getKepAlmanacAPowerHalf() {
    return kepAlmanacAPowerHalf_;
  }
  /**
   * @throws ClassCastException if value is not a Almanac_KeplerianSet.kepAlmanacAPowerHalfType
   */
  public void setKepAlmanacAPowerHalf(Asn1Object value) {
    this.kepAlmanacAPowerHalf_ = (Almanac_KeplerianSet.kepAlmanacAPowerHalfType) value;
  }
  public Almanac_KeplerianSet.kepAlmanacAPowerHalfType setKepAlmanacAPowerHalfToNewInstance() {
    kepAlmanacAPowerHalf_ = new Almanac_KeplerianSet.kepAlmanacAPowerHalfType();
    return kepAlmanacAPowerHalf_;
  }
  
  private Almanac_KeplerianSet.kepAlmanacOmega0Type kepAlmanacOmega0_;
  public Almanac_KeplerianSet.kepAlmanacOmega0Type getKepAlmanacOmega0() {
    return kepAlmanacOmega0_;
  }
  /**
   * @throws ClassCastException if value is not a Almanac_KeplerianSet.kepAlmanacOmega0Type
   */
  public void setKepAlmanacOmega0(Asn1Object value) {
    this.kepAlmanacOmega0_ = (Almanac_KeplerianSet.kepAlmanacOmega0Type) value;
  }
  public Almanac_KeplerianSet.kepAlmanacOmega0Type setKepAlmanacOmega0ToNewInstance() {
    kepAlmanacOmega0_ = new Almanac_KeplerianSet.kepAlmanacOmega0Type();
    return kepAlmanacOmega0_;
  }
  
  private Almanac_KeplerianSet.kepAlmanacWType kepAlmanacW_;
  public Almanac_KeplerianSet.kepAlmanacWType getKepAlmanacW() {
    return kepAlmanacW_;
  }
  /**
   * @throws ClassCastException if value is not a Almanac_KeplerianSet.kepAlmanacWType
   */
  public void setKepAlmanacW(Asn1Object value) {
    this.kepAlmanacW_ = (Almanac_KeplerianSet.kepAlmanacWType) value;
  }
  public Almanac_KeplerianSet.kepAlmanacWType setKepAlmanacWToNewInstance() {
    kepAlmanacW_ = new Almanac_KeplerianSet.kepAlmanacWType();
    return kepAlmanacW_;
  }
  
  private Almanac_KeplerianSet.kepAlmanacM0Type kepAlmanacM0_;
  public Almanac_KeplerianSet.kepAlmanacM0Type getKepAlmanacM0() {
    return kepAlmanacM0_;
  }
  /**
   * @throws ClassCastException if value is not a Almanac_KeplerianSet.kepAlmanacM0Type
   */
  public void setKepAlmanacM0(Asn1Object value) {
    this.kepAlmanacM0_ = (Almanac_KeplerianSet.kepAlmanacM0Type) value;
  }
  public Almanac_KeplerianSet.kepAlmanacM0Type setKepAlmanacM0ToNewInstance() {
    kepAlmanacM0_ = new Almanac_KeplerianSet.kepAlmanacM0Type();
    return kepAlmanacM0_;
  }
  
  private Almanac_KeplerianSet.kepAlmanacAF0Type kepAlmanacAF0_;
  public Almanac_KeplerianSet.kepAlmanacAF0Type getKepAlmanacAF0() {
    return kepAlmanacAF0_;
  }
  /**
   * @throws ClassCastException if value is not a Almanac_KeplerianSet.kepAlmanacAF0Type
   */
  public void setKepAlmanacAF0(Asn1Object value) {
    this.kepAlmanacAF0_ = (Almanac_KeplerianSet.kepAlmanacAF0Type) value;
  }
  public Almanac_KeplerianSet.kepAlmanacAF0Type setKepAlmanacAF0ToNewInstance() {
    kepAlmanacAF0_ = new Almanac_KeplerianSet.kepAlmanacAF0Type();
    return kepAlmanacAF0_;
  }
  
  private Almanac_KeplerianSet.kepAlmanacAF1Type kepAlmanacAF1_;
  public Almanac_KeplerianSet.kepAlmanacAF1Type getKepAlmanacAF1() {
    return kepAlmanacAF1_;
  }
  /**
   * @throws ClassCastException if value is not a Almanac_KeplerianSet.kepAlmanacAF1Type
   */
  public void setKepAlmanacAF1(Asn1Object value) {
    this.kepAlmanacAF1_ = (Almanac_KeplerianSet.kepAlmanacAF1Type) value;
  }
  public Almanac_KeplerianSet.kepAlmanacAF1Type setKepAlmanacAF1ToNewInstance() {
    kepAlmanacAF1_ = new Almanac_KeplerianSet.kepAlmanacAF1Type();
    return kepAlmanacAF1_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getSvID() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getSvID();
          }

          @Override public void setToNewInstance() {
            setSvIDToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SVID.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "svID : "
                    + getSvID().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getKepAlmanacE() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getKepAlmanacE();
          }

          @Override public void setToNewInstance() {
            setKepAlmanacEToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Almanac_KeplerianSet.kepAlmanacEType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "kepAlmanacE : "
                    + getKepAlmanacE().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getKepAlmanacDeltaI() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getKepAlmanacDeltaI();
          }

          @Override public void setToNewInstance() {
            setKepAlmanacDeltaIToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Almanac_KeplerianSet.kepAlmanacDeltaIType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "kepAlmanacDeltaI : "
                    + getKepAlmanacDeltaI().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getKepAlmanacOmegaDot() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getKepAlmanacOmegaDot();
          }

          @Override public void setToNewInstance() {
            setKepAlmanacOmegaDotToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Almanac_KeplerianSet.kepAlmanacOmegaDotType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "kepAlmanacOmegaDot : "
                    + getKepAlmanacOmegaDot().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getKepSVHealth() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getKepSVHealth();
          }

          @Override public void setToNewInstance() {
            setKepSVHealthToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Almanac_KeplerianSet.kepSVHealthType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "kepSVHealth : "
                    + getKepSVHealth().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getKepAlmanacAPowerHalf() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getKepAlmanacAPowerHalf();
          }

          @Override public void setToNewInstance() {
            setKepAlmanacAPowerHalfToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Almanac_KeplerianSet.kepAlmanacAPowerHalfType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "kepAlmanacAPowerHalf : "
                    + getKepAlmanacAPowerHalf().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getKepAlmanacOmega0() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getKepAlmanacOmega0();
          }

          @Override public void setToNewInstance() {
            setKepAlmanacOmega0ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Almanac_KeplerianSet.kepAlmanacOmega0Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "kepAlmanacOmega0 : "
                    + getKepAlmanacOmega0().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 7);

          @Override public boolean isExplicitlySet() {
            return getKepAlmanacW() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getKepAlmanacW();
          }

          @Override public void setToNewInstance() {
            setKepAlmanacWToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Almanac_KeplerianSet.kepAlmanacWType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "kepAlmanacW : "
                    + getKepAlmanacW().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 8);

          @Override public boolean isExplicitlySet() {
            return getKepAlmanacM0() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getKepAlmanacM0();
          }

          @Override public void setToNewInstance() {
            setKepAlmanacM0ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Almanac_KeplerianSet.kepAlmanacM0Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "kepAlmanacM0 : "
                    + getKepAlmanacM0().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 9);

          @Override public boolean isExplicitlySet() {
            return getKepAlmanacAF0() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getKepAlmanacAF0();
          }

          @Override public void setToNewInstance() {
            setKepAlmanacAF0ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Almanac_KeplerianSet.kepAlmanacAF0Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "kepAlmanacAF0 : "
                    + getKepAlmanacAF0().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 10);

          @Override public boolean isExplicitlySet() {
            return getKepAlmanacAF1() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getKepAlmanacAF1();
          }

          @Override public void setToNewInstance() {
            setKepAlmanacAF1ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Almanac_KeplerianSet.kepAlmanacAF1Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "kepAlmanacAF1 : "
                    + getKepAlmanacAF1().toIndentedString(indent);
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
public static class kepAlmanacEType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_kepAlmanacEType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public kepAlmanacEType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("2047"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_kepAlmanacEType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_kepAlmanacEType != null) {
      return ImmutableList.of(TAG_kepAlmanacEType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new kepAlmanacEType from encoded stream.
   */
  public static kepAlmanacEType fromPerUnaligned(byte[] encodedBytes) {
    kepAlmanacEType result = new kepAlmanacEType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new kepAlmanacEType from encoded stream.
   */
  public static kepAlmanacEType fromPerAligned(byte[] encodedBytes) {
    kepAlmanacEType result = new kepAlmanacEType();
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
    return "kepAlmanacEType = " + getInteger() + ";\n";
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
public static class kepAlmanacDeltaIType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_kepAlmanacDeltaIType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public kepAlmanacDeltaIType() {
    super();
    setValueRange(new java.math.BigInteger("-1024"), new java.math.BigInteger("1023"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_kepAlmanacDeltaIType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_kepAlmanacDeltaIType != null) {
      return ImmutableList.of(TAG_kepAlmanacDeltaIType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new kepAlmanacDeltaIType from encoded stream.
   */
  public static kepAlmanacDeltaIType fromPerUnaligned(byte[] encodedBytes) {
    kepAlmanacDeltaIType result = new kepAlmanacDeltaIType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new kepAlmanacDeltaIType from encoded stream.
   */
  public static kepAlmanacDeltaIType fromPerAligned(byte[] encodedBytes) {
    kepAlmanacDeltaIType result = new kepAlmanacDeltaIType();
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
    return "kepAlmanacDeltaIType = " + getInteger() + ";\n";
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
public static class kepAlmanacOmegaDotType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_kepAlmanacOmegaDotType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public kepAlmanacOmegaDotType() {
    super();
    setValueRange(new java.math.BigInteger("-1024"), new java.math.BigInteger("1023"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_kepAlmanacOmegaDotType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_kepAlmanacOmegaDotType != null) {
      return ImmutableList.of(TAG_kepAlmanacOmegaDotType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new kepAlmanacOmegaDotType from encoded stream.
   */
  public static kepAlmanacOmegaDotType fromPerUnaligned(byte[] encodedBytes) {
    kepAlmanacOmegaDotType result = new kepAlmanacOmegaDotType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new kepAlmanacOmegaDotType from encoded stream.
   */
  public static kepAlmanacOmegaDotType fromPerAligned(byte[] encodedBytes) {
    kepAlmanacOmegaDotType result = new kepAlmanacOmegaDotType();
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
    return "kepAlmanacOmegaDotType = " + getInteger() + ";\n";
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
public static class kepSVHealthType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_kepSVHealthType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public kepSVHealthType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("15"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_kepSVHealthType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_kepSVHealthType != null) {
      return ImmutableList.of(TAG_kepSVHealthType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new kepSVHealthType from encoded stream.
   */
  public static kepSVHealthType fromPerUnaligned(byte[] encodedBytes) {
    kepSVHealthType result = new kepSVHealthType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new kepSVHealthType from encoded stream.
   */
  public static kepSVHealthType fromPerAligned(byte[] encodedBytes) {
    kepSVHealthType result = new kepSVHealthType();
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
    return "kepSVHealthType = " + getInteger() + ";\n";
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
public static class kepAlmanacAPowerHalfType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_kepAlmanacAPowerHalfType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public kepAlmanacAPowerHalfType() {
    super();
    setValueRange(new java.math.BigInteger("-65536"), new java.math.BigInteger("65535"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_kepAlmanacAPowerHalfType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_kepAlmanacAPowerHalfType != null) {
      return ImmutableList.of(TAG_kepAlmanacAPowerHalfType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new kepAlmanacAPowerHalfType from encoded stream.
   */
  public static kepAlmanacAPowerHalfType fromPerUnaligned(byte[] encodedBytes) {
    kepAlmanacAPowerHalfType result = new kepAlmanacAPowerHalfType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new kepAlmanacAPowerHalfType from encoded stream.
   */
  public static kepAlmanacAPowerHalfType fromPerAligned(byte[] encodedBytes) {
    kepAlmanacAPowerHalfType result = new kepAlmanacAPowerHalfType();
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
    return "kepAlmanacAPowerHalfType = " + getInteger() + ";\n";
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
public static class kepAlmanacOmega0Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_kepAlmanacOmega0Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public kepAlmanacOmega0Type() {
    super();
    setValueRange(new java.math.BigInteger("-32768"), new java.math.BigInteger("32767"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_kepAlmanacOmega0Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_kepAlmanacOmega0Type != null) {
      return ImmutableList.of(TAG_kepAlmanacOmega0Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new kepAlmanacOmega0Type from encoded stream.
   */
  public static kepAlmanacOmega0Type fromPerUnaligned(byte[] encodedBytes) {
    kepAlmanacOmega0Type result = new kepAlmanacOmega0Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new kepAlmanacOmega0Type from encoded stream.
   */
  public static kepAlmanacOmega0Type fromPerAligned(byte[] encodedBytes) {
    kepAlmanacOmega0Type result = new kepAlmanacOmega0Type();
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
    return "kepAlmanacOmega0Type = " + getInteger() + ";\n";
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
public static class kepAlmanacWType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_kepAlmanacWType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public kepAlmanacWType() {
    super();
    setValueRange(new java.math.BigInteger("-32768"), new java.math.BigInteger("32767"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_kepAlmanacWType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_kepAlmanacWType != null) {
      return ImmutableList.of(TAG_kepAlmanacWType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new kepAlmanacWType from encoded stream.
   */
  public static kepAlmanacWType fromPerUnaligned(byte[] encodedBytes) {
    kepAlmanacWType result = new kepAlmanacWType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new kepAlmanacWType from encoded stream.
   */
  public static kepAlmanacWType fromPerAligned(byte[] encodedBytes) {
    kepAlmanacWType result = new kepAlmanacWType();
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
    return "kepAlmanacWType = " + getInteger() + ";\n";
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
public static class kepAlmanacM0Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_kepAlmanacM0Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public kepAlmanacM0Type() {
    super();
    setValueRange(new java.math.BigInteger("-32768"), new java.math.BigInteger("32767"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_kepAlmanacM0Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_kepAlmanacM0Type != null) {
      return ImmutableList.of(TAG_kepAlmanacM0Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new kepAlmanacM0Type from encoded stream.
   */
  public static kepAlmanacM0Type fromPerUnaligned(byte[] encodedBytes) {
    kepAlmanacM0Type result = new kepAlmanacM0Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new kepAlmanacM0Type from encoded stream.
   */
  public static kepAlmanacM0Type fromPerAligned(byte[] encodedBytes) {
    kepAlmanacM0Type result = new kepAlmanacM0Type();
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
    return "kepAlmanacM0Type = " + getInteger() + ";\n";
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
public static class kepAlmanacAF0Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_kepAlmanacAF0Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public kepAlmanacAF0Type() {
    super();
    setValueRange(new java.math.BigInteger("-8192"), new java.math.BigInteger("8191"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_kepAlmanacAF0Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_kepAlmanacAF0Type != null) {
      return ImmutableList.of(TAG_kepAlmanacAF0Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new kepAlmanacAF0Type from encoded stream.
   */
  public static kepAlmanacAF0Type fromPerUnaligned(byte[] encodedBytes) {
    kepAlmanacAF0Type result = new kepAlmanacAF0Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new kepAlmanacAF0Type from encoded stream.
   */
  public static kepAlmanacAF0Type fromPerAligned(byte[] encodedBytes) {
    kepAlmanacAF0Type result = new kepAlmanacAF0Type();
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
    return "kepAlmanacAF0Type = " + getInteger() + ";\n";
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
public static class kepAlmanacAF1Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_kepAlmanacAF1Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public kepAlmanacAF1Type() {
    super();
    setValueRange(new java.math.BigInteger("-1024"), new java.math.BigInteger("1023"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_kepAlmanacAF1Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_kepAlmanacAF1Type != null) {
      return ImmutableList.of(TAG_kepAlmanacAF1Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new kepAlmanacAF1Type from encoded stream.
   */
  public static kepAlmanacAF1Type fromPerUnaligned(byte[] encodedBytes) {
    kepAlmanacAF1Type result = new kepAlmanacAF1Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new kepAlmanacAF1Type from encoded stream.
   */
  public static kepAlmanacAF1Type fromPerAligned(byte[] encodedBytes) {
    kepAlmanacAF1Type result = new kepAlmanacAF1Type();
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
    return "kepAlmanacAF1Type = " + getInteger() + ";\n";
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
    builder.append("Almanac_KeplerianSet = {\n");
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
