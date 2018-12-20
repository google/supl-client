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
public  class AlmanacNAV_KeplerianSet extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_AlmanacNAV_KeplerianSet
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public AlmanacNAV_KeplerianSet() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_AlmanacNAV_KeplerianSet;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_AlmanacNAV_KeplerianSet != null) {
      return ImmutableList.of(TAG_AlmanacNAV_KeplerianSet);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new AlmanacNAV_KeplerianSet from encoded stream.
   */
  public static AlmanacNAV_KeplerianSet fromPerUnaligned(byte[] encodedBytes) {
    AlmanacNAV_KeplerianSet result = new AlmanacNAV_KeplerianSet();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new AlmanacNAV_KeplerianSet from encoded stream.
   */
  public static AlmanacNAV_KeplerianSet fromPerAligned(byte[] encodedBytes) {
    AlmanacNAV_KeplerianSet result = new AlmanacNAV_KeplerianSet();
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

  
  private SV_ID svID_;
  public SV_ID getSvID() {
    return svID_;
  }
  /**
   * @throws ClassCastException if value is not a SV_ID
   */
  public void setSvID(Asn1Object value) {
    this.svID_ = (SV_ID) value;
  }
  public SV_ID setSvIDToNewInstance() {
    svID_ = new SV_ID();
    return svID_;
  }
  
  private AlmanacNAV_KeplerianSet.navAlmEType navAlmE_;
  public AlmanacNAV_KeplerianSet.navAlmEType getNavAlmE() {
    return navAlmE_;
  }
  /**
   * @throws ClassCastException if value is not a AlmanacNAV_KeplerianSet.navAlmEType
   */
  public void setNavAlmE(Asn1Object value) {
    this.navAlmE_ = (AlmanacNAV_KeplerianSet.navAlmEType) value;
  }
  public AlmanacNAV_KeplerianSet.navAlmEType setNavAlmEToNewInstance() {
    navAlmE_ = new AlmanacNAV_KeplerianSet.navAlmEType();
    return navAlmE_;
  }
  
  private AlmanacNAV_KeplerianSet.navAlmDeltaIType navAlmDeltaI_;
  public AlmanacNAV_KeplerianSet.navAlmDeltaIType getNavAlmDeltaI() {
    return navAlmDeltaI_;
  }
  /**
   * @throws ClassCastException if value is not a AlmanacNAV_KeplerianSet.navAlmDeltaIType
   */
  public void setNavAlmDeltaI(Asn1Object value) {
    this.navAlmDeltaI_ = (AlmanacNAV_KeplerianSet.navAlmDeltaIType) value;
  }
  public AlmanacNAV_KeplerianSet.navAlmDeltaIType setNavAlmDeltaIToNewInstance() {
    navAlmDeltaI_ = new AlmanacNAV_KeplerianSet.navAlmDeltaIType();
    return navAlmDeltaI_;
  }
  
  private AlmanacNAV_KeplerianSet.navAlmOMEGADOTType navAlmOMEGADOT_;
  public AlmanacNAV_KeplerianSet.navAlmOMEGADOTType getNavAlmOMEGADOT() {
    return navAlmOMEGADOT_;
  }
  /**
   * @throws ClassCastException if value is not a AlmanacNAV_KeplerianSet.navAlmOMEGADOTType
   */
  public void setNavAlmOMEGADOT(Asn1Object value) {
    this.navAlmOMEGADOT_ = (AlmanacNAV_KeplerianSet.navAlmOMEGADOTType) value;
  }
  public AlmanacNAV_KeplerianSet.navAlmOMEGADOTType setNavAlmOMEGADOTToNewInstance() {
    navAlmOMEGADOT_ = new AlmanacNAV_KeplerianSet.navAlmOMEGADOTType();
    return navAlmOMEGADOT_;
  }
  
  private AlmanacNAV_KeplerianSet.navAlmSVHealthType navAlmSVHealth_;
  public AlmanacNAV_KeplerianSet.navAlmSVHealthType getNavAlmSVHealth() {
    return navAlmSVHealth_;
  }
  /**
   * @throws ClassCastException if value is not a AlmanacNAV_KeplerianSet.navAlmSVHealthType
   */
  public void setNavAlmSVHealth(Asn1Object value) {
    this.navAlmSVHealth_ = (AlmanacNAV_KeplerianSet.navAlmSVHealthType) value;
  }
  public AlmanacNAV_KeplerianSet.navAlmSVHealthType setNavAlmSVHealthToNewInstance() {
    navAlmSVHealth_ = new AlmanacNAV_KeplerianSet.navAlmSVHealthType();
    return navAlmSVHealth_;
  }
  
  private AlmanacNAV_KeplerianSet.navAlmSqrtAType navAlmSqrtA_;
  public AlmanacNAV_KeplerianSet.navAlmSqrtAType getNavAlmSqrtA() {
    return navAlmSqrtA_;
  }
  /**
   * @throws ClassCastException if value is not a AlmanacNAV_KeplerianSet.navAlmSqrtAType
   */
  public void setNavAlmSqrtA(Asn1Object value) {
    this.navAlmSqrtA_ = (AlmanacNAV_KeplerianSet.navAlmSqrtAType) value;
  }
  public AlmanacNAV_KeplerianSet.navAlmSqrtAType setNavAlmSqrtAToNewInstance() {
    navAlmSqrtA_ = new AlmanacNAV_KeplerianSet.navAlmSqrtAType();
    return navAlmSqrtA_;
  }
  
  private AlmanacNAV_KeplerianSet.navAlmOMEGAoType navAlmOMEGAo_;
  public AlmanacNAV_KeplerianSet.navAlmOMEGAoType getNavAlmOMEGAo() {
    return navAlmOMEGAo_;
  }
  /**
   * @throws ClassCastException if value is not a AlmanacNAV_KeplerianSet.navAlmOMEGAoType
   */
  public void setNavAlmOMEGAo(Asn1Object value) {
    this.navAlmOMEGAo_ = (AlmanacNAV_KeplerianSet.navAlmOMEGAoType) value;
  }
  public AlmanacNAV_KeplerianSet.navAlmOMEGAoType setNavAlmOMEGAoToNewInstance() {
    navAlmOMEGAo_ = new AlmanacNAV_KeplerianSet.navAlmOMEGAoType();
    return navAlmOMEGAo_;
  }
  
  private AlmanacNAV_KeplerianSet.navAlmOmegaType navAlmOmega_;
  public AlmanacNAV_KeplerianSet.navAlmOmegaType getNavAlmOmega() {
    return navAlmOmega_;
  }
  /**
   * @throws ClassCastException if value is not a AlmanacNAV_KeplerianSet.navAlmOmegaType
   */
  public void setNavAlmOmega(Asn1Object value) {
    this.navAlmOmega_ = (AlmanacNAV_KeplerianSet.navAlmOmegaType) value;
  }
  public AlmanacNAV_KeplerianSet.navAlmOmegaType setNavAlmOmegaToNewInstance() {
    navAlmOmega_ = new AlmanacNAV_KeplerianSet.navAlmOmegaType();
    return navAlmOmega_;
  }
  
  private AlmanacNAV_KeplerianSet.navAlmMoType navAlmMo_;
  public AlmanacNAV_KeplerianSet.navAlmMoType getNavAlmMo() {
    return navAlmMo_;
  }
  /**
   * @throws ClassCastException if value is not a AlmanacNAV_KeplerianSet.navAlmMoType
   */
  public void setNavAlmMo(Asn1Object value) {
    this.navAlmMo_ = (AlmanacNAV_KeplerianSet.navAlmMoType) value;
  }
  public AlmanacNAV_KeplerianSet.navAlmMoType setNavAlmMoToNewInstance() {
    navAlmMo_ = new AlmanacNAV_KeplerianSet.navAlmMoType();
    return navAlmMo_;
  }
  
  private AlmanacNAV_KeplerianSet.navAlmaf0Type navAlmaf0_;
  public AlmanacNAV_KeplerianSet.navAlmaf0Type getNavAlmaf0() {
    return navAlmaf0_;
  }
  /**
   * @throws ClassCastException if value is not a AlmanacNAV_KeplerianSet.navAlmaf0Type
   */
  public void setNavAlmaf0(Asn1Object value) {
    this.navAlmaf0_ = (AlmanacNAV_KeplerianSet.navAlmaf0Type) value;
  }
  public AlmanacNAV_KeplerianSet.navAlmaf0Type setNavAlmaf0ToNewInstance() {
    navAlmaf0_ = new AlmanacNAV_KeplerianSet.navAlmaf0Type();
    return navAlmaf0_;
  }
  
  private AlmanacNAV_KeplerianSet.navAlmaf1Type navAlmaf1_;
  public AlmanacNAV_KeplerianSet.navAlmaf1Type getNavAlmaf1() {
    return navAlmaf1_;
  }
  /**
   * @throws ClassCastException if value is not a AlmanacNAV_KeplerianSet.navAlmaf1Type
   */
  public void setNavAlmaf1(Asn1Object value) {
    this.navAlmaf1_ = (AlmanacNAV_KeplerianSet.navAlmaf1Type) value;
  }
  public AlmanacNAV_KeplerianSet.navAlmaf1Type setNavAlmaf1ToNewInstance() {
    navAlmaf1_ = new AlmanacNAV_KeplerianSet.navAlmaf1Type();
    return navAlmaf1_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getSvID() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getSvID();
          }

          @Override public void setToNewInstance() {
            setSvIDToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SV_ID.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "svID : "
                    + getSvID().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getNavAlmE() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getNavAlmE();
          }

          @Override public void setToNewInstance() {
            setNavAlmEToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? AlmanacNAV_KeplerianSet.navAlmEType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "navAlmE : "
                    + getNavAlmE().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getNavAlmDeltaI() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getNavAlmDeltaI();
          }

          @Override public void setToNewInstance() {
            setNavAlmDeltaIToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? AlmanacNAV_KeplerianSet.navAlmDeltaIType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "navAlmDeltaI : "
                    + getNavAlmDeltaI().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getNavAlmOMEGADOT() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getNavAlmOMEGADOT();
          }

          @Override public void setToNewInstance() {
            setNavAlmOMEGADOTToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? AlmanacNAV_KeplerianSet.navAlmOMEGADOTType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "navAlmOMEGADOT : "
                    + getNavAlmOMEGADOT().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getNavAlmSVHealth() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getNavAlmSVHealth();
          }

          @Override public void setToNewInstance() {
            setNavAlmSVHealthToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? AlmanacNAV_KeplerianSet.navAlmSVHealthType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "navAlmSVHealth : "
                    + getNavAlmSVHealth().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getNavAlmSqrtA() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getNavAlmSqrtA();
          }

          @Override public void setToNewInstance() {
            setNavAlmSqrtAToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? AlmanacNAV_KeplerianSet.navAlmSqrtAType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "navAlmSqrtA : "
                    + getNavAlmSqrtA().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getNavAlmOMEGAo() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getNavAlmOMEGAo();
          }

          @Override public void setToNewInstance() {
            setNavAlmOMEGAoToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? AlmanacNAV_KeplerianSet.navAlmOMEGAoType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "navAlmOMEGAo : "
                    + getNavAlmOMEGAo().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 7);

          @Override public boolean isExplicitlySet() {
            return getNavAlmOmega() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getNavAlmOmega();
          }

          @Override public void setToNewInstance() {
            setNavAlmOmegaToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? AlmanacNAV_KeplerianSet.navAlmOmegaType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "navAlmOmega : "
                    + getNavAlmOmega().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 8);

          @Override public boolean isExplicitlySet() {
            return getNavAlmMo() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getNavAlmMo();
          }

          @Override public void setToNewInstance() {
            setNavAlmMoToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? AlmanacNAV_KeplerianSet.navAlmMoType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "navAlmMo : "
                    + getNavAlmMo().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 9);

          @Override public boolean isExplicitlySet() {
            return getNavAlmaf0() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getNavAlmaf0();
          }

          @Override public void setToNewInstance() {
            setNavAlmaf0ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? AlmanacNAV_KeplerianSet.navAlmaf0Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "navAlmaf0 : "
                    + getNavAlmaf0().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 10);

          @Override public boolean isExplicitlySet() {
            return getNavAlmaf1() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getNavAlmaf1();
          }

          @Override public void setToNewInstance() {
            setNavAlmaf1ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? AlmanacNAV_KeplerianSet.navAlmaf1Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "navAlmaf1 : "
                    + getNavAlmaf1().toIndentedString(indent);
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
public static class navAlmEType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_navAlmEType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public navAlmEType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("65535"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_navAlmEType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_navAlmEType != null) {
      return ImmutableList.of(TAG_navAlmEType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new navAlmEType from encoded stream.
   */
  public static navAlmEType fromPerUnaligned(byte[] encodedBytes) {
    navAlmEType result = new navAlmEType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new navAlmEType from encoded stream.
   */
  public static navAlmEType fromPerAligned(byte[] encodedBytes) {
    navAlmEType result = new navAlmEType();
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
    return "navAlmEType = " + getInteger() + ";\n";
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
public static class navAlmDeltaIType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_navAlmDeltaIType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public navAlmDeltaIType() {
    super();
    setValueRange(new java.math.BigInteger("-32768"), new java.math.BigInteger("32767"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_navAlmDeltaIType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_navAlmDeltaIType != null) {
      return ImmutableList.of(TAG_navAlmDeltaIType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new navAlmDeltaIType from encoded stream.
   */
  public static navAlmDeltaIType fromPerUnaligned(byte[] encodedBytes) {
    navAlmDeltaIType result = new navAlmDeltaIType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new navAlmDeltaIType from encoded stream.
   */
  public static navAlmDeltaIType fromPerAligned(byte[] encodedBytes) {
    navAlmDeltaIType result = new navAlmDeltaIType();
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
    return "navAlmDeltaIType = " + getInteger() + ";\n";
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
public static class navAlmOMEGADOTType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_navAlmOMEGADOTType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public navAlmOMEGADOTType() {
    super();
    setValueRange(new java.math.BigInteger("-32768"), new java.math.BigInteger("32767"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_navAlmOMEGADOTType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_navAlmOMEGADOTType != null) {
      return ImmutableList.of(TAG_navAlmOMEGADOTType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new navAlmOMEGADOTType from encoded stream.
   */
  public static navAlmOMEGADOTType fromPerUnaligned(byte[] encodedBytes) {
    navAlmOMEGADOTType result = new navAlmOMEGADOTType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new navAlmOMEGADOTType from encoded stream.
   */
  public static navAlmOMEGADOTType fromPerAligned(byte[] encodedBytes) {
    navAlmOMEGADOTType result = new navAlmOMEGADOTType();
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
    return "navAlmOMEGADOTType = " + getInteger() + ";\n";
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
public static class navAlmSVHealthType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_navAlmSVHealthType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public navAlmSVHealthType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("255"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_navAlmSVHealthType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_navAlmSVHealthType != null) {
      return ImmutableList.of(TAG_navAlmSVHealthType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new navAlmSVHealthType from encoded stream.
   */
  public static navAlmSVHealthType fromPerUnaligned(byte[] encodedBytes) {
    navAlmSVHealthType result = new navAlmSVHealthType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new navAlmSVHealthType from encoded stream.
   */
  public static navAlmSVHealthType fromPerAligned(byte[] encodedBytes) {
    navAlmSVHealthType result = new navAlmSVHealthType();
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
    return "navAlmSVHealthType = " + getInteger() + ";\n";
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
public static class navAlmSqrtAType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_navAlmSqrtAType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public navAlmSqrtAType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("16777215"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_navAlmSqrtAType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_navAlmSqrtAType != null) {
      return ImmutableList.of(TAG_navAlmSqrtAType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new navAlmSqrtAType from encoded stream.
   */
  public static navAlmSqrtAType fromPerUnaligned(byte[] encodedBytes) {
    navAlmSqrtAType result = new navAlmSqrtAType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new navAlmSqrtAType from encoded stream.
   */
  public static navAlmSqrtAType fromPerAligned(byte[] encodedBytes) {
    navAlmSqrtAType result = new navAlmSqrtAType();
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
    return "navAlmSqrtAType = " + getInteger() + ";\n";
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
public static class navAlmOMEGAoType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_navAlmOMEGAoType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public navAlmOMEGAoType() {
    super();
    setValueRange(new java.math.BigInteger("-8388608"), new java.math.BigInteger("8388607"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_navAlmOMEGAoType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_navAlmOMEGAoType != null) {
      return ImmutableList.of(TAG_navAlmOMEGAoType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new navAlmOMEGAoType from encoded stream.
   */
  public static navAlmOMEGAoType fromPerUnaligned(byte[] encodedBytes) {
    navAlmOMEGAoType result = new navAlmOMEGAoType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new navAlmOMEGAoType from encoded stream.
   */
  public static navAlmOMEGAoType fromPerAligned(byte[] encodedBytes) {
    navAlmOMEGAoType result = new navAlmOMEGAoType();
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
    return "navAlmOMEGAoType = " + getInteger() + ";\n";
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
public static class navAlmOmegaType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_navAlmOmegaType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public navAlmOmegaType() {
    super();
    setValueRange(new java.math.BigInteger("-8388608"), new java.math.BigInteger("8388607"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_navAlmOmegaType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_navAlmOmegaType != null) {
      return ImmutableList.of(TAG_navAlmOmegaType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new navAlmOmegaType from encoded stream.
   */
  public static navAlmOmegaType fromPerUnaligned(byte[] encodedBytes) {
    navAlmOmegaType result = new navAlmOmegaType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new navAlmOmegaType from encoded stream.
   */
  public static navAlmOmegaType fromPerAligned(byte[] encodedBytes) {
    navAlmOmegaType result = new navAlmOmegaType();
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
    return "navAlmOmegaType = " + getInteger() + ";\n";
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
public static class navAlmMoType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_navAlmMoType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public navAlmMoType() {
    super();
    setValueRange(new java.math.BigInteger("-8388608"), new java.math.BigInteger("8388607"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_navAlmMoType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_navAlmMoType != null) {
      return ImmutableList.of(TAG_navAlmMoType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new navAlmMoType from encoded stream.
   */
  public static navAlmMoType fromPerUnaligned(byte[] encodedBytes) {
    navAlmMoType result = new navAlmMoType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new navAlmMoType from encoded stream.
   */
  public static navAlmMoType fromPerAligned(byte[] encodedBytes) {
    navAlmMoType result = new navAlmMoType();
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
    return "navAlmMoType = " + getInteger() + ";\n";
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
public static class navAlmaf0Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_navAlmaf0Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public navAlmaf0Type() {
    super();
    setValueRange(new java.math.BigInteger("-1024"), new java.math.BigInteger("1023"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_navAlmaf0Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_navAlmaf0Type != null) {
      return ImmutableList.of(TAG_navAlmaf0Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new navAlmaf0Type from encoded stream.
   */
  public static navAlmaf0Type fromPerUnaligned(byte[] encodedBytes) {
    navAlmaf0Type result = new navAlmaf0Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new navAlmaf0Type from encoded stream.
   */
  public static navAlmaf0Type fromPerAligned(byte[] encodedBytes) {
    navAlmaf0Type result = new navAlmaf0Type();
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
    return "navAlmaf0Type = " + getInteger() + ";\n";
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
public static class navAlmaf1Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_navAlmaf1Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public navAlmaf1Type() {
    super();
    setValueRange(new java.math.BigInteger("-1024"), new java.math.BigInteger("1023"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_navAlmaf1Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_navAlmaf1Type != null) {
      return ImmutableList.of(TAG_navAlmaf1Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new navAlmaf1Type from encoded stream.
   */
  public static navAlmaf1Type fromPerUnaligned(byte[] encodedBytes) {
    navAlmaf1Type result = new navAlmaf1Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new navAlmaf1Type from encoded stream.
   */
  public static navAlmaf1Type fromPerAligned(byte[] encodedBytes) {
    navAlmaf1Type result = new navAlmaf1Type();
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
    return "navAlmaf1Type = " + getInteger() + ";\n";
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
    builder.append("AlmanacNAV_KeplerianSet = {\n");
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
