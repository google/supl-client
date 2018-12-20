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
public  class GANSSEphemerisExtensionCheck extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GANSSEphemerisExtensionCheck
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GANSSEphemerisExtensionCheck() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GANSSEphemerisExtensionCheck;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GANSSEphemerisExtensionCheck != null) {
      return ImmutableList.of(TAG_GANSSEphemerisExtensionCheck);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GANSSEphemerisExtensionCheck from encoded stream.
   */
  public static GANSSEphemerisExtensionCheck fromPerUnaligned(byte[] encodedBytes) {
    GANSSEphemerisExtensionCheck result = new GANSSEphemerisExtensionCheck();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GANSSEphemerisExtensionCheck from encoded stream.
   */
  public static GANSSEphemerisExtensionCheck fromPerAligned(byte[] encodedBytes) {
    GANSSEphemerisExtensionCheck result = new GANSSEphemerisExtensionCheck();
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

  
  private GANSSEphemerisExtensionTime ganssBeginTime_;
  public GANSSEphemerisExtensionTime getGanssBeginTime() {
    return ganssBeginTime_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSEphemerisExtensionTime
   */
  public void setGanssBeginTime(Asn1Object value) {
    this.ganssBeginTime_ = (GANSSEphemerisExtensionTime) value;
  }
  public GANSSEphemerisExtensionTime setGanssBeginTimeToNewInstance() {
    ganssBeginTime_ = new GANSSEphemerisExtensionTime();
    return ganssBeginTime_;
  }
  
  private GANSSEphemerisExtensionTime ganssEndTime_;
  public GANSSEphemerisExtensionTime getGanssEndTime() {
    return ganssEndTime_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSEphemerisExtensionTime
   */
  public void setGanssEndTime(Asn1Object value) {
    this.ganssEndTime_ = (GANSSEphemerisExtensionTime) value;
  }
  public GANSSEphemerisExtensionTime setGanssEndTimeToNewInstance() {
    ganssEndTime_ = new GANSSEphemerisExtensionTime();
    return ganssEndTime_;
  }
  
  private GANSSSatEventsInfo ganssSatEventsInfo_;
  public GANSSSatEventsInfo getGanssSatEventsInfo() {
    return ganssSatEventsInfo_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSSatEventsInfo
   */
  public void setGanssSatEventsInfo(Asn1Object value) {
    this.ganssSatEventsInfo_ = (GANSSSatEventsInfo) value;
  }
  public GANSSSatEventsInfo setGanssSatEventsInfoToNewInstance() {
    ganssSatEventsInfo_ = new GANSSSatEventsInfo();
    return ganssSatEventsInfo_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getGanssBeginTime() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssBeginTime();
          }

          @Override public void setToNewInstance() {
            setGanssBeginTimeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSEphemerisExtensionTime.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssBeginTime : "
                    + getGanssBeginTime().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getGanssEndTime() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssEndTime();
          }

          @Override public void setToNewInstance() {
            setGanssEndTimeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSEphemerisExtensionTime.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssEndTime : "
                    + getGanssEndTime().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getGanssSatEventsInfo() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssSatEventsInfo();
          }

          @Override public void setToNewInstance() {
            setGanssSatEventsInfoToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSSatEventsInfo.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssSatEventsInfo : "
                    + getGanssSatEventsInfo().toIndentedString(indent);
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
    builder.append("GANSSEphemerisExtensionCheck = {\n");
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
