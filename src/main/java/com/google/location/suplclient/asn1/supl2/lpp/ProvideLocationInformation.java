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
import com.google.location.suplclient.asn1.base.Asn1Null;
import com.google.location.suplclient.asn1.base.Asn1Object;
import com.google.location.suplclient.asn1.base.Asn1Sequence;
import com.google.location.suplclient.asn1.base.Asn1Tag;
import com.google.location.suplclient.asn1.base.BitStream;
import com.google.location.suplclient.asn1.base.BitStreamReader;
import com.google.location.suplclient.asn1.base.ChoiceComponent;
import com.google.location.suplclient.asn1.base.SequenceComponent;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;


/**
* 
*/
public  class ProvideLocationInformation extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_ProvideLocationInformation
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ProvideLocationInformation() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ProvideLocationInformation;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ProvideLocationInformation != null) {
      return ImmutableList.of(TAG_ProvideLocationInformation);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ProvideLocationInformation from encoded stream.
   */
  public static ProvideLocationInformation fromPerUnaligned(byte[] encodedBytes) {
    ProvideLocationInformation result = new ProvideLocationInformation();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ProvideLocationInformation from encoded stream.
   */
  public static ProvideLocationInformation fromPerAligned(byte[] encodedBytes) {
    ProvideLocationInformation result = new ProvideLocationInformation();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }



  @Override protected boolean isExtensible() {
    return false;
  }

  @Override public boolean containsExtensionValues() {
    for (SequenceComponent extensionComponent : getExtensionComponents()) {
      if (extensionComponent.isExplicitlySet()) return true;
    }
    return false;
  }

  
  private ProvideLocationInformation.criticalExtensionsType criticalExtensions_;
  public ProvideLocationInformation.criticalExtensionsType getCriticalExtensions() {
    return criticalExtensions_;
  }
  /**
   * @throws ClassCastException if value is not a ProvideLocationInformation.criticalExtensionsType
   */
  public void setCriticalExtensions(Asn1Object value) {
    this.criticalExtensions_ = (ProvideLocationInformation.criticalExtensionsType) value;
  }
  public ProvideLocationInformation.criticalExtensionsType setCriticalExtensionsToNewInstance() {
    criticalExtensions_ = new ProvideLocationInformation.criticalExtensionsType();
    return criticalExtensions_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getCriticalExtensions() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCriticalExtensions();
          }

          @Override public void setToNewInstance() {
            setCriticalExtensionsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ProvideLocationInformation.criticalExtensionsType.getPossibleFirstTags() : ImmutableList.of(tag);
          }

          @Override
          public Asn1Tag getTag() {
            return tag;
          }

          @Override
          public boolean isImplicitTagging() {
            return true;
          }

          @Override public String toIndentedString(String indent) {
                return "criticalExtensions : "
                    + getCriticalExtensions().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      return builder.build();
    }

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class criticalExtensionsType extends Asn1Choice {
  //

  private static final Asn1Tag TAG_criticalExtensionsType
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
            "criticalExtensionsType: " + tag + " maps to both " + select0 + " and " + select);
        }
      }
    }
  }

  public criticalExtensionsType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_criticalExtensionsType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_criticalExtensionsType != null) {
      return ImmutableList.of(TAG_criticalExtensionsType);
    } else {
      return tagToSelection.keySet();
    }
  }

  /**
   * Creates a new criticalExtensionsType from encoded stream.
   */
  public static criticalExtensionsType fromPerUnaligned(byte[] encodedBytes) {
    criticalExtensionsType result = new criticalExtensionsType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new criticalExtensionsType from encoded stream.
   */
  public static criticalExtensionsType fromPerAligned(byte[] encodedBytes) {
    criticalExtensionsType result = new criticalExtensionsType();
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
    
    $C1(Asn1Tag.fromClassAndNumber(2, 0),
        true) {
      @Override
      public Asn1Object createElement() {
        return new criticalExtensionsType.c1Type();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? criticalExtensionsType.c1Type.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $CriticalExtensionsFuture(Asn1Tag.fromClassAndNumber(2, 1),
        true) {
      @Override
      public Asn1Object createElement() {
        return new criticalExtensionsType.criticalExtensionsFutureType();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? criticalExtensionsType.criticalExtensionsFutureType.getPossibleFirstTags() : ImmutableList.of(tag);
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
  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class c1Type extends Asn1Choice {
  //

  private static final Asn1Tag TAG_c1Type
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
            "c1Type: " + tag + " maps to both " + select0 + " and " + select);
        }
      }
    }
  }

  public c1Type() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_c1Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_c1Type != null) {
      return ImmutableList.of(TAG_c1Type);
    } else {
      return tagToSelection.keySet();
    }
  }

  /**
   * Creates a new c1Type from encoded stream.
   */
  public static c1Type fromPerUnaligned(byte[] encodedBytes) {
    c1Type result = new c1Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new c1Type from encoded stream.
   */
  public static c1Type fromPerAligned(byte[] encodedBytes) {
    c1Type result = new c1Type();
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
    
    $ProvideLocationInformation_r9(Asn1Tag.fromClassAndNumber(2, 0),
        true) {
      @Override
      public Asn1Object createElement() {
        return new ProvideLocationInformation_r9_IEs();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? ProvideLocationInformation_r9_IEs.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $Spare3(Asn1Tag.fromClassAndNumber(2, 1),
        true) {
      @Override
      public Asn1Object createElement() {
        return new c1Type.spare3Type();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? c1Type.spare3Type.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $Spare2(Asn1Tag.fromClassAndNumber(2, 2),
        true) {
      @Override
      public Asn1Object createElement() {
        return new c1Type.spare2Type();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? c1Type.spare2Type.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $Spare1(Asn1Tag.fromClassAndNumber(2, 3),
        true) {
      @Override
      public Asn1Object createElement() {
        return new c1Type.spare1Type();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? c1Type.spare1Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
  
  

  public boolean isProvideLocationInformation_r9() {
    return !hasExtensionValue() && Select.$ProvideLocationInformation_r9 == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isProvideLocationInformation_r9}.
   */
  @SuppressWarnings("unchecked")
  public ProvideLocationInformation_r9_IEs getProvideLocationInformation_r9() {
    if (!isProvideLocationInformation_r9()) {
      throw new IllegalStateException("c1Type value not a ProvideLocationInformation_r9");
    }
    return (ProvideLocationInformation_r9_IEs) element;
  }

  public void setProvideLocationInformation_r9(ProvideLocationInformation_r9_IEs selected) {
    selection = Select.$ProvideLocationInformation_r9;
    extension = false;
    element = selected;
  }

  public ProvideLocationInformation_r9_IEs setProvideLocationInformation_r9ToNewInstance() {
      ProvideLocationInformation_r9_IEs element = new ProvideLocationInformation_r9_IEs();
      setProvideLocationInformation_r9(element);
      return element;
  }
  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class spare3Type extends Asn1Null {
  //

  private static final Asn1Tag TAG_spare3Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public spare3Type() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_spare3Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_spare3Type != null) {
      return ImmutableList.of(TAG_spare3Type);
    } else {
      return Asn1Null.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new spare3Type from encoded stream.
   */
  public static spare3Type fromPerUnaligned(byte[] encodedBytes) {
    spare3Type result = new spare3Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new spare3Type from encoded stream.
   */
  public static spare3Type fromPerAligned(byte[] encodedBytes) {
    spare3Type result = new spare3Type();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
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

  public String toIndentedString(String indent) {
    return "spare3Type (null value);\n";
  }
}


  public boolean isSpare3() {
    return !hasExtensionValue() && Select.$Spare3 == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isSpare3}.
   */
  @SuppressWarnings("unchecked")
  public c1Type.spare3Type getSpare3() {
    if (!isSpare3()) {
      throw new IllegalStateException("c1Type value not a Spare3");
    }
    return (c1Type.spare3Type) element;
  }

  public void setSpare3(c1Type.spare3Type selected) {
    selection = Select.$Spare3;
    extension = false;
    element = selected;
  }

  public c1Type.spare3Type setSpare3ToNewInstance() {
      c1Type.spare3Type element = new c1Type.spare3Type();
      setSpare3(element);
      return element;
  }
  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class spare2Type extends Asn1Null {
  //

  private static final Asn1Tag TAG_spare2Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public spare2Type() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_spare2Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_spare2Type != null) {
      return ImmutableList.of(TAG_spare2Type);
    } else {
      return Asn1Null.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new spare2Type from encoded stream.
   */
  public static spare2Type fromPerUnaligned(byte[] encodedBytes) {
    spare2Type result = new spare2Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new spare2Type from encoded stream.
   */
  public static spare2Type fromPerAligned(byte[] encodedBytes) {
    spare2Type result = new spare2Type();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
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

  public String toIndentedString(String indent) {
    return "spare2Type (null value);\n";
  }
}


  public boolean isSpare2() {
    return !hasExtensionValue() && Select.$Spare2 == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isSpare2}.
   */
  @SuppressWarnings("unchecked")
  public c1Type.spare2Type getSpare2() {
    if (!isSpare2()) {
      throw new IllegalStateException("c1Type value not a Spare2");
    }
    return (c1Type.spare2Type) element;
  }

  public void setSpare2(c1Type.spare2Type selected) {
    selection = Select.$Spare2;
    extension = false;
    element = selected;
  }

  public c1Type.spare2Type setSpare2ToNewInstance() {
      c1Type.spare2Type element = new c1Type.spare2Type();
      setSpare2(element);
      return element;
  }
  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class spare1Type extends Asn1Null {
  //

  private static final Asn1Tag TAG_spare1Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public spare1Type() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_spare1Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_spare1Type != null) {
      return ImmutableList.of(TAG_spare1Type);
    } else {
      return Asn1Null.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new spare1Type from encoded stream.
   */
  public static spare1Type fromPerUnaligned(byte[] encodedBytes) {
    spare1Type result = new spare1Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new spare1Type from encoded stream.
   */
  public static spare1Type fromPerAligned(byte[] encodedBytes) {
    spare1Type result = new spare1Type();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
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

  public String toIndentedString(String indent) {
    return "spare1Type (null value);\n";
  }
}


  public boolean isSpare1() {
    return !hasExtensionValue() && Select.$Spare1 == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isSpare1}.
   */
  @SuppressWarnings("unchecked")
  public c1Type.spare1Type getSpare1() {
    if (!isSpare1()) {
      throw new IllegalStateException("c1Type value not a Spare1");
    }
    return (c1Type.spare1Type) element;
  }

  public void setSpare1(c1Type.spare1Type selected) {
    selection = Select.$Spare1;
    extension = false;
    element = selected;
  }

  public c1Type.spare1Type setSpare1ToNewInstance() {
      c1Type.spare1Type element = new c1Type.spare1Type();
      setSpare1(element);
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
    return "c1Type = " + elementIndentedString(indent) + indent + ";\n";
  }
}


  public boolean isC1() {
    return !hasExtensionValue() && Select.$C1 == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isC1}.
   */
  @SuppressWarnings("unchecked")
  public criticalExtensionsType.c1Type getC1() {
    if (!isC1()) {
      throw new IllegalStateException("criticalExtensionsType value not a C1");
    }
    return (criticalExtensionsType.c1Type) element;
  }

  public void setC1(criticalExtensionsType.c1Type selected) {
    selection = Select.$C1;
    extension = false;
    element = selected;
  }

  public criticalExtensionsType.c1Type setC1ToNewInstance() {
      criticalExtensionsType.c1Type element = new criticalExtensionsType.c1Type();
      setC1(element);
      return element;
  }
  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
* 
*/
public static class criticalExtensionsFutureType extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_criticalExtensionsFutureType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public criticalExtensionsFutureType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_criticalExtensionsFutureType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_criticalExtensionsFutureType != null) {
      return ImmutableList.of(TAG_criticalExtensionsFutureType);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new criticalExtensionsFutureType from encoded stream.
   */
  public static criticalExtensionsFutureType fromPerUnaligned(byte[] encodedBytes) {
    criticalExtensionsFutureType result = new criticalExtensionsFutureType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new criticalExtensionsFutureType from encoded stream.
   */
  public static criticalExtensionsFutureType fromPerAligned(byte[] encodedBytes) {
    criticalExtensionsFutureType result = new criticalExtensionsFutureType();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }



  @Override protected boolean isExtensible() {
    return false;
  }

  @Override public boolean containsExtensionValues() {
    for (SequenceComponent extensionComponent : getExtensionComponents()) {
      if (extensionComponent.isExplicitlySet()) return true;
    }
    return false;
  }

  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      return builder.build();
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

  public String toIndentedString(String indent) {
    StringBuilder builder = new StringBuilder();
    builder.append("criticalExtensionsFutureType = {\n");
    final String internalIndent = indent + "  ";
    for (SequenceComponent component : getComponents()) {
      if (component.isExplicitlySet()) {
        builder.append(internalIndent)
            .append(component.toIndentedString(internalIndent));
      }
    }
    if (isExtensible()) {
      builder.append(internalIndent).append("...\n");
      for (SequenceComponent component : getExtensionComponents()) {
        if (component.isExplicitlySet()) {
          builder.append(internalIndent)
              .append(component.toIndentedString(internalIndent));
        }
      }
    }
    builder.append(indent).append("};\n");
    return builder.toString();
  }
}


  public boolean isCriticalExtensionsFuture() {
    return !hasExtensionValue() && Select.$CriticalExtensionsFuture == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isCriticalExtensionsFuture}.
   */
  @SuppressWarnings("unchecked")
  public criticalExtensionsType.criticalExtensionsFutureType getCriticalExtensionsFuture() {
    if (!isCriticalExtensionsFuture()) {
      throw new IllegalStateException("criticalExtensionsType value not a CriticalExtensionsFuture");
    }
    return (criticalExtensionsType.criticalExtensionsFutureType) element;
  }

  public void setCriticalExtensionsFuture(criticalExtensionsType.criticalExtensionsFutureType selected) {
    selection = Select.$CriticalExtensionsFuture;
    extension = false;
    element = selected;
  }

  public criticalExtensionsType.criticalExtensionsFutureType setCriticalExtensionsFutureToNewInstance() {
      criticalExtensionsType.criticalExtensionsFutureType element = new criticalExtensionsType.criticalExtensionsFutureType();
      setCriticalExtensionsFuture(element);
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
    return "criticalExtensionsType = " + elementIndentedString(indent) + indent + ";\n";
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

  public String toIndentedString(String indent) {
    StringBuilder builder = new StringBuilder();
    builder.append("ProvideLocationInformation = {\n");
    final String internalIndent = indent + "  ";
    for (SequenceComponent component : getComponents()) {
      if (component.isExplicitlySet()) {
        builder.append(internalIndent)
            .append(component.toIndentedString(internalIndent));
      }
    }
    if (isExtensible()) {
      builder.append(internalIndent).append("...\n");
      for (SequenceComponent component : getExtensionComponents()) {
        if (component.isExplicitlySet()) {
          builder.append(internalIndent)
              .append(component.toIndentedString(internalIndent));
        }
      }
    }
    builder.append(indent).append("};\n");
    return builder.toString();
  }
}
