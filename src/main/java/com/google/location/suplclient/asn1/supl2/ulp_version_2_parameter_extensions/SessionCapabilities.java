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

package com.google.location.suplclient.asn1.supl2.ulp_version_2_parameter_extensions;

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
public  class SessionCapabilities extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_SessionCapabilities
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public SessionCapabilities() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_SessionCapabilities;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_SessionCapabilities != null) {
      return ImmutableList.of(TAG_SessionCapabilities);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new SessionCapabilities from encoded stream.
   */
  public static SessionCapabilities fromPerUnaligned(byte[] encodedBytes) {
    SessionCapabilities result = new SessionCapabilities();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new SessionCapabilities from encoded stream.
   */
  public static SessionCapabilities fromPerAligned(byte[] encodedBytes) {
    SessionCapabilities result = new SessionCapabilities();
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

  
  private SessionCapabilities.maxNumberTotalSessionsType maxNumberTotalSessions_;
  public SessionCapabilities.maxNumberTotalSessionsType getMaxNumberTotalSessions() {
    return maxNumberTotalSessions_;
  }
  /**
   * @throws ClassCastException if value is not a SessionCapabilities.maxNumberTotalSessionsType
   */
  public void setMaxNumberTotalSessions(Asn1Object value) {
    this.maxNumberTotalSessions_ = (SessionCapabilities.maxNumberTotalSessionsType) value;
  }
  public SessionCapabilities.maxNumberTotalSessionsType setMaxNumberTotalSessionsToNewInstance() {
    maxNumberTotalSessions_ = new SessionCapabilities.maxNumberTotalSessionsType();
    return maxNumberTotalSessions_;
  }
  
  private SessionCapabilities.maxNumberPeriodicSessionsType maxNumberPeriodicSessions_;
  public SessionCapabilities.maxNumberPeriodicSessionsType getMaxNumberPeriodicSessions() {
    return maxNumberPeriodicSessions_;
  }
  /**
   * @throws ClassCastException if value is not a SessionCapabilities.maxNumberPeriodicSessionsType
   */
  public void setMaxNumberPeriodicSessions(Asn1Object value) {
    this.maxNumberPeriodicSessions_ = (SessionCapabilities.maxNumberPeriodicSessionsType) value;
  }
  public SessionCapabilities.maxNumberPeriodicSessionsType setMaxNumberPeriodicSessionsToNewInstance() {
    maxNumberPeriodicSessions_ = new SessionCapabilities.maxNumberPeriodicSessionsType();
    return maxNumberPeriodicSessions_;
  }
  
  private SessionCapabilities.maxNumberTriggeredSessionsType maxNumberTriggeredSessions_;
  public SessionCapabilities.maxNumberTriggeredSessionsType getMaxNumberTriggeredSessions() {
    return maxNumberTriggeredSessions_;
  }
  /**
   * @throws ClassCastException if value is not a SessionCapabilities.maxNumberTriggeredSessionsType
   */
  public void setMaxNumberTriggeredSessions(Asn1Object value) {
    this.maxNumberTriggeredSessions_ = (SessionCapabilities.maxNumberTriggeredSessionsType) value;
  }
  public SessionCapabilities.maxNumberTriggeredSessionsType setMaxNumberTriggeredSessionsToNewInstance() {
    maxNumberTriggeredSessions_ = new SessionCapabilities.maxNumberTriggeredSessionsType();
    return maxNumberTriggeredSessions_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getMaxNumberTotalSessions() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getMaxNumberTotalSessions();
          }

          @Override public void setToNewInstance() {
            setMaxNumberTotalSessionsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SessionCapabilities.maxNumberTotalSessionsType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "maxNumberTotalSessions : "
                    + getMaxNumberTotalSessions().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getMaxNumberPeriodicSessions() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getMaxNumberPeriodicSessions();
          }

          @Override public void setToNewInstance() {
            setMaxNumberPeriodicSessionsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SessionCapabilities.maxNumberPeriodicSessionsType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "maxNumberPeriodicSessions : "
                    + getMaxNumberPeriodicSessions().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getMaxNumberTriggeredSessions() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getMaxNumberTriggeredSessions();
          }

          @Override public void setToNewInstance() {
            setMaxNumberTriggeredSessionsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SessionCapabilities.maxNumberTriggeredSessionsType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "maxNumberTriggeredSessions : "
                    + getMaxNumberTriggeredSessions().toIndentedString(indent);
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
public static class maxNumberTotalSessionsType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_maxNumberTotalSessionsType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public maxNumberTotalSessionsType() {
    super();
    setValueRange(new java.math.BigInteger("1"), new java.math.BigInteger("128"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_maxNumberTotalSessionsType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_maxNumberTotalSessionsType != null) {
      return ImmutableList.of(TAG_maxNumberTotalSessionsType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new maxNumberTotalSessionsType from encoded stream.
   */
  public static maxNumberTotalSessionsType fromPerUnaligned(byte[] encodedBytes) {
    maxNumberTotalSessionsType result = new maxNumberTotalSessionsType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new maxNumberTotalSessionsType from encoded stream.
   */
  public static maxNumberTotalSessionsType fromPerAligned(byte[] encodedBytes) {
    maxNumberTotalSessionsType result = new maxNumberTotalSessionsType();
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
    return "maxNumberTotalSessionsType = " + getInteger() + ";\n";
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
public static class maxNumberPeriodicSessionsType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_maxNumberPeriodicSessionsType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public maxNumberPeriodicSessionsType() {
    super();
    setValueRange(new java.math.BigInteger("1"), new java.math.BigInteger("32"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_maxNumberPeriodicSessionsType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_maxNumberPeriodicSessionsType != null) {
      return ImmutableList.of(TAG_maxNumberPeriodicSessionsType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new maxNumberPeriodicSessionsType from encoded stream.
   */
  public static maxNumberPeriodicSessionsType fromPerUnaligned(byte[] encodedBytes) {
    maxNumberPeriodicSessionsType result = new maxNumberPeriodicSessionsType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new maxNumberPeriodicSessionsType from encoded stream.
   */
  public static maxNumberPeriodicSessionsType fromPerAligned(byte[] encodedBytes) {
    maxNumberPeriodicSessionsType result = new maxNumberPeriodicSessionsType();
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
    return "maxNumberPeriodicSessionsType = " + getInteger() + ";\n";
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
public static class maxNumberTriggeredSessionsType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_maxNumberTriggeredSessionsType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public maxNumberTriggeredSessionsType() {
    super();
    setValueRange(new java.math.BigInteger("1"), new java.math.BigInteger("32"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_maxNumberTriggeredSessionsType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_maxNumberTriggeredSessionsType != null) {
      return ImmutableList.of(TAG_maxNumberTriggeredSessionsType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new maxNumberTriggeredSessionsType from encoded stream.
   */
  public static maxNumberTriggeredSessionsType fromPerUnaligned(byte[] encodedBytes) {
    maxNumberTriggeredSessionsType result = new maxNumberTriggeredSessionsType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new maxNumberTriggeredSessionsType from encoded stream.
   */
  public static maxNumberTriggeredSessionsType fromPerAligned(byte[] encodedBytes) {
    maxNumberTriggeredSessionsType result = new maxNumberTriggeredSessionsType();
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
    return "maxNumberTriggeredSessionsType = " + getInteger() + ";\n";
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
    builder.append("SessionCapabilities = {\n");
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
