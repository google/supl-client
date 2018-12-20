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
public  class GANSSAuxiliaryInformation extends Asn1Choice {
  //

  private static final Asn1Tag TAG_GANSSAuxiliaryInformation
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
            "GANSSAuxiliaryInformation: " + tag + " maps to both " + select0 + " and " + select);
        }
      }
    }
  }

  public GANSSAuxiliaryInformation() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GANSSAuxiliaryInformation;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GANSSAuxiliaryInformation != null) {
      return ImmutableList.of(TAG_GANSSAuxiliaryInformation);
    } else {
      return tagToSelection.keySet();
    }
  }

  /**
   * Creates a new GANSSAuxiliaryInformation from encoded stream.
   */
  public static GANSSAuxiliaryInformation fromPerUnaligned(byte[] encodedBytes) {
    GANSSAuxiliaryInformation result = new GANSSAuxiliaryInformation();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GANSSAuxiliaryInformation from encoded stream.
   */
  public static GANSSAuxiliaryInformation fromPerAligned(byte[] encodedBytes) {
    GANSSAuxiliaryInformation result = new GANSSAuxiliaryInformation();
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
    
    $GanssID1(Asn1Tag.fromClassAndNumber(2, 0),
        true) {
      @Override
      public Asn1Object createElement() {
        return new GANSS_ID1();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? GANSS_ID1.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $GanssID3(Asn1Tag.fromClassAndNumber(2, 1),
        true) {
      @Override
      public Asn1Object createElement() {
        return new GANSS_ID3();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? GANSS_ID3.getPossibleFirstTags() : ImmutableList.of(tag);
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
  
  

  public boolean isGanssID1() {
    return !hasExtensionValue() && Select.$GanssID1 == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isGanssID1}.
   */
  @SuppressWarnings("unchecked")
  public GANSS_ID1 getGanssID1() {
    if (!isGanssID1()) {
      throw new IllegalStateException("GANSSAuxiliaryInformation value not a GanssID1");
    }
    return (GANSS_ID1) element;
  }

  public void setGanssID1(GANSS_ID1 selected) {
    selection = Select.$GanssID1;
    extension = false;
    element = selected;
  }

  public GANSS_ID1 setGanssID1ToNewInstance() {
      GANSS_ID1 element = new GANSS_ID1();
      setGanssID1(element);
      return element;
  }
  
  

  public boolean isGanssID3() {
    return !hasExtensionValue() && Select.$GanssID3 == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isGanssID3}.
   */
  @SuppressWarnings("unchecked")
  public GANSS_ID3 getGanssID3() {
    if (!isGanssID3()) {
      throw new IllegalStateException("GANSSAuxiliaryInformation value not a GanssID3");
    }
    return (GANSS_ID3) element;
  }

  public void setGanssID3(GANSS_ID3 selected) {
    selection = Select.$GanssID3;
    extension = false;
    element = selected;
  }

  public GANSS_ID3 setGanssID3ToNewInstance() {
      GANSS_ID3 element = new GANSS_ID3();
      setGanssID3(element);
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
    return "GANSSAuxiliaryInformation = " + elementIndentedString(indent) + indent + ";\n";
  }
}
