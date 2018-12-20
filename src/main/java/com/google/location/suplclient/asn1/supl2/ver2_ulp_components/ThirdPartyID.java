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

package com.google.location.suplclient.asn1.supl2.ver2_ulp_components;

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
import com.google.location.suplclient.asn1.base.Asn1VisibleString;
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
public  class ThirdPartyID extends Asn1Choice {
  //

  private static final Asn1Tag TAG_ThirdPartyID
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
            "ThirdPartyID: " + tag + " maps to both " + select0 + " and " + select);
        }
      }
    }
  }

  public ThirdPartyID() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ThirdPartyID;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ThirdPartyID != null) {
      return ImmutableList.of(TAG_ThirdPartyID);
    } else {
      return tagToSelection.keySet();
    }
  }

  /**
   * Creates a new ThirdPartyID from encoded stream.
   */
  public static ThirdPartyID fromPerUnaligned(byte[] encodedBytes) {
    ThirdPartyID result = new ThirdPartyID();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ThirdPartyID from encoded stream.
   */
  public static ThirdPartyID fromPerAligned(byte[] encodedBytes) {
    ThirdPartyID result = new ThirdPartyID();
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
    
    $LogicalName(Asn1Tag.fromClassAndNumber(2, 0),
        true) {
      @Override
      public Asn1Object createElement() {
        return new ThirdPartyID.logicalNameType();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? ThirdPartyID.logicalNameType.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $Msisdn(Asn1Tag.fromClassAndNumber(2, 1),
        true) {
      @Override
      public Asn1Object createElement() {
        return new ThirdPartyID.msisdnType();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? ThirdPartyID.msisdnType.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $Emailaddr(Asn1Tag.fromClassAndNumber(2, 2),
        true) {
      @Override
      public Asn1Object createElement() {
        return new ThirdPartyID.emailaddrType();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? ThirdPartyID.emailaddrType.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $Sip_uri(Asn1Tag.fromClassAndNumber(2, 3),
        true) {
      @Override
      public Asn1Object createElement() {
        return new ThirdPartyID.sip_uriType();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? ThirdPartyID.sip_uriType.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $Ims_public_identity(Asn1Tag.fromClassAndNumber(2, 4),
        true) {
      @Override
      public Asn1Object createElement() {
        return new ThirdPartyID.ims_public_identityType();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? ThirdPartyID.ims_public_identityType.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $Min(Asn1Tag.fromClassAndNumber(2, 5),
        true) {
      @Override
      public Asn1Object createElement() {
        return new ThirdPartyID.minType();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? ThirdPartyID.minType.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $Mdn(Asn1Tag.fromClassAndNumber(2, 6),
        true) {
      @Override
      public Asn1Object createElement() {
        return new ThirdPartyID.mdnType();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? ThirdPartyID.mdnType.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $Uri(Asn1Tag.fromClassAndNumber(2, 7),
        true) {
      @Override
      public Asn1Object createElement() {
        return new ThirdPartyID.uriType();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? ThirdPartyID.uriType.getPossibleFirstTags() : ImmutableList.of(tag);
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
public static class logicalNameType extends Asn1IA5String {
  //

  private static final Asn1Tag TAG_logicalNameType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public logicalNameType() {
    super();
    setMinSize(1);
setMaxSize(1000);

    
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_logicalNameType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_logicalNameType != null) {
      return ImmutableList.of(TAG_logicalNameType);
    } else {
      return Asn1IA5String.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new logicalNameType from encoded stream.
   */
  public static logicalNameType fromPerUnaligned(byte[] encodedBytes) {
    logicalNameType result = new logicalNameType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new logicalNameType from encoded stream.
   */
  public static logicalNameType fromPerAligned(byte[] encodedBytes) {
    logicalNameType result = new logicalNameType();
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
    return "logicalNameType = " + getValue() + ";\n";
  }
}


  public boolean isLogicalName() {
    return !hasExtensionValue() && Select.$LogicalName == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isLogicalName}.
   */
  @SuppressWarnings("unchecked")
  public ThirdPartyID.logicalNameType getLogicalName() {
    if (!isLogicalName()) {
      throw new IllegalStateException("ThirdPartyID value not a LogicalName");
    }
    return (ThirdPartyID.logicalNameType) element;
  }

  public void setLogicalName(ThirdPartyID.logicalNameType selected) {
    selection = Select.$LogicalName;
    extension = false;
    element = selected;
  }

  public ThirdPartyID.logicalNameType setLogicalNameToNewInstance() {
      ThirdPartyID.logicalNameType element = new ThirdPartyID.logicalNameType();
      setLogicalName(element);
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
  public ThirdPartyID.msisdnType getMsisdn() {
    if (!isMsisdn()) {
      throw new IllegalStateException("ThirdPartyID value not a Msisdn");
    }
    return (ThirdPartyID.msisdnType) element;
  }

  public void setMsisdn(ThirdPartyID.msisdnType selected) {
    selection = Select.$Msisdn;
    extension = false;
    element = selected;
  }

  public ThirdPartyID.msisdnType setMsisdnToNewInstance() {
      ThirdPartyID.msisdnType element = new ThirdPartyID.msisdnType();
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
public static class emailaddrType extends Asn1IA5String {
  //

  private static final Asn1Tag TAG_emailaddrType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public emailaddrType() {
    super();
    setMinSize(1);
setMaxSize(1000);

    
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_emailaddrType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_emailaddrType != null) {
      return ImmutableList.of(TAG_emailaddrType);
    } else {
      return Asn1IA5String.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new emailaddrType from encoded stream.
   */
  public static emailaddrType fromPerUnaligned(byte[] encodedBytes) {
    emailaddrType result = new emailaddrType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new emailaddrType from encoded stream.
   */
  public static emailaddrType fromPerAligned(byte[] encodedBytes) {
    emailaddrType result = new emailaddrType();
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
    return "emailaddrType = " + getValue() + ";\n";
  }
}


  public boolean isEmailaddr() {
    return !hasExtensionValue() && Select.$Emailaddr == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isEmailaddr}.
   */
  @SuppressWarnings("unchecked")
  public ThirdPartyID.emailaddrType getEmailaddr() {
    if (!isEmailaddr()) {
      throw new IllegalStateException("ThirdPartyID value not a Emailaddr");
    }
    return (ThirdPartyID.emailaddrType) element;
  }

  public void setEmailaddr(ThirdPartyID.emailaddrType selected) {
    selection = Select.$Emailaddr;
    extension = false;
    element = selected;
  }

  public ThirdPartyID.emailaddrType setEmailaddrToNewInstance() {
      ThirdPartyID.emailaddrType element = new ThirdPartyID.emailaddrType();
      setEmailaddr(element);
      return element;
  }
  
  /*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class sip_uriType extends Asn1VisibleString {
  //

  private static final Asn1Tag TAG_sip_uriType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public sip_uriType() {
    super();
    setMinSize(1);
setMaxSize(255);

    setAlphabet("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789:./-_~#@?");

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_sip_uriType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_sip_uriType != null) {
      return ImmutableList.of(TAG_sip_uriType);
    } else {
      return Asn1VisibleString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new sip_uriType from encoded stream.
   */
  public static sip_uriType fromPerUnaligned(byte[] encodedBytes) {
    sip_uriType result = new sip_uriType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new sip_uriType from encoded stream.
   */
  public static sip_uriType fromPerAligned(byte[] encodedBytes) {
    sip_uriType result = new sip_uriType();
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
    return "sip_uriType = " + getValue() + ";\n";
  }
}


  public boolean isSip_uri() {
    return !hasExtensionValue() && Select.$Sip_uri == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isSip_uri}.
   */
  @SuppressWarnings("unchecked")
  public ThirdPartyID.sip_uriType getSip_uri() {
    if (!isSip_uri()) {
      throw new IllegalStateException("ThirdPartyID value not a Sip_uri");
    }
    return (ThirdPartyID.sip_uriType) element;
  }

  public void setSip_uri(ThirdPartyID.sip_uriType selected) {
    selection = Select.$Sip_uri;
    extension = false;
    element = selected;
  }

  public ThirdPartyID.sip_uriType setSip_uriToNewInstance() {
      ThirdPartyID.sip_uriType element = new ThirdPartyID.sip_uriType();
      setSip_uri(element);
      return element;
  }
  
  /*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class ims_public_identityType extends Asn1VisibleString {
  //

  private static final Asn1Tag TAG_ims_public_identityType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ims_public_identityType() {
    super();
    setMinSize(1);
setMaxSize(255);

    setAlphabet("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789:./-_~#@?");

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ims_public_identityType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ims_public_identityType != null) {
      return ImmutableList.of(TAG_ims_public_identityType);
    } else {
      return Asn1VisibleString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ims_public_identityType from encoded stream.
   */
  public static ims_public_identityType fromPerUnaligned(byte[] encodedBytes) {
    ims_public_identityType result = new ims_public_identityType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ims_public_identityType from encoded stream.
   */
  public static ims_public_identityType fromPerAligned(byte[] encodedBytes) {
    ims_public_identityType result = new ims_public_identityType();
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
    return "ims_public_identityType = " + getValue() + ";\n";
  }
}


  public boolean isIms_public_identity() {
    return !hasExtensionValue() && Select.$Ims_public_identity == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isIms_public_identity}.
   */
  @SuppressWarnings("unchecked")
  public ThirdPartyID.ims_public_identityType getIms_public_identity() {
    if (!isIms_public_identity()) {
      throw new IllegalStateException("ThirdPartyID value not a Ims_public_identity");
    }
    return (ThirdPartyID.ims_public_identityType) element;
  }

  public void setIms_public_identity(ThirdPartyID.ims_public_identityType selected) {
    selection = Select.$Ims_public_identity;
    extension = false;
    element = selected;
  }

  public ThirdPartyID.ims_public_identityType setIms_public_identityToNewInstance() {
      ThirdPartyID.ims_public_identityType element = new ThirdPartyID.ims_public_identityType();
      setIms_public_identity(element);
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
  public ThirdPartyID.minType getMin() {
    if (!isMin()) {
      throw new IllegalStateException("ThirdPartyID value not a Min");
    }
    return (ThirdPartyID.minType) element;
  }

  public void setMin(ThirdPartyID.minType selected) {
    selection = Select.$Min;
    extension = false;
    element = selected;
  }

  public ThirdPartyID.minType setMinToNewInstance() {
      ThirdPartyID.minType element = new ThirdPartyID.minType();
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
  public ThirdPartyID.mdnType getMdn() {
    if (!isMdn()) {
      throw new IllegalStateException("ThirdPartyID value not a Mdn");
    }
    return (ThirdPartyID.mdnType) element;
  }

  public void setMdn(ThirdPartyID.mdnType selected) {
    selection = Select.$Mdn;
    extension = false;
    element = selected;
  }

  public ThirdPartyID.mdnType setMdnToNewInstance() {
      ThirdPartyID.mdnType element = new ThirdPartyID.mdnType();
      setMdn(element);
      return element;
  }
  
  /*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class uriType extends Asn1VisibleString {
  //

  private static final Asn1Tag TAG_uriType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public uriType() {
    super();
    setMinSize(1);
setMaxSize(255);

    setAlphabet("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789./-_~#");

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_uriType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_uriType != null) {
      return ImmutableList.of(TAG_uriType);
    } else {
      return Asn1VisibleString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new uriType from encoded stream.
   */
  public static uriType fromPerUnaligned(byte[] encodedBytes) {
    uriType result = new uriType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new uriType from encoded stream.
   */
  public static uriType fromPerAligned(byte[] encodedBytes) {
    uriType result = new uriType();
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
    return "uriType = " + getValue() + ";\n";
  }
}


  public boolean isUri() {
    return !hasExtensionValue() && Select.$Uri == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isUri}.
   */
  @SuppressWarnings("unchecked")
  public ThirdPartyID.uriType getUri() {
    if (!isUri()) {
      throw new IllegalStateException("ThirdPartyID value not a Uri");
    }
    return (ThirdPartyID.uriType) element;
  }

  public void setUri(ThirdPartyID.uriType selected) {
    selection = Select.$Uri;
    extension = false;
    element = selected;
  }

  public ThirdPartyID.uriType setUriToNewInstance() {
      ThirdPartyID.uriType element = new ThirdPartyID.uriType();
      setUri(element);
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
    return "ThirdPartyID = " + elementIndentedString(indent) + indent + ";\n";
  }
}
