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
public  class Velocity extends Asn1Choice {
  //

  private static final Asn1Tag TAG_Velocity
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
            "Velocity: " + tag + " maps to both " + select0 + " and " + select);
        }
      }
    }
  }

  public Velocity() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_Velocity;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_Velocity != null) {
      return ImmutableList.of(TAG_Velocity);
    } else {
      return tagToSelection.keySet();
    }
  }

  /**
   * Creates a new Velocity from encoded stream.
   */
  public static Velocity fromPerUnaligned(byte[] encodedBytes) {
    Velocity result = new Velocity();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new Velocity from encoded stream.
   */
  public static Velocity fromPerAligned(byte[] encodedBytes) {
    Velocity result = new Velocity();
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
    
    $HorizontalVelocity(Asn1Tag.fromClassAndNumber(2, 0),
        true) {
      @Override
      public Asn1Object createElement() {
        return new HorizontalVelocity();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? HorizontalVelocity.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $HorizontalWithVerticalVelocity(Asn1Tag.fromClassAndNumber(2, 1),
        true) {
      @Override
      public Asn1Object createElement() {
        return new HorizontalWithVerticalVelocity();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? HorizontalWithVerticalVelocity.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $HorizontalVelocityWithUncertainty(Asn1Tag.fromClassAndNumber(2, 2),
        true) {
      @Override
      public Asn1Object createElement() {
        return new HorizontalVelocityWithUncertainty();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? HorizontalVelocityWithUncertainty.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $HorizontalWithVerticalVelocityAndUncertainty(Asn1Tag.fromClassAndNumber(2, 3),
        true) {
      @Override
      public Asn1Object createElement() {
        return new HorizontalWithVerticalVelocityAndUncertainty();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? HorizontalWithVerticalVelocityAndUncertainty.getPossibleFirstTags() : ImmutableList.of(tag);
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
  
  

  public boolean isHorizontalVelocity() {
    return !hasExtensionValue() && Select.$HorizontalVelocity == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isHorizontalVelocity}.
   */
  @SuppressWarnings("unchecked")
  public HorizontalVelocity getHorizontalVelocity() {
    if (!isHorizontalVelocity()) {
      throw new IllegalStateException("Velocity value not a HorizontalVelocity");
    }
    return (HorizontalVelocity) element;
  }

  public void setHorizontalVelocity(HorizontalVelocity selected) {
    selection = Select.$HorizontalVelocity;
    extension = false;
    element = selected;
  }

  public HorizontalVelocity setHorizontalVelocityToNewInstance() {
      HorizontalVelocity element = new HorizontalVelocity();
      setHorizontalVelocity(element);
      return element;
  }
  
  

  public boolean isHorizontalWithVerticalVelocity() {
    return !hasExtensionValue() && Select.$HorizontalWithVerticalVelocity == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isHorizontalWithVerticalVelocity}.
   */
  @SuppressWarnings("unchecked")
  public HorizontalWithVerticalVelocity getHorizontalWithVerticalVelocity() {
    if (!isHorizontalWithVerticalVelocity()) {
      throw new IllegalStateException("Velocity value not a HorizontalWithVerticalVelocity");
    }
    return (HorizontalWithVerticalVelocity) element;
  }

  public void setHorizontalWithVerticalVelocity(HorizontalWithVerticalVelocity selected) {
    selection = Select.$HorizontalWithVerticalVelocity;
    extension = false;
    element = selected;
  }

  public HorizontalWithVerticalVelocity setHorizontalWithVerticalVelocityToNewInstance() {
      HorizontalWithVerticalVelocity element = new HorizontalWithVerticalVelocity();
      setHorizontalWithVerticalVelocity(element);
      return element;
  }
  
  

  public boolean isHorizontalVelocityWithUncertainty() {
    return !hasExtensionValue() && Select.$HorizontalVelocityWithUncertainty == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isHorizontalVelocityWithUncertainty}.
   */
  @SuppressWarnings("unchecked")
  public HorizontalVelocityWithUncertainty getHorizontalVelocityWithUncertainty() {
    if (!isHorizontalVelocityWithUncertainty()) {
      throw new IllegalStateException("Velocity value not a HorizontalVelocityWithUncertainty");
    }
    return (HorizontalVelocityWithUncertainty) element;
  }

  public void setHorizontalVelocityWithUncertainty(HorizontalVelocityWithUncertainty selected) {
    selection = Select.$HorizontalVelocityWithUncertainty;
    extension = false;
    element = selected;
  }

  public HorizontalVelocityWithUncertainty setHorizontalVelocityWithUncertaintyToNewInstance() {
      HorizontalVelocityWithUncertainty element = new HorizontalVelocityWithUncertainty();
      setHorizontalVelocityWithUncertainty(element);
      return element;
  }
  
  

  public boolean isHorizontalWithVerticalVelocityAndUncertainty() {
    return !hasExtensionValue() && Select.$HorizontalWithVerticalVelocityAndUncertainty == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isHorizontalWithVerticalVelocityAndUncertainty}.
   */
  @SuppressWarnings("unchecked")
  public HorizontalWithVerticalVelocityAndUncertainty getHorizontalWithVerticalVelocityAndUncertainty() {
    if (!isHorizontalWithVerticalVelocityAndUncertainty()) {
      throw new IllegalStateException("Velocity value not a HorizontalWithVerticalVelocityAndUncertainty");
    }
    return (HorizontalWithVerticalVelocityAndUncertainty) element;
  }

  public void setHorizontalWithVerticalVelocityAndUncertainty(HorizontalWithVerticalVelocityAndUncertainty selected) {
    selection = Select.$HorizontalWithVerticalVelocityAndUncertainty;
    extension = false;
    element = selected;
  }

  public HorizontalWithVerticalVelocityAndUncertainty setHorizontalWithVerticalVelocityAndUncertaintyToNewInstance() {
      HorizontalWithVerticalVelocityAndUncertainty element = new HorizontalWithVerticalVelocityAndUncertainty();
      setHorizontalWithVerticalVelocityAndUncertainty(element);
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
    return "Velocity = " + elementIndentedString(indent) + indent + ";\n";
  }
}
