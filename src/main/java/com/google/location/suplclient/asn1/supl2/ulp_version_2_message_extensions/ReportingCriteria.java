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

package com.google.location.suplclient.asn1.supl2.ulp_version_2_message_extensions;

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
public  class ReportingCriteria extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_ReportingCriteria
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ReportingCriteria() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ReportingCriteria;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ReportingCriteria != null) {
      return ImmutableList.of(TAG_ReportingCriteria);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ReportingCriteria from encoded stream.
   */
  public static ReportingCriteria fromPerUnaligned(byte[] encodedBytes) {
    ReportingCriteria result = new ReportingCriteria();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ReportingCriteria from encoded stream.
   */
  public static ReportingCriteria fromPerAligned(byte[] encodedBytes) {
    ReportingCriteria result = new ReportingCriteria();
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

  
  private TimeWindow timeWindow_;
  public TimeWindow getTimeWindow() {
    return timeWindow_;
  }
  /**
   * @throws ClassCastException if value is not a TimeWindow
   */
  public void setTimeWindow(Asn1Object value) {
    this.timeWindow_ = (TimeWindow) value;
  }
  public TimeWindow setTimeWindowToNewInstance() {
    timeWindow_ = new TimeWindow();
    return timeWindow_;
  }
  
  private ReportingCriteria.maxNumberofReportsType maxNumberofReports_;
  public ReportingCriteria.maxNumberofReportsType getMaxNumberofReports() {
    return maxNumberofReports_;
  }
  /**
   * @throws ClassCastException if value is not a ReportingCriteria.maxNumberofReportsType
   */
  public void setMaxNumberofReports(Asn1Object value) {
    this.maxNumberofReports_ = (ReportingCriteria.maxNumberofReportsType) value;
  }
  public ReportingCriteria.maxNumberofReportsType setMaxNumberofReportsToNewInstance() {
    maxNumberofReports_ = new ReportingCriteria.maxNumberofReportsType();
    return maxNumberofReports_;
  }
  
  private ReportingCriteria.minTimeIntervalType minTimeInterval_;
  public ReportingCriteria.minTimeIntervalType getMinTimeInterval() {
    return minTimeInterval_;
  }
  /**
   * @throws ClassCastException if value is not a ReportingCriteria.minTimeIntervalType
   */
  public void setMinTimeInterval(Asn1Object value) {
    this.minTimeInterval_ = (ReportingCriteria.minTimeIntervalType) value;
  }
  public ReportingCriteria.minTimeIntervalType setMinTimeIntervalToNewInstance() {
    minTimeInterval_ = new ReportingCriteria.minTimeIntervalType();
    return minTimeInterval_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getTimeWindow() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getTimeWindow();
          }

          @Override public void setToNewInstance() {
            setTimeWindowToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? TimeWindow.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "timeWindow : "
                    + getTimeWindow().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getMaxNumberofReports() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getMaxNumberofReports();
          }

          @Override public void setToNewInstance() {
            setMaxNumberofReportsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ReportingCriteria.maxNumberofReportsType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "maxNumberofReports : "
                    + getMaxNumberofReports().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getMinTimeInterval() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getMinTimeInterval();
          }

          @Override public void setToNewInstance() {
            setMinTimeIntervalToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ReportingCriteria.minTimeIntervalType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "minTimeInterval : "
                    + getMinTimeInterval().toIndentedString(indent);
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
public static class maxNumberofReportsType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_maxNumberofReportsType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public maxNumberofReportsType() {
    super();
    setValueRange(new java.math.BigInteger("1"), new java.math.BigInteger("65536"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_maxNumberofReportsType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_maxNumberofReportsType != null) {
      return ImmutableList.of(TAG_maxNumberofReportsType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new maxNumberofReportsType from encoded stream.
   */
  public static maxNumberofReportsType fromPerUnaligned(byte[] encodedBytes) {
    maxNumberofReportsType result = new maxNumberofReportsType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new maxNumberofReportsType from encoded stream.
   */
  public static maxNumberofReportsType fromPerAligned(byte[] encodedBytes) {
    maxNumberofReportsType result = new maxNumberofReportsType();
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
    return "maxNumberofReportsType = " + getInteger() + ";\n";
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
public static class minTimeIntervalType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_minTimeIntervalType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public minTimeIntervalType() {
    super();
    setValueRange(new java.math.BigInteger("1"), new java.math.BigInteger("86400"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_minTimeIntervalType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_minTimeIntervalType != null) {
      return ImmutableList.of(TAG_minTimeIntervalType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new minTimeIntervalType from encoded stream.
   */
  public static minTimeIntervalType fromPerUnaligned(byte[] encodedBytes) {
    minTimeIntervalType result = new minTimeIntervalType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new minTimeIntervalType from encoded stream.
   */
  public static minTimeIntervalType fromPerAligned(byte[] encodedBytes) {
    minTimeIntervalType result = new minTimeIntervalType();
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
    return "minTimeIntervalType = " + getInteger() + ";\n";
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
    builder.append("ReportingCriteria = {\n");
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
