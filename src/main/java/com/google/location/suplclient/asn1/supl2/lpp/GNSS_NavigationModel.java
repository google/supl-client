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
public  class GNSS_NavigationModel extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GNSS_NavigationModel
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GNSS_NavigationModel() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GNSS_NavigationModel;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GNSS_NavigationModel != null) {
      return ImmutableList.of(TAG_GNSS_NavigationModel);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GNSS_NavigationModel from encoded stream.
   */
  public static GNSS_NavigationModel fromPerUnaligned(byte[] encodedBytes) {
    GNSS_NavigationModel result = new GNSS_NavigationModel();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GNSS_NavigationModel from encoded stream.
   */
  public static GNSS_NavigationModel fromPerAligned(byte[] encodedBytes) {
    GNSS_NavigationModel result = new GNSS_NavigationModel();
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

  
  private GNSS_NavigationModel.nonBroadcastIndFlagType nonBroadcastIndFlag_;
  public GNSS_NavigationModel.nonBroadcastIndFlagType getNonBroadcastIndFlag() {
    return nonBroadcastIndFlag_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_NavigationModel.nonBroadcastIndFlagType
   */
  public void setNonBroadcastIndFlag(Asn1Object value) {
    this.nonBroadcastIndFlag_ = (GNSS_NavigationModel.nonBroadcastIndFlagType) value;
  }
  public GNSS_NavigationModel.nonBroadcastIndFlagType setNonBroadcastIndFlagToNewInstance() {
    nonBroadcastIndFlag_ = new GNSS_NavigationModel.nonBroadcastIndFlagType();
    return nonBroadcastIndFlag_;
  }
  
  private GNSS_NavModelSatelliteList gnss_SatelliteList_;
  public GNSS_NavModelSatelliteList getGnss_SatelliteList() {
    return gnss_SatelliteList_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_NavModelSatelliteList
   */
  public void setGnss_SatelliteList(Asn1Object value) {
    this.gnss_SatelliteList_ = (GNSS_NavModelSatelliteList) value;
  }
  public GNSS_NavModelSatelliteList setGnss_SatelliteListToNewInstance() {
    gnss_SatelliteList_ = new GNSS_NavModelSatelliteList();
    return gnss_SatelliteList_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getNonBroadcastIndFlag() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getNonBroadcastIndFlag();
          }

          @Override public void setToNewInstance() {
            setNonBroadcastIndFlagToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_NavigationModel.nonBroadcastIndFlagType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "nonBroadcastIndFlag : "
                    + getNonBroadcastIndFlag().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getGnss_SatelliteList() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_SatelliteList();
          }

          @Override public void setToNewInstance() {
            setGnss_SatelliteListToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_NavModelSatelliteList.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_SatelliteList : "
                    + getGnss_SatelliteList().toIndentedString(indent);
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
public static class nonBroadcastIndFlagType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_nonBroadcastIndFlagType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public nonBroadcastIndFlagType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("1"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_nonBroadcastIndFlagType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_nonBroadcastIndFlagType != null) {
      return ImmutableList.of(TAG_nonBroadcastIndFlagType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new nonBroadcastIndFlagType from encoded stream.
   */
  public static nonBroadcastIndFlagType fromPerUnaligned(byte[] encodedBytes) {
    nonBroadcastIndFlagType result = new nonBroadcastIndFlagType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new nonBroadcastIndFlagType from encoded stream.
   */
  public static nonBroadcastIndFlagType fromPerAligned(byte[] encodedBytes) {
    nonBroadcastIndFlagType result = new nonBroadcastIndFlagType();
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
    return "nonBroadcastIndFlagType = " + getInteger() + ";\n";
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
    builder.append("GNSS_NavigationModel = {\n");
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
