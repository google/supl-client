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
public  class A_GNSS_ProvideLocationInformation extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_A_GNSS_ProvideLocationInformation
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public A_GNSS_ProvideLocationInformation() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_A_GNSS_ProvideLocationInformation;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_A_GNSS_ProvideLocationInformation != null) {
      return ImmutableList.of(TAG_A_GNSS_ProvideLocationInformation);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new A_GNSS_ProvideLocationInformation from encoded stream.
   */
  public static A_GNSS_ProvideLocationInformation fromPerUnaligned(byte[] encodedBytes) {
    A_GNSS_ProvideLocationInformation result = new A_GNSS_ProvideLocationInformation();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new A_GNSS_ProvideLocationInformation from encoded stream.
   */
  public static A_GNSS_ProvideLocationInformation fromPerAligned(byte[] encodedBytes) {
    A_GNSS_ProvideLocationInformation result = new A_GNSS_ProvideLocationInformation();
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

  
  private GNSS_SignalMeasurementInformation gnss_SignalMeasurementInformation_;
  public GNSS_SignalMeasurementInformation getGnss_SignalMeasurementInformation() {
    return gnss_SignalMeasurementInformation_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_SignalMeasurementInformation
   */
  public void setGnss_SignalMeasurementInformation(Asn1Object value) {
    this.gnss_SignalMeasurementInformation_ = (GNSS_SignalMeasurementInformation) value;
  }
  public GNSS_SignalMeasurementInformation setGnss_SignalMeasurementInformationToNewInstance() {
    gnss_SignalMeasurementInformation_ = new GNSS_SignalMeasurementInformation();
    return gnss_SignalMeasurementInformation_;
  }
  
  private GNSS_LocationInformation gnss_LocationInformation_;
  public GNSS_LocationInformation getGnss_LocationInformation() {
    return gnss_LocationInformation_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_LocationInformation
   */
  public void setGnss_LocationInformation(Asn1Object value) {
    this.gnss_LocationInformation_ = (GNSS_LocationInformation) value;
  }
  public GNSS_LocationInformation setGnss_LocationInformationToNewInstance() {
    gnss_LocationInformation_ = new GNSS_LocationInformation();
    return gnss_LocationInformation_;
  }
  
  private A_GNSS_Error gnss_Error_;
  public A_GNSS_Error getGnss_Error() {
    return gnss_Error_;
  }
  /**
   * @throws ClassCastException if value is not a A_GNSS_Error
   */
  public void setGnss_Error(Asn1Object value) {
    this.gnss_Error_ = (A_GNSS_Error) value;
  }
  public A_GNSS_Error setGnss_ErrorToNewInstance() {
    gnss_Error_ = new A_GNSS_Error();
    return gnss_Error_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getGnss_SignalMeasurementInformation() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_SignalMeasurementInformation();
          }

          @Override public void setToNewInstance() {
            setGnss_SignalMeasurementInformationToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_SignalMeasurementInformation.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_SignalMeasurementInformation : "
                    + getGnss_SignalMeasurementInformation().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getGnss_LocationInformation() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_LocationInformation();
          }

          @Override public void setToNewInstance() {
            setGnss_LocationInformationToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_LocationInformation.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_LocationInformation : "
                    + getGnss_LocationInformation().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getGnss_Error() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_Error();
          }

          @Override public void setToNewInstance() {
            setGnss_ErrorToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? A_GNSS_Error.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_Error : "
                    + getGnss_Error().toIndentedString(indent);
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
    builder.append("A_GNSS_ProvideLocationInformation = {\n");
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
