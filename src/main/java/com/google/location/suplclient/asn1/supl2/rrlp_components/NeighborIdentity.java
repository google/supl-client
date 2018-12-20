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
public  class NeighborIdentity extends Asn1Choice {
  //

  private static final Asn1Tag TAG_NeighborIdentity
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
            "NeighborIdentity: " + tag + " maps to both " + select0 + " and " + select);
        }
      }
    }
  }

  public NeighborIdentity() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_NeighborIdentity;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_NeighborIdentity != null) {
      return ImmutableList.of(TAG_NeighborIdentity);
    } else {
      return tagToSelection.keySet();
    }
  }

  /**
   * Creates a new NeighborIdentity from encoded stream.
   */
  public static NeighborIdentity fromPerUnaligned(byte[] encodedBytes) {
    NeighborIdentity result = new NeighborIdentity();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new NeighborIdentity from encoded stream.
   */
  public static NeighborIdentity fromPerAligned(byte[] encodedBytes) {
    NeighborIdentity result = new NeighborIdentity();
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
    return false;
  }

  @Override public Asn1Object getValue() {
    return element;
  }

  
  private static enum Select implements ChoiceComponent {
    
    $BsicAndCarrier(Asn1Tag.fromClassAndNumber(2, 0),
        true) {
      @Override
      public Asn1Object createElement() {
        return new BSICAndCarrier();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? BSICAndCarrier.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $Ci(Asn1Tag.fromClassAndNumber(2, 1),
        true) {
      @Override
      public Asn1Object createElement() {
        return new CellID();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? CellID.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $MultiFrameCarrier(Asn1Tag.fromClassAndNumber(2, 2),
        true) {
      @Override
      public Asn1Object createElement() {
        return new MultiFrameCarrier();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? MultiFrameCarrier.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $RequestIndex(Asn1Tag.fromClassAndNumber(2, 3),
        true) {
      @Override
      public Asn1Object createElement() {
        return new RequestIndex();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? RequestIndex.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $SystemInfoIndex(Asn1Tag.fromClassAndNumber(2, 4),
        true) {
      @Override
      public Asn1Object createElement() {
        return new SystemInfoIndex();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? SystemInfoIndex.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $CiAndLAC(Asn1Tag.fromClassAndNumber(2, 5),
        true) {
      @Override
      public Asn1Object createElement() {
        return new CellIDAndLAC();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? CellIDAndLAC.getPossibleFirstTags() : ImmutableList.of(tag);
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
  
  

  public boolean isBsicAndCarrier() {
    return !hasExtensionValue() && Select.$BsicAndCarrier == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isBsicAndCarrier}.
   */
  @SuppressWarnings("unchecked")
  public BSICAndCarrier getBsicAndCarrier() {
    if (!isBsicAndCarrier()) {
      throw new IllegalStateException("NeighborIdentity value not a BsicAndCarrier");
    }
    return (BSICAndCarrier) element;
  }

  public void setBsicAndCarrier(BSICAndCarrier selected) {
    selection = Select.$BsicAndCarrier;
    extension = false;
    element = selected;
  }

  public BSICAndCarrier setBsicAndCarrierToNewInstance() {
      BSICAndCarrier element = new BSICAndCarrier();
      setBsicAndCarrier(element);
      return element;
  }
  
  

  public boolean isCi() {
    return !hasExtensionValue() && Select.$Ci == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isCi}.
   */
  @SuppressWarnings("unchecked")
  public CellID getCi() {
    if (!isCi()) {
      throw new IllegalStateException("NeighborIdentity value not a Ci");
    }
    return (CellID) element;
  }

  public void setCi(CellID selected) {
    selection = Select.$Ci;
    extension = false;
    element = selected;
  }

  public CellID setCiToNewInstance() {
      CellID element = new CellID();
      setCi(element);
      return element;
  }
  
  

  public boolean isMultiFrameCarrier() {
    return !hasExtensionValue() && Select.$MultiFrameCarrier == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isMultiFrameCarrier}.
   */
  @SuppressWarnings("unchecked")
  public MultiFrameCarrier getMultiFrameCarrier() {
    if (!isMultiFrameCarrier()) {
      throw new IllegalStateException("NeighborIdentity value not a MultiFrameCarrier");
    }
    return (MultiFrameCarrier) element;
  }

  public void setMultiFrameCarrier(MultiFrameCarrier selected) {
    selection = Select.$MultiFrameCarrier;
    extension = false;
    element = selected;
  }

  public MultiFrameCarrier setMultiFrameCarrierToNewInstance() {
      MultiFrameCarrier element = new MultiFrameCarrier();
      setMultiFrameCarrier(element);
      return element;
  }
  
  

  public boolean isRequestIndex() {
    return !hasExtensionValue() && Select.$RequestIndex == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isRequestIndex}.
   */
  @SuppressWarnings("unchecked")
  public RequestIndex getRequestIndex() {
    if (!isRequestIndex()) {
      throw new IllegalStateException("NeighborIdentity value not a RequestIndex");
    }
    return (RequestIndex) element;
  }

  public void setRequestIndex(RequestIndex selected) {
    selection = Select.$RequestIndex;
    extension = false;
    element = selected;
  }

  public RequestIndex setRequestIndexToNewInstance() {
      RequestIndex element = new RequestIndex();
      setRequestIndex(element);
      return element;
  }
  
  

  public boolean isSystemInfoIndex() {
    return !hasExtensionValue() && Select.$SystemInfoIndex == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isSystemInfoIndex}.
   */
  @SuppressWarnings("unchecked")
  public SystemInfoIndex getSystemInfoIndex() {
    if (!isSystemInfoIndex()) {
      throw new IllegalStateException("NeighborIdentity value not a SystemInfoIndex");
    }
    return (SystemInfoIndex) element;
  }

  public void setSystemInfoIndex(SystemInfoIndex selected) {
    selection = Select.$SystemInfoIndex;
    extension = false;
    element = selected;
  }

  public SystemInfoIndex setSystemInfoIndexToNewInstance() {
      SystemInfoIndex element = new SystemInfoIndex();
      setSystemInfoIndex(element);
      return element;
  }
  
  

  public boolean isCiAndLAC() {
    return !hasExtensionValue() && Select.$CiAndLAC == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isCiAndLAC}.
   */
  @SuppressWarnings("unchecked")
  public CellIDAndLAC getCiAndLAC() {
    if (!isCiAndLAC()) {
      throw new IllegalStateException("NeighborIdentity value not a CiAndLAC");
    }
    return (CellIDAndLAC) element;
  }

  public void setCiAndLAC(CellIDAndLAC selected) {
    selection = Select.$CiAndLAC;
    extension = false;
    element = selected;
  }

  public CellIDAndLAC setCiAndLACToNewInstance() {
      CellIDAndLAC element = new CellIDAndLAC();
      setCiAndLAC(element);
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
    return "NeighborIdentity = " + elementIndentedString(indent) + indent + ";\n";
  }
}
