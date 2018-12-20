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

package com.google.location.suplclient.asn1.supl2.ulp_version_2_parameter_extensions;

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
import com.google.location.suplclient.asn1.supl2.ver2_ulp_components.GANSSSignals;
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

  
  private GANSSPositionMethod.ganssIdType ganssId_;
  public GANSSPositionMethod.ganssIdType getGanssId() {
    return ganssId_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSPositionMethod.ganssIdType
   */
  public void setGanssId(Asn1Object value) {
    this.ganssId_ = (GANSSPositionMethod.ganssIdType) value;
  }
  public GANSSPositionMethod.ganssIdType setGanssIdToNewInstance() {
    ganssId_ = new GANSSPositionMethod.ganssIdType();
    return ganssId_;
  }
  
  private GANSSPositionMethod.ganssSBASidType ganssSBASid_;
  public GANSSPositionMethod.ganssSBASidType getGanssSBASid() {
    return ganssSBASid_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSPositionMethod.ganssSBASidType
   */
  public void setGanssSBASid(Asn1Object value) {
    this.ganssSBASid_ = (GANSSPositionMethod.ganssSBASidType) value;
  }
  public GANSSPositionMethod.ganssSBASidType setGanssSBASidToNewInstance() {
    ganssSBASid_ = new GANSSPositionMethod.ganssSBASidType();
    return ganssSBASid_;
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
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getGanssId() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssId();
          }

          @Override public void setToNewInstance() {
            setGanssIdToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSPositionMethod.ganssIdType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssId : "
                    + getGanssId().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getGanssSBASid() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssSBASid();
          }

          @Override public void setToNewInstance() {
            setGanssSBASidToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSPositionMethod.ganssSBASidType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssSBASid : "
                    + getGanssSBASid().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getGANSSPositioningMethodTypes() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
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
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

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
public static class ganssIdType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ganssIdType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ganssIdType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("15"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ganssIdType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ganssIdType != null) {
      return ImmutableList.of(TAG_ganssIdType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ganssIdType from encoded stream.
   */
  public static ganssIdType fromPerUnaligned(byte[] encodedBytes) {
    ganssIdType result = new ganssIdType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ganssIdType from encoded stream.
   */
  public static ganssIdType fromPerAligned(byte[] encodedBytes) {
    ganssIdType result = new ganssIdType();
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
    return "ganssIdType = " + getInteger() + ";\n";
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
public static class ganssSBASidType extends Asn1BitString {
  //

  // defined bit positions, if any
  

  // setters
  

  // clearers
  


  private static final Asn1Tag TAG_ganssSBASidType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ganssSBASidType() {
    super();
    setMinSize(3);
setMaxSize(3);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ganssSBASidType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ganssSBASidType != null) {
      return ImmutableList.of(TAG_ganssSBASidType);
    } else {
      return Asn1BitString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ganssSBASidType from encoded stream.
   */
  public static ganssSBASidType fromPerUnaligned(byte[] encodedBytes) {
    ganssSBASidType result = new ganssSBASidType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ganssSBASidType from encoded stream.
   */
  public static ganssSBASidType fromPerAligned(byte[] encodedBytes) {
    ganssSBASidType result = new ganssSBASidType();
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
    return "ganssSBASidType = " + getValue() + ";\n";
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
