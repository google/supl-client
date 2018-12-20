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
import com.google.location.suplclient.asn1.base.Asn1BitString;
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
public  class Almanac_BDSAlmanacSet_r12 extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_Almanac_BDSAlmanacSet_r12
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public Almanac_BDSAlmanacSet_r12() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_Almanac_BDSAlmanacSet_r12;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_Almanac_BDSAlmanacSet_r12 != null) {
      return ImmutableList.of(TAG_Almanac_BDSAlmanacSet_r12);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new Almanac_BDSAlmanacSet_r12 from encoded stream.
   */
  public static Almanac_BDSAlmanacSet_r12 fromPerUnaligned(byte[] encodedBytes) {
    Almanac_BDSAlmanacSet_r12 result = new Almanac_BDSAlmanacSet_r12();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new Almanac_BDSAlmanacSet_r12 from encoded stream.
   */
  public static Almanac_BDSAlmanacSet_r12 fromPerAligned(byte[] encodedBytes) {
    Almanac_BDSAlmanacSet_r12 result = new Almanac_BDSAlmanacSet_r12();
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
  
  private Almanac_BDSAlmanacSet_r12.bdsAlmToa_r12Type bdsAlmToa_r12_;
  public Almanac_BDSAlmanacSet_r12.bdsAlmToa_r12Type getBdsAlmToa_r12() {
    return bdsAlmToa_r12_;
  }
  /**
   * @throws ClassCastException if value is not a Almanac_BDSAlmanacSet_r12.bdsAlmToa_r12Type
   */
  public void setBdsAlmToa_r12(Asn1Object value) {
    this.bdsAlmToa_r12_ = (Almanac_BDSAlmanacSet_r12.bdsAlmToa_r12Type) value;
  }
  public Almanac_BDSAlmanacSet_r12.bdsAlmToa_r12Type setBdsAlmToa_r12ToNewInstance() {
    bdsAlmToa_r12_ = new Almanac_BDSAlmanacSet_r12.bdsAlmToa_r12Type();
    return bdsAlmToa_r12_;
  }
  
  private Almanac_BDSAlmanacSet_r12.bdsAlmSqrtA_r12Type bdsAlmSqrtA_r12_;
  public Almanac_BDSAlmanacSet_r12.bdsAlmSqrtA_r12Type getBdsAlmSqrtA_r12() {
    return bdsAlmSqrtA_r12_;
  }
  /**
   * @throws ClassCastException if value is not a Almanac_BDSAlmanacSet_r12.bdsAlmSqrtA_r12Type
   */
  public void setBdsAlmSqrtA_r12(Asn1Object value) {
    this.bdsAlmSqrtA_r12_ = (Almanac_BDSAlmanacSet_r12.bdsAlmSqrtA_r12Type) value;
  }
  public Almanac_BDSAlmanacSet_r12.bdsAlmSqrtA_r12Type setBdsAlmSqrtA_r12ToNewInstance() {
    bdsAlmSqrtA_r12_ = new Almanac_BDSAlmanacSet_r12.bdsAlmSqrtA_r12Type();
    return bdsAlmSqrtA_r12_;
  }
  
  private Almanac_BDSAlmanacSet_r12.bdsAlmE_r12Type bdsAlmE_r12_;
  public Almanac_BDSAlmanacSet_r12.bdsAlmE_r12Type getBdsAlmE_r12() {
    return bdsAlmE_r12_;
  }
  /**
   * @throws ClassCastException if value is not a Almanac_BDSAlmanacSet_r12.bdsAlmE_r12Type
   */
  public void setBdsAlmE_r12(Asn1Object value) {
    this.bdsAlmE_r12_ = (Almanac_BDSAlmanacSet_r12.bdsAlmE_r12Type) value;
  }
  public Almanac_BDSAlmanacSet_r12.bdsAlmE_r12Type setBdsAlmE_r12ToNewInstance() {
    bdsAlmE_r12_ = new Almanac_BDSAlmanacSet_r12.bdsAlmE_r12Type();
    return bdsAlmE_r12_;
  }
  
  private Almanac_BDSAlmanacSet_r12.bdsAlmW_r12Type bdsAlmW_r12_;
  public Almanac_BDSAlmanacSet_r12.bdsAlmW_r12Type getBdsAlmW_r12() {
    return bdsAlmW_r12_;
  }
  /**
   * @throws ClassCastException if value is not a Almanac_BDSAlmanacSet_r12.bdsAlmW_r12Type
   */
  public void setBdsAlmW_r12(Asn1Object value) {
    this.bdsAlmW_r12_ = (Almanac_BDSAlmanacSet_r12.bdsAlmW_r12Type) value;
  }
  public Almanac_BDSAlmanacSet_r12.bdsAlmW_r12Type setBdsAlmW_r12ToNewInstance() {
    bdsAlmW_r12_ = new Almanac_BDSAlmanacSet_r12.bdsAlmW_r12Type();
    return bdsAlmW_r12_;
  }
  
  private Almanac_BDSAlmanacSet_r12.bdsAlmM0_r12Type bdsAlmM0_r12_;
  public Almanac_BDSAlmanacSet_r12.bdsAlmM0_r12Type getBdsAlmM0_r12() {
    return bdsAlmM0_r12_;
  }
  /**
   * @throws ClassCastException if value is not a Almanac_BDSAlmanacSet_r12.bdsAlmM0_r12Type
   */
  public void setBdsAlmM0_r12(Asn1Object value) {
    this.bdsAlmM0_r12_ = (Almanac_BDSAlmanacSet_r12.bdsAlmM0_r12Type) value;
  }
  public Almanac_BDSAlmanacSet_r12.bdsAlmM0_r12Type setBdsAlmM0_r12ToNewInstance() {
    bdsAlmM0_r12_ = new Almanac_BDSAlmanacSet_r12.bdsAlmM0_r12Type();
    return bdsAlmM0_r12_;
  }
  
  private Almanac_BDSAlmanacSet_r12.bdsAlmOmega0_r12Type bdsAlmOmega0_r12_;
  public Almanac_BDSAlmanacSet_r12.bdsAlmOmega0_r12Type getBdsAlmOmega0_r12() {
    return bdsAlmOmega0_r12_;
  }
  /**
   * @throws ClassCastException if value is not a Almanac_BDSAlmanacSet_r12.bdsAlmOmega0_r12Type
   */
  public void setBdsAlmOmega0_r12(Asn1Object value) {
    this.bdsAlmOmega0_r12_ = (Almanac_BDSAlmanacSet_r12.bdsAlmOmega0_r12Type) value;
  }
  public Almanac_BDSAlmanacSet_r12.bdsAlmOmega0_r12Type setBdsAlmOmega0_r12ToNewInstance() {
    bdsAlmOmega0_r12_ = new Almanac_BDSAlmanacSet_r12.bdsAlmOmega0_r12Type();
    return bdsAlmOmega0_r12_;
  }
  
  private Almanac_BDSAlmanacSet_r12.bdsAlmOmegaDot_r12Type bdsAlmOmegaDot_r12_;
  public Almanac_BDSAlmanacSet_r12.bdsAlmOmegaDot_r12Type getBdsAlmOmegaDot_r12() {
    return bdsAlmOmegaDot_r12_;
  }
  /**
   * @throws ClassCastException if value is not a Almanac_BDSAlmanacSet_r12.bdsAlmOmegaDot_r12Type
   */
  public void setBdsAlmOmegaDot_r12(Asn1Object value) {
    this.bdsAlmOmegaDot_r12_ = (Almanac_BDSAlmanacSet_r12.bdsAlmOmegaDot_r12Type) value;
  }
  public Almanac_BDSAlmanacSet_r12.bdsAlmOmegaDot_r12Type setBdsAlmOmegaDot_r12ToNewInstance() {
    bdsAlmOmegaDot_r12_ = new Almanac_BDSAlmanacSet_r12.bdsAlmOmegaDot_r12Type();
    return bdsAlmOmegaDot_r12_;
  }
  
  private Almanac_BDSAlmanacSet_r12.bdsAlmDeltaI_r12Type bdsAlmDeltaI_r12_;
  public Almanac_BDSAlmanacSet_r12.bdsAlmDeltaI_r12Type getBdsAlmDeltaI_r12() {
    return bdsAlmDeltaI_r12_;
  }
  /**
   * @throws ClassCastException if value is not a Almanac_BDSAlmanacSet_r12.bdsAlmDeltaI_r12Type
   */
  public void setBdsAlmDeltaI_r12(Asn1Object value) {
    this.bdsAlmDeltaI_r12_ = (Almanac_BDSAlmanacSet_r12.bdsAlmDeltaI_r12Type) value;
  }
  public Almanac_BDSAlmanacSet_r12.bdsAlmDeltaI_r12Type setBdsAlmDeltaI_r12ToNewInstance() {
    bdsAlmDeltaI_r12_ = new Almanac_BDSAlmanacSet_r12.bdsAlmDeltaI_r12Type();
    return bdsAlmDeltaI_r12_;
  }
  
  private Almanac_BDSAlmanacSet_r12.bdsAlmA0_r12Type bdsAlmA0_r12_;
  public Almanac_BDSAlmanacSet_r12.bdsAlmA0_r12Type getBdsAlmA0_r12() {
    return bdsAlmA0_r12_;
  }
  /**
   * @throws ClassCastException if value is not a Almanac_BDSAlmanacSet_r12.bdsAlmA0_r12Type
   */
  public void setBdsAlmA0_r12(Asn1Object value) {
    this.bdsAlmA0_r12_ = (Almanac_BDSAlmanacSet_r12.bdsAlmA0_r12Type) value;
  }
  public Almanac_BDSAlmanacSet_r12.bdsAlmA0_r12Type setBdsAlmA0_r12ToNewInstance() {
    bdsAlmA0_r12_ = new Almanac_BDSAlmanacSet_r12.bdsAlmA0_r12Type();
    return bdsAlmA0_r12_;
  }
  
  private Almanac_BDSAlmanacSet_r12.bdsAlmA1_r12Type bdsAlmA1_r12_;
  public Almanac_BDSAlmanacSet_r12.bdsAlmA1_r12Type getBdsAlmA1_r12() {
    return bdsAlmA1_r12_;
  }
  /**
   * @throws ClassCastException if value is not a Almanac_BDSAlmanacSet_r12.bdsAlmA1_r12Type
   */
  public void setBdsAlmA1_r12(Asn1Object value) {
    this.bdsAlmA1_r12_ = (Almanac_BDSAlmanacSet_r12.bdsAlmA1_r12Type) value;
  }
  public Almanac_BDSAlmanacSet_r12.bdsAlmA1_r12Type setBdsAlmA1_r12ToNewInstance() {
    bdsAlmA1_r12_ = new Almanac_BDSAlmanacSet_r12.bdsAlmA1_r12Type();
    return bdsAlmA1_r12_;
  }
  
  private Almanac_BDSAlmanacSet_r12.bdsSvHealth_r12Type bdsSvHealth_r12_;
  public Almanac_BDSAlmanacSet_r12.bdsSvHealth_r12Type getBdsSvHealth_r12() {
    return bdsSvHealth_r12_;
  }
  /**
   * @throws ClassCastException if value is not a Almanac_BDSAlmanacSet_r12.bdsSvHealth_r12Type
   */
  public void setBdsSvHealth_r12(Asn1Object value) {
    this.bdsSvHealth_r12_ = (Almanac_BDSAlmanacSet_r12.bdsSvHealth_r12Type) value;
  }
  public Almanac_BDSAlmanacSet_r12.bdsSvHealth_r12Type setBdsSvHealth_r12ToNewInstance() {
    bdsSvHealth_r12_ = new Almanac_BDSAlmanacSet_r12.bdsSvHealth_r12Type();
    return bdsSvHealth_r12_;
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
            return getBdsAlmToa_r12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getBdsAlmToa_r12();
          }

          @Override public void setToNewInstance() {
            setBdsAlmToa_r12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Almanac_BDSAlmanacSet_r12.bdsAlmToa_r12Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bdsAlmToa_r12 : "
                    + getBdsAlmToa_r12().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getBdsAlmSqrtA_r12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBdsAlmSqrtA_r12();
          }

          @Override public void setToNewInstance() {
            setBdsAlmSqrtA_r12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Almanac_BDSAlmanacSet_r12.bdsAlmSqrtA_r12Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bdsAlmSqrtA_r12 : "
                    + getBdsAlmSqrtA_r12().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getBdsAlmE_r12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBdsAlmE_r12();
          }

          @Override public void setToNewInstance() {
            setBdsAlmE_r12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Almanac_BDSAlmanacSet_r12.bdsAlmE_r12Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bdsAlmE_r12 : "
                    + getBdsAlmE_r12().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getBdsAlmW_r12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBdsAlmW_r12();
          }

          @Override public void setToNewInstance() {
            setBdsAlmW_r12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Almanac_BDSAlmanacSet_r12.bdsAlmW_r12Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bdsAlmW_r12 : "
                    + getBdsAlmW_r12().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getBdsAlmM0_r12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBdsAlmM0_r12();
          }

          @Override public void setToNewInstance() {
            setBdsAlmM0_r12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Almanac_BDSAlmanacSet_r12.bdsAlmM0_r12Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bdsAlmM0_r12 : "
                    + getBdsAlmM0_r12().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getBdsAlmOmega0_r12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBdsAlmOmega0_r12();
          }

          @Override public void setToNewInstance() {
            setBdsAlmOmega0_r12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Almanac_BDSAlmanacSet_r12.bdsAlmOmega0_r12Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bdsAlmOmega0_r12 : "
                    + getBdsAlmOmega0_r12().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 7);

          @Override public boolean isExplicitlySet() {
            return getBdsAlmOmegaDot_r12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBdsAlmOmegaDot_r12();
          }

          @Override public void setToNewInstance() {
            setBdsAlmOmegaDot_r12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Almanac_BDSAlmanacSet_r12.bdsAlmOmegaDot_r12Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bdsAlmOmegaDot_r12 : "
                    + getBdsAlmOmegaDot_r12().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 8);

          @Override public boolean isExplicitlySet() {
            return getBdsAlmDeltaI_r12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBdsAlmDeltaI_r12();
          }

          @Override public void setToNewInstance() {
            setBdsAlmDeltaI_r12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Almanac_BDSAlmanacSet_r12.bdsAlmDeltaI_r12Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bdsAlmDeltaI_r12 : "
                    + getBdsAlmDeltaI_r12().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 9);

          @Override public boolean isExplicitlySet() {
            return getBdsAlmA0_r12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBdsAlmA0_r12();
          }

          @Override public void setToNewInstance() {
            setBdsAlmA0_r12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Almanac_BDSAlmanacSet_r12.bdsAlmA0_r12Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bdsAlmA0_r12 : "
                    + getBdsAlmA0_r12().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 10);

          @Override public boolean isExplicitlySet() {
            return getBdsAlmA1_r12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBdsAlmA1_r12();
          }

          @Override public void setToNewInstance() {
            setBdsAlmA1_r12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Almanac_BDSAlmanacSet_r12.bdsAlmA1_r12Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bdsAlmA1_r12 : "
                    + getBdsAlmA1_r12().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 11);

          @Override public boolean isExplicitlySet() {
            return getBdsSvHealth_r12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getBdsSvHealth_r12();
          }

          @Override public void setToNewInstance() {
            setBdsSvHealth_r12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Almanac_BDSAlmanacSet_r12.bdsSvHealth_r12Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bdsSvHealth_r12 : "
                    + getBdsSvHealth_r12().toIndentedString(indent);
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
public static class bdsAlmToa_r12Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bdsAlmToa_r12Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bdsAlmToa_r12Type() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("255"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bdsAlmToa_r12Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bdsAlmToa_r12Type != null) {
      return ImmutableList.of(TAG_bdsAlmToa_r12Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bdsAlmToa_r12Type from encoded stream.
   */
  public static bdsAlmToa_r12Type fromPerUnaligned(byte[] encodedBytes) {
    bdsAlmToa_r12Type result = new bdsAlmToa_r12Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bdsAlmToa_r12Type from encoded stream.
   */
  public static bdsAlmToa_r12Type fromPerAligned(byte[] encodedBytes) {
    bdsAlmToa_r12Type result = new bdsAlmToa_r12Type();
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
    return "bdsAlmToa_r12Type = " + getInteger() + ";\n";
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
public static class bdsAlmSqrtA_r12Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bdsAlmSqrtA_r12Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bdsAlmSqrtA_r12Type() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("16777215"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bdsAlmSqrtA_r12Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bdsAlmSqrtA_r12Type != null) {
      return ImmutableList.of(TAG_bdsAlmSqrtA_r12Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bdsAlmSqrtA_r12Type from encoded stream.
   */
  public static bdsAlmSqrtA_r12Type fromPerUnaligned(byte[] encodedBytes) {
    bdsAlmSqrtA_r12Type result = new bdsAlmSqrtA_r12Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bdsAlmSqrtA_r12Type from encoded stream.
   */
  public static bdsAlmSqrtA_r12Type fromPerAligned(byte[] encodedBytes) {
    bdsAlmSqrtA_r12Type result = new bdsAlmSqrtA_r12Type();
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
    return "bdsAlmSqrtA_r12Type = " + getInteger() + ";\n";
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
public static class bdsAlmE_r12Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bdsAlmE_r12Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bdsAlmE_r12Type() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("131071"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bdsAlmE_r12Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bdsAlmE_r12Type != null) {
      return ImmutableList.of(TAG_bdsAlmE_r12Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bdsAlmE_r12Type from encoded stream.
   */
  public static bdsAlmE_r12Type fromPerUnaligned(byte[] encodedBytes) {
    bdsAlmE_r12Type result = new bdsAlmE_r12Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bdsAlmE_r12Type from encoded stream.
   */
  public static bdsAlmE_r12Type fromPerAligned(byte[] encodedBytes) {
    bdsAlmE_r12Type result = new bdsAlmE_r12Type();
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
    return "bdsAlmE_r12Type = " + getInteger() + ";\n";
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
public static class bdsAlmW_r12Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bdsAlmW_r12Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bdsAlmW_r12Type() {
    super();
    setValueRange(new java.math.BigInteger("-8388608"), new java.math.BigInteger("8388607"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bdsAlmW_r12Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bdsAlmW_r12Type != null) {
      return ImmutableList.of(TAG_bdsAlmW_r12Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bdsAlmW_r12Type from encoded stream.
   */
  public static bdsAlmW_r12Type fromPerUnaligned(byte[] encodedBytes) {
    bdsAlmW_r12Type result = new bdsAlmW_r12Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bdsAlmW_r12Type from encoded stream.
   */
  public static bdsAlmW_r12Type fromPerAligned(byte[] encodedBytes) {
    bdsAlmW_r12Type result = new bdsAlmW_r12Type();
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
    return "bdsAlmW_r12Type = " + getInteger() + ";\n";
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
public static class bdsAlmM0_r12Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bdsAlmM0_r12Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bdsAlmM0_r12Type() {
    super();
    setValueRange(new java.math.BigInteger("-8388608"), new java.math.BigInteger("8388607"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bdsAlmM0_r12Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bdsAlmM0_r12Type != null) {
      return ImmutableList.of(TAG_bdsAlmM0_r12Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bdsAlmM0_r12Type from encoded stream.
   */
  public static bdsAlmM0_r12Type fromPerUnaligned(byte[] encodedBytes) {
    bdsAlmM0_r12Type result = new bdsAlmM0_r12Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bdsAlmM0_r12Type from encoded stream.
   */
  public static bdsAlmM0_r12Type fromPerAligned(byte[] encodedBytes) {
    bdsAlmM0_r12Type result = new bdsAlmM0_r12Type();
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
    return "bdsAlmM0_r12Type = " + getInteger() + ";\n";
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
public static class bdsAlmOmega0_r12Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bdsAlmOmega0_r12Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bdsAlmOmega0_r12Type() {
    super();
    setValueRange(new java.math.BigInteger("-8388608"), new java.math.BigInteger("8388607"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bdsAlmOmega0_r12Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bdsAlmOmega0_r12Type != null) {
      return ImmutableList.of(TAG_bdsAlmOmega0_r12Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bdsAlmOmega0_r12Type from encoded stream.
   */
  public static bdsAlmOmega0_r12Type fromPerUnaligned(byte[] encodedBytes) {
    bdsAlmOmega0_r12Type result = new bdsAlmOmega0_r12Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bdsAlmOmega0_r12Type from encoded stream.
   */
  public static bdsAlmOmega0_r12Type fromPerAligned(byte[] encodedBytes) {
    bdsAlmOmega0_r12Type result = new bdsAlmOmega0_r12Type();
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
    return "bdsAlmOmega0_r12Type = " + getInteger() + ";\n";
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
public static class bdsAlmOmegaDot_r12Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bdsAlmOmegaDot_r12Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bdsAlmOmegaDot_r12Type() {
    super();
    setValueRange(new java.math.BigInteger("-65536"), new java.math.BigInteger("65535"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bdsAlmOmegaDot_r12Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bdsAlmOmegaDot_r12Type != null) {
      return ImmutableList.of(TAG_bdsAlmOmegaDot_r12Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bdsAlmOmegaDot_r12Type from encoded stream.
   */
  public static bdsAlmOmegaDot_r12Type fromPerUnaligned(byte[] encodedBytes) {
    bdsAlmOmegaDot_r12Type result = new bdsAlmOmegaDot_r12Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bdsAlmOmegaDot_r12Type from encoded stream.
   */
  public static bdsAlmOmegaDot_r12Type fromPerAligned(byte[] encodedBytes) {
    bdsAlmOmegaDot_r12Type result = new bdsAlmOmegaDot_r12Type();
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
    return "bdsAlmOmegaDot_r12Type = " + getInteger() + ";\n";
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
public static class bdsAlmDeltaI_r12Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bdsAlmDeltaI_r12Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bdsAlmDeltaI_r12Type() {
    super();
    setValueRange(new java.math.BigInteger("-32768"), new java.math.BigInteger("32767"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bdsAlmDeltaI_r12Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bdsAlmDeltaI_r12Type != null) {
      return ImmutableList.of(TAG_bdsAlmDeltaI_r12Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bdsAlmDeltaI_r12Type from encoded stream.
   */
  public static bdsAlmDeltaI_r12Type fromPerUnaligned(byte[] encodedBytes) {
    bdsAlmDeltaI_r12Type result = new bdsAlmDeltaI_r12Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bdsAlmDeltaI_r12Type from encoded stream.
   */
  public static bdsAlmDeltaI_r12Type fromPerAligned(byte[] encodedBytes) {
    bdsAlmDeltaI_r12Type result = new bdsAlmDeltaI_r12Type();
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
    return "bdsAlmDeltaI_r12Type = " + getInteger() + ";\n";
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
public static class bdsAlmA0_r12Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bdsAlmA0_r12Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bdsAlmA0_r12Type() {
    super();
    setValueRange(new java.math.BigInteger("-1024"), new java.math.BigInteger("1023"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bdsAlmA0_r12Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bdsAlmA0_r12Type != null) {
      return ImmutableList.of(TAG_bdsAlmA0_r12Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bdsAlmA0_r12Type from encoded stream.
   */
  public static bdsAlmA0_r12Type fromPerUnaligned(byte[] encodedBytes) {
    bdsAlmA0_r12Type result = new bdsAlmA0_r12Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bdsAlmA0_r12Type from encoded stream.
   */
  public static bdsAlmA0_r12Type fromPerAligned(byte[] encodedBytes) {
    bdsAlmA0_r12Type result = new bdsAlmA0_r12Type();
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
    return "bdsAlmA0_r12Type = " + getInteger() + ";\n";
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
public static class bdsAlmA1_r12Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bdsAlmA1_r12Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bdsAlmA1_r12Type() {
    super();
    setValueRange(new java.math.BigInteger("-1024"), new java.math.BigInteger("1023"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bdsAlmA1_r12Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bdsAlmA1_r12Type != null) {
      return ImmutableList.of(TAG_bdsAlmA1_r12Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bdsAlmA1_r12Type from encoded stream.
   */
  public static bdsAlmA1_r12Type fromPerUnaligned(byte[] encodedBytes) {
    bdsAlmA1_r12Type result = new bdsAlmA1_r12Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bdsAlmA1_r12Type from encoded stream.
   */
  public static bdsAlmA1_r12Type fromPerAligned(byte[] encodedBytes) {
    bdsAlmA1_r12Type result = new bdsAlmA1_r12Type();
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
    return "bdsAlmA1_r12Type = " + getInteger() + ";\n";
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
public static class bdsSvHealth_r12Type extends Asn1BitString {
  //

  // defined bit positions, if any
  

  // setters
  

  // clearers
  


  private static final Asn1Tag TAG_bdsSvHealth_r12Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bdsSvHealth_r12Type() {
    super();
    setMinSize(9);
setMaxSize(9);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bdsSvHealth_r12Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bdsSvHealth_r12Type != null) {
      return ImmutableList.of(TAG_bdsSvHealth_r12Type);
    } else {
      return Asn1BitString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bdsSvHealth_r12Type from encoded stream.
   */
  public static bdsSvHealth_r12Type fromPerUnaligned(byte[] encodedBytes) {
    bdsSvHealth_r12Type result = new bdsSvHealth_r12Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bdsSvHealth_r12Type from encoded stream.
   */
  public static bdsSvHealth_r12Type fromPerAligned(byte[] encodedBytes) {
    bdsSvHealth_r12Type result = new bdsSvHealth_r12Type();
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
    return "bdsSvHealth_r12Type = " + getValue() + ";\n";
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
    builder.append("Almanac_BDSAlmanacSet_r12 = {\n");
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
