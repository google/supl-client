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
public  class GNSS_Almanac extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GNSS_Almanac
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GNSS_Almanac() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GNSS_Almanac;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GNSS_Almanac != null) {
      return ImmutableList.of(TAG_GNSS_Almanac);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GNSS_Almanac from encoded stream.
   */
  public static GNSS_Almanac fromPerUnaligned(byte[] encodedBytes) {
    GNSS_Almanac result = new GNSS_Almanac();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GNSS_Almanac from encoded stream.
   */
  public static GNSS_Almanac fromPerAligned(byte[] encodedBytes) {
    GNSS_Almanac result = new GNSS_Almanac();
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

  
  private GNSS_Almanac.weekNumberType weekNumber_;
  public GNSS_Almanac.weekNumberType getWeekNumber() {
    return weekNumber_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_Almanac.weekNumberType
   */
  public void setWeekNumber(Asn1Object value) {
    this.weekNumber_ = (GNSS_Almanac.weekNumberType) value;
  }
  public GNSS_Almanac.weekNumberType setWeekNumberToNewInstance() {
    weekNumber_ = new GNSS_Almanac.weekNumberType();
    return weekNumber_;
  }
  
  private GNSS_Almanac.toaType toa_;
  public GNSS_Almanac.toaType getToa() {
    return toa_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_Almanac.toaType
   */
  public void setToa(Asn1Object value) {
    this.toa_ = (GNSS_Almanac.toaType) value;
  }
  public GNSS_Almanac.toaType setToaToNewInstance() {
    toa_ = new GNSS_Almanac.toaType();
    return toa_;
  }
  
  private GNSS_Almanac.iodaType ioda_;
  public GNSS_Almanac.iodaType getIoda() {
    return ioda_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_Almanac.iodaType
   */
  public void setIoda(Asn1Object value) {
    this.ioda_ = (GNSS_Almanac.iodaType) value;
  }
  public GNSS_Almanac.iodaType setIodaToNewInstance() {
    ioda_ = new GNSS_Almanac.iodaType();
    return ioda_;
  }
  
  private GNSS_Almanac.completeAlmanacProvidedType completeAlmanacProvided_;
  public GNSS_Almanac.completeAlmanacProvidedType getCompleteAlmanacProvided() {
    return completeAlmanacProvided_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_Almanac.completeAlmanacProvidedType
   */
  public void setCompleteAlmanacProvided(Asn1Object value) {
    this.completeAlmanacProvided_ = (GNSS_Almanac.completeAlmanacProvidedType) value;
  }
  public GNSS_Almanac.completeAlmanacProvidedType setCompleteAlmanacProvidedToNewInstance() {
    completeAlmanacProvided_ = new GNSS_Almanac.completeAlmanacProvidedType();
    return completeAlmanacProvided_;
  }
  
  private GNSS_AlmanacList gnss_AlmanacList_;
  public GNSS_AlmanacList getGnss_AlmanacList() {
    return gnss_AlmanacList_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_AlmanacList
   */
  public void setGnss_AlmanacList(Asn1Object value) {
    this.gnss_AlmanacList_ = (GNSS_AlmanacList) value;
  }
  public GNSS_AlmanacList setGnss_AlmanacListToNewInstance() {
    gnss_AlmanacList_ = new GNSS_AlmanacList();
    return gnss_AlmanacList_;
  }
  

  
  private GNSS_Almanac.ext1Type  extensionExt1;
  public GNSS_Almanac.ext1Type getExtensionExt1() {
    return extensionExt1;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_Almanac.ext1Type
   */
  public void setExtensionExt1(Asn1Object value) {
    extensionExt1 = (GNSS_Almanac.ext1Type) value;
  }
  public void setExtensionExt1ToNewInstance() {
    extensionExt1 = new GNSS_Almanac.ext1Type();
  }
    

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getWeekNumber() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getWeekNumber();
          }

          @Override public void setToNewInstance() {
            setWeekNumberToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_Almanac.weekNumberType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "weekNumber : "
                    + getWeekNumber().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getToa() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getToa();
          }

          @Override public void setToNewInstance() {
            setToaToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_Almanac.toaType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "toa : "
                    + getToa().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getIoda() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getIoda();
          }

          @Override public void setToNewInstance() {
            setIodaToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_Almanac.iodaType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ioda : "
                    + getIoda().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getCompleteAlmanacProvided() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCompleteAlmanacProvided();
          }

          @Override public void setToNewInstance() {
            setCompleteAlmanacProvidedToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_Almanac.completeAlmanacProvidedType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "completeAlmanacProvided : "
                    + getCompleteAlmanacProvided().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getGnss_AlmanacList() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_AlmanacList();
          }

          @Override public void setToNewInstance() {
            setGnss_AlmanacListToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_AlmanacList.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_AlmanacList : "
                    + getGnss_AlmanacList().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      builder.add(new SequenceComponent() {
            @Override public boolean isExplicitlySet() {
              return getExtensionExt1() != null;
            }

            @Override public boolean hasDefaultValue() {
              return false;
            }

            @Override public boolean isOptional() {
              return false;
            }

            @Override public Asn1Object getComponentValue() {
              return getExtensionExt1();
            }

            @Override public void setToNewInstance() {
              setExtensionExt1ToNewInstance();
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
              return "ext1 : "
                  + getExtensionExt1().toIndentedString(indent);
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
public static class weekNumberType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_weekNumberType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public weekNumberType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("255"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_weekNumberType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_weekNumberType != null) {
      return ImmutableList.of(TAG_weekNumberType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new weekNumberType from encoded stream.
   */
  public static weekNumberType fromPerUnaligned(byte[] encodedBytes) {
    weekNumberType result = new weekNumberType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new weekNumberType from encoded stream.
   */
  public static weekNumberType fromPerAligned(byte[] encodedBytes) {
    weekNumberType result = new weekNumberType();
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
    return "weekNumberType = " + getInteger() + ";\n";
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
public static class toaType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_toaType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public toaType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("255"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_toaType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_toaType != null) {
      return ImmutableList.of(TAG_toaType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new toaType from encoded stream.
   */
  public static toaType fromPerUnaligned(byte[] encodedBytes) {
    toaType result = new toaType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new toaType from encoded stream.
   */
  public static toaType fromPerAligned(byte[] encodedBytes) {
    toaType result = new toaType();
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
    return "toaType = " + getInteger() + ";\n";
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
public static class iodaType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_iodaType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public iodaType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("3"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_iodaType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_iodaType != null) {
      return ImmutableList.of(TAG_iodaType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new iodaType from encoded stream.
   */
  public static iodaType fromPerUnaligned(byte[] encodedBytes) {
    iodaType result = new iodaType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new iodaType from encoded stream.
   */
  public static iodaType fromPerAligned(byte[] encodedBytes) {
    iodaType result = new iodaType();
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
    return "iodaType = " + getInteger() + ";\n";
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
public static class completeAlmanacProvidedType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_completeAlmanacProvidedType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public completeAlmanacProvidedType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_completeAlmanacProvidedType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_completeAlmanacProvidedType != null) {
      return ImmutableList.of(TAG_completeAlmanacProvidedType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new completeAlmanacProvidedType from encoded stream.
   */
  public static completeAlmanacProvidedType fromPerUnaligned(byte[] encodedBytes) {
    completeAlmanacProvidedType result = new completeAlmanacProvidedType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new completeAlmanacProvidedType from encoded stream.
   */
  public static completeAlmanacProvidedType fromPerAligned(byte[] encodedBytes) {
    completeAlmanacProvidedType result = new completeAlmanacProvidedType();
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
    return "completeAlmanacProvidedType = " + getValue() + ";\n";
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
public static class ext1Type extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_ext1Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ext1Type() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ext1Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ext1Type != null) {
      return ImmutableList.of(TAG_ext1Type);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ext1Type from encoded stream.
   */
  public static ext1Type fromPerUnaligned(byte[] encodedBytes) {
    ext1Type result = new ext1Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ext1Type from encoded stream.
   */
  public static ext1Type fromPerAligned(byte[] encodedBytes) {
    ext1Type result = new ext1Type();
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

  
  private ext1Type.toa_ext_v1240Type toa_ext_v1240_;
  public ext1Type.toa_ext_v1240Type getToa_ext_v1240() {
    return toa_ext_v1240_;
  }
  /**
   * @throws ClassCastException if value is not a ext1Type.toa_ext_v1240Type
   */
  public void setToa_ext_v1240(Asn1Object value) {
    this.toa_ext_v1240_ = (ext1Type.toa_ext_v1240Type) value;
  }
  public ext1Type.toa_ext_v1240Type setToa_ext_v1240ToNewInstance() {
    toa_ext_v1240_ = new ext1Type.toa_ext_v1240Type();
    return toa_ext_v1240_;
  }
  
  private ext1Type.ioda_ext_v1240Type ioda_ext_v1240_;
  public ext1Type.ioda_ext_v1240Type getIoda_ext_v1240() {
    return ioda_ext_v1240_;
  }
  /**
   * @throws ClassCastException if value is not a ext1Type.ioda_ext_v1240Type
   */
  public void setIoda_ext_v1240(Asn1Object value) {
    this.ioda_ext_v1240_ = (ext1Type.ioda_ext_v1240Type) value;
  }
  public ext1Type.ioda_ext_v1240Type setIoda_ext_v1240ToNewInstance() {
    ioda_ext_v1240_ = new ext1Type.ioda_ext_v1240Type();
    return ioda_ext_v1240_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getToa_ext_v1240() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getToa_ext_v1240();
          }

          @Override public void setToNewInstance() {
            setToa_ext_v1240ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ext1Type.toa_ext_v1240Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "toa_ext_v1240 : "
                    + getToa_ext_v1240().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getIoda_ext_v1240() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getIoda_ext_v1240();
          }

          @Override public void setToNewInstance() {
            setIoda_ext_v1240ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ext1Type.ioda_ext_v1240Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ioda_ext_v1240 : "
                    + getIoda_ext_v1240().toIndentedString(indent);
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
public static class toa_ext_v1240Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_toa_ext_v1240Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public toa_ext_v1240Type() {
    super();
    setValueRange(new java.math.BigInteger("256"), new java.math.BigInteger("1023"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_toa_ext_v1240Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_toa_ext_v1240Type != null) {
      return ImmutableList.of(TAG_toa_ext_v1240Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new toa_ext_v1240Type from encoded stream.
   */
  public static toa_ext_v1240Type fromPerUnaligned(byte[] encodedBytes) {
    toa_ext_v1240Type result = new toa_ext_v1240Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new toa_ext_v1240Type from encoded stream.
   */
  public static toa_ext_v1240Type fromPerAligned(byte[] encodedBytes) {
    toa_ext_v1240Type result = new toa_ext_v1240Type();
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
    return "toa_ext_v1240Type = " + getInteger() + ";\n";
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
public static class ioda_ext_v1240Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ioda_ext_v1240Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ioda_ext_v1240Type() {
    super();
    setValueRange(new java.math.BigInteger("4"), new java.math.BigInteger("15"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ioda_ext_v1240Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ioda_ext_v1240Type != null) {
      return ImmutableList.of(TAG_ioda_ext_v1240Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ioda_ext_v1240Type from encoded stream.
   */
  public static ioda_ext_v1240Type fromPerUnaligned(byte[] encodedBytes) {
    ioda_ext_v1240Type result = new ioda_ext_v1240Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ioda_ext_v1240Type from encoded stream.
   */
  public static ioda_ext_v1240Type fromPerAligned(byte[] encodedBytes) {
    ioda_ext_v1240Type result = new ioda_ext_v1240Type();
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
    return "ioda_ext_v1240Type = " + getInteger() + ";\n";
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
    builder.append("ext1Type = {\n");
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
    builder.append("GNSS_Almanac = {\n");
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
