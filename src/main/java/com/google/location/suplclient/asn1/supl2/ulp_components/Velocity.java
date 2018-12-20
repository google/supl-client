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
    
    $Horvel(Asn1Tag.fromClassAndNumber(2, 0),
        true) {
      @Override
      public Asn1Object createElement() {
        return new Horvel();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? Horvel.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $Horandvervel(Asn1Tag.fromClassAndNumber(2, 1),
        true) {
      @Override
      public Asn1Object createElement() {
        return new Horandvervel();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? Horandvervel.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $Horveluncert(Asn1Tag.fromClassAndNumber(2, 2),
        true) {
      @Override
      public Asn1Object createElement() {
        return new Horveluncert();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? Horveluncert.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $Horandveruncert(Asn1Tag.fromClassAndNumber(2, 3),
        true) {
      @Override
      public Asn1Object createElement() {
        return new Horandveruncert();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? Horandveruncert.getPossibleFirstTags() : ImmutableList.of(tag);
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
  
  

  public boolean isHorvel() {
    return !hasExtensionValue() && Select.$Horvel == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isHorvel}.
   */
  @SuppressWarnings("unchecked")
  public Horvel getHorvel() {
    if (!isHorvel()) {
      throw new IllegalStateException("Velocity value not a Horvel");
    }
    return (Horvel) element;
  }

  public void setHorvel(Horvel selected) {
    selection = Select.$Horvel;
    extension = false;
    element = selected;
  }

  public Horvel setHorvelToNewInstance() {
      Horvel element = new Horvel();
      setHorvel(element);
      return element;
  }
  
  

  public boolean isHorandvervel() {
    return !hasExtensionValue() && Select.$Horandvervel == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isHorandvervel}.
   */
  @SuppressWarnings("unchecked")
  public Horandvervel getHorandvervel() {
    if (!isHorandvervel()) {
      throw new IllegalStateException("Velocity value not a Horandvervel");
    }
    return (Horandvervel) element;
  }

  public void setHorandvervel(Horandvervel selected) {
    selection = Select.$Horandvervel;
    extension = false;
    element = selected;
  }

  public Horandvervel setHorandvervelToNewInstance() {
      Horandvervel element = new Horandvervel();
      setHorandvervel(element);
      return element;
  }
  
  

  public boolean isHorveluncert() {
    return !hasExtensionValue() && Select.$Horveluncert == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isHorveluncert}.
   */
  @SuppressWarnings("unchecked")
  public Horveluncert getHorveluncert() {
    if (!isHorveluncert()) {
      throw new IllegalStateException("Velocity value not a Horveluncert");
    }
    return (Horveluncert) element;
  }

  public void setHorveluncert(Horveluncert selected) {
    selection = Select.$Horveluncert;
    extension = false;
    element = selected;
  }

  public Horveluncert setHorveluncertToNewInstance() {
      Horveluncert element = new Horveluncert();
      setHorveluncert(element);
      return element;
  }
  
  

  public boolean isHorandveruncert() {
    return !hasExtensionValue() && Select.$Horandveruncert == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isHorandveruncert}.
   */
  @SuppressWarnings("unchecked")
  public Horandveruncert getHorandveruncert() {
    if (!isHorandveruncert()) {
      throw new IllegalStateException("Velocity value not a Horandveruncert");
    }
    return (Horandveruncert) element;
  }

  public void setHorandveruncert(Horandveruncert selected) {
    selection = Select.$Horandveruncert;
    extension = false;
    element = selected;
  }

  public Horandveruncert setHorandveruncertToNewInstance() {
      Horandveruncert element = new Horandveruncert();
      setHorandveruncert(element);
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
