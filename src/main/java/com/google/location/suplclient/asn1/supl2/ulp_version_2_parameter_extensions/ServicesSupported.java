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
public  class ServicesSupported extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_ServicesSupported
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ServicesSupported() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ServicesSupported;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ServicesSupported != null) {
      return ImmutableList.of(TAG_ServicesSupported);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ServicesSupported from encoded stream.
   */
  public static ServicesSupported fromPerUnaligned(byte[] encodedBytes) {
    ServicesSupported result = new ServicesSupported();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ServicesSupported from encoded stream.
   */
  public static ServicesSupported fromPerAligned(byte[] encodedBytes) {
    ServicesSupported result = new ServicesSupported();
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

  
  private ServicesSupported.periodicTriggerType periodicTrigger_;
  public ServicesSupported.periodicTriggerType getPeriodicTrigger() {
    return periodicTrigger_;
  }
  /**
   * @throws ClassCastException if value is not a ServicesSupported.periodicTriggerType
   */
  public void setPeriodicTrigger(Asn1Object value) {
    this.periodicTrigger_ = (ServicesSupported.periodicTriggerType) value;
  }
  public ServicesSupported.periodicTriggerType setPeriodicTriggerToNewInstance() {
    periodicTrigger_ = new ServicesSupported.periodicTriggerType();
    return periodicTrigger_;
  }
  
  private ServicesSupported.areaEventTriggerType areaEventTrigger_;
  public ServicesSupported.areaEventTriggerType getAreaEventTrigger() {
    return areaEventTrigger_;
  }
  /**
   * @throws ClassCastException if value is not a ServicesSupported.areaEventTriggerType
   */
  public void setAreaEventTrigger(Asn1Object value) {
    this.areaEventTrigger_ = (ServicesSupported.areaEventTriggerType) value;
  }
  public ServicesSupported.areaEventTriggerType setAreaEventTriggerToNewInstance() {
    areaEventTrigger_ = new ServicesSupported.areaEventTriggerType();
    return areaEventTrigger_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getPeriodicTrigger() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getPeriodicTrigger();
          }

          @Override public void setToNewInstance() {
            setPeriodicTriggerToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ServicesSupported.periodicTriggerType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "periodicTrigger : "
                    + getPeriodicTrigger().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getAreaEventTrigger() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getAreaEventTrigger();
          }

          @Override public void setToNewInstance() {
            setAreaEventTriggerToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ServicesSupported.areaEventTriggerType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "areaEventTrigger : "
                    + getAreaEventTrigger().toIndentedString(indent);
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
public static class periodicTriggerType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_periodicTriggerType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public periodicTriggerType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_periodicTriggerType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_periodicTriggerType != null) {
      return ImmutableList.of(TAG_periodicTriggerType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new periodicTriggerType from encoded stream.
   */
  public static periodicTriggerType fromPerUnaligned(byte[] encodedBytes) {
    periodicTriggerType result = new periodicTriggerType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new periodicTriggerType from encoded stream.
   */
  public static periodicTriggerType fromPerAligned(byte[] encodedBytes) {
    periodicTriggerType result = new periodicTriggerType();
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
    return "periodicTriggerType = " + getValue() + ";\n";
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
public static class areaEventTriggerType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_areaEventTriggerType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public areaEventTriggerType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_areaEventTriggerType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_areaEventTriggerType != null) {
      return ImmutableList.of(TAG_areaEventTriggerType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new areaEventTriggerType from encoded stream.
   */
  public static areaEventTriggerType fromPerUnaligned(byte[] encodedBytes) {
    areaEventTriggerType result = new areaEventTriggerType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new areaEventTriggerType from encoded stream.
   */
  public static areaEventTriggerType fromPerAligned(byte[] encodedBytes) {
    areaEventTriggerType result = new areaEventTriggerType();
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
    return "areaEventTriggerType = " + getValue() + ";\n";
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
    builder.append("ServicesSupported = {\n");
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
