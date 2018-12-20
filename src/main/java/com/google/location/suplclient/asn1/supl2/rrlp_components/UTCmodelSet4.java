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
public  class UTCmodelSet4 extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_UTCmodelSet4
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public UTCmodelSet4() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_UTCmodelSet4;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_UTCmodelSet4 != null) {
      return ImmutableList.of(TAG_UTCmodelSet4);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new UTCmodelSet4 from encoded stream.
   */
  public static UTCmodelSet4 fromPerUnaligned(byte[] encodedBytes) {
    UTCmodelSet4 result = new UTCmodelSet4();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new UTCmodelSet4 from encoded stream.
   */
  public static UTCmodelSet4 fromPerAligned(byte[] encodedBytes) {
    UTCmodelSet4 result = new UTCmodelSet4();
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

  
  private UTCmodelSet4.utcA1wntType utcA1wnt_;
  public UTCmodelSet4.utcA1wntType getUtcA1wnt() {
    return utcA1wnt_;
  }
  /**
   * @throws ClassCastException if value is not a UTCmodelSet4.utcA1wntType
   */
  public void setUtcA1wnt(Asn1Object value) {
    this.utcA1wnt_ = (UTCmodelSet4.utcA1wntType) value;
  }
  public UTCmodelSet4.utcA1wntType setUtcA1wntToNewInstance() {
    utcA1wnt_ = new UTCmodelSet4.utcA1wntType();
    return utcA1wnt_;
  }
  
  private UTCmodelSet4.utcA0wntType utcA0wnt_;
  public UTCmodelSet4.utcA0wntType getUtcA0wnt() {
    return utcA0wnt_;
  }
  /**
   * @throws ClassCastException if value is not a UTCmodelSet4.utcA0wntType
   */
  public void setUtcA0wnt(Asn1Object value) {
    this.utcA0wnt_ = (UTCmodelSet4.utcA0wntType) value;
  }
  public UTCmodelSet4.utcA0wntType setUtcA0wntToNewInstance() {
    utcA0wnt_ = new UTCmodelSet4.utcA0wntType();
    return utcA0wnt_;
  }
  
  private UTCmodelSet4.utcTotType utcTot_;
  public UTCmodelSet4.utcTotType getUtcTot() {
    return utcTot_;
  }
  /**
   * @throws ClassCastException if value is not a UTCmodelSet4.utcTotType
   */
  public void setUtcTot(Asn1Object value) {
    this.utcTot_ = (UTCmodelSet4.utcTotType) value;
  }
  public UTCmodelSet4.utcTotType setUtcTotToNewInstance() {
    utcTot_ = new UTCmodelSet4.utcTotType();
    return utcTot_;
  }
  
  private UTCmodelSet4.utcWNtType utcWNt_;
  public UTCmodelSet4.utcWNtType getUtcWNt() {
    return utcWNt_;
  }
  /**
   * @throws ClassCastException if value is not a UTCmodelSet4.utcWNtType
   */
  public void setUtcWNt(Asn1Object value) {
    this.utcWNt_ = (UTCmodelSet4.utcWNtType) value;
  }
  public UTCmodelSet4.utcWNtType setUtcWNtToNewInstance() {
    utcWNt_ = new UTCmodelSet4.utcWNtType();
    return utcWNt_;
  }
  
  private UTCmodelSet4.utcDeltaTlsType utcDeltaTls_;
  public UTCmodelSet4.utcDeltaTlsType getUtcDeltaTls() {
    return utcDeltaTls_;
  }
  /**
   * @throws ClassCastException if value is not a UTCmodelSet4.utcDeltaTlsType
   */
  public void setUtcDeltaTls(Asn1Object value) {
    this.utcDeltaTls_ = (UTCmodelSet4.utcDeltaTlsType) value;
  }
  public UTCmodelSet4.utcDeltaTlsType setUtcDeltaTlsToNewInstance() {
    utcDeltaTls_ = new UTCmodelSet4.utcDeltaTlsType();
    return utcDeltaTls_;
  }
  
  private UTCmodelSet4.utcWNlsfType utcWNlsf_;
  public UTCmodelSet4.utcWNlsfType getUtcWNlsf() {
    return utcWNlsf_;
  }
  /**
   * @throws ClassCastException if value is not a UTCmodelSet4.utcWNlsfType
   */
  public void setUtcWNlsf(Asn1Object value) {
    this.utcWNlsf_ = (UTCmodelSet4.utcWNlsfType) value;
  }
  public UTCmodelSet4.utcWNlsfType setUtcWNlsfToNewInstance() {
    utcWNlsf_ = new UTCmodelSet4.utcWNlsfType();
    return utcWNlsf_;
  }
  
  private UTCmodelSet4.utcDNType utcDN_;
  public UTCmodelSet4.utcDNType getUtcDN() {
    return utcDN_;
  }
  /**
   * @throws ClassCastException if value is not a UTCmodelSet4.utcDNType
   */
  public void setUtcDN(Asn1Object value) {
    this.utcDN_ = (UTCmodelSet4.utcDNType) value;
  }
  public UTCmodelSet4.utcDNType setUtcDNToNewInstance() {
    utcDN_ = new UTCmodelSet4.utcDNType();
    return utcDN_;
  }
  
  private UTCmodelSet4.utcDeltaTlsfType utcDeltaTlsf_;
  public UTCmodelSet4.utcDeltaTlsfType getUtcDeltaTlsf() {
    return utcDeltaTlsf_;
  }
  /**
   * @throws ClassCastException if value is not a UTCmodelSet4.utcDeltaTlsfType
   */
  public void setUtcDeltaTlsf(Asn1Object value) {
    this.utcDeltaTlsf_ = (UTCmodelSet4.utcDeltaTlsfType) value;
  }
  public UTCmodelSet4.utcDeltaTlsfType setUtcDeltaTlsfToNewInstance() {
    utcDeltaTlsf_ = new UTCmodelSet4.utcDeltaTlsfType();
    return utcDeltaTlsf_;
  }
  
  private UTCmodelSet4.utcStandardIDType utcStandardID_;
  public UTCmodelSet4.utcStandardIDType getUtcStandardID() {
    return utcStandardID_;
  }
  /**
   * @throws ClassCastException if value is not a UTCmodelSet4.utcStandardIDType
   */
  public void setUtcStandardID(Asn1Object value) {
    this.utcStandardID_ = (UTCmodelSet4.utcStandardIDType) value;
  }
  public UTCmodelSet4.utcStandardIDType setUtcStandardIDToNewInstance() {
    utcStandardID_ = new UTCmodelSet4.utcStandardIDType();
    return utcStandardID_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getUtcA1wnt() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getUtcA1wnt();
          }

          @Override public void setToNewInstance() {
            setUtcA1wntToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UTCmodelSet4.utcA1wntType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "utcA1wnt : "
                    + getUtcA1wnt().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getUtcA0wnt() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getUtcA0wnt();
          }

          @Override public void setToNewInstance() {
            setUtcA0wntToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UTCmodelSet4.utcA0wntType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "utcA0wnt : "
                    + getUtcA0wnt().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getUtcTot() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getUtcTot();
          }

          @Override public void setToNewInstance() {
            setUtcTotToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UTCmodelSet4.utcTotType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "utcTot : "
                    + getUtcTot().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getUtcWNt() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getUtcWNt();
          }

          @Override public void setToNewInstance() {
            setUtcWNtToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UTCmodelSet4.utcWNtType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "utcWNt : "
                    + getUtcWNt().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getUtcDeltaTls() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getUtcDeltaTls();
          }

          @Override public void setToNewInstance() {
            setUtcDeltaTlsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UTCmodelSet4.utcDeltaTlsType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "utcDeltaTls : "
                    + getUtcDeltaTls().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getUtcWNlsf() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getUtcWNlsf();
          }

          @Override public void setToNewInstance() {
            setUtcWNlsfToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UTCmodelSet4.utcWNlsfType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "utcWNlsf : "
                    + getUtcWNlsf().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getUtcDN() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getUtcDN();
          }

          @Override public void setToNewInstance() {
            setUtcDNToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UTCmodelSet4.utcDNType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "utcDN : "
                    + getUtcDN().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 7);

          @Override public boolean isExplicitlySet() {
            return getUtcDeltaTlsf() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getUtcDeltaTlsf();
          }

          @Override public void setToNewInstance() {
            setUtcDeltaTlsfToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UTCmodelSet4.utcDeltaTlsfType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "utcDeltaTlsf : "
                    + getUtcDeltaTlsf().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 8);

          @Override public boolean isExplicitlySet() {
            return getUtcStandardID() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getUtcStandardID();
          }

          @Override public void setToNewInstance() {
            setUtcStandardIDToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UTCmodelSet4.utcStandardIDType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "utcStandardID : "
                    + getUtcStandardID().toIndentedString(indent);
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
public static class utcA1wntType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_utcA1wntType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public utcA1wntType() {
    super();
    setValueRange(new java.math.BigInteger("-8388608"), new java.math.BigInteger("8388607"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_utcA1wntType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_utcA1wntType != null) {
      return ImmutableList.of(TAG_utcA1wntType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new utcA1wntType from encoded stream.
   */
  public static utcA1wntType fromPerUnaligned(byte[] encodedBytes) {
    utcA1wntType result = new utcA1wntType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new utcA1wntType from encoded stream.
   */
  public static utcA1wntType fromPerAligned(byte[] encodedBytes) {
    utcA1wntType result = new utcA1wntType();
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
    return "utcA1wntType = " + getInteger() + ";\n";
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
public static class utcA0wntType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_utcA0wntType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public utcA0wntType() {
    super();
    setValueRange(new java.math.BigInteger("-2147483648"), new java.math.BigInteger("2147483647"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_utcA0wntType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_utcA0wntType != null) {
      return ImmutableList.of(TAG_utcA0wntType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new utcA0wntType from encoded stream.
   */
  public static utcA0wntType fromPerUnaligned(byte[] encodedBytes) {
    utcA0wntType result = new utcA0wntType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new utcA0wntType from encoded stream.
   */
  public static utcA0wntType fromPerAligned(byte[] encodedBytes) {
    utcA0wntType result = new utcA0wntType();
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
    return "utcA0wntType = " + getInteger() + ";\n";
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
public static class utcTotType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_utcTotType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public utcTotType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("255"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_utcTotType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_utcTotType != null) {
      return ImmutableList.of(TAG_utcTotType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new utcTotType from encoded stream.
   */
  public static utcTotType fromPerUnaligned(byte[] encodedBytes) {
    utcTotType result = new utcTotType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new utcTotType from encoded stream.
   */
  public static utcTotType fromPerAligned(byte[] encodedBytes) {
    utcTotType result = new utcTotType();
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
    return "utcTotType = " + getInteger() + ";\n";
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
public static class utcWNtType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_utcWNtType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public utcWNtType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("255"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_utcWNtType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_utcWNtType != null) {
      return ImmutableList.of(TAG_utcWNtType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new utcWNtType from encoded stream.
   */
  public static utcWNtType fromPerUnaligned(byte[] encodedBytes) {
    utcWNtType result = new utcWNtType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new utcWNtType from encoded stream.
   */
  public static utcWNtType fromPerAligned(byte[] encodedBytes) {
    utcWNtType result = new utcWNtType();
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
    return "utcWNtType = " + getInteger() + ";\n";
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
public static class utcDeltaTlsType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_utcDeltaTlsType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public utcDeltaTlsType() {
    super();
    setValueRange(new java.math.BigInteger("-128"), new java.math.BigInteger("127"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_utcDeltaTlsType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_utcDeltaTlsType != null) {
      return ImmutableList.of(TAG_utcDeltaTlsType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new utcDeltaTlsType from encoded stream.
   */
  public static utcDeltaTlsType fromPerUnaligned(byte[] encodedBytes) {
    utcDeltaTlsType result = new utcDeltaTlsType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new utcDeltaTlsType from encoded stream.
   */
  public static utcDeltaTlsType fromPerAligned(byte[] encodedBytes) {
    utcDeltaTlsType result = new utcDeltaTlsType();
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
    return "utcDeltaTlsType = " + getInteger() + ";\n";
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
public static class utcWNlsfType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_utcWNlsfType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public utcWNlsfType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("255"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_utcWNlsfType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_utcWNlsfType != null) {
      return ImmutableList.of(TAG_utcWNlsfType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new utcWNlsfType from encoded stream.
   */
  public static utcWNlsfType fromPerUnaligned(byte[] encodedBytes) {
    utcWNlsfType result = new utcWNlsfType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new utcWNlsfType from encoded stream.
   */
  public static utcWNlsfType fromPerAligned(byte[] encodedBytes) {
    utcWNlsfType result = new utcWNlsfType();
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
    return "utcWNlsfType = " + getInteger() + ";\n";
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
public static class utcDNType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_utcDNType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public utcDNType() {
    super();
    setValueRange(new java.math.BigInteger("-128"), new java.math.BigInteger("127"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_utcDNType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_utcDNType != null) {
      return ImmutableList.of(TAG_utcDNType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new utcDNType from encoded stream.
   */
  public static utcDNType fromPerUnaligned(byte[] encodedBytes) {
    utcDNType result = new utcDNType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new utcDNType from encoded stream.
   */
  public static utcDNType fromPerAligned(byte[] encodedBytes) {
    utcDNType result = new utcDNType();
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
    return "utcDNType = " + getInteger() + ";\n";
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
public static class utcDeltaTlsfType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_utcDeltaTlsfType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public utcDeltaTlsfType() {
    super();
    setValueRange(new java.math.BigInteger("-128"), new java.math.BigInteger("127"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_utcDeltaTlsfType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_utcDeltaTlsfType != null) {
      return ImmutableList.of(TAG_utcDeltaTlsfType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new utcDeltaTlsfType from encoded stream.
   */
  public static utcDeltaTlsfType fromPerUnaligned(byte[] encodedBytes) {
    utcDeltaTlsfType result = new utcDeltaTlsfType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new utcDeltaTlsfType from encoded stream.
   */
  public static utcDeltaTlsfType fromPerAligned(byte[] encodedBytes) {
    utcDeltaTlsfType result = new utcDeltaTlsfType();
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
    return "utcDeltaTlsfType = " + getInteger() + ";\n";
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
public static class utcStandardIDType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_utcStandardIDType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public utcStandardIDType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("7"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_utcStandardIDType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_utcStandardIDType != null) {
      return ImmutableList.of(TAG_utcStandardIDType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new utcStandardIDType from encoded stream.
   */
  public static utcStandardIDType fromPerUnaligned(byte[] encodedBytes) {
    utcStandardIDType result = new utcStandardIDType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new utcStandardIDType from encoded stream.
   */
  public static utcStandardIDType fromPerAligned(byte[] encodedBytes) {
    utcStandardIDType result = new utcStandardIDType();
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
    return "utcStandardIDType = " + getInteger() + ";\n";
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
    builder.append("UTCmodelSet4 = {\n");
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
