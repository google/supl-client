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
public  class DGNSS_CorrectionsElement extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_DGNSS_CorrectionsElement
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public DGNSS_CorrectionsElement() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_DGNSS_CorrectionsElement;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_DGNSS_CorrectionsElement != null) {
      return ImmutableList.of(TAG_DGNSS_CorrectionsElement);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new DGNSS_CorrectionsElement from encoded stream.
   */
  public static DGNSS_CorrectionsElement fromPerUnaligned(byte[] encodedBytes) {
    DGNSS_CorrectionsElement result = new DGNSS_CorrectionsElement();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new DGNSS_CorrectionsElement from encoded stream.
   */
  public static DGNSS_CorrectionsElement fromPerAligned(byte[] encodedBytes) {
    DGNSS_CorrectionsElement result = new DGNSS_CorrectionsElement();
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

  
  private SV_ID svID_;
  public SV_ID getSvID() {
    return svID_;
  }
  /**
   * @throws ClassCastException if value is not a SV_ID
   */
  public void setSvID(Asn1Object value) {
    this.svID_ = (SV_ID) value;
  }
  public SV_ID setSvIDToNewInstance() {
    svID_ = new SV_ID();
    return svID_;
  }
  
  private DGNSS_CorrectionsElement.iodType iod_;
  public DGNSS_CorrectionsElement.iodType getIod() {
    return iod_;
  }
  /**
   * @throws ClassCastException if value is not a DGNSS_CorrectionsElement.iodType
   */
  public void setIod(Asn1Object value) {
    this.iod_ = (DGNSS_CorrectionsElement.iodType) value;
  }
  public DGNSS_CorrectionsElement.iodType setIodToNewInstance() {
    iod_ = new DGNSS_CorrectionsElement.iodType();
    return iod_;
  }
  
  private DGNSS_CorrectionsElement.udreType udre_;
  public DGNSS_CorrectionsElement.udreType getUdre() {
    return udre_;
  }
  /**
   * @throws ClassCastException if value is not a DGNSS_CorrectionsElement.udreType
   */
  public void setUdre(Asn1Object value) {
    this.udre_ = (DGNSS_CorrectionsElement.udreType) value;
  }
  public DGNSS_CorrectionsElement.udreType setUdreToNewInstance() {
    udre_ = new DGNSS_CorrectionsElement.udreType();
    return udre_;
  }
  
  private DGNSS_CorrectionsElement.pseudoRangeCorType pseudoRangeCor_;
  public DGNSS_CorrectionsElement.pseudoRangeCorType getPseudoRangeCor() {
    return pseudoRangeCor_;
  }
  /**
   * @throws ClassCastException if value is not a DGNSS_CorrectionsElement.pseudoRangeCorType
   */
  public void setPseudoRangeCor(Asn1Object value) {
    this.pseudoRangeCor_ = (DGNSS_CorrectionsElement.pseudoRangeCorType) value;
  }
  public DGNSS_CorrectionsElement.pseudoRangeCorType setPseudoRangeCorToNewInstance() {
    pseudoRangeCor_ = new DGNSS_CorrectionsElement.pseudoRangeCorType();
    return pseudoRangeCor_;
  }
  
  private DGNSS_CorrectionsElement.rangeRateCorType rangeRateCor_;
  public DGNSS_CorrectionsElement.rangeRateCorType getRangeRateCor() {
    return rangeRateCor_;
  }
  /**
   * @throws ClassCastException if value is not a DGNSS_CorrectionsElement.rangeRateCorType
   */
  public void setRangeRateCor(Asn1Object value) {
    this.rangeRateCor_ = (DGNSS_CorrectionsElement.rangeRateCorType) value;
  }
  public DGNSS_CorrectionsElement.rangeRateCorType setRangeRateCorToNewInstance() {
    rangeRateCor_ = new DGNSS_CorrectionsElement.rangeRateCorType();
    return rangeRateCor_;
  }
  
  private DGNSS_CorrectionsElement.udreGrowthRateType udreGrowthRate_;
  public DGNSS_CorrectionsElement.udreGrowthRateType getUdreGrowthRate() {
    return udreGrowthRate_;
  }
  /**
   * @throws ClassCastException if value is not a DGNSS_CorrectionsElement.udreGrowthRateType
   */
  public void setUdreGrowthRate(Asn1Object value) {
    this.udreGrowthRate_ = (DGNSS_CorrectionsElement.udreGrowthRateType) value;
  }
  public DGNSS_CorrectionsElement.udreGrowthRateType setUdreGrowthRateToNewInstance() {
    udreGrowthRate_ = new DGNSS_CorrectionsElement.udreGrowthRateType();
    return udreGrowthRate_;
  }
  
  private DGNSS_CorrectionsElement.udreValidityTimeType udreValidityTime_;
  public DGNSS_CorrectionsElement.udreValidityTimeType getUdreValidityTime() {
    return udreValidityTime_;
  }
  /**
   * @throws ClassCastException if value is not a DGNSS_CorrectionsElement.udreValidityTimeType
   */
  public void setUdreValidityTime(Asn1Object value) {
    this.udreValidityTime_ = (DGNSS_CorrectionsElement.udreValidityTimeType) value;
  }
  public DGNSS_CorrectionsElement.udreValidityTimeType setUdreValidityTimeToNewInstance() {
    udreValidityTime_ = new DGNSS_CorrectionsElement.udreValidityTimeType();
    return udreValidityTime_;
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
            return tag == null ? SV_ID.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return getIod() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getIod();
          }

          @Override public void setToNewInstance() {
            setIodToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? DGNSS_CorrectionsElement.iodType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "iod : "
                    + getIod().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getUdre() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getUdre();
          }

          @Override public void setToNewInstance() {
            setUdreToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? DGNSS_CorrectionsElement.udreType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "udre : "
                    + getUdre().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getPseudoRangeCor() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getPseudoRangeCor();
          }

          @Override public void setToNewInstance() {
            setPseudoRangeCorToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? DGNSS_CorrectionsElement.pseudoRangeCorType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "pseudoRangeCor : "
                    + getPseudoRangeCor().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getRangeRateCor() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getRangeRateCor();
          }

          @Override public void setToNewInstance() {
            setRangeRateCorToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? DGNSS_CorrectionsElement.rangeRateCorType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "rangeRateCor : "
                    + getRangeRateCor().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getUdreGrowthRate() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getUdreGrowthRate();
          }

          @Override public void setToNewInstance() {
            setUdreGrowthRateToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? DGNSS_CorrectionsElement.udreGrowthRateType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "udreGrowthRate : "
                    + getUdreGrowthRate().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getUdreValidityTime() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getUdreValidityTime();
          }

          @Override public void setToNewInstance() {
            setUdreValidityTimeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? DGNSS_CorrectionsElement.udreValidityTimeType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "udreValidityTime : "
                    + getUdreValidityTime().toIndentedString(indent);
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
public static class iodType extends Asn1BitString {
  //

  // defined bit positions, if any
  

  // setters
  

  // clearers
  


  private static final Asn1Tag TAG_iodType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public iodType() {
    super();
    setMinSize(11);
setMaxSize(11);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_iodType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_iodType != null) {
      return ImmutableList.of(TAG_iodType);
    } else {
      return Asn1BitString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new iodType from encoded stream.
   */
  public static iodType fromPerUnaligned(byte[] encodedBytes) {
    iodType result = new iodType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new iodType from encoded stream.
   */
  public static iodType fromPerAligned(byte[] encodedBytes) {
    iodType result = new iodType();
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
    return "iodType = " + getValue() + ";\n";
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
public static class udreType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_udreType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public udreType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("3"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_udreType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_udreType != null) {
      return ImmutableList.of(TAG_udreType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new udreType from encoded stream.
   */
  public static udreType fromPerUnaligned(byte[] encodedBytes) {
    udreType result = new udreType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new udreType from encoded stream.
   */
  public static udreType fromPerAligned(byte[] encodedBytes) {
    udreType result = new udreType();
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
    return "udreType = " + getInteger() + ";\n";
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
public static class pseudoRangeCorType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_pseudoRangeCorType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public pseudoRangeCorType() {
    super();
    setValueRange(new java.math.BigInteger("-2047"), new java.math.BigInteger("2047"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_pseudoRangeCorType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_pseudoRangeCorType != null) {
      return ImmutableList.of(TAG_pseudoRangeCorType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new pseudoRangeCorType from encoded stream.
   */
  public static pseudoRangeCorType fromPerUnaligned(byte[] encodedBytes) {
    pseudoRangeCorType result = new pseudoRangeCorType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new pseudoRangeCorType from encoded stream.
   */
  public static pseudoRangeCorType fromPerAligned(byte[] encodedBytes) {
    pseudoRangeCorType result = new pseudoRangeCorType();
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
    return "pseudoRangeCorType = " + getInteger() + ";\n";
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
public static class rangeRateCorType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_rangeRateCorType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public rangeRateCorType() {
    super();
    setValueRange(new java.math.BigInteger("-127"), new java.math.BigInteger("127"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_rangeRateCorType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_rangeRateCorType != null) {
      return ImmutableList.of(TAG_rangeRateCorType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new rangeRateCorType from encoded stream.
   */
  public static rangeRateCorType fromPerUnaligned(byte[] encodedBytes) {
    rangeRateCorType result = new rangeRateCorType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new rangeRateCorType from encoded stream.
   */
  public static rangeRateCorType fromPerAligned(byte[] encodedBytes) {
    rangeRateCorType result = new rangeRateCorType();
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
    return "rangeRateCorType = " + getInteger() + ";\n";
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
public static class udreGrowthRateType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_udreGrowthRateType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public udreGrowthRateType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("7"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_udreGrowthRateType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_udreGrowthRateType != null) {
      return ImmutableList.of(TAG_udreGrowthRateType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new udreGrowthRateType from encoded stream.
   */
  public static udreGrowthRateType fromPerUnaligned(byte[] encodedBytes) {
    udreGrowthRateType result = new udreGrowthRateType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new udreGrowthRateType from encoded stream.
   */
  public static udreGrowthRateType fromPerAligned(byte[] encodedBytes) {
    udreGrowthRateType result = new udreGrowthRateType();
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
    return "udreGrowthRateType = " + getInteger() + ";\n";
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
public static class udreValidityTimeType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_udreValidityTimeType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public udreValidityTimeType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("7"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_udreValidityTimeType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_udreValidityTimeType != null) {
      return ImmutableList.of(TAG_udreValidityTimeType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new udreValidityTimeType from encoded stream.
   */
  public static udreValidityTimeType fromPerUnaligned(byte[] encodedBytes) {
    udreValidityTimeType result = new udreValidityTimeType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new udreValidityTimeType from encoded stream.
   */
  public static udreValidityTimeType fromPerAligned(byte[] encodedBytes) {
    udreValidityTimeType result = new udreValidityTimeType();
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
    return "udreValidityTimeType = " + getInteger() + ";\n";
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
    builder.append("DGNSS_CorrectionsElement = {\n");
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
