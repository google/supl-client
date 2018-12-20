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

package com.google.location.suplclient.asn1.supl2.supl_init;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.google.location.suplclient.asn1.base.Asn1Object;
import com.google.location.suplclient.asn1.base.Asn1OctetString;
import com.google.location.suplclient.asn1.base.Asn1Sequence;
import com.google.location.suplclient.asn1.base.Asn1Tag;
import com.google.location.suplclient.asn1.base.BitStream;
import com.google.location.suplclient.asn1.base.BitStreamReader;
import com.google.location.suplclient.asn1.base.SequenceComponent;
import com.google.location.suplclient.asn1.supl2.ulp_version_2_parameter_extensions.Ver2_Notification_extension;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
* 
*/
public  class Notification extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_Notification
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public Notification() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_Notification;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_Notification != null) {
      return ImmutableList.of(TAG_Notification);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new Notification from encoded stream.
   */
  public static Notification fromPerUnaligned(byte[] encodedBytes) {
    Notification result = new Notification();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new Notification from encoded stream.
   */
  public static Notification fromPerAligned(byte[] encodedBytes) {
    Notification result = new Notification();
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

  
  private NotificationType notificationType_;
  public NotificationType getNotificationType() {
    return notificationType_;
  }
  /**
   * @throws ClassCastException if value is not a NotificationType
   */
  public void setNotificationType(Asn1Object value) {
    this.notificationType_ = (NotificationType) value;
  }
  public NotificationType setNotificationTypeToNewInstance() {
    notificationType_ = new NotificationType();
    return notificationType_;
  }
  
  private EncodingType encodingType_;
  public EncodingType getEncodingType() {
    return encodingType_;
  }
  /**
   * @throws ClassCastException if value is not a EncodingType
   */
  public void setEncodingType(Asn1Object value) {
    this.encodingType_ = (EncodingType) value;
  }
  public EncodingType setEncodingTypeToNewInstance() {
    encodingType_ = new EncodingType();
    return encodingType_;
  }
  
  private Notification.requestorIdType requestorId_;
  public Notification.requestorIdType getRequestorId() {
    return requestorId_;
  }
  /**
   * @throws ClassCastException if value is not a Notification.requestorIdType
   */
  public void setRequestorId(Asn1Object value) {
    this.requestorId_ = (Notification.requestorIdType) value;
  }
  public Notification.requestorIdType setRequestorIdToNewInstance() {
    requestorId_ = new Notification.requestorIdType();
    return requestorId_;
  }
  
  private FormatIndicator requestorIdType_;
  public FormatIndicator getRequestorIdType() {
    return requestorIdType_;
  }
  /**
   * @throws ClassCastException if value is not a FormatIndicator
   */
  public void setRequestorIdType(Asn1Object value) {
    this.requestorIdType_ = (FormatIndicator) value;
  }
  public FormatIndicator setRequestorIdTypeToNewInstance() {
    requestorIdType_ = new FormatIndicator();
    return requestorIdType_;
  }
  
  private Notification.clientNameType clientName_;
  public Notification.clientNameType getClientName() {
    return clientName_;
  }
  /**
   * @throws ClassCastException if value is not a Notification.clientNameType
   */
  public void setClientName(Asn1Object value) {
    this.clientName_ = (Notification.clientNameType) value;
  }
  public Notification.clientNameType setClientNameToNewInstance() {
    clientName_ = new Notification.clientNameType();
    return clientName_;
  }
  
  private FormatIndicator clientNameType_;
  public FormatIndicator getClientNameType() {
    return clientNameType_;
  }
  /**
   * @throws ClassCastException if value is not a FormatIndicator
   */
  public void setClientNameType(Asn1Object value) {
    this.clientNameType_ = (FormatIndicator) value;
  }
  public FormatIndicator setClientNameTypeToNewInstance() {
    clientNameType_ = new FormatIndicator();
    return clientNameType_;
  }
  

  
  private Ver2_Notification_extension extensionVer2_Notification_extension;
  public Ver2_Notification_extension getExtensionVer2_Notification_extension() {
    return extensionVer2_Notification_extension;
  }
  /**
   * @throws ClassCastException if value is not a Ver2_Notification_extension
   */
  public void setExtensionVer2_Notification_extension(Asn1Object value) {
    extensionVer2_Notification_extension = (Ver2_Notification_extension) value;
  }
  public void setExtensionVer2_Notification_extensionToNewInstance() {
    extensionVer2_Notification_extension = new Ver2_Notification_extension();
  }
    

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getNotificationType() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getNotificationType();
          }

          @Override public void setToNewInstance() {
            setNotificationTypeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NotificationType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "notificationType : "
                    + getNotificationType().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getEncodingType() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getEncodingType();
          }

          @Override public void setToNewInstance() {
            setEncodingTypeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? EncodingType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "encodingType : "
                    + getEncodingType().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getRequestorId() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getRequestorId();
          }

          @Override public void setToNewInstance() {
            setRequestorIdToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Notification.requestorIdType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "requestorId : "
                    + getRequestorId().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getRequestorIdType() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getRequestorIdType();
          }

          @Override public void setToNewInstance() {
            setRequestorIdTypeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? FormatIndicator.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "requestorIdType : "
                    + getRequestorIdType().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getClientName() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getClientName();
          }

          @Override public void setToNewInstance() {
            setClientNameToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Notification.clientNameType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "clientName : "
                    + getClientName().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getClientNameType() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getClientNameType();
          }

          @Override public void setToNewInstance() {
            setClientNameTypeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? FormatIndicator.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "clientNameType : "
                    + getClientNameType().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      builder.add(new SequenceComponent() {
            @Override public boolean isExplicitlySet() {
              return getExtensionVer2_Notification_extension() != null;
            }

            @Override public boolean hasDefaultValue() {
              return false;
            }

            @Override public boolean isOptional() {
              return true;
            }

            @Override public Asn1Object getComponentValue() {
              return getExtensionVer2_Notification_extension();
            }

            @Override public void setToNewInstance() {
              setExtensionVer2_Notification_extensionToNewInstance();
            }

            @Override public Collection<Asn1Tag> getPossibleFirstTags() {
              throw new UnsupportedOperationException(
                  "BER decoding not supported for extension elements");
            }

            @Override
            public Asn1Tag getTag() {
              throw new UnsupportedOperationException(
                  "BER is not supported for extension elements");
            }

            @Override
            public boolean isImplicitTagging() {
              throw new UnsupportedOperationException(
                  "BER is not supported for extension elements");
            }

            @Override public String toIndentedString(String indent) {
              return "ver2_Notification_extension : "
                  + getExtensionVer2_Notification_extension().toIndentedString(indent);
            }
      });
      
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
public static class requestorIdType extends Asn1OctetString {
  //

  private static final Asn1Tag TAG_requestorIdType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public requestorIdType() {
    super();
    setMinSize(1);
setMaxSize(50);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_requestorIdType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_requestorIdType != null) {
      return ImmutableList.of(TAG_requestorIdType);
    } else {
      return Asn1OctetString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new requestorIdType from encoded stream.
   */
  public static requestorIdType fromPerUnaligned(byte[] encodedBytes) {
    requestorIdType result = new requestorIdType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new requestorIdType from encoded stream.
   */
  public static requestorIdType fromPerAligned(byte[] encodedBytes) {
    requestorIdType result = new requestorIdType();
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

  @Override protected String getTypeName() {
    return "requestorIdType";
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
public static class clientNameType extends Asn1OctetString {
  //

  private static final Asn1Tag TAG_clientNameType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public clientNameType() {
    super();
    setMinSize(1);
setMaxSize(50);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_clientNameType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_clientNameType != null) {
      return ImmutableList.of(TAG_clientNameType);
    } else {
      return Asn1OctetString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new clientNameType from encoded stream.
   */
  public static clientNameType fromPerUnaligned(byte[] encodedBytes) {
    clientNameType result = new clientNameType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new clientNameType from encoded stream.
   */
  public static clientNameType fromPerAligned(byte[] encodedBytes) {
    clientNameType result = new clientNameType();
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

  @Override protected String getTypeName() {
    return "clientNameType";
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
    builder.append("Notification = {\n");
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
