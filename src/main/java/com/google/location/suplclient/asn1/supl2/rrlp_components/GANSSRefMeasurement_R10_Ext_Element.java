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
public  class GANSSRefMeasurement_R10_Ext_Element extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GANSSRefMeasurement_R10_Ext_Element
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GANSSRefMeasurement_R10_Ext_Element() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GANSSRefMeasurement_R10_Ext_Element;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GANSSRefMeasurement_R10_Ext_Element != null) {
      return ImmutableList.of(TAG_GANSSRefMeasurement_R10_Ext_Element);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GANSSRefMeasurement_R10_Ext_Element from encoded stream.
   */
  public static GANSSRefMeasurement_R10_Ext_Element fromPerUnaligned(byte[] encodedBytes) {
    GANSSRefMeasurement_R10_Ext_Element result = new GANSSRefMeasurement_R10_Ext_Element();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GANSSRefMeasurement_R10_Ext_Element from encoded stream.
   */
  public static GANSSRefMeasurement_R10_Ext_Element fromPerAligned(byte[] encodedBytes) {
    GANSSRefMeasurement_R10_Ext_Element result = new GANSSRefMeasurement_R10_Ext_Element();
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

  
  private SVID svID_;
  public SVID getSvID() {
    return svID_;
  }
  /**
   * @throws ClassCastException if value is not a SVID
   */
  public void setSvID(Asn1Object value) {
    this.svID_ = (SVID) value;
  }
  public SVID setSvIDToNewInstance() {
    svID_ = new SVID();
    return svID_;
  }
  
  private GANSSRefMeasurement_R10_Ext_Element.azimuthLSBType azimuthLSB_;
  public GANSSRefMeasurement_R10_Ext_Element.azimuthLSBType getAzimuthLSB() {
    return azimuthLSB_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSRefMeasurement_R10_Ext_Element.azimuthLSBType
   */
  public void setAzimuthLSB(Asn1Object value) {
    this.azimuthLSB_ = (GANSSRefMeasurement_R10_Ext_Element.azimuthLSBType) value;
  }
  public GANSSRefMeasurement_R10_Ext_Element.azimuthLSBType setAzimuthLSBToNewInstance() {
    azimuthLSB_ = new GANSSRefMeasurement_R10_Ext_Element.azimuthLSBType();
    return azimuthLSB_;
  }
  
  private GANSSRefMeasurement_R10_Ext_Element.elevationLSBType elevationLSB_;
  public GANSSRefMeasurement_R10_Ext_Element.elevationLSBType getElevationLSB() {
    return elevationLSB_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSRefMeasurement_R10_Ext_Element.elevationLSBType
   */
  public void setElevationLSB(Asn1Object value) {
    this.elevationLSB_ = (GANSSRefMeasurement_R10_Ext_Element.elevationLSBType) value;
  }
  public GANSSRefMeasurement_R10_Ext_Element.elevationLSBType setElevationLSBToNewInstance() {
    elevationLSB_ = new GANSSRefMeasurement_R10_Ext_Element.elevationLSBType();
    return elevationLSB_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getSvID() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getSvID();
          }

          @Override public void setToNewInstance() {
            setSvIDToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SVID.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "svID : "
                    + getSvID().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getAzimuthLSB() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getAzimuthLSB();
          }

          @Override public void setToNewInstance() {
            setAzimuthLSBToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSRefMeasurement_R10_Ext_Element.azimuthLSBType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "azimuthLSB : "
                    + getAzimuthLSB().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getElevationLSB() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getElevationLSB();
          }

          @Override public void setToNewInstance() {
            setElevationLSBToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSRefMeasurement_R10_Ext_Element.elevationLSBType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "elevationLSB : "
                    + getElevationLSB().toIndentedString(indent);
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
public static class azimuthLSBType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_azimuthLSBType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public azimuthLSBType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("15"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_azimuthLSBType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_azimuthLSBType != null) {
      return ImmutableList.of(TAG_azimuthLSBType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new azimuthLSBType from encoded stream.
   */
  public static azimuthLSBType fromPerUnaligned(byte[] encodedBytes) {
    azimuthLSBType result = new azimuthLSBType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new azimuthLSBType from encoded stream.
   */
  public static azimuthLSBType fromPerAligned(byte[] encodedBytes) {
    azimuthLSBType result = new azimuthLSBType();
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
    return "azimuthLSBType = " + getInteger() + ";\n";
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
public static class elevationLSBType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_elevationLSBType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public elevationLSBType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("15"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_elevationLSBType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_elevationLSBType != null) {
      return ImmutableList.of(TAG_elevationLSBType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new elevationLSBType from encoded stream.
   */
  public static elevationLSBType fromPerUnaligned(byte[] encodedBytes) {
    elevationLSBType result = new elevationLSBType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new elevationLSBType from encoded stream.
   */
  public static elevationLSBType fromPerAligned(byte[] encodedBytes) {
    elevationLSBType result = new elevationLSBType();
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
    return "elevationLSBType = " + getInteger() + ";\n";
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
    builder.append("GANSSRefMeasurement_R10_Ext_Element = {\n");
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
