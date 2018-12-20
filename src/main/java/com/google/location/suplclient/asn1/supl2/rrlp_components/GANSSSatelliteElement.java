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
import com.google.location.suplclient.asn1.base.Asn1BitString;
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
public  class GANSSSatelliteElement extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GANSSSatelliteElement
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GANSSSatelliteElement() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GANSSSatelliteElement;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GANSSSatelliteElement != null) {
      return ImmutableList.of(TAG_GANSSSatelliteElement);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GANSSSatelliteElement from encoded stream.
   */
  public static GANSSSatelliteElement fromPerUnaligned(byte[] encodedBytes) {
    GANSSSatelliteElement result = new GANSSSatelliteElement();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GANSSSatelliteElement from encoded stream.
   */
  public static GANSSSatelliteElement fromPerAligned(byte[] encodedBytes) {
    GANSSSatelliteElement result = new GANSSSatelliteElement();
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

  
  private SVID svID_;
  public SVID getSvID() {
    return svID_;
  }
  /**
   * @throws ClassCastException if value is not a SVID
   */
  public void setSvID(Asn1Object value) {
    this.svID_ = (SVID) value;
  }
  public SVID setSvIDToNewInstance() {
    svID_ = new SVID();
    return svID_;
  }
  
  private GANSSSatelliteElement.svHealthType svHealth_;
  public GANSSSatelliteElement.svHealthType getSvHealth() {
    return svHealth_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSSatelliteElement.svHealthType
   */
  public void setSvHealth(Asn1Object value) {
    this.svHealth_ = (GANSSSatelliteElement.svHealthType) value;
  }
  public GANSSSatelliteElement.svHealthType setSvHealthToNewInstance() {
    svHealth_ = new GANSSSatelliteElement.svHealthType();
    return svHealth_;
  }
  
  private GANSSSatelliteElement.iodType iod_;
  public GANSSSatelliteElement.iodType getIod() {
    return iod_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSSatelliteElement.iodType
   */
  public void setIod(Asn1Object value) {
    this.iod_ = (GANSSSatelliteElement.iodType) value;
  }
  public GANSSSatelliteElement.iodType setIodToNewInstance() {
    iod_ = new GANSSSatelliteElement.iodType();
    return iod_;
  }
  
  private GANSSClockModel ganssClockModel_;
  public GANSSClockModel getGanssClockModel() {
    return ganssClockModel_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSClockModel
   */
  public void setGanssClockModel(Asn1Object value) {
    this.ganssClockModel_ = (GANSSClockModel) value;
  }
  public GANSSClockModel setGanssClockModelToNewInstance() {
    ganssClockModel_ = new GANSSClockModel();
    return ganssClockModel_;
  }
  
  private GANSSOrbitModel ganssOrbitModel_;
  public GANSSOrbitModel getGanssOrbitModel() {
    return ganssOrbitModel_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSOrbitModel
   */
  public void setGanssOrbitModel(Asn1Object value) {
    this.ganssOrbitModel_ = (GANSSOrbitModel) value;
  }
  public GANSSOrbitModel setGanssOrbitModelToNewInstance() {
    ganssOrbitModel_ = new GANSSOrbitModel();
    return ganssOrbitModel_;
  }
  

  
  private GANSSSatelliteElement.svHealthMSBType  extensionSvHealthMSB;
  public GANSSSatelliteElement.svHealthMSBType getExtensionSvHealthMSB() {
    return extensionSvHealthMSB;
  }
  /**
   * @throws ClassCastException if value is not a GANSSSatelliteElement.svHealthMSBType
   */
  public void setExtensionSvHealthMSB(Asn1Object value) {
    extensionSvHealthMSB = (GANSSSatelliteElement.svHealthMSBType) value;
  }
  public void setExtensionSvHealthMSBToNewInstance() {
    extensionSvHealthMSB = new GANSSSatelliteElement.svHealthMSBType();
  }
    
  private GANSSSatelliteElement.iodMSBType  extensionIodMSB;
  public GANSSSatelliteElement.iodMSBType getExtensionIodMSB() {
    return extensionIodMSB;
  }
  /**
   * @throws ClassCastException if value is not a GANSSSatelliteElement.iodMSBType
   */
  public void setExtensionIodMSB(Asn1Object value) {
    extensionIodMSB = (GANSSSatelliteElement.iodMSBType) value;
  }
  public void setExtensionIodMSBToNewInstance() {
    extensionIodMSB = new GANSSSatelliteElement.iodMSBType();
  }
    
  private GANSSSatelliteElement.svHealthExtType  extensionSvHealthExt;
  public GANSSSatelliteElement.svHealthExtType getExtensionSvHealthExt() {
    return extensionSvHealthExt;
  }
  /**
   * @throws ClassCastException if value is not a GANSSSatelliteElement.svHealthExtType
   */
  public void setExtensionSvHealthExt(Asn1Object value) {
    extensionSvHealthExt = (GANSSSatelliteElement.svHealthExtType) value;
  }
  public void setExtensionSvHealthExtToNewInstance() {
    extensionSvHealthExt = new GANSSSatelliteElement.svHealthExtType();
  }
    

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getSvID() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getSvID();
          }

          @Override public void setToNewInstance() {
            setSvIDToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SVID.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "svID : "
                    + getSvID().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getSvHealth() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getSvHealth();
          }

          @Override public void setToNewInstance() {
            setSvHealthToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSSatelliteElement.svHealthType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "svHealth : "
                    + getSvHealth().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getIod() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getIod();
          }

          @Override public void setToNewInstance() {
            setIodToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSSatelliteElement.iodType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "iod : "
                    + getIod().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getGanssClockModel() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssClockModel();
          }

          @Override public void setToNewInstance() {
            setGanssClockModelToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSClockModel.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssClockModel : "
                    + getGanssClockModel().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getGanssOrbitModel() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssOrbitModel();
          }

          @Override public void setToNewInstance() {
            setGanssOrbitModelToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSOrbitModel.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssOrbitModel : "
                    + getGanssOrbitModel().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      builder.add(new SequenceComponent() {
            @Override public boolean isExplicitlySet() {
              return getExtensionSvHealthMSB() != null;
            }

            @Override public boolean hasDefaultValue() {
              return false;
            }

            @Override public boolean isOptional() {
              return true;
            }

            @Override public Asn1Object getComponentValue() {
              return getExtensionSvHealthMSB();
            }

            @Override public void setToNewInstance() {
              setExtensionSvHealthMSBToNewInstance();
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
              return "svHealthMSB : "
                  + getExtensionSvHealthMSB().toIndentedString(indent);
            }
      });
      
      builder.add(new SequenceComponent() {
            @Override public boolean isExplicitlySet() {
              return getExtensionIodMSB() != null;
            }

            @Override public boolean hasDefaultValue() {
              return false;
            }

            @Override public boolean isOptional() {
              return true;
            }

            @Override public Asn1Object getComponentValue() {
              return getExtensionIodMSB();
            }

            @Override public void setToNewInstance() {
              setExtensionIodMSBToNewInstance();
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
              return "iodMSB : "
                  + getExtensionIodMSB().toIndentedString(indent);
            }
      });
      
      builder.add(new SequenceComponent() {
            @Override public boolean isExplicitlySet() {
              return getExtensionSvHealthExt() != null;
            }

            @Override public boolean hasDefaultValue() {
              return false;
            }

            @Override public boolean isOptional() {
              return true;
            }

            @Override public Asn1Object getComponentValue() {
              return getExtensionSvHealthExt();
            }

            @Override public void setToNewInstance() {
              setExtensionSvHealthExtToNewInstance();
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
              return "svHealthExt : "
                  + getExtensionSvHealthExt().toIndentedString(indent);
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
public static class svHealthType extends Asn1BitString {
  //

  // defined bit positions, if any
  

  // setters
  

  // clearers
  


  private static final Asn1Tag TAG_svHealthType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public svHealthType() {
    super();
    setMinSize(5);
setMaxSize(5);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_svHealthType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_svHealthType != null) {
      return ImmutableList.of(TAG_svHealthType);
    } else {
      return Asn1BitString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new svHealthType from encoded stream.
   */
  public static svHealthType fromPerUnaligned(byte[] encodedBytes) {
    svHealthType result = new svHealthType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new svHealthType from encoded stream.
   */
  public static svHealthType fromPerAligned(byte[] encodedBytes) {
    svHealthType result = new svHealthType();
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
    return "svHealthType = " + getValue() + ";\n";
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
public static class iodType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_iodType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public iodType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("1023"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_iodType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_iodType != null) {
      return ImmutableList.of(TAG_iodType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new iodType from encoded stream.
   */
  public static iodType fromPerUnaligned(byte[] encodedBytes) {
    iodType result = new iodType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new iodType from encoded stream.
   */
  public static iodType fromPerAligned(byte[] encodedBytes) {
    iodType result = new iodType();
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
    return "iodType = " + getInteger() + ";\n";
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
public static class svHealthMSBType extends Asn1BitString {
  //

  // defined bit positions, if any
  

  // setters
  

  // clearers
  


  private static final Asn1Tag TAG_svHealthMSBType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public svHealthMSBType() {
    super();
    setMinSize(1);
setMaxSize(1);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_svHealthMSBType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_svHealthMSBType != null) {
      return ImmutableList.of(TAG_svHealthMSBType);
    } else {
      return Asn1BitString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new svHealthMSBType from encoded stream.
   */
  public static svHealthMSBType fromPerUnaligned(byte[] encodedBytes) {
    svHealthMSBType result = new svHealthMSBType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new svHealthMSBType from encoded stream.
   */
  public static svHealthMSBType fromPerAligned(byte[] encodedBytes) {
    svHealthMSBType result = new svHealthMSBType();
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
    return "svHealthMSBType = " + getValue() + ";\n";
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
public static class iodMSBType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_iodMSBType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public iodMSBType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("1"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_iodMSBType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_iodMSBType != null) {
      return ImmutableList.of(TAG_iodMSBType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new iodMSBType from encoded stream.
   */
  public static iodMSBType fromPerUnaligned(byte[] encodedBytes) {
    iodMSBType result = new iodMSBType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new iodMSBType from encoded stream.
   */
  public static iodMSBType fromPerAligned(byte[] encodedBytes) {
    iodMSBType result = new iodMSBType();
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
    return "iodMSBType = " + getInteger() + ";\n";
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
public static class svHealthExtType extends Asn1BitString {
  //

  // defined bit positions, if any
  

  // setters
  

  // clearers
  


  private static final Asn1Tag TAG_svHealthExtType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public svHealthExtType() {
    super();
    setMinSize(4);
setMaxSize(4);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_svHealthExtType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_svHealthExtType != null) {
      return ImmutableList.of(TAG_svHealthExtType);
    } else {
      return Asn1BitString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new svHealthExtType from encoded stream.
   */
  public static svHealthExtType fromPerUnaligned(byte[] encodedBytes) {
    svHealthExtType result = new svHealthExtType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new svHealthExtType from encoded stream.
   */
  public static svHealthExtType fromPerAligned(byte[] encodedBytes) {
    svHealthExtType result = new svHealthExtType();
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
    return "svHealthExtType = " + getValue() + ";\n";
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
    builder.append("GANSSSatelliteElement = {\n");
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
