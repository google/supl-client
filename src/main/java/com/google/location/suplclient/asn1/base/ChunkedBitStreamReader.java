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
