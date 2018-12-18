// Copyright 2008 Google Inc. All Rights Reserved.

package com.google.location.lbs.asn1.base;

import javax.annotation.Nullable;

/**
 * 
 */
public class PacketBuilder {
  private final BitStream bitStream;

  public PacketBuilder() {
    this(null);
  }

  public PacketBuilder(@Nullable Integer bufferSize) {
    this.bitStream = (bufferSize == null) ? new BitStream() : new BitStream(bufferSize);
  }

  public void append(BitStream appendix) {
    if (appendix.beginsByteAligned()) {
      bitStream.spoolToByteBoundary();
    }
    int bitsToAppend = appendix.getBitCount();
    byte[] bytes = appendix.getPaddedBytes();
    for (int i = 0; bitsToAppend >= 8; i++, bitsToAppend -= 8) {
      bitStream.appendByte(bytes[i]);
    }
    if (bitsToAppend != 0) {
      byte highBits = bytes[bytes.length - 1];
      byte lowBits = (byte) ((highBits & 0xFF)
                             >> (8 - bitsToAppend));
      bitStream.appendLowBits(bitsToAppend, lowBits);
    }
  }

  public byte[] getPaddedBytes() {
    return bitStream.getPaddedBytes();
  }

  public int getBitCount() {
    return bitStream.getBitCount();
  }

  public void appendAll(Iterable<BitStream> bitStreams) {
    for (BitStream bitStream : bitStreams) {
      append(bitStream);
    }
  }
}
