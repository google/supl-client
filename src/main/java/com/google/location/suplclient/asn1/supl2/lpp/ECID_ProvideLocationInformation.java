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
public  class ECID_ProvideLocationInformation extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_ECID_ProvideLocationInformation
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ECID_ProvideLocationInformation() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ECID_ProvideLocationInformation;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ECID_ProvideLocationInformation != null) {
      return ImmutableList.of(TAG_ECID_ProvideLocationInformation);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ECID_ProvideLocationInformation from encoded stream.
   */
  public static ECID_ProvideLocationInformation fromPerUnaligned(byte[] encodedBytes) {
    ECID_ProvideLocationInformation result = new ECID_ProvideLocationInformation();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ECID_ProvideLocationInformation from encoded stream.
   */
  public static ECID_ProvideLocationInformation fromPerAligned(byte[] encodedBytes) {
    ECID_ProvideLocationInformation result = new ECID_ProvideLocationInformation();
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

  
  private ECID_SignalMeasurementInformation ecid_SignalMeasurementInformation_;
  public ECID_SignalMeasurementInformation getEcid_SignalMeasurementInformation() {
    return ecid_SignalMeasurementInformation_;
  }
  /**
   * @throws ClassCastException if value is not a ECID_SignalMeasurementInformation
   */
  public void setEcid_SignalMeasurementInformation(Asn1Object value) {
    this.ecid_SignalMeasurementInformation_ = (ECID_SignalMeasurementInformation) value;
  }
  public ECID_SignalMeasurementInformation setEcid_SignalMeasurementInformationToNewInstance() {
    ecid_SignalMeasurementInformation_ = new ECID_SignalMeasurementInformation();
    return ecid_SignalMeasurementInformation_;
  }
  
  private ECID_Error ecid_Error_;
  public ECID_Error getEcid_Error() {
    return ecid_Error_;
  }
  /**
   * @throws ClassCastException if value is not a ECID_Error
   */
  public void setEcid_Error(Asn1Object value) {
    this.ecid_Error_ = (ECID_Error) value;
  }
  public ECID_Error setEcid_ErrorToNewInstance() {
    ecid_Error_ = new ECID_Error();
    return ecid_Error_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getEcid_SignalMeasurementInformation() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getEcid_SignalMeasurementInformation();
          }

          @Override public void setToNewInstance() {
            setEcid_SignalMeasurementInformationToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ECID_SignalMeasurementInformation.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ecid_SignalMeasurementInformation : "
                    + getEcid_SignalMeasurementInformation().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getEcid_Error() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getEcid_Error();
          }

          @Override public void setToNewInstance() {
            setEcid_ErrorToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ECID_Error.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ecid_Error : "
                    + getEcid_Error().toIndentedString(indent);
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
    builder.append("ECID_ProvideLocationInformation = {\n");
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
