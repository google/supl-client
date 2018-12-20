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
public  class LteCellInformation extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_LteCellInformation
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public LteCellInformation() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_LteCellInformation;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_LteCellInformation != null) {
      return ImmutableList.of(TAG_LteCellInformation);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new LteCellInformation from encoded stream.
   */
  public static LteCellInformation fromPerUnaligned(byte[] encodedBytes) {
    LteCellInformation result = new LteCellInformation();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new LteCellInformation from encoded stream.
   */
  public static LteCellInformation fromPerAligned(byte[] encodedBytes) {
    LteCellInformation result = new LteCellInformation();
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

  
  private CellGlobalIdEUTRA cellGlobalIdEUTRA_;
  public CellGlobalIdEUTRA getCellGlobalIdEUTRA() {
    return cellGlobalIdEUTRA_;
  }
  /**
   * @throws ClassCastException if value is not a CellGlobalIdEUTRA
   */
  public void setCellGlobalIdEUTRA(Asn1Object value) {
    this.cellGlobalIdEUTRA_ = (CellGlobalIdEUTRA) value;
  }
  public CellGlobalIdEUTRA setCellGlobalIdEUTRAToNewInstance() {
    cellGlobalIdEUTRA_ = new CellGlobalIdEUTRA();
    return cellGlobalIdEUTRA_;
  }
  
  private PhysCellId physCellId_;
  public PhysCellId getPhysCellId() {
    return physCellId_;
  }
  /**
   * @throws ClassCastException if value is not a PhysCellId
   */
  public void setPhysCellId(Asn1Object value) {
    this.physCellId_ = (PhysCellId) value;
  }
  public PhysCellId setPhysCellIdToNewInstance() {
    physCellId_ = new PhysCellId();
    return physCellId_;
  }
  
  private TrackingAreaCode trackingAreaCode_;
  public TrackingAreaCode getTrackingAreaCode() {
    return trackingAreaCode_;
  }
  /**
   * @throws ClassCastException if value is not a TrackingAreaCode
   */
  public void setTrackingAreaCode(Asn1Object value) {
    this.trackingAreaCode_ = (TrackingAreaCode) value;
  }
  public TrackingAreaCode setTrackingAreaCodeToNewInstance() {
    trackingAreaCode_ = new TrackingAreaCode();
    return trackingAreaCode_;
  }
  
  private RSRP_Range rsrpResult_;
  public RSRP_Range getRsrpResult() {
    return rsrpResult_;
  }
  /**
   * @throws ClassCastException if value is not a RSRP_Range
   */
  public void setRsrpResult(Asn1Object value) {
    this.rsrpResult_ = (RSRP_Range) value;
  }
  public RSRP_Range setRsrpResultToNewInstance() {
    rsrpResult_ = new RSRP_Range();
    return rsrpResult_;
  }
  
  private RSRQ_Range rsrqResult_;
  public RSRQ_Range getRsrqResult() {
    return rsrqResult_;
  }
  /**
   * @throws ClassCastException if value is not a RSRQ_Range
   */
  public void setRsrqResult(Asn1Object value) {
    this.rsrqResult_ = (RSRQ_Range) value;
  }
  public RSRQ_Range setRsrqResultToNewInstance() {
    rsrqResult_ = new RSRQ_Range();
    return rsrqResult_;
  }
  
  private LteCellInformation.tAType tA_;
  public LteCellInformation.tAType getTA() {
    return tA_;
  }
  /**
   * @throws ClassCastException if value is not a LteCellInformation.tAType
   */
  public void setTA(Asn1Object value) {
    this.tA_ = (LteCellInformation.tAType) value;
  }
  public LteCellInformation.tAType setTAToNewInstance() {
    tA_ = new LteCellInformation.tAType();
    return tA_;
  }
  
  private MeasResultListEUTRA measResultListEUTRA_;
  public MeasResultListEUTRA getMeasResultListEUTRA() {
    return measResultListEUTRA_;
  }
  /**
   * @throws ClassCastException if value is not a MeasResultListEUTRA
   */
  public void setMeasResultListEUTRA(Asn1Object value) {
    this.measResultListEUTRA_ = (MeasResultListEUTRA) value;
  }
  public MeasResultListEUTRA setMeasResultListEUTRAToNewInstance() {
    measResultListEUTRA_ = new MeasResultListEUTRA();
    return measResultListEUTRA_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getCellGlobalIdEUTRA() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCellGlobalIdEUTRA();
          }

          @Override public void setToNewInstance() {
            setCellGlobalIdEUTRAToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? CellGlobalIdEUTRA.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "cellGlobalIdEUTRA : "
                    + getCellGlobalIdEUTRA().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

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
            return tag == null ? PhysCellId.getPossibleFirstTags() : ImmutableList.of(tag);
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
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getTrackingAreaCode() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getTrackingAreaCode();
          }

          @Override public void setToNewInstance() {
            setTrackingAreaCodeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? TrackingAreaCode.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "trackingAreaCode : "
                    + getTrackingAreaCode().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getRsrpResult() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getRsrpResult();
          }

          @Override public void setToNewInstance() {
            setRsrpResultToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? RSRP_Range.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "rsrpResult : "
                    + getRsrpResult().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getRsrqResult() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getRsrqResult();
          }

          @Override public void setToNewInstance() {
            setRsrqResultToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? RSRQ_Range.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "rsrqResult : "
                    + getRsrqResult().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getTA() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getTA();
          }

          @Override public void setToNewInstance() {
            setTAToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? LteCellInformation.tAType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "tA : "
                    + getTA().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getMeasResultListEUTRA() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getMeasResultListEUTRA();
          }

          @Override public void setToNewInstance() {
            setMeasResultListEUTRAToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? MeasResultListEUTRA.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "measResultListEUTRA : "
                    + getMeasResultListEUTRA().toIndentedString(indent);
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
public static class tAType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_tAType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public tAType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("1282"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_tAType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_tAType != null) {
      return ImmutableList.of(TAG_tAType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new tAType from encoded stream.
   */
  public static tAType fromPerUnaligned(byte[] encodedBytes) {
    tAType result = new tAType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new tAType from encoded stream.
   */
  public static tAType fromPerAligned(byte[] encodedBytes) {
    tAType result = new tAType();
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
    return "tAType = " + getInteger() + ";\n";
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
    builder.append("LteCellInformation = {\n");
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
