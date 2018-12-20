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
public  class AssistBTSData extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_AssistBTSData
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public AssistBTSData() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_AssistBTSData;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_AssistBTSData != null) {
      return ImmutableList.of(TAG_AssistBTSData);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new AssistBTSData from encoded stream.
   */
  public static AssistBTSData fromPerUnaligned(byte[] encodedBytes) {
    AssistBTSData result = new AssistBTSData();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new AssistBTSData from encoded stream.
   */
  public static AssistBTSData fromPerAligned(byte[] encodedBytes) {
    AssistBTSData result = new AssistBTSData();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }



  @Override protected boolean isExtensible() {
    return false;
  }

  @Override public boolean containsExtensionValues() {
    for (SequenceComponent extensionComponent : getExtensionComponents()) {
      if (extensionComponent.isExplicitlySet()) return true;
    }
    return false;
  }

  
  private BSIC bsic_;
  public BSIC getBsic() {
    return bsic_;
  }
  /**
   * @throws ClassCastException if value is not a BSIC
   */
  public void setBsic(Asn1Object value) {
    this.bsic_ = (BSIC) value;
  }
  public BSIC setBsicToNewInstance() {
    bsic_ = new BSIC();
    return bsic_;
  }
  
  private MultiFrameOffset multiFrameOffset_;
  public MultiFrameOffset getMultiFrameOffset() {
    return multiFrameOffset_;
  }
  /**
   * @throws ClassCastException if value is not a MultiFrameOffset
   */
  public void setMultiFrameOffset(Asn1Object value) {
    this.multiFrameOffset_ = (MultiFrameOffset) value;
  }
  public MultiFrameOffset setMultiFrameOffsetToNewInstance() {
    multiFrameOffset_ = new MultiFrameOffset();
    return multiFrameOffset_;
  }
  
  private TimeSlotScheme timeSlotScheme_;
  public TimeSlotScheme getTimeSlotScheme() {
    return timeSlotScheme_;
  }
  /**
   * @throws ClassCastException if value is not a TimeSlotScheme
   */
  public void setTimeSlotScheme(Asn1Object value) {
    this.timeSlotScheme_ = (TimeSlotScheme) value;
  }
  public TimeSlotScheme setTimeSlotSchemeToNewInstance() {
    timeSlotScheme_ = new TimeSlotScheme();
    return timeSlotScheme_;
  }
  
  private RoughRTD roughRTD_;
  public RoughRTD getRoughRTD() {
    return roughRTD_;
  }
  /**
   * @throws ClassCastException if value is not a RoughRTD
   */
  public void setRoughRTD(Asn1Object value) {
    this.roughRTD_ = (RoughRTD) value;
  }
  public RoughRTD setRoughRTDToNewInstance() {
    roughRTD_ = new RoughRTD();
    return roughRTD_;
  }
  
  private CalcAssistanceBTS calcAssistanceBTS_;
  public CalcAssistanceBTS getCalcAssistanceBTS() {
    return calcAssistanceBTS_;
  }
  /**
   * @throws ClassCastException if value is not a CalcAssistanceBTS
   */
  public void setCalcAssistanceBTS(Asn1Object value) {
    this.calcAssistanceBTS_ = (CalcAssistanceBTS) value;
  }
  public CalcAssistanceBTS setCalcAssistanceBTSToNewInstance() {
    calcAssistanceBTS_ = new CalcAssistanceBTS();
    return calcAssistanceBTS_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getBsic() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBsic();
          }

          @Override public void setToNewInstance() {
            setBsicToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? BSIC.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bsic : "
                    + getBsic().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getMultiFrameOffset() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getMultiFrameOffset();
          }

          @Override public void setToNewInstance() {
            setMultiFrameOffsetToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? MultiFrameOffset.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "multiFrameOffset : "
                    + getMultiFrameOffset().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getTimeSlotScheme() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getTimeSlotScheme();
          }

          @Override public void setToNewInstance() {
            setTimeSlotSchemeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? TimeSlotScheme.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "timeSlotScheme : "
                    + getTimeSlotScheme().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getRoughRTD() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getRoughRTD();
          }

          @Override public void setToNewInstance() {
            setRoughRTDToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? RoughRTD.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "roughRTD : "
                    + getRoughRTD().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getCalcAssistanceBTS() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getCalcAssistanceBTS();
          }

          @Override public void setToNewInstance() {
            setCalcAssistanceBTSToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? CalcAssistanceBTS.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "calcAssistanceBTS : "
                    + getCalcAssistanceBTS().toIndentedString(indent);
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
    builder.append("AssistBTSData = {\n");
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
