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
public  class GANSS_MsrElement extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GANSS_MsrElement
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GANSS_MsrElement() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GANSS_MsrElement;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GANSS_MsrElement != null) {
      return ImmutableList.of(TAG_GANSS_MsrElement);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GANSS_MsrElement from encoded stream.
   */
  public static GANSS_MsrElement fromPerUnaligned(byte[] encodedBytes) {
    GANSS_MsrElement result = new GANSS_MsrElement();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GANSS_MsrElement from encoded stream.
   */
  public static GANSS_MsrElement fromPerAligned(byte[] encodedBytes) {
    GANSS_MsrElement result = new GANSS_MsrElement();
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

  
  private GANSS_MsrElement.ganssIDType ganssID_;
  public GANSS_MsrElement.ganssIDType getGanssID() {
    return ganssID_;
  }
  /**
   * @throws ClassCastException if value is not a GANSS_MsrElement.ganssIDType
   */
  public void setGanssID(Asn1Object value) {
    this.ganssID_ = (GANSS_MsrElement.ganssIDType) value;
  }
  public GANSS_MsrElement.ganssIDType setGanssIDToNewInstance() {
    ganssID_ = new GANSS_MsrElement.ganssIDType();
    return ganssID_;
  }
  
  private SeqOfGANSS_SgnTypeElement ganss_SgnTypeList_;
  public SeqOfGANSS_SgnTypeElement getGanss_SgnTypeList() {
    return ganss_SgnTypeList_;
  }
  /**
   * @throws ClassCastException if value is not a SeqOfGANSS_SgnTypeElement
   */
  public void setGanss_SgnTypeList(Asn1Object value) {
    this.ganss_SgnTypeList_ = (SeqOfGANSS_SgnTypeElement) value;
  }
  public SeqOfGANSS_SgnTypeElement setGanss_SgnTypeListToNewInstance() {
    ganss_SgnTypeList_ = new SeqOfGANSS_SgnTypeElement();
    return ganss_SgnTypeList_;
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
            return tag == null ? GANSS_MsrElement.ganssIDType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return getGanss_SgnTypeList() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanss_SgnTypeList();
          }

          @Override public void setToNewInstance() {
            setGanss_SgnTypeListToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SeqOfGANSS_SgnTypeElement.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganss_SgnTypeList : "
                    + getGanss_SgnTypeList().toIndentedString(indent);
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
    builder.append("GANSS_MsrElement = {\n");
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
