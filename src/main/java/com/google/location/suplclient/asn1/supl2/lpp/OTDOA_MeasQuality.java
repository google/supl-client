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
public  class OTDOA_MeasQuality extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_OTDOA_MeasQuality
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public OTDOA_MeasQuality() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_OTDOA_MeasQuality;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_OTDOA_MeasQuality != null) {
      return ImmutableList.of(TAG_OTDOA_MeasQuality);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new OTDOA_MeasQuality from encoded stream.
   */
  public static OTDOA_MeasQuality fromPerUnaligned(byte[] encodedBytes) {
    OTDOA_MeasQuality result = new OTDOA_MeasQuality();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new OTDOA_MeasQuality from encoded stream.
   */
  public static OTDOA_MeasQuality fromPerAligned(byte[] encodedBytes) {
    OTDOA_MeasQuality result = new OTDOA_MeasQuality();
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

  
  private OTDOA_MeasQuality.error_ResolutionType error_Resolution_;
  public OTDOA_MeasQuality.error_ResolutionType getError_Resolution() {
    return error_Resolution_;
  }
  /**
   * @throws ClassCastException if value is not a OTDOA_MeasQuality.error_ResolutionType
   */
  public void setError_Resolution(Asn1Object value) {
    this.error_Resolution_ = (OTDOA_MeasQuality.error_ResolutionType) value;
  }
  public OTDOA_MeasQuality.error_ResolutionType setError_ResolutionToNewInstance() {
    error_Resolution_ = new OTDOA_MeasQuality.error_ResolutionType();
    return error_Resolution_;
  }
  
  private OTDOA_MeasQuality.error_ValueType error_Value_;
  public OTDOA_MeasQuality.error_ValueType getError_Value() {
    return error_Value_;
  }
  /**
   * @throws ClassCastException if value is not a OTDOA_MeasQuality.error_ValueType
   */
  public void setError_Value(Asn1Object value) {
    this.error_Value_ = (OTDOA_MeasQuality.error_ValueType) value;
  }
  public OTDOA_MeasQuality.error_ValueType setError_ValueToNewInstance() {
    error_Value_ = new OTDOA_MeasQuality.error_ValueType();
    return error_Value_;
  }
  
  private OTDOA_MeasQuality.error_NumSamplesType error_NumSamples_;
  public OTDOA_MeasQuality.error_NumSamplesType getError_NumSamples() {
    return error_NumSamples_;
  }
  /**
   * @throws ClassCastException if value is not a OTDOA_MeasQuality.error_NumSamplesType
   */
  public void setError_NumSamples(Asn1Object value) {
    this.error_NumSamples_ = (OTDOA_MeasQuality.error_NumSamplesType) value;
  }
  public OTDOA_MeasQuality.error_NumSamplesType setError_NumSamplesToNewInstance() {
    error_NumSamples_ = new OTDOA_MeasQuality.error_NumSamplesType();
    return error_NumSamples_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getError_Resolution() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getError_Resolution();
          }

          @Override public void setToNewInstance() {
            setError_ResolutionToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? OTDOA_MeasQuality.error_ResolutionType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "error_Resolution : "
                    + getError_Resolution().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getError_Value() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getError_Value();
          }

          @Override public void setToNewInstance() {
            setError_ValueToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? OTDOA_MeasQuality.error_ValueType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "error_Value : "
                    + getError_Value().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getError_NumSamples() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getError_NumSamples();
          }

          @Override public void setToNewInstance() {
            setError_NumSamplesToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? OTDOA_MeasQuality.error_NumSamplesType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "error_NumSamples : "
                    + getError_NumSamples().toIndentedString(indent);
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
public static class error_ResolutionType extends Asn1BitString {
  //

  // defined bit positions, if any
  

  // setters
  

  // clearers
  


  private static final Asn1Tag TAG_error_ResolutionType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public error_ResolutionType() {
    super();
    setMinSize(2);
setMaxSize(2);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_error_ResolutionType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_error_ResolutionType != null) {
      return ImmutableList.of(TAG_error_ResolutionType);
    } else {
      return Asn1BitString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new error_ResolutionType from encoded stream.
   */
  public static error_ResolutionType fromPerUnaligned(byte[] encodedBytes) {
    error_ResolutionType result = new error_ResolutionType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new error_ResolutionType from encoded stream.
   */
  public static error_ResolutionType fromPerAligned(byte[] encodedBytes) {
    error_ResolutionType result = new error_ResolutionType();
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
    return "error_ResolutionType = " + getValue() + ";\n";
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
public static class error_ValueType extends Asn1BitString {
  //

  // defined bit positions, if any
  

  // setters
  

  // clearers
  


  private static final Asn1Tag TAG_error_ValueType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public error_ValueType() {
    super();
    setMinSize(5);
setMaxSize(5);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_error_ValueType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_error_ValueType != null) {
      return ImmutableList.of(TAG_error_ValueType);
    } else {
      return Asn1BitString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new error_ValueType from encoded stream.
   */
  public static error_ValueType fromPerUnaligned(byte[] encodedBytes) {
    error_ValueType result = new error_ValueType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new error_ValueType from encoded stream.
   */
  public static error_ValueType fromPerAligned(byte[] encodedBytes) {
    error_ValueType result = new error_ValueType();
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
    return "error_ValueType = " + getValue() + ";\n";
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
public static class error_NumSamplesType extends Asn1BitString {
  //

  // defined bit positions, if any
  

  // setters
  

  // clearers
  


  private static final Asn1Tag TAG_error_NumSamplesType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public error_NumSamplesType() {
    super();
    setMinSize(3);
setMaxSize(3);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_error_NumSamplesType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_error_NumSamplesType != null) {
      return ImmutableList.of(TAG_error_NumSamplesType);
    } else {
      return Asn1BitString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new error_NumSamplesType from encoded stream.
   */
  public static error_NumSamplesType fromPerUnaligned(byte[] encodedBytes) {
    error_NumSamplesType result = new error_NumSamplesType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new error_NumSamplesType from encoded stream.
   */
  public static error_NumSamplesType fromPerAligned(byte[] encodedBytes) {
    error_NumSamplesType result = new error_NumSamplesType();
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
    return "error_NumSamplesType = " + getValue() + ";\n";
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
    builder.append("OTDOA_MeasQuality = {\n");
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
