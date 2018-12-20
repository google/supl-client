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
public  class GANSSPositionMethod extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GANSSPositionMethod
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GANSSPositionMethod() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GANSSPositionMethod;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GANSSPositionMethod != null) {
      return ImmutableList.of(TAG_GANSSPositionMethod);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GANSSPositionMethod from encoded stream.
   */
  public static GANSSPositionMethod fromPerUnaligned(byte[] encodedBytes) {
    GANSSPositionMethod result = new GANSSPositionMethod();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GANSSPositionMethod from encoded stream.
   */
  public static GANSSPositionMethod fromPerAligned(byte[] encodedBytes) {
    GANSSPositionMethod result = new GANSSPositionMethod();
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

  
  private GANSSPositionMethod.ganssIDType ganssID_;
  public GANSSPositionMethod.ganssIDType getGanssID() {
    return ganssID_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSPositionMethod.ganssIDType
   */
  public void setGanssID(Asn1Object value) {
    this.ganssID_ = (GANSSPositionMethod.ganssIDType) value;
  }
  public GANSSPositionMethod.ganssIDType setGanssIDToNewInstance() {
    ganssID_ = new GANSSPositionMethod.ganssIDType();
    return ganssID_;
  }
  
  private GANSSPositioningMethodTypes gANSSPositioningMethodTypes_;
  public GANSSPositioningMethodTypes getGANSSPositioningMethodTypes() {
    return gANSSPositioningMethodTypes_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSPositioningMethodTypes
   */
  public void setGANSSPositioningMethodTypes(Asn1Object value) {
    this.gANSSPositioningMethodTypes_ = (GANSSPositioningMethodTypes) value;
  }
  public GANSSPositioningMethodTypes setGANSSPositioningMethodTypesToNewInstance() {
    gANSSPositioningMethodTypes_ = new GANSSPositioningMethodTypes();
    return gANSSPositioningMethodTypes_;
  }
  
  private GANSSSignals gANSSSignals_;
  public GANSSSignals getGANSSSignals() {
    return gANSSSignals_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSSignals
   */
  public void setGANSSSignals(Asn1Object value) {
    this.gANSSSignals_ = (GANSSSignals) value;
  }
  public GANSSSignals setGANSSSignalsToNewInstance() {
    gANSSSignals_ = new GANSSSignals();
    return gANSSSignals_;
  }
  

  
  private SBASID  extensionSbasID;
  public SBASID getExtensionSbasID() {
    return extensionSbasID;
  }
  /**
   * @throws ClassCastException if value is not a SBASID
   */
  public void setExtensionSbasID(Asn1Object value) {
    extensionSbasID = (SBASID) value;
  }
  public void setExtensionSbasIDToNewInstance() {
    extensionSbasID = new SBASID();
  }
    

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getGanssID() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssID();
          }

          @Override public void setToNewInstance() {
            setGanssIDToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSPositionMethod.ganssIDType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssID : "
                    + getGanssID().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getGANSSPositioningMethodTypes() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGANSSPositioningMethodTypes();
          }

          @Override public void setToNewInstance() {
            setGANSSPositioningMethodTypesToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSPositioningMethodTypes.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gANSSPositioningMethodTypes : "
                    + getGANSSPositioningMethodTypes().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getGANSSSignals() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGANSSSignals();
          }

          @Override public void setToNewInstance() {
            setGANSSSignalsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSSignals.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gANSSSignals : "
                    + getGANSSSignals().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      builder.add(new SequenceComponent() {
            @Override public boolean isExplicitlySet() {
              return getExtensionSbasID() != null;
            }

            @Override public boolean hasDefaultValue() {
              return false;
            }

            @Override public boolean isOptional() {
              return true;
            }

            @Override public Asn1Object getComponentValue() {
              return getExtensionSbasID();
            }

            @Override public void setToNewInstance() {
              setExtensionSbasIDToNewInstance();
            }

            @Override public Collection<Asn1Tag> getPossibleFirstTags() {
              throw new UnsupportedOperationException(
                  "BER decoding not supported for extension elements");
            }

            @Override
            public Asn1Tag getTag() {
              throw new UnsupportedOperationException(
                  "BER is not supported for extension elements");
            }

            @Override
            public boolean isImplicitTagging() {
              throw new UnsupportedOperationException(
                  "BER is not supported for extension elements");
            }

            @Override public String toIndentedString(String indent) {
              return "sbasID : "
                  + getExtensionSbasID().toIndentedString(indent);
            }
      });
      
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
public static class ganssIDType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ganssIDType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ganssIDType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("7"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ganssIDType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ganssIDType != null) {
      return ImmutableList.of(TAG_ganssIDType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ganssIDType from encoded stream.
   */
  public static ganssIDType fromPerUnaligned(byte[] encodedBytes) {
    ganssIDType result = new ganssIDType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ganssIDType from encoded stream.
   */
  public static ganssIDType fromPerAligned(byte[] encodedBytes) {
    ganssIDType result = new ganssIDType();
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
    return "ganssIDType = " + getInteger() + ";\n";
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
    builder.append("GANSSPositionMethod = {\n");
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
