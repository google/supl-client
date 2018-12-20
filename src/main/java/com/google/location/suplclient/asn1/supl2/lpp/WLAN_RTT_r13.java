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
public  class WLAN_RTT_r13 extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_WLAN_RTT_r13
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public WLAN_RTT_r13() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_WLAN_RTT_r13;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_WLAN_RTT_r13 != null) {
      return ImmutableList.of(TAG_WLAN_RTT_r13);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new WLAN_RTT_r13 from encoded stream.
   */
  public static WLAN_RTT_r13 fromPerUnaligned(byte[] encodedBytes) {
    WLAN_RTT_r13 result = new WLAN_RTT_r13();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new WLAN_RTT_r13 from encoded stream.
   */
  public static WLAN_RTT_r13 fromPerAligned(byte[] encodedBytes) {
    WLAN_RTT_r13 result = new WLAN_RTT_r13();
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

  
  private WLAN_RTT_r13.rttValue_r13Type rttValue_r13_;
  public WLAN_RTT_r13.rttValue_r13Type getRttValue_r13() {
    return rttValue_r13_;
  }
  /**
   * @throws ClassCastException if value is not a WLAN_RTT_r13.rttValue_r13Type
   */
  public void setRttValue_r13(Asn1Object value) {
    this.rttValue_r13_ = (WLAN_RTT_r13.rttValue_r13Type) value;
  }
  public WLAN_RTT_r13.rttValue_r13Type setRttValue_r13ToNewInstance() {
    rttValue_r13_ = new WLAN_RTT_r13.rttValue_r13Type();
    return rttValue_r13_;
  }
  
  private WLAN_RTT_r13.rttUnits_r13Type rttUnits_r13_;
  public WLAN_RTT_r13.rttUnits_r13Type getRttUnits_r13() {
    return rttUnits_r13_;
  }
  /**
   * @throws ClassCastException if value is not a WLAN_RTT_r13.rttUnits_r13Type
   */
  public void setRttUnits_r13(Asn1Object value) {
    this.rttUnits_r13_ = (WLAN_RTT_r13.rttUnits_r13Type) value;
  }
  public WLAN_RTT_r13.rttUnits_r13Type setRttUnits_r13ToNewInstance() {
    rttUnits_r13_ = new WLAN_RTT_r13.rttUnits_r13Type();
    return rttUnits_r13_;
  }
  
  private WLAN_RTT_r13.rttAccuracy_r13Type rttAccuracy_r13_;
  public WLAN_RTT_r13.rttAccuracy_r13Type getRttAccuracy_r13() {
    return rttAccuracy_r13_;
  }
  /**
   * @throws ClassCastException if value is not a WLAN_RTT_r13.rttAccuracy_r13Type
   */
  public void setRttAccuracy_r13(Asn1Object value) {
    this.rttAccuracy_r13_ = (WLAN_RTT_r13.rttAccuracy_r13Type) value;
  }
  public WLAN_RTT_r13.rttAccuracy_r13Type setRttAccuracy_r13ToNewInstance() {
    rttAccuracy_r13_ = new WLAN_RTT_r13.rttAccuracy_r13Type();
    return rttAccuracy_r13_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getRttValue_r13() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getRttValue_r13();
          }

          @Override public void setToNewInstance() {
            setRttValue_r13ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? WLAN_RTT_r13.rttValue_r13Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "rttValue_r13 : "
                    + getRttValue_r13().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getRttUnits_r13() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getRttUnits_r13();
          }

          @Override public void setToNewInstance() {
            setRttUnits_r13ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? WLAN_RTT_r13.rttUnits_r13Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "rttUnits_r13 : "
                    + getRttUnits_r13().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getRttAccuracy_r13() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getRttAccuracy_r13();
          }

          @Override public void setToNewInstance() {
            setRttAccuracy_r13ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? WLAN_RTT_r13.rttAccuracy_r13Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "rttAccuracy_r13 : "
                    + getRttAccuracy_r13().toIndentedString(indent);
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
public static class rttValue_r13Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_rttValue_r13Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public rttValue_r13Type() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("16777215"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_rttValue_r13Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_rttValue_r13Type != null) {
      return ImmutableList.of(TAG_rttValue_r13Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new rttValue_r13Type from encoded stream.
   */
  public static rttValue_r13Type fromPerUnaligned(byte[] encodedBytes) {
    rttValue_r13Type result = new rttValue_r13Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new rttValue_r13Type from encoded stream.
   */
  public static rttValue_r13Type fromPerAligned(byte[] encodedBytes) {
    rttValue_r13Type result = new rttValue_r13Type();
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
    return "rttValue_r13Type = " + getInteger() + ";\n";
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
public static class rttUnits_r13Type extends Asn1Enumerated {
  public enum Value implements Asn1Enumerated.Value {
    microseconds(0),
    hundredsofnanoseconds(1),
    tensofnanoseconds(2),
    nanoseconds(3),
    tenthsofnanoseconds(4),
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


  
  public void setTo_microseconds() {
    setValue(Value.microseconds);
  }
  
  public void setTo_hundredsofnanoseconds() {
    setValue(Value.hundredsofnanoseconds);
  }
  
  public void setTo_tensofnanoseconds() {
    setValue(Value.tensofnanoseconds);
  }
  
  public void setTo_nanoseconds() {
    setValue(Value.nanoseconds);
  }
  
  public void setTo_tenthsofnanoseconds() {
    setValue(Value.tenthsofnanoseconds);
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

  

  

  private static final Asn1Tag TAG_rttUnits_r13Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public rttUnits_r13Type() {
    super();
    // use template substitution instead of calling getDefaultValue(), since
    // calling virtual methods from a ctor is frowned upon here.
    setValue(null
);
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_rttUnits_r13Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_rttUnits_r13Type != null) {
      return ImmutableList.of(TAG_rttUnits_r13Type);
    } else {
      return Asn1Enumerated.getPossibleFirstTags();
    }
  }

  @Override protected boolean isExtensible() {
    return true;
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
   * Creates a new rttUnits_r13Type from encoded stream.
   */
  public static rttUnits_r13Type fromPerUnaligned(byte[] encodedBytes) {
    rttUnits_r13Type result = new rttUnits_r13Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new rttUnits_r13Type from encoded stream.
   */
  public static rttUnits_r13Type fromPerAligned(byte[] encodedBytes) {
    rttUnits_r13Type result = new rttUnits_r13Type();
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
    return "rttUnits_r13Type = " + getValue() + ";\n";
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
public static class rttAccuracy_r13Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_rttAccuracy_r13Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public rttAccuracy_r13Type() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("255"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_rttAccuracy_r13Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_rttAccuracy_r13Type != null) {
      return ImmutableList.of(TAG_rttAccuracy_r13Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new rttAccuracy_r13Type from encoded stream.
   */
  public static rttAccuracy_r13Type fromPerUnaligned(byte[] encodedBytes) {
    rttAccuracy_r13Type result = new rttAccuracy_r13Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new rttAccuracy_r13Type from encoded stream.
   */
  public static rttAccuracy_r13Type fromPerAligned(byte[] encodedBytes) {
    rttAccuracy_r13Type result = new rttAccuracy_r13Type();
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
    return "rttAccuracy_r13Type = " + getInteger() + ";\n";
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
    builder.append("WLAN_RTT_r13 = {\n");
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
