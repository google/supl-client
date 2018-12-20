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

// Copyright 2008 Google Inc. All Rights Reserved.

package com.google.location.suplclient.asn1.base;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Collection;

/**
 * 
 */
public abstract class Asn1Enumerated extends Asn1Object {
  private static final Collection<Asn1Tag> possibleFirstTags =
      ImmutableList.of(Asn1Tag.ENUMERATED);

  private Value value;

  /** Represents a single value within the enumeration. */
  public interface Value {
    int getAssignedValue();
    boolean isExtensionValue();
    int ordinal(); // Standard enum method.
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    return possibleFirstTags;
  }

  public Value getValue() {
    return value;
  }

  public void setValue(Value value) {
    this.value = value;
  }

  @SuppressWarnings("unused") // Used by generated classes.
  protected Value getDefaultValue() {
    return null;
  }

  protected abstract boolean isExtensible();

  /**
   * Returns the ordinal:th value in size order.
   */
  protected abstract Value lookupValue(int ordinal);

  /**
   * Returns the ordinal:th extension value in size order.
   */
  protected abstract Value lookupExtensionValue(int ordinal);

  /**
   * Returns the number of distinct values (not counting extensions).
   */
  protected abstract int getValueCount();

  @Override Asn1Tag getDefaultTag() {
    return Asn1Tag.ENUMERATED;
  }

  @Override int getBerValueLength() {
    return asAsn1Integer().getBerValueLength();
  }

  @Override void encodeBerValue(ByteBuffer buf) {
    asAsn1Integer().encodeBerValue(buf);
  }

  @Override void decodeBerValue(ByteBuffer buf) {
    if (!buf.hasRemaining()) {
      value = getDefaultValue();
      return;
    }
    Asn1Integer ai = new Asn1Integer();
    ai.decodeBerValue(buf);
    value = lookupValue(ai.getInteger().intValue());
  }

  private Asn1Integer asAsn1Integer() {
    Preconditions.checkNotNull(value, "No value set.");
    Asn1Integer ai = new Asn1Integer();
    ai.setInteger(BigInteger.valueOf(value.getAssignedValue()));
    return ai;
  }

  private Iterable<BitStream> encodePerImpl(boolean aligned) {
    ImmutableList.Builder<BitStream> builder = ImmutableList.builder();
    if (isExtensible()) {
      BitStream extensionMarker = new BitStream();
      extensionMarker.appendBit(value.isExtensionValue());
      builder.add(extensionMarker);
    }
    if (value.isExtensionValue()) {
      if (aligned) {
        builder.addAll(
            PerAlignedUtils.encodeNormallySmallWholeNumber(value.ordinal()));
      } else {
        builder.addAll(
            PerUnalignedUtils.encodeNormallySmallWholeNumber(value.ordinal()));
      }
    } else {
      // Note that it is NOT guaranteed in the asn1 spec that the root values
      // are sorted in order. However, asn12j sorts them for us.
      if (aligned) {
        builder.add(
            PerAlignedUtils.encodeSmallConstrainedWholeNumber(
                value.ordinal(), 0, getValueCount() - 1));
      } else {
        builder.add(
            PerUnalignedUtils.encodeConstrainedWholeNumber(
                value.ordinal(), 0, getValueCount() - 1));
      }
    }
    return builder.build();
  }

  @Override public Iterable<BitStream> encodePerUnaligned() {
    return encodePerImpl(false);
  }

  @Override public Iterable<BitStream> encodePerAligned() {
    return encodePerImpl(true);
  }

  private void decodePerImpl(BitStreamReader reader, boolean aligned) {
    if (!reader.hasBit()) {
      value = getDefaultValue();
      return;
    }
    if (isExtensible() && reader.readBit()) {
      if (aligned) {
        value = lookupExtensionValue(PerAlignedUtils.decodeNormallySmallWholeNumber(reader));
      } else {
        value = lookupExtensionValue(PerUnalignedUtils.decodeNormallySmallWholeNumber(reader));
      }
    } else {
      if (aligned) {
        value = lookupValue(
            PerAlignedUtils.decodeSmallConstrainedWholeNumber(
                reader, 0, getValueCount() - 1));
      } else {
        value = lookupValue(
            PerUnalignedUtils.decodeConstrainedWholeNumber(
                reader, 0, getValueCount() - 1));
      }
    }
  }

  @Override public void decodePerUnaligned(BitStreamReader reader) {
    decodePerImpl(reader, false);
  }

  @Override public void decodePerAligned(BitStreamReader reader) {
    decodePerImpl(reader, true);
  }
}

