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
public  class LocationCoordinates extends Asn1Choice {
  //

  private static final Asn1Tag TAG_LocationCoordinates
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
            "LocationCoordinates: " + tag + " maps to both " + select0 + " and " + select);
        }
      }
    }
  }

  public LocationCoordinates() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_LocationCoordinates;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_LocationCoordinates != null) {
      return ImmutableList.of(TAG_LocationCoordinates);
    } else {
      return tagToSelection.keySet();
    }
  }

  /**
   * Creates a new LocationCoordinates from encoded stream.
   */
  public static LocationCoordinates fromPerUnaligned(byte[] encodedBytes) {
    LocationCoordinates result = new LocationCoordinates();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new LocationCoordinates from encoded stream.
   */
  public static LocationCoordinates fromPerAligned(byte[] encodedBytes) {
    LocationCoordinates result = new LocationCoordinates();
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
    
    $EllipsoidPoint(Asn1Tag.fromClassAndNumber(2, 0),
        true) {
      @Override
      public Asn1Object createElement() {
        return new Ellipsoid_Point();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? Ellipsoid_Point.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $EllipsoidPointWithUncertaintyCircle(Asn1Tag.fromClassAndNumber(2, 1),
        true) {
      @Override
      public Asn1Object createElement() {
        return new Ellipsoid_PointWithUncertaintyCircle();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? Ellipsoid_PointWithUncertaintyCircle.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $EllipsoidPointWithUncertaintyEllipse(Asn1Tag.fromClassAndNumber(2, 2),
        true) {
      @Override
      public Asn1Object createElement() {
        return new EllipsoidPointWithUncertaintyEllipse();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? EllipsoidPointWithUncertaintyEllipse.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $Polygon(Asn1Tag.fromClassAndNumber(2, 3),
        true) {
      @Override
      public Asn1Object createElement() {
        return new Polygon();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? Polygon.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $EllipsoidPointWithAltitude(Asn1Tag.fromClassAndNumber(2, 4),
        true) {
      @Override
      public Asn1Object createElement() {
        return new EllipsoidPointWithAltitude();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? EllipsoidPointWithAltitude.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $EllipsoidPointWithAltitudeAndUncertaintyEllipsoid(Asn1Tag.fromClassAndNumber(2, 5),
        true) {
      @Override
      public Asn1Object createElement() {
        return new EllipsoidPointWithAltitudeAndUncertaintyEllipsoid();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? EllipsoidPointWithAltitudeAndUncertaintyEllipsoid.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $EllipsoidArc(Asn1Tag.fromClassAndNumber(2, 6),
        true) {
      @Override
      public Asn1Object createElement() {
        return new EllipsoidArc();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? EllipsoidArc.getPossibleFirstTags() : ImmutableList.of(tag);
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
  
  

  public boolean isEllipsoidPoint() {
    return !hasExtensionValue() && Select.$EllipsoidPoint == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isEllipsoidPoint}.
   */
  @SuppressWarnings("unchecked")
  public Ellipsoid_Point getEllipsoidPoint() {
    if (!isEllipsoidPoint()) {
      throw new IllegalStateException("LocationCoordinates value not a EllipsoidPoint");
    }
    return (Ellipsoid_Point) element;
  }

  public void setEllipsoidPoint(Ellipsoid_Point selected) {
    selection = Select.$EllipsoidPoint;
    extension = false;
    element = selected;
  }

  public Ellipsoid_Point setEllipsoidPointToNewInstance() {
      Ellipsoid_Point element = new Ellipsoid_Point();
      setEllipsoidPoint(element);
      return element;
  }
  
  

  public boolean isEllipsoidPointWithUncertaintyCircle() {
    return !hasExtensionValue() && Select.$EllipsoidPointWithUncertaintyCircle == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isEllipsoidPointWithUncertaintyCircle}.
   */
  @SuppressWarnings("unchecked")
  public Ellipsoid_PointWithUncertaintyCircle getEllipsoidPointWithUncertaintyCircle() {
    if (!isEllipsoidPointWithUncertaintyCircle()) {
      throw new IllegalStateException("LocationCoordinates value not a EllipsoidPointWithUncertaintyCircle");
    }
    return (Ellipsoid_PointWithUncertaintyCircle) element;
  }

  public void setEllipsoidPointWithUncertaintyCircle(Ellipsoid_PointWithUncertaintyCircle selected) {
    selection = Select.$EllipsoidPointWithUncertaintyCircle;
    extension = false;
    element = selected;
  }

  public Ellipsoid_PointWithUncertaintyCircle setEllipsoidPointWithUncertaintyCircleToNewInstance() {
      Ellipsoid_PointWithUncertaintyCircle element = new Ellipsoid_PointWithUncertaintyCircle();
      setEllipsoidPointWithUncertaintyCircle(element);
      return element;
  }
  
  

  public boolean isEllipsoidPointWithUncertaintyEllipse() {
    return !hasExtensionValue() && Select.$EllipsoidPointWithUncertaintyEllipse == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isEllipsoidPointWithUncertaintyEllipse}.
   */
  @SuppressWarnings("unchecked")
  public EllipsoidPointWithUncertaintyEllipse getEllipsoidPointWithUncertaintyEllipse() {
    if (!isEllipsoidPointWithUncertaintyEllipse()) {
      throw new IllegalStateException("LocationCoordinates value not a EllipsoidPointWithUncertaintyEllipse");
    }
    return (EllipsoidPointWithUncertaintyEllipse) element;
  }

  public void setEllipsoidPointWithUncertaintyEllipse(EllipsoidPointWithUncertaintyEllipse selected) {
    selection = Select.$EllipsoidPointWithUncertaintyEllipse;
    extension = false;
    element = selected;
  }

  public EllipsoidPointWithUncertaintyEllipse setEllipsoidPointWithUncertaintyEllipseToNewInstance() {
      EllipsoidPointWithUncertaintyEllipse element = new EllipsoidPointWithUncertaintyEllipse();
      setEllipsoidPointWithUncertaintyEllipse(element);
      return element;
  }
  
  

  public boolean isPolygon() {
    return !hasExtensionValue() && Select.$Polygon == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isPolygon}.
   */
  @SuppressWarnings("unchecked")
  public Polygon getPolygon() {
    if (!isPolygon()) {
      throw new IllegalStateException("LocationCoordinates value not a Polygon");
    }
    return (Polygon) element;
  }

  public void setPolygon(Polygon selected) {
    selection = Select.$Polygon;
    extension = false;
    element = selected;
  }

  public Polygon setPolygonToNewInstance() {
      Polygon element = new Polygon();
      setPolygon(element);
      return element;
  }
  
  

  public boolean isEllipsoidPointWithAltitude() {
    return !hasExtensionValue() && Select.$EllipsoidPointWithAltitude == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isEllipsoidPointWithAltitude}.
   */
  @SuppressWarnings("unchecked")
  public EllipsoidPointWithAltitude getEllipsoidPointWithAltitude() {
    if (!isEllipsoidPointWithAltitude()) {
      throw new IllegalStateException("LocationCoordinates value not a EllipsoidPointWithAltitude");
    }
    return (EllipsoidPointWithAltitude) element;
  }

  public void setEllipsoidPointWithAltitude(EllipsoidPointWithAltitude selected) {
    selection = Select.$EllipsoidPointWithAltitude;
    extension = false;
    element = selected;
  }

  public EllipsoidPointWithAltitude setEllipsoidPointWithAltitudeToNewInstance() {
      EllipsoidPointWithAltitude element = new EllipsoidPointWithAltitude();
      setEllipsoidPointWithAltitude(element);
      return element;
  }
  
  

  public boolean isEllipsoidPointWithAltitudeAndUncertaintyEllipsoid() {
    return !hasExtensionValue() && Select.$EllipsoidPointWithAltitudeAndUncertaintyEllipsoid == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isEllipsoidPointWithAltitudeAndUncertaintyEllipsoid}.
   */
  @SuppressWarnings("unchecked")
  public EllipsoidPointWithAltitudeAndUncertaintyEllipsoid getEllipsoidPointWithAltitudeAndUncertaintyEllipsoid() {
    if (!isEllipsoidPointWithAltitudeAndUncertaintyEllipsoid()) {
      throw new IllegalStateException("LocationCoordinates value not a EllipsoidPointWithAltitudeAndUncertaintyEllipsoid");
    }
    return (EllipsoidPointWithAltitudeAndUncertaintyEllipsoid) element;
  }

  public void setEllipsoidPointWithAltitudeAndUncertaintyEllipsoid(EllipsoidPointWithAltitudeAndUncertaintyEllipsoid selected) {
    selection = Select.$EllipsoidPointWithAltitudeAndUncertaintyEllipsoid;
    extension = false;
    element = selected;
  }

  public EllipsoidPointWithAltitudeAndUncertaintyEllipsoid setEllipsoidPointWithAltitudeAndUncertaintyEllipsoidToNewInstance() {
      EllipsoidPointWithAltitudeAndUncertaintyEllipsoid element = new EllipsoidPointWithAltitudeAndUncertaintyEllipsoid();
      setEllipsoidPointWithAltitudeAndUncertaintyEllipsoid(element);
      return element;
  }
  
  

  public boolean isEllipsoidArc() {
    return !hasExtensionValue() && Select.$EllipsoidArc == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isEllipsoidArc}.
   */
  @SuppressWarnings("unchecked")
  public EllipsoidArc getEllipsoidArc() {
    if (!isEllipsoidArc()) {
      throw new IllegalStateException("LocationCoordinates value not a EllipsoidArc");
    }
    return (EllipsoidArc) element;
  }

  public void setEllipsoidArc(EllipsoidArc selected) {
    selection = Select.$EllipsoidArc;
    extension = false;
    element = selected;
  }

  public EllipsoidArc setEllipsoidArcToNewInstance() {
      EllipsoidArc element = new EllipsoidArc();
      setEllipsoidArc(element);
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
    return "LocationCoordinates = " + elementIndentedString(indent) + indent + ";\n";
  }
}
