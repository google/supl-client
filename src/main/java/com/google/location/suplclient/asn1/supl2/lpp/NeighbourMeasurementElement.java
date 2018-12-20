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
public  class NeighbourMeasurementElement extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_NeighbourMeasurementElement
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public NeighbourMeasurementElement() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_NeighbourMeasurementElement;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_NeighbourMeasurementElement != null) {
      return ImmutableList.of(TAG_NeighbourMeasurementElement);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new NeighbourMeasurementElement from encoded stream.
   */
  public static NeighbourMeasurementElement fromPerUnaligned(byte[] encodedBytes) {
    NeighbourMeasurementElement result = new NeighbourMeasurementElement();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new NeighbourMeasurementElement from encoded stream.
   */
  public static NeighbourMeasurementElement fromPerAligned(byte[] encodedBytes) {
    NeighbourMeasurementElement result = new NeighbourMeasurementElement();
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

  
  private NeighbourMeasurementElement.physCellIdNeighbourType physCellIdNeighbour_;
  public NeighbourMeasurementElement.physCellIdNeighbourType getPhysCellIdNeighbour() {
    return physCellIdNeighbour_;
  }
  /**
   * @throws ClassCastException if value is not a NeighbourMeasurementElement.physCellIdNeighbourType
   */
  public void setPhysCellIdNeighbour(Asn1Object value) {
    this.physCellIdNeighbour_ = (NeighbourMeasurementElement.physCellIdNeighbourType) value;
  }
  public NeighbourMeasurementElement.physCellIdNeighbourType setPhysCellIdNeighbourToNewInstance() {
    physCellIdNeighbour_ = new NeighbourMeasurementElement.physCellIdNeighbourType();
    return physCellIdNeighbour_;
  }
  
  private ECGI cellGlobalIdNeighbour_;
  public ECGI getCellGlobalIdNeighbour() {
    return cellGlobalIdNeighbour_;
  }
  /**
   * @throws ClassCastException if value is not a ECGI
   */
  public void setCellGlobalIdNeighbour(Asn1Object value) {
    this.cellGlobalIdNeighbour_ = (ECGI) value;
  }
  public ECGI setCellGlobalIdNeighbourToNewInstance() {
    cellGlobalIdNeighbour_ = new ECGI();
    return cellGlobalIdNeighbour_;
  }
  
  private ARFCN_ValueEUTRA earfcnNeighbour_;
  public ARFCN_ValueEUTRA getEarfcnNeighbour() {
    return earfcnNeighbour_;
  }
  /**
   * @throws ClassCastException if value is not a ARFCN_ValueEUTRA
   */
  public void setEarfcnNeighbour(Asn1Object value) {
    this.earfcnNeighbour_ = (ARFCN_ValueEUTRA) value;
  }
  public ARFCN_ValueEUTRA setEarfcnNeighbourToNewInstance() {
    earfcnNeighbour_ = new ARFCN_ValueEUTRA();
    return earfcnNeighbour_;
  }
  
  private NeighbourMeasurementElement.rstdType rstd_;
  public NeighbourMeasurementElement.rstdType getRstd() {
    return rstd_;
  }
  /**
   * @throws ClassCastException if value is not a NeighbourMeasurementElement.rstdType
   */
  public void setRstd(Asn1Object value) {
    this.rstd_ = (NeighbourMeasurementElement.rstdType) value;
  }
  public NeighbourMeasurementElement.rstdType setRstdToNewInstance() {
    rstd_ = new NeighbourMeasurementElement.rstdType();
    return rstd_;
  }
  
  private OTDOA_MeasQuality rstd_Quality_;
  public OTDOA_MeasQuality getRstd_Quality() {
    return rstd_Quality_;
  }
  /**
   * @throws ClassCastException if value is not a OTDOA_MeasQuality
   */
  public void setRstd_Quality(Asn1Object value) {
    this.rstd_Quality_ = (OTDOA_MeasQuality) value;
  }
  public OTDOA_MeasQuality setRstd_QualityToNewInstance() {
    rstd_Quality_ = new OTDOA_MeasQuality();
    return rstd_Quality_;
  }
  

  
  private NeighbourMeasurementElement.ext1Type  extensionExt1;
  public NeighbourMeasurementElement.ext1Type getExtensionExt1() {
    return extensionExt1;
  }
  /**
   * @throws ClassCastException if value is not a NeighbourMeasurementElement.ext1Type
   */
  public void setExtensionExt1(Asn1Object value) {
    extensionExt1 = (NeighbourMeasurementElement.ext1Type) value;
  }
  public void setExtensionExt1ToNewInstance() {
    extensionExt1 = new NeighbourMeasurementElement.ext1Type();
  }
    

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getPhysCellIdNeighbour() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getPhysCellIdNeighbour();
          }

          @Override public void setToNewInstance() {
            setPhysCellIdNeighbourToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NeighbourMeasurementElement.physCellIdNeighbourType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "physCellIdNeighbour : "
                    + getPhysCellIdNeighbour().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getCellGlobalIdNeighbour() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getCellGlobalIdNeighbour();
          }

          @Override public void setToNewInstance() {
            setCellGlobalIdNeighbourToNewInstance();
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
                return "cellGlobalIdNeighbour : "
                    + getCellGlobalIdNeighbour().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getEarfcnNeighbour() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getEarfcnNeighbour();
          }

          @Override public void setToNewInstance() {
            setEarfcnNeighbourToNewInstance();
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
                return "earfcnNeighbour : "
                    + getEarfcnNeighbour().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getRstd() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getRstd();
          }

          @Override public void setToNewInstance() {
            setRstdToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NeighbourMeasurementElement.rstdType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "rstd : "
                    + getRstd().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getRstd_Quality() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getRstd_Quality();
          }

          @Override public void setToNewInstance() {
            setRstd_QualityToNewInstance();
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
                return "rstd_Quality : "
                    + getRstd_Quality().toIndentedString(indent);
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
public static class physCellIdNeighbourType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_physCellIdNeighbourType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public physCellIdNeighbourType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("503"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_physCellIdNeighbourType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_physCellIdNeighbourType != null) {
      return ImmutableList.of(TAG_physCellIdNeighbourType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new physCellIdNeighbourType from encoded stream.
   */
  public static physCellIdNeighbourType fromPerUnaligned(byte[] encodedBytes) {
    physCellIdNeighbourType result = new physCellIdNeighbourType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new physCellIdNeighbourType from encoded stream.
   */
  public static physCellIdNeighbourType fromPerAligned(byte[] encodedBytes) {
    physCellIdNeighbourType result = new physCellIdNeighbourType();
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
    return "physCellIdNeighbourType = " + getInteger() + ";\n";
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
public static class rstdType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_rstdType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public rstdType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("12711"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_rstdType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_rstdType != null) {
      return ImmutableList.of(TAG_rstdType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new rstdType from encoded stream.
   */
  public static rstdType fromPerUnaligned(byte[] encodedBytes) {
    rstdType result = new rstdType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new rstdType from encoded stream.
   */
  public static rstdType fromPerAligned(byte[] encodedBytes) {
    rstdType result = new rstdType();
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
    return "rstdType = " + getInteger() + ";\n";
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

  
  private ARFCN_ValueEUTRA_v9a0 earfcnNeighbour_v9a0_;
  public ARFCN_ValueEUTRA_v9a0 getEarfcnNeighbour_v9a0() {
    return earfcnNeighbour_v9a0_;
  }
  /**
   * @throws ClassCastException if value is not a ARFCN_ValueEUTRA_v9a0
   */
  public void setEarfcnNeighbour_v9a0(Asn1Object value) {
    this.earfcnNeighbour_v9a0_ = (ARFCN_ValueEUTRA_v9a0) value;
  }
  public ARFCN_ValueEUTRA_v9a0 setEarfcnNeighbour_v9a0ToNewInstance() {
    earfcnNeighbour_v9a0_ = new ARFCN_ValueEUTRA_v9a0();
    return earfcnNeighbour_v9a0_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getEarfcnNeighbour_v9a0() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getEarfcnNeighbour_v9a0();
          }

          @Override public void setToNewInstance() {
            setEarfcnNeighbour_v9a0ToNewInstance();
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
                return "earfcnNeighbour_v9a0 : "
                    + getEarfcnNeighbour_v9a0().toIndentedString(indent);
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
    builder.append("NeighbourMeasurementElement = {\n");
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
