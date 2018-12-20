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
public  class A_GNSS_ProvideAssistanceData extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_A_GNSS_ProvideAssistanceData
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public A_GNSS_ProvideAssistanceData() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_A_GNSS_ProvideAssistanceData;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_A_GNSS_ProvideAssistanceData != null) {
      return ImmutableList.of(TAG_A_GNSS_ProvideAssistanceData);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new A_GNSS_ProvideAssistanceData from encoded stream.
   */
  public static A_GNSS_ProvideAssistanceData fromPerUnaligned(byte[] encodedBytes) {
    A_GNSS_ProvideAssistanceData result = new A_GNSS_ProvideAssistanceData();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new A_GNSS_ProvideAssistanceData from encoded stream.
   */
  public static A_GNSS_ProvideAssistanceData fromPerAligned(byte[] encodedBytes) {
    A_GNSS_ProvideAssistanceData result = new A_GNSS_ProvideAssistanceData();
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

  
  private GNSS_CommonAssistData gnss_CommonAssistData_;
  public GNSS_CommonAssistData getGnss_CommonAssistData() {
    return gnss_CommonAssistData_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_CommonAssistData
   */
  public void setGnss_CommonAssistData(Asn1Object value) {
    this.gnss_CommonAssistData_ = (GNSS_CommonAssistData) value;
  }
  public GNSS_CommonAssistData setGnss_CommonAssistDataToNewInstance() {
    gnss_CommonAssistData_ = new GNSS_CommonAssistData();
    return gnss_CommonAssistData_;
  }
  
  private GNSS_GenericAssistData gnss_GenericAssistData_;
  public GNSS_GenericAssistData getGnss_GenericAssistData() {
    return gnss_GenericAssistData_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_GenericAssistData
   */
  public void setGnss_GenericAssistData(Asn1Object value) {
    this.gnss_GenericAssistData_ = (GNSS_GenericAssistData) value;
  }
  public GNSS_GenericAssistData setGnss_GenericAssistDataToNewInstance() {
    gnss_GenericAssistData_ = new GNSS_GenericAssistData();
    return gnss_GenericAssistData_;
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
            return getGnss_CommonAssistData() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_CommonAssistData();
          }

          @Override public void setToNewInstance() {
            setGnss_CommonAssistDataToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_CommonAssistData.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_CommonAssistData : "
                    + getGnss_CommonAssistData().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getGnss_GenericAssistData() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_GenericAssistData();
          }

          @Override public void setToNewInstance() {
            setGnss_GenericAssistDataToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_GenericAssistData.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_GenericAssistData : "
                    + getGnss_GenericAssistData().toIndentedString(indent);
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
    builder.append("A_GNSS_ProvideAssistanceData = {\n");
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
