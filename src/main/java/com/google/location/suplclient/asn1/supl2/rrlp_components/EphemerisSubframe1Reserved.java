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
public  class EphemerisSubframe1Reserved extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_EphemerisSubframe1Reserved
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public EphemerisSubframe1Reserved() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_EphemerisSubframe1Reserved;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_EphemerisSubframe1Reserved != null) {
      return ImmutableList.of(TAG_EphemerisSubframe1Reserved);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new EphemerisSubframe1Reserved from encoded stream.
   */
  public static EphemerisSubframe1Reserved fromPerUnaligned(byte[] encodedBytes) {
    EphemerisSubframe1Reserved result = new EphemerisSubframe1Reserved();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new EphemerisSubframe1Reserved from encoded stream.
   */
  public static EphemerisSubframe1Reserved fromPerAligned(byte[] encodedBytes) {
    EphemerisSubframe1Reserved result = new EphemerisSubframe1Reserved();
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

  
  private EphemerisSubframe1Reserved.reserved1Type reserved1_;
  public EphemerisSubframe1Reserved.reserved1Type getReserved1() {
    return reserved1_;
  }
  /**
   * @throws ClassCastException if value is not a EphemerisSubframe1Reserved.reserved1Type
   */
  public void setReserved1(Asn1Object value) {
    this.reserved1_ = (EphemerisSubframe1Reserved.reserved1Type) value;
  }
  public EphemerisSubframe1Reserved.reserved1Type setReserved1ToNewInstance() {
    reserved1_ = new EphemerisSubframe1Reserved.reserved1Type();
    return reserved1_;
  }
  
  private EphemerisSubframe1Reserved.reserved2Type reserved2_;
  public EphemerisSubframe1Reserved.reserved2Type getReserved2() {
    return reserved2_;
  }
  /**
   * @throws ClassCastException if value is not a EphemerisSubframe1Reserved.reserved2Type
   */
  public void setReserved2(Asn1Object value) {
    this.reserved2_ = (EphemerisSubframe1Reserved.reserved2Type) value;
  }
  public EphemerisSubframe1Reserved.reserved2Type setReserved2ToNewInstance() {
    reserved2_ = new EphemerisSubframe1Reserved.reserved2Type();
    return reserved2_;
  }
  
  private EphemerisSubframe1Reserved.reserved3Type reserved3_;
  public EphemerisSubframe1Reserved.reserved3Type getReserved3() {
    return reserved3_;
  }
  /**
   * @throws ClassCastException if value is not a EphemerisSubframe1Reserved.reserved3Type
   */
  public void setReserved3(Asn1Object value) {
    this.reserved3_ = (EphemerisSubframe1Reserved.reserved3Type) value;
  }
  public EphemerisSubframe1Reserved.reserved3Type setReserved3ToNewInstance() {
    reserved3_ = new EphemerisSubframe1Reserved.reserved3Type();
    return reserved3_;
  }
  
  private EphemerisSubframe1Reserved.reserved4Type reserved4_;
  public EphemerisSubframe1Reserved.reserved4Type getReserved4() {
    return reserved4_;
  }
  /**
   * @throws ClassCastException if value is not a EphemerisSubframe1Reserved.reserved4Type
   */
  public void setReserved4(Asn1Object value) {
    this.reserved4_ = (EphemerisSubframe1Reserved.reserved4Type) value;
  }
  public EphemerisSubframe1Reserved.reserved4Type setReserved4ToNewInstance() {
    reserved4_ = new EphemerisSubframe1Reserved.reserved4Type();
    return reserved4_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getReserved1() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getReserved1();
          }

          @Override public void setToNewInstance() {
            setReserved1ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? EphemerisSubframe1Reserved.reserved1Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "reserved1 : "
                    + getReserved1().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getReserved2() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getReserved2();
          }

          @Override public void setToNewInstance() {
            setReserved2ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? EphemerisSubframe1Reserved.reserved2Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "reserved2 : "
                    + getReserved2().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getReserved3() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getReserved3();
          }

          @Override public void setToNewInstance() {
            setReserved3ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? EphemerisSubframe1Reserved.reserved3Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "reserved3 : "
                    + getReserved3().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getReserved4() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getReserved4();
          }

          @Override public void setToNewInstance() {
            setReserved4ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? EphemerisSubframe1Reserved.reserved4Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "reserved4 : "
                    + getReserved4().toIndentedString(indent);
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
public static class reserved1Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_reserved1Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public reserved1Type() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("8388607"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_reserved1Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_reserved1Type != null) {
      return ImmutableList.of(TAG_reserved1Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new reserved1Type from encoded stream.
   */
  public static reserved1Type fromPerUnaligned(byte[] encodedBytes) {
    reserved1Type result = new reserved1Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new reserved1Type from encoded stream.
   */
  public static reserved1Type fromPerAligned(byte[] encodedBytes) {
    reserved1Type result = new reserved1Type();
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
    return "reserved1Type = " + getInteger() + ";\n";
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
public static class reserved2Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_reserved2Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public reserved2Type() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("16777215"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_reserved2Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_reserved2Type != null) {
      return ImmutableList.of(TAG_reserved2Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new reserved2Type from encoded stream.
   */
  public static reserved2Type fromPerUnaligned(byte[] encodedBytes) {
    reserved2Type result = new reserved2Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new reserved2Type from encoded stream.
   */
  public static reserved2Type fromPerAligned(byte[] encodedBytes) {
    reserved2Type result = new reserved2Type();
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
    return "reserved2Type = " + getInteger() + ";\n";
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
public static class reserved3Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_reserved3Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public reserved3Type() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("16777215"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_reserved3Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_reserved3Type != null) {
      return ImmutableList.of(TAG_reserved3Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new reserved3Type from encoded stream.
   */
  public static reserved3Type fromPerUnaligned(byte[] encodedBytes) {
    reserved3Type result = new reserved3Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new reserved3Type from encoded stream.
   */
  public static reserved3Type fromPerAligned(byte[] encodedBytes) {
    reserved3Type result = new reserved3Type();
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
    return "reserved3Type = " + getInteger() + ";\n";
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
public static class reserved4Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_reserved4Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public reserved4Type() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("65535"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_reserved4Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_reserved4Type != null) {
      return ImmutableList.of(TAG_reserved4Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new reserved4Type from encoded stream.
   */
  public static reserved4Type fromPerUnaligned(byte[] encodedBytes) {
    reserved4Type result = new reserved4Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new reserved4Type from encoded stream.
   */
  public static reserved4Type fromPerAligned(byte[] encodedBytes) {
    reserved4Type result = new reserved4Type();
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
    return "reserved4Type = " + getInteger() + ";\n";
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
    builder.append("EphemerisSubframe1Reserved = {\n");
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
