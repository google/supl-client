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
public  class DGPSCorrections extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_DGPSCorrections
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public DGPSCorrections() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_DGPSCorrections;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_DGPSCorrections != null) {
      return ImmutableList.of(TAG_DGPSCorrections);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new DGPSCorrections from encoded stream.
   */
  public static DGPSCorrections fromPerUnaligned(byte[] encodedBytes) {
    DGPSCorrections result = new DGPSCorrections();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new DGPSCorrections from encoded stream.
   */
  public static DGPSCorrections fromPerAligned(byte[] encodedBytes) {
    DGPSCorrections result = new DGPSCorrections();
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

  
  private DGPSCorrections.gpsTOWType gpsTOW_;
  public DGPSCorrections.gpsTOWType getGpsTOW() {
    return gpsTOW_;
  }
  /**
   * @throws ClassCastException if value is not a DGPSCorrections.gpsTOWType
   */
  public void setGpsTOW(Asn1Object value) {
    this.gpsTOW_ = (DGPSCorrections.gpsTOWType) value;
  }
  public DGPSCorrections.gpsTOWType setGpsTOWToNewInstance() {
    gpsTOW_ = new DGPSCorrections.gpsTOWType();
    return gpsTOW_;
  }
  
  private DGPSCorrections.statusType status_;
  public DGPSCorrections.statusType getStatus() {
    return status_;
  }
  /**
   * @throws ClassCastException if value is not a DGPSCorrections.statusType
   */
  public void setStatus(Asn1Object value) {
    this.status_ = (DGPSCorrections.statusType) value;
  }
  public DGPSCorrections.statusType setStatusToNewInstance() {
    status_ = new DGPSCorrections.statusType();
    return status_;
  }
  
  private SeqOfSatElement satList_;
  public SeqOfSatElement getSatList() {
    return satList_;
  }
  /**
   * @throws ClassCastException if value is not a SeqOfSatElement
   */
  public void setSatList(Asn1Object value) {
    this.satList_ = (SeqOfSatElement) value;
  }
  public SeqOfSatElement setSatListToNewInstance() {
    satList_ = new SeqOfSatElement();
    return satList_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getGpsTOW() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGpsTOW();
          }

          @Override public void setToNewInstance() {
            setGpsTOWToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? DGPSCorrections.gpsTOWType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gpsTOW : "
                    + getGpsTOW().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getStatus() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getStatus();
          }

          @Override public void setToNewInstance() {
            setStatusToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? DGPSCorrections.statusType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "status : "
                    + getStatus().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getSatList() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getSatList();
          }

          @Override public void setToNewInstance() {
            setSatListToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SeqOfSatElement.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "satList : "
                    + getSatList().toIndentedString(indent);
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
public static class gpsTOWType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_gpsTOWType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gpsTOWType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("604799"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gpsTOWType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gpsTOWType != null) {
      return ImmutableList.of(TAG_gpsTOWType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gpsTOWType from encoded stream.
   */
  public static gpsTOWType fromPerUnaligned(byte[] encodedBytes) {
    gpsTOWType result = new gpsTOWType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gpsTOWType from encoded stream.
   */
  public static gpsTOWType fromPerAligned(byte[] encodedBytes) {
    gpsTOWType result = new gpsTOWType();
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
    return "gpsTOWType = " + getInteger() + ";\n";
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
public static class statusType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_statusType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public statusType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("7"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_statusType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_statusType != null) {
      return ImmutableList.of(TAG_statusType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new statusType from encoded stream.
   */
  public static statusType fromPerUnaligned(byte[] encodedBytes) {
    statusType result = new statusType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new statusType from encoded stream.
   */
  public static statusType fromPerAligned(byte[] encodedBytes) {
    statusType result = new statusType();
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
    return "statusType = " + getInteger() + ";\n";
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
    builder.append("DGPSCorrections = {\n");
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
