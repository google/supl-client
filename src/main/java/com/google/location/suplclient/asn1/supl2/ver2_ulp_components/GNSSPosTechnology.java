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

package com.google.location.suplclient.asn1.supl2.ver2_ulp_components;

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
public  class GNSSPosTechnology extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GNSSPosTechnology
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GNSSPosTechnology() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GNSSPosTechnology;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GNSSPosTechnology != null) {
      return ImmutableList.of(TAG_GNSSPosTechnology);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GNSSPosTechnology from encoded stream.
   */
  public static GNSSPosTechnology fromPerUnaligned(byte[] encodedBytes) {
    GNSSPosTechnology result = new GNSSPosTechnology();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GNSSPosTechnology from encoded stream.
   */
  public static GNSSPosTechnology fromPerAligned(byte[] encodedBytes) {
    GNSSPosTechnology result = new GNSSPosTechnology();
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

  
  private GNSSPosTechnology.gpsType gps_;
  public GNSSPosTechnology.gpsType getGps() {
    return gps_;
  }
  /**
   * @throws ClassCastException if value is not a GNSSPosTechnology.gpsType
   */
  public void setGps(Asn1Object value) {
    this.gps_ = (GNSSPosTechnology.gpsType) value;
  }
  public GNSSPosTechnology.gpsType setGpsToNewInstance() {
    gps_ = new GNSSPosTechnology.gpsType();
    return gps_;
  }
  
  private GNSSPosTechnology.galileoType galileo_;
  public GNSSPosTechnology.galileoType getGalileo() {
    return galileo_;
  }
  /**
   * @throws ClassCastException if value is not a GNSSPosTechnology.galileoType
   */
  public void setGalileo(Asn1Object value) {
    this.galileo_ = (GNSSPosTechnology.galileoType) value;
  }
  public GNSSPosTechnology.galileoType setGalileoToNewInstance() {
    galileo_ = new GNSSPosTechnology.galileoType();
    return galileo_;
  }
  
  private GNSSPosTechnology.sbasType sbas_;
  public GNSSPosTechnology.sbasType getSbas() {
    return sbas_;
  }
  /**
   * @throws ClassCastException if value is not a GNSSPosTechnology.sbasType
   */
  public void setSbas(Asn1Object value) {
    this.sbas_ = (GNSSPosTechnology.sbasType) value;
  }
  public GNSSPosTechnology.sbasType setSbasToNewInstance() {
    sbas_ = new GNSSPosTechnology.sbasType();
    return sbas_;
  }
  
  private GNSSPosTechnology.modernized_gpsType modernized_gps_;
  public GNSSPosTechnology.modernized_gpsType getModernized_gps() {
    return modernized_gps_;
  }
  /**
   * @throws ClassCastException if value is not a GNSSPosTechnology.modernized_gpsType
   */
  public void setModernized_gps(Asn1Object value) {
    this.modernized_gps_ = (GNSSPosTechnology.modernized_gpsType) value;
  }
  public GNSSPosTechnology.modernized_gpsType setModernized_gpsToNewInstance() {
    modernized_gps_ = new GNSSPosTechnology.modernized_gpsType();
    return modernized_gps_;
  }
  
  private GNSSPosTechnology.qzssType qzss_;
  public GNSSPosTechnology.qzssType getQzss() {
    return qzss_;
  }
  /**
   * @throws ClassCastException if value is not a GNSSPosTechnology.qzssType
   */
  public void setQzss(Asn1Object value) {
    this.qzss_ = (GNSSPosTechnology.qzssType) value;
  }
  public GNSSPosTechnology.qzssType setQzssToNewInstance() {
    qzss_ = new GNSSPosTechnology.qzssType();
    return qzss_;
  }
  
  private GNSSPosTechnology.glonassType glonass_;
  public GNSSPosTechnology.glonassType getGlonass() {
    return glonass_;
  }
  /**
   * @throws ClassCastException if value is not a GNSSPosTechnology.glonassType
   */
  public void setGlonass(Asn1Object value) {
    this.glonass_ = (GNSSPosTechnology.glonassType) value;
  }
  public GNSSPosTechnology.glonassType setGlonassToNewInstance() {
    glonass_ = new GNSSPosTechnology.glonassType();
    return glonass_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getGps() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGps();
          }

          @Override public void setToNewInstance() {
            setGpsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSSPosTechnology.gpsType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gps : "
                    + getGps().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getGalileo() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGalileo();
          }

          @Override public void setToNewInstance() {
            setGalileoToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSSPosTechnology.galileoType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "galileo : "
                    + getGalileo().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getSbas() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getSbas();
          }

          @Override public void setToNewInstance() {
            setSbasToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSSPosTechnology.sbasType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "sbas : "
                    + getSbas().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getModernized_gps() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getModernized_gps();
          }

          @Override public void setToNewInstance() {
            setModernized_gpsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSSPosTechnology.modernized_gpsType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "modernized_gps : "
                    + getModernized_gps().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getQzss() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getQzss();
          }

          @Override public void setToNewInstance() {
            setQzssToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSSPosTechnology.qzssType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "qzss : "
                    + getQzss().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getGlonass() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGlonass();
          }

          @Override public void setToNewInstance() {
            setGlonassToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSSPosTechnology.glonassType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "glonass : "
                    + getGlonass().toIndentedString(indent);
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
public static class gpsType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_gpsType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gpsType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gpsType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gpsType != null) {
      return ImmutableList.of(TAG_gpsType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gpsType from encoded stream.
   */
  public static gpsType fromPerUnaligned(byte[] encodedBytes) {
    gpsType result = new gpsType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gpsType from encoded stream.
   */
  public static gpsType fromPerAligned(byte[] encodedBytes) {
    gpsType result = new gpsType();
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
    return "gpsType = " + getValue() + ";\n";
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
public static class galileoType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_galileoType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public galileoType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_galileoType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_galileoType != null) {
      return ImmutableList.of(TAG_galileoType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new galileoType from encoded stream.
   */
  public static galileoType fromPerUnaligned(byte[] encodedBytes) {
    galileoType result = new galileoType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new galileoType from encoded stream.
   */
  public static galileoType fromPerAligned(byte[] encodedBytes) {
    galileoType result = new galileoType();
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
    return "galileoType = " + getValue() + ";\n";
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
public static class sbasType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_sbasType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public sbasType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_sbasType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_sbasType != null) {
      return ImmutableList.of(TAG_sbasType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new sbasType from encoded stream.
   */
  public static sbasType fromPerUnaligned(byte[] encodedBytes) {
    sbasType result = new sbasType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new sbasType from encoded stream.
   */
  public static sbasType fromPerAligned(byte[] encodedBytes) {
    sbasType result = new sbasType();
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
    return "sbasType = " + getValue() + ";\n";
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
public static class modernized_gpsType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_modernized_gpsType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public modernized_gpsType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_modernized_gpsType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_modernized_gpsType != null) {
      return ImmutableList.of(TAG_modernized_gpsType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new modernized_gpsType from encoded stream.
   */
  public static modernized_gpsType fromPerUnaligned(byte[] encodedBytes) {
    modernized_gpsType result = new modernized_gpsType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new modernized_gpsType from encoded stream.
   */
  public static modernized_gpsType fromPerAligned(byte[] encodedBytes) {
    modernized_gpsType result = new modernized_gpsType();
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
    return "modernized_gpsType = " + getValue() + ";\n";
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
public static class qzssType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_qzssType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public qzssType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_qzssType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_qzssType != null) {
      return ImmutableList.of(TAG_qzssType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new qzssType from encoded stream.
   */
  public static qzssType fromPerUnaligned(byte[] encodedBytes) {
    qzssType result = new qzssType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new qzssType from encoded stream.
   */
  public static qzssType fromPerAligned(byte[] encodedBytes) {
    qzssType result = new qzssType();
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
    return "qzssType = " + getValue() + ";\n";
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
public static class glonassType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_glonassType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public glonassType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_glonassType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_glonassType != null) {
      return ImmutableList.of(TAG_glonassType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new glonassType from encoded stream.
   */
  public static glonassType fromPerUnaligned(byte[] encodedBytes) {
    glonassType result = new glonassType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new glonassType from encoded stream.
   */
  public static glonassType fromPerAligned(byte[] encodedBytes) {
    glonassType result = new glonassType();
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
    return "glonassType = " + getValue() + ";\n";
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
    builder.append("GNSSPosTechnology = {\n");
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
