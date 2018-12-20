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
import com.google.location.suplclient.asn1.base.Asn1Boolean;
import com.google.location.suplclient.asn1.base.Asn1Enumerated;
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
public  class GNSS_AcquisitionAssistElement extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GNSS_AcquisitionAssistElement
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GNSS_AcquisitionAssistElement() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GNSS_AcquisitionAssistElement;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GNSS_AcquisitionAssistElement != null) {
      return ImmutableList.of(TAG_GNSS_AcquisitionAssistElement);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GNSS_AcquisitionAssistElement from encoded stream.
   */
  public static GNSS_AcquisitionAssistElement fromPerUnaligned(byte[] encodedBytes) {
    GNSS_AcquisitionAssistElement result = new GNSS_AcquisitionAssistElement();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GNSS_AcquisitionAssistElement from encoded stream.
   */
  public static GNSS_AcquisitionAssistElement fromPerAligned(byte[] encodedBytes) {
    GNSS_AcquisitionAssistElement result = new GNSS_AcquisitionAssistElement();
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

  
  private SV_ID svID_;
  public SV_ID getSvID() {
    return svID_;
  }
  /**
   * @throws ClassCastException if value is not a SV_ID
   */
  public void setSvID(Asn1Object value) {
    this.svID_ = (SV_ID) value;
  }
  public SV_ID setSvIDToNewInstance() {
    svID_ = new SV_ID();
    return svID_;
  }
  
  private GNSS_AcquisitionAssistElement.doppler0Type doppler0_;
  public GNSS_AcquisitionAssistElement.doppler0Type getDoppler0() {
    return doppler0_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_AcquisitionAssistElement.doppler0Type
   */
  public void setDoppler0(Asn1Object value) {
    this.doppler0_ = (GNSS_AcquisitionAssistElement.doppler0Type) value;
  }
  public GNSS_AcquisitionAssistElement.doppler0Type setDoppler0ToNewInstance() {
    doppler0_ = new GNSS_AcquisitionAssistElement.doppler0Type();
    return doppler0_;
  }
  
  private GNSS_AcquisitionAssistElement.doppler1Type doppler1_;
  public GNSS_AcquisitionAssistElement.doppler1Type getDoppler1() {
    return doppler1_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_AcquisitionAssistElement.doppler1Type
   */
  public void setDoppler1(Asn1Object value) {
    this.doppler1_ = (GNSS_AcquisitionAssistElement.doppler1Type) value;
  }
  public GNSS_AcquisitionAssistElement.doppler1Type setDoppler1ToNewInstance() {
    doppler1_ = new GNSS_AcquisitionAssistElement.doppler1Type();
    return doppler1_;
  }
  
  private GNSS_AcquisitionAssistElement.dopplerUncertaintyType dopplerUncertainty_;
  public GNSS_AcquisitionAssistElement.dopplerUncertaintyType getDopplerUncertainty() {
    return dopplerUncertainty_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_AcquisitionAssistElement.dopplerUncertaintyType
   */
  public void setDopplerUncertainty(Asn1Object value) {
    this.dopplerUncertainty_ = (GNSS_AcquisitionAssistElement.dopplerUncertaintyType) value;
  }
  public GNSS_AcquisitionAssistElement.dopplerUncertaintyType setDopplerUncertaintyToNewInstance() {
    dopplerUncertainty_ = new GNSS_AcquisitionAssistElement.dopplerUncertaintyType();
    return dopplerUncertainty_;
  }
  
  private GNSS_AcquisitionAssistElement.codePhaseType codePhase_;
  public GNSS_AcquisitionAssistElement.codePhaseType getCodePhase() {
    return codePhase_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_AcquisitionAssistElement.codePhaseType
   */
  public void setCodePhase(Asn1Object value) {
    this.codePhase_ = (GNSS_AcquisitionAssistElement.codePhaseType) value;
  }
  public GNSS_AcquisitionAssistElement.codePhaseType setCodePhaseToNewInstance() {
    codePhase_ = new GNSS_AcquisitionAssistElement.codePhaseType();
    return codePhase_;
  }
  
  private GNSS_AcquisitionAssistElement.intCodePhaseType intCodePhase_;
  public GNSS_AcquisitionAssistElement.intCodePhaseType getIntCodePhase() {
    return intCodePhase_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_AcquisitionAssistElement.intCodePhaseType
   */
  public void setIntCodePhase(Asn1Object value) {
    this.intCodePhase_ = (GNSS_AcquisitionAssistElement.intCodePhaseType) value;
  }
  public GNSS_AcquisitionAssistElement.intCodePhaseType setIntCodePhaseToNewInstance() {
    intCodePhase_ = new GNSS_AcquisitionAssistElement.intCodePhaseType();
    return intCodePhase_;
  }
  
  private GNSS_AcquisitionAssistElement.codePhaseSearchWindowType codePhaseSearchWindow_;
  public GNSS_AcquisitionAssistElement.codePhaseSearchWindowType getCodePhaseSearchWindow() {
    return codePhaseSearchWindow_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_AcquisitionAssistElement.codePhaseSearchWindowType
   */
  public void setCodePhaseSearchWindow(Asn1Object value) {
    this.codePhaseSearchWindow_ = (GNSS_AcquisitionAssistElement.codePhaseSearchWindowType) value;
  }
  public GNSS_AcquisitionAssistElement.codePhaseSearchWindowType setCodePhaseSearchWindowToNewInstance() {
    codePhaseSearchWindow_ = new GNSS_AcquisitionAssistElement.codePhaseSearchWindowType();
    return codePhaseSearchWindow_;
  }
  
  private GNSS_AcquisitionAssistElement.azimuthType azimuth_;
  public GNSS_AcquisitionAssistElement.azimuthType getAzimuth() {
    return azimuth_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_AcquisitionAssistElement.azimuthType
   */
  public void setAzimuth(Asn1Object value) {
    this.azimuth_ = (GNSS_AcquisitionAssistElement.azimuthType) value;
  }
  public GNSS_AcquisitionAssistElement.azimuthType setAzimuthToNewInstance() {
    azimuth_ = new GNSS_AcquisitionAssistElement.azimuthType();
    return azimuth_;
  }
  
  private GNSS_AcquisitionAssistElement.elevationType elevation_;
  public GNSS_AcquisitionAssistElement.elevationType getElevation() {
    return elevation_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_AcquisitionAssistElement.elevationType
   */
  public void setElevation(Asn1Object value) {
    this.elevation_ = (GNSS_AcquisitionAssistElement.elevationType) value;
  }
  public GNSS_AcquisitionAssistElement.elevationType setElevationToNewInstance() {
    elevation_ = new GNSS_AcquisitionAssistElement.elevationType();
    return elevation_;
  }
  

  
  private GNSS_AcquisitionAssistElement.codePhase1023Type  extensionCodePhase1023;
  public GNSS_AcquisitionAssistElement.codePhase1023Type getExtensionCodePhase1023() {
    return extensionCodePhase1023;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_AcquisitionAssistElement.codePhase1023Type
   */
  public void setExtensionCodePhase1023(Asn1Object value) {
    extensionCodePhase1023 = (GNSS_AcquisitionAssistElement.codePhase1023Type) value;
  }
  public void setExtensionCodePhase1023ToNewInstance() {
    extensionCodePhase1023 = new GNSS_AcquisitionAssistElement.codePhase1023Type();
  }
    
  private GNSS_AcquisitionAssistElement.dopplerUncertaintyExt_r10Type  extensionDopplerUncertaintyExt_r10;
  public GNSS_AcquisitionAssistElement.dopplerUncertaintyExt_r10Type getExtensionDopplerUncertaintyExt_r10() {
    return extensionDopplerUncertaintyExt_r10;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_AcquisitionAssistElement.dopplerUncertaintyExt_r10Type
   */
  public void setExtensionDopplerUncertaintyExt_r10(Asn1Object value) {
    extensionDopplerUncertaintyExt_r10 = (GNSS_AcquisitionAssistElement.dopplerUncertaintyExt_r10Type) value;
  }
  public void setExtensionDopplerUncertaintyExt_r10ToNewInstance() {
    extensionDopplerUncertaintyExt_r10 = new GNSS_AcquisitionAssistElement.dopplerUncertaintyExt_r10Type();
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
            return tag == null ? SV_ID.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? GNSS_AcquisitionAssistElement.doppler0Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return getDoppler1() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getDoppler1();
          }

          @Override public void setToNewInstance() {
            setDoppler1ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_AcquisitionAssistElement.doppler1Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "doppler1 : "
                    + getDoppler1().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getDopplerUncertainty() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getDopplerUncertainty();
          }

          @Override public void setToNewInstance() {
            setDopplerUncertaintyToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_AcquisitionAssistElement.dopplerUncertaintyType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "dopplerUncertainty : "
                    + getDopplerUncertainty().toIndentedString(indent);
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
            return tag == null ? GNSS_AcquisitionAssistElement.codePhaseType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? GNSS_AcquisitionAssistElement.intCodePhaseType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? GNSS_AcquisitionAssistElement.codePhaseSearchWindowType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return getAzimuth() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getAzimuth();
          }

          @Override public void setToNewInstance() {
            setAzimuthToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_AcquisitionAssistElement.azimuthType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "azimuth : "
                    + getAzimuth().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 8);

          @Override public boolean isExplicitlySet() {
            return getElevation() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getElevation();
          }

          @Override public void setToNewInstance() {
            setElevationToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_AcquisitionAssistElement.elevationType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "elevation : "
                    + getElevation().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      builder.add(new SequenceComponent() {
            @Override public boolean isExplicitlySet() {
              return getExtensionCodePhase1023() != null;
            }

            @Override public boolean hasDefaultValue() {
              return false;
            }

            @Override public boolean isOptional() {
              return true;
            }

            @Override public Asn1Object getComponentValue() {
              return getExtensionCodePhase1023();
            }

            @Override public void setToNewInstance() {
              setExtensionCodePhase1023ToNewInstance();
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
              return "codePhase1023 : "
                  + getExtensionCodePhase1023().toIndentedString(indent);
            }
      });
      
      builder.add(new SequenceComponent() {
            @Override public boolean isExplicitlySet() {
              return getExtensionDopplerUncertaintyExt_r10() != null;
            }

            @Override public boolean hasDefaultValue() {
              return false;
            }

            @Override public boolean isOptional() {
              return true;
            }

            @Override public Asn1Object getComponentValue() {
              return getExtensionDopplerUncertaintyExt_r10();
            }

            @Override public void setToNewInstance() {
              setExtensionDopplerUncertaintyExt_r10ToNewInstance();
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
              return "dopplerUncertaintyExt_r10 : "
                  + getExtensionDopplerUncertaintyExt_r10().toIndentedString(indent);
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
public static class doppler1Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_doppler1Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public doppler1Type() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("63"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_doppler1Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_doppler1Type != null) {
      return ImmutableList.of(TAG_doppler1Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new doppler1Type from encoded stream.
   */
  public static doppler1Type fromPerUnaligned(byte[] encodedBytes) {
    doppler1Type result = new doppler1Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new doppler1Type from encoded stream.
   */
  public static doppler1Type fromPerAligned(byte[] encodedBytes) {
    doppler1Type result = new doppler1Type();
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
    return "doppler1Type = " + getInteger() + ";\n";
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
public static class dopplerUncertaintyType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_dopplerUncertaintyType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public dopplerUncertaintyType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("4"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_dopplerUncertaintyType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_dopplerUncertaintyType != null) {
      return ImmutableList.of(TAG_dopplerUncertaintyType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new dopplerUncertaintyType from encoded stream.
   */
  public static dopplerUncertaintyType fromPerUnaligned(byte[] encodedBytes) {
    dopplerUncertaintyType result = new dopplerUncertaintyType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new dopplerUncertaintyType from encoded stream.
   */
  public static dopplerUncertaintyType fromPerAligned(byte[] encodedBytes) {
    dopplerUncertaintyType result = new dopplerUncertaintyType();
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
    return "dopplerUncertaintyType = " + getInteger() + ";\n";
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
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("127"));

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
public static class codePhaseSearchWindowType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_codePhaseSearchWindowType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public codePhaseSearchWindowType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("31"));

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

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class azimuthType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_azimuthType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public azimuthType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("511"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_azimuthType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_azimuthType != null) {
      return ImmutableList.of(TAG_azimuthType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new azimuthType from encoded stream.
   */
  public static azimuthType fromPerUnaligned(byte[] encodedBytes) {
    azimuthType result = new azimuthType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new azimuthType from encoded stream.
   */
  public static azimuthType fromPerAligned(byte[] encodedBytes) {
    azimuthType result = new azimuthType();
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
    return "azimuthType = " + getInteger() + ";\n";
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
public static class elevationType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_elevationType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public elevationType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("127"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_elevationType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_elevationType != null) {
      return ImmutableList.of(TAG_elevationType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new elevationType from encoded stream.
   */
  public static elevationType fromPerUnaligned(byte[] encodedBytes) {
    elevationType result = new elevationType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new elevationType from encoded stream.
   */
  public static elevationType fromPerAligned(byte[] encodedBytes) {
    elevationType result = new elevationType();
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
    return "elevationType = " + getInteger() + ";\n";
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
public static class codePhase1023Type extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_codePhase1023Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public codePhase1023Type() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_codePhase1023Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_codePhase1023Type != null) {
      return ImmutableList.of(TAG_codePhase1023Type);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new codePhase1023Type from encoded stream.
   */
  public static codePhase1023Type fromPerUnaligned(byte[] encodedBytes) {
    codePhase1023Type result = new codePhase1023Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new codePhase1023Type from encoded stream.
   */
  public static codePhase1023Type fromPerAligned(byte[] encodedBytes) {
    codePhase1023Type result = new codePhase1023Type();
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
    return "codePhase1023Type = " + getValue() + ";\n";
  }
}

    
    // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class dopplerUncertaintyExt_r10Type extends Asn1Enumerated {
  public enum Value implements Asn1Enumerated.Value {
    d60(0),
    d80(1),
    d100(2),
    d120(3),
    noInformation(4),
    ;

    Value(int i) {
      value = i;
    }

    private int value;
    public int getAssignedValue() {
      return value;
    }

    @Override public boolean isExtensionValue() {
      return false;
    }
  }

  @Override
  protected Value getDefaultValue() {
    return null
;
  }

  @SuppressWarnings("unchecked")
  public Value enumValue() {
    return (Value) getValue();
  }


  
  public void setTo_d60() {
    setValue(Value.d60);
  }
  
  public void setTo_d80() {
    setValue(Value.d80);
  }
  
  public void setTo_d100() {
    setValue(Value.d100);
  }
  
  public void setTo_d120() {
    setValue(Value.d120);
  }
  
  public void setTo_noInformation() {
    setValue(Value.noInformation);
  }
  


  public enum ExtensionValue implements Asn1Enumerated.Value {
    ;

    ExtensionValue(int i) {
      value = i;
    }

    private int value;
    @Override public int getAssignedValue() {
      return value;
    }

    @Override public boolean isExtensionValue() {
      return true;
    }
  }

  @SuppressWarnings("unchecked")
  public ExtensionValue extEnumValue() {
    return (ExtensionValue) getValue();
  }

  

  

  private static final Asn1Tag TAG_dopplerUncertaintyExt_r10Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public dopplerUncertaintyExt_r10Type() {
    super();
    // use template substitution instead of calling getDefaultValue(), since
    // calling virtual methods from a ctor is frowned upon here.
    setValue(null
);
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_dopplerUncertaintyExt_r10Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_dopplerUncertaintyExt_r10Type != null) {
      return ImmutableList.of(TAG_dopplerUncertaintyExt_r10Type);
    } else {
      return Asn1Enumerated.getPossibleFirstTags();
    }
  }

  @Override protected boolean isExtensible() {
    return true;
  }

  @Override protected Asn1Enumerated.Value lookupValue(int ordinal) {
    return Value.values()[ordinal];
  }

  @Override protected Asn1Enumerated.Value lookupExtensionValue(int ordinal) {
    return ExtensionValue.values()[ordinal];
  }

  @Override protected int getValueCount() {
    return Value.values().length;
  }

  /**
   * Creates a new dopplerUncertaintyExt_r10Type from encoded stream.
   */
  public static dopplerUncertaintyExt_r10Type fromPerUnaligned(byte[] encodedBytes) {
    dopplerUncertaintyExt_r10Type result = new dopplerUncertaintyExt_r10Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new dopplerUncertaintyExt_r10Type from encoded stream.
   */
  public static dopplerUncertaintyExt_r10Type fromPerAligned(byte[] encodedBytes) {
    dopplerUncertaintyExt_r10Type result = new dopplerUncertaintyExt_r10Type();
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
    return "dopplerUncertaintyExt_r10Type = " + getValue() + ";\n";
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
    builder.append("GNSS_AcquisitionAssistElement = {\n");
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
