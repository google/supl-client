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
public  class NavModel_BDS_KeplerianSet_r12 extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_NavModel_BDS_KeplerianSet_r12
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public NavModel_BDS_KeplerianSet_r12() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_NavModel_BDS_KeplerianSet_r12;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_NavModel_BDS_KeplerianSet_r12 != null) {
      return ImmutableList.of(TAG_NavModel_BDS_KeplerianSet_r12);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new NavModel_BDS_KeplerianSet_r12 from encoded stream.
   */
  public static NavModel_BDS_KeplerianSet_r12 fromPerUnaligned(byte[] encodedBytes) {
    NavModel_BDS_KeplerianSet_r12 result = new NavModel_BDS_KeplerianSet_r12();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new NavModel_BDS_KeplerianSet_r12 from encoded stream.
   */
  public static NavModel_BDS_KeplerianSet_r12 fromPerAligned(byte[] encodedBytes) {
    NavModel_BDS_KeplerianSet_r12 result = new NavModel_BDS_KeplerianSet_r12();
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

  
  private NavModel_BDS_KeplerianSet_r12.bdsAODE_r12Type bdsAODE_r12_;
  public NavModel_BDS_KeplerianSet_r12.bdsAODE_r12Type getBdsAODE_r12() {
    return bdsAODE_r12_;
  }
  /**
   * @throws ClassCastException if value is not a NavModel_BDS_KeplerianSet_r12.bdsAODE_r12Type
   */
  public void setBdsAODE_r12(Asn1Object value) {
    this.bdsAODE_r12_ = (NavModel_BDS_KeplerianSet_r12.bdsAODE_r12Type) value;
  }
  public NavModel_BDS_KeplerianSet_r12.bdsAODE_r12Type setBdsAODE_r12ToNewInstance() {
    bdsAODE_r12_ = new NavModel_BDS_KeplerianSet_r12.bdsAODE_r12Type();
    return bdsAODE_r12_;
  }
  
  private NavModel_BDS_KeplerianSet_r12.bdsURAI_r12Type bdsURAI_r12_;
  public NavModel_BDS_KeplerianSet_r12.bdsURAI_r12Type getBdsURAI_r12() {
    return bdsURAI_r12_;
  }
  /**
   * @throws ClassCastException if value is not a NavModel_BDS_KeplerianSet_r12.bdsURAI_r12Type
   */
  public void setBdsURAI_r12(Asn1Object value) {
    this.bdsURAI_r12_ = (NavModel_BDS_KeplerianSet_r12.bdsURAI_r12Type) value;
  }
  public NavModel_BDS_KeplerianSet_r12.bdsURAI_r12Type setBdsURAI_r12ToNewInstance() {
    bdsURAI_r12_ = new NavModel_BDS_KeplerianSet_r12.bdsURAI_r12Type();
    return bdsURAI_r12_;
  }
  
  private NavModel_BDS_KeplerianSet_r12.bdsToe_r12Type bdsToe_r12_;
  public NavModel_BDS_KeplerianSet_r12.bdsToe_r12Type getBdsToe_r12() {
    return bdsToe_r12_;
  }
  /**
   * @throws ClassCastException if value is not a NavModel_BDS_KeplerianSet_r12.bdsToe_r12Type
   */
  public void setBdsToe_r12(Asn1Object value) {
    this.bdsToe_r12_ = (NavModel_BDS_KeplerianSet_r12.bdsToe_r12Type) value;
  }
  public NavModel_BDS_KeplerianSet_r12.bdsToe_r12Type setBdsToe_r12ToNewInstance() {
    bdsToe_r12_ = new NavModel_BDS_KeplerianSet_r12.bdsToe_r12Type();
    return bdsToe_r12_;
  }
  
  private NavModel_BDS_KeplerianSet_r12.bdsAPowerHalf_r12Type bdsAPowerHalf_r12_;
  public NavModel_BDS_KeplerianSet_r12.bdsAPowerHalf_r12Type getBdsAPowerHalf_r12() {
    return bdsAPowerHalf_r12_;
  }
  /**
   * @throws ClassCastException if value is not a NavModel_BDS_KeplerianSet_r12.bdsAPowerHalf_r12Type
   */
  public void setBdsAPowerHalf_r12(Asn1Object value) {
    this.bdsAPowerHalf_r12_ = (NavModel_BDS_KeplerianSet_r12.bdsAPowerHalf_r12Type) value;
  }
  public NavModel_BDS_KeplerianSet_r12.bdsAPowerHalf_r12Type setBdsAPowerHalf_r12ToNewInstance() {
    bdsAPowerHalf_r12_ = new NavModel_BDS_KeplerianSet_r12.bdsAPowerHalf_r12Type();
    return bdsAPowerHalf_r12_;
  }
  
  private NavModel_BDS_KeplerianSet_r12.bdsE_r12Type bdsE_r12_;
  public NavModel_BDS_KeplerianSet_r12.bdsE_r12Type getBdsE_r12() {
    return bdsE_r12_;
  }
  /**
   * @throws ClassCastException if value is not a NavModel_BDS_KeplerianSet_r12.bdsE_r12Type
   */
  public void setBdsE_r12(Asn1Object value) {
    this.bdsE_r12_ = (NavModel_BDS_KeplerianSet_r12.bdsE_r12Type) value;
  }
  public NavModel_BDS_KeplerianSet_r12.bdsE_r12Type setBdsE_r12ToNewInstance() {
    bdsE_r12_ = new NavModel_BDS_KeplerianSet_r12.bdsE_r12Type();
    return bdsE_r12_;
  }
  
  private NavModel_BDS_KeplerianSet_r12.bdsW_r12Type bdsW_r12_;
  public NavModel_BDS_KeplerianSet_r12.bdsW_r12Type getBdsW_r12() {
    return bdsW_r12_;
  }
  /**
   * @throws ClassCastException if value is not a NavModel_BDS_KeplerianSet_r12.bdsW_r12Type
   */
  public void setBdsW_r12(Asn1Object value) {
    this.bdsW_r12_ = (NavModel_BDS_KeplerianSet_r12.bdsW_r12Type) value;
  }
  public NavModel_BDS_KeplerianSet_r12.bdsW_r12Type setBdsW_r12ToNewInstance() {
    bdsW_r12_ = new NavModel_BDS_KeplerianSet_r12.bdsW_r12Type();
    return bdsW_r12_;
  }
  
  private NavModel_BDS_KeplerianSet_r12.bdsDeltaN_r12Type bdsDeltaN_r12_;
  public NavModel_BDS_KeplerianSet_r12.bdsDeltaN_r12Type getBdsDeltaN_r12() {
    return bdsDeltaN_r12_;
  }
  /**
   * @throws ClassCastException if value is not a NavModel_BDS_KeplerianSet_r12.bdsDeltaN_r12Type
   */
  public void setBdsDeltaN_r12(Asn1Object value) {
    this.bdsDeltaN_r12_ = (NavModel_BDS_KeplerianSet_r12.bdsDeltaN_r12Type) value;
  }
  public NavModel_BDS_KeplerianSet_r12.bdsDeltaN_r12Type setBdsDeltaN_r12ToNewInstance() {
    bdsDeltaN_r12_ = new NavModel_BDS_KeplerianSet_r12.bdsDeltaN_r12Type();
    return bdsDeltaN_r12_;
  }
  
  private NavModel_BDS_KeplerianSet_r12.bdsM0_r12Type bdsM0_r12_;
  public NavModel_BDS_KeplerianSet_r12.bdsM0_r12Type getBdsM0_r12() {
    return bdsM0_r12_;
  }
  /**
   * @throws ClassCastException if value is not a NavModel_BDS_KeplerianSet_r12.bdsM0_r12Type
   */
  public void setBdsM0_r12(Asn1Object value) {
    this.bdsM0_r12_ = (NavModel_BDS_KeplerianSet_r12.bdsM0_r12Type) value;
  }
  public NavModel_BDS_KeplerianSet_r12.bdsM0_r12Type setBdsM0_r12ToNewInstance() {
    bdsM0_r12_ = new NavModel_BDS_KeplerianSet_r12.bdsM0_r12Type();
    return bdsM0_r12_;
  }
  
  private NavModel_BDS_KeplerianSet_r12.bdsOmega0_r12Type bdsOmega0_r12_;
  public NavModel_BDS_KeplerianSet_r12.bdsOmega0_r12Type getBdsOmega0_r12() {
    return bdsOmega0_r12_;
  }
  /**
   * @throws ClassCastException if value is not a NavModel_BDS_KeplerianSet_r12.bdsOmega0_r12Type
   */
  public void setBdsOmega0_r12(Asn1Object value) {
    this.bdsOmega0_r12_ = (NavModel_BDS_KeplerianSet_r12.bdsOmega0_r12Type) value;
  }
  public NavModel_BDS_KeplerianSet_r12.bdsOmega0_r12Type setBdsOmega0_r12ToNewInstance() {
    bdsOmega0_r12_ = new NavModel_BDS_KeplerianSet_r12.bdsOmega0_r12Type();
    return bdsOmega0_r12_;
  }
  
  private NavModel_BDS_KeplerianSet_r12.bdsOmegaDot_r12Type bdsOmegaDot_r12_;
  public NavModel_BDS_KeplerianSet_r12.bdsOmegaDot_r12Type getBdsOmegaDot_r12() {
    return bdsOmegaDot_r12_;
  }
  /**
   * @throws ClassCastException if value is not a NavModel_BDS_KeplerianSet_r12.bdsOmegaDot_r12Type
   */
  public void setBdsOmegaDot_r12(Asn1Object value) {
    this.bdsOmegaDot_r12_ = (NavModel_BDS_KeplerianSet_r12.bdsOmegaDot_r12Type) value;
  }
  public NavModel_BDS_KeplerianSet_r12.bdsOmegaDot_r12Type setBdsOmegaDot_r12ToNewInstance() {
    bdsOmegaDot_r12_ = new NavModel_BDS_KeplerianSet_r12.bdsOmegaDot_r12Type();
    return bdsOmegaDot_r12_;
  }
  
  private NavModel_BDS_KeplerianSet_r12.bdsI0_r12Type bdsI0_r12_;
  public NavModel_BDS_KeplerianSet_r12.bdsI0_r12Type getBdsI0_r12() {
    return bdsI0_r12_;
  }
  /**
   * @throws ClassCastException if value is not a NavModel_BDS_KeplerianSet_r12.bdsI0_r12Type
   */
  public void setBdsI0_r12(Asn1Object value) {
    this.bdsI0_r12_ = (NavModel_BDS_KeplerianSet_r12.bdsI0_r12Type) value;
  }
  public NavModel_BDS_KeplerianSet_r12.bdsI0_r12Type setBdsI0_r12ToNewInstance() {
    bdsI0_r12_ = new NavModel_BDS_KeplerianSet_r12.bdsI0_r12Type();
    return bdsI0_r12_;
  }
  
  private NavModel_BDS_KeplerianSet_r12.bdsIDot_r12Type bdsIDot_r12_;
  public NavModel_BDS_KeplerianSet_r12.bdsIDot_r12Type getBdsIDot_r12() {
    return bdsIDot_r12_;
  }
  /**
   * @throws ClassCastException if value is not a NavModel_BDS_KeplerianSet_r12.bdsIDot_r12Type
   */
  public void setBdsIDot_r12(Asn1Object value) {
    this.bdsIDot_r12_ = (NavModel_BDS_KeplerianSet_r12.bdsIDot_r12Type) value;
  }
  public NavModel_BDS_KeplerianSet_r12.bdsIDot_r12Type setBdsIDot_r12ToNewInstance() {
    bdsIDot_r12_ = new NavModel_BDS_KeplerianSet_r12.bdsIDot_r12Type();
    return bdsIDot_r12_;
  }
  
  private NavModel_BDS_KeplerianSet_r12.bdsCuc_r12Type bdsCuc_r12_;
  public NavModel_BDS_KeplerianSet_r12.bdsCuc_r12Type getBdsCuc_r12() {
    return bdsCuc_r12_;
  }
  /**
   * @throws ClassCastException if value is not a NavModel_BDS_KeplerianSet_r12.bdsCuc_r12Type
   */
  public void setBdsCuc_r12(Asn1Object value) {
    this.bdsCuc_r12_ = (NavModel_BDS_KeplerianSet_r12.bdsCuc_r12Type) value;
  }
  public NavModel_BDS_KeplerianSet_r12.bdsCuc_r12Type setBdsCuc_r12ToNewInstance() {
    bdsCuc_r12_ = new NavModel_BDS_KeplerianSet_r12.bdsCuc_r12Type();
    return bdsCuc_r12_;
  }
  
  private NavModel_BDS_KeplerianSet_r12.bdsCus_r12Type bdsCus_r12_;
  public NavModel_BDS_KeplerianSet_r12.bdsCus_r12Type getBdsCus_r12() {
    return bdsCus_r12_;
  }
  /**
   * @throws ClassCastException if value is not a NavModel_BDS_KeplerianSet_r12.bdsCus_r12Type
   */
  public void setBdsCus_r12(Asn1Object value) {
    this.bdsCus_r12_ = (NavModel_BDS_KeplerianSet_r12.bdsCus_r12Type) value;
  }
  public NavModel_BDS_KeplerianSet_r12.bdsCus_r12Type setBdsCus_r12ToNewInstance() {
    bdsCus_r12_ = new NavModel_BDS_KeplerianSet_r12.bdsCus_r12Type();
    return bdsCus_r12_;
  }
  
  private NavModel_BDS_KeplerianSet_r12.bdsCrc_r12Type bdsCrc_r12_;
  public NavModel_BDS_KeplerianSet_r12.bdsCrc_r12Type getBdsCrc_r12() {
    return bdsCrc_r12_;
  }
  /**
   * @throws ClassCastException if value is not a NavModel_BDS_KeplerianSet_r12.bdsCrc_r12Type
   */
  public void setBdsCrc_r12(Asn1Object value) {
    this.bdsCrc_r12_ = (NavModel_BDS_KeplerianSet_r12.bdsCrc_r12Type) value;
  }
  public NavModel_BDS_KeplerianSet_r12.bdsCrc_r12Type setBdsCrc_r12ToNewInstance() {
    bdsCrc_r12_ = new NavModel_BDS_KeplerianSet_r12.bdsCrc_r12Type();
    return bdsCrc_r12_;
  }
  
  private NavModel_BDS_KeplerianSet_r12.bdsCrs_r12Type bdsCrs_r12_;
  public NavModel_BDS_KeplerianSet_r12.bdsCrs_r12Type getBdsCrs_r12() {
    return bdsCrs_r12_;
  }
  /**
   * @throws ClassCastException if value is not a NavModel_BDS_KeplerianSet_r12.bdsCrs_r12Type
   */
  public void setBdsCrs_r12(Asn1Object value) {
    this.bdsCrs_r12_ = (NavModel_BDS_KeplerianSet_r12.bdsCrs_r12Type) value;
  }
  public NavModel_BDS_KeplerianSet_r12.bdsCrs_r12Type setBdsCrs_r12ToNewInstance() {
    bdsCrs_r12_ = new NavModel_BDS_KeplerianSet_r12.bdsCrs_r12Type();
    return bdsCrs_r12_;
  }
  
  private NavModel_BDS_KeplerianSet_r12.bdsCic_r12Type bdsCic_r12_;
  public NavModel_BDS_KeplerianSet_r12.bdsCic_r12Type getBdsCic_r12() {
    return bdsCic_r12_;
  }
  /**
   * @throws ClassCastException if value is not a NavModel_BDS_KeplerianSet_r12.bdsCic_r12Type
   */
  public void setBdsCic_r12(Asn1Object value) {
    this.bdsCic_r12_ = (NavModel_BDS_KeplerianSet_r12.bdsCic_r12Type) value;
  }
  public NavModel_BDS_KeplerianSet_r12.bdsCic_r12Type setBdsCic_r12ToNewInstance() {
    bdsCic_r12_ = new NavModel_BDS_KeplerianSet_r12.bdsCic_r12Type();
    return bdsCic_r12_;
  }
  
  private NavModel_BDS_KeplerianSet_r12.bdsCis_r12Type bdsCis_r12_;
  public NavModel_BDS_KeplerianSet_r12.bdsCis_r12Type getBdsCis_r12() {
    return bdsCis_r12_;
  }
  /**
   * @throws ClassCastException if value is not a NavModel_BDS_KeplerianSet_r12.bdsCis_r12Type
   */
  public void setBdsCis_r12(Asn1Object value) {
    this.bdsCis_r12_ = (NavModel_BDS_KeplerianSet_r12.bdsCis_r12Type) value;
  }
  public NavModel_BDS_KeplerianSet_r12.bdsCis_r12Type setBdsCis_r12ToNewInstance() {
    bdsCis_r12_ = new NavModel_BDS_KeplerianSet_r12.bdsCis_r12Type();
    return bdsCis_r12_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getBdsAODE_r12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBdsAODE_r12();
          }

          @Override public void setToNewInstance() {
            setBdsAODE_r12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavModel_BDS_KeplerianSet_r12.bdsAODE_r12Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bdsAODE_r12 : "
                    + getBdsAODE_r12().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getBdsURAI_r12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBdsURAI_r12();
          }

          @Override public void setToNewInstance() {
            setBdsURAI_r12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavModel_BDS_KeplerianSet_r12.bdsURAI_r12Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bdsURAI_r12 : "
                    + getBdsURAI_r12().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getBdsToe_r12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBdsToe_r12();
          }

          @Override public void setToNewInstance() {
            setBdsToe_r12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavModel_BDS_KeplerianSet_r12.bdsToe_r12Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bdsToe_r12 : "
                    + getBdsToe_r12().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getBdsAPowerHalf_r12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBdsAPowerHalf_r12();
          }

          @Override public void setToNewInstance() {
            setBdsAPowerHalf_r12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavModel_BDS_KeplerianSet_r12.bdsAPowerHalf_r12Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bdsAPowerHalf_r12 : "
                    + getBdsAPowerHalf_r12().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getBdsE_r12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBdsE_r12();
          }

          @Override public void setToNewInstance() {
            setBdsE_r12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavModel_BDS_KeplerianSet_r12.bdsE_r12Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bdsE_r12 : "
                    + getBdsE_r12().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getBdsW_r12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBdsW_r12();
          }

          @Override public void setToNewInstance() {
            setBdsW_r12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavModel_BDS_KeplerianSet_r12.bdsW_r12Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bdsW_r12 : "
                    + getBdsW_r12().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getBdsDeltaN_r12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBdsDeltaN_r12();
          }

          @Override public void setToNewInstance() {
            setBdsDeltaN_r12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavModel_BDS_KeplerianSet_r12.bdsDeltaN_r12Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bdsDeltaN_r12 : "
                    + getBdsDeltaN_r12().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 7);

          @Override public boolean isExplicitlySet() {
            return getBdsM0_r12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBdsM0_r12();
          }

          @Override public void setToNewInstance() {
            setBdsM0_r12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavModel_BDS_KeplerianSet_r12.bdsM0_r12Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bdsM0_r12 : "
                    + getBdsM0_r12().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 8);

          @Override public boolean isExplicitlySet() {
            return getBdsOmega0_r12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBdsOmega0_r12();
          }

          @Override public void setToNewInstance() {
            setBdsOmega0_r12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavModel_BDS_KeplerianSet_r12.bdsOmega0_r12Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bdsOmega0_r12 : "
                    + getBdsOmega0_r12().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 9);

          @Override public boolean isExplicitlySet() {
            return getBdsOmegaDot_r12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBdsOmegaDot_r12();
          }

          @Override public void setToNewInstance() {
            setBdsOmegaDot_r12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavModel_BDS_KeplerianSet_r12.bdsOmegaDot_r12Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bdsOmegaDot_r12 : "
                    + getBdsOmegaDot_r12().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 10);

          @Override public boolean isExplicitlySet() {
            return getBdsI0_r12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBdsI0_r12();
          }

          @Override public void setToNewInstance() {
            setBdsI0_r12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavModel_BDS_KeplerianSet_r12.bdsI0_r12Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bdsI0_r12 : "
                    + getBdsI0_r12().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 11);

          @Override public boolean isExplicitlySet() {
            return getBdsIDot_r12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBdsIDot_r12();
          }

          @Override public void setToNewInstance() {
            setBdsIDot_r12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavModel_BDS_KeplerianSet_r12.bdsIDot_r12Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bdsIDot_r12 : "
                    + getBdsIDot_r12().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 12);

          @Override public boolean isExplicitlySet() {
            return getBdsCuc_r12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBdsCuc_r12();
          }

          @Override public void setToNewInstance() {
            setBdsCuc_r12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavModel_BDS_KeplerianSet_r12.bdsCuc_r12Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bdsCuc_r12 : "
                    + getBdsCuc_r12().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 13);

          @Override public boolean isExplicitlySet() {
            return getBdsCus_r12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBdsCus_r12();
          }

          @Override public void setToNewInstance() {
            setBdsCus_r12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavModel_BDS_KeplerianSet_r12.bdsCus_r12Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bdsCus_r12 : "
                    + getBdsCus_r12().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 14);

          @Override public boolean isExplicitlySet() {
            return getBdsCrc_r12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBdsCrc_r12();
          }

          @Override public void setToNewInstance() {
            setBdsCrc_r12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavModel_BDS_KeplerianSet_r12.bdsCrc_r12Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bdsCrc_r12 : "
                    + getBdsCrc_r12().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 15);

          @Override public boolean isExplicitlySet() {
            return getBdsCrs_r12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBdsCrs_r12();
          }

          @Override public void setToNewInstance() {
            setBdsCrs_r12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavModel_BDS_KeplerianSet_r12.bdsCrs_r12Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bdsCrs_r12 : "
                    + getBdsCrs_r12().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 16);

          @Override public boolean isExplicitlySet() {
            return getBdsCic_r12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBdsCic_r12();
          }

          @Override public void setToNewInstance() {
            setBdsCic_r12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavModel_BDS_KeplerianSet_r12.bdsCic_r12Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bdsCic_r12 : "
                    + getBdsCic_r12().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 17);

          @Override public boolean isExplicitlySet() {
            return getBdsCis_r12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBdsCis_r12();
          }

          @Override public void setToNewInstance() {
            setBdsCis_r12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavModel_BDS_KeplerianSet_r12.bdsCis_r12Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bdsCis_r12 : "
                    + getBdsCis_r12().toIndentedString(indent);
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
public static class bdsAODE_r12Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bdsAODE_r12Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bdsAODE_r12Type() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("31"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bdsAODE_r12Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bdsAODE_r12Type != null) {
      return ImmutableList.of(TAG_bdsAODE_r12Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bdsAODE_r12Type from encoded stream.
   */
  public static bdsAODE_r12Type fromPerUnaligned(byte[] encodedBytes) {
    bdsAODE_r12Type result = new bdsAODE_r12Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bdsAODE_r12Type from encoded stream.
   */
  public static bdsAODE_r12Type fromPerAligned(byte[] encodedBytes) {
    bdsAODE_r12Type result = new bdsAODE_r12Type();
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
    return "bdsAODE_r12Type = " + getInteger() + ";\n";
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
public static class bdsURAI_r12Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bdsURAI_r12Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bdsURAI_r12Type() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("15"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bdsURAI_r12Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bdsURAI_r12Type != null) {
      return ImmutableList.of(TAG_bdsURAI_r12Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bdsURAI_r12Type from encoded stream.
   */
  public static bdsURAI_r12Type fromPerUnaligned(byte[] encodedBytes) {
    bdsURAI_r12Type result = new bdsURAI_r12Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bdsURAI_r12Type from encoded stream.
   */
  public static bdsURAI_r12Type fromPerAligned(byte[] encodedBytes) {
    bdsURAI_r12Type result = new bdsURAI_r12Type();
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
    return "bdsURAI_r12Type = " + getInteger() + ";\n";
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
public static class bdsToe_r12Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bdsToe_r12Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bdsToe_r12Type() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("131071"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bdsToe_r12Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bdsToe_r12Type != null) {
      return ImmutableList.of(TAG_bdsToe_r12Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bdsToe_r12Type from encoded stream.
   */
  public static bdsToe_r12Type fromPerUnaligned(byte[] encodedBytes) {
    bdsToe_r12Type result = new bdsToe_r12Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bdsToe_r12Type from encoded stream.
   */
  public static bdsToe_r12Type fromPerAligned(byte[] encodedBytes) {
    bdsToe_r12Type result = new bdsToe_r12Type();
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
    return "bdsToe_r12Type = " + getInteger() + ";\n";
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
public static class bdsAPowerHalf_r12Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bdsAPowerHalf_r12Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bdsAPowerHalf_r12Type() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("4294967295"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bdsAPowerHalf_r12Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bdsAPowerHalf_r12Type != null) {
      return ImmutableList.of(TAG_bdsAPowerHalf_r12Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bdsAPowerHalf_r12Type from encoded stream.
   */
  public static bdsAPowerHalf_r12Type fromPerUnaligned(byte[] encodedBytes) {
    bdsAPowerHalf_r12Type result = new bdsAPowerHalf_r12Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bdsAPowerHalf_r12Type from encoded stream.
   */
  public static bdsAPowerHalf_r12Type fromPerAligned(byte[] encodedBytes) {
    bdsAPowerHalf_r12Type result = new bdsAPowerHalf_r12Type();
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
    return "bdsAPowerHalf_r12Type = " + getInteger() + ";\n";
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
public static class bdsE_r12Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bdsE_r12Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bdsE_r12Type() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("4294967295"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bdsE_r12Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bdsE_r12Type != null) {
      return ImmutableList.of(TAG_bdsE_r12Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bdsE_r12Type from encoded stream.
   */
  public static bdsE_r12Type fromPerUnaligned(byte[] encodedBytes) {
    bdsE_r12Type result = new bdsE_r12Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bdsE_r12Type from encoded stream.
   */
  public static bdsE_r12Type fromPerAligned(byte[] encodedBytes) {
    bdsE_r12Type result = new bdsE_r12Type();
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
    return "bdsE_r12Type = " + getInteger() + ";\n";
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
public static class bdsW_r12Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bdsW_r12Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bdsW_r12Type() {
    super();
    setValueRange(new java.math.BigInteger("-2147483648"), new java.math.BigInteger("2147483647"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bdsW_r12Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bdsW_r12Type != null) {
      return ImmutableList.of(TAG_bdsW_r12Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bdsW_r12Type from encoded stream.
   */
  public static bdsW_r12Type fromPerUnaligned(byte[] encodedBytes) {
    bdsW_r12Type result = new bdsW_r12Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bdsW_r12Type from encoded stream.
   */
  public static bdsW_r12Type fromPerAligned(byte[] encodedBytes) {
    bdsW_r12Type result = new bdsW_r12Type();
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
    return "bdsW_r12Type = " + getInteger() + ";\n";
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
public static class bdsDeltaN_r12Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bdsDeltaN_r12Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bdsDeltaN_r12Type() {
    super();
    setValueRange(new java.math.BigInteger("-32768"), new java.math.BigInteger("32767"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bdsDeltaN_r12Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bdsDeltaN_r12Type != null) {
      return ImmutableList.of(TAG_bdsDeltaN_r12Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bdsDeltaN_r12Type from encoded stream.
   */
  public static bdsDeltaN_r12Type fromPerUnaligned(byte[] encodedBytes) {
    bdsDeltaN_r12Type result = new bdsDeltaN_r12Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bdsDeltaN_r12Type from encoded stream.
   */
  public static bdsDeltaN_r12Type fromPerAligned(byte[] encodedBytes) {
    bdsDeltaN_r12Type result = new bdsDeltaN_r12Type();
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
    return "bdsDeltaN_r12Type = " + getInteger() + ";\n";
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
public static class bdsM0_r12Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bdsM0_r12Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bdsM0_r12Type() {
    super();
    setValueRange(new java.math.BigInteger("-2147483648"), new java.math.BigInteger("2147483647"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bdsM0_r12Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bdsM0_r12Type != null) {
      return ImmutableList.of(TAG_bdsM0_r12Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bdsM0_r12Type from encoded stream.
   */
  public static bdsM0_r12Type fromPerUnaligned(byte[] encodedBytes) {
    bdsM0_r12Type result = new bdsM0_r12Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bdsM0_r12Type from encoded stream.
   */
  public static bdsM0_r12Type fromPerAligned(byte[] encodedBytes) {
    bdsM0_r12Type result = new bdsM0_r12Type();
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
    return "bdsM0_r12Type = " + getInteger() + ";\n";
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
public static class bdsOmega0_r12Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bdsOmega0_r12Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bdsOmega0_r12Type() {
    super();
    setValueRange(new java.math.BigInteger("-2147483648"), new java.math.BigInteger("2147483647"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bdsOmega0_r12Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bdsOmega0_r12Type != null) {
      return ImmutableList.of(TAG_bdsOmega0_r12Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bdsOmega0_r12Type from encoded stream.
   */
  public static bdsOmega0_r12Type fromPerUnaligned(byte[] encodedBytes) {
    bdsOmega0_r12Type result = new bdsOmega0_r12Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bdsOmega0_r12Type from encoded stream.
   */
  public static bdsOmega0_r12Type fromPerAligned(byte[] encodedBytes) {
    bdsOmega0_r12Type result = new bdsOmega0_r12Type();
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
    return "bdsOmega0_r12Type = " + getInteger() + ";\n";
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
public static class bdsOmegaDot_r12Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bdsOmegaDot_r12Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bdsOmegaDot_r12Type() {
    super();
    setValueRange(new java.math.BigInteger("-8388608"), new java.math.BigInteger("8388607"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bdsOmegaDot_r12Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bdsOmegaDot_r12Type != null) {
      return ImmutableList.of(TAG_bdsOmegaDot_r12Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bdsOmegaDot_r12Type from encoded stream.
   */
  public static bdsOmegaDot_r12Type fromPerUnaligned(byte[] encodedBytes) {
    bdsOmegaDot_r12Type result = new bdsOmegaDot_r12Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bdsOmegaDot_r12Type from encoded stream.
   */
  public static bdsOmegaDot_r12Type fromPerAligned(byte[] encodedBytes) {
    bdsOmegaDot_r12Type result = new bdsOmegaDot_r12Type();
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
    return "bdsOmegaDot_r12Type = " + getInteger() + ";\n";
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
public static class bdsI0_r12Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bdsI0_r12Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bdsI0_r12Type() {
    super();
    setValueRange(new java.math.BigInteger("-2147483648"), new java.math.BigInteger("2147483647"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bdsI0_r12Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bdsI0_r12Type != null) {
      return ImmutableList.of(TAG_bdsI0_r12Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bdsI0_r12Type from encoded stream.
   */
  public static bdsI0_r12Type fromPerUnaligned(byte[] encodedBytes) {
    bdsI0_r12Type result = new bdsI0_r12Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bdsI0_r12Type from encoded stream.
   */
  public static bdsI0_r12Type fromPerAligned(byte[] encodedBytes) {
    bdsI0_r12Type result = new bdsI0_r12Type();
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
    return "bdsI0_r12Type = " + getInteger() + ";\n";
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
public static class bdsIDot_r12Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bdsIDot_r12Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bdsIDot_r12Type() {
    super();
    setValueRange(new java.math.BigInteger("-8192"), new java.math.BigInteger("8191"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bdsIDot_r12Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bdsIDot_r12Type != null) {
      return ImmutableList.of(TAG_bdsIDot_r12Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bdsIDot_r12Type from encoded stream.
   */
  public static bdsIDot_r12Type fromPerUnaligned(byte[] encodedBytes) {
    bdsIDot_r12Type result = new bdsIDot_r12Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bdsIDot_r12Type from encoded stream.
   */
  public static bdsIDot_r12Type fromPerAligned(byte[] encodedBytes) {
    bdsIDot_r12Type result = new bdsIDot_r12Type();
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
    return "bdsIDot_r12Type = " + getInteger() + ";\n";
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
public static class bdsCuc_r12Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bdsCuc_r12Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bdsCuc_r12Type() {
    super();
    setValueRange(new java.math.BigInteger("-131072"), new java.math.BigInteger("131071"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bdsCuc_r12Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bdsCuc_r12Type != null) {
      return ImmutableList.of(TAG_bdsCuc_r12Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bdsCuc_r12Type from encoded stream.
   */
  public static bdsCuc_r12Type fromPerUnaligned(byte[] encodedBytes) {
    bdsCuc_r12Type result = new bdsCuc_r12Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bdsCuc_r12Type from encoded stream.
   */
  public static bdsCuc_r12Type fromPerAligned(byte[] encodedBytes) {
    bdsCuc_r12Type result = new bdsCuc_r12Type();
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
    return "bdsCuc_r12Type = " + getInteger() + ";\n";
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
public static class bdsCus_r12Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bdsCus_r12Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bdsCus_r12Type() {
    super();
    setValueRange(new java.math.BigInteger("-131072"), new java.math.BigInteger("131071"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bdsCus_r12Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bdsCus_r12Type != null) {
      return ImmutableList.of(TAG_bdsCus_r12Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bdsCus_r12Type from encoded stream.
   */
  public static bdsCus_r12Type fromPerUnaligned(byte[] encodedBytes) {
    bdsCus_r12Type result = new bdsCus_r12Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bdsCus_r12Type from encoded stream.
   */
  public static bdsCus_r12Type fromPerAligned(byte[] encodedBytes) {
    bdsCus_r12Type result = new bdsCus_r12Type();
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
    return "bdsCus_r12Type = " + getInteger() + ";\n";
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
public static class bdsCrc_r12Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bdsCrc_r12Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bdsCrc_r12Type() {
    super();
    setValueRange(new java.math.BigInteger("-131072"), new java.math.BigInteger("131071"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bdsCrc_r12Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bdsCrc_r12Type != null) {
      return ImmutableList.of(TAG_bdsCrc_r12Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bdsCrc_r12Type from encoded stream.
   */
  public static bdsCrc_r12Type fromPerUnaligned(byte[] encodedBytes) {
    bdsCrc_r12Type result = new bdsCrc_r12Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bdsCrc_r12Type from encoded stream.
   */
  public static bdsCrc_r12Type fromPerAligned(byte[] encodedBytes) {
    bdsCrc_r12Type result = new bdsCrc_r12Type();
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
    return "bdsCrc_r12Type = " + getInteger() + ";\n";
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
public static class bdsCrs_r12Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bdsCrs_r12Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bdsCrs_r12Type() {
    super();
    setValueRange(new java.math.BigInteger("-131072"), new java.math.BigInteger("131071"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bdsCrs_r12Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bdsCrs_r12Type != null) {
      return ImmutableList.of(TAG_bdsCrs_r12Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bdsCrs_r12Type from encoded stream.
   */
  public static bdsCrs_r12Type fromPerUnaligned(byte[] encodedBytes) {
    bdsCrs_r12Type result = new bdsCrs_r12Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bdsCrs_r12Type from encoded stream.
   */
  public static bdsCrs_r12Type fromPerAligned(byte[] encodedBytes) {
    bdsCrs_r12Type result = new bdsCrs_r12Type();
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
    return "bdsCrs_r12Type = " + getInteger() + ";\n";
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
public static class bdsCic_r12Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bdsCic_r12Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bdsCic_r12Type() {
    super();
    setValueRange(new java.math.BigInteger("-131072"), new java.math.BigInteger("131071"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bdsCic_r12Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bdsCic_r12Type != null) {
      return ImmutableList.of(TAG_bdsCic_r12Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bdsCic_r12Type from encoded stream.
   */
  public static bdsCic_r12Type fromPerUnaligned(byte[] encodedBytes) {
    bdsCic_r12Type result = new bdsCic_r12Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bdsCic_r12Type from encoded stream.
   */
  public static bdsCic_r12Type fromPerAligned(byte[] encodedBytes) {
    bdsCic_r12Type result = new bdsCic_r12Type();
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
    return "bdsCic_r12Type = " + getInteger() + ";\n";
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
public static class bdsCis_r12Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bdsCis_r12Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bdsCis_r12Type() {
    super();
    setValueRange(new java.math.BigInteger("-131072"), new java.math.BigInteger("131071"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bdsCis_r12Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bdsCis_r12Type != null) {
      return ImmutableList.of(TAG_bdsCis_r12Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bdsCis_r12Type from encoded stream.
   */
  public static bdsCis_r12Type fromPerUnaligned(byte[] encodedBytes) {
    bdsCis_r12Type result = new bdsCis_r12Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bdsCis_r12Type from encoded stream.
   */
  public static bdsCis_r12Type fromPerAligned(byte[] encodedBytes) {
    bdsCis_r12Type result = new bdsCis_r12Type();
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
    return "bdsCis_r12Type = " + getInteger() + ";\n";
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
    builder.append("NavModel_BDS_KeplerianSet_r12 = {\n");
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
