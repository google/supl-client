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
public  class GanssDataBits extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GanssDataBits
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GanssDataBits() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GanssDataBits;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GanssDataBits != null) {
      return ImmutableList.of(TAG_GanssDataBits);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GanssDataBits from encoded stream.
   */
  public static GanssDataBits fromPerUnaligned(byte[] encodedBytes) {
    GanssDataBits result = new GanssDataBits();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GanssDataBits from encoded stream.
   */
  public static GanssDataBits fromPerAligned(byte[] encodedBytes) {
    GanssDataBits result = new GanssDataBits();
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

  
  private GanssDataBits.ganssTODminType ganssTODmin_;
  public GanssDataBits.ganssTODminType getGanssTODmin() {
    return ganssTODmin_;
  }
  /**
   * @throws ClassCastException if value is not a GanssDataBits.ganssTODminType
   */
  public void setGanssTODmin(Asn1Object value) {
    this.ganssTODmin_ = (GanssDataBits.ganssTODminType) value;
  }
  public GanssDataBits.ganssTODminType setGanssTODminToNewInstance() {
    ganssTODmin_ = new GanssDataBits.ganssTODminType();
    return ganssTODmin_;
  }
  
  private ReqDataBitAssistanceList reqDataBitAssistanceList_;
  public ReqDataBitAssistanceList getReqDataBitAssistanceList() {
    return reqDataBitAssistanceList_;
  }
  /**
   * @throws ClassCastException if value is not a ReqDataBitAssistanceList
   */
  public void setReqDataBitAssistanceList(Asn1Object value) {
    this.reqDataBitAssistanceList_ = (ReqDataBitAssistanceList) value;
  }
  public ReqDataBitAssistanceList setReqDataBitAssistanceListToNewInstance() {
    reqDataBitAssistanceList_ = new ReqDataBitAssistanceList();
    return reqDataBitAssistanceList_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getGanssTODmin() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssTODmin();
          }

          @Override public void setToNewInstance() {
            setGanssTODminToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GanssDataBits.ganssTODminType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssTODmin : "
                    + getGanssTODmin().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getReqDataBitAssistanceList() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getReqDataBitAssistanceList();
          }

          @Override public void setToNewInstance() {
            setReqDataBitAssistanceListToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ReqDataBitAssistanceList.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "reqDataBitAssistanceList : "
                    + getReqDataBitAssistanceList().toIndentedString(indent);
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
public static class ganssTODminType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ganssTODminType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ganssTODminType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("59"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ganssTODminType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ganssTODminType != null) {
      return ImmutableList.of(TAG_ganssTODminType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ganssTODminType from encoded stream.
   */
  public static ganssTODminType fromPerUnaligned(byte[] encodedBytes) {
    ganssTODminType result = new ganssTODminType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ganssTODminType from encoded stream.
   */
  public static ganssTODminType fromPerAligned(byte[] encodedBytes) {
    ganssTODminType result = new ganssTODminType();
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
    return "ganssTODminType = " + getInteger() + ";\n";
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
    builder.append("GanssDataBits = {\n");
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
