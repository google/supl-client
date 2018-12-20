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

package com.google.location.suplclient.asn1.supl2.ulp_version_2_parameter_extensions;

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
public  class Ver2_RequestedAssistData_extension extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_Ver2_RequestedAssistData_extension
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public Ver2_RequestedAssistData_extension() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_Ver2_RequestedAssistData_extension;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_Ver2_RequestedAssistData_extension != null) {
      return ImmutableList.of(TAG_Ver2_RequestedAssistData_extension);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new Ver2_RequestedAssistData_extension from encoded stream.
   */
  public static Ver2_RequestedAssistData_extension fromPerUnaligned(byte[] encodedBytes) {
    Ver2_RequestedAssistData_extension result = new Ver2_RequestedAssistData_extension();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new Ver2_RequestedAssistData_extension from encoded stream.
   */
  public static Ver2_RequestedAssistData_extension fromPerAligned(byte[] encodedBytes) {
    Ver2_RequestedAssistData_extension result = new Ver2_RequestedAssistData_extension();
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

  
  private GanssRequestedCommonAssistanceDataList ganssRequestedCommonAssistanceDataList_;
  public GanssRequestedCommonAssistanceDataList getGanssRequestedCommonAssistanceDataList() {
    return ganssRequestedCommonAssistanceDataList_;
  }
  /**
   * @throws ClassCastException if value is not a GanssRequestedCommonAssistanceDataList
   */
  public void setGanssRequestedCommonAssistanceDataList(Asn1Object value) {
    this.ganssRequestedCommonAssistanceDataList_ = (GanssRequestedCommonAssistanceDataList) value;
  }
  public GanssRequestedCommonAssistanceDataList setGanssRequestedCommonAssistanceDataListToNewInstance() {
    ganssRequestedCommonAssistanceDataList_ = new GanssRequestedCommonAssistanceDataList();
    return ganssRequestedCommonAssistanceDataList_;
  }
  
  private GanssRequestedGenericAssistanceDataList ganssRequestedGenericAssistanceDataList_;
  public GanssRequestedGenericAssistanceDataList getGanssRequestedGenericAssistanceDataList() {
    return ganssRequestedGenericAssistanceDataList_;
  }
  /**
   * @throws ClassCastException if value is not a GanssRequestedGenericAssistanceDataList
   */
  public void setGanssRequestedGenericAssistanceDataList(Asn1Object value) {
    this.ganssRequestedGenericAssistanceDataList_ = (GanssRequestedGenericAssistanceDataList) value;
  }
  public GanssRequestedGenericAssistanceDataList setGanssRequestedGenericAssistanceDataListToNewInstance() {
    ganssRequestedGenericAssistanceDataList_ = new GanssRequestedGenericAssistanceDataList();
    return ganssRequestedGenericAssistanceDataList_;
  }
  
  private ExtendedEphemeris extendedEphemeris_;
  public ExtendedEphemeris getExtendedEphemeris() {
    return extendedEphemeris_;
  }
  /**
   * @throws ClassCastException if value is not a ExtendedEphemeris
   */
  public void setExtendedEphemeris(Asn1Object value) {
    this.extendedEphemeris_ = (ExtendedEphemeris) value;
  }
  public ExtendedEphemeris setExtendedEphemerisToNewInstance() {
    extendedEphemeris_ = new ExtendedEphemeris();
    return extendedEphemeris_;
  }
  
  private ExtendedEphCheck extendedEphemerisCheck_;
  public ExtendedEphCheck getExtendedEphemerisCheck() {
    return extendedEphemerisCheck_;
  }
  /**
   * @throws ClassCastException if value is not a ExtendedEphCheck
   */
  public void setExtendedEphemerisCheck(Asn1Object value) {
    this.extendedEphemerisCheck_ = (ExtendedEphCheck) value;
  }
  public ExtendedEphCheck setExtendedEphemerisCheckToNewInstance() {
    extendedEphemerisCheck_ = new ExtendedEphCheck();
    return extendedEphemerisCheck_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getGanssRequestedCommonAssistanceDataList() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssRequestedCommonAssistanceDataList();
          }

          @Override public void setToNewInstance() {
            setGanssRequestedCommonAssistanceDataListToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GanssRequestedCommonAssistanceDataList.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssRequestedCommonAssistanceDataList : "
                    + getGanssRequestedCommonAssistanceDataList().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getGanssRequestedGenericAssistanceDataList() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssRequestedGenericAssistanceDataList();
          }

          @Override public void setToNewInstance() {
            setGanssRequestedGenericAssistanceDataListToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GanssRequestedGenericAssistanceDataList.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssRequestedGenericAssistanceDataList : "
                    + getGanssRequestedGenericAssistanceDataList().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getExtendedEphemeris() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getExtendedEphemeris();
          }

          @Override public void setToNewInstance() {
            setExtendedEphemerisToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ExtendedEphemeris.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "extendedEphemeris : "
                    + getExtendedEphemeris().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getExtendedEphemerisCheck() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getExtendedEphemerisCheck();
          }

          @Override public void setToNewInstance() {
            setExtendedEphemerisCheckToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ExtendedEphCheck.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "extendedEphemerisCheck : "
                    + getExtendedEphemerisCheck().toIndentedString(indent);
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
    builder.append("Ver2_RequestedAssistData_extension = {\n");
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
