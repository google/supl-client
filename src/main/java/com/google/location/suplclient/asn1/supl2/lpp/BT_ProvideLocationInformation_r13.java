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
import com.google.location.suplclient.asn1.base.Asn1Object;
import com.google.location.suplclient.asn1.base.Asn1Sequence;
import com.google.location.suplclient.asn1.base.Asn1Tag;
import com.google.location.suplclient.asn1.base.Asn1UTCTime;
import com.google.location.suplclient.asn1.base.BitStream;
import com.google.location.suplclient.asn1.base.BitStreamReader;
import com.google.location.suplclient.asn1.base.SequenceComponent;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
* 
*/
public  class BT_ProvideLocationInformation_r13 extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_BT_ProvideLocationInformation_r13
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public BT_ProvideLocationInformation_r13() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_BT_ProvideLocationInformation_r13;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_BT_ProvideLocationInformation_r13 != null) {
      return ImmutableList.of(TAG_BT_ProvideLocationInformation_r13);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new BT_ProvideLocationInformation_r13 from encoded stream.
   */
  public static BT_ProvideLocationInformation_r13 fromPerUnaligned(byte[] encodedBytes) {
    BT_ProvideLocationInformation_r13 result = new BT_ProvideLocationInformation_r13();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new BT_ProvideLocationInformation_r13 from encoded stream.
   */
  public static BT_ProvideLocationInformation_r13 fromPerAligned(byte[] encodedBytes) {
    BT_ProvideLocationInformation_r13 result = new BT_ProvideLocationInformation_r13();
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

  
  private BT_MeasurementList_r13 bt_MeasurementList_r13_;
  public BT_MeasurementList_r13 getBt_MeasurementList_r13() {
    return bt_MeasurementList_r13_;
  }
  /**
   * @throws ClassCastException if value is not a BT_MeasurementList_r13
   */
  public void setBt_MeasurementList_r13(Asn1Object value) {
    this.bt_MeasurementList_r13_ = (BT_MeasurementList_r13) value;
  }
  public BT_MeasurementList_r13 setBt_MeasurementList_r13ToNewInstance() {
    bt_MeasurementList_r13_ = new BT_MeasurementList_r13();
    return bt_MeasurementList_r13_;
  }
  
  private BT_ProvideLocationInformation_r13.measurementReferenceTime_r13Type measurementReferenceTime_r13_;
  public BT_ProvideLocationInformation_r13.measurementReferenceTime_r13Type getMeasurementReferenceTime_r13() {
    return measurementReferenceTime_r13_;
  }
  /**
   * @throws ClassCastException if value is not a BT_ProvideLocationInformation_r13.measurementReferenceTime_r13Type
   */
  public void setMeasurementReferenceTime_r13(Asn1Object value) {
    this.measurementReferenceTime_r13_ = (BT_ProvideLocationInformation_r13.measurementReferenceTime_r13Type) value;
  }
  public BT_ProvideLocationInformation_r13.measurementReferenceTime_r13Type setMeasurementReferenceTime_r13ToNewInstance() {
    measurementReferenceTime_r13_ = new BT_ProvideLocationInformation_r13.measurementReferenceTime_r13Type();
    return measurementReferenceTime_r13_;
  }
  
  private BT_Error_r13 bt_Error_r13_;
  public BT_Error_r13 getBt_Error_r13() {
    return bt_Error_r13_;
  }
  /**
   * @throws ClassCastException if value is not a BT_Error_r13
   */
  public void setBt_Error_r13(Asn1Object value) {
    this.bt_Error_r13_ = (BT_Error_r13) value;
  }
  public BT_Error_r13 setBt_Error_r13ToNewInstance() {
    bt_Error_r13_ = new BT_Error_r13();
    return bt_Error_r13_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getBt_MeasurementList_r13() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getBt_MeasurementList_r13();
          }

          @Override public void setToNewInstance() {
            setBt_MeasurementList_r13ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? BT_MeasurementList_r13.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bt_MeasurementList_r13 : "
                    + getBt_MeasurementList_r13().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getMeasurementReferenceTime_r13() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getMeasurementReferenceTime_r13();
          }

          @Override public void setToNewInstance() {
            setMeasurementReferenceTime_r13ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? BT_ProvideLocationInformation_r13.measurementReferenceTime_r13Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "measurementReferenceTime_r13 : "
                    + getMeasurementReferenceTime_r13().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getBt_Error_r13() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getBt_Error_r13();
          }

          @Override public void setToNewInstance() {
            setBt_Error_r13ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? BT_Error_r13.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bt_Error_r13 : "
                    + getBt_Error_r13().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      return builder.build();
    }

  
  
  
  /*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class measurementReferenceTime_r13Type extends Asn1UTCTime {
  //

  private static final Asn1Tag TAG_measurementReferenceTime_r13Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public measurementReferenceTime_r13Type() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_measurementReferenceTime_r13Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_measurementReferenceTime_r13Type != null) {
      return ImmutableList.of(TAG_measurementReferenceTime_r13Type);
    } else {
      return Asn1UTCTime.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new measurementReferenceTime_r13Type from encoded stream.
   */
  public static measurementReferenceTime_r13Type fromPerUnaligned(byte[] encodedBytes) {
    measurementReferenceTime_r13Type result = new measurementReferenceTime_r13Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new measurementReferenceTime_r13Type from encoded stream.
   */
  public static measurementReferenceTime_r13Type fromPerAligned(byte[] encodedBytes) {
    measurementReferenceTime_r13Type result = new measurementReferenceTime_r13Type();
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
    return "measurementReferenceTime_r13Type = [ " + toHumanReadableString() + " ];\n";
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
    builder.append("BT_ProvideLocationInformation_r13 = {\n");
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
