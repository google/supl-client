package com.google.location.lbs.asn1.base;

/**
 * Tag class of an ASN.1 type.
 */
public enum Asn1TagClass {
  UNIVERSAL(0),
  APPLICATION(1),
  CONTEXT(2),
  PRIVATE(3);

  private final int value;

  private Asn1TagClass(int value) {
    this.value = value;
  }

  public static Asn1TagClass fromValue(int tagClass) {
    switch (tagClass) {
      case 0: return UNIVERSAL;
      case 1: return APPLICATION;
      case 2: return CONTEXT;
      case 3: return PRIVATE;
      default:
        throw new IllegalArgumentException("Invalid tag class: " + tagClass);
    }
  }

  public int getValue() {
    return value;
  }
}
