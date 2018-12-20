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
public  class StoredNavListInfo extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_StoredNavListInfo
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public StoredNavListInfo() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_StoredNavListInfo;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_StoredNavListInfo != null) {
      return ImmutableList.of(TAG_StoredNavListInfo);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new StoredNavListInfo from encoded stream.
   */
  public static StoredNavListInfo fromPerUnaligned(byte[] encodedBytes) {
    StoredNavListInfo result = new StoredNavListInfo();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new StoredNavListInfo from encoded stream.
   */
  public static StoredNavListInfo fromPerAligned(byte[] encodedBytes) {
    StoredNavListInfo result = new StoredNavListInfo();
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

  
  private StoredNavListInfo.gnss_WeekOrDayType gnss_WeekOrDay_;
  public StoredNavListInfo.gnss_WeekOrDayType getGnss_WeekOrDay() {
    return gnss_WeekOrDay_;
  }
  /**
   * @throws ClassCastException if value is not a StoredNavListInfo.gnss_WeekOrDayType
   */
  public void setGnss_WeekOrDay(Asn1Object value) {
    this.gnss_WeekOrDay_ = (StoredNavListInfo.gnss_WeekOrDayType) value;
  }
  public StoredNavListInfo.gnss_WeekOrDayType setGnss_WeekOrDayToNewInstance() {
    gnss_WeekOrDay_ = new StoredNavListInfo.gnss_WeekOrDayType();
    return gnss_WeekOrDay_;
  }
  
  private StoredNavListInfo.gnss_ToeType gnss_Toe_;
  public StoredNavListInfo.gnss_ToeType getGnss_Toe() {
    return gnss_Toe_;
  }
  /**
   * @throws ClassCastException if value is not a StoredNavListInfo.gnss_ToeType
   */
  public void setGnss_Toe(Asn1Object value) {
    this.gnss_Toe_ = (StoredNavListInfo.gnss_ToeType) value;
  }
  public StoredNavListInfo.gnss_ToeType setGnss_ToeToNewInstance() {
    gnss_Toe_ = new StoredNavListInfo.gnss_ToeType();
    return gnss_Toe_;
  }
  
  private StoredNavListInfo.t_toeLimitType t_toeLimit_;
  public StoredNavListInfo.t_toeLimitType getT_toeLimit() {
    return t_toeLimit_;
  }
  /**
   * @throws ClassCastException if value is not a StoredNavListInfo.t_toeLimitType
   */
  public void setT_toeLimit(Asn1Object value) {
    this.t_toeLimit_ = (StoredNavListInfo.t_toeLimitType) value;
  }
  public StoredNavListInfo.t_toeLimitType setT_toeLimitToNewInstance() {
    t_toeLimit_ = new StoredNavListInfo.t_toeLimitType();
    return t_toeLimit_;
  }
  
  private SatListRelatedDataList satListRelatedDataList_;
  public SatListRelatedDataList getSatListRelatedDataList() {
    return satListRelatedDataList_;
  }
  /**
   * @throws ClassCastException if value is not a SatListRelatedDataList
   */
  public void setSatListRelatedDataList(Asn1Object value) {
    this.satListRelatedDataList_ = (SatListRelatedDataList) value;
  }
  public SatListRelatedDataList setSatListRelatedDataListToNewInstance() {
    satListRelatedDataList_ = new SatListRelatedDataList();
    return satListRelatedDataList_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getGnss_WeekOrDay() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_WeekOrDay();
          }

          @Override public void setToNewInstance() {
            setGnss_WeekOrDayToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? StoredNavListInfo.gnss_WeekOrDayType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_WeekOrDay : "
                    + getGnss_WeekOrDay().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getGnss_Toe() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_Toe();
          }

          @Override public void setToNewInstance() {
            setGnss_ToeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? StoredNavListInfo.gnss_ToeType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_Toe : "
                    + getGnss_Toe().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getT_toeLimit() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getT_toeLimit();
          }

          @Override public void setToNewInstance() {
            setT_toeLimitToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? StoredNavListInfo.t_toeLimitType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "t_toeLimit : "
                    + getT_toeLimit().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getSatListRelatedDataList() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getSatListRelatedDataList();
          }

          @Override public void setToNewInstance() {
            setSatListRelatedDataListToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SatListRelatedDataList.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "satListRelatedDataList : "
                    + getSatListRelatedDataList().toIndentedString(indent);
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
public static class gnss_WeekOrDayType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_gnss_WeekOrDayType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gnss_WeekOrDayType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("4095"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gnss_WeekOrDayType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gnss_WeekOrDayType != null) {
      return ImmutableList.of(TAG_gnss_WeekOrDayType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gnss_WeekOrDayType from encoded stream.
   */
  public static gnss_WeekOrDayType fromPerUnaligned(byte[] encodedBytes) {
    gnss_WeekOrDayType result = new gnss_WeekOrDayType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gnss_WeekOrDayType from encoded stream.
   */
  public static gnss_WeekOrDayType fromPerAligned(byte[] encodedBytes) {
    gnss_WeekOrDayType result = new gnss_WeekOrDayType();
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
    return "gnss_WeekOrDayType = " + getInteger() + ";\n";
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
public static class gnss_ToeType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_gnss_ToeType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gnss_ToeType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("255"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gnss_ToeType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gnss_ToeType != null) {
      return ImmutableList.of(TAG_gnss_ToeType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gnss_ToeType from encoded stream.
   */
  public static gnss_ToeType fromPerUnaligned(byte[] encodedBytes) {
    gnss_ToeType result = new gnss_ToeType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gnss_ToeType from encoded stream.
   */
  public static gnss_ToeType fromPerAligned(byte[] encodedBytes) {
    gnss_ToeType result = new gnss_ToeType();
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
    return "gnss_ToeType = " + getInteger() + ";\n";
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
public static class t_toeLimitType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_t_toeLimitType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public t_toeLimitType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("15"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_t_toeLimitType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_t_toeLimitType != null) {
      return ImmutableList.of(TAG_t_toeLimitType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new t_toeLimitType from encoded stream.
   */
  public static t_toeLimitType fromPerUnaligned(byte[] encodedBytes) {
    t_toeLimitType result = new t_toeLimitType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new t_toeLimitType from encoded stream.
   */
  public static t_toeLimitType fromPerAligned(byte[] encodedBytes) {
    t_toeLimitType result = new t_toeLimitType();
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
    return "t_toeLimitType = " + getInteger() + ";\n";
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
    builder.append("StoredNavListInfo = {\n");
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
