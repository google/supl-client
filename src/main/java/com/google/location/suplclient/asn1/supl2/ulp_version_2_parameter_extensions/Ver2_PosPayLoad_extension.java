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
import com.google.location.suplclient.asn1.base.Asn1Object;
import com.google.location.suplclient.asn1.base.Asn1OctetString;
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
public  class Ver2_PosPayLoad_extension extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_Ver2_PosPayLoad_extension
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public Ver2_PosPayLoad_extension() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_Ver2_PosPayLoad_extension;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_Ver2_PosPayLoad_extension != null) {
      return ImmutableList.of(TAG_Ver2_PosPayLoad_extension);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new Ver2_PosPayLoad_extension from encoded stream.
   */
  public static Ver2_PosPayLoad_extension fromPerUnaligned(byte[] encodedBytes) {
    Ver2_PosPayLoad_extension result = new Ver2_PosPayLoad_extension();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new Ver2_PosPayLoad_extension from encoded stream.
   */
  public static Ver2_PosPayLoad_extension fromPerAligned(byte[] encodedBytes) {
    Ver2_PosPayLoad_extension result = new Ver2_PosPayLoad_extension();
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

  
  private Ver2_PosPayLoad_extension.lPPPayloadType lPPPayload_;
  public Ver2_PosPayLoad_extension.lPPPayloadType getLPPPayload() {
    return lPPPayload_;
  }
  /**
   * @throws ClassCastException if value is not a Ver2_PosPayLoad_extension.lPPPayloadType
   */
  public void setLPPPayload(Asn1Object value) {
    this.lPPPayload_ = (Ver2_PosPayLoad_extension.lPPPayloadType) value;
  }
  public Ver2_PosPayLoad_extension.lPPPayloadType setLPPPayloadToNewInstance() {
    lPPPayload_ = new Ver2_PosPayLoad_extension.lPPPayloadType();
    return lPPPayload_;
  }
  
  private Ver2_PosPayLoad_extension.tIA801PayloadType tIA801Payload_;
  public Ver2_PosPayLoad_extension.tIA801PayloadType getTIA801Payload() {
    return tIA801Payload_;
  }
  /**
   * @throws ClassCastException if value is not a Ver2_PosPayLoad_extension.tIA801PayloadType
   */
  public void setTIA801Payload(Asn1Object value) {
    this.tIA801Payload_ = (Ver2_PosPayLoad_extension.tIA801PayloadType) value;
  }
  public Ver2_PosPayLoad_extension.tIA801PayloadType setTIA801PayloadToNewInstance() {
    tIA801Payload_ = new Ver2_PosPayLoad_extension.tIA801PayloadType();
    return tIA801Payload_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getLPPPayload() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getLPPPayload();
          }

          @Override public void setToNewInstance() {
            setLPPPayloadToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Ver2_PosPayLoad_extension.lPPPayloadType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "lPPPayload : "
                    + getLPPPayload().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getTIA801Payload() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getTIA801Payload();
          }

          @Override public void setToNewInstance() {
            setTIA801PayloadToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Ver2_PosPayLoad_extension.tIA801PayloadType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "tIA801Payload : "
                    + getTIA801Payload().toIndentedString(indent);
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
public static class lPPPayloadType
    extends Asn1SequenceOf<lPPPayloadType.lPPPayloadTypeComponentType> {
  //

  private static final Asn1Tag TAG_lPPPayloadType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public lPPPayloadType() {
    super();
    setMinSize(1);
setMaxSize(3);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_lPPPayloadType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_lPPPayloadType != null) {
      return ImmutableList.of(TAG_lPPPayloadType);
    } else {
      return Asn1SequenceOf.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new lPPPayloadType from encoded stream.
   */
  public static lPPPayloadType fromPerUnaligned(byte[] encodedBytes) {
    lPPPayloadType result = new lPPPayloadType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new lPPPayloadType from encoded stream.
   */
  public static lPPPayloadType fromPerAligned(byte[] encodedBytes) {
    lPPPayloadType result = new lPPPayloadType();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  
  @Override public lPPPayloadType.lPPPayloadTypeComponentType createAndAddValue() {
    lPPPayloadType.lPPPayloadTypeComponentType value = new lPPPayloadType.lPPPayloadTypeComponentType();
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
public static class lPPPayloadTypeComponentType extends Asn1OctetString {
  //

  private static final Asn1Tag TAG_lPPPayloadTypeComponentType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public lPPPayloadTypeComponentType() {
    super();
    setMinSize(1);
setMaxSize(60000);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_lPPPayloadTypeComponentType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_lPPPayloadTypeComponentType != null) {
      return ImmutableList.of(TAG_lPPPayloadTypeComponentType);
    } else {
      return Asn1OctetString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new lPPPayloadTypeComponentType from encoded stream.
   */
  public static lPPPayloadTypeComponentType fromPerUnaligned(byte[] encodedBytes) {
    lPPPayloadTypeComponentType result = new lPPPayloadTypeComponentType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new lPPPayloadTypeComponentType from encoded stream.
   */
  public static lPPPayloadTypeComponentType fromPerAligned(byte[] encodedBytes) {
    lPPPayloadTypeComponentType result = new lPPPayloadTypeComponentType();
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

  @Override protected String getTypeName() {
    return "lPPPayloadTypeComponentType";
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
    builder.append("lPPPayloadType = [\n");
    final String internalIndent = indent + "  ";
    for (lPPPayloadType.lPPPayloadTypeComponentType value : getValues()) {
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
public static class tIA801PayloadType
    extends Asn1SequenceOf<tIA801PayloadType.tIA801PayloadTypeComponentType> {
  //

  private static final Asn1Tag TAG_tIA801PayloadType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public tIA801PayloadType() {
    super();
    setMinSize(1);
setMaxSize(3);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_tIA801PayloadType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_tIA801PayloadType != null) {
      return ImmutableList.of(TAG_tIA801PayloadType);
    } else {
      return Asn1SequenceOf.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new tIA801PayloadType from encoded stream.
   */
  public static tIA801PayloadType fromPerUnaligned(byte[] encodedBytes) {
    tIA801PayloadType result = new tIA801PayloadType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new tIA801PayloadType from encoded stream.
   */
  public static tIA801PayloadType fromPerAligned(byte[] encodedBytes) {
    tIA801PayloadType result = new tIA801PayloadType();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  
  @Override public tIA801PayloadType.tIA801PayloadTypeComponentType createAndAddValue() {
    tIA801PayloadType.tIA801PayloadTypeComponentType value = new tIA801PayloadType.tIA801PayloadTypeComponentType();
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
public static class tIA801PayloadTypeComponentType extends Asn1OctetString {
  //

  private static final Asn1Tag TAG_tIA801PayloadTypeComponentType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public tIA801PayloadTypeComponentType() {
    super();
    setMinSize(1);
setMaxSize(60000);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_tIA801PayloadTypeComponentType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_tIA801PayloadTypeComponentType != null) {
      return ImmutableList.of(TAG_tIA801PayloadTypeComponentType);
    } else {
      return Asn1OctetString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new tIA801PayloadTypeComponentType from encoded stream.
   */
  public static tIA801PayloadTypeComponentType fromPerUnaligned(byte[] encodedBytes) {
    tIA801PayloadTypeComponentType result = new tIA801PayloadTypeComponentType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new tIA801PayloadTypeComponentType from encoded stream.
   */
  public static tIA801PayloadTypeComponentType fromPerAligned(byte[] encodedBytes) {
    tIA801PayloadTypeComponentType result = new tIA801PayloadTypeComponentType();
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

  @Override protected String getTypeName() {
    return "tIA801PayloadTypeComponentType";
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
    builder.append("tIA801PayloadType = [\n");
    final String internalIndent = indent + "  ";
    for (tIA801PayloadType.tIA801PayloadTypeComponentType value : getValues()) {
      builder.append(internalIndent)
          .append(value.toIndentedString(internalIndent));
    }
    builder.append(indent).append("];\n");
    return builder.toString();
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
    builder.append("Ver2_PosPayLoad_extension = {\n");
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
