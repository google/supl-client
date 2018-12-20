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

package com.google.location.suplclient.asn1.supl2.ver2_ulp_components;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.google.location.suplclient.asn1.base.Asn1Enumerated;
import com.google.location.suplclient.asn1.base.Asn1Tag;
import com.google.location.suplclient.asn1.base.BitStream;
import com.google.location.suplclient.asn1.base.BitStreamReader;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
 * 
 */
public  class UTRANGPSDriftRate extends Asn1Enumerated {
  public enum Value implements Asn1Enumerated.Value {
    utran_GPSDrift0(0),
    utran_GPSDrift1(1),
    utran_GPSDrift2(2),
    utran_GPSDrift5(3),
    utran_GPSDrift10(4),
    utran_GPSDrift15(5),
    utran_GPSDrift25(6),
    utran_GPSDrift50(7),
    utran_GPSDrift_1(8),
    utran_GPSDrift_2(9),
    utran_GPSDrift_5(10),
    utran_GPSDrift_10(11),
    utran_GPSDrift_15(12),
    utran_GPSDrift_25(13),
    utran_GPSDrift_50(14),
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


  
  public void setTo_utran_GPSDrift0() {
    setValue(Value.utran_GPSDrift0);
  }
  
  public void setTo_utran_GPSDrift1() {
    setValue(Value.utran_GPSDrift1);
  }
  
  public void setTo_utran_GPSDrift2() {
    setValue(Value.utran_GPSDrift2);
  }
  
  public void setTo_utran_GPSDrift5() {
    setValue(Value.utran_GPSDrift5);
  }
  
  public void setTo_utran_GPSDrift10() {
    setValue(Value.utran_GPSDrift10);
  }
  
  public void setTo_utran_GPSDrift15() {
    setValue(Value.utran_GPSDrift15);
  }
  
  public void setTo_utran_GPSDrift25() {
    setValue(Value.utran_GPSDrift25);
  }
  
  public void setTo_utran_GPSDrift50() {
    setValue(Value.utran_GPSDrift50);
  }
  
  public void setTo_utran_GPSDrift_1() {
    setValue(Value.utran_GPSDrift_1);
  }
  
  public void setTo_utran_GPSDrift_2() {
    setValue(Value.utran_GPSDrift_2);
  }
  
  public void setTo_utran_GPSDrift_5() {
    setValue(Value.utran_GPSDrift_5);
  }
  
  public void setTo_utran_GPSDrift_10() {
    setValue(Value.utran_GPSDrift_10);
  }
  
  public void setTo_utran_GPSDrift_15() {
    setValue(Value.utran_GPSDrift_15);
  }
  
  public void setTo_utran_GPSDrift_25() {
    setValue(Value.utran_GPSDrift_25);
  }
  
  public void setTo_utran_GPSDrift_50() {
    setValue(Value.utran_GPSDrift_50);
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

  

  

  private static final Asn1Tag TAG_UTRANGPSDriftRate
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public UTRANGPSDriftRate() {
    super();
    // use template substitution instead of calling getDefaultValue(), since
    // calling virtual methods from a ctor is frowned upon here.
    setValue(null
);
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_UTRANGPSDriftRate;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_UTRANGPSDriftRate != null) {
      return ImmutableList.of(TAG_UTRANGPSDriftRate);
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
   * Creates a new UTRANGPSDriftRate from encoded stream.
   */
  public static UTRANGPSDriftRate fromPerUnaligned(byte[] encodedBytes) {
    UTRANGPSDriftRate result = new UTRANGPSDriftRate();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new UTRANGPSDriftRate from encoded stream.
   */
  public static UTRANGPSDriftRate fromPerAligned(byte[] encodedBytes) {
    UTRANGPSDriftRate result = new UTRANGPSDriftRate();
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
    return "UTRANGPSDriftRate = " + getValue() + ";\n";
  }
}
