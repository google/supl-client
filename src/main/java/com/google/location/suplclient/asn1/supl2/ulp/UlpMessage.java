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

package com.google.location.suplclient.asn1.supl2.ulp;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.google.location.suplclient.asn1.base.Asn1Choice;
import com.google.location.suplclient.asn1.base.Asn1Object;
import com.google.location.suplclient.asn1.base.Asn1Tag;
import com.google.location.suplclient.asn1.base.BitStream;
import com.google.location.suplclient.asn1.base.BitStreamReader;
import com.google.location.suplclient.asn1.base.ChoiceComponent;
import com.google.location.suplclient.asn1.supl2.supl_auth_req.SUPLAUTHREQ;
import com.google.location.suplclient.asn1.supl2.supl_auth_resp.SUPLAUTHRESP;
import com.google.location.suplclient.asn1.supl2.supl_end.SUPLEND;
import com.google.location.suplclient.asn1.supl2.supl_init.SUPLINIT;
import com.google.location.suplclient.asn1.supl2.supl_notify.Ver2_SUPLNOTIFY;
import com.google.location.suplclient.asn1.supl2.supl_notify_response.Ver2_SUPLNOTIFYRESPONSE;
import com.google.location.suplclient.asn1.supl2.supl_pos.SUPLPOS;
import com.google.location.suplclient.asn1.supl2.supl_pos_init.SUPLPOSINIT;
import com.google.location.suplclient.asn1.supl2.supl_report.Ver2_SUPLREPORT;
import com.google.location.suplclient.asn1.supl2.supl_response.SUPLRESPONSE;
import com.google.location.suplclient.asn1.supl2.supl_set_init.Ver2_SUPLSETINIT;
import com.google.location.suplclient.asn1.supl2.supl_start.SUPLSTART;
import com.google.location.suplclient.asn1.supl2.supl_triggered_response.Ver2_SUPLTRIGGEREDRESPONSE;
import com.google.location.suplclient.asn1.supl2.supl_triggered_start.Ver2_SUPLTRIGGEREDSTART;
import com.google.location.suplclient.asn1.supl2.supl_triggered_stop.Ver2_SUPLTRIGGEREDSTOP;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;


/**
 * 
 */
public  class UlpMessage extends Asn1Choice {
  //

