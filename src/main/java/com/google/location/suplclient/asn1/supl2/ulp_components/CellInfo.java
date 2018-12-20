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

package com.google.location.suplclient.asn1.supl2.ulp_components;

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
import com.google.location.suplclient.asn1.supl2.ver2_ulp_components.Ver2_CellInfo_extension;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;


/**
 * 
 */
public  class CellInfo extends Asn1Choice {
  //

  private static final Asn1Tag TAG_CellInfo
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
            "CellInfo: " + tag + " maps to both " + select0 + " and " + select);
        }
      }
    }
  }

  public CellInfo() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_CellInfo;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_CellInfo != null) {
      return ImmutableList.of(TAG_CellInfo);
    } else {
      return tagToSelection.keySet();
    }
  }

  /**
   * Creates a new CellInfo from encoded stream.
   */
  public static CellInfo fromPerUnaligned(byte[] encodedBytes) {
    CellInfo result = new CellInfo();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new CellInfo from encoded stream.
   */
  public static CellInfo fromPerAligned(byte[] encodedBytes) {
    CellInfo result = new CellInfo();
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
    
    $GsmCell(Asn1Tag.fromClassAndNumber(2, 0),
        true) {
      @Override
      public Asn1Object createElement() {
        return new GsmCellInformation();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? GsmCellInformation.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $WcdmaCell(Asn1Tag.fromClassAndNumber(2, 1),
        true) {
      @Override
      public Asn1Object createElement() {
        return new WcdmaCellInformation();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? WcdmaCellInformation.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $CdmaCell(Asn1Tag.fromClassAndNumber(2, 2),
        true) {
      @Override
      public Asn1Object createElement() {
        return new CdmaCellInformation();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? CdmaCellInformation.getPossibleFirstTags() : ImmutableList.of(tag);
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
  
  

  public boolean isGsmCell() {
    return !hasExtensionValue() && Select.$GsmCell == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isGsmCell}.
   */
  @SuppressWarnings("unchecked")
  public GsmCellInformation getGsmCell() {
    if (!isGsmCell()) {
      throw new IllegalStateException("CellInfo value not a GsmCell");
    }
    return (GsmCellInformation) element;
  }

  public void setGsmCell(GsmCellInformation selected) {
    selection = Select.$GsmCell;
    extension = false;
    element = selected;
  }

  public GsmCellInformation setGsmCellToNewInstance() {
      GsmCellInformation element = new GsmCellInformation();
      setGsmCell(element);
      return element;
  }
  
  

  public boolean isWcdmaCell() {
    return !hasExtensionValue() && Select.$WcdmaCell == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isWcdmaCell}.
   */
  @SuppressWarnings("unchecked")
  public WcdmaCellInformation getWcdmaCell() {
    if (!isWcdmaCell()) {
      throw new IllegalStateException("CellInfo value not a WcdmaCell");
    }
    return (WcdmaCellInformation) element;
  }

  public void setWcdmaCell(WcdmaCellInformation selected) {
    selection = Select.$WcdmaCell;
    extension = false;
    element = selected;
  }

  public WcdmaCellInformation setWcdmaCellToNewInstance() {
      WcdmaCellInformation element = new WcdmaCellInformation();
      setWcdmaCell(element);
      return element;
  }
  
  

  public boolean isCdmaCell() {
    return !hasExtensionValue() && Select.$CdmaCell == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isCdmaCell}.
   */
  @SuppressWarnings("unchecked")
  public CdmaCellInformation getCdmaCell() {
    if (!isCdmaCell()) {
      throw new IllegalStateException("CellInfo value not a CdmaCell");
    }
    return (CdmaCellInformation) element;
  }

  public void setCdmaCell(CdmaCellInformation selected) {
    selection = Select.$CdmaCell;
    extension = false;
    element = selected;
  }

  public CdmaCellInformation setCdmaCellToNewInstance() {
      CdmaCellInformation element = new CdmaCellInformation();
      setCdmaCell(element);
      return element;
  }
  

  private static enum Extend implements ChoiceComponent {
    
    $Ver2_CellInfo_extension(Asn1Tag.fromClassAndNumber(2, 3),
        true) {
      @Override
      public Asn1Object createElement() {
        return new Ver2_CellInfo_extension();
      }

      @Override
      @SuppressWarnings("unchecked")
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + ((Ver2_CellInfo_extension) element).toIndentedString(indent);
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
  
  

  public boolean isExtensionVer2_CellInfo_extension() {
    return hasExtensionValue() && Extend.$Ver2_CellInfo_extension == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isVer2_CellInfo_extension}.
   */
  @SuppressWarnings("unchecked")
  public Ver2_CellInfo_extension getExtensionVer2_CellInfo_extension() {
    if (!isExtensionVer2_CellInfo_extension()) {
      throw new IllegalStateException("CellInfo value not a Ver2_CellInfo_extension");
    }
    return (Ver2_CellInfo_extension) element;
  }

  public void setExtensionVer2_CellInfo_extension(Ver2_CellInfo_extension selected) {
    selection = Extend.$Ver2_CellInfo_extension;
    extension = true;
    element = selected;
  }

  public void setExtensionVer2_CellInfo_extensionToNewInstance() {
      Ver2_CellInfo_extension element = new Ver2_CellInfo_extension();
      setExtensionVer2_CellInfo_extension(element);
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
    return "CellInfo = " + elementIndentedString(indent) + indent + ";\n";
  }
}
