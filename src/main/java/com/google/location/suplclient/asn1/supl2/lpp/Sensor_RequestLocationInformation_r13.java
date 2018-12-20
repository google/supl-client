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
public  class Sensor_RequestLocationInformation_r13 extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_Sensor_RequestLocationInformation_r13
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public Sensor_RequestLocationInformation_r13() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_Sensor_RequestLocationInformation_r13;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_Sensor_RequestLocationInformation_r13 != null) {
      return ImmutableList.of(TAG_Sensor_RequestLocationInformation_r13);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new Sensor_RequestLocationInformation_r13 from encoded stream.
   */
  public static Sensor_RequestLocationInformation_r13 fromPerUnaligned(byte[] encodedBytes) {
    Sensor_RequestLocationInformation_r13 result = new Sensor_RequestLocationInformation_r13();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new Sensor_RequestLocationInformation_r13 from encoded stream.
   */
  public static Sensor_RequestLocationInformation_r13 fromPerAligned(byte[] encodedBytes) {
    Sensor_RequestLocationInformation_r13 result = new Sensor_RequestLocationInformation_r13();
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

  
  private Sensor_RequestLocationInformation_r13.uncompensatedBarometricPressureReqType uncompensatedBarometricPressureReq_;
  public Sensor_RequestLocationInformation_r13.uncompensatedBarometricPressureReqType getUncompensatedBarometricPressureReq() {
    return uncompensatedBarometricPressureReq_;
  }
  /**
   * @throws ClassCastException if value is not a Sensor_RequestLocationInformation_r13.uncompensatedBarometricPressureReqType
   */
  public void setUncompensatedBarometricPressureReq(Asn1Object value) {
    this.uncompensatedBarometricPressureReq_ = (Sensor_RequestLocationInformation_r13.uncompensatedBarometricPressureReqType) value;
  }
  public Sensor_RequestLocationInformation_r13.uncompensatedBarometricPressureReqType setUncompensatedBarometricPressureReqToNewInstance() {
    uncompensatedBarometricPressureReq_ = new Sensor_RequestLocationInformation_r13.uncompensatedBarometricPressureReqType();
    return uncompensatedBarometricPressureReq_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getUncompensatedBarometricPressureReq() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getUncompensatedBarometricPressureReq();
          }

          @Override public void setToNewInstance() {
            setUncompensatedBarometricPressureReqToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Sensor_RequestLocationInformation_r13.uncompensatedBarometricPressureReqType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "uncompensatedBarometricPressureReq : "
                    + getUncompensatedBarometricPressureReq().toIndentedString(indent);
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
public static class uncompensatedBarometricPressureReqType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_uncompensatedBarometricPressureReqType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public uncompensatedBarometricPressureReqType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_uncompensatedBarometricPressureReqType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_uncompensatedBarometricPressureReqType != null) {
      return ImmutableList.of(TAG_uncompensatedBarometricPressureReqType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new uncompensatedBarometricPressureReqType from encoded stream.
   */
  public static uncompensatedBarometricPressureReqType fromPerUnaligned(byte[] encodedBytes) {
    uncompensatedBarometricPressureReqType result = new uncompensatedBarometricPressureReqType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new uncompensatedBarometricPressureReqType from encoded stream.
   */
  public static uncompensatedBarometricPressureReqType fromPerAligned(byte[] encodedBytes) {
    uncompensatedBarometricPressureReqType result = new uncompensatedBarometricPressureReqType();
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
    return "uncompensatedBarometricPressureReqType = " + getValue() + ";\n";
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
    builder.append("Sensor_RequestLocationInformation_r13 = {\n");
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
