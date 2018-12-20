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

package com.google.location.suplclient.asn1.supl2.ulp_components;

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
public  class CdmaCellInformation extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_CdmaCellInformation
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public CdmaCellInformation() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_CdmaCellInformation;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_CdmaCellInformation != null) {
      return ImmutableList.of(TAG_CdmaCellInformation);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new CdmaCellInformation from encoded stream.
   */
  public static CdmaCellInformation fromPerUnaligned(byte[] encodedBytes) {
    CdmaCellInformation result = new CdmaCellInformation();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new CdmaCellInformation from encoded stream.
   */
  public static CdmaCellInformation fromPerAligned(byte[] encodedBytes) {
    CdmaCellInformation result = new CdmaCellInformation();
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

  
  private CdmaCellInformation.refNIDType refNID_;
  public CdmaCellInformation.refNIDType getRefNID() {
    return refNID_;
  }
  /**
   * @throws ClassCastException if value is not a CdmaCellInformation.refNIDType
   */
  public void setRefNID(Asn1Object value) {
    this.refNID_ = (CdmaCellInformation.refNIDType) value;
  }
  public CdmaCellInformation.refNIDType setRefNIDToNewInstance() {
    refNID_ = new CdmaCellInformation.refNIDType();
    return refNID_;
  }
  
  private CdmaCellInformation.refSIDType refSID_;
  public CdmaCellInformation.refSIDType getRefSID() {
    return refSID_;
  }
  /**
   * @throws ClassCastException if value is not a CdmaCellInformation.refSIDType
   */
  public void setRefSID(Asn1Object value) {
    this.refSID_ = (CdmaCellInformation.refSIDType) value;
  }
  public CdmaCellInformation.refSIDType setRefSIDToNewInstance() {
    refSID_ = new CdmaCellInformation.refSIDType();
    return refSID_;
  }
  
  private CdmaCellInformation.refBASEIDType refBASEID_;
  public CdmaCellInformation.refBASEIDType getRefBASEID() {
    return refBASEID_;
  }
  /**
   * @throws ClassCastException if value is not a CdmaCellInformation.refBASEIDType
   */
  public void setRefBASEID(Asn1Object value) {
    this.refBASEID_ = (CdmaCellInformation.refBASEIDType) value;
  }
  public CdmaCellInformation.refBASEIDType setRefBASEIDToNewInstance() {
    refBASEID_ = new CdmaCellInformation.refBASEIDType();
    return refBASEID_;
  }
  
  private CdmaCellInformation.refBASELATType refBASELAT_;
  public CdmaCellInformation.refBASELATType getRefBASELAT() {
    return refBASELAT_;
  }
  /**
   * @throws ClassCastException if value is not a CdmaCellInformation.refBASELATType
   */
  public void setRefBASELAT(Asn1Object value) {
    this.refBASELAT_ = (CdmaCellInformation.refBASELATType) value;
  }
  public CdmaCellInformation.refBASELATType setRefBASELATToNewInstance() {
    refBASELAT_ = new CdmaCellInformation.refBASELATType();
    return refBASELAT_;
  }
  
  private CdmaCellInformation.reBASELONGType reBASELONG_;
  public CdmaCellInformation.reBASELONGType getReBASELONG() {
    return reBASELONG_;
  }
  /**
   * @throws ClassCastException if value is not a CdmaCellInformation.reBASELONGType
   */
  public void setReBASELONG(Asn1Object value) {
    this.reBASELONG_ = (CdmaCellInformation.reBASELONGType) value;
  }
  public CdmaCellInformation.reBASELONGType setReBASELONGToNewInstance() {
    reBASELONG_ = new CdmaCellInformation.reBASELONGType();
    return reBASELONG_;
  }
  
  private CdmaCellInformation.refREFPNType refREFPN_;
  public CdmaCellInformation.refREFPNType getRefREFPN() {
    return refREFPN_;
  }
  /**
   * @throws ClassCastException if value is not a CdmaCellInformation.refREFPNType
   */
  public void setRefREFPN(Asn1Object value) {
    this.refREFPN_ = (CdmaCellInformation.refREFPNType) value;
  }
  public CdmaCellInformation.refREFPNType setRefREFPNToNewInstance() {
    refREFPN_ = new CdmaCellInformation.refREFPNType();
    return refREFPN_;
  }
  
  private CdmaCellInformation.refWeekNumberType refWeekNumber_;
  public CdmaCellInformation.refWeekNumberType getRefWeekNumber() {
    return refWeekNumber_;
  }
  /**
   * @throws ClassCastException if value is not a CdmaCellInformation.refWeekNumberType
   */
  public void setRefWeekNumber(Asn1Object value) {
    this.refWeekNumber_ = (CdmaCellInformation.refWeekNumberType) value;
  }
  public CdmaCellInformation.refWeekNumberType setRefWeekNumberToNewInstance() {
    refWeekNumber_ = new CdmaCellInformation.refWeekNumberType();
    return refWeekNumber_;
  }
  
  private CdmaCellInformation.refSecondsType refSeconds_;
  public CdmaCellInformation.refSecondsType getRefSeconds() {
    return refSeconds_;
  }
  /**
   * @throws ClassCastException if value is not a CdmaCellInformation.refSecondsType
   */
  public void setRefSeconds(Asn1Object value) {
    this.refSeconds_ = (CdmaCellInformation.refSecondsType) value;
  }
  public CdmaCellInformation.refSecondsType setRefSecondsToNewInstance() {
    refSeconds_ = new CdmaCellInformation.refSecondsType();
    return refSeconds_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getRefNID() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getRefNID();
          }

          @Override public void setToNewInstance() {
            setRefNIDToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? CdmaCellInformation.refNIDType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "refNID : "
                    + getRefNID().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getRefSID() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getRefSID();
          }

          @Override public void setToNewInstance() {
            setRefSIDToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? CdmaCellInformation.refSIDType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "refSID : "
                    + getRefSID().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getRefBASEID() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getRefBASEID();
          }

          @Override public void setToNewInstance() {
            setRefBASEIDToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? CdmaCellInformation.refBASEIDType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "refBASEID : "
                    + getRefBASEID().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getRefBASELAT() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getRefBASELAT();
          }

          @Override public void setToNewInstance() {
            setRefBASELATToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? CdmaCellInformation.refBASELATType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "refBASELAT : "
                    + getRefBASELAT().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getReBASELONG() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getReBASELONG();
          }

          @Override public void setToNewInstance() {
            setReBASELONGToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? CdmaCellInformation.reBASELONGType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "reBASELONG : "
                    + getReBASELONG().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getRefREFPN() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getRefREFPN();
          }

          @Override public void setToNewInstance() {
            setRefREFPNToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? CdmaCellInformation.refREFPNType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "refREFPN : "
                    + getRefREFPN().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getRefWeekNumber() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getRefWeekNumber();
          }

          @Override public void setToNewInstance() {
            setRefWeekNumberToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? CdmaCellInformation.refWeekNumberType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "refWeekNumber : "
                    + getRefWeekNumber().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 7);

          @Override public boolean isExplicitlySet() {
            return getRefSeconds() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getRefSeconds();
          }

          @Override public void setToNewInstance() {
            setRefSecondsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? CdmaCellInformation.refSecondsType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "refSeconds : "
                    + getRefSeconds().toIndentedString(indent);
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
public static class refNIDType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_refNIDType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public refNIDType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("65535"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_refNIDType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_refNIDType != null) {
      return ImmutableList.of(TAG_refNIDType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new refNIDType from encoded stream.
   */
  public static refNIDType fromPerUnaligned(byte[] encodedBytes) {
    refNIDType result = new refNIDType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new refNIDType from encoded stream.
   */
  public static refNIDType fromPerAligned(byte[] encodedBytes) {
    refNIDType result = new refNIDType();
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
    return "refNIDType = " + getInteger() + ";\n";
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
public static class refSIDType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_refSIDType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public refSIDType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("32767"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_refSIDType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_refSIDType != null) {
      return ImmutableList.of(TAG_refSIDType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new refSIDType from encoded stream.
   */
  public static refSIDType fromPerUnaligned(byte[] encodedBytes) {
    refSIDType result = new refSIDType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new refSIDType from encoded stream.
   */
  public static refSIDType fromPerAligned(byte[] encodedBytes) {
    refSIDType result = new refSIDType();
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
    return "refSIDType = " + getInteger() + ";\n";
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
public static class refBASEIDType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_refBASEIDType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public refBASEIDType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("65535"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_refBASEIDType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_refBASEIDType != null) {
      return ImmutableList.of(TAG_refBASEIDType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new refBASEIDType from encoded stream.
   */
  public static refBASEIDType fromPerUnaligned(byte[] encodedBytes) {
    refBASEIDType result = new refBASEIDType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new refBASEIDType from encoded stream.
   */
  public static refBASEIDType fromPerAligned(byte[] encodedBytes) {
    refBASEIDType result = new refBASEIDType();
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
    return "refBASEIDType = " + getInteger() + ";\n";
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
public static class refBASELATType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_refBASELATType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public refBASELATType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("4194303"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_refBASELATType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_refBASELATType != null) {
      return ImmutableList.of(TAG_refBASELATType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new refBASELATType from encoded stream.
   */
  public static refBASELATType fromPerUnaligned(byte[] encodedBytes) {
    refBASELATType result = new refBASELATType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new refBASELATType from encoded stream.
   */
  public static refBASELATType fromPerAligned(byte[] encodedBytes) {
    refBASELATType result = new refBASELATType();
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
    return "refBASELATType = " + getInteger() + ";\n";
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
public static class reBASELONGType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_reBASELONGType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public reBASELONGType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("8388607"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_reBASELONGType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_reBASELONGType != null) {
      return ImmutableList.of(TAG_reBASELONGType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new reBASELONGType from encoded stream.
   */
  public static reBASELONGType fromPerUnaligned(byte[] encodedBytes) {
    reBASELONGType result = new reBASELONGType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new reBASELONGType from encoded stream.
   */
  public static reBASELONGType fromPerAligned(byte[] encodedBytes) {
    reBASELONGType result = new reBASELONGType();
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
    return "reBASELONGType = " + getInteger() + ";\n";
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
public static class refREFPNType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_refREFPNType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public refREFPNType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("511"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_refREFPNType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_refREFPNType != null) {
      return ImmutableList.of(TAG_refREFPNType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new refREFPNType from encoded stream.
   */
  public static refREFPNType fromPerUnaligned(byte[] encodedBytes) {
    refREFPNType result = new refREFPNType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new refREFPNType from encoded stream.
   */
  public static refREFPNType fromPerAligned(byte[] encodedBytes) {
    refREFPNType result = new refREFPNType();
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
    return "refREFPNType = " + getInteger() + ";\n";
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
public static class refWeekNumberType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_refWeekNumberType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public refWeekNumberType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("65535"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_refWeekNumberType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_refWeekNumberType != null) {
      return ImmutableList.of(TAG_refWeekNumberType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new refWeekNumberType from encoded stream.
   */
  public static refWeekNumberType fromPerUnaligned(byte[] encodedBytes) {
    refWeekNumberType result = new refWeekNumberType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new refWeekNumberType from encoded stream.
   */
  public static refWeekNumberType fromPerAligned(byte[] encodedBytes) {
    refWeekNumberType result = new refWeekNumberType();
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
    return "refWeekNumberType = " + getInteger() + ";\n";
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
public static class refSecondsType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_refSecondsType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public refSecondsType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("4194303"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_refSecondsType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_refSecondsType != null) {
      return ImmutableList.of(TAG_refSecondsType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new refSecondsType from encoded stream.
   */
  public static refSecondsType fromPerUnaligned(byte[] encodedBytes) {
    refSecondsType result = new refSecondsType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new refSecondsType from encoded stream.
   */
  public static refSecondsType fromPerAligned(byte[] encodedBytes) {
    refSecondsType result = new refSecondsType();
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
    return "refSecondsType = " + getInteger() + ";\n";
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
    builder.append("CdmaCellInformation = {\n");
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
