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
public  class GANSS_MsrSetElement extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GANSS_MsrSetElement
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GANSS_MsrSetElement() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GANSS_MsrSetElement;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GANSS_MsrSetElement != null) {
      return ImmutableList.of(TAG_GANSS_MsrSetElement);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GANSS_MsrSetElement from encoded stream.
   */
  public static GANSS_MsrSetElement fromPerUnaligned(byte[] encodedBytes) {
    GANSS_MsrSetElement result = new GANSS_MsrSetElement();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GANSS_MsrSetElement from encoded stream.
   */
  public static GANSS_MsrSetElement fromPerAligned(byte[] encodedBytes) {
    GANSS_MsrSetElement result = new GANSS_MsrSetElement();
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

  
  private ReferenceFrame referenceFrame_;
  public ReferenceFrame getReferenceFrame() {
    return referenceFrame_;
  }
  /**
   * @throws ClassCastException if value is not a ReferenceFrame
   */
  public void setReferenceFrame(Asn1Object value) {
    this.referenceFrame_ = (ReferenceFrame) value;
  }
  public ReferenceFrame setReferenceFrameToNewInstance() {
    referenceFrame_ = new ReferenceFrame();
    return referenceFrame_;
  }
  
  private GANSSTODm ganssTODm_;
  public GANSSTODm getGanssTODm() {
    return ganssTODm_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSTODm
   */
  public void setGanssTODm(Asn1Object value) {
    this.ganssTODm_ = (GANSSTODm) value;
  }
  public GANSSTODm setGanssTODmToNewInstance() {
    ganssTODm_ = new GANSSTODm();
    return ganssTODm_;
  }
  
  private GANSS_MsrSetElement.deltaGANSSTODType deltaGANSSTOD_;
  public GANSS_MsrSetElement.deltaGANSSTODType getDeltaGANSSTOD() {
    return deltaGANSSTOD_;
  }
  /**
   * @throws ClassCastException if value is not a GANSS_MsrSetElement.deltaGANSSTODType
   */
  public void setDeltaGANSSTOD(Asn1Object value) {
    this.deltaGANSSTOD_ = (GANSS_MsrSetElement.deltaGANSSTODType) value;
  }
  public GANSS_MsrSetElement.deltaGANSSTODType setDeltaGANSSTODToNewInstance() {
    deltaGANSSTOD_ = new GANSS_MsrSetElement.deltaGANSSTODType();
    return deltaGANSSTOD_;
  }
  
  private GANSSTODUncertainty ganssTODUncertainty_;
  public GANSSTODUncertainty getGanssTODUncertainty() {
    return ganssTODUncertainty_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSTODUncertainty
   */
  public void setGanssTODUncertainty(Asn1Object value) {
    this.ganssTODUncertainty_ = (GANSSTODUncertainty) value;
  }
  public GANSSTODUncertainty setGanssTODUncertaintyToNewInstance() {
    ganssTODUncertainty_ = new GANSSTODUncertainty();
    return ganssTODUncertainty_;
  }
  
  private SeqOfGANSS_MsrElement ganss_MsrElementList_;
  public SeqOfGANSS_MsrElement getGanss_MsrElementList() {
    return ganss_MsrElementList_;
  }
  /**
   * @throws ClassCastException if value is not a SeqOfGANSS_MsrElement
   */
  public void setGanss_MsrElementList(Asn1Object value) {
    this.ganss_MsrElementList_ = (SeqOfGANSS_MsrElement) value;
  }
  public SeqOfGANSS_MsrElement setGanss_MsrElementListToNewInstance() {
    ganss_MsrElementList_ = new SeqOfGANSS_MsrElement();
    return ganss_MsrElementList_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getReferenceFrame() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getReferenceFrame();
          }

          @Override public void setToNewInstance() {
            setReferenceFrameToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ReferenceFrame.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "referenceFrame : "
                    + getReferenceFrame().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getGanssTODm() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssTODm();
          }

          @Override public void setToNewInstance() {
            setGanssTODmToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSTODm.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssTODm : "
                    + getGanssTODm().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getDeltaGANSSTOD() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getDeltaGANSSTOD();
          }

          @Override public void setToNewInstance() {
            setDeltaGANSSTODToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSS_MsrSetElement.deltaGANSSTODType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "deltaGANSSTOD : "
                    + getDeltaGANSSTOD().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getGanssTODUncertainty() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssTODUncertainty();
          }

          @Override public void setToNewInstance() {
            setGanssTODUncertaintyToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSTODUncertainty.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssTODUncertainty : "
                    + getGanssTODUncertainty().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getGanss_MsrElementList() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanss_MsrElementList();
          }

          @Override public void setToNewInstance() {
            setGanss_MsrElementListToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SeqOfGANSS_MsrElement.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganss_MsrElementList : "
                    + getGanss_MsrElementList().toIndentedString(indent);
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
public static class deltaGANSSTODType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_deltaGANSSTODType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public deltaGANSSTODType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("127"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_deltaGANSSTODType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_deltaGANSSTODType != null) {
      return ImmutableList.of(TAG_deltaGANSSTODType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new deltaGANSSTODType from encoded stream.
   */
  public static deltaGANSSTODType fromPerUnaligned(byte[] encodedBytes) {
    deltaGANSSTODType result = new deltaGANSSTODType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new deltaGANSSTODType from encoded stream.
   */
  public static deltaGANSSTODType fromPerAligned(byte[] encodedBytes) {
    deltaGANSSTODType result = new deltaGANSSTODType();
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
    return "deltaGANSSTODType = " + getInteger() + ";\n";
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
    builder.append("GANSS_MsrSetElement = {\n");
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
