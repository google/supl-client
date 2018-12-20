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
import com.google.location.suplclient.asn1.base.Asn1Boolean;
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
public  class Almanac_ReducedKeplerianSet extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_Almanac_ReducedKeplerianSet
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public Almanac_ReducedKeplerianSet() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_Almanac_ReducedKeplerianSet;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_Almanac_ReducedKeplerianSet != null) {
      return ImmutableList.of(TAG_Almanac_ReducedKeplerianSet);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new Almanac_ReducedKeplerianSet from encoded stream.
   */
  public static Almanac_ReducedKeplerianSet fromPerUnaligned(byte[] encodedBytes) {
    Almanac_ReducedKeplerianSet result = new Almanac_ReducedKeplerianSet();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new Almanac_ReducedKeplerianSet from encoded stream.
   */
  public static Almanac_ReducedKeplerianSet fromPerAligned(byte[] encodedBytes) {
    Almanac_ReducedKeplerianSet result = new Almanac_ReducedKeplerianSet();
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
  
  private Almanac_ReducedKeplerianSet.redAlmDeltaAType redAlmDeltaA_;
  public Almanac_ReducedKeplerianSet.redAlmDeltaAType getRedAlmDeltaA() {
    return redAlmDeltaA_;
  }
  /**
   * @throws ClassCastException if value is not a Almanac_ReducedKeplerianSet.redAlmDeltaAType
   */
  public void setRedAlmDeltaA(Asn1Object value) {
    this.redAlmDeltaA_ = (Almanac_ReducedKeplerianSet.redAlmDeltaAType) value;
  }
  public Almanac_ReducedKeplerianSet.redAlmDeltaAType setRedAlmDeltaAToNewInstance() {
    redAlmDeltaA_ = new Almanac_ReducedKeplerianSet.redAlmDeltaAType();
    return redAlmDeltaA_;
  }
  
  private Almanac_ReducedKeplerianSet.redAlmOmega0Type redAlmOmega0_;
  public Almanac_ReducedKeplerianSet.redAlmOmega0Type getRedAlmOmega0() {
    return redAlmOmega0_;
  }
  /**
   * @throws ClassCastException if value is not a Almanac_ReducedKeplerianSet.redAlmOmega0Type
   */
  public void setRedAlmOmega0(Asn1Object value) {
    this.redAlmOmega0_ = (Almanac_ReducedKeplerianSet.redAlmOmega0Type) value;
  }
  public Almanac_ReducedKeplerianSet.redAlmOmega0Type setRedAlmOmega0ToNewInstance() {
    redAlmOmega0_ = new Almanac_ReducedKeplerianSet.redAlmOmega0Type();
    return redAlmOmega0_;
  }
  
  private Almanac_ReducedKeplerianSet.redAlmPhi0Type redAlmPhi0_;
  public Almanac_ReducedKeplerianSet.redAlmPhi0Type getRedAlmPhi0() {
    return redAlmPhi0_;
  }
  /**
   * @throws ClassCastException if value is not a Almanac_ReducedKeplerianSet.redAlmPhi0Type
   */
  public void setRedAlmPhi0(Asn1Object value) {
    this.redAlmPhi0_ = (Almanac_ReducedKeplerianSet.redAlmPhi0Type) value;
  }
  public Almanac_ReducedKeplerianSet.redAlmPhi0Type setRedAlmPhi0ToNewInstance() {
    redAlmPhi0_ = new Almanac_ReducedKeplerianSet.redAlmPhi0Type();
    return redAlmPhi0_;
  }
  
  private Almanac_ReducedKeplerianSet.redAlmL1HealthType redAlmL1Health_;
  public Almanac_ReducedKeplerianSet.redAlmL1HealthType getRedAlmL1Health() {
    return redAlmL1Health_;
  }
  /**
   * @throws ClassCastException if value is not a Almanac_ReducedKeplerianSet.redAlmL1HealthType
   */
  public void setRedAlmL1Health(Asn1Object value) {
    this.redAlmL1Health_ = (Almanac_ReducedKeplerianSet.redAlmL1HealthType) value;
  }
  public Almanac_ReducedKeplerianSet.redAlmL1HealthType setRedAlmL1HealthToNewInstance() {
    redAlmL1Health_ = new Almanac_ReducedKeplerianSet.redAlmL1HealthType();
    return redAlmL1Health_;
  }
  
  private Almanac_ReducedKeplerianSet.redAlmL2HealthType redAlmL2Health_;
  public Almanac_ReducedKeplerianSet.redAlmL2HealthType getRedAlmL2Health() {
    return redAlmL2Health_;
  }
  /**
   * @throws ClassCastException if value is not a Almanac_ReducedKeplerianSet.redAlmL2HealthType
   */
  public void setRedAlmL2Health(Asn1Object value) {
    this.redAlmL2Health_ = (Almanac_ReducedKeplerianSet.redAlmL2HealthType) value;
  }
  public Almanac_ReducedKeplerianSet.redAlmL2HealthType setRedAlmL2HealthToNewInstance() {
    redAlmL2Health_ = new Almanac_ReducedKeplerianSet.redAlmL2HealthType();
    return redAlmL2Health_;
  }
  
  private Almanac_ReducedKeplerianSet.redAlmL5HealthType redAlmL5Health_;
  public Almanac_ReducedKeplerianSet.redAlmL5HealthType getRedAlmL5Health() {
    return redAlmL5Health_;
  }
  /**
   * @throws ClassCastException if value is not a Almanac_ReducedKeplerianSet.redAlmL5HealthType
   */
  public void setRedAlmL5Health(Asn1Object value) {
    this.redAlmL5Health_ = (Almanac_ReducedKeplerianSet.redAlmL5HealthType) value;
  }
  public Almanac_ReducedKeplerianSet.redAlmL5HealthType setRedAlmL5HealthToNewInstance() {
    redAlmL5Health_ = new Almanac_ReducedKeplerianSet.redAlmL5HealthType();
    return redAlmL5Health_;
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
            return getRedAlmDeltaA() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getRedAlmDeltaA();
          }

          @Override public void setToNewInstance() {
            setRedAlmDeltaAToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Almanac_ReducedKeplerianSet.redAlmDeltaAType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "redAlmDeltaA : "
                    + getRedAlmDeltaA().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getRedAlmOmega0() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getRedAlmOmega0();
          }

          @Override public void setToNewInstance() {
            setRedAlmOmega0ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Almanac_ReducedKeplerianSet.redAlmOmega0Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "redAlmOmega0 : "
                    + getRedAlmOmega0().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getRedAlmPhi0() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getRedAlmPhi0();
          }

          @Override public void setToNewInstance() {
            setRedAlmPhi0ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Almanac_ReducedKeplerianSet.redAlmPhi0Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "redAlmPhi0 : "
                    + getRedAlmPhi0().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getRedAlmL1Health() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getRedAlmL1Health();
          }

          @Override public void setToNewInstance() {
            setRedAlmL1HealthToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Almanac_ReducedKeplerianSet.redAlmL1HealthType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "redAlmL1Health : "
                    + getRedAlmL1Health().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getRedAlmL2Health() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getRedAlmL2Health();
          }

          @Override public void setToNewInstance() {
            setRedAlmL2HealthToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Almanac_ReducedKeplerianSet.redAlmL2HealthType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "redAlmL2Health : "
                    + getRedAlmL2Health().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getRedAlmL5Health() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getRedAlmL5Health();
          }

          @Override public void setToNewInstance() {
            setRedAlmL5HealthToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Almanac_ReducedKeplerianSet.redAlmL5HealthType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "redAlmL5Health : "
                    + getRedAlmL5Health().toIndentedString(indent);
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
public static class redAlmDeltaAType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_redAlmDeltaAType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public redAlmDeltaAType() {
    super();
    setValueRange(new java.math.BigInteger("-128"), new java.math.BigInteger("127"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_redAlmDeltaAType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_redAlmDeltaAType != null) {
      return ImmutableList.of(TAG_redAlmDeltaAType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new redAlmDeltaAType from encoded stream.
   */
  public static redAlmDeltaAType fromPerUnaligned(byte[] encodedBytes) {
    redAlmDeltaAType result = new redAlmDeltaAType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new redAlmDeltaAType from encoded stream.
   */
  public static redAlmDeltaAType fromPerAligned(byte[] encodedBytes) {
    redAlmDeltaAType result = new redAlmDeltaAType();
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
    return "redAlmDeltaAType = " + getInteger() + ";\n";
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
public static class redAlmOmega0Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_redAlmOmega0Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public redAlmOmega0Type() {
    super();
    setValueRange(new java.math.BigInteger("-64"), new java.math.BigInteger("63"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_redAlmOmega0Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_redAlmOmega0Type != null) {
      return ImmutableList.of(TAG_redAlmOmega0Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new redAlmOmega0Type from encoded stream.
   */
  public static redAlmOmega0Type fromPerUnaligned(byte[] encodedBytes) {
    redAlmOmega0Type result = new redAlmOmega0Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new redAlmOmega0Type from encoded stream.
   */
  public static redAlmOmega0Type fromPerAligned(byte[] encodedBytes) {
    redAlmOmega0Type result = new redAlmOmega0Type();
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
    return "redAlmOmega0Type = " + getInteger() + ";\n";
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
public static class redAlmPhi0Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_redAlmPhi0Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public redAlmPhi0Type() {
    super();
    setValueRange(new java.math.BigInteger("-64"), new java.math.BigInteger("63"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_redAlmPhi0Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_redAlmPhi0Type != null) {
      return ImmutableList.of(TAG_redAlmPhi0Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new redAlmPhi0Type from encoded stream.
   */
  public static redAlmPhi0Type fromPerUnaligned(byte[] encodedBytes) {
    redAlmPhi0Type result = new redAlmPhi0Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new redAlmPhi0Type from encoded stream.
   */
  public static redAlmPhi0Type fromPerAligned(byte[] encodedBytes) {
    redAlmPhi0Type result = new redAlmPhi0Type();
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
    return "redAlmPhi0Type = " + getInteger() + ";\n";
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
public static class redAlmL1HealthType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_redAlmL1HealthType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public redAlmL1HealthType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_redAlmL1HealthType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_redAlmL1HealthType != null) {
      return ImmutableList.of(TAG_redAlmL1HealthType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new redAlmL1HealthType from encoded stream.
   */
  public static redAlmL1HealthType fromPerUnaligned(byte[] encodedBytes) {
    redAlmL1HealthType result = new redAlmL1HealthType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new redAlmL1HealthType from encoded stream.
   */
  public static redAlmL1HealthType fromPerAligned(byte[] encodedBytes) {
    redAlmL1HealthType result = new redAlmL1HealthType();
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
    return "redAlmL1HealthType = " + getValue() + ";\n";
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
public static class redAlmL2HealthType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_redAlmL2HealthType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public redAlmL2HealthType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_redAlmL2HealthType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_redAlmL2HealthType != null) {
      return ImmutableList.of(TAG_redAlmL2HealthType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new redAlmL2HealthType from encoded stream.
   */
  public static redAlmL2HealthType fromPerUnaligned(byte[] encodedBytes) {
    redAlmL2HealthType result = new redAlmL2HealthType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new redAlmL2HealthType from encoded stream.
   */
  public static redAlmL2HealthType fromPerAligned(byte[] encodedBytes) {
    redAlmL2HealthType result = new redAlmL2HealthType();
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
    return "redAlmL2HealthType = " + getValue() + ";\n";
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
public static class redAlmL5HealthType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_redAlmL5HealthType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public redAlmL5HealthType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_redAlmL5HealthType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_redAlmL5HealthType != null) {
      return ImmutableList.of(TAG_redAlmL5HealthType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new redAlmL5HealthType from encoded stream.
   */
  public static redAlmL5HealthType fromPerUnaligned(byte[] encodedBytes) {
    redAlmL5HealthType result = new redAlmL5HealthType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new redAlmL5HealthType from encoded stream.
   */
  public static redAlmL5HealthType fromPerAligned(byte[] encodedBytes) {
    redAlmL5HealthType result = new redAlmL5HealthType();
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
    return "redAlmL5HealthType = " + getValue() + ";\n";
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
    builder.append("Almanac_ReducedKeplerianSet = {\n");
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
