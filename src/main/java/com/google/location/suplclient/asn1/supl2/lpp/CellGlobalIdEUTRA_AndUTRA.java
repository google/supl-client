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
import com.google.location.suplclient.asn1.base.Asn1BitString;
import com.google.location.suplclient.asn1.base.Asn1Choice;
import com.google.location.suplclient.asn1.base.Asn1Integer;
import com.google.location.suplclient.asn1.base.Asn1Object;
import com.google.location.suplclient.asn1.base.Asn1Sequence;
import com.google.location.suplclient.asn1.base.Asn1SequenceOf;
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
public  class CellGlobalIdEUTRA_AndUTRA extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_CellGlobalIdEUTRA_AndUTRA
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public CellGlobalIdEUTRA_AndUTRA() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_CellGlobalIdEUTRA_AndUTRA;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_CellGlobalIdEUTRA_AndUTRA != null) {
      return ImmutableList.of(TAG_CellGlobalIdEUTRA_AndUTRA);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new CellGlobalIdEUTRA_AndUTRA from encoded stream.
   */
  public static CellGlobalIdEUTRA_AndUTRA fromPerUnaligned(byte[] encodedBytes) {
    CellGlobalIdEUTRA_AndUTRA result = new CellGlobalIdEUTRA_AndUTRA();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new CellGlobalIdEUTRA_AndUTRA from encoded stream.
   */
  public static CellGlobalIdEUTRA_AndUTRA fromPerAligned(byte[] encodedBytes) {
    CellGlobalIdEUTRA_AndUTRA result = new CellGlobalIdEUTRA_AndUTRA();
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

  
  private CellGlobalIdEUTRA_AndUTRA.plmn_IdentityType plmn_Identity_;
  public CellGlobalIdEUTRA_AndUTRA.plmn_IdentityType getPlmn_Identity() {
    return plmn_Identity_;
  }
  /**
   * @throws ClassCastException if value is not a CellGlobalIdEUTRA_AndUTRA.plmn_IdentityType
   */
  public void setPlmn_Identity(Asn1Object value) {
    this.plmn_Identity_ = (CellGlobalIdEUTRA_AndUTRA.plmn_IdentityType) value;
  }
  public CellGlobalIdEUTRA_AndUTRA.plmn_IdentityType setPlmn_IdentityToNewInstance() {
    plmn_Identity_ = new CellGlobalIdEUTRA_AndUTRA.plmn_IdentityType();
    return plmn_Identity_;
  }
  
  private CellGlobalIdEUTRA_AndUTRA.cellIdentityType cellIdentity_;
  public CellGlobalIdEUTRA_AndUTRA.cellIdentityType getCellIdentity() {
    return cellIdentity_;
  }
  /**
   * @throws ClassCastException if value is not a CellGlobalIdEUTRA_AndUTRA.cellIdentityType
   */
  public void setCellIdentity(Asn1Object value) {
    this.cellIdentity_ = (CellGlobalIdEUTRA_AndUTRA.cellIdentityType) value;
  }
  public CellGlobalIdEUTRA_AndUTRA.cellIdentityType setCellIdentityToNewInstance() {
    cellIdentity_ = new CellGlobalIdEUTRA_AndUTRA.cellIdentityType();
    return cellIdentity_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getPlmn_Identity() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getPlmn_Identity();
          }

          @Override public void setToNewInstance() {
            setPlmn_IdentityToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? CellGlobalIdEUTRA_AndUTRA.plmn_IdentityType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "plmn_Identity : "
                    + getPlmn_Identity().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getCellIdentity() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCellIdentity();
          }

          @Override public void setToNewInstance() {
            setCellIdentityToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? CellGlobalIdEUTRA_AndUTRA.cellIdentityType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "cellIdentity : "
                    + getCellIdentity().toIndentedString(indent);
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
public static class plmn_IdentityType extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_plmn_IdentityType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public plmn_IdentityType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_plmn_IdentityType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_plmn_IdentityType != null) {
      return ImmutableList.of(TAG_plmn_IdentityType);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new plmn_IdentityType from encoded stream.
   */
  public static plmn_IdentityType fromPerUnaligned(byte[] encodedBytes) {
    plmn_IdentityType result = new plmn_IdentityType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new plmn_IdentityType from encoded stream.
   */
  public static plmn_IdentityType fromPerAligned(byte[] encodedBytes) {
    plmn_IdentityType result = new plmn_IdentityType();
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

  
  private plmn_IdentityType.mccType mcc_;
  public plmn_IdentityType.mccType getMcc() {
    return mcc_;
  }
  /**
   * @throws ClassCastException if value is not a plmn_IdentityType.mccType
   */
  public void setMcc(Asn1Object value) {
    this.mcc_ = (plmn_IdentityType.mccType) value;
  }
  public plmn_IdentityType.mccType setMccToNewInstance() {
    mcc_ = new plmn_IdentityType.mccType();
    return mcc_;
  }
  
  private plmn_IdentityType.mncType mnc_;
  public plmn_IdentityType.mncType getMnc() {
    return mnc_;
  }
  /**
   * @throws ClassCastException if value is not a plmn_IdentityType.mncType
   */
  public void setMnc(Asn1Object value) {
    this.mnc_ = (plmn_IdentityType.mncType) value;
  }
  public plmn_IdentityType.mncType setMncToNewInstance() {
    mnc_ = new plmn_IdentityType.mncType();
    return mnc_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getMcc() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getMcc();
          }

          @Override public void setToNewInstance() {
            setMccToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? plmn_IdentityType.mccType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "mcc : "
                    + getMcc().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getMnc() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getMnc();
          }

          @Override public void setToNewInstance() {
            setMncToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? plmn_IdentityType.mncType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "mnc : "
                    + getMnc().toIndentedString(indent);
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
public static class mccType
    extends Asn1SequenceOf<mccType.mccTypeComponentType> {
  //

  private static final Asn1Tag TAG_mccType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public mccType() {
    super();
    setMinSize(3);
setMaxSize(3);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_mccType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_mccType != null) {
      return ImmutableList.of(TAG_mccType);
    } else {
      return Asn1SequenceOf.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new mccType from encoded stream.
   */
  public static mccType fromPerUnaligned(byte[] encodedBytes) {
    mccType result = new mccType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new mccType from encoded stream.
   */
  public static mccType fromPerAligned(byte[] encodedBytes) {
    mccType result = new mccType();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  
  @Override public mccType.mccTypeComponentType createAndAddValue() {
    mccType.mccTypeComponentType value = new mccType.mccTypeComponentType();
    add(value);
    return value;
  }

 // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class mccTypeComponentType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_mccTypeComponentType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public mccTypeComponentType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("9"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_mccTypeComponentType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_mccTypeComponentType != null) {
      return ImmutableList.of(TAG_mccTypeComponentType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new mccTypeComponentType from encoded stream.
   */
  public static mccTypeComponentType fromPerUnaligned(byte[] encodedBytes) {
    mccTypeComponentType result = new mccTypeComponentType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new mccTypeComponentType from encoded stream.
   */
  public static mccTypeComponentType fromPerAligned(byte[] encodedBytes) {
    mccTypeComponentType result = new mccTypeComponentType();
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
    return "mccTypeComponentType = " + getInteger() + ";\n";
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
    builder.append("mccType = [\n");
    final String internalIndent = indent + "  ";
    for (mccType.mccTypeComponentType value : getValues()) {
      builder.append(internalIndent)
          .append(value.toIndentedString(internalIndent));
    }
    builder.append(indent).append("];\n");
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
public static class mncType
    extends Asn1SequenceOf<mncType.mncTypeComponentType> {
  //

  private static final Asn1Tag TAG_mncType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public mncType() {
    super();
    setMinSize(2);
setMaxSize(3);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_mncType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_mncType != null) {
      return ImmutableList.of(TAG_mncType);
    } else {
      return Asn1SequenceOf.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new mncType from encoded stream.
   */
  public static mncType fromPerUnaligned(byte[] encodedBytes) {
    mncType result = new mncType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new mncType from encoded stream.
   */
  public static mncType fromPerAligned(byte[] encodedBytes) {
    mncType result = new mncType();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  
  @Override public mncType.mncTypeComponentType createAndAddValue() {
    mncType.mncTypeComponentType value = new mncType.mncTypeComponentType();
    add(value);
    return value;
  }

 // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class mncTypeComponentType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_mncTypeComponentType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public mncTypeComponentType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("9"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_mncTypeComponentType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_mncTypeComponentType != null) {
      return ImmutableList.of(TAG_mncTypeComponentType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new mncTypeComponentType from encoded stream.
   */
  public static mncTypeComponentType fromPerUnaligned(byte[] encodedBytes) {
    mncTypeComponentType result = new mncTypeComponentType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new mncTypeComponentType from encoded stream.
   */
  public static mncTypeComponentType fromPerAligned(byte[] encodedBytes) {
    mncTypeComponentType result = new mncTypeComponentType();
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
    return "mncTypeComponentType = " + getInteger() + ";\n";
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
    builder.append("mncType = [\n");
    final String internalIndent = indent + "  ";
    for (mncType.mncTypeComponentType value : getValues()) {
      builder.append(internalIndent)
          .append(value.toIndentedString(internalIndent));
    }
    builder.append(indent).append("];\n");
    return builder.toString();
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
    builder.append("plmn_IdentityType = {\n");
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
public static class cellIdentityType extends Asn1Choice {
  //

  private static final Asn1Tag TAG_cellIdentityType
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
            "cellIdentityType: " + tag + " maps to both " + select0 + " and " + select);
        }
      }
    }
  }

  public cellIdentityType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_cellIdentityType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_cellIdentityType != null) {
      return ImmutableList.of(TAG_cellIdentityType);
    } else {
      return tagToSelection.keySet();
    }
  }

  /**
   * Creates a new cellIdentityType from encoded stream.
   */
  public static cellIdentityType fromPerUnaligned(byte[] encodedBytes) {
    cellIdentityType result = new cellIdentityType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new cellIdentityType from encoded stream.
   */
  public static cellIdentityType fromPerAligned(byte[] encodedBytes) {
    cellIdentityType result = new cellIdentityType();
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
    
    $Eutra(Asn1Tag.fromClassAndNumber(2, 0),
        true) {
      @Override
      public Asn1Object createElement() {
        return new cellIdentityType.eutraType();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? cellIdentityType.eutraType.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $Utra(Asn1Tag.fromClassAndNumber(2, 1),
        true) {
      @Override
      public Asn1Object createElement() {
        return new cellIdentityType.utraType();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? cellIdentityType.utraType.getPossibleFirstTags() : ImmutableList.of(tag);
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
public static class eutraType extends Asn1BitString {
  //

  // defined bit positions, if any
  

  // setters
  

  // clearers
  


  private static final Asn1Tag TAG_eutraType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public eutraType() {
    super();
    setMinSize(28);
setMaxSize(28);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_eutraType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_eutraType != null) {
      return ImmutableList.of(TAG_eutraType);
    } else {
      return Asn1BitString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new eutraType from encoded stream.
   */
  public static eutraType fromPerUnaligned(byte[] encodedBytes) {
    eutraType result = new eutraType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new eutraType from encoded stream.
   */
  public static eutraType fromPerAligned(byte[] encodedBytes) {
    eutraType result = new eutraType();
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
    return "eutraType = " + getValue() + ";\n";
  }
}


  public boolean isEutra() {
    return !hasExtensionValue() && Select.$Eutra == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isEutra}.
   */
  @SuppressWarnings("unchecked")
  public cellIdentityType.eutraType getEutra() {
    if (!isEutra()) {
      throw new IllegalStateException("cellIdentityType value not a Eutra");
    }
    return (cellIdentityType.eutraType) element;
  }

  public void setEutra(cellIdentityType.eutraType selected) {
    selection = Select.$Eutra;
    extension = false;
    element = selected;
  }

  public cellIdentityType.eutraType setEutraToNewInstance() {
      cellIdentityType.eutraType element = new cellIdentityType.eutraType();
      setEutra(element);
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
public static class utraType extends Asn1BitString {
  //

  // defined bit positions, if any
  

  // setters
  

  // clearers
  


  private static final Asn1Tag TAG_utraType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public utraType() {
    super();
    setMinSize(32);
setMaxSize(32);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_utraType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_utraType != null) {
      return ImmutableList.of(TAG_utraType);
    } else {
      return Asn1BitString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new utraType from encoded stream.
   */
  public static utraType fromPerUnaligned(byte[] encodedBytes) {
    utraType result = new utraType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new utraType from encoded stream.
   */
  public static utraType fromPerAligned(byte[] encodedBytes) {
    utraType result = new utraType();
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
    return "utraType = " + getValue() + ";\n";
  }
}


  public boolean isUtra() {
    return !hasExtensionValue() && Select.$Utra == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isUtra}.
   */
  @SuppressWarnings("unchecked")
  public cellIdentityType.utraType getUtra() {
    if (!isUtra()) {
      throw new IllegalStateException("cellIdentityType value not a Utra");
    }
    return (cellIdentityType.utraType) element;
  }

  public void setUtra(cellIdentityType.utraType selected) {
    selection = Select.$Utra;
    extension = false;
    element = selected;
  }

  public cellIdentityType.utraType setUtraToNewInstance() {
      cellIdentityType.utraType element = new cellIdentityType.utraType();
      setUtra(element);
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
    return "cellIdentityType = " + elementIndentedString(indent) + indent + ";\n";
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
    builder.append("CellGlobalIdEUTRA_AndUTRA = {\n");
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
