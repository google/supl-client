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
public  class GANSSTimeModelElement extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GANSSTimeModelElement
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GANSSTimeModelElement() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GANSSTimeModelElement;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GANSSTimeModelElement != null) {
      return ImmutableList.of(TAG_GANSSTimeModelElement);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GANSSTimeModelElement from encoded stream.
   */
  public static GANSSTimeModelElement fromPerUnaligned(byte[] encodedBytes) {
    GANSSTimeModelElement result = new GANSSTimeModelElement();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GANSSTimeModelElement from encoded stream.
   */
  public static GANSSTimeModelElement fromPerAligned(byte[] encodedBytes) {
    GANSSTimeModelElement result = new GANSSTimeModelElement();
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

  
  private GANSSTimeModelElement.ganssTimeModelRefTimeType ganssTimeModelRefTime_;
  public GANSSTimeModelElement.ganssTimeModelRefTimeType getGanssTimeModelRefTime() {
    return ganssTimeModelRefTime_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSTimeModelElement.ganssTimeModelRefTimeType
   */
  public void setGanssTimeModelRefTime(Asn1Object value) {
    this.ganssTimeModelRefTime_ = (GANSSTimeModelElement.ganssTimeModelRefTimeType) value;
  }
  public GANSSTimeModelElement.ganssTimeModelRefTimeType setGanssTimeModelRefTimeToNewInstance() {
    ganssTimeModelRefTime_ = new GANSSTimeModelElement.ganssTimeModelRefTimeType();
    return ganssTimeModelRefTime_;
  }
  
  private TA0 tA0_;
  public TA0 getTA0() {
    return tA0_;
  }
  /**
   * @throws ClassCastException if value is not a TA0
   */
  public void setTA0(Asn1Object value) {
    this.tA0_ = (TA0) value;
  }
  public TA0 setTA0ToNewInstance() {
    tA0_ = new TA0();
    return tA0_;
  }
  
  private TA1 tA1_;
  public TA1 getTA1() {
    return tA1_;
  }
  /**
   * @throws ClassCastException if value is not a TA1
   */
  public void setTA1(Asn1Object value) {
    this.tA1_ = (TA1) value;
  }
  public TA1 setTA1ToNewInstance() {
    tA1_ = new TA1();
    return tA1_;
  }
  
  private TA2 tA2_;
  public TA2 getTA2() {
    return tA2_;
  }
  /**
   * @throws ClassCastException if value is not a TA2
   */
  public void setTA2(Asn1Object value) {
    this.tA2_ = (TA2) value;
  }
  public TA2 setTA2ToNewInstance() {
    tA2_ = new TA2();
    return tA2_;
  }
  
  private GANSSTimeModelElement.gnssTOIDType gnssTOID_;
  public GANSSTimeModelElement.gnssTOIDType getGnssTOID() {
    return gnssTOID_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSTimeModelElement.gnssTOIDType
   */
  public void setGnssTOID(Asn1Object value) {
    this.gnssTOID_ = (GANSSTimeModelElement.gnssTOIDType) value;
  }
  public GANSSTimeModelElement.gnssTOIDType setGnssTOIDToNewInstance() {
    gnssTOID_ = new GANSSTimeModelElement.gnssTOIDType();
    return gnssTOID_;
  }
  
  private GANSSTimeModelElement.weekNumberType weekNumber_;
  public GANSSTimeModelElement.weekNumberType getWeekNumber() {
    return weekNumber_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSTimeModelElement.weekNumberType
   */
  public void setWeekNumber(Asn1Object value) {
    this.weekNumber_ = (GANSSTimeModelElement.weekNumberType) value;
  }
  public GANSSTimeModelElement.weekNumberType setWeekNumberToNewInstance() {
    weekNumber_ = new GANSSTimeModelElement.weekNumberType();
    return weekNumber_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getGanssTimeModelRefTime() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssTimeModelRefTime();
          }

          @Override public void setToNewInstance() {
            setGanssTimeModelRefTimeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSTimeModelElement.ganssTimeModelRefTimeType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssTimeModelRefTime : "
                    + getGanssTimeModelRefTime().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getTA0() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getTA0();
          }

          @Override public void setToNewInstance() {
            setTA0ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? TA0.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "tA0 : "
                    + getTA0().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getTA1() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getTA1();
          }

          @Override public void setToNewInstance() {
            setTA1ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? TA1.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "tA1 : "
                    + getTA1().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getTA2() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getTA2();
          }

          @Override public void setToNewInstance() {
            setTA2ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? TA2.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "tA2 : "
                    + getTA2().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getGnssTOID() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnssTOID();
          }

          @Override public void setToNewInstance() {
            setGnssTOIDToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSTimeModelElement.gnssTOIDType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnssTOID : "
                    + getGnssTOID().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

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
            return tag == null ? GANSSTimeModelElement.weekNumberType.getPossibleFirstTags() : ImmutableList.of(tag);
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
public static class ganssTimeModelRefTimeType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ganssTimeModelRefTimeType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ganssTimeModelRefTimeType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("65535"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ganssTimeModelRefTimeType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ganssTimeModelRefTimeType != null) {
      return ImmutableList.of(TAG_ganssTimeModelRefTimeType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ganssTimeModelRefTimeType from encoded stream.
   */
  public static ganssTimeModelRefTimeType fromPerUnaligned(byte[] encodedBytes) {
    ganssTimeModelRefTimeType result = new ganssTimeModelRefTimeType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ganssTimeModelRefTimeType from encoded stream.
   */
  public static ganssTimeModelRefTimeType fromPerAligned(byte[] encodedBytes) {
    ganssTimeModelRefTimeType result = new ganssTimeModelRefTimeType();
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
    return "ganssTimeModelRefTimeType = " + getInteger() + ";\n";
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
public static class gnssTOIDType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_gnssTOIDType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gnssTOIDType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("7"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gnssTOIDType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gnssTOIDType != null) {
      return ImmutableList.of(TAG_gnssTOIDType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gnssTOIDType from encoded stream.
   */
  public static gnssTOIDType fromPerUnaligned(byte[] encodedBytes) {
    gnssTOIDType result = new gnssTOIDType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gnssTOIDType from encoded stream.
   */
  public static gnssTOIDType fromPerAligned(byte[] encodedBytes) {
    gnssTOIDType result = new gnssTOIDType();
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
    return "gnssTOIDType = " + getInteger() + ";\n";
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
public static class weekNumberType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_weekNumberType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public weekNumberType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("8191"));

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
    builder.append("GANSSTimeModelElement = {\n");
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
