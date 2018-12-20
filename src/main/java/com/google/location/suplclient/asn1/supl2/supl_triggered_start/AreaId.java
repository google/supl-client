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

package com.google.location.suplclient.asn1.supl2.supl_triggered_start;

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
public  class AreaId extends Asn1Choice {
  //

  private static final Asn1Tag TAG_AreaId
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
            "AreaId: " + tag + " maps to both " + select0 + " and " + select);
        }
      }
    }
  }

  public AreaId() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_AreaId;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_AreaId != null) {
      return ImmutableList.of(TAG_AreaId);
    } else {
      return tagToSelection.keySet();
    }
  }

  /**
   * Creates a new AreaId from encoded stream.
   */
  public static AreaId fromPerUnaligned(byte[] encodedBytes) {
    AreaId result = new AreaId();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new AreaId from encoded stream.
   */
  public static AreaId fromPerAligned(byte[] encodedBytes) {
    AreaId result = new AreaId();
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
    
    $GSMAreaId(Asn1Tag.fromClassAndNumber(2, 0),
        true) {
      @Override
      public Asn1Object createElement() {
        return new GSMAreaId();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? GSMAreaId.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $WCDMAAreaId(Asn1Tag.fromClassAndNumber(2, 1),
        true) {
      @Override
      public Asn1Object createElement() {
        return new WCDMAAreaId();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? WCDMAAreaId.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $CDMAAreaId(Asn1Tag.fromClassAndNumber(2, 2),
        true) {
      @Override
      public Asn1Object createElement() {
        return new CDMAAreaId();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? CDMAAreaId.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $HRPDAreaId(Asn1Tag.fromClassAndNumber(2, 3),
        true) {
      @Override
      public Asn1Object createElement() {
        return new HRPDAreaId();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? HRPDAreaId.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $UMBAreaId(Asn1Tag.fromClassAndNumber(2, 4),
        true) {
      @Override
      public Asn1Object createElement() {
        return new UMBAreaId();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? UMBAreaId.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $LTEAreaId(Asn1Tag.fromClassAndNumber(2, 5),
        true) {
      @Override
      public Asn1Object createElement() {
        return new LTEAreaId();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? LTEAreaId.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $WLANAreaId(Asn1Tag.fromClassAndNumber(2, 6),
        true) {
      @Override
      public Asn1Object createElement() {
        return new WLANAreaId();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? WLANAreaId.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $WiMAXAreaId(Asn1Tag.fromClassAndNumber(2, 7),
        true) {
      @Override
      public Asn1Object createElement() {
        return new WimaxAreaId();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? WimaxAreaId.getPossibleFirstTags() : ImmutableList.of(tag);
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
  
  

  public boolean isGSMAreaId() {
    return !hasExtensionValue() && Select.$GSMAreaId == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isGSMAreaId}.
   */
  @SuppressWarnings("unchecked")
  public GSMAreaId getGSMAreaId() {
    if (!isGSMAreaId()) {
      throw new IllegalStateException("AreaId value not a GSMAreaId");
    }
    return (GSMAreaId) element;
  }

  public void setGSMAreaId(GSMAreaId selected) {
    selection = Select.$GSMAreaId;
    extension = false;
    element = selected;
  }

  public GSMAreaId setGSMAreaIdToNewInstance() {
      GSMAreaId element = new GSMAreaId();
      setGSMAreaId(element);
      return element;
  }
  
  

  public boolean isWCDMAAreaId() {
    return !hasExtensionValue() && Select.$WCDMAAreaId == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isWCDMAAreaId}.
   */
  @SuppressWarnings("unchecked")
  public WCDMAAreaId getWCDMAAreaId() {
    if (!isWCDMAAreaId()) {
      throw new IllegalStateException("AreaId value not a WCDMAAreaId");
    }
    return (WCDMAAreaId) element;
  }

  public void setWCDMAAreaId(WCDMAAreaId selected) {
    selection = Select.$WCDMAAreaId;
    extension = false;
    element = selected;
  }

  public WCDMAAreaId setWCDMAAreaIdToNewInstance() {
      WCDMAAreaId element = new WCDMAAreaId();
      setWCDMAAreaId(element);
      return element;
  }
  
  

  public boolean isCDMAAreaId() {
    return !hasExtensionValue() && Select.$CDMAAreaId == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isCDMAAreaId}.
   */
  @SuppressWarnings("unchecked")
  public CDMAAreaId getCDMAAreaId() {
    if (!isCDMAAreaId()) {
      throw new IllegalStateException("AreaId value not a CDMAAreaId");
    }
    return (CDMAAreaId) element;
  }

  public void setCDMAAreaId(CDMAAreaId selected) {
    selection = Select.$CDMAAreaId;
    extension = false;
    element = selected;
  }

  public CDMAAreaId setCDMAAreaIdToNewInstance() {
      CDMAAreaId element = new CDMAAreaId();
      setCDMAAreaId(element);
      return element;
  }
  
  

  public boolean isHRPDAreaId() {
    return !hasExtensionValue() && Select.$HRPDAreaId == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isHRPDAreaId}.
   */
  @SuppressWarnings("unchecked")
  public HRPDAreaId getHRPDAreaId() {
    if (!isHRPDAreaId()) {
      throw new IllegalStateException("AreaId value not a HRPDAreaId");
    }
    return (HRPDAreaId) element;
  }

  public void setHRPDAreaId(HRPDAreaId selected) {
    selection = Select.$HRPDAreaId;
    extension = false;
    element = selected;
  }

  public HRPDAreaId setHRPDAreaIdToNewInstance() {
      HRPDAreaId element = new HRPDAreaId();
      setHRPDAreaId(element);
      return element;
  }
  
  

  public boolean isUMBAreaId() {
    return !hasExtensionValue() && Select.$UMBAreaId == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isUMBAreaId}.
   */
  @SuppressWarnings("unchecked")
  public UMBAreaId getUMBAreaId() {
    if (!isUMBAreaId()) {
      throw new IllegalStateException("AreaId value not a UMBAreaId");
    }
    return (UMBAreaId) element;
  }

  public void setUMBAreaId(UMBAreaId selected) {
    selection = Select.$UMBAreaId;
    extension = false;
    element = selected;
  }

  public UMBAreaId setUMBAreaIdToNewInstance() {
      UMBAreaId element = new UMBAreaId();
      setUMBAreaId(element);
      return element;
  }
  
  

  public boolean isLTEAreaId() {
    return !hasExtensionValue() && Select.$LTEAreaId == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isLTEAreaId}.
   */
  @SuppressWarnings("unchecked")
  public LTEAreaId getLTEAreaId() {
    if (!isLTEAreaId()) {
      throw new IllegalStateException("AreaId value not a LTEAreaId");
    }
    return (LTEAreaId) element;
  }

  public void setLTEAreaId(LTEAreaId selected) {
    selection = Select.$LTEAreaId;
    extension = false;
    element = selected;
  }

  public LTEAreaId setLTEAreaIdToNewInstance() {
      LTEAreaId element = new LTEAreaId();
      setLTEAreaId(element);
      return element;
  }
  
  

  public boolean isWLANAreaId() {
    return !hasExtensionValue() && Select.$WLANAreaId == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isWLANAreaId}.
   */
  @SuppressWarnings("unchecked")
  public WLANAreaId getWLANAreaId() {
    if (!isWLANAreaId()) {
      throw new IllegalStateException("AreaId value not a WLANAreaId");
    }
    return (WLANAreaId) element;
  }

  public void setWLANAreaId(WLANAreaId selected) {
    selection = Select.$WLANAreaId;
    extension = false;
    element = selected;
  }

  public WLANAreaId setWLANAreaIdToNewInstance() {
      WLANAreaId element = new WLANAreaId();
      setWLANAreaId(element);
      return element;
  }
  
  

  public boolean isWiMAXAreaId() {
    return !hasExtensionValue() && Select.$WiMAXAreaId == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isWiMAXAreaId}.
   */
  @SuppressWarnings("unchecked")
  public WimaxAreaId getWiMAXAreaId() {
    if (!isWiMAXAreaId()) {
      throw new IllegalStateException("AreaId value not a WiMAXAreaId");
    }
    return (WimaxAreaId) element;
  }

  public void setWiMAXAreaId(WimaxAreaId selected) {
    selection = Select.$WiMAXAreaId;
    extension = false;
    element = selected;
  }

  public WimaxAreaId setWiMAXAreaIdToNewInstance() {
      WimaxAreaId element = new WimaxAreaId();
      setWiMAXAreaId(element);
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
    return "AreaId = " + elementIndentedString(indent) + indent + ";\n";
  }
}
