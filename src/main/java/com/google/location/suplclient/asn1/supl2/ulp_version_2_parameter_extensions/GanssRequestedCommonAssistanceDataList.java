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

package com.google.location.suplclient.asn1.supl2.ulp_version_2_parameter_extensions;

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
public  class GanssRequestedCommonAssistanceDataList extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GanssRequestedCommonAssistanceDataList
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GanssRequestedCommonAssistanceDataList() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GanssRequestedCommonAssistanceDataList;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GanssRequestedCommonAssistanceDataList != null) {
      return ImmutableList.of(TAG_GanssRequestedCommonAssistanceDataList);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GanssRequestedCommonAssistanceDataList from encoded stream.
   */
  public static GanssRequestedCommonAssistanceDataList fromPerUnaligned(byte[] encodedBytes) {
    GanssRequestedCommonAssistanceDataList result = new GanssRequestedCommonAssistanceDataList();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GanssRequestedCommonAssistanceDataList from encoded stream.
   */
  public static GanssRequestedCommonAssistanceDataList fromPerAligned(byte[] encodedBytes) {
    GanssRequestedCommonAssistanceDataList result = new GanssRequestedCommonAssistanceDataList();
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

  
  private GanssRequestedCommonAssistanceDataList.ganssReferenceTimeType ganssReferenceTime_;
  public GanssRequestedCommonAssistanceDataList.ganssReferenceTimeType getGanssReferenceTime() {
    return ganssReferenceTime_;
  }
  /**
   * @throws ClassCastException if value is not a GanssRequestedCommonAssistanceDataList.ganssReferenceTimeType
   */
  public void setGanssReferenceTime(Asn1Object value) {
    this.ganssReferenceTime_ = (GanssRequestedCommonAssistanceDataList.ganssReferenceTimeType) value;
  }
  public GanssRequestedCommonAssistanceDataList.ganssReferenceTimeType setGanssReferenceTimeToNewInstance() {
    ganssReferenceTime_ = new GanssRequestedCommonAssistanceDataList.ganssReferenceTimeType();
    return ganssReferenceTime_;
  }
  
  private GanssRequestedCommonAssistanceDataList.ganssIonosphericModelType ganssIonosphericModel_;
  public GanssRequestedCommonAssistanceDataList.ganssIonosphericModelType getGanssIonosphericModel() {
    return ganssIonosphericModel_;
  }
  /**
   * @throws ClassCastException if value is not a GanssRequestedCommonAssistanceDataList.ganssIonosphericModelType
   */
  public void setGanssIonosphericModel(Asn1Object value) {
    this.ganssIonosphericModel_ = (GanssRequestedCommonAssistanceDataList.ganssIonosphericModelType) value;
  }
  public GanssRequestedCommonAssistanceDataList.ganssIonosphericModelType setGanssIonosphericModelToNewInstance() {
    ganssIonosphericModel_ = new GanssRequestedCommonAssistanceDataList.ganssIonosphericModelType();
    return ganssIonosphericModel_;
  }
  
  private GanssRequestedCommonAssistanceDataList.ganssAdditionalIonosphericModelForDataID00Type ganssAdditionalIonosphericModelForDataID00_;
  public GanssRequestedCommonAssistanceDataList.ganssAdditionalIonosphericModelForDataID00Type getGanssAdditionalIonosphericModelForDataID00() {
    return ganssAdditionalIonosphericModelForDataID00_;
  }
  /**
   * @throws ClassCastException if value is not a GanssRequestedCommonAssistanceDataList.ganssAdditionalIonosphericModelForDataID00Type
   */
  public void setGanssAdditionalIonosphericModelForDataID00(Asn1Object value) {
    this.ganssAdditionalIonosphericModelForDataID00_ = (GanssRequestedCommonAssistanceDataList.ganssAdditionalIonosphericModelForDataID00Type) value;
  }
  public GanssRequestedCommonAssistanceDataList.ganssAdditionalIonosphericModelForDataID00Type setGanssAdditionalIonosphericModelForDataID00ToNewInstance() {
    ganssAdditionalIonosphericModelForDataID00_ = new GanssRequestedCommonAssistanceDataList.ganssAdditionalIonosphericModelForDataID00Type();
    return ganssAdditionalIonosphericModelForDataID00_;
  }
  
  private GanssRequestedCommonAssistanceDataList.ganssAdditionalIonosphericModelForDataID11Type ganssAdditionalIonosphericModelForDataID11_;
  public GanssRequestedCommonAssistanceDataList.ganssAdditionalIonosphericModelForDataID11Type getGanssAdditionalIonosphericModelForDataID11() {
    return ganssAdditionalIonosphericModelForDataID11_;
  }
  /**
   * @throws ClassCastException if value is not a GanssRequestedCommonAssistanceDataList.ganssAdditionalIonosphericModelForDataID11Type
   */
  public void setGanssAdditionalIonosphericModelForDataID11(Asn1Object value) {
    this.ganssAdditionalIonosphericModelForDataID11_ = (GanssRequestedCommonAssistanceDataList.ganssAdditionalIonosphericModelForDataID11Type) value;
  }
  public GanssRequestedCommonAssistanceDataList.ganssAdditionalIonosphericModelForDataID11Type setGanssAdditionalIonosphericModelForDataID11ToNewInstance() {
    ganssAdditionalIonosphericModelForDataID11_ = new GanssRequestedCommonAssistanceDataList.ganssAdditionalIonosphericModelForDataID11Type();
    return ganssAdditionalIonosphericModelForDataID11_;
  }
  
  private GanssRequestedCommonAssistanceDataList.ganssEarthOrientationParametersType ganssEarthOrientationParameters_;
  public GanssRequestedCommonAssistanceDataList.ganssEarthOrientationParametersType getGanssEarthOrientationParameters() {
    return ganssEarthOrientationParameters_;
  }
  /**
   * @throws ClassCastException if value is not a GanssRequestedCommonAssistanceDataList.ganssEarthOrientationParametersType
   */
  public void setGanssEarthOrientationParameters(Asn1Object value) {
    this.ganssEarthOrientationParameters_ = (GanssRequestedCommonAssistanceDataList.ganssEarthOrientationParametersType) value;
  }
  public GanssRequestedCommonAssistanceDataList.ganssEarthOrientationParametersType setGanssEarthOrientationParametersToNewInstance() {
    ganssEarthOrientationParameters_ = new GanssRequestedCommonAssistanceDataList.ganssEarthOrientationParametersType();
    return ganssEarthOrientationParameters_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getGanssReferenceTime() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssReferenceTime();
          }

          @Override public void setToNewInstance() {
            setGanssReferenceTimeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GanssRequestedCommonAssistanceDataList.ganssReferenceTimeType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssReferenceTime : "
                    + getGanssReferenceTime().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getGanssIonosphericModel() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssIonosphericModel();
          }

          @Override public void setToNewInstance() {
            setGanssIonosphericModelToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GanssRequestedCommonAssistanceDataList.ganssIonosphericModelType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssIonosphericModel : "
                    + getGanssIonosphericModel().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getGanssAdditionalIonosphericModelForDataID00() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssAdditionalIonosphericModelForDataID00();
          }

          @Override public void setToNewInstance() {
            setGanssAdditionalIonosphericModelForDataID00ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GanssRequestedCommonAssistanceDataList.ganssAdditionalIonosphericModelForDataID00Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssAdditionalIonosphericModelForDataID00 : "
                    + getGanssAdditionalIonosphericModelForDataID00().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getGanssAdditionalIonosphericModelForDataID11() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssAdditionalIonosphericModelForDataID11();
          }

          @Override public void setToNewInstance() {
            setGanssAdditionalIonosphericModelForDataID11ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GanssRequestedCommonAssistanceDataList.ganssAdditionalIonosphericModelForDataID11Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssAdditionalIonosphericModelForDataID11 : "
                    + getGanssAdditionalIonosphericModelForDataID11().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getGanssEarthOrientationParameters() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssEarthOrientationParameters();
          }

          @Override public void setToNewInstance() {
            setGanssEarthOrientationParametersToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GanssRequestedCommonAssistanceDataList.ganssEarthOrientationParametersType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssEarthOrientationParameters : "
                    + getGanssEarthOrientationParameters().toIndentedString(indent);
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
public static class ganssReferenceTimeType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_ganssReferenceTimeType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ganssReferenceTimeType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ganssReferenceTimeType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ganssReferenceTimeType != null) {
      return ImmutableList.of(TAG_ganssReferenceTimeType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ganssReferenceTimeType from encoded stream.
   */
  public static ganssReferenceTimeType fromPerUnaligned(byte[] encodedBytes) {
    ganssReferenceTimeType result = new ganssReferenceTimeType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ganssReferenceTimeType from encoded stream.
   */
  public static ganssReferenceTimeType fromPerAligned(byte[] encodedBytes) {
    ganssReferenceTimeType result = new ganssReferenceTimeType();
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
    return "ganssReferenceTimeType = " + getValue() + ";\n";
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
public static class ganssIonosphericModelType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_ganssIonosphericModelType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ganssIonosphericModelType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ganssIonosphericModelType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ganssIonosphericModelType != null) {
      return ImmutableList.of(TAG_ganssIonosphericModelType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ganssIonosphericModelType from encoded stream.
   */
  public static ganssIonosphericModelType fromPerUnaligned(byte[] encodedBytes) {
    ganssIonosphericModelType result = new ganssIonosphericModelType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ganssIonosphericModelType from encoded stream.
   */
  public static ganssIonosphericModelType fromPerAligned(byte[] encodedBytes) {
    ganssIonosphericModelType result = new ganssIonosphericModelType();
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
    return "ganssIonosphericModelType = " + getValue() + ";\n";
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
public static class ganssAdditionalIonosphericModelForDataID00Type extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_ganssAdditionalIonosphericModelForDataID00Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ganssAdditionalIonosphericModelForDataID00Type() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ganssAdditionalIonosphericModelForDataID00Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ganssAdditionalIonosphericModelForDataID00Type != null) {
      return ImmutableList.of(TAG_ganssAdditionalIonosphericModelForDataID00Type);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ganssAdditionalIonosphericModelForDataID00Type from encoded stream.
   */
  public static ganssAdditionalIonosphericModelForDataID00Type fromPerUnaligned(byte[] encodedBytes) {
    ganssAdditionalIonosphericModelForDataID00Type result = new ganssAdditionalIonosphericModelForDataID00Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ganssAdditionalIonosphericModelForDataID00Type from encoded stream.
   */
  public static ganssAdditionalIonosphericModelForDataID00Type fromPerAligned(byte[] encodedBytes) {
    ganssAdditionalIonosphericModelForDataID00Type result = new ganssAdditionalIonosphericModelForDataID00Type();
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
    return "ganssAdditionalIonosphericModelForDataID00Type = " + getValue() + ";\n";
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
public static class ganssAdditionalIonosphericModelForDataID11Type extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_ganssAdditionalIonosphericModelForDataID11Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ganssAdditionalIonosphericModelForDataID11Type() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ganssAdditionalIonosphericModelForDataID11Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ganssAdditionalIonosphericModelForDataID11Type != null) {
      return ImmutableList.of(TAG_ganssAdditionalIonosphericModelForDataID11Type);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ganssAdditionalIonosphericModelForDataID11Type from encoded stream.
   */
  public static ganssAdditionalIonosphericModelForDataID11Type fromPerUnaligned(byte[] encodedBytes) {
    ganssAdditionalIonosphericModelForDataID11Type result = new ganssAdditionalIonosphericModelForDataID11Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ganssAdditionalIonosphericModelForDataID11Type from encoded stream.
   */
  public static ganssAdditionalIonosphericModelForDataID11Type fromPerAligned(byte[] encodedBytes) {
    ganssAdditionalIonosphericModelForDataID11Type result = new ganssAdditionalIonosphericModelForDataID11Type();
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
    return "ganssAdditionalIonosphericModelForDataID11Type = " + getValue() + ";\n";
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
public static class ganssEarthOrientationParametersType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_ganssEarthOrientationParametersType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ganssEarthOrientationParametersType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ganssEarthOrientationParametersType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ganssEarthOrientationParametersType != null) {
      return ImmutableList.of(TAG_ganssEarthOrientationParametersType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ganssEarthOrientationParametersType from encoded stream.
   */
  public static ganssEarthOrientationParametersType fromPerUnaligned(byte[] encodedBytes) {
    ganssEarthOrientationParametersType result = new ganssEarthOrientationParametersType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ganssEarthOrientationParametersType from encoded stream.
   */
  public static ganssEarthOrientationParametersType fromPerAligned(byte[] encodedBytes) {
    ganssEarthOrientationParametersType result = new ganssEarthOrientationParametersType();
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
    return "ganssEarthOrientationParametersType = " + getValue() + ";\n";
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
    builder.append("GanssRequestedCommonAssistanceDataList = {\n");
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
