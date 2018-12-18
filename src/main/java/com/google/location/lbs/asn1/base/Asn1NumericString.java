// Copyright 2008 Google Inc. All Rights Reserved.

package com.google.location.lbs.asn1.base;

import com.google.common.collect.ImmutableList;

import java.util.Collection;

/**
 * A numeric string is characters from the set "0123456789 " (digits+space).
 * ITU-T Rec. X.680-0207, 39, defines it as a subset of ISO 646 US (US-ASCII).
 *
 * <p>Implements ASN.1 functionality.
 *
 * @author tobe@google.com (Torbjorn Gannholm)
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
