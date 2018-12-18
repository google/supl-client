package com.google.location.lbs.asn1.supl2.rrlp_components;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.google.location.lbs.asn1.base.Asn1Enumerated;
import com.google.location.lbs.asn1.base.Asn1Tag;
import com.google.location.lbs.asn1.base.BitStream;
import com.google.location.lbs.asn1.base.BitStreamReader;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
 * 
 */
public  class PositionMethod extends Asn1Enumerated {
  public enum Value implements Asn1Enumerated.Value {
    eotd(0),
    gps(1),
    gpsOrEOTD(2),
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


  
  public void setTo_eotd() {
    setValue(Value.eotd);
  }
  
  public void setTo_gps() {
    setValue(Value.gps);
  }
  
  public void setTo_gpsOrEOTD() {
    setValue(Value.gpsOrEOTD);
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

  

  

  private static final Asn1Tag TAG_PositionMethod
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public PositionMethod() {
    super();
    // use template substitution instead of calling getDefaultValue(), since
    // calling virtual methods from a ctor is frowned upon here.
    setValue(null
);
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_PositionMethod;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_PositionMethod != null) {
      return ImmutableList.of(TAG_PositionMethod);
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
   * Creates a new PositionMethod from encoded stream.
   */
  public static PositionMethod fromPerUnaligned(byte[] encodedBytes) {
    PositionMethod result = new PositionMethod();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new PositionMethod from encoded stream.
   */
  public static PositionMethod fromPerAligned(byte[] encodedBytes) {
    PositionMethod result = new PositionMethod();
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
    return "PositionMethod = " + getValue() + ";\n";
  }
}
