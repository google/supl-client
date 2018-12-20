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
public  class DGPSExtensionSatElement extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_DGPSExtensionSatElement
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public DGPSExtensionSatElement() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_DGPSExtensionSatElement;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_DGPSExtensionSatElement != null) {
      return ImmutableList.of(TAG_DGPSExtensionSatElement);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new DGPSExtensionSatElement from encoded stream.
   */
  public static DGPSExtensionSatElement fromPerUnaligned(byte[] encodedBytes) {
    DGPSExtensionSatElement result = new DGPSExtensionSatElement();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new DGPSExtensionSatElement from encoded stream.
   */
  public static DGPSExtensionSatElement fromPerAligned(byte[] encodedBytes) {
    DGPSExtensionSatElement result = new DGPSExtensionSatElement();
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

  
  private SatelliteID satelliteID_;
  public SatelliteID getSatelliteID() {
    return satelliteID_;
  }
  /**
   * @throws ClassCastException if value is not a SatelliteID
   */
  public void setSatelliteID(Asn1Object value) {
    this.satelliteID_ = (SatelliteID) value;
  }
  public SatelliteID setSatelliteIDToNewInstance() {
    satelliteID_ = new SatelliteID();
    return satelliteID_;
  }
  
  private DGPSExtensionSatElement.udreGrowthRateType udreGrowthRate_;
  public DGPSExtensionSatElement.udreGrowthRateType getUdreGrowthRate() {
    return udreGrowthRate_;
  }
  /**
   * @throws ClassCastException if value is not a DGPSExtensionSatElement.udreGrowthRateType
   */
  public void setUdreGrowthRate(Asn1Object value) {
    this.udreGrowthRate_ = (DGPSExtensionSatElement.udreGrowthRateType) value;
  }
  public DGPSExtensionSatElement.udreGrowthRateType setUdreGrowthRateToNewInstance() {
    udreGrowthRate_ = new DGPSExtensionSatElement.udreGrowthRateType();
    return udreGrowthRate_;
  }
  
  private DGPSExtensionSatElement.udreValidityTimeType udreValidityTime_;
  public DGPSExtensionSatElement.udreValidityTimeType getUdreValidityTime() {
    return udreValidityTime_;
  }
  /**
   * @throws ClassCastException if value is not a DGPSExtensionSatElement.udreValidityTimeType
   */
  public void setUdreValidityTime(Asn1Object value) {
    this.udreValidityTime_ = (DGPSExtensionSatElement.udreValidityTimeType) value;
  }
  public DGPSExtensionSatElement.udreValidityTimeType setUdreValidityTimeToNewInstance() {
    udreValidityTime_ = new DGPSExtensionSatElement.udreValidityTimeType();
    return udreValidityTime_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getSatelliteID() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getSatelliteID();
          }

          @Override public void setToNewInstance() {
            setSatelliteIDToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SatelliteID.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "satelliteID : "
                    + getSatelliteID().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getUdreGrowthRate() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getUdreGrowthRate();
          }

          @Override public void setToNewInstance() {
            setUdreGrowthRateToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? DGPSExtensionSatElement.udreGrowthRateType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "udreGrowthRate : "
                    + getUdreGrowthRate().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getUdreValidityTime() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getUdreValidityTime();
          }

          @Override public void setToNewInstance() {
            setUdreValidityTimeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? DGPSExtensionSatElement.udreValidityTimeType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "udreValidityTime : "
                    + getUdreValidityTime().toIndentedString(indent);
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
public static class udreGrowthRateType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_udreGrowthRateType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public udreGrowthRateType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("7"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_udreGrowthRateType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_udreGrowthRateType != null) {
      return ImmutableList.of(TAG_udreGrowthRateType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new udreGrowthRateType from encoded stream.
   */
  public static udreGrowthRateType fromPerUnaligned(byte[] encodedBytes) {
    udreGrowthRateType result = new udreGrowthRateType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new udreGrowthRateType from encoded stream.
   */
  public static udreGrowthRateType fromPerAligned(byte[] encodedBytes) {
    udreGrowthRateType result = new udreGrowthRateType();
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
    return "udreGrowthRateType = " + getInteger() + ";\n";
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
public static class udreValidityTimeType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_udreValidityTimeType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public udreValidityTimeType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("7"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_udreValidityTimeType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_udreValidityTimeType != null) {
      return ImmutableList.of(TAG_udreValidityTimeType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new udreValidityTimeType from encoded stream.
   */
  public static udreValidityTimeType fromPerUnaligned(byte[] encodedBytes) {
    udreValidityTimeType result = new udreValidityTimeType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new udreValidityTimeType from encoded stream.
   */
  public static udreValidityTimeType fromPerAligned(byte[] encodedBytes) {
    udreValidityTimeType result = new udreValidityTimeType();
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
    return "udreValidityTimeType = " + getInteger() + ";\n";
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
    builder.append("DGPSExtensionSatElement = {\n");
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
