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

package com.google.location.suplclient.asn1.supl2.lpp_ver12;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.google.location.suplclient.asn1.base.Asn1Choice;
import com.google.location.suplclient.asn1.base.Asn1Null;
import com.google.location.suplclient.asn1.base.Asn1Object;
import com.google.location.suplclient.asn1.base.Asn1Sequence;
import com.google.location.suplclient.asn1.base.Asn1Tag;
import com.google.location.suplclient.asn1.base.BitStream;
import com.google.location.suplclient.asn1.base.BitStreamReader;
import com.google.location.suplclient.asn1.base.ChoiceComponent;
import com.google.location.suplclient.asn1.base.SequenceComponent;
import com.google.location.suplclient.asn1.supl2.lpp.Abort;
import com.google.location.suplclient.asn1.supl2.lpp.Error;
import com.google.location.suplclient.asn1.supl2.lpp.ProvideCapabilities;
import com.google.location.suplclient.asn1.supl2.lpp.ProvideLocationInformation;
import com.google.location.suplclient.asn1.supl2.lpp.RequestAssistanceData;
import com.google.location.suplclient.asn1.supl2.lpp.RequestCapabilities;
import com.google.location.suplclient.asn1.supl2.lpp.RequestLocationInformation;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;


/**
 * 
 */
public  class LPP_MessageBody extends Asn1Choice {
  //

