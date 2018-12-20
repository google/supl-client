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
import com.google.location.suplclient.asn1.base.Asn1Enumerated;
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
public  class OTDOA_NeighbourCellInfoElement extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_OTDOA_NeighbourCellInfoElement
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public OTDOA_NeighbourCellInfoElement() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_OTDOA_NeighbourCellInfoElement;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_OTDOA_NeighbourCellInfoElement != null) {
      return ImmutableList.of(TAG_OTDOA_NeighbourCellInfoElement);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new OTDOA_NeighbourCellInfoElement from encoded stream.
   */
  public static OTDOA_NeighbourCellInfoElement fromPerUnaligned(byte[] encodedBytes) {
    OTDOA_NeighbourCellInfoElement result = new OTDOA_NeighbourCellInfoElement();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new OTDOA_NeighbourCellInfoElement from encoded stream.
   */
  public static OTDOA_NeighbourCellInfoElement fromPerAligned(byte[] encodedBytes) {
    OTDOA_NeighbourCellInfoElement result = new OTDOA_NeighbourCellInfoElement();
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

  
  private OTDOA_NeighbourCellInfoElement.physCellIdType physCellId_;
  public OTDOA_NeighbourCellInfoElement.physCellIdType getPhysCellId() {
    return physCellId_;
  }
  /**
   * @throws ClassCastException if value is not a OTDOA_NeighbourCellInfoElement.physCellIdType
   */
  public void setPhysCellId(Asn1Object value) {
    this.physCellId_ = (OTDOA_NeighbourCellInfoElement.physCellIdType) value;
  }
  public OTDOA_NeighbourCellInfoElement.physCellIdType setPhysCellIdToNewInstance() {
    physCellId_ = new OTDOA_NeighbourCellInfoElement.physCellIdType();
    return physCellId_;
  }
  
  private ECGI cellGlobalId_;
  public ECGI getCellGlobalId() {
    return cellGlobalId_;
  }
  /**
   * @throws ClassCastException if value is not a ECGI
   */
  public void setCellGlobalId(Asn1Object value) {
    this.cellGlobalId_ = (ECGI) value;
  }
  public ECGI setCellGlobalIdToNewInstance() {
    cellGlobalId_ = new ECGI();
    return cellGlobalId_;
  }
  
  private ARFCN_ValueEUTRA earfcn_;
  public ARFCN_ValueEUTRA getEarfcn() {
    return earfcn_;
  }
  /**
   * @throws ClassCastException if value is not a ARFCN_ValueEUTRA
   */
  public void setEarfcn(Asn1Object value) {
    this.earfcn_ = (ARFCN_ValueEUTRA) value;
  }
  public ARFCN_ValueEUTRA setEarfcnToNewInstance() {
    earfcn_ = new ARFCN_ValueEUTRA();
    return earfcn_;
  }
  
  private OTDOA_NeighbourCellInfoElement.cpLengthType cpLength_;
  public OTDOA_NeighbourCellInfoElement.cpLengthType getCpLength() {
    return cpLength_;
  }
  /**
   * @throws ClassCastException if value is not a OTDOA_NeighbourCellInfoElement.cpLengthType
   */
  public void setCpLength(Asn1Object value) {
    this.cpLength_ = (OTDOA_NeighbourCellInfoElement.cpLengthType) value;
  }
  public OTDOA_NeighbourCellInfoElement.cpLengthType setCpLengthToNewInstance() {
    cpLength_ = new OTDOA_NeighbourCellInfoElement.cpLengthType();
    return cpLength_;
  }
  
  private PRS_Info prsInfo_;
  public PRS_Info getPrsInfo() {
    return prsInfo_;
  }
  /**
   * @throws ClassCastException if value is not a PRS_Info
   */
  public void setPrsInfo(Asn1Object value) {
    this.prsInfo_ = (PRS_Info) value;
  }
  public PRS_Info setPrsInfoToNewInstance() {
    prsInfo_ = new PRS_Info();
    return prsInfo_;
  }
  
  private OTDOA_NeighbourCellInfoElement.antennaPortConfigType antennaPortConfig_;
  public OTDOA_NeighbourCellInfoElement.antennaPortConfigType getAntennaPortConfig() {
    return antennaPortConfig_;
  }
  /**
   * @throws ClassCastException if value is not a OTDOA_NeighbourCellInfoElement.antennaPortConfigType
   */
  public void setAntennaPortConfig(Asn1Object value) {
    this.antennaPortConfig_ = (OTDOA_NeighbourCellInfoElement.antennaPortConfigType) value;
  }
  public OTDOA_NeighbourCellInfoElement.antennaPortConfigType setAntennaPortConfigToNewInstance() {
    antennaPortConfig_ = new OTDOA_NeighbourCellInfoElement.antennaPortConfigType();
    return antennaPortConfig_;
  }
  
  private OTDOA_NeighbourCellInfoElement.slotNumberOffsetType slotNumberOffset_;
  public OTDOA_NeighbourCellInfoElement.slotNumberOffsetType getSlotNumberOffset() {
    return slotNumberOffset_;
  }
  /**
   * @throws ClassCastException if value is not a OTDOA_NeighbourCellInfoElement.slotNumberOffsetType
   */
  public void setSlotNumberOffset(Asn1Object value) {
    this.slotNumberOffset_ = (OTDOA_NeighbourCellInfoElement.slotNumberOffsetType) value;
  }
  public OTDOA_NeighbourCellInfoElement.slotNumberOffsetType setSlotNumberOffsetToNewInstance() {
    slotNumberOffset_ = new OTDOA_NeighbourCellInfoElement.slotNumberOffsetType();
    return slotNumberOffset_;
  }
  
  private OTDOA_NeighbourCellInfoElement.prs_SubframeOffsetType prs_SubframeOffset_;
  public OTDOA_NeighbourCellInfoElement.prs_SubframeOffsetType getPrs_SubframeOffset() {
    return prs_SubframeOffset_;
  }
  /**
   * @throws ClassCastException if value is not a OTDOA_NeighbourCellInfoElement.prs_SubframeOffsetType
   */
  public void setPrs_SubframeOffset(Asn1Object value) {
    this.prs_SubframeOffset_ = (OTDOA_NeighbourCellInfoElement.prs_SubframeOffsetType) value;
  }
  public OTDOA_NeighbourCellInfoElement.prs_SubframeOffsetType setPrs_SubframeOffsetToNewInstance() {
    prs_SubframeOffset_ = new OTDOA_NeighbourCellInfoElement.prs_SubframeOffsetType();
    return prs_SubframeOffset_;
  }
  
  private OTDOA_NeighbourCellInfoElement.expectedRSTDType expectedRSTD_;
  public OTDOA_NeighbourCellInfoElement.expectedRSTDType getExpectedRSTD() {
    return expectedRSTD_;
  }
  /**
   * @throws ClassCastException if value is not a OTDOA_NeighbourCellInfoElement.expectedRSTDType
   */
  public void setExpectedRSTD(Asn1Object value) {
    this.expectedRSTD_ = (OTDOA_NeighbourCellInfoElement.expectedRSTDType) value;
  }
  public OTDOA_NeighbourCellInfoElement.expectedRSTDType setExpectedRSTDToNewInstance() {
    expectedRSTD_ = new OTDOA_NeighbourCellInfoElement.expectedRSTDType();
    return expectedRSTD_;
  }
  
  private OTDOA_NeighbourCellInfoElement.expectedRSTD_UncertaintyType expectedRSTD_Uncertainty_;
  public OTDOA_NeighbourCellInfoElement.expectedRSTD_UncertaintyType getExpectedRSTD_Uncertainty() {
    return expectedRSTD_Uncertainty_;
  }
  /**
   * @throws ClassCastException if value is not a OTDOA_NeighbourCellInfoElement.expectedRSTD_UncertaintyType
   */
  public void setExpectedRSTD_Uncertainty(Asn1Object value) {
    this.expectedRSTD_Uncertainty_ = (OTDOA_NeighbourCellInfoElement.expectedRSTD_UncertaintyType) value;
  }
  public OTDOA_NeighbourCellInfoElement.expectedRSTD_UncertaintyType setExpectedRSTD_UncertaintyToNewInstance() {
    expectedRSTD_Uncertainty_ = new OTDOA_NeighbourCellInfoElement.expectedRSTD_UncertaintyType();
    return expectedRSTD_Uncertainty_;
  }
  

  
  private OTDOA_NeighbourCellInfoElement.ext1Type  extensionExt1;
  public OTDOA_NeighbourCellInfoElement.ext1Type getExtensionExt1() {
    return extensionExt1;
  }
  /**
   * @throws ClassCastException if value is not a OTDOA_NeighbourCellInfoElement.ext1Type
   */
  public void setExtensionExt1(Asn1Object value) {
    extensionExt1 = (OTDOA_NeighbourCellInfoElement.ext1Type) value;
  }
  public void setExtensionExt1ToNewInstance() {
    extensionExt1 = new OTDOA_NeighbourCellInfoElement.ext1Type();
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
            return tag == null ? OTDOA_NeighbourCellInfoElement.physCellIdType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "cellGlobalId : "
                    + getCellGlobalId().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getEarfcn() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getEarfcn();
          }

          @Override public void setToNewInstance() {
            setEarfcnToNewInstance();
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
                return "earfcn : "
                    + getEarfcn().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getCpLength() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getCpLength();
          }

          @Override public void setToNewInstance() {
            setCpLengthToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? OTDOA_NeighbourCellInfoElement.cpLengthType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "cpLength : "
                    + getCpLength().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getPrsInfo() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getPrsInfo();
          }

          @Override public void setToNewInstance() {
            setPrsInfoToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? PRS_Info.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "prsInfo : "
                    + getPrsInfo().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getAntennaPortConfig() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getAntennaPortConfig();
          }

          @Override public void setToNewInstance() {
            setAntennaPortConfigToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? OTDOA_NeighbourCellInfoElement.antennaPortConfigType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "antennaPortConfig : "
                    + getAntennaPortConfig().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getSlotNumberOffset() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getSlotNumberOffset();
          }

          @Override public void setToNewInstance() {
            setSlotNumberOffsetToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? OTDOA_NeighbourCellInfoElement.slotNumberOffsetType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "slotNumberOffset : "
                    + getSlotNumberOffset().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 7);

          @Override public boolean isExplicitlySet() {
            return getPrs_SubframeOffset() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getPrs_SubframeOffset();
          }

          @Override public void setToNewInstance() {
            setPrs_SubframeOffsetToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? OTDOA_NeighbourCellInfoElement.prs_SubframeOffsetType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "prs_SubframeOffset : "
                    + getPrs_SubframeOffset().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 8);

          @Override public boolean isExplicitlySet() {
            return getExpectedRSTD() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getExpectedRSTD();
          }

          @Override public void setToNewInstance() {
            setExpectedRSTDToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? OTDOA_NeighbourCellInfoElement.expectedRSTDType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "expectedRSTD : "
                    + getExpectedRSTD().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 9);

          @Override public boolean isExplicitlySet() {
            return getExpectedRSTD_Uncertainty() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getExpectedRSTD_Uncertainty();
          }

          @Override public void setToNewInstance() {
            setExpectedRSTD_UncertaintyToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? OTDOA_NeighbourCellInfoElement.expectedRSTD_UncertaintyType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "expectedRSTD_Uncertainty : "
                    + getExpectedRSTD_Uncertainty().toIndentedString(indent);
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
 * AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class cpLengthType extends Asn1Enumerated {
  public enum Value implements Asn1Enumerated.Value {
    normal(0),
    extended(1),
    ;

    Value(int i) {
      value = i;
    }

    private int value;
    public int getAssignedValue() {
      return value;
    }

    @Override public boolean isExtensionValue() {
      return false;
    }
  }

  @Override
  protected Value getDefaultValue() {
    return null
;
  }

  @SuppressWarnings("unchecked")
  public Value enumValue() {
    return (Value) getValue();
  }


  
  public void setTo_normal() {
    setValue(Value.normal);
  }
  
  public void setTo_extended() {
    setValue(Value.extended);
  }
  


  public enum ExtensionValue implements Asn1Enumerated.Value {
    ;

    ExtensionValue(int i) {
      value = i;
    }

    private int value;
    @Override public int getAssignedValue() {
      return value;
    }

    @Override public boolean isExtensionValue() {
      return true;
    }
  }

  @SuppressWarnings("unchecked")
  public ExtensionValue extEnumValue() {
    return (ExtensionValue) getValue();
  }

  

  

  private static final Asn1Tag TAG_cpLengthType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public cpLengthType() {
    super();
    // use template substitution instead of calling getDefaultValue(), since
    // calling virtual methods from a ctor is frowned upon here.
    setValue(null
);
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_cpLengthType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_cpLengthType != null) {
      return ImmutableList.of(TAG_cpLengthType);
    } else {
      return Asn1Enumerated.getPossibleFirstTags();
    }
  }

  @Override protected boolean isExtensible() {
    return true;
  }

  @Override protected Asn1Enumerated.Value lookupValue(int ordinal) {
    return Value.values()[ordinal];
  }

  @Override protected Asn1Enumerated.Value lookupExtensionValue(int ordinal) {
    return ExtensionValue.values()[ordinal];
  }

  @Override protected int getValueCount() {
    return Value.values().length;
  }

  /**
   * Creates a new cpLengthType from encoded stream.
   */
  public static cpLengthType fromPerUnaligned(byte[] encodedBytes) {
    cpLengthType result = new cpLengthType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new cpLengthType from encoded stream.
   */
  public static cpLengthType fromPerAligned(byte[] encodedBytes) {
    cpLengthType result = new cpLengthType();
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
    return "cpLengthType = " + getValue() + ";\n";
  }
}

  
  
  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class antennaPortConfigType extends Asn1Enumerated {
  public enum Value implements Asn1Enumerated.Value {
    ports_1_or_2(0),
    ports_4(1),
    ;

    Value(int i) {
      value = i;
    }

    private int value;
    public int getAssignedValue() {
      return value;
    }

    @Override public boolean isExtensionValue() {
      return false;
    }
  }

  @Override
  protected Value getDefaultValue() {
    return null
;
  }

  @SuppressWarnings("unchecked")
  public Value enumValue() {
    return (Value) getValue();
  }


  
  public void setTo_ports_1_or_2() {
    setValue(Value.ports_1_or_2);
  }
  
  public void setTo_ports_4() {
    setValue(Value.ports_4);
  }
  


  public enum ExtensionValue implements Asn1Enumerated.Value {
    ;

    ExtensionValue(int i) {
      value = i;
    }

    private int value;
    @Override public int getAssignedValue() {
      return value;
    }

    @Override public boolean isExtensionValue() {
      return true;
    }
  }

  @SuppressWarnings("unchecked")
  public ExtensionValue extEnumValue() {
    return (ExtensionValue) getValue();
  }

  

  

  private static final Asn1Tag TAG_antennaPortConfigType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public antennaPortConfigType() {
    super();
    // use template substitution instead of calling getDefaultValue(), since
    // calling virtual methods from a ctor is frowned upon here.
    setValue(null
);
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_antennaPortConfigType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_antennaPortConfigType != null) {
      return ImmutableList.of(TAG_antennaPortConfigType);
    } else {
      return Asn1Enumerated.getPossibleFirstTags();
    }
  }

  @Override protected boolean isExtensible() {
    return true;
  }

  @Override protected Asn1Enumerated.Value lookupValue(int ordinal) {
    return Value.values()[ordinal];
  }

  @Override protected Asn1Enumerated.Value lookupExtensionValue(int ordinal) {
    return ExtensionValue.values()[ordinal];
  }

  @Override protected int getValueCount() {
    return Value.values().length;
  }

  /**
   * Creates a new antennaPortConfigType from encoded stream.
   */
  public static antennaPortConfigType fromPerUnaligned(byte[] encodedBytes) {
    antennaPortConfigType result = new antennaPortConfigType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new antennaPortConfigType from encoded stream.
   */
  public static antennaPortConfigType fromPerAligned(byte[] encodedBytes) {
    antennaPortConfigType result = new antennaPortConfigType();
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
    return "antennaPortConfigType = " + getValue() + ";\n";
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
public static class slotNumberOffsetType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_slotNumberOffsetType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public slotNumberOffsetType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("19"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_slotNumberOffsetType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_slotNumberOffsetType != null) {
      return ImmutableList.of(TAG_slotNumberOffsetType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new slotNumberOffsetType from encoded stream.
   */
  public static slotNumberOffsetType fromPerUnaligned(byte[] encodedBytes) {
    slotNumberOffsetType result = new slotNumberOffsetType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new slotNumberOffsetType from encoded stream.
   */
  public static slotNumberOffsetType fromPerAligned(byte[] encodedBytes) {
    slotNumberOffsetType result = new slotNumberOffsetType();
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
    return "slotNumberOffsetType = " + getInteger() + ";\n";
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
public static class prs_SubframeOffsetType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_prs_SubframeOffsetType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public prs_SubframeOffsetType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("1279"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_prs_SubframeOffsetType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_prs_SubframeOffsetType != null) {
      return ImmutableList.of(TAG_prs_SubframeOffsetType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new prs_SubframeOffsetType from encoded stream.
   */
  public static prs_SubframeOffsetType fromPerUnaligned(byte[] encodedBytes) {
    prs_SubframeOffsetType result = new prs_SubframeOffsetType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new prs_SubframeOffsetType from encoded stream.
   */
  public static prs_SubframeOffsetType fromPerAligned(byte[] encodedBytes) {
    prs_SubframeOffsetType result = new prs_SubframeOffsetType();
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
    return "prs_SubframeOffsetType = " + getInteger() + ";\n";
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
public static class expectedRSTDType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_expectedRSTDType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public expectedRSTDType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("16383"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_expectedRSTDType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_expectedRSTDType != null) {
      return ImmutableList.of(TAG_expectedRSTDType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new expectedRSTDType from encoded stream.
   */
  public static expectedRSTDType fromPerUnaligned(byte[] encodedBytes) {
    expectedRSTDType result = new expectedRSTDType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new expectedRSTDType from encoded stream.
   */
  public static expectedRSTDType fromPerAligned(byte[] encodedBytes) {
    expectedRSTDType result = new expectedRSTDType();
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
    return "expectedRSTDType = " + getInteger() + ";\n";
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
public static class expectedRSTD_UncertaintyType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_expectedRSTD_UncertaintyType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public expectedRSTD_UncertaintyType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("1023"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_expectedRSTD_UncertaintyType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_expectedRSTD_UncertaintyType != null) {
      return ImmutableList.of(TAG_expectedRSTD_UncertaintyType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new expectedRSTD_UncertaintyType from encoded stream.
   */
  public static expectedRSTD_UncertaintyType fromPerUnaligned(byte[] encodedBytes) {
    expectedRSTD_UncertaintyType result = new expectedRSTD_UncertaintyType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new expectedRSTD_UncertaintyType from encoded stream.
   */
  public static expectedRSTD_UncertaintyType fromPerAligned(byte[] encodedBytes) {
    expectedRSTD_UncertaintyType result = new expectedRSTD_UncertaintyType();
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
    return "expectedRSTD_UncertaintyType = " + getInteger() + ";\n";
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

  
  private ARFCN_ValueEUTRA_v9a0 earfcn_v9a0_;
  public ARFCN_ValueEUTRA_v9a0 getEarfcn_v9a0() {
    return earfcn_v9a0_;
  }
  /**
   * @throws ClassCastException if value is not a ARFCN_ValueEUTRA_v9a0
   */
  public void setEarfcn_v9a0(Asn1Object value) {
    this.earfcn_v9a0_ = (ARFCN_ValueEUTRA_v9a0) value;
  }
  public ARFCN_ValueEUTRA_v9a0 setEarfcn_v9a0ToNewInstance() {
    earfcn_v9a0_ = new ARFCN_ValueEUTRA_v9a0();
    return earfcn_v9a0_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getEarfcn_v9a0() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getEarfcn_v9a0();
          }

          @Override public void setToNewInstance() {
            setEarfcn_v9a0ToNewInstance();
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
                return "earfcn_v9a0 : "
                    + getEarfcn_v9a0().toIndentedString(indent);
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
    builder.append("OTDOA_NeighbourCellInfoElement = {\n");
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
