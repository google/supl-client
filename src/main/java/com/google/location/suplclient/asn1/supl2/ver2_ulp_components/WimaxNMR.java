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

package com.google.location.suplclient.asn1.supl2.ver2_ulp_components;

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
public  class WimaxNMR extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_WimaxNMR
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public WimaxNMR() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_WimaxNMR;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_WimaxNMR != null) {
      return ImmutableList.of(TAG_WimaxNMR);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new WimaxNMR from encoded stream.
   */
  public static WimaxNMR fromPerUnaligned(byte[] encodedBytes) {
    WimaxNMR result = new WimaxNMR();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new WimaxNMR from encoded stream.
   */
  public static WimaxNMR fromPerAligned(byte[] encodedBytes) {
    WimaxNMR result = new WimaxNMR();
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

  
  private WimaxBsID wimaxBsID_;
  public WimaxBsID getWimaxBsID() {
    return wimaxBsID_;
  }
  /**
   * @throws ClassCastException if value is not a WimaxBsID
   */
  public void setWimaxBsID(Asn1Object value) {
    this.wimaxBsID_ = (WimaxBsID) value;
  }
  public WimaxBsID setWimaxBsIDToNewInstance() {
    wimaxBsID_ = new WimaxBsID();
    return wimaxBsID_;
  }
  
  private WimaxNMR.relDelayType relDelay_;
  public WimaxNMR.relDelayType getRelDelay() {
    return relDelay_;
  }
  /**
   * @throws ClassCastException if value is not a WimaxNMR.relDelayType
   */
  public void setRelDelay(Asn1Object value) {
    this.relDelay_ = (WimaxNMR.relDelayType) value;
  }
  public WimaxNMR.relDelayType setRelDelayToNewInstance() {
    relDelay_ = new WimaxNMR.relDelayType();
    return relDelay_;
  }
  
  private WimaxNMR.relDelaystdType relDelaystd_;
  public WimaxNMR.relDelaystdType getRelDelaystd() {
    return relDelaystd_;
  }
  /**
   * @throws ClassCastException if value is not a WimaxNMR.relDelaystdType
   */
  public void setRelDelaystd(Asn1Object value) {
    this.relDelaystd_ = (WimaxNMR.relDelaystdType) value;
  }
  public WimaxNMR.relDelaystdType setRelDelaystdToNewInstance() {
    relDelaystd_ = new WimaxNMR.relDelaystdType();
    return relDelaystd_;
  }
  
  private WimaxNMR.rSSIType rSSI_;
  public WimaxNMR.rSSIType getRSSI() {
    return rSSI_;
  }
  /**
   * @throws ClassCastException if value is not a WimaxNMR.rSSIType
   */
  public void setRSSI(Asn1Object value) {
    this.rSSI_ = (WimaxNMR.rSSIType) value;
  }
  public WimaxNMR.rSSIType setRSSIToNewInstance() {
    rSSI_ = new WimaxNMR.rSSIType();
    return rSSI_;
  }
  
  private WimaxNMR.rSSIstdType rSSIstd_;
  public WimaxNMR.rSSIstdType getRSSIstd() {
    return rSSIstd_;
  }
  /**
   * @throws ClassCastException if value is not a WimaxNMR.rSSIstdType
   */
  public void setRSSIstd(Asn1Object value) {
    this.rSSIstd_ = (WimaxNMR.rSSIstdType) value;
  }
  public WimaxNMR.rSSIstdType setRSSIstdToNewInstance() {
    rSSIstd_ = new WimaxNMR.rSSIstdType();
    return rSSIstd_;
  }
  
  private WimaxNMR.bSTxPowerType bSTxPower_;
  public WimaxNMR.bSTxPowerType getBSTxPower() {
    return bSTxPower_;
  }
  /**
   * @throws ClassCastException if value is not a WimaxNMR.bSTxPowerType
   */
  public void setBSTxPower(Asn1Object value) {
    this.bSTxPower_ = (WimaxNMR.bSTxPowerType) value;
  }
  public WimaxNMR.bSTxPowerType setBSTxPowerToNewInstance() {
    bSTxPower_ = new WimaxNMR.bSTxPowerType();
    return bSTxPower_;
  }
  
  private WimaxNMR.cINRType cINR_;
  public WimaxNMR.cINRType getCINR() {
    return cINR_;
  }
  /**
   * @throws ClassCastException if value is not a WimaxNMR.cINRType
   */
  public void setCINR(Asn1Object value) {
    this.cINR_ = (WimaxNMR.cINRType) value;
  }
  public WimaxNMR.cINRType setCINRToNewInstance() {
    cINR_ = new WimaxNMR.cINRType();
    return cINR_;
  }
  
  private WimaxNMR.cINRstdType cINRstd_;
  public WimaxNMR.cINRstdType getCINRstd() {
    return cINRstd_;
  }
  /**
   * @throws ClassCastException if value is not a WimaxNMR.cINRstdType
   */
  public void setCINRstd(Asn1Object value) {
    this.cINRstd_ = (WimaxNMR.cINRstdType) value;
  }
  public WimaxNMR.cINRstdType setCINRstdToNewInstance() {
    cINRstd_ = new WimaxNMR.cINRstdType();
    return cINRstd_;
  }
  
  private ReportedLocation bSLocation_;
  public ReportedLocation getBSLocation() {
    return bSLocation_;
  }
  /**
   * @throws ClassCastException if value is not a ReportedLocation
   */
  public void setBSLocation(Asn1Object value) {
    this.bSLocation_ = (ReportedLocation) value;
  }
  public ReportedLocation setBSLocationToNewInstance() {
    bSLocation_ = new ReportedLocation();
    return bSLocation_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getWimaxBsID() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getWimaxBsID();
          }

          @Override public void setToNewInstance() {
            setWimaxBsIDToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? WimaxBsID.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "wimaxBsID : "
                    + getWimaxBsID().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getRelDelay() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getRelDelay();
          }

          @Override public void setToNewInstance() {
            setRelDelayToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? WimaxNMR.relDelayType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "relDelay : "
                    + getRelDelay().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getRelDelaystd() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getRelDelaystd();
          }

          @Override public void setToNewInstance() {
            setRelDelaystdToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? WimaxNMR.relDelaystdType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "relDelaystd : "
                    + getRelDelaystd().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getRSSI() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getRSSI();
          }

          @Override public void setToNewInstance() {
            setRSSIToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? WimaxNMR.rSSIType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "rSSI : "
                    + getRSSI().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getRSSIstd() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getRSSIstd();
          }

          @Override public void setToNewInstance() {
            setRSSIstdToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? WimaxNMR.rSSIstdType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "rSSIstd : "
                    + getRSSIstd().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getBSTxPower() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getBSTxPower();
          }

          @Override public void setToNewInstance() {
            setBSTxPowerToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? WimaxNMR.bSTxPowerType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bSTxPower : "
                    + getBSTxPower().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getCINR() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getCINR();
          }

          @Override public void setToNewInstance() {
            setCINRToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? WimaxNMR.cINRType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "cINR : "
                    + getCINR().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 7);

          @Override public boolean isExplicitlySet() {
            return getCINRstd() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getCINRstd();
          }

          @Override public void setToNewInstance() {
            setCINRstdToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? WimaxNMR.cINRstdType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "cINRstd : "
                    + getCINRstd().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 8);

          @Override public boolean isExplicitlySet() {
            return getBSLocation() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getBSLocation();
          }

          @Override public void setToNewInstance() {
            setBSLocationToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ReportedLocation.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bSLocation : "
                    + getBSLocation().toIndentedString(indent);
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
public static class relDelayType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_relDelayType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public relDelayType() {
    super();
    setValueRange(new java.math.BigInteger("-32768"), new java.math.BigInteger("32767"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_relDelayType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_relDelayType != null) {
      return ImmutableList.of(TAG_relDelayType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new relDelayType from encoded stream.
   */
  public static relDelayType fromPerUnaligned(byte[] encodedBytes) {
    relDelayType result = new relDelayType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new relDelayType from encoded stream.
   */
  public static relDelayType fromPerAligned(byte[] encodedBytes) {
    relDelayType result = new relDelayType();
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
    return "relDelayType = " + getInteger() + ";\n";
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
public static class relDelaystdType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_relDelaystdType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public relDelaystdType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("1023"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_relDelaystdType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_relDelaystdType != null) {
      return ImmutableList.of(TAG_relDelaystdType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new relDelaystdType from encoded stream.
   */
  public static relDelaystdType fromPerUnaligned(byte[] encodedBytes) {
    relDelaystdType result = new relDelaystdType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new relDelaystdType from encoded stream.
   */
  public static relDelaystdType fromPerAligned(byte[] encodedBytes) {
    relDelaystdType result = new relDelaystdType();
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
    return "relDelaystdType = " + getInteger() + ";\n";
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
public static class rSSIType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_rSSIType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public rSSIType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("255"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_rSSIType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_rSSIType != null) {
      return ImmutableList.of(TAG_rSSIType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new rSSIType from encoded stream.
   */
  public static rSSIType fromPerUnaligned(byte[] encodedBytes) {
    rSSIType result = new rSSIType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new rSSIType from encoded stream.
   */
  public static rSSIType fromPerAligned(byte[] encodedBytes) {
    rSSIType result = new rSSIType();
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
    return "rSSIType = " + getInteger() + ";\n";
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
public static class rSSIstdType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_rSSIstdType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public rSSIstdType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("63"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_rSSIstdType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_rSSIstdType != null) {
      return ImmutableList.of(TAG_rSSIstdType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new rSSIstdType from encoded stream.
   */
  public static rSSIstdType fromPerUnaligned(byte[] encodedBytes) {
    rSSIstdType result = new rSSIstdType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new rSSIstdType from encoded stream.
   */
  public static rSSIstdType fromPerAligned(byte[] encodedBytes) {
    rSSIstdType result = new rSSIstdType();
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
    return "rSSIstdType = " + getInteger() + ";\n";
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
public static class bSTxPowerType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bSTxPowerType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bSTxPowerType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("255"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bSTxPowerType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bSTxPowerType != null) {
      return ImmutableList.of(TAG_bSTxPowerType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bSTxPowerType from encoded stream.
   */
  public static bSTxPowerType fromPerUnaligned(byte[] encodedBytes) {
    bSTxPowerType result = new bSTxPowerType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bSTxPowerType from encoded stream.
   */
  public static bSTxPowerType fromPerAligned(byte[] encodedBytes) {
    bSTxPowerType result = new bSTxPowerType();
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
    return "bSTxPowerType = " + getInteger() + ";\n";
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
public static class cINRType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_cINRType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public cINRType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("255"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_cINRType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_cINRType != null) {
      return ImmutableList.of(TAG_cINRType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new cINRType from encoded stream.
   */
  public static cINRType fromPerUnaligned(byte[] encodedBytes) {
    cINRType result = new cINRType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new cINRType from encoded stream.
   */
  public static cINRType fromPerAligned(byte[] encodedBytes) {
    cINRType result = new cINRType();
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
    return "cINRType = " + getInteger() + ";\n";
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
public static class cINRstdType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_cINRstdType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public cINRstdType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("63"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_cINRstdType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_cINRstdType != null) {
      return ImmutableList.of(TAG_cINRstdType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new cINRstdType from encoded stream.
   */
  public static cINRstdType fromPerUnaligned(byte[] encodedBytes) {
    cINRstdType result = new cINRstdType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new cINRstdType from encoded stream.
   */
  public static cINRstdType fromPerAligned(byte[] encodedBytes) {
    cINRstdType result = new cINRstdType();
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
    return "cINRstdType = " + getInteger() + ";\n";
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
    builder.append("WimaxNMR = {\n");
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
