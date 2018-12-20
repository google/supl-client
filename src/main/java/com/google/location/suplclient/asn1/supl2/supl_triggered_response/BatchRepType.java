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

package com.google.location.suplclient.asn1.supl2.supl_triggered_response;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.google.location.suplclient.asn1.base.Asn1Boolean;
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
public  class BatchRepType extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_BatchRepType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public BatchRepType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_BatchRepType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_BatchRepType != null) {
      return ImmutableList.of(TAG_BatchRepType);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new BatchRepType from encoded stream.
   */
  public static BatchRepType fromPerUnaligned(byte[] encodedBytes) {
    BatchRepType result = new BatchRepType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new BatchRepType from encoded stream.
   */
  public static BatchRepType fromPerAligned(byte[] encodedBytes) {
    BatchRepType result = new BatchRepType();
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

  
  private BatchRepType.reportPositionType reportPosition_;
  public BatchRepType.reportPositionType getReportPosition() {
    return reportPosition_;
  }
  /**
   * @throws ClassCastException if value is not a BatchRepType.reportPositionType
   */
  public void setReportPosition(Asn1Object value) {
    this.reportPosition_ = (BatchRepType.reportPositionType) value;
  }
  public BatchRepType.reportPositionType setReportPositionToNewInstance() {
    reportPosition_ = new BatchRepType.reportPositionType();
    return reportPosition_;
  }
  
  private BatchRepType.reportMeasurementsType reportMeasurements_;
  public BatchRepType.reportMeasurementsType getReportMeasurements() {
    return reportMeasurements_;
  }
  /**
   * @throws ClassCastException if value is not a BatchRepType.reportMeasurementsType
   */
  public void setReportMeasurements(Asn1Object value) {
    this.reportMeasurements_ = (BatchRepType.reportMeasurementsType) value;
  }
  public BatchRepType.reportMeasurementsType setReportMeasurementsToNewInstance() {
    reportMeasurements_ = new BatchRepType.reportMeasurementsType();
    return reportMeasurements_;
  }
  
  private BatchRepType.intermediateReportsType intermediateReports_;
  public BatchRepType.intermediateReportsType getIntermediateReports() {
    return intermediateReports_;
  }
  /**
   * @throws ClassCastException if value is not a BatchRepType.intermediateReportsType
   */
  public void setIntermediateReports(Asn1Object value) {
    this.intermediateReports_ = (BatchRepType.intermediateReportsType) value;
  }
  public BatchRepType.intermediateReportsType setIntermediateReportsToNewInstance() {
    intermediateReports_ = new BatchRepType.intermediateReportsType();
    return intermediateReports_;
  }
  
  private BatchRepType.discardOldestType discardOldest_;
  public BatchRepType.discardOldestType getDiscardOldest() {
    return discardOldest_;
  }
  /**
   * @throws ClassCastException if value is not a BatchRepType.discardOldestType
   */
  public void setDiscardOldest(Asn1Object value) {
    this.discardOldest_ = (BatchRepType.discardOldestType) value;
  }
  public BatchRepType.discardOldestType setDiscardOldestToNewInstance() {
    discardOldest_ = new BatchRepType.discardOldestType();
    return discardOldest_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getReportPosition() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getReportPosition();
          }

          @Override public void setToNewInstance() {
            setReportPositionToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? BatchRepType.reportPositionType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "reportPosition : "
                    + getReportPosition().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getReportMeasurements() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getReportMeasurements();
          }

          @Override public void setToNewInstance() {
            setReportMeasurementsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? BatchRepType.reportMeasurementsType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "reportMeasurements : "
                    + getReportMeasurements().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getIntermediateReports() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getIntermediateReports();
          }

          @Override public void setToNewInstance() {
            setIntermediateReportsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? BatchRepType.intermediateReportsType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "intermediateReports : "
                    + getIntermediateReports().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getDiscardOldest() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getDiscardOldest();
          }

          @Override public void setToNewInstance() {
            setDiscardOldestToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? BatchRepType.discardOldestType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "discardOldest : "
                    + getDiscardOldest().toIndentedString(indent);
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
public static class reportPositionType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_reportPositionType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public reportPositionType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_reportPositionType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_reportPositionType != null) {
      return ImmutableList.of(TAG_reportPositionType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new reportPositionType from encoded stream.
   */
  public static reportPositionType fromPerUnaligned(byte[] encodedBytes) {
    reportPositionType result = new reportPositionType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new reportPositionType from encoded stream.
   */
  public static reportPositionType fromPerAligned(byte[] encodedBytes) {
    reportPositionType result = new reportPositionType();
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
    return "reportPositionType = " + getValue() + ";\n";
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
public static class reportMeasurementsType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_reportMeasurementsType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public reportMeasurementsType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_reportMeasurementsType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_reportMeasurementsType != null) {
      return ImmutableList.of(TAG_reportMeasurementsType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new reportMeasurementsType from encoded stream.
   */
  public static reportMeasurementsType fromPerUnaligned(byte[] encodedBytes) {
    reportMeasurementsType result = new reportMeasurementsType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new reportMeasurementsType from encoded stream.
   */
  public static reportMeasurementsType fromPerAligned(byte[] encodedBytes) {
    reportMeasurementsType result = new reportMeasurementsType();
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
    return "reportMeasurementsType = " + getValue() + ";\n";
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
public static class intermediateReportsType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_intermediateReportsType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public intermediateReportsType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_intermediateReportsType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_intermediateReportsType != null) {
      return ImmutableList.of(TAG_intermediateReportsType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new intermediateReportsType from encoded stream.
   */
  public static intermediateReportsType fromPerUnaligned(byte[] encodedBytes) {
    intermediateReportsType result = new intermediateReportsType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new intermediateReportsType from encoded stream.
   */
  public static intermediateReportsType fromPerAligned(byte[] encodedBytes) {
    intermediateReportsType result = new intermediateReportsType();
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
    return "intermediateReportsType = " + getValue() + ";\n";
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
public static class discardOldestType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_discardOldestType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public discardOldestType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_discardOldestType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_discardOldestType != null) {
      return ImmutableList.of(TAG_discardOldestType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new discardOldestType from encoded stream.
   */
  public static discardOldestType fromPerUnaligned(byte[] encodedBytes) {
    discardOldestType result = new discardOldestType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new discardOldestType from encoded stream.
   */
  public static discardOldestType fromPerAligned(byte[] encodedBytes) {
    discardOldestType result = new discardOldestType();
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
    return "discardOldestType = " + getValue() + ";\n";
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
    builder.append("BatchRepType = {\n");
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
