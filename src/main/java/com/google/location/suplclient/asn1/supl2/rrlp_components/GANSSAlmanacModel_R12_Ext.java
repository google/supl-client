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
public  class GANSSAlmanacModel_R12_Ext extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GANSSAlmanacModel_R12_Ext
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GANSSAlmanacModel_R12_Ext() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GANSSAlmanacModel_R12_Ext;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GANSSAlmanacModel_R12_Ext != null) {
      return ImmutableList.of(TAG_GANSSAlmanacModel_R12_Ext);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GANSSAlmanacModel_R12_Ext from encoded stream.
   */
  public static GANSSAlmanacModel_R12_Ext fromPerUnaligned(byte[] encodedBytes) {
    GANSSAlmanacModel_R12_Ext result = new GANSSAlmanacModel_R12_Ext();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GANSSAlmanacModel_R12_Ext from encoded stream.
   */
  public static GANSSAlmanacModel_R12_Ext fromPerAligned(byte[] encodedBytes) {
    GANSSAlmanacModel_R12_Ext result = new GANSSAlmanacModel_R12_Ext();
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

  
  private GANSSAlmanacModel_R12_Ext.toa_extType toa_ext_;
  public GANSSAlmanacModel_R12_Ext.toa_extType getToa_ext() {
    return toa_ext_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSAlmanacModel_R12_Ext.toa_extType
   */
  public void setToa_ext(Asn1Object value) {
    this.toa_ext_ = (GANSSAlmanacModel_R12_Ext.toa_extType) value;
  }
  public GANSSAlmanacModel_R12_Ext.toa_extType setToa_extToNewInstance() {
    toa_ext_ = new GANSSAlmanacModel_R12_Ext.toa_extType();
    return toa_ext_;
  }
  
  private GANSSAlmanacModel_R12_Ext.ioda_extType ioda_ext_;
  public GANSSAlmanacModel_R12_Ext.ioda_extType getIoda_ext() {
    return ioda_ext_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSAlmanacModel_R12_Ext.ioda_extType
   */
  public void setIoda_ext(Asn1Object value) {
    this.ioda_ext_ = (GANSSAlmanacModel_R12_Ext.ioda_extType) value;
  }
  public GANSSAlmanacModel_R12_Ext.ioda_extType setIoda_extToNewInstance() {
    ioda_ext_ = new GANSSAlmanacModel_R12_Ext.ioda_extType();
    return ioda_ext_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getToa_ext() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getToa_ext();
          }

          @Override public void setToNewInstance() {
            setToa_extToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSAlmanacModel_R12_Ext.toa_extType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "toa_ext : "
                    + getToa_ext().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getIoda_ext() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getIoda_ext();
          }

          @Override public void setToNewInstance() {
            setIoda_extToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSAlmanacModel_R12_Ext.ioda_extType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ioda_ext : "
                    + getIoda_ext().toIndentedString(indent);
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
public static class toa_extType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_toa_extType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public toa_extType() {
    super();
    setValueRange(new java.math.BigInteger("256"), new java.math.BigInteger("1023"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_toa_extType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_toa_extType != null) {
      return ImmutableList.of(TAG_toa_extType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new toa_extType from encoded stream.
   */
  public static toa_extType fromPerUnaligned(byte[] encodedBytes) {
    toa_extType result = new toa_extType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new toa_extType from encoded stream.
   */
  public static toa_extType fromPerAligned(byte[] encodedBytes) {
    toa_extType result = new toa_extType();
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
    return "toa_extType = " + getInteger() + ";\n";
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
public static class ioda_extType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ioda_extType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ioda_extType() {
    super();
    setValueRange(new java.math.BigInteger("4"), new java.math.BigInteger("15"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ioda_extType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ioda_extType != null) {
      return ImmutableList.of(TAG_ioda_extType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ioda_extType from encoded stream.
   */
  public static ioda_extType fromPerUnaligned(byte[] encodedBytes) {
    ioda_extType result = new ioda_extType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ioda_extType from encoded stream.
   */
  public static ioda_extType fromPerAligned(byte[] encodedBytes) {
    ioda_extType result = new ioda_extType();
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
    return "ioda_extType = " + getInteger() + ";\n";
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
    builder.append("GANSSAlmanacModel_R12_Ext = {\n");
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
