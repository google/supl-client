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
