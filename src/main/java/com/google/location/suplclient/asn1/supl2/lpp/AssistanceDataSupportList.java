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
public  class AssistanceDataSupportList extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_AssistanceDataSupportList
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public AssistanceDataSupportList() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_AssistanceDataSupportList;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_AssistanceDataSupportList != null) {
      return ImmutableList.of(TAG_AssistanceDataSupportList);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new AssistanceDataSupportList from encoded stream.
   */
  public static AssistanceDataSupportList fromPerUnaligned(byte[] encodedBytes) {
    AssistanceDataSupportList result = new AssistanceDataSupportList();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new AssistanceDataSupportList from encoded stream.
   */
  public static AssistanceDataSupportList fromPerAligned(byte[] encodedBytes) {
    AssistanceDataSupportList result = new AssistanceDataSupportList();
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

  
  private GNSS_CommonAssistanceDataSupport gnss_CommonAssistanceDataSupport_;
  public GNSS_CommonAssistanceDataSupport getGnss_CommonAssistanceDataSupport() {
    return gnss_CommonAssistanceDataSupport_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_CommonAssistanceDataSupport
   */
  public void setGnss_CommonAssistanceDataSupport(Asn1Object value) {
    this.gnss_CommonAssistanceDataSupport_ = (GNSS_CommonAssistanceDataSupport) value;
  }
  public GNSS_CommonAssistanceDataSupport setGnss_CommonAssistanceDataSupportToNewInstance() {
    gnss_CommonAssistanceDataSupport_ = new GNSS_CommonAssistanceDataSupport();
    return gnss_CommonAssistanceDataSupport_;
  }
  
  private GNSS_GenericAssistanceDataSupport gnss_GenericAssistanceDataSupport_;
  public GNSS_GenericAssistanceDataSupport getGnss_GenericAssistanceDataSupport() {
    return gnss_GenericAssistanceDataSupport_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_GenericAssistanceDataSupport
   */
  public void setGnss_GenericAssistanceDataSupport(Asn1Object value) {
    this.gnss_GenericAssistanceDataSupport_ = (GNSS_GenericAssistanceDataSupport) value;
  }
  public GNSS_GenericAssistanceDataSupport setGnss_GenericAssistanceDataSupportToNewInstance() {
    gnss_GenericAssistanceDataSupport_ = new GNSS_GenericAssistanceDataSupport();
    return gnss_GenericAssistanceDataSupport_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getGnss_CommonAssistanceDataSupport() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_CommonAssistanceDataSupport();
          }

          @Override public void setToNewInstance() {
            setGnss_CommonAssistanceDataSupportToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_CommonAssistanceDataSupport.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_CommonAssistanceDataSupport : "
                    + getGnss_CommonAssistanceDataSupport().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getGnss_GenericAssistanceDataSupport() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_GenericAssistanceDataSupport();
          }

          @Override public void setToNewInstance() {
            setGnss_GenericAssistanceDataSupportToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_GenericAssistanceDataSupport.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_GenericAssistanceDataSupport : "
                    + getGnss_GenericAssistanceDataSupport().toIndentedString(indent);
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
    builder.append("AssistanceDataSupportList = {\n");
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
