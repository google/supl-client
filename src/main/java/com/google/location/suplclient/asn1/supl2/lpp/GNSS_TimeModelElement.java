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
public  class GNSS_TimeModelElement extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GNSS_TimeModelElement
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GNSS_TimeModelElement() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GNSS_TimeModelElement;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GNSS_TimeModelElement != null) {
      return ImmutableList.of(TAG_GNSS_TimeModelElement);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GNSS_TimeModelElement from encoded stream.
   */
  public static GNSS_TimeModelElement fromPerUnaligned(byte[] encodedBytes) {
    GNSS_TimeModelElement result = new GNSS_TimeModelElement();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GNSS_TimeModelElement from encoded stream.
   */
  public static GNSS_TimeModelElement fromPerAligned(byte[] encodedBytes) {
    GNSS_TimeModelElement result = new GNSS_TimeModelElement();
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

  
  private GNSS_TimeModelElement.gnss_TimeModelRefTimeType gnss_TimeModelRefTime_;
  public GNSS_TimeModelElement.gnss_TimeModelRefTimeType getGnss_TimeModelRefTime() {
    return gnss_TimeModelRefTime_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_TimeModelElement.gnss_TimeModelRefTimeType
   */
  public void setGnss_TimeModelRefTime(Asn1Object value) {
    this.gnss_TimeModelRefTime_ = (GNSS_TimeModelElement.gnss_TimeModelRefTimeType) value;
  }
  public GNSS_TimeModelElement.gnss_TimeModelRefTimeType setGnss_TimeModelRefTimeToNewInstance() {
    gnss_TimeModelRefTime_ = new GNSS_TimeModelElement.gnss_TimeModelRefTimeType();
    return gnss_TimeModelRefTime_;
  }
  
  private GNSS_TimeModelElement.tA0Type tA0_;
  public GNSS_TimeModelElement.tA0Type getTA0() {
    return tA0_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_TimeModelElement.tA0Type
   */
  public void setTA0(Asn1Object value) {
    this.tA0_ = (GNSS_TimeModelElement.tA0Type) value;
  }
  public GNSS_TimeModelElement.tA0Type setTA0ToNewInstance() {
    tA0_ = new GNSS_TimeModelElement.tA0Type();
    return tA0_;
  }
  
  private GNSS_TimeModelElement.tA1Type tA1_;
  public GNSS_TimeModelElement.tA1Type getTA1() {
    return tA1_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_TimeModelElement.tA1Type
   */
  public void setTA1(Asn1Object value) {
    this.tA1_ = (GNSS_TimeModelElement.tA1Type) value;
  }
  public GNSS_TimeModelElement.tA1Type setTA1ToNewInstance() {
    tA1_ = new GNSS_TimeModelElement.tA1Type();
    return tA1_;
  }
  
  private GNSS_TimeModelElement.tA2Type tA2_;
  public GNSS_TimeModelElement.tA2Type getTA2() {
    return tA2_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_TimeModelElement.tA2Type
   */
  public void setTA2(Asn1Object value) {
    this.tA2_ = (GNSS_TimeModelElement.tA2Type) value;
  }
  public GNSS_TimeModelElement.tA2Type setTA2ToNewInstance() {
    tA2_ = new GNSS_TimeModelElement.tA2Type();
    return tA2_;
  }
  
  private GNSS_TimeModelElement.gnss_TO_IDType gnss_TO_ID_;
  public GNSS_TimeModelElement.gnss_TO_IDType getGnss_TO_ID() {
    return gnss_TO_ID_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_TimeModelElement.gnss_TO_IDType
   */
  public void setGnss_TO_ID(Asn1Object value) {
    this.gnss_TO_ID_ = (GNSS_TimeModelElement.gnss_TO_IDType) value;
  }
  public GNSS_TimeModelElement.gnss_TO_IDType setGnss_TO_IDToNewInstance() {
    gnss_TO_ID_ = new GNSS_TimeModelElement.gnss_TO_IDType();
    return gnss_TO_ID_;
  }
  
  private GNSS_TimeModelElement.weekNumberType weekNumber_;
  public GNSS_TimeModelElement.weekNumberType getWeekNumber() {
    return weekNumber_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_TimeModelElement.weekNumberType
   */
  public void setWeekNumber(Asn1Object value) {
    this.weekNumber_ = (GNSS_TimeModelElement.weekNumberType) value;
  }
  public GNSS_TimeModelElement.weekNumberType setWeekNumberToNewInstance() {
    weekNumber_ = new GNSS_TimeModelElement.weekNumberType();
    return weekNumber_;
  }
  
  private GNSS_TimeModelElement.deltaTType deltaT_;
  public GNSS_TimeModelElement.deltaTType getDeltaT() {
    return deltaT_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_TimeModelElement.deltaTType
   */
  public void setDeltaT(Asn1Object value) {
    this.deltaT_ = (GNSS_TimeModelElement.deltaTType) value;
  }
  public GNSS_TimeModelElement.deltaTType setDeltaTToNewInstance() {
    deltaT_ = new GNSS_TimeModelElement.deltaTType();
    return deltaT_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getGnss_TimeModelRefTime() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_TimeModelRefTime();
          }

          @Override public void setToNewInstance() {
            setGnss_TimeModelRefTimeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_TimeModelElement.gnss_TimeModelRefTimeType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_TimeModelRefTime : "
                    + getGnss_TimeModelRefTime().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getTA0() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getTA0();
          }

          @Override public void setToNewInstance() {
            setTA0ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_TimeModelElement.tA0Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "tA0 : "
                    + getTA0().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getTA1() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getTA1();
          }

          @Override public void setToNewInstance() {
            setTA1ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_TimeModelElement.tA1Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "tA1 : "
                    + getTA1().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getTA2() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getTA2();
          }

          @Override public void setToNewInstance() {
            setTA2ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_TimeModelElement.tA2Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "tA2 : "
                    + getTA2().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getGnss_TO_ID() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_TO_ID();
          }

          @Override public void setToNewInstance() {
            setGnss_TO_IDToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_TimeModelElement.gnss_TO_IDType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_TO_ID : "
                    + getGnss_TO_ID().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getWeekNumber() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getWeekNumber();
          }

          @Override public void setToNewInstance() {
            setWeekNumberToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_TimeModelElement.weekNumberType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "weekNumber : "
                    + getWeekNumber().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getDeltaT() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getDeltaT();
          }

          @Override public void setToNewInstance() {
            setDeltaTToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_TimeModelElement.deltaTType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "deltaT : "
                    + getDeltaT().toIndentedString(indent);
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
public static class gnss_TimeModelRefTimeType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_gnss_TimeModelRefTimeType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gnss_TimeModelRefTimeType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("65535"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gnss_TimeModelRefTimeType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gnss_TimeModelRefTimeType != null) {
      return ImmutableList.of(TAG_gnss_TimeModelRefTimeType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gnss_TimeModelRefTimeType from encoded stream.
   */
  public static gnss_TimeModelRefTimeType fromPerUnaligned(byte[] encodedBytes) {
    gnss_TimeModelRefTimeType result = new gnss_TimeModelRefTimeType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gnss_TimeModelRefTimeType from encoded stream.
   */
  public static gnss_TimeModelRefTimeType fromPerAligned(byte[] encodedBytes) {
    gnss_TimeModelRefTimeType result = new gnss_TimeModelRefTimeType();
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
    return "gnss_TimeModelRefTimeType = " + getInteger() + ";\n";
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
public static class tA0Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_tA0Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public tA0Type() {
    super();
    setValueRange(new java.math.BigInteger("-67108864"), new java.math.BigInteger("67108863"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_tA0Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_tA0Type != null) {
      return ImmutableList.of(TAG_tA0Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new tA0Type from encoded stream.
   */
  public static tA0Type fromPerUnaligned(byte[] encodedBytes) {
    tA0Type result = new tA0Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new tA0Type from encoded stream.
   */
  public static tA0Type fromPerAligned(byte[] encodedBytes) {
    tA0Type result = new tA0Type();
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
    return "tA0Type = " + getInteger() + ";\n";
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
public static class tA1Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_tA1Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public tA1Type() {
    super();
    setValueRange(new java.math.BigInteger("-4096"), new java.math.BigInteger("4095"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_tA1Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_tA1Type != null) {
      return ImmutableList.of(TAG_tA1Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new tA1Type from encoded stream.
   */
  public static tA1Type fromPerUnaligned(byte[] encodedBytes) {
    tA1Type result = new tA1Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new tA1Type from encoded stream.
   */
  public static tA1Type fromPerAligned(byte[] encodedBytes) {
    tA1Type result = new tA1Type();
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
    return "tA1Type = " + getInteger() + ";\n";
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
public static class tA2Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_tA2Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public tA2Type() {
    super();
    setValueRange(new java.math.BigInteger("-64"), new java.math.BigInteger("63"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_tA2Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_tA2Type != null) {
      return ImmutableList.of(TAG_tA2Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new tA2Type from encoded stream.
   */
  public static tA2Type fromPerUnaligned(byte[] encodedBytes) {
    tA2Type result = new tA2Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new tA2Type from encoded stream.
   */
  public static tA2Type fromPerAligned(byte[] encodedBytes) {
    tA2Type result = new tA2Type();
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
    return "tA2Type = " + getInteger() + ";\n";
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
public static class gnss_TO_IDType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_gnss_TO_IDType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gnss_TO_IDType() {
    super();
    setValueRange(new java.math.BigInteger("1"), new java.math.BigInteger("15"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gnss_TO_IDType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gnss_TO_IDType != null) {
      return ImmutableList.of(TAG_gnss_TO_IDType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gnss_TO_IDType from encoded stream.
   */
  public static gnss_TO_IDType fromPerUnaligned(byte[] encodedBytes) {
    gnss_TO_IDType result = new gnss_TO_IDType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gnss_TO_IDType from encoded stream.
   */
  public static gnss_TO_IDType fromPerAligned(byte[] encodedBytes) {
    gnss_TO_IDType result = new gnss_TO_IDType();
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
    return "gnss_TO_IDType = " + getInteger() + ";\n";
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
public static class weekNumberType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_weekNumberType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public weekNumberType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("8191"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_weekNumberType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_weekNumberType != null) {
      return ImmutableList.of(TAG_weekNumberType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new weekNumberType from encoded stream.
   */
  public static weekNumberType fromPerUnaligned(byte[] encodedBytes) {
    weekNumberType result = new weekNumberType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new weekNumberType from encoded stream.
   */
  public static weekNumberType fromPerAligned(byte[] encodedBytes) {
    weekNumberType result = new weekNumberType();
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
    return "weekNumberType = " + getInteger() + ";\n";
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
public static class deltaTType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_deltaTType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public deltaTType() {
    super();
    setValueRange(new java.math.BigInteger("-128"), new java.math.BigInteger("127"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_deltaTType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_deltaTType != null) {
      return ImmutableList.of(TAG_deltaTType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new deltaTType from encoded stream.
   */
  public static deltaTType fromPerUnaligned(byte[] encodedBytes) {
    deltaTType result = new deltaTType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new deltaTType from encoded stream.
   */
  public static deltaTType fromPerAligned(byte[] encodedBytes) {
    deltaTType result = new deltaTType();
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
    return "deltaTType = " + getInteger() + ";\n";
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
    builder.append("GNSS_TimeModelElement = {\n");
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
