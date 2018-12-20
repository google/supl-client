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

package com.google.location.suplclient.asn1.supl2.ulp_version_2_message_extensions;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.google.location.suplclient.asn1.base.Asn1BitString;
import com.google.location.suplclient.asn1.base.Asn1Integer;
import com.google.location.suplclient.asn1.base.Asn1Object;
import com.google.location.suplclient.asn1.base.Asn1OctetString;
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
public  class BasicProtectionParams extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_BasicProtectionParams
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public BasicProtectionParams() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_BasicProtectionParams;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_BasicProtectionParams != null) {
      return ImmutableList.of(TAG_BasicProtectionParams);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new BasicProtectionParams from encoded stream.
   */
  public static BasicProtectionParams fromPerUnaligned(byte[] encodedBytes) {
    BasicProtectionParams result = new BasicProtectionParams();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new BasicProtectionParams from encoded stream.
   */
  public static BasicProtectionParams fromPerAligned(byte[] encodedBytes) {
    BasicProtectionParams result = new BasicProtectionParams();
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

  
  private BasicProtectionParams.keyIdentifierType keyIdentifier_;
  public BasicProtectionParams.keyIdentifierType getKeyIdentifier() {
    return keyIdentifier_;
  }
  /**
   * @throws ClassCastException if value is not a BasicProtectionParams.keyIdentifierType
   */
  public void setKeyIdentifier(Asn1Object value) {
    this.keyIdentifier_ = (BasicProtectionParams.keyIdentifierType) value;
  }
  public BasicProtectionParams.keyIdentifierType setKeyIdentifierToNewInstance() {
    keyIdentifier_ = new BasicProtectionParams.keyIdentifierType();
    return keyIdentifier_;
  }
  
  private BasicProtectionParams.basicReplayCounterType basicReplayCounter_;
  public BasicProtectionParams.basicReplayCounterType getBasicReplayCounter() {
    return basicReplayCounter_;
  }
  /**
   * @throws ClassCastException if value is not a BasicProtectionParams.basicReplayCounterType
   */
  public void setBasicReplayCounter(Asn1Object value) {
    this.basicReplayCounter_ = (BasicProtectionParams.basicReplayCounterType) value;
  }
  public BasicProtectionParams.basicReplayCounterType setBasicReplayCounterToNewInstance() {
    basicReplayCounter_ = new BasicProtectionParams.basicReplayCounterType();
    return basicReplayCounter_;
  }
  
  private BasicProtectionParams.basicMACType basicMAC_;
  public BasicProtectionParams.basicMACType getBasicMAC() {
    return basicMAC_;
  }
  /**
   * @throws ClassCastException if value is not a BasicProtectionParams.basicMACType
   */
  public void setBasicMAC(Asn1Object value) {
    this.basicMAC_ = (BasicProtectionParams.basicMACType) value;
  }
  public BasicProtectionParams.basicMACType setBasicMACToNewInstance() {
    basicMAC_ = new BasicProtectionParams.basicMACType();
    return basicMAC_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getKeyIdentifier() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getKeyIdentifier();
          }

          @Override public void setToNewInstance() {
            setKeyIdentifierToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? BasicProtectionParams.keyIdentifierType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "keyIdentifier : "
                    + getKeyIdentifier().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getBasicReplayCounter() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBasicReplayCounter();
          }

          @Override public void setToNewInstance() {
            setBasicReplayCounterToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? BasicProtectionParams.basicReplayCounterType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "basicReplayCounter : "
                    + getBasicReplayCounter().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getBasicMAC() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBasicMAC();
          }

          @Override public void setToNewInstance() {
            setBasicMACToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? BasicProtectionParams.basicMACType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "basicMAC : "
                    + getBasicMAC().toIndentedString(indent);
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
public static class keyIdentifierType extends Asn1OctetString {
  //

  private static final Asn1Tag TAG_keyIdentifierType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public keyIdentifierType() {
    super();
    setMinSize(8);
setMaxSize(8);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_keyIdentifierType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_keyIdentifierType != null) {
      return ImmutableList.of(TAG_keyIdentifierType);
    } else {
      return Asn1OctetString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new keyIdentifierType from encoded stream.
   */
  public static keyIdentifierType fromPerUnaligned(byte[] encodedBytes) {
    keyIdentifierType result = new keyIdentifierType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new keyIdentifierType from encoded stream.
   */
  public static keyIdentifierType fromPerAligned(byte[] encodedBytes) {
    keyIdentifierType result = new keyIdentifierType();
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
    return "keyIdentifierType";
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
public static class basicReplayCounterType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_basicReplayCounterType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public basicReplayCounterType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("65535"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_basicReplayCounterType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_basicReplayCounterType != null) {
      return ImmutableList.of(TAG_basicReplayCounterType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new basicReplayCounterType from encoded stream.
   */
  public static basicReplayCounterType fromPerUnaligned(byte[] encodedBytes) {
    basicReplayCounterType result = new basicReplayCounterType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new basicReplayCounterType from encoded stream.
   */
  public static basicReplayCounterType fromPerAligned(byte[] encodedBytes) {
    basicReplayCounterType result = new basicReplayCounterType();
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
    return "basicReplayCounterType = " + getInteger() + ";\n";
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
public static class basicMACType extends Asn1BitString {
  //

  // defined bit positions, if any
  

  // setters
  

  // clearers
  


  private static final Asn1Tag TAG_basicMACType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public basicMACType() {
    super();
    setMinSize(32);
setMaxSize(32);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_basicMACType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_basicMACType != null) {
      return ImmutableList.of(TAG_basicMACType);
    } else {
      return Asn1BitString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new basicMACType from encoded stream.
   */
  public static basicMACType fromPerUnaligned(byte[] encodedBytes) {
    basicMACType result = new basicMACType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new basicMACType from encoded stream.
   */
  public static basicMACType fromPerAligned(byte[] encodedBytes) {
    basicMACType result = new basicMACType();
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
    return "basicMACType = " + getValue() + ";\n";
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
    builder.append("BasicProtectionParams = {\n");
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
