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
public  class GNSS_SgnMeasElement extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GNSS_SgnMeasElement
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GNSS_SgnMeasElement() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GNSS_SgnMeasElement;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GNSS_SgnMeasElement != null) {
      return ImmutableList.of(TAG_GNSS_SgnMeasElement);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GNSS_SgnMeasElement from encoded stream.
   */
  public static GNSS_SgnMeasElement fromPerUnaligned(byte[] encodedBytes) {
    GNSS_SgnMeasElement result = new GNSS_SgnMeasElement();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GNSS_SgnMeasElement from encoded stream.
   */
  public static GNSS_SgnMeasElement fromPerAligned(byte[] encodedBytes) {
    GNSS_SgnMeasElement result = new GNSS_SgnMeasElement();
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
  
  private GNSS_SgnMeasElement.gnss_CodePhaseAmbiguityType gnss_CodePhaseAmbiguity_;
  public GNSS_SgnMeasElement.gnss_CodePhaseAmbiguityType getGnss_CodePhaseAmbiguity() {
    return gnss_CodePhaseAmbiguity_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_SgnMeasElement.gnss_CodePhaseAmbiguityType
   */
  public void setGnss_CodePhaseAmbiguity(Asn1Object value) {
    this.gnss_CodePhaseAmbiguity_ = (GNSS_SgnMeasElement.gnss_CodePhaseAmbiguityType) value;
  }
  public GNSS_SgnMeasElement.gnss_CodePhaseAmbiguityType setGnss_CodePhaseAmbiguityToNewInstance() {
    gnss_CodePhaseAmbiguity_ = new GNSS_SgnMeasElement.gnss_CodePhaseAmbiguityType();
    return gnss_CodePhaseAmbiguity_;
  }
  
  private GNSS_SatMeasList gnss_SatMeasList_;
  public GNSS_SatMeasList getGnss_SatMeasList() {
    return gnss_SatMeasList_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_SatMeasList
   */
  public void setGnss_SatMeasList(Asn1Object value) {
    this.gnss_SatMeasList_ = (GNSS_SatMeasList) value;
  }
  public GNSS_SatMeasList setGnss_SatMeasListToNewInstance() {
    gnss_SatMeasList_ = new GNSS_SatMeasList();
    return gnss_SatMeasList_;
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
            return getGnss_CodePhaseAmbiguity() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_CodePhaseAmbiguity();
          }

          @Override public void setToNewInstance() {
            setGnss_CodePhaseAmbiguityToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_SgnMeasElement.gnss_CodePhaseAmbiguityType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_CodePhaseAmbiguity : "
                    + getGnss_CodePhaseAmbiguity().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getGnss_SatMeasList() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_SatMeasList();
          }

          @Override public void setToNewInstance() {
            setGnss_SatMeasListToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_SatMeasList.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_SatMeasList : "
                    + getGnss_SatMeasList().toIndentedString(indent);
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
public static class gnss_CodePhaseAmbiguityType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_gnss_CodePhaseAmbiguityType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gnss_CodePhaseAmbiguityType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("127"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gnss_CodePhaseAmbiguityType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gnss_CodePhaseAmbiguityType != null) {
      return ImmutableList.of(TAG_gnss_CodePhaseAmbiguityType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gnss_CodePhaseAmbiguityType from encoded stream.
   */
  public static gnss_CodePhaseAmbiguityType fromPerUnaligned(byte[] encodedBytes) {
    gnss_CodePhaseAmbiguityType result = new gnss_CodePhaseAmbiguityType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gnss_CodePhaseAmbiguityType from encoded stream.
   */
  public static gnss_CodePhaseAmbiguityType fromPerAligned(byte[] encodedBytes) {
    gnss_CodePhaseAmbiguityType result = new gnss_CodePhaseAmbiguityType();
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
    return "gnss_CodePhaseAmbiguityType = " + getInteger() + ";\n";
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
    builder.append("GNSS_SgnMeasElement = {\n");
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
