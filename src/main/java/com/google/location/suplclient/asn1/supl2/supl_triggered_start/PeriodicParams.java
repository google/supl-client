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
public  class PeriodicParams extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_PeriodicParams
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public PeriodicParams() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_PeriodicParams;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_PeriodicParams != null) {
      return ImmutableList.of(TAG_PeriodicParams);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new PeriodicParams from encoded stream.
   */
  public static PeriodicParams fromPerUnaligned(byte[] encodedBytes) {
    PeriodicParams result = new PeriodicParams();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new PeriodicParams from encoded stream.
   */
  public static PeriodicParams fromPerAligned(byte[] encodedBytes) {
    PeriodicParams result = new PeriodicParams();
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

  
  private PeriodicParams.numberOfFixesType numberOfFixes_;
  public PeriodicParams.numberOfFixesType getNumberOfFixes() {
    return numberOfFixes_;
  }
  /**
   * @throws ClassCastException if value is not a PeriodicParams.numberOfFixesType
   */
  public void setNumberOfFixes(Asn1Object value) {
    this.numberOfFixes_ = (PeriodicParams.numberOfFixesType) value;
  }
  public PeriodicParams.numberOfFixesType setNumberOfFixesToNewInstance() {
    numberOfFixes_ = new PeriodicParams.numberOfFixesType();
    return numberOfFixes_;
  }
  
  private PeriodicParams.intervalBetweenFixesType intervalBetweenFixes_;
  public PeriodicParams.intervalBetweenFixesType getIntervalBetweenFixes() {
    return intervalBetweenFixes_;
  }
  /**
   * @throws ClassCastException if value is not a PeriodicParams.intervalBetweenFixesType
   */
  public void setIntervalBetweenFixes(Asn1Object value) {
    this.intervalBetweenFixes_ = (PeriodicParams.intervalBetweenFixesType) value;
  }
  public PeriodicParams.intervalBetweenFixesType setIntervalBetweenFixesToNewInstance() {
    intervalBetweenFixes_ = new PeriodicParams.intervalBetweenFixesType();
    return intervalBetweenFixes_;
  }
  
  private PeriodicParams.startTimeType startTime_;
  public PeriodicParams.startTimeType getStartTime() {
    return startTime_;
  }
  /**
   * @throws ClassCastException if value is not a PeriodicParams.startTimeType
   */
  public void setStartTime(Asn1Object value) {
    this.startTime_ = (PeriodicParams.startTimeType) value;
  }
  public PeriodicParams.startTimeType setStartTimeToNewInstance() {
    startTime_ = new PeriodicParams.startTimeType();
    return startTime_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getNumberOfFixes() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getNumberOfFixes();
          }

          @Override public void setToNewInstance() {
            setNumberOfFixesToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? PeriodicParams.numberOfFixesType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "numberOfFixes : "
                    + getNumberOfFixes().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getIntervalBetweenFixes() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getIntervalBetweenFixes();
          }

          @Override public void setToNewInstance() {
            setIntervalBetweenFixesToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? PeriodicParams.intervalBetweenFixesType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "intervalBetweenFixes : "
                    + getIntervalBetweenFixes().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getStartTime() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getStartTime();
          }

          @Override public void setToNewInstance() {
            setStartTimeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? PeriodicParams.startTimeType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "startTime : "
                    + getStartTime().toIndentedString(indent);
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
public static class numberOfFixesType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_numberOfFixesType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public numberOfFixesType() {
    super();
    setValueRange(new java.math.BigInteger("1"), new java.math.BigInteger("8639999"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_numberOfFixesType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_numberOfFixesType != null) {
      return ImmutableList.of(TAG_numberOfFixesType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new numberOfFixesType from encoded stream.
   */
  public static numberOfFixesType fromPerUnaligned(byte[] encodedBytes) {
    numberOfFixesType result = new numberOfFixesType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new numberOfFixesType from encoded stream.
   */
  public static numberOfFixesType fromPerAligned(byte[] encodedBytes) {
    numberOfFixesType result = new numberOfFixesType();
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
    return "numberOfFixesType = " + getInteger() + ";\n";
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
public static class intervalBetweenFixesType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_intervalBetweenFixesType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public intervalBetweenFixesType() {
    super();
    setValueRange(new java.math.BigInteger("1"), new java.math.BigInteger("8639999"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_intervalBetweenFixesType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_intervalBetweenFixesType != null) {
      return ImmutableList.of(TAG_intervalBetweenFixesType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new intervalBetweenFixesType from encoded stream.
   */
  public static intervalBetweenFixesType fromPerUnaligned(byte[] encodedBytes) {
    intervalBetweenFixesType result = new intervalBetweenFixesType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new intervalBetweenFixesType from encoded stream.
   */
  public static intervalBetweenFixesType fromPerAligned(byte[] encodedBytes) {
    intervalBetweenFixesType result = new intervalBetweenFixesType();
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
    return "intervalBetweenFixesType = " + getInteger() + ";\n";
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
public static class startTimeType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_startTimeType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public startTimeType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("2678400"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_startTimeType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_startTimeType != null) {
      return ImmutableList.of(TAG_startTimeType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new startTimeType from encoded stream.
   */
  public static startTimeType fromPerUnaligned(byte[] encodedBytes) {
    startTimeType result = new startTimeType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new startTimeType from encoded stream.
   */
  public static startTimeType fromPerAligned(byte[] encodedBytes) {
    startTimeType result = new startTimeType();
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
    return "startTimeType = " + getInteger() + ";\n";
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
    builder.append("PeriodicParams = {\n");
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
