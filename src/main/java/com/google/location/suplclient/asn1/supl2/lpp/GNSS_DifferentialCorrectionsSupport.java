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
import com.google.location.suplclient.asn1.base.Asn1Boolean;
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
public  class GNSS_DifferentialCorrectionsSupport extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GNSS_DifferentialCorrectionsSupport
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GNSS_DifferentialCorrectionsSupport() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GNSS_DifferentialCorrectionsSupport;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GNSS_DifferentialCorrectionsSupport != null) {
      return ImmutableList.of(TAG_GNSS_DifferentialCorrectionsSupport);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GNSS_DifferentialCorrectionsSupport from encoded stream.
   */
  public static GNSS_DifferentialCorrectionsSupport fromPerUnaligned(byte[] encodedBytes) {
    GNSS_DifferentialCorrectionsSupport result = new GNSS_DifferentialCorrectionsSupport();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GNSS_DifferentialCorrectionsSupport from encoded stream.
   */
  public static GNSS_DifferentialCorrectionsSupport fromPerAligned(byte[] encodedBytes) {
    GNSS_DifferentialCorrectionsSupport result = new GNSS_DifferentialCorrectionsSupport();
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

  
  private GNSS_SignalIDs gnssSignalIDs_;
  public GNSS_SignalIDs getGnssSignalIDs() {
    return gnssSignalIDs_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_SignalIDs
   */
  public void setGnssSignalIDs(Asn1Object value) {
    this.gnssSignalIDs_ = (GNSS_SignalIDs) value;
  }
  public GNSS_SignalIDs setGnssSignalIDsToNewInstance() {
    gnssSignalIDs_ = new GNSS_SignalIDs();
    return gnssSignalIDs_;
  }
  
  private GNSS_DifferentialCorrectionsSupport.dgnss_ValidityTimeSupType dgnss_ValidityTimeSup_;
  public GNSS_DifferentialCorrectionsSupport.dgnss_ValidityTimeSupType getDgnss_ValidityTimeSup() {
    return dgnss_ValidityTimeSup_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_DifferentialCorrectionsSupport.dgnss_ValidityTimeSupType
   */
  public void setDgnss_ValidityTimeSup(Asn1Object value) {
    this.dgnss_ValidityTimeSup_ = (GNSS_DifferentialCorrectionsSupport.dgnss_ValidityTimeSupType) value;
  }
  public GNSS_DifferentialCorrectionsSupport.dgnss_ValidityTimeSupType setDgnss_ValidityTimeSupToNewInstance() {
    dgnss_ValidityTimeSup_ = new GNSS_DifferentialCorrectionsSupport.dgnss_ValidityTimeSupType();
    return dgnss_ValidityTimeSup_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getGnssSignalIDs() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnssSignalIDs();
          }

          @Override public void setToNewInstance() {
            setGnssSignalIDsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_SignalIDs.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnssSignalIDs : "
                    + getGnssSignalIDs().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getDgnss_ValidityTimeSup() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getDgnss_ValidityTimeSup();
          }

          @Override public void setToNewInstance() {
            setDgnss_ValidityTimeSupToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_DifferentialCorrectionsSupport.dgnss_ValidityTimeSupType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "dgnss_ValidityTimeSup : "
                    + getDgnss_ValidityTimeSup().toIndentedString(indent);
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
public static class dgnss_ValidityTimeSupType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_dgnss_ValidityTimeSupType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public dgnss_ValidityTimeSupType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_dgnss_ValidityTimeSupType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_dgnss_ValidityTimeSupType != null) {
      return ImmutableList.of(TAG_dgnss_ValidityTimeSupType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new dgnss_ValidityTimeSupType from encoded stream.
   */
  public static dgnss_ValidityTimeSupType fromPerUnaligned(byte[] encodedBytes) {
    dgnss_ValidityTimeSupType result = new dgnss_ValidityTimeSupType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new dgnss_ValidityTimeSupType from encoded stream.
   */
  public static dgnss_ValidityTimeSupType fromPerAligned(byte[] encodedBytes) {
    dgnss_ValidityTimeSupType result = new dgnss_ValidityTimeSupType();
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
    return "dgnss_ValidityTimeSupType = " + getValue() + ";\n";
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
    builder.append("GNSS_DifferentialCorrectionsSupport = {\n");
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
