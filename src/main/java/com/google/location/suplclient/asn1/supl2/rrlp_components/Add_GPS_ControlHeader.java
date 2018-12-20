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
public  class Add_GPS_ControlHeader extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_Add_GPS_ControlHeader
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public Add_GPS_ControlHeader() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_Add_GPS_ControlHeader;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_Add_GPS_ControlHeader != null) {
      return ImmutableList.of(TAG_Add_GPS_ControlHeader);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new Add_GPS_ControlHeader from encoded stream.
   */
  public static Add_GPS_ControlHeader fromPerUnaligned(byte[] encodedBytes) {
    Add_GPS_ControlHeader result = new Add_GPS_ControlHeader();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new Add_GPS_ControlHeader from encoded stream.
   */
  public static Add_GPS_ControlHeader fromPerAligned(byte[] encodedBytes) {
    Add_GPS_ControlHeader result = new Add_GPS_ControlHeader();
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

  
  private GPSEphemerisExtension gpsEphemerisExtension_;
  public GPSEphemerisExtension getGpsEphemerisExtension() {
    return gpsEphemerisExtension_;
  }
  /**
   * @throws ClassCastException if value is not a GPSEphemerisExtension
   */
  public void setGpsEphemerisExtension(Asn1Object value) {
    this.gpsEphemerisExtension_ = (GPSEphemerisExtension) value;
  }
  public GPSEphemerisExtension setGpsEphemerisExtensionToNewInstance() {
    gpsEphemerisExtension_ = new GPSEphemerisExtension();
    return gpsEphemerisExtension_;
  }
  
  private GPSEphemerisExtensionCheck gpsEphemerisExtensionCheck_;
  public GPSEphemerisExtensionCheck getGpsEphemerisExtensionCheck() {
    return gpsEphemerisExtensionCheck_;
  }
  /**
   * @throws ClassCastException if value is not a GPSEphemerisExtensionCheck
   */
  public void setGpsEphemerisExtensionCheck(Asn1Object value) {
    this.gpsEphemerisExtensionCheck_ = (GPSEphemerisExtensionCheck) value;
  }
  public GPSEphemerisExtensionCheck setGpsEphemerisExtensionCheckToNewInstance() {
    gpsEphemerisExtensionCheck_ = new GPSEphemerisExtensionCheck();
    return gpsEphemerisExtensionCheck_;
  }
  

  
  private DGPSCorrectionsValidityPeriod  extensionDgpsCorrectionsValidityPeriod;
  public DGPSCorrectionsValidityPeriod getExtensionDgpsCorrectionsValidityPeriod() {
    return extensionDgpsCorrectionsValidityPeriod;
  }
  /**
   * @throws ClassCastException if value is not a DGPSCorrectionsValidityPeriod
   */
  public void setExtensionDgpsCorrectionsValidityPeriod(Asn1Object value) {
    extensionDgpsCorrectionsValidityPeriod = (DGPSCorrectionsValidityPeriod) value;
  }
  public void setExtensionDgpsCorrectionsValidityPeriodToNewInstance() {
    extensionDgpsCorrectionsValidityPeriod = new DGPSCorrectionsValidityPeriod();
  }
    

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getGpsEphemerisExtension() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGpsEphemerisExtension();
          }

          @Override public void setToNewInstance() {
            setGpsEphemerisExtensionToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GPSEphemerisExtension.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gpsEphemerisExtension : "
                    + getGpsEphemerisExtension().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getGpsEphemerisExtensionCheck() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGpsEphemerisExtensionCheck();
          }

          @Override public void setToNewInstance() {
            setGpsEphemerisExtensionCheckToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GPSEphemerisExtensionCheck.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gpsEphemerisExtensionCheck : "
                    + getGpsEphemerisExtensionCheck().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      builder.add(new SequenceComponent() {
            @Override public boolean isExplicitlySet() {
              return getExtensionDgpsCorrectionsValidityPeriod() != null;
            }

            @Override public boolean hasDefaultValue() {
              return false;
            }

            @Override public boolean isOptional() {
              return true;
            }

            @Override public Asn1Object getComponentValue() {
              return getExtensionDgpsCorrectionsValidityPeriod();
            }

            @Override public void setToNewInstance() {
              setExtensionDgpsCorrectionsValidityPeriodToNewInstance();
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
              return "dgpsCorrectionsValidityPeriod : "
                  + getExtensionDgpsCorrectionsValidityPeriod().toIndentedString(indent);
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
    builder.append("Add_GPS_ControlHeader = {\n");
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
