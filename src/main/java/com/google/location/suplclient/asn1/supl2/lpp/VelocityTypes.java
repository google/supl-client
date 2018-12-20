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
import com.google.location.suplclient.asn1.base.Asn1Boolean;
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
public  class VelocityTypes extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_VelocityTypes
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public VelocityTypes() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_VelocityTypes;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_VelocityTypes != null) {
      return ImmutableList.of(TAG_VelocityTypes);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new VelocityTypes from encoded stream.
   */
  public static VelocityTypes fromPerUnaligned(byte[] encodedBytes) {
    VelocityTypes result = new VelocityTypes();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new VelocityTypes from encoded stream.
   */
  public static VelocityTypes fromPerAligned(byte[] encodedBytes) {
    VelocityTypes result = new VelocityTypes();
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

  
  private VelocityTypes.horizontalVelocityType horizontalVelocity_;
  public VelocityTypes.horizontalVelocityType getHorizontalVelocity() {
    return horizontalVelocity_;
  }
  /**
   * @throws ClassCastException if value is not a VelocityTypes.horizontalVelocityType
   */
  public void setHorizontalVelocity(Asn1Object value) {
    this.horizontalVelocity_ = (VelocityTypes.horizontalVelocityType) value;
  }
  public VelocityTypes.horizontalVelocityType setHorizontalVelocityToNewInstance() {
    horizontalVelocity_ = new VelocityTypes.horizontalVelocityType();
    return horizontalVelocity_;
  }
  
  private VelocityTypes.horizontalWithVerticalVelocityType horizontalWithVerticalVelocity_;
  public VelocityTypes.horizontalWithVerticalVelocityType getHorizontalWithVerticalVelocity() {
    return horizontalWithVerticalVelocity_;
  }
  /**
   * @throws ClassCastException if value is not a VelocityTypes.horizontalWithVerticalVelocityType
   */
  public void setHorizontalWithVerticalVelocity(Asn1Object value) {
    this.horizontalWithVerticalVelocity_ = (VelocityTypes.horizontalWithVerticalVelocityType) value;
  }
  public VelocityTypes.horizontalWithVerticalVelocityType setHorizontalWithVerticalVelocityToNewInstance() {
    horizontalWithVerticalVelocity_ = new VelocityTypes.horizontalWithVerticalVelocityType();
    return horizontalWithVerticalVelocity_;
  }
  
  private VelocityTypes.horizontalVelocityWithUncertaintyType horizontalVelocityWithUncertainty_;
  public VelocityTypes.horizontalVelocityWithUncertaintyType getHorizontalVelocityWithUncertainty() {
    return horizontalVelocityWithUncertainty_;
  }
  /**
   * @throws ClassCastException if value is not a VelocityTypes.horizontalVelocityWithUncertaintyType
   */
  public void setHorizontalVelocityWithUncertainty(Asn1Object value) {
    this.horizontalVelocityWithUncertainty_ = (VelocityTypes.horizontalVelocityWithUncertaintyType) value;
  }
  public VelocityTypes.horizontalVelocityWithUncertaintyType setHorizontalVelocityWithUncertaintyToNewInstance() {
    horizontalVelocityWithUncertainty_ = new VelocityTypes.horizontalVelocityWithUncertaintyType();
    return horizontalVelocityWithUncertainty_;
  }
  
  private VelocityTypes.horizontalWithVerticalVelocityAndUncertaintyType horizontalWithVerticalVelocityAndUncertainty_;
  public VelocityTypes.horizontalWithVerticalVelocityAndUncertaintyType getHorizontalWithVerticalVelocityAndUncertainty() {
    return horizontalWithVerticalVelocityAndUncertainty_;
  }
  /**
   * @throws ClassCastException if value is not a VelocityTypes.horizontalWithVerticalVelocityAndUncertaintyType
   */
  public void setHorizontalWithVerticalVelocityAndUncertainty(Asn1Object value) {
    this.horizontalWithVerticalVelocityAndUncertainty_ = (VelocityTypes.horizontalWithVerticalVelocityAndUncertaintyType) value;
  }
  public VelocityTypes.horizontalWithVerticalVelocityAndUncertaintyType setHorizontalWithVerticalVelocityAndUncertaintyToNewInstance() {
    horizontalWithVerticalVelocityAndUncertainty_ = new VelocityTypes.horizontalWithVerticalVelocityAndUncertaintyType();
    return horizontalWithVerticalVelocityAndUncertainty_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getHorizontalVelocity() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getHorizontalVelocity();
          }

          @Override public void setToNewInstance() {
            setHorizontalVelocityToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? VelocityTypes.horizontalVelocityType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "horizontalVelocity : "
                    + getHorizontalVelocity().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getHorizontalWithVerticalVelocity() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getHorizontalWithVerticalVelocity();
          }

          @Override public void setToNewInstance() {
            setHorizontalWithVerticalVelocityToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? VelocityTypes.horizontalWithVerticalVelocityType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "horizontalWithVerticalVelocity : "
                    + getHorizontalWithVerticalVelocity().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getHorizontalVelocityWithUncertainty() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getHorizontalVelocityWithUncertainty();
          }

          @Override public void setToNewInstance() {
            setHorizontalVelocityWithUncertaintyToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? VelocityTypes.horizontalVelocityWithUncertaintyType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "horizontalVelocityWithUncertainty : "
                    + getHorizontalVelocityWithUncertainty().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getHorizontalWithVerticalVelocityAndUncertainty() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getHorizontalWithVerticalVelocityAndUncertainty();
          }

          @Override public void setToNewInstance() {
            setHorizontalWithVerticalVelocityAndUncertaintyToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? VelocityTypes.horizontalWithVerticalVelocityAndUncertaintyType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "horizontalWithVerticalVelocityAndUncertainty : "
                    + getHorizontalWithVerticalVelocityAndUncertainty().toIndentedString(indent);
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
public static class horizontalVelocityType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_horizontalVelocityType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public horizontalVelocityType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_horizontalVelocityType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_horizontalVelocityType != null) {
      return ImmutableList.of(TAG_horizontalVelocityType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new horizontalVelocityType from encoded stream.
   */
  public static horizontalVelocityType fromPerUnaligned(byte[] encodedBytes) {
    horizontalVelocityType result = new horizontalVelocityType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new horizontalVelocityType from encoded stream.
   */
  public static horizontalVelocityType fromPerAligned(byte[] encodedBytes) {
    horizontalVelocityType result = new horizontalVelocityType();
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
    return "horizontalVelocityType = " + getValue() + ";\n";
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
public static class horizontalWithVerticalVelocityType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_horizontalWithVerticalVelocityType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public horizontalWithVerticalVelocityType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_horizontalWithVerticalVelocityType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_horizontalWithVerticalVelocityType != null) {
      return ImmutableList.of(TAG_horizontalWithVerticalVelocityType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new horizontalWithVerticalVelocityType from encoded stream.
   */
  public static horizontalWithVerticalVelocityType fromPerUnaligned(byte[] encodedBytes) {
    horizontalWithVerticalVelocityType result = new horizontalWithVerticalVelocityType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new horizontalWithVerticalVelocityType from encoded stream.
   */
  public static horizontalWithVerticalVelocityType fromPerAligned(byte[] encodedBytes) {
    horizontalWithVerticalVelocityType result = new horizontalWithVerticalVelocityType();
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
    return "horizontalWithVerticalVelocityType = " + getValue() + ";\n";
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
public static class horizontalVelocityWithUncertaintyType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_horizontalVelocityWithUncertaintyType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public horizontalVelocityWithUncertaintyType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_horizontalVelocityWithUncertaintyType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_horizontalVelocityWithUncertaintyType != null) {
      return ImmutableList.of(TAG_horizontalVelocityWithUncertaintyType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new horizontalVelocityWithUncertaintyType from encoded stream.
   */
  public static horizontalVelocityWithUncertaintyType fromPerUnaligned(byte[] encodedBytes) {
    horizontalVelocityWithUncertaintyType result = new horizontalVelocityWithUncertaintyType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new horizontalVelocityWithUncertaintyType from encoded stream.
   */
  public static horizontalVelocityWithUncertaintyType fromPerAligned(byte[] encodedBytes) {
    horizontalVelocityWithUncertaintyType result = new horizontalVelocityWithUncertaintyType();
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
    return "horizontalVelocityWithUncertaintyType = " + getValue() + ";\n";
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
public static class horizontalWithVerticalVelocityAndUncertaintyType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_horizontalWithVerticalVelocityAndUncertaintyType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public horizontalWithVerticalVelocityAndUncertaintyType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_horizontalWithVerticalVelocityAndUncertaintyType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_horizontalWithVerticalVelocityAndUncertaintyType != null) {
      return ImmutableList.of(TAG_horizontalWithVerticalVelocityAndUncertaintyType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new horizontalWithVerticalVelocityAndUncertaintyType from encoded stream.
   */
  public static horizontalWithVerticalVelocityAndUncertaintyType fromPerUnaligned(byte[] encodedBytes) {
    horizontalWithVerticalVelocityAndUncertaintyType result = new horizontalWithVerticalVelocityAndUncertaintyType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new horizontalWithVerticalVelocityAndUncertaintyType from encoded stream.
   */
  public static horizontalWithVerticalVelocityAndUncertaintyType fromPerAligned(byte[] encodedBytes) {
    horizontalWithVerticalVelocityAndUncertaintyType result = new horizontalWithVerticalVelocityAndUncertaintyType();
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
    return "horizontalWithVerticalVelocityAndUncertaintyType = " + getValue() + ";\n";
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
    builder.append("VelocityTypes = {\n");
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
