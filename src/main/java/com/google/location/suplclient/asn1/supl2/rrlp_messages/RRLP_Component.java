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

package com.google.location.suplclient.asn1.supl2.rrlp_messages;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.google.location.suplclient.asn1.base.Asn1Choice;
import com.google.location.suplclient.asn1.base.Asn1Null;
import com.google.location.suplclient.asn1.base.Asn1Object;
import com.google.location.suplclient.asn1.base.Asn1Tag;
import com.google.location.suplclient.asn1.base.BitStream;
import com.google.location.suplclient.asn1.base.BitStreamReader;
import com.google.location.suplclient.asn1.base.ChoiceComponent;
import com.google.location.suplclient.asn1.supl2.rrlp_components.AssistanceData;
import com.google.location.suplclient.asn1.supl2.rrlp_components.MsrPosition_Req;
import com.google.location.suplclient.asn1.supl2.rrlp_components.MsrPosition_Rsp;
import com.google.location.suplclient.asn1.supl2.rrlp_components.PosCapability_Req;
import com.google.location.suplclient.asn1.supl2.rrlp_components.PosCapability_Rsp;
import com.google.location.suplclient.asn1.supl2.rrlp_components.ProtocolError;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;


/**
 * 
 */
public  class RRLP_Component extends Asn1Choice {
  //

