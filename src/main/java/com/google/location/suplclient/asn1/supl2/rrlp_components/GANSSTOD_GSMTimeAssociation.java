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
public  class GANSSTOD_GSMTimeAssociation extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GANSSTOD_GSMTimeAssociation
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GANSSTOD_GSMTimeAssociation() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GANSSTOD_GSMTimeAssociation;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GANSSTOD_GSMTimeAssociation != null) {
      return ImmutableList.of(TAG_GANSSTOD_GSMTimeAssociation);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GANSSTOD_GSMTimeAssociation from encoded stream.
   */
  public static GANSSTOD_GSMTimeAssociation fromPerUnaligned(byte[] encodedBytes) {
    GANSSTOD_GSMTimeAssociation result = new GANSSTOD_GSMTimeAssociation();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GANSSTOD_GSMTimeAssociation from encoded stream.
   */
  public static GANSSTOD_GSMTimeAssociation fromPerAligned(byte[] encodedBytes) {
    GANSSTOD_GSMTimeAssociation result = new GANSSTOD_GSMTimeAssociation();
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

  
  private BCCHCarrier bcchCarrier_;
  public BCCHCarrier getBcchCarrier() {
    return bcchCarrier_;
  }
  /**
   * @throws ClassCastException if value is not a BCCHCarrier
   */
  public void setBcchCarrier(Asn1Object value) {
    this.bcchCarrier_ = (BCCHCarrier) value;
  }
  public BCCHCarrier setBcchCarrierToNewInstance() {
    bcchCarrier_ = new BCCHCarrier();
    return bcchCarrier_;
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
  
  private FrameNumber frameNumber_;
  public FrameNumber getFrameNumber() {
    return frameNumber_;
  }
  /**
   * @throws ClassCastException if value is not a FrameNumber
   */
  public void setFrameNumber(Asn1Object value) {
    this.frameNumber_ = (FrameNumber) value;
  }
  public FrameNumber setFrameNumberToNewInstance() {
    frameNumber_ = new FrameNumber();
    return frameNumber_;
  }
  
  private TimeSlot timeSlot_;
  public TimeSlot getTimeSlot() {
    return timeSlot_;
  }
  /**
   * @throws ClassCastException if value is not a TimeSlot
   */
  public void setTimeSlot(Asn1Object value) {
    this.timeSlot_ = (TimeSlot) value;
  }
  public TimeSlot setTimeSlotToNewInstance() {
    timeSlot_ = new TimeSlot();
    return timeSlot_;
  }
  
  private BitNumber bitNumber_;
  public BitNumber getBitNumber() {
    return bitNumber_;
  }
  /**
   * @throws ClassCastException if value is not a BitNumber
   */
  public void setBitNumber(Asn1Object value) {
    this.bitNumber_ = (BitNumber) value;
  }
  public BitNumber setBitNumberToNewInstance() {
    bitNumber_ = new BitNumber();
    return bitNumber_;
  }
  
  private FrameDrift frameDrift_;
  public FrameDrift getFrameDrift() {
    return frameDrift_;
  }
  /**
   * @throws ClassCastException if value is not a FrameDrift
   */
  public void setFrameDrift(Asn1Object value) {
    this.frameDrift_ = (FrameDrift) value;
  }
  public FrameDrift setFrameDriftToNewInstance() {
    frameDrift_ = new FrameDrift();
    return frameDrift_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getBcchCarrier() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBcchCarrier();
          }

          @Override public void setToNewInstance() {
            setBcchCarrierToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? BCCHCarrier.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bcchCarrier : "
                    + getBcchCarrier().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

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
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getFrameNumber() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getFrameNumber();
          }

          @Override public void setToNewInstance() {
            setFrameNumberToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? FrameNumber.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "frameNumber : "
                    + getFrameNumber().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getTimeSlot() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getTimeSlot();
          }

          @Override public void setToNewInstance() {
            setTimeSlotToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? TimeSlot.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "timeSlot : "
                    + getTimeSlot().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getBitNumber() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBitNumber();
          }

          @Override public void setToNewInstance() {
            setBitNumberToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? BitNumber.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bitNumber : "
                    + getBitNumber().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getFrameDrift() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getFrameDrift();
          }

          @Override public void setToNewInstance() {
            setFrameDriftToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? FrameDrift.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "frameDrift : "
                    + getFrameDrift().toIndentedString(indent);
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
    builder.append("GANSSTOD_GSMTimeAssociation = {\n");
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
