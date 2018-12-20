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
public  class AcquisElement extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_AcquisElement
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public AcquisElement() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_AcquisElement;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_AcquisElement != null) {
      return ImmutableList.of(TAG_AcquisElement);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new AcquisElement from encoded stream.
   */
  public static AcquisElement fromPerUnaligned(byte[] encodedBytes) {
    AcquisElement result = new AcquisElement();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new AcquisElement from encoded stream.
   */
  public static AcquisElement fromPerAligned(byte[] encodedBytes) {
    AcquisElement result = new AcquisElement();
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

  
  private SatelliteID svid_;
  public SatelliteID getSvid() {
    return svid_;
  }
  /**
   * @throws ClassCastException if value is not a SatelliteID
   */
  public void setSvid(Asn1Object value) {
    this.svid_ = (SatelliteID) value;
  }
  public SatelliteID setSvidToNewInstance() {
    svid_ = new SatelliteID();
    return svid_;
  }
  
  private AcquisElement.doppler0Type doppler0_;
  public AcquisElement.doppler0Type getDoppler0() {
    return doppler0_;
  }
  /**
   * @throws ClassCastException if value is not a AcquisElement.doppler0Type
   */
  public void setDoppler0(Asn1Object value) {
    this.doppler0_ = (AcquisElement.doppler0Type) value;
  }
  public AcquisElement.doppler0Type setDoppler0ToNewInstance() {
    doppler0_ = new AcquisElement.doppler0Type();
    return doppler0_;
  }
  
  private AddionalDopplerFields addionalDoppler_;
  public AddionalDopplerFields getAddionalDoppler() {
    return addionalDoppler_;
  }
  /**
   * @throws ClassCastException if value is not a AddionalDopplerFields
   */
  public void setAddionalDoppler(Asn1Object value) {
    this.addionalDoppler_ = (AddionalDopplerFields) value;
  }
  public AddionalDopplerFields setAddionalDopplerToNewInstance() {
    addionalDoppler_ = new AddionalDopplerFields();
    return addionalDoppler_;
  }
  
  private AcquisElement.codePhaseType codePhase_;
  public AcquisElement.codePhaseType getCodePhase() {
    return codePhase_;
  }
  /**
   * @throws ClassCastException if value is not a AcquisElement.codePhaseType
   */
  public void setCodePhase(Asn1Object value) {
    this.codePhase_ = (AcquisElement.codePhaseType) value;
  }
  public AcquisElement.codePhaseType setCodePhaseToNewInstance() {
    codePhase_ = new AcquisElement.codePhaseType();
    return codePhase_;
  }
  
  private AcquisElement.intCodePhaseType intCodePhase_;
  public AcquisElement.intCodePhaseType getIntCodePhase() {
    return intCodePhase_;
  }
  /**
   * @throws ClassCastException if value is not a AcquisElement.intCodePhaseType
   */
  public void setIntCodePhase(Asn1Object value) {
    this.intCodePhase_ = (AcquisElement.intCodePhaseType) value;
  }
  public AcquisElement.intCodePhaseType setIntCodePhaseToNewInstance() {
    intCodePhase_ = new AcquisElement.intCodePhaseType();
    return intCodePhase_;
  }
  
  private AcquisElement.gpsBitNumberType gpsBitNumber_;
  public AcquisElement.gpsBitNumberType getGpsBitNumber() {
    return gpsBitNumber_;
  }
  /**
   * @throws ClassCastException if value is not a AcquisElement.gpsBitNumberType
   */
  public void setGpsBitNumber(Asn1Object value) {
    this.gpsBitNumber_ = (AcquisElement.gpsBitNumberType) value;
  }
  public AcquisElement.gpsBitNumberType setGpsBitNumberToNewInstance() {
    gpsBitNumber_ = new AcquisElement.gpsBitNumberType();
    return gpsBitNumber_;
  }
  
  private AcquisElement.codePhaseSearchWindowType codePhaseSearchWindow_;
  public AcquisElement.codePhaseSearchWindowType getCodePhaseSearchWindow() {
    return codePhaseSearchWindow_;
  }
  /**
   * @throws ClassCastException if value is not a AcquisElement.codePhaseSearchWindowType
   */
  public void setCodePhaseSearchWindow(Asn1Object value) {
    this.codePhaseSearchWindow_ = (AcquisElement.codePhaseSearchWindowType) value;
  }
  public AcquisElement.codePhaseSearchWindowType setCodePhaseSearchWindowToNewInstance() {
    codePhaseSearchWindow_ = new AcquisElement.codePhaseSearchWindowType();
    return codePhaseSearchWindow_;
  }
  
  private AddionalAngleFields addionalAngle_;
  public AddionalAngleFields getAddionalAngle() {
    return addionalAngle_;
  }
  /**
   * @throws ClassCastException if value is not a AddionalAngleFields
   */
  public void setAddionalAngle(Asn1Object value) {
    this.addionalAngle_ = (AddionalAngleFields) value;
  }
  public AddionalAngleFields setAddionalAngleToNewInstance() {
    addionalAngle_ = new AddionalAngleFields();
    return addionalAngle_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getSvid() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getSvid();
          }

          @Override public void setToNewInstance() {
            setSvidToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SatelliteID.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "svid : "
                    + getSvid().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getDoppler0() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getDoppler0();
          }

          @Override public void setToNewInstance() {
            setDoppler0ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? AcquisElement.doppler0Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "doppler0 : "
                    + getDoppler0().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getAddionalDoppler() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getAddionalDoppler();
          }

          @Override public void setToNewInstance() {
            setAddionalDopplerToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? AddionalDopplerFields.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "addionalDoppler : "
                    + getAddionalDoppler().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

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
            return tag == null ? AcquisElement.codePhaseType.getPossibleFirstTags() : ImmutableList.of(tag);
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
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getIntCodePhase() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getIntCodePhase();
          }

          @Override public void setToNewInstance() {
            setIntCodePhaseToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? AcquisElement.intCodePhaseType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "intCodePhase : "
                    + getIntCodePhase().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getGpsBitNumber() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGpsBitNumber();
          }

          @Override public void setToNewInstance() {
            setGpsBitNumberToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? AcquisElement.gpsBitNumberType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gpsBitNumber : "
                    + getGpsBitNumber().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getCodePhaseSearchWindow() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCodePhaseSearchWindow();
          }

          @Override public void setToNewInstance() {
            setCodePhaseSearchWindowToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? AcquisElement.codePhaseSearchWindowType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "codePhaseSearchWindow : "
                    + getCodePhaseSearchWindow().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 7);

          @Override public boolean isExplicitlySet() {
            return getAddionalAngle() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getAddionalAngle();
          }

          @Override public void setToNewInstance() {
            setAddionalAngleToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? AddionalAngleFields.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "addionalAngle : "
                    + getAddionalAngle().toIndentedString(indent);
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
public static class doppler0Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_doppler0Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public doppler0Type() {
    super();
    setValueRange(new java.math.BigInteger("-2048"), new java.math.BigInteger("2047"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_doppler0Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_doppler0Type != null) {
      return ImmutableList.of(TAG_doppler0Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new doppler0Type from encoded stream.
   */
  public static doppler0Type fromPerUnaligned(byte[] encodedBytes) {
    doppler0Type result = new doppler0Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new doppler0Type from encoded stream.
   */
  public static doppler0Type fromPerAligned(byte[] encodedBytes) {
    doppler0Type result = new doppler0Type();
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
    return "doppler0Type = " + getInteger() + ";\n";
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
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("1022"));

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
public static class intCodePhaseType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_intCodePhaseType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public intCodePhaseType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("19"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_intCodePhaseType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_intCodePhaseType != null) {
      return ImmutableList.of(TAG_intCodePhaseType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new intCodePhaseType from encoded stream.
   */
  public static intCodePhaseType fromPerUnaligned(byte[] encodedBytes) {
    intCodePhaseType result = new intCodePhaseType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new intCodePhaseType from encoded stream.
   */
  public static intCodePhaseType fromPerAligned(byte[] encodedBytes) {
    intCodePhaseType result = new intCodePhaseType();
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
    return "intCodePhaseType = " + getInteger() + ";\n";
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
public static class gpsBitNumberType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_gpsBitNumberType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gpsBitNumberType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("3"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gpsBitNumberType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gpsBitNumberType != null) {
      return ImmutableList.of(TAG_gpsBitNumberType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gpsBitNumberType from encoded stream.
   */
  public static gpsBitNumberType fromPerUnaligned(byte[] encodedBytes) {
    gpsBitNumberType result = new gpsBitNumberType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gpsBitNumberType from encoded stream.
   */
  public static gpsBitNumberType fromPerAligned(byte[] encodedBytes) {
    gpsBitNumberType result = new gpsBitNumberType();
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
    return "gpsBitNumberType = " + getInteger() + ";\n";
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
public static class codePhaseSearchWindowType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_codePhaseSearchWindowType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public codePhaseSearchWindowType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("15"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_codePhaseSearchWindowType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_codePhaseSearchWindowType != null) {
      return ImmutableList.of(TAG_codePhaseSearchWindowType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new codePhaseSearchWindowType from encoded stream.
   */
  public static codePhaseSearchWindowType fromPerUnaligned(byte[] encodedBytes) {
    codePhaseSearchWindowType result = new codePhaseSearchWindowType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new codePhaseSearchWindowType from encoded stream.
   */
  public static codePhaseSearchWindowType fromPerAligned(byte[] encodedBytes) {
    codePhaseSearchWindowType result = new codePhaseSearchWindowType();
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
    return "codePhaseSearchWindowType = " + getInteger() + ";\n";
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
    builder.append("AcquisElement = {\n");
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
