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

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import java.util.Arrays;

/**
 * Outputs a stream of bits.
 *
 * <p>This class is not thread-safe.
 * 
 * 
 */
public final class BitStream {
  @VisibleForTesting static final int DEFAULT_BUFFER_CHUNK = 50;
  private static final int BITS_IN_BYTE = 8;

  /**
   * The number of bytes that is initially allocated and by which the buffer gets expanded when
   * necessary.
   */
  private final int bufferSize;

  private byte[] buffer;
  /**
   * The position in the buffer of the unfinished byte in progress.
   */
  private int position = 0;
  /**
   *   The number of high bits accumulated in the unfinished byte.
   */
  private int setBits = 0;

  /**
   * Creates a new {@link BitStream} object using {@link #DEFAULT_BUFFER_CHUNK}
   * as buffer size.
   */
  public BitStream() {
    this(DEFAULT_BUFFER_CHUNK);
  }

  /**
   * Creates a new {@link BitStream} object using bufferSize parameter.
   *
   * <p>Applications encoding larger messages should provide a suitable bufferSize value
   * for better performance.
   */
  public BitStream(int bufferSize) {
    this.bufferSize = bufferSize;
    this.buffer = new byte[bufferSize];
  }

  public byte[] getPaddedBytes() {
    return Arrays.copyOf(buffer, position + (setBits == 0 ? 0 : 1));
  }

  public void appendByte(byte data) {
    buffer[position] = (byte) (buffer[position] | (data & 0xFF) >> setBits);
    incrementPosition();
    buffer[position] = (byte) (buffer[position] | (data << (BITS_IN_BYTE - setBits)) & 0xFF);
  }

  private void incrementPosition() {
    position++;
    if (position >= buffer.length) {
      buffer = Arrays.copyOf(buffer, buffer.length + bufferSize);
    }
  }

  public void appendBit(boolean one) {
    if (one) {
      buffer[position] = (byte) (buffer[position] | 1 << (BITS_IN_BYTE - 1 - setBits));
    }
    setBits++;
    if (setBits == BITS_IN_BYTE) {
      incrementPosition();
      setBits = 0;
    }
  }

  public int getBitCount() {
    return BITS_IN_BYTE * position + setBits;
  }

  /**
   * Appends the lowest {@code howManyBits} from the {@code data} in order from
   * most significant to least significant.
   */
  public void appendLowBits(int howManyBits, byte data) {
    Preconditions.checkArgument(howManyBits < BITS_IN_BYTE);
    int lowMask = (1 << howManyBits) - 1;
    int highMask = ~lowMask;
    int maskedData = data;
    while (highMask < -1) {
      maskedData &= ~highMask;
      highMask >>= 1;
      appendBit((maskedData & highMask) != 0);
    }
  }

  private boolean beginByteAligned;

  public boolean beginsByteAligned() {
    return beginByteAligned;
  }

  public void setBeginByteAligned() {
    beginByteAligned = true;
  }

  public void spoolToByteBoundary() {
    if (setBits != 0) {
      setBits = 0;
      incrementPosition();
    }
  }
}
