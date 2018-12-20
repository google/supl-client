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
public  class PosProtocolVersion3GPP extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_PosProtocolVersion3GPP
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public PosProtocolVersion3GPP() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_PosProtocolVersion3GPP;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_PosProtocolVersion3GPP != null) {
      return ImmutableList.of(TAG_PosProtocolVersion3GPP);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new PosProtocolVersion3GPP from encoded stream.
   */
  public static PosProtocolVersion3GPP fromPerUnaligned(byte[] encodedBytes) {
    PosProtocolVersion3GPP result = new PosProtocolVersion3GPP();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new PosProtocolVersion3GPP from encoded stream.
   */
  public static PosProtocolVersion3GPP fromPerAligned(byte[] encodedBytes) {
    PosProtocolVersion3GPP result = new PosProtocolVersion3GPP();
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

  
  private PosProtocolVersion3GPP.majorVersionFieldType majorVersionField_;
  public PosProtocolVersion3GPP.majorVersionFieldType getMajorVersionField() {
    return majorVersionField_;
  }
  /**
   * @throws ClassCastException if value is not a PosProtocolVersion3GPP.majorVersionFieldType
   */
  public void setMajorVersionField(Asn1Object value) {
    this.majorVersionField_ = (PosProtocolVersion3GPP.majorVersionFieldType) value;
  }
  public PosProtocolVersion3GPP.majorVersionFieldType setMajorVersionFieldToNewInstance() {
    majorVersionField_ = new PosProtocolVersion3GPP.majorVersionFieldType();
    return majorVersionField_;
  }
  
  private PosProtocolVersion3GPP.technicalVersionFieldType technicalVersionField_;
  public PosProtocolVersion3GPP.technicalVersionFieldType getTechnicalVersionField() {
    return technicalVersionField_;
  }
  /**
   * @throws ClassCastException if value is not a PosProtocolVersion3GPP.technicalVersionFieldType
   */
  public void setTechnicalVersionField(Asn1Object value) {
    this.technicalVersionField_ = (PosProtocolVersion3GPP.technicalVersionFieldType) value;
  }
  public PosProtocolVersion3GPP.technicalVersionFieldType setTechnicalVersionFieldToNewInstance() {
    technicalVersionField_ = new PosProtocolVersion3GPP.technicalVersionFieldType();
    return technicalVersionField_;
  }
  
  private PosProtocolVersion3GPP.editorialVersionFieldType editorialVersionField_;
  public PosProtocolVersion3GPP.editorialVersionFieldType getEditorialVersionField() {
    return editorialVersionField_;
  }
  /**
   * @throws ClassCastException if value is not a PosProtocolVersion3GPP.editorialVersionFieldType
   */
  public void setEditorialVersionField(Asn1Object value) {
    this.editorialVersionField_ = (PosProtocolVersion3GPP.editorialVersionFieldType) value;
  }
  public PosProtocolVersion3GPP.editorialVersionFieldType setEditorialVersionFieldToNewInstance() {
    editorialVersionField_ = new PosProtocolVersion3GPP.editorialVersionFieldType();
    return editorialVersionField_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getMajorVersionField() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getMajorVersionField();
          }

          @Override public void setToNewInstance() {
            setMajorVersionFieldToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? PosProtocolVersion3GPP.majorVersionFieldType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "majorVersionField : "
                    + getMajorVersionField().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getTechnicalVersionField() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getTechnicalVersionField();
          }

          @Override public void setToNewInstance() {
            setTechnicalVersionFieldToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? PosProtocolVersion3GPP.technicalVersionFieldType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "technicalVersionField : "
                    + getTechnicalVersionField().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getEditorialVersionField() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getEditorialVersionField();
          }

          @Override public void setToNewInstance() {
            setEditorialVersionFieldToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? PosProtocolVersion3GPP.editorialVersionFieldType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "editorialVersionField : "
                    + getEditorialVersionField().toIndentedString(indent);
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
public static class majorVersionFieldType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_majorVersionFieldType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public majorVersionFieldType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("255"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_majorVersionFieldType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_majorVersionFieldType != null) {
      return ImmutableList.of(TAG_majorVersionFieldType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new majorVersionFieldType from encoded stream.
   */
  public static majorVersionFieldType fromPerUnaligned(byte[] encodedBytes) {
    majorVersionFieldType result = new majorVersionFieldType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new majorVersionFieldType from encoded stream.
   */
  public static majorVersionFieldType fromPerAligned(byte[] encodedBytes) {
    majorVersionFieldType result = new majorVersionFieldType();
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
    return "majorVersionFieldType = " + getInteger() + ";\n";
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
public static class technicalVersionFieldType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_technicalVersionFieldType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public technicalVersionFieldType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("255"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_technicalVersionFieldType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_technicalVersionFieldType != null) {
      return ImmutableList.of(TAG_technicalVersionFieldType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new technicalVersionFieldType from encoded stream.
   */
  public static technicalVersionFieldType fromPerUnaligned(byte[] encodedBytes) {
    technicalVersionFieldType result = new technicalVersionFieldType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new technicalVersionFieldType from encoded stream.
   */
  public static technicalVersionFieldType fromPerAligned(byte[] encodedBytes) {
    technicalVersionFieldType result = new technicalVersionFieldType();
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
    return "technicalVersionFieldType = " + getInteger() + ";\n";
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
public static class editorialVersionFieldType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_editorialVersionFieldType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public editorialVersionFieldType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("255"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_editorialVersionFieldType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_editorialVersionFieldType != null) {
      return ImmutableList.of(TAG_editorialVersionFieldType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new editorialVersionFieldType from encoded stream.
   */
  public static editorialVersionFieldType fromPerUnaligned(byte[] encodedBytes) {
    editorialVersionFieldType result = new editorialVersionFieldType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new editorialVersionFieldType from encoded stream.
   */
  public static editorialVersionFieldType fromPerAligned(byte[] encodedBytes) {
    editorialVersionFieldType result = new editorialVersionFieldType();
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
    return "editorialVersionFieldType = " + getInteger() + ";\n";
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
    builder.append("PosProtocolVersion3GPP = {\n");
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
