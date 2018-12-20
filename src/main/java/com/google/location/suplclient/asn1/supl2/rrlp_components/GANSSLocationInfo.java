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
import com.google.location.suplclient.asn1.supl2.map_lcs_datatypes.Ext_GeographicalInformation;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
* 
*/
public  class GANSSLocationInfo extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GANSSLocationInfo
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GANSSLocationInfo() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GANSSLocationInfo;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GANSSLocationInfo != null) {
      return ImmutableList.of(TAG_GANSSLocationInfo);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GANSSLocationInfo from encoded stream.
   */
  public static GANSSLocationInfo fromPerUnaligned(byte[] encodedBytes) {
    GANSSLocationInfo result = new GANSSLocationInfo();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GANSSLocationInfo from encoded stream.
   */
  public static GANSSLocationInfo fromPerAligned(byte[] encodedBytes) {
    GANSSLocationInfo result = new GANSSLocationInfo();
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

  
  private ReferenceFrame referenceFrame_;
  public ReferenceFrame getReferenceFrame() {
    return referenceFrame_;
  }
  /**
   * @throws ClassCastException if value is not a ReferenceFrame
   */
  public void setReferenceFrame(Asn1Object value) {
    this.referenceFrame_ = (ReferenceFrame) value;
  }
  public ReferenceFrame setReferenceFrameToNewInstance() {
    referenceFrame_ = new ReferenceFrame();
    return referenceFrame_;
  }
  
  private GANSSTODm ganssTODm_;
  public GANSSTODm getGanssTODm() {
    return ganssTODm_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSTODm
   */
  public void setGanssTODm(Asn1Object value) {
    this.ganssTODm_ = (GANSSTODm) value;
  }
  public GANSSTODm setGanssTODmToNewInstance() {
    ganssTODm_ = new GANSSTODm();
    return ganssTODm_;
  }
  
  private GANSSLocationInfo.ganssTODFracType ganssTODFrac_;
  public GANSSLocationInfo.ganssTODFracType getGanssTODFrac() {
    return ganssTODFrac_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSLocationInfo.ganssTODFracType
   */
  public void setGanssTODFrac(Asn1Object value) {
    this.ganssTODFrac_ = (GANSSLocationInfo.ganssTODFracType) value;
  }
  public GANSSLocationInfo.ganssTODFracType setGanssTODFracToNewInstance() {
    ganssTODFrac_ = new GANSSLocationInfo.ganssTODFracType();
    return ganssTODFrac_;
  }
  
  private GANSSTODUncertainty ganssTODUncertainty_;
  public GANSSTODUncertainty getGanssTODUncertainty() {
    return ganssTODUncertainty_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSTODUncertainty
   */
  public void setGanssTODUncertainty(Asn1Object value) {
    this.ganssTODUncertainty_ = (GANSSTODUncertainty) value;
  }
  public GANSSTODUncertainty setGanssTODUncertaintyToNewInstance() {
    ganssTODUncertainty_ = new GANSSTODUncertainty();
    return ganssTODUncertainty_;
  }
  
  private GANSSLocationInfo.ganssTimeIDType ganssTimeID_;
  public GANSSLocationInfo.ganssTimeIDType getGanssTimeID() {
    return ganssTimeID_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSLocationInfo.ganssTimeIDType
   */
  public void setGanssTimeID(Asn1Object value) {
    this.ganssTimeID_ = (GANSSLocationInfo.ganssTimeIDType) value;
  }
  public GANSSLocationInfo.ganssTimeIDType setGanssTimeIDToNewInstance() {
    ganssTimeID_ = new GANSSLocationInfo.ganssTimeIDType();
    return ganssTimeID_;
  }
  
  private FixType fixType_;
  public FixType getFixType() {
    return fixType_;
  }
  /**
   * @throws ClassCastException if value is not a FixType
   */
  public void setFixType(Asn1Object value) {
    this.fixType_ = (FixType) value;
  }
  public FixType setFixTypeToNewInstance() {
    fixType_ = new FixType();
    return fixType_;
  }
  
  private PositionData posData_;
  public PositionData getPosData() {
    return posData_;
  }
  /**
   * @throws ClassCastException if value is not a PositionData
   */
  public void setPosData(Asn1Object value) {
    this.posData_ = (PositionData) value;
  }
  public PositionData setPosDataToNewInstance() {
    posData_ = new PositionData();
    return posData_;
  }
  
  private GANSSLocationInfo.stationaryIndicationType stationaryIndication_;
  public GANSSLocationInfo.stationaryIndicationType getStationaryIndication() {
    return stationaryIndication_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSLocationInfo.stationaryIndicationType
   */
  public void setStationaryIndication(Asn1Object value) {
    this.stationaryIndication_ = (GANSSLocationInfo.stationaryIndicationType) value;
  }
  public GANSSLocationInfo.stationaryIndicationType setStationaryIndicationToNewInstance() {
    stationaryIndication_ = new GANSSLocationInfo.stationaryIndicationType();
    return stationaryIndication_;
  }
  
  private Ext_GeographicalInformation posEstimate_;
  public Ext_GeographicalInformation getPosEstimate() {
    return posEstimate_;
  }
  /**
   * @throws ClassCastException if value is not a Ext_GeographicalInformation
   */
  public void setPosEstimate(Asn1Object value) {
    this.posEstimate_ = (Ext_GeographicalInformation) value;
  }
  public Ext_GeographicalInformation setPosEstimateToNewInstance() {
    posEstimate_ = new Ext_GeographicalInformation();
    return posEstimate_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getReferenceFrame() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getReferenceFrame();
          }

          @Override public void setToNewInstance() {
            setReferenceFrameToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ReferenceFrame.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "referenceFrame : "
                    + getReferenceFrame().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getGanssTODm() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssTODm();
          }

          @Override public void setToNewInstance() {
            setGanssTODmToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSTODm.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssTODm : "
                    + getGanssTODm().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getGanssTODFrac() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssTODFrac();
          }

          @Override public void setToNewInstance() {
            setGanssTODFracToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSLocationInfo.ganssTODFracType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssTODFrac : "
                    + getGanssTODFrac().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getGanssTODUncertainty() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssTODUncertainty();
          }

          @Override public void setToNewInstance() {
            setGanssTODUncertaintyToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSTODUncertainty.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssTODUncertainty : "
                    + getGanssTODUncertainty().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getGanssTimeID() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssTimeID();
          }

          @Override public void setToNewInstance() {
            setGanssTimeIDToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSLocationInfo.ganssTimeIDType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssTimeID : "
                    + getGanssTimeID().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getFixType() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getFixType();
          }

          @Override public void setToNewInstance() {
            setFixTypeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? FixType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "fixType : "
                    + getFixType().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getPosData() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getPosData();
          }

          @Override public void setToNewInstance() {
            setPosDataToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? PositionData.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "posData : "
                    + getPosData().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 7);

          @Override public boolean isExplicitlySet() {
            return getStationaryIndication() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getStationaryIndication();
          }

          @Override public void setToNewInstance() {
            setStationaryIndicationToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSLocationInfo.stationaryIndicationType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "stationaryIndication : "
                    + getStationaryIndication().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 8);

          @Override public boolean isExplicitlySet() {
            return getPosEstimate() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getPosEstimate();
          }

          @Override public void setToNewInstance() {
            setPosEstimateToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Ext_GeographicalInformation.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "posEstimate : "
                    + getPosEstimate().toIndentedString(indent);
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
public static class ganssTODFracType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ganssTODFracType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ganssTODFracType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("16384"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ganssTODFracType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ganssTODFracType != null) {
      return ImmutableList.of(TAG_ganssTODFracType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ganssTODFracType from encoded stream.
   */
  public static ganssTODFracType fromPerUnaligned(byte[] encodedBytes) {
    ganssTODFracType result = new ganssTODFracType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ganssTODFracType from encoded stream.
   */
  public static ganssTODFracType fromPerAligned(byte[] encodedBytes) {
    ganssTODFracType result = new ganssTODFracType();
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
    return "ganssTODFracType = " + getInteger() + ";\n";
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
public static class ganssTimeIDType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_ganssTimeIDType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ganssTimeIDType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("7"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ganssTimeIDType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ganssTimeIDType != null) {
      return ImmutableList.of(TAG_ganssTimeIDType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ganssTimeIDType from encoded stream.
   */
  public static ganssTimeIDType fromPerUnaligned(byte[] encodedBytes) {
    ganssTimeIDType result = new ganssTimeIDType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ganssTimeIDType from encoded stream.
   */
  public static ganssTimeIDType fromPerAligned(byte[] encodedBytes) {
    ganssTimeIDType result = new ganssTimeIDType();
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
    return "ganssTimeIDType = " + getInteger() + ";\n";
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
public static class stationaryIndicationType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_stationaryIndicationType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public stationaryIndicationType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("1"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_stationaryIndicationType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_stationaryIndicationType != null) {
      return ImmutableList.of(TAG_stationaryIndicationType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new stationaryIndicationType from encoded stream.
   */
  public static stationaryIndicationType fromPerUnaligned(byte[] encodedBytes) {
    stationaryIndicationType result = new stationaryIndicationType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new stationaryIndicationType from encoded stream.
   */
  public static stationaryIndicationType fromPerAligned(byte[] encodedBytes) {
    stationaryIndicationType result = new stationaryIndicationType();
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
    return "stationaryIndicationType = " + getInteger() + ";\n";
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
    builder.append("GANSSLocationInfo = {\n");
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
