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
public  class GNSS_SupportElement extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GNSS_SupportElement
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GNSS_SupportElement() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GNSS_SupportElement;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GNSS_SupportElement != null) {
      return ImmutableList.of(TAG_GNSS_SupportElement);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GNSS_SupportElement from encoded stream.
   */
  public static GNSS_SupportElement fromPerUnaligned(byte[] encodedBytes) {
    GNSS_SupportElement result = new GNSS_SupportElement();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GNSS_SupportElement from encoded stream.
   */
  public static GNSS_SupportElement fromPerAligned(byte[] encodedBytes) {
    GNSS_SupportElement result = new GNSS_SupportElement();
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

  
  private GNSS_ID gnss_ID_;
  public GNSS_ID getGnss_ID() {
    return gnss_ID_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_ID
   */
  public void setGnss_ID(Asn1Object value) {
    this.gnss_ID_ = (GNSS_ID) value;
  }
  public GNSS_ID setGnss_IDToNewInstance() {
    gnss_ID_ = new GNSS_ID();
    return gnss_ID_;
  }
  
  private SBAS_IDs sbas_IDs_;
  public SBAS_IDs getSbas_IDs() {
    return sbas_IDs_;
  }
  /**
   * @throws ClassCastException if value is not a SBAS_IDs
   */
  public void setSbas_IDs(Asn1Object value) {
    this.sbas_IDs_ = (SBAS_IDs) value;
  }
  public SBAS_IDs setSbas_IDsToNewInstance() {
    sbas_IDs_ = new SBAS_IDs();
    return sbas_IDs_;
  }
  
  private PositioningModes agnss_Modes_;
  public PositioningModes getAgnss_Modes() {
    return agnss_Modes_;
  }
  /**
   * @throws ClassCastException if value is not a PositioningModes
   */
  public void setAgnss_Modes(Asn1Object value) {
    this.agnss_Modes_ = (PositioningModes) value;
  }
  public PositioningModes setAgnss_ModesToNewInstance() {
    agnss_Modes_ = new PositioningModes();
    return agnss_Modes_;
  }
  
  private GNSS_SignalIDs gnss_Signals_;
  public GNSS_SignalIDs getGnss_Signals() {
    return gnss_Signals_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_SignalIDs
   */
  public void setGnss_Signals(Asn1Object value) {
    this.gnss_Signals_ = (GNSS_SignalIDs) value;
  }
  public GNSS_SignalIDs setGnss_SignalsToNewInstance() {
    gnss_Signals_ = new GNSS_SignalIDs();
    return gnss_Signals_;
  }
  
  private GNSS_SupportElement.fta_MeasSupportType fta_MeasSupport_;
  public GNSS_SupportElement.fta_MeasSupportType getFta_MeasSupport() {
    return fta_MeasSupport_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_SupportElement.fta_MeasSupportType
   */
  public void setFta_MeasSupport(Asn1Object value) {
    this.fta_MeasSupport_ = (GNSS_SupportElement.fta_MeasSupportType) value;
  }
  public GNSS_SupportElement.fta_MeasSupportType setFta_MeasSupportToNewInstance() {
    fta_MeasSupport_ = new GNSS_SupportElement.fta_MeasSupportType();
    return fta_MeasSupport_;
  }
  
  private GNSS_SupportElement.adr_SupportType adr_Support_;
  public GNSS_SupportElement.adr_SupportType getAdr_Support() {
    return adr_Support_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_SupportElement.adr_SupportType
   */
  public void setAdr_Support(Asn1Object value) {
    this.adr_Support_ = (GNSS_SupportElement.adr_SupportType) value;
  }
  public GNSS_SupportElement.adr_SupportType setAdr_SupportToNewInstance() {
    adr_Support_ = new GNSS_SupportElement.adr_SupportType();
    return adr_Support_;
  }
  
  private GNSS_SupportElement.velocityMeasurementSupportType velocityMeasurementSupport_;
  public GNSS_SupportElement.velocityMeasurementSupportType getVelocityMeasurementSupport() {
    return velocityMeasurementSupport_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_SupportElement.velocityMeasurementSupportType
   */
  public void setVelocityMeasurementSupport(Asn1Object value) {
    this.velocityMeasurementSupport_ = (GNSS_SupportElement.velocityMeasurementSupportType) value;
  }
  public GNSS_SupportElement.velocityMeasurementSupportType setVelocityMeasurementSupportToNewInstance() {
    velocityMeasurementSupport_ = new GNSS_SupportElement.velocityMeasurementSupportType();
    return velocityMeasurementSupport_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getGnss_ID() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_ID();
          }

          @Override public void setToNewInstance() {
            setGnss_IDToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_ID.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_ID : "
                    + getGnss_ID().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getSbas_IDs() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getSbas_IDs();
          }

          @Override public void setToNewInstance() {
            setSbas_IDsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SBAS_IDs.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "sbas_IDs : "
                    + getSbas_IDs().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getAgnss_Modes() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getAgnss_Modes();
          }

          @Override public void setToNewInstance() {
            setAgnss_ModesToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? PositioningModes.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "agnss_Modes : "
                    + getAgnss_Modes().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getGnss_Signals() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_Signals();
          }

          @Override public void setToNewInstance() {
            setGnss_SignalsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_SignalIDs.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_Signals : "
                    + getGnss_Signals().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getFta_MeasSupport() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getFta_MeasSupport();
          }

          @Override public void setToNewInstance() {
            setFta_MeasSupportToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_SupportElement.fta_MeasSupportType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "fta_MeasSupport : "
                    + getFta_MeasSupport().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getAdr_Support() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getAdr_Support();
          }

          @Override public void setToNewInstance() {
            setAdr_SupportToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_SupportElement.adr_SupportType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "adr_Support : "
                    + getAdr_Support().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getVelocityMeasurementSupport() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getVelocityMeasurementSupport();
          }

          @Override public void setToNewInstance() {
            setVelocityMeasurementSupportToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_SupportElement.velocityMeasurementSupportType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "velocityMeasurementSupport : "
                    + getVelocityMeasurementSupport().toIndentedString(indent);
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
public static class fta_MeasSupportType extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_fta_MeasSupportType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public fta_MeasSupportType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_fta_MeasSupportType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_fta_MeasSupportType != null) {
      return ImmutableList.of(TAG_fta_MeasSupportType);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new fta_MeasSupportType from encoded stream.
   */
  public static fta_MeasSupportType fromPerUnaligned(byte[] encodedBytes) {
    fta_MeasSupportType result = new fta_MeasSupportType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new fta_MeasSupportType from encoded stream.
   */
  public static fta_MeasSupportType fromPerAligned(byte[] encodedBytes) {
    fta_MeasSupportType result = new fta_MeasSupportType();
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

  
  private AccessTypes cellTime_;
  public AccessTypes getCellTime() {
    return cellTime_;
  }
  /**
   * @throws ClassCastException if value is not a AccessTypes
   */
  public void setCellTime(Asn1Object value) {
    this.cellTime_ = (AccessTypes) value;
  }
  public AccessTypes setCellTimeToNewInstance() {
    cellTime_ = new AccessTypes();
    return cellTime_;
  }
  
  private PositioningModes mode_;
  public PositioningModes getMode() {
    return mode_;
  }
  /**
   * @throws ClassCastException if value is not a PositioningModes
   */
  public void setMode(Asn1Object value) {
    this.mode_ = (PositioningModes) value;
  }
  public PositioningModes setModeToNewInstance() {
    mode_ = new PositioningModes();
    return mode_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getCellTime() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCellTime();
          }

          @Override public void setToNewInstance() {
            setCellTimeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? AccessTypes.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "cellTime : "
                    + getCellTime().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getMode() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getMode();
          }

          @Override public void setToNewInstance() {
            setModeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? PositioningModes.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "mode : "
                    + getMode().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      return builder.build();
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
    builder.append("fta_MeasSupportType = {\n");
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

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class adr_SupportType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_adr_SupportType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public adr_SupportType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_adr_SupportType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_adr_SupportType != null) {
      return ImmutableList.of(TAG_adr_SupportType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new adr_SupportType from encoded stream.
   */
  public static adr_SupportType fromPerUnaligned(byte[] encodedBytes) {
    adr_SupportType result = new adr_SupportType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new adr_SupportType from encoded stream.
   */
  public static adr_SupportType fromPerAligned(byte[] encodedBytes) {
    adr_SupportType result = new adr_SupportType();
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
    return "adr_SupportType = " + getValue() + ";\n";
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
public static class velocityMeasurementSupportType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_velocityMeasurementSupportType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public velocityMeasurementSupportType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_velocityMeasurementSupportType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_velocityMeasurementSupportType != null) {
      return ImmutableList.of(TAG_velocityMeasurementSupportType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new velocityMeasurementSupportType from encoded stream.
   */
  public static velocityMeasurementSupportType fromPerUnaligned(byte[] encodedBytes) {
    velocityMeasurementSupportType result = new velocityMeasurementSupportType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new velocityMeasurementSupportType from encoded stream.
   */
  public static velocityMeasurementSupportType fromPerAligned(byte[] encodedBytes) {
    velocityMeasurementSupportType result = new velocityMeasurementSupportType();
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
    return "velocityMeasurementSupportType = " + getValue() + ";\n";
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
    builder.append("GNSS_SupportElement = {\n");
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
