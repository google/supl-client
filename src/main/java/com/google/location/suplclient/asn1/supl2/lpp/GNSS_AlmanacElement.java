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
public  class GNSS_AlmanacElement extends Asn1Choice {
  //

  private static final Asn1Tag TAG_GNSS_AlmanacElement
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
            "GNSS_AlmanacElement: " + tag + " maps to both " + select0 + " and " + select);
        }
      }
    }
  }

  public GNSS_AlmanacElement() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GNSS_AlmanacElement;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GNSS_AlmanacElement != null) {
      return ImmutableList.of(TAG_GNSS_AlmanacElement);
    } else {
      return tagToSelection.keySet();
    }
  }

  /**
   * Creates a new GNSS_AlmanacElement from encoded stream.
   */
  public static GNSS_AlmanacElement fromPerUnaligned(byte[] encodedBytes) {
    GNSS_AlmanacElement result = new GNSS_AlmanacElement();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GNSS_AlmanacElement from encoded stream.
   */
  public static GNSS_AlmanacElement fromPerAligned(byte[] encodedBytes) {
    GNSS_AlmanacElement result = new GNSS_AlmanacElement();
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
        return new AlmanacKeplerianSet();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? AlmanacKeplerianSet.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $KeplerianNAV_Almanac(Asn1Tag.fromClassAndNumber(2, 1),
        true) {
      @Override
      public Asn1Object createElement() {
        return new AlmanacNAV_KeplerianSet();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? AlmanacNAV_KeplerianSet.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $KeplerianReducedAlmanac(Asn1Tag.fromClassAndNumber(2, 2),
        true) {
      @Override
      public Asn1Object createElement() {
        return new AlmanacReducedKeplerianSet();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? AlmanacReducedKeplerianSet.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $KeplerianMidiAlmanac(Asn1Tag.fromClassAndNumber(2, 3),
        true) {
      @Override
      public Asn1Object createElement() {
        return new AlmanacMidiAlmanacSet();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? AlmanacMidiAlmanacSet.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $KeplerianGLONASS(Asn1Tag.fromClassAndNumber(2, 4),
        true) {
      @Override
      public Asn1Object createElement() {
        return new AlmanacGLONASS_AlmanacSet();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? AlmanacGLONASS_AlmanacSet.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $Ecef_SBAS_Almanac(Asn1Tag.fromClassAndNumber(2, 5),
        true) {
      @Override
      public Asn1Object createElement() {
        return new AlmanacECEF_SBAS_AlmanacSet();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? AlmanacECEF_SBAS_AlmanacSet.getPossibleFirstTags() : ImmutableList.of(tag);
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
  public AlmanacKeplerianSet getKeplerianAlmanacSet() {
    if (!isKeplerianAlmanacSet()) {
      throw new IllegalStateException("GNSS_AlmanacElement value not a KeplerianAlmanacSet");
    }
    return (AlmanacKeplerianSet) element;
  }

  public void setKeplerianAlmanacSet(AlmanacKeplerianSet selected) {
    selection = Select.$KeplerianAlmanacSet;
    extension = false;
    element = selected;
  }

  public AlmanacKeplerianSet setKeplerianAlmanacSetToNewInstance() {
      AlmanacKeplerianSet element = new AlmanacKeplerianSet();
      setKeplerianAlmanacSet(element);
      return element;
  }
  
  

  public boolean isKeplerianNAV_Almanac() {
    return !hasExtensionValue() && Select.$KeplerianNAV_Almanac == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isKeplerianNAV_Almanac}.
   */
  @SuppressWarnings("unchecked")
  public AlmanacNAV_KeplerianSet getKeplerianNAV_Almanac() {
    if (!isKeplerianNAV_Almanac()) {
      throw new IllegalStateException("GNSS_AlmanacElement value not a KeplerianNAV_Almanac");
    }
    return (AlmanacNAV_KeplerianSet) element;
  }

  public void setKeplerianNAV_Almanac(AlmanacNAV_KeplerianSet selected) {
    selection = Select.$KeplerianNAV_Almanac;
    extension = false;
    element = selected;
  }

  public AlmanacNAV_KeplerianSet setKeplerianNAV_AlmanacToNewInstance() {
      AlmanacNAV_KeplerianSet element = new AlmanacNAV_KeplerianSet();
      setKeplerianNAV_Almanac(element);
      return element;
  }
  
  

  public boolean isKeplerianReducedAlmanac() {
    return !hasExtensionValue() && Select.$KeplerianReducedAlmanac == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isKeplerianReducedAlmanac}.
   */
  @SuppressWarnings("unchecked")
  public AlmanacReducedKeplerianSet getKeplerianReducedAlmanac() {
    if (!isKeplerianReducedAlmanac()) {
      throw new IllegalStateException("GNSS_AlmanacElement value not a KeplerianReducedAlmanac");
    }
    return (AlmanacReducedKeplerianSet) element;
  }

  public void setKeplerianReducedAlmanac(AlmanacReducedKeplerianSet selected) {
    selection = Select.$KeplerianReducedAlmanac;
    extension = false;
    element = selected;
  }

  public AlmanacReducedKeplerianSet setKeplerianReducedAlmanacToNewInstance() {
      AlmanacReducedKeplerianSet element = new AlmanacReducedKeplerianSet();
      setKeplerianReducedAlmanac(element);
      return element;
  }
  
  

  public boolean isKeplerianMidiAlmanac() {
    return !hasExtensionValue() && Select.$KeplerianMidiAlmanac == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isKeplerianMidiAlmanac}.
   */
  @SuppressWarnings("unchecked")
  public AlmanacMidiAlmanacSet getKeplerianMidiAlmanac() {
    if (!isKeplerianMidiAlmanac()) {
      throw new IllegalStateException("GNSS_AlmanacElement value not a KeplerianMidiAlmanac");
    }
    return (AlmanacMidiAlmanacSet) element;
  }

  public void setKeplerianMidiAlmanac(AlmanacMidiAlmanacSet selected) {
    selection = Select.$KeplerianMidiAlmanac;
    extension = false;
    element = selected;
  }

  public AlmanacMidiAlmanacSet setKeplerianMidiAlmanacToNewInstance() {
      AlmanacMidiAlmanacSet element = new AlmanacMidiAlmanacSet();
      setKeplerianMidiAlmanac(element);
      return element;
  }
  
  

  public boolean isKeplerianGLONASS() {
    return !hasExtensionValue() && Select.$KeplerianGLONASS == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isKeplerianGLONASS}.
   */
  @SuppressWarnings("unchecked")
  public AlmanacGLONASS_AlmanacSet getKeplerianGLONASS() {
    if (!isKeplerianGLONASS()) {
      throw new IllegalStateException("GNSS_AlmanacElement value not a KeplerianGLONASS");
    }
    return (AlmanacGLONASS_AlmanacSet) element;
  }

  public void setKeplerianGLONASS(AlmanacGLONASS_AlmanacSet selected) {
    selection = Select.$KeplerianGLONASS;
    extension = false;
    element = selected;
  }

  public AlmanacGLONASS_AlmanacSet setKeplerianGLONASSToNewInstance() {
      AlmanacGLONASS_AlmanacSet element = new AlmanacGLONASS_AlmanacSet();
      setKeplerianGLONASS(element);
      return element;
  }
  
  

  public boolean isEcef_SBAS_Almanac() {
    return !hasExtensionValue() && Select.$Ecef_SBAS_Almanac == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isEcef_SBAS_Almanac}.
   */
  @SuppressWarnings("unchecked")
  public AlmanacECEF_SBAS_AlmanacSet getEcef_SBAS_Almanac() {
    if (!isEcef_SBAS_Almanac()) {
      throw new IllegalStateException("GNSS_AlmanacElement value not a Ecef_SBAS_Almanac");
    }
    return (AlmanacECEF_SBAS_AlmanacSet) element;
  }

  public void setEcef_SBAS_Almanac(AlmanacECEF_SBAS_AlmanacSet selected) {
    selection = Select.$Ecef_SBAS_Almanac;
    extension = false;
    element = selected;
  }

  public AlmanacECEF_SBAS_AlmanacSet setEcef_SBAS_AlmanacToNewInstance() {
      AlmanacECEF_SBAS_AlmanacSet element = new AlmanacECEF_SBAS_AlmanacSet();
      setEcef_SBAS_Almanac(element);
      return element;
  }
  

  private static enum Extend implements ChoiceComponent {
    
    $KeplerianBDS_Almanac_r12(Asn1Tag.fromClassAndNumber(2, 6),
        true) {
      @Override
      public Asn1Object createElement() {
        return new AlmanacBDS_AlmanacSet_r12();
      }

      @Override
      @SuppressWarnings("unchecked")
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + ((AlmanacBDS_AlmanacSet_r12) element).toIndentedString(indent);
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
  
  

  public boolean isExtensionKeplerianBDS_Almanac_r12() {
    return hasExtensionValue() && Extend.$KeplerianBDS_Almanac_r12 == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isKeplerianBDS_Almanac_r12}.
   */
  @SuppressWarnings("unchecked")
  public AlmanacBDS_AlmanacSet_r12 getExtensionKeplerianBDS_Almanac_r12() {
    if (!isExtensionKeplerianBDS_Almanac_r12()) {
      throw new IllegalStateException("GNSS_AlmanacElement value not a KeplerianBDS_Almanac_r12");
    }
    return (AlmanacBDS_AlmanacSet_r12) element;
  }

  public void setExtensionKeplerianBDS_Almanac_r12(AlmanacBDS_AlmanacSet_r12 selected) {
    selection = Extend.$KeplerianBDS_Almanac_r12;
    extension = true;
    element = selected;
  }

  public void setExtensionKeplerianBDS_Almanac_r12ToNewInstance() {
      AlmanacBDS_AlmanacSet_r12 element = new AlmanacBDS_AlmanacSet_r12();
      setExtensionKeplerianBDS_Almanac_r12(element);
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
    return "GNSS_AlmanacElement = " + elementIndentedString(indent) + indent + ";\n";
  }
}
