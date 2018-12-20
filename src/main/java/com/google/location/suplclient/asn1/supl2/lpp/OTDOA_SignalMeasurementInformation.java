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
public  class OTDOA_SignalMeasurementInformation extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_OTDOA_SignalMeasurementInformation
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public OTDOA_SignalMeasurementInformation() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_OTDOA_SignalMeasurementInformation;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_OTDOA_SignalMeasurementInformation != null) {
      return ImmutableList.of(TAG_OTDOA_SignalMeasurementInformation);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new OTDOA_SignalMeasurementInformation from encoded stream.
   */
  public static OTDOA_SignalMeasurementInformation fromPerUnaligned(byte[] encodedBytes) {
    OTDOA_SignalMeasurementInformation result = new OTDOA_SignalMeasurementInformation();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new OTDOA_SignalMeasurementInformation from encoded stream.
   */
  public static OTDOA_SignalMeasurementInformation fromPerAligned(byte[] encodedBytes) {
    OTDOA_SignalMeasurementInformation result = new OTDOA_SignalMeasurementInformation();
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

  
  private OTDOA_SignalMeasurementInformation.systemFrameNumberType systemFrameNumber_;
  public OTDOA_SignalMeasurementInformation.systemFrameNumberType getSystemFrameNumber() {
    return systemFrameNumber_;
  }
  /**
   * @throws ClassCastException if value is not a OTDOA_SignalMeasurementInformation.systemFrameNumberType
   */
  public void setSystemFrameNumber(Asn1Object value) {
    this.systemFrameNumber_ = (OTDOA_SignalMeasurementInformation.systemFrameNumberType) value;
  }
  public OTDOA_SignalMeasurementInformation.systemFrameNumberType setSystemFrameNumberToNewInstance() {
    systemFrameNumber_ = new OTDOA_SignalMeasurementInformation.systemFrameNumberType();
    return systemFrameNumber_;
  }
  
  private OTDOA_SignalMeasurementInformation.physCellIdRefType physCellIdRef_;
  public OTDOA_SignalMeasurementInformation.physCellIdRefType getPhysCellIdRef() {
    return physCellIdRef_;
  }
  /**
   * @throws ClassCastException if value is not a OTDOA_SignalMeasurementInformation.physCellIdRefType
   */
  public void setPhysCellIdRef(Asn1Object value) {
    this.physCellIdRef_ = (OTDOA_SignalMeasurementInformation.physCellIdRefType) value;
  }
  public OTDOA_SignalMeasurementInformation.physCellIdRefType setPhysCellIdRefToNewInstance() {
    physCellIdRef_ = new OTDOA_SignalMeasurementInformation.physCellIdRefType();
    return physCellIdRef_;
  }
  
  private ECGI cellGlobalIdRef_;
  public ECGI getCellGlobalIdRef() {
    return cellGlobalIdRef_;
  }
  /**
   * @throws ClassCastException if value is not a ECGI
   */
  public void setCellGlobalIdRef(Asn1Object value) {
    this.cellGlobalIdRef_ = (ECGI) value;
  }
  public ECGI setCellGlobalIdRefToNewInstance() {
    cellGlobalIdRef_ = new ECGI();
    return cellGlobalIdRef_;
  }
  
  private ARFCN_ValueEUTRA earfcnRef_;
  public ARFCN_ValueEUTRA getEarfcnRef() {
    return earfcnRef_;
  }
  /**
   * @throws ClassCastException if value is not a ARFCN_ValueEUTRA
   */
  public void setEarfcnRef(Asn1Object value) {
    this.earfcnRef_ = (ARFCN_ValueEUTRA) value;
  }
  public ARFCN_ValueEUTRA setEarfcnRefToNewInstance() {
    earfcnRef_ = new ARFCN_ValueEUTRA();
    return earfcnRef_;
  }
  
  private OTDOA_MeasQuality referenceQuality_;
  public OTDOA_MeasQuality getReferenceQuality() {
    return referenceQuality_;
  }
  /**
   * @throws ClassCastException if value is not a OTDOA_MeasQuality
   */
  public void setReferenceQuality(Asn1Object value) {
    this.referenceQuality_ = (OTDOA_MeasQuality) value;
  }
  public OTDOA_MeasQuality setReferenceQualityToNewInstance() {
    referenceQuality_ = new OTDOA_MeasQuality();
    return referenceQuality_;
  }
  
  private NeighbourMeasurementList neighbourMeasurementList_;
  public NeighbourMeasurementList getNeighbourMeasurementList() {
    return neighbourMeasurementList_;
  }
  /**
   * @throws ClassCastException if value is not a NeighbourMeasurementList
   */
  public void setNeighbourMeasurementList(Asn1Object value) {
    this.neighbourMeasurementList_ = (NeighbourMeasurementList) value;
  }
  public NeighbourMeasurementList setNeighbourMeasurementListToNewInstance() {
    neighbourMeasurementList_ = new NeighbourMeasurementList();
    return neighbourMeasurementList_;
  }
  

  
  private OTDOA_SignalMeasurementInformation.ext1Type  extensionExt1;
  public OTDOA_SignalMeasurementInformation.ext1Type getExtensionExt1() {
    return extensionExt1;
  }
  /**
   * @throws ClassCastException if value is not a OTDOA_SignalMeasurementInformation.ext1Type
   */
  public void setExtensionExt1(Asn1Object value) {
    extensionExt1 = (OTDOA_SignalMeasurementInformation.ext1Type) value;
  }
  public void setExtensionExt1ToNewInstance() {
    extensionExt1 = new OTDOA_SignalMeasurementInformation.ext1Type();
  }
    

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getSystemFrameNumber() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getSystemFrameNumber();
          }

          @Override public void setToNewInstance() {
            setSystemFrameNumberToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? OTDOA_SignalMeasurementInformation.systemFrameNumberType.getPossibleFirstTags() : ImmutableList.of(tag);
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
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getPhysCellIdRef() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getPhysCellIdRef();
          }

          @Override public void setToNewInstance() {
            setPhysCellIdRefToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? OTDOA_SignalMeasurementInformation.physCellIdRefType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "physCellIdRef : "
                    + getPhysCellIdRef().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getCellGlobalIdRef() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getCellGlobalIdRef();
          }

          @Override public void setToNewInstance() {
            setCellGlobalIdRefToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ECGI.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "cellGlobalIdRef : "
                    + getCellGlobalIdRef().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getEarfcnRef() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getEarfcnRef();
          }

          @Override public void setToNewInstance() {
            setEarfcnRefToNewInstance();
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
                return "earfcnRef : "
                    + getEarfcnRef().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getReferenceQuality() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getReferenceQuality();
          }

          @Override public void setToNewInstance() {
            setReferenceQualityToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? OTDOA_MeasQuality.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "referenceQuality : "
                    + getReferenceQuality().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getNeighbourMeasurementList() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getNeighbourMeasurementList();
          }

          @Override public void setToNewInstance() {
            setNeighbourMeasurementListToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NeighbourMeasurementList.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "neighbourMeasurementList : "
                    + getNeighbourMeasurementList().toIndentedString(indent);
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
public static class physCellIdRefType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_physCellIdRefType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public physCellIdRefType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("503"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_physCellIdRefType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_physCellIdRefType != null) {
      return ImmutableList.of(TAG_physCellIdRefType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new physCellIdRefType from encoded stream.
   */
  public static physCellIdRefType fromPerUnaligned(byte[] encodedBytes) {
    physCellIdRefType result = new physCellIdRefType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new physCellIdRefType from encoded stream.
   */
  public static physCellIdRefType fromPerAligned(byte[] encodedBytes) {
    physCellIdRefType result = new physCellIdRefType();
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
    return "physCellIdRefType = " + getInteger() + ";\n";
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

  
  private ARFCN_ValueEUTRA_v9a0 earfcnRef_v9a0_;
  public ARFCN_ValueEUTRA_v9a0 getEarfcnRef_v9a0() {
    return earfcnRef_v9a0_;
  }
  /**
   * @throws ClassCastException if value is not a ARFCN_ValueEUTRA_v9a0
   */
  public void setEarfcnRef_v9a0(Asn1Object value) {
    this.earfcnRef_v9a0_ = (ARFCN_ValueEUTRA_v9a0) value;
  }
  public ARFCN_ValueEUTRA_v9a0 setEarfcnRef_v9a0ToNewInstance() {
    earfcnRef_v9a0_ = new ARFCN_ValueEUTRA_v9a0();
    return earfcnRef_v9a0_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getEarfcnRef_v9a0() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getEarfcnRef_v9a0();
          }

          @Override public void setToNewInstance() {
            setEarfcnRef_v9a0ToNewInstance();
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
                return "earfcnRef_v9a0 : "
                    + getEarfcnRef_v9a0().toIndentedString(indent);
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
    builder.append("OTDOA_SignalMeasurementInformation = {\n");
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