  private static final Asn1Tag TAG_RRLP_Component
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
            "RRLP_Component: " + tag + " maps to both " + select0 + " and " + select);
        }
      }
    }
  }

  public RRLP_Component() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_RRLP_Component;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_RRLP_Component != null) {
      return ImmutableList.of(TAG_RRLP_Component);
    } else {
      return tagToSelection.keySet();
    }
  }

  /**
   * Creates a new RRLP_Component from encoded stream.
   */
  public static RRLP_Component fromPerUnaligned(byte[] encodedBytes) {
    RRLP_Component result = new RRLP_Component();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new RRLP_Component from encoded stream.
   */
  public static RRLP_Component fromPerAligned(byte[] encodedBytes) {
    RRLP_Component result = new RRLP_Component();
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
    
    $MsrPositionReq(Asn1Tag.fromClassAndNumber(2, 0),
        true) {
      @Override
      public Asn1Object createElement() {
        return new MsrPosition_Req();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? MsrPosition_Req.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $MsrPositionRsp(Asn1Tag.fromClassAndNumber(2, 1),
        true) {
      @Override
      public Asn1Object createElement() {
        return new MsrPosition_Rsp();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? MsrPosition_Rsp.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $AssistanceData(Asn1Tag.fromClassAndNumber(2, 2),
        true) {
      @Override
      public Asn1Object createElement() {
        return new AssistanceData();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? AssistanceData.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $AssistanceDataAck(Asn1Tag.fromClassAndNumber(2, 3),
        true) {
      @Override
      public Asn1Object createElement() {
        return new RRLP_Component.assistanceDataAckType();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? RRLP_Component.assistanceDataAckType.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $ProtocolError(Asn1Tag.fromClassAndNumber(2, 4),
        true) {
      @Override
      public Asn1Object createElement() {
        return new ProtocolError();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? ProtocolError.getPossibleFirstTags() : ImmutableList.of(tag);
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
  
  

  public boolean isMsrPositionReq() {
    return !hasExtensionValue() && Select.$MsrPositionReq == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isMsrPositionReq}.
   */
  @SuppressWarnings("unchecked")
  public MsrPosition_Req getMsrPositionReq() {
    if (!isMsrPositionReq()) {
      throw new IllegalStateException("RRLP_Component value not a MsrPositionReq");
    }
    return (MsrPosition_Req) element;
  }

  public void setMsrPositionReq(MsrPosition_Req selected) {
    selection = Select.$MsrPositionReq;
    extension = false;
    element = selected;
  }

  public MsrPosition_Req setMsrPositionReqToNewInstance() {
      MsrPosition_Req element = new MsrPosition_Req();
      setMsrPositionReq(element);
      return element;
  }
  
  

  public boolean isMsrPositionRsp() {
    return !hasExtensionValue() && Select.$MsrPositionRsp == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isMsrPositionRsp}.
   */
  @SuppressWarnings("unchecked")
  public MsrPosition_Rsp getMsrPositionRsp() {
    if (!isMsrPositionRsp()) {
      throw new IllegalStateException("RRLP_Component value not a MsrPositionRsp");
    }
    return (MsrPosition_Rsp) element;
  }

  public void setMsrPositionRsp(MsrPosition_Rsp selected) {
    selection = Select.$MsrPositionRsp;
    extension = false;
    element = selected;
  }

  public MsrPosition_Rsp setMsrPositionRspToNewInstance() {
      MsrPosition_Rsp element = new MsrPosition_Rsp();
      setMsrPositionRsp(element);
      return element;
  }
  
  

  public boolean isAssistanceData() {
    return !hasExtensionValue() && Select.$AssistanceData == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isAssistanceData}.
   */
  @SuppressWarnings("unchecked")
  public AssistanceData getAssistanceData() {
    if (!isAssistanceData()) {
      throw new IllegalStateException("RRLP_Component value not a AssistanceData");
    }
    return (AssistanceData) element;
  }

  public void setAssistanceData(AssistanceData selected) {
    selection = Select.$AssistanceData;
    extension = false;
    element = selected;
  }

  public AssistanceData setAssistanceDataToNewInstance() {
      AssistanceData element = new AssistanceData();
      setAssistanceData(element);
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
public static class assistanceDataAckType extends Asn1Null {
  //

  private static final Asn1Tag TAG_assistanceDataAckType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public assistanceDataAckType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_assistanceDataAckType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_assistanceDataAckType != null) {
      return ImmutableList.of(TAG_assistanceDataAckType);
    } else {
      return Asn1Null.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new assistanceDataAckType from encoded stream.
   */
  public static assistanceDataAckType fromPerUnaligned(byte[] encodedBytes) {
    assistanceDataAckType result = new assistanceDataAckType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new assistanceDataAckType from encoded stream.
   */
  public static assistanceDataAckType fromPerAligned(byte[] encodedBytes) {
    assistanceDataAckType result = new assistanceDataAckType();
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
    return "assistanceDataAckType (null value);\n";
  }
}


  public boolean isAssistanceDataAck() {
    return !hasExtensionValue() && Select.$AssistanceDataAck == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isAssistanceDataAck}.
   */
  @SuppressWarnings("unchecked")
  public RRLP_Component.assistanceDataAckType getAssistanceDataAck() {
    if (!isAssistanceDataAck()) {
      throw new IllegalStateException("RRLP_Component value not a AssistanceDataAck");
    }
    return (RRLP_Component.assistanceDataAckType) element;
  }

  public void setAssistanceDataAck(RRLP_Component.assistanceDataAckType selected) {
    selection = Select.$AssistanceDataAck;
    extension = false;
    element = selected;
  }

  public RRLP_Component.assistanceDataAckType setAssistanceDataAckToNewInstance() {
      RRLP_Component.assistanceDataAckType element = new RRLP_Component.assistanceDataAckType();
      setAssistanceDataAck(element);
      return element;
  }
  
  

  public boolean isProtocolError() {
    return !hasExtensionValue() && Select.$ProtocolError == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isProtocolError}.
   */
  @SuppressWarnings("unchecked")
  public ProtocolError getProtocolError() {
    if (!isProtocolError()) {
      throw new IllegalStateException("RRLP_Component value not a ProtocolError");
    }
    return (ProtocolError) element;
  }

  public void setProtocolError(ProtocolError selected) {
    selection = Select.$ProtocolError;
    extension = false;
    element = selected;
  }

  public ProtocolError setProtocolErrorToNewInstance() {
      ProtocolError element = new ProtocolError();
      setProtocolError(element);
      return element;
  }
  

  private static enum Extend implements ChoiceComponent {
    
    $PosCapabilityReq(Asn1Tag.fromClassAndNumber(2, 5),
        true) {
      @Override
      public Asn1Object createElement() {
        return new PosCapability_Req();
      }

      @Override
      @SuppressWarnings("unchecked")
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + ((PosCapability_Req) element).toIndentedString(indent);
      }
    },
    
    $PosCapabilityRsp(Asn1Tag.fromClassAndNumber(2, 6),
        true) {
      @Override
      public Asn1Object createElement() {
        return new PosCapability_Rsp();
      }

      @Override
      @SuppressWarnings("unchecked")
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + ((PosCapability_Rsp) element).toIndentedString(indent);
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
  
  

  public boolean isExtensionPosCapabilityReq() {
    return hasExtensionValue() && Extend.$PosCapabilityReq == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isPosCapabilityReq}.
   */
  @SuppressWarnings("unchecked")
  public PosCapability_Req getExtensionPosCapabilityReq() {
    if (!isExtensionPosCapabilityReq()) {
      throw new IllegalStateException("RRLP_Component value not a PosCapabilityReq");
    }
    return (PosCapability_Req) element;
  }

  public void setExtensionPosCapabilityReq(PosCapability_Req selected) {
    selection = Extend.$PosCapabilityReq;
    extension = true;
    element = selected;
  }

  public void setExtensionPosCapabilityReqToNewInstance() {
      PosCapability_Req element = new PosCapability_Req();
      setExtensionPosCapabilityReq(element);
  }
  
  

  public boolean isExtensionPosCapabilityRsp() {
    return hasExtensionValue() && Extend.$PosCapabilityRsp == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isPosCapabilityRsp}.
   */
  @SuppressWarnings("unchecked")
  public PosCapability_Rsp getExtensionPosCapabilityRsp() {
    if (!isExtensionPosCapabilityRsp()) {
      throw new IllegalStateException("RRLP_Component value not a PosCapabilityRsp");
    }
    return (PosCapability_Rsp) element;
  }

  public void setExtensionPosCapabilityRsp(PosCapability_Rsp selected) {
    selection = Extend.$PosCapabilityRsp;
    extension = true;
    element = selected;
  }

  public void setExtensionPosCapabilityRspToNewInstance() {
      PosCapability_Rsp element = new PosCapability_Rsp();
      setExtensionPosCapabilityRsp(element);
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
    return "RRLP_Component = " + elementIndentedString(indent) + indent + ";\n";
  }
}
