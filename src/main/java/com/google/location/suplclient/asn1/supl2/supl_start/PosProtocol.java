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

package com.google.location.suplclient.asn1.supl2.supl_start;

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
import com.google.location.suplclient.asn1.supl2.ulp_version_2_parameter_extensions.Ver2_PosProtocol_extension;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
* 
*/
public  class PosProtocol extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_PosProtocol
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public PosProtocol() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_PosProtocol;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_PosProtocol != null) {
      return ImmutableList.of(TAG_PosProtocol);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new PosProtocol from encoded stream.
   */
  public static PosProtocol fromPerUnaligned(byte[] encodedBytes) {
    PosProtocol result = new PosProtocol();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new PosProtocol from encoded stream.
   */
  public static PosProtocol fromPerAligned(byte[] encodedBytes) {
    PosProtocol result = new PosProtocol();
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

  
  private PosProtocol.tia801Type tia801_;
  public PosProtocol.tia801Type getTia801() {
    return tia801_;
  }
  /**
   * @throws ClassCastException if value is not a PosProtocol.tia801Type
   */
  public void setTia801(Asn1Object value) {
    this.tia801_ = (PosProtocol.tia801Type) value;
  }
  public PosProtocol.tia801Type setTia801ToNewInstance() {
    tia801_ = new PosProtocol.tia801Type();
    return tia801_;
  }
  
  private PosProtocol.rrlpType rrlp_;
  public PosProtocol.rrlpType getRrlp() {
    return rrlp_;
  }
  /**
   * @throws ClassCastException if value is not a PosProtocol.rrlpType
   */
  public void setRrlp(Asn1Object value) {
    this.rrlp_ = (PosProtocol.rrlpType) value;
  }
  public PosProtocol.rrlpType setRrlpToNewInstance() {
    rrlp_ = new PosProtocol.rrlpType();
    return rrlp_;
  }
  
  private PosProtocol.rrcType rrc_;
  public PosProtocol.rrcType getRrc() {
    return rrc_;
  }
  /**
   * @throws ClassCastException if value is not a PosProtocol.rrcType
   */
  public void setRrc(Asn1Object value) {
    this.rrc_ = (PosProtocol.rrcType) value;
  }
  public PosProtocol.rrcType setRrcToNewInstance() {
    rrc_ = new PosProtocol.rrcType();
    return rrc_;
  }
  

  
  private Ver2_PosProtocol_extension extensionVer2_PosProtocol_extension;
  public Ver2_PosProtocol_extension getExtensionVer2_PosProtocol_extension() {
    return extensionVer2_PosProtocol_extension;
  }
  /**
   * @throws ClassCastException if value is not a Ver2_PosProtocol_extension
   */
  public void setExtensionVer2_PosProtocol_extension(Asn1Object value) {
    extensionVer2_PosProtocol_extension = (Ver2_PosProtocol_extension) value;
  }
  public void setExtensionVer2_PosProtocol_extensionToNewInstance() {
    extensionVer2_PosProtocol_extension = new Ver2_PosProtocol_extension();
  }
    

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getTia801() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getTia801();
          }

          @Override public void setToNewInstance() {
            setTia801ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? PosProtocol.tia801Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "tia801 : "
                    + getTia801().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getRrlp() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getRrlp();
          }

          @Override public void setToNewInstance() {
            setRrlpToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? PosProtocol.rrlpType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "rrlp : "
                    + getRrlp().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getRrc() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getRrc();
          }

          @Override public void setToNewInstance() {
            setRrcToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? PosProtocol.rrcType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "rrc : "
                    + getRrc().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      builder.add(new SequenceComponent() {
            @Override public boolean isExplicitlySet() {
              return getExtensionVer2_PosProtocol_extension() != null;
            }

            @Override public boolean hasDefaultValue() {
              return false;
            }

            @Override public boolean isOptional() {
              return true;
            }

            @Override public Asn1Object getComponentValue() {
              return getExtensionVer2_PosProtocol_extension();
            }

            @Override public void setToNewInstance() {
              setExtensionVer2_PosProtocol_extensionToNewInstance();
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
              return "ver2_PosProtocol_extension : "
                  + getExtensionVer2_PosProtocol_extension().toIndentedString(indent);
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
public static class tia801Type extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_tia801Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public tia801Type() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_tia801Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_tia801Type != null) {
      return ImmutableList.of(TAG_tia801Type);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new tia801Type from encoded stream.
   */
  public static tia801Type fromPerUnaligned(byte[] encodedBytes) {
    tia801Type result = new tia801Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new tia801Type from encoded stream.
   */
  public static tia801Type fromPerAligned(byte[] encodedBytes) {
    tia801Type result = new tia801Type();
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
    return "tia801Type = " + getValue() + ";\n";
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
public static class rrlpType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_rrlpType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public rrlpType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_rrlpType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_rrlpType != null) {
      return ImmutableList.of(TAG_rrlpType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new rrlpType from encoded stream.
   */
  public static rrlpType fromPerUnaligned(byte[] encodedBytes) {
    rrlpType result = new rrlpType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new rrlpType from encoded stream.
   */
  public static rrlpType fromPerAligned(byte[] encodedBytes) {
    rrlpType result = new rrlpType();
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
    return "rrlpType = " + getValue() + ";\n";
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
public static class rrcType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_rrcType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public rrcType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_rrcType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_rrcType != null) {
      return ImmutableList.of(TAG_rrcType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new rrcType from encoded stream.
   */
  public static rrcType fromPerUnaligned(byte[] encodedBytes) {
    rrcType result = new rrcType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new rrcType from encoded stream.
   */
  public static rrcType fromPerAligned(byte[] encodedBytes) {
    rrcType result = new rrcType();
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
    return "rrcType = " + getValue() + ";\n";
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
    builder.append("PosProtocol = {\n");
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
