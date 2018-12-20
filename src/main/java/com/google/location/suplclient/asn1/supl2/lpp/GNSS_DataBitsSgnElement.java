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
import com.google.location.suplclient.asn1.base.Asn1BitString;
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
public  class GNSS_DataBitsSgnElement extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GNSS_DataBitsSgnElement
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GNSS_DataBitsSgnElement() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GNSS_DataBitsSgnElement;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GNSS_DataBitsSgnElement != null) {
      return ImmutableList.of(TAG_GNSS_DataBitsSgnElement);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GNSS_DataBitsSgnElement from encoded stream.
   */
  public static GNSS_DataBitsSgnElement fromPerUnaligned(byte[] encodedBytes) {
    GNSS_DataBitsSgnElement result = new GNSS_DataBitsSgnElement();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GNSS_DataBitsSgnElement from encoded stream.
   */
  public static GNSS_DataBitsSgnElement fromPerAligned(byte[] encodedBytes) {
    GNSS_DataBitsSgnElement result = new GNSS_DataBitsSgnElement();
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

  
  private GNSS_SignalID gnss_SignalType_;
  public GNSS_SignalID getGnss_SignalType() {
    return gnss_SignalType_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_SignalID
   */
  public void setGnss_SignalType(Asn1Object value) {
    this.gnss_SignalType_ = (GNSS_SignalID) value;
  }
  public GNSS_SignalID setGnss_SignalTypeToNewInstance() {
    gnss_SignalType_ = new GNSS_SignalID();
    return gnss_SignalType_;
  }
  
  private GNSS_DataBitsSgnElement.gnss_DataBitsType gnss_DataBits_;
  public GNSS_DataBitsSgnElement.gnss_DataBitsType getGnss_DataBits() {
    return gnss_DataBits_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_DataBitsSgnElement.gnss_DataBitsType
   */
  public void setGnss_DataBits(Asn1Object value) {
    this.gnss_DataBits_ = (GNSS_DataBitsSgnElement.gnss_DataBitsType) value;
  }
  public GNSS_DataBitsSgnElement.gnss_DataBitsType setGnss_DataBitsToNewInstance() {
    gnss_DataBits_ = new GNSS_DataBitsSgnElement.gnss_DataBitsType();
    return gnss_DataBits_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getGnss_SignalType() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_SignalType();
          }

          @Override public void setToNewInstance() {
            setGnss_SignalTypeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_SignalID.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_SignalType : "
                    + getGnss_SignalType().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getGnss_DataBits() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_DataBits();
          }

          @Override public void setToNewInstance() {
            setGnss_DataBitsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_DataBitsSgnElement.gnss_DataBitsType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_DataBits : "
                    + getGnss_DataBits().toIndentedString(indent);
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
public static class gnss_DataBitsType extends Asn1BitString {
  //

  // defined bit positions, if any
  

  // setters
  

  // clearers
  


  private static final Asn1Tag TAG_gnss_DataBitsType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gnss_DataBitsType() {
    super();
    setMinSize(1);
setMaxSize(1024);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gnss_DataBitsType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gnss_DataBitsType != null) {
      return ImmutableList.of(TAG_gnss_DataBitsType);
    } else {
      return Asn1BitString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gnss_DataBitsType from encoded stream.
   */
  public static gnss_DataBitsType fromPerUnaligned(byte[] encodedBytes) {
    gnss_DataBitsType result = new gnss_DataBitsType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gnss_DataBitsType from encoded stream.
   */
  public static gnss_DataBitsType fromPerAligned(byte[] encodedBytes) {
    gnss_DataBitsType result = new gnss_DataBitsType();
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
    return "gnss_DataBitsType = " + getValue() + ";\n";
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
    builder.append("GNSS_DataBitsSgnElement = {\n");
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
