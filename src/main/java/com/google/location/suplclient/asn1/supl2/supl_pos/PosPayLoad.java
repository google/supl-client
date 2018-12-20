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

package com.google.location.suplclient.asn1.supl2.supl_pos;

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
import com.google.location.suplclient.asn1.supl2.ulp_version_2_parameter_extensions.Ver2_PosPayLoad_extension;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;


/**
 * 
 */
public  class PosPayLoad extends Asn1Choice {
  //

  private static final Asn1Tag TAG_PosPayLoad
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
            "PosPayLoad: " + tag + " maps to both " + select0 + " and " + select);
        }
      }
    }
  }

  public PosPayLoad() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_PosPayLoad;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_PosPayLoad != null) {
      return ImmutableList.of(TAG_PosPayLoad);
    } else {
      return tagToSelection.keySet();
    }
  }

  /**
   * Creates a new PosPayLoad from encoded stream.
   */
  public static PosPayLoad fromPerUnaligned(byte[] encodedBytes) {
    PosPayLoad result = new PosPayLoad();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new PosPayLoad from encoded stream.
   */
  public static PosPayLoad fromPerAligned(byte[] encodedBytes) {
    PosPayLoad result = new PosPayLoad();
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
    
    $Tia801payload(Asn1Tag.fromClassAndNumber(2, 0),
        true) {
      @Override
      public Asn1Object createElement() {
        return new PosPayLoad.tia801payloadType();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? PosPayLoad.tia801payloadType.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $RrcPayload(Asn1Tag.fromClassAndNumber(2, 1),
        true) {
      @Override
      public Asn1Object createElement() {
        return new PosPayLoad.rrcPayloadType();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? PosPayLoad.rrcPayloadType.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $RrlpPayload(Asn1Tag.fromClassAndNumber(2, 2),
        true) {
      @Override
      public Asn1Object createElement() {
        return new PosPayLoad.rrlpPayloadType();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? PosPayLoad.rrlpPayloadType.getPossibleFirstTags() : ImmutableList.of(tag);
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
public static class tia801payloadType extends Asn1OctetString {
  //

  private static final Asn1Tag TAG_tia801payloadType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public tia801payloadType() {
    super();
    setMinSize(1);
setMaxSize(8192);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_tia801payloadType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_tia801payloadType != null) {
      return ImmutableList.of(TAG_tia801payloadType);
    } else {
      return Asn1OctetString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new tia801payloadType from encoded stream.
   */
  public static tia801payloadType fromPerUnaligned(byte[] encodedBytes) {
    tia801payloadType result = new tia801payloadType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new tia801payloadType from encoded stream.
   */
  public static tia801payloadType fromPerAligned(byte[] encodedBytes) {
    tia801payloadType result = new tia801payloadType();
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
    return "tia801payloadType";
  }
}


  public boolean isTia801payload() {
    return !hasExtensionValue() && Select.$Tia801payload == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isTia801payload}.
   */
  @SuppressWarnings("unchecked")
  public PosPayLoad.tia801payloadType getTia801payload() {
    if (!isTia801payload()) {
      throw new IllegalStateException("PosPayLoad value not a Tia801payload");
    }
    return (PosPayLoad.tia801payloadType) element;
  }

  public void setTia801payload(PosPayLoad.tia801payloadType selected) {
    selection = Select.$Tia801payload;
    extension = false;
    element = selected;
  }

  public PosPayLoad.tia801payloadType setTia801payloadToNewInstance() {
      PosPayLoad.tia801payloadType element = new PosPayLoad.tia801payloadType();
      setTia801payload(element);
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
public static class rrcPayloadType extends Asn1OctetString {
  //

  private static final Asn1Tag TAG_rrcPayloadType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public rrcPayloadType() {
    super();
    setMinSize(1);
setMaxSize(8192);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_rrcPayloadType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_rrcPayloadType != null) {
      return ImmutableList.of(TAG_rrcPayloadType);
    } else {
      return Asn1OctetString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new rrcPayloadType from encoded stream.
   */
  public static rrcPayloadType fromPerUnaligned(byte[] encodedBytes) {
    rrcPayloadType result = new rrcPayloadType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new rrcPayloadType from encoded stream.
   */
  public static rrcPayloadType fromPerAligned(byte[] encodedBytes) {
    rrcPayloadType result = new rrcPayloadType();
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
    return "rrcPayloadType";
  }
}


  public boolean isRrcPayload() {
    return !hasExtensionValue() && Select.$RrcPayload == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isRrcPayload}.
   */
  @SuppressWarnings("unchecked")
  public PosPayLoad.rrcPayloadType getRrcPayload() {
    if (!isRrcPayload()) {
      throw new IllegalStateException("PosPayLoad value not a RrcPayload");
    }
    return (PosPayLoad.rrcPayloadType) element;
  }

  public void setRrcPayload(PosPayLoad.rrcPayloadType selected) {
    selection = Select.$RrcPayload;
    extension = false;
    element = selected;
  }

  public PosPayLoad.rrcPayloadType setRrcPayloadToNewInstance() {
      PosPayLoad.rrcPayloadType element = new PosPayLoad.rrcPayloadType();
      setRrcPayload(element);
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
public static class rrlpPayloadType extends Asn1OctetString {
  //

  private static final Asn1Tag TAG_rrlpPayloadType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public rrlpPayloadType() {
    super();
    setMinSize(1);
setMaxSize(8192);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_rrlpPayloadType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_rrlpPayloadType != null) {
      return ImmutableList.of(TAG_rrlpPayloadType);
    } else {
      return Asn1OctetString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new rrlpPayloadType from encoded stream.
   */
  public static rrlpPayloadType fromPerUnaligned(byte[] encodedBytes) {
    rrlpPayloadType result = new rrlpPayloadType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new rrlpPayloadType from encoded stream.
   */
  public static rrlpPayloadType fromPerAligned(byte[] encodedBytes) {
    rrlpPayloadType result = new rrlpPayloadType();
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
    return "rrlpPayloadType";
  }
}


  public boolean isRrlpPayload() {
    return !hasExtensionValue() && Select.$RrlpPayload == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isRrlpPayload}.
   */
  @SuppressWarnings("unchecked")
  public PosPayLoad.rrlpPayloadType getRrlpPayload() {
    if (!isRrlpPayload()) {
      throw new IllegalStateException("PosPayLoad value not a RrlpPayload");
    }
    return (PosPayLoad.rrlpPayloadType) element;
  }

  public void setRrlpPayload(PosPayLoad.rrlpPayloadType selected) {
    selection = Select.$RrlpPayload;
    extension = false;
    element = selected;
  }

  public PosPayLoad.rrlpPayloadType setRrlpPayloadToNewInstance() {
      PosPayLoad.rrlpPayloadType element = new PosPayLoad.rrlpPayloadType();
      setRrlpPayload(element);
      return element;
  }
  

  private static enum Extend implements ChoiceComponent {
    
    $Ver2_PosPayLoad_extension(Asn1Tag.fromClassAndNumber(2, 3),
        true) {
      @Override
      public Asn1Object createElement() {
        return new Ver2_PosPayLoad_extension();
      }

      @Override
      @SuppressWarnings("unchecked")
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + ((Ver2_PosPayLoad_extension) element).toIndentedString(indent);
      }
    },
    
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
  
  

  public boolean isExtensionVer2_PosPayLoad_extension() {
    return hasExtensionValue() && Extend.$Ver2_PosPayLoad_extension == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isVer2_PosPayLoad_extension}.
   */
  @SuppressWarnings("unchecked")
  public Ver2_PosPayLoad_extension getExtensionVer2_PosPayLoad_extension() {
    if (!isExtensionVer2_PosPayLoad_extension()) {
      throw new IllegalStateException("PosPayLoad value not a Ver2_PosPayLoad_extension");
    }
    return (Ver2_PosPayLoad_extension) element;
  }

  public void setExtensionVer2_PosPayLoad_extension(Ver2_PosPayLoad_extension selected) {
    selection = Extend.$Ver2_PosPayLoad_extension;
    extension = true;
    element = selected;
  }

  public void setExtensionVer2_PosPayLoad_extensionToNewInstance() {
      Ver2_PosPayLoad_extension element = new Ver2_PosPayLoad_extension();
      setExtensionVer2_PosPayLoad_extension(element);
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
    return "PosPayLoad = " + elementIndentedString(indent) + indent + ";\n";
  }
}
