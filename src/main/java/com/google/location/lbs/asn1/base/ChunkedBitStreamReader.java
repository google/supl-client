// Copyright 2008 Google Inc. All Rights Reserved.

package com.google.location.lbs.asn1.base;

import java.util.Iterator;

/** Implements a bit stream reader that reads from multiple byte arrays. */
public class ChunkedBitStreamReader extends BitStreamReader {

  /** Byte reader that reads across multiple byte arrays. */
  protected static class MultipleBufferByteReader implements ByteReader {
    private Iterator<byte[]> iterator;
    private SingleBufferByteReader singleReader;

    @Override
    public boolean isDone() {
      return isSingleDone() && isIteratorDone();
    }

    @Override
    public byte value() {
      if (isSingleDone()) {
        throw new IndexOutOfBoundsException("No more bytes");
      }
      return singleReader.value();
    }

    @Override
    public void next() {
      if (!isSingleDone()) {
        singleReader.next();
      }
      while (isSingleDone()) {
        if (isIteratorDone()) {
          singleReader = null;
          return;
        }
        singleReader = new SingleBufferByteReader(iterator.next());
      }
    }

    public MultipleBufferByteReader(Iterator<byte[]> iterator) {
      this.iterator = iterator;
      this.singleReader = null;
      next();
    }

    private boolean isSingleDone() {
      return singleReader == null || singleReader.isDone();
    }

    private boolean isIteratorDone() {
      if (iterator == null) {
        return true;
      }
      if (iterator.hasNext()) {
        return false;
      }
      iterator = null;
      return true;
    }
  }

  public ChunkedBitStreamReader(Iterable<byte[]> byteses) {
    super(new MultipleBufferByteReader(byteses.iterator()));
  }
}
