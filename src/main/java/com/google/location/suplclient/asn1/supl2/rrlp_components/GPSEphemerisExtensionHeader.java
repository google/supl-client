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

package com.google.location.suplclient.asn1.supl2.rrlp_components;

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
public  class GPSEphemerisExtensionHeader extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GPSEphemerisExtensionHeader
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GPSEphemerisExtensionHeader() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GPSEphemerisExtensionHeader;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GPSEphemerisExtensionHeader != null) {
      return ImmutableList.of(TAG_GPSEphemerisExtensionHeader);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GPSEphemerisExtensionHeader from encoded stream.
   */
  public static GPSEphemerisExtensionHeader fromPerUnaligned(byte[] encodedBytes) {
    GPSEphemerisExtensionHeader result = new GPSEphemerisExtensionHeader();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GPSEphemerisExtensionHeader from encoded stream.
   */
  public static GPSEphemerisExtensionHeader fromPerAligned(byte[] encodedBytes) {
    GPSEphemerisExtensionHeader result = new GPSEphemerisExtensionHeader();
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

  
  private GPSEphemerisExtensionTime timeofEstimation_;
  public GPSEphemerisExtensionTime getTimeofEstimation() {
    return timeofEstimation_;
  }
  /**
   * @throws ClassCastException if value is not a GPSEphemerisExtensionTime
   */
  public void setTimeofEstimation(Asn1Object value) {
    this.timeofEstimation_ = (GPSEphemerisExtensionTime) value;
  }
  public GPSEphemerisExtensionTime setTimeofEstimationToNewInstance() {
    timeofEstimation_ = new GPSEphemerisExtensionTime();
    return timeofEstimation_;
  }
  
  private GPSEphemerisExtensionHeader.validityPeriodType validityPeriod_;
  public GPSEphemerisExtensionHeader.validityPeriodType getValidityPeriod() {
    return validityPeriod_;
  }
  /**
   * @throws ClassCastException if value is not a GPSEphemerisExtensionHeader.validityPeriodType
   */
  public void setValidityPeriod(Asn1Object value) {
    this.validityPeriod_ = (GPSEphemerisExtensionHeader.validityPeriodType) value;
  }
  public GPSEphemerisExtensionHeader.validityPeriodType setValidityPeriodToNewInstance() {
    validityPeriod_ = new GPSEphemerisExtensionHeader.validityPeriodType();
    return validityPeriod_;
  }
  
  private GPSEphemerisExtensionHeader.ephemerisExtensionDurationType ephemerisExtensionDuration_;
  public GPSEphemerisExtensionHeader.ephemerisExtensionDurationType getEphemerisExtensionDuration() {
    return ephemerisExtensionDuration_;
  }
  /**
   * @throws ClassCastException if value is not a GPSEphemerisExtensionHeader.ephemerisExtensionDurationType
   */
  public void setEphemerisExtensionDuration(Asn1Object value) {
    this.ephemerisExtensionDuration_ = (GPSEphemerisExtensionHeader.ephemerisExtensionDurationType) value;
  }
  public GPSEphemerisExtensionHeader.ephemerisExtensionDurationType setEphemerisExtensionDurationToNewInstance() {
    ephemerisExtensionDuration_ = new GPSEphemerisExtensionHeader.ephemerisExtensionDurationType();
    return ephemerisExtensionDuration_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getTimeofEstimation() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getTimeofEstimation();
          }

          @Override public void setToNewInstance() {
            setTimeofEstimationToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GPSEphemerisExtensionTime.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "timeofEstimation : "
                    + getTimeofEstimation().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getValidityPeriod() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getValidityPeriod();
          }

          @Override public void setToNewInstance() {
            setValidityPeriodToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GPSEphemerisExtensionHeader.validityPeriodType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "validityPeriod : "
                    + getValidityPeriod().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getEphemerisExtensionDuration() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getEphemerisExtensionDuration();
          }

          @Override public void setToNewInstance() {
            setEphemerisExtensionDurationToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GPSEphemerisExtensionHeader.ephemerisExtensionDurationType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ephemerisExtensionDuration : "
                    + getEphemerisExtensionDuration().toIndentedString(indent);
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
public static class validityPeriodType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_validityPeriodType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public validityPeriodType() {
    super();
    setValueRange(new java.math.BigInteger("1"), new java.math.BigInteger("8"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_validityPeriodType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_validityPeriodType != null) {
      return ImmutableList.of(TAG_validityPeriodType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new validityPeriodType from encoded stream.
   */
  public static validityPeriodType fromPerUnaligned(byte[] encodedBytes) {
    validityPeriodType result = new validityPeriodType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new validityPeriodType from encoded stream.
   */
  public static validityPeriodType fromPerAligned(byte[] encodedBytes) {
    validityPeriodType result = new validityPeriodType();
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
    return "validityPeriodType = " + getInteger() + ";\n";
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
public static class ephemerisExtensionDurationType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ephemerisExtensionDurationType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ephemerisExtensionDurationType() {
    super();
    setValueRange(new java.math.BigInteger("1"), new java.math.BigInteger("512"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ephemerisExtensionDurationType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ephemerisExtensionDurationType != null) {
      return ImmutableList.of(TAG_ephemerisExtensionDurationType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ephemerisExtensionDurationType from encoded stream.
   */
  public static ephemerisExtensionDurationType fromPerUnaligned(byte[] encodedBytes) {
    ephemerisExtensionDurationType result = new ephemerisExtensionDurationType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ephemerisExtensionDurationType from encoded stream.
   */
  public static ephemerisExtensionDurationType fromPerAligned(byte[] encodedBytes) {
    ephemerisExtensionDurationType result = new ephemerisExtensionDurationType();
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
    return "ephemerisExtensionDurationType = " + getInteger() + ";\n";
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
    builder.append("GPSEphemerisExtensionHeader = {\n");
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
