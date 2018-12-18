package com.google.location.lbs.asn1.base;

import com.google.common.collect.ImmutableList;

import java.util.Collection;

/**
 * A visible string is a subset of US-ASCII, with character set defined in ITU-T Rec. X.680-0207,
 * 39.7. The characters is the subset of visible US-ASCII characters plus space.
 *
 * @author Lifu Tang (lifu@google.com)
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
