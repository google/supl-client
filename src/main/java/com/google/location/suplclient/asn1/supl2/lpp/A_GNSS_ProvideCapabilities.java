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
public  class A_GNSS_ProvideCapabilities extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_A_GNSS_ProvideCapabilities
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public A_GNSS_ProvideCapabilities() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_A_GNSS_ProvideCapabilities;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_A_GNSS_ProvideCapabilities != null) {
      return ImmutableList.of(TAG_A_GNSS_ProvideCapabilities);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new A_GNSS_ProvideCapabilities from encoded stream.
   */
  public static A_GNSS_ProvideCapabilities fromPerUnaligned(byte[] encodedBytes) {
    A_GNSS_ProvideCapabilities result = new A_GNSS_ProvideCapabilities();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new A_GNSS_ProvideCapabilities from encoded stream.
   */
  public static A_GNSS_ProvideCapabilities fromPerAligned(byte[] encodedBytes) {
    A_GNSS_ProvideCapabilities result = new A_GNSS_ProvideCapabilities();
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

  
  private GNSS_SupportList gnss_SupportList_;
  public GNSS_SupportList getGnss_SupportList() {
    return gnss_SupportList_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_SupportList
   */
  public void setGnss_SupportList(Asn1Object value) {
    this.gnss_SupportList_ = (GNSS_SupportList) value;
  }
  public GNSS_SupportList setGnss_SupportListToNewInstance() {
    gnss_SupportList_ = new GNSS_SupportList();
    return gnss_SupportList_;
  }
  
  private AssistanceDataSupportList assistanceDataSupportList_;
  public AssistanceDataSupportList getAssistanceDataSupportList() {
    return assistanceDataSupportList_;
  }
  /**
   * @throws ClassCastException if value is not a AssistanceDataSupportList
   */
  public void setAssistanceDataSupportList(Asn1Object value) {
    this.assistanceDataSupportList_ = (AssistanceDataSupportList) value;
  }
  public AssistanceDataSupportList setAssistanceDataSupportListToNewInstance() {
    assistanceDataSupportList_ = new AssistanceDataSupportList();
    return assistanceDataSupportList_;
  }
  
  private LocationCoordinateTypes locationCoordinateTypes_;
  public LocationCoordinateTypes getLocationCoordinateTypes() {
    return locationCoordinateTypes_;
  }
  /**
   * @throws ClassCastException if value is not a LocationCoordinateTypes
   */
  public void setLocationCoordinateTypes(Asn1Object value) {
    this.locationCoordinateTypes_ = (LocationCoordinateTypes) value;
  }
  public LocationCoordinateTypes setLocationCoordinateTypesToNewInstance() {
    locationCoordinateTypes_ = new LocationCoordinateTypes();
    return locationCoordinateTypes_;
  }
  
  private VelocityTypes velocityTypes_;
  public VelocityTypes getVelocityTypes() {
    return velocityTypes_;
  }
  /**
   * @throws ClassCastException if value is not a VelocityTypes
   */
  public void setVelocityTypes(Asn1Object value) {
    this.velocityTypes_ = (VelocityTypes) value;
  }
  public VelocityTypes setVelocityTypesToNewInstance() {
    velocityTypes_ = new VelocityTypes();
    return velocityTypes_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getGnss_SupportList() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_SupportList();
          }

          @Override public void setToNewInstance() {
            setGnss_SupportListToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_SupportList.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_SupportList : "
                    + getGnss_SupportList().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getAssistanceDataSupportList() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getAssistanceDataSupportList();
          }

          @Override public void setToNewInstance() {
            setAssistanceDataSupportListToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? AssistanceDataSupportList.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "assistanceDataSupportList : "
                    + getAssistanceDataSupportList().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getLocationCoordinateTypes() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getLocationCoordinateTypes();
          }

          @Override public void setToNewInstance() {
            setLocationCoordinateTypesToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? LocationCoordinateTypes.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "locationCoordinateTypes : "
                    + getLocationCoordinateTypes().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getVelocityTypes() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getVelocityTypes();
          }

          @Override public void setToNewInstance() {
            setVelocityTypesToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? VelocityTypes.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "velocityTypes : "
                    + getVelocityTypes().toIndentedString(indent);
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
    builder.append("A_GNSS_ProvideCapabilities = {\n");
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
