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
import com.google.location.suplclient.asn1.base.Asn1Integer;
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
public  class CellMeasuredResults extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_CellMeasuredResults
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public CellMeasuredResults() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_CellMeasuredResults;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_CellMeasuredResults != null) {
      return ImmutableList.of(TAG_CellMeasuredResults);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new CellMeasuredResults from encoded stream.
   */
  public static CellMeasuredResults fromPerUnaligned(byte[] encodedBytes) {
    CellMeasuredResults result = new CellMeasuredResults();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new CellMeasuredResults from encoded stream.
   */
  public static CellMeasuredResults fromPerAligned(byte[] encodedBytes) {
    CellMeasuredResults result = new CellMeasuredResults();
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

  
  private CellMeasuredResults.cellIdentityType cellIdentity_;
  public CellMeasuredResults.cellIdentityType getCellIdentity() {
    return cellIdentity_;
  }
  /**
   * @throws ClassCastException if value is not a CellMeasuredResults.cellIdentityType
   */
  public void setCellIdentity(Asn1Object value) {
    this.cellIdentity_ = (CellMeasuredResults.cellIdentityType) value;
  }
  public CellMeasuredResults.cellIdentityType setCellIdentityToNewInstance() {
    cellIdentity_ = new CellMeasuredResults.cellIdentityType();
    return cellIdentity_;
  }
  
  private CellMeasuredResults.modeSpecificInfoType modeSpecificInfo_;
  public CellMeasuredResults.modeSpecificInfoType getModeSpecificInfo() {
    return modeSpecificInfo_;
  }
  /**
   * @throws ClassCastException if value is not a CellMeasuredResults.modeSpecificInfoType
   */
  public void setModeSpecificInfo(Asn1Object value) {
    this.modeSpecificInfo_ = (CellMeasuredResults.modeSpecificInfoType) value;
  }
  public CellMeasuredResults.modeSpecificInfoType setModeSpecificInfoToNewInstance() {
    modeSpecificInfo_ = new CellMeasuredResults.modeSpecificInfoType();
    return modeSpecificInfo_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getCellIdentity() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getCellIdentity();
          }

          @Override public void setToNewInstance() {
            setCellIdentityToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? CellMeasuredResults.cellIdentityType.getPossibleFirstTags() : ImmutableList.of(tag);
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
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

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
            return tag == null ? CellMeasuredResults.modeSpecificInfoType.getPossibleFirstTags() : ImmutableList.of(tag);
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
public static class cellIdentityType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_cellIdentityType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public cellIdentityType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("268435455"));

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
      return Asn1Integer.getPossibleFirstTags();
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
    return "cellIdentityType = " + getInteger() + ";\n";
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

  
  private PrimaryCPICH_Info primaryCPICH_Info_;
  public PrimaryCPICH_Info getPrimaryCPICH_Info() {
    return primaryCPICH_Info_;
  }
  /**
   * @throws ClassCastException if value is not a PrimaryCPICH_Info
   */
  public void setPrimaryCPICH_Info(Asn1Object value) {
    this.primaryCPICH_Info_ = (PrimaryCPICH_Info) value;
  }
  public PrimaryCPICH_Info setPrimaryCPICH_InfoToNewInstance() {
    primaryCPICH_Info_ = new PrimaryCPICH_Info();
    return primaryCPICH_Info_;
  }
  
  private CPICH_Ec_N0 cpich_Ec_N0_;
  public CPICH_Ec_N0 getCpich_Ec_N0() {
    return cpich_Ec_N0_;
  }
  /**
   * @throws ClassCastException if value is not a CPICH_Ec_N0
   */
  public void setCpich_Ec_N0(Asn1Object value) {
    this.cpich_Ec_N0_ = (CPICH_Ec_N0) value;
  }
  public CPICH_Ec_N0 setCpich_Ec_N0ToNewInstance() {
    cpich_Ec_N0_ = new CPICH_Ec_N0();
    return cpich_Ec_N0_;
  }
  
  private CPICH_RSCP cpich_RSCP_;
  public CPICH_RSCP getCpich_RSCP() {
    return cpich_RSCP_;
  }
  /**
   * @throws ClassCastException if value is not a CPICH_RSCP
   */
  public void setCpich_RSCP(Asn1Object value) {
    this.cpich_RSCP_ = (CPICH_RSCP) value;
  }
  public CPICH_RSCP setCpich_RSCPToNewInstance() {
    cpich_RSCP_ = new CPICH_RSCP();
    return cpich_RSCP_;
  }
  
  private Pathloss pathloss_;
  public Pathloss getPathloss() {
    return pathloss_;
  }
  /**
   * @throws ClassCastException if value is not a Pathloss
   */
  public void setPathloss(Asn1Object value) {
    this.pathloss_ = (Pathloss) value;
  }
  public Pathloss setPathlossToNewInstance() {
    pathloss_ = new Pathloss();
    return pathloss_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getPrimaryCPICH_Info() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getPrimaryCPICH_Info();
          }

          @Override public void setToNewInstance() {
            setPrimaryCPICH_InfoToNewInstance();
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
                return "primaryCPICH_Info : "
                    + getPrimaryCPICH_Info().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getCpich_Ec_N0() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getCpich_Ec_N0();
          }

          @Override public void setToNewInstance() {
            setCpich_Ec_N0ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? CPICH_Ec_N0.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "cpich_Ec_N0 : "
                    + getCpich_Ec_N0().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getCpich_RSCP() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getCpich_RSCP();
          }

          @Override public void setToNewInstance() {
            setCpich_RSCPToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? CPICH_RSCP.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "cpich_RSCP : "
                    + getCpich_RSCP().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getPathloss() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getPathloss();
          }

          @Override public void setToNewInstance() {
            setPathlossToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Pathloss.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "pathloss : "
                    + getPathloss().toIndentedString(indent);
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

  
  private CellParametersID cellParametersID_;
  public CellParametersID getCellParametersID() {
    return cellParametersID_;
  }
  /**
   * @throws ClassCastException if value is not a CellParametersID
   */
  public void setCellParametersID(Asn1Object value) {
    this.cellParametersID_ = (CellParametersID) value;
  }
  public CellParametersID setCellParametersIDToNewInstance() {
    cellParametersID_ = new CellParametersID();
    return cellParametersID_;
  }
  
  private TGSN proposedTGSN_;
  public TGSN getProposedTGSN() {
    return proposedTGSN_;
  }
  /**
   * @throws ClassCastException if value is not a TGSN
   */
  public void setProposedTGSN(Asn1Object value) {
    this.proposedTGSN_ = (TGSN) value;
  }
  public TGSN setProposedTGSNToNewInstance() {
    proposedTGSN_ = new TGSN();
    return proposedTGSN_;
  }
  
  private PrimaryCCPCH_RSCP primaryCCPCH_RSCP_;
  public PrimaryCCPCH_RSCP getPrimaryCCPCH_RSCP() {
    return primaryCCPCH_RSCP_;
  }
  /**
   * @throws ClassCastException if value is not a PrimaryCCPCH_RSCP
   */
  public void setPrimaryCCPCH_RSCP(Asn1Object value) {
    this.primaryCCPCH_RSCP_ = (PrimaryCCPCH_RSCP) value;
  }
  public PrimaryCCPCH_RSCP setPrimaryCCPCH_RSCPToNewInstance() {
    primaryCCPCH_RSCP_ = new PrimaryCCPCH_RSCP();
    return primaryCCPCH_RSCP_;
  }
  
  private Pathloss pathloss_;
  public Pathloss getPathloss() {
    return pathloss_;
  }
  /**
   * @throws ClassCastException if value is not a Pathloss
   */
  public void setPathloss(Asn1Object value) {
    this.pathloss_ = (Pathloss) value;
  }
  public Pathloss setPathlossToNewInstance() {
    pathloss_ = new Pathloss();
    return pathloss_;
  }
  
  private TimeslotISCP_List timeslotISCP_List_;
  public TimeslotISCP_List getTimeslotISCP_List() {
    return timeslotISCP_List_;
  }
  /**
   * @throws ClassCastException if value is not a TimeslotISCP_List
   */
  public void setTimeslotISCP_List(Asn1Object value) {
    this.timeslotISCP_List_ = (TimeslotISCP_List) value;
  }
  public TimeslotISCP_List setTimeslotISCP_ListToNewInstance() {
    timeslotISCP_List_ = new TimeslotISCP_List();
    return timeslotISCP_List_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getCellParametersID() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCellParametersID();
          }

          @Override public void setToNewInstance() {
            setCellParametersIDToNewInstance();
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
                return "cellParametersID : "
                    + getCellParametersID().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getProposedTGSN() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getProposedTGSN();
          }

          @Override public void setToNewInstance() {
            setProposedTGSNToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? TGSN.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "proposedTGSN : "
                    + getProposedTGSN().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getPrimaryCCPCH_RSCP() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getPrimaryCCPCH_RSCP();
          }

          @Override public void setToNewInstance() {
            setPrimaryCCPCH_RSCPToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? PrimaryCCPCH_RSCP.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "primaryCCPCH_RSCP : "
                    + getPrimaryCCPCH_RSCP().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getPathloss() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getPathloss();
          }

          @Override public void setToNewInstance() {
            setPathlossToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Pathloss.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "pathloss : "
                    + getPathloss().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getTimeslotISCP_List() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getTimeslotISCP_List();
          }

          @Override public void setToNewInstance() {
            setTimeslotISCP_ListToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? TimeslotISCP_List.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "timeslotISCP_List : "
                    + getTimeslotISCP_List().toIndentedString(indent);
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
    builder.append("CellMeasuredResults = {\n");
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
