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

package com.google.location.suplclient.asn1.supl2.supl_pos_init;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.google.location.suplclient.asn1.base.Asn1Integer;
import com.google.location.suplclient.asn1.base.Asn1Object;
import com.google.location.suplclient.asn1.base.Asn1Sequence;
import com.google.location.suplclient.asn1.base.Asn1Tag;
import com.google.location.suplclient.asn1.base.BitStream;
import com.google.location.suplclient.asn1.base.BitStreamReader;
import com.google.location.suplclient.asn1.base.SequenceComponent;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
* 
*/
public  class NavigationModel extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_NavigationModel
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public NavigationModel() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_NavigationModel;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_NavigationModel != null) {
      return ImmutableList.of(TAG_NavigationModel);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new NavigationModel from encoded stream.
   */
  public static NavigationModel fromPerUnaligned(byte[] encodedBytes) {
    NavigationModel result = new NavigationModel();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new NavigationModel from encoded stream.
   */
  public static NavigationModel fromPerAligned(byte[] encodedBytes) {
    NavigationModel result = new NavigationModel();
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

  
  private NavigationModel.gpsWeekType gpsWeek_;
  public NavigationModel.gpsWeekType getGpsWeek() {
    return gpsWeek_;
  }
  /**
   * @throws ClassCastException if value is not a NavigationModel.gpsWeekType
   */
  public void setGpsWeek(Asn1Object value) {
    this.gpsWeek_ = (NavigationModel.gpsWeekType) value;
  }
  public NavigationModel.gpsWeekType setGpsWeekToNewInstance() {
    gpsWeek_ = new NavigationModel.gpsWeekType();
    return gpsWeek_;
  }
  
  private NavigationModel.gpsToeType gpsToe_;
  public NavigationModel.gpsToeType getGpsToe() {
    return gpsToe_;
  }
  /**
   * @throws ClassCastException if value is not a NavigationModel.gpsToeType
   */
  public void setGpsToe(Asn1Object value) {
    this.gpsToe_ = (NavigationModel.gpsToeType) value;
  }
  public NavigationModel.gpsToeType setGpsToeToNewInstance() {
    gpsToe_ = new NavigationModel.gpsToeType();
    return gpsToe_;
  }
  
  private NavigationModel.nSATType nSAT_;
  public NavigationModel.nSATType getNSAT() {
    return nSAT_;
  }
  /**
   * @throws ClassCastException if value is not a NavigationModel.nSATType
   */
  public void setNSAT(Asn1Object value) {
    this.nSAT_ = (NavigationModel.nSATType) value;
  }
  public NavigationModel.nSATType setNSATToNewInstance() {
    nSAT_ = new NavigationModel.nSATType();
    return nSAT_;
  }
  
  private NavigationModel.toeLimitType toeLimit_;
  public NavigationModel.toeLimitType getToeLimit() {
    return toeLimit_;
  }
  /**
   * @throws ClassCastException if value is not a NavigationModel.toeLimitType
   */
  public void setToeLimit(Asn1Object value) {
    this.toeLimit_ = (NavigationModel.toeLimitType) value;
  }
  public NavigationModel.toeLimitType setToeLimitToNewInstance() {
    toeLimit_ = new NavigationModel.toeLimitType();
    return toeLimit_;
  }
  
  private SatelliteInfo satInfo_;
  public SatelliteInfo getSatInfo() {
    return satInfo_;
  }
  /**
   * @throws ClassCastException if value is not a SatelliteInfo
   */
  public void setSatInfo(Asn1Object value) {
    this.satInfo_ = (SatelliteInfo) value;
  }
  public SatelliteInfo setSatInfoToNewInstance() {
    satInfo_ = new SatelliteInfo();
    return satInfo_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getGpsWeek() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGpsWeek();
          }

          @Override public void setToNewInstance() {
            setGpsWeekToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavigationModel.gpsWeekType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gpsWeek : "
                    + getGpsWeek().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getGpsToe() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGpsToe();
          }

          @Override public void setToNewInstance() {
            setGpsToeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavigationModel.gpsToeType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gpsToe : "
                    + getGpsToe().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getNSAT() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getNSAT();
          }

          @Override public void setToNewInstance() {
            setNSATToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavigationModel.nSATType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "nSAT : "
                    + getNSAT().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getToeLimit() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getToeLimit();
          }

          @Override public void setToNewInstance() {
            setToeLimitToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavigationModel.toeLimitType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "toeLimit : "
                    + getToeLimit().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getSatInfo() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getSatInfo();
          }

          @Override public void setToNewInstance() {
            setSatInfoToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SatelliteInfo.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "satInfo : "
                    + getSatInfo().toIndentedString(indent);
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
public static class gpsWeekType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_gpsWeekType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gpsWeekType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("1023"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gpsWeekType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gpsWeekType != null) {
      return ImmutableList.of(TAG_gpsWeekType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gpsWeekType from encoded stream.
   */
  public static gpsWeekType fromPerUnaligned(byte[] encodedBytes) {
    gpsWeekType result = new gpsWeekType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gpsWeekType from encoded stream.
   */
  public static gpsWeekType fromPerAligned(byte[] encodedBytes) {
    gpsWeekType result = new gpsWeekType();
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
    return "gpsWeekType = " + getInteger() + ";\n";
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
public static class gpsToeType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_gpsToeType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gpsToeType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("167"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gpsToeType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gpsToeType != null) {
      return ImmutableList.of(TAG_gpsToeType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gpsToeType from encoded stream.
   */
  public static gpsToeType fromPerUnaligned(byte[] encodedBytes) {
    gpsToeType result = new gpsToeType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gpsToeType from encoded stream.
   */
  public static gpsToeType fromPerAligned(byte[] encodedBytes) {
    gpsToeType result = new gpsToeType();
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
    return "gpsToeType = " + getInteger() + ";\n";
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
public static class nSATType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_nSATType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public nSATType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("31"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_nSATType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_nSATType != null) {
      return ImmutableList.of(TAG_nSATType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new nSATType from encoded stream.
   */
  public static nSATType fromPerUnaligned(byte[] encodedBytes) {
    nSATType result = new nSATType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new nSATType from encoded stream.
   */
  public static nSATType fromPerAligned(byte[] encodedBytes) {
    nSATType result = new nSATType();
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
    return "nSATType = " + getInteger() + ";\n";
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
public static class toeLimitType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_toeLimitType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public toeLimitType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("10"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_toeLimitType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_toeLimitType != null) {
      return ImmutableList.of(TAG_toeLimitType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new toeLimitType from encoded stream.
   */
  public static toeLimitType fromPerUnaligned(byte[] encodedBytes) {
    toeLimitType result = new toeLimitType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new toeLimitType from encoded stream.
   */
  public static toeLimitType fromPerAligned(byte[] encodedBytes) {
    toeLimitType result = new toeLimitType();
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
    return "toeLimitType = " + getInteger() + ";\n";
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
    builder.append("NavigationModel = {\n");
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
