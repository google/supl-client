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
public  class BT_RequestLocationInformation_r13 extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_BT_RequestLocationInformation_r13
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public BT_RequestLocationInformation_r13() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_BT_RequestLocationInformation_r13;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_BT_RequestLocationInformation_r13 != null) {
      return ImmutableList.of(TAG_BT_RequestLocationInformation_r13);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new BT_RequestLocationInformation_r13 from encoded stream.
   */
  public static BT_RequestLocationInformation_r13 fromPerUnaligned(byte[] encodedBytes) {
    BT_RequestLocationInformation_r13 result = new BT_RequestLocationInformation_r13();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new BT_RequestLocationInformation_r13 from encoded stream.
   */
  public static BT_RequestLocationInformation_r13 fromPerAligned(byte[] encodedBytes) {
    BT_RequestLocationInformation_r13 result = new BT_RequestLocationInformation_r13();
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

  
  private BT_RequestLocationInformation_r13.requestedMeasurements_r13Type requestedMeasurements_r13_;
  public BT_RequestLocationInformation_r13.requestedMeasurements_r13Type getRequestedMeasurements_r13() {
    return requestedMeasurements_r13_;
  }
  /**
   * @throws ClassCastException if value is not a BT_RequestLocationInformation_r13.requestedMeasurements_r13Type
   */
  public void setRequestedMeasurements_r13(Asn1Object value) {
    this.requestedMeasurements_r13_ = (BT_RequestLocationInformation_r13.requestedMeasurements_r13Type) value;
  }
  public BT_RequestLocationInformation_r13.requestedMeasurements_r13Type setRequestedMeasurements_r13ToNewInstance() {
    requestedMeasurements_r13_ = new BT_RequestLocationInformation_r13.requestedMeasurements_r13Type();
    return requestedMeasurements_r13_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getRequestedMeasurements_r13() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getRequestedMeasurements_r13();
          }

          @Override public void setToNewInstance() {
            setRequestedMeasurements_r13ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? BT_RequestLocationInformation_r13.requestedMeasurements_r13Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "requestedMeasurements_r13 : "
                    + getRequestedMeasurements_r13().toIndentedString(indent);
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
public static class requestedMeasurements_r13Type extends Asn1BitString {
  //

  // defined bit positions, if any
  public static final int rssi = 0;
  

  // setters
  public final void set_rssi() {
    ensureValuePopulated();
    getValue().set(0);
  }
  

  // clearers
  public final boolean get_rssi() {
    ensureValuePopulated();
    return getValue().get(0);
  }
  


  private static final Asn1Tag TAG_requestedMeasurements_r13Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public requestedMeasurements_r13Type() {
    super();
    setMinSize(1);
setMaxSize(8);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_requestedMeasurements_r13Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_requestedMeasurements_r13Type != null) {
      return ImmutableList.of(TAG_requestedMeasurements_r13Type);
    } else {
      return Asn1BitString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new requestedMeasurements_r13Type from encoded stream.
   */
  public static requestedMeasurements_r13Type fromPerUnaligned(byte[] encodedBytes) {
    requestedMeasurements_r13Type result = new requestedMeasurements_r13Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new requestedMeasurements_r13Type from encoded stream.
   */
  public static requestedMeasurements_r13Type fromPerAligned(byte[] encodedBytes) {
    requestedMeasurements_r13Type result = new requestedMeasurements_r13Type();
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
    return "requestedMeasurements_r13Type = " + getValue() + ";\n";
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
    builder.append("BT_RequestLocationInformation_r13 = {\n");
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
