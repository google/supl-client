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
public  class GANSSClockModel extends Asn1Choice {
  //

  private static final Asn1Tag TAG_GANSSClockModel
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
            "GANSSClockModel: " + tag + " maps to both " + select0 + " and " + select);
        }
      }
    }
  }

  public GANSSClockModel() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GANSSClockModel;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GANSSClockModel != null) {
      return ImmutableList.of(TAG_GANSSClockModel);
    } else {
      return tagToSelection.keySet();
    }
  }

  /**
   * Creates a new GANSSClockModel from encoded stream.
   */
  public static GANSSClockModel fromPerUnaligned(byte[] encodedBytes) {
    GANSSClockModel result = new GANSSClockModel();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GANSSClockModel from encoded stream.
   */
  public static GANSSClockModel fromPerAligned(byte[] encodedBytes) {
    GANSSClockModel result = new GANSSClockModel();
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
    
    $StandardClockModelList(Asn1Tag.fromClassAndNumber(2, 0),
        true) {
      @Override
      public Asn1Object createElement() {
        return new SeqOfStandardClockModelElement();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? SeqOfStandardClockModelElement.getPossibleFirstTags() : ImmutableList.of(tag);
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
  
  

  public boolean isStandardClockModelList() {
    return !hasExtensionValue() && Select.$StandardClockModelList == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isStandardClockModelList}.
   */
  @SuppressWarnings("unchecked")
  public SeqOfStandardClockModelElement getStandardClockModelList() {
    if (!isStandardClockModelList()) {
      throw new IllegalStateException("GANSSClockModel value not a StandardClockModelList");
    }
    return (SeqOfStandardClockModelElement) element;
  }

  public void setStandardClockModelList(SeqOfStandardClockModelElement selected) {
    selection = Select.$StandardClockModelList;
    extension = false;
    element = selected;
  }

  public SeqOfStandardClockModelElement setStandardClockModelListToNewInstance() {
      SeqOfStandardClockModelElement element = new SeqOfStandardClockModelElement();
      setStandardClockModelList(element);
      return element;
  }
  

  private static enum Extend implements ChoiceComponent {
    
    $NavClockModel(Asn1Tag.fromClassAndNumber(2, 1),
        true) {
      @Override
      public Asn1Object createElement() {
        return new NAVclockModel();
      }

      @Override
      @SuppressWarnings("unchecked")
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + ((NAVclockModel) element).toIndentedString(indent);
      }
    },
    
    $CnavClockModel(Asn1Tag.fromClassAndNumber(2, 2),
        true) {
      @Override
      public Asn1Object createElement() {
        return new CNAVclockModel();
      }

      @Override
      @SuppressWarnings("unchecked")
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + ((CNAVclockModel) element).toIndentedString(indent);
      }
    },
    
    $GlonassClockModel(Asn1Tag.fromClassAndNumber(2, 3),
        true) {
      @Override
      public Asn1Object createElement() {
        return new GLONASSclockModel();
      }

      @Override
      @SuppressWarnings("unchecked")
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + ((GLONASSclockModel) element).toIndentedString(indent);
      }
    },
    
    $SbasClockModel(Asn1Tag.fromClassAndNumber(2, 4),
        true) {
      @Override
      public Asn1Object createElement() {
        return new SBASclockModel();
      }

      @Override
      @SuppressWarnings("unchecked")
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + ((SBASclockModel) element).toIndentedString(indent);
      }
    },
    
    $BdsClockModel_r12(Asn1Tag.fromClassAndNumber(2, 5),
        true) {
      @Override
      public Asn1Object createElement() {
        return new BDSClockModel_r12();
      }

      @Override
      @SuppressWarnings("unchecked")
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + ((BDSClockModel_r12) element).toIndentedString(indent);
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
  
  

  public boolean isExtensionNavClockModel() {
    return hasExtensionValue() && Extend.$NavClockModel == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isNavClockModel}.
   */
  @SuppressWarnings("unchecked")
  public NAVclockModel getExtensionNavClockModel() {
    if (!isExtensionNavClockModel()) {
      throw new IllegalStateException("GANSSClockModel value not a NavClockModel");
    }
    return (NAVclockModel) element;
  }

  public void setExtensionNavClockModel(NAVclockModel selected) {
    selection = Extend.$NavClockModel;
    extension = true;
    element = selected;
  }

  public void setExtensionNavClockModelToNewInstance() {
      NAVclockModel element = new NAVclockModel();
      setExtensionNavClockModel(element);
  }
  
  

  public boolean isExtensionCnavClockModel() {
    return hasExtensionValue() && Extend.$CnavClockModel == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isCnavClockModel}.
   */
  @SuppressWarnings("unchecked")
  public CNAVclockModel getExtensionCnavClockModel() {
    if (!isExtensionCnavClockModel()) {
      throw new IllegalStateException("GANSSClockModel value not a CnavClockModel");
    }
    return (CNAVclockModel) element;
  }

  public void setExtensionCnavClockModel(CNAVclockModel selected) {
    selection = Extend.$CnavClockModel;
    extension = true;
    element = selected;
  }

  public void setExtensionCnavClockModelToNewInstance() {
      CNAVclockModel element = new CNAVclockModel();
      setExtensionCnavClockModel(element);
  }
  
  

  public boolean isExtensionGlonassClockModel() {
    return hasExtensionValue() && Extend.$GlonassClockModel == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isGlonassClockModel}.
   */
  @SuppressWarnings("unchecked")
  public GLONASSclockModel getExtensionGlonassClockModel() {
    if (!isExtensionGlonassClockModel()) {
      throw new IllegalStateException("GANSSClockModel value not a GlonassClockModel");
    }
    return (GLONASSclockModel) element;
  }

  public void setExtensionGlonassClockModel(GLONASSclockModel selected) {
    selection = Extend.$GlonassClockModel;
    extension = true;
    element = selected;
  }

  public void setExtensionGlonassClockModelToNewInstance() {
      GLONASSclockModel element = new GLONASSclockModel();
      setExtensionGlonassClockModel(element);
  }
  
  

  public boolean isExtensionSbasClockModel() {
    return hasExtensionValue() && Extend.$SbasClockModel == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isSbasClockModel}.
   */
  @SuppressWarnings("unchecked")
  public SBASclockModel getExtensionSbasClockModel() {
    if (!isExtensionSbasClockModel()) {
      throw new IllegalStateException("GANSSClockModel value not a SbasClockModel");
    }
    return (SBASclockModel) element;
  }

  public void setExtensionSbasClockModel(SBASclockModel selected) {
    selection = Extend.$SbasClockModel;
    extension = true;
    element = selected;
  }

  public void setExtensionSbasClockModelToNewInstance() {
      SBASclockModel element = new SBASclockModel();
      setExtensionSbasClockModel(element);
  }
  
  

  public boolean isExtensionBdsClockModel_r12() {
    return hasExtensionValue() && Extend.$BdsClockModel_r12 == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isBdsClockModel_r12}.
   */
  @SuppressWarnings("unchecked")
  public BDSClockModel_r12 getExtensionBdsClockModel_r12() {
    if (!isExtensionBdsClockModel_r12()) {
      throw new IllegalStateException("GANSSClockModel value not a BdsClockModel_r12");
    }
    return (BDSClockModel_r12) element;
  }

  public void setExtensionBdsClockModel_r12(BDSClockModel_r12 selected) {
    selection = Extend.$BdsClockModel_r12;
    extension = true;
    element = selected;
  }

  public void setExtensionBdsClockModel_r12ToNewInstance() {
      BDSClockModel_r12 element = new BDSClockModel_r12();
      setExtensionBdsClockModel_r12(element);
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
    return "GANSSClockModel = " + elementIndentedString(indent) + indent + ";\n";
  }
}
