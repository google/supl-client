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
public  class GPSEphemerisDeltaScales extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GPSEphemerisDeltaScales
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GPSEphemerisDeltaScales() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GPSEphemerisDeltaScales;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GPSEphemerisDeltaScales != null) {
      return ImmutableList.of(TAG_GPSEphemerisDeltaScales);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GPSEphemerisDeltaScales from encoded stream.
   */
  public static GPSEphemerisDeltaScales fromPerUnaligned(byte[] encodedBytes) {
    GPSEphemerisDeltaScales result = new GPSEphemerisDeltaScales();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GPSEphemerisDeltaScales from encoded stream.
   */
  public static GPSEphemerisDeltaScales fromPerAligned(byte[] encodedBytes) {
    GPSEphemerisDeltaScales result = new GPSEphemerisDeltaScales();
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

  
  private GPSEphemerisDeltaScales.scale_delta_omegaType scale_delta_omega_;
  public GPSEphemerisDeltaScales.scale_delta_omegaType getScale_delta_omega() {
    return scale_delta_omega_;
  }
  /**
   * @throws ClassCastException if value is not a GPSEphemerisDeltaScales.scale_delta_omegaType
   */
  public void setScale_delta_omega(Asn1Object value) {
    this.scale_delta_omega_ = (GPSEphemerisDeltaScales.scale_delta_omegaType) value;
  }
  public GPSEphemerisDeltaScales.scale_delta_omegaType setScale_delta_omegaToNewInstance() {
    scale_delta_omega_ = new GPSEphemerisDeltaScales.scale_delta_omegaType();
    return scale_delta_omega_;
  }
  
  private GPSEphemerisDeltaScales.scale_delta_deltaNType scale_delta_deltaN_;
  public GPSEphemerisDeltaScales.scale_delta_deltaNType getScale_delta_deltaN() {
    return scale_delta_deltaN_;
  }
  /**
   * @throws ClassCastException if value is not a GPSEphemerisDeltaScales.scale_delta_deltaNType
   */
  public void setScale_delta_deltaN(Asn1Object value) {
    this.scale_delta_deltaN_ = (GPSEphemerisDeltaScales.scale_delta_deltaNType) value;
  }
  public GPSEphemerisDeltaScales.scale_delta_deltaNType setScale_delta_deltaNToNewInstance() {
    scale_delta_deltaN_ = new GPSEphemerisDeltaScales.scale_delta_deltaNType();
    return scale_delta_deltaN_;
  }
  
  private GPSEphemerisDeltaScales.scale_delta_m0Type scale_delta_m0_;
  public GPSEphemerisDeltaScales.scale_delta_m0Type getScale_delta_m0() {
    return scale_delta_m0_;
  }
  /**
   * @throws ClassCastException if value is not a GPSEphemerisDeltaScales.scale_delta_m0Type
   */
  public void setScale_delta_m0(Asn1Object value) {
    this.scale_delta_m0_ = (GPSEphemerisDeltaScales.scale_delta_m0Type) value;
  }
  public GPSEphemerisDeltaScales.scale_delta_m0Type setScale_delta_m0ToNewInstance() {
    scale_delta_m0_ = new GPSEphemerisDeltaScales.scale_delta_m0Type();
    return scale_delta_m0_;
  }
  
  private GPSEphemerisDeltaScales.scale_delta_omegadotType scale_delta_omegadot_;
  public GPSEphemerisDeltaScales.scale_delta_omegadotType getScale_delta_omegadot() {
    return scale_delta_omegadot_;
  }
  /**
   * @throws ClassCastException if value is not a GPSEphemerisDeltaScales.scale_delta_omegadotType
   */
  public void setScale_delta_omegadot(Asn1Object value) {
    this.scale_delta_omegadot_ = (GPSEphemerisDeltaScales.scale_delta_omegadotType) value;
  }
  public GPSEphemerisDeltaScales.scale_delta_omegadotType setScale_delta_omegadotToNewInstance() {
    scale_delta_omegadot_ = new GPSEphemerisDeltaScales.scale_delta_omegadotType();
    return scale_delta_omegadot_;
  }
  
  private GPSEphemerisDeltaScales.scale_delta_eType scale_delta_e_;
  public GPSEphemerisDeltaScales.scale_delta_eType getScale_delta_e() {
    return scale_delta_e_;
  }
  /**
   * @throws ClassCastException if value is not a GPSEphemerisDeltaScales.scale_delta_eType
   */
  public void setScale_delta_e(Asn1Object value) {
    this.scale_delta_e_ = (GPSEphemerisDeltaScales.scale_delta_eType) value;
  }
  public GPSEphemerisDeltaScales.scale_delta_eType setScale_delta_eToNewInstance() {
    scale_delta_e_ = new GPSEphemerisDeltaScales.scale_delta_eType();
    return scale_delta_e_;
  }
  
  private GPSEphemerisDeltaScales.scale_delta_idotType scale_delta_idot_;
  public GPSEphemerisDeltaScales.scale_delta_idotType getScale_delta_idot() {
    return scale_delta_idot_;
  }
  /**
   * @throws ClassCastException if value is not a GPSEphemerisDeltaScales.scale_delta_idotType
   */
  public void setScale_delta_idot(Asn1Object value) {
    this.scale_delta_idot_ = (GPSEphemerisDeltaScales.scale_delta_idotType) value;
  }
  public GPSEphemerisDeltaScales.scale_delta_idotType setScale_delta_idotToNewInstance() {
    scale_delta_idot_ = new GPSEphemerisDeltaScales.scale_delta_idotType();
    return scale_delta_idot_;
  }
  
  private GPSEphemerisDeltaScales.scale_delta_sqrtAType scale_delta_sqrtA_;
  public GPSEphemerisDeltaScales.scale_delta_sqrtAType getScale_delta_sqrtA() {
    return scale_delta_sqrtA_;
  }
  /**
   * @throws ClassCastException if value is not a GPSEphemerisDeltaScales.scale_delta_sqrtAType
   */
  public void setScale_delta_sqrtA(Asn1Object value) {
    this.scale_delta_sqrtA_ = (GPSEphemerisDeltaScales.scale_delta_sqrtAType) value;
  }
  public GPSEphemerisDeltaScales.scale_delta_sqrtAType setScale_delta_sqrtAToNewInstance() {
    scale_delta_sqrtA_ = new GPSEphemerisDeltaScales.scale_delta_sqrtAType();
    return scale_delta_sqrtA_;
  }
  
  private GPSEphemerisDeltaScales.scale_delta_i0Type scale_delta_i0_;
  public GPSEphemerisDeltaScales.scale_delta_i0Type getScale_delta_i0() {
    return scale_delta_i0_;
  }
  /**
   * @throws ClassCastException if value is not a GPSEphemerisDeltaScales.scale_delta_i0Type
   */
  public void setScale_delta_i0(Asn1Object value) {
    this.scale_delta_i0_ = (GPSEphemerisDeltaScales.scale_delta_i0Type) value;
  }
  public GPSEphemerisDeltaScales.scale_delta_i0Type setScale_delta_i0ToNewInstance() {
    scale_delta_i0_ = new GPSEphemerisDeltaScales.scale_delta_i0Type();
    return scale_delta_i0_;
  }
  
  private GPSEphemerisDeltaScales.scale_delta_omega0Type scale_delta_omega0_;
  public GPSEphemerisDeltaScales.scale_delta_omega0Type getScale_delta_omega0() {
    return scale_delta_omega0_;
  }
  /**
   * @throws ClassCastException if value is not a GPSEphemerisDeltaScales.scale_delta_omega0Type
   */
  public void setScale_delta_omega0(Asn1Object value) {
    this.scale_delta_omega0_ = (GPSEphemerisDeltaScales.scale_delta_omega0Type) value;
  }
  public GPSEphemerisDeltaScales.scale_delta_omega0Type setScale_delta_omega0ToNewInstance() {
    scale_delta_omega0_ = new GPSEphemerisDeltaScales.scale_delta_omega0Type();
    return scale_delta_omega0_;
  }
  
  private GPSEphemerisDeltaScales.scale_delta_crsType scale_delta_crs_;
  public GPSEphemerisDeltaScales.scale_delta_crsType getScale_delta_crs() {
    return scale_delta_crs_;
  }
  /**
   * @throws ClassCastException if value is not a GPSEphemerisDeltaScales.scale_delta_crsType
   */
  public void setScale_delta_crs(Asn1Object value) {
    this.scale_delta_crs_ = (GPSEphemerisDeltaScales.scale_delta_crsType) value;
  }
  public GPSEphemerisDeltaScales.scale_delta_crsType setScale_delta_crsToNewInstance() {
    scale_delta_crs_ = new GPSEphemerisDeltaScales.scale_delta_crsType();
    return scale_delta_crs_;
  }
  
  private GPSEphemerisDeltaScales.scale_delta_cisType scale_delta_cis_;
  public GPSEphemerisDeltaScales.scale_delta_cisType getScale_delta_cis() {
    return scale_delta_cis_;
  }
  /**
   * @throws ClassCastException if value is not a GPSEphemerisDeltaScales.scale_delta_cisType
   */
  public void setScale_delta_cis(Asn1Object value) {
    this.scale_delta_cis_ = (GPSEphemerisDeltaScales.scale_delta_cisType) value;
  }
  public GPSEphemerisDeltaScales.scale_delta_cisType setScale_delta_cisToNewInstance() {
    scale_delta_cis_ = new GPSEphemerisDeltaScales.scale_delta_cisType();
    return scale_delta_cis_;
  }
  
  private GPSEphemerisDeltaScales.scale_delta_cusType scale_delta_cus_;
  public GPSEphemerisDeltaScales.scale_delta_cusType getScale_delta_cus() {
    return scale_delta_cus_;
  }
  /**
   * @throws ClassCastException if value is not a GPSEphemerisDeltaScales.scale_delta_cusType
   */
  public void setScale_delta_cus(Asn1Object value) {
    this.scale_delta_cus_ = (GPSEphemerisDeltaScales.scale_delta_cusType) value;
  }
  public GPSEphemerisDeltaScales.scale_delta_cusType setScale_delta_cusToNewInstance() {
    scale_delta_cus_ = new GPSEphemerisDeltaScales.scale_delta_cusType();
    return scale_delta_cus_;
  }
  
  private GPSEphemerisDeltaScales.scale_delta_crcType scale_delta_crc_;
  public GPSEphemerisDeltaScales.scale_delta_crcType getScale_delta_crc() {
    return scale_delta_crc_;
  }
  /**
   * @throws ClassCastException if value is not a GPSEphemerisDeltaScales.scale_delta_crcType
   */
  public void setScale_delta_crc(Asn1Object value) {
    this.scale_delta_crc_ = (GPSEphemerisDeltaScales.scale_delta_crcType) value;
  }
  public GPSEphemerisDeltaScales.scale_delta_crcType setScale_delta_crcToNewInstance() {
    scale_delta_crc_ = new GPSEphemerisDeltaScales.scale_delta_crcType();
    return scale_delta_crc_;
  }
  
  private GPSEphemerisDeltaScales.scale_delta_cicType scale_delta_cic_;
  public GPSEphemerisDeltaScales.scale_delta_cicType getScale_delta_cic() {
    return scale_delta_cic_;
  }
  /**
   * @throws ClassCastException if value is not a GPSEphemerisDeltaScales.scale_delta_cicType
   */
  public void setScale_delta_cic(Asn1Object value) {
    this.scale_delta_cic_ = (GPSEphemerisDeltaScales.scale_delta_cicType) value;
  }
  public GPSEphemerisDeltaScales.scale_delta_cicType setScale_delta_cicToNewInstance() {
    scale_delta_cic_ = new GPSEphemerisDeltaScales.scale_delta_cicType();
    return scale_delta_cic_;
  }
  
  private GPSEphemerisDeltaScales.scale_delta_cucType scale_delta_cuc_;
  public GPSEphemerisDeltaScales.scale_delta_cucType getScale_delta_cuc() {
    return scale_delta_cuc_;
  }
  /**
   * @throws ClassCastException if value is not a GPSEphemerisDeltaScales.scale_delta_cucType
   */
  public void setScale_delta_cuc(Asn1Object value) {
    this.scale_delta_cuc_ = (GPSEphemerisDeltaScales.scale_delta_cucType) value;
  }
  public GPSEphemerisDeltaScales.scale_delta_cucType setScale_delta_cucToNewInstance() {
    scale_delta_cuc_ = new GPSEphemerisDeltaScales.scale_delta_cucType();
    return scale_delta_cuc_;
  }
  
  private GPSEphemerisDeltaScales.scale_delta_tgdType scale_delta_tgd_;
  public GPSEphemerisDeltaScales.scale_delta_tgdType getScale_delta_tgd() {
    return scale_delta_tgd_;
  }
  /**
   * @throws ClassCastException if value is not a GPSEphemerisDeltaScales.scale_delta_tgdType
   */
  public void setScale_delta_tgd(Asn1Object value) {
    this.scale_delta_tgd_ = (GPSEphemerisDeltaScales.scale_delta_tgdType) value;
  }
  public GPSEphemerisDeltaScales.scale_delta_tgdType setScale_delta_tgdToNewInstance() {
    scale_delta_tgd_ = new GPSEphemerisDeltaScales.scale_delta_tgdType();
    return scale_delta_tgd_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getScale_delta_omega() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getScale_delta_omega();
          }

          @Override public void setToNewInstance() {
            setScale_delta_omegaToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GPSEphemerisDeltaScales.scale_delta_omegaType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "scale_delta_omega : "
                    + getScale_delta_omega().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getScale_delta_deltaN() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getScale_delta_deltaN();
          }

          @Override public void setToNewInstance() {
            setScale_delta_deltaNToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GPSEphemerisDeltaScales.scale_delta_deltaNType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "scale_delta_deltaN : "
                    + getScale_delta_deltaN().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getScale_delta_m0() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getScale_delta_m0();
          }

          @Override public void setToNewInstance() {
            setScale_delta_m0ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GPSEphemerisDeltaScales.scale_delta_m0Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "scale_delta_m0 : "
                    + getScale_delta_m0().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getScale_delta_omegadot() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getScale_delta_omegadot();
          }

          @Override public void setToNewInstance() {
            setScale_delta_omegadotToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GPSEphemerisDeltaScales.scale_delta_omegadotType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "scale_delta_omegadot : "
                    + getScale_delta_omegadot().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getScale_delta_e() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getScale_delta_e();
          }

          @Override public void setToNewInstance() {
            setScale_delta_eToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GPSEphemerisDeltaScales.scale_delta_eType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "scale_delta_e : "
                    + getScale_delta_e().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getScale_delta_idot() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getScale_delta_idot();
          }

          @Override public void setToNewInstance() {
            setScale_delta_idotToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GPSEphemerisDeltaScales.scale_delta_idotType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "scale_delta_idot : "
                    + getScale_delta_idot().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getScale_delta_sqrtA() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getScale_delta_sqrtA();
          }

          @Override public void setToNewInstance() {
            setScale_delta_sqrtAToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GPSEphemerisDeltaScales.scale_delta_sqrtAType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "scale_delta_sqrtA : "
                    + getScale_delta_sqrtA().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 7);

          @Override public boolean isExplicitlySet() {
            return getScale_delta_i0() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getScale_delta_i0();
          }

          @Override public void setToNewInstance() {
            setScale_delta_i0ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GPSEphemerisDeltaScales.scale_delta_i0Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "scale_delta_i0 : "
                    + getScale_delta_i0().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 8);

          @Override public boolean isExplicitlySet() {
            return getScale_delta_omega0() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getScale_delta_omega0();
          }

          @Override public void setToNewInstance() {
            setScale_delta_omega0ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GPSEphemerisDeltaScales.scale_delta_omega0Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "scale_delta_omega0 : "
                    + getScale_delta_omega0().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 9);

          @Override public boolean isExplicitlySet() {
            return getScale_delta_crs() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getScale_delta_crs();
          }

          @Override public void setToNewInstance() {
            setScale_delta_crsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GPSEphemerisDeltaScales.scale_delta_crsType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "scale_delta_crs : "
                    + getScale_delta_crs().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 10);

          @Override public boolean isExplicitlySet() {
            return getScale_delta_cis() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getScale_delta_cis();
          }

          @Override public void setToNewInstance() {
            setScale_delta_cisToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GPSEphemerisDeltaScales.scale_delta_cisType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "scale_delta_cis : "
                    + getScale_delta_cis().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 11);

          @Override public boolean isExplicitlySet() {
            return getScale_delta_cus() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getScale_delta_cus();
          }

          @Override public void setToNewInstance() {
            setScale_delta_cusToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GPSEphemerisDeltaScales.scale_delta_cusType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "scale_delta_cus : "
                    + getScale_delta_cus().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 12);

          @Override public boolean isExplicitlySet() {
            return getScale_delta_crc() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getScale_delta_crc();
          }

          @Override public void setToNewInstance() {
            setScale_delta_crcToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GPSEphemerisDeltaScales.scale_delta_crcType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "scale_delta_crc : "
                    + getScale_delta_crc().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 13);

          @Override public boolean isExplicitlySet() {
            return getScale_delta_cic() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getScale_delta_cic();
          }

          @Override public void setToNewInstance() {
            setScale_delta_cicToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GPSEphemerisDeltaScales.scale_delta_cicType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "scale_delta_cic : "
                    + getScale_delta_cic().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 14);

          @Override public boolean isExplicitlySet() {
            return getScale_delta_cuc() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getScale_delta_cuc();
          }

          @Override public void setToNewInstance() {
            setScale_delta_cucToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GPSEphemerisDeltaScales.scale_delta_cucType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "scale_delta_cuc : "
                    + getScale_delta_cuc().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 15);

          @Override public boolean isExplicitlySet() {
            return getScale_delta_tgd() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getScale_delta_tgd();
          }

          @Override public void setToNewInstance() {
            setScale_delta_tgdToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GPSEphemerisDeltaScales.scale_delta_tgdType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "scale_delta_tgd : "
                    + getScale_delta_tgd().toIndentedString(indent);
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
public static class scale_delta_omegaType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_scale_delta_omegaType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public scale_delta_omegaType() {
    super();
    setValueRange(new java.math.BigInteger("-16"), new java.math.BigInteger("15"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_scale_delta_omegaType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_scale_delta_omegaType != null) {
      return ImmutableList.of(TAG_scale_delta_omegaType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new scale_delta_omegaType from encoded stream.
   */
  public static scale_delta_omegaType fromPerUnaligned(byte[] encodedBytes) {
    scale_delta_omegaType result = new scale_delta_omegaType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new scale_delta_omegaType from encoded stream.
   */
  public static scale_delta_omegaType fromPerAligned(byte[] encodedBytes) {
    scale_delta_omegaType result = new scale_delta_omegaType();
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
    return "scale_delta_omegaType = " + getInteger() + ";\n";
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
public static class scale_delta_deltaNType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_scale_delta_deltaNType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public scale_delta_deltaNType() {
    super();
    setValueRange(new java.math.BigInteger("-16"), new java.math.BigInteger("15"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_scale_delta_deltaNType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_scale_delta_deltaNType != null) {
      return ImmutableList.of(TAG_scale_delta_deltaNType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new scale_delta_deltaNType from encoded stream.
   */
  public static scale_delta_deltaNType fromPerUnaligned(byte[] encodedBytes) {
    scale_delta_deltaNType result = new scale_delta_deltaNType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new scale_delta_deltaNType from encoded stream.
   */
  public static scale_delta_deltaNType fromPerAligned(byte[] encodedBytes) {
    scale_delta_deltaNType result = new scale_delta_deltaNType();
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
    return "scale_delta_deltaNType = " + getInteger() + ";\n";
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
public static class scale_delta_m0Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_scale_delta_m0Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public scale_delta_m0Type() {
    super();
    setValueRange(new java.math.BigInteger("-16"), new java.math.BigInteger("15"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_scale_delta_m0Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_scale_delta_m0Type != null) {
      return ImmutableList.of(TAG_scale_delta_m0Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new scale_delta_m0Type from encoded stream.
   */
  public static scale_delta_m0Type fromPerUnaligned(byte[] encodedBytes) {
    scale_delta_m0Type result = new scale_delta_m0Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new scale_delta_m0Type from encoded stream.
   */
  public static scale_delta_m0Type fromPerAligned(byte[] encodedBytes) {
    scale_delta_m0Type result = new scale_delta_m0Type();
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
    return "scale_delta_m0Type = " + getInteger() + ";\n";
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
public static class scale_delta_omegadotType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_scale_delta_omegadotType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public scale_delta_omegadotType() {
    super();
    setValueRange(new java.math.BigInteger("-16"), new java.math.BigInteger("15"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_scale_delta_omegadotType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_scale_delta_omegadotType != null) {
      return ImmutableList.of(TAG_scale_delta_omegadotType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new scale_delta_omegadotType from encoded stream.
   */
  public static scale_delta_omegadotType fromPerUnaligned(byte[] encodedBytes) {
    scale_delta_omegadotType result = new scale_delta_omegadotType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new scale_delta_omegadotType from encoded stream.
   */
  public static scale_delta_omegadotType fromPerAligned(byte[] encodedBytes) {
    scale_delta_omegadotType result = new scale_delta_omegadotType();
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
    return "scale_delta_omegadotType = " + getInteger() + ";\n";
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
public static class scale_delta_eType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_scale_delta_eType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public scale_delta_eType() {
    super();
    setValueRange(new java.math.BigInteger("-16"), new java.math.BigInteger("15"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_scale_delta_eType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_scale_delta_eType != null) {
      return ImmutableList.of(TAG_scale_delta_eType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new scale_delta_eType from encoded stream.
   */
  public static scale_delta_eType fromPerUnaligned(byte[] encodedBytes) {
    scale_delta_eType result = new scale_delta_eType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new scale_delta_eType from encoded stream.
   */
  public static scale_delta_eType fromPerAligned(byte[] encodedBytes) {
    scale_delta_eType result = new scale_delta_eType();
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
    return "scale_delta_eType = " + getInteger() + ";\n";
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
public static class scale_delta_idotType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_scale_delta_idotType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public scale_delta_idotType() {
    super();
    setValueRange(new java.math.BigInteger("-16"), new java.math.BigInteger("15"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_scale_delta_idotType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_scale_delta_idotType != null) {
      return ImmutableList.of(TAG_scale_delta_idotType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new scale_delta_idotType from encoded stream.
   */
  public static scale_delta_idotType fromPerUnaligned(byte[] encodedBytes) {
    scale_delta_idotType result = new scale_delta_idotType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new scale_delta_idotType from encoded stream.
   */
  public static scale_delta_idotType fromPerAligned(byte[] encodedBytes) {
    scale_delta_idotType result = new scale_delta_idotType();
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
    return "scale_delta_idotType = " + getInteger() + ";\n";
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
public static class scale_delta_sqrtAType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_scale_delta_sqrtAType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public scale_delta_sqrtAType() {
    super();
    setValueRange(new java.math.BigInteger("-16"), new java.math.BigInteger("15"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_scale_delta_sqrtAType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_scale_delta_sqrtAType != null) {
      return ImmutableList.of(TAG_scale_delta_sqrtAType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new scale_delta_sqrtAType from encoded stream.
   */
  public static scale_delta_sqrtAType fromPerUnaligned(byte[] encodedBytes) {
    scale_delta_sqrtAType result = new scale_delta_sqrtAType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new scale_delta_sqrtAType from encoded stream.
   */
  public static scale_delta_sqrtAType fromPerAligned(byte[] encodedBytes) {
    scale_delta_sqrtAType result = new scale_delta_sqrtAType();
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
    return "scale_delta_sqrtAType = " + getInteger() + ";\n";
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
public static class scale_delta_i0Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_scale_delta_i0Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public scale_delta_i0Type() {
    super();
    setValueRange(new java.math.BigInteger("-16"), new java.math.BigInteger("15"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_scale_delta_i0Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_scale_delta_i0Type != null) {
      return ImmutableList.of(TAG_scale_delta_i0Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new scale_delta_i0Type from encoded stream.
   */
  public static scale_delta_i0Type fromPerUnaligned(byte[] encodedBytes) {
    scale_delta_i0Type result = new scale_delta_i0Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new scale_delta_i0Type from encoded stream.
   */
  public static scale_delta_i0Type fromPerAligned(byte[] encodedBytes) {
    scale_delta_i0Type result = new scale_delta_i0Type();
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
    return "scale_delta_i0Type = " + getInteger() + ";\n";
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
public static class scale_delta_omega0Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_scale_delta_omega0Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public scale_delta_omega0Type() {
    super();
    setValueRange(new java.math.BigInteger("-16"), new java.math.BigInteger("15"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_scale_delta_omega0Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_scale_delta_omega0Type != null) {
      return ImmutableList.of(TAG_scale_delta_omega0Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new scale_delta_omega0Type from encoded stream.
   */
  public static scale_delta_omega0Type fromPerUnaligned(byte[] encodedBytes) {
    scale_delta_omega0Type result = new scale_delta_omega0Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new scale_delta_omega0Type from encoded stream.
   */
  public static scale_delta_omega0Type fromPerAligned(byte[] encodedBytes) {
    scale_delta_omega0Type result = new scale_delta_omega0Type();
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
    return "scale_delta_omega0Type = " + getInteger() + ";\n";
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
public static class scale_delta_crsType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_scale_delta_crsType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public scale_delta_crsType() {
    super();
    setValueRange(new java.math.BigInteger("-16"), new java.math.BigInteger("15"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_scale_delta_crsType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_scale_delta_crsType != null) {
      return ImmutableList.of(TAG_scale_delta_crsType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new scale_delta_crsType from encoded stream.
   */
  public static scale_delta_crsType fromPerUnaligned(byte[] encodedBytes) {
    scale_delta_crsType result = new scale_delta_crsType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new scale_delta_crsType from encoded stream.
   */
  public static scale_delta_crsType fromPerAligned(byte[] encodedBytes) {
    scale_delta_crsType result = new scale_delta_crsType();
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
    return "scale_delta_crsType = " + getInteger() + ";\n";
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
public static class scale_delta_cisType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_scale_delta_cisType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public scale_delta_cisType() {
    super();
    setValueRange(new java.math.BigInteger("-16"), new java.math.BigInteger("15"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_scale_delta_cisType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_scale_delta_cisType != null) {
      return ImmutableList.of(TAG_scale_delta_cisType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new scale_delta_cisType from encoded stream.
   */
  public static scale_delta_cisType fromPerUnaligned(byte[] encodedBytes) {
    scale_delta_cisType result = new scale_delta_cisType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new scale_delta_cisType from encoded stream.
   */
  public static scale_delta_cisType fromPerAligned(byte[] encodedBytes) {
    scale_delta_cisType result = new scale_delta_cisType();
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
    return "scale_delta_cisType = " + getInteger() + ";\n";
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
public static class scale_delta_cusType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_scale_delta_cusType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public scale_delta_cusType() {
    super();
    setValueRange(new java.math.BigInteger("-16"), new java.math.BigInteger("15"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_scale_delta_cusType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_scale_delta_cusType != null) {
      return ImmutableList.of(TAG_scale_delta_cusType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new scale_delta_cusType from encoded stream.
   */
  public static scale_delta_cusType fromPerUnaligned(byte[] encodedBytes) {
    scale_delta_cusType result = new scale_delta_cusType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new scale_delta_cusType from encoded stream.
   */
  public static scale_delta_cusType fromPerAligned(byte[] encodedBytes) {
    scale_delta_cusType result = new scale_delta_cusType();
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
    return "scale_delta_cusType = " + getInteger() + ";\n";
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
public static class scale_delta_crcType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_scale_delta_crcType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public scale_delta_crcType() {
    super();
    setValueRange(new java.math.BigInteger("-16"), new java.math.BigInteger("15"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_scale_delta_crcType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_scale_delta_crcType != null) {
      return ImmutableList.of(TAG_scale_delta_crcType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new scale_delta_crcType from encoded stream.
   */
  public static scale_delta_crcType fromPerUnaligned(byte[] encodedBytes) {
    scale_delta_crcType result = new scale_delta_crcType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new scale_delta_crcType from encoded stream.
   */
  public static scale_delta_crcType fromPerAligned(byte[] encodedBytes) {
    scale_delta_crcType result = new scale_delta_crcType();
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
    return "scale_delta_crcType = " + getInteger() + ";\n";
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
public static class scale_delta_cicType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_scale_delta_cicType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public scale_delta_cicType() {
    super();
    setValueRange(new java.math.BigInteger("-16"), new java.math.BigInteger("15"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_scale_delta_cicType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_scale_delta_cicType != null) {
      return ImmutableList.of(TAG_scale_delta_cicType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new scale_delta_cicType from encoded stream.
   */
  public static scale_delta_cicType fromPerUnaligned(byte[] encodedBytes) {
    scale_delta_cicType result = new scale_delta_cicType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new scale_delta_cicType from encoded stream.
   */
  public static scale_delta_cicType fromPerAligned(byte[] encodedBytes) {
    scale_delta_cicType result = new scale_delta_cicType();
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
    return "scale_delta_cicType = " + getInteger() + ";\n";
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
public static class scale_delta_cucType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_scale_delta_cucType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public scale_delta_cucType() {
    super();
    setValueRange(new java.math.BigInteger("-16"), new java.math.BigInteger("15"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_scale_delta_cucType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_scale_delta_cucType != null) {
      return ImmutableList.of(TAG_scale_delta_cucType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new scale_delta_cucType from encoded stream.
   */
  public static scale_delta_cucType fromPerUnaligned(byte[] encodedBytes) {
    scale_delta_cucType result = new scale_delta_cucType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new scale_delta_cucType from encoded stream.
   */
  public static scale_delta_cucType fromPerAligned(byte[] encodedBytes) {
    scale_delta_cucType result = new scale_delta_cucType();
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
    return "scale_delta_cucType = " + getInteger() + ";\n";
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
public static class scale_delta_tgdType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_scale_delta_tgdType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public scale_delta_tgdType() {
    super();
    setValueRange(new java.math.BigInteger("-16"), new java.math.BigInteger("15"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_scale_delta_tgdType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_scale_delta_tgdType != null) {
      return ImmutableList.of(TAG_scale_delta_tgdType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new scale_delta_tgdType from encoded stream.
   */
  public static scale_delta_tgdType fromPerUnaligned(byte[] encodedBytes) {
    scale_delta_tgdType result = new scale_delta_tgdType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new scale_delta_tgdType from encoded stream.
   */
  public static scale_delta_tgdType fromPerAligned(byte[] encodedBytes) {
    scale_delta_tgdType result = new scale_delta_tgdType();
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
    return "scale_delta_tgdType = " + getInteger() + ";\n";
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
    builder.append("GPSEphemerisDeltaScales = {\n");
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
