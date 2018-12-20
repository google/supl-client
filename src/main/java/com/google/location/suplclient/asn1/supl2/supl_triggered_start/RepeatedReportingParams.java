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

package com.google.location.suplclient.asn1.supl2.supl_triggered_start;

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
public  class RepeatedReportingParams extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_RepeatedReportingParams
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public RepeatedReportingParams() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_RepeatedReportingParams;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_RepeatedReportingParams != null) {
      return ImmutableList.of(TAG_RepeatedReportingParams);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new RepeatedReportingParams from encoded stream.
   */
  public static RepeatedReportingParams fromPerUnaligned(byte[] encodedBytes) {
    RepeatedReportingParams result = new RepeatedReportingParams();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new RepeatedReportingParams from encoded stream.
   */
  public static RepeatedReportingParams fromPerAligned(byte[] encodedBytes) {
    RepeatedReportingParams result = new RepeatedReportingParams();
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

  
  private RepeatedReportingParams.minimumIntervalTimeType minimumIntervalTime_;
  public RepeatedReportingParams.minimumIntervalTimeType getMinimumIntervalTime() {
    return minimumIntervalTime_;
  }
  /**
   * @throws ClassCastException if value is not a RepeatedReportingParams.minimumIntervalTimeType
   */
  public void setMinimumIntervalTime(Asn1Object value) {
    this.minimumIntervalTime_ = (RepeatedReportingParams.minimumIntervalTimeType) value;
  }
  public RepeatedReportingParams.minimumIntervalTimeType setMinimumIntervalTimeToNewInstance() {
    minimumIntervalTime_ = new RepeatedReportingParams.minimumIntervalTimeType();
    return minimumIntervalTime_;
  }
  
  private RepeatedReportingParams.maximumNumberOfReportsType maximumNumberOfReports_;
  public RepeatedReportingParams.maximumNumberOfReportsType getMaximumNumberOfReports() {
    return maximumNumberOfReports_;
  }
  /**
   * @throws ClassCastException if value is not a RepeatedReportingParams.maximumNumberOfReportsType
   */
  public void setMaximumNumberOfReports(Asn1Object value) {
    this.maximumNumberOfReports_ = (RepeatedReportingParams.maximumNumberOfReportsType) value;
  }
  public RepeatedReportingParams.maximumNumberOfReportsType setMaximumNumberOfReportsToNewInstance() {
    maximumNumberOfReports_ = new RepeatedReportingParams.maximumNumberOfReportsType();
    return maximumNumberOfReports_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getMinimumIntervalTime() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getMinimumIntervalTime();
          }

          @Override public void setToNewInstance() {
            setMinimumIntervalTimeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? RepeatedReportingParams.minimumIntervalTimeType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "minimumIntervalTime : "
                    + getMinimumIntervalTime().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getMaximumNumberOfReports() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getMaximumNumberOfReports();
          }

          @Override public void setToNewInstance() {
            setMaximumNumberOfReportsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? RepeatedReportingParams.maximumNumberOfReportsType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "maximumNumberOfReports : "
                    + getMaximumNumberOfReports().toIndentedString(indent);
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
public static class minimumIntervalTimeType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_minimumIntervalTimeType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public minimumIntervalTimeType() {
    super();
    setValueRange(new java.math.BigInteger("1"), new java.math.BigInteger("604800"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_minimumIntervalTimeType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_minimumIntervalTimeType != null) {
      return ImmutableList.of(TAG_minimumIntervalTimeType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new minimumIntervalTimeType from encoded stream.
   */
  public static minimumIntervalTimeType fromPerUnaligned(byte[] encodedBytes) {
    minimumIntervalTimeType result = new minimumIntervalTimeType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new minimumIntervalTimeType from encoded stream.
   */
  public static minimumIntervalTimeType fromPerAligned(byte[] encodedBytes) {
    minimumIntervalTimeType result = new minimumIntervalTimeType();
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
    return "minimumIntervalTimeType = " + getInteger() + ";\n";
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
public static class maximumNumberOfReportsType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_maximumNumberOfReportsType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public maximumNumberOfReportsType() {
    super();
    setValueRange(new java.math.BigInteger("1"), new java.math.BigInteger("1024"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_maximumNumberOfReportsType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_maximumNumberOfReportsType != null) {
      return ImmutableList.of(TAG_maximumNumberOfReportsType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new maximumNumberOfReportsType from encoded stream.
   */
  public static maximumNumberOfReportsType fromPerUnaligned(byte[] encodedBytes) {
    maximumNumberOfReportsType result = new maximumNumberOfReportsType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new maximumNumberOfReportsType from encoded stream.
   */
  public static maximumNumberOfReportsType fromPerAligned(byte[] encodedBytes) {
    maximumNumberOfReportsType result = new maximumNumberOfReportsType();
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
    return "maximumNumberOfReportsType = " + getInteger() + ";\n";
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
    builder.append("RepeatedReportingParams = {\n");
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
