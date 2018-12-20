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
public  class LPP_Message extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_LPP_Message
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public LPP_Message() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_LPP_Message;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_LPP_Message != null) {
      return ImmutableList.of(TAG_LPP_Message);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new LPP_Message from encoded stream.
   */
  public static LPP_Message fromPerUnaligned(byte[] encodedBytes) {
    LPP_Message result = new LPP_Message();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new LPP_Message from encoded stream.
   */
  public static LPP_Message fromPerAligned(byte[] encodedBytes) {
    LPP_Message result = new LPP_Message();
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

  
  private LPP_TransactionID transactionID_;
  public LPP_TransactionID getTransactionID() {
    return transactionID_;
  }
  /**
   * @throws ClassCastException if value is not a LPP_TransactionID
   */
  public void setTransactionID(Asn1Object value) {
    this.transactionID_ = (LPP_TransactionID) value;
  }
  public LPP_TransactionID setTransactionIDToNewInstance() {
    transactionID_ = new LPP_TransactionID();
    return transactionID_;
  }
  
  private LPP_Message.endTransactionType endTransaction_;
  public LPP_Message.endTransactionType getEndTransaction() {
    return endTransaction_;
  }
  /**
   * @throws ClassCastException if value is not a LPP_Message.endTransactionType
   */
  public void setEndTransaction(Asn1Object value) {
    this.endTransaction_ = (LPP_Message.endTransactionType) value;
  }
  public LPP_Message.endTransactionType setEndTransactionToNewInstance() {
    endTransaction_ = new LPP_Message.endTransactionType();
    return endTransaction_;
  }
  
  private SequenceNumber sequenceNumber_;
  public SequenceNumber getSequenceNumber() {
    return sequenceNumber_;
  }
  /**
   * @throws ClassCastException if value is not a SequenceNumber
   */
  public void setSequenceNumber(Asn1Object value) {
    this.sequenceNumber_ = (SequenceNumber) value;
  }
  public SequenceNumber setSequenceNumberToNewInstance() {
    sequenceNumber_ = new SequenceNumber();
    return sequenceNumber_;
  }
  
  private Acknowledgement acknowledgement_;
  public Acknowledgement getAcknowledgement() {
    return acknowledgement_;
  }
  /**
   * @throws ClassCastException if value is not a Acknowledgement
   */
  public void setAcknowledgement(Asn1Object value) {
    this.acknowledgement_ = (Acknowledgement) value;
  }
  public Acknowledgement setAcknowledgementToNewInstance() {
    acknowledgement_ = new Acknowledgement();
    return acknowledgement_;
  }
  
  private LPP_MessageBody lpp_MessageBody_;
  public LPP_MessageBody getLpp_MessageBody() {
    return lpp_MessageBody_;
  }
  /**
   * @throws ClassCastException if value is not a LPP_MessageBody
   */
  public void setLpp_MessageBody(Asn1Object value) {
    this.lpp_MessageBody_ = (LPP_MessageBody) value;
  }
  public LPP_MessageBody setLpp_MessageBodyToNewInstance() {
    lpp_MessageBody_ = new LPP_MessageBody();
    return lpp_MessageBody_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getTransactionID() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getTransactionID();
          }

          @Override public void setToNewInstance() {
            setTransactionIDToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? LPP_TransactionID.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "transactionID : "
                    + getTransactionID().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getEndTransaction() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getEndTransaction();
          }

          @Override public void setToNewInstance() {
            setEndTransactionToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? LPP_Message.endTransactionType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "endTransaction : "
                    + getEndTransaction().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getSequenceNumber() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getSequenceNumber();
          }

          @Override public void setToNewInstance() {
            setSequenceNumberToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SequenceNumber.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "sequenceNumber : "
                    + getSequenceNumber().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getAcknowledgement() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getAcknowledgement();
          }

          @Override public void setToNewInstance() {
            setAcknowledgementToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Acknowledgement.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "acknowledgement : "
                    + getAcknowledgement().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getLpp_MessageBody() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getLpp_MessageBody();
          }

          @Override public void setToNewInstance() {
            setLpp_MessageBodyToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? LPP_MessageBody.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "lpp_MessageBody : "
                    + getLpp_MessageBody().toIndentedString(indent);
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
public static class endTransactionType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_endTransactionType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public endTransactionType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_endTransactionType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_endTransactionType != null) {
      return ImmutableList.of(TAG_endTransactionType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new endTransactionType from encoded stream.
   */
  public static endTransactionType fromPerUnaligned(byte[] encodedBytes) {
    endTransactionType result = new endTransactionType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new endTransactionType from encoded stream.
   */
  public static endTransactionType fromPerAligned(byte[] encodedBytes) {
    endTransactionType result = new endTransactionType();
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
    return "endTransactionType = " + getValue() + ";\n";
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
    builder.append("LPP_Message = {\n");
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
