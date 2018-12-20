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

package com.google.location.suplclient.asn1.supl2.rrlp_components;

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
public  class GLONASSclockModel extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GLONASSclockModel
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GLONASSclockModel() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GLONASSclockModel;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GLONASSclockModel != null) {
      return ImmutableList.of(TAG_GLONASSclockModel);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GLONASSclockModel from encoded stream.
   */
  public static GLONASSclockModel fromPerUnaligned(byte[] encodedBytes) {
    GLONASSclockModel result = new GLONASSclockModel();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GLONASSclockModel from encoded stream.
   */
  public static GLONASSclockModel fromPerAligned(byte[] encodedBytes) {
    GLONASSclockModel result = new GLONASSclockModel();
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

  
  private GLONASSclockModel.gloTauType gloTau_;
  public GLONASSclockModel.gloTauType getGloTau() {
    return gloTau_;
  }
  /**
   * @throws ClassCastException if value is not a GLONASSclockModel.gloTauType
   */
  public void setGloTau(Asn1Object value) {
    this.gloTau_ = (GLONASSclockModel.gloTauType) value;
  }
  public GLONASSclockModel.gloTauType setGloTauToNewInstance() {
    gloTau_ = new GLONASSclockModel.gloTauType();
    return gloTau_;
  }
  
  private GLONASSclockModel.gloGammaType gloGamma_;
  public GLONASSclockModel.gloGammaType getGloGamma() {
    return gloGamma_;
  }
  /**
   * @throws ClassCastException if value is not a GLONASSclockModel.gloGammaType
   */
  public void setGloGamma(Asn1Object value) {
    this.gloGamma_ = (GLONASSclockModel.gloGammaType) value;
  }
  public GLONASSclockModel.gloGammaType setGloGammaToNewInstance() {
    gloGamma_ = new GLONASSclockModel.gloGammaType();
    return gloGamma_;
  }
  
  private GLONASSclockModel.gloDeltaTauType gloDeltaTau_;
  public GLONASSclockModel.gloDeltaTauType getGloDeltaTau() {
    return gloDeltaTau_;
  }
  /**
   * @throws ClassCastException if value is not a GLONASSclockModel.gloDeltaTauType
   */
  public void setGloDeltaTau(Asn1Object value) {
    this.gloDeltaTau_ = (GLONASSclockModel.gloDeltaTauType) value;
  }
  public GLONASSclockModel.gloDeltaTauType setGloDeltaTauToNewInstance() {
    gloDeltaTau_ = new GLONASSclockModel.gloDeltaTauType();
    return gloDeltaTau_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getGloTau() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGloTau();
          }

          @Override public void setToNewInstance() {
            setGloTauToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GLONASSclockModel.gloTauType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gloTau : "
                    + getGloTau().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getGloGamma() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGloGamma();
          }

          @Override public void setToNewInstance() {
            setGloGammaToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GLONASSclockModel.gloGammaType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gloGamma : "
                    + getGloGamma().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getGloDeltaTau() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGloDeltaTau();
          }

          @Override public void setToNewInstance() {
            setGloDeltaTauToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GLONASSclockModel.gloDeltaTauType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gloDeltaTau : "
                    + getGloDeltaTau().toIndentedString(indent);
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
public static class gloTauType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_gloTauType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gloTauType() {
    super();
    setValueRange(new java.math.BigInteger("-2097152"), new java.math.BigInteger("2097151"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gloTauType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gloTauType != null) {
      return ImmutableList.of(TAG_gloTauType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gloTauType from encoded stream.
   */
  public static gloTauType fromPerUnaligned(byte[] encodedBytes) {
    gloTauType result = new gloTauType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gloTauType from encoded stream.
   */
  public static gloTauType fromPerAligned(byte[] encodedBytes) {
    gloTauType result = new gloTauType();
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
    return "gloTauType = " + getInteger() + ";\n";
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
public static class gloGammaType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_gloGammaType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gloGammaType() {
    super();
    setValueRange(new java.math.BigInteger("-1024"), new java.math.BigInteger("1023"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gloGammaType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gloGammaType != null) {
      return ImmutableList.of(TAG_gloGammaType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gloGammaType from encoded stream.
   */
  public static gloGammaType fromPerUnaligned(byte[] encodedBytes) {
    gloGammaType result = new gloGammaType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gloGammaType from encoded stream.
   */
  public static gloGammaType fromPerAligned(byte[] encodedBytes) {
    gloGammaType result = new gloGammaType();
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
    return "gloGammaType = " + getInteger() + ";\n";
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
public static class gloDeltaTauType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_gloDeltaTauType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gloDeltaTauType() {
    super();
    setValueRange(new java.math.BigInteger("-16"), new java.math.BigInteger("15"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gloDeltaTauType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gloDeltaTauType != null) {
      return ImmutableList.of(TAG_gloDeltaTauType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gloDeltaTauType from encoded stream.
   */
  public static gloDeltaTauType fromPerUnaligned(byte[] encodedBytes) {
    gloDeltaTauType result = new gloDeltaTauType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gloDeltaTauType from encoded stream.
   */
  public static gloDeltaTauType fromPerAligned(byte[] encodedBytes) {
    gloDeltaTauType result = new gloDeltaTauType();
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
    return "gloDeltaTauType = " + getInteger() + ";\n";
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
    builder.append("GLONASSclockModel = {\n");
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
