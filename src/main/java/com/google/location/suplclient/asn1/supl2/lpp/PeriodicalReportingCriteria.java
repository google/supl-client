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
public  class PeriodicalReportingCriteria extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_PeriodicalReportingCriteria
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public PeriodicalReportingCriteria() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_PeriodicalReportingCriteria;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_PeriodicalReportingCriteria != null) {
      return ImmutableList.of(TAG_PeriodicalReportingCriteria);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new PeriodicalReportingCriteria from encoded stream.
   */
  public static PeriodicalReportingCriteria fromPerUnaligned(byte[] encodedBytes) {
    PeriodicalReportingCriteria result = new PeriodicalReportingCriteria();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new PeriodicalReportingCriteria from encoded stream.
   */
  public static PeriodicalReportingCriteria fromPerAligned(byte[] encodedBytes) {
    PeriodicalReportingCriteria result = new PeriodicalReportingCriteria();
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

  
  private PeriodicalReportingCriteria.reportingAmountType reportingAmount_;
  public PeriodicalReportingCriteria.reportingAmountType getReportingAmount() {
    return reportingAmount_;
  }
  /**
   * @throws ClassCastException if value is not a PeriodicalReportingCriteria.reportingAmountType
   */
  public void setReportingAmount(Asn1Object value) {
    this.reportingAmount_ = (PeriodicalReportingCriteria.reportingAmountType) value;
  }
  public PeriodicalReportingCriteria.reportingAmountType setReportingAmountToNewInstance() {
    reportingAmount_ = new PeriodicalReportingCriteria.reportingAmountType();
    return reportingAmount_;
  }
  
  private PeriodicalReportingCriteria.reportingIntervalType reportingInterval_;
  public PeriodicalReportingCriteria.reportingIntervalType getReportingInterval() {
    return reportingInterval_;
  }
  /**
   * @throws ClassCastException if value is not a PeriodicalReportingCriteria.reportingIntervalType
   */
  public void setReportingInterval(Asn1Object value) {
    this.reportingInterval_ = (PeriodicalReportingCriteria.reportingIntervalType) value;
  }
  public PeriodicalReportingCriteria.reportingIntervalType setReportingIntervalToNewInstance() {
    reportingInterval_ = new PeriodicalReportingCriteria.reportingIntervalType();
    return reportingInterval_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getReportingAmount() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getReportingAmount();
          }

          @Override public void setToNewInstance() {
            setReportingAmountToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? PeriodicalReportingCriteria.reportingAmountType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "reportingAmount : "
                    + getReportingAmount().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getReportingInterval() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getReportingInterval();
          }

          @Override public void setToNewInstance() {
            setReportingIntervalToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? PeriodicalReportingCriteria.reportingIntervalType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "reportingInterval : "
                    + getReportingInterval().toIndentedString(indent);
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
public static class reportingAmountType extends Asn1Enumerated {
  public enum Value implements Asn1Enumerated.Value {
    ra1(0),
    ra2(1),
    ra4(2),
    ra8(3),
    ra16(4),
    ra32(5),
    ra64(6),
    ra_Infinity(7),
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
    return Value.ra_Infinity
;
  }

  @SuppressWarnings("unchecked")
  public Value enumValue() {
    return (Value) getValue();
  }


  
  public void setTo_ra1() {
    setValue(Value.ra1);
  }
  
  public void setTo_ra2() {
    setValue(Value.ra2);
  }
  
  public void setTo_ra4() {
    setValue(Value.ra4);
  }
  
  public void setTo_ra8() {
    setValue(Value.ra8);
  }
  
  public void setTo_ra16() {
    setValue(Value.ra16);
  }
  
  public void setTo_ra32() {
    setValue(Value.ra32);
  }
  
  public void setTo_ra64() {
    setValue(Value.ra64);
  }
  
  public void setTo_ra_Infinity() {
    setValue(Value.ra_Infinity);
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

  

  

  private static final Asn1Tag TAG_reportingAmountType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public reportingAmountType() {
    super();
    // use template substitution instead of calling getDefaultValue(), since
    // calling virtual methods from a ctor is frowned upon here.
    setValue(Value.ra_Infinity
);
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_reportingAmountType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_reportingAmountType != null) {
      return ImmutableList.of(TAG_reportingAmountType);
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
   * Creates a new reportingAmountType from encoded stream.
   */
  public static reportingAmountType fromPerUnaligned(byte[] encodedBytes) {
    reportingAmountType result = new reportingAmountType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new reportingAmountType from encoded stream.
   */
  public static reportingAmountType fromPerAligned(byte[] encodedBytes) {
    reportingAmountType result = new reportingAmountType();
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
    return "reportingAmountType = " + getValue() + ";\n";
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
public static class reportingIntervalType extends Asn1Enumerated {
  public enum Value implements Asn1Enumerated.Value {
    noPeriodicalReporting(0),
    ri0_25(1),
    ri0_5(2),
    ri1(3),
    ri2(4),
    ri4(5),
    ri8(6),
    ri16(7),
    ri32(8),
    ri64(9),
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


  
  public void setTo_noPeriodicalReporting() {
    setValue(Value.noPeriodicalReporting);
  }
  
  public void setTo_ri0_25() {
    setValue(Value.ri0_25);
  }
  
  public void setTo_ri0_5() {
    setValue(Value.ri0_5);
  }
  
  public void setTo_ri1() {
    setValue(Value.ri1);
  }
  
  public void setTo_ri2() {
    setValue(Value.ri2);
  }
  
  public void setTo_ri4() {
    setValue(Value.ri4);
  }
  
  public void setTo_ri8() {
    setValue(Value.ri8);
  }
  
  public void setTo_ri16() {
    setValue(Value.ri16);
  }
  
  public void setTo_ri32() {
    setValue(Value.ri32);
  }
  
  public void setTo_ri64() {
    setValue(Value.ri64);
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

  

  

  private static final Asn1Tag TAG_reportingIntervalType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public reportingIntervalType() {
    super();
    // use template substitution instead of calling getDefaultValue(), since
    // calling virtual methods from a ctor is frowned upon here.
    setValue(null
);
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_reportingIntervalType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_reportingIntervalType != null) {
      return ImmutableList.of(TAG_reportingIntervalType);
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
   * Creates a new reportingIntervalType from encoded stream.
   */
  public static reportingIntervalType fromPerUnaligned(byte[] encodedBytes) {
    reportingIntervalType result = new reportingIntervalType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new reportingIntervalType from encoded stream.
   */
  public static reportingIntervalType fromPerAligned(byte[] encodedBytes) {
    reportingIntervalType result = new reportingIntervalType();
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
    return "reportingIntervalType = " + getValue() + ";\n";
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
    builder.append("PeriodicalReportingCriteria = {\n");
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
