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
public  class ECID_RequestLocationInformation extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_ECID_RequestLocationInformation
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ECID_RequestLocationInformation() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ECID_RequestLocationInformation;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ECID_RequestLocationInformation != null) {
      return ImmutableList.of(TAG_ECID_RequestLocationInformation);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ECID_RequestLocationInformation from encoded stream.
   */
  public static ECID_RequestLocationInformation fromPerUnaligned(byte[] encodedBytes) {
    ECID_RequestLocationInformation result = new ECID_RequestLocationInformation();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ECID_RequestLocationInformation from encoded stream.
   */
  public static ECID_RequestLocationInformation fromPerAligned(byte[] encodedBytes) {
    ECID_RequestLocationInformation result = new ECID_RequestLocationInformation();
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

  
  private ECID_RequestLocationInformation.requestedMeasurementsType requestedMeasurements_;
  public ECID_RequestLocationInformation.requestedMeasurementsType getRequestedMeasurements() {
    return requestedMeasurements_;
  }
  /**
   * @throws ClassCastException if value is not a ECID_RequestLocationInformation.requestedMeasurementsType
   */
  public void setRequestedMeasurements(Asn1Object value) {
    this.requestedMeasurements_ = (ECID_RequestLocationInformation.requestedMeasurementsType) value;
  }
  public ECID_RequestLocationInformation.requestedMeasurementsType setRequestedMeasurementsToNewInstance() {
    requestedMeasurements_ = new ECID_RequestLocationInformation.requestedMeasurementsType();
    return requestedMeasurements_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getRequestedMeasurements() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getRequestedMeasurements();
          }

          @Override public void setToNewInstance() {
            setRequestedMeasurementsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ECID_RequestLocationInformation.requestedMeasurementsType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "requestedMeasurements : "
                    + getRequestedMeasurements().toIndentedString(indent);
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
public static class requestedMeasurementsType extends Asn1BitString {
  //

  // defined bit positions, if any
  public static final int rsrpReq = 0;
  public static final int rsrqReq = 1;
  public static final int ueRxTxReq = 2;
  

  // setters
  public final void set_rsrpReq() {
    ensureValuePopulated();
    getValue().set(0);
  }
  public final void set_rsrqReq() {
    ensureValuePopulated();
    getValue().set(1);
  }
  public final void set_ueRxTxReq() {
    ensureValuePopulated();
    getValue().set(2);
  }
  

  // clearers
  public final boolean get_rsrpReq() {
    ensureValuePopulated();
    return getValue().get(0);
  }
  public final boolean get_rsrqReq() {
    ensureValuePopulated();
    return getValue().get(1);
  }
  public final boolean get_ueRxTxReq() {
    ensureValuePopulated();
    return getValue().get(2);
  }
  


  private static final Asn1Tag TAG_requestedMeasurementsType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public requestedMeasurementsType() {
    super();
    setMinSize(1);
setMaxSize(8);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_requestedMeasurementsType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_requestedMeasurementsType != null) {
      return ImmutableList.of(TAG_requestedMeasurementsType);
    } else {
      return Asn1BitString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new requestedMeasurementsType from encoded stream.
   */
  public static requestedMeasurementsType fromPerUnaligned(byte[] encodedBytes) {
    requestedMeasurementsType result = new requestedMeasurementsType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new requestedMeasurementsType from encoded stream.
   */
  public static requestedMeasurementsType fromPerAligned(byte[] encodedBytes) {
    requestedMeasurementsType result = new requestedMeasurementsType();
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
    return "requestedMeasurementsType = " + getValue() + ";\n";
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
    builder.append("ECID_RequestLocationInformation = {\n");
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
