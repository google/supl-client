// Copyright 2008 Google Inc. All Rights Reserved.

package com.google.location.lbs.asn1.base;

import java.util.Collection;

import javax.annotation.Nullable;

/**
 * A component of an {@code Asn1Sequence}.
 *
 * 
 */
public interface SequenceComponent {

  boolean isExplicitlySet();

  boolean hasDefaultValue();

  boolean isOptional();

  Asn1Object getComponentValue();

  void setToNewInstance();

  /**
   * Returns tags that may be the initial tag in the BER encoding of this type.
   */
  Collection<Asn1Tag> getPossibleFirstTags();

  @Nullable Asn1Tag getTag();

  boolean isImplicitTagging();

  String toIndentedString(String indent);
}
