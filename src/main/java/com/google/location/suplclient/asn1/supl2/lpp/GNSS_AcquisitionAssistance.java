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
import com.google.location.suplclient.asn1.base.Asn1Integer;
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
public  class GNSS_AcquisitionAssistance extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GNSS_AcquisitionAssistance
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GNSS_AcquisitionAssistance() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GNSS_AcquisitionAssistance;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GNSS_AcquisitionAssistance != null) {
      return ImmutableList.of(TAG_GNSS_AcquisitionAssistance);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GNSS_AcquisitionAssistance from encoded stream.
   */
  public static GNSS_AcquisitionAssistance fromPerUnaligned(byte[] encodedBytes) {
    GNSS_AcquisitionAssistance result = new GNSS_AcquisitionAssistance();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GNSS_AcquisitionAssistance from encoded stream.
   */
  public static GNSS_AcquisitionAssistance fromPerAligned(byte[] encodedBytes) {
    GNSS_AcquisitionAssistance result = new GNSS_AcquisitionAssistance();
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

  
  private GNSS_SignalID gnss_SignalID_;
  public GNSS_SignalID getGnss_SignalID() {
    return gnss_SignalID_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_SignalID
   */
  public void setGnss_SignalID(Asn1Object value) {
    this.gnss_SignalID_ = (GNSS_SignalID) value;
  }
  public GNSS_SignalID setGnss_SignalIDToNewInstance() {
    gnss_SignalID_ = new GNSS_SignalID();
    return gnss_SignalID_;
  }
  
  private GNSS_AcquisitionAssistList gnss_AcquisitionAssistList_;
  public GNSS_AcquisitionAssistList getGnss_AcquisitionAssistList() {
    return gnss_AcquisitionAssistList_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_AcquisitionAssistList
   */
  public void setGnss_AcquisitionAssistList(Asn1Object value) {
    this.gnss_AcquisitionAssistList_ = (GNSS_AcquisitionAssistList) value;
  }
  public GNSS_AcquisitionAssistList setGnss_AcquisitionAssistListToNewInstance() {
    gnss_AcquisitionAssistList_ = new GNSS_AcquisitionAssistList();
    return gnss_AcquisitionAssistList_;
  }
  

  
  private GNSS_AcquisitionAssistance.confidence_r10Type  extensionConfidence_r10;
  public GNSS_AcquisitionAssistance.confidence_r10Type getExtensionConfidence_r10() {
    return extensionConfidence_r10;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_AcquisitionAssistance.confidence_r10Type
   */
  public void setExtensionConfidence_r10(Asn1Object value) {
    extensionConfidence_r10 = (GNSS_AcquisitionAssistance.confidence_r10Type) value;
  }
  public void setExtensionConfidence_r10ToNewInstance() {
    extensionConfidence_r10 = new GNSS_AcquisitionAssistance.confidence_r10Type();
  }
    

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getGnss_SignalID() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_SignalID();
          }

          @Override public void setToNewInstance() {
            setGnss_SignalIDToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_SignalID.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_SignalID : "
                    + getGnss_SignalID().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getGnss_AcquisitionAssistList() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_AcquisitionAssistList();
          }

          @Override public void setToNewInstance() {
            setGnss_AcquisitionAssistListToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_AcquisitionAssistList.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_AcquisitionAssistList : "
                    + getGnss_AcquisitionAssistList().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      builder.add(new SequenceComponent() {
            @Override public boolean isExplicitlySet() {
              return getExtensionConfidence_r10() != null;
            }

            @Override public boolean hasDefaultValue() {
              return false;
            }

            @Override public boolean isOptional() {
              return true;
            }

            @Override public Asn1Object getComponentValue() {
              return getExtensionConfidence_r10();
            }

            @Override public void setToNewInstance() {
              setExtensionConfidence_r10ToNewInstance();
            }

            @Override public Collection<Asn1Tag> getPossibleFirstTags() {
              throw new UnsupportedOperationException(
                  "BER decoding not supported for extension elements");
            }

            @Override
            public Asn1Tag getTag() {
              throw new UnsupportedOperationException(
                  "BER is not supported for extension elements");
            }

            @Override
            public boolean isImplicitTagging() {
              throw new UnsupportedOperationException(
                  "BER is not supported for extension elements");
            }

            @Override public String toIndentedString(String indent) {
              return "confidence_r10 : "
                  + getExtensionConfidence_r10().toIndentedString(indent);
            }
      });
      
      return builder.build();
    }

  
  
  
  
  

    
    // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class confidence_r10Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_confidence_r10Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public confidence_r10Type() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("100"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_confidence_r10Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_confidence_r10Type != null) {
      return ImmutableList.of(TAG_confidence_r10Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new confidence_r10Type from encoded stream.
   */
  public static confidence_r10Type fromPerUnaligned(byte[] encodedBytes) {
    confidence_r10Type result = new confidence_r10Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new confidence_r10Type from encoded stream.
   */
  public static confidence_r10Type fromPerAligned(byte[] encodedBytes) {
    confidence_r10Type result = new confidence_r10Type();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
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
    return "confidence_r10Type = " + getInteger() + ";\n";
  }
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
    builder.append("GNSS_AcquisitionAssistance = {\n");
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
