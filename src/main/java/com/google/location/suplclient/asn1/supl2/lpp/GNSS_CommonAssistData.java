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
public  class GNSS_CommonAssistData extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GNSS_CommonAssistData
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GNSS_CommonAssistData() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GNSS_CommonAssistData;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GNSS_CommonAssistData != null) {
      return ImmutableList.of(TAG_GNSS_CommonAssistData);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GNSS_CommonAssistData from encoded stream.
   */
  public static GNSS_CommonAssistData fromPerUnaligned(byte[] encodedBytes) {
    GNSS_CommonAssistData result = new GNSS_CommonAssistData();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GNSS_CommonAssistData from encoded stream.
   */
  public static GNSS_CommonAssistData fromPerAligned(byte[] encodedBytes) {
    GNSS_CommonAssistData result = new GNSS_CommonAssistData();
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

  
  private GNSS_ReferenceTime gnss_ReferenceTime_;
  public GNSS_ReferenceTime getGnss_ReferenceTime() {
    return gnss_ReferenceTime_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_ReferenceTime
   */
  public void setGnss_ReferenceTime(Asn1Object value) {
    this.gnss_ReferenceTime_ = (GNSS_ReferenceTime) value;
  }
  public GNSS_ReferenceTime setGnss_ReferenceTimeToNewInstance() {
    gnss_ReferenceTime_ = new GNSS_ReferenceTime();
    return gnss_ReferenceTime_;
  }
  
  private GNSS_ReferenceLocation gnss_ReferenceLocation_;
  public GNSS_ReferenceLocation getGnss_ReferenceLocation() {
    return gnss_ReferenceLocation_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_ReferenceLocation
   */
  public void setGnss_ReferenceLocation(Asn1Object value) {
    this.gnss_ReferenceLocation_ = (GNSS_ReferenceLocation) value;
  }
  public GNSS_ReferenceLocation setGnss_ReferenceLocationToNewInstance() {
    gnss_ReferenceLocation_ = new GNSS_ReferenceLocation();
    return gnss_ReferenceLocation_;
  }
  
  private GNSS_IonosphericModel gnss_IonosphericModel_;
  public GNSS_IonosphericModel getGnss_IonosphericModel() {
    return gnss_IonosphericModel_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_IonosphericModel
   */
  public void setGnss_IonosphericModel(Asn1Object value) {
    this.gnss_IonosphericModel_ = (GNSS_IonosphericModel) value;
  }
  public GNSS_IonosphericModel setGnss_IonosphericModelToNewInstance() {
    gnss_IonosphericModel_ = new GNSS_IonosphericModel();
    return gnss_IonosphericModel_;
  }
  
  private GNSS_EarthOrientationParameters gnss_EarthOrientationParameters_;
  public GNSS_EarthOrientationParameters getGnss_EarthOrientationParameters() {
    return gnss_EarthOrientationParameters_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_EarthOrientationParameters
   */
  public void setGnss_EarthOrientationParameters(Asn1Object value) {
    this.gnss_EarthOrientationParameters_ = (GNSS_EarthOrientationParameters) value;
  }
  public GNSS_EarthOrientationParameters setGnss_EarthOrientationParametersToNewInstance() {
    gnss_EarthOrientationParameters_ = new GNSS_EarthOrientationParameters();
    return gnss_EarthOrientationParameters_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getGnss_ReferenceTime() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_ReferenceTime();
          }

          @Override public void setToNewInstance() {
            setGnss_ReferenceTimeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_ReferenceTime.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_ReferenceTime : "
                    + getGnss_ReferenceTime().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getGnss_ReferenceLocation() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_ReferenceLocation();
          }

          @Override public void setToNewInstance() {
            setGnss_ReferenceLocationToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_ReferenceLocation.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_ReferenceLocation : "
                    + getGnss_ReferenceLocation().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getGnss_IonosphericModel() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_IonosphericModel();
          }

          @Override public void setToNewInstance() {
            setGnss_IonosphericModelToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_IonosphericModel.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_IonosphericModel : "
                    + getGnss_IonosphericModel().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getGnss_EarthOrientationParameters() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_EarthOrientationParameters();
          }

          @Override public void setToNewInstance() {
            setGnss_EarthOrientationParametersToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_EarthOrientationParameters.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_EarthOrientationParameters : "
                    + getGnss_EarthOrientationParameters().toIndentedString(indent);
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
    builder.append("GNSS_CommonAssistData = {\n");
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
