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
public  class AlmanacGLONASS_AlmanacSet extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_AlmanacGLONASS_AlmanacSet
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public AlmanacGLONASS_AlmanacSet() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_AlmanacGLONASS_AlmanacSet;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_AlmanacGLONASS_AlmanacSet != null) {
      return ImmutableList.of(TAG_AlmanacGLONASS_AlmanacSet);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new AlmanacGLONASS_AlmanacSet from encoded stream.
   */
  public static AlmanacGLONASS_AlmanacSet fromPerUnaligned(byte[] encodedBytes) {
    AlmanacGLONASS_AlmanacSet result = new AlmanacGLONASS_AlmanacSet();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new AlmanacGLONASS_AlmanacSet from encoded stream.
   */
  public static AlmanacGLONASS_AlmanacSet fromPerAligned(byte[] encodedBytes) {
    AlmanacGLONASS_AlmanacSet result = new AlmanacGLONASS_AlmanacSet();
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

  
  private AlmanacGLONASS_AlmanacSet.gloAlm_NAType gloAlm_NA_;
  public AlmanacGLONASS_AlmanacSet.gloAlm_NAType getGloAlm_NA() {
    return gloAlm_NA_;
  }
  /**
   * @throws ClassCastException if value is not a AlmanacGLONASS_AlmanacSet.gloAlm_NAType
   */
  public void setGloAlm_NA(Asn1Object value) {
    this.gloAlm_NA_ = (AlmanacGLONASS_AlmanacSet.gloAlm_NAType) value;
  }
  public AlmanacGLONASS_AlmanacSet.gloAlm_NAType setGloAlm_NAToNewInstance() {
    gloAlm_NA_ = new AlmanacGLONASS_AlmanacSet.gloAlm_NAType();
    return gloAlm_NA_;
  }
  
  private AlmanacGLONASS_AlmanacSet.gloAlmnAType gloAlmnA_;
  public AlmanacGLONASS_AlmanacSet.gloAlmnAType getGloAlmnA() {
    return gloAlmnA_;
  }
  /**
   * @throws ClassCastException if value is not a AlmanacGLONASS_AlmanacSet.gloAlmnAType
   */
  public void setGloAlmnA(Asn1Object value) {
    this.gloAlmnA_ = (AlmanacGLONASS_AlmanacSet.gloAlmnAType) value;
  }
  public AlmanacGLONASS_AlmanacSet.gloAlmnAType setGloAlmnAToNewInstance() {
    gloAlmnA_ = new AlmanacGLONASS_AlmanacSet.gloAlmnAType();
    return gloAlmnA_;
  }
  
  private AlmanacGLONASS_AlmanacSet.gloAlmHAType gloAlmHA_;
  public AlmanacGLONASS_AlmanacSet.gloAlmHAType getGloAlmHA() {
    return gloAlmHA_;
  }
  /**
   * @throws ClassCastException if value is not a AlmanacGLONASS_AlmanacSet.gloAlmHAType
   */
  public void setGloAlmHA(Asn1Object value) {
    this.gloAlmHA_ = (AlmanacGLONASS_AlmanacSet.gloAlmHAType) value;
  }
  public AlmanacGLONASS_AlmanacSet.gloAlmHAType setGloAlmHAToNewInstance() {
    gloAlmHA_ = new AlmanacGLONASS_AlmanacSet.gloAlmHAType();
    return gloAlmHA_;
  }
  
  private AlmanacGLONASS_AlmanacSet.gloAlmLambdaAType gloAlmLambdaA_;
  public AlmanacGLONASS_AlmanacSet.gloAlmLambdaAType getGloAlmLambdaA() {
    return gloAlmLambdaA_;
  }
  /**
   * @throws ClassCastException if value is not a AlmanacGLONASS_AlmanacSet.gloAlmLambdaAType
   */
  public void setGloAlmLambdaA(Asn1Object value) {
    this.gloAlmLambdaA_ = (AlmanacGLONASS_AlmanacSet.gloAlmLambdaAType) value;
  }
  public AlmanacGLONASS_AlmanacSet.gloAlmLambdaAType setGloAlmLambdaAToNewInstance() {
    gloAlmLambdaA_ = new AlmanacGLONASS_AlmanacSet.gloAlmLambdaAType();
    return gloAlmLambdaA_;
  }
  
  private AlmanacGLONASS_AlmanacSet.gloAlmtlambdaAType gloAlmtlambdaA_;
  public AlmanacGLONASS_AlmanacSet.gloAlmtlambdaAType getGloAlmtlambdaA() {
    return gloAlmtlambdaA_;
  }
  /**
   * @throws ClassCastException if value is not a AlmanacGLONASS_AlmanacSet.gloAlmtlambdaAType
   */
  public void setGloAlmtlambdaA(Asn1Object value) {
    this.gloAlmtlambdaA_ = (AlmanacGLONASS_AlmanacSet.gloAlmtlambdaAType) value;
  }
  public AlmanacGLONASS_AlmanacSet.gloAlmtlambdaAType setGloAlmtlambdaAToNewInstance() {
    gloAlmtlambdaA_ = new AlmanacGLONASS_AlmanacSet.gloAlmtlambdaAType();
    return gloAlmtlambdaA_;
  }
  
  private AlmanacGLONASS_AlmanacSet.gloAlmDeltaIaType gloAlmDeltaIa_;
  public AlmanacGLONASS_AlmanacSet.gloAlmDeltaIaType getGloAlmDeltaIa() {
    return gloAlmDeltaIa_;
  }
  /**
   * @throws ClassCastException if value is not a AlmanacGLONASS_AlmanacSet.gloAlmDeltaIaType
   */
  public void setGloAlmDeltaIa(Asn1Object value) {
    this.gloAlmDeltaIa_ = (AlmanacGLONASS_AlmanacSet.gloAlmDeltaIaType) value;
  }
  public AlmanacGLONASS_AlmanacSet.gloAlmDeltaIaType setGloAlmDeltaIaToNewInstance() {
    gloAlmDeltaIa_ = new AlmanacGLONASS_AlmanacSet.gloAlmDeltaIaType();
    return gloAlmDeltaIa_;
  }
  
  private AlmanacGLONASS_AlmanacSet.gloAlmDeltaTAType gloAlmDeltaTA_;
  public AlmanacGLONASS_AlmanacSet.gloAlmDeltaTAType getGloAlmDeltaTA() {
    return gloAlmDeltaTA_;
  }
  /**
   * @throws ClassCastException if value is not a AlmanacGLONASS_AlmanacSet.gloAlmDeltaTAType
   */
  public void setGloAlmDeltaTA(Asn1Object value) {
    this.gloAlmDeltaTA_ = (AlmanacGLONASS_AlmanacSet.gloAlmDeltaTAType) value;
  }
  public AlmanacGLONASS_AlmanacSet.gloAlmDeltaTAType setGloAlmDeltaTAToNewInstance() {
    gloAlmDeltaTA_ = new AlmanacGLONASS_AlmanacSet.gloAlmDeltaTAType();
    return gloAlmDeltaTA_;
  }
  
  private AlmanacGLONASS_AlmanacSet.gloAlmDeltaTdotAType gloAlmDeltaTdotA_;
  public AlmanacGLONASS_AlmanacSet.gloAlmDeltaTdotAType getGloAlmDeltaTdotA() {
    return gloAlmDeltaTdotA_;
  }
  /**
   * @throws ClassCastException if value is not a AlmanacGLONASS_AlmanacSet.gloAlmDeltaTdotAType
   */
  public void setGloAlmDeltaTdotA(Asn1Object value) {
    this.gloAlmDeltaTdotA_ = (AlmanacGLONASS_AlmanacSet.gloAlmDeltaTdotAType) value;
  }
  public AlmanacGLONASS_AlmanacSet.gloAlmDeltaTdotAType setGloAlmDeltaTdotAToNewInstance() {
    gloAlmDeltaTdotA_ = new AlmanacGLONASS_AlmanacSet.gloAlmDeltaTdotAType();
    return gloAlmDeltaTdotA_;
  }
  
  private AlmanacGLONASS_AlmanacSet.gloAlmEpsilonAType gloAlmEpsilonA_;
  public AlmanacGLONASS_AlmanacSet.gloAlmEpsilonAType getGloAlmEpsilonA() {
    return gloAlmEpsilonA_;
  }
  /**
   * @throws ClassCastException if value is not a AlmanacGLONASS_AlmanacSet.gloAlmEpsilonAType
   */
  public void setGloAlmEpsilonA(Asn1Object value) {
    this.gloAlmEpsilonA_ = (AlmanacGLONASS_AlmanacSet.gloAlmEpsilonAType) value;
  }
  public AlmanacGLONASS_AlmanacSet.gloAlmEpsilonAType setGloAlmEpsilonAToNewInstance() {
    gloAlmEpsilonA_ = new AlmanacGLONASS_AlmanacSet.gloAlmEpsilonAType();
    return gloAlmEpsilonA_;
  }
  
  private AlmanacGLONASS_AlmanacSet.gloAlmOmegaAType gloAlmOmegaA_;
  public AlmanacGLONASS_AlmanacSet.gloAlmOmegaAType getGloAlmOmegaA() {
    return gloAlmOmegaA_;
  }
  /**
   * @throws ClassCastException if value is not a AlmanacGLONASS_AlmanacSet.gloAlmOmegaAType
   */
  public void setGloAlmOmegaA(Asn1Object value) {
    this.gloAlmOmegaA_ = (AlmanacGLONASS_AlmanacSet.gloAlmOmegaAType) value;
  }
  public AlmanacGLONASS_AlmanacSet.gloAlmOmegaAType setGloAlmOmegaAToNewInstance() {
    gloAlmOmegaA_ = new AlmanacGLONASS_AlmanacSet.gloAlmOmegaAType();
    return gloAlmOmegaA_;
  }
  
  private AlmanacGLONASS_AlmanacSet.gloAlmTauAType gloAlmTauA_;
  public AlmanacGLONASS_AlmanacSet.gloAlmTauAType getGloAlmTauA() {
    return gloAlmTauA_;
  }
  /**
   * @throws ClassCastException if value is not a AlmanacGLONASS_AlmanacSet.gloAlmTauAType
   */
  public void setGloAlmTauA(Asn1Object value) {
    this.gloAlmTauA_ = (AlmanacGLONASS_AlmanacSet.gloAlmTauAType) value;
  }
  public AlmanacGLONASS_AlmanacSet.gloAlmTauAType setGloAlmTauAToNewInstance() {
    gloAlmTauA_ = new AlmanacGLONASS_AlmanacSet.gloAlmTauAType();
    return gloAlmTauA_;
  }
  
  private AlmanacGLONASS_AlmanacSet.gloAlmCAType gloAlmCA_;
  public AlmanacGLONASS_AlmanacSet.gloAlmCAType getGloAlmCA() {
    return gloAlmCA_;
  }
  /**
   * @throws ClassCastException if value is not a AlmanacGLONASS_AlmanacSet.gloAlmCAType
   */
  public void setGloAlmCA(Asn1Object value) {
    this.gloAlmCA_ = (AlmanacGLONASS_AlmanacSet.gloAlmCAType) value;
  }
  public AlmanacGLONASS_AlmanacSet.gloAlmCAType setGloAlmCAToNewInstance() {
    gloAlmCA_ = new AlmanacGLONASS_AlmanacSet.gloAlmCAType();
    return gloAlmCA_;
  }
  
  private AlmanacGLONASS_AlmanacSet.gloAlmMAType gloAlmMA_;
  public AlmanacGLONASS_AlmanacSet.gloAlmMAType getGloAlmMA() {
    return gloAlmMA_;
  }
  /**
   * @throws ClassCastException if value is not a AlmanacGLONASS_AlmanacSet.gloAlmMAType
   */
  public void setGloAlmMA(Asn1Object value) {
    this.gloAlmMA_ = (AlmanacGLONASS_AlmanacSet.gloAlmMAType) value;
  }
  public AlmanacGLONASS_AlmanacSet.gloAlmMAType setGloAlmMAToNewInstance() {
    gloAlmMA_ = new AlmanacGLONASS_AlmanacSet.gloAlmMAType();
    return gloAlmMA_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getGloAlm_NA() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGloAlm_NA();
          }

          @Override public void setToNewInstance() {
            setGloAlm_NAToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? AlmanacGLONASS_AlmanacSet.gloAlm_NAType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gloAlm_NA : "
                    + getGloAlm_NA().toIndentedString(indent);
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
            return tag == null ? AlmanacGLONASS_AlmanacSet.gloAlmnAType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? AlmanacGLONASS_AlmanacSet.gloAlmHAType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? AlmanacGLONASS_AlmanacSet.gloAlmLambdaAType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? AlmanacGLONASS_AlmanacSet.gloAlmtlambdaAType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? AlmanacGLONASS_AlmanacSet.gloAlmDeltaIaType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? AlmanacGLONASS_AlmanacSet.gloAlmDeltaTAType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? AlmanacGLONASS_AlmanacSet.gloAlmDeltaTdotAType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? AlmanacGLONASS_AlmanacSet.gloAlmEpsilonAType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? AlmanacGLONASS_AlmanacSet.gloAlmOmegaAType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? AlmanacGLONASS_AlmanacSet.gloAlmTauAType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? AlmanacGLONASS_AlmanacSet.gloAlmCAType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? AlmanacGLONASS_AlmanacSet.gloAlmMAType.getPossibleFirstTags() : ImmutableList.of(tag);
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
public static class gloAlm_NAType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_gloAlm_NAType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gloAlm_NAType() {
    super();
    setValueRange(new java.math.BigInteger("1"), new java.math.BigInteger("1461"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gloAlm_NAType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gloAlm_NAType != null) {
      return ImmutableList.of(TAG_gloAlm_NAType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gloAlm_NAType from encoded stream.
   */
  public static gloAlm_NAType fromPerUnaligned(byte[] encodedBytes) {
    gloAlm_NAType result = new gloAlm_NAType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gloAlm_NAType from encoded stream.
   */
  public static gloAlm_NAType fromPerAligned(byte[] encodedBytes) {
    gloAlm_NAType result = new gloAlm_NAType();
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
    return "gloAlm_NAType = " + getInteger() + ";\n";
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
    builder.append("AlmanacGLONASS_AlmanacSet = {\n");
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
