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
public  class GANSSTimeModelElement_R10_Ext extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GANSSTimeModelElement_R10_Ext
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GANSSTimeModelElement_R10_Ext() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GANSSTimeModelElement_R10_Ext;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GANSSTimeModelElement_R10_Ext != null) {
      return ImmutableList.of(TAG_GANSSTimeModelElement_R10_Ext);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GANSSTimeModelElement_R10_Ext from encoded stream.
   */
  public static GANSSTimeModelElement_R10_Ext fromPerUnaligned(byte[] encodedBytes) {
    GANSSTimeModelElement_R10_Ext result = new GANSSTimeModelElement_R10_Ext();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GANSSTimeModelElement_R10_Ext from encoded stream.
   */
  public static GANSSTimeModelElement_R10_Ext fromPerAligned(byte[] encodedBytes) {
    GANSSTimeModelElement_R10_Ext result = new GANSSTimeModelElement_R10_Ext();
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

  
  private GANSSTimeModelElement_R10_Ext.gnssTOIDType gnssTOID_;
  public GANSSTimeModelElement_R10_Ext.gnssTOIDType getGnssTOID() {
    return gnssTOID_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSTimeModelElement_R10_Ext.gnssTOIDType
   */
  public void setGnssTOID(Asn1Object value) {
    this.gnssTOID_ = (GANSSTimeModelElement_R10_Ext.gnssTOIDType) value;
  }
  public GANSSTimeModelElement_R10_Ext.gnssTOIDType setGnssTOIDToNewInstance() {
    gnssTOID_ = new GANSSTimeModelElement_R10_Ext.gnssTOIDType();
    return gnssTOID_;
  }
  
  private GANSSTimeModelElement_R10_Ext.deltaTType deltaT_;
  public GANSSTimeModelElement_R10_Ext.deltaTType getDeltaT() {
    return deltaT_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSTimeModelElement_R10_Ext.deltaTType
   */
  public void setDeltaT(Asn1Object value) {
    this.deltaT_ = (GANSSTimeModelElement_R10_Ext.deltaTType) value;
  }
  public GANSSTimeModelElement_R10_Ext.deltaTType setDeltaTToNewInstance() {
    deltaT_ = new GANSSTimeModelElement_R10_Ext.deltaTType();
    return deltaT_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getGnssTOID() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnssTOID();
          }

          @Override public void setToNewInstance() {
            setGnssTOIDToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSTimeModelElement_R10_Ext.gnssTOIDType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnssTOID : "
                    + getGnssTOID().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getDeltaT() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getDeltaT();
          }

          @Override public void setToNewInstance() {
            setDeltaTToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSTimeModelElement_R10_Ext.deltaTType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "deltaT : "
                    + getDeltaT().toIndentedString(indent);
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
public static class gnssTOIDType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_gnssTOIDType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gnssTOIDType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("7"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gnssTOIDType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gnssTOIDType != null) {
      return ImmutableList.of(TAG_gnssTOIDType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gnssTOIDType from encoded stream.
   */
  public static gnssTOIDType fromPerUnaligned(byte[] encodedBytes) {
    gnssTOIDType result = new gnssTOIDType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gnssTOIDType from encoded stream.
   */
  public static gnssTOIDType fromPerAligned(byte[] encodedBytes) {
    gnssTOIDType result = new gnssTOIDType();
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
    return "gnssTOIDType = " + getInteger() + ";\n";
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
public static class deltaTType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_deltaTType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public deltaTType() {
    super();
    setValueRange(new java.math.BigInteger("-128"), new java.math.BigInteger("127"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_deltaTType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_deltaTType != null) {
      return ImmutableList.of(TAG_deltaTType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new deltaTType from encoded stream.
   */
  public static deltaTType fromPerUnaligned(byte[] encodedBytes) {
    deltaTType result = new deltaTType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new deltaTType from encoded stream.
   */
  public static deltaTType fromPerAligned(byte[] encodedBytes) {
    deltaTType result = new deltaTType();
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
    return "deltaTType = " + getInteger() + ";\n";
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
    builder.append("GANSSTimeModelElement_R10_Ext = {\n");
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
