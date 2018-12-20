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
public  class ECID_TargetDeviceErrorCauses extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_ECID_TargetDeviceErrorCauses
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ECID_TargetDeviceErrorCauses() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ECID_TargetDeviceErrorCauses;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ECID_TargetDeviceErrorCauses != null) {
      return ImmutableList.of(TAG_ECID_TargetDeviceErrorCauses);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ECID_TargetDeviceErrorCauses from encoded stream.
   */
  public static ECID_TargetDeviceErrorCauses fromPerUnaligned(byte[] encodedBytes) {
    ECID_TargetDeviceErrorCauses result = new ECID_TargetDeviceErrorCauses();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ECID_TargetDeviceErrorCauses from encoded stream.
   */
  public static ECID_TargetDeviceErrorCauses fromPerAligned(byte[] encodedBytes) {
    ECID_TargetDeviceErrorCauses result = new ECID_TargetDeviceErrorCauses();
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

  
  private ECID_TargetDeviceErrorCauses.causeType cause_;
  public ECID_TargetDeviceErrorCauses.causeType getCause() {
    return cause_;
  }
  /**
   * @throws ClassCastException if value is not a ECID_TargetDeviceErrorCauses.causeType
   */
  public void setCause(Asn1Object value) {
    this.cause_ = (ECID_TargetDeviceErrorCauses.causeType) value;
  }
  public ECID_TargetDeviceErrorCauses.causeType setCauseToNewInstance() {
    cause_ = new ECID_TargetDeviceErrorCauses.causeType();
    return cause_;
  }
  
  private ECID_TargetDeviceErrorCauses.rsrpMeasurementNotPossibleType rsrpMeasurementNotPossible_;
  public ECID_TargetDeviceErrorCauses.rsrpMeasurementNotPossibleType getRsrpMeasurementNotPossible() {
    return rsrpMeasurementNotPossible_;
  }
  /**
   * @throws ClassCastException if value is not a ECID_TargetDeviceErrorCauses.rsrpMeasurementNotPossibleType
   */
  public void setRsrpMeasurementNotPossible(Asn1Object value) {
    this.rsrpMeasurementNotPossible_ = (ECID_TargetDeviceErrorCauses.rsrpMeasurementNotPossibleType) value;
  }
  public ECID_TargetDeviceErrorCauses.rsrpMeasurementNotPossibleType setRsrpMeasurementNotPossibleToNewInstance() {
    rsrpMeasurementNotPossible_ = new ECID_TargetDeviceErrorCauses.rsrpMeasurementNotPossibleType();
    return rsrpMeasurementNotPossible_;
  }
  
  private ECID_TargetDeviceErrorCauses.rsrqMeasurementNotPossibleType rsrqMeasurementNotPossible_;
  public ECID_TargetDeviceErrorCauses.rsrqMeasurementNotPossibleType getRsrqMeasurementNotPossible() {
    return rsrqMeasurementNotPossible_;
  }
  /**
   * @throws ClassCastException if value is not a ECID_TargetDeviceErrorCauses.rsrqMeasurementNotPossibleType
   */
  public void setRsrqMeasurementNotPossible(Asn1Object value) {
    this.rsrqMeasurementNotPossible_ = (ECID_TargetDeviceErrorCauses.rsrqMeasurementNotPossibleType) value;
  }
  public ECID_TargetDeviceErrorCauses.rsrqMeasurementNotPossibleType setRsrqMeasurementNotPossibleToNewInstance() {
    rsrqMeasurementNotPossible_ = new ECID_TargetDeviceErrorCauses.rsrqMeasurementNotPossibleType();
    return rsrqMeasurementNotPossible_;
  }
  
  private ECID_TargetDeviceErrorCauses.ueRxTxMeasurementNotPossibleType ueRxTxMeasurementNotPossible_;
  public ECID_TargetDeviceErrorCauses.ueRxTxMeasurementNotPossibleType getUeRxTxMeasurementNotPossible() {
    return ueRxTxMeasurementNotPossible_;
  }
  /**
   * @throws ClassCastException if value is not a ECID_TargetDeviceErrorCauses.ueRxTxMeasurementNotPossibleType
   */
  public void setUeRxTxMeasurementNotPossible(Asn1Object value) {
    this.ueRxTxMeasurementNotPossible_ = (ECID_TargetDeviceErrorCauses.ueRxTxMeasurementNotPossibleType) value;
  }
  public ECID_TargetDeviceErrorCauses.ueRxTxMeasurementNotPossibleType setUeRxTxMeasurementNotPossibleToNewInstance() {
    ueRxTxMeasurementNotPossible_ = new ECID_TargetDeviceErrorCauses.ueRxTxMeasurementNotPossibleType();
    return ueRxTxMeasurementNotPossible_;
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
            return tag == null ? ECID_TargetDeviceErrorCauses.causeType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return getRsrpMeasurementNotPossible() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getRsrpMeasurementNotPossible();
          }

          @Override public void setToNewInstance() {
            setRsrpMeasurementNotPossibleToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ECID_TargetDeviceErrorCauses.rsrpMeasurementNotPossibleType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "rsrpMeasurementNotPossible : "
                    + getRsrpMeasurementNotPossible().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getRsrqMeasurementNotPossible() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getRsrqMeasurementNotPossible();
          }

          @Override public void setToNewInstance() {
            setRsrqMeasurementNotPossibleToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ECID_TargetDeviceErrorCauses.rsrqMeasurementNotPossibleType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "rsrqMeasurementNotPossible : "
                    + getRsrqMeasurementNotPossible().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getUeRxTxMeasurementNotPossible() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getUeRxTxMeasurementNotPossible();
          }

          @Override public void setToNewInstance() {
            setUeRxTxMeasurementNotPossibleToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ECID_TargetDeviceErrorCauses.ueRxTxMeasurementNotPossibleType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ueRxTxMeasurementNotPossible : "
                    + getUeRxTxMeasurementNotPossible().toIndentedString(indent);
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
    requestedMeasurementNotAvailable(1),
    notAllrequestedMeasurementsPossible(2),
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
  
  public void setTo_requestedMeasurementNotAvailable() {
    setValue(Value.requestedMeasurementNotAvailable);
  }
  
  public void setTo_notAllrequestedMeasurementsPossible() {
    setValue(Value.notAllrequestedMeasurementsPossible);
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
public static class rsrpMeasurementNotPossibleType extends Asn1Null {
  //

  private static final Asn1Tag TAG_rsrpMeasurementNotPossibleType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public rsrpMeasurementNotPossibleType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_rsrpMeasurementNotPossibleType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_rsrpMeasurementNotPossibleType != null) {
      return ImmutableList.of(TAG_rsrpMeasurementNotPossibleType);
    } else {
      return Asn1Null.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new rsrpMeasurementNotPossibleType from encoded stream.
   */
  public static rsrpMeasurementNotPossibleType fromPerUnaligned(byte[] encodedBytes) {
    rsrpMeasurementNotPossibleType result = new rsrpMeasurementNotPossibleType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new rsrpMeasurementNotPossibleType from encoded stream.
   */
  public static rsrpMeasurementNotPossibleType fromPerAligned(byte[] encodedBytes) {
    rsrpMeasurementNotPossibleType result = new rsrpMeasurementNotPossibleType();
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
    return "rsrpMeasurementNotPossibleType (null value);\n";
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
public static class rsrqMeasurementNotPossibleType extends Asn1Null {
  //

  private static final Asn1Tag TAG_rsrqMeasurementNotPossibleType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public rsrqMeasurementNotPossibleType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_rsrqMeasurementNotPossibleType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_rsrqMeasurementNotPossibleType != null) {
      return ImmutableList.of(TAG_rsrqMeasurementNotPossibleType);
    } else {
      return Asn1Null.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new rsrqMeasurementNotPossibleType from encoded stream.
   */
  public static rsrqMeasurementNotPossibleType fromPerUnaligned(byte[] encodedBytes) {
    rsrqMeasurementNotPossibleType result = new rsrqMeasurementNotPossibleType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new rsrqMeasurementNotPossibleType from encoded stream.
   */
  public static rsrqMeasurementNotPossibleType fromPerAligned(byte[] encodedBytes) {
    rsrqMeasurementNotPossibleType result = new rsrqMeasurementNotPossibleType();
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
    return "rsrqMeasurementNotPossibleType (null value);\n";
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
public static class ueRxTxMeasurementNotPossibleType extends Asn1Null {
  //

  private static final Asn1Tag TAG_ueRxTxMeasurementNotPossibleType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ueRxTxMeasurementNotPossibleType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ueRxTxMeasurementNotPossibleType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ueRxTxMeasurementNotPossibleType != null) {
      return ImmutableList.of(TAG_ueRxTxMeasurementNotPossibleType);
    } else {
      return Asn1Null.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ueRxTxMeasurementNotPossibleType from encoded stream.
   */
  public static ueRxTxMeasurementNotPossibleType fromPerUnaligned(byte[] encodedBytes) {
    ueRxTxMeasurementNotPossibleType result = new ueRxTxMeasurementNotPossibleType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ueRxTxMeasurementNotPossibleType from encoded stream.
   */
  public static ueRxTxMeasurementNotPossibleType fromPerAligned(byte[] encodedBytes) {
    ueRxTxMeasurementNotPossibleType result = new ueRxTxMeasurementNotPossibleType();
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
    return "ueRxTxMeasurementNotPossibleType (null value);\n";
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
    builder.append("ECID_TargetDeviceErrorCauses = {\n");
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
