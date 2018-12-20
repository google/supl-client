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
public  class ECID_ProvideCapabilities extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_ECID_ProvideCapabilities
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ECID_ProvideCapabilities() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ECID_ProvideCapabilities;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ECID_ProvideCapabilities != null) {
      return ImmutableList.of(TAG_ECID_ProvideCapabilities);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ECID_ProvideCapabilities from encoded stream.
   */
  public static ECID_ProvideCapabilities fromPerUnaligned(byte[] encodedBytes) {
    ECID_ProvideCapabilities result = new ECID_ProvideCapabilities();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ECID_ProvideCapabilities from encoded stream.
   */
  public static ECID_ProvideCapabilities fromPerAligned(byte[] encodedBytes) {
    ECID_ProvideCapabilities result = new ECID_ProvideCapabilities();
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

  
  private ECID_ProvideCapabilities.ecid_MeasSupportedType ecid_MeasSupported_;
  public ECID_ProvideCapabilities.ecid_MeasSupportedType getEcid_MeasSupported() {
    return ecid_MeasSupported_;
  }
  /**
   * @throws ClassCastException if value is not a ECID_ProvideCapabilities.ecid_MeasSupportedType
   */
  public void setEcid_MeasSupported(Asn1Object value) {
    this.ecid_MeasSupported_ = (ECID_ProvideCapabilities.ecid_MeasSupportedType) value;
  }
  public ECID_ProvideCapabilities.ecid_MeasSupportedType setEcid_MeasSupportedToNewInstance() {
    ecid_MeasSupported_ = new ECID_ProvideCapabilities.ecid_MeasSupportedType();
    return ecid_MeasSupported_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getEcid_MeasSupported() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getEcid_MeasSupported();
          }

          @Override public void setToNewInstance() {
            setEcid_MeasSupportedToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ECID_ProvideCapabilities.ecid_MeasSupportedType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ecid_MeasSupported : "
                    + getEcid_MeasSupported().toIndentedString(indent);
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
public static class ecid_MeasSupportedType extends Asn1BitString {
  //

  // defined bit positions, if any
  public static final int rsrpSup = 0;
  public static final int rsrqSup = 1;
  public static final int ueRxTxSup = 2;
  

  // setters
  public final void set_rsrpSup() {
    ensureValuePopulated();
    getValue().set(0);
  }
  public final void set_rsrqSup() {
    ensureValuePopulated();
    getValue().set(1);
  }
  public final void set_ueRxTxSup() {
    ensureValuePopulated();
    getValue().set(2);
  }
  

  // clearers
  public final boolean get_rsrpSup() {
    ensureValuePopulated();
    return getValue().get(0);
  }
  public final boolean get_rsrqSup() {
    ensureValuePopulated();
    return getValue().get(1);
  }
  public final boolean get_ueRxTxSup() {
    ensureValuePopulated();
    return getValue().get(2);
  }
  


  private static final Asn1Tag TAG_ecid_MeasSupportedType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ecid_MeasSupportedType() {
    super();
    setMinSize(1);
setMaxSize(8);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ecid_MeasSupportedType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ecid_MeasSupportedType != null) {
      return ImmutableList.of(TAG_ecid_MeasSupportedType);
    } else {
      return Asn1BitString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ecid_MeasSupportedType from encoded stream.
   */
  public static ecid_MeasSupportedType fromPerUnaligned(byte[] encodedBytes) {
    ecid_MeasSupportedType result = new ecid_MeasSupportedType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ecid_MeasSupportedType from encoded stream.
   */
  public static ecid_MeasSupportedType fromPerAligned(byte[] encodedBytes) {
    ecid_MeasSupportedType result = new ecid_MeasSupportedType();
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
    return "ecid_MeasSupportedType = " + getValue() + ";\n";
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
    builder.append("ECID_ProvideCapabilities = {\n");
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
