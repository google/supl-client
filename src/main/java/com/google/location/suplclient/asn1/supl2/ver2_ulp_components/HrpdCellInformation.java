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

package com.google.location.suplclient.asn1.supl2.ver2_ulp_components;

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
public  class HrpdCellInformation extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_HrpdCellInformation
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public HrpdCellInformation() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_HrpdCellInformation;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_HrpdCellInformation != null) {
      return ImmutableList.of(TAG_HrpdCellInformation);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new HrpdCellInformation from encoded stream.
   */
  public static HrpdCellInformation fromPerUnaligned(byte[] encodedBytes) {
    HrpdCellInformation result = new HrpdCellInformation();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new HrpdCellInformation from encoded stream.
   */
  public static HrpdCellInformation fromPerAligned(byte[] encodedBytes) {
    HrpdCellInformation result = new HrpdCellInformation();
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

  
  private HrpdCellInformation.refSECTORIDType refSECTORID_;
  public HrpdCellInformation.refSECTORIDType getRefSECTORID() {
    return refSECTORID_;
  }
  /**
   * @throws ClassCastException if value is not a HrpdCellInformation.refSECTORIDType
   */
  public void setRefSECTORID(Asn1Object value) {
    this.refSECTORID_ = (HrpdCellInformation.refSECTORIDType) value;
  }
  public HrpdCellInformation.refSECTORIDType setRefSECTORIDToNewInstance() {
    refSECTORID_ = new HrpdCellInformation.refSECTORIDType();
    return refSECTORID_;
  }
  
  private HrpdCellInformation.refBASELATType refBASELAT_;
  public HrpdCellInformation.refBASELATType getRefBASELAT() {
    return refBASELAT_;
  }
  /**
   * @throws ClassCastException if value is not a HrpdCellInformation.refBASELATType
   */
  public void setRefBASELAT(Asn1Object value) {
    this.refBASELAT_ = (HrpdCellInformation.refBASELATType) value;
  }
  public HrpdCellInformation.refBASELATType setRefBASELATToNewInstance() {
    refBASELAT_ = new HrpdCellInformation.refBASELATType();
    return refBASELAT_;
  }
  
  private HrpdCellInformation.reBASELONGType reBASELONG_;
  public HrpdCellInformation.reBASELONGType getReBASELONG() {
    return reBASELONG_;
  }
  /**
   * @throws ClassCastException if value is not a HrpdCellInformation.reBASELONGType
   */
  public void setReBASELONG(Asn1Object value) {
    this.reBASELONG_ = (HrpdCellInformation.reBASELONGType) value;
  }
  public HrpdCellInformation.reBASELONGType setReBASELONGToNewInstance() {
    reBASELONG_ = new HrpdCellInformation.reBASELONGType();
    return reBASELONG_;
  }
  
  private HrpdCellInformation.refWeekNumberType refWeekNumber_;
  public HrpdCellInformation.refWeekNumberType getRefWeekNumber() {
    return refWeekNumber_;
  }
  /**
   * @throws ClassCastException if value is not a HrpdCellInformation.refWeekNumberType
   */
  public void setRefWeekNumber(Asn1Object value) {
    this.refWeekNumber_ = (HrpdCellInformation.refWeekNumberType) value;
  }
  public HrpdCellInformation.refWeekNumberType setRefWeekNumberToNewInstance() {
    refWeekNumber_ = new HrpdCellInformation.refWeekNumberType();
    return refWeekNumber_;
  }
  
  private HrpdCellInformation.refSecondsType refSeconds_;
  public HrpdCellInformation.refSecondsType getRefSeconds() {
    return refSeconds_;
  }
  /**
   * @throws ClassCastException if value is not a HrpdCellInformation.refSecondsType
   */
  public void setRefSeconds(Asn1Object value) {
    this.refSeconds_ = (HrpdCellInformation.refSecondsType) value;
  }
  public HrpdCellInformation.refSecondsType setRefSecondsToNewInstance() {
    refSeconds_ = new HrpdCellInformation.refSecondsType();
    return refSeconds_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getRefSECTORID() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getRefSECTORID();
          }

          @Override public void setToNewInstance() {
            setRefSECTORIDToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? HrpdCellInformation.refSECTORIDType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "refSECTORID : "
                    + getRefSECTORID().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

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
            return tag == null ? HrpdCellInformation.refBASELATType.getPossibleFirstTags() : ImmutableList.of(tag);
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
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

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
            return tag == null ? HrpdCellInformation.reBASELONGType.getPossibleFirstTags() : ImmutableList.of(tag);
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
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

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
            return tag == null ? HrpdCellInformation.refWeekNumberType.getPossibleFirstTags() : ImmutableList.of(tag);
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
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

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
            return tag == null ? HrpdCellInformation.refSecondsType.getPossibleFirstTags() : ImmutableList.of(tag);
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
public static class refSECTORIDType extends Asn1BitString {
  //

  // defined bit positions, if any
  

  // setters
  

  // clearers
  


  private static final Asn1Tag TAG_refSECTORIDType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public refSECTORIDType() {
    super();
    setMinSize(128);
setMaxSize(128);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_refSECTORIDType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_refSECTORIDType != null) {
      return ImmutableList.of(TAG_refSECTORIDType);
    } else {
      return Asn1BitString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new refSECTORIDType from encoded stream.
   */
  public static refSECTORIDType fromPerUnaligned(byte[] encodedBytes) {
    refSECTORIDType result = new refSECTORIDType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new refSECTORIDType from encoded stream.
   */
  public static refSECTORIDType fromPerAligned(byte[] encodedBytes) {
    refSECTORIDType result = new refSECTORIDType();
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
    return "refSECTORIDType = " + getValue() + ";\n";
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
    builder.append("HrpdCellInformation = {\n");
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
