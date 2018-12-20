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
public  class GNSS_OrbitModel extends Asn1Choice {
  //

  private static final Asn1Tag TAG_GNSS_OrbitModel
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
            "GNSS_OrbitModel: " + tag + " maps to both " + select0 + " and " + select);
        }
      }
    }
  }

  public GNSS_OrbitModel() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GNSS_OrbitModel;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GNSS_OrbitModel != null) {
      return ImmutableList.of(TAG_GNSS_OrbitModel);
    } else {
      return tagToSelection.keySet();
    }
  }

  /**
   * Creates a new GNSS_OrbitModel from encoded stream.
   */
  public static GNSS_OrbitModel fromPerUnaligned(byte[] encodedBytes) {
    GNSS_OrbitModel result = new GNSS_OrbitModel();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GNSS_OrbitModel from encoded stream.
   */
  public static GNSS_OrbitModel fromPerAligned(byte[] encodedBytes) {
    GNSS_OrbitModel result = new GNSS_OrbitModel();
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
        return new NavModelKeplerianSet();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? NavModelKeplerianSet.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $Nav_KeplerianSet(Asn1Tag.fromClassAndNumber(2, 1),
        true) {
      @Override
      public Asn1Object createElement() {
        return new NavModelNAV_KeplerianSet();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? NavModelNAV_KeplerianSet.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $Cnav_KeplerianSet(Asn1Tag.fromClassAndNumber(2, 2),
        true) {
      @Override
      public Asn1Object createElement() {
        return new NavModelCNAV_KeplerianSet();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? NavModelCNAV_KeplerianSet.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $Glonass_ECEF(Asn1Tag.fromClassAndNumber(2, 3),
        true) {
      @Override
      public Asn1Object createElement() {
        return new NavModel_GLONASS_ECEF();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? NavModel_GLONASS_ECEF.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $Sbas_ECEF(Asn1Tag.fromClassAndNumber(2, 4),
        true) {
      @Override
      public Asn1Object createElement() {
        return new NavModel_SBAS_ECEF();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? NavModel_SBAS_ECEF.getPossibleFirstTags() : ImmutableList.of(tag);
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
  public NavModelKeplerianSet getKeplerianSet() {
    if (!isKeplerianSet()) {
      throw new IllegalStateException("GNSS_OrbitModel value not a KeplerianSet");
    }
    return (NavModelKeplerianSet) element;
  }

  public void setKeplerianSet(NavModelKeplerianSet selected) {
    selection = Select.$KeplerianSet;
    extension = false;
    element = selected;
  }

  public NavModelKeplerianSet setKeplerianSetToNewInstance() {
      NavModelKeplerianSet element = new NavModelKeplerianSet();
      setKeplerianSet(element);
      return element;
  }
  
  

  public boolean isNav_KeplerianSet() {
    return !hasExtensionValue() && Select.$Nav_KeplerianSet == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isNav_KeplerianSet}.
   */
  @SuppressWarnings("unchecked")
  public NavModelNAV_KeplerianSet getNav_KeplerianSet() {
    if (!isNav_KeplerianSet()) {
      throw new IllegalStateException("GNSS_OrbitModel value not a Nav_KeplerianSet");
    }
    return (NavModelNAV_KeplerianSet) element;
  }

  public void setNav_KeplerianSet(NavModelNAV_KeplerianSet selected) {
    selection = Select.$Nav_KeplerianSet;
    extension = false;
    element = selected;
  }

  public NavModelNAV_KeplerianSet setNav_KeplerianSetToNewInstance() {
      NavModelNAV_KeplerianSet element = new NavModelNAV_KeplerianSet();
      setNav_KeplerianSet(element);
      return element;
  }
  
  

  public boolean isCnav_KeplerianSet() {
    return !hasExtensionValue() && Select.$Cnav_KeplerianSet == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isCnav_KeplerianSet}.
   */
  @SuppressWarnings("unchecked")
  public NavModelCNAV_KeplerianSet getCnav_KeplerianSet() {
    if (!isCnav_KeplerianSet()) {
      throw new IllegalStateException("GNSS_OrbitModel value not a Cnav_KeplerianSet");
    }
    return (NavModelCNAV_KeplerianSet) element;
  }

  public void setCnav_KeplerianSet(NavModelCNAV_KeplerianSet selected) {
    selection = Select.$Cnav_KeplerianSet;
    extension = false;
    element = selected;
  }

  public NavModelCNAV_KeplerianSet setCnav_KeplerianSetToNewInstance() {
      NavModelCNAV_KeplerianSet element = new NavModelCNAV_KeplerianSet();
      setCnav_KeplerianSet(element);
      return element;
  }
  
  

  public boolean isGlonass_ECEF() {
    return !hasExtensionValue() && Select.$Glonass_ECEF == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isGlonass_ECEF}.
   */
  @SuppressWarnings("unchecked")
  public NavModel_GLONASS_ECEF getGlonass_ECEF() {
    if (!isGlonass_ECEF()) {
      throw new IllegalStateException("GNSS_OrbitModel value not a Glonass_ECEF");
    }
    return (NavModel_GLONASS_ECEF) element;
  }

  public void setGlonass_ECEF(NavModel_GLONASS_ECEF selected) {
    selection = Select.$Glonass_ECEF;
    extension = false;
    element = selected;
  }

  public NavModel_GLONASS_ECEF setGlonass_ECEFToNewInstance() {
      NavModel_GLONASS_ECEF element = new NavModel_GLONASS_ECEF();
      setGlonass_ECEF(element);
      return element;
  }
  
  

  public boolean isSbas_ECEF() {
    return !hasExtensionValue() && Select.$Sbas_ECEF == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isSbas_ECEF}.
   */
  @SuppressWarnings("unchecked")
  public NavModel_SBAS_ECEF getSbas_ECEF() {
    if (!isSbas_ECEF()) {
      throw new IllegalStateException("GNSS_OrbitModel value not a Sbas_ECEF");
    }
    return (NavModel_SBAS_ECEF) element;
  }

  public void setSbas_ECEF(NavModel_SBAS_ECEF selected) {
    selection = Select.$Sbas_ECEF;
    extension = false;
    element = selected;
  }

  public NavModel_SBAS_ECEF setSbas_ECEFToNewInstance() {
      NavModel_SBAS_ECEF element = new NavModel_SBAS_ECEF();
      setSbas_ECEF(element);
      return element;
  }
  

  private static enum Extend implements ChoiceComponent {
    
    $Bds_KeplerianSet_r12(Asn1Tag.fromClassAndNumber(2, 5),
        true) {
      @Override
      public Asn1Object createElement() {
        return new NavModel_BDS_KeplerianSet_r12();
      }

      @Override
      @SuppressWarnings("unchecked")
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + ((NavModel_BDS_KeplerianSet_r12) element).toIndentedString(indent);
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
  
  

  public boolean isExtensionBds_KeplerianSet_r12() {
    return hasExtensionValue() && Extend.$Bds_KeplerianSet_r12 == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isBds_KeplerianSet_r12}.
   */
  @SuppressWarnings("unchecked")
  public NavModel_BDS_KeplerianSet_r12 getExtensionBds_KeplerianSet_r12() {
    if (!isExtensionBds_KeplerianSet_r12()) {
      throw new IllegalStateException("GNSS_OrbitModel value not a Bds_KeplerianSet_r12");
    }
    return (NavModel_BDS_KeplerianSet_r12) element;
  }

  public void setExtensionBds_KeplerianSet_r12(NavModel_BDS_KeplerianSet_r12 selected) {
    selection = Extend.$Bds_KeplerianSet_r12;
    extension = true;
    element = selected;
  }

  public void setExtensionBds_KeplerianSet_r12ToNewInstance() {
      NavModel_BDS_KeplerianSet_r12 element = new NavModel_BDS_KeplerianSet_r12();
      setExtensionBds_KeplerianSet_r12(element);
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
    return "GNSS_OrbitModel = " + elementIndentedString(indent) + indent + ";\n";
  }
}
