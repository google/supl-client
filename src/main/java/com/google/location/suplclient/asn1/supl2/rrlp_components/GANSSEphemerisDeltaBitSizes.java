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
public  class GANSSEphemerisDeltaBitSizes extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GANSSEphemerisDeltaBitSizes
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GANSSEphemerisDeltaBitSizes() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GANSSEphemerisDeltaBitSizes;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GANSSEphemerisDeltaBitSizes != null) {
      return ImmutableList.of(TAG_GANSSEphemerisDeltaBitSizes);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GANSSEphemerisDeltaBitSizes from encoded stream.
   */
  public static GANSSEphemerisDeltaBitSizes fromPerUnaligned(byte[] encodedBytes) {
    GANSSEphemerisDeltaBitSizes result = new GANSSEphemerisDeltaBitSizes();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GANSSEphemerisDeltaBitSizes from encoded stream.
   */
  public static GANSSEphemerisDeltaBitSizes fromPerAligned(byte[] encodedBytes) {
    GANSSEphemerisDeltaBitSizes result = new GANSSEphemerisDeltaBitSizes();
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

  
  private GANSSEphemerisDeltaBitSizes.bitsize_delta_omegaType bitsize_delta_omega_;
  public GANSSEphemerisDeltaBitSizes.bitsize_delta_omegaType getBitsize_delta_omega() {
    return bitsize_delta_omega_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSEphemerisDeltaBitSizes.bitsize_delta_omegaType
   */
  public void setBitsize_delta_omega(Asn1Object value) {
    this.bitsize_delta_omega_ = (GANSSEphemerisDeltaBitSizes.bitsize_delta_omegaType) value;
  }
  public GANSSEphemerisDeltaBitSizes.bitsize_delta_omegaType setBitsize_delta_omegaToNewInstance() {
    bitsize_delta_omega_ = new GANSSEphemerisDeltaBitSizes.bitsize_delta_omegaType();
    return bitsize_delta_omega_;
  }
  
  private GANSSEphemerisDeltaBitSizes.bitsize_delta_deltaNType bitsize_delta_deltaN_;
  public GANSSEphemerisDeltaBitSizes.bitsize_delta_deltaNType getBitsize_delta_deltaN() {
    return bitsize_delta_deltaN_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSEphemerisDeltaBitSizes.bitsize_delta_deltaNType
   */
  public void setBitsize_delta_deltaN(Asn1Object value) {
    this.bitsize_delta_deltaN_ = (GANSSEphemerisDeltaBitSizes.bitsize_delta_deltaNType) value;
  }
  public GANSSEphemerisDeltaBitSizes.bitsize_delta_deltaNType setBitsize_delta_deltaNToNewInstance() {
    bitsize_delta_deltaN_ = new GANSSEphemerisDeltaBitSizes.bitsize_delta_deltaNType();
    return bitsize_delta_deltaN_;
  }
  
  private GANSSEphemerisDeltaBitSizes.bitsize_delta_m0Type bitsize_delta_m0_;
  public GANSSEphemerisDeltaBitSizes.bitsize_delta_m0Type getBitsize_delta_m0() {
    return bitsize_delta_m0_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSEphemerisDeltaBitSizes.bitsize_delta_m0Type
   */
  public void setBitsize_delta_m0(Asn1Object value) {
    this.bitsize_delta_m0_ = (GANSSEphemerisDeltaBitSizes.bitsize_delta_m0Type) value;
  }
  public GANSSEphemerisDeltaBitSizes.bitsize_delta_m0Type setBitsize_delta_m0ToNewInstance() {
    bitsize_delta_m0_ = new GANSSEphemerisDeltaBitSizes.bitsize_delta_m0Type();
    return bitsize_delta_m0_;
  }
  
  private GANSSEphemerisDeltaBitSizes.bitsize_delta_omegadotType bitsize_delta_omegadot_;
  public GANSSEphemerisDeltaBitSizes.bitsize_delta_omegadotType getBitsize_delta_omegadot() {
    return bitsize_delta_omegadot_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSEphemerisDeltaBitSizes.bitsize_delta_omegadotType
   */
  public void setBitsize_delta_omegadot(Asn1Object value) {
    this.bitsize_delta_omegadot_ = (GANSSEphemerisDeltaBitSizes.bitsize_delta_omegadotType) value;
  }
  public GANSSEphemerisDeltaBitSizes.bitsize_delta_omegadotType setBitsize_delta_omegadotToNewInstance() {
    bitsize_delta_omegadot_ = new GANSSEphemerisDeltaBitSizes.bitsize_delta_omegadotType();
    return bitsize_delta_omegadot_;
  }
  
  private GANSSEphemerisDeltaBitSizes.bitsize_delta_eType bitsize_delta_e_;
  public GANSSEphemerisDeltaBitSizes.bitsize_delta_eType getBitsize_delta_e() {
    return bitsize_delta_e_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSEphemerisDeltaBitSizes.bitsize_delta_eType
   */
  public void setBitsize_delta_e(Asn1Object value) {
    this.bitsize_delta_e_ = (GANSSEphemerisDeltaBitSizes.bitsize_delta_eType) value;
  }
  public GANSSEphemerisDeltaBitSizes.bitsize_delta_eType setBitsize_delta_eToNewInstance() {
    bitsize_delta_e_ = new GANSSEphemerisDeltaBitSizes.bitsize_delta_eType();
    return bitsize_delta_e_;
  }
  
  private GANSSEphemerisDeltaBitSizes.bitsize_delta_idotType bitsize_delta_idot_;
  public GANSSEphemerisDeltaBitSizes.bitsize_delta_idotType getBitsize_delta_idot() {
    return bitsize_delta_idot_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSEphemerisDeltaBitSizes.bitsize_delta_idotType
   */
  public void setBitsize_delta_idot(Asn1Object value) {
    this.bitsize_delta_idot_ = (GANSSEphemerisDeltaBitSizes.bitsize_delta_idotType) value;
  }
  public GANSSEphemerisDeltaBitSizes.bitsize_delta_idotType setBitsize_delta_idotToNewInstance() {
    bitsize_delta_idot_ = new GANSSEphemerisDeltaBitSizes.bitsize_delta_idotType();
    return bitsize_delta_idot_;
  }
  
  private GANSSEphemerisDeltaBitSizes.bitsize_delta_sqrtAType bitsize_delta_sqrtA_;
  public GANSSEphemerisDeltaBitSizes.bitsize_delta_sqrtAType getBitsize_delta_sqrtA() {
    return bitsize_delta_sqrtA_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSEphemerisDeltaBitSizes.bitsize_delta_sqrtAType
   */
  public void setBitsize_delta_sqrtA(Asn1Object value) {
    this.bitsize_delta_sqrtA_ = (GANSSEphemerisDeltaBitSizes.bitsize_delta_sqrtAType) value;
  }
  public GANSSEphemerisDeltaBitSizes.bitsize_delta_sqrtAType setBitsize_delta_sqrtAToNewInstance() {
    bitsize_delta_sqrtA_ = new GANSSEphemerisDeltaBitSizes.bitsize_delta_sqrtAType();
    return bitsize_delta_sqrtA_;
  }
  
  private GANSSEphemerisDeltaBitSizes.bitsize_delta_i0Type bitsize_delta_i0_;
  public GANSSEphemerisDeltaBitSizes.bitsize_delta_i0Type getBitsize_delta_i0() {
    return bitsize_delta_i0_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSEphemerisDeltaBitSizes.bitsize_delta_i0Type
   */
  public void setBitsize_delta_i0(Asn1Object value) {
    this.bitsize_delta_i0_ = (GANSSEphemerisDeltaBitSizes.bitsize_delta_i0Type) value;
  }
  public GANSSEphemerisDeltaBitSizes.bitsize_delta_i0Type setBitsize_delta_i0ToNewInstance() {
    bitsize_delta_i0_ = new GANSSEphemerisDeltaBitSizes.bitsize_delta_i0Type();
    return bitsize_delta_i0_;
  }
  
  private GANSSEphemerisDeltaBitSizes.bitsize_delta_omega0Type bitsize_delta_omega0_;
  public GANSSEphemerisDeltaBitSizes.bitsize_delta_omega0Type getBitsize_delta_omega0() {
    return bitsize_delta_omega0_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSEphemerisDeltaBitSizes.bitsize_delta_omega0Type
   */
  public void setBitsize_delta_omega0(Asn1Object value) {
    this.bitsize_delta_omega0_ = (GANSSEphemerisDeltaBitSizes.bitsize_delta_omega0Type) value;
  }
  public GANSSEphemerisDeltaBitSizes.bitsize_delta_omega0Type setBitsize_delta_omega0ToNewInstance() {
    bitsize_delta_omega0_ = new GANSSEphemerisDeltaBitSizes.bitsize_delta_omega0Type();
    return bitsize_delta_omega0_;
  }
  
  private GANSSEphemerisDeltaBitSizes.bitsize_delta_crsType bitsize_delta_crs_;
  public GANSSEphemerisDeltaBitSizes.bitsize_delta_crsType getBitsize_delta_crs() {
    return bitsize_delta_crs_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSEphemerisDeltaBitSizes.bitsize_delta_crsType
   */
  public void setBitsize_delta_crs(Asn1Object value) {
    this.bitsize_delta_crs_ = (GANSSEphemerisDeltaBitSizes.bitsize_delta_crsType) value;
  }
  public GANSSEphemerisDeltaBitSizes.bitsize_delta_crsType setBitsize_delta_crsToNewInstance() {
    bitsize_delta_crs_ = new GANSSEphemerisDeltaBitSizes.bitsize_delta_crsType();
    return bitsize_delta_crs_;
  }
  
  private GANSSEphemerisDeltaBitSizes.bitsize_delta_cisType bitsize_delta_cis_;
  public GANSSEphemerisDeltaBitSizes.bitsize_delta_cisType getBitsize_delta_cis() {
    return bitsize_delta_cis_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSEphemerisDeltaBitSizes.bitsize_delta_cisType
   */
  public void setBitsize_delta_cis(Asn1Object value) {
    this.bitsize_delta_cis_ = (GANSSEphemerisDeltaBitSizes.bitsize_delta_cisType) value;
  }
  public GANSSEphemerisDeltaBitSizes.bitsize_delta_cisType setBitsize_delta_cisToNewInstance() {
    bitsize_delta_cis_ = new GANSSEphemerisDeltaBitSizes.bitsize_delta_cisType();
    return bitsize_delta_cis_;
  }
  
  private GANSSEphemerisDeltaBitSizes.bitsize_delta_cusType bitsize_delta_cus_;
  public GANSSEphemerisDeltaBitSizes.bitsize_delta_cusType getBitsize_delta_cus() {
    return bitsize_delta_cus_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSEphemerisDeltaBitSizes.bitsize_delta_cusType
   */
  public void setBitsize_delta_cus(Asn1Object value) {
    this.bitsize_delta_cus_ = (GANSSEphemerisDeltaBitSizes.bitsize_delta_cusType) value;
  }
  public GANSSEphemerisDeltaBitSizes.bitsize_delta_cusType setBitsize_delta_cusToNewInstance() {
    bitsize_delta_cus_ = new GANSSEphemerisDeltaBitSizes.bitsize_delta_cusType();
    return bitsize_delta_cus_;
  }
  
  private GANSSEphemerisDeltaBitSizes.bitsize_delta_crcType bitsize_delta_crc_;
  public GANSSEphemerisDeltaBitSizes.bitsize_delta_crcType getBitsize_delta_crc() {
    return bitsize_delta_crc_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSEphemerisDeltaBitSizes.bitsize_delta_crcType
   */
  public void setBitsize_delta_crc(Asn1Object value) {
    this.bitsize_delta_crc_ = (GANSSEphemerisDeltaBitSizes.bitsize_delta_crcType) value;
  }
  public GANSSEphemerisDeltaBitSizes.bitsize_delta_crcType setBitsize_delta_crcToNewInstance() {
    bitsize_delta_crc_ = new GANSSEphemerisDeltaBitSizes.bitsize_delta_crcType();
    return bitsize_delta_crc_;
  }
  
  private GANSSEphemerisDeltaBitSizes.bitsize_delta_cicType bitsize_delta_cic_;
  public GANSSEphemerisDeltaBitSizes.bitsize_delta_cicType getBitsize_delta_cic() {
    return bitsize_delta_cic_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSEphemerisDeltaBitSizes.bitsize_delta_cicType
   */
  public void setBitsize_delta_cic(Asn1Object value) {
    this.bitsize_delta_cic_ = (GANSSEphemerisDeltaBitSizes.bitsize_delta_cicType) value;
  }
  public GANSSEphemerisDeltaBitSizes.bitsize_delta_cicType setBitsize_delta_cicToNewInstance() {
    bitsize_delta_cic_ = new GANSSEphemerisDeltaBitSizes.bitsize_delta_cicType();
    return bitsize_delta_cic_;
  }
  
  private GANSSEphemerisDeltaBitSizes.bitsize_delta_cucType bitsize_delta_cuc_;
  public GANSSEphemerisDeltaBitSizes.bitsize_delta_cucType getBitsize_delta_cuc() {
    return bitsize_delta_cuc_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSEphemerisDeltaBitSizes.bitsize_delta_cucType
   */
  public void setBitsize_delta_cuc(Asn1Object value) {
    this.bitsize_delta_cuc_ = (GANSSEphemerisDeltaBitSizes.bitsize_delta_cucType) value;
  }
  public GANSSEphemerisDeltaBitSizes.bitsize_delta_cucType setBitsize_delta_cucToNewInstance() {
    bitsize_delta_cuc_ = new GANSSEphemerisDeltaBitSizes.bitsize_delta_cucType();
    return bitsize_delta_cuc_;
  }
  
  private GANSSEphemerisDeltaBitSizes.bitsize_delta_tgd1Type bitsize_delta_tgd1_;
  public GANSSEphemerisDeltaBitSizes.bitsize_delta_tgd1Type getBitsize_delta_tgd1() {
    return bitsize_delta_tgd1_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSEphemerisDeltaBitSizes.bitsize_delta_tgd1Type
   */
  public void setBitsize_delta_tgd1(Asn1Object value) {
    this.bitsize_delta_tgd1_ = (GANSSEphemerisDeltaBitSizes.bitsize_delta_tgd1Type) value;
  }
  public GANSSEphemerisDeltaBitSizes.bitsize_delta_tgd1Type setBitsize_delta_tgd1ToNewInstance() {
    bitsize_delta_tgd1_ = new GANSSEphemerisDeltaBitSizes.bitsize_delta_tgd1Type();
    return bitsize_delta_tgd1_;
  }
  
  private GANSSEphemerisDeltaBitSizes.bitsize_delta_tgd2Type bitsize_delta_tgd2_;
  public GANSSEphemerisDeltaBitSizes.bitsize_delta_tgd2Type getBitsize_delta_tgd2() {
    return bitsize_delta_tgd2_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSEphemerisDeltaBitSizes.bitsize_delta_tgd2Type
   */
  public void setBitsize_delta_tgd2(Asn1Object value) {
    this.bitsize_delta_tgd2_ = (GANSSEphemerisDeltaBitSizes.bitsize_delta_tgd2Type) value;
  }
  public GANSSEphemerisDeltaBitSizes.bitsize_delta_tgd2Type setBitsize_delta_tgd2ToNewInstance() {
    bitsize_delta_tgd2_ = new GANSSEphemerisDeltaBitSizes.bitsize_delta_tgd2Type();
    return bitsize_delta_tgd2_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getBitsize_delta_omega() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBitsize_delta_omega();
          }

          @Override public void setToNewInstance() {
            setBitsize_delta_omegaToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSEphemerisDeltaBitSizes.bitsize_delta_omegaType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bitsize_delta_omega : "
                    + getBitsize_delta_omega().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getBitsize_delta_deltaN() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBitsize_delta_deltaN();
          }

          @Override public void setToNewInstance() {
            setBitsize_delta_deltaNToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSEphemerisDeltaBitSizes.bitsize_delta_deltaNType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bitsize_delta_deltaN : "
                    + getBitsize_delta_deltaN().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getBitsize_delta_m0() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBitsize_delta_m0();
          }

          @Override public void setToNewInstance() {
            setBitsize_delta_m0ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSEphemerisDeltaBitSizes.bitsize_delta_m0Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bitsize_delta_m0 : "
                    + getBitsize_delta_m0().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getBitsize_delta_omegadot() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBitsize_delta_omegadot();
          }

          @Override public void setToNewInstance() {
            setBitsize_delta_omegadotToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSEphemerisDeltaBitSizes.bitsize_delta_omegadotType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bitsize_delta_omegadot : "
                    + getBitsize_delta_omegadot().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getBitsize_delta_e() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBitsize_delta_e();
          }

          @Override public void setToNewInstance() {
            setBitsize_delta_eToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSEphemerisDeltaBitSizes.bitsize_delta_eType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bitsize_delta_e : "
                    + getBitsize_delta_e().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getBitsize_delta_idot() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBitsize_delta_idot();
          }

          @Override public void setToNewInstance() {
            setBitsize_delta_idotToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSEphemerisDeltaBitSizes.bitsize_delta_idotType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bitsize_delta_idot : "
                    + getBitsize_delta_idot().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getBitsize_delta_sqrtA() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBitsize_delta_sqrtA();
          }

          @Override public void setToNewInstance() {
            setBitsize_delta_sqrtAToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSEphemerisDeltaBitSizes.bitsize_delta_sqrtAType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bitsize_delta_sqrtA : "
                    + getBitsize_delta_sqrtA().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 7);

          @Override public boolean isExplicitlySet() {
            return getBitsize_delta_i0() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBitsize_delta_i0();
          }

          @Override public void setToNewInstance() {
            setBitsize_delta_i0ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSEphemerisDeltaBitSizes.bitsize_delta_i0Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bitsize_delta_i0 : "
                    + getBitsize_delta_i0().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 8);

          @Override public boolean isExplicitlySet() {
            return getBitsize_delta_omega0() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBitsize_delta_omega0();
          }

          @Override public void setToNewInstance() {
            setBitsize_delta_omega0ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSEphemerisDeltaBitSizes.bitsize_delta_omega0Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bitsize_delta_omega0 : "
                    + getBitsize_delta_omega0().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 9);

          @Override public boolean isExplicitlySet() {
            return getBitsize_delta_crs() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBitsize_delta_crs();
          }

          @Override public void setToNewInstance() {
            setBitsize_delta_crsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSEphemerisDeltaBitSizes.bitsize_delta_crsType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bitsize_delta_crs : "
                    + getBitsize_delta_crs().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 10);

          @Override public boolean isExplicitlySet() {
            return getBitsize_delta_cis() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBitsize_delta_cis();
          }

          @Override public void setToNewInstance() {
            setBitsize_delta_cisToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSEphemerisDeltaBitSizes.bitsize_delta_cisType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bitsize_delta_cis : "
                    + getBitsize_delta_cis().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 11);

          @Override public boolean isExplicitlySet() {
            return getBitsize_delta_cus() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBitsize_delta_cus();
          }

          @Override public void setToNewInstance() {
            setBitsize_delta_cusToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSEphemerisDeltaBitSizes.bitsize_delta_cusType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bitsize_delta_cus : "
                    + getBitsize_delta_cus().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 12);

          @Override public boolean isExplicitlySet() {
            return getBitsize_delta_crc() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBitsize_delta_crc();
          }

          @Override public void setToNewInstance() {
            setBitsize_delta_crcToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSEphemerisDeltaBitSizes.bitsize_delta_crcType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bitsize_delta_crc : "
                    + getBitsize_delta_crc().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 13);

          @Override public boolean isExplicitlySet() {
            return getBitsize_delta_cic() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBitsize_delta_cic();
          }

          @Override public void setToNewInstance() {
            setBitsize_delta_cicToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSEphemerisDeltaBitSizes.bitsize_delta_cicType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bitsize_delta_cic : "
                    + getBitsize_delta_cic().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 14);

          @Override public boolean isExplicitlySet() {
            return getBitsize_delta_cuc() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBitsize_delta_cuc();
          }

          @Override public void setToNewInstance() {
            setBitsize_delta_cucToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSEphemerisDeltaBitSizes.bitsize_delta_cucType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bitsize_delta_cuc : "
                    + getBitsize_delta_cuc().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 15);

          @Override public boolean isExplicitlySet() {
            return getBitsize_delta_tgd1() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBitsize_delta_tgd1();
          }

          @Override public void setToNewInstance() {
            setBitsize_delta_tgd1ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSEphemerisDeltaBitSizes.bitsize_delta_tgd1Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bitsize_delta_tgd1 : "
                    + getBitsize_delta_tgd1().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 16);

          @Override public boolean isExplicitlySet() {
            return getBitsize_delta_tgd2() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBitsize_delta_tgd2();
          }

          @Override public void setToNewInstance() {
            setBitsize_delta_tgd2ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSEphemerisDeltaBitSizes.bitsize_delta_tgd2Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bitsize_delta_tgd2 : "
                    + getBitsize_delta_tgd2().toIndentedString(indent);
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
public static class bitsize_delta_omegaType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bitsize_delta_omegaType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bitsize_delta_omegaType() {
    super();
    setValueRange(new java.math.BigInteger("1"), new java.math.BigInteger("32"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bitsize_delta_omegaType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bitsize_delta_omegaType != null) {
      return ImmutableList.of(TAG_bitsize_delta_omegaType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bitsize_delta_omegaType from encoded stream.
   */
  public static bitsize_delta_omegaType fromPerUnaligned(byte[] encodedBytes) {
    bitsize_delta_omegaType result = new bitsize_delta_omegaType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bitsize_delta_omegaType from encoded stream.
   */
  public static bitsize_delta_omegaType fromPerAligned(byte[] encodedBytes) {
    bitsize_delta_omegaType result = new bitsize_delta_omegaType();
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
    return "bitsize_delta_omegaType = " + getInteger() + ";\n";
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
public static class bitsize_delta_deltaNType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bitsize_delta_deltaNType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bitsize_delta_deltaNType() {
    super();
    setValueRange(new java.math.BigInteger("1"), new java.math.BigInteger("16"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bitsize_delta_deltaNType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bitsize_delta_deltaNType != null) {
      return ImmutableList.of(TAG_bitsize_delta_deltaNType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bitsize_delta_deltaNType from encoded stream.
   */
  public static bitsize_delta_deltaNType fromPerUnaligned(byte[] encodedBytes) {
    bitsize_delta_deltaNType result = new bitsize_delta_deltaNType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bitsize_delta_deltaNType from encoded stream.
   */
  public static bitsize_delta_deltaNType fromPerAligned(byte[] encodedBytes) {
    bitsize_delta_deltaNType result = new bitsize_delta_deltaNType();
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
    return "bitsize_delta_deltaNType = " + getInteger() + ";\n";
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
public static class bitsize_delta_m0Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bitsize_delta_m0Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bitsize_delta_m0Type() {
    super();
    setValueRange(new java.math.BigInteger("1"), new java.math.BigInteger("32"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bitsize_delta_m0Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bitsize_delta_m0Type != null) {
      return ImmutableList.of(TAG_bitsize_delta_m0Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bitsize_delta_m0Type from encoded stream.
   */
  public static bitsize_delta_m0Type fromPerUnaligned(byte[] encodedBytes) {
    bitsize_delta_m0Type result = new bitsize_delta_m0Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bitsize_delta_m0Type from encoded stream.
   */
  public static bitsize_delta_m0Type fromPerAligned(byte[] encodedBytes) {
    bitsize_delta_m0Type result = new bitsize_delta_m0Type();
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
    return "bitsize_delta_m0Type = " + getInteger() + ";\n";
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
public static class bitsize_delta_omegadotType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bitsize_delta_omegadotType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bitsize_delta_omegadotType() {
    super();
    setValueRange(new java.math.BigInteger("1"), new java.math.BigInteger("24"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bitsize_delta_omegadotType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bitsize_delta_omegadotType != null) {
      return ImmutableList.of(TAG_bitsize_delta_omegadotType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bitsize_delta_omegadotType from encoded stream.
   */
  public static bitsize_delta_omegadotType fromPerUnaligned(byte[] encodedBytes) {
    bitsize_delta_omegadotType result = new bitsize_delta_omegadotType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bitsize_delta_omegadotType from encoded stream.
   */
  public static bitsize_delta_omegadotType fromPerAligned(byte[] encodedBytes) {
    bitsize_delta_omegadotType result = new bitsize_delta_omegadotType();
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
    return "bitsize_delta_omegadotType = " + getInteger() + ";\n";
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
public static class bitsize_delta_eType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bitsize_delta_eType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bitsize_delta_eType() {
    super();
    setValueRange(new java.math.BigInteger("1"), new java.math.BigInteger("32"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bitsize_delta_eType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bitsize_delta_eType != null) {
      return ImmutableList.of(TAG_bitsize_delta_eType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bitsize_delta_eType from encoded stream.
   */
  public static bitsize_delta_eType fromPerUnaligned(byte[] encodedBytes) {
    bitsize_delta_eType result = new bitsize_delta_eType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bitsize_delta_eType from encoded stream.
   */
  public static bitsize_delta_eType fromPerAligned(byte[] encodedBytes) {
    bitsize_delta_eType result = new bitsize_delta_eType();
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
    return "bitsize_delta_eType = " + getInteger() + ";\n";
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
public static class bitsize_delta_idotType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bitsize_delta_idotType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bitsize_delta_idotType() {
    super();
    setValueRange(new java.math.BigInteger("1"), new java.math.BigInteger("14"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bitsize_delta_idotType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bitsize_delta_idotType != null) {
      return ImmutableList.of(TAG_bitsize_delta_idotType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bitsize_delta_idotType from encoded stream.
   */
  public static bitsize_delta_idotType fromPerUnaligned(byte[] encodedBytes) {
    bitsize_delta_idotType result = new bitsize_delta_idotType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bitsize_delta_idotType from encoded stream.
   */
  public static bitsize_delta_idotType fromPerAligned(byte[] encodedBytes) {
    bitsize_delta_idotType result = new bitsize_delta_idotType();
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
    return "bitsize_delta_idotType = " + getInteger() + ";\n";
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
public static class bitsize_delta_sqrtAType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bitsize_delta_sqrtAType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bitsize_delta_sqrtAType() {
    super();
    setValueRange(new java.math.BigInteger("1"), new java.math.BigInteger("32"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bitsize_delta_sqrtAType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bitsize_delta_sqrtAType != null) {
      return ImmutableList.of(TAG_bitsize_delta_sqrtAType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bitsize_delta_sqrtAType from encoded stream.
   */
  public static bitsize_delta_sqrtAType fromPerUnaligned(byte[] encodedBytes) {
    bitsize_delta_sqrtAType result = new bitsize_delta_sqrtAType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bitsize_delta_sqrtAType from encoded stream.
   */
  public static bitsize_delta_sqrtAType fromPerAligned(byte[] encodedBytes) {
    bitsize_delta_sqrtAType result = new bitsize_delta_sqrtAType();
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
    return "bitsize_delta_sqrtAType = " + getInteger() + ";\n";
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
public static class bitsize_delta_i0Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bitsize_delta_i0Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bitsize_delta_i0Type() {
    super();
    setValueRange(new java.math.BigInteger("1"), new java.math.BigInteger("32"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bitsize_delta_i0Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bitsize_delta_i0Type != null) {
      return ImmutableList.of(TAG_bitsize_delta_i0Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bitsize_delta_i0Type from encoded stream.
   */
  public static bitsize_delta_i0Type fromPerUnaligned(byte[] encodedBytes) {
    bitsize_delta_i0Type result = new bitsize_delta_i0Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bitsize_delta_i0Type from encoded stream.
   */
  public static bitsize_delta_i0Type fromPerAligned(byte[] encodedBytes) {
    bitsize_delta_i0Type result = new bitsize_delta_i0Type();
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
    return "bitsize_delta_i0Type = " + getInteger() + ";\n";
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
public static class bitsize_delta_omega0Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bitsize_delta_omega0Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bitsize_delta_omega0Type() {
    super();
    setValueRange(new java.math.BigInteger("1"), new java.math.BigInteger("32"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bitsize_delta_omega0Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bitsize_delta_omega0Type != null) {
      return ImmutableList.of(TAG_bitsize_delta_omega0Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bitsize_delta_omega0Type from encoded stream.
   */
  public static bitsize_delta_omega0Type fromPerUnaligned(byte[] encodedBytes) {
    bitsize_delta_omega0Type result = new bitsize_delta_omega0Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bitsize_delta_omega0Type from encoded stream.
   */
  public static bitsize_delta_omega0Type fromPerAligned(byte[] encodedBytes) {
    bitsize_delta_omega0Type result = new bitsize_delta_omega0Type();
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
    return "bitsize_delta_omega0Type = " + getInteger() + ";\n";
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
public static class bitsize_delta_crsType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bitsize_delta_crsType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bitsize_delta_crsType() {
    super();
    setValueRange(new java.math.BigInteger("1"), new java.math.BigInteger("16"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bitsize_delta_crsType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bitsize_delta_crsType != null) {
      return ImmutableList.of(TAG_bitsize_delta_crsType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bitsize_delta_crsType from encoded stream.
   */
  public static bitsize_delta_crsType fromPerUnaligned(byte[] encodedBytes) {
    bitsize_delta_crsType result = new bitsize_delta_crsType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bitsize_delta_crsType from encoded stream.
   */
  public static bitsize_delta_crsType fromPerAligned(byte[] encodedBytes) {
    bitsize_delta_crsType result = new bitsize_delta_crsType();
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
    return "bitsize_delta_crsType = " + getInteger() + ";\n";
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
public static class bitsize_delta_cisType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bitsize_delta_cisType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bitsize_delta_cisType() {
    super();
    setValueRange(new java.math.BigInteger("1"), new java.math.BigInteger("16"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bitsize_delta_cisType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bitsize_delta_cisType != null) {
      return ImmutableList.of(TAG_bitsize_delta_cisType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bitsize_delta_cisType from encoded stream.
   */
  public static bitsize_delta_cisType fromPerUnaligned(byte[] encodedBytes) {
    bitsize_delta_cisType result = new bitsize_delta_cisType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bitsize_delta_cisType from encoded stream.
   */
  public static bitsize_delta_cisType fromPerAligned(byte[] encodedBytes) {
    bitsize_delta_cisType result = new bitsize_delta_cisType();
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
    return "bitsize_delta_cisType = " + getInteger() + ";\n";
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
public static class bitsize_delta_cusType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bitsize_delta_cusType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bitsize_delta_cusType() {
    super();
    setValueRange(new java.math.BigInteger("1"), new java.math.BigInteger("16"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bitsize_delta_cusType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bitsize_delta_cusType != null) {
      return ImmutableList.of(TAG_bitsize_delta_cusType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bitsize_delta_cusType from encoded stream.
   */
  public static bitsize_delta_cusType fromPerUnaligned(byte[] encodedBytes) {
    bitsize_delta_cusType result = new bitsize_delta_cusType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bitsize_delta_cusType from encoded stream.
   */
  public static bitsize_delta_cusType fromPerAligned(byte[] encodedBytes) {
    bitsize_delta_cusType result = new bitsize_delta_cusType();
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
    return "bitsize_delta_cusType = " + getInteger() + ";\n";
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
public static class bitsize_delta_crcType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bitsize_delta_crcType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bitsize_delta_crcType() {
    super();
    setValueRange(new java.math.BigInteger("1"), new java.math.BigInteger("16"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bitsize_delta_crcType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bitsize_delta_crcType != null) {
      return ImmutableList.of(TAG_bitsize_delta_crcType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bitsize_delta_crcType from encoded stream.
   */
  public static bitsize_delta_crcType fromPerUnaligned(byte[] encodedBytes) {
    bitsize_delta_crcType result = new bitsize_delta_crcType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bitsize_delta_crcType from encoded stream.
   */
  public static bitsize_delta_crcType fromPerAligned(byte[] encodedBytes) {
    bitsize_delta_crcType result = new bitsize_delta_crcType();
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
    return "bitsize_delta_crcType = " + getInteger() + ";\n";
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
public static class bitsize_delta_cicType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bitsize_delta_cicType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bitsize_delta_cicType() {
    super();
    setValueRange(new java.math.BigInteger("1"), new java.math.BigInteger("16"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bitsize_delta_cicType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bitsize_delta_cicType != null) {
      return ImmutableList.of(TAG_bitsize_delta_cicType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bitsize_delta_cicType from encoded stream.
   */
  public static bitsize_delta_cicType fromPerUnaligned(byte[] encodedBytes) {
    bitsize_delta_cicType result = new bitsize_delta_cicType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bitsize_delta_cicType from encoded stream.
   */
  public static bitsize_delta_cicType fromPerAligned(byte[] encodedBytes) {
    bitsize_delta_cicType result = new bitsize_delta_cicType();
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
    return "bitsize_delta_cicType = " + getInteger() + ";\n";
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
public static class bitsize_delta_cucType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bitsize_delta_cucType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bitsize_delta_cucType() {
    super();
    setValueRange(new java.math.BigInteger("1"), new java.math.BigInteger("16"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bitsize_delta_cucType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bitsize_delta_cucType != null) {
      return ImmutableList.of(TAG_bitsize_delta_cucType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bitsize_delta_cucType from encoded stream.
   */
  public static bitsize_delta_cucType fromPerUnaligned(byte[] encodedBytes) {
    bitsize_delta_cucType result = new bitsize_delta_cucType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bitsize_delta_cucType from encoded stream.
   */
  public static bitsize_delta_cucType fromPerAligned(byte[] encodedBytes) {
    bitsize_delta_cucType result = new bitsize_delta_cucType();
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
    return "bitsize_delta_cucType = " + getInteger() + ";\n";
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
public static class bitsize_delta_tgd1Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bitsize_delta_tgd1Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bitsize_delta_tgd1Type() {
    super();
    setValueRange(new java.math.BigInteger("1"), new java.math.BigInteger("10"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bitsize_delta_tgd1Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bitsize_delta_tgd1Type != null) {
      return ImmutableList.of(TAG_bitsize_delta_tgd1Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bitsize_delta_tgd1Type from encoded stream.
   */
  public static bitsize_delta_tgd1Type fromPerUnaligned(byte[] encodedBytes) {
    bitsize_delta_tgd1Type result = new bitsize_delta_tgd1Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bitsize_delta_tgd1Type from encoded stream.
   */
  public static bitsize_delta_tgd1Type fromPerAligned(byte[] encodedBytes) {
    bitsize_delta_tgd1Type result = new bitsize_delta_tgd1Type();
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
    return "bitsize_delta_tgd1Type = " + getInteger() + ";\n";
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
public static class bitsize_delta_tgd2Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bitsize_delta_tgd2Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bitsize_delta_tgd2Type() {
    super();
    setValueRange(new java.math.BigInteger("1"), new java.math.BigInteger("10"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bitsize_delta_tgd2Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bitsize_delta_tgd2Type != null) {
      return ImmutableList.of(TAG_bitsize_delta_tgd2Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bitsize_delta_tgd2Type from encoded stream.
   */
  public static bitsize_delta_tgd2Type fromPerUnaligned(byte[] encodedBytes) {
    bitsize_delta_tgd2Type result = new bitsize_delta_tgd2Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bitsize_delta_tgd2Type from encoded stream.
   */
  public static bitsize_delta_tgd2Type fromPerAligned(byte[] encodedBytes) {
    bitsize_delta_tgd2Type result = new bitsize_delta_tgd2Type();
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
    return "bitsize_delta_tgd2Type = " + getInteger() + ";\n";
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
    builder.append("GANSSEphemerisDeltaBitSizes = {\n");
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
