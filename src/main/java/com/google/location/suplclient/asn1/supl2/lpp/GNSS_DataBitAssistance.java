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
public  class GNSS_DataBitAssistance extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GNSS_DataBitAssistance
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GNSS_DataBitAssistance() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GNSS_DataBitAssistance;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GNSS_DataBitAssistance != null) {
      return ImmutableList.of(TAG_GNSS_DataBitAssistance);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GNSS_DataBitAssistance from encoded stream.
   */
  public static GNSS_DataBitAssistance fromPerUnaligned(byte[] encodedBytes) {
    GNSS_DataBitAssistance result = new GNSS_DataBitAssistance();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GNSS_DataBitAssistance from encoded stream.
   */
  public static GNSS_DataBitAssistance fromPerAligned(byte[] encodedBytes) {
    GNSS_DataBitAssistance result = new GNSS_DataBitAssistance();
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

  
  private GNSS_DataBitAssistance.gnss_TODType gnss_TOD_;
  public GNSS_DataBitAssistance.gnss_TODType getGnss_TOD() {
    return gnss_TOD_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_DataBitAssistance.gnss_TODType
   */
  public void setGnss_TOD(Asn1Object value) {
    this.gnss_TOD_ = (GNSS_DataBitAssistance.gnss_TODType) value;
  }
  public GNSS_DataBitAssistance.gnss_TODType setGnss_TODToNewInstance() {
    gnss_TOD_ = new GNSS_DataBitAssistance.gnss_TODType();
    return gnss_TOD_;
  }
  
  private GNSS_DataBitAssistance.gnss_TODfracType gnss_TODfrac_;
  public GNSS_DataBitAssistance.gnss_TODfracType getGnss_TODfrac() {
    return gnss_TODfrac_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_DataBitAssistance.gnss_TODfracType
   */
  public void setGnss_TODfrac(Asn1Object value) {
    this.gnss_TODfrac_ = (GNSS_DataBitAssistance.gnss_TODfracType) value;
  }
  public GNSS_DataBitAssistance.gnss_TODfracType setGnss_TODfracToNewInstance() {
    gnss_TODfrac_ = new GNSS_DataBitAssistance.gnss_TODfracType();
    return gnss_TODfrac_;
  }
  
  private GNSS_DataBitsSatList gnss_DataBitsSatList_;
  public GNSS_DataBitsSatList getGnss_DataBitsSatList() {
    return gnss_DataBitsSatList_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_DataBitsSatList
   */
  public void setGnss_DataBitsSatList(Asn1Object value) {
    this.gnss_DataBitsSatList_ = (GNSS_DataBitsSatList) value;
  }
  public GNSS_DataBitsSatList setGnss_DataBitsSatListToNewInstance() {
    gnss_DataBitsSatList_ = new GNSS_DataBitsSatList();
    return gnss_DataBitsSatList_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getGnss_TOD() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_TOD();
          }

          @Override public void setToNewInstance() {
            setGnss_TODToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_DataBitAssistance.gnss_TODType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_TOD : "
                    + getGnss_TOD().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getGnss_TODfrac() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_TODfrac();
          }

          @Override public void setToNewInstance() {
            setGnss_TODfracToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_DataBitAssistance.gnss_TODfracType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_TODfrac : "
                    + getGnss_TODfrac().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getGnss_DataBitsSatList() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_DataBitsSatList();
          }

          @Override public void setToNewInstance() {
            setGnss_DataBitsSatListToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_DataBitsSatList.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_DataBitsSatList : "
                    + getGnss_DataBitsSatList().toIndentedString(indent);
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
public static class gnss_TODType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_gnss_TODType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gnss_TODType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("3599"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gnss_TODType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gnss_TODType != null) {
      return ImmutableList.of(TAG_gnss_TODType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gnss_TODType from encoded stream.
   */
  public static gnss_TODType fromPerUnaligned(byte[] encodedBytes) {
    gnss_TODType result = new gnss_TODType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gnss_TODType from encoded stream.
   */
  public static gnss_TODType fromPerAligned(byte[] encodedBytes) {
    gnss_TODType result = new gnss_TODType();
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
    return "gnss_TODType = " + getInteger() + ";\n";
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
public static class gnss_TODfracType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_gnss_TODfracType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gnss_TODfracType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("999"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gnss_TODfracType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gnss_TODfracType != null) {
      return ImmutableList.of(TAG_gnss_TODfracType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gnss_TODfracType from encoded stream.
   */
  public static gnss_TODfracType fromPerUnaligned(byte[] encodedBytes) {
    gnss_TODfracType result = new gnss_TODfracType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gnss_TODfracType from encoded stream.
   */
  public static gnss_TODfracType fromPerAligned(byte[] encodedBytes) {
    gnss_TODfracType result = new gnss_TODfracType();
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
    return "gnss_TODfracType = " + getInteger() + ";\n";
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
    builder.append("GNSS_DataBitAssistance = {\n");
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
