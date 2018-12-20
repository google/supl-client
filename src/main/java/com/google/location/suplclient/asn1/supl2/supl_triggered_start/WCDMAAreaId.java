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
public  class WCDMAAreaId extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_WCDMAAreaId
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public WCDMAAreaId() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_WCDMAAreaId;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_WCDMAAreaId != null) {
      return ImmutableList.of(TAG_WCDMAAreaId);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new WCDMAAreaId from encoded stream.
   */
  public static WCDMAAreaId fromPerUnaligned(byte[] encodedBytes) {
    WCDMAAreaId result = new WCDMAAreaId();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new WCDMAAreaId from encoded stream.
   */
  public static WCDMAAreaId fromPerAligned(byte[] encodedBytes) {
    WCDMAAreaId result = new WCDMAAreaId();
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

  
  private WCDMAAreaId.refMCCType refMCC_;
  public WCDMAAreaId.refMCCType getRefMCC() {
    return refMCC_;
  }
  /**
   * @throws ClassCastException if value is not a WCDMAAreaId.refMCCType
   */
  public void setRefMCC(Asn1Object value) {
    this.refMCC_ = (WCDMAAreaId.refMCCType) value;
  }
  public WCDMAAreaId.refMCCType setRefMCCToNewInstance() {
    refMCC_ = new WCDMAAreaId.refMCCType();
    return refMCC_;
  }
  
  private WCDMAAreaId.refMNCType refMNC_;
  public WCDMAAreaId.refMNCType getRefMNC() {
    return refMNC_;
  }
  /**
   * @throws ClassCastException if value is not a WCDMAAreaId.refMNCType
   */
  public void setRefMNC(Asn1Object value) {
    this.refMNC_ = (WCDMAAreaId.refMNCType) value;
  }
  public WCDMAAreaId.refMNCType setRefMNCToNewInstance() {
    refMNC_ = new WCDMAAreaId.refMNCType();
    return refMNC_;
  }
  
  private WCDMAAreaId.refLACType refLAC_;
  public WCDMAAreaId.refLACType getRefLAC() {
    return refLAC_;
  }
  /**
   * @throws ClassCastException if value is not a WCDMAAreaId.refLACType
   */
  public void setRefLAC(Asn1Object value) {
    this.refLAC_ = (WCDMAAreaId.refLACType) value;
  }
  public WCDMAAreaId.refLACType setRefLACToNewInstance() {
    refLAC_ = new WCDMAAreaId.refLACType();
    return refLAC_;
  }
  
  private WCDMAAreaId.refUCType refUC_;
  public WCDMAAreaId.refUCType getRefUC() {
    return refUC_;
  }
  /**
   * @throws ClassCastException if value is not a WCDMAAreaId.refUCType
   */
  public void setRefUC(Asn1Object value) {
    this.refUC_ = (WCDMAAreaId.refUCType) value;
  }
  public WCDMAAreaId.refUCType setRefUCToNewInstance() {
    refUC_ = new WCDMAAreaId.refUCType();
    return refUC_;
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
            return tag == null ? WCDMAAreaId.refMCCType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? WCDMAAreaId.refMNCType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return getRefLAC() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getRefLAC();
          }

          @Override public void setToNewInstance() {
            setRefLACToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? WCDMAAreaId.refLACType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "refLAC : "
                    + getRefLAC().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getRefUC() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getRefUC();
          }

          @Override public void setToNewInstance() {
            setRefUCToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? WCDMAAreaId.refUCType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "refUC : "
                    + getRefUC().toIndentedString(indent);
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
public static class refLACType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_refLACType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public refLACType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("65535"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_refLACType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_refLACType != null) {
      return ImmutableList.of(TAG_refLACType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new refLACType from encoded stream.
   */
  public static refLACType fromPerUnaligned(byte[] encodedBytes) {
    refLACType result = new refLACType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new refLACType from encoded stream.
   */
  public static refLACType fromPerAligned(byte[] encodedBytes) {
    refLACType result = new refLACType();
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
    return "refLACType = " + getInteger() + ";\n";
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
public static class refUCType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_refUCType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public refUCType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("268435455"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_refUCType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_refUCType != null) {
      return ImmutableList.of(TAG_refUCType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new refUCType from encoded stream.
   */
  public static refUCType fromPerUnaligned(byte[] encodedBytes) {
    refUCType result = new refUCType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new refUCType from encoded stream.
   */
  public static refUCType fromPerAligned(byte[] encodedBytes) {
    refUCType result = new refUCType();
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
    return "refUCType = " + getInteger() + ";\n";
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
    builder.append("WCDMAAreaId = {\n");
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
