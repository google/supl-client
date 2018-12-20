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
public  class GNSS_PositioningInstructions extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GNSS_PositioningInstructions
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GNSS_PositioningInstructions() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GNSS_PositioningInstructions;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GNSS_PositioningInstructions != null) {
      return ImmutableList.of(TAG_GNSS_PositioningInstructions);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GNSS_PositioningInstructions from encoded stream.
   */
  public static GNSS_PositioningInstructions fromPerUnaligned(byte[] encodedBytes) {
    GNSS_PositioningInstructions result = new GNSS_PositioningInstructions();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GNSS_PositioningInstructions from encoded stream.
   */
  public static GNSS_PositioningInstructions fromPerAligned(byte[] encodedBytes) {
    GNSS_PositioningInstructions result = new GNSS_PositioningInstructions();
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

  
  private GNSS_ID_Bitmap gnss_Methods_;
  public GNSS_ID_Bitmap getGnss_Methods() {
    return gnss_Methods_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_ID_Bitmap
   */
  public void setGnss_Methods(Asn1Object value) {
    this.gnss_Methods_ = (GNSS_ID_Bitmap) value;
  }
  public GNSS_ID_Bitmap setGnss_MethodsToNewInstance() {
    gnss_Methods_ = new GNSS_ID_Bitmap();
    return gnss_Methods_;
  }
  
  private GNSS_PositioningInstructions.fineTimeAssistanceMeasReqType fineTimeAssistanceMeasReq_;
  public GNSS_PositioningInstructions.fineTimeAssistanceMeasReqType getFineTimeAssistanceMeasReq() {
    return fineTimeAssistanceMeasReq_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_PositioningInstructions.fineTimeAssistanceMeasReqType
   */
  public void setFineTimeAssistanceMeasReq(Asn1Object value) {
    this.fineTimeAssistanceMeasReq_ = (GNSS_PositioningInstructions.fineTimeAssistanceMeasReqType) value;
  }
  public GNSS_PositioningInstructions.fineTimeAssistanceMeasReqType setFineTimeAssistanceMeasReqToNewInstance() {
    fineTimeAssistanceMeasReq_ = new GNSS_PositioningInstructions.fineTimeAssistanceMeasReqType();
    return fineTimeAssistanceMeasReq_;
  }
  
  private GNSS_PositioningInstructions.adrMeasReqType adrMeasReq_;
  public GNSS_PositioningInstructions.adrMeasReqType getAdrMeasReq() {
    return adrMeasReq_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_PositioningInstructions.adrMeasReqType
   */
  public void setAdrMeasReq(Asn1Object value) {
    this.adrMeasReq_ = (GNSS_PositioningInstructions.adrMeasReqType) value;
  }
  public GNSS_PositioningInstructions.adrMeasReqType setAdrMeasReqToNewInstance() {
    adrMeasReq_ = new GNSS_PositioningInstructions.adrMeasReqType();
    return adrMeasReq_;
  }
  
  private GNSS_PositioningInstructions.multiFreqMeasReqType multiFreqMeasReq_;
  public GNSS_PositioningInstructions.multiFreqMeasReqType getMultiFreqMeasReq() {
    return multiFreqMeasReq_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_PositioningInstructions.multiFreqMeasReqType
   */
  public void setMultiFreqMeasReq(Asn1Object value) {
    this.multiFreqMeasReq_ = (GNSS_PositioningInstructions.multiFreqMeasReqType) value;
  }
  public GNSS_PositioningInstructions.multiFreqMeasReqType setMultiFreqMeasReqToNewInstance() {
    multiFreqMeasReq_ = new GNSS_PositioningInstructions.multiFreqMeasReqType();
    return multiFreqMeasReq_;
  }
  
  private GNSS_PositioningInstructions.assistanceAvailabilityType assistanceAvailability_;
  public GNSS_PositioningInstructions.assistanceAvailabilityType getAssistanceAvailability() {
    return assistanceAvailability_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_PositioningInstructions.assistanceAvailabilityType
   */
  public void setAssistanceAvailability(Asn1Object value) {
    this.assistanceAvailability_ = (GNSS_PositioningInstructions.assistanceAvailabilityType) value;
  }
  public GNSS_PositioningInstructions.assistanceAvailabilityType setAssistanceAvailabilityToNewInstance() {
    assistanceAvailability_ = new GNSS_PositioningInstructions.assistanceAvailabilityType();
    return assistanceAvailability_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getGnss_Methods() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_Methods();
          }

          @Override public void setToNewInstance() {
            setGnss_MethodsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_ID_Bitmap.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_Methods : "
                    + getGnss_Methods().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getFineTimeAssistanceMeasReq() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getFineTimeAssistanceMeasReq();
          }

          @Override public void setToNewInstance() {
            setFineTimeAssistanceMeasReqToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_PositioningInstructions.fineTimeAssistanceMeasReqType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "fineTimeAssistanceMeasReq : "
                    + getFineTimeAssistanceMeasReq().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getAdrMeasReq() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getAdrMeasReq();
          }

          @Override public void setToNewInstance() {
            setAdrMeasReqToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_PositioningInstructions.adrMeasReqType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "adrMeasReq : "
                    + getAdrMeasReq().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getMultiFreqMeasReq() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getMultiFreqMeasReq();
          }

          @Override public void setToNewInstance() {
            setMultiFreqMeasReqToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_PositioningInstructions.multiFreqMeasReqType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "multiFreqMeasReq : "
                    + getMultiFreqMeasReq().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getAssistanceAvailability() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getAssistanceAvailability();
          }

          @Override public void setToNewInstance() {
            setAssistanceAvailabilityToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_PositioningInstructions.assistanceAvailabilityType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "assistanceAvailability : "
                    + getAssistanceAvailability().toIndentedString(indent);
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
public static class fineTimeAssistanceMeasReqType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_fineTimeAssistanceMeasReqType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public fineTimeAssistanceMeasReqType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_fineTimeAssistanceMeasReqType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_fineTimeAssistanceMeasReqType != null) {
      return ImmutableList.of(TAG_fineTimeAssistanceMeasReqType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new fineTimeAssistanceMeasReqType from encoded stream.
   */
  public static fineTimeAssistanceMeasReqType fromPerUnaligned(byte[] encodedBytes) {
    fineTimeAssistanceMeasReqType result = new fineTimeAssistanceMeasReqType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new fineTimeAssistanceMeasReqType from encoded stream.
   */
  public static fineTimeAssistanceMeasReqType fromPerAligned(byte[] encodedBytes) {
    fineTimeAssistanceMeasReqType result = new fineTimeAssistanceMeasReqType();
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
    return "fineTimeAssistanceMeasReqType = " + getValue() + ";\n";
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
public static class adrMeasReqType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_adrMeasReqType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public adrMeasReqType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_adrMeasReqType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_adrMeasReqType != null) {
      return ImmutableList.of(TAG_adrMeasReqType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new adrMeasReqType from encoded stream.
   */
  public static adrMeasReqType fromPerUnaligned(byte[] encodedBytes) {
    adrMeasReqType result = new adrMeasReqType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new adrMeasReqType from encoded stream.
   */
  public static adrMeasReqType fromPerAligned(byte[] encodedBytes) {
    adrMeasReqType result = new adrMeasReqType();
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
    return "adrMeasReqType = " + getValue() + ";\n";
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
public static class multiFreqMeasReqType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_multiFreqMeasReqType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public multiFreqMeasReqType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_multiFreqMeasReqType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_multiFreqMeasReqType != null) {
      return ImmutableList.of(TAG_multiFreqMeasReqType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new multiFreqMeasReqType from encoded stream.
   */
  public static multiFreqMeasReqType fromPerUnaligned(byte[] encodedBytes) {
    multiFreqMeasReqType result = new multiFreqMeasReqType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new multiFreqMeasReqType from encoded stream.
   */
  public static multiFreqMeasReqType fromPerAligned(byte[] encodedBytes) {
    multiFreqMeasReqType result = new multiFreqMeasReqType();
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
    return "multiFreqMeasReqType = " + getValue() + ";\n";
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
public static class assistanceAvailabilityType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_assistanceAvailabilityType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public assistanceAvailabilityType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_assistanceAvailabilityType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_assistanceAvailabilityType != null) {
      return ImmutableList.of(TAG_assistanceAvailabilityType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new assistanceAvailabilityType from encoded stream.
   */
  public static assistanceAvailabilityType fromPerUnaligned(byte[] encodedBytes) {
    assistanceAvailabilityType result = new assistanceAvailabilityType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new assistanceAvailabilityType from encoded stream.
   */
  public static assistanceAvailabilityType fromPerAligned(byte[] encodedBytes) {
    assistanceAvailabilityType result = new assistanceAvailabilityType();
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
    return "assistanceAvailabilityType = " + getValue() + ";\n";
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
    builder.append("GNSS_PositioningInstructions = {\n");
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
