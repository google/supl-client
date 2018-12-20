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
import com.google.location.suplclient.asn1.base.Asn1Boolean;
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
public  class Ver2_PosProtocol_extension extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_Ver2_PosProtocol_extension
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public Ver2_PosProtocol_extension() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_Ver2_PosProtocol_extension;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_Ver2_PosProtocol_extension != null) {
      return ImmutableList.of(TAG_Ver2_PosProtocol_extension);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new Ver2_PosProtocol_extension from encoded stream.
   */
  public static Ver2_PosProtocol_extension fromPerUnaligned(byte[] encodedBytes) {
    Ver2_PosProtocol_extension result = new Ver2_PosProtocol_extension();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new Ver2_PosProtocol_extension from encoded stream.
   */
  public static Ver2_PosProtocol_extension fromPerAligned(byte[] encodedBytes) {
    Ver2_PosProtocol_extension result = new Ver2_PosProtocol_extension();
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

  
  private Ver2_PosProtocol_extension.lppType lpp_;
  public Ver2_PosProtocol_extension.lppType getLpp() {
    return lpp_;
  }
  /**
   * @throws ClassCastException if value is not a Ver2_PosProtocol_extension.lppType
   */
  public void setLpp(Asn1Object value) {
    this.lpp_ = (Ver2_PosProtocol_extension.lppType) value;
  }
  public Ver2_PosProtocol_extension.lppType setLppToNewInstance() {
    lpp_ = new Ver2_PosProtocol_extension.lppType();
    return lpp_;
  }
  
  private PosProtocolVersion3GPP posProtocolVersionRRLP_;
  public PosProtocolVersion3GPP getPosProtocolVersionRRLP() {
    return posProtocolVersionRRLP_;
  }
  /**
   * @throws ClassCastException if value is not a PosProtocolVersion3GPP
   */
  public void setPosProtocolVersionRRLP(Asn1Object value) {
    this.posProtocolVersionRRLP_ = (PosProtocolVersion3GPP) value;
  }
  public PosProtocolVersion3GPP setPosProtocolVersionRRLPToNewInstance() {
    posProtocolVersionRRLP_ = new PosProtocolVersion3GPP();
    return posProtocolVersionRRLP_;
  }
  
  private PosProtocolVersion3GPP posProtocolVersionRRC_;
  public PosProtocolVersion3GPP getPosProtocolVersionRRC() {
    return posProtocolVersionRRC_;
  }
  /**
   * @throws ClassCastException if value is not a PosProtocolVersion3GPP
   */
  public void setPosProtocolVersionRRC(Asn1Object value) {
    this.posProtocolVersionRRC_ = (PosProtocolVersion3GPP) value;
  }
  public PosProtocolVersion3GPP setPosProtocolVersionRRCToNewInstance() {
    posProtocolVersionRRC_ = new PosProtocolVersion3GPP();
    return posProtocolVersionRRC_;
  }
  
  private PosProtocolVersion3GPP2 posProtocolVersionTIA801_;
  public PosProtocolVersion3GPP2 getPosProtocolVersionTIA801() {
    return posProtocolVersionTIA801_;
  }
  /**
   * @throws ClassCastException if value is not a PosProtocolVersion3GPP2
   */
  public void setPosProtocolVersionTIA801(Asn1Object value) {
    this.posProtocolVersionTIA801_ = (PosProtocolVersion3GPP2) value;
  }
  public PosProtocolVersion3GPP2 setPosProtocolVersionTIA801ToNewInstance() {
    posProtocolVersionTIA801_ = new PosProtocolVersion3GPP2();
    return posProtocolVersionTIA801_;
  }
  
  private PosProtocolVersion3GPP posProtocolVersionLPP_;
  public PosProtocolVersion3GPP getPosProtocolVersionLPP() {
    return posProtocolVersionLPP_;
  }
  /**
   * @throws ClassCastException if value is not a PosProtocolVersion3GPP
   */
  public void setPosProtocolVersionLPP(Asn1Object value) {
    this.posProtocolVersionLPP_ = (PosProtocolVersion3GPP) value;
  }
  public PosProtocolVersion3GPP setPosProtocolVersionLPPToNewInstance() {
    posProtocolVersionLPP_ = new PosProtocolVersion3GPP();
    return posProtocolVersionLPP_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getLpp() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getLpp();
          }

          @Override public void setToNewInstance() {
            setLppToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Ver2_PosProtocol_extension.lppType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "lpp : "
                    + getLpp().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getPosProtocolVersionRRLP() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getPosProtocolVersionRRLP();
          }

          @Override public void setToNewInstance() {
            setPosProtocolVersionRRLPToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? PosProtocolVersion3GPP.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "posProtocolVersionRRLP : "
                    + getPosProtocolVersionRRLP().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getPosProtocolVersionRRC() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getPosProtocolVersionRRC();
          }

          @Override public void setToNewInstance() {
            setPosProtocolVersionRRCToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? PosProtocolVersion3GPP.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "posProtocolVersionRRC : "
                    + getPosProtocolVersionRRC().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getPosProtocolVersionTIA801() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getPosProtocolVersionTIA801();
          }

          @Override public void setToNewInstance() {
            setPosProtocolVersionTIA801ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? PosProtocolVersion3GPP2.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "posProtocolVersionTIA801 : "
                    + getPosProtocolVersionTIA801().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getPosProtocolVersionLPP() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getPosProtocolVersionLPP();
          }

          @Override public void setToNewInstance() {
            setPosProtocolVersionLPPToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? PosProtocolVersion3GPP.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "posProtocolVersionLPP : "
                    + getPosProtocolVersionLPP().toIndentedString(indent);
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
public static class lppType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_lppType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public lppType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_lppType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_lppType != null) {
      return ImmutableList.of(TAG_lppType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new lppType from encoded stream.
   */
  public static lppType fromPerUnaligned(byte[] encodedBytes) {
    lppType result = new lppType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new lppType from encoded stream.
   */
  public static lppType fromPerAligned(byte[] encodedBytes) {
    lppType result = new lppType();
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
    return "lppType = " + getValue() + ";\n";
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
    builder.append("Ver2_PosProtocol_extension = {\n");
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
