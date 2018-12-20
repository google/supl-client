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
public  class MethodType extends Asn1Choice {
  //

  private static final Asn1Tag TAG_MethodType
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
            "MethodType: " + tag + " maps to both " + select0 + " and " + select);
        }
      }
    }
  }

  public MethodType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_MethodType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_MethodType != null) {
      return ImmutableList.of(TAG_MethodType);
    } else {
      return tagToSelection.keySet();
    }
  }

  /**
   * Creates a new MethodType from encoded stream.
   */
  public static MethodType fromPerUnaligned(byte[] encodedBytes) {
    MethodType result = new MethodType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new MethodType from encoded stream.
   */
  public static MethodType fromPerAligned(byte[] encodedBytes) {
    MethodType result = new MethodType();
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
    
    $MsAssisted(Asn1Tag.fromClassAndNumber(2, 0),
        true) {
      @Override
      public Asn1Object createElement() {
        return new AccuracyOpt();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? AccuracyOpt.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $MsBased(Asn1Tag.fromClassAndNumber(2, 1),
        true) {
      @Override
      public Asn1Object createElement() {
        return new Accuracy();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? Accuracy.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $MsBasedPref(Asn1Tag.fromClassAndNumber(2, 2),
        true) {
      @Override
      public Asn1Object createElement() {
        return new Accuracy();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? Accuracy.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $MsAssistedPref(Asn1Tag.fromClassAndNumber(2, 3),
        true) {
      @Override
      public Asn1Object createElement() {
        return new Accuracy();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? Accuracy.getPossibleFirstTags() : ImmutableList.of(tag);
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
  
  

  public boolean isMsAssisted() {
    return !hasExtensionValue() && Select.$MsAssisted == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isMsAssisted}.
   */
  @SuppressWarnings("unchecked")
  public AccuracyOpt getMsAssisted() {
    if (!isMsAssisted()) {
      throw new IllegalStateException("MethodType value not a MsAssisted");
    }
    return (AccuracyOpt) element;
  }

  public void setMsAssisted(AccuracyOpt selected) {
    selection = Select.$MsAssisted;
    extension = false;
    element = selected;
  }

  public AccuracyOpt setMsAssistedToNewInstance() {
      AccuracyOpt element = new AccuracyOpt();
      setMsAssisted(element);
      return element;
  }
  
  

  public boolean isMsBased() {
    return !hasExtensionValue() && Select.$MsBased == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isMsBased}.
   */
  @SuppressWarnings("unchecked")
  public Accuracy getMsBased() {
    if (!isMsBased()) {
      throw new IllegalStateException("MethodType value not a MsBased");
    }
    return (Accuracy) element;
  }

  public void setMsBased(Accuracy selected) {
    selection = Select.$MsBased;
    extension = false;
    element = selected;
  }

  public Accuracy setMsBasedToNewInstance() {
      Accuracy element = new Accuracy();
      setMsBased(element);
      return element;
  }
  
  

  public boolean isMsBasedPref() {
    return !hasExtensionValue() && Select.$MsBasedPref == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isMsBasedPref}.
   */
  @SuppressWarnings("unchecked")
  public Accuracy getMsBasedPref() {
    if (!isMsBasedPref()) {
      throw new IllegalStateException("MethodType value not a MsBasedPref");
    }
    return (Accuracy) element;
  }

  public void setMsBasedPref(Accuracy selected) {
    selection = Select.$MsBasedPref;
    extension = false;
    element = selected;
  }

  public Accuracy setMsBasedPrefToNewInstance() {
      Accuracy element = new Accuracy();
      setMsBasedPref(element);
      return element;
  }
  
  

  public boolean isMsAssistedPref() {
    return !hasExtensionValue() && Select.$MsAssistedPref == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isMsAssistedPref}.
   */
  @SuppressWarnings("unchecked")
  public Accuracy getMsAssistedPref() {
    if (!isMsAssistedPref()) {
      throw new IllegalStateException("MethodType value not a MsAssistedPref");
    }
    return (Accuracy) element;
  }

  public void setMsAssistedPref(Accuracy selected) {
    selection = Select.$MsAssistedPref;
    extension = false;
    element = selected;
  }

  public Accuracy setMsAssistedPrefToNewInstance() {
      Accuracy element = new Accuracy();
      setMsAssistedPref(element);
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
    return "MethodType = " + elementIndentedString(indent) + indent + ";\n";
  }
}
