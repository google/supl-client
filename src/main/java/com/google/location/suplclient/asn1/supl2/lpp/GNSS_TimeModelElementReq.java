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
import com.google.location.suplclient.asn1.base.Asn1Boolean;
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
public  class GNSS_TimeModelElementReq extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GNSS_TimeModelElementReq
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GNSS_TimeModelElementReq() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GNSS_TimeModelElementReq;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GNSS_TimeModelElementReq != null) {
      return ImmutableList.of(TAG_GNSS_TimeModelElementReq);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GNSS_TimeModelElementReq from encoded stream.
   */
  public static GNSS_TimeModelElementReq fromPerUnaligned(byte[] encodedBytes) {
    GNSS_TimeModelElementReq result = new GNSS_TimeModelElementReq();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GNSS_TimeModelElementReq from encoded stream.
   */
  public static GNSS_TimeModelElementReq fromPerAligned(byte[] encodedBytes) {
    GNSS_TimeModelElementReq result = new GNSS_TimeModelElementReq();
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

  
  private GNSS_TimeModelElementReq.gnss_TO_IDsReqType gnss_TO_IDsReq_;
  public GNSS_TimeModelElementReq.gnss_TO_IDsReqType getGnss_TO_IDsReq() {
    return gnss_TO_IDsReq_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_TimeModelElementReq.gnss_TO_IDsReqType
   */
  public void setGnss_TO_IDsReq(Asn1Object value) {
    this.gnss_TO_IDsReq_ = (GNSS_TimeModelElementReq.gnss_TO_IDsReqType) value;
  }
  public GNSS_TimeModelElementReq.gnss_TO_IDsReqType setGnss_TO_IDsReqToNewInstance() {
    gnss_TO_IDsReq_ = new GNSS_TimeModelElementReq.gnss_TO_IDsReqType();
    return gnss_TO_IDsReq_;
  }
  
  private GNSS_TimeModelElementReq.deltaTreqType deltaTreq_;
  public GNSS_TimeModelElementReq.deltaTreqType getDeltaTreq() {
    return deltaTreq_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_TimeModelElementReq.deltaTreqType
   */
  public void setDeltaTreq(Asn1Object value) {
    this.deltaTreq_ = (GNSS_TimeModelElementReq.deltaTreqType) value;
  }
  public GNSS_TimeModelElementReq.deltaTreqType setDeltaTreqToNewInstance() {
    deltaTreq_ = new GNSS_TimeModelElementReq.deltaTreqType();
    return deltaTreq_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getGnss_TO_IDsReq() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_TO_IDsReq();
          }

          @Override public void setToNewInstance() {
            setGnss_TO_IDsReqToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_TimeModelElementReq.gnss_TO_IDsReqType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_TO_IDsReq : "
                    + getGnss_TO_IDsReq().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getDeltaTreq() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getDeltaTreq();
          }

          @Override public void setToNewInstance() {
            setDeltaTreqToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_TimeModelElementReq.deltaTreqType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "deltaTreq : "
                    + getDeltaTreq().toIndentedString(indent);
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
public static class gnss_TO_IDsReqType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_gnss_TO_IDsReqType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gnss_TO_IDsReqType() {
    super();
    setValueRange(new java.math.BigInteger("1"), new java.math.BigInteger("15"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gnss_TO_IDsReqType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gnss_TO_IDsReqType != null) {
      return ImmutableList.of(TAG_gnss_TO_IDsReqType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gnss_TO_IDsReqType from encoded stream.
   */
  public static gnss_TO_IDsReqType fromPerUnaligned(byte[] encodedBytes) {
    gnss_TO_IDsReqType result = new gnss_TO_IDsReqType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gnss_TO_IDsReqType from encoded stream.
   */
  public static gnss_TO_IDsReqType fromPerAligned(byte[] encodedBytes) {
    gnss_TO_IDsReqType result = new gnss_TO_IDsReqType();
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
    return "gnss_TO_IDsReqType = " + getInteger() + ";\n";
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
public static class deltaTreqType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_deltaTreqType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public deltaTreqType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_deltaTreqType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_deltaTreqType != null) {
      return ImmutableList.of(TAG_deltaTreqType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new deltaTreqType from encoded stream.
   */
  public static deltaTreqType fromPerUnaligned(byte[] encodedBytes) {
    deltaTreqType result = new deltaTreqType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new deltaTreqType from encoded stream.
   */
  public static deltaTreqType fromPerAligned(byte[] encodedBytes) {
    deltaTreqType result = new deltaTreqType();
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
    return "deltaTreqType = " + getValue() + ";\n";
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
    builder.append("GNSS_TimeModelElementReq = {\n");
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
