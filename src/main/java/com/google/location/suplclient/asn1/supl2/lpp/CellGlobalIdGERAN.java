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
import com.google.location.suplclient.asn1.base.Asn1Integer;
import com.google.location.suplclient.asn1.base.Asn1Object;
import com.google.location.suplclient.asn1.base.Asn1Sequence;
import com.google.location.suplclient.asn1.base.Asn1SequenceOf;
import com.google.location.suplclient.asn1.base.Asn1Tag;
import com.google.location.suplclient.asn1.base.BitStream;
import com.google.location.suplclient.asn1.base.BitStreamReader;
import com.google.location.suplclient.asn1.base.SequenceComponent;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
* 
*/
public  class CellGlobalIdGERAN extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_CellGlobalIdGERAN
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public CellGlobalIdGERAN() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_CellGlobalIdGERAN;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_CellGlobalIdGERAN != null) {
      return ImmutableList.of(TAG_CellGlobalIdGERAN);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new CellGlobalIdGERAN from encoded stream.
   */
  public static CellGlobalIdGERAN fromPerUnaligned(byte[] encodedBytes) {
    CellGlobalIdGERAN result = new CellGlobalIdGERAN();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new CellGlobalIdGERAN from encoded stream.
   */
  public static CellGlobalIdGERAN fromPerAligned(byte[] encodedBytes) {
    CellGlobalIdGERAN result = new CellGlobalIdGERAN();
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

  
  private CellGlobalIdGERAN.plmn_IdentityType plmn_Identity_;
  public CellGlobalIdGERAN.plmn_IdentityType getPlmn_Identity() {
    return plmn_Identity_;
  }
  /**
   * @throws ClassCastException if value is not a CellGlobalIdGERAN.plmn_IdentityType
   */
  public void setPlmn_Identity(Asn1Object value) {
    this.plmn_Identity_ = (CellGlobalIdGERAN.plmn_IdentityType) value;
  }
  public CellGlobalIdGERAN.plmn_IdentityType setPlmn_IdentityToNewInstance() {
    plmn_Identity_ = new CellGlobalIdGERAN.plmn_IdentityType();
    return plmn_Identity_;
  }
  
  private CellGlobalIdGERAN.locationAreaCodeType locationAreaCode_;
  public CellGlobalIdGERAN.locationAreaCodeType getLocationAreaCode() {
    return locationAreaCode_;
  }
  /**
   * @throws ClassCastException if value is not a CellGlobalIdGERAN.locationAreaCodeType
   */
  public void setLocationAreaCode(Asn1Object value) {
    this.locationAreaCode_ = (CellGlobalIdGERAN.locationAreaCodeType) value;
  }
  public CellGlobalIdGERAN.locationAreaCodeType setLocationAreaCodeToNewInstance() {
    locationAreaCode_ = new CellGlobalIdGERAN.locationAreaCodeType();
    return locationAreaCode_;
  }
  
  private CellGlobalIdGERAN.cellIdentityType cellIdentity_;
  public CellGlobalIdGERAN.cellIdentityType getCellIdentity() {
    return cellIdentity_;
  }
  /**
   * @throws ClassCastException if value is not a CellGlobalIdGERAN.cellIdentityType
   */
  public void setCellIdentity(Asn1Object value) {
    this.cellIdentity_ = (CellGlobalIdGERAN.cellIdentityType) value;
  }
  public CellGlobalIdGERAN.cellIdentityType setCellIdentityToNewInstance() {
    cellIdentity_ = new CellGlobalIdGERAN.cellIdentityType();
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
            return tag == null ? CellGlobalIdGERAN.plmn_IdentityType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return getLocationAreaCode() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getLocationAreaCode();
          }

          @Override public void setToNewInstance() {
            setLocationAreaCodeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? CellGlobalIdGERAN.locationAreaCodeType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "locationAreaCode : "
                    + getLocationAreaCode().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

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
            return tag == null ? CellGlobalIdGERAN.cellIdentityType.getPossibleFirstTags() : ImmutableList.of(tag);
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
public static class locationAreaCodeType extends Asn1BitString {
  //

  // defined bit positions, if any
  

  // setters
  

  // clearers
  


  private static final Asn1Tag TAG_locationAreaCodeType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public locationAreaCodeType() {
    super();
    setMinSize(16);
setMaxSize(16);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_locationAreaCodeType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_locationAreaCodeType != null) {
      return ImmutableList.of(TAG_locationAreaCodeType);
    } else {
      return Asn1BitString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new locationAreaCodeType from encoded stream.
   */
  public static locationAreaCodeType fromPerUnaligned(byte[] encodedBytes) {
    locationAreaCodeType result = new locationAreaCodeType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new locationAreaCodeType from encoded stream.
   */
  public static locationAreaCodeType fromPerAligned(byte[] encodedBytes) {
    locationAreaCodeType result = new locationAreaCodeType();
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
    return "locationAreaCodeType = " + getValue() + ";\n";
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
public static class cellIdentityType extends Asn1BitString {
  //

  // defined bit positions, if any
  

  // setters
  

  // clearers
  


  private static final Asn1Tag TAG_cellIdentityType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public cellIdentityType() {
    super();
    setMinSize(16);
setMaxSize(16);

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
      return Asn1BitString.getPossibleFirstTags();
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
    return "cellIdentityType = " + getValue() + ";\n";
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
    builder.append("CellGlobalIdGERAN = {\n");
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
