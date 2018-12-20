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
import com.google.location.suplclient.asn1.base.Asn1Integer;
import com.google.location.suplclient.asn1.base.Asn1Object;
import com.google.location.suplclient.asn1.base.Asn1Sequence;
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
public  class BDS_DifferentialCorrections_r12 extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_BDS_DifferentialCorrections_r12
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public BDS_DifferentialCorrections_r12() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_BDS_DifferentialCorrections_r12;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_BDS_DifferentialCorrections_r12 != null) {
      return ImmutableList.of(TAG_BDS_DifferentialCorrections_r12);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new BDS_DifferentialCorrections_r12 from encoded stream.
   */
  public static BDS_DifferentialCorrections_r12 fromPerUnaligned(byte[] encodedBytes) {
    BDS_DifferentialCorrections_r12 result = new BDS_DifferentialCorrections_r12();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new BDS_DifferentialCorrections_r12 from encoded stream.
   */
  public static BDS_DifferentialCorrections_r12 fromPerAligned(byte[] encodedBytes) {
    BDS_DifferentialCorrections_r12 result = new BDS_DifferentialCorrections_r12();
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

  
  private BDS_DifferentialCorrections_r12.dbds_RefTime_r12Type dbds_RefTime_r12_;
  public BDS_DifferentialCorrections_r12.dbds_RefTime_r12Type getDbds_RefTime_r12() {
    return dbds_RefTime_r12_;
  }
  /**
   * @throws ClassCastException if value is not a BDS_DifferentialCorrections_r12.dbds_RefTime_r12Type
   */
  public void setDbds_RefTime_r12(Asn1Object value) {
    this.dbds_RefTime_r12_ = (BDS_DifferentialCorrections_r12.dbds_RefTime_r12Type) value;
  }
  public BDS_DifferentialCorrections_r12.dbds_RefTime_r12Type setDbds_RefTime_r12ToNewInstance() {
    dbds_RefTime_r12_ = new BDS_DifferentialCorrections_r12.dbds_RefTime_r12Type();
    return dbds_RefTime_r12_;
  }
  
  private BDS_SgnTypeList_r12 bds_SgnTypeList_r12_;
  public BDS_SgnTypeList_r12 getBds_SgnTypeList_r12() {
    return bds_SgnTypeList_r12_;
  }
  /**
   * @throws ClassCastException if value is not a BDS_SgnTypeList_r12
   */
  public void setBds_SgnTypeList_r12(Asn1Object value) {
    this.bds_SgnTypeList_r12_ = (BDS_SgnTypeList_r12) value;
  }
  public BDS_SgnTypeList_r12 setBds_SgnTypeList_r12ToNewInstance() {
    bds_SgnTypeList_r12_ = new BDS_SgnTypeList_r12();
    return bds_SgnTypeList_r12_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getDbds_RefTime_r12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getDbds_RefTime_r12();
          }

          @Override public void setToNewInstance() {
            setDbds_RefTime_r12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? BDS_DifferentialCorrections_r12.dbds_RefTime_r12Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "dbds_RefTime_r12 : "
                    + getDbds_RefTime_r12().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getBds_SgnTypeList_r12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBds_SgnTypeList_r12();
          }

          @Override public void setToNewInstance() {
            setBds_SgnTypeList_r12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? BDS_SgnTypeList_r12.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bds_SgnTypeList_r12 : "
                    + getBds_SgnTypeList_r12().toIndentedString(indent);
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
public static class dbds_RefTime_r12Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_dbds_RefTime_r12Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public dbds_RefTime_r12Type() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("3599"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_dbds_RefTime_r12Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_dbds_RefTime_r12Type != null) {
      return ImmutableList.of(TAG_dbds_RefTime_r12Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new dbds_RefTime_r12Type from encoded stream.
   */
  public static dbds_RefTime_r12Type fromPerUnaligned(byte[] encodedBytes) {
    dbds_RefTime_r12Type result = new dbds_RefTime_r12Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new dbds_RefTime_r12Type from encoded stream.
   */
  public static dbds_RefTime_r12Type fromPerAligned(byte[] encodedBytes) {
    dbds_RefTime_r12Type result = new dbds_RefTime_r12Type();
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
    return "dbds_RefTime_r12Type = " + getInteger() + ";\n";
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
    builder.append("BDS_DifferentialCorrections_r12 = {\n");
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
