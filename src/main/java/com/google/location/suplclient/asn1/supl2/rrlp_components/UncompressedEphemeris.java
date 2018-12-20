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
public  class UncompressedEphemeris extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_UncompressedEphemeris
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public UncompressedEphemeris() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_UncompressedEphemeris;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_UncompressedEphemeris != null) {
      return ImmutableList.of(TAG_UncompressedEphemeris);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new UncompressedEphemeris from encoded stream.
   */
  public static UncompressedEphemeris fromPerUnaligned(byte[] encodedBytes) {
    UncompressedEphemeris result = new UncompressedEphemeris();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new UncompressedEphemeris from encoded stream.
   */
  public static UncompressedEphemeris fromPerAligned(byte[] encodedBytes) {
    UncompressedEphemeris result = new UncompressedEphemeris();
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

  
  private UncompressedEphemeris.ephemCodeOnL2Type ephemCodeOnL2_;
  public UncompressedEphemeris.ephemCodeOnL2Type getEphemCodeOnL2() {
    return ephemCodeOnL2_;
  }
  /**
   * @throws ClassCastException if value is not a UncompressedEphemeris.ephemCodeOnL2Type
   */
  public void setEphemCodeOnL2(Asn1Object value) {
    this.ephemCodeOnL2_ = (UncompressedEphemeris.ephemCodeOnL2Type) value;
  }
  public UncompressedEphemeris.ephemCodeOnL2Type setEphemCodeOnL2ToNewInstance() {
    ephemCodeOnL2_ = new UncompressedEphemeris.ephemCodeOnL2Type();
    return ephemCodeOnL2_;
  }
  
  private UncompressedEphemeris.ephemURAType ephemURA_;
  public UncompressedEphemeris.ephemURAType getEphemURA() {
    return ephemURA_;
  }
  /**
   * @throws ClassCastException if value is not a UncompressedEphemeris.ephemURAType
   */
  public void setEphemURA(Asn1Object value) {
    this.ephemURA_ = (UncompressedEphemeris.ephemURAType) value;
  }
  public UncompressedEphemeris.ephemURAType setEphemURAToNewInstance() {
    ephemURA_ = new UncompressedEphemeris.ephemURAType();
    return ephemURA_;
  }
  
  private UncompressedEphemeris.ephemSVhealthType ephemSVhealth_;
  public UncompressedEphemeris.ephemSVhealthType getEphemSVhealth() {
    return ephemSVhealth_;
  }
  /**
   * @throws ClassCastException if value is not a UncompressedEphemeris.ephemSVhealthType
   */
  public void setEphemSVhealth(Asn1Object value) {
    this.ephemSVhealth_ = (UncompressedEphemeris.ephemSVhealthType) value;
  }
  public UncompressedEphemeris.ephemSVhealthType setEphemSVhealthToNewInstance() {
    ephemSVhealth_ = new UncompressedEphemeris.ephemSVhealthType();
    return ephemSVhealth_;
  }
  
  private UncompressedEphemeris.ephemIODCType ephemIODC_;
  public UncompressedEphemeris.ephemIODCType getEphemIODC() {
    return ephemIODC_;
  }
  /**
   * @throws ClassCastException if value is not a UncompressedEphemeris.ephemIODCType
   */
  public void setEphemIODC(Asn1Object value) {
    this.ephemIODC_ = (UncompressedEphemeris.ephemIODCType) value;
  }
  public UncompressedEphemeris.ephemIODCType setEphemIODCToNewInstance() {
    ephemIODC_ = new UncompressedEphemeris.ephemIODCType();
    return ephemIODC_;
  }
  
  private UncompressedEphemeris.ephemL2PflagType ephemL2Pflag_;
  public UncompressedEphemeris.ephemL2PflagType getEphemL2Pflag() {
    return ephemL2Pflag_;
  }
  /**
   * @throws ClassCastException if value is not a UncompressedEphemeris.ephemL2PflagType
   */
  public void setEphemL2Pflag(Asn1Object value) {
    this.ephemL2Pflag_ = (UncompressedEphemeris.ephemL2PflagType) value;
  }
  public UncompressedEphemeris.ephemL2PflagType setEphemL2PflagToNewInstance() {
    ephemL2Pflag_ = new UncompressedEphemeris.ephemL2PflagType();
    return ephemL2Pflag_;
  }
  
  private EphemerisSubframe1Reserved ephemSF1Rsvd_;
  public EphemerisSubframe1Reserved getEphemSF1Rsvd() {
    return ephemSF1Rsvd_;
  }
  /**
   * @throws ClassCastException if value is not a EphemerisSubframe1Reserved
   */
  public void setEphemSF1Rsvd(Asn1Object value) {
    this.ephemSF1Rsvd_ = (EphemerisSubframe1Reserved) value;
  }
  public EphemerisSubframe1Reserved setEphemSF1RsvdToNewInstance() {
    ephemSF1Rsvd_ = new EphemerisSubframe1Reserved();
    return ephemSF1Rsvd_;
  }
  
  private UncompressedEphemeris.ephemTgdType ephemTgd_;
  public UncompressedEphemeris.ephemTgdType getEphemTgd() {
    return ephemTgd_;
  }
  /**
   * @throws ClassCastException if value is not a UncompressedEphemeris.ephemTgdType
   */
  public void setEphemTgd(Asn1Object value) {
    this.ephemTgd_ = (UncompressedEphemeris.ephemTgdType) value;
  }
  public UncompressedEphemeris.ephemTgdType setEphemTgdToNewInstance() {
    ephemTgd_ = new UncompressedEphemeris.ephemTgdType();
    return ephemTgd_;
  }
  
  private UncompressedEphemeris.ephemTocType ephemToc_;
  public UncompressedEphemeris.ephemTocType getEphemToc() {
    return ephemToc_;
  }
  /**
   * @throws ClassCastException if value is not a UncompressedEphemeris.ephemTocType
   */
  public void setEphemToc(Asn1Object value) {
    this.ephemToc_ = (UncompressedEphemeris.ephemTocType) value;
  }
  public UncompressedEphemeris.ephemTocType setEphemTocToNewInstance() {
    ephemToc_ = new UncompressedEphemeris.ephemTocType();
    return ephemToc_;
  }
  
  private UncompressedEphemeris.ephemAF2Type ephemAF2_;
  public UncompressedEphemeris.ephemAF2Type getEphemAF2() {
    return ephemAF2_;
  }
  /**
   * @throws ClassCastException if value is not a UncompressedEphemeris.ephemAF2Type
   */
  public void setEphemAF2(Asn1Object value) {
    this.ephemAF2_ = (UncompressedEphemeris.ephemAF2Type) value;
  }
  public UncompressedEphemeris.ephemAF2Type setEphemAF2ToNewInstance() {
    ephemAF2_ = new UncompressedEphemeris.ephemAF2Type();
    return ephemAF2_;
  }
  
  private UncompressedEphemeris.ephemAF1Type ephemAF1_;
  public UncompressedEphemeris.ephemAF1Type getEphemAF1() {
    return ephemAF1_;
  }
  /**
   * @throws ClassCastException if value is not a UncompressedEphemeris.ephemAF1Type
   */
  public void setEphemAF1(Asn1Object value) {
    this.ephemAF1_ = (UncompressedEphemeris.ephemAF1Type) value;
  }
  public UncompressedEphemeris.ephemAF1Type setEphemAF1ToNewInstance() {
    ephemAF1_ = new UncompressedEphemeris.ephemAF1Type();
    return ephemAF1_;
  }
  
  private UncompressedEphemeris.ephemAF0Type ephemAF0_;
  public UncompressedEphemeris.ephemAF0Type getEphemAF0() {
    return ephemAF0_;
  }
  /**
   * @throws ClassCastException if value is not a UncompressedEphemeris.ephemAF0Type
   */
  public void setEphemAF0(Asn1Object value) {
    this.ephemAF0_ = (UncompressedEphemeris.ephemAF0Type) value;
  }
  public UncompressedEphemeris.ephemAF0Type setEphemAF0ToNewInstance() {
    ephemAF0_ = new UncompressedEphemeris.ephemAF0Type();
    return ephemAF0_;
  }
  
  private UncompressedEphemeris.ephemCrsType ephemCrs_;
  public UncompressedEphemeris.ephemCrsType getEphemCrs() {
    return ephemCrs_;
  }
  /**
   * @throws ClassCastException if value is not a UncompressedEphemeris.ephemCrsType
   */
  public void setEphemCrs(Asn1Object value) {
    this.ephemCrs_ = (UncompressedEphemeris.ephemCrsType) value;
  }
  public UncompressedEphemeris.ephemCrsType setEphemCrsToNewInstance() {
    ephemCrs_ = new UncompressedEphemeris.ephemCrsType();
    return ephemCrs_;
  }
  
  private UncompressedEphemeris.ephemDeltaNType ephemDeltaN_;
  public UncompressedEphemeris.ephemDeltaNType getEphemDeltaN() {
    return ephemDeltaN_;
  }
  /**
   * @throws ClassCastException if value is not a UncompressedEphemeris.ephemDeltaNType
   */
  public void setEphemDeltaN(Asn1Object value) {
    this.ephemDeltaN_ = (UncompressedEphemeris.ephemDeltaNType) value;
  }
  public UncompressedEphemeris.ephemDeltaNType setEphemDeltaNToNewInstance() {
    ephemDeltaN_ = new UncompressedEphemeris.ephemDeltaNType();
    return ephemDeltaN_;
  }
  
  private UncompressedEphemeris.ephemM0Type ephemM0_;
  public UncompressedEphemeris.ephemM0Type getEphemM0() {
    return ephemM0_;
  }
  /**
   * @throws ClassCastException if value is not a UncompressedEphemeris.ephemM0Type
   */
  public void setEphemM0(Asn1Object value) {
    this.ephemM0_ = (UncompressedEphemeris.ephemM0Type) value;
  }
  public UncompressedEphemeris.ephemM0Type setEphemM0ToNewInstance() {
    ephemM0_ = new UncompressedEphemeris.ephemM0Type();
    return ephemM0_;
  }
  
  private UncompressedEphemeris.ephemCucType ephemCuc_;
  public UncompressedEphemeris.ephemCucType getEphemCuc() {
    return ephemCuc_;
  }
  /**
   * @throws ClassCastException if value is not a UncompressedEphemeris.ephemCucType
   */
  public void setEphemCuc(Asn1Object value) {
    this.ephemCuc_ = (UncompressedEphemeris.ephemCucType) value;
  }
  public UncompressedEphemeris.ephemCucType setEphemCucToNewInstance() {
    ephemCuc_ = new UncompressedEphemeris.ephemCucType();
    return ephemCuc_;
  }
  
  private UncompressedEphemeris.ephemEType ephemE_;
  public UncompressedEphemeris.ephemEType getEphemE() {
    return ephemE_;
  }
  /**
   * @throws ClassCastException if value is not a UncompressedEphemeris.ephemEType
   */
  public void setEphemE(Asn1Object value) {
    this.ephemE_ = (UncompressedEphemeris.ephemEType) value;
  }
  public UncompressedEphemeris.ephemEType setEphemEToNewInstance() {
    ephemE_ = new UncompressedEphemeris.ephemEType();
    return ephemE_;
  }
  
  private UncompressedEphemeris.ephemCusType ephemCus_;
  public UncompressedEphemeris.ephemCusType getEphemCus() {
    return ephemCus_;
  }
  /**
   * @throws ClassCastException if value is not a UncompressedEphemeris.ephemCusType
   */
  public void setEphemCus(Asn1Object value) {
    this.ephemCus_ = (UncompressedEphemeris.ephemCusType) value;
  }
  public UncompressedEphemeris.ephemCusType setEphemCusToNewInstance() {
    ephemCus_ = new UncompressedEphemeris.ephemCusType();
    return ephemCus_;
  }
  
  private UncompressedEphemeris.ephemAPowerHalfType ephemAPowerHalf_;
  public UncompressedEphemeris.ephemAPowerHalfType getEphemAPowerHalf() {
    return ephemAPowerHalf_;
  }
  /**
   * @throws ClassCastException if value is not a UncompressedEphemeris.ephemAPowerHalfType
   */
  public void setEphemAPowerHalf(Asn1Object value) {
    this.ephemAPowerHalf_ = (UncompressedEphemeris.ephemAPowerHalfType) value;
  }
  public UncompressedEphemeris.ephemAPowerHalfType setEphemAPowerHalfToNewInstance() {
    ephemAPowerHalf_ = new UncompressedEphemeris.ephemAPowerHalfType();
    return ephemAPowerHalf_;
  }
  
  private UncompressedEphemeris.ephemToeType ephemToe_;
  public UncompressedEphemeris.ephemToeType getEphemToe() {
    return ephemToe_;
  }
  /**
   * @throws ClassCastException if value is not a UncompressedEphemeris.ephemToeType
   */
  public void setEphemToe(Asn1Object value) {
    this.ephemToe_ = (UncompressedEphemeris.ephemToeType) value;
  }
  public UncompressedEphemeris.ephemToeType setEphemToeToNewInstance() {
    ephemToe_ = new UncompressedEphemeris.ephemToeType();
    return ephemToe_;
  }
  
  private UncompressedEphemeris.ephemFitFlagType ephemFitFlag_;
  public UncompressedEphemeris.ephemFitFlagType getEphemFitFlag() {
    return ephemFitFlag_;
  }
  /**
   * @throws ClassCastException if value is not a UncompressedEphemeris.ephemFitFlagType
   */
  public void setEphemFitFlag(Asn1Object value) {
    this.ephemFitFlag_ = (UncompressedEphemeris.ephemFitFlagType) value;
  }
  public UncompressedEphemeris.ephemFitFlagType setEphemFitFlagToNewInstance() {
    ephemFitFlag_ = new UncompressedEphemeris.ephemFitFlagType();
    return ephemFitFlag_;
  }
  
  private UncompressedEphemeris.ephemAODAType ephemAODA_;
  public UncompressedEphemeris.ephemAODAType getEphemAODA() {
    return ephemAODA_;
  }
  /**
   * @throws ClassCastException if value is not a UncompressedEphemeris.ephemAODAType
   */
  public void setEphemAODA(Asn1Object value) {
    this.ephemAODA_ = (UncompressedEphemeris.ephemAODAType) value;
  }
  public UncompressedEphemeris.ephemAODAType setEphemAODAToNewInstance() {
    ephemAODA_ = new UncompressedEphemeris.ephemAODAType();
    return ephemAODA_;
  }
  
  private UncompressedEphemeris.ephemCicType ephemCic_;
  public UncompressedEphemeris.ephemCicType getEphemCic() {
    return ephemCic_;
  }
  /**
   * @throws ClassCastException if value is not a UncompressedEphemeris.ephemCicType
   */
  public void setEphemCic(Asn1Object value) {
    this.ephemCic_ = (UncompressedEphemeris.ephemCicType) value;
  }
  public UncompressedEphemeris.ephemCicType setEphemCicToNewInstance() {
    ephemCic_ = new UncompressedEphemeris.ephemCicType();
    return ephemCic_;
  }
  
  private UncompressedEphemeris.ephemOmegaA0Type ephemOmegaA0_;
  public UncompressedEphemeris.ephemOmegaA0Type getEphemOmegaA0() {
    return ephemOmegaA0_;
  }
  /**
   * @throws ClassCastException if value is not a UncompressedEphemeris.ephemOmegaA0Type
   */
  public void setEphemOmegaA0(Asn1Object value) {
    this.ephemOmegaA0_ = (UncompressedEphemeris.ephemOmegaA0Type) value;
  }
  public UncompressedEphemeris.ephemOmegaA0Type setEphemOmegaA0ToNewInstance() {
    ephemOmegaA0_ = new UncompressedEphemeris.ephemOmegaA0Type();
    return ephemOmegaA0_;
  }
  
  private UncompressedEphemeris.ephemCisType ephemCis_;
  public UncompressedEphemeris.ephemCisType getEphemCis() {
    return ephemCis_;
  }
  /**
   * @throws ClassCastException if value is not a UncompressedEphemeris.ephemCisType
   */
  public void setEphemCis(Asn1Object value) {
    this.ephemCis_ = (UncompressedEphemeris.ephemCisType) value;
  }
  public UncompressedEphemeris.ephemCisType setEphemCisToNewInstance() {
    ephemCis_ = new UncompressedEphemeris.ephemCisType();
    return ephemCis_;
  }
  
  private UncompressedEphemeris.ephemI0Type ephemI0_;
  public UncompressedEphemeris.ephemI0Type getEphemI0() {
    return ephemI0_;
  }
  /**
   * @throws ClassCastException if value is not a UncompressedEphemeris.ephemI0Type
   */
  public void setEphemI0(Asn1Object value) {
    this.ephemI0_ = (UncompressedEphemeris.ephemI0Type) value;
  }
  public UncompressedEphemeris.ephemI0Type setEphemI0ToNewInstance() {
    ephemI0_ = new UncompressedEphemeris.ephemI0Type();
    return ephemI0_;
  }
  
  private UncompressedEphemeris.ephemCrcType ephemCrc_;
  public UncompressedEphemeris.ephemCrcType getEphemCrc() {
    return ephemCrc_;
  }
  /**
   * @throws ClassCastException if value is not a UncompressedEphemeris.ephemCrcType
   */
  public void setEphemCrc(Asn1Object value) {
    this.ephemCrc_ = (UncompressedEphemeris.ephemCrcType) value;
  }
  public UncompressedEphemeris.ephemCrcType setEphemCrcToNewInstance() {
    ephemCrc_ = new UncompressedEphemeris.ephemCrcType();
    return ephemCrc_;
  }
  
  private UncompressedEphemeris.ephemWType ephemW_;
  public UncompressedEphemeris.ephemWType getEphemW() {
    return ephemW_;
  }
  /**
   * @throws ClassCastException if value is not a UncompressedEphemeris.ephemWType
   */
  public void setEphemW(Asn1Object value) {
    this.ephemW_ = (UncompressedEphemeris.ephemWType) value;
  }
  public UncompressedEphemeris.ephemWType setEphemWToNewInstance() {
    ephemW_ = new UncompressedEphemeris.ephemWType();
    return ephemW_;
  }
  
  private UncompressedEphemeris.ephemOmegaADotType ephemOmegaADot_;
  public UncompressedEphemeris.ephemOmegaADotType getEphemOmegaADot() {
    return ephemOmegaADot_;
  }
  /**
   * @throws ClassCastException if value is not a UncompressedEphemeris.ephemOmegaADotType
   */
  public void setEphemOmegaADot(Asn1Object value) {
    this.ephemOmegaADot_ = (UncompressedEphemeris.ephemOmegaADotType) value;
  }
  public UncompressedEphemeris.ephemOmegaADotType setEphemOmegaADotToNewInstance() {
    ephemOmegaADot_ = new UncompressedEphemeris.ephemOmegaADotType();
    return ephemOmegaADot_;
  }
  
  private UncompressedEphemeris.ephemIDotType ephemIDot_;
  public UncompressedEphemeris.ephemIDotType getEphemIDot() {
    return ephemIDot_;
  }
  /**
   * @throws ClassCastException if value is not a UncompressedEphemeris.ephemIDotType
   */
  public void setEphemIDot(Asn1Object value) {
    this.ephemIDot_ = (UncompressedEphemeris.ephemIDotType) value;
  }
  public UncompressedEphemeris.ephemIDotType setEphemIDotToNewInstance() {
    ephemIDot_ = new UncompressedEphemeris.ephemIDotType();
    return ephemIDot_;
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
            return tag == null ? UncompressedEphemeris.ephemCodeOnL2Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return getEphemURA() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getEphemURA();
          }

          @Override public void setToNewInstance() {
            setEphemURAToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UncompressedEphemeris.ephemURAType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ephemURA : "
                    + getEphemURA().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getEphemSVhealth() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getEphemSVhealth();
          }

          @Override public void setToNewInstance() {
            setEphemSVhealthToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UncompressedEphemeris.ephemSVhealthType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ephemSVhealth : "
                    + getEphemSVhealth().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getEphemIODC() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getEphemIODC();
          }

          @Override public void setToNewInstance() {
            setEphemIODCToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UncompressedEphemeris.ephemIODCType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ephemIODC : "
                    + getEphemIODC().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

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
            return tag == null ? UncompressedEphemeris.ephemL2PflagType.getPossibleFirstTags() : ImmutableList.of(tag);
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
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

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
            return tag == null ? EphemerisSubframe1Reserved.getPossibleFirstTags() : ImmutableList.of(tag);
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
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getEphemTgd() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getEphemTgd();
          }

          @Override public void setToNewInstance() {
            setEphemTgdToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UncompressedEphemeris.ephemTgdType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ephemTgd : "
                    + getEphemTgd().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 7);

          @Override public boolean isExplicitlySet() {
            return getEphemToc() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getEphemToc();
          }

          @Override public void setToNewInstance() {
            setEphemTocToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UncompressedEphemeris.ephemTocType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ephemToc : "
                    + getEphemToc().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 8);

          @Override public boolean isExplicitlySet() {
            return getEphemAF2() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getEphemAF2();
          }

          @Override public void setToNewInstance() {
            setEphemAF2ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UncompressedEphemeris.ephemAF2Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ephemAF2 : "
                    + getEphemAF2().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 9);

          @Override public boolean isExplicitlySet() {
            return getEphemAF1() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getEphemAF1();
          }

          @Override public void setToNewInstance() {
            setEphemAF1ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UncompressedEphemeris.ephemAF1Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ephemAF1 : "
                    + getEphemAF1().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 10);

          @Override public boolean isExplicitlySet() {
            return getEphemAF0() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getEphemAF0();
          }

          @Override public void setToNewInstance() {
            setEphemAF0ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UncompressedEphemeris.ephemAF0Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ephemAF0 : "
                    + getEphemAF0().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 11);

          @Override public boolean isExplicitlySet() {
            return getEphemCrs() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getEphemCrs();
          }

          @Override public void setToNewInstance() {
            setEphemCrsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UncompressedEphemeris.ephemCrsType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ephemCrs : "
                    + getEphemCrs().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 12);

          @Override public boolean isExplicitlySet() {
            return getEphemDeltaN() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getEphemDeltaN();
          }

          @Override public void setToNewInstance() {
            setEphemDeltaNToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UncompressedEphemeris.ephemDeltaNType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ephemDeltaN : "
                    + getEphemDeltaN().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 13);

          @Override public boolean isExplicitlySet() {
            return getEphemM0() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getEphemM0();
          }

          @Override public void setToNewInstance() {
            setEphemM0ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UncompressedEphemeris.ephemM0Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ephemM0 : "
                    + getEphemM0().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 14);

          @Override public boolean isExplicitlySet() {
            return getEphemCuc() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getEphemCuc();
          }

          @Override public void setToNewInstance() {
            setEphemCucToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UncompressedEphemeris.ephemCucType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ephemCuc : "
                    + getEphemCuc().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 15);

          @Override public boolean isExplicitlySet() {
            return getEphemE() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getEphemE();
          }

          @Override public void setToNewInstance() {
            setEphemEToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UncompressedEphemeris.ephemEType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ephemE : "
                    + getEphemE().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 16);

          @Override public boolean isExplicitlySet() {
            return getEphemCus() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getEphemCus();
          }

          @Override public void setToNewInstance() {
            setEphemCusToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UncompressedEphemeris.ephemCusType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ephemCus : "
                    + getEphemCus().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 17);

          @Override public boolean isExplicitlySet() {
            return getEphemAPowerHalf() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getEphemAPowerHalf();
          }

          @Override public void setToNewInstance() {
            setEphemAPowerHalfToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UncompressedEphemeris.ephemAPowerHalfType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ephemAPowerHalf : "
                    + getEphemAPowerHalf().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 18);

          @Override public boolean isExplicitlySet() {
            return getEphemToe() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getEphemToe();
          }

          @Override public void setToNewInstance() {
            setEphemToeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UncompressedEphemeris.ephemToeType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ephemToe : "
                    + getEphemToe().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 19);

          @Override public boolean isExplicitlySet() {
            return getEphemFitFlag() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getEphemFitFlag();
          }

          @Override public void setToNewInstance() {
            setEphemFitFlagToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UncompressedEphemeris.ephemFitFlagType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ephemFitFlag : "
                    + getEphemFitFlag().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 20);

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
            return tag == null ? UncompressedEphemeris.ephemAODAType.getPossibleFirstTags() : ImmutableList.of(tag);
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
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 21);

          @Override public boolean isExplicitlySet() {
            return getEphemCic() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getEphemCic();
          }

          @Override public void setToNewInstance() {
            setEphemCicToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UncompressedEphemeris.ephemCicType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ephemCic : "
                    + getEphemCic().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 22);

          @Override public boolean isExplicitlySet() {
            return getEphemOmegaA0() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getEphemOmegaA0();
          }

          @Override public void setToNewInstance() {
            setEphemOmegaA0ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UncompressedEphemeris.ephemOmegaA0Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ephemOmegaA0 : "
                    + getEphemOmegaA0().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 23);

          @Override public boolean isExplicitlySet() {
            return getEphemCis() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getEphemCis();
          }

          @Override public void setToNewInstance() {
            setEphemCisToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UncompressedEphemeris.ephemCisType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ephemCis : "
                    + getEphemCis().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 24);

          @Override public boolean isExplicitlySet() {
            return getEphemI0() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getEphemI0();
          }

          @Override public void setToNewInstance() {
            setEphemI0ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UncompressedEphemeris.ephemI0Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ephemI0 : "
                    + getEphemI0().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 25);

          @Override public boolean isExplicitlySet() {
            return getEphemCrc() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getEphemCrc();
          }

          @Override public void setToNewInstance() {
            setEphemCrcToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UncompressedEphemeris.ephemCrcType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ephemCrc : "
                    + getEphemCrc().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 26);

          @Override public boolean isExplicitlySet() {
            return getEphemW() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getEphemW();
          }

          @Override public void setToNewInstance() {
            setEphemWToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UncompressedEphemeris.ephemWType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ephemW : "
                    + getEphemW().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 27);

          @Override public boolean isExplicitlySet() {
            return getEphemOmegaADot() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getEphemOmegaADot();
          }

          @Override public void setToNewInstance() {
            setEphemOmegaADotToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UncompressedEphemeris.ephemOmegaADotType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ephemOmegaADot : "
                    + getEphemOmegaADot().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 28);

          @Override public boolean isExplicitlySet() {
            return getEphemIDot() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getEphemIDot();
          }

          @Override public void setToNewInstance() {
            setEphemIDotToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UncompressedEphemeris.ephemIDotType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ephemIDot : "
                    + getEphemIDot().toIndentedString(indent);
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
public static class ephemURAType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ephemURAType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ephemURAType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("15"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ephemURAType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ephemURAType != null) {
      return ImmutableList.of(TAG_ephemURAType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ephemURAType from encoded stream.
   */
  public static ephemURAType fromPerUnaligned(byte[] encodedBytes) {
    ephemURAType result = new ephemURAType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ephemURAType from encoded stream.
   */
  public static ephemURAType fromPerAligned(byte[] encodedBytes) {
    ephemURAType result = new ephemURAType();
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
    return "ephemURAType = " + getInteger() + ";\n";
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
public static class ephemSVhealthType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ephemSVhealthType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ephemSVhealthType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("63"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ephemSVhealthType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ephemSVhealthType != null) {
      return ImmutableList.of(TAG_ephemSVhealthType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ephemSVhealthType from encoded stream.
   */
  public static ephemSVhealthType fromPerUnaligned(byte[] encodedBytes) {
    ephemSVhealthType result = new ephemSVhealthType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ephemSVhealthType from encoded stream.
   */
  public static ephemSVhealthType fromPerAligned(byte[] encodedBytes) {
    ephemSVhealthType result = new ephemSVhealthType();
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
    return "ephemSVhealthType = " + getInteger() + ";\n";
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
public static class ephemIODCType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ephemIODCType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ephemIODCType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("1023"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ephemIODCType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ephemIODCType != null) {
      return ImmutableList.of(TAG_ephemIODCType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ephemIODCType from encoded stream.
   */
  public static ephemIODCType fromPerUnaligned(byte[] encodedBytes) {
    ephemIODCType result = new ephemIODCType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ephemIODCType from encoded stream.
   */
  public static ephemIODCType fromPerAligned(byte[] encodedBytes) {
    ephemIODCType result = new ephemIODCType();
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
    return "ephemIODCType = " + getInteger() + ";\n";
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
public static class ephemTgdType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ephemTgdType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ephemTgdType() {
    super();
    setValueRange(new java.math.BigInteger("-128"), new java.math.BigInteger("127"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ephemTgdType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ephemTgdType != null) {
      return ImmutableList.of(TAG_ephemTgdType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ephemTgdType from encoded stream.
   */
  public static ephemTgdType fromPerUnaligned(byte[] encodedBytes) {
    ephemTgdType result = new ephemTgdType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ephemTgdType from encoded stream.
   */
  public static ephemTgdType fromPerAligned(byte[] encodedBytes) {
    ephemTgdType result = new ephemTgdType();
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
    return "ephemTgdType = " + getInteger() + ";\n";
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
public static class ephemTocType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ephemTocType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ephemTocType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("37799"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ephemTocType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ephemTocType != null) {
      return ImmutableList.of(TAG_ephemTocType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ephemTocType from encoded stream.
   */
  public static ephemTocType fromPerUnaligned(byte[] encodedBytes) {
    ephemTocType result = new ephemTocType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ephemTocType from encoded stream.
   */
  public static ephemTocType fromPerAligned(byte[] encodedBytes) {
    ephemTocType result = new ephemTocType();
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
    return "ephemTocType = " + getInteger() + ";\n";
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
public static class ephemAF2Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ephemAF2Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ephemAF2Type() {
    super();
    setValueRange(new java.math.BigInteger("-128"), new java.math.BigInteger("127"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ephemAF2Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ephemAF2Type != null) {
      return ImmutableList.of(TAG_ephemAF2Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ephemAF2Type from encoded stream.
   */
  public static ephemAF2Type fromPerUnaligned(byte[] encodedBytes) {
    ephemAF2Type result = new ephemAF2Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ephemAF2Type from encoded stream.
   */
  public static ephemAF2Type fromPerAligned(byte[] encodedBytes) {
    ephemAF2Type result = new ephemAF2Type();
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
    return "ephemAF2Type = " + getInteger() + ";\n";
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
public static class ephemAF1Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ephemAF1Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ephemAF1Type() {
    super();
    setValueRange(new java.math.BigInteger("-32768"), new java.math.BigInteger("32767"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ephemAF1Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ephemAF1Type != null) {
      return ImmutableList.of(TAG_ephemAF1Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ephemAF1Type from encoded stream.
   */
  public static ephemAF1Type fromPerUnaligned(byte[] encodedBytes) {
    ephemAF1Type result = new ephemAF1Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ephemAF1Type from encoded stream.
   */
  public static ephemAF1Type fromPerAligned(byte[] encodedBytes) {
    ephemAF1Type result = new ephemAF1Type();
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
    return "ephemAF1Type = " + getInteger() + ";\n";
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
public static class ephemAF0Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ephemAF0Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ephemAF0Type() {
    super();
    setValueRange(new java.math.BigInteger("-2097152"), new java.math.BigInteger("2097151"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ephemAF0Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ephemAF0Type != null) {
      return ImmutableList.of(TAG_ephemAF0Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ephemAF0Type from encoded stream.
   */
  public static ephemAF0Type fromPerUnaligned(byte[] encodedBytes) {
    ephemAF0Type result = new ephemAF0Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ephemAF0Type from encoded stream.
   */
  public static ephemAF0Type fromPerAligned(byte[] encodedBytes) {
    ephemAF0Type result = new ephemAF0Type();
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
    return "ephemAF0Type = " + getInteger() + ";\n";
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
public static class ephemCrsType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ephemCrsType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ephemCrsType() {
    super();
    setValueRange(new java.math.BigInteger("-32768"), new java.math.BigInteger("32767"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ephemCrsType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ephemCrsType != null) {
      return ImmutableList.of(TAG_ephemCrsType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ephemCrsType from encoded stream.
   */
  public static ephemCrsType fromPerUnaligned(byte[] encodedBytes) {
    ephemCrsType result = new ephemCrsType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ephemCrsType from encoded stream.
   */
  public static ephemCrsType fromPerAligned(byte[] encodedBytes) {
    ephemCrsType result = new ephemCrsType();
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
    return "ephemCrsType = " + getInteger() + ";\n";
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
public static class ephemDeltaNType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ephemDeltaNType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ephemDeltaNType() {
    super();
    setValueRange(new java.math.BigInteger("-32768"), new java.math.BigInteger("32767"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ephemDeltaNType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ephemDeltaNType != null) {
      return ImmutableList.of(TAG_ephemDeltaNType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ephemDeltaNType from encoded stream.
   */
  public static ephemDeltaNType fromPerUnaligned(byte[] encodedBytes) {
    ephemDeltaNType result = new ephemDeltaNType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ephemDeltaNType from encoded stream.
   */
  public static ephemDeltaNType fromPerAligned(byte[] encodedBytes) {
    ephemDeltaNType result = new ephemDeltaNType();
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
    return "ephemDeltaNType = " + getInteger() + ";\n";
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
public static class ephemM0Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ephemM0Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ephemM0Type() {
    super();
    setValueRange(new java.math.BigInteger("-2147483648"), new java.math.BigInteger("2147483647"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ephemM0Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ephemM0Type != null) {
      return ImmutableList.of(TAG_ephemM0Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ephemM0Type from encoded stream.
   */
  public static ephemM0Type fromPerUnaligned(byte[] encodedBytes) {
    ephemM0Type result = new ephemM0Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ephemM0Type from encoded stream.
   */
  public static ephemM0Type fromPerAligned(byte[] encodedBytes) {
    ephemM0Type result = new ephemM0Type();
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
    return "ephemM0Type = " + getInteger() + ";\n";
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
public static class ephemCucType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ephemCucType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ephemCucType() {
    super();
    setValueRange(new java.math.BigInteger("-32768"), new java.math.BigInteger("32767"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ephemCucType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ephemCucType != null) {
      return ImmutableList.of(TAG_ephemCucType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ephemCucType from encoded stream.
   */
  public static ephemCucType fromPerUnaligned(byte[] encodedBytes) {
    ephemCucType result = new ephemCucType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ephemCucType from encoded stream.
   */
  public static ephemCucType fromPerAligned(byte[] encodedBytes) {
    ephemCucType result = new ephemCucType();
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
    return "ephemCucType = " + getInteger() + ";\n";
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
public static class ephemEType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ephemEType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ephemEType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("4294967295"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ephemEType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ephemEType != null) {
      return ImmutableList.of(TAG_ephemEType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ephemEType from encoded stream.
   */
  public static ephemEType fromPerUnaligned(byte[] encodedBytes) {
    ephemEType result = new ephemEType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ephemEType from encoded stream.
   */
  public static ephemEType fromPerAligned(byte[] encodedBytes) {
    ephemEType result = new ephemEType();
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
    return "ephemEType = " + getInteger() + ";\n";
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
public static class ephemCusType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ephemCusType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ephemCusType() {
    super();
    setValueRange(new java.math.BigInteger("-32768"), new java.math.BigInteger("32767"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ephemCusType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ephemCusType != null) {
      return ImmutableList.of(TAG_ephemCusType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ephemCusType from encoded stream.
   */
  public static ephemCusType fromPerUnaligned(byte[] encodedBytes) {
    ephemCusType result = new ephemCusType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ephemCusType from encoded stream.
   */
  public static ephemCusType fromPerAligned(byte[] encodedBytes) {
    ephemCusType result = new ephemCusType();
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
    return "ephemCusType = " + getInteger() + ";\n";
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
public static class ephemAPowerHalfType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ephemAPowerHalfType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ephemAPowerHalfType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("4294967295"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ephemAPowerHalfType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ephemAPowerHalfType != null) {
      return ImmutableList.of(TAG_ephemAPowerHalfType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ephemAPowerHalfType from encoded stream.
   */
  public static ephemAPowerHalfType fromPerUnaligned(byte[] encodedBytes) {
    ephemAPowerHalfType result = new ephemAPowerHalfType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ephemAPowerHalfType from encoded stream.
   */
  public static ephemAPowerHalfType fromPerAligned(byte[] encodedBytes) {
    ephemAPowerHalfType result = new ephemAPowerHalfType();
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
    return "ephemAPowerHalfType = " + getInteger() + ";\n";
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
public static class ephemToeType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ephemToeType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ephemToeType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("37799"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ephemToeType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ephemToeType != null) {
      return ImmutableList.of(TAG_ephemToeType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ephemToeType from encoded stream.
   */
  public static ephemToeType fromPerUnaligned(byte[] encodedBytes) {
    ephemToeType result = new ephemToeType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ephemToeType from encoded stream.
   */
  public static ephemToeType fromPerAligned(byte[] encodedBytes) {
    ephemToeType result = new ephemToeType();
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
    return "ephemToeType = " + getInteger() + ";\n";
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
public static class ephemFitFlagType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ephemFitFlagType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ephemFitFlagType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("1"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ephemFitFlagType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ephemFitFlagType != null) {
      return ImmutableList.of(TAG_ephemFitFlagType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ephemFitFlagType from encoded stream.
   */
  public static ephemFitFlagType fromPerUnaligned(byte[] encodedBytes) {
    ephemFitFlagType result = new ephemFitFlagType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ephemFitFlagType from encoded stream.
   */
  public static ephemFitFlagType fromPerAligned(byte[] encodedBytes) {
    ephemFitFlagType result = new ephemFitFlagType();
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
    return "ephemFitFlagType = " + getInteger() + ";\n";
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

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class ephemCicType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ephemCicType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ephemCicType() {
    super();
    setValueRange(new java.math.BigInteger("-32768"), new java.math.BigInteger("32767"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ephemCicType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ephemCicType != null) {
      return ImmutableList.of(TAG_ephemCicType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ephemCicType from encoded stream.
   */
  public static ephemCicType fromPerUnaligned(byte[] encodedBytes) {
    ephemCicType result = new ephemCicType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ephemCicType from encoded stream.
   */
  public static ephemCicType fromPerAligned(byte[] encodedBytes) {
    ephemCicType result = new ephemCicType();
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
    return "ephemCicType = " + getInteger() + ";\n";
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
public static class ephemOmegaA0Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ephemOmegaA0Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ephemOmegaA0Type() {
    super();
    setValueRange(new java.math.BigInteger("-2147483648"), new java.math.BigInteger("2147483647"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ephemOmegaA0Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ephemOmegaA0Type != null) {
      return ImmutableList.of(TAG_ephemOmegaA0Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ephemOmegaA0Type from encoded stream.
   */
  public static ephemOmegaA0Type fromPerUnaligned(byte[] encodedBytes) {
    ephemOmegaA0Type result = new ephemOmegaA0Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ephemOmegaA0Type from encoded stream.
   */
  public static ephemOmegaA0Type fromPerAligned(byte[] encodedBytes) {
    ephemOmegaA0Type result = new ephemOmegaA0Type();
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
    return "ephemOmegaA0Type = " + getInteger() + ";\n";
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
public static class ephemCisType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ephemCisType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ephemCisType() {
    super();
    setValueRange(new java.math.BigInteger("-32768"), new java.math.BigInteger("32767"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ephemCisType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ephemCisType != null) {
      return ImmutableList.of(TAG_ephemCisType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ephemCisType from encoded stream.
   */
  public static ephemCisType fromPerUnaligned(byte[] encodedBytes) {
    ephemCisType result = new ephemCisType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ephemCisType from encoded stream.
   */
  public static ephemCisType fromPerAligned(byte[] encodedBytes) {
    ephemCisType result = new ephemCisType();
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
    return "ephemCisType = " + getInteger() + ";\n";
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
public static class ephemI0Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ephemI0Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ephemI0Type() {
    super();
    setValueRange(new java.math.BigInteger("-2147483648"), new java.math.BigInteger("2147483647"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ephemI0Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ephemI0Type != null) {
      return ImmutableList.of(TAG_ephemI0Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ephemI0Type from encoded stream.
   */
  public static ephemI0Type fromPerUnaligned(byte[] encodedBytes) {
    ephemI0Type result = new ephemI0Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ephemI0Type from encoded stream.
   */
  public static ephemI0Type fromPerAligned(byte[] encodedBytes) {
    ephemI0Type result = new ephemI0Type();
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
    return "ephemI0Type = " + getInteger() + ";\n";
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
public static class ephemCrcType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ephemCrcType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ephemCrcType() {
    super();
    setValueRange(new java.math.BigInteger("-32768"), new java.math.BigInteger("32767"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ephemCrcType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ephemCrcType != null) {
      return ImmutableList.of(TAG_ephemCrcType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ephemCrcType from encoded stream.
   */
  public static ephemCrcType fromPerUnaligned(byte[] encodedBytes) {
    ephemCrcType result = new ephemCrcType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ephemCrcType from encoded stream.
   */
  public static ephemCrcType fromPerAligned(byte[] encodedBytes) {
    ephemCrcType result = new ephemCrcType();
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
    return "ephemCrcType = " + getInteger() + ";\n";
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
public static class ephemWType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ephemWType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ephemWType() {
    super();
    setValueRange(new java.math.BigInteger("-2147483648"), new java.math.BigInteger("2147483647"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ephemWType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ephemWType != null) {
      return ImmutableList.of(TAG_ephemWType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ephemWType from encoded stream.
   */
  public static ephemWType fromPerUnaligned(byte[] encodedBytes) {
    ephemWType result = new ephemWType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ephemWType from encoded stream.
   */
  public static ephemWType fromPerAligned(byte[] encodedBytes) {
    ephemWType result = new ephemWType();
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
    return "ephemWType = " + getInteger() + ";\n";
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
public static class ephemOmegaADotType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ephemOmegaADotType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ephemOmegaADotType() {
    super();
    setValueRange(new java.math.BigInteger("-8388608"), new java.math.BigInteger("8388607"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ephemOmegaADotType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ephemOmegaADotType != null) {
      return ImmutableList.of(TAG_ephemOmegaADotType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ephemOmegaADotType from encoded stream.
   */
  public static ephemOmegaADotType fromPerUnaligned(byte[] encodedBytes) {
    ephemOmegaADotType result = new ephemOmegaADotType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ephemOmegaADotType from encoded stream.
   */
  public static ephemOmegaADotType fromPerAligned(byte[] encodedBytes) {
    ephemOmegaADotType result = new ephemOmegaADotType();
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
    return "ephemOmegaADotType = " + getInteger() + ";\n";
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
public static class ephemIDotType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ephemIDotType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ephemIDotType() {
    super();
    setValueRange(new java.math.BigInteger("-8192"), new java.math.BigInteger("8191"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ephemIDotType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ephemIDotType != null) {
      return ImmutableList.of(TAG_ephemIDotType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ephemIDotType from encoded stream.
   */
  public static ephemIDotType fromPerUnaligned(byte[] encodedBytes) {
    ephemIDotType result = new ephemIDotType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ephemIDotType from encoded stream.
   */
  public static ephemIDotType fromPerAligned(byte[] encodedBytes) {
    ephemIDotType result = new ephemIDotType();
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
    return "ephemIDotType = " + getInteger() + ";\n";
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
    builder.append("UncompressedEphemeris = {\n");
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
