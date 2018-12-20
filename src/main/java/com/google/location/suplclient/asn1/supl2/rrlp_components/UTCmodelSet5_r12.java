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
public  class UTCmodelSet5_r12 extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_UTCmodelSet5_r12
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public UTCmodelSet5_r12() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_UTCmodelSet5_r12;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_UTCmodelSet5_r12 != null) {
      return ImmutableList.of(TAG_UTCmodelSet5_r12);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new UTCmodelSet5_r12 from encoded stream.
   */
  public static UTCmodelSet5_r12 fromPerUnaligned(byte[] encodedBytes) {
    UTCmodelSet5_r12 result = new UTCmodelSet5_r12();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new UTCmodelSet5_r12 from encoded stream.
   */
  public static UTCmodelSet5_r12 fromPerAligned(byte[] encodedBytes) {
    UTCmodelSet5_r12 result = new UTCmodelSet5_r12();
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

  
  private UTCmodelSet5_r12.utcA0_r12Type utcA0_r12_;
  public UTCmodelSet5_r12.utcA0_r12Type getUtcA0_r12() {
    return utcA0_r12_;
  }
  /**
   * @throws ClassCastException if value is not a UTCmodelSet5_r12.utcA0_r12Type
   */
  public void setUtcA0_r12(Asn1Object value) {
    this.utcA0_r12_ = (UTCmodelSet5_r12.utcA0_r12Type) value;
  }
  public UTCmodelSet5_r12.utcA0_r12Type setUtcA0_r12ToNewInstance() {
    utcA0_r12_ = new UTCmodelSet5_r12.utcA0_r12Type();
    return utcA0_r12_;
  }
  
  private UTCmodelSet5_r12.utcA1_r12Type utcA1_r12_;
  public UTCmodelSet5_r12.utcA1_r12Type getUtcA1_r12() {
    return utcA1_r12_;
  }
  /**
   * @throws ClassCastException if value is not a UTCmodelSet5_r12.utcA1_r12Type
   */
  public void setUtcA1_r12(Asn1Object value) {
    this.utcA1_r12_ = (UTCmodelSet5_r12.utcA1_r12Type) value;
  }
  public UTCmodelSet5_r12.utcA1_r12Type setUtcA1_r12ToNewInstance() {
    utcA1_r12_ = new UTCmodelSet5_r12.utcA1_r12Type();
    return utcA1_r12_;
  }
  
  private UTCmodelSet5_r12.utcDeltaTls_r12Type utcDeltaTls_r12_;
  public UTCmodelSet5_r12.utcDeltaTls_r12Type getUtcDeltaTls_r12() {
    return utcDeltaTls_r12_;
  }
  /**
   * @throws ClassCastException if value is not a UTCmodelSet5_r12.utcDeltaTls_r12Type
   */
  public void setUtcDeltaTls_r12(Asn1Object value) {
    this.utcDeltaTls_r12_ = (UTCmodelSet5_r12.utcDeltaTls_r12Type) value;
  }
  public UTCmodelSet5_r12.utcDeltaTls_r12Type setUtcDeltaTls_r12ToNewInstance() {
    utcDeltaTls_r12_ = new UTCmodelSet5_r12.utcDeltaTls_r12Type();
    return utcDeltaTls_r12_;
  }
  
  private UTCmodelSet5_r12.utcWNlsf_r12Type utcWNlsf_r12_;
  public UTCmodelSet5_r12.utcWNlsf_r12Type getUtcWNlsf_r12() {
    return utcWNlsf_r12_;
  }
  /**
   * @throws ClassCastException if value is not a UTCmodelSet5_r12.utcWNlsf_r12Type
   */
  public void setUtcWNlsf_r12(Asn1Object value) {
    this.utcWNlsf_r12_ = (UTCmodelSet5_r12.utcWNlsf_r12Type) value;
  }
  public UTCmodelSet5_r12.utcWNlsf_r12Type setUtcWNlsf_r12ToNewInstance() {
    utcWNlsf_r12_ = new UTCmodelSet5_r12.utcWNlsf_r12Type();
    return utcWNlsf_r12_;
  }
  
  private UTCmodelSet5_r12.utcDN_r12Type utcDN_r12_;
  public UTCmodelSet5_r12.utcDN_r12Type getUtcDN_r12() {
    return utcDN_r12_;
  }
  /**
   * @throws ClassCastException if value is not a UTCmodelSet5_r12.utcDN_r12Type
   */
  public void setUtcDN_r12(Asn1Object value) {
    this.utcDN_r12_ = (UTCmodelSet5_r12.utcDN_r12Type) value;
  }
  public UTCmodelSet5_r12.utcDN_r12Type setUtcDN_r12ToNewInstance() {
    utcDN_r12_ = new UTCmodelSet5_r12.utcDN_r12Type();
    return utcDN_r12_;
  }
  
  private UTCmodelSet5_r12.utcDeltaTlsf_r12Type utcDeltaTlsf_r12_;
  public UTCmodelSet5_r12.utcDeltaTlsf_r12Type getUtcDeltaTlsf_r12() {
    return utcDeltaTlsf_r12_;
  }
  /**
   * @throws ClassCastException if value is not a UTCmodelSet5_r12.utcDeltaTlsf_r12Type
   */
  public void setUtcDeltaTlsf_r12(Asn1Object value) {
    this.utcDeltaTlsf_r12_ = (UTCmodelSet5_r12.utcDeltaTlsf_r12Type) value;
  }
  public UTCmodelSet5_r12.utcDeltaTlsf_r12Type setUtcDeltaTlsf_r12ToNewInstance() {
    utcDeltaTlsf_r12_ = new UTCmodelSet5_r12.utcDeltaTlsf_r12Type();
    return utcDeltaTlsf_r12_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getUtcA0_r12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getUtcA0_r12();
          }

          @Override public void setToNewInstance() {
            setUtcA0_r12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UTCmodelSet5_r12.utcA0_r12Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "utcA0_r12 : "
                    + getUtcA0_r12().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getUtcA1_r12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getUtcA1_r12();
          }

          @Override public void setToNewInstance() {
            setUtcA1_r12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UTCmodelSet5_r12.utcA1_r12Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "utcA1_r12 : "
                    + getUtcA1_r12().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getUtcDeltaTls_r12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getUtcDeltaTls_r12();
          }

          @Override public void setToNewInstance() {
            setUtcDeltaTls_r12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UTCmodelSet5_r12.utcDeltaTls_r12Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "utcDeltaTls_r12 : "
                    + getUtcDeltaTls_r12().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getUtcWNlsf_r12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getUtcWNlsf_r12();
          }

          @Override public void setToNewInstance() {
            setUtcWNlsf_r12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UTCmodelSet5_r12.utcWNlsf_r12Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "utcWNlsf_r12 : "
                    + getUtcWNlsf_r12().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getUtcDN_r12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getUtcDN_r12();
          }

          @Override public void setToNewInstance() {
            setUtcDN_r12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UTCmodelSet5_r12.utcDN_r12Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "utcDN_r12 : "
                    + getUtcDN_r12().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getUtcDeltaTlsf_r12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getUtcDeltaTlsf_r12();
          }

          @Override public void setToNewInstance() {
            setUtcDeltaTlsf_r12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UTCmodelSet5_r12.utcDeltaTlsf_r12Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "utcDeltaTlsf_r12 : "
                    + getUtcDeltaTlsf_r12().toIndentedString(indent);
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
public static class utcA0_r12Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_utcA0_r12Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public utcA0_r12Type() {
    super();
    setValueRange(new java.math.BigInteger("-2147483648"), new java.math.BigInteger("2147483647"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_utcA0_r12Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_utcA0_r12Type != null) {
      return ImmutableList.of(TAG_utcA0_r12Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new utcA0_r12Type from encoded stream.
   */
  public static utcA0_r12Type fromPerUnaligned(byte[] encodedBytes) {
    utcA0_r12Type result = new utcA0_r12Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new utcA0_r12Type from encoded stream.
   */
  public static utcA0_r12Type fromPerAligned(byte[] encodedBytes) {
    utcA0_r12Type result = new utcA0_r12Type();
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
    return "utcA0_r12Type = " + getInteger() + ";\n";
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
public static class utcA1_r12Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_utcA1_r12Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public utcA1_r12Type() {
    super();
    setValueRange(new java.math.BigInteger("-8388608"), new java.math.BigInteger("8388607"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_utcA1_r12Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_utcA1_r12Type != null) {
      return ImmutableList.of(TAG_utcA1_r12Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new utcA1_r12Type from encoded stream.
   */
  public static utcA1_r12Type fromPerUnaligned(byte[] encodedBytes) {
    utcA1_r12Type result = new utcA1_r12Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new utcA1_r12Type from encoded stream.
   */
  public static utcA1_r12Type fromPerAligned(byte[] encodedBytes) {
    utcA1_r12Type result = new utcA1_r12Type();
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
    return "utcA1_r12Type = " + getInteger() + ";\n";
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
public static class utcDeltaTls_r12Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_utcDeltaTls_r12Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public utcDeltaTls_r12Type() {
    super();
    setValueRange(new java.math.BigInteger("-128"), new java.math.BigInteger("127"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_utcDeltaTls_r12Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_utcDeltaTls_r12Type != null) {
      return ImmutableList.of(TAG_utcDeltaTls_r12Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new utcDeltaTls_r12Type from encoded stream.
   */
  public static utcDeltaTls_r12Type fromPerUnaligned(byte[] encodedBytes) {
    utcDeltaTls_r12Type result = new utcDeltaTls_r12Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new utcDeltaTls_r12Type from encoded stream.
   */
  public static utcDeltaTls_r12Type fromPerAligned(byte[] encodedBytes) {
    utcDeltaTls_r12Type result = new utcDeltaTls_r12Type();
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
    return "utcDeltaTls_r12Type = " + getInteger() + ";\n";
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
public static class utcWNlsf_r12Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_utcWNlsf_r12Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public utcWNlsf_r12Type() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("255"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_utcWNlsf_r12Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_utcWNlsf_r12Type != null) {
      return ImmutableList.of(TAG_utcWNlsf_r12Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new utcWNlsf_r12Type from encoded stream.
   */
  public static utcWNlsf_r12Type fromPerUnaligned(byte[] encodedBytes) {
    utcWNlsf_r12Type result = new utcWNlsf_r12Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new utcWNlsf_r12Type from encoded stream.
   */
  public static utcWNlsf_r12Type fromPerAligned(byte[] encodedBytes) {
    utcWNlsf_r12Type result = new utcWNlsf_r12Type();
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
    return "utcWNlsf_r12Type = " + getInteger() + ";\n";
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
public static class utcDN_r12Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_utcDN_r12Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public utcDN_r12Type() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("255"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_utcDN_r12Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_utcDN_r12Type != null) {
      return ImmutableList.of(TAG_utcDN_r12Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new utcDN_r12Type from encoded stream.
   */
  public static utcDN_r12Type fromPerUnaligned(byte[] encodedBytes) {
    utcDN_r12Type result = new utcDN_r12Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new utcDN_r12Type from encoded stream.
   */
  public static utcDN_r12Type fromPerAligned(byte[] encodedBytes) {
    utcDN_r12Type result = new utcDN_r12Type();
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
    return "utcDN_r12Type = " + getInteger() + ";\n";
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
public static class utcDeltaTlsf_r12Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_utcDeltaTlsf_r12Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public utcDeltaTlsf_r12Type() {
    super();
    setValueRange(new java.math.BigInteger("-128"), new java.math.BigInteger("127"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_utcDeltaTlsf_r12Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_utcDeltaTlsf_r12Type != null) {
      return ImmutableList.of(TAG_utcDeltaTlsf_r12Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new utcDeltaTlsf_r12Type from encoded stream.
   */
  public static utcDeltaTlsf_r12Type fromPerUnaligned(byte[] encodedBytes) {
    utcDeltaTlsf_r12Type result = new utcDeltaTlsf_r12Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new utcDeltaTlsf_r12Type from encoded stream.
   */
  public static utcDeltaTlsf_r12Type fromPerAligned(byte[] encodedBytes) {
    utcDeltaTlsf_r12Type result = new utcDeltaTlsf_r12Type();
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
    return "utcDeltaTlsf_r12Type = " + getInteger() + ";\n";
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
    builder.append("UTCmodelSet5_r12 = {\n");
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
