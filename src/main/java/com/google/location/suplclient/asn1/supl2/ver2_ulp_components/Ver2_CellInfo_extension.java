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

package com.google.location.suplclient.asn1.supl2.ver2_ulp_components;

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
public  class Ver2_CellInfo_extension extends Asn1Choice {
  //

  private static final Asn1Tag TAG_Ver2_CellInfo_extension
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
            "Ver2_CellInfo_extension: " + tag + " maps to both " + select0 + " and " + select);
        }
      }
    }
  }

  public Ver2_CellInfo_extension() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_Ver2_CellInfo_extension;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_Ver2_CellInfo_extension != null) {
      return ImmutableList.of(TAG_Ver2_CellInfo_extension);
    } else {
      return tagToSelection.keySet();
    }
  }

  /**
   * Creates a new Ver2_CellInfo_extension from encoded stream.
   */
  public static Ver2_CellInfo_extension fromPerUnaligned(byte[] encodedBytes) {
    Ver2_CellInfo_extension result = new Ver2_CellInfo_extension();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new Ver2_CellInfo_extension from encoded stream.
   */
  public static Ver2_CellInfo_extension fromPerAligned(byte[] encodedBytes) {
    Ver2_CellInfo_extension result = new Ver2_CellInfo_extension();
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
    
    $HrpdCell(Asn1Tag.fromClassAndNumber(2, 0),
        true) {
      @Override
      public Asn1Object createElement() {
        return new HrpdCellInformation();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? HrpdCellInformation.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $UmbCell(Asn1Tag.fromClassAndNumber(2, 1),
        true) {
      @Override
      public Asn1Object createElement() {
        return new UmbCellInformation();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? UmbCellInformation.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $LteCell(Asn1Tag.fromClassAndNumber(2, 2),
        true) {
      @Override
      public Asn1Object createElement() {
        return new LteCellInformation();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? LteCellInformation.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $WlanAP(Asn1Tag.fromClassAndNumber(2, 3),
        true) {
      @Override
      public Asn1Object createElement() {
        return new WlanAPInformation();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? WlanAPInformation.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $WimaxBS(Asn1Tag.fromClassAndNumber(2, 4),
        true) {
      @Override
      public Asn1Object createElement() {
        return new WimaxBSInformation();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? WimaxBSInformation.getPossibleFirstTags() : ImmutableList.of(tag);
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
  
  

  public boolean isHrpdCell() {
    return !hasExtensionValue() && Select.$HrpdCell == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isHrpdCell}.
   */
  @SuppressWarnings("unchecked")
  public HrpdCellInformation getHrpdCell() {
    if (!isHrpdCell()) {
      throw new IllegalStateException("Ver2_CellInfo_extension value not a HrpdCell");
    }
    return (HrpdCellInformation) element;
  }

  public void setHrpdCell(HrpdCellInformation selected) {
    selection = Select.$HrpdCell;
    extension = false;
    element = selected;
  }

  public HrpdCellInformation setHrpdCellToNewInstance() {
      HrpdCellInformation element = new HrpdCellInformation();
      setHrpdCell(element);
      return element;
  }
  
  

  public boolean isUmbCell() {
    return !hasExtensionValue() && Select.$UmbCell == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isUmbCell}.
   */
  @SuppressWarnings("unchecked")
  public UmbCellInformation getUmbCell() {
    if (!isUmbCell()) {
      throw new IllegalStateException("Ver2_CellInfo_extension value not a UmbCell");
    }
    return (UmbCellInformation) element;
  }

  public void setUmbCell(UmbCellInformation selected) {
    selection = Select.$UmbCell;
    extension = false;
    element = selected;
  }

  public UmbCellInformation setUmbCellToNewInstance() {
      UmbCellInformation element = new UmbCellInformation();
      setUmbCell(element);
      return element;
  }
  
  

  public boolean isLteCell() {
    return !hasExtensionValue() && Select.$LteCell == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isLteCell}.
   */
  @SuppressWarnings("unchecked")
  public LteCellInformation getLteCell() {
    if (!isLteCell()) {
      throw new IllegalStateException("Ver2_CellInfo_extension value not a LteCell");
    }
    return (LteCellInformation) element;
  }

  public void setLteCell(LteCellInformation selected) {
    selection = Select.$LteCell;
    extension = false;
    element = selected;
  }

  public LteCellInformation setLteCellToNewInstance() {
      LteCellInformation element = new LteCellInformation();
      setLteCell(element);
      return element;
  }
  
  

  public boolean isWlanAP() {
    return !hasExtensionValue() && Select.$WlanAP == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isWlanAP}.
   */
  @SuppressWarnings("unchecked")
  public WlanAPInformation getWlanAP() {
    if (!isWlanAP()) {
      throw new IllegalStateException("Ver2_CellInfo_extension value not a WlanAP");
    }
    return (WlanAPInformation) element;
  }

  public void setWlanAP(WlanAPInformation selected) {
    selection = Select.$WlanAP;
    extension = false;
    element = selected;
  }

  public WlanAPInformation setWlanAPToNewInstance() {
      WlanAPInformation element = new WlanAPInformation();
      setWlanAP(element);
      return element;
  }
  
  

  public boolean isWimaxBS() {
    return !hasExtensionValue() && Select.$WimaxBS == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isWimaxBS}.
   */
  @SuppressWarnings("unchecked")
  public WimaxBSInformation getWimaxBS() {
    if (!isWimaxBS()) {
      throw new IllegalStateException("Ver2_CellInfo_extension value not a WimaxBS");
    }
    return (WimaxBSInformation) element;
  }

  public void setWimaxBS(WimaxBSInformation selected) {
    selection = Select.$WimaxBS;
    extension = false;
    element = selected;
  }

  public WimaxBSInformation setWimaxBSToNewInstance() {
      WimaxBSInformation element = new WimaxBSInformation();
      setWimaxBS(element);
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
    return "Ver2_CellInfo_extension = " + elementIndentedString(indent) + indent + ";\n";
  }
}
