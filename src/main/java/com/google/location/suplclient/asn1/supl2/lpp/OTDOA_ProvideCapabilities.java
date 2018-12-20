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
import com.google.location.suplclient.asn1.base.Asn1Enumerated;
import com.google.location.suplclient.asn1.base.Asn1Object;
import com.google.location.suplclient.asn1.base.Asn1Sequence;
import com.google.location.suplclient.asn1.base.Asn1SequenceOf;
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
public  class OTDOA_ProvideCapabilities extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_OTDOA_ProvideCapabilities
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public OTDOA_ProvideCapabilities() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_OTDOA_ProvideCapabilities;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_OTDOA_ProvideCapabilities != null) {
      return ImmutableList.of(TAG_OTDOA_ProvideCapabilities);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new OTDOA_ProvideCapabilities from encoded stream.
   */
  public static OTDOA_ProvideCapabilities fromPerUnaligned(byte[] encodedBytes) {
    OTDOA_ProvideCapabilities result = new OTDOA_ProvideCapabilities();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new OTDOA_ProvideCapabilities from encoded stream.
   */
  public static OTDOA_ProvideCapabilities fromPerAligned(byte[] encodedBytes) {
    OTDOA_ProvideCapabilities result = new OTDOA_ProvideCapabilities();
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

  
  private OTDOA_ProvideCapabilities.otdoa_ModeType otdoa_Mode_;
  public OTDOA_ProvideCapabilities.otdoa_ModeType getOtdoa_Mode() {
    return otdoa_Mode_;
  }
  /**
   * @throws ClassCastException if value is not a OTDOA_ProvideCapabilities.otdoa_ModeType
   */
  public void setOtdoa_Mode(Asn1Object value) {
    this.otdoa_Mode_ = (OTDOA_ProvideCapabilities.otdoa_ModeType) value;
  }
  public OTDOA_ProvideCapabilities.otdoa_ModeType setOtdoa_ModeToNewInstance() {
    otdoa_Mode_ = new OTDOA_ProvideCapabilities.otdoa_ModeType();
    return otdoa_Mode_;
  }
  

  
  private OTDOA_ProvideCapabilities.supportedBandListEUTRAType  extensionSupportedBandListEUTRA;
  public OTDOA_ProvideCapabilities.supportedBandListEUTRAType getExtensionSupportedBandListEUTRA() {
    return extensionSupportedBandListEUTRA;
  }
  /**
   * @throws ClassCastException if value is not a OTDOA_ProvideCapabilities.supportedBandListEUTRAType
   */
  public void setExtensionSupportedBandListEUTRA(Asn1Object value) {
    extensionSupportedBandListEUTRA = (OTDOA_ProvideCapabilities.supportedBandListEUTRAType) value;
  }
  public void setExtensionSupportedBandListEUTRAToNewInstance() {
    extensionSupportedBandListEUTRA = new OTDOA_ProvideCapabilities.supportedBandListEUTRAType();
  }
    
  private OTDOA_ProvideCapabilities.supportedBandListEUTRA_v9a0Type  extensionSupportedBandListEUTRA_v9a0;
  public OTDOA_ProvideCapabilities.supportedBandListEUTRA_v9a0Type getExtensionSupportedBandListEUTRA_v9a0() {
    return extensionSupportedBandListEUTRA_v9a0;
  }
  /**
   * @throws ClassCastException if value is not a OTDOA_ProvideCapabilities.supportedBandListEUTRA_v9a0Type
   */
  public void setExtensionSupportedBandListEUTRA_v9a0(Asn1Object value) {
    extensionSupportedBandListEUTRA_v9a0 = (OTDOA_ProvideCapabilities.supportedBandListEUTRA_v9a0Type) value;
  }
  public void setExtensionSupportedBandListEUTRA_v9a0ToNewInstance() {
    extensionSupportedBandListEUTRA_v9a0 = new OTDOA_ProvideCapabilities.supportedBandListEUTRA_v9a0Type();
  }
    
  private OTDOA_ProvideCapabilities.interFreqRSTDmeasurement_r10Type  extensionInterFreqRSTDmeasurement_r10;
  public OTDOA_ProvideCapabilities.interFreqRSTDmeasurement_r10Type getExtensionInterFreqRSTDmeasurement_r10() {
    return extensionInterFreqRSTDmeasurement_r10;
  }
  /**
   * @throws ClassCastException if value is not a OTDOA_ProvideCapabilities.interFreqRSTDmeasurement_r10Type
   */
  public void setExtensionInterFreqRSTDmeasurement_r10(Asn1Object value) {
    extensionInterFreqRSTDmeasurement_r10 = (OTDOA_ProvideCapabilities.interFreqRSTDmeasurement_r10Type) value;
  }
  public void setExtensionInterFreqRSTDmeasurement_r10ToNewInstance() {
    extensionInterFreqRSTDmeasurement_r10 = new OTDOA_ProvideCapabilities.interFreqRSTDmeasurement_r10Type();
  }
    
  private OTDOA_ProvideCapabilities.additionalNeighbourCellInfoList_r10Type  extensionAdditionalNeighbourCellInfoList_r10;
  public OTDOA_ProvideCapabilities.additionalNeighbourCellInfoList_r10Type getExtensionAdditionalNeighbourCellInfoList_r10() {
    return extensionAdditionalNeighbourCellInfoList_r10;
  }
  /**
   * @throws ClassCastException if value is not a OTDOA_ProvideCapabilities.additionalNeighbourCellInfoList_r10Type
   */
  public void setExtensionAdditionalNeighbourCellInfoList_r10(Asn1Object value) {
    extensionAdditionalNeighbourCellInfoList_r10 = (OTDOA_ProvideCapabilities.additionalNeighbourCellInfoList_r10Type) value;
  }
  public void setExtensionAdditionalNeighbourCellInfoList_r10ToNewInstance() {
    extensionAdditionalNeighbourCellInfoList_r10 = new OTDOA_ProvideCapabilities.additionalNeighbourCellInfoList_r10Type();
  }
    

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getOtdoa_Mode() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getOtdoa_Mode();
          }

          @Override public void setToNewInstance() {
            setOtdoa_ModeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? OTDOA_ProvideCapabilities.otdoa_ModeType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "otdoa_Mode : "
                    + getOtdoa_Mode().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      builder.add(new SequenceComponent() {
            @Override public boolean isExplicitlySet() {
              return getExtensionSupportedBandListEUTRA() != null;
            }

            @Override public boolean hasDefaultValue() {
              return false;
            }

            @Override public boolean isOptional() {
              return true;
            }

            @Override public Asn1Object getComponentValue() {
              return getExtensionSupportedBandListEUTRA();
            }

            @Override public void setToNewInstance() {
              setExtensionSupportedBandListEUTRAToNewInstance();
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
              return "supportedBandListEUTRA : "
                  + getExtensionSupportedBandListEUTRA().toIndentedString(indent);
            }
      });
      
      builder.add(new SequenceComponent() {
            @Override public boolean isExplicitlySet() {
              return getExtensionSupportedBandListEUTRA_v9a0() != null;
            }

            @Override public boolean hasDefaultValue() {
              return false;
            }

            @Override public boolean isOptional() {
              return true;
            }

            @Override public Asn1Object getComponentValue() {
              return getExtensionSupportedBandListEUTRA_v9a0();
            }

            @Override public void setToNewInstance() {
              setExtensionSupportedBandListEUTRA_v9a0ToNewInstance();
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
              return "supportedBandListEUTRA_v9a0 : "
                  + getExtensionSupportedBandListEUTRA_v9a0().toIndentedString(indent);
            }
      });
      
      builder.add(new SequenceComponent() {
            @Override public boolean isExplicitlySet() {
              return getExtensionInterFreqRSTDmeasurement_r10() != null;
            }

            @Override public boolean hasDefaultValue() {
              return false;
            }

            @Override public boolean isOptional() {
              return true;
            }

            @Override public Asn1Object getComponentValue() {
              return getExtensionInterFreqRSTDmeasurement_r10();
            }

            @Override public void setToNewInstance() {
              setExtensionInterFreqRSTDmeasurement_r10ToNewInstance();
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
              return "interFreqRSTDmeasurement_r10 : "
                  + getExtensionInterFreqRSTDmeasurement_r10().toIndentedString(indent);
            }
      });
      
      builder.add(new SequenceComponent() {
            @Override public boolean isExplicitlySet() {
              return getExtensionAdditionalNeighbourCellInfoList_r10() != null;
            }

            @Override public boolean hasDefaultValue() {
              return false;
            }

            @Override public boolean isOptional() {
              return true;
            }

            @Override public Asn1Object getComponentValue() {
              return getExtensionAdditionalNeighbourCellInfoList_r10();
            }

            @Override public void setToNewInstance() {
              setExtensionAdditionalNeighbourCellInfoList_r10ToNewInstance();
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
              return "additionalNeighbourCellInfoList_r10 : "
                  + getExtensionAdditionalNeighbourCellInfoList_r10().toIndentedString(indent);
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
public static class otdoa_ModeType extends Asn1BitString {
  //

  // defined bit positions, if any
  public static final int ue_assisted = 0;
  

  // setters
  public final void set_ue_assisted() {
    ensureValuePopulated();
    getValue().set(0);
  }
  

  // clearers
  public final boolean get_ue_assisted() {
    ensureValuePopulated();
    return getValue().get(0);
  }
  


  private static final Asn1Tag TAG_otdoa_ModeType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public otdoa_ModeType() {
    super();
    setMinSize(1);
setMaxSize(8);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_otdoa_ModeType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_otdoa_ModeType != null) {
      return ImmutableList.of(TAG_otdoa_ModeType);
    } else {
      return Asn1BitString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new otdoa_ModeType from encoded stream.
   */
  public static otdoa_ModeType fromPerUnaligned(byte[] encodedBytes) {
    otdoa_ModeType result = new otdoa_ModeType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new otdoa_ModeType from encoded stream.
   */
  public static otdoa_ModeType fromPerAligned(byte[] encodedBytes) {
    otdoa_ModeType result = new otdoa_ModeType();
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
    return "otdoa_ModeType = " + getValue() + ";\n";
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
public static class supportedBandListEUTRAType
    extends Asn1SequenceOf<SupportedBandEUTRA> {
  //

  private static final Asn1Tag TAG_supportedBandListEUTRAType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public supportedBandListEUTRAType() {
    super();
    setMinSize(1);
setMaxSize(maxBands.VALUE.intValue());

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_supportedBandListEUTRAType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_supportedBandListEUTRAType != null) {
      return ImmutableList.of(TAG_supportedBandListEUTRAType);
    } else {
      return Asn1SequenceOf.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new supportedBandListEUTRAType from encoded stream.
   */
  public static supportedBandListEUTRAType fromPerUnaligned(byte[] encodedBytes) {
    supportedBandListEUTRAType result = new supportedBandListEUTRAType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new supportedBandListEUTRAType from encoded stream.
   */
  public static supportedBandListEUTRAType fromPerAligned(byte[] encodedBytes) {
    supportedBandListEUTRAType result = new supportedBandListEUTRAType();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  
  @Override public SupportedBandEUTRA createAndAddValue() {
    SupportedBandEUTRA value = new SupportedBandEUTRA();
    add(value);
    return value;
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
    builder.append("supportedBandListEUTRAType = [\n");
    final String internalIndent = indent + "  ";
    for (SupportedBandEUTRA value : getValues()) {
      builder.append(internalIndent)
          .append(value.toIndentedString(internalIndent));
    }
    builder.append(indent).append("];\n");
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
public static class supportedBandListEUTRA_v9a0Type
    extends Asn1SequenceOf<SupportedBandEUTRA_v9a0> {
  //

  private static final Asn1Tag TAG_supportedBandListEUTRA_v9a0Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public supportedBandListEUTRA_v9a0Type() {
    super();
    setMinSize(1);
setMaxSize(maxBands.VALUE.intValue());

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_supportedBandListEUTRA_v9a0Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_supportedBandListEUTRA_v9a0Type != null) {
      return ImmutableList.of(TAG_supportedBandListEUTRA_v9a0Type);
    } else {
      return Asn1SequenceOf.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new supportedBandListEUTRA_v9a0Type from encoded stream.
   */
  public static supportedBandListEUTRA_v9a0Type fromPerUnaligned(byte[] encodedBytes) {
    supportedBandListEUTRA_v9a0Type result = new supportedBandListEUTRA_v9a0Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new supportedBandListEUTRA_v9a0Type from encoded stream.
   */
  public static supportedBandListEUTRA_v9a0Type fromPerAligned(byte[] encodedBytes) {
    supportedBandListEUTRA_v9a0Type result = new supportedBandListEUTRA_v9a0Type();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  
  @Override public SupportedBandEUTRA_v9a0 createAndAddValue() {
    SupportedBandEUTRA_v9a0 value = new SupportedBandEUTRA_v9a0();
    add(value);
    return value;
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
    builder.append("supportedBandListEUTRA_v9a0Type = [\n");
    final String internalIndent = indent + "  ";
    for (SupportedBandEUTRA_v9a0 value : getValues()) {
      builder.append(internalIndent)
          .append(value.toIndentedString(internalIndent));
    }
    builder.append(indent).append("];\n");
    return builder.toString();
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
public static class interFreqRSTDmeasurement_r10Type extends Asn1Enumerated {
  public enum Value implements Asn1Enumerated.Value {
    supported(0),
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


  
  public void setTo_supported() {
    setValue(Value.supported);
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

  

  

  private static final Asn1Tag TAG_interFreqRSTDmeasurement_r10Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public interFreqRSTDmeasurement_r10Type() {
    super();
    // use template substitution instead of calling getDefaultValue(), since
    // calling virtual methods from a ctor is frowned upon here.
    setValue(null
);
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_interFreqRSTDmeasurement_r10Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_interFreqRSTDmeasurement_r10Type != null) {
      return ImmutableList.of(TAG_interFreqRSTDmeasurement_r10Type);
    } else {
      return Asn1Enumerated.getPossibleFirstTags();
    }
  }

  @Override protected boolean isExtensible() {
    return false;
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
   * Creates a new interFreqRSTDmeasurement_r10Type from encoded stream.
   */
  public static interFreqRSTDmeasurement_r10Type fromPerUnaligned(byte[] encodedBytes) {
    interFreqRSTDmeasurement_r10Type result = new interFreqRSTDmeasurement_r10Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new interFreqRSTDmeasurement_r10Type from encoded stream.
   */
  public static interFreqRSTDmeasurement_r10Type fromPerAligned(byte[] encodedBytes) {
    interFreqRSTDmeasurement_r10Type result = new interFreqRSTDmeasurement_r10Type();
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
    return "interFreqRSTDmeasurement_r10Type = " + getValue() + ";\n";
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
public static class additionalNeighbourCellInfoList_r10Type extends Asn1Enumerated {
  public enum Value implements Asn1Enumerated.Value {
    supported(0),
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


  
  public void setTo_supported() {
    setValue(Value.supported);
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

  

  

  private static final Asn1Tag TAG_additionalNeighbourCellInfoList_r10Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public additionalNeighbourCellInfoList_r10Type() {
    super();
    // use template substitution instead of calling getDefaultValue(), since
    // calling virtual methods from a ctor is frowned upon here.
    setValue(null
);
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_additionalNeighbourCellInfoList_r10Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_additionalNeighbourCellInfoList_r10Type != null) {
      return ImmutableList.of(TAG_additionalNeighbourCellInfoList_r10Type);
    } else {
      return Asn1Enumerated.getPossibleFirstTags();
    }
  }

  @Override protected boolean isExtensible() {
    return false;
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
   * Creates a new additionalNeighbourCellInfoList_r10Type from encoded stream.
   */
  public static additionalNeighbourCellInfoList_r10Type fromPerUnaligned(byte[] encodedBytes) {
    additionalNeighbourCellInfoList_r10Type result = new additionalNeighbourCellInfoList_r10Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new additionalNeighbourCellInfoList_r10Type from encoded stream.
   */
  public static additionalNeighbourCellInfoList_r10Type fromPerAligned(byte[] encodedBytes) {
    additionalNeighbourCellInfoList_r10Type result = new additionalNeighbourCellInfoList_r10Type();
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
    return "additionalNeighbourCellInfoList_r10Type = " + getValue() + ";\n";
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
    builder.append("OTDOA_ProvideCapabilities = {\n");
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
