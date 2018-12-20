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
import com.google.location.suplclient.asn1.base.Asn1Enumerated;
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
public  class GNSS_ReferenceTimeForOneCell extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GNSS_ReferenceTimeForOneCell
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GNSS_ReferenceTimeForOneCell() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GNSS_ReferenceTimeForOneCell;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GNSS_ReferenceTimeForOneCell != null) {
      return ImmutableList.of(TAG_GNSS_ReferenceTimeForOneCell);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GNSS_ReferenceTimeForOneCell from encoded stream.
   */
  public static GNSS_ReferenceTimeForOneCell fromPerUnaligned(byte[] encodedBytes) {
    GNSS_ReferenceTimeForOneCell result = new GNSS_ReferenceTimeForOneCell();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GNSS_ReferenceTimeForOneCell from encoded stream.
   */
  public static GNSS_ReferenceTimeForOneCell fromPerAligned(byte[] encodedBytes) {
    GNSS_ReferenceTimeForOneCell result = new GNSS_ReferenceTimeForOneCell();
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

  
  private NetworkTime networkTime_;
  public NetworkTime getNetworkTime() {
    return networkTime_;
  }
  /**
   * @throws ClassCastException if value is not a NetworkTime
   */
  public void setNetworkTime(Asn1Object value) {
    this.networkTime_ = (NetworkTime) value;
  }
  public NetworkTime setNetworkTimeToNewInstance() {
    networkTime_ = new NetworkTime();
    return networkTime_;
  }
  
  private GNSS_ReferenceTimeForOneCell.referenceTimeUncType referenceTimeUnc_;
  public GNSS_ReferenceTimeForOneCell.referenceTimeUncType getReferenceTimeUnc() {
    return referenceTimeUnc_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_ReferenceTimeForOneCell.referenceTimeUncType
   */
  public void setReferenceTimeUnc(Asn1Object value) {
    this.referenceTimeUnc_ = (GNSS_ReferenceTimeForOneCell.referenceTimeUncType) value;
  }
  public GNSS_ReferenceTimeForOneCell.referenceTimeUncType setReferenceTimeUncToNewInstance() {
    referenceTimeUnc_ = new GNSS_ReferenceTimeForOneCell.referenceTimeUncType();
    return referenceTimeUnc_;
  }
  
  private GNSS_ReferenceTimeForOneCell.bsAlignType bsAlign_;
  public GNSS_ReferenceTimeForOneCell.bsAlignType getBsAlign() {
    return bsAlign_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_ReferenceTimeForOneCell.bsAlignType
   */
  public void setBsAlign(Asn1Object value) {
    this.bsAlign_ = (GNSS_ReferenceTimeForOneCell.bsAlignType) value;
  }
  public GNSS_ReferenceTimeForOneCell.bsAlignType setBsAlignToNewInstance() {
    bsAlign_ = new GNSS_ReferenceTimeForOneCell.bsAlignType();
    return bsAlign_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getNetworkTime() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getNetworkTime();
          }

          @Override public void setToNewInstance() {
            setNetworkTimeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NetworkTime.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "networkTime : "
                    + getNetworkTime().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getReferenceTimeUnc() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getReferenceTimeUnc();
          }

          @Override public void setToNewInstance() {
            setReferenceTimeUncToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_ReferenceTimeForOneCell.referenceTimeUncType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "referenceTimeUnc : "
                    + getReferenceTimeUnc().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getBsAlign() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getBsAlign();
          }

          @Override public void setToNewInstance() {
            setBsAlignToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_ReferenceTimeForOneCell.bsAlignType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bsAlign : "
                    + getBsAlign().toIndentedString(indent);
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
public static class referenceTimeUncType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_referenceTimeUncType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public referenceTimeUncType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("127"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_referenceTimeUncType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_referenceTimeUncType != null) {
      return ImmutableList.of(TAG_referenceTimeUncType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new referenceTimeUncType from encoded stream.
   */
  public static referenceTimeUncType fromPerUnaligned(byte[] encodedBytes) {
    referenceTimeUncType result = new referenceTimeUncType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new referenceTimeUncType from encoded stream.
   */
  public static referenceTimeUncType fromPerAligned(byte[] encodedBytes) {
    referenceTimeUncType result = new referenceTimeUncType();
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
    return "referenceTimeUncType = " + getInteger() + ";\n";
  }
}

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class bsAlignType extends Asn1Enumerated {
  public enum Value implements Asn1Enumerated.Value {
    asn_true(0),
    ;

    Value(int i) {
      value = i;
    }

    private int value;
    public int getAssignedValue() {
      return value;
    }

    @Override public boolean isExtensionValue() {
      return false;
    }
  }

  @Override
  protected Value getDefaultValue() {
    return null
;
  }

  @SuppressWarnings("unchecked")
  public Value enumValue() {
    return (Value) getValue();
  }


  
  public void setTo_asn_true() {
    setValue(Value.asn_true);
  }
  


  public enum ExtensionValue implements Asn1Enumerated.Value {
    ;

    ExtensionValue(int i) {
      value = i;
    }

    private int value;
    @Override public int getAssignedValue() {
      return value;
    }

    @Override public boolean isExtensionValue() {
      return true;
    }
  }

  @SuppressWarnings("unchecked")
  public ExtensionValue extEnumValue() {
    return (ExtensionValue) getValue();
  }

  

  

  private static final Asn1Tag TAG_bsAlignType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bsAlignType() {
    super();
    // use template substitution instead of calling getDefaultValue(), since
    // calling virtual methods from a ctor is frowned upon here.
    setValue(null
);
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bsAlignType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bsAlignType != null) {
      return ImmutableList.of(TAG_bsAlignType);
    } else {
      return Asn1Enumerated.getPossibleFirstTags();
    }
  }

  @Override protected boolean isExtensible() {
    return false;
  }

  @Override protected Asn1Enumerated.Value lookupValue(int ordinal) {
    return Value.values()[ordinal];
  }

  @Override protected Asn1Enumerated.Value lookupExtensionValue(int ordinal) {
    return ExtensionValue.values()[ordinal];
  }

  @Override protected int getValueCount() {
    return Value.values().length;
  }

  /**
   * Creates a new bsAlignType from encoded stream.
   */
  public static bsAlignType fromPerUnaligned(byte[] encodedBytes) {
    bsAlignType result = new bsAlignType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bsAlignType from encoded stream.
   */
  public static bsAlignType fromPerAligned(byte[] encodedBytes) {
    bsAlignType result = new bsAlignType();
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
    return "bsAlignType = " + getValue() + ";\n";
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
    builder.append("GNSS_ReferenceTimeForOneCell = {\n");
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
