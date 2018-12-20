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

package com.google.location.suplclient.asn1.supl2.supl_triggered_start;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.google.location.suplclient.asn1.base.Asn1BitString;
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
public  class LTEAreaId extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_LTEAreaId
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public LTEAreaId() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_LTEAreaId;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_LTEAreaId != null) {
      return ImmutableList.of(TAG_LTEAreaId);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new LTEAreaId from encoded stream.
   */
  public static LTEAreaId fromPerUnaligned(byte[] encodedBytes) {
    LTEAreaId result = new LTEAreaId();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new LTEAreaId from encoded stream.
   */
  public static LTEAreaId fromPerAligned(byte[] encodedBytes) {
    LTEAreaId result = new LTEAreaId();
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

  
  private LTEAreaId.refMCCType refMCC_;
  public LTEAreaId.refMCCType getRefMCC() {
    return refMCC_;
  }
  /**
   * @throws ClassCastException if value is not a LTEAreaId.refMCCType
   */
  public void setRefMCC(Asn1Object value) {
    this.refMCC_ = (LTEAreaId.refMCCType) value;
  }
  public LTEAreaId.refMCCType setRefMCCToNewInstance() {
    refMCC_ = new LTEAreaId.refMCCType();
    return refMCC_;
  }
  
  private LTEAreaId.refMNCType refMNC_;
  public LTEAreaId.refMNCType getRefMNC() {
    return refMNC_;
  }
  /**
   * @throws ClassCastException if value is not a LTEAreaId.refMNCType
   */
  public void setRefMNC(Asn1Object value) {
    this.refMNC_ = (LTEAreaId.refMNCType) value;
  }
  public LTEAreaId.refMNCType setRefMNCToNewInstance() {
    refMNC_ = new LTEAreaId.refMNCType();
    return refMNC_;
  }
  
  private LTEAreaId.refCIType refCI_;
  public LTEAreaId.refCIType getRefCI() {
    return refCI_;
  }
  /**
   * @throws ClassCastException if value is not a LTEAreaId.refCIType
   */
  public void setRefCI(Asn1Object value) {
    this.refCI_ = (LTEAreaId.refCIType) value;
  }
  public LTEAreaId.refCIType setRefCIToNewInstance() {
    refCI_ = new LTEAreaId.refCIType();
    return refCI_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getRefMCC() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getRefMCC();
          }

          @Override public void setToNewInstance() {
            setRefMCCToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? LTEAreaId.refMCCType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "refMCC : "
                    + getRefMCC().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getRefMNC() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getRefMNC();
          }

          @Override public void setToNewInstance() {
            setRefMNCToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? LTEAreaId.refMNCType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "refMNC : "
                    + getRefMNC().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getRefCI() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getRefCI();
          }

          @Override public void setToNewInstance() {
            setRefCIToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? LTEAreaId.refCIType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "refCI : "
                    + getRefCI().toIndentedString(indent);
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
public static class refMCCType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_refMCCType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public refMCCType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("999"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_refMCCType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_refMCCType != null) {
      return ImmutableList.of(TAG_refMCCType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new refMCCType from encoded stream.
   */
  public static refMCCType fromPerUnaligned(byte[] encodedBytes) {
    refMCCType result = new refMCCType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new refMCCType from encoded stream.
   */
  public static refMCCType fromPerAligned(byte[] encodedBytes) {
    refMCCType result = new refMCCType();
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
    return "refMCCType = " + getInteger() + ";\n";
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
public static class refMNCType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_refMNCType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public refMNCType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("999"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_refMNCType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_refMNCType != null) {
      return ImmutableList.of(TAG_refMNCType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new refMNCType from encoded stream.
   */
  public static refMNCType fromPerUnaligned(byte[] encodedBytes) {
    refMNCType result = new refMNCType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new refMNCType from encoded stream.
   */
  public static refMNCType fromPerAligned(byte[] encodedBytes) {
    refMNCType result = new refMNCType();
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
    return "refMNCType = " + getInteger() + ";\n";
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
public static class refCIType extends Asn1BitString {
  //

  // defined bit positions, if any
  

  // setters
  

  // clearers
  


  private static final Asn1Tag TAG_refCIType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public refCIType() {
    super();
    setMinSize(29);
setMaxSize(29);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_refCIType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_refCIType != null) {
      return ImmutableList.of(TAG_refCIType);
    } else {
      return Asn1BitString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new refCIType from encoded stream.
   */
  public static refCIType fromPerUnaligned(byte[] encodedBytes) {
    refCIType result = new refCIType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new refCIType from encoded stream.
   */
  public static refCIType fromPerAligned(byte[] encodedBytes) {
    refCIType result = new refCIType();
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
    return "refCIType = " + getValue() + ";\n";
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
    builder.append("LTEAreaId = {\n");
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
