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
import com.google.location.suplclient.asn1.base.Asn1Null;
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
public  class GNSS_TargetDeviceErrorCauses extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GNSS_TargetDeviceErrorCauses
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GNSS_TargetDeviceErrorCauses() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GNSS_TargetDeviceErrorCauses;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GNSS_TargetDeviceErrorCauses != null) {
      return ImmutableList.of(TAG_GNSS_TargetDeviceErrorCauses);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GNSS_TargetDeviceErrorCauses from encoded stream.
   */
  public static GNSS_TargetDeviceErrorCauses fromPerUnaligned(byte[] encodedBytes) {
    GNSS_TargetDeviceErrorCauses result = new GNSS_TargetDeviceErrorCauses();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GNSS_TargetDeviceErrorCauses from encoded stream.
   */
  public static GNSS_TargetDeviceErrorCauses fromPerAligned(byte[] encodedBytes) {
    GNSS_TargetDeviceErrorCauses result = new GNSS_TargetDeviceErrorCauses();
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

  
  private GNSS_TargetDeviceErrorCauses.causeType cause_;
  public GNSS_TargetDeviceErrorCauses.causeType getCause() {
    return cause_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_TargetDeviceErrorCauses.causeType
   */
  public void setCause(Asn1Object value) {
    this.cause_ = (GNSS_TargetDeviceErrorCauses.causeType) value;
  }
  public GNSS_TargetDeviceErrorCauses.causeType setCauseToNewInstance() {
    cause_ = new GNSS_TargetDeviceErrorCauses.causeType();
    return cause_;
  }
  
  private GNSS_TargetDeviceErrorCauses.fineTimeAssistanceMeasurementsNotPossibleType fineTimeAssistanceMeasurementsNotPossible_;
  public GNSS_TargetDeviceErrorCauses.fineTimeAssistanceMeasurementsNotPossibleType getFineTimeAssistanceMeasurementsNotPossible() {
    return fineTimeAssistanceMeasurementsNotPossible_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_TargetDeviceErrorCauses.fineTimeAssistanceMeasurementsNotPossibleType
   */
  public void setFineTimeAssistanceMeasurementsNotPossible(Asn1Object value) {
    this.fineTimeAssistanceMeasurementsNotPossible_ = (GNSS_TargetDeviceErrorCauses.fineTimeAssistanceMeasurementsNotPossibleType) value;
  }
  public GNSS_TargetDeviceErrorCauses.fineTimeAssistanceMeasurementsNotPossibleType setFineTimeAssistanceMeasurementsNotPossibleToNewInstance() {
    fineTimeAssistanceMeasurementsNotPossible_ = new GNSS_TargetDeviceErrorCauses.fineTimeAssistanceMeasurementsNotPossibleType();
    return fineTimeAssistanceMeasurementsNotPossible_;
  }
  
  private GNSS_TargetDeviceErrorCauses.adrMeasurementsNotPossibleType adrMeasurementsNotPossible_;
  public GNSS_TargetDeviceErrorCauses.adrMeasurementsNotPossibleType getAdrMeasurementsNotPossible() {
    return adrMeasurementsNotPossible_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_TargetDeviceErrorCauses.adrMeasurementsNotPossibleType
   */
  public void setAdrMeasurementsNotPossible(Asn1Object value) {
    this.adrMeasurementsNotPossible_ = (GNSS_TargetDeviceErrorCauses.adrMeasurementsNotPossibleType) value;
  }
  public GNSS_TargetDeviceErrorCauses.adrMeasurementsNotPossibleType setAdrMeasurementsNotPossibleToNewInstance() {
    adrMeasurementsNotPossible_ = new GNSS_TargetDeviceErrorCauses.adrMeasurementsNotPossibleType();
    return adrMeasurementsNotPossible_;
  }
  
  private GNSS_TargetDeviceErrorCauses.multiFrequencyMeasurementsNotPossibleType multiFrequencyMeasurementsNotPossible_;
  public GNSS_TargetDeviceErrorCauses.multiFrequencyMeasurementsNotPossibleType getMultiFrequencyMeasurementsNotPossible() {
    return multiFrequencyMeasurementsNotPossible_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_TargetDeviceErrorCauses.multiFrequencyMeasurementsNotPossibleType
   */
  public void setMultiFrequencyMeasurementsNotPossible(Asn1Object value) {
    this.multiFrequencyMeasurementsNotPossible_ = (GNSS_TargetDeviceErrorCauses.multiFrequencyMeasurementsNotPossibleType) value;
  }
  public GNSS_TargetDeviceErrorCauses.multiFrequencyMeasurementsNotPossibleType setMultiFrequencyMeasurementsNotPossibleToNewInstance() {
    multiFrequencyMeasurementsNotPossible_ = new GNSS_TargetDeviceErrorCauses.multiFrequencyMeasurementsNotPossibleType();
    return multiFrequencyMeasurementsNotPossible_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getCause() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCause();
          }

          @Override public void setToNewInstance() {
            setCauseToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_TargetDeviceErrorCauses.causeType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "cause : "
                    + getCause().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getFineTimeAssistanceMeasurementsNotPossible() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getFineTimeAssistanceMeasurementsNotPossible();
          }

          @Override public void setToNewInstance() {
            setFineTimeAssistanceMeasurementsNotPossibleToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_TargetDeviceErrorCauses.fineTimeAssistanceMeasurementsNotPossibleType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "fineTimeAssistanceMeasurementsNotPossible : "
                    + getFineTimeAssistanceMeasurementsNotPossible().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getAdrMeasurementsNotPossible() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getAdrMeasurementsNotPossible();
          }

          @Override public void setToNewInstance() {
            setAdrMeasurementsNotPossibleToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_TargetDeviceErrorCauses.adrMeasurementsNotPossibleType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "adrMeasurementsNotPossible : "
                    + getAdrMeasurementsNotPossible().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getMultiFrequencyMeasurementsNotPossible() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getMultiFrequencyMeasurementsNotPossible();
          }

          @Override public void setToNewInstance() {
            setMultiFrequencyMeasurementsNotPossibleToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_TargetDeviceErrorCauses.multiFrequencyMeasurementsNotPossibleType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "multiFrequencyMeasurementsNotPossible : "
                    + getMultiFrequencyMeasurementsNotPossible().toIndentedString(indent);
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
 * AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class causeType extends Asn1Enumerated {
  public enum Value implements Asn1Enumerated.Value {
    undefined(0),
    thereWereNotEnoughSatellitesReceived(1),
    assistanceDataMissing(2),
    notAllRequestedMeasurementsPossible(3),
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


  
  public void setTo_undefined() {
    setValue(Value.undefined);
  }
  
  public void setTo_thereWereNotEnoughSatellitesReceived() {
    setValue(Value.thereWereNotEnoughSatellitesReceived);
  }
  
  public void setTo_assistanceDataMissing() {
    setValue(Value.assistanceDataMissing);
  }
  
  public void setTo_notAllRequestedMeasurementsPossible() {
    setValue(Value.notAllRequestedMeasurementsPossible);
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

  

  

  private static final Asn1Tag TAG_causeType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public causeType() {
    super();
    // use template substitution instead of calling getDefaultValue(), since
    // calling virtual methods from a ctor is frowned upon here.
    setValue(null
);
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_causeType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_causeType != null) {
      return ImmutableList.of(TAG_causeType);
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
   * Creates a new causeType from encoded stream.
   */
  public static causeType fromPerUnaligned(byte[] encodedBytes) {
    causeType result = new causeType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new causeType from encoded stream.
   */
  public static causeType fromPerAligned(byte[] encodedBytes) {
    causeType result = new causeType();
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
    return "causeType = " + getValue() + ";\n";
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
public static class fineTimeAssistanceMeasurementsNotPossibleType extends Asn1Null {
  //

  private static final Asn1Tag TAG_fineTimeAssistanceMeasurementsNotPossibleType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public fineTimeAssistanceMeasurementsNotPossibleType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_fineTimeAssistanceMeasurementsNotPossibleType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_fineTimeAssistanceMeasurementsNotPossibleType != null) {
      return ImmutableList.of(TAG_fineTimeAssistanceMeasurementsNotPossibleType);
    } else {
      return Asn1Null.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new fineTimeAssistanceMeasurementsNotPossibleType from encoded stream.
   */
  public static fineTimeAssistanceMeasurementsNotPossibleType fromPerUnaligned(byte[] encodedBytes) {
    fineTimeAssistanceMeasurementsNotPossibleType result = new fineTimeAssistanceMeasurementsNotPossibleType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new fineTimeAssistanceMeasurementsNotPossibleType from encoded stream.
   */
  public static fineTimeAssistanceMeasurementsNotPossibleType fromPerAligned(byte[] encodedBytes) {
    fineTimeAssistanceMeasurementsNotPossibleType result = new fineTimeAssistanceMeasurementsNotPossibleType();
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
    return "fineTimeAssistanceMeasurementsNotPossibleType (null value);\n";
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
public static class adrMeasurementsNotPossibleType extends Asn1Null {
  //

  private static final Asn1Tag TAG_adrMeasurementsNotPossibleType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public adrMeasurementsNotPossibleType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_adrMeasurementsNotPossibleType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_adrMeasurementsNotPossibleType != null) {
      return ImmutableList.of(TAG_adrMeasurementsNotPossibleType);
    } else {
      return Asn1Null.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new adrMeasurementsNotPossibleType from encoded stream.
   */
  public static adrMeasurementsNotPossibleType fromPerUnaligned(byte[] encodedBytes) {
    adrMeasurementsNotPossibleType result = new adrMeasurementsNotPossibleType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new adrMeasurementsNotPossibleType from encoded stream.
   */
  public static adrMeasurementsNotPossibleType fromPerAligned(byte[] encodedBytes) {
    adrMeasurementsNotPossibleType result = new adrMeasurementsNotPossibleType();
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
    return "adrMeasurementsNotPossibleType (null value);\n";
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
public static class multiFrequencyMeasurementsNotPossibleType extends Asn1Null {
  //

  private static final Asn1Tag TAG_multiFrequencyMeasurementsNotPossibleType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public multiFrequencyMeasurementsNotPossibleType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_multiFrequencyMeasurementsNotPossibleType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_multiFrequencyMeasurementsNotPossibleType != null) {
      return ImmutableList.of(TAG_multiFrequencyMeasurementsNotPossibleType);
    } else {
      return Asn1Null.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new multiFrequencyMeasurementsNotPossibleType from encoded stream.
   */
  public static multiFrequencyMeasurementsNotPossibleType fromPerUnaligned(byte[] encodedBytes) {
    multiFrequencyMeasurementsNotPossibleType result = new multiFrequencyMeasurementsNotPossibleType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new multiFrequencyMeasurementsNotPossibleType from encoded stream.
   */
  public static multiFrequencyMeasurementsNotPossibleType fromPerAligned(byte[] encodedBytes) {
    multiFrequencyMeasurementsNotPossibleType result = new multiFrequencyMeasurementsNotPossibleType();
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
    return "multiFrequencyMeasurementsNotPossibleType (null value);\n";
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
    builder.append("GNSS_TargetDeviceErrorCauses = {\n");
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
