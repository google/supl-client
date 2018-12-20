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
public  class Almanac_GlonassAlmanacSet extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_Almanac_GlonassAlmanacSet
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public Almanac_GlonassAlmanacSet() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_Almanac_GlonassAlmanacSet;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_Almanac_GlonassAlmanacSet != null) {
      return ImmutableList.of(TAG_Almanac_GlonassAlmanacSet);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new Almanac_GlonassAlmanacSet from encoded stream.
   */
  public static Almanac_GlonassAlmanacSet fromPerUnaligned(byte[] encodedBytes) {
    Almanac_GlonassAlmanacSet result = new Almanac_GlonassAlmanacSet();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new Almanac_GlonassAlmanacSet from encoded stream.
   */
  public static Almanac_GlonassAlmanacSet fromPerAligned(byte[] encodedBytes) {
    Almanac_GlonassAlmanacSet result = new Almanac_GlonassAlmanacSet();
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

  
  private Almanac_GlonassAlmanacSet.gloAlmNAType gloAlmNA_;
  public Almanac_GlonassAlmanacSet.gloAlmNAType getGloAlmNA() {
    return gloAlmNA_;
  }
  /**
   * @throws ClassCastException if value is not a Almanac_GlonassAlmanacSet.gloAlmNAType
   */
  public void setGloAlmNA(Asn1Object value) {
    this.gloAlmNA_ = (Almanac_GlonassAlmanacSet.gloAlmNAType) value;
  }
  public Almanac_GlonassAlmanacSet.gloAlmNAType setGloAlmNAToNewInstance() {
    gloAlmNA_ = new Almanac_GlonassAlmanacSet.gloAlmNAType();
    return gloAlmNA_;
  }
  
  private Almanac_GlonassAlmanacSet.gloAlmnAType gloAlmnA_;
  public Almanac_GlonassAlmanacSet.gloAlmnAType getGloAlmnA() {
    return gloAlmnA_;
  }
  /**
   * @throws ClassCastException if value is not a Almanac_GlonassAlmanacSet.gloAlmnAType
   */
  public void setGloAlmnA(Asn1Object value) {
    this.gloAlmnA_ = (Almanac_GlonassAlmanacSet.gloAlmnAType) value;
  }
  public Almanac_GlonassAlmanacSet.gloAlmnAType setGloAlmnAToNewInstance() {
    gloAlmnA_ = new Almanac_GlonassAlmanacSet.gloAlmnAType();
    return gloAlmnA_;
  }
  
  private Almanac_GlonassAlmanacSet.gloAlmHAType gloAlmHA_;
  public Almanac_GlonassAlmanacSet.gloAlmHAType getGloAlmHA() {
    return gloAlmHA_;
  }
  /**
   * @throws ClassCastException if value is not a Almanac_GlonassAlmanacSet.gloAlmHAType
   */
  public void setGloAlmHA(Asn1Object value) {
    this.gloAlmHA_ = (Almanac_GlonassAlmanacSet.gloAlmHAType) value;
  }
  public Almanac_GlonassAlmanacSet.gloAlmHAType setGloAlmHAToNewInstance() {
    gloAlmHA_ = new Almanac_GlonassAlmanacSet.gloAlmHAType();
    return gloAlmHA_;
  }
  
  private Almanac_GlonassAlmanacSet.gloAlmLambdaAType gloAlmLambdaA_;
  public Almanac_GlonassAlmanacSet.gloAlmLambdaAType getGloAlmLambdaA() {
    return gloAlmLambdaA_;
  }
  /**
   * @throws ClassCastException if value is not a Almanac_GlonassAlmanacSet.gloAlmLambdaAType
   */
  public void setGloAlmLambdaA(Asn1Object value) {
    this.gloAlmLambdaA_ = (Almanac_GlonassAlmanacSet.gloAlmLambdaAType) value;
  }
  public Almanac_GlonassAlmanacSet.gloAlmLambdaAType setGloAlmLambdaAToNewInstance() {
    gloAlmLambdaA_ = new Almanac_GlonassAlmanacSet.gloAlmLambdaAType();
    return gloAlmLambdaA_;
  }
  
  private Almanac_GlonassAlmanacSet.gloAlmtlambdaAType gloAlmtlambdaA_;
  public Almanac_GlonassAlmanacSet.gloAlmtlambdaAType getGloAlmtlambdaA() {
    return gloAlmtlambdaA_;
  }
  /**
   * @throws ClassCastException if value is not a Almanac_GlonassAlmanacSet.gloAlmtlambdaAType
   */
  public void setGloAlmtlambdaA(Asn1Object value) {
    this.gloAlmtlambdaA_ = (Almanac_GlonassAlmanacSet.gloAlmtlambdaAType) value;
  }
  public Almanac_GlonassAlmanacSet.gloAlmtlambdaAType setGloAlmtlambdaAToNewInstance() {
    gloAlmtlambdaA_ = new Almanac_GlonassAlmanacSet.gloAlmtlambdaAType();
    return gloAlmtlambdaA_;
  }
  
  private Almanac_GlonassAlmanacSet.gloAlmDeltaIaType gloAlmDeltaIa_;
  public Almanac_GlonassAlmanacSet.gloAlmDeltaIaType getGloAlmDeltaIa() {
    return gloAlmDeltaIa_;
  }
  /**
   * @throws ClassCastException if value is not a Almanac_GlonassAlmanacSet.gloAlmDeltaIaType
   */
  public void setGloAlmDeltaIa(Asn1Object value) {
    this.gloAlmDeltaIa_ = (Almanac_GlonassAlmanacSet.gloAlmDeltaIaType) value;
  }
  public Almanac_GlonassAlmanacSet.gloAlmDeltaIaType setGloAlmDeltaIaToNewInstance() {
    gloAlmDeltaIa_ = new Almanac_GlonassAlmanacSet.gloAlmDeltaIaType();
    return gloAlmDeltaIa_;
  }
  
  private Almanac_GlonassAlmanacSet.gloAlmDeltaTAType gloAlmDeltaTA_;
  public Almanac_GlonassAlmanacSet.gloAlmDeltaTAType getGloAlmDeltaTA() {
    return gloAlmDeltaTA_;
  }
  /**
   * @throws ClassCastException if value is not a Almanac_GlonassAlmanacSet.gloAlmDeltaTAType
   */
  public void setGloAlmDeltaTA(Asn1Object value) {
    this.gloAlmDeltaTA_ = (Almanac_GlonassAlmanacSet.gloAlmDeltaTAType) value;
  }
  public Almanac_GlonassAlmanacSet.gloAlmDeltaTAType setGloAlmDeltaTAToNewInstance() {
    gloAlmDeltaTA_ = new Almanac_GlonassAlmanacSet.gloAlmDeltaTAType();
    return gloAlmDeltaTA_;
  }
  
  private Almanac_GlonassAlmanacSet.gloAlmDeltaTdotAType gloAlmDeltaTdotA_;
  public Almanac_GlonassAlmanacSet.gloAlmDeltaTdotAType getGloAlmDeltaTdotA() {
    return gloAlmDeltaTdotA_;
  }
  /**
   * @throws ClassCastException if value is not a Almanac_GlonassAlmanacSet.gloAlmDeltaTdotAType
   */
  public void setGloAlmDeltaTdotA(Asn1Object value) {
    this.gloAlmDeltaTdotA_ = (Almanac_GlonassAlmanacSet.gloAlmDeltaTdotAType) value;
  }
  public Almanac_GlonassAlmanacSet.gloAlmDeltaTdotAType setGloAlmDeltaTdotAToNewInstance() {
    gloAlmDeltaTdotA_ = new Almanac_GlonassAlmanacSet.gloAlmDeltaTdotAType();
    return gloAlmDeltaTdotA_;
  }
  
  private Almanac_GlonassAlmanacSet.gloAlmEpsilonAType gloAlmEpsilonA_;
  public Almanac_GlonassAlmanacSet.gloAlmEpsilonAType getGloAlmEpsilonA() {
    return gloAlmEpsilonA_;
  }
  /**
   * @throws ClassCastException if value is not a Almanac_GlonassAlmanacSet.gloAlmEpsilonAType
   */
  public void setGloAlmEpsilonA(Asn1Object value) {
    this.gloAlmEpsilonA_ = (Almanac_GlonassAlmanacSet.gloAlmEpsilonAType) value;
  }
  public Almanac_GlonassAlmanacSet.gloAlmEpsilonAType setGloAlmEpsilonAToNewInstance() {
    gloAlmEpsilonA_ = new Almanac_GlonassAlmanacSet.gloAlmEpsilonAType();
    return gloAlmEpsilonA_;
  }
  
  private Almanac_GlonassAlmanacSet.gloAlmOmegaAType gloAlmOmegaA_;
  public Almanac_GlonassAlmanacSet.gloAlmOmegaAType getGloAlmOmegaA() {
    return gloAlmOmegaA_;
  }
  /**
   * @throws ClassCastException if value is not a Almanac_GlonassAlmanacSet.gloAlmOmegaAType
   */
  public void setGloAlmOmegaA(Asn1Object value) {
    this.gloAlmOmegaA_ = (Almanac_GlonassAlmanacSet.gloAlmOmegaAType) value;
  }
  public Almanac_GlonassAlmanacSet.gloAlmOmegaAType setGloAlmOmegaAToNewInstance() {
    gloAlmOmegaA_ = new Almanac_GlonassAlmanacSet.gloAlmOmegaAType();
    return gloAlmOmegaA_;
  }
  
  private Almanac_GlonassAlmanacSet.gloAlmTauAType gloAlmTauA_;
  public Almanac_GlonassAlmanacSet.gloAlmTauAType getGloAlmTauA() {
    return gloAlmTauA_;
  }
  /**
   * @throws ClassCastException if value is not a Almanac_GlonassAlmanacSet.gloAlmTauAType
   */
  public void setGloAlmTauA(Asn1Object value) {
    this.gloAlmTauA_ = (Almanac_GlonassAlmanacSet.gloAlmTauAType) value;
  }
  public Almanac_GlonassAlmanacSet.gloAlmTauAType setGloAlmTauAToNewInstance() {
    gloAlmTauA_ = new Almanac_GlonassAlmanacSet.gloAlmTauAType();
    return gloAlmTauA_;
  }
  
  private Almanac_GlonassAlmanacSet.gloAlmCAType gloAlmCA_;
  public Almanac_GlonassAlmanacSet.gloAlmCAType getGloAlmCA() {
    return gloAlmCA_;
  }
  /**
   * @throws ClassCastException if value is not a Almanac_GlonassAlmanacSet.gloAlmCAType
   */
  public void setGloAlmCA(Asn1Object value) {
    this.gloAlmCA_ = (Almanac_GlonassAlmanacSet.gloAlmCAType) value;
  }
  public Almanac_GlonassAlmanacSet.gloAlmCAType setGloAlmCAToNewInstance() {
    gloAlmCA_ = new Almanac_GlonassAlmanacSet.gloAlmCAType();
    return gloAlmCA_;
  }
  
  private Almanac_GlonassAlmanacSet.gloAlmMAType gloAlmMA_;
  public Almanac_GlonassAlmanacSet.gloAlmMAType getGloAlmMA() {
    return gloAlmMA_;
  }
  /**
   * @throws ClassCastException if value is not a Almanac_GlonassAlmanacSet.gloAlmMAType
   */
  public void setGloAlmMA(Asn1Object value) {
    this.gloAlmMA_ = (Almanac_GlonassAlmanacSet.gloAlmMAType) value;
  }
  public Almanac_GlonassAlmanacSet.gloAlmMAType setGloAlmMAToNewInstance() {
    gloAlmMA_ = new Almanac_GlonassAlmanacSet.gloAlmMAType();
    return gloAlmMA_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getGloAlmNA() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGloAlmNA();
          }

          @Override public void setToNewInstance() {
            setGloAlmNAToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Almanac_GlonassAlmanacSet.gloAlmNAType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gloAlmNA : "
                    + getGloAlmNA().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getGloAlmnA() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGloAlmnA();
          }

          @Override public void setToNewInstance() {
            setGloAlmnAToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Almanac_GlonassAlmanacSet.gloAlmnAType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gloAlmnA : "
                    + getGloAlmnA().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getGloAlmHA() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGloAlmHA();
          }

          @Override public void setToNewInstance() {
            setGloAlmHAToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Almanac_GlonassAlmanacSet.gloAlmHAType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gloAlmHA : "
                    + getGloAlmHA().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getGloAlmLambdaA() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGloAlmLambdaA();
          }

          @Override public void setToNewInstance() {
            setGloAlmLambdaAToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Almanac_GlonassAlmanacSet.gloAlmLambdaAType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gloAlmLambdaA : "
                    + getGloAlmLambdaA().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getGloAlmtlambdaA() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGloAlmtlambdaA();
          }

          @Override public void setToNewInstance() {
            setGloAlmtlambdaAToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Almanac_GlonassAlmanacSet.gloAlmtlambdaAType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gloAlmtlambdaA : "
                    + getGloAlmtlambdaA().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getGloAlmDeltaIa() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGloAlmDeltaIa();
          }

          @Override public void setToNewInstance() {
            setGloAlmDeltaIaToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Almanac_GlonassAlmanacSet.gloAlmDeltaIaType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gloAlmDeltaIa : "
                    + getGloAlmDeltaIa().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getGloAlmDeltaTA() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGloAlmDeltaTA();
          }

          @Override public void setToNewInstance() {
            setGloAlmDeltaTAToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Almanac_GlonassAlmanacSet.gloAlmDeltaTAType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gloAlmDeltaTA : "
                    + getGloAlmDeltaTA().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 7);

          @Override public boolean isExplicitlySet() {
            return getGloAlmDeltaTdotA() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGloAlmDeltaTdotA();
          }

          @Override public void setToNewInstance() {
            setGloAlmDeltaTdotAToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Almanac_GlonassAlmanacSet.gloAlmDeltaTdotAType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gloAlmDeltaTdotA : "
                    + getGloAlmDeltaTdotA().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 8);

          @Override public boolean isExplicitlySet() {
            return getGloAlmEpsilonA() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGloAlmEpsilonA();
          }

          @Override public void setToNewInstance() {
            setGloAlmEpsilonAToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Almanac_GlonassAlmanacSet.gloAlmEpsilonAType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gloAlmEpsilonA : "
                    + getGloAlmEpsilonA().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 9);

          @Override public boolean isExplicitlySet() {
            return getGloAlmOmegaA() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGloAlmOmegaA();
          }

          @Override public void setToNewInstance() {
            setGloAlmOmegaAToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Almanac_GlonassAlmanacSet.gloAlmOmegaAType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gloAlmOmegaA : "
                    + getGloAlmOmegaA().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 10);

          @Override public boolean isExplicitlySet() {
            return getGloAlmTauA() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGloAlmTauA();
          }

          @Override public void setToNewInstance() {
            setGloAlmTauAToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Almanac_GlonassAlmanacSet.gloAlmTauAType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gloAlmTauA : "
                    + getGloAlmTauA().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 11);

          @Override public boolean isExplicitlySet() {
            return getGloAlmCA() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGloAlmCA();
          }

          @Override public void setToNewInstance() {
            setGloAlmCAToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Almanac_GlonassAlmanacSet.gloAlmCAType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gloAlmCA : "
                    + getGloAlmCA().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 12);

          @Override public boolean isExplicitlySet() {
            return getGloAlmMA() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGloAlmMA();
          }

          @Override public void setToNewInstance() {
            setGloAlmMAToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Almanac_GlonassAlmanacSet.gloAlmMAType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gloAlmMA : "
                    + getGloAlmMA().toIndentedString(indent);
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
public static class gloAlmNAType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_gloAlmNAType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gloAlmNAType() {
    super();
    setValueRange(new java.math.BigInteger("1"), new java.math.BigInteger("1461"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gloAlmNAType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gloAlmNAType != null) {
      return ImmutableList.of(TAG_gloAlmNAType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gloAlmNAType from encoded stream.
   */
  public static gloAlmNAType fromPerUnaligned(byte[] encodedBytes) {
    gloAlmNAType result = new gloAlmNAType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gloAlmNAType from encoded stream.
   */
  public static gloAlmNAType fromPerAligned(byte[] encodedBytes) {
    gloAlmNAType result = new gloAlmNAType();
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
    return "gloAlmNAType = " + getInteger() + ";\n";
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
public static class gloAlmnAType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_gloAlmnAType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gloAlmnAType() {
    super();
    setValueRange(new java.math.BigInteger("1"), new java.math.BigInteger("24"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gloAlmnAType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gloAlmnAType != null) {
      return ImmutableList.of(TAG_gloAlmnAType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gloAlmnAType from encoded stream.
   */
  public static gloAlmnAType fromPerUnaligned(byte[] encodedBytes) {
    gloAlmnAType result = new gloAlmnAType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gloAlmnAType from encoded stream.
   */
  public static gloAlmnAType fromPerAligned(byte[] encodedBytes) {
    gloAlmnAType result = new gloAlmnAType();
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
    return "gloAlmnAType = " + getInteger() + ";\n";
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
public static class gloAlmHAType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_gloAlmHAType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gloAlmHAType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("31"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gloAlmHAType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gloAlmHAType != null) {
      return ImmutableList.of(TAG_gloAlmHAType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gloAlmHAType from encoded stream.
   */
  public static gloAlmHAType fromPerUnaligned(byte[] encodedBytes) {
    gloAlmHAType result = new gloAlmHAType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gloAlmHAType from encoded stream.
   */
  public static gloAlmHAType fromPerAligned(byte[] encodedBytes) {
    gloAlmHAType result = new gloAlmHAType();
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
    return "gloAlmHAType = " + getInteger() + ";\n";
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
public static class gloAlmLambdaAType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_gloAlmLambdaAType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gloAlmLambdaAType() {
    super();
    setValueRange(new java.math.BigInteger("-1048576"), new java.math.BigInteger("1048575"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gloAlmLambdaAType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gloAlmLambdaAType != null) {
      return ImmutableList.of(TAG_gloAlmLambdaAType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gloAlmLambdaAType from encoded stream.
   */
  public static gloAlmLambdaAType fromPerUnaligned(byte[] encodedBytes) {
    gloAlmLambdaAType result = new gloAlmLambdaAType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gloAlmLambdaAType from encoded stream.
   */
  public static gloAlmLambdaAType fromPerAligned(byte[] encodedBytes) {
    gloAlmLambdaAType result = new gloAlmLambdaAType();
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
    return "gloAlmLambdaAType = " + getInteger() + ";\n";
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
public static class gloAlmtlambdaAType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_gloAlmtlambdaAType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gloAlmtlambdaAType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("2097151"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gloAlmtlambdaAType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gloAlmtlambdaAType != null) {
      return ImmutableList.of(TAG_gloAlmtlambdaAType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gloAlmtlambdaAType from encoded stream.
   */
  public static gloAlmtlambdaAType fromPerUnaligned(byte[] encodedBytes) {
    gloAlmtlambdaAType result = new gloAlmtlambdaAType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gloAlmtlambdaAType from encoded stream.
   */
  public static gloAlmtlambdaAType fromPerAligned(byte[] encodedBytes) {
    gloAlmtlambdaAType result = new gloAlmtlambdaAType();
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
    return "gloAlmtlambdaAType = " + getInteger() + ";\n";
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
public static class gloAlmDeltaIaType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_gloAlmDeltaIaType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gloAlmDeltaIaType() {
    super();
    setValueRange(new java.math.BigInteger("-131072"), new java.math.BigInteger("131071"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gloAlmDeltaIaType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gloAlmDeltaIaType != null) {
      return ImmutableList.of(TAG_gloAlmDeltaIaType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gloAlmDeltaIaType from encoded stream.
   */
  public static gloAlmDeltaIaType fromPerUnaligned(byte[] encodedBytes) {
    gloAlmDeltaIaType result = new gloAlmDeltaIaType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gloAlmDeltaIaType from encoded stream.
   */
  public static gloAlmDeltaIaType fromPerAligned(byte[] encodedBytes) {
    gloAlmDeltaIaType result = new gloAlmDeltaIaType();
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
    return "gloAlmDeltaIaType = " + getInteger() + ";\n";
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
public static class gloAlmDeltaTAType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_gloAlmDeltaTAType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gloAlmDeltaTAType() {
    super();
    setValueRange(new java.math.BigInteger("-2097152"), new java.math.BigInteger("2097151"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gloAlmDeltaTAType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gloAlmDeltaTAType != null) {
      return ImmutableList.of(TAG_gloAlmDeltaTAType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gloAlmDeltaTAType from encoded stream.
   */
  public static gloAlmDeltaTAType fromPerUnaligned(byte[] encodedBytes) {
    gloAlmDeltaTAType result = new gloAlmDeltaTAType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gloAlmDeltaTAType from encoded stream.
   */
  public static gloAlmDeltaTAType fromPerAligned(byte[] encodedBytes) {
    gloAlmDeltaTAType result = new gloAlmDeltaTAType();
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
    return "gloAlmDeltaTAType = " + getInteger() + ";\n";
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
public static class gloAlmDeltaTdotAType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_gloAlmDeltaTdotAType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gloAlmDeltaTdotAType() {
    super();
    setValueRange(new java.math.BigInteger("-64"), new java.math.BigInteger("63"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gloAlmDeltaTdotAType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gloAlmDeltaTdotAType != null) {
      return ImmutableList.of(TAG_gloAlmDeltaTdotAType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gloAlmDeltaTdotAType from encoded stream.
   */
  public static gloAlmDeltaTdotAType fromPerUnaligned(byte[] encodedBytes) {
    gloAlmDeltaTdotAType result = new gloAlmDeltaTdotAType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gloAlmDeltaTdotAType from encoded stream.
   */
  public static gloAlmDeltaTdotAType fromPerAligned(byte[] encodedBytes) {
    gloAlmDeltaTdotAType result = new gloAlmDeltaTdotAType();
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
    return "gloAlmDeltaTdotAType = " + getInteger() + ";\n";
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
public static class gloAlmEpsilonAType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_gloAlmEpsilonAType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gloAlmEpsilonAType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("32767"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gloAlmEpsilonAType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gloAlmEpsilonAType != null) {
      return ImmutableList.of(TAG_gloAlmEpsilonAType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gloAlmEpsilonAType from encoded stream.
   */
  public static gloAlmEpsilonAType fromPerUnaligned(byte[] encodedBytes) {
    gloAlmEpsilonAType result = new gloAlmEpsilonAType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gloAlmEpsilonAType from encoded stream.
   */
  public static gloAlmEpsilonAType fromPerAligned(byte[] encodedBytes) {
    gloAlmEpsilonAType result = new gloAlmEpsilonAType();
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
    return "gloAlmEpsilonAType = " + getInteger() + ";\n";
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
public static class gloAlmOmegaAType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_gloAlmOmegaAType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gloAlmOmegaAType() {
    super();
    setValueRange(new java.math.BigInteger("-32768"), new java.math.BigInteger("32767"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gloAlmOmegaAType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gloAlmOmegaAType != null) {
      return ImmutableList.of(TAG_gloAlmOmegaAType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gloAlmOmegaAType from encoded stream.
   */
  public static gloAlmOmegaAType fromPerUnaligned(byte[] encodedBytes) {
    gloAlmOmegaAType result = new gloAlmOmegaAType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gloAlmOmegaAType from encoded stream.
   */
  public static gloAlmOmegaAType fromPerAligned(byte[] encodedBytes) {
    gloAlmOmegaAType result = new gloAlmOmegaAType();
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
    return "gloAlmOmegaAType = " + getInteger() + ";\n";
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
public static class gloAlmTauAType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_gloAlmTauAType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gloAlmTauAType() {
    super();
    setValueRange(new java.math.BigInteger("-512"), new java.math.BigInteger("511"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gloAlmTauAType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gloAlmTauAType != null) {
      return ImmutableList.of(TAG_gloAlmTauAType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gloAlmTauAType from encoded stream.
   */
  public static gloAlmTauAType fromPerUnaligned(byte[] encodedBytes) {
    gloAlmTauAType result = new gloAlmTauAType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gloAlmTauAType from encoded stream.
   */
  public static gloAlmTauAType fromPerAligned(byte[] encodedBytes) {
    gloAlmTauAType result = new gloAlmTauAType();
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
    return "gloAlmTauAType = " + getInteger() + ";\n";
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
public static class gloAlmCAType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_gloAlmCAType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gloAlmCAType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("1"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gloAlmCAType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gloAlmCAType != null) {
      return ImmutableList.of(TAG_gloAlmCAType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gloAlmCAType from encoded stream.
   */
  public static gloAlmCAType fromPerUnaligned(byte[] encodedBytes) {
    gloAlmCAType result = new gloAlmCAType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gloAlmCAType from encoded stream.
   */
  public static gloAlmCAType fromPerAligned(byte[] encodedBytes) {
    gloAlmCAType result = new gloAlmCAType();
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
    return "gloAlmCAType = " + getInteger() + ";\n";
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
public static class gloAlmMAType extends Asn1BitString {
  //

  // defined bit positions, if any
  

  // setters
  

  // clearers
  


  private static final Asn1Tag TAG_gloAlmMAType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gloAlmMAType() {
    super();
    setMinSize(2);
setMaxSize(2);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gloAlmMAType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gloAlmMAType != null) {
      return ImmutableList.of(TAG_gloAlmMAType);
    } else {
      return Asn1BitString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gloAlmMAType from encoded stream.
   */
  public static gloAlmMAType fromPerUnaligned(byte[] encodedBytes) {
    gloAlmMAType result = new gloAlmMAType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gloAlmMAType from encoded stream.
   */
  public static gloAlmMAType fromPerAligned(byte[] encodedBytes) {
    gloAlmMAType result = new gloAlmMAType();
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
    return "gloAlmMAType = " + getValue() + ";\n";
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
    builder.append("Almanac_GlonassAlmanacSet = {\n");
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
