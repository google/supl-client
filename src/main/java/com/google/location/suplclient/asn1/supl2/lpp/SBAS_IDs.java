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
public  class SBAS_IDs extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_SBAS_IDs
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public SBAS_IDs() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_SBAS_IDs;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_SBAS_IDs != null) {
      return ImmutableList.of(TAG_SBAS_IDs);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new SBAS_IDs from encoded stream.
   */
  public static SBAS_IDs fromPerUnaligned(byte[] encodedBytes) {
    SBAS_IDs result = new SBAS_IDs();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new SBAS_IDs from encoded stream.
   */
  public static SBAS_IDs fromPerAligned(byte[] encodedBytes) {
    SBAS_IDs result = new SBAS_IDs();
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

  
  private SBAS_IDs.sbas_IDsType sbas_IDs_;
  public SBAS_IDs.sbas_IDsType getSbas_IDs() {
    return sbas_IDs_;
  }
  /**
   * @throws ClassCastException if value is not a SBAS_IDs.sbas_IDsType
   */
  public void setSbas_IDs(Asn1Object value) {
    this.sbas_IDs_ = (SBAS_IDs.sbas_IDsType) value;
  }
  public SBAS_IDs.sbas_IDsType setSbas_IDsToNewInstance() {
    sbas_IDs_ = new SBAS_IDs.sbas_IDsType();
    return sbas_IDs_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getSbas_IDs() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getSbas_IDs();
          }

          @Override public void setToNewInstance() {
            setSbas_IDsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SBAS_IDs.sbas_IDsType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "sbas_IDs : "
                    + getSbas_IDs().toIndentedString(indent);
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
public static class sbas_IDsType extends Asn1BitString {
  //

  // defined bit positions, if any
  public static final int waas = 0;
  public static final int egnos = 1;
  public static final int msas = 2;
  public static final int gagan = 3;
  

  // setters
  public final void set_waas() {
    ensureValuePopulated();
    getValue().set(0);
  }
  public final void set_egnos() {
    ensureValuePopulated();
    getValue().set(1);
  }
  public final void set_msas() {
    ensureValuePopulated();
    getValue().set(2);
  }
  public final void set_gagan() {
    ensureValuePopulated();
    getValue().set(3);
  }
  

  // clearers
  public final boolean get_waas() {
    ensureValuePopulated();
    return getValue().get(0);
  }
  public final boolean get_egnos() {
    ensureValuePopulated();
    return getValue().get(1);
  }
  public final boolean get_msas() {
    ensureValuePopulated();
    return getValue().get(2);
  }
  public final boolean get_gagan() {
    ensureValuePopulated();
    return getValue().get(3);
  }
  


  private static final Asn1Tag TAG_sbas_IDsType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public sbas_IDsType() {
    super();
    setMinSize(1);
setMaxSize(8);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_sbas_IDsType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_sbas_IDsType != null) {
      return ImmutableList.of(TAG_sbas_IDsType);
    } else {
      return Asn1BitString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new sbas_IDsType from encoded stream.
   */
  public static sbas_IDsType fromPerUnaligned(byte[] encodedBytes) {
    sbas_IDsType result = new sbas_IDsType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new sbas_IDsType from encoded stream.
   */
  public static sbas_IDsType fromPerAligned(byte[] encodedBytes) {
    sbas_IDsType result = new sbas_IDsType();
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
    return "sbas_IDsType = " + getValue() + ";\n";
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
    builder.append("SBAS_IDs = {\n");
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
