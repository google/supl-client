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
public  class AdditionalDopplerFields extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_AdditionalDopplerFields
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public AdditionalDopplerFields() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_AdditionalDopplerFields;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_AdditionalDopplerFields != null) {
      return ImmutableList.of(TAG_AdditionalDopplerFields);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new AdditionalDopplerFields from encoded stream.
   */
  public static AdditionalDopplerFields fromPerUnaligned(byte[] encodedBytes) {
    AdditionalDopplerFields result = new AdditionalDopplerFields();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new AdditionalDopplerFields from encoded stream.
   */
  public static AdditionalDopplerFields fromPerAligned(byte[] encodedBytes) {
    AdditionalDopplerFields result = new AdditionalDopplerFields();
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

  
  private AdditionalDopplerFields.doppler1Type doppler1_;
  public AdditionalDopplerFields.doppler1Type getDoppler1() {
    return doppler1_;
  }
  /**
   * @throws ClassCastException if value is not a AdditionalDopplerFields.doppler1Type
   */
  public void setDoppler1(Asn1Object value) {
    this.doppler1_ = (AdditionalDopplerFields.doppler1Type) value;
  }
  public AdditionalDopplerFields.doppler1Type setDoppler1ToNewInstance() {
    doppler1_ = new AdditionalDopplerFields.doppler1Type();
    return doppler1_;
  }
  
  private AdditionalDopplerFields.dopplerUncertaintyType dopplerUncertainty_;
  public AdditionalDopplerFields.dopplerUncertaintyType getDopplerUncertainty() {
    return dopplerUncertainty_;
  }
  /**
   * @throws ClassCastException if value is not a AdditionalDopplerFields.dopplerUncertaintyType
   */
  public void setDopplerUncertainty(Asn1Object value) {
    this.dopplerUncertainty_ = (AdditionalDopplerFields.dopplerUncertaintyType) value;
  }
  public AdditionalDopplerFields.dopplerUncertaintyType setDopplerUncertaintyToNewInstance() {
    dopplerUncertainty_ = new AdditionalDopplerFields.dopplerUncertaintyType();
    return dopplerUncertainty_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getDoppler1() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getDoppler1();
          }

          @Override public void setToNewInstance() {
            setDoppler1ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? AdditionalDopplerFields.doppler1Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "doppler1 : "
                    + getDoppler1().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getDopplerUncertainty() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getDopplerUncertainty();
          }

          @Override public void setToNewInstance() {
            setDopplerUncertaintyToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? AdditionalDopplerFields.dopplerUncertaintyType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "dopplerUncertainty : "
                    + getDopplerUncertainty().toIndentedString(indent);
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
public static class doppler1Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_doppler1Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public doppler1Type() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("63"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_doppler1Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_doppler1Type != null) {
      return ImmutableList.of(TAG_doppler1Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new doppler1Type from encoded stream.
   */
  public static doppler1Type fromPerUnaligned(byte[] encodedBytes) {
    doppler1Type result = new doppler1Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new doppler1Type from encoded stream.
   */
  public static doppler1Type fromPerAligned(byte[] encodedBytes) {
    doppler1Type result = new doppler1Type();
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
    return "doppler1Type = " + getInteger() + ";\n";
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
public static class dopplerUncertaintyType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_dopplerUncertaintyType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public dopplerUncertaintyType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("4"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_dopplerUncertaintyType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_dopplerUncertaintyType != null) {
      return ImmutableList.of(TAG_dopplerUncertaintyType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new dopplerUncertaintyType from encoded stream.
   */
  public static dopplerUncertaintyType fromPerUnaligned(byte[] encodedBytes) {
    dopplerUncertaintyType result = new dopplerUncertaintyType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new dopplerUncertaintyType from encoded stream.
   */
  public static dopplerUncertaintyType fromPerAligned(byte[] encodedBytes) {
    dopplerUncertaintyType result = new dopplerUncertaintyType();
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
    return "dopplerUncertaintyType = " + getInteger() + ";\n";
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
    builder.append("AdditionalDopplerFields = {\n");
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
