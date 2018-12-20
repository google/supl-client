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

package com.google.location.suplclient.asn1.supl2.lpp;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.google.location.suplclient.asn1.base.Asn1BitString;
import com.google.location.suplclient.asn1.base.Asn1Choice;
import com.google.location.suplclient.asn1.base.Asn1Enumerated;
import com.google.location.suplclient.asn1.base.Asn1Integer;
import com.google.location.suplclient.asn1.base.Asn1Object;
import com.google.location.suplclient.asn1.base.Asn1Sequence;
import com.google.location.suplclient.asn1.base.Asn1Tag;
import com.google.location.suplclient.asn1.base.BitStream;
import com.google.location.suplclient.asn1.base.BitStreamReader;
import com.google.location.suplclient.asn1.base.ChoiceComponent;
import com.google.location.suplclient.asn1.base.SequenceComponent;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;


/**
* 
*/
public  class PRS_Info extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_PRS_Info
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public PRS_Info() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_PRS_Info;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_PRS_Info != null) {
      return ImmutableList.of(TAG_PRS_Info);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new PRS_Info from encoded stream.
   */
  public static PRS_Info fromPerUnaligned(byte[] encodedBytes) {
    PRS_Info result = new PRS_Info();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new PRS_Info from encoded stream.
   */
  public static PRS_Info fromPerAligned(byte[] encodedBytes) {
    PRS_Info result = new PRS_Info();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }



  @Override protected boolean isExtensible() {
    return true;
  }

  @Override public boolean containsExtensionValues() {
    for (SequenceComponent extensionComponent : getExtensionComponents()) {
      if (extensionComponent.isExplicitlySet()) return true;
    }
    return false;
  }

  
  private PRS_Info.prs_BandwidthType prs_Bandwidth_;
  public PRS_Info.prs_BandwidthType getPrs_Bandwidth() {
    return prs_Bandwidth_;
  }
  /**
   * @throws ClassCastException if value is not a PRS_Info.prs_BandwidthType
   */
  public void setPrs_Bandwidth(Asn1Object value) {
    this.prs_Bandwidth_ = (PRS_Info.prs_BandwidthType) value;
  }
  public PRS_Info.prs_BandwidthType setPrs_BandwidthToNewInstance() {
    prs_Bandwidth_ = new PRS_Info.prs_BandwidthType();
    return prs_Bandwidth_;
  }
  
  private PRS_Info.prs_ConfigurationIndexType prs_ConfigurationIndex_;
  public PRS_Info.prs_ConfigurationIndexType getPrs_ConfigurationIndex() {
    return prs_ConfigurationIndex_;
  }
  /**
   * @throws ClassCastException if value is not a PRS_Info.prs_ConfigurationIndexType
   */
  public void setPrs_ConfigurationIndex(Asn1Object value) {
    this.prs_ConfigurationIndex_ = (PRS_Info.prs_ConfigurationIndexType) value;
  }
  public PRS_Info.prs_ConfigurationIndexType setPrs_ConfigurationIndexToNewInstance() {
    prs_ConfigurationIndex_ = new PRS_Info.prs_ConfigurationIndexType();
    return prs_ConfigurationIndex_;
  }
  
  private PRS_Info.numDL_FramesType numDL_Frames_;
  public PRS_Info.numDL_FramesType getNumDL_Frames() {
    return numDL_Frames_;
  }
  /**
   * @throws ClassCastException if value is not a PRS_Info.numDL_FramesType
   */
  public void setNumDL_Frames(Asn1Object value) {
    this.numDL_Frames_ = (PRS_Info.numDL_FramesType) value;
  }
  public PRS_Info.numDL_FramesType setNumDL_FramesToNewInstance() {
    numDL_Frames_ = new PRS_Info.numDL_FramesType();
    return numDL_Frames_;
  }
  

  
  private PRS_Info.prs_MutingInfo_r9Type  extensionPrs_MutingInfo_r9;
  public PRS_Info.prs_MutingInfo_r9Type getExtensionPrs_MutingInfo_r9() {
    return extensionPrs_MutingInfo_r9;
  }
  /**
   * @throws ClassCastException if value is not a PRS_Info.prs_MutingInfo_r9Type
   */
  public void setExtensionPrs_MutingInfo_r9(Asn1Object value) {
    extensionPrs_MutingInfo_r9 = (PRS_Info.prs_MutingInfo_r9Type) value;
  }
  public void setExtensionPrs_MutingInfo_r9ToNewInstance() {
    extensionPrs_MutingInfo_r9 = new PRS_Info.prs_MutingInfo_r9Type();
  }
    

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getPrs_Bandwidth() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getPrs_Bandwidth();
          }

          @Override public void setToNewInstance() {
            setPrs_BandwidthToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? PRS_Info.prs_BandwidthType.getPossibleFirstTags() : ImmutableList.of(tag);
          }

          @Override
          public Asn1Tag getTag() {
            return tag;
          }

          @Override
          public boolean isImplicitTagging() {
            return true;
          }

          @Override public String toIndentedString(String indent) {
                return "prs_Bandwidth : "
                    + getPrs_Bandwidth().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getPrs_ConfigurationIndex() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getPrs_ConfigurationIndex();
          }

          @Override public void setToNewInstance() {
            setPrs_ConfigurationIndexToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? PRS_Info.prs_ConfigurationIndexType.getPossibleFirstTags() : ImmutableList.of(tag);
          }

          @Override
          public Asn1Tag getTag() {
            return tag;
          }

          @Override
          public boolean isImplicitTagging() {
            return true;
          }

          @Override public String toIndentedString(String indent) {
                return "prs_ConfigurationIndex : "
                    + getPrs_ConfigurationIndex().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getNumDL_Frames() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getNumDL_Frames();
          }

          @Override public void setToNewInstance() {
            setNumDL_FramesToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? PRS_Info.numDL_FramesType.getPossibleFirstTags() : ImmutableList.of(tag);
          }

          @Override
          public Asn1Tag getTag() {
            return tag;
          }

          @Override
          public boolean isImplicitTagging() {
            return true;
          }

          @Override public String toIndentedString(String indent) {
                return "numDL_Frames : "
                    + getNumDL_Frames().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      builder.add(new SequenceComponent() {
            @Override public boolean isExplicitlySet() {
              return getExtensionPrs_MutingInfo_r9() != null;
            }

            @Override public boolean hasDefaultValue() {
              return false;
            }

            @Override public boolean isOptional() {
              return true;
            }

            @Override public Asn1Object getComponentValue() {
              return getExtensionPrs_MutingInfo_r9();
            }

            @Override public void setToNewInstance() {
              setExtensionPrs_MutingInfo_r9ToNewInstance();
            }

            @Override public Collection<Asn1Tag> getPossibleFirstTags() {
              throw new UnsupportedOperationException(
                  "BER decoding not supported for extension elements");
            }

            @Override
            public Asn1Tag getTag() {
              throw new UnsupportedOperationException(
                  "BER is not supported for extension elements");
            }

            @Override
            public boolean isImplicitTagging() {
              throw new UnsupportedOperationException(
                  "BER is not supported for extension elements");
            }

            @Override public String toIndentedString(String indent) {
              return "prs_MutingInfo_r9 : "
                  + getExtensionPrs_MutingInfo_r9().toIndentedString(indent);
            }
      });
      
      return builder.build();
    }

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class prs_BandwidthType extends Asn1Enumerated {
  public enum Value implements Asn1Enumerated.Value {
    n6(0),
    n15(1),
    n25(2),
    n50(3),
    n75(4),
    n100(5),
    ;

    Value(int i) {
      value = i;
    }

    private int value;
    public int getAssignedValue() {
      return value;
    }

    @Override public boolean isExtensionValue() {
      return false;
    }
  }

  @Override
  protected Value getDefaultValue() {
    return null
;
  }

  @SuppressWarnings("unchecked")
  public Value enumValue() {
    return (Value) getValue();
  }


  
  public void setTo_n6() {
    setValue(Value.n6);
  }
  
  public void setTo_n15() {
    setValue(Value.n15);
  }
  
  public void setTo_n25() {
    setValue(Value.n25);
  }
  
  public void setTo_n50() {
    setValue(Value.n50);
  }
  
  public void setTo_n75() {
    setValue(Value.n75);
  }
  
  public void setTo_n100() {
    setValue(Value.n100);
  }
  


  public enum ExtensionValue implements Asn1Enumerated.Value {
    ;

    ExtensionValue(int i) {
      value = i;
    }

    private int value;
    @Override public int getAssignedValue() {
      return value;
    }

    @Override public boolean isExtensionValue() {
      return true;
    }
  }

  @SuppressWarnings("unchecked")
  public ExtensionValue extEnumValue() {
    return (ExtensionValue) getValue();
  }

  

  

  private static final Asn1Tag TAG_prs_BandwidthType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public prs_BandwidthType() {
    super();
    // use template substitution instead of calling getDefaultValue(), since
    // calling virtual methods from a ctor is frowned upon here.
    setValue(null
);
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_prs_BandwidthType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_prs_BandwidthType != null) {
      return ImmutableList.of(TAG_prs_BandwidthType);
    } else {
      return Asn1Enumerated.getPossibleFirstTags();
    }
  }

  @Override protected boolean isExtensible() {
    return true;
  }

  @Override protected Asn1Enumerated.Value lookupValue(int ordinal) {
    return Value.values()[ordinal];
  }

  @Override protected Asn1Enumerated.Value lookupExtensionValue(int ordinal) {
    return ExtensionValue.values()[ordinal];
  }

  @Override protected int getValueCount() {
    return Value.values().length;
  }

  /**
   * Creates a new prs_BandwidthType from encoded stream.
   */
  public static prs_BandwidthType fromPerUnaligned(byte[] encodedBytes) {
    prs_BandwidthType result = new prs_BandwidthType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new prs_BandwidthType from encoded stream.
   */
  public static prs_BandwidthType fromPerAligned(byte[] encodedBytes) {
    prs_BandwidthType result = new prs_BandwidthType();
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
    return "prs_BandwidthType = " + getValue() + ";\n";
  }
}

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class prs_ConfigurationIndexType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_prs_ConfigurationIndexType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public prs_ConfigurationIndexType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("4095"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_prs_ConfigurationIndexType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_prs_ConfigurationIndexType != null) {
      return ImmutableList.of(TAG_prs_ConfigurationIndexType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new prs_ConfigurationIndexType from encoded stream.
   */
  public static prs_ConfigurationIndexType fromPerUnaligned(byte[] encodedBytes) {
    prs_ConfigurationIndexType result = new prs_ConfigurationIndexType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new prs_ConfigurationIndexType from encoded stream.
   */
  public static prs_ConfigurationIndexType fromPerAligned(byte[] encodedBytes) {
    prs_ConfigurationIndexType result = new prs_ConfigurationIndexType();
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
    return "prs_ConfigurationIndexType = " + getInteger() + ";\n";
  }
}

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class numDL_FramesType extends Asn1Enumerated {
  public enum Value implements Asn1Enumerated.Value {
    sf_1(0),
    sf_2(1),
    sf_4(2),
    sf_6(3),
    ;

    Value(int i) {
      value = i;
    }

    private int value;
    public int getAssignedValue() {
      return value;
    }

    @Override public boolean isExtensionValue() {
      return false;
    }
  }

  @Override
  protected Value getDefaultValue() {
    return null
;
  }

  @SuppressWarnings("unchecked")
  public Value enumValue() {
    return (Value) getValue();
  }


  
  public void setTo_sf_1() {
    setValue(Value.sf_1);
  }
  
  public void setTo_sf_2() {
    setValue(Value.sf_2);
  }
  
  public void setTo_sf_4() {
    setValue(Value.sf_4);
  }
  
  public void setTo_sf_6() {
    setValue(Value.sf_6);
  }
  


  public enum ExtensionValue implements Asn1Enumerated.Value {
    ;

    ExtensionValue(int i) {
      value = i;
    }

    private int value;
    @Override public int getAssignedValue() {
      return value;
    }

    @Override public boolean isExtensionValue() {
      return true;
    }
  }

  @SuppressWarnings("unchecked")
  public ExtensionValue extEnumValue() {
    return (ExtensionValue) getValue();
  }

  

  

  private static final Asn1Tag TAG_numDL_FramesType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public numDL_FramesType() {
    super();
    // use template substitution instead of calling getDefaultValue(), since
    // calling virtual methods from a ctor is frowned upon here.
    setValue(null
);
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_numDL_FramesType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_numDL_FramesType != null) {
      return ImmutableList.of(TAG_numDL_FramesType);
    } else {
      return Asn1Enumerated.getPossibleFirstTags();
    }
  }

  @Override protected boolean isExtensible() {
    return true;
  }

  @Override protected Asn1Enumerated.Value lookupValue(int ordinal) {
    return Value.values()[ordinal];
  }

  @Override protected Asn1Enumerated.Value lookupExtensionValue(int ordinal) {
    return ExtensionValue.values()[ordinal];
  }

  @Override protected int getValueCount() {
    return Value.values().length;
  }

  /**
   * Creates a new numDL_FramesType from encoded stream.
   */
  public static numDL_FramesType fromPerUnaligned(byte[] encodedBytes) {
    numDL_FramesType result = new numDL_FramesType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new numDL_FramesType from encoded stream.
   */
  public static numDL_FramesType fromPerAligned(byte[] encodedBytes) {
    numDL_FramesType result = new numDL_FramesType();
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
    return "numDL_FramesType = " + getValue() + ";\n";
  }
}

  

    
    // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class prs_MutingInfo_r9Type extends Asn1Choice {
  //

  private static final Asn1Tag TAG_prs_MutingInfo_r9Type
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
            "prs_MutingInfo_r9Type: " + tag + " maps to both " + select0 + " and " + select);
        }
      }
    }
  }

  public prs_MutingInfo_r9Type() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_prs_MutingInfo_r9Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_prs_MutingInfo_r9Type != null) {
      return ImmutableList.of(TAG_prs_MutingInfo_r9Type);
    } else {
      return tagToSelection.keySet();
    }
  }

  /**
   * Creates a new prs_MutingInfo_r9Type from encoded stream.
   */
  public static prs_MutingInfo_r9Type fromPerUnaligned(byte[] encodedBytes) {
    prs_MutingInfo_r9Type result = new prs_MutingInfo_r9Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new prs_MutingInfo_r9Type from encoded stream.
   */
  public static prs_MutingInfo_r9Type fromPerAligned(byte[] encodedBytes) {
    prs_MutingInfo_r9Type result = new prs_MutingInfo_r9Type();
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
    
    $Po2_r9(Asn1Tag.fromClassAndNumber(2, 0),
        true) {
      @Override
      public Asn1Object createElement() {
        return new prs_MutingInfo_r9Type.po2_r9Type();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? prs_MutingInfo_r9Type.po2_r9Type.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $Po4_r9(Asn1Tag.fromClassAndNumber(2, 1),
        true) {
      @Override
      public Asn1Object createElement() {
        return new prs_MutingInfo_r9Type.po4_r9Type();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? prs_MutingInfo_r9Type.po4_r9Type.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $Po8_r9(Asn1Tag.fromClassAndNumber(2, 2),
        true) {
      @Override
      public Asn1Object createElement() {
        return new prs_MutingInfo_r9Type.po8_r9Type();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? prs_MutingInfo_r9Type.po8_r9Type.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $Po16_r9(Asn1Tag.fromClassAndNumber(2, 3),
        true) {
      @Override
      public Asn1Object createElement() {
        return new prs_MutingInfo_r9Type.po16_r9Type();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? prs_MutingInfo_r9Type.po16_r9Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
public static class po2_r9Type extends Asn1BitString {
  //

  // defined bit positions, if any
  

  // setters
  

  // clearers
  


  private static final Asn1Tag TAG_po2_r9Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public po2_r9Type() {
    super();
    setMinSize(2);
setMaxSize(2);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_po2_r9Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_po2_r9Type != null) {
      return ImmutableList.of(TAG_po2_r9Type);
    } else {
      return Asn1BitString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new po2_r9Type from encoded stream.
   */
  public static po2_r9Type fromPerUnaligned(byte[] encodedBytes) {
    po2_r9Type result = new po2_r9Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new po2_r9Type from encoded stream.
   */
  public static po2_r9Type fromPerAligned(byte[] encodedBytes) {
    po2_r9Type result = new po2_r9Type();
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
    return "po2_r9Type = " + getValue() + ";\n";
  }
}


  public boolean isPo2_r9() {
    return !hasExtensionValue() && Select.$Po2_r9 == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isPo2_r9}.
   */
  @SuppressWarnings("unchecked")
  public prs_MutingInfo_r9Type.po2_r9Type getPo2_r9() {
    if (!isPo2_r9()) {
      throw new IllegalStateException("prs_MutingInfo_r9Type value not a Po2_r9");
    }
    return (prs_MutingInfo_r9Type.po2_r9Type) element;
  }

  public void setPo2_r9(prs_MutingInfo_r9Type.po2_r9Type selected) {
    selection = Select.$Po2_r9;
    extension = false;
    element = selected;
  }

  public prs_MutingInfo_r9Type.po2_r9Type setPo2_r9ToNewInstance() {
      prs_MutingInfo_r9Type.po2_r9Type element = new prs_MutingInfo_r9Type.po2_r9Type();
      setPo2_r9(element);
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
public static class po4_r9Type extends Asn1BitString {
  //

  // defined bit positions, if any
  

  // setters
  

  // clearers
  


  private static final Asn1Tag TAG_po4_r9Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public po4_r9Type() {
    super();
    setMinSize(4);
setMaxSize(4);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_po4_r9Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_po4_r9Type != null) {
      return ImmutableList.of(TAG_po4_r9Type);
    } else {
      return Asn1BitString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new po4_r9Type from encoded stream.
   */
  public static po4_r9Type fromPerUnaligned(byte[] encodedBytes) {
    po4_r9Type result = new po4_r9Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new po4_r9Type from encoded stream.
   */
  public static po4_r9Type fromPerAligned(byte[] encodedBytes) {
    po4_r9Type result = new po4_r9Type();
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
    return "po4_r9Type = " + getValue() + ";\n";
  }
}


  public boolean isPo4_r9() {
    return !hasExtensionValue() && Select.$Po4_r9 == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isPo4_r9}.
   */
  @SuppressWarnings("unchecked")
  public prs_MutingInfo_r9Type.po4_r9Type getPo4_r9() {
    if (!isPo4_r9()) {
      throw new IllegalStateException("prs_MutingInfo_r9Type value not a Po4_r9");
    }
    return (prs_MutingInfo_r9Type.po4_r9Type) element;
  }

  public void setPo4_r9(prs_MutingInfo_r9Type.po4_r9Type selected) {
    selection = Select.$Po4_r9;
    extension = false;
    element = selected;
  }

  public prs_MutingInfo_r9Type.po4_r9Type setPo4_r9ToNewInstance() {
      prs_MutingInfo_r9Type.po4_r9Type element = new prs_MutingInfo_r9Type.po4_r9Type();
      setPo4_r9(element);
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
public static class po8_r9Type extends Asn1BitString {
  //

  // defined bit positions, if any
  

  // setters
  

  // clearers
  


  private static final Asn1Tag TAG_po8_r9Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public po8_r9Type() {
    super();
    setMinSize(8);
setMaxSize(8);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_po8_r9Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_po8_r9Type != null) {
      return ImmutableList.of(TAG_po8_r9Type);
    } else {
      return Asn1BitString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new po8_r9Type from encoded stream.
   */
  public static po8_r9Type fromPerUnaligned(byte[] encodedBytes) {
    po8_r9Type result = new po8_r9Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new po8_r9Type from encoded stream.
   */
  public static po8_r9Type fromPerAligned(byte[] encodedBytes) {
    po8_r9Type result = new po8_r9Type();
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
    return "po8_r9Type = " + getValue() + ";\n";
  }
}


  public boolean isPo8_r9() {
    return !hasExtensionValue() && Select.$Po8_r9 == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isPo8_r9}.
   */
  @SuppressWarnings("unchecked")
  public prs_MutingInfo_r9Type.po8_r9Type getPo8_r9() {
    if (!isPo8_r9()) {
      throw new IllegalStateException("prs_MutingInfo_r9Type value not a Po8_r9");
    }
    return (prs_MutingInfo_r9Type.po8_r9Type) element;
  }

  public void setPo8_r9(prs_MutingInfo_r9Type.po8_r9Type selected) {
    selection = Select.$Po8_r9;
    extension = false;
    element = selected;
  }

  public prs_MutingInfo_r9Type.po8_r9Type setPo8_r9ToNewInstance() {
      prs_MutingInfo_r9Type.po8_r9Type element = new prs_MutingInfo_r9Type.po8_r9Type();
      setPo8_r9(element);
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
public static class po16_r9Type extends Asn1BitString {
  //

  // defined bit positions, if any
  

  // setters
  

  // clearers
  


  private static final Asn1Tag TAG_po16_r9Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public po16_r9Type() {
    super();
    setMinSize(16);
setMaxSize(16);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_po16_r9Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_po16_r9Type != null) {
      return ImmutableList.of(TAG_po16_r9Type);
    } else {
      return Asn1BitString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new po16_r9Type from encoded stream.
   */
  public static po16_r9Type fromPerUnaligned(byte[] encodedBytes) {
    po16_r9Type result = new po16_r9Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new po16_r9Type from encoded stream.
   */
  public static po16_r9Type fromPerAligned(byte[] encodedBytes) {
    po16_r9Type result = new po16_r9Type();
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
    return "po16_r9Type = " + getValue() + ";\n";
  }
}


  public boolean isPo16_r9() {
    return !hasExtensionValue() && Select.$Po16_r9 == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isPo16_r9}.
   */
  @SuppressWarnings("unchecked")
  public prs_MutingInfo_r9Type.po16_r9Type getPo16_r9() {
    if (!isPo16_r9()) {
      throw new IllegalStateException("prs_MutingInfo_r9Type value not a Po16_r9");
    }
    return (prs_MutingInfo_r9Type.po16_r9Type) element;
  }

  public void setPo16_r9(prs_MutingInfo_r9Type.po16_r9Type selected) {
    selection = Select.$Po16_r9;
    extension = false;
    element = selected;
  }

  public prs_MutingInfo_r9Type.po16_r9Type setPo16_r9ToNewInstance() {
      prs_MutingInfo_r9Type.po16_r9Type element = new prs_MutingInfo_r9Type.po16_r9Type();
      setPo16_r9(element);
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
    return "prs_MutingInfo_r9Type = " + elementIndentedString(indent) + indent + ";\n";
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

  public String toIndentedString(String indent) {
    StringBuilder builder = new StringBuilder();
    builder.append("PRS_Info = {\n");
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
