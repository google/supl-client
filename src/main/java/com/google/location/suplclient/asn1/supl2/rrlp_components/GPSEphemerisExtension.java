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
public  class GPSEphemerisExtension extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GPSEphemerisExtension
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GPSEphemerisExtension() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GPSEphemerisExtension;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GPSEphemerisExtension != null) {
      return ImmutableList.of(TAG_GPSEphemerisExtension);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GPSEphemerisExtension from encoded stream.
   */
  public static GPSEphemerisExtension fromPerUnaligned(byte[] encodedBytes) {
    GPSEphemerisExtension result = new GPSEphemerisExtension();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GPSEphemerisExtension from encoded stream.
   */
  public static GPSEphemerisExtension fromPerAligned(byte[] encodedBytes) {
    GPSEphemerisExtension result = new GPSEphemerisExtension();
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

  
  private GPSEphemerisExtensionHeader gpsEphemerisHeader_;
  public GPSEphemerisExtensionHeader getGpsEphemerisHeader() {
    return gpsEphemerisHeader_;
  }
  /**
   * @throws ClassCastException if value is not a GPSEphemerisExtensionHeader
   */
  public void setGpsEphemerisHeader(Asn1Object value) {
    this.gpsEphemerisHeader_ = (GPSEphemerisExtensionHeader) value;
  }
  public GPSEphemerisExtensionHeader setGpsEphemerisHeaderToNewInstance() {
    gpsEphemerisHeader_ = new GPSEphemerisExtensionHeader();
    return gpsEphemerisHeader_;
  }
  
  private SeqOfGPSRefOrbit gpsReferenceSet_;
  public SeqOfGPSRefOrbit getGpsReferenceSet() {
    return gpsReferenceSet_;
  }
  /**
   * @throws ClassCastException if value is not a SeqOfGPSRefOrbit
   */
  public void setGpsReferenceSet(Asn1Object value) {
    this.gpsReferenceSet_ = (SeqOfGPSRefOrbit) value;
  }
  public SeqOfGPSRefOrbit setGpsReferenceSetToNewInstance() {
    gpsReferenceSet_ = new SeqOfGPSRefOrbit();
    return gpsReferenceSet_;
  }
  
  private GPSEphemerisDeltaMatrix gpsephemerisDeltaMatrix_;
  public GPSEphemerisDeltaMatrix getGpsephemerisDeltaMatrix() {
    return gpsephemerisDeltaMatrix_;
  }
  /**
   * @throws ClassCastException if value is not a GPSEphemerisDeltaMatrix
   */
  public void setGpsephemerisDeltaMatrix(Asn1Object value) {
    this.gpsephemerisDeltaMatrix_ = (GPSEphemerisDeltaMatrix) value;
  }
  public GPSEphemerisDeltaMatrix setGpsephemerisDeltaMatrixToNewInstance() {
    gpsephemerisDeltaMatrix_ = new GPSEphemerisDeltaMatrix();
    return gpsephemerisDeltaMatrix_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getGpsEphemerisHeader() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGpsEphemerisHeader();
          }

          @Override public void setToNewInstance() {
            setGpsEphemerisHeaderToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GPSEphemerisExtensionHeader.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gpsEphemerisHeader : "
                    + getGpsEphemerisHeader().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getGpsReferenceSet() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGpsReferenceSet();
          }

          @Override public void setToNewInstance() {
            setGpsReferenceSetToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SeqOfGPSRefOrbit.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gpsReferenceSet : "
                    + getGpsReferenceSet().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getGpsephemerisDeltaMatrix() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGpsephemerisDeltaMatrix();
          }

          @Override public void setToNewInstance() {
            setGpsephemerisDeltaMatrixToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GPSEphemerisDeltaMatrix.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gpsephemerisDeltaMatrix : "
                    + getGpsephemerisDeltaMatrix().toIndentedString(indent);
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
    builder.append("GPSEphemerisExtension = {\n");
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
