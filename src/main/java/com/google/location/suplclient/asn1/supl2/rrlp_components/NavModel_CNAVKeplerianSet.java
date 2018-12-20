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
public  class NavModel_CNAVKeplerianSet extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_NavModel_CNAVKeplerianSet
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public NavModel_CNAVKeplerianSet() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_NavModel_CNAVKeplerianSet;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_NavModel_CNAVKeplerianSet != null) {
      return ImmutableList.of(TAG_NavModel_CNAVKeplerianSet);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new NavModel_CNAVKeplerianSet from encoded stream.
   */
  public static NavModel_CNAVKeplerianSet fromPerUnaligned(byte[] encodedBytes) {
    NavModel_CNAVKeplerianSet result = new NavModel_CNAVKeplerianSet();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new NavModel_CNAVKeplerianSet from encoded stream.
   */
  public static NavModel_CNAVKeplerianSet fromPerAligned(byte[] encodedBytes) {
    NavModel_CNAVKeplerianSet result = new NavModel_CNAVKeplerianSet();
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

  
  private NavModel_CNAVKeplerianSet.cnavTopType cnavTop_;
  public NavModel_CNAVKeplerianSet.cnavTopType getCnavTop() {
    return cnavTop_;
  }
  /**
   * @throws ClassCastException if value is not a NavModel_CNAVKeplerianSet.cnavTopType
   */
  public void setCnavTop(Asn1Object value) {
    this.cnavTop_ = (NavModel_CNAVKeplerianSet.cnavTopType) value;
  }
  public NavModel_CNAVKeplerianSet.cnavTopType setCnavTopToNewInstance() {
    cnavTop_ = new NavModel_CNAVKeplerianSet.cnavTopType();
    return cnavTop_;
  }
  
  private NavModel_CNAVKeplerianSet.cnavURAindexType cnavURAindex_;
  public NavModel_CNAVKeplerianSet.cnavURAindexType getCnavURAindex() {
    return cnavURAindex_;
  }
  /**
   * @throws ClassCastException if value is not a NavModel_CNAVKeplerianSet.cnavURAindexType
   */
  public void setCnavURAindex(Asn1Object value) {
    this.cnavURAindex_ = (NavModel_CNAVKeplerianSet.cnavURAindexType) value;
  }
  public NavModel_CNAVKeplerianSet.cnavURAindexType setCnavURAindexToNewInstance() {
    cnavURAindex_ = new NavModel_CNAVKeplerianSet.cnavURAindexType();
    return cnavURAindex_;
  }
  
  private NavModel_CNAVKeplerianSet.cnavDeltaAType cnavDeltaA_;
  public NavModel_CNAVKeplerianSet.cnavDeltaAType getCnavDeltaA() {
    return cnavDeltaA_;
  }
  /**
   * @throws ClassCastException if value is not a NavModel_CNAVKeplerianSet.cnavDeltaAType
   */
  public void setCnavDeltaA(Asn1Object value) {
    this.cnavDeltaA_ = (NavModel_CNAVKeplerianSet.cnavDeltaAType) value;
  }
  public NavModel_CNAVKeplerianSet.cnavDeltaAType setCnavDeltaAToNewInstance() {
    cnavDeltaA_ = new NavModel_CNAVKeplerianSet.cnavDeltaAType();
    return cnavDeltaA_;
  }
  
  private NavModel_CNAVKeplerianSet.cnavAdotType cnavAdot_;
  public NavModel_CNAVKeplerianSet.cnavAdotType getCnavAdot() {
    return cnavAdot_;
  }
  /**
   * @throws ClassCastException if value is not a NavModel_CNAVKeplerianSet.cnavAdotType
   */
  public void setCnavAdot(Asn1Object value) {
    this.cnavAdot_ = (NavModel_CNAVKeplerianSet.cnavAdotType) value;
  }
  public NavModel_CNAVKeplerianSet.cnavAdotType setCnavAdotToNewInstance() {
    cnavAdot_ = new NavModel_CNAVKeplerianSet.cnavAdotType();
    return cnavAdot_;
  }
  
  private NavModel_CNAVKeplerianSet.cnavDeltaNoType cnavDeltaNo_;
  public NavModel_CNAVKeplerianSet.cnavDeltaNoType getCnavDeltaNo() {
    return cnavDeltaNo_;
  }
  /**
   * @throws ClassCastException if value is not a NavModel_CNAVKeplerianSet.cnavDeltaNoType
   */
  public void setCnavDeltaNo(Asn1Object value) {
    this.cnavDeltaNo_ = (NavModel_CNAVKeplerianSet.cnavDeltaNoType) value;
  }
  public NavModel_CNAVKeplerianSet.cnavDeltaNoType setCnavDeltaNoToNewInstance() {
    cnavDeltaNo_ = new NavModel_CNAVKeplerianSet.cnavDeltaNoType();
    return cnavDeltaNo_;
  }
  
  private NavModel_CNAVKeplerianSet.cnavDeltaNoDotType cnavDeltaNoDot_;
  public NavModel_CNAVKeplerianSet.cnavDeltaNoDotType getCnavDeltaNoDot() {
    return cnavDeltaNoDot_;
  }
  /**
   * @throws ClassCastException if value is not a NavModel_CNAVKeplerianSet.cnavDeltaNoDotType
   */
  public void setCnavDeltaNoDot(Asn1Object value) {
    this.cnavDeltaNoDot_ = (NavModel_CNAVKeplerianSet.cnavDeltaNoDotType) value;
  }
  public NavModel_CNAVKeplerianSet.cnavDeltaNoDotType setCnavDeltaNoDotToNewInstance() {
    cnavDeltaNoDot_ = new NavModel_CNAVKeplerianSet.cnavDeltaNoDotType();
    return cnavDeltaNoDot_;
  }
  
  private NavModel_CNAVKeplerianSet.cnavMoType cnavMo_;
  public NavModel_CNAVKeplerianSet.cnavMoType getCnavMo() {
    return cnavMo_;
  }
  /**
   * @throws ClassCastException if value is not a NavModel_CNAVKeplerianSet.cnavMoType
   */
  public void setCnavMo(Asn1Object value) {
    this.cnavMo_ = (NavModel_CNAVKeplerianSet.cnavMoType) value;
  }
  public NavModel_CNAVKeplerianSet.cnavMoType setCnavMoToNewInstance() {
    cnavMo_ = new NavModel_CNAVKeplerianSet.cnavMoType();
    return cnavMo_;
  }
  
  private NavModel_CNAVKeplerianSet.cnavEType cnavE_;
  public NavModel_CNAVKeplerianSet.cnavEType getCnavE() {
    return cnavE_;
  }
  /**
   * @throws ClassCastException if value is not a NavModel_CNAVKeplerianSet.cnavEType
   */
  public void setCnavE(Asn1Object value) {
    this.cnavE_ = (NavModel_CNAVKeplerianSet.cnavEType) value;
  }
  public NavModel_CNAVKeplerianSet.cnavEType setCnavEToNewInstance() {
    cnavE_ = new NavModel_CNAVKeplerianSet.cnavEType();
    return cnavE_;
  }
  
  private NavModel_CNAVKeplerianSet.cnavOmegaType cnavOmega_;
  public NavModel_CNAVKeplerianSet.cnavOmegaType getCnavOmega() {
    return cnavOmega_;
  }
  /**
   * @throws ClassCastException if value is not a NavModel_CNAVKeplerianSet.cnavOmegaType
   */
  public void setCnavOmega(Asn1Object value) {
    this.cnavOmega_ = (NavModel_CNAVKeplerianSet.cnavOmegaType) value;
  }
  public NavModel_CNAVKeplerianSet.cnavOmegaType setCnavOmegaToNewInstance() {
    cnavOmega_ = new NavModel_CNAVKeplerianSet.cnavOmegaType();
    return cnavOmega_;
  }
  
  private NavModel_CNAVKeplerianSet.cnavOMEGA0Type cnavOMEGA0_;
  public NavModel_CNAVKeplerianSet.cnavOMEGA0Type getCnavOMEGA0() {
    return cnavOMEGA0_;
  }
  /**
   * @throws ClassCastException if value is not a NavModel_CNAVKeplerianSet.cnavOMEGA0Type
   */
  public void setCnavOMEGA0(Asn1Object value) {
    this.cnavOMEGA0_ = (NavModel_CNAVKeplerianSet.cnavOMEGA0Type) value;
  }
  public NavModel_CNAVKeplerianSet.cnavOMEGA0Type setCnavOMEGA0ToNewInstance() {
    cnavOMEGA0_ = new NavModel_CNAVKeplerianSet.cnavOMEGA0Type();
    return cnavOMEGA0_;
  }
  
  private NavModel_CNAVKeplerianSet.cnavDeltaOmegaDotType cnavDeltaOmegaDot_;
  public NavModel_CNAVKeplerianSet.cnavDeltaOmegaDotType getCnavDeltaOmegaDot() {
    return cnavDeltaOmegaDot_;
  }
  /**
   * @throws ClassCastException if value is not a NavModel_CNAVKeplerianSet.cnavDeltaOmegaDotType
   */
  public void setCnavDeltaOmegaDot(Asn1Object value) {
    this.cnavDeltaOmegaDot_ = (NavModel_CNAVKeplerianSet.cnavDeltaOmegaDotType) value;
  }
  public NavModel_CNAVKeplerianSet.cnavDeltaOmegaDotType setCnavDeltaOmegaDotToNewInstance() {
    cnavDeltaOmegaDot_ = new NavModel_CNAVKeplerianSet.cnavDeltaOmegaDotType();
    return cnavDeltaOmegaDot_;
  }
  
  private NavModel_CNAVKeplerianSet.cnavIoType cnavIo_;
  public NavModel_CNAVKeplerianSet.cnavIoType getCnavIo() {
    return cnavIo_;
  }
  /**
   * @throws ClassCastException if value is not a NavModel_CNAVKeplerianSet.cnavIoType
   */
  public void setCnavIo(Asn1Object value) {
    this.cnavIo_ = (NavModel_CNAVKeplerianSet.cnavIoType) value;
  }
  public NavModel_CNAVKeplerianSet.cnavIoType setCnavIoToNewInstance() {
    cnavIo_ = new NavModel_CNAVKeplerianSet.cnavIoType();
    return cnavIo_;
  }
  
  private NavModel_CNAVKeplerianSet.cnavIoDotType cnavIoDot_;
  public NavModel_CNAVKeplerianSet.cnavIoDotType getCnavIoDot() {
    return cnavIoDot_;
  }
  /**
   * @throws ClassCastException if value is not a NavModel_CNAVKeplerianSet.cnavIoDotType
   */
  public void setCnavIoDot(Asn1Object value) {
    this.cnavIoDot_ = (NavModel_CNAVKeplerianSet.cnavIoDotType) value;
  }
  public NavModel_CNAVKeplerianSet.cnavIoDotType setCnavIoDotToNewInstance() {
    cnavIoDot_ = new NavModel_CNAVKeplerianSet.cnavIoDotType();
    return cnavIoDot_;
  }
  
  private NavModel_CNAVKeplerianSet.cnavCisType cnavCis_;
  public NavModel_CNAVKeplerianSet.cnavCisType getCnavCis() {
    return cnavCis_;
  }
  /**
   * @throws ClassCastException if value is not a NavModel_CNAVKeplerianSet.cnavCisType
   */
  public void setCnavCis(Asn1Object value) {
    this.cnavCis_ = (NavModel_CNAVKeplerianSet.cnavCisType) value;
  }
  public NavModel_CNAVKeplerianSet.cnavCisType setCnavCisToNewInstance() {
    cnavCis_ = new NavModel_CNAVKeplerianSet.cnavCisType();
    return cnavCis_;
  }
  
  private NavModel_CNAVKeplerianSet.cnavCicType cnavCic_;
  public NavModel_CNAVKeplerianSet.cnavCicType getCnavCic() {
    return cnavCic_;
  }
  /**
   * @throws ClassCastException if value is not a NavModel_CNAVKeplerianSet.cnavCicType
   */
  public void setCnavCic(Asn1Object value) {
    this.cnavCic_ = (NavModel_CNAVKeplerianSet.cnavCicType) value;
  }
  public NavModel_CNAVKeplerianSet.cnavCicType setCnavCicToNewInstance() {
    cnavCic_ = new NavModel_CNAVKeplerianSet.cnavCicType();
    return cnavCic_;
  }
  
  private NavModel_CNAVKeplerianSet.cnavCrsType cnavCrs_;
  public NavModel_CNAVKeplerianSet.cnavCrsType getCnavCrs() {
    return cnavCrs_;
  }
  /**
   * @throws ClassCastException if value is not a NavModel_CNAVKeplerianSet.cnavCrsType
   */
  public void setCnavCrs(Asn1Object value) {
    this.cnavCrs_ = (NavModel_CNAVKeplerianSet.cnavCrsType) value;
  }
  public NavModel_CNAVKeplerianSet.cnavCrsType setCnavCrsToNewInstance() {
    cnavCrs_ = new NavModel_CNAVKeplerianSet.cnavCrsType();
    return cnavCrs_;
  }
  
  private NavModel_CNAVKeplerianSet.cnavCrcType cnavCrc_;
  public NavModel_CNAVKeplerianSet.cnavCrcType getCnavCrc() {
    return cnavCrc_;
  }
  /**
   * @throws ClassCastException if value is not a NavModel_CNAVKeplerianSet.cnavCrcType
   */
  public void setCnavCrc(Asn1Object value) {
    this.cnavCrc_ = (NavModel_CNAVKeplerianSet.cnavCrcType) value;
  }
  public NavModel_CNAVKeplerianSet.cnavCrcType setCnavCrcToNewInstance() {
    cnavCrc_ = new NavModel_CNAVKeplerianSet.cnavCrcType();
    return cnavCrc_;
  }
  
  private NavModel_CNAVKeplerianSet.cnavCusType cnavCus_;
  public NavModel_CNAVKeplerianSet.cnavCusType getCnavCus() {
    return cnavCus_;
  }
  /**
   * @throws ClassCastException if value is not a NavModel_CNAVKeplerianSet.cnavCusType
   */
  public void setCnavCus(Asn1Object value) {
    this.cnavCus_ = (NavModel_CNAVKeplerianSet.cnavCusType) value;
  }
  public NavModel_CNAVKeplerianSet.cnavCusType setCnavCusToNewInstance() {
    cnavCus_ = new NavModel_CNAVKeplerianSet.cnavCusType();
    return cnavCus_;
  }
  
  private NavModel_CNAVKeplerianSet.cnavCucType cnavCuc_;
  public NavModel_CNAVKeplerianSet.cnavCucType getCnavCuc() {
    return cnavCuc_;
  }
  /**
   * @throws ClassCastException if value is not a NavModel_CNAVKeplerianSet.cnavCucType
   */
  public void setCnavCuc(Asn1Object value) {
    this.cnavCuc_ = (NavModel_CNAVKeplerianSet.cnavCucType) value;
  }
  public NavModel_CNAVKeplerianSet.cnavCucType setCnavCucToNewInstance() {
    cnavCuc_ = new NavModel_CNAVKeplerianSet.cnavCucType();
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
            return tag == null ? NavModel_CNAVKeplerianSet.cnavTopType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? NavModel_CNAVKeplerianSet.cnavURAindexType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? NavModel_CNAVKeplerianSet.cnavDeltaAType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? NavModel_CNAVKeplerianSet.cnavAdotType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? NavModel_CNAVKeplerianSet.cnavDeltaNoType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? NavModel_CNAVKeplerianSet.cnavDeltaNoDotType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? NavModel_CNAVKeplerianSet.cnavMoType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? NavModel_CNAVKeplerianSet.cnavEType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? NavModel_CNAVKeplerianSet.cnavOmegaType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? NavModel_CNAVKeplerianSet.cnavOMEGA0Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? NavModel_CNAVKeplerianSet.cnavDeltaOmegaDotType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? NavModel_CNAVKeplerianSet.cnavIoType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? NavModel_CNAVKeplerianSet.cnavIoDotType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? NavModel_CNAVKeplerianSet.cnavCisType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? NavModel_CNAVKeplerianSet.cnavCicType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? NavModel_CNAVKeplerianSet.cnavCrsType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? NavModel_CNAVKeplerianSet.cnavCrcType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? NavModel_CNAVKeplerianSet.cnavCusType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? NavModel_CNAVKeplerianSet.cnavCucType.getPossibleFirstTags() : ImmutableList.of(tag);
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
    builder.append("NavModel_CNAVKeplerianSet = {\n");
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
