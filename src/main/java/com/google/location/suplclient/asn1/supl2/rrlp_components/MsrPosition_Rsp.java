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
import com.google.location.suplclient.asn1.supl2.map_extensiondatatypes.ExtensionContainer;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
* 
*/
public  class MsrPosition_Rsp extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_MsrPosition_Rsp
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public MsrPosition_Rsp() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_MsrPosition_Rsp;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_MsrPosition_Rsp != null) {
      return ImmutableList.of(TAG_MsrPosition_Rsp);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new MsrPosition_Rsp from encoded stream.
   */
  public static MsrPosition_Rsp fromPerUnaligned(byte[] encodedBytes) {
    MsrPosition_Rsp result = new MsrPosition_Rsp();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new MsrPosition_Rsp from encoded stream.
   */
  public static MsrPosition_Rsp fromPerAligned(byte[] encodedBytes) {
    MsrPosition_Rsp result = new MsrPosition_Rsp();
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

  
  private MultipleSets multipleSets_;
  public MultipleSets getMultipleSets() {
    return multipleSets_;
  }
  /**
   * @throws ClassCastException if value is not a MultipleSets
   */
  public void setMultipleSets(Asn1Object value) {
    this.multipleSets_ = (MultipleSets) value;
  }
  public MultipleSets setMultipleSetsToNewInstance() {
    multipleSets_ = new MultipleSets();
    return multipleSets_;
  }
  
  private ReferenceIdentity referenceIdentity_;
  public ReferenceIdentity getReferenceIdentity() {
    return referenceIdentity_;
  }
  /**
   * @throws ClassCastException if value is not a ReferenceIdentity
   */
  public void setReferenceIdentity(Asn1Object value) {
    this.referenceIdentity_ = (ReferenceIdentity) value;
  }
  public ReferenceIdentity setReferenceIdentityToNewInstance() {
    referenceIdentity_ = new ReferenceIdentity();
    return referenceIdentity_;
  }
  
  private OTD_MeasureInfo otd_MeasureInfo_;
  public OTD_MeasureInfo getOtd_MeasureInfo() {
    return otd_MeasureInfo_;
  }
  /**
   * @throws ClassCastException if value is not a OTD_MeasureInfo
   */
  public void setOtd_MeasureInfo(Asn1Object value) {
    this.otd_MeasureInfo_ = (OTD_MeasureInfo) value;
  }
  public OTD_MeasureInfo setOtd_MeasureInfoToNewInstance() {
    otd_MeasureInfo_ = new OTD_MeasureInfo();
    return otd_MeasureInfo_;
  }
  
  private LocationInfo locationInfo_;
  public LocationInfo getLocationInfo() {
    return locationInfo_;
  }
  /**
   * @throws ClassCastException if value is not a LocationInfo
   */
  public void setLocationInfo(Asn1Object value) {
    this.locationInfo_ = (LocationInfo) value;
  }
  public LocationInfo setLocationInfoToNewInstance() {
    locationInfo_ = new LocationInfo();
    return locationInfo_;
  }
  
  private GPS_MeasureInfo gps_MeasureInfo_;
  public GPS_MeasureInfo getGps_MeasureInfo() {
    return gps_MeasureInfo_;
  }
  /**
   * @throws ClassCastException if value is not a GPS_MeasureInfo
   */
  public void setGps_MeasureInfo(Asn1Object value) {
    this.gps_MeasureInfo_ = (GPS_MeasureInfo) value;
  }
  public GPS_MeasureInfo setGps_MeasureInfoToNewInstance() {
    gps_MeasureInfo_ = new GPS_MeasureInfo();
    return gps_MeasureInfo_;
  }
  
  private LocationError locationError_;
  public LocationError getLocationError() {
    return locationError_;
  }
  /**
   * @throws ClassCastException if value is not a LocationError
   */
  public void setLocationError(Asn1Object value) {
    this.locationError_ = (LocationError) value;
  }
  public LocationError setLocationErrorToNewInstance() {
    locationError_ = new LocationError();
    return locationError_;
  }
  
  private ExtensionContainer extensionContainer_;
  public ExtensionContainer getExtensionContainer() {
    return extensionContainer_;
  }
  /**
   * @throws ClassCastException if value is not a ExtensionContainer
   */
  public void setExtensionContainer(Asn1Object value) {
    this.extensionContainer_ = (ExtensionContainer) value;
  }
  public ExtensionContainer setExtensionContainerToNewInstance() {
    extensionContainer_ = new ExtensionContainer();
    return extensionContainer_;
  }
  

  
  private Rel_98_MsrPosition_Rsp_Extension  extensionRel_98_MsrPosition_Rsp_Extension;
  public Rel_98_MsrPosition_Rsp_Extension getExtensionRel_98_MsrPosition_Rsp_Extension() {
    return extensionRel_98_MsrPosition_Rsp_Extension;
  }
  /**
   * @throws ClassCastException if value is not a Rel_98_MsrPosition_Rsp_Extension
   */
  public void setExtensionRel_98_MsrPosition_Rsp_Extension(Asn1Object value) {
    extensionRel_98_MsrPosition_Rsp_Extension = (Rel_98_MsrPosition_Rsp_Extension) value;
  }
  public void setExtensionRel_98_MsrPosition_Rsp_ExtensionToNewInstance() {
    extensionRel_98_MsrPosition_Rsp_Extension = new Rel_98_MsrPosition_Rsp_Extension();
  }
    
  private Rel_5_MsrPosition_Rsp_Extension  extensionRel_5_MsrPosition_Rsp_Extension;
  public Rel_5_MsrPosition_Rsp_Extension getExtensionRel_5_MsrPosition_Rsp_Extension() {
    return extensionRel_5_MsrPosition_Rsp_Extension;
  }
  /**
   * @throws ClassCastException if value is not a Rel_5_MsrPosition_Rsp_Extension
   */
  public void setExtensionRel_5_MsrPosition_Rsp_Extension(Asn1Object value) {
    extensionRel_5_MsrPosition_Rsp_Extension = (Rel_5_MsrPosition_Rsp_Extension) value;
  }
  public void setExtensionRel_5_MsrPosition_Rsp_ExtensionToNewInstance() {
    extensionRel_5_MsrPosition_Rsp_Extension = new Rel_5_MsrPosition_Rsp_Extension();
  }
    
  private Rel_7_MsrPosition_Rsp_Extension  extensionRel_7_MsrPosition_Rsp_Extension;
  public Rel_7_MsrPosition_Rsp_Extension getExtensionRel_7_MsrPosition_Rsp_Extension() {
    return extensionRel_7_MsrPosition_Rsp_Extension;
  }
  /**
   * @throws ClassCastException if value is not a Rel_7_MsrPosition_Rsp_Extension
   */
  public void setExtensionRel_7_MsrPosition_Rsp_Extension(Asn1Object value) {
    extensionRel_7_MsrPosition_Rsp_Extension = (Rel_7_MsrPosition_Rsp_Extension) value;
  }
  public void setExtensionRel_7_MsrPosition_Rsp_ExtensionToNewInstance() {
    extensionRel_7_MsrPosition_Rsp_Extension = new Rel_7_MsrPosition_Rsp_Extension();
  }
    

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getMultipleSets() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getMultipleSets();
          }

          @Override public void setToNewInstance() {
            setMultipleSetsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? MultipleSets.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "multipleSets : "
                    + getMultipleSets().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getReferenceIdentity() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getReferenceIdentity();
          }

          @Override public void setToNewInstance() {
            setReferenceIdentityToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ReferenceIdentity.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "referenceIdentity : "
                    + getReferenceIdentity().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getOtd_MeasureInfo() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getOtd_MeasureInfo();
          }

          @Override public void setToNewInstance() {
            setOtd_MeasureInfoToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? OTD_MeasureInfo.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "otd_MeasureInfo : "
                    + getOtd_MeasureInfo().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getLocationInfo() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getLocationInfo();
          }

          @Override public void setToNewInstance() {
            setLocationInfoToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? LocationInfo.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "locationInfo : "
                    + getLocationInfo().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getGps_MeasureInfo() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGps_MeasureInfo();
          }

          @Override public void setToNewInstance() {
            setGps_MeasureInfoToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GPS_MeasureInfo.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gps_MeasureInfo : "
                    + getGps_MeasureInfo().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getLocationError() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getLocationError();
          }

          @Override public void setToNewInstance() {
            setLocationErrorToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? LocationError.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "locationError : "
                    + getLocationError().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getExtensionContainer() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getExtensionContainer();
          }

          @Override public void setToNewInstance() {
            setExtensionContainerToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ExtensionContainer.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "extensionContainer : "
                    + getExtensionContainer().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      builder.add(new SequenceComponent() {
            @Override public boolean isExplicitlySet() {
              return getExtensionRel_98_MsrPosition_Rsp_Extension() != null;
            }

            @Override public boolean hasDefaultValue() {
              return false;
            }

            @Override public boolean isOptional() {
              return true;
            }

            @Override public Asn1Object getComponentValue() {
              return getExtensionRel_98_MsrPosition_Rsp_Extension();
            }

            @Override public void setToNewInstance() {
              setExtensionRel_98_MsrPosition_Rsp_ExtensionToNewInstance();
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
              return "rel_98_MsrPosition_Rsp_Extension : "
                  + getExtensionRel_98_MsrPosition_Rsp_Extension().toIndentedString(indent);
            }
      });
      
      builder.add(new SequenceComponent() {
            @Override public boolean isExplicitlySet() {
              return getExtensionRel_5_MsrPosition_Rsp_Extension() != null;
            }

            @Override public boolean hasDefaultValue() {
              return false;
            }

            @Override public boolean isOptional() {
              return true;
            }

            @Override public Asn1Object getComponentValue() {
              return getExtensionRel_5_MsrPosition_Rsp_Extension();
            }

            @Override public void setToNewInstance() {
              setExtensionRel_5_MsrPosition_Rsp_ExtensionToNewInstance();
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
              return "rel_5_MsrPosition_Rsp_Extension : "
                  + getExtensionRel_5_MsrPosition_Rsp_Extension().toIndentedString(indent);
            }
      });
      
      builder.add(new SequenceComponent() {
            @Override public boolean isExplicitlySet() {
              return getExtensionRel_7_MsrPosition_Rsp_Extension() != null;
            }

            @Override public boolean hasDefaultValue() {
              return false;
            }

            @Override public boolean isOptional() {
              return true;
            }

            @Override public Asn1Object getComponentValue() {
              return getExtensionRel_7_MsrPosition_Rsp_Extension();
            }

            @Override public void setToNewInstance() {
              setExtensionRel_7_MsrPosition_Rsp_ExtensionToNewInstance();
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
              return "rel_7_MsrPosition_Rsp_Extension : "
                  + getExtensionRel_7_MsrPosition_Rsp_Extension().toIndentedString(indent);
            }
      });
      
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
    builder.append("MsrPosition_Rsp = {\n");
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
