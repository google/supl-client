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
import com.google.location.suplclient.asn1.base.Asn1SequenceOf;
import com.google.location.suplclient.asn1.base.Asn1Tag;
import com.google.location.suplclient.asn1.base.BitStream;
import com.google.location.suplclient.asn1.base.BitStreamReader;
import com.google.location.suplclient.asn1.base.SequenceComponent;
import com.google.location.suplclient.asn1.supl2.ver2_ulp_components.GANSSSignals;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
* 
*/
public  class ReqDataBitAssistanceList extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_ReqDataBitAssistanceList
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ReqDataBitAssistanceList() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ReqDataBitAssistanceList;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ReqDataBitAssistanceList != null) {
      return ImmutableList.of(TAG_ReqDataBitAssistanceList);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ReqDataBitAssistanceList from encoded stream.
   */
  public static ReqDataBitAssistanceList fromPerUnaligned(byte[] encodedBytes) {
    ReqDataBitAssistanceList result = new ReqDataBitAssistanceList();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ReqDataBitAssistanceList from encoded stream.
   */
  public static ReqDataBitAssistanceList fromPerAligned(byte[] encodedBytes) {
    ReqDataBitAssistanceList result = new ReqDataBitAssistanceList();
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

  
  private GANSSSignals gnssSignals_;
  public GANSSSignals getGnssSignals() {
    return gnssSignals_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSSignals
   */
  public void setGnssSignals(Asn1Object value) {
    this.gnssSignals_ = (GANSSSignals) value;
  }
  public GANSSSignals setGnssSignalsToNewInstance() {
    gnssSignals_ = new GANSSSignals();
    return gnssSignals_;
  }
  
  private ReqDataBitAssistanceList.ganssDataBitIntervalType ganssDataBitInterval_;
  public ReqDataBitAssistanceList.ganssDataBitIntervalType getGanssDataBitInterval() {
    return ganssDataBitInterval_;
  }
  /**
   * @throws ClassCastException if value is not a ReqDataBitAssistanceList.ganssDataBitIntervalType
   */
  public void setGanssDataBitInterval(Asn1Object value) {
    this.ganssDataBitInterval_ = (ReqDataBitAssistanceList.ganssDataBitIntervalType) value;
  }
  public ReqDataBitAssistanceList.ganssDataBitIntervalType setGanssDataBitIntervalToNewInstance() {
    ganssDataBitInterval_ = new ReqDataBitAssistanceList.ganssDataBitIntervalType();
    return ganssDataBitInterval_;
  }
  
  private ReqDataBitAssistanceList.ganssDataBitSatListType ganssDataBitSatList_;
  public ReqDataBitAssistanceList.ganssDataBitSatListType getGanssDataBitSatList() {
    return ganssDataBitSatList_;
  }
  /**
   * @throws ClassCastException if value is not a ReqDataBitAssistanceList.ganssDataBitSatListType
   */
  public void setGanssDataBitSatList(Asn1Object value) {
    this.ganssDataBitSatList_ = (ReqDataBitAssistanceList.ganssDataBitSatListType) value;
  }
  public ReqDataBitAssistanceList.ganssDataBitSatListType setGanssDataBitSatListToNewInstance() {
    ganssDataBitSatList_ = new ReqDataBitAssistanceList.ganssDataBitSatListType();
    return ganssDataBitSatList_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getGnssSignals() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnssSignals();
          }

          @Override public void setToNewInstance() {
            setGnssSignalsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSSignals.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnssSignals : "
                    + getGnssSignals().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getGanssDataBitInterval() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssDataBitInterval();
          }

          @Override public void setToNewInstance() {
            setGanssDataBitIntervalToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ReqDataBitAssistanceList.ganssDataBitIntervalType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssDataBitInterval : "
                    + getGanssDataBitInterval().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getGanssDataBitSatList() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssDataBitSatList();
          }

          @Override public void setToNewInstance() {
            setGanssDataBitSatListToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ReqDataBitAssistanceList.ganssDataBitSatListType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssDataBitSatList : "
                    + getGanssDataBitSatList().toIndentedString(indent);
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
public static class ganssDataBitIntervalType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ganssDataBitIntervalType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ganssDataBitIntervalType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("15"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ganssDataBitIntervalType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ganssDataBitIntervalType != null) {
      return ImmutableList.of(TAG_ganssDataBitIntervalType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ganssDataBitIntervalType from encoded stream.
   */
  public static ganssDataBitIntervalType fromPerUnaligned(byte[] encodedBytes) {
    ganssDataBitIntervalType result = new ganssDataBitIntervalType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ganssDataBitIntervalType from encoded stream.
   */
  public static ganssDataBitIntervalType fromPerAligned(byte[] encodedBytes) {
    ganssDataBitIntervalType result = new ganssDataBitIntervalType();
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
    return "ganssDataBitIntervalType = " + getInteger() + ";\n";
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
public static class ganssDataBitSatListType
    extends Asn1SequenceOf<ganssDataBitSatListType.ganssDataBitSatListTypeComponentType> {
  //

  private static final Asn1Tag TAG_ganssDataBitSatListType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ganssDataBitSatListType() {
    super();
    setMinSize(1);
setMaxSize(32);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ganssDataBitSatListType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ganssDataBitSatListType != null) {
      return ImmutableList.of(TAG_ganssDataBitSatListType);
    } else {
      return Asn1SequenceOf.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ganssDataBitSatListType from encoded stream.
   */
  public static ganssDataBitSatListType fromPerUnaligned(byte[] encodedBytes) {
    ganssDataBitSatListType result = new ganssDataBitSatListType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ganssDataBitSatListType from encoded stream.
   */
  public static ganssDataBitSatListType fromPerAligned(byte[] encodedBytes) {
    ganssDataBitSatListType result = new ganssDataBitSatListType();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  
  @Override public ganssDataBitSatListType.ganssDataBitSatListTypeComponentType createAndAddValue() {
    ganssDataBitSatListType.ganssDataBitSatListTypeComponentType value = new ganssDataBitSatListType.ganssDataBitSatListTypeComponentType();
    add(value);
    return value;
  }

 // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class ganssDataBitSatListTypeComponentType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ganssDataBitSatListTypeComponentType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ganssDataBitSatListTypeComponentType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("63"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ganssDataBitSatListTypeComponentType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ganssDataBitSatListTypeComponentType != null) {
      return ImmutableList.of(TAG_ganssDataBitSatListTypeComponentType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ganssDataBitSatListTypeComponentType from encoded stream.
   */
  public static ganssDataBitSatListTypeComponentType fromPerUnaligned(byte[] encodedBytes) {
    ganssDataBitSatListTypeComponentType result = new ganssDataBitSatListTypeComponentType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ganssDataBitSatListTypeComponentType from encoded stream.
   */
  public static ganssDataBitSatListTypeComponentType fromPerAligned(byte[] encodedBytes) {
    ganssDataBitSatListTypeComponentType result = new ganssDataBitSatListTypeComponentType();
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
    return "ganssDataBitSatListTypeComponentType = " + getInteger() + ";\n";
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
    builder.append("ganssDataBitSatListType = [\n");
    final String internalIndent = indent + "  ";
    for (ganssDataBitSatListType.ganssDataBitSatListTypeComponentType value : getValues()) {
      builder.append(internalIndent)
          .append(value.toIndentedString(internalIndent));
    }
    builder.append(indent).append("];\n");
    return builder.toString();
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
    builder.append("ReqDataBitAssistanceList = {\n");
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
