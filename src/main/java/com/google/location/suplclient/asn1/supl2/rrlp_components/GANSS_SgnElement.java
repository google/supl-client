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
public  class GANSS_SgnElement extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GANSS_SgnElement
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GANSS_SgnElement() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GANSS_SgnElement;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GANSS_SgnElement != null) {
      return ImmutableList.of(TAG_GANSS_SgnElement);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GANSS_SgnElement from encoded stream.
   */
  public static GANSS_SgnElement fromPerUnaligned(byte[] encodedBytes) {
    GANSS_SgnElement result = new GANSS_SgnElement();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GANSS_SgnElement from encoded stream.
   */
  public static GANSS_SgnElement fromPerAligned(byte[] encodedBytes) {
    GANSS_SgnElement result = new GANSS_SgnElement();
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

  
  private SVID svID_;
  public SVID getSvID() {
    return svID_;
  }
  /**
   * @throws ClassCastException if value is not a SVID
   */
  public void setSvID(Asn1Object value) {
    this.svID_ = (SVID) value;
  }
  public SVID setSvIDToNewInstance() {
    svID_ = new SVID();
    return svID_;
  }
  
  private GANSS_SgnElement.cNoType cNo_;
  public GANSS_SgnElement.cNoType getCNo() {
    return cNo_;
  }
  /**
   * @throws ClassCastException if value is not a GANSS_SgnElement.cNoType
   */
  public void setCNo(Asn1Object value) {
    this.cNo_ = (GANSS_SgnElement.cNoType) value;
  }
  public GANSS_SgnElement.cNoType setCNoToNewInstance() {
    cNo_ = new GANSS_SgnElement.cNoType();
    return cNo_;
  }
  
  private MpathIndic mpathDet_;
  public MpathIndic getMpathDet() {
    return mpathDet_;
  }
  /**
   * @throws ClassCastException if value is not a MpathIndic
   */
  public void setMpathDet(Asn1Object value) {
    this.mpathDet_ = (MpathIndic) value;
  }
  public MpathIndic setMpathDetToNewInstance() {
    mpathDet_ = new MpathIndic();
    return mpathDet_;
  }
  
  private GANSS_SgnElement.carrierQualityIndType carrierQualityInd_;
  public GANSS_SgnElement.carrierQualityIndType getCarrierQualityInd() {
    return carrierQualityInd_;
  }
  /**
   * @throws ClassCastException if value is not a GANSS_SgnElement.carrierQualityIndType
   */
  public void setCarrierQualityInd(Asn1Object value) {
    this.carrierQualityInd_ = (GANSS_SgnElement.carrierQualityIndType) value;
  }
  public GANSS_SgnElement.carrierQualityIndType setCarrierQualityIndToNewInstance() {
    carrierQualityInd_ = new GANSS_SgnElement.carrierQualityIndType();
    return carrierQualityInd_;
  }
  
  private GANSS_SgnElement.codePhaseType codePhase_;
  public GANSS_SgnElement.codePhaseType getCodePhase() {
    return codePhase_;
  }
  /**
   * @throws ClassCastException if value is not a GANSS_SgnElement.codePhaseType
   */
  public void setCodePhase(Asn1Object value) {
    this.codePhase_ = (GANSS_SgnElement.codePhaseType) value;
  }
  public GANSS_SgnElement.codePhaseType setCodePhaseToNewInstance() {
    codePhase_ = new GANSS_SgnElement.codePhaseType();
    return codePhase_;
  }
  
  private GANSS_SgnElement.integerCodePhaseType integerCodePhase_;
  public GANSS_SgnElement.integerCodePhaseType getIntegerCodePhase() {
    return integerCodePhase_;
  }
  /**
   * @throws ClassCastException if value is not a GANSS_SgnElement.integerCodePhaseType
   */
  public void setIntegerCodePhase(Asn1Object value) {
    this.integerCodePhase_ = (GANSS_SgnElement.integerCodePhaseType) value;
  }
  public GANSS_SgnElement.integerCodePhaseType setIntegerCodePhaseToNewInstance() {
    integerCodePhase_ = new GANSS_SgnElement.integerCodePhaseType();
    return integerCodePhase_;
  }
  
  private GANSS_SgnElement.codePhaseRMSErrorType codePhaseRMSError_;
  public GANSS_SgnElement.codePhaseRMSErrorType getCodePhaseRMSError() {
    return codePhaseRMSError_;
  }
  /**
   * @throws ClassCastException if value is not a GANSS_SgnElement.codePhaseRMSErrorType
   */
  public void setCodePhaseRMSError(Asn1Object value) {
    this.codePhaseRMSError_ = (GANSS_SgnElement.codePhaseRMSErrorType) value;
  }
  public GANSS_SgnElement.codePhaseRMSErrorType setCodePhaseRMSErrorToNewInstance() {
    codePhaseRMSError_ = new GANSS_SgnElement.codePhaseRMSErrorType();
    return codePhaseRMSError_;
  }
  
  private GANSS_SgnElement.dopplerType doppler_;
  public GANSS_SgnElement.dopplerType getDoppler() {
    return doppler_;
  }
  /**
   * @throws ClassCastException if value is not a GANSS_SgnElement.dopplerType
   */
  public void setDoppler(Asn1Object value) {
    this.doppler_ = (GANSS_SgnElement.dopplerType) value;
  }
  public GANSS_SgnElement.dopplerType setDopplerToNewInstance() {
    doppler_ = new GANSS_SgnElement.dopplerType();
    return doppler_;
  }
  
  private GANSS_SgnElement.adrType adr_;
  public GANSS_SgnElement.adrType getAdr() {
    return adr_;
  }
  /**
   * @throws ClassCastException if value is not a GANSS_SgnElement.adrType
   */
  public void setAdr(Asn1Object value) {
    this.adr_ = (GANSS_SgnElement.adrType) value;
  }
  public GANSS_SgnElement.adrType setAdrToNewInstance() {
    adr_ = new GANSS_SgnElement.adrType();
    return adr_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getSvID() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getSvID();
          }

          @Override public void setToNewInstance() {
            setSvIDToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SVID.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "svID : "
                    + getSvID().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getCNo() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCNo();
          }

          @Override public void setToNewInstance() {
            setCNoToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSS_SgnElement.cNoType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "cNo : "
                    + getCNo().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getMpathDet() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getMpathDet();
          }

          @Override public void setToNewInstance() {
            setMpathDetToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? MpathIndic.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "mpathDet : "
                    + getMpathDet().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getCarrierQualityInd() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getCarrierQualityInd();
          }

          @Override public void setToNewInstance() {
            setCarrierQualityIndToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSS_SgnElement.carrierQualityIndType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "carrierQualityInd : "
                    + getCarrierQualityInd().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getCodePhase() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCodePhase();
          }

          @Override public void setToNewInstance() {
            setCodePhaseToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSS_SgnElement.codePhaseType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "codePhase : "
                    + getCodePhase().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getIntegerCodePhase() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getIntegerCodePhase();
          }

          @Override public void setToNewInstance() {
            setIntegerCodePhaseToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSS_SgnElement.integerCodePhaseType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "integerCodePhase : "
                    + getIntegerCodePhase().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getCodePhaseRMSError() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCodePhaseRMSError();
          }

          @Override public void setToNewInstance() {
            setCodePhaseRMSErrorToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSS_SgnElement.codePhaseRMSErrorType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "codePhaseRMSError : "
                    + getCodePhaseRMSError().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 7);

          @Override public boolean isExplicitlySet() {
            return getDoppler() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getDoppler();
          }

          @Override public void setToNewInstance() {
            setDopplerToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSS_SgnElement.dopplerType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "doppler : "
                    + getDoppler().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 8);

          @Override public boolean isExplicitlySet() {
            return getAdr() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getAdr();
          }

          @Override public void setToNewInstance() {
            setAdrToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSS_SgnElement.adrType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "adr : "
                    + getAdr().toIndentedString(indent);
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
public static class cNoType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_cNoType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public cNoType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("63"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_cNoType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_cNoType != null) {
      return ImmutableList.of(TAG_cNoType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new cNoType from encoded stream.
   */
  public static cNoType fromPerUnaligned(byte[] encodedBytes) {
    cNoType result = new cNoType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new cNoType from encoded stream.
   */
  public static cNoType fromPerAligned(byte[] encodedBytes) {
    cNoType result = new cNoType();
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
    return "cNoType = " + getInteger() + ";\n";
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
public static class carrierQualityIndType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_carrierQualityIndType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public carrierQualityIndType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("3"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_carrierQualityIndType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_carrierQualityIndType != null) {
      return ImmutableList.of(TAG_carrierQualityIndType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new carrierQualityIndType from encoded stream.
   */
  public static carrierQualityIndType fromPerUnaligned(byte[] encodedBytes) {
    carrierQualityIndType result = new carrierQualityIndType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new carrierQualityIndType from encoded stream.
   */
  public static carrierQualityIndType fromPerAligned(byte[] encodedBytes) {
    carrierQualityIndType result = new carrierQualityIndType();
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
    return "carrierQualityIndType = " + getInteger() + ";\n";
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
public static class codePhaseType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_codePhaseType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public codePhaseType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("2097151"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_codePhaseType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_codePhaseType != null) {
      return ImmutableList.of(TAG_codePhaseType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new codePhaseType from encoded stream.
   */
  public static codePhaseType fromPerUnaligned(byte[] encodedBytes) {
    codePhaseType result = new codePhaseType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new codePhaseType from encoded stream.
   */
  public static codePhaseType fromPerAligned(byte[] encodedBytes) {
    codePhaseType result = new codePhaseType();
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
    return "codePhaseType = " + getInteger() + ";\n";
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
public static class integerCodePhaseType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_integerCodePhaseType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public integerCodePhaseType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("127"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_integerCodePhaseType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_integerCodePhaseType != null) {
      return ImmutableList.of(TAG_integerCodePhaseType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new integerCodePhaseType from encoded stream.
   */
  public static integerCodePhaseType fromPerUnaligned(byte[] encodedBytes) {
    integerCodePhaseType result = new integerCodePhaseType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new integerCodePhaseType from encoded stream.
   */
  public static integerCodePhaseType fromPerAligned(byte[] encodedBytes) {
    integerCodePhaseType result = new integerCodePhaseType();
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
    return "integerCodePhaseType = " + getInteger() + ";\n";
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
public static class codePhaseRMSErrorType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_codePhaseRMSErrorType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public codePhaseRMSErrorType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("63"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_codePhaseRMSErrorType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_codePhaseRMSErrorType != null) {
      return ImmutableList.of(TAG_codePhaseRMSErrorType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new codePhaseRMSErrorType from encoded stream.
   */
  public static codePhaseRMSErrorType fromPerUnaligned(byte[] encodedBytes) {
    codePhaseRMSErrorType result = new codePhaseRMSErrorType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new codePhaseRMSErrorType from encoded stream.
   */
  public static codePhaseRMSErrorType fromPerAligned(byte[] encodedBytes) {
    codePhaseRMSErrorType result = new codePhaseRMSErrorType();
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
    return "codePhaseRMSErrorType = " + getInteger() + ";\n";
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
public static class dopplerType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_dopplerType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public dopplerType() {
    super();
    setValueRange(new java.math.BigInteger("-32768"), new java.math.BigInteger("32767"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_dopplerType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_dopplerType != null) {
      return ImmutableList.of(TAG_dopplerType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new dopplerType from encoded stream.
   */
  public static dopplerType fromPerUnaligned(byte[] encodedBytes) {
    dopplerType result = new dopplerType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new dopplerType from encoded stream.
   */
  public static dopplerType fromPerAligned(byte[] encodedBytes) {
    dopplerType result = new dopplerType();
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
    return "dopplerType = " + getInteger() + ";\n";
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
public static class adrType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_adrType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public adrType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("33554431"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_adrType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_adrType != null) {
      return ImmutableList.of(TAG_adrType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new adrType from encoded stream.
   */
  public static adrType fromPerUnaligned(byte[] encodedBytes) {
    adrType result = new adrType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new adrType from encoded stream.
   */
  public static adrType fromPerAligned(byte[] encodedBytes) {
    adrType result = new adrType();
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
    return "adrType = " + getInteger() + ";\n";
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
    builder.append("GANSS_SgnElement = {\n");
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
