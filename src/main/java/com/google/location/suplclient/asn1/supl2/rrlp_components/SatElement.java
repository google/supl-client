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
public  class SatElement extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_SatElement
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public SatElement() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_SatElement;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_SatElement != null) {
      return ImmutableList.of(TAG_SatElement);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new SatElement from encoded stream.
   */
  public static SatElement fromPerUnaligned(byte[] encodedBytes) {
    SatElement result = new SatElement();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new SatElement from encoded stream.
   */
  public static SatElement fromPerAligned(byte[] encodedBytes) {
    SatElement result = new SatElement();
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
  
  private SatElement.iodeType iode_;
  public SatElement.iodeType getIode() {
    return iode_;
  }
  /**
   * @throws ClassCastException if value is not a SatElement.iodeType
   */
  public void setIode(Asn1Object value) {
    this.iode_ = (SatElement.iodeType) value;
  }
  public SatElement.iodeType setIodeToNewInstance() {
    iode_ = new SatElement.iodeType();
    return iode_;
  }
  
  private SatElement.udreType udre_;
  public SatElement.udreType getUdre() {
    return udre_;
  }
  /**
   * @throws ClassCastException if value is not a SatElement.udreType
   */
  public void setUdre(Asn1Object value) {
    this.udre_ = (SatElement.udreType) value;
  }
  public SatElement.udreType setUdreToNewInstance() {
    udre_ = new SatElement.udreType();
    return udre_;
  }
  
  private SatElement.pseudoRangeCorType pseudoRangeCor_;
  public SatElement.pseudoRangeCorType getPseudoRangeCor() {
    return pseudoRangeCor_;
  }
  /**
   * @throws ClassCastException if value is not a SatElement.pseudoRangeCorType
   */
  public void setPseudoRangeCor(Asn1Object value) {
    this.pseudoRangeCor_ = (SatElement.pseudoRangeCorType) value;
  }
  public SatElement.pseudoRangeCorType setPseudoRangeCorToNewInstance() {
    pseudoRangeCor_ = new SatElement.pseudoRangeCorType();
    return pseudoRangeCor_;
  }
  
  private SatElement.rangeRateCorType rangeRateCor_;
  public SatElement.rangeRateCorType getRangeRateCor() {
    return rangeRateCor_;
  }
  /**
   * @throws ClassCastException if value is not a SatElement.rangeRateCorType
   */
  public void setRangeRateCor(Asn1Object value) {
    this.rangeRateCor_ = (SatElement.rangeRateCorType) value;
  }
  public SatElement.rangeRateCorType setRangeRateCorToNewInstance() {
    rangeRateCor_ = new SatElement.rangeRateCorType();
    return rangeRateCor_;
  }
  
  private SatElement.deltaPseudoRangeCor2Type deltaPseudoRangeCor2_;
  public SatElement.deltaPseudoRangeCor2Type getDeltaPseudoRangeCor2() {
    return deltaPseudoRangeCor2_;
  }
  /**
   * @throws ClassCastException if value is not a SatElement.deltaPseudoRangeCor2Type
   */
  public void setDeltaPseudoRangeCor2(Asn1Object value) {
    this.deltaPseudoRangeCor2_ = (SatElement.deltaPseudoRangeCor2Type) value;
  }
  public SatElement.deltaPseudoRangeCor2Type setDeltaPseudoRangeCor2ToNewInstance() {
    deltaPseudoRangeCor2_ = new SatElement.deltaPseudoRangeCor2Type();
    return deltaPseudoRangeCor2_;
  }
  
  private SatElement.deltaRangeRateCor2Type deltaRangeRateCor2_;
  public SatElement.deltaRangeRateCor2Type getDeltaRangeRateCor2() {
    return deltaRangeRateCor2_;
  }
  /**
   * @throws ClassCastException if value is not a SatElement.deltaRangeRateCor2Type
   */
  public void setDeltaRangeRateCor2(Asn1Object value) {
    this.deltaRangeRateCor2_ = (SatElement.deltaRangeRateCor2Type) value;
  }
  public SatElement.deltaRangeRateCor2Type setDeltaRangeRateCor2ToNewInstance() {
    deltaRangeRateCor2_ = new SatElement.deltaRangeRateCor2Type();
    return deltaRangeRateCor2_;
  }
  
  private SatElement.deltaPseudoRangeCor3Type deltaPseudoRangeCor3_;
  public SatElement.deltaPseudoRangeCor3Type getDeltaPseudoRangeCor3() {
    return deltaPseudoRangeCor3_;
  }
  /**
   * @throws ClassCastException if value is not a SatElement.deltaPseudoRangeCor3Type
   */
  public void setDeltaPseudoRangeCor3(Asn1Object value) {
    this.deltaPseudoRangeCor3_ = (SatElement.deltaPseudoRangeCor3Type) value;
  }
  public SatElement.deltaPseudoRangeCor3Type setDeltaPseudoRangeCor3ToNewInstance() {
    deltaPseudoRangeCor3_ = new SatElement.deltaPseudoRangeCor3Type();
    return deltaPseudoRangeCor3_;
  }
  
  private SatElement.deltaRangeRateCor3Type deltaRangeRateCor3_;
  public SatElement.deltaRangeRateCor3Type getDeltaRangeRateCor3() {
    return deltaRangeRateCor3_;
  }
  /**
   * @throws ClassCastException if value is not a SatElement.deltaRangeRateCor3Type
   */
  public void setDeltaRangeRateCor3(Asn1Object value) {
    this.deltaRangeRateCor3_ = (SatElement.deltaRangeRateCor3Type) value;
  }
  public SatElement.deltaRangeRateCor3Type setDeltaRangeRateCor3ToNewInstance() {
    deltaRangeRateCor3_ = new SatElement.deltaRangeRateCor3Type();
    return deltaRangeRateCor3_;
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
            return getIode() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getIode();
          }

          @Override public void setToNewInstance() {
            setIodeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SatElement.iodeType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "iode : "
                    + getIode().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getUdre() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getUdre();
          }

          @Override public void setToNewInstance() {
            setUdreToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SatElement.udreType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "udre : "
                    + getUdre().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getPseudoRangeCor() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getPseudoRangeCor();
          }

          @Override public void setToNewInstance() {
            setPseudoRangeCorToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SatElement.pseudoRangeCorType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "pseudoRangeCor : "
                    + getPseudoRangeCor().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getRangeRateCor() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getRangeRateCor();
          }

          @Override public void setToNewInstance() {
            setRangeRateCorToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SatElement.rangeRateCorType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "rangeRateCor : "
                    + getRangeRateCor().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getDeltaPseudoRangeCor2() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getDeltaPseudoRangeCor2();
          }

          @Override public void setToNewInstance() {
            setDeltaPseudoRangeCor2ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SatElement.deltaPseudoRangeCor2Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "deltaPseudoRangeCor2 : "
                    + getDeltaPseudoRangeCor2().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getDeltaRangeRateCor2() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getDeltaRangeRateCor2();
          }

          @Override public void setToNewInstance() {
            setDeltaRangeRateCor2ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SatElement.deltaRangeRateCor2Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "deltaRangeRateCor2 : "
                    + getDeltaRangeRateCor2().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 7);

          @Override public boolean isExplicitlySet() {
            return getDeltaPseudoRangeCor3() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getDeltaPseudoRangeCor3();
          }

          @Override public void setToNewInstance() {
            setDeltaPseudoRangeCor3ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SatElement.deltaPseudoRangeCor3Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "deltaPseudoRangeCor3 : "
                    + getDeltaPseudoRangeCor3().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 8);

          @Override public boolean isExplicitlySet() {
            return getDeltaRangeRateCor3() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getDeltaRangeRateCor3();
          }

          @Override public void setToNewInstance() {
            setDeltaRangeRateCor3ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SatElement.deltaRangeRateCor3Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "deltaRangeRateCor3 : "
                    + getDeltaRangeRateCor3().toIndentedString(indent);
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
public static class iodeType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_iodeType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public iodeType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("239"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_iodeType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_iodeType != null) {
      return ImmutableList.of(TAG_iodeType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new iodeType from encoded stream.
   */
  public static iodeType fromPerUnaligned(byte[] encodedBytes) {
    iodeType result = new iodeType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new iodeType from encoded stream.
   */
  public static iodeType fromPerAligned(byte[] encodedBytes) {
    iodeType result = new iodeType();
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
    return "iodeType = " + getInteger() + ";\n";
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
public static class udreType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_udreType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public udreType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("3"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_udreType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_udreType != null) {
      return ImmutableList.of(TAG_udreType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new udreType from encoded stream.
   */
  public static udreType fromPerUnaligned(byte[] encodedBytes) {
    udreType result = new udreType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new udreType from encoded stream.
   */
  public static udreType fromPerAligned(byte[] encodedBytes) {
    udreType result = new udreType();
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
    return "udreType = " + getInteger() + ";\n";
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
public static class pseudoRangeCorType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_pseudoRangeCorType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public pseudoRangeCorType() {
    super();
    setValueRange(new java.math.BigInteger("-2047"), new java.math.BigInteger("2047"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_pseudoRangeCorType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_pseudoRangeCorType != null) {
      return ImmutableList.of(TAG_pseudoRangeCorType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new pseudoRangeCorType from encoded stream.
   */
  public static pseudoRangeCorType fromPerUnaligned(byte[] encodedBytes) {
    pseudoRangeCorType result = new pseudoRangeCorType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new pseudoRangeCorType from encoded stream.
   */
  public static pseudoRangeCorType fromPerAligned(byte[] encodedBytes) {
    pseudoRangeCorType result = new pseudoRangeCorType();
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
    return "pseudoRangeCorType = " + getInteger() + ";\n";
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
public static class rangeRateCorType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_rangeRateCorType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public rangeRateCorType() {
    super();
    setValueRange(new java.math.BigInteger("-127"), new java.math.BigInteger("127"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_rangeRateCorType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_rangeRateCorType != null) {
      return ImmutableList.of(TAG_rangeRateCorType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new rangeRateCorType from encoded stream.
   */
  public static rangeRateCorType fromPerUnaligned(byte[] encodedBytes) {
    rangeRateCorType result = new rangeRateCorType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new rangeRateCorType from encoded stream.
   */
  public static rangeRateCorType fromPerAligned(byte[] encodedBytes) {
    rangeRateCorType result = new rangeRateCorType();
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
    return "rangeRateCorType = " + getInteger() + ";\n";
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
public static class deltaPseudoRangeCor2Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_deltaPseudoRangeCor2Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public deltaPseudoRangeCor2Type() {
    super();
    setValueRange(new java.math.BigInteger("-127"), new java.math.BigInteger("127"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_deltaPseudoRangeCor2Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_deltaPseudoRangeCor2Type != null) {
      return ImmutableList.of(TAG_deltaPseudoRangeCor2Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new deltaPseudoRangeCor2Type from encoded stream.
   */
  public static deltaPseudoRangeCor2Type fromPerUnaligned(byte[] encodedBytes) {
    deltaPseudoRangeCor2Type result = new deltaPseudoRangeCor2Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new deltaPseudoRangeCor2Type from encoded stream.
   */
  public static deltaPseudoRangeCor2Type fromPerAligned(byte[] encodedBytes) {
    deltaPseudoRangeCor2Type result = new deltaPseudoRangeCor2Type();
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
    return "deltaPseudoRangeCor2Type = " + getInteger() + ";\n";
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
public static class deltaRangeRateCor2Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_deltaRangeRateCor2Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public deltaRangeRateCor2Type() {
    super();
    setValueRange(new java.math.BigInteger("-7"), new java.math.BigInteger("7"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_deltaRangeRateCor2Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_deltaRangeRateCor2Type != null) {
      return ImmutableList.of(TAG_deltaRangeRateCor2Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new deltaRangeRateCor2Type from encoded stream.
   */
  public static deltaRangeRateCor2Type fromPerUnaligned(byte[] encodedBytes) {
    deltaRangeRateCor2Type result = new deltaRangeRateCor2Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new deltaRangeRateCor2Type from encoded stream.
   */
  public static deltaRangeRateCor2Type fromPerAligned(byte[] encodedBytes) {
    deltaRangeRateCor2Type result = new deltaRangeRateCor2Type();
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
    return "deltaRangeRateCor2Type = " + getInteger() + ";\n";
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
public static class deltaPseudoRangeCor3Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_deltaPseudoRangeCor3Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public deltaPseudoRangeCor3Type() {
    super();
    setValueRange(new java.math.BigInteger("-127"), new java.math.BigInteger("127"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_deltaPseudoRangeCor3Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_deltaPseudoRangeCor3Type != null) {
      return ImmutableList.of(TAG_deltaPseudoRangeCor3Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new deltaPseudoRangeCor3Type from encoded stream.
   */
  public static deltaPseudoRangeCor3Type fromPerUnaligned(byte[] encodedBytes) {
    deltaPseudoRangeCor3Type result = new deltaPseudoRangeCor3Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new deltaPseudoRangeCor3Type from encoded stream.
   */
  public static deltaPseudoRangeCor3Type fromPerAligned(byte[] encodedBytes) {
    deltaPseudoRangeCor3Type result = new deltaPseudoRangeCor3Type();
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
    return "deltaPseudoRangeCor3Type = " + getInteger() + ";\n";
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
public static class deltaRangeRateCor3Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_deltaRangeRateCor3Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public deltaRangeRateCor3Type() {
    super();
    setValueRange(new java.math.BigInteger("-7"), new java.math.BigInteger("7"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_deltaRangeRateCor3Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_deltaRangeRateCor3Type != null) {
      return ImmutableList.of(TAG_deltaRangeRateCor3Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new deltaRangeRateCor3Type from encoded stream.
   */
  public static deltaRangeRateCor3Type fromPerUnaligned(byte[] encodedBytes) {
    deltaRangeRateCor3Type result = new deltaRangeRateCor3Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new deltaRangeRateCor3Type from encoded stream.
   */
  public static deltaRangeRateCor3Type fromPerAligned(byte[] encodedBytes) {
    deltaRangeRateCor3Type result = new deltaRangeRateCor3Type();
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
    return "deltaRangeRateCor3Type = " + getInteger() + ";\n";
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
    builder.append("SatElement = {\n");
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
