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
public  class ReferenceNavModel extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_ReferenceNavModel
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ReferenceNavModel() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ReferenceNavModel;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ReferenceNavModel != null) {
      return ImmutableList.of(TAG_ReferenceNavModel);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ReferenceNavModel from encoded stream.
   */
  public static ReferenceNavModel fromPerUnaligned(byte[] encodedBytes) {
    ReferenceNavModel result = new ReferenceNavModel();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ReferenceNavModel from encoded stream.
   */
  public static ReferenceNavModel fromPerAligned(byte[] encodedBytes) {
    ReferenceNavModel result = new ReferenceNavModel();
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

  
  private ReferenceNavModel.keplerToeType keplerToe_;
  public ReferenceNavModel.keplerToeType getKeplerToe() {
    return keplerToe_;
  }
  /**
   * @throws ClassCastException if value is not a ReferenceNavModel.keplerToeType
   */
  public void setKeplerToe(Asn1Object value) {
    this.keplerToe_ = (ReferenceNavModel.keplerToeType) value;
  }
  public ReferenceNavModel.keplerToeType setKeplerToeToNewInstance() {
    keplerToe_ = new ReferenceNavModel.keplerToeType();
    return keplerToe_;
  }
  
  private ReferenceNavModel.keplerWType keplerW_;
  public ReferenceNavModel.keplerWType getKeplerW() {
    return keplerW_;
  }
  /**
   * @throws ClassCastException if value is not a ReferenceNavModel.keplerWType
   */
  public void setKeplerW(Asn1Object value) {
    this.keplerW_ = (ReferenceNavModel.keplerWType) value;
  }
  public ReferenceNavModel.keplerWType setKeplerWToNewInstance() {
    keplerW_ = new ReferenceNavModel.keplerWType();
    return keplerW_;
  }
  
  private ReferenceNavModel.keplerDeltaNType keplerDeltaN_;
  public ReferenceNavModel.keplerDeltaNType getKeplerDeltaN() {
    return keplerDeltaN_;
  }
  /**
   * @throws ClassCastException if value is not a ReferenceNavModel.keplerDeltaNType
   */
  public void setKeplerDeltaN(Asn1Object value) {
    this.keplerDeltaN_ = (ReferenceNavModel.keplerDeltaNType) value;
  }
  public ReferenceNavModel.keplerDeltaNType setKeplerDeltaNToNewInstance() {
    keplerDeltaN_ = new ReferenceNavModel.keplerDeltaNType();
    return keplerDeltaN_;
  }
  
  private ReferenceNavModel.keplerM0Type keplerM0_;
  public ReferenceNavModel.keplerM0Type getKeplerM0() {
    return keplerM0_;
  }
  /**
   * @throws ClassCastException if value is not a ReferenceNavModel.keplerM0Type
   */
  public void setKeplerM0(Asn1Object value) {
    this.keplerM0_ = (ReferenceNavModel.keplerM0Type) value;
  }
  public ReferenceNavModel.keplerM0Type setKeplerM0ToNewInstance() {
    keplerM0_ = new ReferenceNavModel.keplerM0Type();
    return keplerM0_;
  }
  
  private ReferenceNavModel.keplerOmegaDotType keplerOmegaDot_;
  public ReferenceNavModel.keplerOmegaDotType getKeplerOmegaDot() {
    return keplerOmegaDot_;
  }
  /**
   * @throws ClassCastException if value is not a ReferenceNavModel.keplerOmegaDotType
   */
  public void setKeplerOmegaDot(Asn1Object value) {
    this.keplerOmegaDot_ = (ReferenceNavModel.keplerOmegaDotType) value;
  }
  public ReferenceNavModel.keplerOmegaDotType setKeplerOmegaDotToNewInstance() {
    keplerOmegaDot_ = new ReferenceNavModel.keplerOmegaDotType();
    return keplerOmegaDot_;
  }
  
  private ReferenceNavModel.keplerEType keplerE_;
  public ReferenceNavModel.keplerEType getKeplerE() {
    return keplerE_;
  }
  /**
   * @throws ClassCastException if value is not a ReferenceNavModel.keplerEType
   */
  public void setKeplerE(Asn1Object value) {
    this.keplerE_ = (ReferenceNavModel.keplerEType) value;
  }
  public ReferenceNavModel.keplerEType setKeplerEToNewInstance() {
    keplerE_ = new ReferenceNavModel.keplerEType();
    return keplerE_;
  }
  
  private ReferenceNavModel.keplerIDotType keplerIDot_;
  public ReferenceNavModel.keplerIDotType getKeplerIDot() {
    return keplerIDot_;
  }
  /**
   * @throws ClassCastException if value is not a ReferenceNavModel.keplerIDotType
   */
  public void setKeplerIDot(Asn1Object value) {
    this.keplerIDot_ = (ReferenceNavModel.keplerIDotType) value;
  }
  public ReferenceNavModel.keplerIDotType setKeplerIDotToNewInstance() {
    keplerIDot_ = new ReferenceNavModel.keplerIDotType();
    return keplerIDot_;
  }
  
  private ReferenceNavModel.keplerAPowerHalfType keplerAPowerHalf_;
  public ReferenceNavModel.keplerAPowerHalfType getKeplerAPowerHalf() {
    return keplerAPowerHalf_;
  }
  /**
   * @throws ClassCastException if value is not a ReferenceNavModel.keplerAPowerHalfType
   */
  public void setKeplerAPowerHalf(Asn1Object value) {
    this.keplerAPowerHalf_ = (ReferenceNavModel.keplerAPowerHalfType) value;
  }
  public ReferenceNavModel.keplerAPowerHalfType setKeplerAPowerHalfToNewInstance() {
    keplerAPowerHalf_ = new ReferenceNavModel.keplerAPowerHalfType();
    return keplerAPowerHalf_;
  }
  
  private ReferenceNavModel.keplerI0Type keplerI0_;
  public ReferenceNavModel.keplerI0Type getKeplerI0() {
    return keplerI0_;
  }
  /**
   * @throws ClassCastException if value is not a ReferenceNavModel.keplerI0Type
   */
  public void setKeplerI0(Asn1Object value) {
    this.keplerI0_ = (ReferenceNavModel.keplerI0Type) value;
  }
  public ReferenceNavModel.keplerI0Type setKeplerI0ToNewInstance() {
    keplerI0_ = new ReferenceNavModel.keplerI0Type();
    return keplerI0_;
  }
  
  private ReferenceNavModel.keplerOmega0Type keplerOmega0_;
  public ReferenceNavModel.keplerOmega0Type getKeplerOmega0() {
    return keplerOmega0_;
  }
  /**
   * @throws ClassCastException if value is not a ReferenceNavModel.keplerOmega0Type
   */
  public void setKeplerOmega0(Asn1Object value) {
    this.keplerOmega0_ = (ReferenceNavModel.keplerOmega0Type) value;
  }
  public ReferenceNavModel.keplerOmega0Type setKeplerOmega0ToNewInstance() {
    keplerOmega0_ = new ReferenceNavModel.keplerOmega0Type();
    return keplerOmega0_;
  }
  
  private ReferenceNavModel.keplerCrsType keplerCrs_;
  public ReferenceNavModel.keplerCrsType getKeplerCrs() {
    return keplerCrs_;
  }
  /**
   * @throws ClassCastException if value is not a ReferenceNavModel.keplerCrsType
   */
  public void setKeplerCrs(Asn1Object value) {
    this.keplerCrs_ = (ReferenceNavModel.keplerCrsType) value;
  }
  public ReferenceNavModel.keplerCrsType setKeplerCrsToNewInstance() {
    keplerCrs_ = new ReferenceNavModel.keplerCrsType();
    return keplerCrs_;
  }
  
  private ReferenceNavModel.keplerCisType keplerCis_;
  public ReferenceNavModel.keplerCisType getKeplerCis() {
    return keplerCis_;
  }
  /**
   * @throws ClassCastException if value is not a ReferenceNavModel.keplerCisType
   */
  public void setKeplerCis(Asn1Object value) {
    this.keplerCis_ = (ReferenceNavModel.keplerCisType) value;
  }
  public ReferenceNavModel.keplerCisType setKeplerCisToNewInstance() {
    keplerCis_ = new ReferenceNavModel.keplerCisType();
    return keplerCis_;
  }
  
  private ReferenceNavModel.keplerCusType keplerCus_;
  public ReferenceNavModel.keplerCusType getKeplerCus() {
    return keplerCus_;
  }
  /**
   * @throws ClassCastException if value is not a ReferenceNavModel.keplerCusType
   */
  public void setKeplerCus(Asn1Object value) {
    this.keplerCus_ = (ReferenceNavModel.keplerCusType) value;
  }
  public ReferenceNavModel.keplerCusType setKeplerCusToNewInstance() {
    keplerCus_ = new ReferenceNavModel.keplerCusType();
    return keplerCus_;
  }
  
  private ReferenceNavModel.keplerCrcType keplerCrc_;
  public ReferenceNavModel.keplerCrcType getKeplerCrc() {
    return keplerCrc_;
  }
  /**
   * @throws ClassCastException if value is not a ReferenceNavModel.keplerCrcType
   */
  public void setKeplerCrc(Asn1Object value) {
    this.keplerCrc_ = (ReferenceNavModel.keplerCrcType) value;
  }
  public ReferenceNavModel.keplerCrcType setKeplerCrcToNewInstance() {
    keplerCrc_ = new ReferenceNavModel.keplerCrcType();
    return keplerCrc_;
  }
  
  private ReferenceNavModel.keplerCicType keplerCic_;
  public ReferenceNavModel.keplerCicType getKeplerCic() {
    return keplerCic_;
  }
  /**
   * @throws ClassCastException if value is not a ReferenceNavModel.keplerCicType
   */
  public void setKeplerCic(Asn1Object value) {
    this.keplerCic_ = (ReferenceNavModel.keplerCicType) value;
  }
  public ReferenceNavModel.keplerCicType setKeplerCicToNewInstance() {
    keplerCic_ = new ReferenceNavModel.keplerCicType();
    return keplerCic_;
  }
  
  private ReferenceNavModel.keplerCucType keplerCuc_;
  public ReferenceNavModel.keplerCucType getKeplerCuc() {
    return keplerCuc_;
  }
  /**
   * @throws ClassCastException if value is not a ReferenceNavModel.keplerCucType
   */
  public void setKeplerCuc(Asn1Object value) {
    this.keplerCuc_ = (ReferenceNavModel.keplerCucType) value;
  }
  public ReferenceNavModel.keplerCucType setKeplerCucToNewInstance() {
    keplerCuc_ = new ReferenceNavModel.keplerCucType();
    return keplerCuc_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getKeplerToe() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getKeplerToe();
          }

          @Override public void setToNewInstance() {
            setKeplerToeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ReferenceNavModel.keplerToeType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "keplerToe : "
                    + getKeplerToe().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getKeplerW() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getKeplerW();
          }

          @Override public void setToNewInstance() {
            setKeplerWToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ReferenceNavModel.keplerWType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "keplerW : "
                    + getKeplerW().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getKeplerDeltaN() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getKeplerDeltaN();
          }

          @Override public void setToNewInstance() {
            setKeplerDeltaNToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ReferenceNavModel.keplerDeltaNType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "keplerDeltaN : "
                    + getKeplerDeltaN().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getKeplerM0() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getKeplerM0();
          }

          @Override public void setToNewInstance() {
            setKeplerM0ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ReferenceNavModel.keplerM0Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "keplerM0 : "
                    + getKeplerM0().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getKeplerOmegaDot() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getKeplerOmegaDot();
          }

          @Override public void setToNewInstance() {
            setKeplerOmegaDotToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ReferenceNavModel.keplerOmegaDotType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "keplerOmegaDot : "
                    + getKeplerOmegaDot().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getKeplerE() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getKeplerE();
          }

          @Override public void setToNewInstance() {
            setKeplerEToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ReferenceNavModel.keplerEType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "keplerE : "
                    + getKeplerE().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getKeplerIDot() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getKeplerIDot();
          }

          @Override public void setToNewInstance() {
            setKeplerIDotToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ReferenceNavModel.keplerIDotType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "keplerIDot : "
                    + getKeplerIDot().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 7);

          @Override public boolean isExplicitlySet() {
            return getKeplerAPowerHalf() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getKeplerAPowerHalf();
          }

          @Override public void setToNewInstance() {
            setKeplerAPowerHalfToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ReferenceNavModel.keplerAPowerHalfType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "keplerAPowerHalf : "
                    + getKeplerAPowerHalf().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 8);

          @Override public boolean isExplicitlySet() {
            return getKeplerI0() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getKeplerI0();
          }

          @Override public void setToNewInstance() {
            setKeplerI0ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ReferenceNavModel.keplerI0Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "keplerI0 : "
                    + getKeplerI0().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 9);

          @Override public boolean isExplicitlySet() {
            return getKeplerOmega0() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getKeplerOmega0();
          }

          @Override public void setToNewInstance() {
            setKeplerOmega0ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ReferenceNavModel.keplerOmega0Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "keplerOmega0 : "
                    + getKeplerOmega0().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 10);

          @Override public boolean isExplicitlySet() {
            return getKeplerCrs() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getKeplerCrs();
          }

          @Override public void setToNewInstance() {
            setKeplerCrsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ReferenceNavModel.keplerCrsType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "keplerCrs : "
                    + getKeplerCrs().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 11);

          @Override public boolean isExplicitlySet() {
            return getKeplerCis() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getKeplerCis();
          }

          @Override public void setToNewInstance() {
            setKeplerCisToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ReferenceNavModel.keplerCisType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "keplerCis : "
                    + getKeplerCis().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 12);

          @Override public boolean isExplicitlySet() {
            return getKeplerCus() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getKeplerCus();
          }

          @Override public void setToNewInstance() {
            setKeplerCusToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ReferenceNavModel.keplerCusType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "keplerCus : "
                    + getKeplerCus().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 13);

          @Override public boolean isExplicitlySet() {
            return getKeplerCrc() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getKeplerCrc();
          }

          @Override public void setToNewInstance() {
            setKeplerCrcToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ReferenceNavModel.keplerCrcType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "keplerCrc : "
                    + getKeplerCrc().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 14);

          @Override public boolean isExplicitlySet() {
            return getKeplerCic() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getKeplerCic();
          }

          @Override public void setToNewInstance() {
            setKeplerCicToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ReferenceNavModel.keplerCicType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "keplerCic : "
                    + getKeplerCic().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 15);

          @Override public boolean isExplicitlySet() {
            return getKeplerCuc() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getKeplerCuc();
          }

          @Override public void setToNewInstance() {
            setKeplerCucToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ReferenceNavModel.keplerCucType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "keplerCuc : "
                    + getKeplerCuc().toIndentedString(indent);
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
public static class keplerToeType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_keplerToeType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public keplerToeType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("37799"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_keplerToeType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_keplerToeType != null) {
      return ImmutableList.of(TAG_keplerToeType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new keplerToeType from encoded stream.
   */
  public static keplerToeType fromPerUnaligned(byte[] encodedBytes) {
    keplerToeType result = new keplerToeType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new keplerToeType from encoded stream.
   */
  public static keplerToeType fromPerAligned(byte[] encodedBytes) {
    keplerToeType result = new keplerToeType();
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
    return "keplerToeType = " + getInteger() + ";\n";
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
public static class keplerWType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_keplerWType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public keplerWType() {
    super();
    setValueRange(new java.math.BigInteger("-2147483648"), new java.math.BigInteger("2147483647"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_keplerWType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_keplerWType != null) {
      return ImmutableList.of(TAG_keplerWType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new keplerWType from encoded stream.
   */
  public static keplerWType fromPerUnaligned(byte[] encodedBytes) {
    keplerWType result = new keplerWType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new keplerWType from encoded stream.
   */
  public static keplerWType fromPerAligned(byte[] encodedBytes) {
    keplerWType result = new keplerWType();
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
    return "keplerWType = " + getInteger() + ";\n";
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
public static class keplerDeltaNType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_keplerDeltaNType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public keplerDeltaNType() {
    super();
    setValueRange(new java.math.BigInteger("-32768"), new java.math.BigInteger("32767"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_keplerDeltaNType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_keplerDeltaNType != null) {
      return ImmutableList.of(TAG_keplerDeltaNType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new keplerDeltaNType from encoded stream.
   */
  public static keplerDeltaNType fromPerUnaligned(byte[] encodedBytes) {
    keplerDeltaNType result = new keplerDeltaNType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new keplerDeltaNType from encoded stream.
   */
  public static keplerDeltaNType fromPerAligned(byte[] encodedBytes) {
    keplerDeltaNType result = new keplerDeltaNType();
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
    return "keplerDeltaNType = " + getInteger() + ";\n";
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
public static class keplerM0Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_keplerM0Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public keplerM0Type() {
    super();
    setValueRange(new java.math.BigInteger("-2147483648"), new java.math.BigInteger("2147483647"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_keplerM0Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_keplerM0Type != null) {
      return ImmutableList.of(TAG_keplerM0Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new keplerM0Type from encoded stream.
   */
  public static keplerM0Type fromPerUnaligned(byte[] encodedBytes) {
    keplerM0Type result = new keplerM0Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new keplerM0Type from encoded stream.
   */
  public static keplerM0Type fromPerAligned(byte[] encodedBytes) {
    keplerM0Type result = new keplerM0Type();
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
    return "keplerM0Type = " + getInteger() + ";\n";
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
public static class keplerOmegaDotType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_keplerOmegaDotType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public keplerOmegaDotType() {
    super();
    setValueRange(new java.math.BigInteger("-8388608"), new java.math.BigInteger("8388607"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_keplerOmegaDotType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_keplerOmegaDotType != null) {
      return ImmutableList.of(TAG_keplerOmegaDotType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new keplerOmegaDotType from encoded stream.
   */
  public static keplerOmegaDotType fromPerUnaligned(byte[] encodedBytes) {
    keplerOmegaDotType result = new keplerOmegaDotType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new keplerOmegaDotType from encoded stream.
   */
  public static keplerOmegaDotType fromPerAligned(byte[] encodedBytes) {
    keplerOmegaDotType result = new keplerOmegaDotType();
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
    return "keplerOmegaDotType = " + getInteger() + ";\n";
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
public static class keplerEType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_keplerEType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public keplerEType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("4294967295"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_keplerEType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_keplerEType != null) {
      return ImmutableList.of(TAG_keplerEType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new keplerEType from encoded stream.
   */
  public static keplerEType fromPerUnaligned(byte[] encodedBytes) {
    keplerEType result = new keplerEType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new keplerEType from encoded stream.
   */
  public static keplerEType fromPerAligned(byte[] encodedBytes) {
    keplerEType result = new keplerEType();
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
    return "keplerEType = " + getInteger() + ";\n";
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
public static class keplerIDotType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_keplerIDotType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public keplerIDotType() {
    super();
    setValueRange(new java.math.BigInteger("-8192"), new java.math.BigInteger("8191"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_keplerIDotType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_keplerIDotType != null) {
      return ImmutableList.of(TAG_keplerIDotType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new keplerIDotType from encoded stream.
   */
  public static keplerIDotType fromPerUnaligned(byte[] encodedBytes) {
    keplerIDotType result = new keplerIDotType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new keplerIDotType from encoded stream.
   */
  public static keplerIDotType fromPerAligned(byte[] encodedBytes) {
    keplerIDotType result = new keplerIDotType();
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
    return "keplerIDotType = " + getInteger() + ";\n";
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
public static class keplerAPowerHalfType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_keplerAPowerHalfType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public keplerAPowerHalfType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("4294967295"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_keplerAPowerHalfType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_keplerAPowerHalfType != null) {
      return ImmutableList.of(TAG_keplerAPowerHalfType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new keplerAPowerHalfType from encoded stream.
   */
  public static keplerAPowerHalfType fromPerUnaligned(byte[] encodedBytes) {
    keplerAPowerHalfType result = new keplerAPowerHalfType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new keplerAPowerHalfType from encoded stream.
   */
  public static keplerAPowerHalfType fromPerAligned(byte[] encodedBytes) {
    keplerAPowerHalfType result = new keplerAPowerHalfType();
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
    return "keplerAPowerHalfType = " + getInteger() + ";\n";
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
public static class keplerI0Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_keplerI0Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public keplerI0Type() {
    super();
    setValueRange(new java.math.BigInteger("-2147483648"), new java.math.BigInteger("2147483647"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_keplerI0Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_keplerI0Type != null) {
      return ImmutableList.of(TAG_keplerI0Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new keplerI0Type from encoded stream.
   */
  public static keplerI0Type fromPerUnaligned(byte[] encodedBytes) {
    keplerI0Type result = new keplerI0Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new keplerI0Type from encoded stream.
   */
  public static keplerI0Type fromPerAligned(byte[] encodedBytes) {
    keplerI0Type result = new keplerI0Type();
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
    return "keplerI0Type = " + getInteger() + ";\n";
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
public static class keplerOmega0Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_keplerOmega0Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public keplerOmega0Type() {
    super();
    setValueRange(new java.math.BigInteger("-2147483648"), new java.math.BigInteger("2147483647"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_keplerOmega0Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_keplerOmega0Type != null) {
      return ImmutableList.of(TAG_keplerOmega0Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new keplerOmega0Type from encoded stream.
   */
  public static keplerOmega0Type fromPerUnaligned(byte[] encodedBytes) {
    keplerOmega0Type result = new keplerOmega0Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new keplerOmega0Type from encoded stream.
   */
  public static keplerOmega0Type fromPerAligned(byte[] encodedBytes) {
    keplerOmega0Type result = new keplerOmega0Type();
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
    return "keplerOmega0Type = " + getInteger() + ";\n";
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
public static class keplerCrsType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_keplerCrsType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public keplerCrsType() {
    super();
    setValueRange(new java.math.BigInteger("-32768"), new java.math.BigInteger("32767"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_keplerCrsType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_keplerCrsType != null) {
      return ImmutableList.of(TAG_keplerCrsType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new keplerCrsType from encoded stream.
   */
  public static keplerCrsType fromPerUnaligned(byte[] encodedBytes) {
    keplerCrsType result = new keplerCrsType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new keplerCrsType from encoded stream.
   */
  public static keplerCrsType fromPerAligned(byte[] encodedBytes) {
    keplerCrsType result = new keplerCrsType();
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
    return "keplerCrsType = " + getInteger() + ";\n";
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
public static class keplerCisType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_keplerCisType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public keplerCisType() {
    super();
    setValueRange(new java.math.BigInteger("-32768"), new java.math.BigInteger("32767"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_keplerCisType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_keplerCisType != null) {
      return ImmutableList.of(TAG_keplerCisType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new keplerCisType from encoded stream.
   */
  public static keplerCisType fromPerUnaligned(byte[] encodedBytes) {
    keplerCisType result = new keplerCisType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new keplerCisType from encoded stream.
   */
  public static keplerCisType fromPerAligned(byte[] encodedBytes) {
    keplerCisType result = new keplerCisType();
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
    return "keplerCisType = " + getInteger() + ";\n";
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
public static class keplerCusType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_keplerCusType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public keplerCusType() {
    super();
    setValueRange(new java.math.BigInteger("-32768"), new java.math.BigInteger("32767"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_keplerCusType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_keplerCusType != null) {
      return ImmutableList.of(TAG_keplerCusType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new keplerCusType from encoded stream.
   */
  public static keplerCusType fromPerUnaligned(byte[] encodedBytes) {
    keplerCusType result = new keplerCusType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new keplerCusType from encoded stream.
   */
  public static keplerCusType fromPerAligned(byte[] encodedBytes) {
    keplerCusType result = new keplerCusType();
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
    return "keplerCusType = " + getInteger() + ";\n";
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
public static class keplerCrcType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_keplerCrcType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public keplerCrcType() {
    super();
    setValueRange(new java.math.BigInteger("-32768"), new java.math.BigInteger("32767"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_keplerCrcType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_keplerCrcType != null) {
      return ImmutableList.of(TAG_keplerCrcType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new keplerCrcType from encoded stream.
   */
  public static keplerCrcType fromPerUnaligned(byte[] encodedBytes) {
    keplerCrcType result = new keplerCrcType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new keplerCrcType from encoded stream.
   */
  public static keplerCrcType fromPerAligned(byte[] encodedBytes) {
    keplerCrcType result = new keplerCrcType();
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
    return "keplerCrcType = " + getInteger() + ";\n";
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
public static class keplerCicType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_keplerCicType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public keplerCicType() {
    super();
    setValueRange(new java.math.BigInteger("-32768"), new java.math.BigInteger("32767"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_keplerCicType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_keplerCicType != null) {
      return ImmutableList.of(TAG_keplerCicType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new keplerCicType from encoded stream.
   */
  public static keplerCicType fromPerUnaligned(byte[] encodedBytes) {
    keplerCicType result = new keplerCicType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new keplerCicType from encoded stream.
   */
  public static keplerCicType fromPerAligned(byte[] encodedBytes) {
    keplerCicType result = new keplerCicType();
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
    return "keplerCicType = " + getInteger() + ";\n";
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
public static class keplerCucType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_keplerCucType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public keplerCucType() {
    super();
    setValueRange(new java.math.BigInteger("-32768"), new java.math.BigInteger("32767"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_keplerCucType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_keplerCucType != null) {
      return ImmutableList.of(TAG_keplerCucType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new keplerCucType from encoded stream.
   */
  public static keplerCucType fromPerUnaligned(byte[] encodedBytes) {
    keplerCucType result = new keplerCucType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new keplerCucType from encoded stream.
   */
  public static keplerCucType fromPerAligned(byte[] encodedBytes) {
    keplerCucType result = new keplerCucType();
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
    return "keplerCucType = " + getInteger() + ";\n";
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
    builder.append("ReferenceNavModel = {\n");
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