  private static final Asn1Tag TAG_LPP_MessageBody
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
            "LPP_MessageBody: " + tag + " maps to both " + select0 + " and " + select);
        }
      }
    }
  }

  public LPP_MessageBody() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_LPP_MessageBody;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_LPP_MessageBody != null) {
      return ImmutableList.of(TAG_LPP_MessageBody);
    } else {
      return tagToSelection.keySet();
    }
  }

  /**
   * Creates a new LPP_MessageBody from encoded stream.
   */
  public static LPP_MessageBody fromPerUnaligned(byte[] encodedBytes) {
    LPP_MessageBody result = new LPP_MessageBody();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new LPP_MessageBody from encoded stream.
   */
  public static LPP_MessageBody fromPerAligned(byte[] encodedBytes) {
    LPP_MessageBody result = new LPP_MessageBody();
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
    
    $C1(Asn1Tag.fromClassAndNumber(2, 0),
        true) {
      @Override
      public Asn1Object createElement() {
        return new LPP_MessageBody.c1Type();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? LPP_MessageBody.c1Type.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $MessageClassExtension(Asn1Tag.fromClassAndNumber(2, 1),
        true) {
      @Override
      public Asn1Object createElement() {
        return new LPP_MessageBody.messageClassExtensionType();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? LPP_MessageBody.messageClassExtensionType.getPossibleFirstTags() : ImmutableList.of(tag);
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
public static class c1Type extends Asn1Choice {
  //

  private static final Asn1Tag TAG_c1Type
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
            "c1Type: " + tag + " maps to both " + select0 + " and " + select);
        }
      }
    }
  }

  public c1Type() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_c1Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_c1Type != null) {
      return ImmutableList.of(TAG_c1Type);
    } else {
      return tagToSelection.keySet();
    }
  }

  /**
   * Creates a new c1Type from encoded stream.
   */
  public static c1Type fromPerUnaligned(byte[] encodedBytes) {
    c1Type result = new c1Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new c1Type from encoded stream.
   */
  public static c1Type fromPerAligned(byte[] encodedBytes) {
    c1Type result = new c1Type();
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
    
    $RequestCapabilities(Asn1Tag.fromClassAndNumber(2, 0),
        true) {
      @Override
      public Asn1Object createElement() {
        return new RequestCapabilities();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? RequestCapabilities.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $ProvideCapabilities(Asn1Tag.fromClassAndNumber(2, 1),
        true) {
      @Override
      public Asn1Object createElement() {
        return new ProvideCapabilities();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? ProvideCapabilities.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $RequestAssistanceData(Asn1Tag.fromClassAndNumber(2, 2),
        true) {
      @Override
      public Asn1Object createElement() {
        return new RequestAssistanceData();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? RequestAssistanceData.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $ProvideAssistanceData(Asn1Tag.fromClassAndNumber(2, 3),
        true) {
      @Override
      public Asn1Object createElement() {
        return new ProvideAssistanceData();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? ProvideAssistanceData.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $RequestLocationInformation(Asn1Tag.fromClassAndNumber(2, 4),
        true) {
      @Override
      public Asn1Object createElement() {
        return new RequestLocationInformation();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? RequestLocationInformation.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $ProvideLocationInformation(Asn1Tag.fromClassAndNumber(2, 5),
        true) {
      @Override
      public Asn1Object createElement() {
        return new ProvideLocationInformation();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? ProvideLocationInformation.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $Abort(Asn1Tag.fromClassAndNumber(2, 6),
        true) {
      @Override
      public Asn1Object createElement() {
        return new Abort();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? Abort.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $Error(Asn1Tag.fromClassAndNumber(2, 7),
        true) {
      @Override
      public Asn1Object createElement() {
        return new Error();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? Error.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $Spare7(Asn1Tag.fromClassAndNumber(2, 8),
        true) {
      @Override
      public Asn1Object createElement() {
        return new c1Type.spare7Type();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? c1Type.spare7Type.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $Spare6(Asn1Tag.fromClassAndNumber(2, 9),
        true) {
      @Override
      public Asn1Object createElement() {
        return new c1Type.spare6Type();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? c1Type.spare6Type.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $Spare5(Asn1Tag.fromClassAndNumber(2, 10),
        true) {
      @Override
      public Asn1Object createElement() {
        return new c1Type.spare5Type();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? c1Type.spare5Type.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $Spare4(Asn1Tag.fromClassAndNumber(2, 11),
        true) {
      @Override
      public Asn1Object createElement() {
        return new c1Type.spare4Type();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? c1Type.spare4Type.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $Spare3(Asn1Tag.fromClassAndNumber(2, 12),
        true) {
      @Override
      public Asn1Object createElement() {
        return new c1Type.spare3Type();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? c1Type.spare3Type.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $Spare2(Asn1Tag.fromClassAndNumber(2, 13),
        true) {
      @Override
      public Asn1Object createElement() {
        return new c1Type.spare2Type();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? c1Type.spare2Type.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $Spare1(Asn1Tag.fromClassAndNumber(2, 14),
        true) {
      @Override
      public Asn1Object createElement() {
        return new c1Type.spare1Type();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? c1Type.spare1Type.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $Spare0(Asn1Tag.fromClassAndNumber(2, 15),
        true) {
      @Override
      public Asn1Object createElement() {
        return new c1Type.spare0Type();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? c1Type.spare0Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
  
  

  public boolean isRequestCapabilities() {
    return !hasExtensionValue() && Select.$RequestCapabilities == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isRequestCapabilities}.
   */
  @SuppressWarnings("unchecked")
  public RequestCapabilities getRequestCapabilities() {
    if (!isRequestCapabilities()) {
      throw new IllegalStateException("c1Type value not a RequestCapabilities");
    }
    return (RequestCapabilities) element;
  }

  public void setRequestCapabilities(RequestCapabilities selected) {
    selection = Select.$RequestCapabilities;
    extension = false;
    element = selected;
  }

  public RequestCapabilities setRequestCapabilitiesToNewInstance() {
      RequestCapabilities element = new RequestCapabilities();
      setRequestCapabilities(element);
      return element;
  }
  
  

  public boolean isProvideCapabilities() {
    return !hasExtensionValue() && Select.$ProvideCapabilities == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isProvideCapabilities}.
   */
  @SuppressWarnings("unchecked")
  public ProvideCapabilities getProvideCapabilities() {
    if (!isProvideCapabilities()) {
      throw new IllegalStateException("c1Type value not a ProvideCapabilities");
    }
    return (ProvideCapabilities) element;
  }

  public void setProvideCapabilities(ProvideCapabilities selected) {
    selection = Select.$ProvideCapabilities;
    extension = false;
    element = selected;
  }

  public ProvideCapabilities setProvideCapabilitiesToNewInstance() {
      ProvideCapabilities element = new ProvideCapabilities();
      setProvideCapabilities(element);
      return element;
  }
  
  

  public boolean isRequestAssistanceData() {
    return !hasExtensionValue() && Select.$RequestAssistanceData == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isRequestAssistanceData}.
   */
  @SuppressWarnings("unchecked")
  public RequestAssistanceData getRequestAssistanceData() {
    if (!isRequestAssistanceData()) {
      throw new IllegalStateException("c1Type value not a RequestAssistanceData");
    }
    return (RequestAssistanceData) element;
  }

  public void setRequestAssistanceData(RequestAssistanceData selected) {
    selection = Select.$RequestAssistanceData;
    extension = false;
    element = selected;
  }

  public RequestAssistanceData setRequestAssistanceDataToNewInstance() {
      RequestAssistanceData element = new RequestAssistanceData();
      setRequestAssistanceData(element);
      return element;
  }
  
  

  public boolean isProvideAssistanceData() {
    return !hasExtensionValue() && Select.$ProvideAssistanceData == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isProvideAssistanceData}.
   */
  @SuppressWarnings("unchecked")
  public ProvideAssistanceData getProvideAssistanceData() {
    if (!isProvideAssistanceData()) {
      throw new IllegalStateException("c1Type value not a ProvideAssistanceData");
    }
    return (ProvideAssistanceData) element;
  }

  public void setProvideAssistanceData(ProvideAssistanceData selected) {
    selection = Select.$ProvideAssistanceData;
    extension = false;
    element = selected;
  }

  public ProvideAssistanceData setProvideAssistanceDataToNewInstance() {
      ProvideAssistanceData element = new ProvideAssistanceData();
      setProvideAssistanceData(element);
      return element;
  }
  
  

  public boolean isRequestLocationInformation() {
    return !hasExtensionValue() && Select.$RequestLocationInformation == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isRequestLocationInformation}.
   */
  @SuppressWarnings("unchecked")
  public RequestLocationInformation getRequestLocationInformation() {
    if (!isRequestLocationInformation()) {
      throw new IllegalStateException("c1Type value not a RequestLocationInformation");
    }
    return (RequestLocationInformation) element;
  }

  public void setRequestLocationInformation(RequestLocationInformation selected) {
    selection = Select.$RequestLocationInformation;
    extension = false;
    element = selected;
  }

  public RequestLocationInformation setRequestLocationInformationToNewInstance() {
      RequestLocationInformation element = new RequestLocationInformation();
      setRequestLocationInformation(element);
      return element;
  }
  
  

  public boolean isProvideLocationInformation() {
    return !hasExtensionValue() && Select.$ProvideLocationInformation == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isProvideLocationInformation}.
   */
  @SuppressWarnings("unchecked")
  public ProvideLocationInformation getProvideLocationInformation() {
    if (!isProvideLocationInformation()) {
      throw new IllegalStateException("c1Type value not a ProvideLocationInformation");
    }
    return (ProvideLocationInformation) element;
  }

  public void setProvideLocationInformation(ProvideLocationInformation selected) {
    selection = Select.$ProvideLocationInformation;
    extension = false;
    element = selected;
  }

  public ProvideLocationInformation setProvideLocationInformationToNewInstance() {
      ProvideLocationInformation element = new ProvideLocationInformation();
      setProvideLocationInformation(element);
      return element;
  }
  
  

  public boolean isAbort() {
    return !hasExtensionValue() && Select.$Abort == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isAbort}.
   */
  @SuppressWarnings("unchecked")
  public Abort getAbort() {
    if (!isAbort()) {
      throw new IllegalStateException("c1Type value not a Abort");
    }
    return (Abort) element;
  }

  public void setAbort(Abort selected) {
    selection = Select.$Abort;
    extension = false;
    element = selected;
  }

  public Abort setAbortToNewInstance() {
      Abort element = new Abort();
      setAbort(element);
      return element;
  }
  
  

  public boolean isError() {
    return !hasExtensionValue() && Select.$Error == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isError}.
   */
  @SuppressWarnings("unchecked")
  public Error getError() {
    if (!isError()) {
      throw new IllegalStateException("c1Type value not a Error");
    }
    return (Error) element;
  }

  public void setError(Error selected) {
    selection = Select.$Error;
    extension = false;
    element = selected;
  }

  public Error setErrorToNewInstance() {
      Error element = new Error();
      setError(element);
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
public static class spare7Type extends Asn1Null {
  //

  private static final Asn1Tag TAG_spare7Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public spare7Type() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_spare7Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_spare7Type != null) {
      return ImmutableList.of(TAG_spare7Type);
    } else {
      return Asn1Null.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new spare7Type from encoded stream.
   */
  public static spare7Type fromPerUnaligned(byte[] encodedBytes) {
    spare7Type result = new spare7Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new spare7Type from encoded stream.
   */
  public static spare7Type fromPerAligned(byte[] encodedBytes) {
    spare7Type result = new spare7Type();
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
    return "spare7Type (null value);\n";
  }
}


  public boolean isSpare7() {
    return !hasExtensionValue() && Select.$Spare7 == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isSpare7}.
   */
  @SuppressWarnings("unchecked")
  public c1Type.spare7Type getSpare7() {
    if (!isSpare7()) {
      throw new IllegalStateException("c1Type value not a Spare7");
    }
    return (c1Type.spare7Type) element;
  }

  public void setSpare7(c1Type.spare7Type selected) {
    selection = Select.$Spare7;
    extension = false;
    element = selected;
  }

  public c1Type.spare7Type setSpare7ToNewInstance() {
      c1Type.spare7Type element = new c1Type.spare7Type();
      setSpare7(element);
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
public static class spare6Type extends Asn1Null {
  //

  private static final Asn1Tag TAG_spare6Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public spare6Type() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_spare6Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_spare6Type != null) {
      return ImmutableList.of(TAG_spare6Type);
    } else {
      return Asn1Null.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new spare6Type from encoded stream.
   */
  public static spare6Type fromPerUnaligned(byte[] encodedBytes) {
    spare6Type result = new spare6Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new spare6Type from encoded stream.
   */
  public static spare6Type fromPerAligned(byte[] encodedBytes) {
    spare6Type result = new spare6Type();
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
    return "spare6Type (null value);\n";
  }
}


  public boolean isSpare6() {
    return !hasExtensionValue() && Select.$Spare6 == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isSpare6}.
   */
  @SuppressWarnings("unchecked")
  public c1Type.spare6Type getSpare6() {
    if (!isSpare6()) {
      throw new IllegalStateException("c1Type value not a Spare6");
    }
    return (c1Type.spare6Type) element;
  }

  public void setSpare6(c1Type.spare6Type selected) {
    selection = Select.$Spare6;
    extension = false;
    element = selected;
  }

  public c1Type.spare6Type setSpare6ToNewInstance() {
      c1Type.spare6Type element = new c1Type.spare6Type();
      setSpare6(element);
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
public static class spare5Type extends Asn1Null {
  //

  private static final Asn1Tag TAG_spare5Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public spare5Type() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_spare5Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_spare5Type != null) {
      return ImmutableList.of(TAG_spare5Type);
    } else {
      return Asn1Null.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new spare5Type from encoded stream.
   */
  public static spare5Type fromPerUnaligned(byte[] encodedBytes) {
    spare5Type result = new spare5Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new spare5Type from encoded stream.
   */
  public static spare5Type fromPerAligned(byte[] encodedBytes) {
    spare5Type result = new spare5Type();
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
    return "spare5Type (null value);\n";
  }
}


  public boolean isSpare5() {
    return !hasExtensionValue() && Select.$Spare5 == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isSpare5}.
   */
  @SuppressWarnings("unchecked")
  public c1Type.spare5Type getSpare5() {
    if (!isSpare5()) {
      throw new IllegalStateException("c1Type value not a Spare5");
    }
    return (c1Type.spare5Type) element;
  }

  public void setSpare5(c1Type.spare5Type selected) {
    selection = Select.$Spare5;
    extension = false;
    element = selected;
  }

  public c1Type.spare5Type setSpare5ToNewInstance() {
      c1Type.spare5Type element = new c1Type.spare5Type();
      setSpare5(element);
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
public static class spare4Type extends Asn1Null {
  //

  private static final Asn1Tag TAG_spare4Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public spare4Type() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_spare4Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_spare4Type != null) {
      return ImmutableList.of(TAG_spare4Type);
    } else {
      return Asn1Null.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new spare4Type from encoded stream.
   */
  public static spare4Type fromPerUnaligned(byte[] encodedBytes) {
    spare4Type result = new spare4Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new spare4Type from encoded stream.
   */
  public static spare4Type fromPerAligned(byte[] encodedBytes) {
    spare4Type result = new spare4Type();
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
    return "spare4Type (null value);\n";
  }
}


  public boolean isSpare4() {
    return !hasExtensionValue() && Select.$Spare4 == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isSpare4}.
   */
  @SuppressWarnings("unchecked")
  public c1Type.spare4Type getSpare4() {
    if (!isSpare4()) {
      throw new IllegalStateException("c1Type value not a Spare4");
    }
    return (c1Type.spare4Type) element;
  }

  public void setSpare4(c1Type.spare4Type selected) {
    selection = Select.$Spare4;
    extension = false;
    element = selected;
  }

  public c1Type.spare4Type setSpare4ToNewInstance() {
      c1Type.spare4Type element = new c1Type.spare4Type();
      setSpare4(element);
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
public static class spare3Type extends Asn1Null {
  //

  private static final Asn1Tag TAG_spare3Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public spare3Type() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_spare3Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_spare3Type != null) {
      return ImmutableList.of(TAG_spare3Type);
    } else {
      return Asn1Null.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new spare3Type from encoded stream.
   */
  public static spare3Type fromPerUnaligned(byte[] encodedBytes) {
    spare3Type result = new spare3Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new spare3Type from encoded stream.
   */
  public static spare3Type fromPerAligned(byte[] encodedBytes) {
    spare3Type result = new spare3Type();
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
    return "spare3Type (null value);\n";
  }
}


  public boolean isSpare3() {
    return !hasExtensionValue() && Select.$Spare3 == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isSpare3}.
   */
  @SuppressWarnings("unchecked")
  public c1Type.spare3Type getSpare3() {
    if (!isSpare3()) {
      throw new IllegalStateException("c1Type value not a Spare3");
    }
    return (c1Type.spare3Type) element;
  }

  public void setSpare3(c1Type.spare3Type selected) {
    selection = Select.$Spare3;
    extension = false;
    element = selected;
  }

  public c1Type.spare3Type setSpare3ToNewInstance() {
      c1Type.spare3Type element = new c1Type.spare3Type();
      setSpare3(element);
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
public static class spare2Type extends Asn1Null {
  //

  private static final Asn1Tag TAG_spare2Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public spare2Type() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_spare2Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_spare2Type != null) {
      return ImmutableList.of(TAG_spare2Type);
    } else {
      return Asn1Null.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new spare2Type from encoded stream.
   */
  public static spare2Type fromPerUnaligned(byte[] encodedBytes) {
    spare2Type result = new spare2Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new spare2Type from encoded stream.
   */
  public static spare2Type fromPerAligned(byte[] encodedBytes) {
    spare2Type result = new spare2Type();
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
    return "spare2Type (null value);\n";
  }
}


  public boolean isSpare2() {
    return !hasExtensionValue() && Select.$Spare2 == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isSpare2}.
   */
  @SuppressWarnings("unchecked")
  public c1Type.spare2Type getSpare2() {
    if (!isSpare2()) {
      throw new IllegalStateException("c1Type value not a Spare2");
    }
    return (c1Type.spare2Type) element;
  }

  public void setSpare2(c1Type.spare2Type selected) {
    selection = Select.$Spare2;
    extension = false;
    element = selected;
  }

  public c1Type.spare2Type setSpare2ToNewInstance() {
      c1Type.spare2Type element = new c1Type.spare2Type();
      setSpare2(element);
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
public static class spare1Type extends Asn1Null {
  //

  private static final Asn1Tag TAG_spare1Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public spare1Type() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_spare1Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_spare1Type != null) {
      return ImmutableList.of(TAG_spare1Type);
    } else {
      return Asn1Null.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new spare1Type from encoded stream.
   */
  public static spare1Type fromPerUnaligned(byte[] encodedBytes) {
    spare1Type result = new spare1Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new spare1Type from encoded stream.
   */
  public static spare1Type fromPerAligned(byte[] encodedBytes) {
    spare1Type result = new spare1Type();
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
    return "spare1Type (null value);\n";
  }
}


  public boolean isSpare1() {
    return !hasExtensionValue() && Select.$Spare1 == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isSpare1}.
   */
  @SuppressWarnings("unchecked")
  public c1Type.spare1Type getSpare1() {
    if (!isSpare1()) {
      throw new IllegalStateException("c1Type value not a Spare1");
    }
    return (c1Type.spare1Type) element;
  }

  public void setSpare1(c1Type.spare1Type selected) {
    selection = Select.$Spare1;
    extension = false;
    element = selected;
  }

  public c1Type.spare1Type setSpare1ToNewInstance() {
      c1Type.spare1Type element = new c1Type.spare1Type();
      setSpare1(element);
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
public static class spare0Type extends Asn1Null {
  //

  private static final Asn1Tag TAG_spare0Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public spare0Type() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_spare0Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_spare0Type != null) {
      return ImmutableList.of(TAG_spare0Type);
    } else {
      return Asn1Null.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new spare0Type from encoded stream.
   */
  public static spare0Type fromPerUnaligned(byte[] encodedBytes) {
    spare0Type result = new spare0Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new spare0Type from encoded stream.
   */
  public static spare0Type fromPerAligned(byte[] encodedBytes) {
    spare0Type result = new spare0Type();
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
    return "spare0Type (null value);\n";
  }
}


  public boolean isSpare0() {
    return !hasExtensionValue() && Select.$Spare0 == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isSpare0}.
   */
  @SuppressWarnings("unchecked")
  public c1Type.spare0Type getSpare0() {
    if (!isSpare0()) {
      throw new IllegalStateException("c1Type value not a Spare0");
    }
    return (c1Type.spare0Type) element;
  }

  public void setSpare0(c1Type.spare0Type selected) {
    selection = Select.$Spare0;
    extension = false;
    element = selected;
  }

  public c1Type.spare0Type setSpare0ToNewInstance() {
      c1Type.spare0Type element = new c1Type.spare0Type();
      setSpare0(element);
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
    return "c1Type = " + elementIndentedString(indent) + indent + ";\n";
  }
}


  public boolean isC1() {
    return !hasExtensionValue() && Select.$C1 == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isC1}.
   */
  @SuppressWarnings("unchecked")
  public LPP_MessageBody.c1Type getC1() {
    if (!isC1()) {
      throw new IllegalStateException("LPP_MessageBody value not a C1");
    }
    return (LPP_MessageBody.c1Type) element;
  }

  public void setC1(LPP_MessageBody.c1Type selected) {
    selection = Select.$C1;
    extension = false;
    element = selected;
  }

  public LPP_MessageBody.c1Type setC1ToNewInstance() {
      LPP_MessageBody.c1Type element = new LPP_MessageBody.c1Type();
      setC1(element);
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
public static class messageClassExtensionType extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_messageClassExtensionType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public messageClassExtensionType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_messageClassExtensionType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_messageClassExtensionType != null) {
      return ImmutableList.of(TAG_messageClassExtensionType);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new messageClassExtensionType from encoded stream.
   */
  public static messageClassExtensionType fromPerUnaligned(byte[] encodedBytes) {
    messageClassExtensionType result = new messageClassExtensionType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new messageClassExtensionType from encoded stream.
   */
  public static messageClassExtensionType fromPerAligned(byte[] encodedBytes) {
    messageClassExtensionType result = new messageClassExtensionType();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }



  @Override protected boolean isExtensible() {
    return false;
  }

  @Override public boolean containsExtensionValues() {
    for (SequenceComponent extensionComponent : getExtensionComponents()) {
      if (extensionComponent.isExplicitlySet()) return true;
    }
    return false;
  }

  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      return builder.build();
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
    StringBuilder builder = new StringBuilder();
    builder.append("messageClassExtensionType = {\n");
    final String internalIndent = indent + "  ";
    for (SequenceComponent component : getComponents()) {
      if (component.isExplicitlySet()) {
        builder.append(internalIndent)
            .append(component.toIndentedString(internalIndent));
      }
    }
    if (isExtensible()) {
      builder.append(internalIndent).append("...\n");
      for (SequenceComponent component : getExtensionComponents()) {
        if (component.isExplicitlySet()) {
          builder.append(internalIndent)
              .append(component.toIndentedString(internalIndent));
        }
      }
    }
    builder.append(indent).append("};\n");
    return builder.toString();
  }
}


  public boolean isMessageClassExtension() {
    return !hasExtensionValue() && Select.$MessageClassExtension == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isMessageClassExtension}.
   */
  @SuppressWarnings("unchecked")
  public LPP_MessageBody.messageClassExtensionType getMessageClassExtension() {
    if (!isMessageClassExtension()) {
      throw new IllegalStateException("LPP_MessageBody value not a MessageClassExtension");
    }
    return (LPP_MessageBody.messageClassExtensionType) element;
  }

  public void setMessageClassExtension(LPP_MessageBody.messageClassExtensionType selected) {
    selection = Select.$MessageClassExtension;
    extension = false;
    element = selected;
  }

  public LPP_MessageBody.messageClassExtensionType setMessageClassExtensionToNewInstance() {
      LPP_MessageBody.messageClassExtensionType element = new LPP_MessageBody.messageClassExtensionType();
      setMessageClassExtension(element);
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
    return "LPP_MessageBody = " + elementIndentedString(indent) + indent + ";\n";
  }
}
