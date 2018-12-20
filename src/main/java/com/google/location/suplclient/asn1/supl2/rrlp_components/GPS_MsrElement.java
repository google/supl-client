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
public  class GPS_MsrElement extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GPS_MsrElement
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GPS_MsrElement() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GPS_MsrElement;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GPS_MsrElement != null) {
      return ImmutableList.of(TAG_GPS_MsrElement);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GPS_MsrElement from encoded stream.
   */
  public static GPS_MsrElement fromPerUnaligned(byte[] encodedBytes) {
    GPS_MsrElement result = new GPS_MsrElement();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GPS_MsrElement from encoded stream.
   */
  public static GPS_MsrElement fromPerAligned(byte[] encodedBytes) {
    GPS_MsrElement result = new GPS_MsrElement();
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

  
  private SatelliteID satelliteID_;
  public SatelliteID getSatelliteID() {
    return satelliteID_;
  }
  /**
   * @throws ClassCastException if value is not a SatelliteID
   */
  public void setSatelliteID(Asn1Object value) {
    this.satelliteID_ = (SatelliteID) value;
  }
  public SatelliteID setSatelliteIDToNewInstance() {
    satelliteID_ = new SatelliteID();
    return satelliteID_;
  }
  
  private GPS_MsrElement.cNoType cNo_;
  public GPS_MsrElement.cNoType getCNo() {
    return cNo_;
  }
  /**
   * @throws ClassCastException if value is not a GPS_MsrElement.cNoType
   */
  public void setCNo(Asn1Object value) {
    this.cNo_ = (GPS_MsrElement.cNoType) value;
  }
  public GPS_MsrElement.cNoType setCNoToNewInstance() {
    cNo_ = new GPS_MsrElement.cNoType();
    return cNo_;
  }
  
  private GPS_MsrElement.dopplerType doppler_;
  public GPS_MsrElement.dopplerType getDoppler() {
    return doppler_;
  }
  /**
   * @throws ClassCastException if value is not a GPS_MsrElement.dopplerType
   */
  public void setDoppler(Asn1Object value) {
    this.doppler_ = (GPS_MsrElement.dopplerType) value;
  }
  public GPS_MsrElement.dopplerType setDopplerToNewInstance() {
    doppler_ = new GPS_MsrElement.dopplerType();
    return doppler_;
  }
  
  private GPS_MsrElement.wholeChipsType wholeChips_;
  public GPS_MsrElement.wholeChipsType getWholeChips() {
    return wholeChips_;
  }
  /**
   * @throws ClassCastException if value is not a GPS_MsrElement.wholeChipsType
   */
  public void setWholeChips(Asn1Object value) {
    this.wholeChips_ = (GPS_MsrElement.wholeChipsType) value;
  }
  public GPS_MsrElement.wholeChipsType setWholeChipsToNewInstance() {
    wholeChips_ = new GPS_MsrElement.wholeChipsType();
    return wholeChips_;
  }
  
  private GPS_MsrElement.fracChipsType fracChips_;
  public GPS_MsrElement.fracChipsType getFracChips() {
    return fracChips_;
  }
  /**
   * @throws ClassCastException if value is not a GPS_MsrElement.fracChipsType
   */
  public void setFracChips(Asn1Object value) {
    this.fracChips_ = (GPS_MsrElement.fracChipsType) value;
  }
  public GPS_MsrElement.fracChipsType setFracChipsToNewInstance() {
    fracChips_ = new GPS_MsrElement.fracChipsType();
    return fracChips_;
  }
  
  private MpathIndic mpathIndic_;
  public MpathIndic getMpathIndic() {
    return mpathIndic_;
  }
  /**
   * @throws ClassCastException if value is not a MpathIndic
   */
  public void setMpathIndic(Asn1Object value) {
    this.mpathIndic_ = (MpathIndic) value;
  }
  public MpathIndic setMpathIndicToNewInstance() {
    mpathIndic_ = new MpathIndic();
    return mpathIndic_;
  }
  
  private GPS_MsrElement.pseuRangeRMSErrType pseuRangeRMSErr_;
  public GPS_MsrElement.pseuRangeRMSErrType getPseuRangeRMSErr() {
    return pseuRangeRMSErr_;
  }
  /**
   * @throws ClassCastException if value is not a GPS_MsrElement.pseuRangeRMSErrType
   */
  public void setPseuRangeRMSErr(Asn1Object value) {
    this.pseuRangeRMSErr_ = (GPS_MsrElement.pseuRangeRMSErrType) value;
  }
  public GPS_MsrElement.pseuRangeRMSErrType setPseuRangeRMSErrToNewInstance() {
    pseuRangeRMSErr_ = new GPS_MsrElement.pseuRangeRMSErrType();
    return pseuRangeRMSErr_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getSatelliteID() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getSatelliteID();
          }

          @Override public void setToNewInstance() {
            setSatelliteIDToNewInstance();
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
                return "satelliteID : "
                    + getSatelliteID().toIndentedString(indent);
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
            return tag == null ? GPS_MsrElement.cNoType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return getDoppler() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getDoppler();
          }

          @Override public void setToNewInstance() {
            setDopplerToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GPS_MsrElement.dopplerType.getPossibleFirstTags() : ImmutableList.of(tag);
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
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getWholeChips() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getWholeChips();
          }

          @Override public void setToNewInstance() {
            setWholeChipsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GPS_MsrElement.wholeChipsType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "wholeChips : "
                    + getWholeChips().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getFracChips() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getFracChips();
          }

          @Override public void setToNewInstance() {
            setFracChipsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GPS_MsrElement.fracChipsType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "fracChips : "
                    + getFracChips().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getMpathIndic() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getMpathIndic();
          }

          @Override public void setToNewInstance() {
            setMpathIndicToNewInstance();
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
                return "mpathIndic : "
                    + getMpathIndic().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getPseuRangeRMSErr() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getPseuRangeRMSErr();
          }

          @Override public void setToNewInstance() {
            setPseuRangeRMSErrToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GPS_MsrElement.pseuRangeRMSErrType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "pseuRangeRMSErr : "
                    + getPseuRangeRMSErr().toIndentedString(indent);
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
public static class wholeChipsType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_wholeChipsType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public wholeChipsType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("1022"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_wholeChipsType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_wholeChipsType != null) {
      return ImmutableList.of(TAG_wholeChipsType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new wholeChipsType from encoded stream.
   */
  public static wholeChipsType fromPerUnaligned(byte[] encodedBytes) {
    wholeChipsType result = new wholeChipsType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new wholeChipsType from encoded stream.
   */
  public static wholeChipsType fromPerAligned(byte[] encodedBytes) {
    wholeChipsType result = new wholeChipsType();
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
    return "wholeChipsType = " + getInteger() + ";\n";
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
public static class fracChipsType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_fracChipsType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public fracChipsType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("1024"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_fracChipsType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_fracChipsType != null) {
      return ImmutableList.of(TAG_fracChipsType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new fracChipsType from encoded stream.
   */
  public static fracChipsType fromPerUnaligned(byte[] encodedBytes) {
    fracChipsType result = new fracChipsType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new fracChipsType from encoded stream.
   */
  public static fracChipsType fromPerAligned(byte[] encodedBytes) {
    fracChipsType result = new fracChipsType();
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
    return "fracChipsType = " + getInteger() + ";\n";
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
public static class pseuRangeRMSErrType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_pseuRangeRMSErrType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public pseuRangeRMSErrType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("63"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_pseuRangeRMSErrType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_pseuRangeRMSErrType != null) {
      return ImmutableList.of(TAG_pseuRangeRMSErrType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new pseuRangeRMSErrType from encoded stream.
   */
  public static pseuRangeRMSErrType fromPerUnaligned(byte[] encodedBytes) {
    pseuRangeRMSErrType result = new pseuRangeRMSErrType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new pseuRangeRMSErrType from encoded stream.
   */
  public static pseuRangeRMSErrType fromPerAligned(byte[] encodedBytes) {
    pseuRangeRMSErrType result = new pseuRangeRMSErrType();
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
    return "pseuRangeRMSErrType = " + getInteger() + ";\n";
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
    builder.append("GPS_MsrElement = {\n");
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
