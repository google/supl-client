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
public  class NavModel_NAVKeplerianSet extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_NavModel_NAVKeplerianSet
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public NavModel_NAVKeplerianSet() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_NavModel_NAVKeplerianSet;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_NavModel_NAVKeplerianSet != null) {
      return ImmutableList.of(TAG_NavModel_NAVKeplerianSet);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new NavModel_NAVKeplerianSet from encoded stream.
   */
  public static NavModel_NAVKeplerianSet fromPerUnaligned(byte[] encodedBytes) {
    NavModel_NAVKeplerianSet result = new NavModel_NAVKeplerianSet();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new NavModel_NAVKeplerianSet from encoded stream.
   */
  public static NavModel_NAVKeplerianSet fromPerAligned(byte[] encodedBytes) {
    NavModel_NAVKeplerianSet result = new NavModel_NAVKeplerianSet();
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

  
  private NavModel_NAVKeplerianSet.navURAType navURA_;
  public NavModel_NAVKeplerianSet.navURAType getNavURA() {
    return navURA_;
  }
  /**
   * @throws ClassCastException if value is not a NavModel_NAVKeplerianSet.navURAType
   */
  public void setNavURA(Asn1Object value) {
    this.navURA_ = (NavModel_NAVKeplerianSet.navURAType) value;
  }
  public NavModel_NAVKeplerianSet.navURAType setNavURAToNewInstance() {
    navURA_ = new NavModel_NAVKeplerianSet.navURAType();
    return navURA_;
  }
  
  private NavModel_NAVKeplerianSet.navFitFlagType navFitFlag_;
  public NavModel_NAVKeplerianSet.navFitFlagType getNavFitFlag() {
    return navFitFlag_;
  }
  /**
   * @throws ClassCastException if value is not a NavModel_NAVKeplerianSet.navFitFlagType
   */
  public void setNavFitFlag(Asn1Object value) {
    this.navFitFlag_ = (NavModel_NAVKeplerianSet.navFitFlagType) value;
  }
  public NavModel_NAVKeplerianSet.navFitFlagType setNavFitFlagToNewInstance() {
    navFitFlag_ = new NavModel_NAVKeplerianSet.navFitFlagType();
    return navFitFlag_;
  }
  
  private NavModel_NAVKeplerianSet.navToeType navToe_;
  public NavModel_NAVKeplerianSet.navToeType getNavToe() {
    return navToe_;
  }
  /**
   * @throws ClassCastException if value is not a NavModel_NAVKeplerianSet.navToeType
   */
  public void setNavToe(Asn1Object value) {
    this.navToe_ = (NavModel_NAVKeplerianSet.navToeType) value;
  }
  public NavModel_NAVKeplerianSet.navToeType setNavToeToNewInstance() {
    navToe_ = new NavModel_NAVKeplerianSet.navToeType();
    return navToe_;
  }
  
  private NavModel_NAVKeplerianSet.navOmegaType navOmega_;
  public NavModel_NAVKeplerianSet.navOmegaType getNavOmega() {
    return navOmega_;
  }
  /**
   * @throws ClassCastException if value is not a NavModel_NAVKeplerianSet.navOmegaType
   */
  public void setNavOmega(Asn1Object value) {
    this.navOmega_ = (NavModel_NAVKeplerianSet.navOmegaType) value;
  }
  public NavModel_NAVKeplerianSet.navOmegaType setNavOmegaToNewInstance() {
    navOmega_ = new NavModel_NAVKeplerianSet.navOmegaType();
    return navOmega_;
  }
  
  private NavModel_NAVKeplerianSet.navDeltaNType navDeltaN_;
  public NavModel_NAVKeplerianSet.navDeltaNType getNavDeltaN() {
    return navDeltaN_;
  }
  /**
   * @throws ClassCastException if value is not a NavModel_NAVKeplerianSet.navDeltaNType
   */
  public void setNavDeltaN(Asn1Object value) {
    this.navDeltaN_ = (NavModel_NAVKeplerianSet.navDeltaNType) value;
  }
  public NavModel_NAVKeplerianSet.navDeltaNType setNavDeltaNToNewInstance() {
    navDeltaN_ = new NavModel_NAVKeplerianSet.navDeltaNType();
    return navDeltaN_;
  }
  
  private NavModel_NAVKeplerianSet.navM0Type navM0_;
  public NavModel_NAVKeplerianSet.navM0Type getNavM0() {
    return navM0_;
  }
  /**
   * @throws ClassCastException if value is not a NavModel_NAVKeplerianSet.navM0Type
   */
  public void setNavM0(Asn1Object value) {
    this.navM0_ = (NavModel_NAVKeplerianSet.navM0Type) value;
  }
  public NavModel_NAVKeplerianSet.navM0Type setNavM0ToNewInstance() {
    navM0_ = new NavModel_NAVKeplerianSet.navM0Type();
    return navM0_;
  }
  
  private NavModel_NAVKeplerianSet.navOmegaADotType navOmegaADot_;
  public NavModel_NAVKeplerianSet.navOmegaADotType getNavOmegaADot() {
    return navOmegaADot_;
  }
  /**
   * @throws ClassCastException if value is not a NavModel_NAVKeplerianSet.navOmegaADotType
   */
  public void setNavOmegaADot(Asn1Object value) {
    this.navOmegaADot_ = (NavModel_NAVKeplerianSet.navOmegaADotType) value;
  }
  public NavModel_NAVKeplerianSet.navOmegaADotType setNavOmegaADotToNewInstance() {
    navOmegaADot_ = new NavModel_NAVKeplerianSet.navOmegaADotType();
    return navOmegaADot_;
  }
  
  private NavModel_NAVKeplerianSet.navEType navE_;
  public NavModel_NAVKeplerianSet.navEType getNavE() {
    return navE_;
  }
  /**
   * @throws ClassCastException if value is not a NavModel_NAVKeplerianSet.navEType
   */
  public void setNavE(Asn1Object value) {
    this.navE_ = (NavModel_NAVKeplerianSet.navEType) value;
  }
  public NavModel_NAVKeplerianSet.navEType setNavEToNewInstance() {
    navE_ = new NavModel_NAVKeplerianSet.navEType();
    return navE_;
  }
  
  private NavModel_NAVKeplerianSet.navIDotType navIDot_;
  public NavModel_NAVKeplerianSet.navIDotType getNavIDot() {
    return navIDot_;
  }
  /**
   * @throws ClassCastException if value is not a NavModel_NAVKeplerianSet.navIDotType
   */
  public void setNavIDot(Asn1Object value) {
    this.navIDot_ = (NavModel_NAVKeplerianSet.navIDotType) value;
  }
  public NavModel_NAVKeplerianSet.navIDotType setNavIDotToNewInstance() {
    navIDot_ = new NavModel_NAVKeplerianSet.navIDotType();
    return navIDot_;
  }
  
  private NavModel_NAVKeplerianSet.navAPowerHalfType navAPowerHalf_;
  public NavModel_NAVKeplerianSet.navAPowerHalfType getNavAPowerHalf() {
    return navAPowerHalf_;
  }
  /**
   * @throws ClassCastException if value is not a NavModel_NAVKeplerianSet.navAPowerHalfType
   */
  public void setNavAPowerHalf(Asn1Object value) {
    this.navAPowerHalf_ = (NavModel_NAVKeplerianSet.navAPowerHalfType) value;
  }
  public NavModel_NAVKeplerianSet.navAPowerHalfType setNavAPowerHalfToNewInstance() {
    navAPowerHalf_ = new NavModel_NAVKeplerianSet.navAPowerHalfType();
    return navAPowerHalf_;
  }
  
  private NavModel_NAVKeplerianSet.navI0Type navI0_;
  public NavModel_NAVKeplerianSet.navI0Type getNavI0() {
    return navI0_;
  }
  /**
   * @throws ClassCastException if value is not a NavModel_NAVKeplerianSet.navI0Type
   */
  public void setNavI0(Asn1Object value) {
    this.navI0_ = (NavModel_NAVKeplerianSet.navI0Type) value;
  }
  public NavModel_NAVKeplerianSet.navI0Type setNavI0ToNewInstance() {
    navI0_ = new NavModel_NAVKeplerianSet.navI0Type();
    return navI0_;
  }
  
  private NavModel_NAVKeplerianSet.navOmegaA0Type navOmegaA0_;
  public NavModel_NAVKeplerianSet.navOmegaA0Type getNavOmegaA0() {
    return navOmegaA0_;
  }
  /**
   * @throws ClassCastException if value is not a NavModel_NAVKeplerianSet.navOmegaA0Type
   */
  public void setNavOmegaA0(Asn1Object value) {
    this.navOmegaA0_ = (NavModel_NAVKeplerianSet.navOmegaA0Type) value;
  }
  public NavModel_NAVKeplerianSet.navOmegaA0Type setNavOmegaA0ToNewInstance() {
    navOmegaA0_ = new NavModel_NAVKeplerianSet.navOmegaA0Type();
    return navOmegaA0_;
  }
  
  private NavModel_NAVKeplerianSet.navCrsType navCrs_;
  public NavModel_NAVKeplerianSet.navCrsType getNavCrs() {
    return navCrs_;
  }
  /**
   * @throws ClassCastException if value is not a NavModel_NAVKeplerianSet.navCrsType
   */
  public void setNavCrs(Asn1Object value) {
    this.navCrs_ = (NavModel_NAVKeplerianSet.navCrsType) value;
  }
  public NavModel_NAVKeplerianSet.navCrsType setNavCrsToNewInstance() {
    navCrs_ = new NavModel_NAVKeplerianSet.navCrsType();
    return navCrs_;
  }
  
  private NavModel_NAVKeplerianSet.navCisType navCis_;
  public NavModel_NAVKeplerianSet.navCisType getNavCis() {
    return navCis_;
  }
  /**
   * @throws ClassCastException if value is not a NavModel_NAVKeplerianSet.navCisType
   */
  public void setNavCis(Asn1Object value) {
    this.navCis_ = (NavModel_NAVKeplerianSet.navCisType) value;
  }
  public NavModel_NAVKeplerianSet.navCisType setNavCisToNewInstance() {
    navCis_ = new NavModel_NAVKeplerianSet.navCisType();
    return navCis_;
  }
  
  private NavModel_NAVKeplerianSet.navCusType navCus_;
  public NavModel_NAVKeplerianSet.navCusType getNavCus() {
    return navCus_;
  }
  /**
   * @throws ClassCastException if value is not a NavModel_NAVKeplerianSet.navCusType
   */
  public void setNavCus(Asn1Object value) {
    this.navCus_ = (NavModel_NAVKeplerianSet.navCusType) value;
  }
  public NavModel_NAVKeplerianSet.navCusType setNavCusToNewInstance() {
    navCus_ = new NavModel_NAVKeplerianSet.navCusType();
    return navCus_;
  }
  
  private NavModel_NAVKeplerianSet.navCrcType navCrc_;
  public NavModel_NAVKeplerianSet.navCrcType getNavCrc() {
    return navCrc_;
  }
  /**
   * @throws ClassCastException if value is not a NavModel_NAVKeplerianSet.navCrcType
   */
  public void setNavCrc(Asn1Object value) {
    this.navCrc_ = (NavModel_NAVKeplerianSet.navCrcType) value;
  }
  public NavModel_NAVKeplerianSet.navCrcType setNavCrcToNewInstance() {
    navCrc_ = new NavModel_NAVKeplerianSet.navCrcType();
    return navCrc_;
  }
  
  private NavModel_NAVKeplerianSet.navCicType navCic_;
  public NavModel_NAVKeplerianSet.navCicType getNavCic() {
    return navCic_;
  }
  /**
   * @throws ClassCastException if value is not a NavModel_NAVKeplerianSet.navCicType
   */
  public void setNavCic(Asn1Object value) {
    this.navCic_ = (NavModel_NAVKeplerianSet.navCicType) value;
  }
  public NavModel_NAVKeplerianSet.navCicType setNavCicToNewInstance() {
    navCic_ = new NavModel_NAVKeplerianSet.navCicType();
    return navCic_;
  }
  
  private NavModel_NAVKeplerianSet.navCucType navCuc_;
  public NavModel_NAVKeplerianSet.navCucType getNavCuc() {
    return navCuc_;
  }
  /**
   * @throws ClassCastException if value is not a NavModel_NAVKeplerianSet.navCucType
   */
  public void setNavCuc(Asn1Object value) {
    this.navCuc_ = (NavModel_NAVKeplerianSet.navCucType) value;
  }
  public NavModel_NAVKeplerianSet.navCucType setNavCucToNewInstance() {
    navCuc_ = new NavModel_NAVKeplerianSet.navCucType();
    return navCuc_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getNavURA() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getNavURA();
          }

          @Override public void setToNewInstance() {
            setNavURAToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavModel_NAVKeplerianSet.navURAType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "navURA : "
                    + getNavURA().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getNavFitFlag() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getNavFitFlag();
          }

          @Override public void setToNewInstance() {
            setNavFitFlagToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavModel_NAVKeplerianSet.navFitFlagType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "navFitFlag : "
                    + getNavFitFlag().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getNavToe() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getNavToe();
          }

          @Override public void setToNewInstance() {
            setNavToeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavModel_NAVKeplerianSet.navToeType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "navToe : "
                    + getNavToe().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getNavOmega() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getNavOmega();
          }

          @Override public void setToNewInstance() {
            setNavOmegaToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavModel_NAVKeplerianSet.navOmegaType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "navOmega : "
                    + getNavOmega().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getNavDeltaN() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getNavDeltaN();
          }

          @Override public void setToNewInstance() {
            setNavDeltaNToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavModel_NAVKeplerianSet.navDeltaNType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "navDeltaN : "
                    + getNavDeltaN().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getNavM0() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getNavM0();
          }

          @Override public void setToNewInstance() {
            setNavM0ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavModel_NAVKeplerianSet.navM0Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "navM0 : "
                    + getNavM0().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getNavOmegaADot() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getNavOmegaADot();
          }

          @Override public void setToNewInstance() {
            setNavOmegaADotToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavModel_NAVKeplerianSet.navOmegaADotType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "navOmegaADot : "
                    + getNavOmegaADot().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 7);

          @Override public boolean isExplicitlySet() {
            return getNavE() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getNavE();
          }

          @Override public void setToNewInstance() {
            setNavEToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavModel_NAVKeplerianSet.navEType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "navE : "
                    + getNavE().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 8);

          @Override public boolean isExplicitlySet() {
            return getNavIDot() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getNavIDot();
          }

          @Override public void setToNewInstance() {
            setNavIDotToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavModel_NAVKeplerianSet.navIDotType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "navIDot : "
                    + getNavIDot().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 9);

          @Override public boolean isExplicitlySet() {
            return getNavAPowerHalf() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getNavAPowerHalf();
          }

          @Override public void setToNewInstance() {
            setNavAPowerHalfToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavModel_NAVKeplerianSet.navAPowerHalfType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "navAPowerHalf : "
                    + getNavAPowerHalf().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 10);

          @Override public boolean isExplicitlySet() {
            return getNavI0() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getNavI0();
          }

          @Override public void setToNewInstance() {
            setNavI0ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavModel_NAVKeplerianSet.navI0Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "navI0 : "
                    + getNavI0().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 11);

          @Override public boolean isExplicitlySet() {
            return getNavOmegaA0() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getNavOmegaA0();
          }

          @Override public void setToNewInstance() {
            setNavOmegaA0ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavModel_NAVKeplerianSet.navOmegaA0Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "navOmegaA0 : "
                    + getNavOmegaA0().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 12);

          @Override public boolean isExplicitlySet() {
            return getNavCrs() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getNavCrs();
          }

          @Override public void setToNewInstance() {
            setNavCrsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavModel_NAVKeplerianSet.navCrsType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "navCrs : "
                    + getNavCrs().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 13);

          @Override public boolean isExplicitlySet() {
            return getNavCis() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getNavCis();
          }

          @Override public void setToNewInstance() {
            setNavCisToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavModel_NAVKeplerianSet.navCisType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "navCis : "
                    + getNavCis().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 14);

          @Override public boolean isExplicitlySet() {
            return getNavCus() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getNavCus();
          }

          @Override public void setToNewInstance() {
            setNavCusToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavModel_NAVKeplerianSet.navCusType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "navCus : "
                    + getNavCus().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 15);

          @Override public boolean isExplicitlySet() {
            return getNavCrc() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getNavCrc();
          }

          @Override public void setToNewInstance() {
            setNavCrcToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavModel_NAVKeplerianSet.navCrcType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "navCrc : "
                    + getNavCrc().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 16);

          @Override public boolean isExplicitlySet() {
            return getNavCic() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getNavCic();
          }

          @Override public void setToNewInstance() {
            setNavCicToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavModel_NAVKeplerianSet.navCicType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "navCic : "
                    + getNavCic().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 17);

          @Override public boolean isExplicitlySet() {
            return getNavCuc() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getNavCuc();
          }

          @Override public void setToNewInstance() {
            setNavCucToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavModel_NAVKeplerianSet.navCucType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "navCuc : "
                    + getNavCuc().toIndentedString(indent);
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
public static class navURAType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_navURAType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public navURAType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("15"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_navURAType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_navURAType != null) {
      return ImmutableList.of(TAG_navURAType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new navURAType from encoded stream.
   */
  public static navURAType fromPerUnaligned(byte[] encodedBytes) {
    navURAType result = new navURAType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new navURAType from encoded stream.
   */
  public static navURAType fromPerAligned(byte[] encodedBytes) {
    navURAType result = new navURAType();
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
    return "navURAType = " + getInteger() + ";\n";
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
public static class navFitFlagType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_navFitFlagType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public navFitFlagType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("1"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_navFitFlagType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_navFitFlagType != null) {
      return ImmutableList.of(TAG_navFitFlagType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new navFitFlagType from encoded stream.
   */
  public static navFitFlagType fromPerUnaligned(byte[] encodedBytes) {
    navFitFlagType result = new navFitFlagType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new navFitFlagType from encoded stream.
   */
  public static navFitFlagType fromPerAligned(byte[] encodedBytes) {
    navFitFlagType result = new navFitFlagType();
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
    return "navFitFlagType = " + getInteger() + ";\n";
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
public static class navToeType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_navToeType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public navToeType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("37799"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_navToeType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_navToeType != null) {
      return ImmutableList.of(TAG_navToeType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new navToeType from encoded stream.
   */
  public static navToeType fromPerUnaligned(byte[] encodedBytes) {
    navToeType result = new navToeType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new navToeType from encoded stream.
   */
  public static navToeType fromPerAligned(byte[] encodedBytes) {
    navToeType result = new navToeType();
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
    return "navToeType = " + getInteger() + ";\n";
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
public static class navOmegaType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_navOmegaType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public navOmegaType() {
    super();
    setValueRange(new java.math.BigInteger("-2147483648"), new java.math.BigInteger("2147483647"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_navOmegaType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_navOmegaType != null) {
      return ImmutableList.of(TAG_navOmegaType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new navOmegaType from encoded stream.
   */
  public static navOmegaType fromPerUnaligned(byte[] encodedBytes) {
    navOmegaType result = new navOmegaType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new navOmegaType from encoded stream.
   */
  public static navOmegaType fromPerAligned(byte[] encodedBytes) {
    navOmegaType result = new navOmegaType();
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
    return "navOmegaType = " + getInteger() + ";\n";
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
public static class navDeltaNType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_navDeltaNType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public navDeltaNType() {
    super();
    setValueRange(new java.math.BigInteger("-32768"), new java.math.BigInteger("32767"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_navDeltaNType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_navDeltaNType != null) {
      return ImmutableList.of(TAG_navDeltaNType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new navDeltaNType from encoded stream.
   */
  public static navDeltaNType fromPerUnaligned(byte[] encodedBytes) {
    navDeltaNType result = new navDeltaNType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new navDeltaNType from encoded stream.
   */
  public static navDeltaNType fromPerAligned(byte[] encodedBytes) {
    navDeltaNType result = new navDeltaNType();
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
    return "navDeltaNType = " + getInteger() + ";\n";
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
public static class navM0Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_navM0Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public navM0Type() {
    super();
    setValueRange(new java.math.BigInteger("-2147483648"), new java.math.BigInteger("2147483647"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_navM0Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_navM0Type != null) {
      return ImmutableList.of(TAG_navM0Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new navM0Type from encoded stream.
   */
  public static navM0Type fromPerUnaligned(byte[] encodedBytes) {
    navM0Type result = new navM0Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new navM0Type from encoded stream.
   */
  public static navM0Type fromPerAligned(byte[] encodedBytes) {
    navM0Type result = new navM0Type();
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
    return "navM0Type = " + getInteger() + ";\n";
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
public static class navOmegaADotType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_navOmegaADotType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public navOmegaADotType() {
    super();
    setValueRange(new java.math.BigInteger("-8388608"), new java.math.BigInteger("8388607"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_navOmegaADotType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_navOmegaADotType != null) {
      return ImmutableList.of(TAG_navOmegaADotType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new navOmegaADotType from encoded stream.
   */
  public static navOmegaADotType fromPerUnaligned(byte[] encodedBytes) {
    navOmegaADotType result = new navOmegaADotType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new navOmegaADotType from encoded stream.
   */
  public static navOmegaADotType fromPerAligned(byte[] encodedBytes) {
    navOmegaADotType result = new navOmegaADotType();
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
    return "navOmegaADotType = " + getInteger() + ";\n";
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
public static class navEType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_navEType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public navEType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("4294967295"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_navEType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_navEType != null) {
      return ImmutableList.of(TAG_navEType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new navEType from encoded stream.
   */
  public static navEType fromPerUnaligned(byte[] encodedBytes) {
    navEType result = new navEType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new navEType from encoded stream.
   */
  public static navEType fromPerAligned(byte[] encodedBytes) {
    navEType result = new navEType();
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
    return "navEType = " + getInteger() + ";\n";
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
public static class navIDotType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_navIDotType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public navIDotType() {
    super();
    setValueRange(new java.math.BigInteger("-8192"), new java.math.BigInteger("8191"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_navIDotType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_navIDotType != null) {
      return ImmutableList.of(TAG_navIDotType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new navIDotType from encoded stream.
   */
  public static navIDotType fromPerUnaligned(byte[] encodedBytes) {
    navIDotType result = new navIDotType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new navIDotType from encoded stream.
   */
  public static navIDotType fromPerAligned(byte[] encodedBytes) {
    navIDotType result = new navIDotType();
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
    return "navIDotType = " + getInteger() + ";\n";
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
public static class navAPowerHalfType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_navAPowerHalfType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public navAPowerHalfType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("4294967295"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_navAPowerHalfType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_navAPowerHalfType != null) {
      return ImmutableList.of(TAG_navAPowerHalfType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new navAPowerHalfType from encoded stream.
   */
  public static navAPowerHalfType fromPerUnaligned(byte[] encodedBytes) {
    navAPowerHalfType result = new navAPowerHalfType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new navAPowerHalfType from encoded stream.
   */
  public static navAPowerHalfType fromPerAligned(byte[] encodedBytes) {
    navAPowerHalfType result = new navAPowerHalfType();
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
    return "navAPowerHalfType = " + getInteger() + ";\n";
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
public static class navI0Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_navI0Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public navI0Type() {
    super();
    setValueRange(new java.math.BigInteger("-2147483648"), new java.math.BigInteger("2147483647"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_navI0Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_navI0Type != null) {
      return ImmutableList.of(TAG_navI0Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new navI0Type from encoded stream.
   */
  public static navI0Type fromPerUnaligned(byte[] encodedBytes) {
    navI0Type result = new navI0Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new navI0Type from encoded stream.
   */
  public static navI0Type fromPerAligned(byte[] encodedBytes) {
    navI0Type result = new navI0Type();
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
    return "navI0Type = " + getInteger() + ";\n";
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
public static class navOmegaA0Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_navOmegaA0Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public navOmegaA0Type() {
    super();
    setValueRange(new java.math.BigInteger("-2147483648"), new java.math.BigInteger("2147483647"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_navOmegaA0Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_navOmegaA0Type != null) {
      return ImmutableList.of(TAG_navOmegaA0Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new navOmegaA0Type from encoded stream.
   */
  public static navOmegaA0Type fromPerUnaligned(byte[] encodedBytes) {
    navOmegaA0Type result = new navOmegaA0Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new navOmegaA0Type from encoded stream.
   */
  public static navOmegaA0Type fromPerAligned(byte[] encodedBytes) {
    navOmegaA0Type result = new navOmegaA0Type();
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
    return "navOmegaA0Type = " + getInteger() + ";\n";
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
public static class navCrsType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_navCrsType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public navCrsType() {
    super();
    setValueRange(new java.math.BigInteger("-32768"), new java.math.BigInteger("32767"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_navCrsType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_navCrsType != null) {
      return ImmutableList.of(TAG_navCrsType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new navCrsType from encoded stream.
   */
  public static navCrsType fromPerUnaligned(byte[] encodedBytes) {
    navCrsType result = new navCrsType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new navCrsType from encoded stream.
   */
  public static navCrsType fromPerAligned(byte[] encodedBytes) {
    navCrsType result = new navCrsType();
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
    return "navCrsType = " + getInteger() + ";\n";
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
public static class navCisType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_navCisType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public navCisType() {
    super();
    setValueRange(new java.math.BigInteger("-32768"), new java.math.BigInteger("32767"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_navCisType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_navCisType != null) {
      return ImmutableList.of(TAG_navCisType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new navCisType from encoded stream.
   */
  public static navCisType fromPerUnaligned(byte[] encodedBytes) {
    navCisType result = new navCisType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new navCisType from encoded stream.
   */
  public static navCisType fromPerAligned(byte[] encodedBytes) {
    navCisType result = new navCisType();
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
    return "navCisType = " + getInteger() + ";\n";
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
public static class navCusType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_navCusType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public navCusType() {
    super();
    setValueRange(new java.math.BigInteger("-32768"), new java.math.BigInteger("32767"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_navCusType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_navCusType != null) {
      return ImmutableList.of(TAG_navCusType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new navCusType from encoded stream.
   */
  public static navCusType fromPerUnaligned(byte[] encodedBytes) {
    navCusType result = new navCusType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new navCusType from encoded stream.
   */
  public static navCusType fromPerAligned(byte[] encodedBytes) {
    navCusType result = new navCusType();
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
    return "navCusType = " + getInteger() + ";\n";
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
public static class navCrcType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_navCrcType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public navCrcType() {
    super();
    setValueRange(new java.math.BigInteger("-32768"), new java.math.BigInteger("32767"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_navCrcType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_navCrcType != null) {
      return ImmutableList.of(TAG_navCrcType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new navCrcType from encoded stream.
   */
  public static navCrcType fromPerUnaligned(byte[] encodedBytes) {
    navCrcType result = new navCrcType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new navCrcType from encoded stream.
   */
  public static navCrcType fromPerAligned(byte[] encodedBytes) {
    navCrcType result = new navCrcType();
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
    return "navCrcType = " + getInteger() + ";\n";
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
public static class navCicType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_navCicType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public navCicType() {
    super();
    setValueRange(new java.math.BigInteger("-32768"), new java.math.BigInteger("32767"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_navCicType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_navCicType != null) {
      return ImmutableList.of(TAG_navCicType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new navCicType from encoded stream.
   */
  public static navCicType fromPerUnaligned(byte[] encodedBytes) {
    navCicType result = new navCicType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new navCicType from encoded stream.
   */
  public static navCicType fromPerAligned(byte[] encodedBytes) {
    navCicType result = new navCicType();
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
    return "navCicType = " + getInteger() + ";\n";
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
public static class navCucType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_navCucType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public navCucType() {
    super();
    setValueRange(new java.math.BigInteger("-32768"), new java.math.BigInteger("32767"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_navCucType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_navCucType != null) {
      return ImmutableList.of(TAG_navCucType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new navCucType from encoded stream.
   */
  public static navCucType fromPerUnaligned(byte[] encodedBytes) {
    navCucType result = new navCucType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new navCucType from encoded stream.
   */
  public static navCucType fromPerAligned(byte[] encodedBytes) {
    navCucType result = new navCucType();
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
    return "navCucType = " + getInteger() + ";\n";
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
    builder.append("NavModel_NAVKeplerianSet = {\n");
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
