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
public  class UTRAN_GPSReferenceTimeAssistance extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_UTRAN_GPSReferenceTimeAssistance
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public UTRAN_GPSReferenceTimeAssistance() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_UTRAN_GPSReferenceTimeAssistance;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_UTRAN_GPSReferenceTimeAssistance != null) {
      return ImmutableList.of(TAG_UTRAN_GPSReferenceTimeAssistance);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new UTRAN_GPSReferenceTimeAssistance from encoded stream.
   */
  public static UTRAN_GPSReferenceTimeAssistance fromPerUnaligned(byte[] encodedBytes) {
    UTRAN_GPSReferenceTimeAssistance result = new UTRAN_GPSReferenceTimeAssistance();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new UTRAN_GPSReferenceTimeAssistance from encoded stream.
   */
  public static UTRAN_GPSReferenceTimeAssistance fromPerAligned(byte[] encodedBytes) {
    UTRAN_GPSReferenceTimeAssistance result = new UTRAN_GPSReferenceTimeAssistance();
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

  
  private UTRAN_GPSReferenceTime utran_GPSReferenceTime_;
  public UTRAN_GPSReferenceTime getUtran_GPSReferenceTime() {
    return utran_GPSReferenceTime_;
  }
  /**
   * @throws ClassCastException if value is not a UTRAN_GPSReferenceTime
   */
  public void setUtran_GPSReferenceTime(Asn1Object value) {
    this.utran_GPSReferenceTime_ = (UTRAN_GPSReferenceTime) value;
  }
  public UTRAN_GPSReferenceTime setUtran_GPSReferenceTimeToNewInstance() {
    utran_GPSReferenceTime_ = new UTRAN_GPSReferenceTime();
    return utran_GPSReferenceTime_;
  }
  
  private UTRAN_GPSReferenceTimeAssistance.gpsReferenceTimeUncertaintyType gpsReferenceTimeUncertainty_;
  public UTRAN_GPSReferenceTimeAssistance.gpsReferenceTimeUncertaintyType getGpsReferenceTimeUncertainty() {
    return gpsReferenceTimeUncertainty_;
  }
  /**
   * @throws ClassCastException if value is not a UTRAN_GPSReferenceTimeAssistance.gpsReferenceTimeUncertaintyType
   */
  public void setGpsReferenceTimeUncertainty(Asn1Object value) {
    this.gpsReferenceTimeUncertainty_ = (UTRAN_GPSReferenceTimeAssistance.gpsReferenceTimeUncertaintyType) value;
  }
  public UTRAN_GPSReferenceTimeAssistance.gpsReferenceTimeUncertaintyType setGpsReferenceTimeUncertaintyToNewInstance() {
    gpsReferenceTimeUncertainty_ = new UTRAN_GPSReferenceTimeAssistance.gpsReferenceTimeUncertaintyType();
    return gpsReferenceTimeUncertainty_;
  }
  
  private UTRANGPSDriftRate utranGPSDriftRate_;
  public UTRANGPSDriftRate getUtranGPSDriftRate() {
    return utranGPSDriftRate_;
  }
  /**
   * @throws ClassCastException if value is not a UTRANGPSDriftRate
   */
  public void setUtranGPSDriftRate(Asn1Object value) {
    this.utranGPSDriftRate_ = (UTRANGPSDriftRate) value;
  }
  public UTRANGPSDriftRate setUtranGPSDriftRateToNewInstance() {
    utranGPSDriftRate_ = new UTRANGPSDriftRate();
    return utranGPSDriftRate_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getUtran_GPSReferenceTime() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getUtran_GPSReferenceTime();
          }

          @Override public void setToNewInstance() {
            setUtran_GPSReferenceTimeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UTRAN_GPSReferenceTime.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "utran_GPSReferenceTime : "
                    + getUtran_GPSReferenceTime().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getGpsReferenceTimeUncertainty() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGpsReferenceTimeUncertainty();
          }

          @Override public void setToNewInstance() {
            setGpsReferenceTimeUncertaintyToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UTRAN_GPSReferenceTimeAssistance.gpsReferenceTimeUncertaintyType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gpsReferenceTimeUncertainty : "
                    + getGpsReferenceTimeUncertainty().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getUtranGPSDriftRate() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getUtranGPSDriftRate();
          }

          @Override public void setToNewInstance() {
            setUtranGPSDriftRateToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UTRANGPSDriftRate.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "utranGPSDriftRate : "
                    + getUtranGPSDriftRate().toIndentedString(indent);
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
public static class gpsReferenceTimeUncertaintyType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_gpsReferenceTimeUncertaintyType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gpsReferenceTimeUncertaintyType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("127"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gpsReferenceTimeUncertaintyType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gpsReferenceTimeUncertaintyType != null) {
      return ImmutableList.of(TAG_gpsReferenceTimeUncertaintyType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gpsReferenceTimeUncertaintyType from encoded stream.
   */
  public static gpsReferenceTimeUncertaintyType fromPerUnaligned(byte[] encodedBytes) {
    gpsReferenceTimeUncertaintyType result = new gpsReferenceTimeUncertaintyType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gpsReferenceTimeUncertaintyType from encoded stream.
   */
  public static gpsReferenceTimeUncertaintyType fromPerAligned(byte[] encodedBytes) {
    gpsReferenceTimeUncertaintyType result = new gpsReferenceTimeUncertaintyType();
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
    return "gpsReferenceTimeUncertaintyType = " + getInteger() + ";\n";
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
    builder.append("UTRAN_GPSReferenceTimeAssistance = {\n");
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
