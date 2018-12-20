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
public  class GANSSIonoStormFlags extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GANSSIonoStormFlags
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GANSSIonoStormFlags() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GANSSIonoStormFlags;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GANSSIonoStormFlags != null) {
      return ImmutableList.of(TAG_GANSSIonoStormFlags);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GANSSIonoStormFlags from encoded stream.
   */
  public static GANSSIonoStormFlags fromPerUnaligned(byte[] encodedBytes) {
    GANSSIonoStormFlags result = new GANSSIonoStormFlags();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GANSSIonoStormFlags from encoded stream.
   */
  public static GANSSIonoStormFlags fromPerAligned(byte[] encodedBytes) {
    GANSSIonoStormFlags result = new GANSSIonoStormFlags();
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

  
  private GANSSIonoStormFlags.ionoStormFlag1Type ionoStormFlag1_;
  public GANSSIonoStormFlags.ionoStormFlag1Type getIonoStormFlag1() {
    return ionoStormFlag1_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSIonoStormFlags.ionoStormFlag1Type
   */
  public void setIonoStormFlag1(Asn1Object value) {
    this.ionoStormFlag1_ = (GANSSIonoStormFlags.ionoStormFlag1Type) value;
  }
  public GANSSIonoStormFlags.ionoStormFlag1Type setIonoStormFlag1ToNewInstance() {
    ionoStormFlag1_ = new GANSSIonoStormFlags.ionoStormFlag1Type();
    return ionoStormFlag1_;
  }
  
  private GANSSIonoStormFlags.ionoStormFlag2Type ionoStormFlag2_;
  public GANSSIonoStormFlags.ionoStormFlag2Type getIonoStormFlag2() {
    return ionoStormFlag2_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSIonoStormFlags.ionoStormFlag2Type
   */
  public void setIonoStormFlag2(Asn1Object value) {
    this.ionoStormFlag2_ = (GANSSIonoStormFlags.ionoStormFlag2Type) value;
  }
  public GANSSIonoStormFlags.ionoStormFlag2Type setIonoStormFlag2ToNewInstance() {
    ionoStormFlag2_ = new GANSSIonoStormFlags.ionoStormFlag2Type();
    return ionoStormFlag2_;
  }
  
  private GANSSIonoStormFlags.ionoStormFlag3Type ionoStormFlag3_;
  public GANSSIonoStormFlags.ionoStormFlag3Type getIonoStormFlag3() {
    return ionoStormFlag3_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSIonoStormFlags.ionoStormFlag3Type
   */
  public void setIonoStormFlag3(Asn1Object value) {
    this.ionoStormFlag3_ = (GANSSIonoStormFlags.ionoStormFlag3Type) value;
  }
  public GANSSIonoStormFlags.ionoStormFlag3Type setIonoStormFlag3ToNewInstance() {
    ionoStormFlag3_ = new GANSSIonoStormFlags.ionoStormFlag3Type();
    return ionoStormFlag3_;
  }
  
  private GANSSIonoStormFlags.ionoStormFlag4Type ionoStormFlag4_;
  public GANSSIonoStormFlags.ionoStormFlag4Type getIonoStormFlag4() {
    return ionoStormFlag4_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSIonoStormFlags.ionoStormFlag4Type
   */
  public void setIonoStormFlag4(Asn1Object value) {
    this.ionoStormFlag4_ = (GANSSIonoStormFlags.ionoStormFlag4Type) value;
  }
  public GANSSIonoStormFlags.ionoStormFlag4Type setIonoStormFlag4ToNewInstance() {
    ionoStormFlag4_ = new GANSSIonoStormFlags.ionoStormFlag4Type();
    return ionoStormFlag4_;
  }
  
  private GANSSIonoStormFlags.ionoStormFlag5Type ionoStormFlag5_;
  public GANSSIonoStormFlags.ionoStormFlag5Type getIonoStormFlag5() {
    return ionoStormFlag5_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSIonoStormFlags.ionoStormFlag5Type
   */
  public void setIonoStormFlag5(Asn1Object value) {
    this.ionoStormFlag5_ = (GANSSIonoStormFlags.ionoStormFlag5Type) value;
  }
  public GANSSIonoStormFlags.ionoStormFlag5Type setIonoStormFlag5ToNewInstance() {
    ionoStormFlag5_ = new GANSSIonoStormFlags.ionoStormFlag5Type();
    return ionoStormFlag5_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getIonoStormFlag1() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getIonoStormFlag1();
          }

          @Override public void setToNewInstance() {
            setIonoStormFlag1ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSIonoStormFlags.ionoStormFlag1Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ionoStormFlag1 : "
                    + getIonoStormFlag1().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getIonoStormFlag2() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getIonoStormFlag2();
          }

          @Override public void setToNewInstance() {
            setIonoStormFlag2ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSIonoStormFlags.ionoStormFlag2Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ionoStormFlag2 : "
                    + getIonoStormFlag2().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getIonoStormFlag3() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getIonoStormFlag3();
          }

          @Override public void setToNewInstance() {
            setIonoStormFlag3ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSIonoStormFlags.ionoStormFlag3Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ionoStormFlag3 : "
                    + getIonoStormFlag3().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getIonoStormFlag4() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getIonoStormFlag4();
          }

          @Override public void setToNewInstance() {
            setIonoStormFlag4ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSIonoStormFlags.ionoStormFlag4Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ionoStormFlag4 : "
                    + getIonoStormFlag4().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getIonoStormFlag5() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getIonoStormFlag5();
          }

          @Override public void setToNewInstance() {
            setIonoStormFlag5ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSIonoStormFlags.ionoStormFlag5Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ionoStormFlag5 : "
                    + getIonoStormFlag5().toIndentedString(indent);
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
public static class ionoStormFlag1Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ionoStormFlag1Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ionoStormFlag1Type() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("1"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ionoStormFlag1Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ionoStormFlag1Type != null) {
      return ImmutableList.of(TAG_ionoStormFlag1Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ionoStormFlag1Type from encoded stream.
   */
  public static ionoStormFlag1Type fromPerUnaligned(byte[] encodedBytes) {
    ionoStormFlag1Type result = new ionoStormFlag1Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ionoStormFlag1Type from encoded stream.
   */
  public static ionoStormFlag1Type fromPerAligned(byte[] encodedBytes) {
    ionoStormFlag1Type result = new ionoStormFlag1Type();
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
    return "ionoStormFlag1Type = " + getInteger() + ";\n";
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
public static class ionoStormFlag2Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ionoStormFlag2Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ionoStormFlag2Type() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("1"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ionoStormFlag2Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ionoStormFlag2Type != null) {
      return ImmutableList.of(TAG_ionoStormFlag2Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ionoStormFlag2Type from encoded stream.
   */
  public static ionoStormFlag2Type fromPerUnaligned(byte[] encodedBytes) {
    ionoStormFlag2Type result = new ionoStormFlag2Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ionoStormFlag2Type from encoded stream.
   */
  public static ionoStormFlag2Type fromPerAligned(byte[] encodedBytes) {
    ionoStormFlag2Type result = new ionoStormFlag2Type();
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
    return "ionoStormFlag2Type = " + getInteger() + ";\n";
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
public static class ionoStormFlag3Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ionoStormFlag3Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ionoStormFlag3Type() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("1"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ionoStormFlag3Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ionoStormFlag3Type != null) {
      return ImmutableList.of(TAG_ionoStormFlag3Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ionoStormFlag3Type from encoded stream.
   */
  public static ionoStormFlag3Type fromPerUnaligned(byte[] encodedBytes) {
    ionoStormFlag3Type result = new ionoStormFlag3Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ionoStormFlag3Type from encoded stream.
   */
  public static ionoStormFlag3Type fromPerAligned(byte[] encodedBytes) {
    ionoStormFlag3Type result = new ionoStormFlag3Type();
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
    return "ionoStormFlag3Type = " + getInteger() + ";\n";
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
public static class ionoStormFlag4Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ionoStormFlag4Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ionoStormFlag4Type() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("1"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ionoStormFlag4Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ionoStormFlag4Type != null) {
      return ImmutableList.of(TAG_ionoStormFlag4Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ionoStormFlag4Type from encoded stream.
   */
  public static ionoStormFlag4Type fromPerUnaligned(byte[] encodedBytes) {
    ionoStormFlag4Type result = new ionoStormFlag4Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ionoStormFlag4Type from encoded stream.
   */
  public static ionoStormFlag4Type fromPerAligned(byte[] encodedBytes) {
    ionoStormFlag4Type result = new ionoStormFlag4Type();
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
    return "ionoStormFlag4Type = " + getInteger() + ";\n";
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
public static class ionoStormFlag5Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ionoStormFlag5Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ionoStormFlag5Type() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("1"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ionoStormFlag5Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ionoStormFlag5Type != null) {
      return ImmutableList.of(TAG_ionoStormFlag5Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ionoStormFlag5Type from encoded stream.
   */
  public static ionoStormFlag5Type fromPerUnaligned(byte[] encodedBytes) {
    ionoStormFlag5Type result = new ionoStormFlag5Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ionoStormFlag5Type from encoded stream.
   */
  public static ionoStormFlag5Type fromPerAligned(byte[] encodedBytes) {
    ionoStormFlag5Type result = new ionoStormFlag5Type();
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
    return "ionoStormFlag5Type = " + getInteger() + ";\n";
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
    builder.append("GANSSIonoStormFlags = {\n");
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
