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
public  class StandardClockModelElement extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_StandardClockModelElement
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public StandardClockModelElement() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_StandardClockModelElement;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_StandardClockModelElement != null) {
      return ImmutableList.of(TAG_StandardClockModelElement);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new StandardClockModelElement from encoded stream.
   */
  public static StandardClockModelElement fromPerUnaligned(byte[] encodedBytes) {
    StandardClockModelElement result = new StandardClockModelElement();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new StandardClockModelElement from encoded stream.
   */
  public static StandardClockModelElement fromPerAligned(byte[] encodedBytes) {
    StandardClockModelElement result = new StandardClockModelElement();
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

  
  private StandardClockModelElement.stanClockTocType stanClockToc_;
  public StandardClockModelElement.stanClockTocType getStanClockToc() {
    return stanClockToc_;
  }
  /**
   * @throws ClassCastException if value is not a StandardClockModelElement.stanClockTocType
   */
  public void setStanClockToc(Asn1Object value) {
    this.stanClockToc_ = (StandardClockModelElement.stanClockTocType) value;
  }
  public StandardClockModelElement.stanClockTocType setStanClockTocToNewInstance() {
    stanClockToc_ = new StandardClockModelElement.stanClockTocType();
    return stanClockToc_;
  }
  
  private StandardClockModelElement.stanClockAF2Type stanClockAF2_;
  public StandardClockModelElement.stanClockAF2Type getStanClockAF2() {
    return stanClockAF2_;
  }
  /**
   * @throws ClassCastException if value is not a StandardClockModelElement.stanClockAF2Type
   */
  public void setStanClockAF2(Asn1Object value) {
    this.stanClockAF2_ = (StandardClockModelElement.stanClockAF2Type) value;
  }
  public StandardClockModelElement.stanClockAF2Type setStanClockAF2ToNewInstance() {
    stanClockAF2_ = new StandardClockModelElement.stanClockAF2Type();
    return stanClockAF2_;
  }
  
  private StandardClockModelElement.stanClockAF1Type stanClockAF1_;
  public StandardClockModelElement.stanClockAF1Type getStanClockAF1() {
    return stanClockAF1_;
  }
  /**
   * @throws ClassCastException if value is not a StandardClockModelElement.stanClockAF1Type
   */
  public void setStanClockAF1(Asn1Object value) {
    this.stanClockAF1_ = (StandardClockModelElement.stanClockAF1Type) value;
  }
  public StandardClockModelElement.stanClockAF1Type setStanClockAF1ToNewInstance() {
    stanClockAF1_ = new StandardClockModelElement.stanClockAF1Type();
    return stanClockAF1_;
  }
  
  private StandardClockModelElement.stanClockAF0Type stanClockAF0_;
  public StandardClockModelElement.stanClockAF0Type getStanClockAF0() {
    return stanClockAF0_;
  }
  /**
   * @throws ClassCastException if value is not a StandardClockModelElement.stanClockAF0Type
   */
  public void setStanClockAF0(Asn1Object value) {
    this.stanClockAF0_ = (StandardClockModelElement.stanClockAF0Type) value;
  }
  public StandardClockModelElement.stanClockAF0Type setStanClockAF0ToNewInstance() {
    stanClockAF0_ = new StandardClockModelElement.stanClockAF0Type();
    return stanClockAF0_;
  }
  
  private StandardClockModelElement.stanClockTgdType stanClockTgd_;
  public StandardClockModelElement.stanClockTgdType getStanClockTgd() {
    return stanClockTgd_;
  }
  /**
   * @throws ClassCastException if value is not a StandardClockModelElement.stanClockTgdType
   */
  public void setStanClockTgd(Asn1Object value) {
    this.stanClockTgd_ = (StandardClockModelElement.stanClockTgdType) value;
  }
  public StandardClockModelElement.stanClockTgdType setStanClockTgdToNewInstance() {
    stanClockTgd_ = new StandardClockModelElement.stanClockTgdType();
    return stanClockTgd_;
  }
  
  private StandardClockModelElement.stanModelIDType stanModelID_;
  public StandardClockModelElement.stanModelIDType getStanModelID() {
    return stanModelID_;
  }
  /**
   * @throws ClassCastException if value is not a StandardClockModelElement.stanModelIDType
   */
  public void setStanModelID(Asn1Object value) {
    this.stanModelID_ = (StandardClockModelElement.stanModelIDType) value;
  }
  public StandardClockModelElement.stanModelIDType setStanModelIDToNewInstance() {
    stanModelID_ = new StandardClockModelElement.stanModelIDType();
    return stanModelID_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getStanClockToc() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getStanClockToc();
          }

          @Override public void setToNewInstance() {
            setStanClockTocToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? StandardClockModelElement.stanClockTocType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "stanClockToc : "
                    + getStanClockToc().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getStanClockAF2() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getStanClockAF2();
          }

          @Override public void setToNewInstance() {
            setStanClockAF2ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? StandardClockModelElement.stanClockAF2Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "stanClockAF2 : "
                    + getStanClockAF2().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getStanClockAF1() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getStanClockAF1();
          }

          @Override public void setToNewInstance() {
            setStanClockAF1ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? StandardClockModelElement.stanClockAF1Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "stanClockAF1 : "
                    + getStanClockAF1().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getStanClockAF0() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getStanClockAF0();
          }

          @Override public void setToNewInstance() {
            setStanClockAF0ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? StandardClockModelElement.stanClockAF0Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "stanClockAF0 : "
                    + getStanClockAF0().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getStanClockTgd() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getStanClockTgd();
          }

          @Override public void setToNewInstance() {
            setStanClockTgdToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? StandardClockModelElement.stanClockTgdType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "stanClockTgd : "
                    + getStanClockTgd().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getStanModelID() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getStanModelID();
          }

          @Override public void setToNewInstance() {
            setStanModelIDToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? StandardClockModelElement.stanModelIDType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "stanModelID : "
                    + getStanModelID().toIndentedString(indent);
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
public static class stanClockTocType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_stanClockTocType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public stanClockTocType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("16383"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_stanClockTocType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_stanClockTocType != null) {
      return ImmutableList.of(TAG_stanClockTocType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new stanClockTocType from encoded stream.
   */
  public static stanClockTocType fromPerUnaligned(byte[] encodedBytes) {
    stanClockTocType result = new stanClockTocType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new stanClockTocType from encoded stream.
   */
  public static stanClockTocType fromPerAligned(byte[] encodedBytes) {
    stanClockTocType result = new stanClockTocType();
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
    return "stanClockTocType = " + getInteger() + ";\n";
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
public static class stanClockAF2Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_stanClockAF2Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public stanClockAF2Type() {
    super();
    setValueRange(new java.math.BigInteger("-2048"), new java.math.BigInteger("2047"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_stanClockAF2Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_stanClockAF2Type != null) {
      return ImmutableList.of(TAG_stanClockAF2Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new stanClockAF2Type from encoded stream.
   */
  public static stanClockAF2Type fromPerUnaligned(byte[] encodedBytes) {
    stanClockAF2Type result = new stanClockAF2Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new stanClockAF2Type from encoded stream.
   */
  public static stanClockAF2Type fromPerAligned(byte[] encodedBytes) {
    stanClockAF2Type result = new stanClockAF2Type();
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
    return "stanClockAF2Type = " + getInteger() + ";\n";
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
public static class stanClockAF1Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_stanClockAF1Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public stanClockAF1Type() {
    super();
    setValueRange(new java.math.BigInteger("-131072"), new java.math.BigInteger("131071"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_stanClockAF1Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_stanClockAF1Type != null) {
      return ImmutableList.of(TAG_stanClockAF1Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new stanClockAF1Type from encoded stream.
   */
  public static stanClockAF1Type fromPerUnaligned(byte[] encodedBytes) {
    stanClockAF1Type result = new stanClockAF1Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new stanClockAF1Type from encoded stream.
   */
  public static stanClockAF1Type fromPerAligned(byte[] encodedBytes) {
    stanClockAF1Type result = new stanClockAF1Type();
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
    return "stanClockAF1Type = " + getInteger() + ";\n";
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
public static class stanClockAF0Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_stanClockAF0Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public stanClockAF0Type() {
    super();
    setValueRange(new java.math.BigInteger("-134217728"), new java.math.BigInteger("134217727"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_stanClockAF0Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_stanClockAF0Type != null) {
      return ImmutableList.of(TAG_stanClockAF0Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new stanClockAF0Type from encoded stream.
   */
  public static stanClockAF0Type fromPerUnaligned(byte[] encodedBytes) {
    stanClockAF0Type result = new stanClockAF0Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new stanClockAF0Type from encoded stream.
   */
  public static stanClockAF0Type fromPerAligned(byte[] encodedBytes) {
    stanClockAF0Type result = new stanClockAF0Type();
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
    return "stanClockAF0Type = " + getInteger() + ";\n";
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
public static class stanClockTgdType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_stanClockTgdType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public stanClockTgdType() {
    super();
    setValueRange(new java.math.BigInteger("-512"), new java.math.BigInteger("511"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_stanClockTgdType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_stanClockTgdType != null) {
      return ImmutableList.of(TAG_stanClockTgdType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new stanClockTgdType from encoded stream.
   */
  public static stanClockTgdType fromPerUnaligned(byte[] encodedBytes) {
    stanClockTgdType result = new stanClockTgdType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new stanClockTgdType from encoded stream.
   */
  public static stanClockTgdType fromPerAligned(byte[] encodedBytes) {
    stanClockTgdType result = new stanClockTgdType();
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
    return "stanClockTgdType = " + getInteger() + ";\n";
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
public static class stanModelIDType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_stanModelIDType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public stanModelIDType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("1"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_stanModelIDType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_stanModelIDType != null) {
      return ImmutableList.of(TAG_stanModelIDType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new stanModelIDType from encoded stream.
   */
  public static stanModelIDType fromPerUnaligned(byte[] encodedBytes) {
    stanModelIDType result = new stanModelIDType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new stanModelIDType from encoded stream.
   */
  public static stanModelIDType fromPerAligned(byte[] encodedBytes) {
    stanModelIDType result = new stanModelIDType();
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
    return "stanModelIDType = " + getInteger() + ";\n";
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
    builder.append("StandardClockModelElement = {\n");
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
