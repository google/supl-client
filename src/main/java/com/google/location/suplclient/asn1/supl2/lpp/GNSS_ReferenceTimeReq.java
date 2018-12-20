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
public  class GNSS_ReferenceTimeReq extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GNSS_ReferenceTimeReq
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GNSS_ReferenceTimeReq() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GNSS_ReferenceTimeReq;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GNSS_ReferenceTimeReq != null) {
      return ImmutableList.of(TAG_GNSS_ReferenceTimeReq);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GNSS_ReferenceTimeReq from encoded stream.
   */
  public static GNSS_ReferenceTimeReq fromPerUnaligned(byte[] encodedBytes) {
    GNSS_ReferenceTimeReq result = new GNSS_ReferenceTimeReq();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GNSS_ReferenceTimeReq from encoded stream.
   */
  public static GNSS_ReferenceTimeReq fromPerAligned(byte[] encodedBytes) {
    GNSS_ReferenceTimeReq result = new GNSS_ReferenceTimeReq();
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

  
  private GNSS_ReferenceTimeReq.gnss_TimeReqPrefListType gnss_TimeReqPrefList_;
  public GNSS_ReferenceTimeReq.gnss_TimeReqPrefListType getGnss_TimeReqPrefList() {
    return gnss_TimeReqPrefList_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_ReferenceTimeReq.gnss_TimeReqPrefListType
   */
  public void setGnss_TimeReqPrefList(Asn1Object value) {
    this.gnss_TimeReqPrefList_ = (GNSS_ReferenceTimeReq.gnss_TimeReqPrefListType) value;
  }
  public GNSS_ReferenceTimeReq.gnss_TimeReqPrefListType setGnss_TimeReqPrefListToNewInstance() {
    gnss_TimeReqPrefList_ = new GNSS_ReferenceTimeReq.gnss_TimeReqPrefListType();
    return gnss_TimeReqPrefList_;
  }
  
  private GNSS_ReferenceTimeReq.gps_TOW_assistReqType gps_TOW_assistReq_;
  public GNSS_ReferenceTimeReq.gps_TOW_assistReqType getGps_TOW_assistReq() {
    return gps_TOW_assistReq_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_ReferenceTimeReq.gps_TOW_assistReqType
   */
  public void setGps_TOW_assistReq(Asn1Object value) {
    this.gps_TOW_assistReq_ = (GNSS_ReferenceTimeReq.gps_TOW_assistReqType) value;
  }
  public GNSS_ReferenceTimeReq.gps_TOW_assistReqType setGps_TOW_assistReqToNewInstance() {
    gps_TOW_assistReq_ = new GNSS_ReferenceTimeReq.gps_TOW_assistReqType();
    return gps_TOW_assistReq_;
  }
  
  private GNSS_ReferenceTimeReq.notOfLeapSecReqType notOfLeapSecReq_;
  public GNSS_ReferenceTimeReq.notOfLeapSecReqType getNotOfLeapSecReq() {
    return notOfLeapSecReq_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_ReferenceTimeReq.notOfLeapSecReqType
   */
  public void setNotOfLeapSecReq(Asn1Object value) {
    this.notOfLeapSecReq_ = (GNSS_ReferenceTimeReq.notOfLeapSecReqType) value;
  }
  public GNSS_ReferenceTimeReq.notOfLeapSecReqType setNotOfLeapSecReqToNewInstance() {
    notOfLeapSecReq_ = new GNSS_ReferenceTimeReq.notOfLeapSecReqType();
    return notOfLeapSecReq_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getGnss_TimeReqPrefList() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_TimeReqPrefList();
          }

          @Override public void setToNewInstance() {
            setGnss_TimeReqPrefListToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_ReferenceTimeReq.gnss_TimeReqPrefListType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_TimeReqPrefList : "
                    + getGnss_TimeReqPrefList().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getGps_TOW_assistReq() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGps_TOW_assistReq();
          }

          @Override public void setToNewInstance() {
            setGps_TOW_assistReqToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_ReferenceTimeReq.gps_TOW_assistReqType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gps_TOW_assistReq : "
                    + getGps_TOW_assistReq().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getNotOfLeapSecReq() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getNotOfLeapSecReq();
          }

          @Override public void setToNewInstance() {
            setNotOfLeapSecReqToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_ReferenceTimeReq.notOfLeapSecReqType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "notOfLeapSecReq : "
                    + getNotOfLeapSecReq().toIndentedString(indent);
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
public static class gnss_TimeReqPrefListType
    extends Asn1SequenceOf<GNSS_ID> {
  //

  private static final Asn1Tag TAG_gnss_TimeReqPrefListType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gnss_TimeReqPrefListType() {
    super();
    setMinSize(1);
setMaxSize(8);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gnss_TimeReqPrefListType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gnss_TimeReqPrefListType != null) {
      return ImmutableList.of(TAG_gnss_TimeReqPrefListType);
    } else {
      return Asn1SequenceOf.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gnss_TimeReqPrefListType from encoded stream.
   */
  public static gnss_TimeReqPrefListType fromPerUnaligned(byte[] encodedBytes) {
    gnss_TimeReqPrefListType result = new gnss_TimeReqPrefListType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gnss_TimeReqPrefListType from encoded stream.
   */
  public static gnss_TimeReqPrefListType fromPerAligned(byte[] encodedBytes) {
    gnss_TimeReqPrefListType result = new gnss_TimeReqPrefListType();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  
  @Override public GNSS_ID createAndAddValue() {
    GNSS_ID value = new GNSS_ID();
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
    builder.append("gnss_TimeReqPrefListType = [\n");
    final String internalIndent = indent + "  ";
    for (GNSS_ID value : getValues()) {
      builder.append(internalIndent)
          .append(value.toIndentedString(internalIndent));
    }
    builder.append(indent).append("];\n");
    return builder.toString();
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
public static class gps_TOW_assistReqType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_gps_TOW_assistReqType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gps_TOW_assistReqType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gps_TOW_assistReqType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gps_TOW_assistReqType != null) {
      return ImmutableList.of(TAG_gps_TOW_assistReqType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gps_TOW_assistReqType from encoded stream.
   */
  public static gps_TOW_assistReqType fromPerUnaligned(byte[] encodedBytes) {
    gps_TOW_assistReqType result = new gps_TOW_assistReqType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gps_TOW_assistReqType from encoded stream.
   */
  public static gps_TOW_assistReqType fromPerAligned(byte[] encodedBytes) {
    gps_TOW_assistReqType result = new gps_TOW_assistReqType();
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
    return "gps_TOW_assistReqType = " + getValue() + ";\n";
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
public static class notOfLeapSecReqType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_notOfLeapSecReqType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public notOfLeapSecReqType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_notOfLeapSecReqType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_notOfLeapSecReqType != null) {
      return ImmutableList.of(TAG_notOfLeapSecReqType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new notOfLeapSecReqType from encoded stream.
   */
  public static notOfLeapSecReqType fromPerUnaligned(byte[] encodedBytes) {
    notOfLeapSecReqType result = new notOfLeapSecReqType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new notOfLeapSecReqType from encoded stream.
   */
  public static notOfLeapSecReqType fromPerAligned(byte[] encodedBytes) {
    notOfLeapSecReqType result = new notOfLeapSecReqType();
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
    return "notOfLeapSecReqType = " + getValue() + ";\n";
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
    builder.append("GNSS_ReferenceTimeReq = {\n");
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
