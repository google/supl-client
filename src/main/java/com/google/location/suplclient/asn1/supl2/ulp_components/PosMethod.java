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

package com.google.location.suplclient.asn1.supl2.ulp_components;

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
public  class PosMethod extends Asn1Enumerated {
  public enum Value implements Asn1Enumerated.Value {
    agpsSETassisted(0),
    agpsSETbased(1),
    agpsSETassistedpref(2),
    agpsSETbasedpref(3),
    autonomousGPS(4),
    aFLT(5),
    eCID(6),
    eOTD(7),
    oTDOA(8),
    noPosition(9),
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


  
  public void setTo_agpsSETassisted() {
    setValue(Value.agpsSETassisted);
  }
  
  public void setTo_agpsSETbased() {
    setValue(Value.agpsSETbased);
  }
  
  public void setTo_agpsSETassistedpref() {
    setValue(Value.agpsSETassistedpref);
  }
  
  public void setTo_agpsSETbasedpref() {
    setValue(Value.agpsSETbasedpref);
  }
  
  public void setTo_autonomousGPS() {
    setValue(Value.autonomousGPS);
  }
  
  public void setTo_aFLT() {
    setValue(Value.aFLT);
  }
  
  public void setTo_eCID() {
    setValue(Value.eCID);
  }
  
  public void setTo_eOTD() {
    setValue(Value.eOTD);
  }
  
  public void setTo_oTDOA() {
    setValue(Value.oTDOA);
  }
  
  public void setTo_noPosition() {
    setValue(Value.noPosition);
  }
  


  public enum ExtensionValue implements Asn1Enumerated.Value {
    ver2_historicalDataRetrieval(10),
    ver2_agnssSETassisted(11),
    ver2_agnssSETbased(12),
    ver2_agnssSETassistedpref(13),
    ver2_agnssSETbasedpref(14),
    ver2_autonomousGNSS(15),
    ver2_sessioninfoquery(16),
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

  
  public void setExtTo_ver2_historicalDataRetrieval() {
    setValue(ExtensionValue.ver2_historicalDataRetrieval);
  }
  
  public void setExtTo_ver2_agnssSETassisted() {
    setValue(ExtensionValue.ver2_agnssSETassisted);
  }
  
  public void setExtTo_ver2_agnssSETbased() {
    setValue(ExtensionValue.ver2_agnssSETbased);
  }
  
  public void setExtTo_ver2_agnssSETassistedpref() {
    setValue(ExtensionValue.ver2_agnssSETassistedpref);
  }
  
  public void setExtTo_ver2_agnssSETbasedpref() {
    setValue(ExtensionValue.ver2_agnssSETbasedpref);
  }
  
  public void setExtTo_ver2_autonomousGNSS() {
    setValue(ExtensionValue.ver2_autonomousGNSS);
  }
  
  public void setExtTo_ver2_sessioninfoquery() {
    setValue(ExtensionValue.ver2_sessioninfoquery);
  }
  

  

  private static final Asn1Tag TAG_PosMethod
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public PosMethod() {
    super();
    // use template substitution instead of calling getDefaultValue(), since
    // calling virtual methods from a ctor is frowned upon here.
    setValue(null
);
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_PosMethod;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_PosMethod != null) {
      return ImmutableList.of(TAG_PosMethod);
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
   * Creates a new PosMethod from encoded stream.
   */
  public static PosMethod fromPerUnaligned(byte[] encodedBytes) {
    PosMethod result = new PosMethod();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new PosMethod from encoded stream.
   */
  public static PosMethod fromPerAligned(byte[] encodedBytes) {
    PosMethod result = new PosMethod();
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
    return "PosMethod = " + getValue() + ";\n";
  }
}
