package com.google.location.lbs.asn1.base;

import javax.annotation.Nullable;

/**
 * A component of an {@link Asn1Choice}
 */
public interface ChoiceComponent {
  int ordinal();

  Asn1Object createElement();

  @Nullable Asn1Tag getTag();

  boolean isImplicitTagging();
}
