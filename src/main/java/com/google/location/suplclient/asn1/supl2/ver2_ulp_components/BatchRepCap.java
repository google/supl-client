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
import com.google.location.suplclient.asn1.base.Asn1Boolean;
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
public  class BatchRepCap extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_BatchRepCap
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public BatchRepCap() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_BatchRepCap;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_BatchRepCap != null) {
      return ImmutableList.of(TAG_BatchRepCap);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new BatchRepCap from encoded stream.
   */
  public static BatchRepCap fromPerUnaligned(byte[] encodedBytes) {
    BatchRepCap result = new BatchRepCap();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new BatchRepCap from encoded stream.
   */
  public static BatchRepCap fromPerAligned(byte[] encodedBytes) {
    BatchRepCap result = new BatchRepCap();
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

  
  private BatchRepCap.report_positionType report_position_;
  public BatchRepCap.report_positionType getReport_position() {
    return report_position_;
  }
  /**
   * @throws ClassCastException if value is not a BatchRepCap.report_positionType
   */
  public void setReport_position(Asn1Object value) {
    this.report_position_ = (BatchRepCap.report_positionType) value;
  }
  public BatchRepCap.report_positionType setReport_positionToNewInstance() {
    report_position_ = new BatchRepCap.report_positionType();
    return report_position_;
  }
  
  private BatchRepCap.report_measurementsType report_measurements_;
  public BatchRepCap.report_measurementsType getReport_measurements() {
    return report_measurements_;
  }
  /**
   * @throws ClassCastException if value is not a BatchRepCap.report_measurementsType
   */
  public void setReport_measurements(Asn1Object value) {
    this.report_measurements_ = (BatchRepCap.report_measurementsType) value;
  }
  public BatchRepCap.report_measurementsType setReport_measurementsToNewInstance() {
    report_measurements_ = new BatchRepCap.report_measurementsType();
    return report_measurements_;
  }
  
  private BatchRepCap.max_num_positionsType max_num_positions_;
  public BatchRepCap.max_num_positionsType getMax_num_positions() {
    return max_num_positions_;
  }
  /**
   * @throws ClassCastException if value is not a BatchRepCap.max_num_positionsType
   */
  public void setMax_num_positions(Asn1Object value) {
    this.max_num_positions_ = (BatchRepCap.max_num_positionsType) value;
  }
  public BatchRepCap.max_num_positionsType setMax_num_positionsToNewInstance() {
    max_num_positions_ = new BatchRepCap.max_num_positionsType();
    return max_num_positions_;
  }
  
  private BatchRepCap.max_num_measurementsType max_num_measurements_;
  public BatchRepCap.max_num_measurementsType getMax_num_measurements() {
    return max_num_measurements_;
  }
  /**
   * @throws ClassCastException if value is not a BatchRepCap.max_num_measurementsType
   */
  public void setMax_num_measurements(Asn1Object value) {
    this.max_num_measurements_ = (BatchRepCap.max_num_measurementsType) value;
  }
  public BatchRepCap.max_num_measurementsType setMax_num_measurementsToNewInstance() {
    max_num_measurements_ = new BatchRepCap.max_num_measurementsType();
    return max_num_measurements_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getReport_position() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getReport_position();
          }

          @Override public void setToNewInstance() {
            setReport_positionToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? BatchRepCap.report_positionType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "report_position : "
                    + getReport_position().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getReport_measurements() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getReport_measurements();
          }

          @Override public void setToNewInstance() {
            setReport_measurementsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? BatchRepCap.report_measurementsType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "report_measurements : "
                    + getReport_measurements().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getMax_num_positions() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getMax_num_positions();
          }

          @Override public void setToNewInstance() {
            setMax_num_positionsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? BatchRepCap.max_num_positionsType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "max_num_positions : "
                    + getMax_num_positions().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getMax_num_measurements() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getMax_num_measurements();
          }

          @Override public void setToNewInstance() {
            setMax_num_measurementsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? BatchRepCap.max_num_measurementsType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "max_num_measurements : "
                    + getMax_num_measurements().toIndentedString(indent);
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
public static class report_positionType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_report_positionType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public report_positionType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_report_positionType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_report_positionType != null) {
      return ImmutableList.of(TAG_report_positionType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new report_positionType from encoded stream.
   */
  public static report_positionType fromPerUnaligned(byte[] encodedBytes) {
    report_positionType result = new report_positionType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new report_positionType from encoded stream.
   */
  public static report_positionType fromPerAligned(byte[] encodedBytes) {
    report_positionType result = new report_positionType();
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
    return "report_positionType = " + getValue() + ";\n";
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
public static class report_measurementsType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_report_measurementsType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public report_measurementsType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_report_measurementsType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_report_measurementsType != null) {
      return ImmutableList.of(TAG_report_measurementsType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new report_measurementsType from encoded stream.
   */
  public static report_measurementsType fromPerUnaligned(byte[] encodedBytes) {
    report_measurementsType result = new report_measurementsType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new report_measurementsType from encoded stream.
   */
  public static report_measurementsType fromPerAligned(byte[] encodedBytes) {
    report_measurementsType result = new report_measurementsType();
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
    return "report_measurementsType = " + getValue() + ";\n";
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
public static class max_num_positionsType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_max_num_positionsType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public max_num_positionsType() {
    super();
    setValueRange(new java.math.BigInteger("1"), new java.math.BigInteger("1024"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_max_num_positionsType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_max_num_positionsType != null) {
      return ImmutableList.of(TAG_max_num_positionsType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new max_num_positionsType from encoded stream.
   */
  public static max_num_positionsType fromPerUnaligned(byte[] encodedBytes) {
    max_num_positionsType result = new max_num_positionsType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new max_num_positionsType from encoded stream.
   */
  public static max_num_positionsType fromPerAligned(byte[] encodedBytes) {
    max_num_positionsType result = new max_num_positionsType();
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
    return "max_num_positionsType = " + getInteger() + ";\n";
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
public static class max_num_measurementsType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_max_num_measurementsType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public max_num_measurementsType() {
    super();
    setValueRange(new java.math.BigInteger("1"), new java.math.BigInteger("1024"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_max_num_measurementsType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_max_num_measurementsType != null) {
      return ImmutableList.of(TAG_max_num_measurementsType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new max_num_measurementsType from encoded stream.
   */
  public static max_num_measurementsType fromPerUnaligned(byte[] encodedBytes) {
    max_num_measurementsType result = new max_num_measurementsType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new max_num_measurementsType from encoded stream.
   */
  public static max_num_measurementsType fromPerAligned(byte[] encodedBytes) {
    max_num_measurementsType result = new max_num_measurementsType();
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
    return "max_num_measurementsType = " + getInteger() + ";\n";
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
    builder.append("BatchRepCap = {\n");
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
