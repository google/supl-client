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
import com.google.location.suplclient.asn1.base.Asn1Integer;
import com.google.location.suplclient.asn1.base.Asn1Object;
import com.google.location.suplclient.asn1.base.Asn1Sequence;
import com.google.location.suplclient.asn1.base.Asn1Tag;
import com.google.location.suplclient.asn1.base.BitStream;
import com.google.location.suplclient.asn1.base.BitStreamReader;
import com.google.location.suplclient.asn1.base.ChoiceComponent;
import com.google.location.suplclient.asn1.base.SequenceComponent;
import com.google.location.suplclient.asn1.supl2.ulp_components.CellParametersID;
import com.google.location.suplclient.asn1.supl2.ulp_components.PrimaryCPICH_Info;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;


/**
* 
*/
public  class SET_GANSSReferenceTime extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_SET_GANSSReferenceTime
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public SET_GANSSReferenceTime() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_SET_GANSSReferenceTime;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_SET_GANSSReferenceTime != null) {
      return ImmutableList.of(TAG_SET_GANSSReferenceTime);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new SET_GANSSReferenceTime from encoded stream.
   */
  public static SET_GANSSReferenceTime fromPerUnaligned(byte[] encodedBytes) {
    SET_GANSSReferenceTime result = new SET_GANSSReferenceTime();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new SET_GANSSReferenceTime from encoded stream.
   */
  public static SET_GANSSReferenceTime fromPerAligned(byte[] encodedBytes) {
    SET_GANSSReferenceTime result = new SET_GANSSReferenceTime();
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

  
  private SET_GANSSReferenceTime.set_GANSSTimingOfCellType set_GANSSTimingOfCell_;
  public SET_GANSSReferenceTime.set_GANSSTimingOfCellType getSet_GANSSTimingOfCell() {
    return set_GANSSTimingOfCell_;
  }
  /**
   * @throws ClassCastException if value is not a SET_GANSSReferenceTime.set_GANSSTimingOfCellType
   */
  public void setSet_GANSSTimingOfCell(Asn1Object value) {
    this.set_GANSSTimingOfCell_ = (SET_GANSSReferenceTime.set_GANSSTimingOfCellType) value;
  }
  public SET_GANSSReferenceTime.set_GANSSTimingOfCellType setSet_GANSSTimingOfCellToNewInstance() {
    set_GANSSTimingOfCell_ = new SET_GANSSReferenceTime.set_GANSSTimingOfCellType();
    return set_GANSSTimingOfCell_;
  }
  
  private SET_GANSSReferenceTime.modeSpecificInfoType modeSpecificInfo_;
  public SET_GANSSReferenceTime.modeSpecificInfoType getModeSpecificInfo() {
    return modeSpecificInfo_;
  }
  /**
   * @throws ClassCastException if value is not a SET_GANSSReferenceTime.modeSpecificInfoType
   */
  public void setModeSpecificInfo(Asn1Object value) {
    this.modeSpecificInfo_ = (SET_GANSSReferenceTime.modeSpecificInfoType) value;
  }
  public SET_GANSSReferenceTime.modeSpecificInfoType setModeSpecificInfoToNewInstance() {
    modeSpecificInfo_ = new SET_GANSSReferenceTime.modeSpecificInfoType();
    return modeSpecificInfo_;
  }
  
  private SET_GANSSReferenceTime.sfnType sfn_;
  public SET_GANSSReferenceTime.sfnType getSfn() {
    return sfn_;
  }
  /**
   * @throws ClassCastException if value is not a SET_GANSSReferenceTime.sfnType
   */
  public void setSfn(Asn1Object value) {
    this.sfn_ = (SET_GANSSReferenceTime.sfnType) value;
  }
  public SET_GANSSReferenceTime.sfnType setSfnToNewInstance() {
    sfn_ = new SET_GANSSReferenceTime.sfnType();
    return sfn_;
  }
  
  private SET_GANSSReferenceTime.ganss_TODUncertaintyType ganss_TODUncertainty_;
  public SET_GANSSReferenceTime.ganss_TODUncertaintyType getGanss_TODUncertainty() {
    return ganss_TODUncertainty_;
  }
  /**
   * @throws ClassCastException if value is not a SET_GANSSReferenceTime.ganss_TODUncertaintyType
   */
  public void setGanss_TODUncertainty(Asn1Object value) {
    this.ganss_TODUncertainty_ = (SET_GANSSReferenceTime.ganss_TODUncertaintyType) value;
  }
  public SET_GANSSReferenceTime.ganss_TODUncertaintyType setGanss_TODUncertaintyToNewInstance() {
    ganss_TODUncertainty_ = new SET_GANSSReferenceTime.ganss_TODUncertaintyType();
    return ganss_TODUncertainty_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getSet_GANSSTimingOfCell() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getSet_GANSSTimingOfCell();
          }

          @Override public void setToNewInstance() {
            setSet_GANSSTimingOfCellToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SET_GANSSReferenceTime.set_GANSSTimingOfCellType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "set_GANSSTimingOfCell : "
                    + getSet_GANSSTimingOfCell().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getModeSpecificInfo() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getModeSpecificInfo();
          }

          @Override public void setToNewInstance() {
            setModeSpecificInfoToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SET_GANSSReferenceTime.modeSpecificInfoType.getPossibleFirstTags() : ImmutableList.of(tag);
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
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getSfn() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getSfn();
          }

          @Override public void setToNewInstance() {
            setSfnToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SET_GANSSReferenceTime.sfnType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "sfn : "
                    + getSfn().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getGanss_TODUncertainty() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanss_TODUncertainty();
          }

          @Override public void setToNewInstance() {
            setGanss_TODUncertaintyToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SET_GANSSReferenceTime.ganss_TODUncertaintyType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganss_TODUncertainty : "
                    + getGanss_TODUncertainty().toIndentedString(indent);
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
public static class set_GANSSTimingOfCellType extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_set_GANSSTimingOfCellType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public set_GANSSTimingOfCellType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_set_GANSSTimingOfCellType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_set_GANSSTimingOfCellType != null) {
      return ImmutableList.of(TAG_set_GANSSTimingOfCellType);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new set_GANSSTimingOfCellType from encoded stream.
   */
  public static set_GANSSTimingOfCellType fromPerUnaligned(byte[] encodedBytes) {
    set_GANSSTimingOfCellType result = new set_GANSSTimingOfCellType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new set_GANSSTimingOfCellType from encoded stream.
   */
  public static set_GANSSTimingOfCellType fromPerAligned(byte[] encodedBytes) {
    set_GANSSTimingOfCellType result = new set_GANSSTimingOfCellType();
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

  
  private set_GANSSTimingOfCellType.ms_partType ms_part_;
  public set_GANSSTimingOfCellType.ms_partType getMs_part() {
    return ms_part_;
  }
  /**
   * @throws ClassCastException if value is not a set_GANSSTimingOfCellType.ms_partType
   */
  public void setMs_part(Asn1Object value) {
    this.ms_part_ = (set_GANSSTimingOfCellType.ms_partType) value;
  }
  public set_GANSSTimingOfCellType.ms_partType setMs_partToNewInstance() {
    ms_part_ = new set_GANSSTimingOfCellType.ms_partType();
    return ms_part_;
  }
  
  private set_GANSSTimingOfCellType.ls_partType ls_part_;
  public set_GANSSTimingOfCellType.ls_partType getLs_part() {
    return ls_part_;
  }
  /**
   * @throws ClassCastException if value is not a set_GANSSTimingOfCellType.ls_partType
   */
  public void setLs_part(Asn1Object value) {
    this.ls_part_ = (set_GANSSTimingOfCellType.ls_partType) value;
  }
  public set_GANSSTimingOfCellType.ls_partType setLs_partToNewInstance() {
    ls_part_ = new set_GANSSTimingOfCellType.ls_partType();
    return ls_part_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getMs_part() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getMs_part();
          }

          @Override public void setToNewInstance() {
            setMs_partToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? set_GANSSTimingOfCellType.ms_partType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ms_part : "
                    + getMs_part().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getLs_part() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getLs_part();
          }

          @Override public void setToNewInstance() {
            setLs_partToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? set_GANSSTimingOfCellType.ls_partType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ls_part : "
                    + getLs_part().toIndentedString(indent);
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
public static class ms_partType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ms_partType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ms_partType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("80"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ms_partType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ms_partType != null) {
      return ImmutableList.of(TAG_ms_partType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ms_partType from encoded stream.
   */
  public static ms_partType fromPerUnaligned(byte[] encodedBytes) {
    ms_partType result = new ms_partType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ms_partType from encoded stream.
   */
  public static ms_partType fromPerAligned(byte[] encodedBytes) {
    ms_partType result = new ms_partType();
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
    return "ms_partType = " + getInteger() + ";\n";
  }
}

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class ls_partType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ls_partType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ls_partType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("4294967295"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ls_partType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ls_partType != null) {
      return ImmutableList.of(TAG_ls_partType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ls_partType from encoded stream.
   */
  public static ls_partType fromPerUnaligned(byte[] encodedBytes) {
    ls_partType result = new ls_partType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ls_partType from encoded stream.
   */
  public static ls_partType fromPerAligned(byte[] encodedBytes) {
    ls_partType result = new ls_partType();
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
    return "ls_partType = " + getInteger() + ";\n";
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
    builder.append("set_GANSSTimingOfCellType = {\n");
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
    return false;
  }

  @Override public Asn1Object getValue() {
    return element;
  }

  
  private static enum Select implements ChoiceComponent {
    
    $Fdd(Asn1Tag.fromClassAndNumber(2, 0),
        true) {
      @Override
      public Asn1Object createElement() {
        return new modeSpecificInfoType.fddType();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? modeSpecificInfoType.fddType.getPossibleFirstTags() : ImmutableList.of(tag);
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
        return new modeSpecificInfoType.tddType();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? modeSpecificInfoType.tddType.getPossibleFirstTags() : ImmutableList.of(tag);
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
public static class fddType extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_fddType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public fddType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_fddType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_fddType != null) {
      return ImmutableList.of(TAG_fddType);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new fddType from encoded stream.
   */
  public static fddType fromPerUnaligned(byte[] encodedBytes) {
    fddType result = new fddType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new fddType from encoded stream.
   */
  public static fddType fromPerAligned(byte[] encodedBytes) {
    fddType result = new fddType();
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

  
  private PrimaryCPICH_Info referenceIdentity_;
  public PrimaryCPICH_Info getReferenceIdentity() {
    return referenceIdentity_;
  }
  /**
   * @throws ClassCastException if value is not a PrimaryCPICH_Info
   */
  public void setReferenceIdentity(Asn1Object value) {
    this.referenceIdentity_ = (PrimaryCPICH_Info) value;
  }
  public PrimaryCPICH_Info setReferenceIdentityToNewInstance() {
    referenceIdentity_ = new PrimaryCPICH_Info();
    return referenceIdentity_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getReferenceIdentity() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getReferenceIdentity();
          }

          @Override public void setToNewInstance() {
            setReferenceIdentityToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? PrimaryCPICH_Info.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "referenceIdentity : "
                    + getReferenceIdentity().toIndentedString(indent);
              }
        });
    
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
    builder.append("fddType = {\n");
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


  public boolean isFdd() {
    return !hasExtensionValue() && Select.$Fdd == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isFdd}.
   */
  @SuppressWarnings("unchecked")
  public modeSpecificInfoType.fddType getFdd() {
    if (!isFdd()) {
      throw new IllegalStateException("modeSpecificInfoType value not a Fdd");
    }
    return (modeSpecificInfoType.fddType) element;
  }

  public void setFdd(modeSpecificInfoType.fddType selected) {
    selection = Select.$Fdd;
    extension = false;
    element = selected;
  }

  public modeSpecificInfoType.fddType setFddToNewInstance() {
      modeSpecificInfoType.fddType element = new modeSpecificInfoType.fddType();
      setFdd(element);
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
public static class tddType extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_tddType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public tddType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_tddType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_tddType != null) {
      return ImmutableList.of(TAG_tddType);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new tddType from encoded stream.
   */
  public static tddType fromPerUnaligned(byte[] encodedBytes) {
    tddType result = new tddType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new tddType from encoded stream.
   */
  public static tddType fromPerAligned(byte[] encodedBytes) {
    tddType result = new tddType();
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

  
  private CellParametersID referenceIdentity_;
  public CellParametersID getReferenceIdentity() {
    return referenceIdentity_;
  }
  /**
   * @throws ClassCastException if value is not a CellParametersID
   */
  public void setReferenceIdentity(Asn1Object value) {
    this.referenceIdentity_ = (CellParametersID) value;
  }
  public CellParametersID setReferenceIdentityToNewInstance() {
    referenceIdentity_ = new CellParametersID();
    return referenceIdentity_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getReferenceIdentity() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getReferenceIdentity();
          }

          @Override public void setToNewInstance() {
            setReferenceIdentityToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? CellParametersID.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "referenceIdentity : "
                    + getReferenceIdentity().toIndentedString(indent);
              }
        });
    
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
    builder.append("tddType = {\n");
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


  public boolean isTdd() {
    return !hasExtensionValue() && Select.$Tdd == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isTdd}.
   */
  @SuppressWarnings("unchecked")
  public modeSpecificInfoType.tddType getTdd() {
    if (!isTdd()) {
      throw new IllegalStateException("modeSpecificInfoType value not a Tdd");
    }
    return (modeSpecificInfoType.tddType) element;
  }

  public void setTdd(modeSpecificInfoType.tddType selected) {
    selection = Select.$Tdd;
    extension = false;
    element = selected;
  }

  public modeSpecificInfoType.tddType setTddToNewInstance() {
      modeSpecificInfoType.tddType element = new modeSpecificInfoType.tddType();
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

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class sfnType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_sfnType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public sfnType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("4095"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_sfnType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_sfnType != null) {
      return ImmutableList.of(TAG_sfnType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new sfnType from encoded stream.
   */
  public static sfnType fromPerUnaligned(byte[] encodedBytes) {
    sfnType result = new sfnType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new sfnType from encoded stream.
   */
  public static sfnType fromPerAligned(byte[] encodedBytes) {
    sfnType result = new sfnType();
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
    return "sfnType = " + getInteger() + ";\n";
  }
}

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class ganss_TODUncertaintyType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ganss_TODUncertaintyType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ganss_TODUncertaintyType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("127"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ganss_TODUncertaintyType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ganss_TODUncertaintyType != null) {
      return ImmutableList.of(TAG_ganss_TODUncertaintyType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ganss_TODUncertaintyType from encoded stream.
   */
  public static ganss_TODUncertaintyType fromPerUnaligned(byte[] encodedBytes) {
    ganss_TODUncertaintyType result = new ganss_TODUncertaintyType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ganss_TODUncertaintyType from encoded stream.
   */
  public static ganss_TODUncertaintyType fromPerAligned(byte[] encodedBytes) {
    ganss_TODUncertaintyType result = new ganss_TODUncertaintyType();
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
    return "ganss_TODUncertaintyType = " + getInteger() + ";\n";
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
    builder.append("SET_GANSSReferenceTime = {\n");
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
