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
public  class GNSS_CommonAssistanceDataSupport extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GNSS_CommonAssistanceDataSupport
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GNSS_CommonAssistanceDataSupport() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GNSS_CommonAssistanceDataSupport;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GNSS_CommonAssistanceDataSupport != null) {
      return ImmutableList.of(TAG_GNSS_CommonAssistanceDataSupport);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GNSS_CommonAssistanceDataSupport from encoded stream.
   */
  public static GNSS_CommonAssistanceDataSupport fromPerUnaligned(byte[] encodedBytes) {
    GNSS_CommonAssistanceDataSupport result = new GNSS_CommonAssistanceDataSupport();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GNSS_CommonAssistanceDataSupport from encoded stream.
   */
  public static GNSS_CommonAssistanceDataSupport fromPerAligned(byte[] encodedBytes) {
    GNSS_CommonAssistanceDataSupport result = new GNSS_CommonAssistanceDataSupport();
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

  
  private GNSS_ReferenceTimeSupport gnss_ReferenceTimeSupport_;
  public GNSS_ReferenceTimeSupport getGnss_ReferenceTimeSupport() {
    return gnss_ReferenceTimeSupport_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_ReferenceTimeSupport
   */
  public void setGnss_ReferenceTimeSupport(Asn1Object value) {
    this.gnss_ReferenceTimeSupport_ = (GNSS_ReferenceTimeSupport) value;
  }
  public GNSS_ReferenceTimeSupport setGnss_ReferenceTimeSupportToNewInstance() {
    gnss_ReferenceTimeSupport_ = new GNSS_ReferenceTimeSupport();
    return gnss_ReferenceTimeSupport_;
  }
  
  private GNSS_ReferenceLocationSupport gnss_ReferenceLocationSupport_;
  public GNSS_ReferenceLocationSupport getGnss_ReferenceLocationSupport() {
    return gnss_ReferenceLocationSupport_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_ReferenceLocationSupport
   */
  public void setGnss_ReferenceLocationSupport(Asn1Object value) {
    this.gnss_ReferenceLocationSupport_ = (GNSS_ReferenceLocationSupport) value;
  }
  public GNSS_ReferenceLocationSupport setGnss_ReferenceLocationSupportToNewInstance() {
    gnss_ReferenceLocationSupport_ = new GNSS_ReferenceLocationSupport();
    return gnss_ReferenceLocationSupport_;
  }
  
  private GNSS_IonosphericModelSupport gnss_IonosphericModelSupport_;
  public GNSS_IonosphericModelSupport getGnss_IonosphericModelSupport() {
    return gnss_IonosphericModelSupport_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_IonosphericModelSupport
   */
  public void setGnss_IonosphericModelSupport(Asn1Object value) {
    this.gnss_IonosphericModelSupport_ = (GNSS_IonosphericModelSupport) value;
  }
  public GNSS_IonosphericModelSupport setGnss_IonosphericModelSupportToNewInstance() {
    gnss_IonosphericModelSupport_ = new GNSS_IonosphericModelSupport();
    return gnss_IonosphericModelSupport_;
  }
  
  private GNSS_EarthOrientationParametersSupport gnss_EarthOrientationParametersSupport_;
  public GNSS_EarthOrientationParametersSupport getGnss_EarthOrientationParametersSupport() {
    return gnss_EarthOrientationParametersSupport_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_EarthOrientationParametersSupport
   */
  public void setGnss_EarthOrientationParametersSupport(Asn1Object value) {
    this.gnss_EarthOrientationParametersSupport_ = (GNSS_EarthOrientationParametersSupport) value;
  }
  public GNSS_EarthOrientationParametersSupport setGnss_EarthOrientationParametersSupportToNewInstance() {
    gnss_EarthOrientationParametersSupport_ = new GNSS_EarthOrientationParametersSupport();
    return gnss_EarthOrientationParametersSupport_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getGnss_ReferenceTimeSupport() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_ReferenceTimeSupport();
          }

          @Override public void setToNewInstance() {
            setGnss_ReferenceTimeSupportToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_ReferenceTimeSupport.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_ReferenceTimeSupport : "
                    + getGnss_ReferenceTimeSupport().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getGnss_ReferenceLocationSupport() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_ReferenceLocationSupport();
          }

          @Override public void setToNewInstance() {
            setGnss_ReferenceLocationSupportToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_ReferenceLocationSupport.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_ReferenceLocationSupport : "
                    + getGnss_ReferenceLocationSupport().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getGnss_IonosphericModelSupport() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_IonosphericModelSupport();
          }

          @Override public void setToNewInstance() {
            setGnss_IonosphericModelSupportToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_IonosphericModelSupport.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_IonosphericModelSupport : "
                    + getGnss_IonosphericModelSupport().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getGnss_EarthOrientationParametersSupport() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_EarthOrientationParametersSupport();
          }

          @Override public void setToNewInstance() {
            setGnss_EarthOrientationParametersSupportToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_EarthOrientationParametersSupport.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_EarthOrientationParametersSupport : "
                    + getGnss_EarthOrientationParametersSupport().toIndentedString(indent);
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
    builder.append("GNSS_CommonAssistanceDataSupport = {\n");
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
