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
public  class Rel_98_MsrPosition_Rsp_Extension extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_Rel_98_MsrPosition_Rsp_Extension
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public Rel_98_MsrPosition_Rsp_Extension() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_Rel_98_MsrPosition_Rsp_Extension;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_Rel_98_MsrPosition_Rsp_Extension != null) {
      return ImmutableList.of(TAG_Rel_98_MsrPosition_Rsp_Extension);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new Rel_98_MsrPosition_Rsp_Extension from encoded stream.
   */
  public static Rel_98_MsrPosition_Rsp_Extension fromPerUnaligned(byte[] encodedBytes) {
    Rel_98_MsrPosition_Rsp_Extension result = new Rel_98_MsrPosition_Rsp_Extension();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new Rel_98_MsrPosition_Rsp_Extension from encoded stream.
   */
  public static Rel_98_MsrPosition_Rsp_Extension fromPerAligned(byte[] encodedBytes) {
    Rel_98_MsrPosition_Rsp_Extension result = new Rel_98_MsrPosition_Rsp_Extension();
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

  
  private Rel_98_MsrPosition_Rsp_Extension.rel_98_Ext_MeasureInfoType rel_98_Ext_MeasureInfo_;
  public Rel_98_MsrPosition_Rsp_Extension.rel_98_Ext_MeasureInfoType getRel_98_Ext_MeasureInfo() {
    return rel_98_Ext_MeasureInfo_;
  }
  /**
   * @throws ClassCastException if value is not a Rel_98_MsrPosition_Rsp_Extension.rel_98_Ext_MeasureInfoType
   */
  public void setRel_98_Ext_MeasureInfo(Asn1Object value) {
    this.rel_98_Ext_MeasureInfo_ = (Rel_98_MsrPosition_Rsp_Extension.rel_98_Ext_MeasureInfoType) value;
  }
  public Rel_98_MsrPosition_Rsp_Extension.rel_98_Ext_MeasureInfoType setRel_98_Ext_MeasureInfoToNewInstance() {
    rel_98_Ext_MeasureInfo_ = new Rel_98_MsrPosition_Rsp_Extension.rel_98_Ext_MeasureInfoType();
    return rel_98_Ext_MeasureInfo_;
  }
  

  
  private GPSTimeAssistanceMeasurements  extensionTimeAssistanceMeasurements;
  public GPSTimeAssistanceMeasurements getExtensionTimeAssistanceMeasurements() {
    return extensionTimeAssistanceMeasurements;
  }
  /**
   * @throws ClassCastException if value is not a GPSTimeAssistanceMeasurements
   */
  public void setExtensionTimeAssistanceMeasurements(Asn1Object value) {
    extensionTimeAssistanceMeasurements = (GPSTimeAssistanceMeasurements) value;
  }
  public void setExtensionTimeAssistanceMeasurementsToNewInstance() {
    extensionTimeAssistanceMeasurements = new GPSTimeAssistanceMeasurements();
  }
    

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getRel_98_Ext_MeasureInfo() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getRel_98_Ext_MeasureInfo();
          }

          @Override public void setToNewInstance() {
            setRel_98_Ext_MeasureInfoToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Rel_98_MsrPosition_Rsp_Extension.rel_98_Ext_MeasureInfoType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "rel_98_Ext_MeasureInfo : "
                    + getRel_98_Ext_MeasureInfo().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      builder.add(new SequenceComponent() {
            @Override public boolean isExplicitlySet() {
              return getExtensionTimeAssistanceMeasurements() != null;
            }

            @Override public boolean hasDefaultValue() {
              return false;
            }

            @Override public boolean isOptional() {
              return true;
            }

            @Override public Asn1Object getComponentValue() {
              return getExtensionTimeAssistanceMeasurements();
            }

            @Override public void setToNewInstance() {
              setExtensionTimeAssistanceMeasurementsToNewInstance();
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
              return "timeAssistanceMeasurements : "
                  + getExtensionTimeAssistanceMeasurements().toIndentedString(indent);
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
public static class rel_98_Ext_MeasureInfoType extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_rel_98_Ext_MeasureInfoType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public rel_98_Ext_MeasureInfoType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_rel_98_Ext_MeasureInfoType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_rel_98_Ext_MeasureInfoType != null) {
      return ImmutableList.of(TAG_rel_98_Ext_MeasureInfoType);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new rel_98_Ext_MeasureInfoType from encoded stream.
   */
  public static rel_98_Ext_MeasureInfoType fromPerUnaligned(byte[] encodedBytes) {
    rel_98_Ext_MeasureInfoType result = new rel_98_Ext_MeasureInfoType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new rel_98_Ext_MeasureInfoType from encoded stream.
   */
  public static rel_98_Ext_MeasureInfoType fromPerAligned(byte[] encodedBytes) {
    rel_98_Ext_MeasureInfoType result = new rel_98_Ext_MeasureInfoType();
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

  
  private OTD_MeasureInfo_R98_Ext otd_MeasureInfo_R98_Ext_;
  public OTD_MeasureInfo_R98_Ext getOtd_MeasureInfo_R98_Ext() {
    return otd_MeasureInfo_R98_Ext_;
  }
  /**
   * @throws ClassCastException if value is not a OTD_MeasureInfo_R98_Ext
   */
  public void setOtd_MeasureInfo_R98_Ext(Asn1Object value) {
    this.otd_MeasureInfo_R98_Ext_ = (OTD_MeasureInfo_R98_Ext) value;
  }
  public OTD_MeasureInfo_R98_Ext setOtd_MeasureInfo_R98_ExtToNewInstance() {
    otd_MeasureInfo_R98_Ext_ = new OTD_MeasureInfo_R98_Ext();
    return otd_MeasureInfo_R98_Ext_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getOtd_MeasureInfo_R98_Ext() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getOtd_MeasureInfo_R98_Ext();
          }

          @Override public void setToNewInstance() {
            setOtd_MeasureInfo_R98_ExtToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? OTD_MeasureInfo_R98_Ext.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "otd_MeasureInfo_R98_Ext : "
                    + getOtd_MeasureInfo_R98_Ext().toIndentedString(indent);
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
    builder.append("rel_98_Ext_MeasureInfoType = {\n");
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
    builder.append("Rel_98_MsrPosition_Rsp_Extension = {\n");
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
