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
import com.google.location.suplclient.asn1.base.Asn1Null;
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
public  class Rel98_MsrPosition_Req_Extension extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_Rel98_MsrPosition_Req_Extension
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public Rel98_MsrPosition_Req_Extension() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_Rel98_MsrPosition_Req_Extension;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_Rel98_MsrPosition_Req_Extension != null) {
      return ImmutableList.of(TAG_Rel98_MsrPosition_Req_Extension);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new Rel98_MsrPosition_Req_Extension from encoded stream.
   */
  public static Rel98_MsrPosition_Req_Extension fromPerUnaligned(byte[] encodedBytes) {
    Rel98_MsrPosition_Req_Extension result = new Rel98_MsrPosition_Req_Extension();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new Rel98_MsrPosition_Req_Extension from encoded stream.
   */
  public static Rel98_MsrPosition_Req_Extension fromPerAligned(byte[] encodedBytes) {
    Rel98_MsrPosition_Req_Extension result = new Rel98_MsrPosition_Req_Extension();
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

  
  private Rel98_Ext_ExpOTD rel98_Ext_ExpOTD_;
  public Rel98_Ext_ExpOTD getRel98_Ext_ExpOTD() {
    return rel98_Ext_ExpOTD_;
  }
  /**
   * @throws ClassCastException if value is not a Rel98_Ext_ExpOTD
   */
  public void setRel98_Ext_ExpOTD(Asn1Object value) {
    this.rel98_Ext_ExpOTD_ = (Rel98_Ext_ExpOTD) value;
  }
  public Rel98_Ext_ExpOTD setRel98_Ext_ExpOTDToNewInstance() {
    rel98_Ext_ExpOTD_ = new Rel98_Ext_ExpOTD();
    return rel98_Ext_ExpOTD_;
  }
  

  
  private Rel98_MsrPosition_Req_Extension.gpsTimeAssistanceMeasurementRequestType  extensionGpsTimeAssistanceMeasurementRequest;
  public Rel98_MsrPosition_Req_Extension.gpsTimeAssistanceMeasurementRequestType getExtensionGpsTimeAssistanceMeasurementRequest() {
    return extensionGpsTimeAssistanceMeasurementRequest;
  }
  /**
   * @throws ClassCastException if value is not a Rel98_MsrPosition_Req_Extension.gpsTimeAssistanceMeasurementRequestType
   */
  public void setExtensionGpsTimeAssistanceMeasurementRequest(Asn1Object value) {
    extensionGpsTimeAssistanceMeasurementRequest = (Rel98_MsrPosition_Req_Extension.gpsTimeAssistanceMeasurementRequestType) value;
  }
  public void setExtensionGpsTimeAssistanceMeasurementRequestToNewInstance() {
    extensionGpsTimeAssistanceMeasurementRequest = new Rel98_MsrPosition_Req_Extension.gpsTimeAssistanceMeasurementRequestType();
  }
    
  private GPSReferenceTimeUncertainty  extensionGpsReferenceTimeUncertainty;
  public GPSReferenceTimeUncertainty getExtensionGpsReferenceTimeUncertainty() {
    return extensionGpsReferenceTimeUncertainty;
  }
  /**
   * @throws ClassCastException if value is not a GPSReferenceTimeUncertainty
   */
  public void setExtensionGpsReferenceTimeUncertainty(Asn1Object value) {
    extensionGpsReferenceTimeUncertainty = (GPSReferenceTimeUncertainty) value;
  }
  public void setExtensionGpsReferenceTimeUncertaintyToNewInstance() {
    extensionGpsReferenceTimeUncertainty = new GPSReferenceTimeUncertainty();
  }
    

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getRel98_Ext_ExpOTD() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getRel98_Ext_ExpOTD();
          }

          @Override public void setToNewInstance() {
            setRel98_Ext_ExpOTDToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Rel98_Ext_ExpOTD.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "rel98_Ext_ExpOTD : "
                    + getRel98_Ext_ExpOTD().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      builder.add(new SequenceComponent() {
            @Override public boolean isExplicitlySet() {
              return getExtensionGpsTimeAssistanceMeasurementRequest() != null;
            }

            @Override public boolean hasDefaultValue() {
              return false;
            }

            @Override public boolean isOptional() {
              return true;
            }

            @Override public Asn1Object getComponentValue() {
              return getExtensionGpsTimeAssistanceMeasurementRequest();
            }

            @Override public void setToNewInstance() {
              setExtensionGpsTimeAssistanceMeasurementRequestToNewInstance();
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
              return "gpsTimeAssistanceMeasurementRequest : "
                  + getExtensionGpsTimeAssistanceMeasurementRequest().toIndentedString(indent);
            }
      });
      
      builder.add(new SequenceComponent() {
            @Override public boolean isExplicitlySet() {
              return getExtensionGpsReferenceTimeUncertainty() != null;
            }

            @Override public boolean hasDefaultValue() {
              return false;
            }

            @Override public boolean isOptional() {
              return true;
            }

            @Override public Asn1Object getComponentValue() {
              return getExtensionGpsReferenceTimeUncertainty();
            }

            @Override public void setToNewInstance() {
              setExtensionGpsReferenceTimeUncertaintyToNewInstance();
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
              return "gpsReferenceTimeUncertainty : "
                  + getExtensionGpsReferenceTimeUncertainty().toIndentedString(indent);
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
public static class gpsTimeAssistanceMeasurementRequestType extends Asn1Null {
  //

  private static final Asn1Tag TAG_gpsTimeAssistanceMeasurementRequestType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gpsTimeAssistanceMeasurementRequestType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gpsTimeAssistanceMeasurementRequestType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gpsTimeAssistanceMeasurementRequestType != null) {
      return ImmutableList.of(TAG_gpsTimeAssistanceMeasurementRequestType);
    } else {
      return Asn1Null.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gpsTimeAssistanceMeasurementRequestType from encoded stream.
   */
  public static gpsTimeAssistanceMeasurementRequestType fromPerUnaligned(byte[] encodedBytes) {
    gpsTimeAssistanceMeasurementRequestType result = new gpsTimeAssistanceMeasurementRequestType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gpsTimeAssistanceMeasurementRequestType from encoded stream.
   */
  public static gpsTimeAssistanceMeasurementRequestType fromPerAligned(byte[] encodedBytes) {
    gpsTimeAssistanceMeasurementRequestType result = new gpsTimeAssistanceMeasurementRequestType();
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
    return "gpsTimeAssistanceMeasurementRequestType (null value);\n";
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
    builder.append("Rel98_MsrPosition_Req_Extension = {\n");
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
