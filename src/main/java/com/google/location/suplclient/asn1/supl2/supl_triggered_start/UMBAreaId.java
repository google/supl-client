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
public  class UMBAreaId extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_UMBAreaId
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public UMBAreaId() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_UMBAreaId;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_UMBAreaId != null) {
      return ImmutableList.of(TAG_UMBAreaId);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new UMBAreaId from encoded stream.
   */
  public static UMBAreaId fromPerUnaligned(byte[] encodedBytes) {
    UMBAreaId result = new UMBAreaId();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new UMBAreaId from encoded stream.
   */
  public static UMBAreaId fromPerAligned(byte[] encodedBytes) {
    UMBAreaId result = new UMBAreaId();
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

  
  private UMBAreaId.refMCCType refMCC_;
  public UMBAreaId.refMCCType getRefMCC() {
    return refMCC_;
  }
  /**
   * @throws ClassCastException if value is not a UMBAreaId.refMCCType
   */
  public void setRefMCC(Asn1Object value) {
    this.refMCC_ = (UMBAreaId.refMCCType) value;
  }
  public UMBAreaId.refMCCType setRefMCCToNewInstance() {
    refMCC_ = new UMBAreaId.refMCCType();
    return refMCC_;
  }
  
  private UMBAreaId.refMNCType refMNC_;
  public UMBAreaId.refMNCType getRefMNC() {
    return refMNC_;
  }
  /**
   * @throws ClassCastException if value is not a UMBAreaId.refMNCType
   */
  public void setRefMNC(Asn1Object value) {
    this.refMNC_ = (UMBAreaId.refMNCType) value;
  }
  public UMBAreaId.refMNCType setRefMNCToNewInstance() {
    refMNC_ = new UMBAreaId.refMNCType();
    return refMNC_;
  }
  
  private UMBAreaId.refSECTORIDType refSECTORID_;
  public UMBAreaId.refSECTORIDType getRefSECTORID() {
    return refSECTORID_;
  }
  /**
   * @throws ClassCastException if value is not a UMBAreaId.refSECTORIDType
   */
  public void setRefSECTORID(Asn1Object value) {
    this.refSECTORID_ = (UMBAreaId.refSECTORIDType) value;
  }
  public UMBAreaId.refSECTORIDType setRefSECTORIDToNewInstance() {
    refSECTORID_ = new UMBAreaId.refSECTORIDType();
    return refSECTORID_;
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
            return tag == null ? UMBAreaId.refMCCType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? UMBAreaId.refMNCType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return getRefSECTORID() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getRefSECTORID();
          }

          @Override public void setToNewInstance() {
            setRefSECTORIDToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UMBAreaId.refSECTORIDType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "refSECTORID : "
                    + getRefSECTORID().toIndentedString(indent);
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
public static class refSECTORIDType extends Asn1BitString {
  //

  // defined bit positions, if any
  

  // setters
  

  // clearers
  


  private static final Asn1Tag TAG_refSECTORIDType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public refSECTORIDType() {
    super();
    setMinSize(128);
setMaxSize(128);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_refSECTORIDType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_refSECTORIDType != null) {
      return ImmutableList.of(TAG_refSECTORIDType);
    } else {
      return Asn1BitString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new refSECTORIDType from encoded stream.
   */
  public static refSECTORIDType fromPerUnaligned(byte[] encodedBytes) {
    refSECTORIDType result = new refSECTORIDType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new refSECTORIDType from encoded stream.
   */
  public static refSECTORIDType fromPerAligned(byte[] encodedBytes) {
    refSECTORIDType result = new refSECTORIDType();
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
    return "refSECTORIDType = " + getValue() + ";\n";
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
    builder.append("UMBAreaId = {\n");
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
