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
public  class MeasurementReferenceTime extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_MeasurementReferenceTime
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public MeasurementReferenceTime() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_MeasurementReferenceTime;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_MeasurementReferenceTime != null) {
      return ImmutableList.of(TAG_MeasurementReferenceTime);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new MeasurementReferenceTime from encoded stream.
   */
  public static MeasurementReferenceTime fromPerUnaligned(byte[] encodedBytes) {
    MeasurementReferenceTime result = new MeasurementReferenceTime();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new MeasurementReferenceTime from encoded stream.
   */
  public static MeasurementReferenceTime fromPerAligned(byte[] encodedBytes) {
    MeasurementReferenceTime result = new MeasurementReferenceTime();
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

  
  private MeasurementReferenceTime.gnss_TOD_msecType gnss_TOD_msec_;
  public MeasurementReferenceTime.gnss_TOD_msecType getGnss_TOD_msec() {
    return gnss_TOD_msec_;
  }
  /**
   * @throws ClassCastException if value is not a MeasurementReferenceTime.gnss_TOD_msecType
   */
  public void setGnss_TOD_msec(Asn1Object value) {
    this.gnss_TOD_msec_ = (MeasurementReferenceTime.gnss_TOD_msecType) value;
  }
  public MeasurementReferenceTime.gnss_TOD_msecType setGnss_TOD_msecToNewInstance() {
    gnss_TOD_msec_ = new MeasurementReferenceTime.gnss_TOD_msecType();
    return gnss_TOD_msec_;
  }
  
  private MeasurementReferenceTime.gnss_TOD_fracType gnss_TOD_frac_;
  public MeasurementReferenceTime.gnss_TOD_fracType getGnss_TOD_frac() {
    return gnss_TOD_frac_;
  }
  /**
   * @throws ClassCastException if value is not a MeasurementReferenceTime.gnss_TOD_fracType
   */
  public void setGnss_TOD_frac(Asn1Object value) {
    this.gnss_TOD_frac_ = (MeasurementReferenceTime.gnss_TOD_fracType) value;
  }
  public MeasurementReferenceTime.gnss_TOD_fracType setGnss_TOD_fracToNewInstance() {
    gnss_TOD_frac_ = new MeasurementReferenceTime.gnss_TOD_fracType();
    return gnss_TOD_frac_;
  }
  
  private MeasurementReferenceTime.gnss_TOD_uncType gnss_TOD_unc_;
  public MeasurementReferenceTime.gnss_TOD_uncType getGnss_TOD_unc() {
    return gnss_TOD_unc_;
  }
  /**
   * @throws ClassCastException if value is not a MeasurementReferenceTime.gnss_TOD_uncType
   */
  public void setGnss_TOD_unc(Asn1Object value) {
    this.gnss_TOD_unc_ = (MeasurementReferenceTime.gnss_TOD_uncType) value;
  }
  public MeasurementReferenceTime.gnss_TOD_uncType setGnss_TOD_uncToNewInstance() {
    gnss_TOD_unc_ = new MeasurementReferenceTime.gnss_TOD_uncType();
    return gnss_TOD_unc_;
  }
  
  private GNSS_ID gnss_TimeID_;
  public GNSS_ID getGnss_TimeID() {
    return gnss_TimeID_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_ID
   */
  public void setGnss_TimeID(Asn1Object value) {
    this.gnss_TimeID_ = (GNSS_ID) value;
  }
  public GNSS_ID setGnss_TimeIDToNewInstance() {
    gnss_TimeID_ = new GNSS_ID();
    return gnss_TimeID_;
  }
  
  private MeasurementReferenceTime.networkTimeType networkTime_;
  public MeasurementReferenceTime.networkTimeType getNetworkTime() {
    return networkTime_;
  }
  /**
   * @throws ClassCastException if value is not a MeasurementReferenceTime.networkTimeType
   */
  public void setNetworkTime(Asn1Object value) {
    this.networkTime_ = (MeasurementReferenceTime.networkTimeType) value;
  }
  public MeasurementReferenceTime.networkTimeType setNetworkTimeToNewInstance() {
    networkTime_ = new MeasurementReferenceTime.networkTimeType();
    return networkTime_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getGnss_TOD_msec() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_TOD_msec();
          }

          @Override public void setToNewInstance() {
            setGnss_TOD_msecToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? MeasurementReferenceTime.gnss_TOD_msecType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_TOD_msec : "
                    + getGnss_TOD_msec().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getGnss_TOD_frac() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_TOD_frac();
          }

          @Override public void setToNewInstance() {
            setGnss_TOD_fracToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? MeasurementReferenceTime.gnss_TOD_fracType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_TOD_frac : "
                    + getGnss_TOD_frac().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getGnss_TOD_unc() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_TOD_unc();
          }

          @Override public void setToNewInstance() {
            setGnss_TOD_uncToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? MeasurementReferenceTime.gnss_TOD_uncType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_TOD_unc : "
                    + getGnss_TOD_unc().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getGnss_TimeID() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_TimeID();
          }

          @Override public void setToNewInstance() {
            setGnss_TimeIDToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_ID.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_TimeID : "
                    + getGnss_TimeID().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getNetworkTime() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getNetworkTime();
          }

          @Override public void setToNewInstance() {
            setNetworkTimeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? MeasurementReferenceTime.networkTimeType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "networkTime : "
                    + getNetworkTime().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      return builder.build();
    }

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class gnss_TOD_msecType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_gnss_TOD_msecType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gnss_TOD_msecType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("3599999"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gnss_TOD_msecType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gnss_TOD_msecType != null) {
      return ImmutableList.of(TAG_gnss_TOD_msecType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gnss_TOD_msecType from encoded stream.
   */
  public static gnss_TOD_msecType fromPerUnaligned(byte[] encodedBytes) {
    gnss_TOD_msecType result = new gnss_TOD_msecType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gnss_TOD_msecType from encoded stream.
   */
  public static gnss_TOD_msecType fromPerAligned(byte[] encodedBytes) {
    gnss_TOD_msecType result = new gnss_TOD_msecType();
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
    return "gnss_TOD_msecType = " + getInteger() + ";\n";
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
public static class gnss_TOD_fracType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_gnss_TOD_fracType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gnss_TOD_fracType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("3999"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gnss_TOD_fracType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gnss_TOD_fracType != null) {
      return ImmutableList.of(TAG_gnss_TOD_fracType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gnss_TOD_fracType from encoded stream.
   */
  public static gnss_TOD_fracType fromPerUnaligned(byte[] encodedBytes) {
    gnss_TOD_fracType result = new gnss_TOD_fracType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gnss_TOD_fracType from encoded stream.
   */
  public static gnss_TOD_fracType fromPerAligned(byte[] encodedBytes) {
    gnss_TOD_fracType result = new gnss_TOD_fracType();
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
    return "gnss_TOD_fracType = " + getInteger() + ";\n";
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
public static class gnss_TOD_uncType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_gnss_TOD_uncType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gnss_TOD_uncType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("127"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gnss_TOD_uncType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gnss_TOD_uncType != null) {
      return ImmutableList.of(TAG_gnss_TOD_uncType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gnss_TOD_uncType from encoded stream.
   */
  public static gnss_TOD_uncType fromPerUnaligned(byte[] encodedBytes) {
    gnss_TOD_uncType result = new gnss_TOD_uncType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gnss_TOD_uncType from encoded stream.
   */
  public static gnss_TOD_uncType fromPerAligned(byte[] encodedBytes) {
    gnss_TOD_uncType result = new gnss_TOD_uncType();
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
    return "gnss_TOD_uncType = " + getInteger() + ";\n";
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
public static class networkTimeType extends Asn1Choice {
  //

  private static final Asn1Tag TAG_networkTimeType
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
            "networkTimeType: " + tag + " maps to both " + select0 + " and " + select);
        }
      }
    }
  }

  public networkTimeType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_networkTimeType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_networkTimeType != null) {
      return ImmutableList.of(TAG_networkTimeType);
    } else {
      return tagToSelection.keySet();
    }
  }

  /**
   * Creates a new networkTimeType from encoded stream.
   */
  public static networkTimeType fromPerUnaligned(byte[] encodedBytes) {
    networkTimeType result = new networkTimeType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new networkTimeType from encoded stream.
   */
  public static networkTimeType fromPerAligned(byte[] encodedBytes) {
    networkTimeType result = new networkTimeType();
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
    
    $EUTRA(Asn1Tag.fromClassAndNumber(2, 0),
        true) {
      @Override
      public Asn1Object createElement() {
        return new networkTimeType.eUTRAType();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? networkTimeType.eUTRAType.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $UTRA(Asn1Tag.fromClassAndNumber(2, 1),
        true) {
      @Override
      public Asn1Object createElement() {
        return new networkTimeType.uTRAType();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? networkTimeType.uTRAType.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $GSM(Asn1Tag.fromClassAndNumber(2, 2),
        true) {
      @Override
      public Asn1Object createElement() {
        return new networkTimeType.gSMType();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? networkTimeType.gSMType.getPossibleFirstTags() : ImmutableList.of(tag);
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
public static class eUTRAType extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_eUTRAType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public eUTRAType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_eUTRAType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_eUTRAType != null) {
      return ImmutableList.of(TAG_eUTRAType);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new eUTRAType from encoded stream.
   */
  public static eUTRAType fromPerUnaligned(byte[] encodedBytes) {
    eUTRAType result = new eUTRAType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new eUTRAType from encoded stream.
   */
  public static eUTRAType fromPerAligned(byte[] encodedBytes) {
    eUTRAType result = new eUTRAType();
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

  
  private eUTRAType.physCellIdType physCellId_;
  public eUTRAType.physCellIdType getPhysCellId() {
    return physCellId_;
  }
  /**
   * @throws ClassCastException if value is not a eUTRAType.physCellIdType
   */
  public void setPhysCellId(Asn1Object value) {
    this.physCellId_ = (eUTRAType.physCellIdType) value;
  }
  public eUTRAType.physCellIdType setPhysCellIdToNewInstance() {
    physCellId_ = new eUTRAType.physCellIdType();
    return physCellId_;
  }
  
  private CellGlobalIdEUTRA_AndUTRA cellGlobalId_;
  public CellGlobalIdEUTRA_AndUTRA getCellGlobalId() {
    return cellGlobalId_;
  }
  /**
   * @throws ClassCastException if value is not a CellGlobalIdEUTRA_AndUTRA
   */
  public void setCellGlobalId(Asn1Object value) {
    this.cellGlobalId_ = (CellGlobalIdEUTRA_AndUTRA) value;
  }
  public CellGlobalIdEUTRA_AndUTRA setCellGlobalIdToNewInstance() {
    cellGlobalId_ = new CellGlobalIdEUTRA_AndUTRA();
    return cellGlobalId_;
  }
  
  private eUTRAType.systemFrameNumberType systemFrameNumber_;
  public eUTRAType.systemFrameNumberType getSystemFrameNumber() {
    return systemFrameNumber_;
  }
  /**
   * @throws ClassCastException if value is not a eUTRAType.systemFrameNumberType
   */
  public void setSystemFrameNumber(Asn1Object value) {
    this.systemFrameNumber_ = (eUTRAType.systemFrameNumberType) value;
  }
  public eUTRAType.systemFrameNumberType setSystemFrameNumberToNewInstance() {
    systemFrameNumber_ = new eUTRAType.systemFrameNumberType();
    return systemFrameNumber_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getPhysCellId() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getPhysCellId();
          }

          @Override public void setToNewInstance() {
            setPhysCellIdToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? eUTRAType.physCellIdType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "physCellId : "
                    + getPhysCellId().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getCellGlobalId() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getCellGlobalId();
          }

          @Override public void setToNewInstance() {
            setCellGlobalIdToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? CellGlobalIdEUTRA_AndUTRA.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "cellGlobalId : "
                    + getCellGlobalId().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getSystemFrameNumber() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getSystemFrameNumber();
          }

          @Override public void setToNewInstance() {
            setSystemFrameNumberToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? eUTRAType.systemFrameNumberType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "systemFrameNumber : "
                    + getSystemFrameNumber().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      return builder.build();
    }

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class physCellIdType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_physCellIdType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public physCellIdType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("503"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_physCellIdType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_physCellIdType != null) {
      return ImmutableList.of(TAG_physCellIdType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new physCellIdType from encoded stream.
   */
  public static physCellIdType fromPerUnaligned(byte[] encodedBytes) {
    physCellIdType result = new physCellIdType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new physCellIdType from encoded stream.
   */
  public static physCellIdType fromPerAligned(byte[] encodedBytes) {
    physCellIdType result = new physCellIdType();
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
    return "physCellIdType = " + getInteger() + ";\n";
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
public static class systemFrameNumberType extends Asn1BitString {
  //

  // defined bit positions, if any
  

  // setters
  

  // clearers
  


  private static final Asn1Tag TAG_systemFrameNumberType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public systemFrameNumberType() {
    super();
    setMinSize(10);
setMaxSize(10);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_systemFrameNumberType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_systemFrameNumberType != null) {
      return ImmutableList.of(TAG_systemFrameNumberType);
    } else {
      return Asn1BitString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new systemFrameNumberType from encoded stream.
   */
  public static systemFrameNumberType fromPerUnaligned(byte[] encodedBytes) {
    systemFrameNumberType result = new systemFrameNumberType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new systemFrameNumberType from encoded stream.
   */
  public static systemFrameNumberType fromPerAligned(byte[] encodedBytes) {
    systemFrameNumberType result = new systemFrameNumberType();
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
    return "systemFrameNumberType = " + getValue() + ";\n";
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
    builder.append("eUTRAType = {\n");
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


  public boolean isEUTRA() {
    return !hasExtensionValue() && Select.$EUTRA == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isEUTRA}.
   */
  @SuppressWarnings("unchecked")
  public networkTimeType.eUTRAType getEUTRA() {
    if (!isEUTRA()) {
      throw new IllegalStateException("networkTimeType value not a EUTRA");
    }
    return (networkTimeType.eUTRAType) element;
  }

  public void setEUTRA(networkTimeType.eUTRAType selected) {
    selection = Select.$EUTRA;
    extension = false;
    element = selected;
  }

  public networkTimeType.eUTRAType setEUTRAToNewInstance() {
      networkTimeType.eUTRAType element = new networkTimeType.eUTRAType();
      setEUTRA(element);
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
public static class uTRAType extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_uTRAType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public uTRAType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_uTRAType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_uTRAType != null) {
      return ImmutableList.of(TAG_uTRAType);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new uTRAType from encoded stream.
   */
  public static uTRAType fromPerUnaligned(byte[] encodedBytes) {
    uTRAType result = new uTRAType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new uTRAType from encoded stream.
   */
  public static uTRAType fromPerAligned(byte[] encodedBytes) {
    uTRAType result = new uTRAType();
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

  
  private uTRAType.modeType mode_;
  public uTRAType.modeType getMode() {
    return mode_;
  }
  /**
   * @throws ClassCastException if value is not a uTRAType.modeType
   */
  public void setMode(Asn1Object value) {
    this.mode_ = (uTRAType.modeType) value;
  }
  public uTRAType.modeType setModeToNewInstance() {
    mode_ = new uTRAType.modeType();
    return mode_;
  }
  
  private CellGlobalIdEUTRA_AndUTRA cellGlobalId_;
  public CellGlobalIdEUTRA_AndUTRA getCellGlobalId() {
    return cellGlobalId_;
  }
  /**
   * @throws ClassCastException if value is not a CellGlobalIdEUTRA_AndUTRA
   */
  public void setCellGlobalId(Asn1Object value) {
    this.cellGlobalId_ = (CellGlobalIdEUTRA_AndUTRA) value;
  }
  public CellGlobalIdEUTRA_AndUTRA setCellGlobalIdToNewInstance() {
    cellGlobalId_ = new CellGlobalIdEUTRA_AndUTRA();
    return cellGlobalId_;
  }
  
  private uTRAType.referenceSystemFrameNumberType referenceSystemFrameNumber_;
  public uTRAType.referenceSystemFrameNumberType getReferenceSystemFrameNumber() {
    return referenceSystemFrameNumber_;
  }
  /**
   * @throws ClassCastException if value is not a uTRAType.referenceSystemFrameNumberType
   */
  public void setReferenceSystemFrameNumber(Asn1Object value) {
    this.referenceSystemFrameNumber_ = (uTRAType.referenceSystemFrameNumberType) value;
  }
  public uTRAType.referenceSystemFrameNumberType setReferenceSystemFrameNumberToNewInstance() {
    referenceSystemFrameNumber_ = new uTRAType.referenceSystemFrameNumberType();
    return referenceSystemFrameNumber_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getMode() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getMode();
          }

          @Override public void setToNewInstance() {
            setModeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? uTRAType.modeType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "mode : "
                    + getMode().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getCellGlobalId() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getCellGlobalId();
          }

          @Override public void setToNewInstance() {
            setCellGlobalIdToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? CellGlobalIdEUTRA_AndUTRA.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "cellGlobalId : "
                    + getCellGlobalId().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getReferenceSystemFrameNumber() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getReferenceSystemFrameNumber();
          }

          @Override public void setToNewInstance() {
            setReferenceSystemFrameNumberToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? uTRAType.referenceSystemFrameNumberType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "referenceSystemFrameNumber : "
                    + getReferenceSystemFrameNumber().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      return builder.build();
    }

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class modeType extends Asn1Choice {
  //

  private static final Asn1Tag TAG_modeType
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
            "modeType: " + tag + " maps to both " + select0 + " and " + select);
        }
      }
    }
  }

  public modeType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_modeType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_modeType != null) {
      return ImmutableList.of(TAG_modeType);
    } else {
      return tagToSelection.keySet();
    }
  }

  /**
   * Creates a new modeType from encoded stream.
   */
  public static modeType fromPerUnaligned(byte[] encodedBytes) {
    modeType result = new modeType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new modeType from encoded stream.
   */
  public static modeType fromPerAligned(byte[] encodedBytes) {
    modeType result = new modeType();
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
    
    $Fdd(Asn1Tag.fromClassAndNumber(2, 0),
        true) {
      @Override
      public Asn1Object createElement() {
        return new modeType.fddType();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? modeType.fddType.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $Tdd(Asn1Tag.fromClassAndNumber(2, 1),
        true) {
      @Override
      public Asn1Object createElement() {
        return new modeType.tddType();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? modeType.tddType.getPossibleFirstTags() : ImmutableList.of(tag);
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
public static class fddType extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_fddType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public fddType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_fddType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_fddType != null) {
      return ImmutableList.of(TAG_fddType);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new fddType from encoded stream.
   */
  public static fddType fromPerUnaligned(byte[] encodedBytes) {
    fddType result = new fddType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new fddType from encoded stream.
   */
  public static fddType fromPerAligned(byte[] encodedBytes) {
    fddType result = new fddType();
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

  
  private fddType.primary_CPICH_InfoType primary_CPICH_Info_;
  public fddType.primary_CPICH_InfoType getPrimary_CPICH_Info() {
    return primary_CPICH_Info_;
  }
  /**
   * @throws ClassCastException if value is not a fddType.primary_CPICH_InfoType
   */
  public void setPrimary_CPICH_Info(Asn1Object value) {
    this.primary_CPICH_Info_ = (fddType.primary_CPICH_InfoType) value;
  }
  public fddType.primary_CPICH_InfoType setPrimary_CPICH_InfoToNewInstance() {
    primary_CPICH_Info_ = new fddType.primary_CPICH_InfoType();
    return primary_CPICH_Info_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getPrimary_CPICH_Info() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getPrimary_CPICH_Info();
          }

          @Override public void setToNewInstance() {
            setPrimary_CPICH_InfoToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? fddType.primary_CPICH_InfoType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "primary_CPICH_Info : "
                    + getPrimary_CPICH_Info().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      return builder.build();
    }

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class primary_CPICH_InfoType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_primary_CPICH_InfoType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public primary_CPICH_InfoType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("511"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_primary_CPICH_InfoType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_primary_CPICH_InfoType != null) {
      return ImmutableList.of(TAG_primary_CPICH_InfoType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new primary_CPICH_InfoType from encoded stream.
   */
  public static primary_CPICH_InfoType fromPerUnaligned(byte[] encodedBytes) {
    primary_CPICH_InfoType result = new primary_CPICH_InfoType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new primary_CPICH_InfoType from encoded stream.
   */
  public static primary_CPICH_InfoType fromPerAligned(byte[] encodedBytes) {
    primary_CPICH_InfoType result = new primary_CPICH_InfoType();
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
    return "primary_CPICH_InfoType = " + getInteger() + ";\n";
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
    builder.append("fddType = {\n");
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


  public boolean isFdd() {
    return !hasExtensionValue() && Select.$Fdd == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isFdd}.
   */
  @SuppressWarnings("unchecked")
  public modeType.fddType getFdd() {
    if (!isFdd()) {
      throw new IllegalStateException("modeType value not a Fdd");
    }
    return (modeType.fddType) element;
  }

  public void setFdd(modeType.fddType selected) {
    selection = Select.$Fdd;
    extension = false;
    element = selected;
  }

  public modeType.fddType setFddToNewInstance() {
      modeType.fddType element = new modeType.fddType();
      setFdd(element);
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
public static class tddType extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_tddType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public tddType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_tddType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_tddType != null) {
      return ImmutableList.of(TAG_tddType);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new tddType from encoded stream.
   */
  public static tddType fromPerUnaligned(byte[] encodedBytes) {
    tddType result = new tddType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new tddType from encoded stream.
   */
  public static tddType fromPerAligned(byte[] encodedBytes) {
    tddType result = new tddType();
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

  
  private tddType.cellParametersType cellParameters_;
  public tddType.cellParametersType getCellParameters() {
    return cellParameters_;
  }
  /**
   * @throws ClassCastException if value is not a tddType.cellParametersType
   */
  public void setCellParameters(Asn1Object value) {
    this.cellParameters_ = (tddType.cellParametersType) value;
  }
  public tddType.cellParametersType setCellParametersToNewInstance() {
    cellParameters_ = new tddType.cellParametersType();
    return cellParameters_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getCellParameters() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCellParameters();
          }

          @Override public void setToNewInstance() {
            setCellParametersToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? tddType.cellParametersType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "cellParameters : "
                    + getCellParameters().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      return builder.build();
    }

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class cellParametersType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_cellParametersType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public cellParametersType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("127"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_cellParametersType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_cellParametersType != null) {
      return ImmutableList.of(TAG_cellParametersType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new cellParametersType from encoded stream.
   */
  public static cellParametersType fromPerUnaligned(byte[] encodedBytes) {
    cellParametersType result = new cellParametersType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new cellParametersType from encoded stream.
   */
  public static cellParametersType fromPerAligned(byte[] encodedBytes) {
    cellParametersType result = new cellParametersType();
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
    return "cellParametersType = " + getInteger() + ";\n";
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
    builder.append("tddType = {\n");
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


  public boolean isTdd() {
    return !hasExtensionValue() && Select.$Tdd == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isTdd}.
   */
  @SuppressWarnings("unchecked")
  public modeType.tddType getTdd() {
    if (!isTdd()) {
      throw new IllegalStateException("modeType value not a Tdd");
    }
    return (modeType.tddType) element;
  }

  public void setTdd(modeType.tddType selected) {
    selection = Select.$Tdd;
    extension = false;
    element = selected;
  }

  public modeType.tddType setTddToNewInstance() {
      modeType.tddType element = new modeType.tddType();
      setTdd(element);
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
    return "modeType = " + elementIndentedString(indent) + indent + ";\n";
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
public static class referenceSystemFrameNumberType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_referenceSystemFrameNumberType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public referenceSystemFrameNumberType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("4095"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_referenceSystemFrameNumberType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_referenceSystemFrameNumberType != null) {
      return ImmutableList.of(TAG_referenceSystemFrameNumberType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new referenceSystemFrameNumberType from encoded stream.
   */
  public static referenceSystemFrameNumberType fromPerUnaligned(byte[] encodedBytes) {
    referenceSystemFrameNumberType result = new referenceSystemFrameNumberType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new referenceSystemFrameNumberType from encoded stream.
   */
  public static referenceSystemFrameNumberType fromPerAligned(byte[] encodedBytes) {
    referenceSystemFrameNumberType result = new referenceSystemFrameNumberType();
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
    return "referenceSystemFrameNumberType = " + getInteger() + ";\n";
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
    builder.append("uTRAType = {\n");
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


  public boolean isUTRA() {
    return !hasExtensionValue() && Select.$UTRA == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isUTRA}.
   */
  @SuppressWarnings("unchecked")
  public networkTimeType.uTRAType getUTRA() {
    if (!isUTRA()) {
      throw new IllegalStateException("networkTimeType value not a UTRA");
    }
    return (networkTimeType.uTRAType) element;
  }

  public void setUTRA(networkTimeType.uTRAType selected) {
    selection = Select.$UTRA;
    extension = false;
    element = selected;
  }

  public networkTimeType.uTRAType setUTRAToNewInstance() {
      networkTimeType.uTRAType element = new networkTimeType.uTRAType();
      setUTRA(element);
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
public static class gSMType extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_gSMType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gSMType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gSMType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gSMType != null) {
      return ImmutableList.of(TAG_gSMType);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gSMType from encoded stream.
   */
  public static gSMType fromPerUnaligned(byte[] encodedBytes) {
    gSMType result = new gSMType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gSMType from encoded stream.
   */
  public static gSMType fromPerAligned(byte[] encodedBytes) {
    gSMType result = new gSMType();
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

  
  private gSMType.bcchCarrierType bcchCarrier_;
  public gSMType.bcchCarrierType getBcchCarrier() {
    return bcchCarrier_;
  }
  /**
   * @throws ClassCastException if value is not a gSMType.bcchCarrierType
   */
  public void setBcchCarrier(Asn1Object value) {
    this.bcchCarrier_ = (gSMType.bcchCarrierType) value;
  }
  public gSMType.bcchCarrierType setBcchCarrierToNewInstance() {
    bcchCarrier_ = new gSMType.bcchCarrierType();
    return bcchCarrier_;
  }
  
  private gSMType.bsicType bsic_;
  public gSMType.bsicType getBsic() {
    return bsic_;
  }
  /**
   * @throws ClassCastException if value is not a gSMType.bsicType
   */
  public void setBsic(Asn1Object value) {
    this.bsic_ = (gSMType.bsicType) value;
  }
  public gSMType.bsicType setBsicToNewInstance() {
    bsic_ = new gSMType.bsicType();
    return bsic_;
  }
  
  private CellGlobalIdGERAN cellGlobalId_;
  public CellGlobalIdGERAN getCellGlobalId() {
    return cellGlobalId_;
  }
  /**
   * @throws ClassCastException if value is not a CellGlobalIdGERAN
   */
  public void setCellGlobalId(Asn1Object value) {
    this.cellGlobalId_ = (CellGlobalIdGERAN) value;
  }
  public CellGlobalIdGERAN setCellGlobalIdToNewInstance() {
    cellGlobalId_ = new CellGlobalIdGERAN();
    return cellGlobalId_;
  }
  
  private gSMType.referenceFrameType referenceFrame_;
  public gSMType.referenceFrameType getReferenceFrame() {
    return referenceFrame_;
  }
  /**
   * @throws ClassCastException if value is not a gSMType.referenceFrameType
   */
  public void setReferenceFrame(Asn1Object value) {
    this.referenceFrame_ = (gSMType.referenceFrameType) value;
  }
  public gSMType.referenceFrameType setReferenceFrameToNewInstance() {
    referenceFrame_ = new gSMType.referenceFrameType();
    return referenceFrame_;
  }
  
  private gSMType.deltaGNSS_TODType deltaGNSS_TOD_;
  public gSMType.deltaGNSS_TODType getDeltaGNSS_TOD() {
    return deltaGNSS_TOD_;
  }
  /**
   * @throws ClassCastException if value is not a gSMType.deltaGNSS_TODType
   */
  public void setDeltaGNSS_TOD(Asn1Object value) {
    this.deltaGNSS_TOD_ = (gSMType.deltaGNSS_TODType) value;
  }
  public gSMType.deltaGNSS_TODType setDeltaGNSS_TODToNewInstance() {
    deltaGNSS_TOD_ = new gSMType.deltaGNSS_TODType();
    return deltaGNSS_TOD_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getBcchCarrier() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBcchCarrier();
          }

          @Override public void setToNewInstance() {
            setBcchCarrierToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? gSMType.bcchCarrierType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bcchCarrier : "
                    + getBcchCarrier().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getBsic() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBsic();
          }

          @Override public void setToNewInstance() {
            setBsicToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? gSMType.bsicType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bsic : "
                    + getBsic().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getCellGlobalId() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getCellGlobalId();
          }

          @Override public void setToNewInstance() {
            setCellGlobalIdToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? CellGlobalIdGERAN.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "cellGlobalId : "
                    + getCellGlobalId().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getReferenceFrame() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getReferenceFrame();
          }

          @Override public void setToNewInstance() {
            setReferenceFrameToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? gSMType.referenceFrameType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "referenceFrame : "
                    + getReferenceFrame().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getDeltaGNSS_TOD() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getDeltaGNSS_TOD();
          }

          @Override public void setToNewInstance() {
            setDeltaGNSS_TODToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? gSMType.deltaGNSS_TODType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "deltaGNSS_TOD : "
                    + getDeltaGNSS_TOD().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      return builder.build();
    }

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class bcchCarrierType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bcchCarrierType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bcchCarrierType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("1023"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bcchCarrierType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bcchCarrierType != null) {
      return ImmutableList.of(TAG_bcchCarrierType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bcchCarrierType from encoded stream.
   */
  public static bcchCarrierType fromPerUnaligned(byte[] encodedBytes) {
    bcchCarrierType result = new bcchCarrierType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bcchCarrierType from encoded stream.
   */
  public static bcchCarrierType fromPerAligned(byte[] encodedBytes) {
    bcchCarrierType result = new bcchCarrierType();
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
    return "bcchCarrierType = " + getInteger() + ";\n";
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
public static class bsicType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bsicType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bsicType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("63"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bsicType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bsicType != null) {
      return ImmutableList.of(TAG_bsicType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bsicType from encoded stream.
   */
  public static bsicType fromPerUnaligned(byte[] encodedBytes) {
    bsicType result = new bsicType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bsicType from encoded stream.
   */
  public static bsicType fromPerAligned(byte[] encodedBytes) {
    bsicType result = new bsicType();
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
    return "bsicType = " + getInteger() + ";\n";
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
public static class referenceFrameType extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_referenceFrameType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public referenceFrameType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_referenceFrameType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_referenceFrameType != null) {
      return ImmutableList.of(TAG_referenceFrameType);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new referenceFrameType from encoded stream.
   */
  public static referenceFrameType fromPerUnaligned(byte[] encodedBytes) {
    referenceFrameType result = new referenceFrameType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new referenceFrameType from encoded stream.
   */
  public static referenceFrameType fromPerAligned(byte[] encodedBytes) {
    referenceFrameType result = new referenceFrameType();
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

  
  private referenceFrameType.referenceFNType referenceFN_;
  public referenceFrameType.referenceFNType getReferenceFN() {
    return referenceFN_;
  }
  /**
   * @throws ClassCastException if value is not a referenceFrameType.referenceFNType
   */
  public void setReferenceFN(Asn1Object value) {
    this.referenceFN_ = (referenceFrameType.referenceFNType) value;
  }
  public referenceFrameType.referenceFNType setReferenceFNToNewInstance() {
    referenceFN_ = new referenceFrameType.referenceFNType();
    return referenceFN_;
  }
  
  private referenceFrameType.referenceFNMSBType referenceFNMSB_;
  public referenceFrameType.referenceFNMSBType getReferenceFNMSB() {
    return referenceFNMSB_;
  }
  /**
   * @throws ClassCastException if value is not a referenceFrameType.referenceFNMSBType
   */
  public void setReferenceFNMSB(Asn1Object value) {
    this.referenceFNMSB_ = (referenceFrameType.referenceFNMSBType) value;
  }
  public referenceFrameType.referenceFNMSBType setReferenceFNMSBToNewInstance() {
    referenceFNMSB_ = new referenceFrameType.referenceFNMSBType();
    return referenceFNMSB_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getReferenceFN() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getReferenceFN();
          }

          @Override public void setToNewInstance() {
            setReferenceFNToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? referenceFrameType.referenceFNType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "referenceFN : "
                    + getReferenceFN().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getReferenceFNMSB() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getReferenceFNMSB();
          }

          @Override public void setToNewInstance() {
            setReferenceFNMSBToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? referenceFrameType.referenceFNMSBType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "referenceFNMSB : "
                    + getReferenceFNMSB().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      return builder.build();
    }

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class referenceFNType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_referenceFNType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public referenceFNType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("65535"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_referenceFNType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_referenceFNType != null) {
      return ImmutableList.of(TAG_referenceFNType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new referenceFNType from encoded stream.
   */
  public static referenceFNType fromPerUnaligned(byte[] encodedBytes) {
    referenceFNType result = new referenceFNType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new referenceFNType from encoded stream.
   */
  public static referenceFNType fromPerAligned(byte[] encodedBytes) {
    referenceFNType result = new referenceFNType();
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
    return "referenceFNType = " + getInteger() + ";\n";
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
public static class referenceFNMSBType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_referenceFNMSBType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public referenceFNMSBType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("63"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_referenceFNMSBType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_referenceFNMSBType != null) {
      return ImmutableList.of(TAG_referenceFNMSBType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new referenceFNMSBType from encoded stream.
   */
  public static referenceFNMSBType fromPerUnaligned(byte[] encodedBytes) {
    referenceFNMSBType result = new referenceFNMSBType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new referenceFNMSBType from encoded stream.
   */
  public static referenceFNMSBType fromPerAligned(byte[] encodedBytes) {
    referenceFNMSBType result = new referenceFNMSBType();
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
    return "referenceFNMSBType = " + getInteger() + ";\n";
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
    builder.append("referenceFrameType = {\n");
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

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class deltaGNSS_TODType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_deltaGNSS_TODType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public deltaGNSS_TODType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("127"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_deltaGNSS_TODType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_deltaGNSS_TODType != null) {
      return ImmutableList.of(TAG_deltaGNSS_TODType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new deltaGNSS_TODType from encoded stream.
   */
  public static deltaGNSS_TODType fromPerUnaligned(byte[] encodedBytes) {
    deltaGNSS_TODType result = new deltaGNSS_TODType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new deltaGNSS_TODType from encoded stream.
   */
  public static deltaGNSS_TODType fromPerAligned(byte[] encodedBytes) {
    deltaGNSS_TODType result = new deltaGNSS_TODType();
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
    return "deltaGNSS_TODType = " + getInteger() + ";\n";
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
    builder.append("gSMType = {\n");
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


  public boolean isGSM() {
    return !hasExtensionValue() && Select.$GSM == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isGSM}.
   */
  @SuppressWarnings("unchecked")
  public networkTimeType.gSMType getGSM() {
    if (!isGSM()) {
      throw new IllegalStateException("networkTimeType value not a GSM");
    }
    return (networkTimeType.gSMType) element;
  }

  public void setGSM(networkTimeType.gSMType selected) {
    selection = Select.$GSM;
    extension = false;
    element = selected;
  }

  public networkTimeType.gSMType setGSMToNewInstance() {
      networkTimeType.gSMType element = new networkTimeType.gSMType();
      setGSM(element);
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
    return "networkTimeType = " + elementIndentedString(indent) + indent + ";\n";
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
    builder.append("MeasurementReferenceTime = {\n");
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
