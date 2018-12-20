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
public  class GPS_TOW_AssistElement extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GPS_TOW_AssistElement
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GPS_TOW_AssistElement() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GPS_TOW_AssistElement;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GPS_TOW_AssistElement != null) {
      return ImmutableList.of(TAG_GPS_TOW_AssistElement);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GPS_TOW_AssistElement from encoded stream.
   */
  public static GPS_TOW_AssistElement fromPerUnaligned(byte[] encodedBytes) {
    GPS_TOW_AssistElement result = new GPS_TOW_AssistElement();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GPS_TOW_AssistElement from encoded stream.
   */
  public static GPS_TOW_AssistElement fromPerAligned(byte[] encodedBytes) {
    GPS_TOW_AssistElement result = new GPS_TOW_AssistElement();
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

  
  private GPS_TOW_AssistElement.satelliteIDType satelliteID_;
  public GPS_TOW_AssistElement.satelliteIDType getSatelliteID() {
    return satelliteID_;
  }
  /**
   * @throws ClassCastException if value is not a GPS_TOW_AssistElement.satelliteIDType
   */
  public void setSatelliteID(Asn1Object value) {
    this.satelliteID_ = (GPS_TOW_AssistElement.satelliteIDType) value;
  }
  public GPS_TOW_AssistElement.satelliteIDType setSatelliteIDToNewInstance() {
    satelliteID_ = new GPS_TOW_AssistElement.satelliteIDType();
    return satelliteID_;
  }
  
  private GPS_TOW_AssistElement.tlmWordType tlmWord_;
  public GPS_TOW_AssistElement.tlmWordType getTlmWord() {
    return tlmWord_;
  }
  /**
   * @throws ClassCastException if value is not a GPS_TOW_AssistElement.tlmWordType
   */
  public void setTlmWord(Asn1Object value) {
    this.tlmWord_ = (GPS_TOW_AssistElement.tlmWordType) value;
  }
  public GPS_TOW_AssistElement.tlmWordType setTlmWordToNewInstance() {
    tlmWord_ = new GPS_TOW_AssistElement.tlmWordType();
    return tlmWord_;
  }
  
  private GPS_TOW_AssistElement.antiSpoofType antiSpoof_;
  public GPS_TOW_AssistElement.antiSpoofType getAntiSpoof() {
    return antiSpoof_;
  }
  /**
   * @throws ClassCastException if value is not a GPS_TOW_AssistElement.antiSpoofType
   */
  public void setAntiSpoof(Asn1Object value) {
    this.antiSpoof_ = (GPS_TOW_AssistElement.antiSpoofType) value;
  }
  public GPS_TOW_AssistElement.antiSpoofType setAntiSpoofToNewInstance() {
    antiSpoof_ = new GPS_TOW_AssistElement.antiSpoofType();
    return antiSpoof_;
  }
  
  private GPS_TOW_AssistElement.alertType alert_;
  public GPS_TOW_AssistElement.alertType getAlert() {
    return alert_;
  }
  /**
   * @throws ClassCastException if value is not a GPS_TOW_AssistElement.alertType
   */
  public void setAlert(Asn1Object value) {
    this.alert_ = (GPS_TOW_AssistElement.alertType) value;
  }
  public GPS_TOW_AssistElement.alertType setAlertToNewInstance() {
    alert_ = new GPS_TOW_AssistElement.alertType();
    return alert_;
  }
  
  private GPS_TOW_AssistElement.tlmRsvdBitsType tlmRsvdBits_;
  public GPS_TOW_AssistElement.tlmRsvdBitsType getTlmRsvdBits() {
    return tlmRsvdBits_;
  }
  /**
   * @throws ClassCastException if value is not a GPS_TOW_AssistElement.tlmRsvdBitsType
   */
  public void setTlmRsvdBits(Asn1Object value) {
    this.tlmRsvdBits_ = (GPS_TOW_AssistElement.tlmRsvdBitsType) value;
  }
  public GPS_TOW_AssistElement.tlmRsvdBitsType setTlmRsvdBitsToNewInstance() {
    tlmRsvdBits_ = new GPS_TOW_AssistElement.tlmRsvdBitsType();
    return tlmRsvdBits_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getSatelliteID() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getSatelliteID();
          }

          @Override public void setToNewInstance() {
            setSatelliteIDToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GPS_TOW_AssistElement.satelliteIDType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "satelliteID : "
                    + getSatelliteID().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getTlmWord() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getTlmWord();
          }

          @Override public void setToNewInstance() {
            setTlmWordToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GPS_TOW_AssistElement.tlmWordType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "tlmWord : "
                    + getTlmWord().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getAntiSpoof() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getAntiSpoof();
          }

          @Override public void setToNewInstance() {
            setAntiSpoofToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GPS_TOW_AssistElement.antiSpoofType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "antiSpoof : "
                    + getAntiSpoof().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getAlert() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getAlert();
          }

          @Override public void setToNewInstance() {
            setAlertToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GPS_TOW_AssistElement.alertType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "alert : "
                    + getAlert().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getTlmRsvdBits() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getTlmRsvdBits();
          }

          @Override public void setToNewInstance() {
            setTlmRsvdBitsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GPS_TOW_AssistElement.tlmRsvdBitsType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "tlmRsvdBits : "
                    + getTlmRsvdBits().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
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
public static class satelliteIDType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_satelliteIDType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public satelliteIDType() {
    super();
    setValueRange(new java.math.BigInteger("1"), new java.math.BigInteger("64"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_satelliteIDType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_satelliteIDType != null) {
      return ImmutableList.of(TAG_satelliteIDType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new satelliteIDType from encoded stream.
   */
  public static satelliteIDType fromPerUnaligned(byte[] encodedBytes) {
    satelliteIDType result = new satelliteIDType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new satelliteIDType from encoded stream.
   */
  public static satelliteIDType fromPerAligned(byte[] encodedBytes) {
    satelliteIDType result = new satelliteIDType();
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
    return "satelliteIDType = " + getInteger() + ";\n";
  }
}

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class tlmWordType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_tlmWordType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public tlmWordType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("16383"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_tlmWordType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_tlmWordType != null) {
      return ImmutableList.of(TAG_tlmWordType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new tlmWordType from encoded stream.
   */
  public static tlmWordType fromPerUnaligned(byte[] encodedBytes) {
    tlmWordType result = new tlmWordType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new tlmWordType from encoded stream.
   */
  public static tlmWordType fromPerAligned(byte[] encodedBytes) {
    tlmWordType result = new tlmWordType();
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
    return "tlmWordType = " + getInteger() + ";\n";
  }
}

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class antiSpoofType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_antiSpoofType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public antiSpoofType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("1"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_antiSpoofType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_antiSpoofType != null) {
      return ImmutableList.of(TAG_antiSpoofType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new antiSpoofType from encoded stream.
   */
  public static antiSpoofType fromPerUnaligned(byte[] encodedBytes) {
    antiSpoofType result = new antiSpoofType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new antiSpoofType from encoded stream.
   */
  public static antiSpoofType fromPerAligned(byte[] encodedBytes) {
    antiSpoofType result = new antiSpoofType();
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
    return "antiSpoofType = " + getInteger() + ";\n";
  }
}

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class alertType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_alertType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public alertType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("1"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_alertType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_alertType != null) {
      return ImmutableList.of(TAG_alertType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new alertType from encoded stream.
   */
  public static alertType fromPerUnaligned(byte[] encodedBytes) {
    alertType result = new alertType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new alertType from encoded stream.
   */
  public static alertType fromPerAligned(byte[] encodedBytes) {
    alertType result = new alertType();
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
    return "alertType = " + getInteger() + ";\n";
  }
}

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class tlmRsvdBitsType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_tlmRsvdBitsType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public tlmRsvdBitsType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("3"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_tlmRsvdBitsType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_tlmRsvdBitsType != null) {
      return ImmutableList.of(TAG_tlmRsvdBitsType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new tlmRsvdBitsType from encoded stream.
   */
  public static tlmRsvdBitsType fromPerUnaligned(byte[] encodedBytes) {
    tlmRsvdBitsType result = new tlmRsvdBitsType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new tlmRsvdBitsType from encoded stream.
   */
  public static tlmRsvdBitsType fromPerAligned(byte[] encodedBytes) {
    tlmRsvdBitsType result = new tlmRsvdBitsType();
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
    return "tlmRsvdBitsType = " + getInteger() + ";\n";
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
    builder.append("GPS_TOW_AssistElement = {\n");
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
