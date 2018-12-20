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
import com.google.location.suplclient.asn1.base.Asn1BitString;
import com.google.location.suplclient.asn1.base.Asn1Choice;
import com.google.location.suplclient.asn1.base.Asn1IA5String;
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
public  class SETId extends Asn1Choice {
  //

  private static final Asn1Tag TAG_SETId
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
            "SETId: " + tag + " maps to both " + select0 + " and " + select);
        }
      }
    }
  }

  public SETId() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_SETId;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_SETId != null) {
      return ImmutableList.of(TAG_SETId);
    } else {
      return tagToSelection.keySet();
    }
  }

  /**
   * Creates a new SETId from encoded stream.
   */
  public static SETId fromPerUnaligned(byte[] encodedBytes) {
    SETId result = new SETId();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new SETId from encoded stream.
   */
  public static SETId fromPerAligned(byte[] encodedBytes) {
    SETId result = new SETId();
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
    return true;
  }

  @Override public Asn1Object getValue() {
    return element;
  }

  
  private static enum Select implements ChoiceComponent {
    
    $Msisdn(Asn1Tag.fromClassAndNumber(2, 0),
        true) {
      @Override
      public Asn1Object createElement() {
        return new SETId.msisdnType();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? SETId.msisdnType.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $Mdn(Asn1Tag.fromClassAndNumber(2, 1),
        true) {
      @Override
      public Asn1Object createElement() {
        return new SETId.mdnType();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? SETId.mdnType.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $Min(Asn1Tag.fromClassAndNumber(2, 2),
        true) {
      @Override
      public Asn1Object createElement() {
        return new SETId.minType();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? SETId.minType.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $Imsi(Asn1Tag.fromClassAndNumber(2, 3),
        true) {
      @Override
      public Asn1Object createElement() {
        return new SETId.imsiType();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? SETId.imsiType.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $Nai(Asn1Tag.fromClassAndNumber(2, 4),
        true) {
      @Override
      public Asn1Object createElement() {
        return new SETId.naiType();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? SETId.naiType.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $IPAddress(Asn1Tag.fromClassAndNumber(2, 5),
        true) {
      @Override
      public Asn1Object createElement() {
        return new IPAddress();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? IPAddress.getPossibleFirstTags() : ImmutableList.of(tag);
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
public static class msisdnType extends Asn1OctetString {
  //

  private static final Asn1Tag TAG_msisdnType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public msisdnType() {
    super();
    setMinSize(8);
setMaxSize(8);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_msisdnType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_msisdnType != null) {
      return ImmutableList.of(TAG_msisdnType);
    } else {
      return Asn1OctetString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new msisdnType from encoded stream.
   */
  public static msisdnType fromPerUnaligned(byte[] encodedBytes) {
    msisdnType result = new msisdnType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new msisdnType from encoded stream.
   */
  public static msisdnType fromPerAligned(byte[] encodedBytes) {
    msisdnType result = new msisdnType();
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
    return "msisdnType";
  }
}


  public boolean isMsisdn() {
    return !hasExtensionValue() && Select.$Msisdn == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isMsisdn}.
   */
  @SuppressWarnings("unchecked")
  public SETId.msisdnType getMsisdn() {
    if (!isMsisdn()) {
      throw new IllegalStateException("SETId value not a Msisdn");
    }
    return (SETId.msisdnType) element;
  }

  public void setMsisdn(SETId.msisdnType selected) {
    selection = Select.$Msisdn;
    extension = false;
    element = selected;
  }

  public SETId.msisdnType setMsisdnToNewInstance() {
      SETId.msisdnType element = new SETId.msisdnType();
      setMsisdn(element);
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
public static class mdnType extends Asn1OctetString {
  //

  private static final Asn1Tag TAG_mdnType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public mdnType() {
    super();
    setMinSize(8);
setMaxSize(8);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_mdnType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_mdnType != null) {
      return ImmutableList.of(TAG_mdnType);
    } else {
      return Asn1OctetString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new mdnType from encoded stream.
   */
  public static mdnType fromPerUnaligned(byte[] encodedBytes) {
    mdnType result = new mdnType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new mdnType from encoded stream.
   */
  public static mdnType fromPerAligned(byte[] encodedBytes) {
    mdnType result = new mdnType();
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
    return "mdnType";
  }
}


  public boolean isMdn() {
    return !hasExtensionValue() && Select.$Mdn == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isMdn}.
   */
  @SuppressWarnings("unchecked")
  public SETId.mdnType getMdn() {
    if (!isMdn()) {
      throw new IllegalStateException("SETId value not a Mdn");
    }
    return (SETId.mdnType) element;
  }

  public void setMdn(SETId.mdnType selected) {
    selection = Select.$Mdn;
    extension = false;
    element = selected;
  }

  public SETId.mdnType setMdnToNewInstance() {
      SETId.mdnType element = new SETId.mdnType();
      setMdn(element);
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
public static class minType extends Asn1BitString {
  //

  // defined bit positions, if any
  

  // setters
  

  // clearers
  


  private static final Asn1Tag TAG_minType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public minType() {
    super();
    setMinSize(34);
setMaxSize(34);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_minType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_minType != null) {
      return ImmutableList.of(TAG_minType);
    } else {
      return Asn1BitString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new minType from encoded stream.
   */
  public static minType fromPerUnaligned(byte[] encodedBytes) {
    minType result = new minType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new minType from encoded stream.
   */
  public static minType fromPerAligned(byte[] encodedBytes) {
    minType result = new minType();
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

  @Override public String toString() {
    return toIndentedString("");
  }

  public String toIndentedString(String indent) {
    return "minType = " + getValue() + ";\n";
  }
}


  public boolean isMin() {
    return !hasExtensionValue() && Select.$Min == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isMin}.
   */
  @SuppressWarnings("unchecked")
  public SETId.minType getMin() {
    if (!isMin()) {
      throw new IllegalStateException("SETId value not a Min");
    }
    return (SETId.minType) element;
  }

  public void setMin(SETId.minType selected) {
    selection = Select.$Min;
    extension = false;
    element = selected;
  }

  public SETId.minType setMinToNewInstance() {
      SETId.minType element = new SETId.minType();
      setMin(element);
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
public static class imsiType extends Asn1OctetString {
  //

  private static final Asn1Tag TAG_imsiType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public imsiType() {
    super();
    setMinSize(8);
setMaxSize(8);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_imsiType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_imsiType != null) {
      return ImmutableList.of(TAG_imsiType);
    } else {
      return Asn1OctetString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new imsiType from encoded stream.
   */
  public static imsiType fromPerUnaligned(byte[] encodedBytes) {
    imsiType result = new imsiType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new imsiType from encoded stream.
   */
  public static imsiType fromPerAligned(byte[] encodedBytes) {
    imsiType result = new imsiType();
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
    return "imsiType";
  }
}


  public boolean isImsi() {
    return !hasExtensionValue() && Select.$Imsi == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isImsi}.
   */
  @SuppressWarnings("unchecked")
  public SETId.imsiType getImsi() {
    if (!isImsi()) {
      throw new IllegalStateException("SETId value not a Imsi");
    }
    return (SETId.imsiType) element;
  }

  public void setImsi(SETId.imsiType selected) {
    selection = Select.$Imsi;
    extension = false;
    element = selected;
  }

  public SETId.imsiType setImsiToNewInstance() {
      SETId.imsiType element = new SETId.imsiType();
      setImsi(element);
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
public static class naiType extends Asn1IA5String {
  //

  private static final Asn1Tag TAG_naiType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public naiType() {
    super();
    setMinSize(1);
setMaxSize(1000);

    
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_naiType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_naiType != null) {
      return ImmutableList.of(TAG_naiType);
    } else {
      return Asn1IA5String.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new naiType from encoded stream.
   */
  public static naiType fromPerUnaligned(byte[] encodedBytes) {
    naiType result = new naiType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new naiType from encoded stream.
   */
  public static naiType fromPerAligned(byte[] encodedBytes) {
    naiType result = new naiType();
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

  @Override public String toString() {
    return toIndentedString("");
  }

  public String toIndentedString(String indent) {
    return "naiType = " + getValue() + ";\n";
  }
}


  public boolean isNai() {
    return !hasExtensionValue() && Select.$Nai == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isNai}.
   */
  @SuppressWarnings("unchecked")
  public SETId.naiType getNai() {
    if (!isNai()) {
      throw new IllegalStateException("SETId value not a Nai");
    }
    return (SETId.naiType) element;
  }

  public void setNai(SETId.naiType selected) {
    selection = Select.$Nai;
    extension = false;
    element = selected;
  }

  public SETId.naiType setNaiToNewInstance() {
      SETId.naiType element = new SETId.naiType();
      setNai(element);
      return element;
  }
  
  

  public boolean isIPAddress() {
    return !hasExtensionValue() && Select.$IPAddress == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isIPAddress}.
   */
  @SuppressWarnings("unchecked")
  public IPAddress getIPAddress() {
    if (!isIPAddress()) {
      throw new IllegalStateException("SETId value not a IPAddress");
    }
    return (IPAddress) element;
  }

  public void setIPAddress(IPAddress selected) {
    selection = Select.$IPAddress;
    extension = false;
    element = selected;
  }

  public IPAddress setIPAddressToNewInstance() {
      IPAddress element = new IPAddress();
      setIPAddress(element);
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
    return "SETId = " + elementIndentedString(indent) + indent + ";\n";
  }
}
