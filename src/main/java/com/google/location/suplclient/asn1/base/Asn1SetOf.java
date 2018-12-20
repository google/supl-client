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

import java.util.Collections;
import java.util.Comparator;

/**
 * Implements ASN.1 functionality. An asn1 set is a collection where order is
 * not significant, but it does not guarantee absence of duplicates.
 *
 * 
 */
public abstract class Asn1SetOf<T extends Asn1Object>
    extends Asn1SequenceOf<T> {

  @Override Asn1Tag getDefaultTag() {
    return Asn1Tag.SET;
  }

  private Iterable<BitStream> encodePerImpl(final boolean aligned) {
    // Encode according to canonical PER, always works.
    Collections.sort(sequence,
                     new Comparator<T>() {
                       @Override
                       public int compare(T lhsT, T rhsT) {
                         PacketBuilder keyMaker = new PacketBuilder();
                         if (aligned) {
                           keyMaker.appendAll(lhsT.encodePerAligned());
                         } else {
                           keyMaker.appendAll(lhsT.encodePerUnaligned());
                         }
                         byte[] lhs = keyMaker.getPaddedBytes();
                         keyMaker = new PacketBuilder();
                         if (aligned) {
                           keyMaker.appendAll(rhsT.encodePerAligned());
                         } else {
                           keyMaker.appendAll(rhsT.encodePerUnaligned());
                         }
                         byte[] rhs = keyMaker.getPaddedBytes();
                         for (int i = 0; i < lhs.length && i < rhs.length;
                              ++i) {
                           if ((lhs[i] & 0xFF) < (rhs[i] & 0xFF)) {
                             return -1;
                           }
                           if ((lhs[i] & 0xFF) > (rhs[i] & 0xFF)) {
                             return 1;
                           }
                         }
                         if (lhs.length < rhs.length) {
                           return -1;
                         }
                         if (lhs.length > rhs.length) {
                           return 1;
                         }
                         return 0;
                       }
                     }
    );

    if (aligned) {
      return super.encodePerAligned();
    } else {
      return super.encodePerUnaligned();
    }
  }

  @Override public Iterable<BitStream> encodePerUnaligned() {
    return encodePerImpl(false);
  }

  @Override public Iterable<BitStream> encodePerAligned() {
    return encodePerImpl(true);
  }
}
