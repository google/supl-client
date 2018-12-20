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
import com.google.location.suplclient.asn1.base.Asn1Enumerated;
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
public  class HorizontalWithVerticalVelocity extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_HorizontalWithVerticalVelocity
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public HorizontalWithVerticalVelocity() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_HorizontalWithVerticalVelocity;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_HorizontalWithVerticalVelocity != null) {
      return ImmutableList.of(TAG_HorizontalWithVerticalVelocity);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new HorizontalWithVerticalVelocity from encoded stream.
   */
  public static HorizontalWithVerticalVelocity fromPerUnaligned(byte[] encodedBytes) {
    HorizontalWithVerticalVelocity result = new HorizontalWithVerticalVelocity();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new HorizontalWithVerticalVelocity from encoded stream.
   */
  public static HorizontalWithVerticalVelocity fromPerAligned(byte[] encodedBytes) {
    HorizontalWithVerticalVelocity result = new HorizontalWithVerticalVelocity();
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

  
  private HorizontalWithVerticalVelocity.bearingType bearing_;
  public HorizontalWithVerticalVelocity.bearingType getBearing() {
    return bearing_;
  }
  /**
   * @throws ClassCastException if value is not a HorizontalWithVerticalVelocity.bearingType
   */
  public void setBearing(Asn1Object value) {
    this.bearing_ = (HorizontalWithVerticalVelocity.bearingType) value;
  }
  public HorizontalWithVerticalVelocity.bearingType setBearingToNewInstance() {
    bearing_ = new HorizontalWithVerticalVelocity.bearingType();
    return bearing_;
  }
  
  private HorizontalWithVerticalVelocity.horizontalSpeedType horizontalSpeed_;
  public HorizontalWithVerticalVelocity.horizontalSpeedType getHorizontalSpeed() {
    return horizontalSpeed_;
  }
  /**
   * @throws ClassCastException if value is not a HorizontalWithVerticalVelocity.horizontalSpeedType
   */
  public void setHorizontalSpeed(Asn1Object value) {
    this.horizontalSpeed_ = (HorizontalWithVerticalVelocity.horizontalSpeedType) value;
  }
  public HorizontalWithVerticalVelocity.horizontalSpeedType setHorizontalSpeedToNewInstance() {
    horizontalSpeed_ = new HorizontalWithVerticalVelocity.horizontalSpeedType();
    return horizontalSpeed_;
  }
  
  private HorizontalWithVerticalVelocity.verticalDirectionType verticalDirection_;
  public HorizontalWithVerticalVelocity.verticalDirectionType getVerticalDirection() {
    return verticalDirection_;
  }
  /**
   * @throws ClassCastException if value is not a HorizontalWithVerticalVelocity.verticalDirectionType
   */
  public void setVerticalDirection(Asn1Object value) {
    this.verticalDirection_ = (HorizontalWithVerticalVelocity.verticalDirectionType) value;
  }
  public HorizontalWithVerticalVelocity.verticalDirectionType setVerticalDirectionToNewInstance() {
    verticalDirection_ = new HorizontalWithVerticalVelocity.verticalDirectionType();
    return verticalDirection_;
  }
  
  private HorizontalWithVerticalVelocity.verticalSpeedType verticalSpeed_;
  public HorizontalWithVerticalVelocity.verticalSpeedType getVerticalSpeed() {
    return verticalSpeed_;
  }
  /**
   * @throws ClassCastException if value is not a HorizontalWithVerticalVelocity.verticalSpeedType
   */
  public void setVerticalSpeed(Asn1Object value) {
    this.verticalSpeed_ = (HorizontalWithVerticalVelocity.verticalSpeedType) value;
  }
  public HorizontalWithVerticalVelocity.verticalSpeedType setVerticalSpeedToNewInstance() {
    verticalSpeed_ = new HorizontalWithVerticalVelocity.verticalSpeedType();
    return verticalSpeed_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getBearing() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBearing();
          }

          @Override public void setToNewInstance() {
            setBearingToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? HorizontalWithVerticalVelocity.bearingType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bearing : "
                    + getBearing().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getHorizontalSpeed() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getHorizontalSpeed();
          }

          @Override public void setToNewInstance() {
            setHorizontalSpeedToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? HorizontalWithVerticalVelocity.horizontalSpeedType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "horizontalSpeed : "
                    + getHorizontalSpeed().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getVerticalDirection() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getVerticalDirection();
          }

          @Override public void setToNewInstance() {
            setVerticalDirectionToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? HorizontalWithVerticalVelocity.verticalDirectionType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "verticalDirection : "
                    + getVerticalDirection().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getVerticalSpeed() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getVerticalSpeed();
          }

          @Override public void setToNewInstance() {
            setVerticalSpeedToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? HorizontalWithVerticalVelocity.verticalSpeedType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "verticalSpeed : "
                    + getVerticalSpeed().toIndentedString(indent);
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
public static class bearingType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bearingType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bearingType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("359"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bearingType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bearingType != null) {
      return ImmutableList.of(TAG_bearingType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bearingType from encoded stream.
   */
  public static bearingType fromPerUnaligned(byte[] encodedBytes) {
    bearingType result = new bearingType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bearingType from encoded stream.
   */
  public static bearingType fromPerAligned(byte[] encodedBytes) {
    bearingType result = new bearingType();
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
    return "bearingType = " + getInteger() + ";\n";
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
public static class horizontalSpeedType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_horizontalSpeedType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public horizontalSpeedType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("2047"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_horizontalSpeedType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_horizontalSpeedType != null) {
      return ImmutableList.of(TAG_horizontalSpeedType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new horizontalSpeedType from encoded stream.
   */
  public static horizontalSpeedType fromPerUnaligned(byte[] encodedBytes) {
    horizontalSpeedType result = new horizontalSpeedType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new horizontalSpeedType from encoded stream.
   */
  public static horizontalSpeedType fromPerAligned(byte[] encodedBytes) {
    horizontalSpeedType result = new horizontalSpeedType();
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
    return "horizontalSpeedType = " + getInteger() + ";\n";
  }
}

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class verticalDirectionType extends Asn1Enumerated {
  public enum Value implements Asn1Enumerated.Value {
    upward(0),
    downward(1),
    ;

    Value(int i) {
      value = i;
    }

    private int value;
    public int getAssignedValue() {
      return value;
    }

    @Override public boolean isExtensionValue() {
      return false;
    }
  }

  @Override
  protected Value getDefaultValue() {
    return null
;
  }

  @SuppressWarnings("unchecked")
  public Value enumValue() {
    return (Value) getValue();
  }


  
  public void setTo_upward() {
    setValue(Value.upward);
  }
  
  public void setTo_downward() {
    setValue(Value.downward);
  }
  


  public enum ExtensionValue implements Asn1Enumerated.Value {
    ;

    ExtensionValue(int i) {
      value = i;
    }

    private int value;
    @Override public int getAssignedValue() {
      return value;
    }

    @Override public boolean isExtensionValue() {
      return true;
    }
  }

  @SuppressWarnings("unchecked")
  public ExtensionValue extEnumValue() {
    return (ExtensionValue) getValue();
  }

  

  

  private static final Asn1Tag TAG_verticalDirectionType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public verticalDirectionType() {
    super();
    // use template substitution instead of calling getDefaultValue(), since
    // calling virtual methods from a ctor is frowned upon here.
    setValue(null
);
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_verticalDirectionType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_verticalDirectionType != null) {
      return ImmutableList.of(TAG_verticalDirectionType);
    } else {
      return Asn1Enumerated.getPossibleFirstTags();
    }
  }

  @Override protected boolean isExtensible() {
    return false;
  }

  @Override protected Asn1Enumerated.Value lookupValue(int ordinal) {
    return Value.values()[ordinal];
  }

  @Override protected Asn1Enumerated.Value lookupExtensionValue(int ordinal) {
    return ExtensionValue.values()[ordinal];
  }

  @Override protected int getValueCount() {
    return Value.values().length;
  }

  /**
   * Creates a new verticalDirectionType from encoded stream.
   */
  public static verticalDirectionType fromPerUnaligned(byte[] encodedBytes) {
    verticalDirectionType result = new verticalDirectionType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new verticalDirectionType from encoded stream.
   */
  public static verticalDirectionType fromPerAligned(byte[] encodedBytes) {
    verticalDirectionType result = new verticalDirectionType();
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
    return "verticalDirectionType = " + getValue() + ";\n";
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
public static class verticalSpeedType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_verticalSpeedType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public verticalSpeedType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("255"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_verticalSpeedType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_verticalSpeedType != null) {
      return ImmutableList.of(TAG_verticalSpeedType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new verticalSpeedType from encoded stream.
   */
  public static verticalSpeedType fromPerUnaligned(byte[] encodedBytes) {
    verticalSpeedType result = new verticalSpeedType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new verticalSpeedType from encoded stream.
   */
  public static verticalSpeedType fromPerAligned(byte[] encodedBytes) {
    verticalSpeedType result = new verticalSpeedType();
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
    return "verticalSpeedType = " + getInteger() + ";\n";
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
    builder.append("HorizontalWithVerticalVelocity = {\n");
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
