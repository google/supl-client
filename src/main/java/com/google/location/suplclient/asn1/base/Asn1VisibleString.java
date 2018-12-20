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

package com.google.location.suplclient.asn1.base;

import com.google.common.collect.ImmutableList;

import java.util.Collection;

/**
 * A visible string is a subset of US-ASCII, with character set defined in ITU-T Rec. X.680-0207,
 * 39.7. The characters is the subset of visible US-ASCII characters plus space.
 *
 * 
 */
public class Asn1VisibleString extends Asn1IA5String {
  private static final Collection<Asn1Tag> possibleFirstTags =
      ImmutableList.of(Asn1Tag.VISIBLE_STRING);

  static final String PRINTABLE_ALPHABET =
      " !\"#$%&'()*+,-./0123456789:;<=>?@"
      + "ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`"
      + "abcdefghijklmnopqrstuvwxyz{|}~";

  public Asn1VisibleString() {
    super();
    setAlphabet(PRINTABLE_ALPHABET);
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    return possibleFirstTags;
  }

  @Override Asn1Tag getDefaultTag() {
    return Asn1Tag.VISIBLE_STRING;
  }
}
