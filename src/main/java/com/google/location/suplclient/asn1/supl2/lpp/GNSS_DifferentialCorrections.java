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
public  class GNSS_DifferentialCorrections extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GNSS_DifferentialCorrections
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GNSS_DifferentialCorrections() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GNSS_DifferentialCorrections;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GNSS_DifferentialCorrections != null) {
      return ImmutableList.of(TAG_GNSS_DifferentialCorrections);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GNSS_DifferentialCorrections from encoded stream.
   */
  public static GNSS_DifferentialCorrections fromPerUnaligned(byte[] encodedBytes) {
    GNSS_DifferentialCorrections result = new GNSS_DifferentialCorrections();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GNSS_DifferentialCorrections from encoded stream.
   */
  public static GNSS_DifferentialCorrections fromPerAligned(byte[] encodedBytes) {
    GNSS_DifferentialCorrections result = new GNSS_DifferentialCorrections();
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

  
  private GNSS_DifferentialCorrections.dgnss_RefTimeType dgnss_RefTime_;
  public GNSS_DifferentialCorrections.dgnss_RefTimeType getDgnss_RefTime() {
    return dgnss_RefTime_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_DifferentialCorrections.dgnss_RefTimeType
   */
  public void setDgnss_RefTime(Asn1Object value) {
    this.dgnss_RefTime_ = (GNSS_DifferentialCorrections.dgnss_RefTimeType) value;
  }
  public GNSS_DifferentialCorrections.dgnss_RefTimeType setDgnss_RefTimeToNewInstance() {
    dgnss_RefTime_ = new GNSS_DifferentialCorrections.dgnss_RefTimeType();
    return dgnss_RefTime_;
  }
  
  private DGNSS_SgnTypeList dgnss_SgnTypeList_;
  public DGNSS_SgnTypeList getDgnss_SgnTypeList() {
    return dgnss_SgnTypeList_;
  }
  /**
   * @throws ClassCastException if value is not a DGNSS_SgnTypeList
   */
  public void setDgnss_SgnTypeList(Asn1Object value) {
    this.dgnss_SgnTypeList_ = (DGNSS_SgnTypeList) value;
  }
  public DGNSS_SgnTypeList setDgnss_SgnTypeListToNewInstance() {
    dgnss_SgnTypeList_ = new DGNSS_SgnTypeList();
    return dgnss_SgnTypeList_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getDgnss_RefTime() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getDgnss_RefTime();
          }

          @Override public void setToNewInstance() {
            setDgnss_RefTimeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_DifferentialCorrections.dgnss_RefTimeType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "dgnss_RefTime : "
                    + getDgnss_RefTime().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getDgnss_SgnTypeList() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getDgnss_SgnTypeList();
          }

          @Override public void setToNewInstance() {
            setDgnss_SgnTypeListToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? DGNSS_SgnTypeList.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "dgnss_SgnTypeList : "
                    + getDgnss_SgnTypeList().toIndentedString(indent);
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
public static class dgnss_RefTimeType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_dgnss_RefTimeType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public dgnss_RefTimeType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("3599"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_dgnss_RefTimeType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_dgnss_RefTimeType != null) {
      return ImmutableList.of(TAG_dgnss_RefTimeType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new dgnss_RefTimeType from encoded stream.
   */
  public static dgnss_RefTimeType fromPerUnaligned(byte[] encodedBytes) {
    dgnss_RefTimeType result = new dgnss_RefTimeType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new dgnss_RefTimeType from encoded stream.
   */
  public static dgnss_RefTimeType fromPerAligned(byte[] encodedBytes) {
    dgnss_RefTimeType result = new dgnss_RefTimeType();
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
    return "dgnss_RefTimeType = " + getInteger() + ";\n";
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
    builder.append("GNSS_DifferentialCorrections = {\n");
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
