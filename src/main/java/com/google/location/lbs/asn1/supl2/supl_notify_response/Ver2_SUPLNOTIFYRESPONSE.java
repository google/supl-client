package com.google.location.lbs.asn1.supl2.supl_notify_response;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.google.location.lbs.asn1.base.Asn1Null;
import com.google.location.lbs.asn1.base.Asn1Object;
import com.google.location.lbs.asn1.base.Asn1Sequence;
import com.google.location.lbs.asn1.base.Asn1Tag;
import com.google.location.lbs.asn1.base.BitStream;
import com.google.location.lbs.asn1.base.BitStreamReader;
import com.google.location.lbs.asn1.base.SequenceComponent;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
* @author Torbjorn Gannholm (tobe@google.com)
*/
public  class Ver2_SUPLNOTIFYRESPONSE extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_Ver2_SUPLNOTIFYRESPONSE
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public Ver2_SUPLNOTIFYRESPONSE() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_Ver2_SUPLNOTIFYRESPONSE;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_Ver2_SUPLNOTIFYRESPONSE != null) {
      return ImmutableList.of(TAG_Ver2_SUPLNOTIFYRESPONSE);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new Ver2_SUPLNOTIFYRESPONSE from encoded stream.
   */
  public static Ver2_SUPLNOTIFYRESPONSE fromPerUnaligned(byte[] encodedBytes) {
    Ver2_SUPLNOTIFYRESPONSE result = new Ver2_SUPLNOTIFYRESPONSE();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new Ver2_SUPLNOTIFYRESPONSE from encoded stream.
   */
  public static Ver2_SUPLNOTIFYRESPONSE fromPerAligned(byte[] encodedBytes) {
    Ver2_SUPLNOTIFYRESPONSE result = new Ver2_SUPLNOTIFYRESPONSE();
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

  
  private NotificationResponse notificationResponse_;
  public NotificationResponse getNotificationResponse() {
    return notificationResponse_;
  }
  /**
   * @throws ClassCastException if value is not a NotificationResponse
   */
  public void setNotificationResponse(Asn1Object value) {
    this.notificationResponse_ = (NotificationResponse) value;
  }
  public NotificationResponse setNotificationResponseToNewInstance() {
    notificationResponse_ = new NotificationResponse();
    return notificationResponse_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getNotificationResponse() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getNotificationResponse();
          }

          @Override public void setToNewInstance() {
            setNotificationResponseToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NotificationResponse.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "notificationResponse : "
                    + getNotificationResponse().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      return builder.build();
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
    builder.append("Ver2_SUPLNOTIFYRESPONSE = {\n");
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
