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
public  class ResponseTime extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_ResponseTime
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ResponseTime() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ResponseTime;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ResponseTime != null) {
      return ImmutableList.of(TAG_ResponseTime);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ResponseTime from encoded stream.
   */
  public static ResponseTime fromPerUnaligned(byte[] encodedBytes) {
    ResponseTime result = new ResponseTime();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ResponseTime from encoded stream.
   */
  public static ResponseTime fromPerAligned(byte[] encodedBytes) {
    ResponseTime result = new ResponseTime();
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

  
  private ResponseTime.timeType time_;
  public ResponseTime.timeType getTime() {
    return time_;
  }
  /**
   * @throws ClassCastException if value is not a ResponseTime.timeType
   */
  public void setTime(Asn1Object value) {
    this.time_ = (ResponseTime.timeType) value;
  }
  public ResponseTime.timeType setTimeToNewInstance() {
    time_ = new ResponseTime.timeType();
    return time_;
  }
  

  
  private ResponseTime.ext1Type  extensionExt1;
  public ResponseTime.ext1Type getExtensionExt1() {
    return extensionExt1;
  }
  /**
   * @throws ClassCastException if value is not a ResponseTime.ext1Type
   */
  public void setExtensionExt1(Asn1Object value) {
    extensionExt1 = (ResponseTime.ext1Type) value;
  }
  public void setExtensionExt1ToNewInstance() {
    extensionExt1 = new ResponseTime.ext1Type();
  }
    

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getTime() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getTime();
          }

          @Override public void setToNewInstance() {
            setTimeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ResponseTime.timeType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "time : "
                    + getTime().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      builder.add(new SequenceComponent() {
            @Override public boolean isExplicitlySet() {
              return getExtensionExt1() != null;
            }

            @Override public boolean hasDefaultValue() {
              return false;
            }

            @Override public boolean isOptional() {
              return false;
            }

            @Override public Asn1Object getComponentValue() {
              return getExtensionExt1();
            }

            @Override public void setToNewInstance() {
              setExtensionExt1ToNewInstance();
            }

            @Override public Collection<Asn1Tag> getPossibleFirstTags() {
              throw new UnsupportedOperationException(
                  "BER decoding not supported for extension elements");
            }

            @Override
            public Asn1Tag getTag() {
              throw new UnsupportedOperationException(
                  "BER is not supported for extension elements");
            }

            @Override
            public boolean isImplicitTagging() {
              throw new UnsupportedOperationException(
                  "BER is not supported for extension elements");
            }

            @Override public String toIndentedString(String indent) {
              return "ext1 : "
                  + getExtensionExt1().toIndentedString(indent);
            }
      });
      
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
public static class timeType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_timeType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public timeType() {
    super();
    setValueRange(new java.math.BigInteger("1"), new java.math.BigInteger("128"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_timeType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_timeType != null) {
      return ImmutableList.of(TAG_timeType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new timeType from encoded stream.
   */
  public static timeType fromPerUnaligned(byte[] encodedBytes) {
    timeType result = new timeType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new timeType from encoded stream.
   */
  public static timeType fromPerAligned(byte[] encodedBytes) {
    timeType result = new timeType();
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
    return "timeType = " + getInteger() + ";\n";
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
public static class ext1Type extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_ext1Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ext1Type() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ext1Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ext1Type != null) {
      return ImmutableList.of(TAG_ext1Type);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ext1Type from encoded stream.
   */
  public static ext1Type fromPerUnaligned(byte[] encodedBytes) {
    ext1Type result = new ext1Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ext1Type from encoded stream.
   */
  public static ext1Type fromPerAligned(byte[] encodedBytes) {
    ext1Type result = new ext1Type();
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

  
  private ext1Type.responseTimeEarlyFix_r12Type responseTimeEarlyFix_r12_;
  public ext1Type.responseTimeEarlyFix_r12Type getResponseTimeEarlyFix_r12() {
    return responseTimeEarlyFix_r12_;
  }
  /**
   * @throws ClassCastException if value is not a ext1Type.responseTimeEarlyFix_r12Type
   */
  public void setResponseTimeEarlyFix_r12(Asn1Object value) {
    this.responseTimeEarlyFix_r12_ = (ext1Type.responseTimeEarlyFix_r12Type) value;
  }
  public ext1Type.responseTimeEarlyFix_r12Type setResponseTimeEarlyFix_r12ToNewInstance() {
    responseTimeEarlyFix_r12_ = new ext1Type.responseTimeEarlyFix_r12Type();
    return responseTimeEarlyFix_r12_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getResponseTimeEarlyFix_r12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getResponseTimeEarlyFix_r12();
          }

          @Override public void setToNewInstance() {
            setResponseTimeEarlyFix_r12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ext1Type.responseTimeEarlyFix_r12Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "responseTimeEarlyFix_r12 : "
                    + getResponseTimeEarlyFix_r12().toIndentedString(indent);
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
public static class responseTimeEarlyFix_r12Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_responseTimeEarlyFix_r12Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public responseTimeEarlyFix_r12Type() {
    super();
    setValueRange(new java.math.BigInteger("1"), new java.math.BigInteger("128"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_responseTimeEarlyFix_r12Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_responseTimeEarlyFix_r12Type != null) {
      return ImmutableList.of(TAG_responseTimeEarlyFix_r12Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new responseTimeEarlyFix_r12Type from encoded stream.
   */
  public static responseTimeEarlyFix_r12Type fromPerUnaligned(byte[] encodedBytes) {
    responseTimeEarlyFix_r12Type result = new responseTimeEarlyFix_r12Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new responseTimeEarlyFix_r12Type from encoded stream.
   */
  public static responseTimeEarlyFix_r12Type fromPerAligned(byte[] encodedBytes) {
    responseTimeEarlyFix_r12Type result = new responseTimeEarlyFix_r12Type();
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
    return "responseTimeEarlyFix_r12Type = " + getInteger() + ";\n";
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
    builder.append("ext1Type = {\n");
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
    builder.append("ResponseTime = {\n");
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
