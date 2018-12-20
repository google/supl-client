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
import com.google.location.suplclient.asn1.base.Asn1Choice;
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
public  class SystemInfoAssistBTS_R98_ExpOTD extends Asn1Choice {
  //

  private static final Asn1Tag TAG_SystemInfoAssistBTS_R98_ExpOTD
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
            "SystemInfoAssistBTS_R98_ExpOTD: " + tag + " maps to both " + select0 + " and " + select);
        }
      }
    }
  }

  public SystemInfoAssistBTS_R98_ExpOTD() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_SystemInfoAssistBTS_R98_ExpOTD;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_SystemInfoAssistBTS_R98_ExpOTD != null) {
      return ImmutableList.of(TAG_SystemInfoAssistBTS_R98_ExpOTD);
    } else {
      return tagToSelection.keySet();
    }
  }

  /**
   * Creates a new SystemInfoAssistBTS_R98_ExpOTD from encoded stream.
   */
  public static SystemInfoAssistBTS_R98_ExpOTD fromPerUnaligned(byte[] encodedBytes) {
    SystemInfoAssistBTS_R98_ExpOTD result = new SystemInfoAssistBTS_R98_ExpOTD();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new SystemInfoAssistBTS_R98_ExpOTD from encoded stream.
   */
  public static SystemInfoAssistBTS_R98_ExpOTD fromPerAligned(byte[] encodedBytes) {
    SystemInfoAssistBTS_R98_ExpOTD result = new SystemInfoAssistBTS_R98_ExpOTD();
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
    
    $NotPresent(Asn1Tag.fromClassAndNumber(2, 0),
        true) {
      @Override
      public Asn1Object createElement() {
        return new SystemInfoAssistBTS_R98_ExpOTD.notPresentType();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? SystemInfoAssistBTS_R98_ExpOTD.notPresentType.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $Present(Asn1Tag.fromClassAndNumber(2, 1),
        true) {
      @Override
      public Asn1Object createElement() {
        return new AssistBTSData_R98_ExpOTD();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? AssistBTSData_R98_ExpOTD.getPossibleFirstTags() : ImmutableList.of(tag);
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
public static class notPresentType extends Asn1Null {
  //

  private static final Asn1Tag TAG_notPresentType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public notPresentType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_notPresentType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_notPresentType != null) {
      return ImmutableList.of(TAG_notPresentType);
    } else {
      return Asn1Null.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new notPresentType from encoded stream.
   */
  public static notPresentType fromPerUnaligned(byte[] encodedBytes) {
    notPresentType result = new notPresentType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new notPresentType from encoded stream.
   */
  public static notPresentType fromPerAligned(byte[] encodedBytes) {
    notPresentType result = new notPresentType();
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
    return "notPresentType (null value);\n";
  }
}


  public boolean isNotPresent() {
    return !hasExtensionValue() && Select.$NotPresent == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isNotPresent}.
   */
  @SuppressWarnings("unchecked")
  public SystemInfoAssistBTS_R98_ExpOTD.notPresentType getNotPresent() {
    if (!isNotPresent()) {
      throw new IllegalStateException("SystemInfoAssistBTS_R98_ExpOTD value not a NotPresent");
    }
    return (SystemInfoAssistBTS_R98_ExpOTD.notPresentType) element;
  }

  public void setNotPresent(SystemInfoAssistBTS_R98_ExpOTD.notPresentType selected) {
    selection = Select.$NotPresent;
    extension = false;
    element = selected;
  }

  public SystemInfoAssistBTS_R98_ExpOTD.notPresentType setNotPresentToNewInstance() {
      SystemInfoAssistBTS_R98_ExpOTD.notPresentType element = new SystemInfoAssistBTS_R98_ExpOTD.notPresentType();
      setNotPresent(element);
      return element;
  }
  
  

  public boolean isPresent() {
    return !hasExtensionValue() && Select.$Present == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isPresent}.
   */
  @SuppressWarnings("unchecked")
  public AssistBTSData_R98_ExpOTD getPresent() {
    if (!isPresent()) {
      throw new IllegalStateException("SystemInfoAssistBTS_R98_ExpOTD value not a Present");
    }
    return (AssistBTSData_R98_ExpOTD) element;
  }

  public void setPresent(AssistBTSData_R98_ExpOTD selected) {
    selection = Select.$Present;
    extension = false;
    element = selected;
  }

  public AssistBTSData_R98_ExpOTD setPresentToNewInstance() {
      AssistBTSData_R98_ExpOTD element = new AssistBTSData_R98_ExpOTD();
      setPresent(element);
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
    return "SystemInfoAssistBTS_R98_ExpOTD = " + elementIndentedString(indent) + indent + ";\n";
  }
}
