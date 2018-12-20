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
public  class GANSSOrbitModel extends Asn1Choice {
  //

  private static final Asn1Tag TAG_GANSSOrbitModel
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
            "GANSSOrbitModel: " + tag + " maps to both " + select0 + " and " + select);
        }
      }
    }
  }

  public GANSSOrbitModel() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GANSSOrbitModel;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GANSSOrbitModel != null) {
      return ImmutableList.of(TAG_GANSSOrbitModel);
    } else {
      return tagToSelection.keySet();
    }
  }

  /**
   * Creates a new GANSSOrbitModel from encoded stream.
   */
  public static GANSSOrbitModel fromPerUnaligned(byte[] encodedBytes) {
    GANSSOrbitModel result = new GANSSOrbitModel();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GANSSOrbitModel from encoded stream.
   */
  public static GANSSOrbitModel fromPerAligned(byte[] encodedBytes) {
    GANSSOrbitModel result = new GANSSOrbitModel();
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
    
    $KeplerianSet(Asn1Tag.fromClassAndNumber(2, 0),
        true) {
      @Override
      public Asn1Object createElement() {
        return new NavModel_KeplerianSet();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? NavModel_KeplerianSet.getPossibleFirstTags() : ImmutableList.of(tag);
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
  
  

  public boolean isKeplerianSet() {
    return !hasExtensionValue() && Select.$KeplerianSet == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isKeplerianSet}.
   */
  @SuppressWarnings("unchecked")
  public NavModel_KeplerianSet getKeplerianSet() {
    if (!isKeplerianSet()) {
      throw new IllegalStateException("GANSSOrbitModel value not a KeplerianSet");
    }
    return (NavModel_KeplerianSet) element;
  }

  public void setKeplerianSet(NavModel_KeplerianSet selected) {
    selection = Select.$KeplerianSet;
    extension = false;
    element = selected;
  }

  public NavModel_KeplerianSet setKeplerianSetToNewInstance() {
      NavModel_KeplerianSet element = new NavModel_KeplerianSet();
      setKeplerianSet(element);
      return element;
  }
  

  private static enum Extend implements ChoiceComponent {
    
    $NavKeplerianSet(Asn1Tag.fromClassAndNumber(2, 1),
        true) {
      @Override
      public Asn1Object createElement() {
        return new NavModel_NAVKeplerianSet();
      }

      @Override
      @SuppressWarnings("unchecked")
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + ((NavModel_NAVKeplerianSet) element).toIndentedString(indent);
      }
    },
    
    $CnavKeplerianSet(Asn1Tag.fromClassAndNumber(2, 2),
        true) {
      @Override
      public Asn1Object createElement() {
        return new NavModel_CNAVKeplerianSet();
      }

      @Override
      @SuppressWarnings("unchecked")
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + ((NavModel_CNAVKeplerianSet) element).toIndentedString(indent);
      }
    },
    
    $GlonassECEF(Asn1Tag.fromClassAndNumber(2, 3),
        true) {
      @Override
      public Asn1Object createElement() {
        return new NavModel_GLONASSecef();
      }

      @Override
      @SuppressWarnings("unchecked")
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + ((NavModel_GLONASSecef) element).toIndentedString(indent);
      }
    },
    
    $SbasECEF(Asn1Tag.fromClassAndNumber(2, 4),
        true) {
      @Override
      public Asn1Object createElement() {
        return new NavModel_SBASecef();
      }

      @Override
      @SuppressWarnings("unchecked")
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + ((NavModel_SBASecef) element).toIndentedString(indent);
      }
    },
    
    $BdsKeplerianSet_r12(Asn1Tag.fromClassAndNumber(2, 5),
        true) {
      @Override
      public Asn1Object createElement() {
        return new NavModel_BDSKeplerianSet_r12();
      }

      @Override
      @SuppressWarnings("unchecked")
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + ((NavModel_BDSKeplerianSet_r12) element).toIndentedString(indent);
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
  
  

  public boolean isExtensionNavKeplerianSet() {
    return hasExtensionValue() && Extend.$NavKeplerianSet == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isNavKeplerianSet}.
   */
  @SuppressWarnings("unchecked")
  public NavModel_NAVKeplerianSet getExtensionNavKeplerianSet() {
    if (!isExtensionNavKeplerianSet()) {
      throw new IllegalStateException("GANSSOrbitModel value not a NavKeplerianSet");
    }
    return (NavModel_NAVKeplerianSet) element;
  }

  public void setExtensionNavKeplerianSet(NavModel_NAVKeplerianSet selected) {
    selection = Extend.$NavKeplerianSet;
    extension = true;
    element = selected;
  }

  public void setExtensionNavKeplerianSetToNewInstance() {
      NavModel_NAVKeplerianSet element = new NavModel_NAVKeplerianSet();
      setExtensionNavKeplerianSet(element);
  }
  
  

  public boolean isExtensionCnavKeplerianSet() {
    return hasExtensionValue() && Extend.$CnavKeplerianSet == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isCnavKeplerianSet}.
   */
  @SuppressWarnings("unchecked")
  public NavModel_CNAVKeplerianSet getExtensionCnavKeplerianSet() {
    if (!isExtensionCnavKeplerianSet()) {
      throw new IllegalStateException("GANSSOrbitModel value not a CnavKeplerianSet");
    }
    return (NavModel_CNAVKeplerianSet) element;
  }

  public void setExtensionCnavKeplerianSet(NavModel_CNAVKeplerianSet selected) {
    selection = Extend.$CnavKeplerianSet;
    extension = true;
    element = selected;
  }

  public void setExtensionCnavKeplerianSetToNewInstance() {
      NavModel_CNAVKeplerianSet element = new NavModel_CNAVKeplerianSet();
      setExtensionCnavKeplerianSet(element);
  }
  
  

  public boolean isExtensionGlonassECEF() {
    return hasExtensionValue() && Extend.$GlonassECEF == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isGlonassECEF}.
   */
  @SuppressWarnings("unchecked")
  public NavModel_GLONASSecef getExtensionGlonassECEF() {
    if (!isExtensionGlonassECEF()) {
      throw new IllegalStateException("GANSSOrbitModel value not a GlonassECEF");
    }
    return (NavModel_GLONASSecef) element;
  }

  public void setExtensionGlonassECEF(NavModel_GLONASSecef selected) {
    selection = Extend.$GlonassECEF;
    extension = true;
    element = selected;
  }

  public void setExtensionGlonassECEFToNewInstance() {
      NavModel_GLONASSecef element = new NavModel_GLONASSecef();
      setExtensionGlonassECEF(element);
  }
  
  

  public boolean isExtensionSbasECEF() {
    return hasExtensionValue() && Extend.$SbasECEF == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isSbasECEF}.
   */
  @SuppressWarnings("unchecked")
  public NavModel_SBASecef getExtensionSbasECEF() {
    if (!isExtensionSbasECEF()) {
      throw new IllegalStateException("GANSSOrbitModel value not a SbasECEF");
    }
    return (NavModel_SBASecef) element;
  }

  public void setExtensionSbasECEF(NavModel_SBASecef selected) {
    selection = Extend.$SbasECEF;
    extension = true;
    element = selected;
  }

  public void setExtensionSbasECEFToNewInstance() {
      NavModel_SBASecef element = new NavModel_SBASecef();
      setExtensionSbasECEF(element);
  }
  
  

  public boolean isExtensionBdsKeplerianSet_r12() {
    return hasExtensionValue() && Extend.$BdsKeplerianSet_r12 == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isBdsKeplerianSet_r12}.
   */
  @SuppressWarnings("unchecked")
  public NavModel_BDSKeplerianSet_r12 getExtensionBdsKeplerianSet_r12() {
    if (!isExtensionBdsKeplerianSet_r12()) {
      throw new IllegalStateException("GANSSOrbitModel value not a BdsKeplerianSet_r12");
    }
    return (NavModel_BDSKeplerianSet_r12) element;
  }

  public void setExtensionBdsKeplerianSet_r12(NavModel_BDSKeplerianSet_r12 selected) {
    selection = Extend.$BdsKeplerianSet_r12;
    extension = true;
    element = selected;
  }

  public void setExtensionBdsKeplerianSet_r12ToNewInstance() {
      NavModel_BDSKeplerianSet_r12 element = new NavModel_BDSKeplerianSet_r12();
      setExtensionBdsKeplerianSet_r12(element);
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
    return "GANSSOrbitModel = " + elementIndentedString(indent) + indent + ";\n";
  }
}
