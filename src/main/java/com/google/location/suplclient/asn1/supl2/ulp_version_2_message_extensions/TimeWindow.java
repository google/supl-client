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
public  class TimeWindow extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_TimeWindow
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public TimeWindow() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_TimeWindow;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_TimeWindow != null) {
      return ImmutableList.of(TAG_TimeWindow);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new TimeWindow from encoded stream.
   */
  public static TimeWindow fromPerUnaligned(byte[] encodedBytes) {
    TimeWindow result = new TimeWindow();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new TimeWindow from encoded stream.
   */
  public static TimeWindow fromPerAligned(byte[] encodedBytes) {
    TimeWindow result = new TimeWindow();
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

  
  private TimeWindow.startTimeType startTime_;
  public TimeWindow.startTimeType getStartTime() {
    return startTime_;
  }
  /**
   * @throws ClassCastException if value is not a TimeWindow.startTimeType
   */
  public void setStartTime(Asn1Object value) {
    this.startTime_ = (TimeWindow.startTimeType) value;
  }
  public TimeWindow.startTimeType setStartTimeToNewInstance() {
    startTime_ = new TimeWindow.startTimeType();
    return startTime_;
  }
  
  private TimeWindow.stopTimeType stopTime_;
  public TimeWindow.stopTimeType getStopTime() {
    return stopTime_;
  }
  /**
   * @throws ClassCastException if value is not a TimeWindow.stopTimeType
   */
  public void setStopTime(Asn1Object value) {
    this.stopTime_ = (TimeWindow.stopTimeType) value;
  }
  public TimeWindow.stopTimeType setStopTimeToNewInstance() {
    stopTime_ = new TimeWindow.stopTimeType();
    return stopTime_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getStartTime() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getStartTime();
          }

          @Override public void setToNewInstance() {
            setStartTimeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? TimeWindow.startTimeType.getPossibleFirstTags() : ImmutableList.of(tag);
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
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getStopTime() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getStopTime();
          }

          @Override public void setToNewInstance() {
            setStopTimeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? TimeWindow.stopTimeType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "stopTime : "
                    + getStopTime().toIndentedString(indent);
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
public static class startTimeType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_startTimeType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public startTimeType() {
    super();
    setValueRange(new java.math.BigInteger("-525600"), new java.math.BigInteger("-1"));

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

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class stopTimeType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_stopTimeType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public stopTimeType() {
    super();
    setValueRange(new java.math.BigInteger("-525599"), new java.math.BigInteger("0"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_stopTimeType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_stopTimeType != null) {
      return ImmutableList.of(TAG_stopTimeType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new stopTimeType from encoded stream.
   */
  public static stopTimeType fromPerUnaligned(byte[] encodedBytes) {
    stopTimeType result = new stopTimeType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new stopTimeType from encoded stream.
   */
  public static stopTimeType fromPerAligned(byte[] encodedBytes) {
    stopTimeType result = new stopTimeType();
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
    return "stopTimeType = " + getInteger() + ";\n";
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
    builder.append("TimeWindow = {\n");
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
