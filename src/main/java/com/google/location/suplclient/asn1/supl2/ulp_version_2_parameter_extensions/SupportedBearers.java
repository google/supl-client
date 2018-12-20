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
import com.google.location.suplclient.asn1.base.Asn1Boolean;
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
public  class SupportedBearers extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_SupportedBearers
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public SupportedBearers() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_SupportedBearers;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_SupportedBearers != null) {
      return ImmutableList.of(TAG_SupportedBearers);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new SupportedBearers from encoded stream.
   */
  public static SupportedBearers fromPerUnaligned(byte[] encodedBytes) {
    SupportedBearers result = new SupportedBearers();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new SupportedBearers from encoded stream.
   */
  public static SupportedBearers fromPerAligned(byte[] encodedBytes) {
    SupportedBearers result = new SupportedBearers();
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

  
  private SupportedBearers.gsmType gsm_;
  public SupportedBearers.gsmType getGsm() {
    return gsm_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedBearers.gsmType
   */
  public void setGsm(Asn1Object value) {
    this.gsm_ = (SupportedBearers.gsmType) value;
  }
  public SupportedBearers.gsmType setGsmToNewInstance() {
    gsm_ = new SupportedBearers.gsmType();
    return gsm_;
  }
  
  private SupportedBearers.wcdmaType wcdma_;
  public SupportedBearers.wcdmaType getWcdma() {
    return wcdma_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedBearers.wcdmaType
   */
  public void setWcdma(Asn1Object value) {
    this.wcdma_ = (SupportedBearers.wcdmaType) value;
  }
  public SupportedBearers.wcdmaType setWcdmaToNewInstance() {
    wcdma_ = new SupportedBearers.wcdmaType();
    return wcdma_;
  }
  
  private SupportedBearers.lteType lte_;
  public SupportedBearers.lteType getLte() {
    return lte_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedBearers.lteType
   */
  public void setLte(Asn1Object value) {
    this.lte_ = (SupportedBearers.lteType) value;
  }
  public SupportedBearers.lteType setLteToNewInstance() {
    lte_ = new SupportedBearers.lteType();
    return lte_;
  }
  
  private SupportedBearers.cdmaType cdma_;
  public SupportedBearers.cdmaType getCdma() {
    return cdma_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedBearers.cdmaType
   */
  public void setCdma(Asn1Object value) {
    this.cdma_ = (SupportedBearers.cdmaType) value;
  }
  public SupportedBearers.cdmaType setCdmaToNewInstance() {
    cdma_ = new SupportedBearers.cdmaType();
    return cdma_;
  }
  
  private SupportedBearers.hprdType hprd_;
  public SupportedBearers.hprdType getHprd() {
    return hprd_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedBearers.hprdType
   */
  public void setHprd(Asn1Object value) {
    this.hprd_ = (SupportedBearers.hprdType) value;
  }
  public SupportedBearers.hprdType setHprdToNewInstance() {
    hprd_ = new SupportedBearers.hprdType();
    return hprd_;
  }
  
  private SupportedBearers.umbType umb_;
  public SupportedBearers.umbType getUmb() {
    return umb_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedBearers.umbType
   */
  public void setUmb(Asn1Object value) {
    this.umb_ = (SupportedBearers.umbType) value;
  }
  public SupportedBearers.umbType setUmbToNewInstance() {
    umb_ = new SupportedBearers.umbType();
    return umb_;
  }
  
  private SupportedBearers.wlanType wlan_;
  public SupportedBearers.wlanType getWlan() {
    return wlan_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedBearers.wlanType
   */
  public void setWlan(Asn1Object value) {
    this.wlan_ = (SupportedBearers.wlanType) value;
  }
  public SupportedBearers.wlanType setWlanToNewInstance() {
    wlan_ = new SupportedBearers.wlanType();
    return wlan_;
  }
  
  private SupportedBearers.wiMAXType wiMAX_;
  public SupportedBearers.wiMAXType getWiMAX() {
    return wiMAX_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedBearers.wiMAXType
   */
  public void setWiMAX(Asn1Object value) {
    this.wiMAX_ = (SupportedBearers.wiMAXType) value;
  }
  public SupportedBearers.wiMAXType setWiMAXToNewInstance() {
    wiMAX_ = new SupportedBearers.wiMAXType();
    return wiMAX_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getGsm() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGsm();
          }

          @Override public void setToNewInstance() {
            setGsmToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedBearers.gsmType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gsm : "
                    + getGsm().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getWcdma() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getWcdma();
          }

          @Override public void setToNewInstance() {
            setWcdmaToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedBearers.wcdmaType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "wcdma : "
                    + getWcdma().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getLte() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getLte();
          }

          @Override public void setToNewInstance() {
            setLteToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedBearers.lteType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "lte : "
                    + getLte().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getCdma() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCdma();
          }

          @Override public void setToNewInstance() {
            setCdmaToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedBearers.cdmaType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "cdma : "
                    + getCdma().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getHprd() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getHprd();
          }

          @Override public void setToNewInstance() {
            setHprdToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedBearers.hprdType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "hprd : "
                    + getHprd().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getUmb() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getUmb();
          }

          @Override public void setToNewInstance() {
            setUmbToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedBearers.umbType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "umb : "
                    + getUmb().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getWlan() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getWlan();
          }

          @Override public void setToNewInstance() {
            setWlanToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedBearers.wlanType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "wlan : "
                    + getWlan().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 7);

          @Override public boolean isExplicitlySet() {
            return getWiMAX() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getWiMAX();
          }

          @Override public void setToNewInstance() {
            setWiMAXToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedBearers.wiMAXType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "wiMAX : "
                    + getWiMAX().toIndentedString(indent);
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
public static class gsmType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_gsmType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gsmType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gsmType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gsmType != null) {
      return ImmutableList.of(TAG_gsmType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gsmType from encoded stream.
   */
  public static gsmType fromPerUnaligned(byte[] encodedBytes) {
    gsmType result = new gsmType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gsmType from encoded stream.
   */
  public static gsmType fromPerAligned(byte[] encodedBytes) {
    gsmType result = new gsmType();
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
    return "gsmType = " + getValue() + ";\n";
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
public static class wcdmaType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_wcdmaType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public wcdmaType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_wcdmaType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_wcdmaType != null) {
      return ImmutableList.of(TAG_wcdmaType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new wcdmaType from encoded stream.
   */
  public static wcdmaType fromPerUnaligned(byte[] encodedBytes) {
    wcdmaType result = new wcdmaType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new wcdmaType from encoded stream.
   */
  public static wcdmaType fromPerAligned(byte[] encodedBytes) {
    wcdmaType result = new wcdmaType();
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
    return "wcdmaType = " + getValue() + ";\n";
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
public static class lteType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_lteType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public lteType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_lteType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_lteType != null) {
      return ImmutableList.of(TAG_lteType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new lteType from encoded stream.
   */
  public static lteType fromPerUnaligned(byte[] encodedBytes) {
    lteType result = new lteType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new lteType from encoded stream.
   */
  public static lteType fromPerAligned(byte[] encodedBytes) {
    lteType result = new lteType();
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
    return "lteType = " + getValue() + ";\n";
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
public static class cdmaType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_cdmaType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public cdmaType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_cdmaType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_cdmaType != null) {
      return ImmutableList.of(TAG_cdmaType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new cdmaType from encoded stream.
   */
  public static cdmaType fromPerUnaligned(byte[] encodedBytes) {
    cdmaType result = new cdmaType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new cdmaType from encoded stream.
   */
  public static cdmaType fromPerAligned(byte[] encodedBytes) {
    cdmaType result = new cdmaType();
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
    return "cdmaType = " + getValue() + ";\n";
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
public static class hprdType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_hprdType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public hprdType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_hprdType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_hprdType != null) {
      return ImmutableList.of(TAG_hprdType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new hprdType from encoded stream.
   */
  public static hprdType fromPerUnaligned(byte[] encodedBytes) {
    hprdType result = new hprdType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new hprdType from encoded stream.
   */
  public static hprdType fromPerAligned(byte[] encodedBytes) {
    hprdType result = new hprdType();
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
    return "hprdType = " + getValue() + ";\n";
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
public static class umbType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_umbType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public umbType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_umbType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_umbType != null) {
      return ImmutableList.of(TAG_umbType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new umbType from encoded stream.
   */
  public static umbType fromPerUnaligned(byte[] encodedBytes) {
    umbType result = new umbType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new umbType from encoded stream.
   */
  public static umbType fromPerAligned(byte[] encodedBytes) {
    umbType result = new umbType();
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
    return "umbType = " + getValue() + ";\n";
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
public static class wlanType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_wlanType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public wlanType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_wlanType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_wlanType != null) {
      return ImmutableList.of(TAG_wlanType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new wlanType from encoded stream.
   */
  public static wlanType fromPerUnaligned(byte[] encodedBytes) {
    wlanType result = new wlanType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new wlanType from encoded stream.
   */
  public static wlanType fromPerAligned(byte[] encodedBytes) {
    wlanType result = new wlanType();
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
    return "wlanType = " + getValue() + ";\n";
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
public static class wiMAXType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_wiMAXType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public wiMAXType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_wiMAXType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_wiMAXType != null) {
      return ImmutableList.of(TAG_wiMAXType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new wiMAXType from encoded stream.
   */
  public static wiMAXType fromPerUnaligned(byte[] encodedBytes) {
    wiMAXType result = new wiMAXType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new wiMAXType from encoded stream.
   */
  public static wiMAXType fromPerAligned(byte[] encodedBytes) {
    wiMAXType result = new wiMAXType();
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
    return "wiMAXType = " + getValue() + ";\n";
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
    builder.append("SupportedBearers = {\n");
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
