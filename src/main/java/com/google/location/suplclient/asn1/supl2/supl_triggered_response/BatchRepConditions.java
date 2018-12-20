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

package com.google.location.suplclient.asn1.supl2.supl_triggered_response;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.google.location.suplclient.asn1.base.Asn1Choice;
import com.google.location.suplclient.asn1.base.Asn1Integer;
import com.google.location.suplclient.asn1.base.Asn1Null;
import com.google.location.suplclient.asn1.base.Asn1Object;
import com.google.location.suplclient.asn1.base.Asn1Tag;
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
public  class BatchRepConditions extends Asn1Choice {
  //

  private static final Asn1Tag TAG_BatchRepConditions
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
            "BatchRepConditions: " + tag + " maps to both " + select0 + " and " + select);
        }
      }
    }
  }

  public BatchRepConditions() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_BatchRepConditions;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_BatchRepConditions != null) {
      return ImmutableList.of(TAG_BatchRepConditions);
    } else {
      return tagToSelection.keySet();
    }
  }

  /**
   * Creates a new BatchRepConditions from encoded stream.
   */
  public static BatchRepConditions fromPerUnaligned(byte[] encodedBytes) {
    BatchRepConditions result = new BatchRepConditions();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new BatchRepConditions from encoded stream.
   */
  public static BatchRepConditions fromPerAligned(byte[] encodedBytes) {
    BatchRepConditions result = new BatchRepConditions();
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
    return true;
  }

  @Override public Asn1Object getValue() {
    return element;
  }

  
  private static enum Select implements ChoiceComponent {
    
    $Num_interval(Asn1Tag.fromClassAndNumber(2, 0),
        true) {
      @Override
      public Asn1Object createElement() {
        return new BatchRepConditions.num_intervalType();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? BatchRepConditions.num_intervalType.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $Num_minutes(Asn1Tag.fromClassAndNumber(2, 1),
        true) {
      @Override
      public Asn1Object createElement() {
        return new BatchRepConditions.num_minutesType();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? BatchRepConditions.num_minutesType.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $Endofsession(Asn1Tag.fromClassAndNumber(2, 2),
        true) {
      @Override
      public Asn1Object createElement() {
        return new BatchRepConditions.endofsessionType();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? BatchRepConditions.endofsessionType.getPossibleFirstTags() : ImmutableList.of(tag);
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
  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class num_intervalType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_num_intervalType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public num_intervalType() {
    super();
    setValueRange(new java.math.BigInteger("1"), new java.math.BigInteger("1024"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_num_intervalType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_num_intervalType != null) {
      return ImmutableList.of(TAG_num_intervalType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new num_intervalType from encoded stream.
   */
  public static num_intervalType fromPerUnaligned(byte[] encodedBytes) {
    num_intervalType result = new num_intervalType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new num_intervalType from encoded stream.
   */
  public static num_intervalType fromPerAligned(byte[] encodedBytes) {
    num_intervalType result = new num_intervalType();
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
    return "num_intervalType = " + getInteger() + ";\n";
  }
}


  public boolean isNum_interval() {
    return !hasExtensionValue() && Select.$Num_interval == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isNum_interval}.
   */
  @SuppressWarnings("unchecked")
  public BatchRepConditions.num_intervalType getNum_interval() {
    if (!isNum_interval()) {
      throw new IllegalStateException("BatchRepConditions value not a Num_interval");
    }
    return (BatchRepConditions.num_intervalType) element;
  }

  public void setNum_interval(BatchRepConditions.num_intervalType selected) {
    selection = Select.$Num_interval;
    extension = false;
    element = selected;
  }

  public BatchRepConditions.num_intervalType setNum_intervalToNewInstance() {
      BatchRepConditions.num_intervalType element = new BatchRepConditions.num_intervalType();
      setNum_interval(element);
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
public static class num_minutesType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_num_minutesType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public num_minutesType() {
    super();
    setValueRange(new java.math.BigInteger("1"), new java.math.BigInteger("2048"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_num_minutesType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_num_minutesType != null) {
      return ImmutableList.of(TAG_num_minutesType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new num_minutesType from encoded stream.
   */
  public static num_minutesType fromPerUnaligned(byte[] encodedBytes) {
    num_minutesType result = new num_minutesType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new num_minutesType from encoded stream.
   */
  public static num_minutesType fromPerAligned(byte[] encodedBytes) {
    num_minutesType result = new num_minutesType();
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
    return "num_minutesType = " + getInteger() + ";\n";
  }
}


  public boolean isNum_minutes() {
    return !hasExtensionValue() && Select.$Num_minutes == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isNum_minutes}.
   */
  @SuppressWarnings("unchecked")
  public BatchRepConditions.num_minutesType getNum_minutes() {
    if (!isNum_minutes()) {
      throw new IllegalStateException("BatchRepConditions value not a Num_minutes");
    }
    return (BatchRepConditions.num_minutesType) element;
  }

  public void setNum_minutes(BatchRepConditions.num_minutesType selected) {
    selection = Select.$Num_minutes;
    extension = false;
    element = selected;
  }

  public BatchRepConditions.num_minutesType setNum_minutesToNewInstance() {
      BatchRepConditions.num_minutesType element = new BatchRepConditions.num_minutesType();
      setNum_minutes(element);
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
public static class endofsessionType extends Asn1Null {
  //

  private static final Asn1Tag TAG_endofsessionType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public endofsessionType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_endofsessionType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_endofsessionType != null) {
      return ImmutableList.of(TAG_endofsessionType);
    } else {
      return Asn1Null.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new endofsessionType from encoded stream.
   */
  public static endofsessionType fromPerUnaligned(byte[] encodedBytes) {
    endofsessionType result = new endofsessionType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new endofsessionType from encoded stream.
   */
  public static endofsessionType fromPerAligned(byte[] encodedBytes) {
    endofsessionType result = new endofsessionType();
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
    return "endofsessionType (null value);\n";
  }
}


  public boolean isEndofsession() {
    return !hasExtensionValue() && Select.$Endofsession == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isEndofsession}.
   */
  @SuppressWarnings("unchecked")
  public BatchRepConditions.endofsessionType getEndofsession() {
    if (!isEndofsession()) {
      throw new IllegalStateException("BatchRepConditions value not a Endofsession");
    }
    return (BatchRepConditions.endofsessionType) element;
  }

  public void setEndofsession(BatchRepConditions.endofsessionType selected) {
    selection = Select.$Endofsession;
    extension = false;
    element = selected;
  }

  public BatchRepConditions.endofsessionType setEndofsessionToNewInstance() {
      BatchRepConditions.endofsessionType element = new BatchRepConditions.endofsessionType();
      setEndofsession(element);
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
    return "BatchRepConditions = " + elementIndentedString(indent) + indent + ";\n";
  }
}
