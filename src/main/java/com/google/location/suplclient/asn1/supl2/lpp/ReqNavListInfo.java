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
import com.google.location.suplclient.asn1.base.Asn1BitString;
import com.google.location.suplclient.asn1.base.Asn1Boolean;
import com.google.location.suplclient.asn1.base.Asn1Integer;
import com.google.location.suplclient.asn1.base.Asn1Object;
import com.google.location.suplclient.asn1.base.Asn1Sequence;
import com.google.location.suplclient.asn1.base.Asn1SequenceOf;
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
public  class ReqNavListInfo extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_ReqNavListInfo
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ReqNavListInfo() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ReqNavListInfo;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ReqNavListInfo != null) {
      return ImmutableList.of(TAG_ReqNavListInfo);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ReqNavListInfo from encoded stream.
   */
  public static ReqNavListInfo fromPerUnaligned(byte[] encodedBytes) {
    ReqNavListInfo result = new ReqNavListInfo();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ReqNavListInfo from encoded stream.
   */
  public static ReqNavListInfo fromPerAligned(byte[] encodedBytes) {
    ReqNavListInfo result = new ReqNavListInfo();
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

  
  private ReqNavListInfo.svReqListType svReqList_;
  public ReqNavListInfo.svReqListType getSvReqList() {
    return svReqList_;
  }
  /**
   * @throws ClassCastException if value is not a ReqNavListInfo.svReqListType
   */
  public void setSvReqList(Asn1Object value) {
    this.svReqList_ = (ReqNavListInfo.svReqListType) value;
  }
  public ReqNavListInfo.svReqListType setSvReqListToNewInstance() {
    svReqList_ = new ReqNavListInfo.svReqListType();
    return svReqList_;
  }
  
  private ReqNavListInfo.clockModelID_PrefListType clockModelID_PrefList_;
  public ReqNavListInfo.clockModelID_PrefListType getClockModelID_PrefList() {
    return clockModelID_PrefList_;
  }
  /**
   * @throws ClassCastException if value is not a ReqNavListInfo.clockModelID_PrefListType
   */
  public void setClockModelID_PrefList(Asn1Object value) {
    this.clockModelID_PrefList_ = (ReqNavListInfo.clockModelID_PrefListType) value;
  }
  public ReqNavListInfo.clockModelID_PrefListType setClockModelID_PrefListToNewInstance() {
    clockModelID_PrefList_ = new ReqNavListInfo.clockModelID_PrefListType();
    return clockModelID_PrefList_;
  }
  
  private ReqNavListInfo.orbitModelID_PrefListType orbitModelID_PrefList_;
  public ReqNavListInfo.orbitModelID_PrefListType getOrbitModelID_PrefList() {
    return orbitModelID_PrefList_;
  }
  /**
   * @throws ClassCastException if value is not a ReqNavListInfo.orbitModelID_PrefListType
   */
  public void setOrbitModelID_PrefList(Asn1Object value) {
    this.orbitModelID_PrefList_ = (ReqNavListInfo.orbitModelID_PrefListType) value;
  }
  public ReqNavListInfo.orbitModelID_PrefListType setOrbitModelID_PrefListToNewInstance() {
    orbitModelID_PrefList_ = new ReqNavListInfo.orbitModelID_PrefListType();
    return orbitModelID_PrefList_;
  }
  
  private ReqNavListInfo.addNavparamReqType addNavparamReq_;
  public ReqNavListInfo.addNavparamReqType getAddNavparamReq() {
    return addNavparamReq_;
  }
  /**
   * @throws ClassCastException if value is not a ReqNavListInfo.addNavparamReqType
   */
  public void setAddNavparamReq(Asn1Object value) {
    this.addNavparamReq_ = (ReqNavListInfo.addNavparamReqType) value;
  }
  public ReqNavListInfo.addNavparamReqType setAddNavparamReqToNewInstance() {
    addNavparamReq_ = new ReqNavListInfo.addNavparamReqType();
    return addNavparamReq_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getSvReqList() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getSvReqList();
          }

          @Override public void setToNewInstance() {
            setSvReqListToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ReqNavListInfo.svReqListType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "svReqList : "
                    + getSvReqList().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getClockModelID_PrefList() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getClockModelID_PrefList();
          }

          @Override public void setToNewInstance() {
            setClockModelID_PrefListToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ReqNavListInfo.clockModelID_PrefListType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "clockModelID_PrefList : "
                    + getClockModelID_PrefList().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getOrbitModelID_PrefList() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getOrbitModelID_PrefList();
          }

          @Override public void setToNewInstance() {
            setOrbitModelID_PrefListToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ReqNavListInfo.orbitModelID_PrefListType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "orbitModelID_PrefList : "
                    + getOrbitModelID_PrefList().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getAddNavparamReq() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getAddNavparamReq();
          }

          @Override public void setToNewInstance() {
            setAddNavparamReqToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ReqNavListInfo.addNavparamReqType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "addNavparamReq : "
                    + getAddNavparamReq().toIndentedString(indent);
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
public static class svReqListType extends Asn1BitString {
  //

  // defined bit positions, if any
  

  // setters
  

  // clearers
  


  private static final Asn1Tag TAG_svReqListType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public svReqListType() {
    super();
    setMinSize(64);
setMaxSize(64);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_svReqListType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_svReqListType != null) {
      return ImmutableList.of(TAG_svReqListType);
    } else {
      return Asn1BitString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new svReqListType from encoded stream.
   */
  public static svReqListType fromPerUnaligned(byte[] encodedBytes) {
    svReqListType result = new svReqListType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new svReqListType from encoded stream.
   */
  public static svReqListType fromPerAligned(byte[] encodedBytes) {
    svReqListType result = new svReqListType();
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
    return "svReqListType = " + getValue() + ";\n";
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
public static class clockModelID_PrefListType
    extends Asn1SequenceOf<clockModelID_PrefListType.clockModelID_PrefListTypeComponentType> {
  //

  private static final Asn1Tag TAG_clockModelID_PrefListType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public clockModelID_PrefListType() {
    super();
    setMinSize(1);
setMaxSize(8);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_clockModelID_PrefListType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_clockModelID_PrefListType != null) {
      return ImmutableList.of(TAG_clockModelID_PrefListType);
    } else {
      return Asn1SequenceOf.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new clockModelID_PrefListType from encoded stream.
   */
  public static clockModelID_PrefListType fromPerUnaligned(byte[] encodedBytes) {
    clockModelID_PrefListType result = new clockModelID_PrefListType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new clockModelID_PrefListType from encoded stream.
   */
  public static clockModelID_PrefListType fromPerAligned(byte[] encodedBytes) {
    clockModelID_PrefListType result = new clockModelID_PrefListType();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  
  @Override public clockModelID_PrefListType.clockModelID_PrefListTypeComponentType createAndAddValue() {
    clockModelID_PrefListType.clockModelID_PrefListTypeComponentType value = new clockModelID_PrefListType.clockModelID_PrefListTypeComponentType();
    add(value);
    return value;
  }

 // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class clockModelID_PrefListTypeComponentType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_clockModelID_PrefListTypeComponentType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public clockModelID_PrefListTypeComponentType() {
    super();
    setValueRange(new java.math.BigInteger("1"), new java.math.BigInteger("8"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_clockModelID_PrefListTypeComponentType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_clockModelID_PrefListTypeComponentType != null) {
      return ImmutableList.of(TAG_clockModelID_PrefListTypeComponentType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new clockModelID_PrefListTypeComponentType from encoded stream.
   */
  public static clockModelID_PrefListTypeComponentType fromPerUnaligned(byte[] encodedBytes) {
    clockModelID_PrefListTypeComponentType result = new clockModelID_PrefListTypeComponentType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new clockModelID_PrefListTypeComponentType from encoded stream.
   */
  public static clockModelID_PrefListTypeComponentType fromPerAligned(byte[] encodedBytes) {
    clockModelID_PrefListTypeComponentType result = new clockModelID_PrefListTypeComponentType();
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
    return "clockModelID_PrefListTypeComponentType = " + getInteger() + ";\n";
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
    builder.append("clockModelID_PrefListType = [\n");
    final String internalIndent = indent + "  ";
    for (clockModelID_PrefListType.clockModelID_PrefListTypeComponentType value : getValues()) {
      builder.append(internalIndent)
          .append(value.toIndentedString(internalIndent));
    }
    builder.append(indent).append("];\n");
    return builder.toString();
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
public static class orbitModelID_PrefListType
    extends Asn1SequenceOf<orbitModelID_PrefListType.orbitModelID_PrefListTypeComponentType> {
  //

  private static final Asn1Tag TAG_orbitModelID_PrefListType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public orbitModelID_PrefListType() {
    super();
    setMinSize(1);
setMaxSize(8);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_orbitModelID_PrefListType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_orbitModelID_PrefListType != null) {
      return ImmutableList.of(TAG_orbitModelID_PrefListType);
    } else {
      return Asn1SequenceOf.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new orbitModelID_PrefListType from encoded stream.
   */
  public static orbitModelID_PrefListType fromPerUnaligned(byte[] encodedBytes) {
    orbitModelID_PrefListType result = new orbitModelID_PrefListType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new orbitModelID_PrefListType from encoded stream.
   */
  public static orbitModelID_PrefListType fromPerAligned(byte[] encodedBytes) {
    orbitModelID_PrefListType result = new orbitModelID_PrefListType();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  
  @Override public orbitModelID_PrefListType.orbitModelID_PrefListTypeComponentType createAndAddValue() {
    orbitModelID_PrefListType.orbitModelID_PrefListTypeComponentType value = new orbitModelID_PrefListType.orbitModelID_PrefListTypeComponentType();
    add(value);
    return value;
  }

 // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class orbitModelID_PrefListTypeComponentType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_orbitModelID_PrefListTypeComponentType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public orbitModelID_PrefListTypeComponentType() {
    super();
    setValueRange(new java.math.BigInteger("1"), new java.math.BigInteger("8"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_orbitModelID_PrefListTypeComponentType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_orbitModelID_PrefListTypeComponentType != null) {
      return ImmutableList.of(TAG_orbitModelID_PrefListTypeComponentType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new orbitModelID_PrefListTypeComponentType from encoded stream.
   */
  public static orbitModelID_PrefListTypeComponentType fromPerUnaligned(byte[] encodedBytes) {
    orbitModelID_PrefListTypeComponentType result = new orbitModelID_PrefListTypeComponentType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new orbitModelID_PrefListTypeComponentType from encoded stream.
   */
  public static orbitModelID_PrefListTypeComponentType fromPerAligned(byte[] encodedBytes) {
    orbitModelID_PrefListTypeComponentType result = new orbitModelID_PrefListTypeComponentType();
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
    return "orbitModelID_PrefListTypeComponentType = " + getInteger() + ";\n";
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
    builder.append("orbitModelID_PrefListType = [\n");
    final String internalIndent = indent + "  ";
    for (orbitModelID_PrefListType.orbitModelID_PrefListTypeComponentType value : getValues()) {
      builder.append(internalIndent)
          .append(value.toIndentedString(internalIndent));
    }
    builder.append(indent).append("];\n");
    return builder.toString();
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
public static class addNavparamReqType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_addNavparamReqType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public addNavparamReqType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_addNavparamReqType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_addNavparamReqType != null) {
      return ImmutableList.of(TAG_addNavparamReqType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new addNavparamReqType from encoded stream.
   */
  public static addNavparamReqType fromPerUnaligned(byte[] encodedBytes) {
    addNavparamReqType result = new addNavparamReqType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new addNavparamReqType from encoded stream.
   */
  public static addNavparamReqType fromPerAligned(byte[] encodedBytes) {
    addNavparamReqType result = new addNavparamReqType();
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
    return "addNavparamReqType = " + getValue() + ";\n";
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
    builder.append("ReqNavListInfo = {\n");
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
