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
public  class GanssAdditionalDataChoices extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GanssAdditionalDataChoices
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GanssAdditionalDataChoices() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GanssAdditionalDataChoices;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GanssAdditionalDataChoices != null) {
      return ImmutableList.of(TAG_GanssAdditionalDataChoices);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GanssAdditionalDataChoices from encoded stream.
   */
  public static GanssAdditionalDataChoices fromPerUnaligned(byte[] encodedBytes) {
    GanssAdditionalDataChoices result = new GanssAdditionalDataChoices();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GanssAdditionalDataChoices from encoded stream.
   */
  public static GanssAdditionalDataChoices fromPerAligned(byte[] encodedBytes) {
    GanssAdditionalDataChoices result = new GanssAdditionalDataChoices();
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

  
  private GanssAdditionalDataChoices.orbitModelIDType orbitModelID_;
  public GanssAdditionalDataChoices.orbitModelIDType getOrbitModelID() {
    return orbitModelID_;
  }
  /**
   * @throws ClassCastException if value is not a GanssAdditionalDataChoices.orbitModelIDType
   */
  public void setOrbitModelID(Asn1Object value) {
    this.orbitModelID_ = (GanssAdditionalDataChoices.orbitModelIDType) value;
  }
  public GanssAdditionalDataChoices.orbitModelIDType setOrbitModelIDToNewInstance() {
    orbitModelID_ = new GanssAdditionalDataChoices.orbitModelIDType();
    return orbitModelID_;
  }
  
  private GanssAdditionalDataChoices.clockModelIDType clockModelID_;
  public GanssAdditionalDataChoices.clockModelIDType getClockModelID() {
    return clockModelID_;
  }
  /**
   * @throws ClassCastException if value is not a GanssAdditionalDataChoices.clockModelIDType
   */
  public void setClockModelID(Asn1Object value) {
    this.clockModelID_ = (GanssAdditionalDataChoices.clockModelIDType) value;
  }
  public GanssAdditionalDataChoices.clockModelIDType setClockModelIDToNewInstance() {
    clockModelID_ = new GanssAdditionalDataChoices.clockModelIDType();
    return clockModelID_;
  }
  
  private GanssAdditionalDataChoices.utcModelIDType utcModelID_;
  public GanssAdditionalDataChoices.utcModelIDType getUtcModelID() {
    return utcModelID_;
  }
  /**
   * @throws ClassCastException if value is not a GanssAdditionalDataChoices.utcModelIDType
   */
  public void setUtcModelID(Asn1Object value) {
    this.utcModelID_ = (GanssAdditionalDataChoices.utcModelIDType) value;
  }
  public GanssAdditionalDataChoices.utcModelIDType setUtcModelIDToNewInstance() {
    utcModelID_ = new GanssAdditionalDataChoices.utcModelIDType();
    return utcModelID_;
  }
  
  private GanssAdditionalDataChoices.almanacModelIDType almanacModelID_;
  public GanssAdditionalDataChoices.almanacModelIDType getAlmanacModelID() {
    return almanacModelID_;
  }
  /**
   * @throws ClassCastException if value is not a GanssAdditionalDataChoices.almanacModelIDType
   */
  public void setAlmanacModelID(Asn1Object value) {
    this.almanacModelID_ = (GanssAdditionalDataChoices.almanacModelIDType) value;
  }
  public GanssAdditionalDataChoices.almanacModelIDType setAlmanacModelIDToNewInstance() {
    almanacModelID_ = new GanssAdditionalDataChoices.almanacModelIDType();
    return almanacModelID_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getOrbitModelID() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getOrbitModelID();
          }

          @Override public void setToNewInstance() {
            setOrbitModelIDToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GanssAdditionalDataChoices.orbitModelIDType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "orbitModelID : "
                    + getOrbitModelID().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getClockModelID() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getClockModelID();
          }

          @Override public void setToNewInstance() {
            setClockModelIDToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GanssAdditionalDataChoices.clockModelIDType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "clockModelID : "
                    + getClockModelID().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getUtcModelID() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getUtcModelID();
          }

          @Override public void setToNewInstance() {
            setUtcModelIDToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GanssAdditionalDataChoices.utcModelIDType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "utcModelID : "
                    + getUtcModelID().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getAlmanacModelID() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getAlmanacModelID();
          }

          @Override public void setToNewInstance() {
            setAlmanacModelIDToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GanssAdditionalDataChoices.almanacModelIDType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "almanacModelID : "
                    + getAlmanacModelID().toIndentedString(indent);
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
public static class orbitModelIDType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_orbitModelIDType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public orbitModelIDType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("7"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_orbitModelIDType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_orbitModelIDType != null) {
      return ImmutableList.of(TAG_orbitModelIDType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new orbitModelIDType from encoded stream.
   */
  public static orbitModelIDType fromPerUnaligned(byte[] encodedBytes) {
    orbitModelIDType result = new orbitModelIDType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new orbitModelIDType from encoded stream.
   */
  public static orbitModelIDType fromPerAligned(byte[] encodedBytes) {
    orbitModelIDType result = new orbitModelIDType();
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
    return "orbitModelIDType = " + getInteger() + ";\n";
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
public static class clockModelIDType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_clockModelIDType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public clockModelIDType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("7"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_clockModelIDType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_clockModelIDType != null) {
      return ImmutableList.of(TAG_clockModelIDType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new clockModelIDType from encoded stream.
   */
  public static clockModelIDType fromPerUnaligned(byte[] encodedBytes) {
    clockModelIDType result = new clockModelIDType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new clockModelIDType from encoded stream.
   */
  public static clockModelIDType fromPerAligned(byte[] encodedBytes) {
    clockModelIDType result = new clockModelIDType();
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
    return "clockModelIDType = " + getInteger() + ";\n";
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
public static class utcModelIDType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_utcModelIDType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public utcModelIDType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("7"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_utcModelIDType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_utcModelIDType != null) {
      return ImmutableList.of(TAG_utcModelIDType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new utcModelIDType from encoded stream.
   */
  public static utcModelIDType fromPerUnaligned(byte[] encodedBytes) {
    utcModelIDType result = new utcModelIDType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new utcModelIDType from encoded stream.
   */
  public static utcModelIDType fromPerAligned(byte[] encodedBytes) {
    utcModelIDType result = new utcModelIDType();
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
    return "utcModelIDType = " + getInteger() + ";\n";
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
public static class almanacModelIDType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_almanacModelIDType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public almanacModelIDType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("7"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_almanacModelIDType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_almanacModelIDType != null) {
      return ImmutableList.of(TAG_almanacModelIDType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new almanacModelIDType from encoded stream.
   */
  public static almanacModelIDType fromPerUnaligned(byte[] encodedBytes) {
    almanacModelIDType result = new almanacModelIDType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new almanacModelIDType from encoded stream.
   */
  public static almanacModelIDType fromPerAligned(byte[] encodedBytes) {
    almanacModelIDType result = new almanacModelIDType();
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
    return "almanacModelIDType = " + getInteger() + ";\n";
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
    builder.append("GanssAdditionalDataChoices = {\n");
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
