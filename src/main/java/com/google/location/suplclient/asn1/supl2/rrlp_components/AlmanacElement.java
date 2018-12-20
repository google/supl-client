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
public  class AlmanacElement extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_AlmanacElement
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public AlmanacElement() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_AlmanacElement;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_AlmanacElement != null) {
      return ImmutableList.of(TAG_AlmanacElement);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new AlmanacElement from encoded stream.
   */
  public static AlmanacElement fromPerUnaligned(byte[] encodedBytes) {
    AlmanacElement result = new AlmanacElement();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new AlmanacElement from encoded stream.
   */
  public static AlmanacElement fromPerAligned(byte[] encodedBytes) {
    AlmanacElement result = new AlmanacElement();
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

  
  private SatelliteID satelliteID_;
  public SatelliteID getSatelliteID() {
    return satelliteID_;
  }
  /**
   * @throws ClassCastException if value is not a SatelliteID
   */
  public void setSatelliteID(Asn1Object value) {
    this.satelliteID_ = (SatelliteID) value;
  }
  public SatelliteID setSatelliteIDToNewInstance() {
    satelliteID_ = new SatelliteID();
    return satelliteID_;
  }
  
  private AlmanacElement.almanacEType almanacE_;
  public AlmanacElement.almanacEType getAlmanacE() {
    return almanacE_;
  }
  /**
   * @throws ClassCastException if value is not a AlmanacElement.almanacEType
   */
  public void setAlmanacE(Asn1Object value) {
    this.almanacE_ = (AlmanacElement.almanacEType) value;
  }
  public AlmanacElement.almanacEType setAlmanacEToNewInstance() {
    almanacE_ = new AlmanacElement.almanacEType();
    return almanacE_;
  }
  
  private AlmanacElement.alamanacToaType alamanacToa_;
  public AlmanacElement.alamanacToaType getAlamanacToa() {
    return alamanacToa_;
  }
  /**
   * @throws ClassCastException if value is not a AlmanacElement.alamanacToaType
   */
  public void setAlamanacToa(Asn1Object value) {
    this.alamanacToa_ = (AlmanacElement.alamanacToaType) value;
  }
  public AlmanacElement.alamanacToaType setAlamanacToaToNewInstance() {
    alamanacToa_ = new AlmanacElement.alamanacToaType();
    return alamanacToa_;
  }
  
  private AlmanacElement.almanacKsiiType almanacKsii_;
  public AlmanacElement.almanacKsiiType getAlmanacKsii() {
    return almanacKsii_;
  }
  /**
   * @throws ClassCastException if value is not a AlmanacElement.almanacKsiiType
   */
  public void setAlmanacKsii(Asn1Object value) {
    this.almanacKsii_ = (AlmanacElement.almanacKsiiType) value;
  }
  public AlmanacElement.almanacKsiiType setAlmanacKsiiToNewInstance() {
    almanacKsii_ = new AlmanacElement.almanacKsiiType();
    return almanacKsii_;
  }
  
  private AlmanacElement.almanacOmegaDotType almanacOmegaDot_;
  public AlmanacElement.almanacOmegaDotType getAlmanacOmegaDot() {
    return almanacOmegaDot_;
  }
  /**
   * @throws ClassCastException if value is not a AlmanacElement.almanacOmegaDotType
   */
  public void setAlmanacOmegaDot(Asn1Object value) {
    this.almanacOmegaDot_ = (AlmanacElement.almanacOmegaDotType) value;
  }
  public AlmanacElement.almanacOmegaDotType setAlmanacOmegaDotToNewInstance() {
    almanacOmegaDot_ = new AlmanacElement.almanacOmegaDotType();
    return almanacOmegaDot_;
  }
  
  private AlmanacElement.almanacSVhealthType almanacSVhealth_;
  public AlmanacElement.almanacSVhealthType getAlmanacSVhealth() {
    return almanacSVhealth_;
  }
  /**
   * @throws ClassCastException if value is not a AlmanacElement.almanacSVhealthType
   */
  public void setAlmanacSVhealth(Asn1Object value) {
    this.almanacSVhealth_ = (AlmanacElement.almanacSVhealthType) value;
  }
  public AlmanacElement.almanacSVhealthType setAlmanacSVhealthToNewInstance() {
    almanacSVhealth_ = new AlmanacElement.almanacSVhealthType();
    return almanacSVhealth_;
  }
  
  private AlmanacElement.almanacAPowerHalfType almanacAPowerHalf_;
  public AlmanacElement.almanacAPowerHalfType getAlmanacAPowerHalf() {
    return almanacAPowerHalf_;
  }
  /**
   * @throws ClassCastException if value is not a AlmanacElement.almanacAPowerHalfType
   */
  public void setAlmanacAPowerHalf(Asn1Object value) {
    this.almanacAPowerHalf_ = (AlmanacElement.almanacAPowerHalfType) value;
  }
  public AlmanacElement.almanacAPowerHalfType setAlmanacAPowerHalfToNewInstance() {
    almanacAPowerHalf_ = new AlmanacElement.almanacAPowerHalfType();
    return almanacAPowerHalf_;
  }
  
  private AlmanacElement.almanacOmega0Type almanacOmega0_;
  public AlmanacElement.almanacOmega0Type getAlmanacOmega0() {
    return almanacOmega0_;
  }
  /**
   * @throws ClassCastException if value is not a AlmanacElement.almanacOmega0Type
   */
  public void setAlmanacOmega0(Asn1Object value) {
    this.almanacOmega0_ = (AlmanacElement.almanacOmega0Type) value;
  }
  public AlmanacElement.almanacOmega0Type setAlmanacOmega0ToNewInstance() {
    almanacOmega0_ = new AlmanacElement.almanacOmega0Type();
    return almanacOmega0_;
  }
  
  private AlmanacElement.almanacWType almanacW_;
  public AlmanacElement.almanacWType getAlmanacW() {
    return almanacW_;
  }
  /**
   * @throws ClassCastException if value is not a AlmanacElement.almanacWType
   */
  public void setAlmanacW(Asn1Object value) {
    this.almanacW_ = (AlmanacElement.almanacWType) value;
  }
  public AlmanacElement.almanacWType setAlmanacWToNewInstance() {
    almanacW_ = new AlmanacElement.almanacWType();
    return almanacW_;
  }
  
  private AlmanacElement.almanacM0Type almanacM0_;
  public AlmanacElement.almanacM0Type getAlmanacM0() {
    return almanacM0_;
  }
  /**
   * @throws ClassCastException if value is not a AlmanacElement.almanacM0Type
   */
  public void setAlmanacM0(Asn1Object value) {
    this.almanacM0_ = (AlmanacElement.almanacM0Type) value;
  }
  public AlmanacElement.almanacM0Type setAlmanacM0ToNewInstance() {
    almanacM0_ = new AlmanacElement.almanacM0Type();
    return almanacM0_;
  }
  
  private AlmanacElement.almanacAF0Type almanacAF0_;
  public AlmanacElement.almanacAF0Type getAlmanacAF0() {
    return almanacAF0_;
  }
  /**
   * @throws ClassCastException if value is not a AlmanacElement.almanacAF0Type
   */
  public void setAlmanacAF0(Asn1Object value) {
    this.almanacAF0_ = (AlmanacElement.almanacAF0Type) value;
  }
  public AlmanacElement.almanacAF0Type setAlmanacAF0ToNewInstance() {
    almanacAF0_ = new AlmanacElement.almanacAF0Type();
    return almanacAF0_;
  }
  
  private AlmanacElement.almanacAF1Type almanacAF1_;
  public AlmanacElement.almanacAF1Type getAlmanacAF1() {
    return almanacAF1_;
  }
  /**
   * @throws ClassCastException if value is not a AlmanacElement.almanacAF1Type
   */
  public void setAlmanacAF1(Asn1Object value) {
    this.almanacAF1_ = (AlmanacElement.almanacAF1Type) value;
  }
  public AlmanacElement.almanacAF1Type setAlmanacAF1ToNewInstance() {
    almanacAF1_ = new AlmanacElement.almanacAF1Type();
    return almanacAF1_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getSatelliteID() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getSatelliteID();
          }

          @Override public void setToNewInstance() {
            setSatelliteIDToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SatelliteID.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "satelliteID : "
                    + getSatelliteID().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getAlmanacE() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getAlmanacE();
          }

          @Override public void setToNewInstance() {
            setAlmanacEToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? AlmanacElement.almanacEType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "almanacE : "
                    + getAlmanacE().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getAlamanacToa() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getAlamanacToa();
          }

          @Override public void setToNewInstance() {
            setAlamanacToaToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? AlmanacElement.alamanacToaType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "alamanacToa : "
                    + getAlamanacToa().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getAlmanacKsii() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getAlmanacKsii();
          }

          @Override public void setToNewInstance() {
            setAlmanacKsiiToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? AlmanacElement.almanacKsiiType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "almanacKsii : "
                    + getAlmanacKsii().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getAlmanacOmegaDot() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getAlmanacOmegaDot();
          }

          @Override public void setToNewInstance() {
            setAlmanacOmegaDotToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? AlmanacElement.almanacOmegaDotType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "almanacOmegaDot : "
                    + getAlmanacOmegaDot().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getAlmanacSVhealth() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getAlmanacSVhealth();
          }

          @Override public void setToNewInstance() {
            setAlmanacSVhealthToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? AlmanacElement.almanacSVhealthType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "almanacSVhealth : "
                    + getAlmanacSVhealth().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getAlmanacAPowerHalf() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getAlmanacAPowerHalf();
          }

          @Override public void setToNewInstance() {
            setAlmanacAPowerHalfToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? AlmanacElement.almanacAPowerHalfType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "almanacAPowerHalf : "
                    + getAlmanacAPowerHalf().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 7);

          @Override public boolean isExplicitlySet() {
            return getAlmanacOmega0() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getAlmanacOmega0();
          }

          @Override public void setToNewInstance() {
            setAlmanacOmega0ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? AlmanacElement.almanacOmega0Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "almanacOmega0 : "
                    + getAlmanacOmega0().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 8);

          @Override public boolean isExplicitlySet() {
            return getAlmanacW() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getAlmanacW();
          }

          @Override public void setToNewInstance() {
            setAlmanacWToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? AlmanacElement.almanacWType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "almanacW : "
                    + getAlmanacW().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 9);

          @Override public boolean isExplicitlySet() {
            return getAlmanacM0() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getAlmanacM0();
          }

          @Override public void setToNewInstance() {
            setAlmanacM0ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? AlmanacElement.almanacM0Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "almanacM0 : "
                    + getAlmanacM0().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 10);

          @Override public boolean isExplicitlySet() {
            return getAlmanacAF0() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getAlmanacAF0();
          }

          @Override public void setToNewInstance() {
            setAlmanacAF0ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? AlmanacElement.almanacAF0Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "almanacAF0 : "
                    + getAlmanacAF0().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 11);

          @Override public boolean isExplicitlySet() {
            return getAlmanacAF1() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getAlmanacAF1();
          }

          @Override public void setToNewInstance() {
            setAlmanacAF1ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? AlmanacElement.almanacAF1Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "almanacAF1 : "
                    + getAlmanacAF1().toIndentedString(indent);
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
public static class almanacEType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_almanacEType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public almanacEType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("65535"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_almanacEType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_almanacEType != null) {
      return ImmutableList.of(TAG_almanacEType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new almanacEType from encoded stream.
   */
  public static almanacEType fromPerUnaligned(byte[] encodedBytes) {
    almanacEType result = new almanacEType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new almanacEType from encoded stream.
   */
  public static almanacEType fromPerAligned(byte[] encodedBytes) {
    almanacEType result = new almanacEType();
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
    return "almanacEType = " + getInteger() + ";\n";
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
public static class alamanacToaType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_alamanacToaType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public alamanacToaType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("255"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_alamanacToaType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_alamanacToaType != null) {
      return ImmutableList.of(TAG_alamanacToaType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new alamanacToaType from encoded stream.
   */
  public static alamanacToaType fromPerUnaligned(byte[] encodedBytes) {
    alamanacToaType result = new alamanacToaType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new alamanacToaType from encoded stream.
   */
  public static alamanacToaType fromPerAligned(byte[] encodedBytes) {
    alamanacToaType result = new alamanacToaType();
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
    return "alamanacToaType = " + getInteger() + ";\n";
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
public static class almanacKsiiType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_almanacKsiiType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public almanacKsiiType() {
    super();
    setValueRange(new java.math.BigInteger("-32768"), new java.math.BigInteger("32767"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_almanacKsiiType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_almanacKsiiType != null) {
      return ImmutableList.of(TAG_almanacKsiiType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new almanacKsiiType from encoded stream.
   */
  public static almanacKsiiType fromPerUnaligned(byte[] encodedBytes) {
    almanacKsiiType result = new almanacKsiiType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new almanacKsiiType from encoded stream.
   */
  public static almanacKsiiType fromPerAligned(byte[] encodedBytes) {
    almanacKsiiType result = new almanacKsiiType();
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
    return "almanacKsiiType = " + getInteger() + ";\n";
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
public static class almanacOmegaDotType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_almanacOmegaDotType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public almanacOmegaDotType() {
    super();
    setValueRange(new java.math.BigInteger("-32768"), new java.math.BigInteger("32767"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_almanacOmegaDotType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_almanacOmegaDotType != null) {
      return ImmutableList.of(TAG_almanacOmegaDotType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new almanacOmegaDotType from encoded stream.
   */
  public static almanacOmegaDotType fromPerUnaligned(byte[] encodedBytes) {
    almanacOmegaDotType result = new almanacOmegaDotType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new almanacOmegaDotType from encoded stream.
   */
  public static almanacOmegaDotType fromPerAligned(byte[] encodedBytes) {
    almanacOmegaDotType result = new almanacOmegaDotType();
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
    return "almanacOmegaDotType = " + getInteger() + ";\n";
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
public static class almanacSVhealthType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_almanacSVhealthType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public almanacSVhealthType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("255"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_almanacSVhealthType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_almanacSVhealthType != null) {
      return ImmutableList.of(TAG_almanacSVhealthType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new almanacSVhealthType from encoded stream.
   */
  public static almanacSVhealthType fromPerUnaligned(byte[] encodedBytes) {
    almanacSVhealthType result = new almanacSVhealthType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new almanacSVhealthType from encoded stream.
   */
  public static almanacSVhealthType fromPerAligned(byte[] encodedBytes) {
    almanacSVhealthType result = new almanacSVhealthType();
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
    return "almanacSVhealthType = " + getInteger() + ";\n";
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
public static class almanacAPowerHalfType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_almanacAPowerHalfType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public almanacAPowerHalfType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("16777215"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_almanacAPowerHalfType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_almanacAPowerHalfType != null) {
      return ImmutableList.of(TAG_almanacAPowerHalfType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new almanacAPowerHalfType from encoded stream.
   */
  public static almanacAPowerHalfType fromPerUnaligned(byte[] encodedBytes) {
    almanacAPowerHalfType result = new almanacAPowerHalfType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new almanacAPowerHalfType from encoded stream.
   */
  public static almanacAPowerHalfType fromPerAligned(byte[] encodedBytes) {
    almanacAPowerHalfType result = new almanacAPowerHalfType();
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
    return "almanacAPowerHalfType = " + getInteger() + ";\n";
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
public static class almanacOmega0Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_almanacOmega0Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public almanacOmega0Type() {
    super();
    setValueRange(new java.math.BigInteger("-8388608"), new java.math.BigInteger("8388607"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_almanacOmega0Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_almanacOmega0Type != null) {
      return ImmutableList.of(TAG_almanacOmega0Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new almanacOmega0Type from encoded stream.
   */
  public static almanacOmega0Type fromPerUnaligned(byte[] encodedBytes) {
    almanacOmega0Type result = new almanacOmega0Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new almanacOmega0Type from encoded stream.
   */
  public static almanacOmega0Type fromPerAligned(byte[] encodedBytes) {
    almanacOmega0Type result = new almanacOmega0Type();
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
    return "almanacOmega0Type = " + getInteger() + ";\n";
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
public static class almanacWType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_almanacWType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public almanacWType() {
    super();
    setValueRange(new java.math.BigInteger("-8388608"), new java.math.BigInteger("8388607"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_almanacWType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_almanacWType != null) {
      return ImmutableList.of(TAG_almanacWType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new almanacWType from encoded stream.
   */
  public static almanacWType fromPerUnaligned(byte[] encodedBytes) {
    almanacWType result = new almanacWType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new almanacWType from encoded stream.
   */
  public static almanacWType fromPerAligned(byte[] encodedBytes) {
    almanacWType result = new almanacWType();
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
    return "almanacWType = " + getInteger() + ";\n";
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
public static class almanacM0Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_almanacM0Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public almanacM0Type() {
    super();
    setValueRange(new java.math.BigInteger("-8388608"), new java.math.BigInteger("8388607"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_almanacM0Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_almanacM0Type != null) {
      return ImmutableList.of(TAG_almanacM0Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new almanacM0Type from encoded stream.
   */
  public static almanacM0Type fromPerUnaligned(byte[] encodedBytes) {
    almanacM0Type result = new almanacM0Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new almanacM0Type from encoded stream.
   */
  public static almanacM0Type fromPerAligned(byte[] encodedBytes) {
    almanacM0Type result = new almanacM0Type();
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
    return "almanacM0Type = " + getInteger() + ";\n";
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
public static class almanacAF0Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_almanacAF0Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public almanacAF0Type() {
    super();
    setValueRange(new java.math.BigInteger("-1024"), new java.math.BigInteger("1023"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_almanacAF0Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_almanacAF0Type != null) {
      return ImmutableList.of(TAG_almanacAF0Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new almanacAF0Type from encoded stream.
   */
  public static almanacAF0Type fromPerUnaligned(byte[] encodedBytes) {
    almanacAF0Type result = new almanacAF0Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new almanacAF0Type from encoded stream.
   */
  public static almanacAF0Type fromPerAligned(byte[] encodedBytes) {
    almanacAF0Type result = new almanacAF0Type();
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
    return "almanacAF0Type = " + getInteger() + ";\n";
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
public static class almanacAF1Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_almanacAF1Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public almanacAF1Type() {
    super();
    setValueRange(new java.math.BigInteger("-1024"), new java.math.BigInteger("1023"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_almanacAF1Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_almanacAF1Type != null) {
      return ImmutableList.of(TAG_almanacAF1Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new almanacAF1Type from encoded stream.
   */
  public static almanacAF1Type fromPerUnaligned(byte[] encodedBytes) {
    almanacAF1Type result = new almanacAF1Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new almanacAF1Type from encoded stream.
   */
  public static almanacAF1Type fromPerAligned(byte[] encodedBytes) {
    almanacAF1Type result = new almanacAF1Type();
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
    return "almanacAF1Type = " + getInteger() + ";\n";
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
    builder.append("AlmanacElement = {\n");
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
