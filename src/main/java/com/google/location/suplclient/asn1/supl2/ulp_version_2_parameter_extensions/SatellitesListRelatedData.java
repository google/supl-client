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

package com.google.location.suplclient.asn1.supl2.ulp_version_2_parameter_extensions;

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
public  class SatellitesListRelatedData extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_SatellitesListRelatedData
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public SatellitesListRelatedData() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_SatellitesListRelatedData;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_SatellitesListRelatedData != null) {
      return ImmutableList.of(TAG_SatellitesListRelatedData);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new SatellitesListRelatedData from encoded stream.
   */
  public static SatellitesListRelatedData fromPerUnaligned(byte[] encodedBytes) {
    SatellitesListRelatedData result = new SatellitesListRelatedData();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new SatellitesListRelatedData from encoded stream.
   */
  public static SatellitesListRelatedData fromPerAligned(byte[] encodedBytes) {
    SatellitesListRelatedData result = new SatellitesListRelatedData();
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

  
  private SatellitesListRelatedData.satIdType satId_;
  public SatellitesListRelatedData.satIdType getSatId() {
    return satId_;
  }
  /**
   * @throws ClassCastException if value is not a SatellitesListRelatedData.satIdType
   */
  public void setSatId(Asn1Object value) {
    this.satId_ = (SatellitesListRelatedData.satIdType) value;
  }
  public SatellitesListRelatedData.satIdType setSatIdToNewInstance() {
    satId_ = new SatellitesListRelatedData.satIdType();
    return satId_;
  }
  
  private SatellitesListRelatedData.iodType iod_;
  public SatellitesListRelatedData.iodType getIod() {
    return iod_;
  }
  /**
   * @throws ClassCastException if value is not a SatellitesListRelatedData.iodType
   */
  public void setIod(Asn1Object value) {
    this.iod_ = (SatellitesListRelatedData.iodType) value;
  }
  public SatellitesListRelatedData.iodType setIodToNewInstance() {
    iod_ = new SatellitesListRelatedData.iodType();
    return iod_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getSatId() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getSatId();
          }

          @Override public void setToNewInstance() {
            setSatIdToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SatellitesListRelatedData.satIdType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "satId : "
                    + getSatId().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getIod() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getIod();
          }

          @Override public void setToNewInstance() {
            setIodToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SatellitesListRelatedData.iodType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "iod : "
                    + getIod().toIndentedString(indent);
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
public static class satIdType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_satIdType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public satIdType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("63"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_satIdType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_satIdType != null) {
      return ImmutableList.of(TAG_satIdType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new satIdType from encoded stream.
   */
  public static satIdType fromPerUnaligned(byte[] encodedBytes) {
    satIdType result = new satIdType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new satIdType from encoded stream.
   */
  public static satIdType fromPerAligned(byte[] encodedBytes) {
    satIdType result = new satIdType();
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
    return "satIdType = " + getInteger() + ";\n";
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
public static class iodType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_iodType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public iodType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("1023"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_iodType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_iodType != null) {
      return ImmutableList.of(TAG_iodType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new iodType from encoded stream.
   */
  public static iodType fromPerUnaligned(byte[] encodedBytes) {
    iodType result = new iodType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new iodType from encoded stream.
   */
  public static iodType fromPerAligned(byte[] encodedBytes) {
    iodType result = new iodType();
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
    return "iodType = " + getInteger() + ";\n";
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
    builder.append("SatellitesListRelatedData = {\n");
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
