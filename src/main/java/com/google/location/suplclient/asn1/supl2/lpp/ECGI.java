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
public  class ECGI extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_ECGI
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ECGI() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ECGI;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ECGI != null) {
      return ImmutableList.of(TAG_ECGI);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ECGI from encoded stream.
   */
  public static ECGI fromPerUnaligned(byte[] encodedBytes) {
    ECGI result = new ECGI();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ECGI from encoded stream.
   */
  public static ECGI fromPerAligned(byte[] encodedBytes) {
    ECGI result = new ECGI();
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

  
  private ECGI.mccType mcc_;
  public ECGI.mccType getMcc() {
    return mcc_;
  }
  /**
   * @throws ClassCastException if value is not a ECGI.mccType
   */
  public void setMcc(Asn1Object value) {
    this.mcc_ = (ECGI.mccType) value;
  }
  public ECGI.mccType setMccToNewInstance() {
    mcc_ = new ECGI.mccType();
    return mcc_;
  }
  
  private ECGI.mncType mnc_;
  public ECGI.mncType getMnc() {
    return mnc_;
  }
  /**
   * @throws ClassCastException if value is not a ECGI.mncType
   */
  public void setMnc(Asn1Object value) {
    this.mnc_ = (ECGI.mncType) value;
  }
  public ECGI.mncType setMncToNewInstance() {
    mnc_ = new ECGI.mncType();
    return mnc_;
  }
  
  private ECGI.cellidentityType cellidentity_;
  public ECGI.cellidentityType getCellidentity() {
    return cellidentity_;
  }
  /**
   * @throws ClassCastException if value is not a ECGI.cellidentityType
   */
  public void setCellidentity(Asn1Object value) {
    this.cellidentity_ = (ECGI.cellidentityType) value;
  }
  public ECGI.cellidentityType setCellidentityToNewInstance() {
    cellidentity_ = new ECGI.cellidentityType();
    return cellidentity_;
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
            return tag == null ? ECGI.mccType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? ECGI.mncType.getPossibleFirstTags() : ImmutableList.of(tag);
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
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getCellidentity() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCellidentity();
          }

          @Override public void setToNewInstance() {
            setCellidentityToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ECGI.cellidentityType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "cellidentity : "
                    + getCellidentity().toIndentedString(indent);
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

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class cellidentityType extends Asn1BitString {
  //

  // defined bit positions, if any
  

  // setters
  

  // clearers
  


  private static final Asn1Tag TAG_cellidentityType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public cellidentityType() {
    super();
    setMinSize(28);
setMaxSize(28);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_cellidentityType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_cellidentityType != null) {
      return ImmutableList.of(TAG_cellidentityType);
    } else {
      return Asn1BitString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new cellidentityType from encoded stream.
   */
  public static cellidentityType fromPerUnaligned(byte[] encodedBytes) {
    cellidentityType result = new cellidentityType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new cellidentityType from encoded stream.
   */
  public static cellidentityType fromPerAligned(byte[] encodedBytes) {
    cellidentityType result = new cellidentityType();
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
    return "cellidentityType = " + getValue() + ";\n";
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
    builder.append("ECGI = {\n");
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
