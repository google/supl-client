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

import com.google.common.collect.ImmutableList;

import java.util.Collection;

/**
 * A numeric string is characters from the set "0123456789 " (digits+space).
 * ITU-T Rec. X.680-0207, 39, defines it as a subset of ISO 646 US (US-ASCII).
 *
 * <p>Implements ASN.1 functionality.
 *
 * 
 */
public class Asn1NumericString extends Asn1IA5String {
  private static final Collection<Asn1Tag> possibleFirstTags =
      ImmutableList.of(Asn1Tag.NUMERIC_STRING);

  // Canonical order of the numeric alphabet, ITU-T Rec. X.680-0207, 39.6
  static final String NUMERIC_ALPHABET = " 0123456789";

  public Asn1NumericString() {
    super();
    setAlphabet(NUMERIC_ALPHABET);
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    return possibleFirstTags;
  }

  @Override Asn1Tag getDefaultTag() {
    return Asn1Tag.NUMERIC_STRING;
  }
}
