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
public  class DGNSS_SgnTypeElement extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_DGNSS_SgnTypeElement
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public DGNSS_SgnTypeElement() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_DGNSS_SgnTypeElement;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_DGNSS_SgnTypeElement != null) {
      return ImmutableList.of(TAG_DGNSS_SgnTypeElement);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new DGNSS_SgnTypeElement from encoded stream.
   */
  public static DGNSS_SgnTypeElement fromPerUnaligned(byte[] encodedBytes) {
    DGNSS_SgnTypeElement result = new DGNSS_SgnTypeElement();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new DGNSS_SgnTypeElement from encoded stream.
   */
  public static DGNSS_SgnTypeElement fromPerAligned(byte[] encodedBytes) {
    DGNSS_SgnTypeElement result = new DGNSS_SgnTypeElement();
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
  
  private DGNSS_SgnTypeElement.gnss_StatusHealthType gnss_StatusHealth_;
  public DGNSS_SgnTypeElement.gnss_StatusHealthType getGnss_StatusHealth() {
    return gnss_StatusHealth_;
  }
  /**
   * @throws ClassCastException if value is not a DGNSS_SgnTypeElement.gnss_StatusHealthType
   */
  public void setGnss_StatusHealth(Asn1Object value) {
    this.gnss_StatusHealth_ = (DGNSS_SgnTypeElement.gnss_StatusHealthType) value;
  }
  public DGNSS_SgnTypeElement.gnss_StatusHealthType setGnss_StatusHealthToNewInstance() {
    gnss_StatusHealth_ = new DGNSS_SgnTypeElement.gnss_StatusHealthType();
    return gnss_StatusHealth_;
  }
  
  private DGNSS_SatList dgnss_SatList_;
  public DGNSS_SatList getDgnss_SatList() {
    return dgnss_SatList_;
  }
  /**
   * @throws ClassCastException if value is not a DGNSS_SatList
   */
  public void setDgnss_SatList(Asn1Object value) {
    this.dgnss_SatList_ = (DGNSS_SatList) value;
  }
  public DGNSS_SatList setDgnss_SatListToNewInstance() {
    dgnss_SatList_ = new DGNSS_SatList();
    return dgnss_SatList_;
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
            return getGnss_StatusHealth() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_StatusHealth();
          }

          @Override public void setToNewInstance() {
            setGnss_StatusHealthToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? DGNSS_SgnTypeElement.gnss_StatusHealthType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_StatusHealth : "
                    + getGnss_StatusHealth().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getDgnss_SatList() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getDgnss_SatList();
          }

          @Override public void setToNewInstance() {
            setDgnss_SatListToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? DGNSS_SatList.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "dgnss_SatList : "
                    + getDgnss_SatList().toIndentedString(indent);
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
public static class gnss_StatusHealthType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_gnss_StatusHealthType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gnss_StatusHealthType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("7"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gnss_StatusHealthType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gnss_StatusHealthType != null) {
      return ImmutableList.of(TAG_gnss_StatusHealthType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gnss_StatusHealthType from encoded stream.
   */
  public static gnss_StatusHealthType fromPerUnaligned(byte[] encodedBytes) {
    gnss_StatusHealthType result = new gnss_StatusHealthType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gnss_StatusHealthType from encoded stream.
   */
  public static gnss_StatusHealthType fromPerAligned(byte[] encodedBytes) {
    gnss_StatusHealthType result = new gnss_StatusHealthType();
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
    return "gnss_StatusHealthType = " + getInteger() + ";\n";
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
    builder.append("DGNSS_SgnTypeElement = {\n");
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
