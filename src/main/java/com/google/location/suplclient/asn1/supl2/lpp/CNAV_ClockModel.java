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
public  class CNAV_ClockModel extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_CNAV_ClockModel
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public CNAV_ClockModel() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_CNAV_ClockModel;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_CNAV_ClockModel != null) {
      return ImmutableList.of(TAG_CNAV_ClockModel);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new CNAV_ClockModel from encoded stream.
   */
  public static CNAV_ClockModel fromPerUnaligned(byte[] encodedBytes) {
    CNAV_ClockModel result = new CNAV_ClockModel();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new CNAV_ClockModel from encoded stream.
   */
  public static CNAV_ClockModel fromPerAligned(byte[] encodedBytes) {
    CNAV_ClockModel result = new CNAV_ClockModel();
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

  
  private CNAV_ClockModel.cnavTocType cnavToc_;
  public CNAV_ClockModel.cnavTocType getCnavToc() {
    return cnavToc_;
  }
  /**
   * @throws ClassCastException if value is not a CNAV_ClockModel.cnavTocType
   */
  public void setCnavToc(Asn1Object value) {
    this.cnavToc_ = (CNAV_ClockModel.cnavTocType) value;
  }
  public CNAV_ClockModel.cnavTocType setCnavTocToNewInstance() {
    cnavToc_ = new CNAV_ClockModel.cnavTocType();
    return cnavToc_;
  }
  
  private CNAV_ClockModel.cnavTopType cnavTop_;
  public CNAV_ClockModel.cnavTopType getCnavTop() {
    return cnavTop_;
  }
  /**
   * @throws ClassCastException if value is not a CNAV_ClockModel.cnavTopType
   */
  public void setCnavTop(Asn1Object value) {
    this.cnavTop_ = (CNAV_ClockModel.cnavTopType) value;
  }
  public CNAV_ClockModel.cnavTopType setCnavTopToNewInstance() {
    cnavTop_ = new CNAV_ClockModel.cnavTopType();
    return cnavTop_;
  }
  
  private CNAV_ClockModel.cnavURA0Type cnavURA0_;
  public CNAV_ClockModel.cnavURA0Type getCnavURA0() {
    return cnavURA0_;
  }
  /**
   * @throws ClassCastException if value is not a CNAV_ClockModel.cnavURA0Type
   */
  public void setCnavURA0(Asn1Object value) {
    this.cnavURA0_ = (CNAV_ClockModel.cnavURA0Type) value;
  }
  public CNAV_ClockModel.cnavURA0Type setCnavURA0ToNewInstance() {
    cnavURA0_ = new CNAV_ClockModel.cnavURA0Type();
    return cnavURA0_;
  }
  
  private CNAV_ClockModel.cnavURA1Type cnavURA1_;
  public CNAV_ClockModel.cnavURA1Type getCnavURA1() {
    return cnavURA1_;
  }
  /**
   * @throws ClassCastException if value is not a CNAV_ClockModel.cnavURA1Type
   */
  public void setCnavURA1(Asn1Object value) {
    this.cnavURA1_ = (CNAV_ClockModel.cnavURA1Type) value;
  }
  public CNAV_ClockModel.cnavURA1Type setCnavURA1ToNewInstance() {
    cnavURA1_ = new CNAV_ClockModel.cnavURA1Type();
    return cnavURA1_;
  }
  
  private CNAV_ClockModel.cnavURA2Type cnavURA2_;
  public CNAV_ClockModel.cnavURA2Type getCnavURA2() {
    return cnavURA2_;
  }
  /**
   * @throws ClassCastException if value is not a CNAV_ClockModel.cnavURA2Type
   */
  public void setCnavURA2(Asn1Object value) {
    this.cnavURA2_ = (CNAV_ClockModel.cnavURA2Type) value;
  }
  public CNAV_ClockModel.cnavURA2Type setCnavURA2ToNewInstance() {
    cnavURA2_ = new CNAV_ClockModel.cnavURA2Type();
    return cnavURA2_;
  }
  
  private CNAV_ClockModel.cnavAf2Type cnavAf2_;
  public CNAV_ClockModel.cnavAf2Type getCnavAf2() {
    return cnavAf2_;
  }
  /**
   * @throws ClassCastException if value is not a CNAV_ClockModel.cnavAf2Type
   */
  public void setCnavAf2(Asn1Object value) {
    this.cnavAf2_ = (CNAV_ClockModel.cnavAf2Type) value;
  }
  public CNAV_ClockModel.cnavAf2Type setCnavAf2ToNewInstance() {
    cnavAf2_ = new CNAV_ClockModel.cnavAf2Type();
    return cnavAf2_;
  }
  
  private CNAV_ClockModel.cnavAf1Type cnavAf1_;
  public CNAV_ClockModel.cnavAf1Type getCnavAf1() {
    return cnavAf1_;
  }
  /**
   * @throws ClassCastException if value is not a CNAV_ClockModel.cnavAf1Type
   */
  public void setCnavAf1(Asn1Object value) {
    this.cnavAf1_ = (CNAV_ClockModel.cnavAf1Type) value;
  }
  public CNAV_ClockModel.cnavAf1Type setCnavAf1ToNewInstance() {
    cnavAf1_ = new CNAV_ClockModel.cnavAf1Type();
    return cnavAf1_;
  }
  
  private CNAV_ClockModel.cnavAf0Type cnavAf0_;
  public CNAV_ClockModel.cnavAf0Type getCnavAf0() {
    return cnavAf0_;
  }
  /**
   * @throws ClassCastException if value is not a CNAV_ClockModel.cnavAf0Type
   */
  public void setCnavAf0(Asn1Object value) {
    this.cnavAf0_ = (CNAV_ClockModel.cnavAf0Type) value;
  }
  public CNAV_ClockModel.cnavAf0Type setCnavAf0ToNewInstance() {
    cnavAf0_ = new CNAV_ClockModel.cnavAf0Type();
    return cnavAf0_;
  }
  
  private CNAV_ClockModel.cnavTgdType cnavTgd_;
  public CNAV_ClockModel.cnavTgdType getCnavTgd() {
    return cnavTgd_;
  }
  /**
   * @throws ClassCastException if value is not a CNAV_ClockModel.cnavTgdType
   */
  public void setCnavTgd(Asn1Object value) {
    this.cnavTgd_ = (CNAV_ClockModel.cnavTgdType) value;
  }
  public CNAV_ClockModel.cnavTgdType setCnavTgdToNewInstance() {
    cnavTgd_ = new CNAV_ClockModel.cnavTgdType();
    return cnavTgd_;
  }
  
  private CNAV_ClockModel.cnavISCl1cpType cnavISCl1cp_;
  public CNAV_ClockModel.cnavISCl1cpType getCnavISCl1cp() {
    return cnavISCl1cp_;
  }
  /**
   * @throws ClassCastException if value is not a CNAV_ClockModel.cnavISCl1cpType
   */
  public void setCnavISCl1cp(Asn1Object value) {
    this.cnavISCl1cp_ = (CNAV_ClockModel.cnavISCl1cpType) value;
  }
  public CNAV_ClockModel.cnavISCl1cpType setCnavISCl1cpToNewInstance() {
    cnavISCl1cp_ = new CNAV_ClockModel.cnavISCl1cpType();
    return cnavISCl1cp_;
  }
  
  private CNAV_ClockModel.cnavISCl1cdType cnavISCl1cd_;
  public CNAV_ClockModel.cnavISCl1cdType getCnavISCl1cd() {
    return cnavISCl1cd_;
  }
  /**
   * @throws ClassCastException if value is not a CNAV_ClockModel.cnavISCl1cdType
   */
  public void setCnavISCl1cd(Asn1Object value) {
    this.cnavISCl1cd_ = (CNAV_ClockModel.cnavISCl1cdType) value;
  }
  public CNAV_ClockModel.cnavISCl1cdType setCnavISCl1cdToNewInstance() {
    cnavISCl1cd_ = new CNAV_ClockModel.cnavISCl1cdType();
    return cnavISCl1cd_;
  }
  
  private CNAV_ClockModel.cnavISCl1caType cnavISCl1ca_;
  public CNAV_ClockModel.cnavISCl1caType getCnavISCl1ca() {
    return cnavISCl1ca_;
  }
  /**
   * @throws ClassCastException if value is not a CNAV_ClockModel.cnavISCl1caType
   */
  public void setCnavISCl1ca(Asn1Object value) {
    this.cnavISCl1ca_ = (CNAV_ClockModel.cnavISCl1caType) value;
  }
  public CNAV_ClockModel.cnavISCl1caType setCnavISCl1caToNewInstance() {
    cnavISCl1ca_ = new CNAV_ClockModel.cnavISCl1caType();
    return cnavISCl1ca_;
  }
  
  private CNAV_ClockModel.cnavISCl2cType cnavISCl2c_;
  public CNAV_ClockModel.cnavISCl2cType getCnavISCl2c() {
    return cnavISCl2c_;
  }
  /**
   * @throws ClassCastException if value is not a CNAV_ClockModel.cnavISCl2cType
   */
  public void setCnavISCl2c(Asn1Object value) {
    this.cnavISCl2c_ = (CNAV_ClockModel.cnavISCl2cType) value;
  }
  public CNAV_ClockModel.cnavISCl2cType setCnavISCl2cToNewInstance() {
    cnavISCl2c_ = new CNAV_ClockModel.cnavISCl2cType();
    return cnavISCl2c_;
  }
  
  private CNAV_ClockModel.cnavISCl5i5Type cnavISCl5i5_;
  public CNAV_ClockModel.cnavISCl5i5Type getCnavISCl5i5() {
    return cnavISCl5i5_;
  }
  /**
   * @throws ClassCastException if value is not a CNAV_ClockModel.cnavISCl5i5Type
   */
  public void setCnavISCl5i5(Asn1Object value) {
    this.cnavISCl5i5_ = (CNAV_ClockModel.cnavISCl5i5Type) value;
  }
  public CNAV_ClockModel.cnavISCl5i5Type setCnavISCl5i5ToNewInstance() {
    cnavISCl5i5_ = new CNAV_ClockModel.cnavISCl5i5Type();
    return cnavISCl5i5_;
  }
  
  private CNAV_ClockModel.cnavISCl5q5Type cnavISCl5q5_;
  public CNAV_ClockModel.cnavISCl5q5Type getCnavISCl5q5() {
    return cnavISCl5q5_;
  }
  /**
   * @throws ClassCastException if value is not a CNAV_ClockModel.cnavISCl5q5Type
   */
  public void setCnavISCl5q5(Asn1Object value) {
    this.cnavISCl5q5_ = (CNAV_ClockModel.cnavISCl5q5Type) value;
  }
  public CNAV_ClockModel.cnavISCl5q5Type setCnavISCl5q5ToNewInstance() {
    cnavISCl5q5_ = new CNAV_ClockModel.cnavISCl5q5Type();
    return cnavISCl5q5_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getCnavToc() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCnavToc();
          }

          @Override public void setToNewInstance() {
            setCnavTocToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? CNAV_ClockModel.cnavTocType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "cnavToc : "
                    + getCnavToc().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getCnavTop() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCnavTop();
          }

          @Override public void setToNewInstance() {
            setCnavTopToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? CNAV_ClockModel.cnavTopType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "cnavTop : "
                    + getCnavTop().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getCnavURA0() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCnavURA0();
          }

          @Override public void setToNewInstance() {
            setCnavURA0ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? CNAV_ClockModel.cnavURA0Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "cnavURA0 : "
                    + getCnavURA0().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getCnavURA1() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCnavURA1();
          }

          @Override public void setToNewInstance() {
            setCnavURA1ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? CNAV_ClockModel.cnavURA1Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "cnavURA1 : "
                    + getCnavURA1().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getCnavURA2() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCnavURA2();
          }

          @Override public void setToNewInstance() {
            setCnavURA2ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? CNAV_ClockModel.cnavURA2Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "cnavURA2 : "
                    + getCnavURA2().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getCnavAf2() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCnavAf2();
          }

          @Override public void setToNewInstance() {
            setCnavAf2ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? CNAV_ClockModel.cnavAf2Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "cnavAf2 : "
                    + getCnavAf2().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getCnavAf1() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCnavAf1();
          }

          @Override public void setToNewInstance() {
            setCnavAf1ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? CNAV_ClockModel.cnavAf1Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "cnavAf1 : "
                    + getCnavAf1().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 7);

          @Override public boolean isExplicitlySet() {
            return getCnavAf0() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCnavAf0();
          }

          @Override public void setToNewInstance() {
            setCnavAf0ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? CNAV_ClockModel.cnavAf0Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "cnavAf0 : "
                    + getCnavAf0().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 8);

          @Override public boolean isExplicitlySet() {
            return getCnavTgd() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCnavTgd();
          }

          @Override public void setToNewInstance() {
            setCnavTgdToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? CNAV_ClockModel.cnavTgdType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "cnavTgd : "
                    + getCnavTgd().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 9);

          @Override public boolean isExplicitlySet() {
            return getCnavISCl1cp() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getCnavISCl1cp();
          }

          @Override public void setToNewInstance() {
            setCnavISCl1cpToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? CNAV_ClockModel.cnavISCl1cpType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "cnavISCl1cp : "
                    + getCnavISCl1cp().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 10);

          @Override public boolean isExplicitlySet() {
            return getCnavISCl1cd() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getCnavISCl1cd();
          }

          @Override public void setToNewInstance() {
            setCnavISCl1cdToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? CNAV_ClockModel.cnavISCl1cdType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "cnavISCl1cd : "
                    + getCnavISCl1cd().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 11);

          @Override public boolean isExplicitlySet() {
            return getCnavISCl1ca() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getCnavISCl1ca();
          }

          @Override public void setToNewInstance() {
            setCnavISCl1caToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? CNAV_ClockModel.cnavISCl1caType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "cnavISCl1ca : "
                    + getCnavISCl1ca().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 12);

          @Override public boolean isExplicitlySet() {
            return getCnavISCl2c() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getCnavISCl2c();
          }

          @Override public void setToNewInstance() {
            setCnavISCl2cToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? CNAV_ClockModel.cnavISCl2cType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "cnavISCl2c : "
                    + getCnavISCl2c().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 13);

          @Override public boolean isExplicitlySet() {
            return getCnavISCl5i5() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getCnavISCl5i5();
          }

          @Override public void setToNewInstance() {
            setCnavISCl5i5ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? CNAV_ClockModel.cnavISCl5i5Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "cnavISCl5i5 : "
                    + getCnavISCl5i5().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 14);

          @Override public boolean isExplicitlySet() {
            return getCnavISCl5q5() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getCnavISCl5q5();
          }

          @Override public void setToNewInstance() {
            setCnavISCl5q5ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? CNAV_ClockModel.cnavISCl5q5Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "cnavISCl5q5 : "
                    + getCnavISCl5q5().toIndentedString(indent);
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
public static class cnavTocType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_cnavTocType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public cnavTocType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("2015"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_cnavTocType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_cnavTocType != null) {
      return ImmutableList.of(TAG_cnavTocType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new cnavTocType from encoded stream.
   */
  public static cnavTocType fromPerUnaligned(byte[] encodedBytes) {
    cnavTocType result = new cnavTocType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new cnavTocType from encoded stream.
   */
  public static cnavTocType fromPerAligned(byte[] encodedBytes) {
    cnavTocType result = new cnavTocType();
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
    return "cnavTocType = " + getInteger() + ";\n";
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
public static class cnavTopType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_cnavTopType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public cnavTopType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("2015"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_cnavTopType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_cnavTopType != null) {
      return ImmutableList.of(TAG_cnavTopType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new cnavTopType from encoded stream.
   */
  public static cnavTopType fromPerUnaligned(byte[] encodedBytes) {
    cnavTopType result = new cnavTopType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new cnavTopType from encoded stream.
   */
  public static cnavTopType fromPerAligned(byte[] encodedBytes) {
    cnavTopType result = new cnavTopType();
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
    return "cnavTopType = " + getInteger() + ";\n";
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
public static class cnavURA0Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_cnavURA0Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public cnavURA0Type() {
    super();
    setValueRange(new java.math.BigInteger("-16"), new java.math.BigInteger("15"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_cnavURA0Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_cnavURA0Type != null) {
      return ImmutableList.of(TAG_cnavURA0Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new cnavURA0Type from encoded stream.
   */
  public static cnavURA0Type fromPerUnaligned(byte[] encodedBytes) {
    cnavURA0Type result = new cnavURA0Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new cnavURA0Type from encoded stream.
   */
  public static cnavURA0Type fromPerAligned(byte[] encodedBytes) {
    cnavURA0Type result = new cnavURA0Type();
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
    return "cnavURA0Type = " + getInteger() + ";\n";
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
public static class cnavURA1Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_cnavURA1Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public cnavURA1Type() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("7"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_cnavURA1Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_cnavURA1Type != null) {
      return ImmutableList.of(TAG_cnavURA1Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new cnavURA1Type from encoded stream.
   */
  public static cnavURA1Type fromPerUnaligned(byte[] encodedBytes) {
    cnavURA1Type result = new cnavURA1Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new cnavURA1Type from encoded stream.
   */
  public static cnavURA1Type fromPerAligned(byte[] encodedBytes) {
    cnavURA1Type result = new cnavURA1Type();
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
    return "cnavURA1Type = " + getInteger() + ";\n";
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
public static class cnavURA2Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_cnavURA2Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public cnavURA2Type() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("7"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_cnavURA2Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_cnavURA2Type != null) {
      return ImmutableList.of(TAG_cnavURA2Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new cnavURA2Type from encoded stream.
   */
  public static cnavURA2Type fromPerUnaligned(byte[] encodedBytes) {
    cnavURA2Type result = new cnavURA2Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new cnavURA2Type from encoded stream.
   */
  public static cnavURA2Type fromPerAligned(byte[] encodedBytes) {
    cnavURA2Type result = new cnavURA2Type();
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
    return "cnavURA2Type = " + getInteger() + ";\n";
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
public static class cnavAf2Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_cnavAf2Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public cnavAf2Type() {
    super();
    setValueRange(new java.math.BigInteger("-512"), new java.math.BigInteger("511"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_cnavAf2Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_cnavAf2Type != null) {
      return ImmutableList.of(TAG_cnavAf2Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new cnavAf2Type from encoded stream.
   */
  public static cnavAf2Type fromPerUnaligned(byte[] encodedBytes) {
    cnavAf2Type result = new cnavAf2Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new cnavAf2Type from encoded stream.
   */
  public static cnavAf2Type fromPerAligned(byte[] encodedBytes) {
    cnavAf2Type result = new cnavAf2Type();
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
    return "cnavAf2Type = " + getInteger() + ";\n";
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
public static class cnavAf1Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_cnavAf1Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public cnavAf1Type() {
    super();
    setValueRange(new java.math.BigInteger("-524288"), new java.math.BigInteger("524287"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_cnavAf1Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_cnavAf1Type != null) {
      return ImmutableList.of(TAG_cnavAf1Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new cnavAf1Type from encoded stream.
   */
  public static cnavAf1Type fromPerUnaligned(byte[] encodedBytes) {
    cnavAf1Type result = new cnavAf1Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new cnavAf1Type from encoded stream.
   */
  public static cnavAf1Type fromPerAligned(byte[] encodedBytes) {
    cnavAf1Type result = new cnavAf1Type();
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
    return "cnavAf1Type = " + getInteger() + ";\n";
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
public static class cnavAf0Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_cnavAf0Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public cnavAf0Type() {
    super();
    setValueRange(new java.math.BigInteger("-33554432"), new java.math.BigInteger("33554431"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_cnavAf0Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_cnavAf0Type != null) {
      return ImmutableList.of(TAG_cnavAf0Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new cnavAf0Type from encoded stream.
   */
  public static cnavAf0Type fromPerUnaligned(byte[] encodedBytes) {
    cnavAf0Type result = new cnavAf0Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new cnavAf0Type from encoded stream.
   */
  public static cnavAf0Type fromPerAligned(byte[] encodedBytes) {
    cnavAf0Type result = new cnavAf0Type();
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
    return "cnavAf0Type = " + getInteger() + ";\n";
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
public static class cnavTgdType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_cnavTgdType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public cnavTgdType() {
    super();
    setValueRange(new java.math.BigInteger("-4096"), new java.math.BigInteger("4095"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_cnavTgdType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_cnavTgdType != null) {
      return ImmutableList.of(TAG_cnavTgdType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new cnavTgdType from encoded stream.
   */
  public static cnavTgdType fromPerUnaligned(byte[] encodedBytes) {
    cnavTgdType result = new cnavTgdType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new cnavTgdType from encoded stream.
   */
  public static cnavTgdType fromPerAligned(byte[] encodedBytes) {
    cnavTgdType result = new cnavTgdType();
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
    return "cnavTgdType = " + getInteger() + ";\n";
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
public static class cnavISCl1cpType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_cnavISCl1cpType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public cnavISCl1cpType() {
    super();
    setValueRange(new java.math.BigInteger("-4096"), new java.math.BigInteger("4095"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_cnavISCl1cpType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_cnavISCl1cpType != null) {
      return ImmutableList.of(TAG_cnavISCl1cpType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new cnavISCl1cpType from encoded stream.
   */
  public static cnavISCl1cpType fromPerUnaligned(byte[] encodedBytes) {
    cnavISCl1cpType result = new cnavISCl1cpType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new cnavISCl1cpType from encoded stream.
   */
  public static cnavISCl1cpType fromPerAligned(byte[] encodedBytes) {
    cnavISCl1cpType result = new cnavISCl1cpType();
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
    return "cnavISCl1cpType = " + getInteger() + ";\n";
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
public static class cnavISCl1cdType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_cnavISCl1cdType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public cnavISCl1cdType() {
    super();
    setValueRange(new java.math.BigInteger("-4096"), new java.math.BigInteger("4095"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_cnavISCl1cdType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_cnavISCl1cdType != null) {
      return ImmutableList.of(TAG_cnavISCl1cdType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new cnavISCl1cdType from encoded stream.
   */
  public static cnavISCl1cdType fromPerUnaligned(byte[] encodedBytes) {
    cnavISCl1cdType result = new cnavISCl1cdType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new cnavISCl1cdType from encoded stream.
   */
  public static cnavISCl1cdType fromPerAligned(byte[] encodedBytes) {
    cnavISCl1cdType result = new cnavISCl1cdType();
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
    return "cnavISCl1cdType = " + getInteger() + ";\n";
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
public static class cnavISCl1caType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_cnavISCl1caType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public cnavISCl1caType() {
    super();
    setValueRange(new java.math.BigInteger("-4096"), new java.math.BigInteger("4095"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_cnavISCl1caType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_cnavISCl1caType != null) {
      return ImmutableList.of(TAG_cnavISCl1caType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new cnavISCl1caType from encoded stream.
   */
  public static cnavISCl1caType fromPerUnaligned(byte[] encodedBytes) {
    cnavISCl1caType result = new cnavISCl1caType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new cnavISCl1caType from encoded stream.
   */
  public static cnavISCl1caType fromPerAligned(byte[] encodedBytes) {
    cnavISCl1caType result = new cnavISCl1caType();
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
    return "cnavISCl1caType = " + getInteger() + ";\n";
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
public static class cnavISCl2cType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_cnavISCl2cType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public cnavISCl2cType() {
    super();
    setValueRange(new java.math.BigInteger("-4096"), new java.math.BigInteger("4095"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_cnavISCl2cType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_cnavISCl2cType != null) {
      return ImmutableList.of(TAG_cnavISCl2cType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new cnavISCl2cType from encoded stream.
   */
  public static cnavISCl2cType fromPerUnaligned(byte[] encodedBytes) {
    cnavISCl2cType result = new cnavISCl2cType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new cnavISCl2cType from encoded stream.
   */
  public static cnavISCl2cType fromPerAligned(byte[] encodedBytes) {
    cnavISCl2cType result = new cnavISCl2cType();
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
    return "cnavISCl2cType = " + getInteger() + ";\n";
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
public static class cnavISCl5i5Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_cnavISCl5i5Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public cnavISCl5i5Type() {
    super();
    setValueRange(new java.math.BigInteger("-4096"), new java.math.BigInteger("4095"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_cnavISCl5i5Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_cnavISCl5i5Type != null) {
      return ImmutableList.of(TAG_cnavISCl5i5Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new cnavISCl5i5Type from encoded stream.
   */
  public static cnavISCl5i5Type fromPerUnaligned(byte[] encodedBytes) {
    cnavISCl5i5Type result = new cnavISCl5i5Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new cnavISCl5i5Type from encoded stream.
   */
  public static cnavISCl5i5Type fromPerAligned(byte[] encodedBytes) {
    cnavISCl5i5Type result = new cnavISCl5i5Type();
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
    return "cnavISCl5i5Type = " + getInteger() + ";\n";
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
public static class cnavISCl5q5Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_cnavISCl5q5Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public cnavISCl5q5Type() {
    super();
    setValueRange(new java.math.BigInteger("-4096"), new java.math.BigInteger("4095"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_cnavISCl5q5Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_cnavISCl5q5Type != null) {
      return ImmutableList.of(TAG_cnavISCl5q5Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new cnavISCl5q5Type from encoded stream.
   */
  public static cnavISCl5q5Type fromPerUnaligned(byte[] encodedBytes) {
    cnavISCl5q5Type result = new cnavISCl5q5Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new cnavISCl5q5Type from encoded stream.
   */
  public static cnavISCl5q5Type fromPerAligned(byte[] encodedBytes) {
    cnavISCl5q5Type result = new cnavISCl5q5Type();
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
    return "cnavISCl5q5Type = " + getInteger() + ";\n";
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
    builder.append("CNAV_ClockModel = {\n");
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
