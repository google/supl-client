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

package com.google.location.suplclient.asn1.supl2.supl_start;

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
import com.google.location.suplclient.asn1.supl2.ulp_version_2_parameter_extensions.Ver2_PosTechnology_extension;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
* 
*/
public  class PosTechnology extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_PosTechnology
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public PosTechnology() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_PosTechnology;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_PosTechnology != null) {
      return ImmutableList.of(TAG_PosTechnology);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new PosTechnology from encoded stream.
   */
  public static PosTechnology fromPerUnaligned(byte[] encodedBytes) {
    PosTechnology result = new PosTechnology();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new PosTechnology from encoded stream.
   */
  public static PosTechnology fromPerAligned(byte[] encodedBytes) {
    PosTechnology result = new PosTechnology();
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

  
  private PosTechnology.agpsSETassistedType agpsSETassisted_;
  public PosTechnology.agpsSETassistedType getAgpsSETassisted() {
    return agpsSETassisted_;
  }
  /**
   * @throws ClassCastException if value is not a PosTechnology.agpsSETassistedType
   */
  public void setAgpsSETassisted(Asn1Object value) {
    this.agpsSETassisted_ = (PosTechnology.agpsSETassistedType) value;
  }
  public PosTechnology.agpsSETassistedType setAgpsSETassistedToNewInstance() {
    agpsSETassisted_ = new PosTechnology.agpsSETassistedType();
    return agpsSETassisted_;
  }
  
  private PosTechnology.agpsSETBasedType agpsSETBased_;
  public PosTechnology.agpsSETBasedType getAgpsSETBased() {
    return agpsSETBased_;
  }
  /**
   * @throws ClassCastException if value is not a PosTechnology.agpsSETBasedType
   */
  public void setAgpsSETBased(Asn1Object value) {
    this.agpsSETBased_ = (PosTechnology.agpsSETBasedType) value;
  }
  public PosTechnology.agpsSETBasedType setAgpsSETBasedToNewInstance() {
    agpsSETBased_ = new PosTechnology.agpsSETBasedType();
    return agpsSETBased_;
  }
  
  private PosTechnology.autonomousGPSType autonomousGPS_;
  public PosTechnology.autonomousGPSType getAutonomousGPS() {
    return autonomousGPS_;
  }
  /**
   * @throws ClassCastException if value is not a PosTechnology.autonomousGPSType
   */
  public void setAutonomousGPS(Asn1Object value) {
    this.autonomousGPS_ = (PosTechnology.autonomousGPSType) value;
  }
  public PosTechnology.autonomousGPSType setAutonomousGPSToNewInstance() {
    autonomousGPS_ = new PosTechnology.autonomousGPSType();
    return autonomousGPS_;
  }
  
  private PosTechnology.aFLTType aFLT_;
  public PosTechnology.aFLTType getAFLT() {
    return aFLT_;
  }
  /**
   * @throws ClassCastException if value is not a PosTechnology.aFLTType
   */
  public void setAFLT(Asn1Object value) {
    this.aFLT_ = (PosTechnology.aFLTType) value;
  }
  public PosTechnology.aFLTType setAFLTToNewInstance() {
    aFLT_ = new PosTechnology.aFLTType();
    return aFLT_;
  }
  
  private PosTechnology.eCIDType eCID_;
  public PosTechnology.eCIDType getECID() {
    return eCID_;
  }
  /**
   * @throws ClassCastException if value is not a PosTechnology.eCIDType
   */
  public void setECID(Asn1Object value) {
    this.eCID_ = (PosTechnology.eCIDType) value;
  }
  public PosTechnology.eCIDType setECIDToNewInstance() {
    eCID_ = new PosTechnology.eCIDType();
    return eCID_;
  }
  
  private PosTechnology.eOTDType eOTD_;
  public PosTechnology.eOTDType getEOTD() {
    return eOTD_;
  }
  /**
   * @throws ClassCastException if value is not a PosTechnology.eOTDType
   */
  public void setEOTD(Asn1Object value) {
    this.eOTD_ = (PosTechnology.eOTDType) value;
  }
  public PosTechnology.eOTDType setEOTDToNewInstance() {
    eOTD_ = new PosTechnology.eOTDType();
    return eOTD_;
  }
  
  private PosTechnology.oTDOAType oTDOA_;
  public PosTechnology.oTDOAType getOTDOA() {
    return oTDOA_;
  }
  /**
   * @throws ClassCastException if value is not a PosTechnology.oTDOAType
   */
  public void setOTDOA(Asn1Object value) {
    this.oTDOA_ = (PosTechnology.oTDOAType) value;
  }
  public PosTechnology.oTDOAType setOTDOAToNewInstance() {
    oTDOA_ = new PosTechnology.oTDOAType();
    return oTDOA_;
  }
  

  
  private Ver2_PosTechnology_extension extensionVer2_PosTechnology_extension;
  public Ver2_PosTechnology_extension getExtensionVer2_PosTechnology_extension() {
    return extensionVer2_PosTechnology_extension;
  }
  /**
   * @throws ClassCastException if value is not a Ver2_PosTechnology_extension
   */
  public void setExtensionVer2_PosTechnology_extension(Asn1Object value) {
    extensionVer2_PosTechnology_extension = (Ver2_PosTechnology_extension) value;
  }
  public void setExtensionVer2_PosTechnology_extensionToNewInstance() {
    extensionVer2_PosTechnology_extension = new Ver2_PosTechnology_extension();
  }
    

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getAgpsSETassisted() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getAgpsSETassisted();
          }

          @Override public void setToNewInstance() {
            setAgpsSETassistedToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? PosTechnology.agpsSETassistedType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "agpsSETassisted : "
                    + getAgpsSETassisted().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getAgpsSETBased() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getAgpsSETBased();
          }

          @Override public void setToNewInstance() {
            setAgpsSETBasedToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? PosTechnology.agpsSETBasedType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "agpsSETBased : "
                    + getAgpsSETBased().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getAutonomousGPS() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getAutonomousGPS();
          }

          @Override public void setToNewInstance() {
            setAutonomousGPSToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? PosTechnology.autonomousGPSType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "autonomousGPS : "
                    + getAutonomousGPS().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getAFLT() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getAFLT();
          }

          @Override public void setToNewInstance() {
            setAFLTToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? PosTechnology.aFLTType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "aFLT : "
                    + getAFLT().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getECID() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getECID();
          }

          @Override public void setToNewInstance() {
            setECIDToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? PosTechnology.eCIDType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "eCID : "
                    + getECID().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getEOTD() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getEOTD();
          }

          @Override public void setToNewInstance() {
            setEOTDToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? PosTechnology.eOTDType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "eOTD : "
                    + getEOTD().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getOTDOA() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getOTDOA();
          }

          @Override public void setToNewInstance() {
            setOTDOAToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? PosTechnology.oTDOAType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "oTDOA : "
                    + getOTDOA().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      builder.add(new SequenceComponent() {
            @Override public boolean isExplicitlySet() {
              return getExtensionVer2_PosTechnology_extension() != null;
            }

            @Override public boolean hasDefaultValue() {
              return false;
            }

            @Override public boolean isOptional() {
              return true;
            }

            @Override public Asn1Object getComponentValue() {
              return getExtensionVer2_PosTechnology_extension();
            }

            @Override public void setToNewInstance() {
              setExtensionVer2_PosTechnology_extensionToNewInstance();
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
              return "ver2_PosTechnology_extension : "
                  + getExtensionVer2_PosTechnology_extension().toIndentedString(indent);
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
public static class agpsSETassistedType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_agpsSETassistedType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public agpsSETassistedType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_agpsSETassistedType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_agpsSETassistedType != null) {
      return ImmutableList.of(TAG_agpsSETassistedType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new agpsSETassistedType from encoded stream.
   */
  public static agpsSETassistedType fromPerUnaligned(byte[] encodedBytes) {
    agpsSETassistedType result = new agpsSETassistedType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new agpsSETassistedType from encoded stream.
   */
  public static agpsSETassistedType fromPerAligned(byte[] encodedBytes) {
    agpsSETassistedType result = new agpsSETassistedType();
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
    return "agpsSETassistedType = " + getValue() + ";\n";
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
public static class agpsSETBasedType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_agpsSETBasedType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public agpsSETBasedType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_agpsSETBasedType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_agpsSETBasedType != null) {
      return ImmutableList.of(TAG_agpsSETBasedType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new agpsSETBasedType from encoded stream.
   */
  public static agpsSETBasedType fromPerUnaligned(byte[] encodedBytes) {
    agpsSETBasedType result = new agpsSETBasedType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new agpsSETBasedType from encoded stream.
   */
  public static agpsSETBasedType fromPerAligned(byte[] encodedBytes) {
    agpsSETBasedType result = new agpsSETBasedType();
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
    return "agpsSETBasedType = " + getValue() + ";\n";
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
public static class autonomousGPSType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_autonomousGPSType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public autonomousGPSType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_autonomousGPSType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_autonomousGPSType != null) {
      return ImmutableList.of(TAG_autonomousGPSType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new autonomousGPSType from encoded stream.
   */
  public static autonomousGPSType fromPerUnaligned(byte[] encodedBytes) {
    autonomousGPSType result = new autonomousGPSType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new autonomousGPSType from encoded stream.
   */
  public static autonomousGPSType fromPerAligned(byte[] encodedBytes) {
    autonomousGPSType result = new autonomousGPSType();
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
    return "autonomousGPSType = " + getValue() + ";\n";
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
public static class aFLTType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_aFLTType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public aFLTType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_aFLTType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_aFLTType != null) {
      return ImmutableList.of(TAG_aFLTType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new aFLTType from encoded stream.
   */
  public static aFLTType fromPerUnaligned(byte[] encodedBytes) {
    aFLTType result = new aFLTType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new aFLTType from encoded stream.
   */
  public static aFLTType fromPerAligned(byte[] encodedBytes) {
    aFLTType result = new aFLTType();
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
    return "aFLTType = " + getValue() + ";\n";
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
public static class eCIDType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_eCIDType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public eCIDType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_eCIDType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_eCIDType != null) {
      return ImmutableList.of(TAG_eCIDType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new eCIDType from encoded stream.
   */
  public static eCIDType fromPerUnaligned(byte[] encodedBytes) {
    eCIDType result = new eCIDType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new eCIDType from encoded stream.
   */
  public static eCIDType fromPerAligned(byte[] encodedBytes) {
    eCIDType result = new eCIDType();
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
    return "eCIDType = " + getValue() + ";\n";
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
public static class eOTDType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_eOTDType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public eOTDType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_eOTDType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_eOTDType != null) {
      return ImmutableList.of(TAG_eOTDType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new eOTDType from encoded stream.
   */
  public static eOTDType fromPerUnaligned(byte[] encodedBytes) {
    eOTDType result = new eOTDType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new eOTDType from encoded stream.
   */
  public static eOTDType fromPerAligned(byte[] encodedBytes) {
    eOTDType result = new eOTDType();
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
    return "eOTDType = " + getValue() + ";\n";
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
public static class oTDOAType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_oTDOAType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public oTDOAType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_oTDOAType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_oTDOAType != null) {
      return ImmutableList.of(TAG_oTDOAType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new oTDOAType from encoded stream.
   */
  public static oTDOAType fromPerUnaligned(byte[] encodedBytes) {
    oTDOAType result = new oTDOAType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new oTDOAType from encoded stream.
   */
  public static oTDOAType fromPerAligned(byte[] encodedBytes) {
    oTDOAType result = new oTDOAType();
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
    return "oTDOAType = " + getValue() + ";\n";
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
    builder.append("PosTechnology = {\n");
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
