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
import com.google.location.suplclient.asn1.base.Asn1BitString;
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
public  class GNSS_SystemTime extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GNSS_SystemTime
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GNSS_SystemTime() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GNSS_SystemTime;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GNSS_SystemTime != null) {
      return ImmutableList.of(TAG_GNSS_SystemTime);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GNSS_SystemTime from encoded stream.
   */
  public static GNSS_SystemTime fromPerUnaligned(byte[] encodedBytes) {
    GNSS_SystemTime result = new GNSS_SystemTime();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GNSS_SystemTime from encoded stream.
   */
  public static GNSS_SystemTime fromPerAligned(byte[] encodedBytes) {
    GNSS_SystemTime result = new GNSS_SystemTime();
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

  
  private GNSS_ID gnss_TimeID_;
  public GNSS_ID getGnss_TimeID() {
    return gnss_TimeID_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_ID
   */
  public void setGnss_TimeID(Asn1Object value) {
    this.gnss_TimeID_ = (GNSS_ID) value;
  }
  public GNSS_ID setGnss_TimeIDToNewInstance() {
    gnss_TimeID_ = new GNSS_ID();
    return gnss_TimeID_;
  }
  
  private GNSS_SystemTime.gnss_DayNumberType gnss_DayNumber_;
  public GNSS_SystemTime.gnss_DayNumberType getGnss_DayNumber() {
    return gnss_DayNumber_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_SystemTime.gnss_DayNumberType
   */
  public void setGnss_DayNumber(Asn1Object value) {
    this.gnss_DayNumber_ = (GNSS_SystemTime.gnss_DayNumberType) value;
  }
  public GNSS_SystemTime.gnss_DayNumberType setGnss_DayNumberToNewInstance() {
    gnss_DayNumber_ = new GNSS_SystemTime.gnss_DayNumberType();
    return gnss_DayNumber_;
  }
  
  private GNSS_SystemTime.gnss_TimeOfDayType gnss_TimeOfDay_;
  public GNSS_SystemTime.gnss_TimeOfDayType getGnss_TimeOfDay() {
    return gnss_TimeOfDay_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_SystemTime.gnss_TimeOfDayType
   */
  public void setGnss_TimeOfDay(Asn1Object value) {
    this.gnss_TimeOfDay_ = (GNSS_SystemTime.gnss_TimeOfDayType) value;
  }
  public GNSS_SystemTime.gnss_TimeOfDayType setGnss_TimeOfDayToNewInstance() {
    gnss_TimeOfDay_ = new GNSS_SystemTime.gnss_TimeOfDayType();
    return gnss_TimeOfDay_;
  }
  
  private GNSS_SystemTime.gnss_TimeOfDayFrac_msecType gnss_TimeOfDayFrac_msec_;
  public GNSS_SystemTime.gnss_TimeOfDayFrac_msecType getGnss_TimeOfDayFrac_msec() {
    return gnss_TimeOfDayFrac_msec_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_SystemTime.gnss_TimeOfDayFrac_msecType
   */
  public void setGnss_TimeOfDayFrac_msec(Asn1Object value) {
    this.gnss_TimeOfDayFrac_msec_ = (GNSS_SystemTime.gnss_TimeOfDayFrac_msecType) value;
  }
  public GNSS_SystemTime.gnss_TimeOfDayFrac_msecType setGnss_TimeOfDayFrac_msecToNewInstance() {
    gnss_TimeOfDayFrac_msec_ = new GNSS_SystemTime.gnss_TimeOfDayFrac_msecType();
    return gnss_TimeOfDayFrac_msec_;
  }
  
  private GNSS_SystemTime.notificationOfLeapSecondType notificationOfLeapSecond_;
  public GNSS_SystemTime.notificationOfLeapSecondType getNotificationOfLeapSecond() {
    return notificationOfLeapSecond_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_SystemTime.notificationOfLeapSecondType
   */
  public void setNotificationOfLeapSecond(Asn1Object value) {
    this.notificationOfLeapSecond_ = (GNSS_SystemTime.notificationOfLeapSecondType) value;
  }
  public GNSS_SystemTime.notificationOfLeapSecondType setNotificationOfLeapSecondToNewInstance() {
    notificationOfLeapSecond_ = new GNSS_SystemTime.notificationOfLeapSecondType();
    return notificationOfLeapSecond_;
  }
  
  private GPS_TOW_Assist gps_TOW_Assist_;
  public GPS_TOW_Assist getGps_TOW_Assist() {
    return gps_TOW_Assist_;
  }
  /**
   * @throws ClassCastException if value is not a GPS_TOW_Assist
   */
  public void setGps_TOW_Assist(Asn1Object value) {
    this.gps_TOW_Assist_ = (GPS_TOW_Assist) value;
  }
  public GPS_TOW_Assist setGps_TOW_AssistToNewInstance() {
    gps_TOW_Assist_ = new GPS_TOW_Assist();
    return gps_TOW_Assist_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getGnss_TimeID() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_TimeID();
          }

          @Override public void setToNewInstance() {
            setGnss_TimeIDToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_ID.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_TimeID : "
                    + getGnss_TimeID().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getGnss_DayNumber() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_DayNumber();
          }

          @Override public void setToNewInstance() {
            setGnss_DayNumberToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_SystemTime.gnss_DayNumberType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_DayNumber : "
                    + getGnss_DayNumber().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getGnss_TimeOfDay() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_TimeOfDay();
          }

          @Override public void setToNewInstance() {
            setGnss_TimeOfDayToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_SystemTime.gnss_TimeOfDayType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_TimeOfDay : "
                    + getGnss_TimeOfDay().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getGnss_TimeOfDayFrac_msec() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_TimeOfDayFrac_msec();
          }

          @Override public void setToNewInstance() {
            setGnss_TimeOfDayFrac_msecToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_SystemTime.gnss_TimeOfDayFrac_msecType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_TimeOfDayFrac_msec : "
                    + getGnss_TimeOfDayFrac_msec().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getNotificationOfLeapSecond() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getNotificationOfLeapSecond();
          }

          @Override public void setToNewInstance() {
            setNotificationOfLeapSecondToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_SystemTime.notificationOfLeapSecondType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "notificationOfLeapSecond : "
                    + getNotificationOfLeapSecond().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getGps_TOW_Assist() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGps_TOW_Assist();
          }

          @Override public void setToNewInstance() {
            setGps_TOW_AssistToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GPS_TOW_Assist.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gps_TOW_Assist : "
                    + getGps_TOW_Assist().toIndentedString(indent);
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
public static class gnss_DayNumberType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_gnss_DayNumberType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gnss_DayNumberType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("32767"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gnss_DayNumberType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gnss_DayNumberType != null) {
      return ImmutableList.of(TAG_gnss_DayNumberType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gnss_DayNumberType from encoded stream.
   */
  public static gnss_DayNumberType fromPerUnaligned(byte[] encodedBytes) {
    gnss_DayNumberType result = new gnss_DayNumberType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gnss_DayNumberType from encoded stream.
   */
  public static gnss_DayNumberType fromPerAligned(byte[] encodedBytes) {
    gnss_DayNumberType result = new gnss_DayNumberType();
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
    return "gnss_DayNumberType = " + getInteger() + ";\n";
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
public static class gnss_TimeOfDayType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_gnss_TimeOfDayType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gnss_TimeOfDayType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("86399"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gnss_TimeOfDayType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gnss_TimeOfDayType != null) {
      return ImmutableList.of(TAG_gnss_TimeOfDayType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gnss_TimeOfDayType from encoded stream.
   */
  public static gnss_TimeOfDayType fromPerUnaligned(byte[] encodedBytes) {
    gnss_TimeOfDayType result = new gnss_TimeOfDayType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gnss_TimeOfDayType from encoded stream.
   */
  public static gnss_TimeOfDayType fromPerAligned(byte[] encodedBytes) {
    gnss_TimeOfDayType result = new gnss_TimeOfDayType();
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
    return "gnss_TimeOfDayType = " + getInteger() + ";\n";
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
public static class gnss_TimeOfDayFrac_msecType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_gnss_TimeOfDayFrac_msecType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gnss_TimeOfDayFrac_msecType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("999"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gnss_TimeOfDayFrac_msecType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gnss_TimeOfDayFrac_msecType != null) {
      return ImmutableList.of(TAG_gnss_TimeOfDayFrac_msecType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gnss_TimeOfDayFrac_msecType from encoded stream.
   */
  public static gnss_TimeOfDayFrac_msecType fromPerUnaligned(byte[] encodedBytes) {
    gnss_TimeOfDayFrac_msecType result = new gnss_TimeOfDayFrac_msecType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gnss_TimeOfDayFrac_msecType from encoded stream.
   */
  public static gnss_TimeOfDayFrac_msecType fromPerAligned(byte[] encodedBytes) {
    gnss_TimeOfDayFrac_msecType result = new gnss_TimeOfDayFrac_msecType();
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
    return "gnss_TimeOfDayFrac_msecType = " + getInteger() + ";\n";
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
public static class notificationOfLeapSecondType extends Asn1BitString {
  //

  // defined bit positions, if any
  

  // setters
  

  // clearers
  


  private static final Asn1Tag TAG_notificationOfLeapSecondType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public notificationOfLeapSecondType() {
    super();
    setMinSize(2);
setMaxSize(2);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_notificationOfLeapSecondType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_notificationOfLeapSecondType != null) {
      return ImmutableList.of(TAG_notificationOfLeapSecondType);
    } else {
      return Asn1BitString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new notificationOfLeapSecondType from encoded stream.
   */
  public static notificationOfLeapSecondType fromPerUnaligned(byte[] encodedBytes) {
    notificationOfLeapSecondType result = new notificationOfLeapSecondType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new notificationOfLeapSecondType from encoded stream.
   */
  public static notificationOfLeapSecondType fromPerAligned(byte[] encodedBytes) {
    notificationOfLeapSecondType result = new notificationOfLeapSecondType();
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
    return "notificationOfLeapSecondType = " + getValue() + ";\n";
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
    builder.append("GNSS_SystemTime = {\n");
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
