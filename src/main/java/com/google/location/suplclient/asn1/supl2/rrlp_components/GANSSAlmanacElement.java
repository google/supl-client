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
public  class GANSSAlmanacElement extends Asn1Choice {
  //

  private static final Asn1Tag TAG_GANSSAlmanacElement
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
            "GANSSAlmanacElement: " + tag + " maps to both " + select0 + " and " + select);
        }
      }
    }
  }

  public GANSSAlmanacElement() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GANSSAlmanacElement;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GANSSAlmanacElement != null) {
      return ImmutableList.of(TAG_GANSSAlmanacElement);
    } else {
      return tagToSelection.keySet();
    }
  }

  /**
   * Creates a new GANSSAlmanacElement from encoded stream.
   */
  public static GANSSAlmanacElement fromPerUnaligned(byte[] encodedBytes) {
    GANSSAlmanacElement result = new GANSSAlmanacElement();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GANSSAlmanacElement from encoded stream.
   */
  public static GANSSAlmanacElement fromPerAligned(byte[] encodedBytes) {
    GANSSAlmanacElement result = new GANSSAlmanacElement();
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
    
    $KeplerianAlmanacSet(Asn1Tag.fromClassAndNumber(2, 0),
        true) {
      @Override
      public Asn1Object createElement() {
        return new Almanac_KeplerianSet();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? Almanac_KeplerianSet.getPossibleFirstTags() : ImmutableList.of(tag);
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
  
  

  public boolean isKeplerianAlmanacSet() {
    return !hasExtensionValue() && Select.$KeplerianAlmanacSet == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isKeplerianAlmanacSet}.
   */
  @SuppressWarnings("unchecked")
  public Almanac_KeplerianSet getKeplerianAlmanacSet() {
    if (!isKeplerianAlmanacSet()) {
      throw new IllegalStateException("GANSSAlmanacElement value not a KeplerianAlmanacSet");
    }
    return (Almanac_KeplerianSet) element;
  }

  public void setKeplerianAlmanacSet(Almanac_KeplerianSet selected) {
    selection = Select.$KeplerianAlmanacSet;
    extension = false;
    element = selected;
  }

  public Almanac_KeplerianSet setKeplerianAlmanacSetToNewInstance() {
      Almanac_KeplerianSet element = new Almanac_KeplerianSet();
      setKeplerianAlmanacSet(element);
      return element;
  }
  

  private static enum Extend implements ChoiceComponent {
    
    $KeplerianNAVAlmanac(Asn1Tag.fromClassAndNumber(2, 1),
        true) {
      @Override
      public Asn1Object createElement() {
        return new Almanac_NAVKeplerianSet();
      }

      @Override
      @SuppressWarnings("unchecked")
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + ((Almanac_NAVKeplerianSet) element).toIndentedString(indent);
      }
    },
    
    $KeplerianReducedAlmanac(Asn1Tag.fromClassAndNumber(2, 2),
        true) {
      @Override
      public Asn1Object createElement() {
        return new Almanac_ReducedKeplerianSet();
      }

      @Override
      @SuppressWarnings("unchecked")
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + ((Almanac_ReducedKeplerianSet) element).toIndentedString(indent);
      }
    },
    
    $KeplerianMidiAlmanac(Asn1Tag.fromClassAndNumber(2, 3),
        true) {
      @Override
      public Asn1Object createElement() {
        return new Almanac_MidiAlmanacSet();
      }

      @Override
      @SuppressWarnings("unchecked")
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + ((Almanac_MidiAlmanacSet) element).toIndentedString(indent);
      }
    },
    
    $KeplerianGLONASS(Asn1Tag.fromClassAndNumber(2, 4),
        true) {
      @Override
      public Asn1Object createElement() {
        return new Almanac_GlonassAlmanacSet();
      }

      @Override
      @SuppressWarnings("unchecked")
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + ((Almanac_GlonassAlmanacSet) element).toIndentedString(indent);
      }
    },
    
    $EcefSBASAlmanac(Asn1Tag.fromClassAndNumber(2, 5),
        true) {
      @Override
      public Asn1Object createElement() {
        return new Almanac_ECEFsbasAlmanacSet();
      }

      @Override
      @SuppressWarnings("unchecked")
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + ((Almanac_ECEFsbasAlmanacSet) element).toIndentedString(indent);
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
  
  

  public boolean isExtensionKeplerianNAVAlmanac() {
    return hasExtensionValue() && Extend.$KeplerianNAVAlmanac == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isKeplerianNAVAlmanac}.
   */
  @SuppressWarnings("unchecked")
  public Almanac_NAVKeplerianSet getExtensionKeplerianNAVAlmanac() {
    if (!isExtensionKeplerianNAVAlmanac()) {
      throw new IllegalStateException("GANSSAlmanacElement value not a KeplerianNAVAlmanac");
    }
    return (Almanac_NAVKeplerianSet) element;
  }

  public void setExtensionKeplerianNAVAlmanac(Almanac_NAVKeplerianSet selected) {
    selection = Extend.$KeplerianNAVAlmanac;
    extension = true;
    element = selected;
  }

  public void setExtensionKeplerianNAVAlmanacToNewInstance() {
      Almanac_NAVKeplerianSet element = new Almanac_NAVKeplerianSet();
      setExtensionKeplerianNAVAlmanac(element);
  }
  
  

  public boolean isExtensionKeplerianReducedAlmanac() {
    return hasExtensionValue() && Extend.$KeplerianReducedAlmanac == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isKeplerianReducedAlmanac}.
   */
  @SuppressWarnings("unchecked")
  public Almanac_ReducedKeplerianSet getExtensionKeplerianReducedAlmanac() {
    if (!isExtensionKeplerianReducedAlmanac()) {
      throw new IllegalStateException("GANSSAlmanacElement value not a KeplerianReducedAlmanac");
    }
    return (Almanac_ReducedKeplerianSet) element;
  }

  public void setExtensionKeplerianReducedAlmanac(Almanac_ReducedKeplerianSet selected) {
    selection = Extend.$KeplerianReducedAlmanac;
    extension = true;
    element = selected;
  }

  public void setExtensionKeplerianReducedAlmanacToNewInstance() {
      Almanac_ReducedKeplerianSet element = new Almanac_ReducedKeplerianSet();
      setExtensionKeplerianReducedAlmanac(element);
  }
  
  

  public boolean isExtensionKeplerianMidiAlmanac() {
    return hasExtensionValue() && Extend.$KeplerianMidiAlmanac == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isKeplerianMidiAlmanac}.
   */
  @SuppressWarnings("unchecked")
  public Almanac_MidiAlmanacSet getExtensionKeplerianMidiAlmanac() {
    if (!isExtensionKeplerianMidiAlmanac()) {
      throw new IllegalStateException("GANSSAlmanacElement value not a KeplerianMidiAlmanac");
    }
    return (Almanac_MidiAlmanacSet) element;
  }

  public void setExtensionKeplerianMidiAlmanac(Almanac_MidiAlmanacSet selected) {
    selection = Extend.$KeplerianMidiAlmanac;
    extension = true;
    element = selected;
  }

  public void setExtensionKeplerianMidiAlmanacToNewInstance() {
      Almanac_MidiAlmanacSet element = new Almanac_MidiAlmanacSet();
      setExtensionKeplerianMidiAlmanac(element);
  }
  
  

  public boolean isExtensionKeplerianGLONASS() {
    return hasExtensionValue() && Extend.$KeplerianGLONASS == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isKeplerianGLONASS}.
   */
  @SuppressWarnings("unchecked")
  public Almanac_GlonassAlmanacSet getExtensionKeplerianGLONASS() {
    if (!isExtensionKeplerianGLONASS()) {
      throw new IllegalStateException("GANSSAlmanacElement value not a KeplerianGLONASS");
    }
    return (Almanac_GlonassAlmanacSet) element;
  }

  public void setExtensionKeplerianGLONASS(Almanac_GlonassAlmanacSet selected) {
    selection = Extend.$KeplerianGLONASS;
    extension = true;
    element = selected;
  }

  public void setExtensionKeplerianGLONASSToNewInstance() {
      Almanac_GlonassAlmanacSet element = new Almanac_GlonassAlmanacSet();
      setExtensionKeplerianGLONASS(element);
  }
  
  

  public boolean isExtensionEcefSBASAlmanac() {
    return hasExtensionValue() && Extend.$EcefSBASAlmanac == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isEcefSBASAlmanac}.
   */
  @SuppressWarnings("unchecked")
  public Almanac_ECEFsbasAlmanacSet getExtensionEcefSBASAlmanac() {
    if (!isExtensionEcefSBASAlmanac()) {
      throw new IllegalStateException("GANSSAlmanacElement value not a EcefSBASAlmanac");
    }
    return (Almanac_ECEFsbasAlmanacSet) element;
  }

  public void setExtensionEcefSBASAlmanac(Almanac_ECEFsbasAlmanacSet selected) {
    selection = Extend.$EcefSBASAlmanac;
    extension = true;
    element = selected;
  }

  public void setExtensionEcefSBASAlmanacToNewInstance() {
      Almanac_ECEFsbasAlmanacSet element = new Almanac_ECEFsbasAlmanacSet();
      setExtensionEcefSBASAlmanac(element);
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
    return "GANSSAlmanacElement = " + elementIndentedString(indent) + indent + ";\n";
  }
}
