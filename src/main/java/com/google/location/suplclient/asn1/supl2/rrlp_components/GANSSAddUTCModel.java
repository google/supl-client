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
public  class GANSSAddUTCModel extends Asn1Choice {
  //

  private static final Asn1Tag TAG_GANSSAddUTCModel
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
            "GANSSAddUTCModel: " + tag + " maps to both " + select0 + " and " + select);
        }
      }
    }
  }

  public GANSSAddUTCModel() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GANSSAddUTCModel;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GANSSAddUTCModel != null) {
      return ImmutableList.of(TAG_GANSSAddUTCModel);
    } else {
      return tagToSelection.keySet();
    }
  }

  /**
   * Creates a new GANSSAddUTCModel from encoded stream.
   */
  public static GANSSAddUTCModel fromPerUnaligned(byte[] encodedBytes) {
    GANSSAddUTCModel result = new GANSSAddUTCModel();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GANSSAddUTCModel from encoded stream.
   */
  public static GANSSAddUTCModel fromPerAligned(byte[] encodedBytes) {
    GANSSAddUTCModel result = new GANSSAddUTCModel();
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
    
    $UtcModel2(Asn1Tag.fromClassAndNumber(2, 0),
        true) {
      @Override
      public Asn1Object createElement() {
        return new UTCmodelSet2();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? UTCmodelSet2.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $UtcModel3(Asn1Tag.fromClassAndNumber(2, 1),
        true) {
      @Override
      public Asn1Object createElement() {
        return new UTCmodelSet3();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? UTCmodelSet3.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $UtcModel4(Asn1Tag.fromClassAndNumber(2, 2),
        true) {
      @Override
      public Asn1Object createElement() {
        return new UTCmodelSet4();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? UTCmodelSet4.getPossibleFirstTags() : ImmutableList.of(tag);
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
  
  

  public boolean isUtcModel2() {
    return !hasExtensionValue() && Select.$UtcModel2 == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isUtcModel2}.
   */
  @SuppressWarnings("unchecked")
  public UTCmodelSet2 getUtcModel2() {
    if (!isUtcModel2()) {
      throw new IllegalStateException("GANSSAddUTCModel value not a UtcModel2");
    }
    return (UTCmodelSet2) element;
  }

  public void setUtcModel2(UTCmodelSet2 selected) {
    selection = Select.$UtcModel2;
    extension = false;
    element = selected;
  }

  public UTCmodelSet2 setUtcModel2ToNewInstance() {
      UTCmodelSet2 element = new UTCmodelSet2();
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
  public UTCmodelSet3 getUtcModel3() {
    if (!isUtcModel3()) {
      throw new IllegalStateException("GANSSAddUTCModel value not a UtcModel3");
    }
    return (UTCmodelSet3) element;
  }

  public void setUtcModel3(UTCmodelSet3 selected) {
    selection = Select.$UtcModel3;
    extension = false;
    element = selected;
  }

  public UTCmodelSet3 setUtcModel3ToNewInstance() {
      UTCmodelSet3 element = new UTCmodelSet3();
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
  public UTCmodelSet4 getUtcModel4() {
    if (!isUtcModel4()) {
      throw new IllegalStateException("GANSSAddUTCModel value not a UtcModel4");
    }
    return (UTCmodelSet4) element;
  }

  public void setUtcModel4(UTCmodelSet4 selected) {
    selection = Select.$UtcModel4;
    extension = false;
    element = selected;
  }

  public UTCmodelSet4 setUtcModel4ToNewInstance() {
      UTCmodelSet4 element = new UTCmodelSet4();
      setUtcModel4(element);
      return element;
  }
  

  private static enum Extend implements ChoiceComponent {
    
    $UtcModel5_r12(Asn1Tag.fromClassAndNumber(2, 3),
        true) {
      @Override
      public Asn1Object createElement() {
        return new UTCmodelSet5_r12();
      }

      @Override
      @SuppressWarnings("unchecked")
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + ((UTCmodelSet5_r12) element).toIndentedString(indent);
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
  public UTCmodelSet5_r12 getExtensionUtcModel5_r12() {
    if (!isExtensionUtcModel5_r12()) {
      throw new IllegalStateException("GANSSAddUTCModel value not a UtcModel5_r12");
    }
    return (UTCmodelSet5_r12) element;
  }

  public void setExtensionUtcModel5_r12(UTCmodelSet5_r12 selected) {
    selection = Extend.$UtcModel5_r12;
    extension = true;
    element = selected;
  }

  public void setExtensionUtcModel5_r12ToNewInstance() {
      UTCmodelSet5_r12 element = new UTCmodelSet5_r12();
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
    return "GANSSAddUTCModel = " + elementIndentedString(indent) + indent + ";\n";
  }
}
