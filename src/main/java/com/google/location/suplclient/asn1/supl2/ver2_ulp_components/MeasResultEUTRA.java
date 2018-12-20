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
public  class MeasResultEUTRA extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_MeasResultEUTRA
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public MeasResultEUTRA() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_MeasResultEUTRA;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_MeasResultEUTRA != null) {
      return ImmutableList.of(TAG_MeasResultEUTRA);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new MeasResultEUTRA from encoded stream.
   */
  public static MeasResultEUTRA fromPerUnaligned(byte[] encodedBytes) {
    MeasResultEUTRA result = new MeasResultEUTRA();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new MeasResultEUTRA from encoded stream.
   */
  public static MeasResultEUTRA fromPerAligned(byte[] encodedBytes) {
    MeasResultEUTRA result = new MeasResultEUTRA();
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
  
  private MeasResultEUTRA.cgi_InfoType cgi_Info_;
  public MeasResultEUTRA.cgi_InfoType getCgi_Info() {
    return cgi_Info_;
  }
  /**
   * @throws ClassCastException if value is not a MeasResultEUTRA.cgi_InfoType
   */
  public void setCgi_Info(Asn1Object value) {
    this.cgi_Info_ = (MeasResultEUTRA.cgi_InfoType) value;
  }
  public MeasResultEUTRA.cgi_InfoType setCgi_InfoToNewInstance() {
    cgi_Info_ = new MeasResultEUTRA.cgi_InfoType();
    return cgi_Info_;
  }
  
  private MeasResultEUTRA.measResultType measResult_;
  public MeasResultEUTRA.measResultType getMeasResult() {
    return measResult_;
  }
  /**
   * @throws ClassCastException if value is not a MeasResultEUTRA.measResultType
   */
  public void setMeasResult(Asn1Object value) {
    this.measResult_ = (MeasResultEUTRA.measResultType) value;
  }
  public MeasResultEUTRA.measResultType setMeasResultToNewInstance() {
    measResult_ = new MeasResultEUTRA.measResultType();
    return measResult_;
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
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getCgi_Info() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getCgi_Info();
          }

          @Override public void setToNewInstance() {
            setCgi_InfoToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? MeasResultEUTRA.cgi_InfoType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "cgi_Info : "
                    + getCgi_Info().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getMeasResult() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getMeasResult();
          }

          @Override public void setToNewInstance() {
            setMeasResultToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? MeasResultEUTRA.measResultType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "measResult : "
                    + getMeasResult().toIndentedString(indent);
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
public static class cgi_InfoType extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_cgi_InfoType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public cgi_InfoType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_cgi_InfoType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_cgi_InfoType != null) {
      return ImmutableList.of(TAG_cgi_InfoType);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new cgi_InfoType from encoded stream.
   */
  public static cgi_InfoType fromPerUnaligned(byte[] encodedBytes) {
    cgi_InfoType result = new cgi_InfoType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new cgi_InfoType from encoded stream.
   */
  public static cgi_InfoType fromPerAligned(byte[] encodedBytes) {
    cgi_InfoType result = new cgi_InfoType();
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

  
  private CellGlobalIdEUTRA cellGlobalId_;
  public CellGlobalIdEUTRA getCellGlobalId() {
    return cellGlobalId_;
  }
  /**
   * @throws ClassCastException if value is not a CellGlobalIdEUTRA
   */
  public void setCellGlobalId(Asn1Object value) {
    this.cellGlobalId_ = (CellGlobalIdEUTRA) value;
  }
  public CellGlobalIdEUTRA setCellGlobalIdToNewInstance() {
    cellGlobalId_ = new CellGlobalIdEUTRA();
    return cellGlobalId_;
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
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getCellGlobalId() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCellGlobalId();
          }

          @Override public void setToNewInstance() {
            setCellGlobalIdToNewInstance();
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
                return "cellGlobalId : "
                    + getCellGlobalId().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

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
    builder.append("cgi_InfoType = {\n");
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

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
* 
*/
public static class measResultType extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_measResultType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public measResultType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_measResultType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_measResultType != null) {
      return ImmutableList.of(TAG_measResultType);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new measResultType from encoded stream.
   */
  public static measResultType fromPerUnaligned(byte[] encodedBytes) {
    measResultType result = new measResultType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new measResultType from encoded stream.
   */
  public static measResultType fromPerAligned(byte[] encodedBytes) {
    measResultType result = new measResultType();
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
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

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
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

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
    builder.append("measResultType = {\n");
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
    builder.append("MeasResultEUTRA = {\n");
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
