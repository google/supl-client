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
public  class GANSSPositioningMethodTypes extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GANSSPositioningMethodTypes
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GANSSPositioningMethodTypes() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GANSSPositioningMethodTypes;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GANSSPositioningMethodTypes != null) {
      return ImmutableList.of(TAG_GANSSPositioningMethodTypes);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GANSSPositioningMethodTypes from encoded stream.
   */
  public static GANSSPositioningMethodTypes fromPerUnaligned(byte[] encodedBytes) {
    GANSSPositioningMethodTypes result = new GANSSPositioningMethodTypes();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GANSSPositioningMethodTypes from encoded stream.
   */
  public static GANSSPositioningMethodTypes fromPerAligned(byte[] encodedBytes) {
    GANSSPositioningMethodTypes result = new GANSSPositioningMethodTypes();
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

  
  private GANSSPositioningMethodTypes.setAssistedType setAssisted_;
  public GANSSPositioningMethodTypes.setAssistedType getSetAssisted() {
    return setAssisted_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSPositioningMethodTypes.setAssistedType
   */
  public void setSetAssisted(Asn1Object value) {
    this.setAssisted_ = (GANSSPositioningMethodTypes.setAssistedType) value;
  }
  public GANSSPositioningMethodTypes.setAssistedType setSetAssistedToNewInstance() {
    setAssisted_ = new GANSSPositioningMethodTypes.setAssistedType();
    return setAssisted_;
  }
  
  private GANSSPositioningMethodTypes.setBasedType setBased_;
  public GANSSPositioningMethodTypes.setBasedType getSetBased() {
    return setBased_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSPositioningMethodTypes.setBasedType
   */
  public void setSetBased(Asn1Object value) {
    this.setBased_ = (GANSSPositioningMethodTypes.setBasedType) value;
  }
  public GANSSPositioningMethodTypes.setBasedType setSetBasedToNewInstance() {
    setBased_ = new GANSSPositioningMethodTypes.setBasedType();
    return setBased_;
  }
  
  private GANSSPositioningMethodTypes.autonomousType autonomous_;
  public GANSSPositioningMethodTypes.autonomousType getAutonomous() {
    return autonomous_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSPositioningMethodTypes.autonomousType
   */
  public void setAutonomous(Asn1Object value) {
    this.autonomous_ = (GANSSPositioningMethodTypes.autonomousType) value;
  }
  public GANSSPositioningMethodTypes.autonomousType setAutonomousToNewInstance() {
    autonomous_ = new GANSSPositioningMethodTypes.autonomousType();
    return autonomous_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getSetAssisted() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getSetAssisted();
          }

          @Override public void setToNewInstance() {
            setSetAssistedToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSPositioningMethodTypes.setAssistedType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "setAssisted : "
                    + getSetAssisted().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getSetBased() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getSetBased();
          }

          @Override public void setToNewInstance() {
            setSetBasedToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSPositioningMethodTypes.setBasedType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "setBased : "
                    + getSetBased().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getAutonomous() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getAutonomous();
          }

          @Override public void setToNewInstance() {
            setAutonomousToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSPositioningMethodTypes.autonomousType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "autonomous : "
                    + getAutonomous().toIndentedString(indent);
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
public static class setAssistedType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_setAssistedType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public setAssistedType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_setAssistedType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_setAssistedType != null) {
      return ImmutableList.of(TAG_setAssistedType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new setAssistedType from encoded stream.
   */
  public static setAssistedType fromPerUnaligned(byte[] encodedBytes) {
    setAssistedType result = new setAssistedType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new setAssistedType from encoded stream.
   */
  public static setAssistedType fromPerAligned(byte[] encodedBytes) {
    setAssistedType result = new setAssistedType();
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
    return "setAssistedType = " + getValue() + ";\n";
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
public static class setBasedType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_setBasedType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public setBasedType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_setBasedType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_setBasedType != null) {
      return ImmutableList.of(TAG_setBasedType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new setBasedType from encoded stream.
   */
  public static setBasedType fromPerUnaligned(byte[] encodedBytes) {
    setBasedType result = new setBasedType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new setBasedType from encoded stream.
   */
  public static setBasedType fromPerAligned(byte[] encodedBytes) {
    setBasedType result = new setBasedType();
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
    return "setBasedType = " + getValue() + ";\n";
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
public static class autonomousType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_autonomousType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public autonomousType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_autonomousType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_autonomousType != null) {
      return ImmutableList.of(TAG_autonomousType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new autonomousType from encoded stream.
   */
  public static autonomousType fromPerUnaligned(byte[] encodedBytes) {
    autonomousType result = new autonomousType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new autonomousType from encoded stream.
   */
  public static autonomousType fromPerAligned(byte[] encodedBytes) {
    autonomousType result = new autonomousType();
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
    return "autonomousType = " + getValue() + ";\n";
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
    builder.append("GANSSPositioningMethodTypes = {\n");
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
