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

/**
 * Reads a stream of bits.
 *
 * <p>This class is not thread-safe.
 * 
 * 
 */
public class BitStreamReader {
  private static final int BITS_IN_BYTE = 8;

  private final ByteReader byteReader;
  private int bitsRead = 0;

  /** Used to iteratively read bytes. ByteIterator is already used, with a different signature. */
  protected interface ByteReader {
    boolean isDone();

    /**
     * Returns the current byte.
     *
     * @throws IndexOutOfBoundsException if there is no more data.
     */
    byte value();

    void next();
  }

  /** Implements a byte reader using a single byte array. */
  protected static class SingleBufferByteReader implements ByteReader {
    private final byte[] buffer;
    private int position = 0;

    public SingleBufferByteReader(byte[] bytes) {
      buffer = bytes;
    }

    @Override
    public boolean isDone() {
      return position >= buffer.length;
    }

    @Override
    public byte value() {
      return buffer[position];
    }

    @Override
    public void next() {
      ++position;
    }
  }

  protected BitStreamReader(ByteReader byteReader) {
    this.byteReader = byteReader;
  }

  public BitStreamReader(byte[] bytes) {
    this(new SingleBufferByteReader(bytes));
  }

  /**
   * Returns true if the next bit in the stream is set.
   * @throws IndexOutOfBoundsException if there is no more data.
   */
  public boolean readBit() {
    bitsRead++;
    if (bitsRead > BITS_IN_BYTE) {
      byteReader.next();
      bitsRead = 1;
    }
    return ((byteReader.value() >> (BITS_IN_BYTE - bitsRead)) & 1) == 1;
  }

  /**
   * Returns true if there is another readable bit in the stream.
   */
  public boolean hasBit() {
    if (byteReader.isDone()) {
      return false;
    }
    if (bitsRead < BITS_IN_BYTE) {
      return true;
    }
    byteReader.next();
    bitsRead = 0;
    return !byteReader.isDone();
  }

  public void spoolToByteBoundary() {
    if (bitsRead == 0) {
      return;
    }
    bitsRead = 0;
    byteReader.next();
  }

  /**
   * Returns next byte's worth of data (8 bits) from the stream.
   * @throws IndexOutOfBoundsException if there is no more data.
   */
  public byte readByte() {
    int mask = (1 << (8 - bitsRead)) - 1;
    byte result = (byte) ((byteReader.value() & mask) << bitsRead);
    byteReader.next();
    if (bitsRead > 0) {
      result = (byte) (result | (byteReader.value() & 0xFF) >>> (8 - bitsRead));
    }
    return result;
  }

  /**
   * Returns next {@code howMany} bits as the low bits in the returned byte.
   * @throws IndexOutOfBoundsException if there is no more data.
   */
  public int readLowBits(int howMany) {
    int result = 0;
    for (int i = 0; i < howMany; i++) {
      result <<= 1;
      result |= (readBit() ? 1 : 0);
    }
    return result;
  }
}
