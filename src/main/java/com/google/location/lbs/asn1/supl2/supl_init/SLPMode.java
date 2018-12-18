package com.google.location.lbs.asn1.supl2.supl_init;

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
 * @author Torbjorn Gannholm (tobe@google.com)
 */
public  class SLPMode extends Asn1Enumerated {
  public enum Value implements Asn1Enumerated.Value {
    proxy(0),
    nonProxy(1),
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


  
  public void setTo_proxy() {
    setValue(Value.proxy);
  }
  
  public void setTo_nonProxy() {
    setValue(Value.nonProxy);
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

  

  

  private static final Asn1Tag TAG_SLPMode
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public SLPMode() {
    super();
    // use template substitution instead of calling getDefaultValue(), since
    // calling virtual methods from a ctor is frowned upon here.
    setValue(null
);
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_SLPMode;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_SLPMode != null) {
      return ImmutableList.of(TAG_SLPMode);
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
   * Creates a new SLPMode from encoded stream.
   */
  public static SLPMode fromPerUnaligned(byte[] encodedBytes) {
    SLPMode result = new SLPMode();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new SLPMode from encoded stream.
   */
  public static SLPMode fromPerAligned(byte[] encodedBytes) {
    SLPMode result = new SLPMode();
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
    return "SLPMode = " + getValue() + ";\n";
  }
}
