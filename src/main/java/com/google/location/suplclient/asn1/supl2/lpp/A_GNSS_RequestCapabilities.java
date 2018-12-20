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
public  class A_GNSS_RequestCapabilities extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_A_GNSS_RequestCapabilities
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public A_GNSS_RequestCapabilities() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_A_GNSS_RequestCapabilities;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_A_GNSS_RequestCapabilities != null) {
      return ImmutableList.of(TAG_A_GNSS_RequestCapabilities);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new A_GNSS_RequestCapabilities from encoded stream.
   */
  public static A_GNSS_RequestCapabilities fromPerUnaligned(byte[] encodedBytes) {
    A_GNSS_RequestCapabilities result = new A_GNSS_RequestCapabilities();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new A_GNSS_RequestCapabilities from encoded stream.
   */
  public static A_GNSS_RequestCapabilities fromPerAligned(byte[] encodedBytes) {
    A_GNSS_RequestCapabilities result = new A_GNSS_RequestCapabilities();
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

  
  private A_GNSS_RequestCapabilities.gnss_SupportListReqType gnss_SupportListReq_;
  public A_GNSS_RequestCapabilities.gnss_SupportListReqType getGnss_SupportListReq() {
    return gnss_SupportListReq_;
  }
  /**
   * @throws ClassCastException if value is not a A_GNSS_RequestCapabilities.gnss_SupportListReqType
   */
  public void setGnss_SupportListReq(Asn1Object value) {
    this.gnss_SupportListReq_ = (A_GNSS_RequestCapabilities.gnss_SupportListReqType) value;
  }
  public A_GNSS_RequestCapabilities.gnss_SupportListReqType setGnss_SupportListReqToNewInstance() {
    gnss_SupportListReq_ = new A_GNSS_RequestCapabilities.gnss_SupportListReqType();
    return gnss_SupportListReq_;
  }
  
  private A_GNSS_RequestCapabilities.assistanceDataSupportListReqType assistanceDataSupportListReq_;
  public A_GNSS_RequestCapabilities.assistanceDataSupportListReqType getAssistanceDataSupportListReq() {
    return assistanceDataSupportListReq_;
  }
  /**
   * @throws ClassCastException if value is not a A_GNSS_RequestCapabilities.assistanceDataSupportListReqType
   */
  public void setAssistanceDataSupportListReq(Asn1Object value) {
    this.assistanceDataSupportListReq_ = (A_GNSS_RequestCapabilities.assistanceDataSupportListReqType) value;
  }
  public A_GNSS_RequestCapabilities.assistanceDataSupportListReqType setAssistanceDataSupportListReqToNewInstance() {
    assistanceDataSupportListReq_ = new A_GNSS_RequestCapabilities.assistanceDataSupportListReqType();
    return assistanceDataSupportListReq_;
  }
  
  private A_GNSS_RequestCapabilities.locationVelocityTypesReqType locationVelocityTypesReq_;
  public A_GNSS_RequestCapabilities.locationVelocityTypesReqType getLocationVelocityTypesReq() {
    return locationVelocityTypesReq_;
  }
  /**
   * @throws ClassCastException if value is not a A_GNSS_RequestCapabilities.locationVelocityTypesReqType
   */
  public void setLocationVelocityTypesReq(Asn1Object value) {
    this.locationVelocityTypesReq_ = (A_GNSS_RequestCapabilities.locationVelocityTypesReqType) value;
  }
  public A_GNSS_RequestCapabilities.locationVelocityTypesReqType setLocationVelocityTypesReqToNewInstance() {
    locationVelocityTypesReq_ = new A_GNSS_RequestCapabilities.locationVelocityTypesReqType();
    return locationVelocityTypesReq_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getGnss_SupportListReq() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_SupportListReq();
          }

          @Override public void setToNewInstance() {
            setGnss_SupportListReqToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? A_GNSS_RequestCapabilities.gnss_SupportListReqType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_SupportListReq : "
                    + getGnss_SupportListReq().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getAssistanceDataSupportListReq() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getAssistanceDataSupportListReq();
          }

          @Override public void setToNewInstance() {
            setAssistanceDataSupportListReqToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? A_GNSS_RequestCapabilities.assistanceDataSupportListReqType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "assistanceDataSupportListReq : "
                    + getAssistanceDataSupportListReq().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getLocationVelocityTypesReq() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getLocationVelocityTypesReq();
          }

          @Override public void setToNewInstance() {
            setLocationVelocityTypesReqToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? A_GNSS_RequestCapabilities.locationVelocityTypesReqType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "locationVelocityTypesReq : "
                    + getLocationVelocityTypesReq().toIndentedString(indent);
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
public static class gnss_SupportListReqType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_gnss_SupportListReqType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gnss_SupportListReqType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gnss_SupportListReqType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gnss_SupportListReqType != null) {
      return ImmutableList.of(TAG_gnss_SupportListReqType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gnss_SupportListReqType from encoded stream.
   */
  public static gnss_SupportListReqType fromPerUnaligned(byte[] encodedBytes) {
    gnss_SupportListReqType result = new gnss_SupportListReqType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gnss_SupportListReqType from encoded stream.
   */
  public static gnss_SupportListReqType fromPerAligned(byte[] encodedBytes) {
    gnss_SupportListReqType result = new gnss_SupportListReqType();
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
    return "gnss_SupportListReqType = " + getValue() + ";\n";
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
public static class assistanceDataSupportListReqType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_assistanceDataSupportListReqType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public assistanceDataSupportListReqType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_assistanceDataSupportListReqType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_assistanceDataSupportListReqType != null) {
      return ImmutableList.of(TAG_assistanceDataSupportListReqType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new assistanceDataSupportListReqType from encoded stream.
   */
  public static assistanceDataSupportListReqType fromPerUnaligned(byte[] encodedBytes) {
    assistanceDataSupportListReqType result = new assistanceDataSupportListReqType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new assistanceDataSupportListReqType from encoded stream.
   */
  public static assistanceDataSupportListReqType fromPerAligned(byte[] encodedBytes) {
    assistanceDataSupportListReqType result = new assistanceDataSupportListReqType();
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
    return "assistanceDataSupportListReqType = " + getValue() + ";\n";
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
public static class locationVelocityTypesReqType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_locationVelocityTypesReqType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public locationVelocityTypesReqType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_locationVelocityTypesReqType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_locationVelocityTypesReqType != null) {
      return ImmutableList.of(TAG_locationVelocityTypesReqType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new locationVelocityTypesReqType from encoded stream.
   */
  public static locationVelocityTypesReqType fromPerUnaligned(byte[] encodedBytes) {
    locationVelocityTypesReqType result = new locationVelocityTypesReqType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new locationVelocityTypesReqType from encoded stream.
   */
  public static locationVelocityTypesReqType fromPerAligned(byte[] encodedBytes) {
    locationVelocityTypesReqType result = new locationVelocityTypesReqType();
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
    return "locationVelocityTypesReqType = " + getValue() + ";\n";
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
    builder.append("A_GNSS_RequestCapabilities = {\n");
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
