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
public  class GNSS_DataBitAssistanceReq extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GNSS_DataBitAssistanceReq
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GNSS_DataBitAssistanceReq() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GNSS_DataBitAssistanceReq;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GNSS_DataBitAssistanceReq != null) {
      return ImmutableList.of(TAG_GNSS_DataBitAssistanceReq);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GNSS_DataBitAssistanceReq from encoded stream.
   */
  public static GNSS_DataBitAssistanceReq fromPerUnaligned(byte[] encodedBytes) {
    GNSS_DataBitAssistanceReq result = new GNSS_DataBitAssistanceReq();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GNSS_DataBitAssistanceReq from encoded stream.
   */
  public static GNSS_DataBitAssistanceReq fromPerAligned(byte[] encodedBytes) {
    GNSS_DataBitAssistanceReq result = new GNSS_DataBitAssistanceReq();
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

  
  private GNSS_DataBitAssistanceReq.gnss_TOD_ReqType gnss_TOD_Req_;
  public GNSS_DataBitAssistanceReq.gnss_TOD_ReqType getGnss_TOD_Req() {
    return gnss_TOD_Req_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_DataBitAssistanceReq.gnss_TOD_ReqType
   */
  public void setGnss_TOD_Req(Asn1Object value) {
    this.gnss_TOD_Req_ = (GNSS_DataBitAssistanceReq.gnss_TOD_ReqType) value;
  }
  public GNSS_DataBitAssistanceReq.gnss_TOD_ReqType setGnss_TOD_ReqToNewInstance() {
    gnss_TOD_Req_ = new GNSS_DataBitAssistanceReq.gnss_TOD_ReqType();
    return gnss_TOD_Req_;
  }
  
  private GNSS_DataBitAssistanceReq.gnss_TOD_FracReqType gnss_TOD_FracReq_;
  public GNSS_DataBitAssistanceReq.gnss_TOD_FracReqType getGnss_TOD_FracReq() {
    return gnss_TOD_FracReq_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_DataBitAssistanceReq.gnss_TOD_FracReqType
   */
  public void setGnss_TOD_FracReq(Asn1Object value) {
    this.gnss_TOD_FracReq_ = (GNSS_DataBitAssistanceReq.gnss_TOD_FracReqType) value;
  }
  public GNSS_DataBitAssistanceReq.gnss_TOD_FracReqType setGnss_TOD_FracReqToNewInstance() {
    gnss_TOD_FracReq_ = new GNSS_DataBitAssistanceReq.gnss_TOD_FracReqType();
    return gnss_TOD_FracReq_;
  }
  
  private GNSS_DataBitAssistanceReq.dataBitIntervalType dataBitInterval_;
  public GNSS_DataBitAssistanceReq.dataBitIntervalType getDataBitInterval() {
    return dataBitInterval_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_DataBitAssistanceReq.dataBitIntervalType
   */
  public void setDataBitInterval(Asn1Object value) {
    this.dataBitInterval_ = (GNSS_DataBitAssistanceReq.dataBitIntervalType) value;
  }
  public GNSS_DataBitAssistanceReq.dataBitIntervalType setDataBitIntervalToNewInstance() {
    dataBitInterval_ = new GNSS_DataBitAssistanceReq.dataBitIntervalType();
    return dataBitInterval_;
  }
  
  private GNSS_SignalIDs gnss_SignalType_;
  public GNSS_SignalIDs getGnss_SignalType() {
    return gnss_SignalType_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_SignalIDs
   */
  public void setGnss_SignalType(Asn1Object value) {
    this.gnss_SignalType_ = (GNSS_SignalIDs) value;
  }
  public GNSS_SignalIDs setGnss_SignalTypeToNewInstance() {
    gnss_SignalType_ = new GNSS_SignalIDs();
    return gnss_SignalType_;
  }
  
  private GNSS_DataBitsReqSatList gnss_DataBitsReq_;
  public GNSS_DataBitsReqSatList getGnss_DataBitsReq() {
    return gnss_DataBitsReq_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_DataBitsReqSatList
   */
  public void setGnss_DataBitsReq(Asn1Object value) {
    this.gnss_DataBitsReq_ = (GNSS_DataBitsReqSatList) value;
  }
  public GNSS_DataBitsReqSatList setGnss_DataBitsReqToNewInstance() {
    gnss_DataBitsReq_ = new GNSS_DataBitsReqSatList();
    return gnss_DataBitsReq_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getGnss_TOD_Req() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_TOD_Req();
          }

          @Override public void setToNewInstance() {
            setGnss_TOD_ReqToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_DataBitAssistanceReq.gnss_TOD_ReqType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_TOD_Req : "
                    + getGnss_TOD_Req().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getGnss_TOD_FracReq() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_TOD_FracReq();
          }

          @Override public void setToNewInstance() {
            setGnss_TOD_FracReqToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_DataBitAssistanceReq.gnss_TOD_FracReqType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_TOD_FracReq : "
                    + getGnss_TOD_FracReq().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getDataBitInterval() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getDataBitInterval();
          }

          @Override public void setToNewInstance() {
            setDataBitIntervalToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_DataBitAssistanceReq.dataBitIntervalType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "dataBitInterval : "
                    + getDataBitInterval().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

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
            return tag == null ? GNSS_SignalIDs.getPossibleFirstTags() : ImmutableList.of(tag);
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
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getGnss_DataBitsReq() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_DataBitsReq();
          }

          @Override public void setToNewInstance() {
            setGnss_DataBitsReqToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_DataBitsReqSatList.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_DataBitsReq : "
                    + getGnss_DataBitsReq().toIndentedString(indent);
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
public static class gnss_TOD_ReqType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_gnss_TOD_ReqType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gnss_TOD_ReqType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("3599"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gnss_TOD_ReqType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gnss_TOD_ReqType != null) {
      return ImmutableList.of(TAG_gnss_TOD_ReqType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gnss_TOD_ReqType from encoded stream.
   */
  public static gnss_TOD_ReqType fromPerUnaligned(byte[] encodedBytes) {
    gnss_TOD_ReqType result = new gnss_TOD_ReqType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gnss_TOD_ReqType from encoded stream.
   */
  public static gnss_TOD_ReqType fromPerAligned(byte[] encodedBytes) {
    gnss_TOD_ReqType result = new gnss_TOD_ReqType();
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
    return "gnss_TOD_ReqType = " + getInteger() + ";\n";
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
public static class gnss_TOD_FracReqType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_gnss_TOD_FracReqType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gnss_TOD_FracReqType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("999"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gnss_TOD_FracReqType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gnss_TOD_FracReqType != null) {
      return ImmutableList.of(TAG_gnss_TOD_FracReqType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gnss_TOD_FracReqType from encoded stream.
   */
  public static gnss_TOD_FracReqType fromPerUnaligned(byte[] encodedBytes) {
    gnss_TOD_FracReqType result = new gnss_TOD_FracReqType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gnss_TOD_FracReqType from encoded stream.
   */
  public static gnss_TOD_FracReqType fromPerAligned(byte[] encodedBytes) {
    gnss_TOD_FracReqType result = new gnss_TOD_FracReqType();
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
    return "gnss_TOD_FracReqType = " + getInteger() + ";\n";
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
public static class dataBitIntervalType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_dataBitIntervalType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public dataBitIntervalType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("15"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_dataBitIntervalType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_dataBitIntervalType != null) {
      return ImmutableList.of(TAG_dataBitIntervalType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new dataBitIntervalType from encoded stream.
   */
  public static dataBitIntervalType fromPerUnaligned(byte[] encodedBytes) {
    dataBitIntervalType result = new dataBitIntervalType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new dataBitIntervalType from encoded stream.
   */
  public static dataBitIntervalType fromPerAligned(byte[] encodedBytes) {
    dataBitIntervalType result = new dataBitIntervalType();
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
    return "dataBitIntervalType = " + getInteger() + ";\n";
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
    builder.append("GNSS_DataBitAssistanceReq = {\n");
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
