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
public  class GNSS_ClockModel extends Asn1Choice {
  //

  private static final Asn1Tag TAG_GNSS_ClockModel
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
            "GNSS_ClockModel: " + tag + " maps to both " + select0 + " and " + select);
        }
      }
    }
  }

  public GNSS_ClockModel() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GNSS_ClockModel;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GNSS_ClockModel != null) {
      return ImmutableList.of(TAG_GNSS_ClockModel);
    } else {
      return tagToSelection.keySet();
    }
  }

  /**
   * Creates a new GNSS_ClockModel from encoded stream.
   */
  public static GNSS_ClockModel fromPerUnaligned(byte[] encodedBytes) {
    GNSS_ClockModel result = new GNSS_ClockModel();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GNSS_ClockModel from encoded stream.
   */
  public static GNSS_ClockModel fromPerAligned(byte[] encodedBytes) {
    GNSS_ClockModel result = new GNSS_ClockModel();
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
        return new StandardClockModelList();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? StandardClockModelList.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $Nav_ClockModel(Asn1Tag.fromClassAndNumber(2, 1),
        true) {
      @Override
      public Asn1Object createElement() {
        return new NAV_ClockModel();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? NAV_ClockModel.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $Cnav_ClockModel(Asn1Tag.fromClassAndNumber(2, 2),
        true) {
      @Override
      public Asn1Object createElement() {
        return new CNAV_ClockModel();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? CNAV_ClockModel.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $Glonass_ClockModel(Asn1Tag.fromClassAndNumber(2, 3),
        true) {
      @Override
      public Asn1Object createElement() {
        return new GLONASS_ClockModel();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? GLONASS_ClockModel.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $Sbas_ClockModel(Asn1Tag.fromClassAndNumber(2, 4),
        true) {
      @Override
      public Asn1Object createElement() {
        return new SBAS_ClockModel();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? SBAS_ClockModel.getPossibleFirstTags() : ImmutableList.of(tag);
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
  public StandardClockModelList getStandardClockModelList() {
    if (!isStandardClockModelList()) {
      throw new IllegalStateException("GNSS_ClockModel value not a StandardClockModelList");
    }
    return (StandardClockModelList) element;
  }

  public void setStandardClockModelList(StandardClockModelList selected) {
    selection = Select.$StandardClockModelList;
    extension = false;
    element = selected;
  }

  public StandardClockModelList setStandardClockModelListToNewInstance() {
      StandardClockModelList element = new StandardClockModelList();
      setStandardClockModelList(element);
      return element;
  }
  
  

  public boolean isNav_ClockModel() {
    return !hasExtensionValue() && Select.$Nav_ClockModel == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isNav_ClockModel}.
   */
  @SuppressWarnings("unchecked")
  public NAV_ClockModel getNav_ClockModel() {
    if (!isNav_ClockModel()) {
      throw new IllegalStateException("GNSS_ClockModel value not a Nav_ClockModel");
    }
    return (NAV_ClockModel) element;
  }

  public void setNav_ClockModel(NAV_ClockModel selected) {
    selection = Select.$Nav_ClockModel;
    extension = false;
    element = selected;
  }

  public NAV_ClockModel setNav_ClockModelToNewInstance() {
      NAV_ClockModel element = new NAV_ClockModel();
      setNav_ClockModel(element);
      return element;
  }
  
  

  public boolean isCnav_ClockModel() {
    return !hasExtensionValue() && Select.$Cnav_ClockModel == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isCnav_ClockModel}.
   */
  @SuppressWarnings("unchecked")
  public CNAV_ClockModel getCnav_ClockModel() {
    if (!isCnav_ClockModel()) {
      throw new IllegalStateException("GNSS_ClockModel value not a Cnav_ClockModel");
    }
    return (CNAV_ClockModel) element;
  }

  public void setCnav_ClockModel(CNAV_ClockModel selected) {
    selection = Select.$Cnav_ClockModel;
    extension = false;
    element = selected;
  }

  public CNAV_ClockModel setCnav_ClockModelToNewInstance() {
      CNAV_ClockModel element = new CNAV_ClockModel();
      setCnav_ClockModel(element);
      return element;
  }
  
  

  public boolean isGlonass_ClockModel() {
    return !hasExtensionValue() && Select.$Glonass_ClockModel == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isGlonass_ClockModel}.
   */
  @SuppressWarnings("unchecked")
  public GLONASS_ClockModel getGlonass_ClockModel() {
    if (!isGlonass_ClockModel()) {
      throw new IllegalStateException("GNSS_ClockModel value not a Glonass_ClockModel");
    }
    return (GLONASS_ClockModel) element;
  }

  public void setGlonass_ClockModel(GLONASS_ClockModel selected) {
    selection = Select.$Glonass_ClockModel;
    extension = false;
    element = selected;
  }

  public GLONASS_ClockModel setGlonass_ClockModelToNewInstance() {
      GLONASS_ClockModel element = new GLONASS_ClockModel();
      setGlonass_ClockModel(element);
      return element;
  }
  
  

  public boolean isSbas_ClockModel() {
    return !hasExtensionValue() && Select.$Sbas_ClockModel == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isSbas_ClockModel}.
   */
  @SuppressWarnings("unchecked")
  public SBAS_ClockModel getSbas_ClockModel() {
    if (!isSbas_ClockModel()) {
      throw new IllegalStateException("GNSS_ClockModel value not a Sbas_ClockModel");
    }
    return (SBAS_ClockModel) element;
  }

  public void setSbas_ClockModel(SBAS_ClockModel selected) {
    selection = Select.$Sbas_ClockModel;
    extension = false;
    element = selected;
  }

  public SBAS_ClockModel setSbas_ClockModelToNewInstance() {
      SBAS_ClockModel element = new SBAS_ClockModel();
      setSbas_ClockModel(element);
      return element;
  }
  

  private static enum Extend implements ChoiceComponent {
    
    $Bds_ClockModel_r12(Asn1Tag.fromClassAndNumber(2, 5),
        true) {
      @Override
      public Asn1Object createElement() {
        return new BDS_ClockModel_r12();
      }

      @Override
      @SuppressWarnings("unchecked")
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + ((BDS_ClockModel_r12) element).toIndentedString(indent);
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
  
  

  public boolean isExtensionBds_ClockModel_r12() {
    return hasExtensionValue() && Extend.$Bds_ClockModel_r12 == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isBds_ClockModel_r12}.
   */
  @SuppressWarnings("unchecked")
  public BDS_ClockModel_r12 getExtensionBds_ClockModel_r12() {
    if (!isExtensionBds_ClockModel_r12()) {
      throw new IllegalStateException("GNSS_ClockModel value not a Bds_ClockModel_r12");
    }
    return (BDS_ClockModel_r12) element;
  }

  public void setExtensionBds_ClockModel_r12(BDS_ClockModel_r12 selected) {
    selection = Extend.$Bds_ClockModel_r12;
    extension = true;
    element = selected;
  }

  public void setExtensionBds_ClockModel_r12ToNewInstance() {
      BDS_ClockModel_r12 element = new BDS_ClockModel_r12();
      setExtensionBds_ClockModel_r12(element);
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
    return "GNSS_ClockModel = " + elementIndentedString(indent) + indent + ";\n";
  }
}
