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
public  class HorizontalAccuracy extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_HorizontalAccuracy
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public HorizontalAccuracy() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_HorizontalAccuracy;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_HorizontalAccuracy != null) {
      return ImmutableList.of(TAG_HorizontalAccuracy);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new HorizontalAccuracy from encoded stream.
   */
  public static HorizontalAccuracy fromPerUnaligned(byte[] encodedBytes) {
    HorizontalAccuracy result = new HorizontalAccuracy();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new HorizontalAccuracy from encoded stream.
   */
  public static HorizontalAccuracy fromPerAligned(byte[] encodedBytes) {
    HorizontalAccuracy result = new HorizontalAccuracy();
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

  
  private HorizontalAccuracy.accuracyType accuracy_;
  public HorizontalAccuracy.accuracyType getAccuracy() {
    return accuracy_;
  }
  /**
   * @throws ClassCastException if value is not a HorizontalAccuracy.accuracyType
   */
  public void setAccuracy(Asn1Object value) {
    this.accuracy_ = (HorizontalAccuracy.accuracyType) value;
  }
  public HorizontalAccuracy.accuracyType setAccuracyToNewInstance() {
    accuracy_ = new HorizontalAccuracy.accuracyType();
    return accuracy_;
  }
  
  private HorizontalAccuracy.confidenceType confidence_;
  public HorizontalAccuracy.confidenceType getConfidence() {
    return confidence_;
  }
  /**
   * @throws ClassCastException if value is not a HorizontalAccuracy.confidenceType
   */
  public void setConfidence(Asn1Object value) {
    this.confidence_ = (HorizontalAccuracy.confidenceType) value;
  }
  public HorizontalAccuracy.confidenceType setConfidenceToNewInstance() {
    confidence_ = new HorizontalAccuracy.confidenceType();
    return confidence_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getAccuracy() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getAccuracy();
          }

          @Override public void setToNewInstance() {
            setAccuracyToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? HorizontalAccuracy.accuracyType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "accuracy : "
                    + getAccuracy().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getConfidence() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getConfidence();
          }

          @Override public void setToNewInstance() {
            setConfidenceToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? HorizontalAccuracy.confidenceType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "confidence : "
                    + getConfidence().toIndentedString(indent);
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
public static class accuracyType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_accuracyType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public accuracyType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("127"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_accuracyType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_accuracyType != null) {
      return ImmutableList.of(TAG_accuracyType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new accuracyType from encoded stream.
   */
  public static accuracyType fromPerUnaligned(byte[] encodedBytes) {
    accuracyType result = new accuracyType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new accuracyType from encoded stream.
   */
  public static accuracyType fromPerAligned(byte[] encodedBytes) {
    accuracyType result = new accuracyType();
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
    return "accuracyType = " + getInteger() + ";\n";
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
public static class confidenceType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_confidenceType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public confidenceType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("100"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_confidenceType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_confidenceType != null) {
      return ImmutableList.of(TAG_confidenceType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new confidenceType from encoded stream.
   */
  public static confidenceType fromPerUnaligned(byte[] encodedBytes) {
    confidenceType result = new confidenceType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new confidenceType from encoded stream.
   */
  public static confidenceType fromPerAligned(byte[] encodedBytes) {
    confidenceType result = new confidenceType();
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
    return "confidenceType = " + getInteger() + ";\n";
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
    builder.append("HorizontalAccuracy = {\n");
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
