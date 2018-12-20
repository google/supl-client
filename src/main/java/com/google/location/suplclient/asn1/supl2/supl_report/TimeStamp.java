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

package com.google.location.suplclient.asn1.supl2.supl_report;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.google.location.suplclient.asn1.base.Asn1Choice;
import com.google.location.suplclient.asn1.base.Asn1Integer;
import com.google.location.suplclient.asn1.base.Asn1Object;
import com.google.location.suplclient.asn1.base.Asn1Tag;
import com.google.location.suplclient.asn1.base.Asn1UTCTime;
import com.google.location.suplclient.asn1.base.BitStream;
import com.google.location.suplclient.asn1.base.BitStreamReader;
import com.google.location.suplclient.asn1.base.ChoiceComponent;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;


/**
 * 
 */
public  class TimeStamp extends Asn1Choice {
  //

  private static final Asn1Tag TAG_TimeStamp
      = Asn1Tag.fromClassAndNumber(-1, -1);

  private static final Map<Asn1Tag, Select> tagToSelection = new HashMap<>();

  private boolean extension;
  private ChoiceComponent selection;
  private Asn1Object element;

  static {
    for (Select select : Select.values()) {
      for (Asn1Tag tag : select.getPossibleFirstTags()) {
        Select select0;
        if ((select0 = tagToSelection.put(tag, select)) != null) {
          throw new IllegalStateException(
            "TimeStamp: " + tag + " maps to both " + select0 + " and " + select);
        }
      }
    }
  }

