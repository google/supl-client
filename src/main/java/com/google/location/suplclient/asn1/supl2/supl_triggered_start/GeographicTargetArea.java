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
import com.google.location.suplclient.asn1.supl2.ver2_ulp_components.CircularArea;
import com.google.location.suplclient.asn1.supl2.ver2_ulp_components.EllipticalArea;
import com.google.location.suplclient.asn1.supl2.ver2_ulp_components.PolygonArea;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;


/**
 * 
 */
public  class GeographicTargetArea extends Asn1Choice {
  //

  private static final Asn1Tag TAG_GeographicTargetArea
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
            "GeographicTargetArea: " + tag + " maps to both " + select0 + " and " + select);
        }
      }
    }
  }

  public GeographicTargetArea() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GeographicTargetArea;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GeographicTargetArea != null) {
      return ImmutableList.of(TAG_GeographicTargetArea);
    } else {
      return tagToSelection.keySet();
    }
  }

  /**
   * Creates a new GeographicTargetArea from encoded stream.
   */
  public static GeographicTargetArea fromPerUnaligned(byte[] encodedBytes) {
    GeographicTargetArea result = new GeographicTargetArea();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GeographicTargetArea from encoded stream.
   */
  public static GeographicTargetArea fromPerAligned(byte[] encodedBytes) {
    GeographicTargetArea result = new GeographicTargetArea();
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
    
    $CircularArea(Asn1Tag.fromClassAndNumber(2, 0),
        true) {
      @Override
      public Asn1Object createElement() {
        return new CircularArea();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? CircularArea.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $EllipticalArea(Asn1Tag.fromClassAndNumber(2, 1),
        true) {
      @Override
      public Asn1Object createElement() {
        return new EllipticalArea();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? EllipticalArea.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $PolygonArea(Asn1Tag.fromClassAndNumber(2, 2),
        true) {
      @Override
      public Asn1Object createElement() {
        return new PolygonArea();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? PolygonArea.getPossibleFirstTags() : ImmutableList.of(tag);
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
  
  

  public boolean isCircularArea() {
    return !hasExtensionValue() && Select.$CircularArea == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isCircularArea}.
   */
  @SuppressWarnings("unchecked")
  public CircularArea getCircularArea() {
    if (!isCircularArea()) {
      throw new IllegalStateException("GeographicTargetArea value not a CircularArea");
    }
    return (CircularArea) element;
  }

  public void setCircularArea(CircularArea selected) {
    selection = Select.$CircularArea;
    extension = false;
    element = selected;
  }

  public CircularArea setCircularAreaToNewInstance() {
      CircularArea element = new CircularArea();
      setCircularArea(element);
      return element;
  }
  
  

  public boolean isEllipticalArea() {
    return !hasExtensionValue() && Select.$EllipticalArea == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isEllipticalArea}.
   */
  @SuppressWarnings("unchecked")
  public EllipticalArea getEllipticalArea() {
    if (!isEllipticalArea()) {
      throw new IllegalStateException("GeographicTargetArea value not a EllipticalArea");
    }
    return (EllipticalArea) element;
  }

  public void setEllipticalArea(EllipticalArea selected) {
    selection = Select.$EllipticalArea;
    extension = false;
    element = selected;
  }

  public EllipticalArea setEllipticalAreaToNewInstance() {
      EllipticalArea element = new EllipticalArea();
      setEllipticalArea(element);
      return element;
  }
  
  

  public boolean isPolygonArea() {
    return !hasExtensionValue() && Select.$PolygonArea == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isPolygonArea}.
   */
  @SuppressWarnings("unchecked")
  public PolygonArea getPolygonArea() {
    if (!isPolygonArea()) {
      throw new IllegalStateException("GeographicTargetArea value not a PolygonArea");
    }
    return (PolygonArea) element;
  }

  public void setPolygonArea(PolygonArea selected) {
    selection = Select.$PolygonArea;
    extension = false;
    element = selected;
  }

  public PolygonArea setPolygonAreaToNewInstance() {
      PolygonArea element = new PolygonArea();
      setPolygonArea(element);
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
    return "GeographicTargetArea = " + elementIndentedString(indent) + indent + ";\n";
  }
}
