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

package com.google.location.suplclient.asn1.supl2.ulp_components;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.google.location.suplclient.asn1.base.Asn1Choice;
import com.google.location.suplclient.asn1.base.Asn1Object;
import com.google.location.suplclient.asn1.base.Asn1OctetString;
import com.google.location.suplclient.asn1.base.Asn1Tag;
import com.google.location.suplclient.asn1.base.BitStream;
import com.google.location.suplclient.asn1.base.BitStreamReader;
import com.google.location.suplclient.asn1.base.ChoiceComponent;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;


/**
 * 
 */
public  class IPAddress extends Asn1Choice {
  //

  private static final Asn1Tag TAG_IPAddress
      = Asn1Tag.fromClassAndNumber(-1, -1);

  private static final Map<Asn1Tag, Select> tagToSelection = new HashMap<>();

  private boolean extension;
  private ChoiceComponent selection;
  private Asn1Object element;

  static {
    for (Select select : Select.values()) {
      for (Asn1Tag tag : select.getPossibleFirstTags()) {
        Select select0;
        if ((select0 = tagToSelection.put(tag, select)) != null) {
          throw new IllegalStateException(
            "IPAddress: " + tag + " maps to both " + select0 + " and " + select);
        }
      }
    }
  }

  public IPAddress() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_IPAddress;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_IPAddress != null) {
      return ImmutableList.of(TAG_IPAddress);
    } else {
      return tagToSelection.keySet();
    }
  }

  /**
   * Creates a new IPAddress from encoded stream.
   */
  public static IPAddress fromPerUnaligned(byte[] encodedBytes) {
    IPAddress result = new IPAddress();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new IPAddress from encoded stream.
   */
  public static IPAddress fromPerAligned(byte[] encodedBytes) {
    IPAddress result = new IPAddress();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  

  @Override protected boolean hasExtensionValue() {
    return extension;
  }

  @Override protected Integer getSelectionOrdinal() {
    return selection.ordinal();
  }

  @Nullable
  @Override
  protected ChoiceComponent getSelectedComponent() {
    return selection;
  }

  @Override protected int getOptionCount() {
    if (hasExtensionValue()) {
      return Extend.values().length;
    }
    return Select.values().length;
  }

  protected Asn1Object createAndSetValue(boolean isExtensionValue,
                                         int ordinal) {
    extension = isExtensionValue;
    if (isExtensionValue) {
      selection = Extend.values()[ordinal];
    } else {
      selection = Select.values()[ordinal];
    }
    element = selection.createElement();
    return element;
  }

  @Override protected ChoiceComponent createAndSetValue(Asn1Tag tag) {
    Select select = tagToSelection.get(tag);
    if (select == null) {
      throw new IllegalArgumentException("Unknown selection tag: " + tag);
    }
    element = select.createElement();
    selection = select;
    extension = false;
    return select;
  }

  @Override protected boolean isExtensible() {
    return false;
  }

  @Override public Asn1Object getValue() {
    return element;
  }

  
  private static enum Select implements ChoiceComponent {
    
    $Ipv4Address(Asn1Tag.fromClassAndNumber(2, 0),
        true) {
      @Override
      public Asn1Object createElement() {
        return new IPAddress.ipv4AddressType();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? IPAddress.ipv4AddressType.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $Ipv6Address(Asn1Tag.fromClassAndNumber(2, 1),
        true) {
      @Override
      public Asn1Object createElement() {
        return new IPAddress.ipv6AddressType();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? IPAddress.ipv6AddressType.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    ;

    @Nullable final Asn1Tag tag;
    final boolean isImplicitTagging;

    Select(@Nullable Asn1Tag tag, boolean isImplicitTagging) {
      this.tag = tag;
      this.isImplicitTagging = isImplicitTagging;
    }

    @Override
    public Asn1Object createElement() {
      throw new IllegalStateException("Select template error");
    }

    @Override
    @Nullable
    public Asn1Tag getTag() {
      return tag;
    }

    @Override
    public boolean isImplicitTagging() {
      return isImplicitTagging;
    }

    abstract Collection<Asn1Tag> getPossibleFirstTags();

    abstract String elementIndentedString(Asn1Object element, String indent);
  }
  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class ipv4AddressType extends Asn1OctetString {
  //

  private static final Asn1Tag TAG_ipv4AddressType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ipv4AddressType() {
    super();
    setMinSize(4);
setMaxSize(4);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ipv4AddressType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ipv4AddressType != null) {
      return ImmutableList.of(TAG_ipv4AddressType);
    } else {
      return Asn1OctetString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ipv4AddressType from encoded stream.
   */
  public static ipv4AddressType fromPerUnaligned(byte[] encodedBytes) {
    ipv4AddressType result = new ipv4AddressType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ipv4AddressType from encoded stream.
   */
  public static ipv4AddressType fromPerAligned(byte[] encodedBytes) {
    ipv4AddressType result = new ipv4AddressType();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  @Override public Iterable<BitStream> encodePerUnaligned() {
    return super.encodePerUnaligned();
  }

  @Override public Iterable<BitStream> encodePerAligned() {
    return super.encodePerAligned();
  }

  @Override public void decodePerUnaligned(BitStreamReader reader) {
    super.decodePerUnaligned(reader);
  }

  @Override public void decodePerAligned(BitStreamReader reader) {
    super.decodePerAligned(reader);
  }

  @Override protected String getTypeName() {
    return "ipv4AddressType";
  }
}


  public boolean isIpv4Address() {
    return !hasExtensionValue() && Select.$Ipv4Address == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isIpv4Address}.
   */
  @SuppressWarnings("unchecked")
  public IPAddress.ipv4AddressType getIpv4Address() {
    if (!isIpv4Address()) {
      throw new IllegalStateException("IPAddress value not a Ipv4Address");
    }
    return (IPAddress.ipv4AddressType) element;
  }

  public void setIpv4Address(IPAddress.ipv4AddressType selected) {
    selection = Select.$Ipv4Address;
    extension = false;
    element = selected;
  }

  public IPAddress.ipv4AddressType setIpv4AddressToNewInstance() {
      IPAddress.ipv4AddressType element = new IPAddress.ipv4AddressType();
      setIpv4Address(element);
      return element;
  }
  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class ipv6AddressType extends Asn1OctetString {
  //

  private static final Asn1Tag TAG_ipv6AddressType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ipv6AddressType() {
    super();
    setMinSize(16);
setMaxSize(16);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ipv6AddressType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ipv6AddressType != null) {
      return ImmutableList.of(TAG_ipv6AddressType);
    } else {
      return Asn1OctetString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ipv6AddressType from encoded stream.
   */
  public static ipv6AddressType fromPerUnaligned(byte[] encodedBytes) {
    ipv6AddressType result = new ipv6AddressType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ipv6AddressType from encoded stream.
   */
  public static ipv6AddressType fromPerAligned(byte[] encodedBytes) {
    ipv6AddressType result = new ipv6AddressType();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  @Override public Iterable<BitStream> encodePerUnaligned() {
    return super.encodePerUnaligned();
  }

  @Override public Iterable<BitStream> encodePerAligned() {
    return super.encodePerAligned();
  }

  @Override public void decodePerUnaligned(BitStreamReader reader) {
    super.decodePerUnaligned(reader);
  }

  @Override public void decodePerAligned(BitStreamReader reader) {
    super.decodePerAligned(reader);
  }

  @Override protected String getTypeName() {
    return "ipv6AddressType";
  }
}


  public boolean isIpv6Address() {
    return !hasExtensionValue() && Select.$Ipv6Address == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isIpv6Address}.
   */
  @SuppressWarnings("unchecked")
  public IPAddress.ipv6AddressType getIpv6Address() {
    if (!isIpv6Address()) {
      throw new IllegalStateException("IPAddress value not a Ipv6Address");
    }
    return (IPAddress.ipv6AddressType) element;
  }

  public void setIpv6Address(IPAddress.ipv6AddressType selected) {
    selection = Select.$Ipv6Address;
    extension = false;
    element = selected;
  }

  public IPAddress.ipv6AddressType setIpv6AddressToNewInstance() {
      IPAddress.ipv6AddressType element = new IPAddress.ipv6AddressType();
      setIpv6Address(element);
      return element;
  }
  

  private static enum Extend implements ChoiceComponent {
    
    ;
    @Nullable private final Asn1Tag tag;
    private final boolean isImplicitTagging;

    Extend(@Nullable Asn1Tag tag, boolean isImplicitTagging) {
      this.tag = tag;
      this.isImplicitTagging = isImplicitTagging;
    }

    public Asn1Object createElement() {
      throw new IllegalStateException("Extend template error");
    }

    @Override
    @Nullable
    public Asn1Tag getTag() {
      return tag;
    }

    @Override
    public boolean isImplicitTagging() {
      return isImplicitTagging;
    }

    String elementIndentedString(Asn1Object element, String indent) {
      throw new IllegalStateException("Extend template error");
    }
  }
  

  @Override public Iterable<BitStream> encodePerUnaligned() {
    return super.encodePerUnaligned();
  }

  @Override public Iterable<BitStream> encodePerAligned() {
    return super.encodePerAligned();
  }

  @Override public void decodePerUnaligned(BitStreamReader reader) {
    super.decodePerUnaligned(reader);
  }

  @Override public void decodePerAligned(BitStreamReader reader) {
    super.decodePerAligned(reader);
  }

  @Override public String toString() {
    return toIndentedString("");
  }

  private String elementIndentedString(String indent) {
    if (element == null) {
      return "null;\n";
    }
    if (extension) {
      return Extend.values()[selection.ordinal()]
          .elementIndentedString(element, indent + "  ");
    } else {
      return Select.values()[selection.ordinal()]
          .elementIndentedString(element, indent + "  ");
    }
  }

  public String toIndentedString(String indent) {
    return "IPAddress = " + elementIndentedString(indent) + indent + ";\n";
  }
}