  public TimeStamp() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_TimeStamp;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_TimeStamp != null) {
      return ImmutableList.of(TAG_TimeStamp);
    } else {
      return tagToSelection.keySet();
    }
  }

  /**
   * Creates a new TimeStamp from encoded stream.
   */
  public static TimeStamp fromPerUnaligned(byte[] encodedBytes) {
    TimeStamp result = new TimeStamp();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new TimeStamp from encoded stream.
   */
  public static TimeStamp fromPerAligned(byte[] encodedBytes) {
    TimeStamp result = new TimeStamp();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  

  @Override protected boolean hasExtensionValue() {
    return extension;
  }

  @Override protected Integer getSelectionOrdinal() {
    return selection.ordinal();
  }

  @Nullable
  @Override
  protected ChoiceComponent getSelectedComponent() {
    return selection;
  }

  @Override protected int getOptionCount() {
    if (hasExtensionValue()) {
      return Extend.values().length;
    }
    return Select.values().length;
  }

  protected Asn1Object createAndSetValue(boolean isExtensionValue,
                                         int ordinal) {
    extension = isExtensionValue;
    if (isExtensionValue) {
      selection = Extend.values()[ordinal];
    } else {
      selection = Select.values()[ordinal];
    }
    element = selection.createElement();
    return element;
  }

  @Override protected ChoiceComponent createAndSetValue(Asn1Tag tag) {
    Select select = tagToSelection.get(tag);
    if (select == null) {
      throw new IllegalArgumentException("Unknown selection tag: " + tag);
    }
    element = select.createElement();
    selection = select;
    extension = false;
    return select;
  }

  @Override protected boolean isExtensible() {
    return false;
  }

  @Override public Asn1Object getValue() {
    return element;
  }

  
  private static enum Select implements ChoiceComponent {
    
    $AbsoluteTime(Asn1Tag.fromClassAndNumber(2, 0),
        true) {
      @Override
      public Asn1Object createElement() {
        return new TimeStamp.absoluteTimeType();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? TimeStamp.absoluteTimeType.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $RelativeTime(Asn1Tag.fromClassAndNumber(2, 1),
        true) {
      @Override
      public Asn1Object createElement() {
        return new TimeStamp.relativeTimeType();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? TimeStamp.relativeTimeType.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    ;

    @Nullable final Asn1Tag tag;
    final boolean isImplicitTagging;

    Select(@Nullable Asn1Tag tag, boolean isImplicitTagging) {
      this.tag = tag;
      this.isImplicitTagging = isImplicitTagging;
    }

    @Override
    public Asn1Object createElement() {
      throw new IllegalStateException("Select template error");
    }

    @Override
    @Nullable
    public Asn1Tag getTag() {
      return tag;
    }

    @Override
    public boolean isImplicitTagging() {
      return isImplicitTagging;
    }

    abstract Collection<Asn1Tag> getPossibleFirstTags();

    abstract String elementIndentedString(Asn1Object element, String indent);
  }
  
  /*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class absoluteTimeType extends Asn1UTCTime {
  //

  private static final Asn1Tag TAG_absoluteTimeType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public absoluteTimeType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_absoluteTimeType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_absoluteTimeType != null) {
      return ImmutableList.of(TAG_absoluteTimeType);
    } else {
      return Asn1UTCTime.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new absoluteTimeType from encoded stream.
   */
  public static absoluteTimeType fromPerUnaligned(byte[] encodedBytes) {
    absoluteTimeType result = new absoluteTimeType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new absoluteTimeType from encoded stream.
   */
  public static absoluteTimeType fromPerAligned(byte[] encodedBytes) {
    absoluteTimeType result = new absoluteTimeType();
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
    return "absoluteTimeType = [ " + toHumanReadableString() + " ];\n";
  }

}


  public boolean isAbsoluteTime() {
    return !hasExtensionValue() && Select.$AbsoluteTime == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isAbsoluteTime}.
   */
  @SuppressWarnings("unchecked")
  public TimeStamp.absoluteTimeType getAbsoluteTime() {
    if (!isAbsoluteTime()) {
      throw new IllegalStateException("TimeStamp value not a AbsoluteTime");
    }
    return (TimeStamp.absoluteTimeType) element;
  }

  public void setAbsoluteTime(TimeStamp.absoluteTimeType selected) {
    selection = Select.$AbsoluteTime;
    extension = false;
    element = selected;
  }

  public TimeStamp.absoluteTimeType setAbsoluteTimeToNewInstance() {
      TimeStamp.absoluteTimeType element = new TimeStamp.absoluteTimeType();
      setAbsoluteTime(element);
      return element;
  }
  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class relativeTimeType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_relativeTimeType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public relativeTimeType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("31536000"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_relativeTimeType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_relativeTimeType != null) {
      return ImmutableList.of(TAG_relativeTimeType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new relativeTimeType from encoded stream.
   */
  public static relativeTimeType fromPerUnaligned(byte[] encodedBytes) {
    relativeTimeType result = new relativeTimeType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new relativeTimeType from encoded stream.
   */
  public static relativeTimeType fromPerAligned(byte[] encodedBytes) {
    relativeTimeType result = new relativeTimeType();
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
    return "relativeTimeType = " + getInteger() + ";\n";
  }
}


  public boolean isRelativeTime() {
    return !hasExtensionValue() && Select.$RelativeTime == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isRelativeTime}.
   */
  @SuppressWarnings("unchecked")
  public TimeStamp.relativeTimeType getRelativeTime() {
    if (!isRelativeTime()) {
      throw new IllegalStateException("TimeStamp value not a RelativeTime");
    }
    return (TimeStamp.relativeTimeType) element;
  }

  public void setRelativeTime(TimeStamp.relativeTimeType selected) {
    selection = Select.$RelativeTime;
    extension = false;
    element = selected;
  }

  public TimeStamp.relativeTimeType setRelativeTimeToNewInstance() {
      TimeStamp.relativeTimeType element = new TimeStamp.relativeTimeType();
      setRelativeTime(element);
      return element;
  }
  

  private static enum Extend implements ChoiceComponent {
    
    ;
    @Nullable private final Asn1Tag tag;
    private final boolean isImplicitTagging;

    Extend(@Nullable Asn1Tag tag, boolean isImplicitTagging) {
      this.tag = tag;
      this.isImplicitTagging = isImplicitTagging;
    }

    public Asn1Object createElement() {
      throw new IllegalStateException("Extend template error");
    }

    @Override
    @Nullable
    public Asn1Tag getTag() {
      return tag;
    }

    @Override
    public boolean isImplicitTagging() {
      return isImplicitTagging;
    }

    String elementIndentedString(Asn1Object element, String indent) {
      throw new IllegalStateException("Extend template error");
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

  private String elementIndentedString(String indent) {
    if (element == null) {
      return "null;\n";
    }
    if (extension) {
      return Extend.values()[selection.ordinal()]
          .elementIndentedString(element, indent + "  ");
    } else {
      return Select.values()[selection.ordinal()]
          .elementIndentedString(element, indent + "  ");
    }
  }

  public String toIndentedString(String indent) {
    return "TimeStamp = " + elementIndentedString(indent) + indent + ";\n";
  }
}
