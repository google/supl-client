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
public  class PositionInstruct extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_PositionInstruct
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public PositionInstruct() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_PositionInstruct;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_PositionInstruct != null) {
      return ImmutableList.of(TAG_PositionInstruct);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new PositionInstruct from encoded stream.
   */
  public static PositionInstruct fromPerUnaligned(byte[] encodedBytes) {
    PositionInstruct result = new PositionInstruct();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new PositionInstruct from encoded stream.
   */
  public static PositionInstruct fromPerAligned(byte[] encodedBytes) {
    PositionInstruct result = new PositionInstruct();
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

  
  private MethodType methodType_;
  public MethodType getMethodType() {
    return methodType_;
  }
  /**
   * @throws ClassCastException if value is not a MethodType
   */
  public void setMethodType(Asn1Object value) {
    this.methodType_ = (MethodType) value;
  }
  public MethodType setMethodTypeToNewInstance() {
    methodType_ = new MethodType();
    return methodType_;
  }
  
  private PositionMethod positionMethod_;
  public PositionMethod getPositionMethod() {
    return positionMethod_;
  }
  /**
   * @throws ClassCastException if value is not a PositionMethod
   */
  public void setPositionMethod(Asn1Object value) {
    this.positionMethod_ = (PositionMethod) value;
  }
  public PositionMethod setPositionMethodToNewInstance() {
    positionMethod_ = new PositionMethod();
    return positionMethod_;
  }
  
  private MeasureResponseTime measureResponseTime_;
  public MeasureResponseTime getMeasureResponseTime() {
    return measureResponseTime_;
  }
  /**
   * @throws ClassCastException if value is not a MeasureResponseTime
   */
  public void setMeasureResponseTime(Asn1Object value) {
    this.measureResponseTime_ = (MeasureResponseTime) value;
  }
  public MeasureResponseTime setMeasureResponseTimeToNewInstance() {
    measureResponseTime_ = new MeasureResponseTime();
    return measureResponseTime_;
  }
  
  private UseMultipleSets useMultipleSets_;
  public UseMultipleSets getUseMultipleSets() {
    return useMultipleSets_;
  }
  /**
   * @throws ClassCastException if value is not a UseMultipleSets
   */
  public void setUseMultipleSets(Asn1Object value) {
    this.useMultipleSets_ = (UseMultipleSets) value;
  }
  public UseMultipleSets setUseMultipleSetsToNewInstance() {
    useMultipleSets_ = new UseMultipleSets();
    return useMultipleSets_;
  }
  
  private EnvironmentCharacter environmentCharacter_;
  public EnvironmentCharacter getEnvironmentCharacter() {
    return environmentCharacter_;
  }
  /**
   * @throws ClassCastException if value is not a EnvironmentCharacter
   */
  public void setEnvironmentCharacter(Asn1Object value) {
    this.environmentCharacter_ = (EnvironmentCharacter) value;
  }
  public EnvironmentCharacter setEnvironmentCharacterToNewInstance() {
    environmentCharacter_ = new EnvironmentCharacter();
    return environmentCharacter_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getMethodType() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getMethodType();
          }

          @Override public void setToNewInstance() {
            setMethodTypeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? MethodType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "methodType : "
                    + getMethodType().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getPositionMethod() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getPositionMethod();
          }

          @Override public void setToNewInstance() {
            setPositionMethodToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? PositionMethod.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "positionMethod : "
                    + getPositionMethod().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getMeasureResponseTime() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getMeasureResponseTime();
          }

          @Override public void setToNewInstance() {
            setMeasureResponseTimeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? MeasureResponseTime.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "measureResponseTime : "
                    + getMeasureResponseTime().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getUseMultipleSets() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getUseMultipleSets();
          }

          @Override public void setToNewInstance() {
            setUseMultipleSetsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UseMultipleSets.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "useMultipleSets : "
                    + getUseMultipleSets().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getEnvironmentCharacter() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getEnvironmentCharacter();
          }

          @Override public void setToNewInstance() {
            setEnvironmentCharacterToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? EnvironmentCharacter.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "environmentCharacter : "
                    + getEnvironmentCharacter().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      return builder.build();
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
    builder.append("PositionInstruct = {\n");
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
