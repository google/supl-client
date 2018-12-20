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
public  class WcdmaCellInformation extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_WcdmaCellInformation
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public WcdmaCellInformation() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_WcdmaCellInformation;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_WcdmaCellInformation != null) {
      return ImmutableList.of(TAG_WcdmaCellInformation);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new WcdmaCellInformation from encoded stream.
   */
  public static WcdmaCellInformation fromPerUnaligned(byte[] encodedBytes) {
    WcdmaCellInformation result = new WcdmaCellInformation();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new WcdmaCellInformation from encoded stream.
   */
  public static WcdmaCellInformation fromPerAligned(byte[] encodedBytes) {
    WcdmaCellInformation result = new WcdmaCellInformation();
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

  
  private WcdmaCellInformation.refMCCType refMCC_;
  public WcdmaCellInformation.refMCCType getRefMCC() {
    return refMCC_;
  }
  /**
   * @throws ClassCastException if value is not a WcdmaCellInformation.refMCCType
   */
  public void setRefMCC(Asn1Object value) {
    this.refMCC_ = (WcdmaCellInformation.refMCCType) value;
  }
  public WcdmaCellInformation.refMCCType setRefMCCToNewInstance() {
    refMCC_ = new WcdmaCellInformation.refMCCType();
    return refMCC_;
  }
  
  private WcdmaCellInformation.refMNCType refMNC_;
  public WcdmaCellInformation.refMNCType getRefMNC() {
    return refMNC_;
  }
  /**
   * @throws ClassCastException if value is not a WcdmaCellInformation.refMNCType
   */
  public void setRefMNC(Asn1Object value) {
    this.refMNC_ = (WcdmaCellInformation.refMNCType) value;
  }
  public WcdmaCellInformation.refMNCType setRefMNCToNewInstance() {
    refMNC_ = new WcdmaCellInformation.refMNCType();
    return refMNC_;
  }
  
  private WcdmaCellInformation.refUCType refUC_;
  public WcdmaCellInformation.refUCType getRefUC() {
    return refUC_;
  }
  /**
   * @throws ClassCastException if value is not a WcdmaCellInformation.refUCType
   */
  public void setRefUC(Asn1Object value) {
    this.refUC_ = (WcdmaCellInformation.refUCType) value;
  }
  public WcdmaCellInformation.refUCType setRefUCToNewInstance() {
    refUC_ = new WcdmaCellInformation.refUCType();
    return refUC_;
  }
  
  private FrequencyInfo frequencyInfo_;
  public FrequencyInfo getFrequencyInfo() {
    return frequencyInfo_;
  }
  /**
   * @throws ClassCastException if value is not a FrequencyInfo
   */
  public void setFrequencyInfo(Asn1Object value) {
    this.frequencyInfo_ = (FrequencyInfo) value;
  }
  public FrequencyInfo setFrequencyInfoToNewInstance() {
    frequencyInfo_ = new FrequencyInfo();
    return frequencyInfo_;
  }
  
  private WcdmaCellInformation.primaryScramblingCodeType primaryScramblingCode_;
  public WcdmaCellInformation.primaryScramblingCodeType getPrimaryScramblingCode() {
    return primaryScramblingCode_;
  }
  /**
   * @throws ClassCastException if value is not a WcdmaCellInformation.primaryScramblingCodeType
   */
  public void setPrimaryScramblingCode(Asn1Object value) {
    this.primaryScramblingCode_ = (WcdmaCellInformation.primaryScramblingCodeType) value;
  }
  public WcdmaCellInformation.primaryScramblingCodeType setPrimaryScramblingCodeToNewInstance() {
    primaryScramblingCode_ = new WcdmaCellInformation.primaryScramblingCodeType();
    return primaryScramblingCode_;
  }
  
  private MeasuredResultsList measuredResultsList_;
  public MeasuredResultsList getMeasuredResultsList() {
    return measuredResultsList_;
  }
  /**
   * @throws ClassCastException if value is not a MeasuredResultsList
   */
  public void setMeasuredResultsList(Asn1Object value) {
    this.measuredResultsList_ = (MeasuredResultsList) value;
  }
  public MeasuredResultsList setMeasuredResultsListToNewInstance() {
    measuredResultsList_ = new MeasuredResultsList();
    return measuredResultsList_;
  }
  

  
  private WcdmaCellInformation.cellParametersIdType  extensionCellParametersId;
  public WcdmaCellInformation.cellParametersIdType getExtensionCellParametersId() {
    return extensionCellParametersId;
  }
  /**
   * @throws ClassCastException if value is not a WcdmaCellInformation.cellParametersIdType
   */
  public void setExtensionCellParametersId(Asn1Object value) {
    extensionCellParametersId = (WcdmaCellInformation.cellParametersIdType) value;
  }
  public void setExtensionCellParametersIdToNewInstance() {
    extensionCellParametersId = new WcdmaCellInformation.cellParametersIdType();
  }
    
  private TimingAdvance  extensionTimingAdvance;
  public TimingAdvance getExtensionTimingAdvance() {
    return extensionTimingAdvance;
  }
  /**
   * @throws ClassCastException if value is not a TimingAdvance
   */
  public void setExtensionTimingAdvance(Asn1Object value) {
    extensionTimingAdvance = (TimingAdvance) value;
  }
  public void setExtensionTimingAdvanceToNewInstance() {
    extensionTimingAdvance = new TimingAdvance();
  }
    

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getRefMCC() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getRefMCC();
          }

          @Override public void setToNewInstance() {
            setRefMCCToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? WcdmaCellInformation.refMCCType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "refMCC : "
                    + getRefMCC().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getRefMNC() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getRefMNC();
          }

          @Override public void setToNewInstance() {
            setRefMNCToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? WcdmaCellInformation.refMNCType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "refMNC : "
                    + getRefMNC().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getRefUC() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getRefUC();
          }

          @Override public void setToNewInstance() {
            setRefUCToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? WcdmaCellInformation.refUCType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "refUC : "
                    + getRefUC().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getFrequencyInfo() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getFrequencyInfo();
          }

          @Override public void setToNewInstance() {
            setFrequencyInfoToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? FrequencyInfo.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "frequencyInfo : "
                    + getFrequencyInfo().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getPrimaryScramblingCode() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getPrimaryScramblingCode();
          }

          @Override public void setToNewInstance() {
            setPrimaryScramblingCodeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? WcdmaCellInformation.primaryScramblingCodeType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "primaryScramblingCode : "
                    + getPrimaryScramblingCode().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getMeasuredResultsList() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getMeasuredResultsList();
          }

          @Override public void setToNewInstance() {
            setMeasuredResultsListToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? MeasuredResultsList.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "measuredResultsList : "
                    + getMeasuredResultsList().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      builder.add(new SequenceComponent() {
            @Override public boolean isExplicitlySet() {
              return getExtensionCellParametersId() != null;
            }

            @Override public boolean hasDefaultValue() {
              return false;
            }

            @Override public boolean isOptional() {
              return true;
            }

            @Override public Asn1Object getComponentValue() {
              return getExtensionCellParametersId();
            }

            @Override public void setToNewInstance() {
              setExtensionCellParametersIdToNewInstance();
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
              return "cellParametersId : "
                  + getExtensionCellParametersId().toIndentedString(indent);
            }
      });
      
      builder.add(new SequenceComponent() {
            @Override public boolean isExplicitlySet() {
              return getExtensionTimingAdvance() != null;
            }

            @Override public boolean hasDefaultValue() {
              return false;
            }

            @Override public boolean isOptional() {
              return true;
            }

            @Override public Asn1Object getComponentValue() {
              return getExtensionTimingAdvance();
            }

            @Override public void setToNewInstance() {
              setExtensionTimingAdvanceToNewInstance();
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
              return "timingAdvance : "
                  + getExtensionTimingAdvance().toIndentedString(indent);
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
public static class refMCCType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_refMCCType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public refMCCType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("999"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_refMCCType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_refMCCType != null) {
      return ImmutableList.of(TAG_refMCCType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new refMCCType from encoded stream.
   */
  public static refMCCType fromPerUnaligned(byte[] encodedBytes) {
    refMCCType result = new refMCCType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new refMCCType from encoded stream.
   */
  public static refMCCType fromPerAligned(byte[] encodedBytes) {
    refMCCType result = new refMCCType();
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
    return "refMCCType = " + getInteger() + ";\n";
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
public static class refMNCType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_refMNCType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public refMNCType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("999"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_refMNCType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_refMNCType != null) {
      return ImmutableList.of(TAG_refMNCType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new refMNCType from encoded stream.
   */
  public static refMNCType fromPerUnaligned(byte[] encodedBytes) {
    refMNCType result = new refMNCType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new refMNCType from encoded stream.
   */
  public static refMNCType fromPerAligned(byte[] encodedBytes) {
    refMNCType result = new refMNCType();
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
    return "refMNCType = " + getInteger() + ";\n";
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
public static class refUCType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_refUCType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public refUCType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("268435455"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_refUCType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_refUCType != null) {
      return ImmutableList.of(TAG_refUCType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new refUCType from encoded stream.
   */
  public static refUCType fromPerUnaligned(byte[] encodedBytes) {
    refUCType result = new refUCType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new refUCType from encoded stream.
   */
  public static refUCType fromPerAligned(byte[] encodedBytes) {
    refUCType result = new refUCType();
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
    return "refUCType = " + getInteger() + ";\n";
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
public static class primaryScramblingCodeType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_primaryScramblingCodeType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public primaryScramblingCodeType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("511"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_primaryScramblingCodeType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_primaryScramblingCodeType != null) {
      return ImmutableList.of(TAG_primaryScramblingCodeType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new primaryScramblingCodeType from encoded stream.
   */
  public static primaryScramblingCodeType fromPerUnaligned(byte[] encodedBytes) {
    primaryScramblingCodeType result = new primaryScramblingCodeType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new primaryScramblingCodeType from encoded stream.
   */
  public static primaryScramblingCodeType fromPerAligned(byte[] encodedBytes) {
    primaryScramblingCodeType result = new primaryScramblingCodeType();
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
    return "primaryScramblingCodeType = " + getInteger() + ";\n";
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
public static class cellParametersIdType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_cellParametersIdType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public cellParametersIdType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("127"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_cellParametersIdType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_cellParametersIdType != null) {
      return ImmutableList.of(TAG_cellParametersIdType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new cellParametersIdType from encoded stream.
   */
  public static cellParametersIdType fromPerUnaligned(byte[] encodedBytes) {
    cellParametersIdType result = new cellParametersIdType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new cellParametersIdType from encoded stream.
   */
  public static cellParametersIdType fromPerAligned(byte[] encodedBytes) {
    cellParametersIdType result = new cellParametersIdType();
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
    return "cellParametersIdType = " + getInteger() + ";\n";
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
    builder.append("WcdmaCellInformation = {\n");
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
