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
public  class FrequencyInfo extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_FrequencyInfo
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public FrequencyInfo() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_FrequencyInfo;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_FrequencyInfo != null) {
      return ImmutableList.of(TAG_FrequencyInfo);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new FrequencyInfo from encoded stream.
   */
  public static FrequencyInfo fromPerUnaligned(byte[] encodedBytes) {
    FrequencyInfo result = new FrequencyInfo();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new FrequencyInfo from encoded stream.
   */
  public static FrequencyInfo fromPerAligned(byte[] encodedBytes) {
    FrequencyInfo result = new FrequencyInfo();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }



  @Override protected boolean isExtensible() {
    return true;
  }

  @Override public boolean containsExtensionValues() {
    for (SequenceComponent extensionComponent : getExtensionComponents()) {
      if (extensionComponent.isExplicitlySet()) return true;
    }
    return false;
  }

  
  private FrequencyInfo.modeSpecificInfoType modeSpecificInfo_;
  public FrequencyInfo.modeSpecificInfoType getModeSpecificInfo() {
    return modeSpecificInfo_;
  }
  /**
   * @throws ClassCastException if value is not a FrequencyInfo.modeSpecificInfoType
   */
  public void setModeSpecificInfo(Asn1Object value) {
    this.modeSpecificInfo_ = (FrequencyInfo.modeSpecificInfoType) value;
  }
  public FrequencyInfo.modeSpecificInfoType setModeSpecificInfoToNewInstance() {
    modeSpecificInfo_ = new FrequencyInfo.modeSpecificInfoType();
    return modeSpecificInfo_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getModeSpecificInfo() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getModeSpecificInfo();
          }

          @Override public void setToNewInstance() {
            setModeSpecificInfoToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? FrequencyInfo.modeSpecificInfoType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "modeSpecificInfo : "
                    + getModeSpecificInfo().toIndentedString(indent);
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
public static class modeSpecificInfoType extends Asn1Choice {
  //

  private static final Asn1Tag TAG_modeSpecificInfoType
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
            "modeSpecificInfoType: " + tag + " maps to both " + select0 + " and " + select);
        }
      }
    }
  }

  public modeSpecificInfoType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_modeSpecificInfoType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_modeSpecificInfoType != null) {
      return ImmutableList.of(TAG_modeSpecificInfoType);
    } else {
      return tagToSelection.keySet();
    }
  }

  /**
   * Creates a new modeSpecificInfoType from encoded stream.
   */
  public static modeSpecificInfoType fromPerUnaligned(byte[] encodedBytes) {
    modeSpecificInfoType result = new modeSpecificInfoType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new modeSpecificInfoType from encoded stream.
   */
  public static modeSpecificInfoType fromPerAligned(byte[] encodedBytes) {
    modeSpecificInfoType result = new modeSpecificInfoType();
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
    
    $Fdd(Asn1Tag.fromClassAndNumber(2, 0),
        true) {
      @Override
      public Asn1Object createElement() {
        return new FrequencyInfoFDD();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? FrequencyInfoFDD.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $Tdd(Asn1Tag.fromClassAndNumber(2, 1),
        true) {
      @Override
      public Asn1Object createElement() {
        return new FrequencyInfoTDD();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? FrequencyInfoTDD.getPossibleFirstTags() : ImmutableList.of(tag);
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
  
  

  public boolean isFdd() {
    return !hasExtensionValue() && Select.$Fdd == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isFdd}.
   */
  @SuppressWarnings("unchecked")
  public FrequencyInfoFDD getFdd() {
    if (!isFdd()) {
      throw new IllegalStateException("modeSpecificInfoType value not a Fdd");
    }
    return (FrequencyInfoFDD) element;
  }

  public void setFdd(FrequencyInfoFDD selected) {
    selection = Select.$Fdd;
    extension = false;
    element = selected;
  }

  public FrequencyInfoFDD setFddToNewInstance() {
      FrequencyInfoFDD element = new FrequencyInfoFDD();
      setFdd(element);
      return element;
  }
  
  

  public boolean isTdd() {
    return !hasExtensionValue() && Select.$Tdd == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isTdd}.
   */
  @SuppressWarnings("unchecked")
  public FrequencyInfoTDD getTdd() {
    if (!isTdd()) {
      throw new IllegalStateException("modeSpecificInfoType value not a Tdd");
    }
    return (FrequencyInfoTDD) element;
  }

  public void setTdd(FrequencyInfoTDD selected) {
    selection = Select.$Tdd;
    extension = false;
    element = selected;
  }

  public FrequencyInfoTDD setTddToNewInstance() {
      FrequencyInfoTDD element = new FrequencyInfoTDD();
      setTdd(element);
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
    return "modeSpecificInfoType = " + elementIndentedString(indent) + indent + ";\n";
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
    builder.append("FrequencyInfo = {\n");
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
