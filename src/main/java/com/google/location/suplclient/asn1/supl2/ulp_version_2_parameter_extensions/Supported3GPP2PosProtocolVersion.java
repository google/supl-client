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
import com.google.location.suplclient.asn1.base.Asn1BitString;
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
public  class Supported3GPP2PosProtocolVersion extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_Supported3GPP2PosProtocolVersion
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public Supported3GPP2PosProtocolVersion() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_Supported3GPP2PosProtocolVersion;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_Supported3GPP2PosProtocolVersion != null) {
      return ImmutableList.of(TAG_Supported3GPP2PosProtocolVersion);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new Supported3GPP2PosProtocolVersion from encoded stream.
   */
  public static Supported3GPP2PosProtocolVersion fromPerUnaligned(byte[] encodedBytes) {
    Supported3GPP2PosProtocolVersion result = new Supported3GPP2PosProtocolVersion();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new Supported3GPP2PosProtocolVersion from encoded stream.
   */
  public static Supported3GPP2PosProtocolVersion fromPerAligned(byte[] encodedBytes) {
    Supported3GPP2PosProtocolVersion result = new Supported3GPP2PosProtocolVersion();
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

  
  private Supported3GPP2PosProtocolVersion.revisionNumberType revisionNumber_;
  public Supported3GPP2PosProtocolVersion.revisionNumberType getRevisionNumber() {
    return revisionNumber_;
  }
  /**
   * @throws ClassCastException if value is not a Supported3GPP2PosProtocolVersion.revisionNumberType
   */
  public void setRevisionNumber(Asn1Object value) {
    this.revisionNumber_ = (Supported3GPP2PosProtocolVersion.revisionNumberType) value;
  }
  public Supported3GPP2PosProtocolVersion.revisionNumberType setRevisionNumberToNewInstance() {
    revisionNumber_ = new Supported3GPP2PosProtocolVersion.revisionNumberType();
    return revisionNumber_;
  }
  
  private Supported3GPP2PosProtocolVersion.pointReleaseNumberType pointReleaseNumber_;
  public Supported3GPP2PosProtocolVersion.pointReleaseNumberType getPointReleaseNumber() {
    return pointReleaseNumber_;
  }
  /**
   * @throws ClassCastException if value is not a Supported3GPP2PosProtocolVersion.pointReleaseNumberType
   */
  public void setPointReleaseNumber(Asn1Object value) {
    this.pointReleaseNumber_ = (Supported3GPP2PosProtocolVersion.pointReleaseNumberType) value;
  }
  public Supported3GPP2PosProtocolVersion.pointReleaseNumberType setPointReleaseNumberToNewInstance() {
    pointReleaseNumber_ = new Supported3GPP2PosProtocolVersion.pointReleaseNumberType();
    return pointReleaseNumber_;
  }
  
  private Supported3GPP2PosProtocolVersion.internalEditLevelType internalEditLevel_;
  public Supported3GPP2PosProtocolVersion.internalEditLevelType getInternalEditLevel() {
    return internalEditLevel_;
  }
  /**
   * @throws ClassCastException if value is not a Supported3GPP2PosProtocolVersion.internalEditLevelType
   */
  public void setInternalEditLevel(Asn1Object value) {
    this.internalEditLevel_ = (Supported3GPP2PosProtocolVersion.internalEditLevelType) value;
  }
  public Supported3GPP2PosProtocolVersion.internalEditLevelType setInternalEditLevelToNewInstance() {
    internalEditLevel_ = new Supported3GPP2PosProtocolVersion.internalEditLevelType();
    return internalEditLevel_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getRevisionNumber() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getRevisionNumber();
          }

          @Override public void setToNewInstance() {
            setRevisionNumberToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Supported3GPP2PosProtocolVersion.revisionNumberType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "revisionNumber : "
                    + getRevisionNumber().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getPointReleaseNumber() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getPointReleaseNumber();
          }

          @Override public void setToNewInstance() {
            setPointReleaseNumberToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Supported3GPP2PosProtocolVersion.pointReleaseNumberType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "pointReleaseNumber : "
                    + getPointReleaseNumber().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getInternalEditLevel() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getInternalEditLevel();
          }

          @Override public void setToNewInstance() {
            setInternalEditLevelToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Supported3GPP2PosProtocolVersion.internalEditLevelType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "internalEditLevel : "
                    + getInternalEditLevel().toIndentedString(indent);
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
public static class revisionNumberType extends Asn1BitString {
  //

  // defined bit positions, if any
  

  // setters
  

  // clearers
  


  private static final Asn1Tag TAG_revisionNumberType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public revisionNumberType() {
    super();
    setMinSize(6);
setMaxSize(6);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_revisionNumberType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_revisionNumberType != null) {
      return ImmutableList.of(TAG_revisionNumberType);
    } else {
      return Asn1BitString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new revisionNumberType from encoded stream.
   */
  public static revisionNumberType fromPerUnaligned(byte[] encodedBytes) {
    revisionNumberType result = new revisionNumberType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new revisionNumberType from encoded stream.
   */
  public static revisionNumberType fromPerAligned(byte[] encodedBytes) {
    revisionNumberType result = new revisionNumberType();
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
    return "revisionNumberType = " + getValue() + ";\n";
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
public static class pointReleaseNumberType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_pointReleaseNumberType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public pointReleaseNumberType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("255"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_pointReleaseNumberType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_pointReleaseNumberType != null) {
      return ImmutableList.of(TAG_pointReleaseNumberType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new pointReleaseNumberType from encoded stream.
   */
  public static pointReleaseNumberType fromPerUnaligned(byte[] encodedBytes) {
    pointReleaseNumberType result = new pointReleaseNumberType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new pointReleaseNumberType from encoded stream.
   */
  public static pointReleaseNumberType fromPerAligned(byte[] encodedBytes) {
    pointReleaseNumberType result = new pointReleaseNumberType();
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
    return "pointReleaseNumberType = " + getInteger() + ";\n";
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
public static class internalEditLevelType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_internalEditLevelType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public internalEditLevelType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("255"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_internalEditLevelType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_internalEditLevelType != null) {
      return ImmutableList.of(TAG_internalEditLevelType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new internalEditLevelType from encoded stream.
   */
  public static internalEditLevelType fromPerUnaligned(byte[] encodedBytes) {
    internalEditLevelType result = new internalEditLevelType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new internalEditLevelType from encoded stream.
   */
  public static internalEditLevelType fromPerAligned(byte[] encodedBytes) {
    internalEditLevelType result = new internalEditLevelType();
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
    return "internalEditLevelType = " + getInteger() + ";\n";
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
    builder.append("Supported3GPP2PosProtocolVersion = {\n");
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