  private static final Asn1Tag TAG_UlpMessage
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
            "UlpMessage: " + tag + " maps to both " + select0 + " and " + select);
        }
      }
    }
  }

  public UlpMessage() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_UlpMessage;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_UlpMessage != null) {
      return ImmutableList.of(TAG_UlpMessage);
    } else {
      return tagToSelection.keySet();
    }
  }

  /**
   * Creates a new UlpMessage from encoded stream.
   */
  public static UlpMessage fromPerUnaligned(byte[] encodedBytes) {
    UlpMessage result = new UlpMessage();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new UlpMessage from encoded stream.
   */
  public static UlpMessage fromPerAligned(byte[] encodedBytes) {
    UlpMessage result = new UlpMessage();
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
    
    $MsSUPLINIT(Asn1Tag.fromClassAndNumber(2, 0),
        true) {
      @Override
      public Asn1Object createElement() {
        return new SUPLINIT();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? SUPLINIT.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $MsSUPLSTART(Asn1Tag.fromClassAndNumber(2, 1),
        true) {
      @Override
      public Asn1Object createElement() {
        return new SUPLSTART();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? SUPLSTART.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $MsSUPLRESPONSE(Asn1Tag.fromClassAndNumber(2, 2),
        true) {
      @Override
      public Asn1Object createElement() {
        return new SUPLRESPONSE();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? SUPLRESPONSE.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $MsSUPLPOSINIT(Asn1Tag.fromClassAndNumber(2, 3),
        true) {
      @Override
      public Asn1Object createElement() {
        return new SUPLPOSINIT();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? SUPLPOSINIT.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $MsSUPLPOS(Asn1Tag.fromClassAndNumber(2, 4),
        true) {
      @Override
      public Asn1Object createElement() {
        return new SUPLPOS();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? SUPLPOS.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $MsSUPLEND(Asn1Tag.fromClassAndNumber(2, 5),
        true) {
      @Override
      public Asn1Object createElement() {
        return new SUPLEND();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? SUPLEND.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $MsSUPLAUTHREQ(Asn1Tag.fromClassAndNumber(2, 6),
        true) {
      @Override
      public Asn1Object createElement() {
        return new SUPLAUTHREQ();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? SUPLAUTHREQ.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $MsSUPLAUTHRESP(Asn1Tag.fromClassAndNumber(2, 7),
        true) {
      @Override
      public Asn1Object createElement() {
        return new SUPLAUTHRESP();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? SUPLAUTHRESP.getPossibleFirstTags() : ImmutableList.of(tag);
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
  
  

  public boolean isMsSUPLINIT() {
    return !hasExtensionValue() && Select.$MsSUPLINIT == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isMsSUPLINIT}.
   */
  @SuppressWarnings("unchecked")
  public SUPLINIT getMsSUPLINIT() {
    if (!isMsSUPLINIT()) {
      throw new IllegalStateException("UlpMessage value not a MsSUPLINIT");
    }
    return (SUPLINIT) element;
  }

  public void setMsSUPLINIT(SUPLINIT selected) {
    selection = Select.$MsSUPLINIT;
    extension = false;
    element = selected;
  }

  public SUPLINIT setMsSUPLINITToNewInstance() {
      SUPLINIT element = new SUPLINIT();
      setMsSUPLINIT(element);
      return element;
  }
  
  

  public boolean isMsSUPLSTART() {
    return !hasExtensionValue() && Select.$MsSUPLSTART == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isMsSUPLSTART}.
   */
  @SuppressWarnings("unchecked")
  public SUPLSTART getMsSUPLSTART() {
    if (!isMsSUPLSTART()) {
      throw new IllegalStateException("UlpMessage value not a MsSUPLSTART");
    }
    return (SUPLSTART) element;
  }

  public void setMsSUPLSTART(SUPLSTART selected) {
    selection = Select.$MsSUPLSTART;
    extension = false;
    element = selected;
  }

  public SUPLSTART setMsSUPLSTARTToNewInstance() {
      SUPLSTART element = new SUPLSTART();
      setMsSUPLSTART(element);
      return element;
  }
  
  

  public boolean isMsSUPLRESPONSE() {
    return !hasExtensionValue() && Select.$MsSUPLRESPONSE == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isMsSUPLRESPONSE}.
   */
  @SuppressWarnings("unchecked")
  public SUPLRESPONSE getMsSUPLRESPONSE() {
    if (!isMsSUPLRESPONSE()) {
      throw new IllegalStateException("UlpMessage value not a MsSUPLRESPONSE");
    }
    return (SUPLRESPONSE) element;
  }

  public void setMsSUPLRESPONSE(SUPLRESPONSE selected) {
    selection = Select.$MsSUPLRESPONSE;
    extension = false;
    element = selected;
  }

  public SUPLRESPONSE setMsSUPLRESPONSEToNewInstance() {
      SUPLRESPONSE element = new SUPLRESPONSE();
      setMsSUPLRESPONSE(element);
      return element;
  }
  
  

  public boolean isMsSUPLPOSINIT() {
    return !hasExtensionValue() && Select.$MsSUPLPOSINIT == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isMsSUPLPOSINIT}.
   */
  @SuppressWarnings("unchecked")
  public SUPLPOSINIT getMsSUPLPOSINIT() {
    if (!isMsSUPLPOSINIT()) {
      throw new IllegalStateException("UlpMessage value not a MsSUPLPOSINIT");
    }
    return (SUPLPOSINIT) element;
  }

  public void setMsSUPLPOSINIT(SUPLPOSINIT selected) {
    selection = Select.$MsSUPLPOSINIT;
    extension = false;
    element = selected;
  }

  public SUPLPOSINIT setMsSUPLPOSINITToNewInstance() {
      SUPLPOSINIT element = new SUPLPOSINIT();
      setMsSUPLPOSINIT(element);
      return element;
  }
  
  

  public boolean isMsSUPLPOS() {
    return !hasExtensionValue() && Select.$MsSUPLPOS == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isMsSUPLPOS}.
   */
  @SuppressWarnings("unchecked")
  public SUPLPOS getMsSUPLPOS() {
    if (!isMsSUPLPOS()) {
      throw new IllegalStateException("UlpMessage value not a MsSUPLPOS");
    }
    return (SUPLPOS) element;
  }

  public void setMsSUPLPOS(SUPLPOS selected) {
    selection = Select.$MsSUPLPOS;
    extension = false;
    element = selected;
  }

  public SUPLPOS setMsSUPLPOSToNewInstance() {
      SUPLPOS element = new SUPLPOS();
      setMsSUPLPOS(element);
      return element;
  }
  
  

  public boolean isMsSUPLEND() {
    return !hasExtensionValue() && Select.$MsSUPLEND == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isMsSUPLEND}.
   */
  @SuppressWarnings("unchecked")
  public SUPLEND getMsSUPLEND() {
    if (!isMsSUPLEND()) {
      throw new IllegalStateException("UlpMessage value not a MsSUPLEND");
    }
    return (SUPLEND) element;
  }

  public void setMsSUPLEND(SUPLEND selected) {
    selection = Select.$MsSUPLEND;
    extension = false;
    element = selected;
  }

  public SUPLEND setMsSUPLENDToNewInstance() {
      SUPLEND element = new SUPLEND();
      setMsSUPLEND(element);
      return element;
  }
  
  

  public boolean isMsSUPLAUTHREQ() {
    return !hasExtensionValue() && Select.$MsSUPLAUTHREQ == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isMsSUPLAUTHREQ}.
   */
  @SuppressWarnings("unchecked")
  public SUPLAUTHREQ getMsSUPLAUTHREQ() {
    if (!isMsSUPLAUTHREQ()) {
      throw new IllegalStateException("UlpMessage value not a MsSUPLAUTHREQ");
    }
    return (SUPLAUTHREQ) element;
  }

  public void setMsSUPLAUTHREQ(SUPLAUTHREQ selected) {
    selection = Select.$MsSUPLAUTHREQ;
    extension = false;
    element = selected;
  }

  public SUPLAUTHREQ setMsSUPLAUTHREQToNewInstance() {
      SUPLAUTHREQ element = new SUPLAUTHREQ();
      setMsSUPLAUTHREQ(element);
      return element;
  }
  
  

  public boolean isMsSUPLAUTHRESP() {
    return !hasExtensionValue() && Select.$MsSUPLAUTHRESP == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isMsSUPLAUTHRESP}.
   */
  @SuppressWarnings("unchecked")
  public SUPLAUTHRESP getMsSUPLAUTHRESP() {
    if (!isMsSUPLAUTHRESP()) {
      throw new IllegalStateException("UlpMessage value not a MsSUPLAUTHRESP");
    }
    return (SUPLAUTHRESP) element;
  }

  public void setMsSUPLAUTHRESP(SUPLAUTHRESP selected) {
    selection = Select.$MsSUPLAUTHRESP;
    extension = false;
    element = selected;
  }

  public SUPLAUTHRESP setMsSUPLAUTHRESPToNewInstance() {
      SUPLAUTHRESP element = new SUPLAUTHRESP();
      setMsSUPLAUTHRESP(element);
      return element;
  }
  

  private static enum Extend implements ChoiceComponent {
    
    $MsSUPLTRIGGEREDSTART(Asn1Tag.fromClassAndNumber(2, 8),
        true) {
      @Override
      public Asn1Object createElement() {
        return new Ver2_SUPLTRIGGEREDSTART();
      }

      @Override
      @SuppressWarnings("unchecked")
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + ((Ver2_SUPLTRIGGEREDSTART) element).toIndentedString(indent);
      }
    },
    
    $MsSUPLTRIGGEREDRESPONSE(Asn1Tag.fromClassAndNumber(2, 9),
        true) {
      @Override
      public Asn1Object createElement() {
        return new Ver2_SUPLTRIGGEREDRESPONSE();
      }

      @Override
      @SuppressWarnings("unchecked")
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + ((Ver2_SUPLTRIGGEREDRESPONSE) element).toIndentedString(indent);
      }
    },
    
    $MsSUPLTRIGGEREDSTOP(Asn1Tag.fromClassAndNumber(2, 10),
        true) {
      @Override
      public Asn1Object createElement() {
        return new Ver2_SUPLTRIGGEREDSTOP();
      }

      @Override
      @SuppressWarnings("unchecked")
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + ((Ver2_SUPLTRIGGEREDSTOP) element).toIndentedString(indent);
      }
    },
    
    $MsSUPLNOTIFY(Asn1Tag.fromClassAndNumber(2, 11),
        true) {
      @Override
      public Asn1Object createElement() {
        return new Ver2_SUPLNOTIFY();
      }

      @Override
      @SuppressWarnings("unchecked")
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + ((Ver2_SUPLNOTIFY) element).toIndentedString(indent);
      }
    },
    
    $MsSUPLNOTIFYRESPONSE(Asn1Tag.fromClassAndNumber(2, 12),
        true) {
      @Override
      public Asn1Object createElement() {
        return new Ver2_SUPLNOTIFYRESPONSE();
      }

      @Override
      @SuppressWarnings("unchecked")
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + ((Ver2_SUPLNOTIFYRESPONSE) element).toIndentedString(indent);
      }
    },
    
    $MsSUPLSETINIT(Asn1Tag.fromClassAndNumber(2, 13),
        true) {
      @Override
      public Asn1Object createElement() {
        return new Ver2_SUPLSETINIT();
      }

      @Override
      @SuppressWarnings("unchecked")
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + ((Ver2_SUPLSETINIT) element).toIndentedString(indent);
      }
    },
    
    $MsSUPLREPORT(Asn1Tag.fromClassAndNumber(2, 14),
        true) {
      @Override
      public Asn1Object createElement() {
        return new Ver2_SUPLREPORT();
      }

      @Override
      @SuppressWarnings("unchecked")
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + ((Ver2_SUPLREPORT) element).toIndentedString(indent);
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
  
  

  public boolean isExtensionMsSUPLTRIGGEREDSTART() {
    return hasExtensionValue() && Extend.$MsSUPLTRIGGEREDSTART == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isMsSUPLTRIGGEREDSTART}.
   */
  @SuppressWarnings("unchecked")
  public Ver2_SUPLTRIGGEREDSTART getExtensionMsSUPLTRIGGEREDSTART() {
    if (!isExtensionMsSUPLTRIGGEREDSTART()) {
      throw new IllegalStateException("UlpMessage value not a MsSUPLTRIGGEREDSTART");
    }
    return (Ver2_SUPLTRIGGEREDSTART) element;
  }

  public void setExtensionMsSUPLTRIGGEREDSTART(Ver2_SUPLTRIGGEREDSTART selected) {
    selection = Extend.$MsSUPLTRIGGEREDSTART;
    extension = true;
    element = selected;
  }

  public void setExtensionMsSUPLTRIGGEREDSTARTToNewInstance() {
      Ver2_SUPLTRIGGEREDSTART element = new Ver2_SUPLTRIGGEREDSTART();
      setExtensionMsSUPLTRIGGEREDSTART(element);
  }
  
  

  public boolean isExtensionMsSUPLTRIGGEREDRESPONSE() {
    return hasExtensionValue() && Extend.$MsSUPLTRIGGEREDRESPONSE == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isMsSUPLTRIGGEREDRESPONSE}.
   */
  @SuppressWarnings("unchecked")
  public Ver2_SUPLTRIGGEREDRESPONSE getExtensionMsSUPLTRIGGEREDRESPONSE() {
    if (!isExtensionMsSUPLTRIGGEREDRESPONSE()) {
      throw new IllegalStateException("UlpMessage value not a MsSUPLTRIGGEREDRESPONSE");
    }
    return (Ver2_SUPLTRIGGEREDRESPONSE) element;
  }

  public void setExtensionMsSUPLTRIGGEREDRESPONSE(Ver2_SUPLTRIGGEREDRESPONSE selected) {
    selection = Extend.$MsSUPLTRIGGEREDRESPONSE;
    extension = true;
    element = selected;
  }

  public void setExtensionMsSUPLTRIGGEREDRESPONSEToNewInstance() {
      Ver2_SUPLTRIGGEREDRESPONSE element = new Ver2_SUPLTRIGGEREDRESPONSE();
      setExtensionMsSUPLTRIGGEREDRESPONSE(element);
  }
  
  

  public boolean isExtensionMsSUPLTRIGGEREDSTOP() {
    return hasExtensionValue() && Extend.$MsSUPLTRIGGEREDSTOP == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isMsSUPLTRIGGEREDSTOP}.
   */
  @SuppressWarnings("unchecked")
  public Ver2_SUPLTRIGGEREDSTOP getExtensionMsSUPLTRIGGEREDSTOP() {
    if (!isExtensionMsSUPLTRIGGEREDSTOP()) {
      throw new IllegalStateException("UlpMessage value not a MsSUPLTRIGGEREDSTOP");
    }
    return (Ver2_SUPLTRIGGEREDSTOP) element;
  }

  public void setExtensionMsSUPLTRIGGEREDSTOP(Ver2_SUPLTRIGGEREDSTOP selected) {
    selection = Extend.$MsSUPLTRIGGEREDSTOP;
    extension = true;
    element = selected;
  }

  public void setExtensionMsSUPLTRIGGEREDSTOPToNewInstance() {
      Ver2_SUPLTRIGGEREDSTOP element = new Ver2_SUPLTRIGGEREDSTOP();
      setExtensionMsSUPLTRIGGEREDSTOP(element);
  }
  
  

  public boolean isExtensionMsSUPLNOTIFY() {
    return hasExtensionValue() && Extend.$MsSUPLNOTIFY == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isMsSUPLNOTIFY}.
   */
  @SuppressWarnings("unchecked")
  public Ver2_SUPLNOTIFY getExtensionMsSUPLNOTIFY() {
    if (!isExtensionMsSUPLNOTIFY()) {
      throw new IllegalStateException("UlpMessage value not a MsSUPLNOTIFY");
    }
    return (Ver2_SUPLNOTIFY) element;
  }

  public void setExtensionMsSUPLNOTIFY(Ver2_SUPLNOTIFY selected) {
    selection = Extend.$MsSUPLNOTIFY;
    extension = true;
    element = selected;
  }

  public void setExtensionMsSUPLNOTIFYToNewInstance() {
      Ver2_SUPLNOTIFY element = new Ver2_SUPLNOTIFY();
      setExtensionMsSUPLNOTIFY(element);
  }
  
  

  public boolean isExtensionMsSUPLNOTIFYRESPONSE() {
    return hasExtensionValue() && Extend.$MsSUPLNOTIFYRESPONSE == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isMsSUPLNOTIFYRESPONSE}.
   */
  @SuppressWarnings("unchecked")
  public Ver2_SUPLNOTIFYRESPONSE getExtensionMsSUPLNOTIFYRESPONSE() {
    if (!isExtensionMsSUPLNOTIFYRESPONSE()) {
      throw new IllegalStateException("UlpMessage value not a MsSUPLNOTIFYRESPONSE");
    }
    return (Ver2_SUPLNOTIFYRESPONSE) element;
  }

  public void setExtensionMsSUPLNOTIFYRESPONSE(Ver2_SUPLNOTIFYRESPONSE selected) {
    selection = Extend.$MsSUPLNOTIFYRESPONSE;
    extension = true;
    element = selected;
  }

  public void setExtensionMsSUPLNOTIFYRESPONSEToNewInstance() {
      Ver2_SUPLNOTIFYRESPONSE element = new Ver2_SUPLNOTIFYRESPONSE();
      setExtensionMsSUPLNOTIFYRESPONSE(element);
  }
  
  

  public boolean isExtensionMsSUPLSETINIT() {
    return hasExtensionValue() && Extend.$MsSUPLSETINIT == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isMsSUPLSETINIT}.
   */
  @SuppressWarnings("unchecked")
  public Ver2_SUPLSETINIT getExtensionMsSUPLSETINIT() {
    if (!isExtensionMsSUPLSETINIT()) {
      throw new IllegalStateException("UlpMessage value not a MsSUPLSETINIT");
    }
    return (Ver2_SUPLSETINIT) element;
  }

  public void setExtensionMsSUPLSETINIT(Ver2_SUPLSETINIT selected) {
    selection = Extend.$MsSUPLSETINIT;
    extension = true;
    element = selected;
  }

  public void setExtensionMsSUPLSETINITToNewInstance() {
      Ver2_SUPLSETINIT element = new Ver2_SUPLSETINIT();
      setExtensionMsSUPLSETINIT(element);
  }
  
  

  public boolean isExtensionMsSUPLREPORT() {
    return hasExtensionValue() && Extend.$MsSUPLREPORT == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isMsSUPLREPORT}.
   */
  @SuppressWarnings("unchecked")
  public Ver2_SUPLREPORT getExtensionMsSUPLREPORT() {
    if (!isExtensionMsSUPLREPORT()) {
      throw new IllegalStateException("UlpMessage value not a MsSUPLREPORT");
    }
    return (Ver2_SUPLREPORT) element;
  }

  public void setExtensionMsSUPLREPORT(Ver2_SUPLREPORT selected) {
    selection = Extend.$MsSUPLREPORT;
    extension = true;
    element = selected;
  }

  public void setExtensionMsSUPLREPORTToNewInstance() {
      Ver2_SUPLREPORT element = new Ver2_SUPLREPORT();
      setExtensionMsSUPLREPORT(element);
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
    return "UlpMessage = " + elementIndentedString(indent) + indent + ";\n";
  }
}
