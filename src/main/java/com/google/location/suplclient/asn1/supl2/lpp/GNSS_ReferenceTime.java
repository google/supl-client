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
import com.google.location.suplclient.asn1.base.Asn1SequenceOf;
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
public  class GNSS_ReferenceTime extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GNSS_ReferenceTime
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GNSS_ReferenceTime() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GNSS_ReferenceTime;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GNSS_ReferenceTime != null) {
      return ImmutableList.of(TAG_GNSS_ReferenceTime);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GNSS_ReferenceTime from encoded stream.
   */
  public static GNSS_ReferenceTime fromPerUnaligned(byte[] encodedBytes) {
    GNSS_ReferenceTime result = new GNSS_ReferenceTime();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GNSS_ReferenceTime from encoded stream.
   */
  public static GNSS_ReferenceTime fromPerAligned(byte[] encodedBytes) {
    GNSS_ReferenceTime result = new GNSS_ReferenceTime();
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

  
  private GNSS_SystemTime gnss_SystemTime_;
  public GNSS_SystemTime getGnss_SystemTime() {
    return gnss_SystemTime_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_SystemTime
   */
  public void setGnss_SystemTime(Asn1Object value) {
    this.gnss_SystemTime_ = (GNSS_SystemTime) value;
  }
  public GNSS_SystemTime setGnss_SystemTimeToNewInstance() {
    gnss_SystemTime_ = new GNSS_SystemTime();
    return gnss_SystemTime_;
  }
  
  private GNSS_ReferenceTime.referenceTimeUncType referenceTimeUnc_;
  public GNSS_ReferenceTime.referenceTimeUncType getReferenceTimeUnc() {
    return referenceTimeUnc_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_ReferenceTime.referenceTimeUncType
   */
  public void setReferenceTimeUnc(Asn1Object value) {
    this.referenceTimeUnc_ = (GNSS_ReferenceTime.referenceTimeUncType) value;
  }
  public GNSS_ReferenceTime.referenceTimeUncType setReferenceTimeUncToNewInstance() {
    referenceTimeUnc_ = new GNSS_ReferenceTime.referenceTimeUncType();
    return referenceTimeUnc_;
  }
  
  private GNSS_ReferenceTime.gnss_ReferenceTimeForCellsType gnss_ReferenceTimeForCells_;
  public GNSS_ReferenceTime.gnss_ReferenceTimeForCellsType getGnss_ReferenceTimeForCells() {
    return gnss_ReferenceTimeForCells_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_ReferenceTime.gnss_ReferenceTimeForCellsType
   */
  public void setGnss_ReferenceTimeForCells(Asn1Object value) {
    this.gnss_ReferenceTimeForCells_ = (GNSS_ReferenceTime.gnss_ReferenceTimeForCellsType) value;
  }
  public GNSS_ReferenceTime.gnss_ReferenceTimeForCellsType setGnss_ReferenceTimeForCellsToNewInstance() {
    gnss_ReferenceTimeForCells_ = new GNSS_ReferenceTime.gnss_ReferenceTimeForCellsType();
    return gnss_ReferenceTimeForCells_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getGnss_SystemTime() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_SystemTime();
          }

          @Override public void setToNewInstance() {
            setGnss_SystemTimeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_SystemTime.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_SystemTime : "
                    + getGnss_SystemTime().toIndentedString(indent);
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
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getReferenceTimeUnc();
          }

          @Override public void setToNewInstance() {
            setReferenceTimeUncToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_ReferenceTime.referenceTimeUncType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return getGnss_ReferenceTimeForCells() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_ReferenceTimeForCells();
          }

          @Override public void setToNewInstance() {
            setGnss_ReferenceTimeForCellsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_ReferenceTime.gnss_ReferenceTimeForCellsType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_ReferenceTimeForCells : "
                    + getGnss_ReferenceTimeForCells().toIndentedString(indent);
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
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class gnss_ReferenceTimeForCellsType
    extends Asn1SequenceOf<GNSS_ReferenceTimeForOneCell> {
  //

  private static final Asn1Tag TAG_gnss_ReferenceTimeForCellsType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gnss_ReferenceTimeForCellsType() {
    super();
    setMinSize(1);
setMaxSize(16);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gnss_ReferenceTimeForCellsType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gnss_ReferenceTimeForCellsType != null) {
      return ImmutableList.of(TAG_gnss_ReferenceTimeForCellsType);
    } else {
      return Asn1SequenceOf.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gnss_ReferenceTimeForCellsType from encoded stream.
   */
  public static gnss_ReferenceTimeForCellsType fromPerUnaligned(byte[] encodedBytes) {
    gnss_ReferenceTimeForCellsType result = new gnss_ReferenceTimeForCellsType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gnss_ReferenceTimeForCellsType from encoded stream.
   */
  public static gnss_ReferenceTimeForCellsType fromPerAligned(byte[] encodedBytes) {
    gnss_ReferenceTimeForCellsType result = new gnss_ReferenceTimeForCellsType();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  
  @Override public GNSS_ReferenceTimeForOneCell createAndAddValue() {
    GNSS_ReferenceTimeForOneCell value = new GNSS_ReferenceTimeForOneCell();
    add(value);
    return value;
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
    builder.append("gnss_ReferenceTimeForCellsType = [\n");
    final String internalIndent = indent + "  ";
    for (GNSS_ReferenceTimeForOneCell value : getValues()) {
      builder.append(internalIndent)
          .append(value.toIndentedString(internalIndent));
    }
    builder.append(indent).append("];\n");
    return builder.toString();
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
    builder.append("GNSS_ReferenceTime = {\n");
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
