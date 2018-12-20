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
public  class NavModelCNAV_KeplerianSet extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_NavModelCNAV_KeplerianSet
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public NavModelCNAV_KeplerianSet() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_NavModelCNAV_KeplerianSet;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_NavModelCNAV_KeplerianSet != null) {
      return ImmutableList.of(TAG_NavModelCNAV_KeplerianSet);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new NavModelCNAV_KeplerianSet from encoded stream.
   */
  public static NavModelCNAV_KeplerianSet fromPerUnaligned(byte[] encodedBytes) {
    NavModelCNAV_KeplerianSet result = new NavModelCNAV_KeplerianSet();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new NavModelCNAV_KeplerianSet from encoded stream.
   */
  public static NavModelCNAV_KeplerianSet fromPerAligned(byte[] encodedBytes) {
    NavModelCNAV_KeplerianSet result = new NavModelCNAV_KeplerianSet();
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

  
  private NavModelCNAV_KeplerianSet.cnavTopType cnavTop_;
  public NavModelCNAV_KeplerianSet.cnavTopType getCnavTop() {
    return cnavTop_;
  }
  /**
   * @throws ClassCastException if value is not a NavModelCNAV_KeplerianSet.cnavTopType
   */
  public void setCnavTop(Asn1Object value) {
    this.cnavTop_ = (NavModelCNAV_KeplerianSet.cnavTopType) value;
  }
  public NavModelCNAV_KeplerianSet.cnavTopType setCnavTopToNewInstance() {
    cnavTop_ = new NavModelCNAV_KeplerianSet.cnavTopType();
    return cnavTop_;
  }
  
  private NavModelCNAV_KeplerianSet.cnavURAindexType cnavURAindex_;
  public NavModelCNAV_KeplerianSet.cnavURAindexType getCnavURAindex() {
    return cnavURAindex_;
  }
  /**
   * @throws ClassCastException if value is not a NavModelCNAV_KeplerianSet.cnavURAindexType
   */
  public void setCnavURAindex(Asn1Object value) {
    this.cnavURAindex_ = (NavModelCNAV_KeplerianSet.cnavURAindexType) value;
  }
  public NavModelCNAV_KeplerianSet.cnavURAindexType setCnavURAindexToNewInstance() {
    cnavURAindex_ = new NavModelCNAV_KeplerianSet.cnavURAindexType();
    return cnavURAindex_;
  }
  
  private NavModelCNAV_KeplerianSet.cnavDeltaAType cnavDeltaA_;
  public NavModelCNAV_KeplerianSet.cnavDeltaAType getCnavDeltaA() {
    return cnavDeltaA_;
  }
  /**
   * @throws ClassCastException if value is not a NavModelCNAV_KeplerianSet.cnavDeltaAType
   */
  public void setCnavDeltaA(Asn1Object value) {
    this.cnavDeltaA_ = (NavModelCNAV_KeplerianSet.cnavDeltaAType) value;
  }
  public NavModelCNAV_KeplerianSet.cnavDeltaAType setCnavDeltaAToNewInstance() {
    cnavDeltaA_ = new NavModelCNAV_KeplerianSet.cnavDeltaAType();
    return cnavDeltaA_;
  }
  
  private NavModelCNAV_KeplerianSet.cnavAdotType cnavAdot_;
  public NavModelCNAV_KeplerianSet.cnavAdotType getCnavAdot() {
    return cnavAdot_;
  }
  /**
   * @throws ClassCastException if value is not a NavModelCNAV_KeplerianSet.cnavAdotType
   */
  public void setCnavAdot(Asn1Object value) {
    this.cnavAdot_ = (NavModelCNAV_KeplerianSet.cnavAdotType) value;
  }
  public NavModelCNAV_KeplerianSet.cnavAdotType setCnavAdotToNewInstance() {
    cnavAdot_ = new NavModelCNAV_KeplerianSet.cnavAdotType();
    return cnavAdot_;
  }
  
  private NavModelCNAV_KeplerianSet.cnavDeltaNoType cnavDeltaNo_;
  public NavModelCNAV_KeplerianSet.cnavDeltaNoType getCnavDeltaNo() {
    return cnavDeltaNo_;
  }
  /**
   * @throws ClassCastException if value is not a NavModelCNAV_KeplerianSet.cnavDeltaNoType
   */
  public void setCnavDeltaNo(Asn1Object value) {
    this.cnavDeltaNo_ = (NavModelCNAV_KeplerianSet.cnavDeltaNoType) value;
  }
  public NavModelCNAV_KeplerianSet.cnavDeltaNoType setCnavDeltaNoToNewInstance() {
    cnavDeltaNo_ = new NavModelCNAV_KeplerianSet.cnavDeltaNoType();
    return cnavDeltaNo_;
  }
  
  private NavModelCNAV_KeplerianSet.cnavDeltaNoDotType cnavDeltaNoDot_;
  public NavModelCNAV_KeplerianSet.cnavDeltaNoDotType getCnavDeltaNoDot() {
    return cnavDeltaNoDot_;
  }
  /**
   * @throws ClassCastException if value is not a NavModelCNAV_KeplerianSet.cnavDeltaNoDotType
   */
  public void setCnavDeltaNoDot(Asn1Object value) {
    this.cnavDeltaNoDot_ = (NavModelCNAV_KeplerianSet.cnavDeltaNoDotType) value;
  }
  public NavModelCNAV_KeplerianSet.cnavDeltaNoDotType setCnavDeltaNoDotToNewInstance() {
    cnavDeltaNoDot_ = new NavModelCNAV_KeplerianSet.cnavDeltaNoDotType();
    return cnavDeltaNoDot_;
  }
  
  private NavModelCNAV_KeplerianSet.cnavMoType cnavMo_;
  public NavModelCNAV_KeplerianSet.cnavMoType getCnavMo() {
    return cnavMo_;
  }
  /**
   * @throws ClassCastException if value is not a NavModelCNAV_KeplerianSet.cnavMoType
   */
  public void setCnavMo(Asn1Object value) {
    this.cnavMo_ = (NavModelCNAV_KeplerianSet.cnavMoType) value;
  }
  public NavModelCNAV_KeplerianSet.cnavMoType setCnavMoToNewInstance() {
    cnavMo_ = new NavModelCNAV_KeplerianSet.cnavMoType();
    return cnavMo_;
  }
  
  private NavModelCNAV_KeplerianSet.cnavEType cnavE_;
  public NavModelCNAV_KeplerianSet.cnavEType getCnavE() {
    return cnavE_;
  }
  /**
   * @throws ClassCastException if value is not a NavModelCNAV_KeplerianSet.cnavEType
   */
  public void setCnavE(Asn1Object value) {
    this.cnavE_ = (NavModelCNAV_KeplerianSet.cnavEType) value;
  }
  public NavModelCNAV_KeplerianSet.cnavEType setCnavEToNewInstance() {
    cnavE_ = new NavModelCNAV_KeplerianSet.cnavEType();
    return cnavE_;
  }
  
  private NavModelCNAV_KeplerianSet.cnavOmegaType cnavOmega_;
  public NavModelCNAV_KeplerianSet.cnavOmegaType getCnavOmega() {
    return cnavOmega_;
  }
  /**
   * @throws ClassCastException if value is not a NavModelCNAV_KeplerianSet.cnavOmegaType
   */
  public void setCnavOmega(Asn1Object value) {
    this.cnavOmega_ = (NavModelCNAV_KeplerianSet.cnavOmegaType) value;
  }
  public NavModelCNAV_KeplerianSet.cnavOmegaType setCnavOmegaToNewInstance() {
    cnavOmega_ = new NavModelCNAV_KeplerianSet.cnavOmegaType();
    return cnavOmega_;
  }
  
  private NavModelCNAV_KeplerianSet.cnavOMEGA0Type cnavOMEGA0_;
  public NavModelCNAV_KeplerianSet.cnavOMEGA0Type getCnavOMEGA0() {
    return cnavOMEGA0_;
  }
  /**
   * @throws ClassCastException if value is not a NavModelCNAV_KeplerianSet.cnavOMEGA0Type
   */
  public void setCnavOMEGA0(Asn1Object value) {
    this.cnavOMEGA0_ = (NavModelCNAV_KeplerianSet.cnavOMEGA0Type) value;
  }
  public NavModelCNAV_KeplerianSet.cnavOMEGA0Type setCnavOMEGA0ToNewInstance() {
    cnavOMEGA0_ = new NavModelCNAV_KeplerianSet.cnavOMEGA0Type();
    return cnavOMEGA0_;
  }
  
  private NavModelCNAV_KeplerianSet.cnavDeltaOmegaDotType cnavDeltaOmegaDot_;
  public NavModelCNAV_KeplerianSet.cnavDeltaOmegaDotType getCnavDeltaOmegaDot() {
    return cnavDeltaOmegaDot_;
  }
  /**
   * @throws ClassCastException if value is not a NavModelCNAV_KeplerianSet.cnavDeltaOmegaDotType
   */
  public void setCnavDeltaOmegaDot(Asn1Object value) {
    this.cnavDeltaOmegaDot_ = (NavModelCNAV_KeplerianSet.cnavDeltaOmegaDotType) value;
  }
  public NavModelCNAV_KeplerianSet.cnavDeltaOmegaDotType setCnavDeltaOmegaDotToNewInstance() {
    cnavDeltaOmegaDot_ = new NavModelCNAV_KeplerianSet.cnavDeltaOmegaDotType();
    return cnavDeltaOmegaDot_;
  }
  
  private NavModelCNAV_KeplerianSet.cnavIoType cnavIo_;
  public NavModelCNAV_KeplerianSet.cnavIoType getCnavIo() {
    return cnavIo_;
  }
  /**
   * @throws ClassCastException if value is not a NavModelCNAV_KeplerianSet.cnavIoType
   */
  public void setCnavIo(Asn1Object value) {
    this.cnavIo_ = (NavModelCNAV_KeplerianSet.cnavIoType) value;
  }
  public NavModelCNAV_KeplerianSet.cnavIoType setCnavIoToNewInstance() {
    cnavIo_ = new NavModelCNAV_KeplerianSet.cnavIoType();
    return cnavIo_;
  }
  
  private NavModelCNAV_KeplerianSet.cnavIoDotType cnavIoDot_;
  public NavModelCNAV_KeplerianSet.cnavIoDotType getCnavIoDot() {
    return cnavIoDot_;
  }
  /**
   * @throws ClassCastException if value is not a NavModelCNAV_KeplerianSet.cnavIoDotType
   */
  public void setCnavIoDot(Asn1Object value) {
    this.cnavIoDot_ = (NavModelCNAV_KeplerianSet.cnavIoDotType) value;
  }
  public NavModelCNAV_KeplerianSet.cnavIoDotType setCnavIoDotToNewInstance() {
    cnavIoDot_ = new NavModelCNAV_KeplerianSet.cnavIoDotType();
    return cnavIoDot_;
  }
  
  private NavModelCNAV_KeplerianSet.cnavCisType cnavCis_;
  public NavModelCNAV_KeplerianSet.cnavCisType getCnavCis() {
    return cnavCis_;
  }
  /**
   * @throws ClassCastException if value is not a NavModelCNAV_KeplerianSet.cnavCisType
   */
  public void setCnavCis(Asn1Object value) {
    this.cnavCis_ = (NavModelCNAV_KeplerianSet.cnavCisType) value;
  }
  public NavModelCNAV_KeplerianSet.cnavCisType setCnavCisToNewInstance() {
    cnavCis_ = new NavModelCNAV_KeplerianSet.cnavCisType();
    return cnavCis_;
  }
  
  private NavModelCNAV_KeplerianSet.cnavCicType cnavCic_;
  public NavModelCNAV_KeplerianSet.cnavCicType getCnavCic() {
    return cnavCic_;
  }
  /**
   * @throws ClassCastException if value is not a NavModelCNAV_KeplerianSet.cnavCicType
   */
  public void setCnavCic(Asn1Object value) {
    this.cnavCic_ = (NavModelCNAV_KeplerianSet.cnavCicType) value;
  }
  public NavModelCNAV_KeplerianSet.cnavCicType setCnavCicToNewInstance() {
    cnavCic_ = new NavModelCNAV_KeplerianSet.cnavCicType();
    return cnavCic_;
  }
  
  private NavModelCNAV_KeplerianSet.cnavCrsType cnavCrs_;
  public NavModelCNAV_KeplerianSet.cnavCrsType getCnavCrs() {
    return cnavCrs_;
  }
  /**
   * @throws ClassCastException if value is not a NavModelCNAV_KeplerianSet.cnavCrsType
   */
  public void setCnavCrs(Asn1Object value) {
    this.cnavCrs_ = (NavModelCNAV_KeplerianSet.cnavCrsType) value;
  }
  public NavModelCNAV_KeplerianSet.cnavCrsType setCnavCrsToNewInstance() {
    cnavCrs_ = new NavModelCNAV_KeplerianSet.cnavCrsType();
    return cnavCrs_;
  }
  
  private NavModelCNAV_KeplerianSet.cnavCrcType cnavCrc_;
  public NavModelCNAV_KeplerianSet.cnavCrcType getCnavCrc() {
    return cnavCrc_;
  }
  /**
   * @throws ClassCastException if value is not a NavModelCNAV_KeplerianSet.cnavCrcType
   */
  public void setCnavCrc(Asn1Object value) {
    this.cnavCrc_ = (NavModelCNAV_KeplerianSet.cnavCrcType) value;
  }
  public NavModelCNAV_KeplerianSet.cnavCrcType setCnavCrcToNewInstance() {
    cnavCrc_ = new NavModelCNAV_KeplerianSet.cnavCrcType();
    return cnavCrc_;
  }
  
  private NavModelCNAV_KeplerianSet.cnavCusType cnavCus_;
  public NavModelCNAV_KeplerianSet.cnavCusType getCnavCus() {
    return cnavCus_;
  }
  /**
   * @throws ClassCastException if value is not a NavModelCNAV_KeplerianSet.cnavCusType
   */
  public void setCnavCus(Asn1Object value) {
    this.cnavCus_ = (NavModelCNAV_KeplerianSet.cnavCusType) value;
  }
  public NavModelCNAV_KeplerianSet.cnavCusType setCnavCusToNewInstance() {
    cnavCus_ = new NavModelCNAV_KeplerianSet.cnavCusType();
    return cnavCus_;
  }
  
  private NavModelCNAV_KeplerianSet.cnavCucType cnavCuc_;
  public NavModelCNAV_KeplerianSet.cnavCucType getCnavCuc() {
    return cnavCuc_;
  }
  /**
   * @throws ClassCastException if value is not a NavModelCNAV_KeplerianSet.cnavCucType
   */
  public void setCnavCuc(Asn1Object value) {
    this.cnavCuc_ = (NavModelCNAV_KeplerianSet.cnavCucType) value;
  }
  public NavModelCNAV_KeplerianSet.cnavCucType setCnavCucToNewInstance() {
    cnavCuc_ = new NavModelCNAV_KeplerianSet.cnavCucType();
    return cnavCuc_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

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
            return tag == null ? NavModelCNAV_KeplerianSet.cnavTopType.getPossibleFirstTags() : ImmutableList.of(tag);
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
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getCnavURAindex() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCnavURAindex();
          }

          @Override public void setToNewInstance() {
            setCnavURAindexToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavModelCNAV_KeplerianSet.cnavURAindexType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "cnavURAindex : "
                    + getCnavURAindex().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getCnavDeltaA() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCnavDeltaA();
          }

          @Override public void setToNewInstance() {
            setCnavDeltaAToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavModelCNAV_KeplerianSet.cnavDeltaAType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "cnavDeltaA : "
                    + getCnavDeltaA().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getCnavAdot() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCnavAdot();
          }

          @Override public void setToNewInstance() {
            setCnavAdotToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavModelCNAV_KeplerianSet.cnavAdotType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "cnavAdot : "
                    + getCnavAdot().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getCnavDeltaNo() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCnavDeltaNo();
          }

          @Override public void setToNewInstance() {
            setCnavDeltaNoToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavModelCNAV_KeplerianSet.cnavDeltaNoType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "cnavDeltaNo : "
                    + getCnavDeltaNo().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getCnavDeltaNoDot() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCnavDeltaNoDot();
          }

          @Override public void setToNewInstance() {
            setCnavDeltaNoDotToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavModelCNAV_KeplerianSet.cnavDeltaNoDotType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "cnavDeltaNoDot : "
                    + getCnavDeltaNoDot().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getCnavMo() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCnavMo();
          }

          @Override public void setToNewInstance() {
            setCnavMoToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavModelCNAV_KeplerianSet.cnavMoType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "cnavMo : "
                    + getCnavMo().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 7);

          @Override public boolean isExplicitlySet() {
            return getCnavE() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCnavE();
          }

          @Override public void setToNewInstance() {
            setCnavEToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavModelCNAV_KeplerianSet.cnavEType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "cnavE : "
                    + getCnavE().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 8);

          @Override public boolean isExplicitlySet() {
            return getCnavOmega() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCnavOmega();
          }

          @Override public void setToNewInstance() {
            setCnavOmegaToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavModelCNAV_KeplerianSet.cnavOmegaType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "cnavOmega : "
                    + getCnavOmega().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 9);

          @Override public boolean isExplicitlySet() {
            return getCnavOMEGA0() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCnavOMEGA0();
          }

          @Override public void setToNewInstance() {
            setCnavOMEGA0ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavModelCNAV_KeplerianSet.cnavOMEGA0Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "cnavOMEGA0 : "
                    + getCnavOMEGA0().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 10);

          @Override public boolean isExplicitlySet() {
            return getCnavDeltaOmegaDot() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCnavDeltaOmegaDot();
          }

          @Override public void setToNewInstance() {
            setCnavDeltaOmegaDotToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavModelCNAV_KeplerianSet.cnavDeltaOmegaDotType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "cnavDeltaOmegaDot : "
                    + getCnavDeltaOmegaDot().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 11);

          @Override public boolean isExplicitlySet() {
            return getCnavIo() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCnavIo();
          }

          @Override public void setToNewInstance() {
            setCnavIoToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavModelCNAV_KeplerianSet.cnavIoType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "cnavIo : "
                    + getCnavIo().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 12);

          @Override public boolean isExplicitlySet() {
            return getCnavIoDot() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCnavIoDot();
          }

          @Override public void setToNewInstance() {
            setCnavIoDotToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavModelCNAV_KeplerianSet.cnavIoDotType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "cnavIoDot : "
                    + getCnavIoDot().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 13);

          @Override public boolean isExplicitlySet() {
            return getCnavCis() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCnavCis();
          }

          @Override public void setToNewInstance() {
            setCnavCisToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavModelCNAV_KeplerianSet.cnavCisType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "cnavCis : "
                    + getCnavCis().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 14);

          @Override public boolean isExplicitlySet() {
            return getCnavCic() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCnavCic();
          }

          @Override public void setToNewInstance() {
            setCnavCicToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavModelCNAV_KeplerianSet.cnavCicType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "cnavCic : "
                    + getCnavCic().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 15);

          @Override public boolean isExplicitlySet() {
            return getCnavCrs() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCnavCrs();
          }

          @Override public void setToNewInstance() {
            setCnavCrsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavModelCNAV_KeplerianSet.cnavCrsType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "cnavCrs : "
                    + getCnavCrs().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 16);

          @Override public boolean isExplicitlySet() {
            return getCnavCrc() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCnavCrc();
          }

          @Override public void setToNewInstance() {
            setCnavCrcToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavModelCNAV_KeplerianSet.cnavCrcType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "cnavCrc : "
                    + getCnavCrc().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 17);

          @Override public boolean isExplicitlySet() {
            return getCnavCus() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCnavCus();
          }

          @Override public void setToNewInstance() {
            setCnavCusToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavModelCNAV_KeplerianSet.cnavCusType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "cnavCus : "
                    + getCnavCus().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 18);

          @Override public boolean isExplicitlySet() {
            return getCnavCuc() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCnavCuc();
          }

          @Override public void setToNewInstance() {
            setCnavCucToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavModelCNAV_KeplerianSet.cnavCucType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "cnavCuc : "
                    + getCnavCuc().toIndentedString(indent);
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
public static class cnavURAindexType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_cnavURAindexType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public cnavURAindexType() {
    super();
    setValueRange(new java.math.BigInteger("-16"), new java.math.BigInteger("15"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_cnavURAindexType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_cnavURAindexType != null) {
      return ImmutableList.of(TAG_cnavURAindexType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new cnavURAindexType from encoded stream.
   */
  public static cnavURAindexType fromPerUnaligned(byte[] encodedBytes) {
    cnavURAindexType result = new cnavURAindexType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new cnavURAindexType from encoded stream.
   */
  public static cnavURAindexType fromPerAligned(byte[] encodedBytes) {
    cnavURAindexType result = new cnavURAindexType();
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
    return "cnavURAindexType = " + getInteger() + ";\n";
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
public static class cnavDeltaAType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_cnavDeltaAType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public cnavDeltaAType() {
    super();
    setValueRange(new java.math.BigInteger("-33554432"), new java.math.BigInteger("33554431"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_cnavDeltaAType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_cnavDeltaAType != null) {
      return ImmutableList.of(TAG_cnavDeltaAType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new cnavDeltaAType from encoded stream.
   */
  public static cnavDeltaAType fromPerUnaligned(byte[] encodedBytes) {
    cnavDeltaAType result = new cnavDeltaAType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new cnavDeltaAType from encoded stream.
   */
  public static cnavDeltaAType fromPerAligned(byte[] encodedBytes) {
    cnavDeltaAType result = new cnavDeltaAType();
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
    return "cnavDeltaAType = " + getInteger() + ";\n";
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
public static class cnavAdotType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_cnavAdotType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public cnavAdotType() {
    super();
    setValueRange(new java.math.BigInteger("-16777216"), new java.math.BigInteger("16777215"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_cnavAdotType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_cnavAdotType != null) {
      return ImmutableList.of(TAG_cnavAdotType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new cnavAdotType from encoded stream.
   */
  public static cnavAdotType fromPerUnaligned(byte[] encodedBytes) {
    cnavAdotType result = new cnavAdotType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new cnavAdotType from encoded stream.
   */
  public static cnavAdotType fromPerAligned(byte[] encodedBytes) {
    cnavAdotType result = new cnavAdotType();
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
    return "cnavAdotType = " + getInteger() + ";\n";
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
public static class cnavDeltaNoType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_cnavDeltaNoType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public cnavDeltaNoType() {
    super();
    setValueRange(new java.math.BigInteger("-65536"), new java.math.BigInteger("65535"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_cnavDeltaNoType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_cnavDeltaNoType != null) {
      return ImmutableList.of(TAG_cnavDeltaNoType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new cnavDeltaNoType from encoded stream.
   */
  public static cnavDeltaNoType fromPerUnaligned(byte[] encodedBytes) {
    cnavDeltaNoType result = new cnavDeltaNoType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new cnavDeltaNoType from encoded stream.
   */
  public static cnavDeltaNoType fromPerAligned(byte[] encodedBytes) {
    cnavDeltaNoType result = new cnavDeltaNoType();
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
    return "cnavDeltaNoType = " + getInteger() + ";\n";
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
public static class cnavDeltaNoDotType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_cnavDeltaNoDotType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public cnavDeltaNoDotType() {
    super();
    setValueRange(new java.math.BigInteger("-4194304"), new java.math.BigInteger("4194303"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_cnavDeltaNoDotType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_cnavDeltaNoDotType != null) {
      return ImmutableList.of(TAG_cnavDeltaNoDotType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new cnavDeltaNoDotType from encoded stream.
   */
  public static cnavDeltaNoDotType fromPerUnaligned(byte[] encodedBytes) {
    cnavDeltaNoDotType result = new cnavDeltaNoDotType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new cnavDeltaNoDotType from encoded stream.
   */
  public static cnavDeltaNoDotType fromPerAligned(byte[] encodedBytes) {
    cnavDeltaNoDotType result = new cnavDeltaNoDotType();
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
    return "cnavDeltaNoDotType = " + getInteger() + ";\n";
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
public static class cnavMoType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_cnavMoType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public cnavMoType() {
    super();
    setValueRange(new java.math.BigInteger("-4294967296"), new java.math.BigInteger("4294967295"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_cnavMoType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_cnavMoType != null) {
      return ImmutableList.of(TAG_cnavMoType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new cnavMoType from encoded stream.
   */
  public static cnavMoType fromPerUnaligned(byte[] encodedBytes) {
    cnavMoType result = new cnavMoType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new cnavMoType from encoded stream.
   */
  public static cnavMoType fromPerAligned(byte[] encodedBytes) {
    cnavMoType result = new cnavMoType();
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
    return "cnavMoType = " + getInteger() + ";\n";
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
public static class cnavEType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_cnavEType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public cnavEType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("8589934591"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_cnavEType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_cnavEType != null) {
      return ImmutableList.of(TAG_cnavEType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new cnavEType from encoded stream.
   */
  public static cnavEType fromPerUnaligned(byte[] encodedBytes) {
    cnavEType result = new cnavEType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new cnavEType from encoded stream.
   */
  public static cnavEType fromPerAligned(byte[] encodedBytes) {
    cnavEType result = new cnavEType();
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
    return "cnavEType = " + getInteger() + ";\n";
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
public static class cnavOmegaType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_cnavOmegaType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public cnavOmegaType() {
    super();
    setValueRange(new java.math.BigInteger("-4294967296"), new java.math.BigInteger("4294967295"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_cnavOmegaType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_cnavOmegaType != null) {
      return ImmutableList.of(TAG_cnavOmegaType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new cnavOmegaType from encoded stream.
   */
  public static cnavOmegaType fromPerUnaligned(byte[] encodedBytes) {
    cnavOmegaType result = new cnavOmegaType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new cnavOmegaType from encoded stream.
   */
  public static cnavOmegaType fromPerAligned(byte[] encodedBytes) {
    cnavOmegaType result = new cnavOmegaType();
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
    return "cnavOmegaType = " + getInteger() + ";\n";
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
public static class cnavOMEGA0Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_cnavOMEGA0Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public cnavOMEGA0Type() {
    super();
    setValueRange(new java.math.BigInteger("-4294967296"), new java.math.BigInteger("4294967295"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_cnavOMEGA0Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_cnavOMEGA0Type != null) {
      return ImmutableList.of(TAG_cnavOMEGA0Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new cnavOMEGA0Type from encoded stream.
   */
  public static cnavOMEGA0Type fromPerUnaligned(byte[] encodedBytes) {
    cnavOMEGA0Type result = new cnavOMEGA0Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new cnavOMEGA0Type from encoded stream.
   */
  public static cnavOMEGA0Type fromPerAligned(byte[] encodedBytes) {
    cnavOMEGA0Type result = new cnavOMEGA0Type();
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
    return "cnavOMEGA0Type = " + getInteger() + ";\n";
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
public static class cnavDeltaOmegaDotType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_cnavDeltaOmegaDotType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public cnavDeltaOmegaDotType() {
    super();
    setValueRange(new java.math.BigInteger("-65536"), new java.math.BigInteger("65535"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_cnavDeltaOmegaDotType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_cnavDeltaOmegaDotType != null) {
      return ImmutableList.of(TAG_cnavDeltaOmegaDotType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new cnavDeltaOmegaDotType from encoded stream.
   */
  public static cnavDeltaOmegaDotType fromPerUnaligned(byte[] encodedBytes) {
    cnavDeltaOmegaDotType result = new cnavDeltaOmegaDotType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new cnavDeltaOmegaDotType from encoded stream.
   */
  public static cnavDeltaOmegaDotType fromPerAligned(byte[] encodedBytes) {
    cnavDeltaOmegaDotType result = new cnavDeltaOmegaDotType();
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
    return "cnavDeltaOmegaDotType = " + getInteger() + ";\n";
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
public static class cnavIoType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_cnavIoType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public cnavIoType() {
    super();
    setValueRange(new java.math.BigInteger("-4294967296"), new java.math.BigInteger("4294967295"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_cnavIoType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_cnavIoType != null) {
      return ImmutableList.of(TAG_cnavIoType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new cnavIoType from encoded stream.
   */
  public static cnavIoType fromPerUnaligned(byte[] encodedBytes) {
    cnavIoType result = new cnavIoType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new cnavIoType from encoded stream.
   */
  public static cnavIoType fromPerAligned(byte[] encodedBytes) {
    cnavIoType result = new cnavIoType();
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
    return "cnavIoType = " + getInteger() + ";\n";
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
public static class cnavIoDotType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_cnavIoDotType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public cnavIoDotType() {
    super();
    setValueRange(new java.math.BigInteger("-16384"), new java.math.BigInteger("16383"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_cnavIoDotType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_cnavIoDotType != null) {
      return ImmutableList.of(TAG_cnavIoDotType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new cnavIoDotType from encoded stream.
   */
  public static cnavIoDotType fromPerUnaligned(byte[] encodedBytes) {
    cnavIoDotType result = new cnavIoDotType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new cnavIoDotType from encoded stream.
   */
  public static cnavIoDotType fromPerAligned(byte[] encodedBytes) {
    cnavIoDotType result = new cnavIoDotType();
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
    return "cnavIoDotType = " + getInteger() + ";\n";
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
public static class cnavCisType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_cnavCisType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public cnavCisType() {
    super();
    setValueRange(new java.math.BigInteger("-32768"), new java.math.BigInteger("32767"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_cnavCisType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_cnavCisType != null) {
      return ImmutableList.of(TAG_cnavCisType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new cnavCisType from encoded stream.
   */
  public static cnavCisType fromPerUnaligned(byte[] encodedBytes) {
    cnavCisType result = new cnavCisType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new cnavCisType from encoded stream.
   */
  public static cnavCisType fromPerAligned(byte[] encodedBytes) {
    cnavCisType result = new cnavCisType();
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
    return "cnavCisType = " + getInteger() + ";\n";
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
public static class cnavCicType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_cnavCicType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public cnavCicType() {
    super();
    setValueRange(new java.math.BigInteger("-32768"), new java.math.BigInteger("32767"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_cnavCicType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_cnavCicType != null) {
      return ImmutableList.of(TAG_cnavCicType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new cnavCicType from encoded stream.
   */
  public static cnavCicType fromPerUnaligned(byte[] encodedBytes) {
    cnavCicType result = new cnavCicType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new cnavCicType from encoded stream.
   */
  public static cnavCicType fromPerAligned(byte[] encodedBytes) {
    cnavCicType result = new cnavCicType();
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
    return "cnavCicType = " + getInteger() + ";\n";
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
public static class cnavCrsType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_cnavCrsType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public cnavCrsType() {
    super();
    setValueRange(new java.math.BigInteger("-8388608"), new java.math.BigInteger("8388607"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_cnavCrsType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_cnavCrsType != null) {
      return ImmutableList.of(TAG_cnavCrsType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new cnavCrsType from encoded stream.
   */
  public static cnavCrsType fromPerUnaligned(byte[] encodedBytes) {
    cnavCrsType result = new cnavCrsType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new cnavCrsType from encoded stream.
   */
  public static cnavCrsType fromPerAligned(byte[] encodedBytes) {
    cnavCrsType result = new cnavCrsType();
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
    return "cnavCrsType = " + getInteger() + ";\n";
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
public static class cnavCrcType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_cnavCrcType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public cnavCrcType() {
    super();
    setValueRange(new java.math.BigInteger("-8388608"), new java.math.BigInteger("8388607"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_cnavCrcType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_cnavCrcType != null) {
      return ImmutableList.of(TAG_cnavCrcType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new cnavCrcType from encoded stream.
   */
  public static cnavCrcType fromPerUnaligned(byte[] encodedBytes) {
    cnavCrcType result = new cnavCrcType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new cnavCrcType from encoded stream.
   */
  public static cnavCrcType fromPerAligned(byte[] encodedBytes) {
    cnavCrcType result = new cnavCrcType();
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
    return "cnavCrcType = " + getInteger() + ";\n";
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
public static class cnavCusType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_cnavCusType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public cnavCusType() {
    super();
    setValueRange(new java.math.BigInteger("-1048576"), new java.math.BigInteger("1048575"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_cnavCusType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_cnavCusType != null) {
      return ImmutableList.of(TAG_cnavCusType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new cnavCusType from encoded stream.
   */
  public static cnavCusType fromPerUnaligned(byte[] encodedBytes) {
    cnavCusType result = new cnavCusType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new cnavCusType from encoded stream.
   */
  public static cnavCusType fromPerAligned(byte[] encodedBytes) {
    cnavCusType result = new cnavCusType();
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
    return "cnavCusType = " + getInteger() + ";\n";
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
public static class cnavCucType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_cnavCucType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public cnavCucType() {
    super();
    setValueRange(new java.math.BigInteger("-1048576"), new java.math.BigInteger("1048575"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_cnavCucType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_cnavCucType != null) {
      return ImmutableList.of(TAG_cnavCucType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new cnavCucType from encoded stream.
   */
  public static cnavCucType fromPerUnaligned(byte[] encodedBytes) {
    cnavCucType result = new cnavCucType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new cnavCucType from encoded stream.
   */
  public static cnavCucType fromPerAligned(byte[] encodedBytes) {
    cnavCucType result = new cnavCucType();
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
    return "cnavCucType = " + getInteger() + ";\n";
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
    builder.append("NavModelCNAV_KeplerianSet = {\n");
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
