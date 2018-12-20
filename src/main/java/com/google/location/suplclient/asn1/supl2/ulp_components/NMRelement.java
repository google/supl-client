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

package com.google.location.suplclient.asn1.supl2.ulp_components;

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
public  class NMRelement extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_NMRelement
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public NMRelement() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_NMRelement;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_NMRelement != null) {
      return ImmutableList.of(TAG_NMRelement);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new NMRelement from encoded stream.
   */
  public static NMRelement fromPerUnaligned(byte[] encodedBytes) {
    NMRelement result = new NMRelement();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new NMRelement from encoded stream.
   */
  public static NMRelement fromPerAligned(byte[] encodedBytes) {
    NMRelement result = new NMRelement();
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

  
  private NMRelement.aRFCNType aRFCN_;
  public NMRelement.aRFCNType getARFCN() {
    return aRFCN_;
  }
  /**
   * @throws ClassCastException if value is not a NMRelement.aRFCNType
   */
  public void setARFCN(Asn1Object value) {
    this.aRFCN_ = (NMRelement.aRFCNType) value;
  }
  public NMRelement.aRFCNType setARFCNToNewInstance() {
    aRFCN_ = new NMRelement.aRFCNType();
    return aRFCN_;
  }
  
  private NMRelement.bSICType bSIC_;
  public NMRelement.bSICType getBSIC() {
    return bSIC_;
  }
  /**
   * @throws ClassCastException if value is not a NMRelement.bSICType
   */
  public void setBSIC(Asn1Object value) {
    this.bSIC_ = (NMRelement.bSICType) value;
  }
  public NMRelement.bSICType setBSICToNewInstance() {
    bSIC_ = new NMRelement.bSICType();
    return bSIC_;
  }
  
  private NMRelement.rxLevType rxLev_;
  public NMRelement.rxLevType getRxLev() {
    return rxLev_;
  }
  /**
   * @throws ClassCastException if value is not a NMRelement.rxLevType
   */
  public void setRxLev(Asn1Object value) {
    this.rxLev_ = (NMRelement.rxLevType) value;
  }
  public NMRelement.rxLevType setRxLevToNewInstance() {
    rxLev_ = new NMRelement.rxLevType();
    return rxLev_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getARFCN() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getARFCN();
          }

          @Override public void setToNewInstance() {
            setARFCNToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NMRelement.aRFCNType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "aRFCN : "
                    + getARFCN().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getBSIC() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBSIC();
          }

          @Override public void setToNewInstance() {
            setBSICToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NMRelement.bSICType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bSIC : "
                    + getBSIC().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getRxLev() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getRxLev();
          }

          @Override public void setToNewInstance() {
            setRxLevToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NMRelement.rxLevType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "rxLev : "
                    + getRxLev().toIndentedString(indent);
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
public static class aRFCNType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_aRFCNType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public aRFCNType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("1023"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_aRFCNType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_aRFCNType != null) {
      return ImmutableList.of(TAG_aRFCNType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new aRFCNType from encoded stream.
   */
  public static aRFCNType fromPerUnaligned(byte[] encodedBytes) {
    aRFCNType result = new aRFCNType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new aRFCNType from encoded stream.
   */
  public static aRFCNType fromPerAligned(byte[] encodedBytes) {
    aRFCNType result = new aRFCNType();
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
    return "aRFCNType = " + getInteger() + ";\n";
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
public static class bSICType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bSICType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bSICType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("63"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bSICType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bSICType != null) {
      return ImmutableList.of(TAG_bSICType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bSICType from encoded stream.
   */
  public static bSICType fromPerUnaligned(byte[] encodedBytes) {
    bSICType result = new bSICType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bSICType from encoded stream.
   */
  public static bSICType fromPerAligned(byte[] encodedBytes) {
    bSICType result = new bSICType();
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
    return "bSICType = " + getInteger() + ";\n";
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
public static class rxLevType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_rxLevType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public rxLevType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("63"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_rxLevType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_rxLevType != null) {
      return ImmutableList.of(TAG_rxLevType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new rxLevType from encoded stream.
   */
  public static rxLevType fromPerUnaligned(byte[] encodedBytes) {
    rxLevType result = new rxLevType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new rxLevType from encoded stream.
   */
  public static rxLevType fromPerAligned(byte[] encodedBytes) {
    rxLevType result = new rxLevType();
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
    return "rxLevType = " + getInteger() + ";\n";
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
    builder.append("NMRelement = {\n");
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
