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
public  class QoS extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_QoS
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public QoS() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_QoS;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_QoS != null) {
      return ImmutableList.of(TAG_QoS);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new QoS from encoded stream.
   */
  public static QoS fromPerUnaligned(byte[] encodedBytes) {
    QoS result = new QoS();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new QoS from encoded stream.
   */
  public static QoS fromPerAligned(byte[] encodedBytes) {
    QoS result = new QoS();
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

  
  private HorizontalAccuracy horizontalAccuracy_;
  public HorizontalAccuracy getHorizontalAccuracy() {
    return horizontalAccuracy_;
  }
  /**
   * @throws ClassCastException if value is not a HorizontalAccuracy
   */
  public void setHorizontalAccuracy(Asn1Object value) {
    this.horizontalAccuracy_ = (HorizontalAccuracy) value;
  }
  public HorizontalAccuracy setHorizontalAccuracyToNewInstance() {
    horizontalAccuracy_ = new HorizontalAccuracy();
    return horizontalAccuracy_;
  }
  
  private QoS.verticalCoordinateRequestType verticalCoordinateRequest_;
  public QoS.verticalCoordinateRequestType getVerticalCoordinateRequest() {
    return verticalCoordinateRequest_;
  }
  /**
   * @throws ClassCastException if value is not a QoS.verticalCoordinateRequestType
   */
  public void setVerticalCoordinateRequest(Asn1Object value) {
    this.verticalCoordinateRequest_ = (QoS.verticalCoordinateRequestType) value;
  }
  public QoS.verticalCoordinateRequestType setVerticalCoordinateRequestToNewInstance() {
    verticalCoordinateRequest_ = new QoS.verticalCoordinateRequestType();
    return verticalCoordinateRequest_;
  }
  
  private VerticalAccuracy verticalAccuracy_;
  public VerticalAccuracy getVerticalAccuracy() {
    return verticalAccuracy_;
  }
  /**
   * @throws ClassCastException if value is not a VerticalAccuracy
   */
  public void setVerticalAccuracy(Asn1Object value) {
    this.verticalAccuracy_ = (VerticalAccuracy) value;
  }
  public VerticalAccuracy setVerticalAccuracyToNewInstance() {
    verticalAccuracy_ = new VerticalAccuracy();
    return verticalAccuracy_;
  }
  
  private ResponseTime responseTime_;
  public ResponseTime getResponseTime() {
    return responseTime_;
  }
  /**
   * @throws ClassCastException if value is not a ResponseTime
   */
  public void setResponseTime(Asn1Object value) {
    this.responseTime_ = (ResponseTime) value;
  }
  public ResponseTime setResponseTimeToNewInstance() {
    responseTime_ = new ResponseTime();
    return responseTime_;
  }
  
  private QoS.velocityRequestType velocityRequest_;
  public QoS.velocityRequestType getVelocityRequest() {
    return velocityRequest_;
  }
  /**
   * @throws ClassCastException if value is not a QoS.velocityRequestType
   */
  public void setVelocityRequest(Asn1Object value) {
    this.velocityRequest_ = (QoS.velocityRequestType) value;
  }
  public QoS.velocityRequestType setVelocityRequestToNewInstance() {
    velocityRequest_ = new QoS.velocityRequestType();
    return velocityRequest_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getHorizontalAccuracy() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getHorizontalAccuracy();
          }

          @Override public void setToNewInstance() {
            setHorizontalAccuracyToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? HorizontalAccuracy.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "horizontalAccuracy : "
                    + getHorizontalAccuracy().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getVerticalCoordinateRequest() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getVerticalCoordinateRequest();
          }

          @Override public void setToNewInstance() {
            setVerticalCoordinateRequestToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? QoS.verticalCoordinateRequestType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "verticalCoordinateRequest : "
                    + getVerticalCoordinateRequest().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getVerticalAccuracy() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getVerticalAccuracy();
          }

          @Override public void setToNewInstance() {
            setVerticalAccuracyToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? VerticalAccuracy.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "verticalAccuracy : "
                    + getVerticalAccuracy().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getResponseTime() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getResponseTime();
          }

          @Override public void setToNewInstance() {
            setResponseTimeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ResponseTime.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "responseTime : "
                    + getResponseTime().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getVelocityRequest() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getVelocityRequest();
          }

          @Override public void setToNewInstance() {
            setVelocityRequestToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? QoS.velocityRequestType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "velocityRequest : "
                    + getVelocityRequest().toIndentedString(indent);
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
public static class verticalCoordinateRequestType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_verticalCoordinateRequestType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public verticalCoordinateRequestType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_verticalCoordinateRequestType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_verticalCoordinateRequestType != null) {
      return ImmutableList.of(TAG_verticalCoordinateRequestType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new verticalCoordinateRequestType from encoded stream.
   */
  public static verticalCoordinateRequestType fromPerUnaligned(byte[] encodedBytes) {
    verticalCoordinateRequestType result = new verticalCoordinateRequestType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new verticalCoordinateRequestType from encoded stream.
   */
  public static verticalCoordinateRequestType fromPerAligned(byte[] encodedBytes) {
    verticalCoordinateRequestType result = new verticalCoordinateRequestType();
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
    return "verticalCoordinateRequestType = " + getValue() + ";\n";
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
public static class velocityRequestType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_velocityRequestType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public velocityRequestType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_velocityRequestType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_velocityRequestType != null) {
      return ImmutableList.of(TAG_velocityRequestType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new velocityRequestType from encoded stream.
   */
  public static velocityRequestType fromPerUnaligned(byte[] encodedBytes) {
    velocityRequestType result = new velocityRequestType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new velocityRequestType from encoded stream.
   */
  public static velocityRequestType fromPerAligned(byte[] encodedBytes) {
    velocityRequestType result = new velocityRequestType();
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
    return "velocityRequestType = " + getValue() + ";\n";
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
    builder.append("QoS = {\n");
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
