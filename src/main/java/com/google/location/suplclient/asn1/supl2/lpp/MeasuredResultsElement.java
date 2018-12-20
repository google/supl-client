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
public  class MeasuredResultsElement extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_MeasuredResultsElement
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public MeasuredResultsElement() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_MeasuredResultsElement;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_MeasuredResultsElement != null) {
      return ImmutableList.of(TAG_MeasuredResultsElement);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new MeasuredResultsElement from encoded stream.
   */
  public static MeasuredResultsElement fromPerUnaligned(byte[] encodedBytes) {
    MeasuredResultsElement result = new MeasuredResultsElement();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new MeasuredResultsElement from encoded stream.
   */
  public static MeasuredResultsElement fromPerAligned(byte[] encodedBytes) {
    MeasuredResultsElement result = new MeasuredResultsElement();
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

  
  private MeasuredResultsElement.physCellIdType physCellId_;
  public MeasuredResultsElement.physCellIdType getPhysCellId() {
    return physCellId_;
  }
  /**
   * @throws ClassCastException if value is not a MeasuredResultsElement.physCellIdType
   */
  public void setPhysCellId(Asn1Object value) {
    this.physCellId_ = (MeasuredResultsElement.physCellIdType) value;
  }
  public MeasuredResultsElement.physCellIdType setPhysCellIdToNewInstance() {
    physCellId_ = new MeasuredResultsElement.physCellIdType();
    return physCellId_;
  }
  
  private CellGlobalIdEUTRA_AndUTRA cellGlobalId_;
  public CellGlobalIdEUTRA_AndUTRA getCellGlobalId() {
    return cellGlobalId_;
  }
  /**
   * @throws ClassCastException if value is not a CellGlobalIdEUTRA_AndUTRA
   */
  public void setCellGlobalId(Asn1Object value) {
    this.cellGlobalId_ = (CellGlobalIdEUTRA_AndUTRA) value;
  }
  public CellGlobalIdEUTRA_AndUTRA setCellGlobalIdToNewInstance() {
    cellGlobalId_ = new CellGlobalIdEUTRA_AndUTRA();
    return cellGlobalId_;
  }
  
  private ARFCN_ValueEUTRA arfcnEUTRA_;
  public ARFCN_ValueEUTRA getArfcnEUTRA() {
    return arfcnEUTRA_;
  }
  /**
   * @throws ClassCastException if value is not a ARFCN_ValueEUTRA
   */
  public void setArfcnEUTRA(Asn1Object value) {
    this.arfcnEUTRA_ = (ARFCN_ValueEUTRA) value;
  }
  public ARFCN_ValueEUTRA setArfcnEUTRAToNewInstance() {
    arfcnEUTRA_ = new ARFCN_ValueEUTRA();
    return arfcnEUTRA_;
  }
  
  private MeasuredResultsElement.systemFrameNumberType systemFrameNumber_;
  public MeasuredResultsElement.systemFrameNumberType getSystemFrameNumber() {
    return systemFrameNumber_;
  }
  /**
   * @throws ClassCastException if value is not a MeasuredResultsElement.systemFrameNumberType
   */
  public void setSystemFrameNumber(Asn1Object value) {
    this.systemFrameNumber_ = (MeasuredResultsElement.systemFrameNumberType) value;
  }
  public MeasuredResultsElement.systemFrameNumberType setSystemFrameNumberToNewInstance() {
    systemFrameNumber_ = new MeasuredResultsElement.systemFrameNumberType();
    return systemFrameNumber_;
  }
  
  private MeasuredResultsElement.rsrp_ResultType rsrp_Result_;
  public MeasuredResultsElement.rsrp_ResultType getRsrp_Result() {
    return rsrp_Result_;
  }
  /**
   * @throws ClassCastException if value is not a MeasuredResultsElement.rsrp_ResultType
   */
  public void setRsrp_Result(Asn1Object value) {
    this.rsrp_Result_ = (MeasuredResultsElement.rsrp_ResultType) value;
  }
  public MeasuredResultsElement.rsrp_ResultType setRsrp_ResultToNewInstance() {
    rsrp_Result_ = new MeasuredResultsElement.rsrp_ResultType();
    return rsrp_Result_;
  }
  
  private MeasuredResultsElement.rsrq_ResultType rsrq_Result_;
  public MeasuredResultsElement.rsrq_ResultType getRsrq_Result() {
    return rsrq_Result_;
  }
  /**
   * @throws ClassCastException if value is not a MeasuredResultsElement.rsrq_ResultType
   */
  public void setRsrq_Result(Asn1Object value) {
    this.rsrq_Result_ = (MeasuredResultsElement.rsrq_ResultType) value;
  }
  public MeasuredResultsElement.rsrq_ResultType setRsrq_ResultToNewInstance() {
    rsrq_Result_ = new MeasuredResultsElement.rsrq_ResultType();
    return rsrq_Result_;
  }
  
  private MeasuredResultsElement.ue_RxTxTimeDiffType ue_RxTxTimeDiff_;
  public MeasuredResultsElement.ue_RxTxTimeDiffType getUe_RxTxTimeDiff() {
    return ue_RxTxTimeDiff_;
  }
  /**
   * @throws ClassCastException if value is not a MeasuredResultsElement.ue_RxTxTimeDiffType
   */
  public void setUe_RxTxTimeDiff(Asn1Object value) {
    this.ue_RxTxTimeDiff_ = (MeasuredResultsElement.ue_RxTxTimeDiffType) value;
  }
  public MeasuredResultsElement.ue_RxTxTimeDiffType setUe_RxTxTimeDiffToNewInstance() {
    ue_RxTxTimeDiff_ = new MeasuredResultsElement.ue_RxTxTimeDiffType();
    return ue_RxTxTimeDiff_;
  }
  

  
  private MeasuredResultsElement.ext1Type  extensionExt1;
  public MeasuredResultsElement.ext1Type getExtensionExt1() {
    return extensionExt1;
  }
  /**
   * @throws ClassCastException if value is not a MeasuredResultsElement.ext1Type
   */
  public void setExtensionExt1(Asn1Object value) {
    extensionExt1 = (MeasuredResultsElement.ext1Type) value;
  }
  public void setExtensionExt1ToNewInstance() {
    extensionExt1 = new MeasuredResultsElement.ext1Type();
  }
    

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getPhysCellId() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getPhysCellId();
          }

          @Override public void setToNewInstance() {
            setPhysCellIdToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? MeasuredResultsElement.physCellIdType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "physCellId : "
                    + getPhysCellId().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getCellGlobalId() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getCellGlobalId();
          }

          @Override public void setToNewInstance() {
            setCellGlobalIdToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? CellGlobalIdEUTRA_AndUTRA.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "cellGlobalId : "
                    + getCellGlobalId().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getArfcnEUTRA() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getArfcnEUTRA();
          }

          @Override public void setToNewInstance() {
            setArfcnEUTRAToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ARFCN_ValueEUTRA.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "arfcnEUTRA : "
                    + getArfcnEUTRA().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getSystemFrameNumber() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getSystemFrameNumber();
          }

          @Override public void setToNewInstance() {
            setSystemFrameNumberToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? MeasuredResultsElement.systemFrameNumberType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "systemFrameNumber : "
                    + getSystemFrameNumber().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getRsrp_Result() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getRsrp_Result();
          }

          @Override public void setToNewInstance() {
            setRsrp_ResultToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? MeasuredResultsElement.rsrp_ResultType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "rsrp_Result : "
                    + getRsrp_Result().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getRsrq_Result() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getRsrq_Result();
          }

          @Override public void setToNewInstance() {
            setRsrq_ResultToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? MeasuredResultsElement.rsrq_ResultType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "rsrq_Result : "
                    + getRsrq_Result().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getUe_RxTxTimeDiff() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getUe_RxTxTimeDiff();
          }

          @Override public void setToNewInstance() {
            setUe_RxTxTimeDiffToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? MeasuredResultsElement.ue_RxTxTimeDiffType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ue_RxTxTimeDiff : "
                    + getUe_RxTxTimeDiff().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      builder.add(new SequenceComponent() {
            @Override public boolean isExplicitlySet() {
              return getExtensionExt1() != null;
            }

            @Override public boolean hasDefaultValue() {
              return false;
            }

            @Override public boolean isOptional() {
              return false;
            }

            @Override public Asn1Object getComponentValue() {
              return getExtensionExt1();
            }

            @Override public void setToNewInstance() {
              setExtensionExt1ToNewInstance();
            }

            @Override public Collection<Asn1Tag> getPossibleFirstTags() {
              throw new UnsupportedOperationException(
                  "BER decoding not supported for extension elements");
            }

            @Override
            public Asn1Tag getTag() {
              throw new UnsupportedOperationException(
                  "BER is not supported for extension elements");
            }

            @Override
            public boolean isImplicitTagging() {
              throw new UnsupportedOperationException(
                  "BER is not supported for extension elements");
            }

            @Override public String toIndentedString(String indent) {
              return "ext1 : "
                  + getExtensionExt1().toIndentedString(indent);
            }
      });
      
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
public static class physCellIdType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_physCellIdType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public physCellIdType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("503"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_physCellIdType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_physCellIdType != null) {
      return ImmutableList.of(TAG_physCellIdType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new physCellIdType from encoded stream.
   */
  public static physCellIdType fromPerUnaligned(byte[] encodedBytes) {
    physCellIdType result = new physCellIdType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new physCellIdType from encoded stream.
   */
  public static physCellIdType fromPerAligned(byte[] encodedBytes) {
    physCellIdType result = new physCellIdType();
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
    return "physCellIdType = " + getInteger() + ";\n";
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
public static class systemFrameNumberType extends Asn1BitString {
  //

  // defined bit positions, if any
  

  // setters
  

  // clearers
  


  private static final Asn1Tag TAG_systemFrameNumberType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public systemFrameNumberType() {
    super();
    setMinSize(10);
setMaxSize(10);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_systemFrameNumberType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_systemFrameNumberType != null) {
      return ImmutableList.of(TAG_systemFrameNumberType);
    } else {
      return Asn1BitString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new systemFrameNumberType from encoded stream.
   */
  public static systemFrameNumberType fromPerUnaligned(byte[] encodedBytes) {
    systemFrameNumberType result = new systemFrameNumberType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new systemFrameNumberType from encoded stream.
   */
  public static systemFrameNumberType fromPerAligned(byte[] encodedBytes) {
    systemFrameNumberType result = new systemFrameNumberType();
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
    return "systemFrameNumberType = " + getValue() + ";\n";
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
public static class rsrp_ResultType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_rsrp_ResultType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public rsrp_ResultType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("97"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_rsrp_ResultType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_rsrp_ResultType != null) {
      return ImmutableList.of(TAG_rsrp_ResultType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new rsrp_ResultType from encoded stream.
   */
  public static rsrp_ResultType fromPerUnaligned(byte[] encodedBytes) {
    rsrp_ResultType result = new rsrp_ResultType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new rsrp_ResultType from encoded stream.
   */
  public static rsrp_ResultType fromPerAligned(byte[] encodedBytes) {
    rsrp_ResultType result = new rsrp_ResultType();
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
    return "rsrp_ResultType = " + getInteger() + ";\n";
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
public static class rsrq_ResultType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_rsrq_ResultType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public rsrq_ResultType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("34"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_rsrq_ResultType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_rsrq_ResultType != null) {
      return ImmutableList.of(TAG_rsrq_ResultType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new rsrq_ResultType from encoded stream.
   */
  public static rsrq_ResultType fromPerUnaligned(byte[] encodedBytes) {
    rsrq_ResultType result = new rsrq_ResultType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new rsrq_ResultType from encoded stream.
   */
  public static rsrq_ResultType fromPerAligned(byte[] encodedBytes) {
    rsrq_ResultType result = new rsrq_ResultType();
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
    return "rsrq_ResultType = " + getInteger() + ";\n";
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
public static class ue_RxTxTimeDiffType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ue_RxTxTimeDiffType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ue_RxTxTimeDiffType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("4095"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ue_RxTxTimeDiffType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ue_RxTxTimeDiffType != null) {
      return ImmutableList.of(TAG_ue_RxTxTimeDiffType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ue_RxTxTimeDiffType from encoded stream.
   */
  public static ue_RxTxTimeDiffType fromPerUnaligned(byte[] encodedBytes) {
    ue_RxTxTimeDiffType result = new ue_RxTxTimeDiffType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ue_RxTxTimeDiffType from encoded stream.
   */
  public static ue_RxTxTimeDiffType fromPerAligned(byte[] encodedBytes) {
    ue_RxTxTimeDiffType result = new ue_RxTxTimeDiffType();
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
    return "ue_RxTxTimeDiffType = " + getInteger() + ";\n";
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
public static class ext1Type extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_ext1Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ext1Type() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ext1Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ext1Type != null) {
      return ImmutableList.of(TAG_ext1Type);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ext1Type from encoded stream.
   */
  public static ext1Type fromPerUnaligned(byte[] encodedBytes) {
    ext1Type result = new ext1Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ext1Type from encoded stream.
   */
  public static ext1Type fromPerAligned(byte[] encodedBytes) {
    ext1Type result = new ext1Type();
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

  
  private ARFCN_ValueEUTRA_v9a0 arfcnEUTRA_v9a0_;
  public ARFCN_ValueEUTRA_v9a0 getArfcnEUTRA_v9a0() {
    return arfcnEUTRA_v9a0_;
  }
  /**
   * @throws ClassCastException if value is not a ARFCN_ValueEUTRA_v9a0
   */
  public void setArfcnEUTRA_v9a0(Asn1Object value) {
    this.arfcnEUTRA_v9a0_ = (ARFCN_ValueEUTRA_v9a0) value;
  }
  public ARFCN_ValueEUTRA_v9a0 setArfcnEUTRA_v9a0ToNewInstance() {
    arfcnEUTRA_v9a0_ = new ARFCN_ValueEUTRA_v9a0();
    return arfcnEUTRA_v9a0_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getArfcnEUTRA_v9a0() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getArfcnEUTRA_v9a0();
          }

          @Override public void setToNewInstance() {
            setArfcnEUTRA_v9a0ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ARFCN_ValueEUTRA_v9a0.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "arfcnEUTRA_v9a0 : "
                    + getArfcnEUTRA_v9a0().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      return builder.build();
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
    builder.append("ext1Type = {\n");
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
    builder.append("MeasuredResultsElement = {\n");
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
