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
import com.google.location.suplclient.asn1.base.Asn1Choice;
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
public  class GNSS_UTC_Model extends Asn1Choice {
  //

  private static final Asn1Tag TAG_GNSS_UTC_Model
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
            "GNSS_UTC_Model: " + tag + " maps to both " + select0 + " and " + select);
        }
      }
    }
  }

  public GNSS_UTC_Model() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GNSS_UTC_Model;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GNSS_UTC_Model != null) {
      return ImmutableList.of(TAG_GNSS_UTC_Model);
    } else {
      return tagToSelection.keySet();
    }
  }

  /**
   * Creates a new GNSS_UTC_Model from encoded stream.
   */
  public static GNSS_UTC_Model fromPerUnaligned(byte[] encodedBytes) {
    GNSS_UTC_Model result = new GNSS_UTC_Model();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GNSS_UTC_Model from encoded stream.
   */
  public static GNSS_UTC_Model fromPerAligned(byte[] encodedBytes) {
    GNSS_UTC_Model result = new GNSS_UTC_Model();
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
    
    $UtcModel1(Asn1Tag.fromClassAndNumber(2, 0),
        true) {
      @Override
      public Asn1Object createElement() {
        return new UTC_ModelSet1();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? UTC_ModelSet1.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $UtcModel2(Asn1Tag.fromClassAndNumber(2, 1),
        true) {
      @Override
      public Asn1Object createElement() {
        return new UTC_ModelSet2();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? UTC_ModelSet2.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $UtcModel3(Asn1Tag.fromClassAndNumber(2, 2),
        true) {
      @Override
      public Asn1Object createElement() {
        return new UTC_ModelSet3();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? UTC_ModelSet3.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $UtcModel4(Asn1Tag.fromClassAndNumber(2, 3),
        true) {
      @Override
      public Asn1Object createElement() {
        return new UTC_ModelSet4();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? UTC_ModelSet4.getPossibleFirstTags() : ImmutableList.of(tag);
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
  
  

  public boolean isUtcModel1() {
    return !hasExtensionValue() && Select.$UtcModel1 == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isUtcModel1}.
   */
  @SuppressWarnings("unchecked")
  public UTC_ModelSet1 getUtcModel1() {
    if (!isUtcModel1()) {
      throw new IllegalStateException("GNSS_UTC_Model value not a UtcModel1");
    }
    return (UTC_ModelSet1) element;
  }

  public void setUtcModel1(UTC_ModelSet1 selected) {
    selection = Select.$UtcModel1;
    extension = false;
    element = selected;
  }

  public UTC_ModelSet1 setUtcModel1ToNewInstance() {
      UTC_ModelSet1 element = new UTC_ModelSet1();
      setUtcModel1(element);
      return element;
  }
  
  

  public boolean isUtcModel2() {
    return !hasExtensionValue() && Select.$UtcModel2 == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isUtcModel2}.
   */
  @SuppressWarnings("unchecked")
  public UTC_ModelSet2 getUtcModel2() {
    if (!isUtcModel2()) {
      throw new IllegalStateException("GNSS_UTC_Model value not a UtcModel2");
    }
    return (UTC_ModelSet2) element;
  }

  public void setUtcModel2(UTC_ModelSet2 selected) {
    selection = Select.$UtcModel2;
    extension = false;
    element = selected;
  }

  public UTC_ModelSet2 setUtcModel2ToNewInstance() {
      UTC_ModelSet2 element = new UTC_ModelSet2();
      setUtcModel2(element);
      return element;
  }
  
  

  public boolean isUtcModel3() {
    return !hasExtensionValue() && Select.$UtcModel3 == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isUtcModel3}.
   */
  @SuppressWarnings("unchecked")
  public UTC_ModelSet3 getUtcModel3() {
    if (!isUtcModel3()) {
      throw new IllegalStateException("GNSS_UTC_Model value not a UtcModel3");
    }
    return (UTC_ModelSet3) element;
  }

  public void setUtcModel3(UTC_ModelSet3 selected) {
    selection = Select.$UtcModel3;
    extension = false;
    element = selected;
  }

  public UTC_ModelSet3 setUtcModel3ToNewInstance() {
      UTC_ModelSet3 element = new UTC_ModelSet3();
      setUtcModel3(element);
      return element;
  }
  
  

  public boolean isUtcModel4() {
    return !hasExtensionValue() && Select.$UtcModel4 == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isUtcModel4}.
   */
  @SuppressWarnings("unchecked")
  public UTC_ModelSet4 getUtcModel4() {
    if (!isUtcModel4()) {
      throw new IllegalStateException("GNSS_UTC_Model value not a UtcModel4");
    }
    return (UTC_ModelSet4) element;
  }

  public void setUtcModel4(UTC_ModelSet4 selected) {
    selection = Select.$UtcModel4;
    extension = false;
    element = selected;
  }

  public UTC_ModelSet4 setUtcModel4ToNewInstance() {
      UTC_ModelSet4 element = new UTC_ModelSet4();
      setUtcModel4(element);
      return element;
  }
  

  private static enum Extend implements ChoiceComponent {
    
    $UtcModel5_r12(Asn1Tag.fromClassAndNumber(2, 4),
        true) {
      @Override
      public Asn1Object createElement() {
        return new UTC_ModelSet5_r12();
      }

      @Override
      @SuppressWarnings("unchecked")
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + ((UTC_ModelSet5_r12) element).toIndentedString(indent);
      }
    },
    
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
  
  

  public boolean isExtensionUtcModel5_r12() {
    return hasExtensionValue() && Extend.$UtcModel5_r12 == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isUtcModel5_r12}.
   */
  @SuppressWarnings("unchecked")
  public UTC_ModelSet5_r12 getExtensionUtcModel5_r12() {
    if (!isExtensionUtcModel5_r12()) {
      throw new IllegalStateException("GNSS_UTC_Model value not a UtcModel5_r12");
    }
    return (UTC_ModelSet5_r12) element;
  }

  public void setExtensionUtcModel5_r12(UTC_ModelSet5_r12 selected) {
    selection = Extend.$UtcModel5_r12;
    extension = true;
    element = selected;
  }

  public void setExtensionUtcModel5_r12ToNewInstance() {
      UTC_ModelSet5_r12 element = new UTC_ModelSet5_r12();
      setExtensionUtcModel5_r12(element);
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
    return "GNSS_UTC_Model = " + elementIndentedString(indent) + indent + ";\n";
  }
}
