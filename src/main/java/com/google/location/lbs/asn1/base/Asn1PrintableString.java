// Copyright 2008 Google Inc. All Rights Reserved.

package com.google.location.lbs.asn1.base;

import com.google.common.collect.ImmutableList;

import java.util.Collection;

/**
 * A printable string is a subset of US-ASCII, with character set defined in
 * ITU-T Rec. X.680-0207, 39.7
 *
 * <p>Implements ASN.1 functionality.
 *
 * 
 */
public class Asn1PrintableString extends Asn1IA5String {
  private static final Collection<Asn1Tag> possibleFirstTags =
      ImmutableList.of(Asn1Tag.PRINTABLE_STRING);

  static final String PRINTABLE_ALPHABET = " '()+,-./0123456789:=?"
                                           + "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                           + "abcdefghijklmnopqrstuvwxyz";

  public Asn1PrintableString() {
    super();
    setAlphabet(PRINTABLE_ALPHABET);
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    return possibleFirstTags;
  }

  @Override Asn1Tag getDefaultTag() {
    return Asn1Tag.PRINTABLE_STRING;
  }
}
