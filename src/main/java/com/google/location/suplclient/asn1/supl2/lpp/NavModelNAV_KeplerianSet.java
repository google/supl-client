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
public  class NavModelNAV_KeplerianSet extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_NavModelNAV_KeplerianSet
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public NavModelNAV_KeplerianSet() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_NavModelNAV_KeplerianSet;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_NavModelNAV_KeplerianSet != null) {
      return ImmutableList.of(TAG_NavModelNAV_KeplerianSet);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new NavModelNAV_KeplerianSet from encoded stream.
   */
  public static NavModelNAV_KeplerianSet fromPerUnaligned(byte[] encodedBytes) {
    NavModelNAV_KeplerianSet result = new NavModelNAV_KeplerianSet();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new NavModelNAV_KeplerianSet from encoded stream.
   */
  public static NavModelNAV_KeplerianSet fromPerAligned(byte[] encodedBytes) {
    NavModelNAV_KeplerianSet result = new NavModelNAV_KeplerianSet();
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

  
  private NavModelNAV_KeplerianSet.navURAType navURA_;
  public NavModelNAV_KeplerianSet.navURAType getNavURA() {
    return navURA_;
  }
  /**
   * @throws ClassCastException if value is not a NavModelNAV_KeplerianSet.navURAType
   */
  public void setNavURA(Asn1Object value) {
    this.navURA_ = (NavModelNAV_KeplerianSet.navURAType) value;
  }
  public NavModelNAV_KeplerianSet.navURAType setNavURAToNewInstance() {
    navURA_ = new NavModelNAV_KeplerianSet.navURAType();
    return navURA_;
  }
  
  private NavModelNAV_KeplerianSet.navFitFlagType navFitFlag_;
  public NavModelNAV_KeplerianSet.navFitFlagType getNavFitFlag() {
    return navFitFlag_;
  }
  /**
   * @throws ClassCastException if value is not a NavModelNAV_KeplerianSet.navFitFlagType
   */
  public void setNavFitFlag(Asn1Object value) {
    this.navFitFlag_ = (NavModelNAV_KeplerianSet.navFitFlagType) value;
  }
  public NavModelNAV_KeplerianSet.navFitFlagType setNavFitFlagToNewInstance() {
    navFitFlag_ = new NavModelNAV_KeplerianSet.navFitFlagType();
    return navFitFlag_;
  }
  
  private NavModelNAV_KeplerianSet.navToeType navToe_;
  public NavModelNAV_KeplerianSet.navToeType getNavToe() {
    return navToe_;
  }
  /**
   * @throws ClassCastException if value is not a NavModelNAV_KeplerianSet.navToeType
   */
  public void setNavToe(Asn1Object value) {
    this.navToe_ = (NavModelNAV_KeplerianSet.navToeType) value;
  }
  public NavModelNAV_KeplerianSet.navToeType setNavToeToNewInstance() {
    navToe_ = new NavModelNAV_KeplerianSet.navToeType();
    return navToe_;
  }
  
  private NavModelNAV_KeplerianSet.navOmegaType navOmega_;
  public NavModelNAV_KeplerianSet.navOmegaType getNavOmega() {
    return navOmega_;
  }
  /**
   * @throws ClassCastException if value is not a NavModelNAV_KeplerianSet.navOmegaType
   */
  public void setNavOmega(Asn1Object value) {
    this.navOmega_ = (NavModelNAV_KeplerianSet.navOmegaType) value;
  }
  public NavModelNAV_KeplerianSet.navOmegaType setNavOmegaToNewInstance() {
    navOmega_ = new NavModelNAV_KeplerianSet.navOmegaType();
    return navOmega_;
  }
  
  private NavModelNAV_KeplerianSet.navDeltaNType navDeltaN_;
  public NavModelNAV_KeplerianSet.navDeltaNType getNavDeltaN() {
    return navDeltaN_;
  }
  /**
   * @throws ClassCastException if value is not a NavModelNAV_KeplerianSet.navDeltaNType
   */
  public void setNavDeltaN(Asn1Object value) {
    this.navDeltaN_ = (NavModelNAV_KeplerianSet.navDeltaNType) value;
  }
  public NavModelNAV_KeplerianSet.navDeltaNType setNavDeltaNToNewInstance() {
    navDeltaN_ = new NavModelNAV_KeplerianSet.navDeltaNType();
    return navDeltaN_;
  }
  
  private NavModelNAV_KeplerianSet.navM0Type navM0_;
  public NavModelNAV_KeplerianSet.navM0Type getNavM0() {
    return navM0_;
  }
  /**
   * @throws ClassCastException if value is not a NavModelNAV_KeplerianSet.navM0Type
   */
  public void setNavM0(Asn1Object value) {
    this.navM0_ = (NavModelNAV_KeplerianSet.navM0Type) value;
  }
  public NavModelNAV_KeplerianSet.navM0Type setNavM0ToNewInstance() {
    navM0_ = new NavModelNAV_KeplerianSet.navM0Type();
    return navM0_;
  }
  
  private NavModelNAV_KeplerianSet.navOmegaADotType navOmegaADot_;
  public NavModelNAV_KeplerianSet.navOmegaADotType getNavOmegaADot() {
    return navOmegaADot_;
  }
  /**
   * @throws ClassCastException if value is not a NavModelNAV_KeplerianSet.navOmegaADotType
   */
  public void setNavOmegaADot(Asn1Object value) {
    this.navOmegaADot_ = (NavModelNAV_KeplerianSet.navOmegaADotType) value;
  }
  public NavModelNAV_KeplerianSet.navOmegaADotType setNavOmegaADotToNewInstance() {
    navOmegaADot_ = new NavModelNAV_KeplerianSet.navOmegaADotType();
    return navOmegaADot_;
  }
  
  private NavModelNAV_KeplerianSet.navEType navE_;
  public NavModelNAV_KeplerianSet.navEType getNavE() {
    return navE_;
  }
  /**
   * @throws ClassCastException if value is not a NavModelNAV_KeplerianSet.navEType
   */
  public void setNavE(Asn1Object value) {
    this.navE_ = (NavModelNAV_KeplerianSet.navEType) value;
  }
  public NavModelNAV_KeplerianSet.navEType setNavEToNewInstance() {
    navE_ = new NavModelNAV_KeplerianSet.navEType();
    return navE_;
  }
  
  private NavModelNAV_KeplerianSet.navIDotType navIDot_;
  public NavModelNAV_KeplerianSet.navIDotType getNavIDot() {
    return navIDot_;
  }
  /**
   * @throws ClassCastException if value is not a NavModelNAV_KeplerianSet.navIDotType
   */
  public void setNavIDot(Asn1Object value) {
    this.navIDot_ = (NavModelNAV_KeplerianSet.navIDotType) value;
  }
  public NavModelNAV_KeplerianSet.navIDotType setNavIDotToNewInstance() {
    navIDot_ = new NavModelNAV_KeplerianSet.navIDotType();
    return navIDot_;
  }
  
  private NavModelNAV_KeplerianSet.navAPowerHalfType navAPowerHalf_;
  public NavModelNAV_KeplerianSet.navAPowerHalfType getNavAPowerHalf() {
    return navAPowerHalf_;
  }
  /**
   * @throws ClassCastException if value is not a NavModelNAV_KeplerianSet.navAPowerHalfType
   */
  public void setNavAPowerHalf(Asn1Object value) {
    this.navAPowerHalf_ = (NavModelNAV_KeplerianSet.navAPowerHalfType) value;
  }
  public NavModelNAV_KeplerianSet.navAPowerHalfType setNavAPowerHalfToNewInstance() {
    navAPowerHalf_ = new NavModelNAV_KeplerianSet.navAPowerHalfType();
    return navAPowerHalf_;
  }
  
  private NavModelNAV_KeplerianSet.navI0Type navI0_;
  public NavModelNAV_KeplerianSet.navI0Type getNavI0() {
    return navI0_;
  }
  /**
   * @throws ClassCastException if value is not a NavModelNAV_KeplerianSet.navI0Type
   */
  public void setNavI0(Asn1Object value) {
    this.navI0_ = (NavModelNAV_KeplerianSet.navI0Type) value;
  }
  public NavModelNAV_KeplerianSet.navI0Type setNavI0ToNewInstance() {
    navI0_ = new NavModelNAV_KeplerianSet.navI0Type();
    return navI0_;
  }
  
  private NavModelNAV_KeplerianSet.navOmegaA0Type navOmegaA0_;
  public NavModelNAV_KeplerianSet.navOmegaA0Type getNavOmegaA0() {
    return navOmegaA0_;
  }
  /**
   * @throws ClassCastException if value is not a NavModelNAV_KeplerianSet.navOmegaA0Type
   */
  public void setNavOmegaA0(Asn1Object value) {
    this.navOmegaA0_ = (NavModelNAV_KeplerianSet.navOmegaA0Type) value;
  }
  public NavModelNAV_KeplerianSet.navOmegaA0Type setNavOmegaA0ToNewInstance() {
    navOmegaA0_ = new NavModelNAV_KeplerianSet.navOmegaA0Type();
    return navOmegaA0_;
  }
  
  private NavModelNAV_KeplerianSet.navCrsType navCrs_;
  public NavModelNAV_KeplerianSet.navCrsType getNavCrs() {
    return navCrs_;
  }
  /**
   * @throws ClassCastException if value is not a NavModelNAV_KeplerianSet.navCrsType
   */
  public void setNavCrs(Asn1Object value) {
    this.navCrs_ = (NavModelNAV_KeplerianSet.navCrsType) value;
  }
  public NavModelNAV_KeplerianSet.navCrsType setNavCrsToNewInstance() {
    navCrs_ = new NavModelNAV_KeplerianSet.navCrsType();
    return navCrs_;
  }
  
  private NavModelNAV_KeplerianSet.navCisType navCis_;
  public NavModelNAV_KeplerianSet.navCisType getNavCis() {
    return navCis_;
  }
  /**
   * @throws ClassCastException if value is not a NavModelNAV_KeplerianSet.navCisType
   */
  public void setNavCis(Asn1Object value) {
    this.navCis_ = (NavModelNAV_KeplerianSet.navCisType) value;
  }
  public NavModelNAV_KeplerianSet.navCisType setNavCisToNewInstance() {
    navCis_ = new NavModelNAV_KeplerianSet.navCisType();
    return navCis_;
  }
  
  private NavModelNAV_KeplerianSet.navCusType navCus_;
  public NavModelNAV_KeplerianSet.navCusType getNavCus() {
    return navCus_;
  }
  /**
   * @throws ClassCastException if value is not a NavModelNAV_KeplerianSet.navCusType
   */
  public void setNavCus(Asn1Object value) {
    this.navCus_ = (NavModelNAV_KeplerianSet.navCusType) value;
  }
  public NavModelNAV_KeplerianSet.navCusType setNavCusToNewInstance() {
    navCus_ = new NavModelNAV_KeplerianSet.navCusType();
    return navCus_;
  }
  
  private NavModelNAV_KeplerianSet.navCrcType navCrc_;
  public NavModelNAV_KeplerianSet.navCrcType getNavCrc() {
    return navCrc_;
  }
  /**
   * @throws ClassCastException if value is not a NavModelNAV_KeplerianSet.navCrcType
   */
  public void setNavCrc(Asn1Object value) {
    this.navCrc_ = (NavModelNAV_KeplerianSet.navCrcType) value;
  }
  public NavModelNAV_KeplerianSet.navCrcType setNavCrcToNewInstance() {
    navCrc_ = new NavModelNAV_KeplerianSet.navCrcType();
    return navCrc_;
  }
  
  private NavModelNAV_KeplerianSet.navCicType navCic_;
  public NavModelNAV_KeplerianSet.navCicType getNavCic() {
    return navCic_;
  }
  /**
   * @throws ClassCastException if value is not a NavModelNAV_KeplerianSet.navCicType
   */
  public void setNavCic(Asn1Object value) {
    this.navCic_ = (NavModelNAV_KeplerianSet.navCicType) value;
  }
  public NavModelNAV_KeplerianSet.navCicType setNavCicToNewInstance() {
    navCic_ = new NavModelNAV_KeplerianSet.navCicType();
    return navCic_;
  }
  
  private NavModelNAV_KeplerianSet.navCucType navCuc_;
  public NavModelNAV_KeplerianSet.navCucType getNavCuc() {
    return navCuc_;
  }
  /**
   * @throws ClassCastException if value is not a NavModelNAV_KeplerianSet.navCucType
   */
  public void setNavCuc(Asn1Object value) {
    this.navCuc_ = (NavModelNAV_KeplerianSet.navCucType) value;
  }
  public NavModelNAV_KeplerianSet.navCucType setNavCucToNewInstance() {
    navCuc_ = new NavModelNAV_KeplerianSet.navCucType();
    return navCuc_;
  }
  
  private NavModelNAV_KeplerianSet.addNAVparamType addNAVparam_;
  public NavModelNAV_KeplerianSet.addNAVparamType getAddNAVparam() {
    return addNAVparam_;
  }
  /**
   * @throws ClassCastException if value is not a NavModelNAV_KeplerianSet.addNAVparamType
   */
  public void setAddNAVparam(Asn1Object value) {
    this.addNAVparam_ = (NavModelNAV_KeplerianSet.addNAVparamType) value;
  }
  public NavModelNAV_KeplerianSet.addNAVparamType setAddNAVparamToNewInstance() {
    addNAVparam_ = new NavModelNAV_KeplerianSet.addNAVparamType();
    return addNAVparam_;
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
            return tag == null ? NavModelNAV_KeplerianSet.navURAType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? NavModelNAV_KeplerianSet.navFitFlagType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? NavModelNAV_KeplerianSet.navToeType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? NavModelNAV_KeplerianSet.navOmegaType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? NavModelNAV_KeplerianSet.navDeltaNType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? NavModelNAV_KeplerianSet.navM0Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? NavModelNAV_KeplerianSet.navOmegaADotType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? NavModelNAV_KeplerianSet.navEType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? NavModelNAV_KeplerianSet.navIDotType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? NavModelNAV_KeplerianSet.navAPowerHalfType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? NavModelNAV_KeplerianSet.navI0Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? NavModelNAV_KeplerianSet.navOmegaA0Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? NavModelNAV_KeplerianSet.navCrsType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? NavModelNAV_KeplerianSet.navCisType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? NavModelNAV_KeplerianSet.navCusType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? NavModelNAV_KeplerianSet.navCrcType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? NavModelNAV_KeplerianSet.navCicType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? NavModelNAV_KeplerianSet.navCucType.getPossibleFirstTags() : ImmutableList.of(tag);
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
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 18);

          @Override public boolean isExplicitlySet() {
            return getAddNAVparam() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getAddNAVparam();
          }

          @Override public void setToNewInstance() {
            setAddNAVparamToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavModelNAV_KeplerianSet.addNAVparamType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "addNAVparam : "
                    + getAddNAVparam().toIndentedString(indent);
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

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
* 
*/
public static class addNAVparamType extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_addNAVparamType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public addNAVparamType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_addNAVparamType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_addNAVparamType != null) {
      return ImmutableList.of(TAG_addNAVparamType);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new addNAVparamType from encoded stream.
   */
  public static addNAVparamType fromPerUnaligned(byte[] encodedBytes) {
    addNAVparamType result = new addNAVparamType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new addNAVparamType from encoded stream.
   */
  public static addNAVparamType fromPerAligned(byte[] encodedBytes) {
    addNAVparamType result = new addNAVparamType();
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

  
  private addNAVparamType.ephemCodeOnL2Type ephemCodeOnL2_;
  public addNAVparamType.ephemCodeOnL2Type getEphemCodeOnL2() {
    return ephemCodeOnL2_;
  }
  /**
   * @throws ClassCastException if value is not a addNAVparamType.ephemCodeOnL2Type
   */
  public void setEphemCodeOnL2(Asn1Object value) {
    this.ephemCodeOnL2_ = (addNAVparamType.ephemCodeOnL2Type) value;
  }
  public addNAVparamType.ephemCodeOnL2Type setEphemCodeOnL2ToNewInstance() {
    ephemCodeOnL2_ = new addNAVparamType.ephemCodeOnL2Type();
    return ephemCodeOnL2_;
  }
  
  private addNAVparamType.ephemL2PflagType ephemL2Pflag_;
  public addNAVparamType.ephemL2PflagType getEphemL2Pflag() {
    return ephemL2Pflag_;
  }
  /**
   * @throws ClassCastException if value is not a addNAVparamType.ephemL2PflagType
   */
  public void setEphemL2Pflag(Asn1Object value) {
    this.ephemL2Pflag_ = (addNAVparamType.ephemL2PflagType) value;
  }
  public addNAVparamType.ephemL2PflagType setEphemL2PflagToNewInstance() {
    ephemL2Pflag_ = new addNAVparamType.ephemL2PflagType();
    return ephemL2Pflag_;
  }
  
  private addNAVparamType.ephemSF1RsvdType ephemSF1Rsvd_;
  public addNAVparamType.ephemSF1RsvdType getEphemSF1Rsvd() {
    return ephemSF1Rsvd_;
  }
  /**
   * @throws ClassCastException if value is not a addNAVparamType.ephemSF1RsvdType
   */
  public void setEphemSF1Rsvd(Asn1Object value) {
    this.ephemSF1Rsvd_ = (addNAVparamType.ephemSF1RsvdType) value;
  }
  public addNAVparamType.ephemSF1RsvdType setEphemSF1RsvdToNewInstance() {
    ephemSF1Rsvd_ = new addNAVparamType.ephemSF1RsvdType();
    return ephemSF1Rsvd_;
  }
  
  private addNAVparamType.ephemAODAType ephemAODA_;
  public addNAVparamType.ephemAODAType getEphemAODA() {
    return ephemAODA_;
  }
  /**
   * @throws ClassCastException if value is not a addNAVparamType.ephemAODAType
   */
  public void setEphemAODA(Asn1Object value) {
    this.ephemAODA_ = (addNAVparamType.ephemAODAType) value;
  }
  public addNAVparamType.ephemAODAType setEphemAODAToNewInstance() {
    ephemAODA_ = new addNAVparamType.ephemAODAType();
    return ephemAODA_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getEphemCodeOnL2() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getEphemCodeOnL2();
          }

          @Override public void setToNewInstance() {
            setEphemCodeOnL2ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? addNAVparamType.ephemCodeOnL2Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ephemCodeOnL2 : "
                    + getEphemCodeOnL2().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getEphemL2Pflag() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getEphemL2Pflag();
          }

          @Override public void setToNewInstance() {
            setEphemL2PflagToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? addNAVparamType.ephemL2PflagType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ephemL2Pflag : "
                    + getEphemL2Pflag().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getEphemSF1Rsvd() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getEphemSF1Rsvd();
          }

          @Override public void setToNewInstance() {
            setEphemSF1RsvdToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? addNAVparamType.ephemSF1RsvdType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ephemSF1Rsvd : "
                    + getEphemSF1Rsvd().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getEphemAODA() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getEphemAODA();
          }

          @Override public void setToNewInstance() {
            setEphemAODAToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? addNAVparamType.ephemAODAType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ephemAODA : "
                    + getEphemAODA().toIndentedString(indent);
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
public static class ephemCodeOnL2Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ephemCodeOnL2Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ephemCodeOnL2Type() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("3"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ephemCodeOnL2Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ephemCodeOnL2Type != null) {
      return ImmutableList.of(TAG_ephemCodeOnL2Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ephemCodeOnL2Type from encoded stream.
   */
  public static ephemCodeOnL2Type fromPerUnaligned(byte[] encodedBytes) {
    ephemCodeOnL2Type result = new ephemCodeOnL2Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ephemCodeOnL2Type from encoded stream.
   */
  public static ephemCodeOnL2Type fromPerAligned(byte[] encodedBytes) {
    ephemCodeOnL2Type result = new ephemCodeOnL2Type();
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
    return "ephemCodeOnL2Type = " + getInteger() + ";\n";
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
public static class ephemL2PflagType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ephemL2PflagType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ephemL2PflagType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("1"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ephemL2PflagType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ephemL2PflagType != null) {
      return ImmutableList.of(TAG_ephemL2PflagType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ephemL2PflagType from encoded stream.
   */
  public static ephemL2PflagType fromPerUnaligned(byte[] encodedBytes) {
    ephemL2PflagType result = new ephemL2PflagType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ephemL2PflagType from encoded stream.
   */
  public static ephemL2PflagType fromPerAligned(byte[] encodedBytes) {
    ephemL2PflagType result = new ephemL2PflagType();
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
    return "ephemL2PflagType = " + getInteger() + ";\n";
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
public static class ephemSF1RsvdType extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_ephemSF1RsvdType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ephemSF1RsvdType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ephemSF1RsvdType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ephemSF1RsvdType != null) {
      return ImmutableList.of(TAG_ephemSF1RsvdType);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ephemSF1RsvdType from encoded stream.
   */
  public static ephemSF1RsvdType fromPerUnaligned(byte[] encodedBytes) {
    ephemSF1RsvdType result = new ephemSF1RsvdType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ephemSF1RsvdType from encoded stream.
   */
  public static ephemSF1RsvdType fromPerAligned(byte[] encodedBytes) {
    ephemSF1RsvdType result = new ephemSF1RsvdType();
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

  
  private ephemSF1RsvdType.reserved1Type reserved1_;
  public ephemSF1RsvdType.reserved1Type getReserved1() {
    return reserved1_;
  }
  /**
   * @throws ClassCastException if value is not a ephemSF1RsvdType.reserved1Type
   */
  public void setReserved1(Asn1Object value) {
    this.reserved1_ = (ephemSF1RsvdType.reserved1Type) value;
  }
  public ephemSF1RsvdType.reserved1Type setReserved1ToNewInstance() {
    reserved1_ = new ephemSF1RsvdType.reserved1Type();
    return reserved1_;
  }
  
  private ephemSF1RsvdType.reserved2Type reserved2_;
  public ephemSF1RsvdType.reserved2Type getReserved2() {
    return reserved2_;
  }
  /**
   * @throws ClassCastException if value is not a ephemSF1RsvdType.reserved2Type
   */
  public void setReserved2(Asn1Object value) {
    this.reserved2_ = (ephemSF1RsvdType.reserved2Type) value;
  }
  public ephemSF1RsvdType.reserved2Type setReserved2ToNewInstance() {
    reserved2_ = new ephemSF1RsvdType.reserved2Type();
    return reserved2_;
  }
  
  private ephemSF1RsvdType.reserved3Type reserved3_;
  public ephemSF1RsvdType.reserved3Type getReserved3() {
    return reserved3_;
  }
  /**
   * @throws ClassCastException if value is not a ephemSF1RsvdType.reserved3Type
   */
  public void setReserved3(Asn1Object value) {
    this.reserved3_ = (ephemSF1RsvdType.reserved3Type) value;
  }
  public ephemSF1RsvdType.reserved3Type setReserved3ToNewInstance() {
    reserved3_ = new ephemSF1RsvdType.reserved3Type();
    return reserved3_;
  }
  
  private ephemSF1RsvdType.reserved4Type reserved4_;
  public ephemSF1RsvdType.reserved4Type getReserved4() {
    return reserved4_;
  }
  /**
   * @throws ClassCastException if value is not a ephemSF1RsvdType.reserved4Type
   */
  public void setReserved4(Asn1Object value) {
    this.reserved4_ = (ephemSF1RsvdType.reserved4Type) value;
  }
  public ephemSF1RsvdType.reserved4Type setReserved4ToNewInstance() {
    reserved4_ = new ephemSF1RsvdType.reserved4Type();
    return reserved4_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getReserved1() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getReserved1();
          }

          @Override public void setToNewInstance() {
            setReserved1ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ephemSF1RsvdType.reserved1Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "reserved1 : "
                    + getReserved1().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getReserved2() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getReserved2();
          }

          @Override public void setToNewInstance() {
            setReserved2ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ephemSF1RsvdType.reserved2Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "reserved2 : "
                    + getReserved2().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getReserved3() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getReserved3();
          }

          @Override public void setToNewInstance() {
            setReserved3ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ephemSF1RsvdType.reserved3Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "reserved3 : "
                    + getReserved3().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getReserved4() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getReserved4();
          }

          @Override public void setToNewInstance() {
            setReserved4ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ephemSF1RsvdType.reserved4Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "reserved4 : "
                    + getReserved4().toIndentedString(indent);
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
public static class reserved1Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_reserved1Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public reserved1Type() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("8388607"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_reserved1Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_reserved1Type != null) {
      return ImmutableList.of(TAG_reserved1Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new reserved1Type from encoded stream.
   */
  public static reserved1Type fromPerUnaligned(byte[] encodedBytes) {
    reserved1Type result = new reserved1Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new reserved1Type from encoded stream.
   */
  public static reserved1Type fromPerAligned(byte[] encodedBytes) {
    reserved1Type result = new reserved1Type();
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
    return "reserved1Type = " + getInteger() + ";\n";
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
public static class reserved2Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_reserved2Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public reserved2Type() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("16777215"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_reserved2Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_reserved2Type != null) {
      return ImmutableList.of(TAG_reserved2Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new reserved2Type from encoded stream.
   */
  public static reserved2Type fromPerUnaligned(byte[] encodedBytes) {
    reserved2Type result = new reserved2Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new reserved2Type from encoded stream.
   */
  public static reserved2Type fromPerAligned(byte[] encodedBytes) {
    reserved2Type result = new reserved2Type();
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
    return "reserved2Type = " + getInteger() + ";\n";
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
public static class reserved3Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_reserved3Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public reserved3Type() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("16777215"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_reserved3Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_reserved3Type != null) {
      return ImmutableList.of(TAG_reserved3Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new reserved3Type from encoded stream.
   */
  public static reserved3Type fromPerUnaligned(byte[] encodedBytes) {
    reserved3Type result = new reserved3Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new reserved3Type from encoded stream.
   */
  public static reserved3Type fromPerAligned(byte[] encodedBytes) {
    reserved3Type result = new reserved3Type();
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
    return "reserved3Type = " + getInteger() + ";\n";
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
public static class reserved4Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_reserved4Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public reserved4Type() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("65535"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_reserved4Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_reserved4Type != null) {
      return ImmutableList.of(TAG_reserved4Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new reserved4Type from encoded stream.
   */
  public static reserved4Type fromPerUnaligned(byte[] encodedBytes) {
    reserved4Type result = new reserved4Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new reserved4Type from encoded stream.
   */
  public static reserved4Type fromPerAligned(byte[] encodedBytes) {
    reserved4Type result = new reserved4Type();
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
    return "reserved4Type = " + getInteger() + ";\n";
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
    builder.append("ephemSF1RsvdType = {\n");
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

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class ephemAODAType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ephemAODAType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ephemAODAType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("31"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ephemAODAType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ephemAODAType != null) {
      return ImmutableList.of(TAG_ephemAODAType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ephemAODAType from encoded stream.
   */
  public static ephemAODAType fromPerUnaligned(byte[] encodedBytes) {
    ephemAODAType result = new ephemAODAType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ephemAODAType from encoded stream.
   */
  public static ephemAODAType fromPerAligned(byte[] encodedBytes) {
    ephemAODAType result = new ephemAODAType();
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
    return "ephemAODAType = " + getInteger() + ";\n";
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
    builder.append("addNAVparamType = {\n");
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
    builder.append("NavModelNAV_KeplerianSet = {\n");
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
