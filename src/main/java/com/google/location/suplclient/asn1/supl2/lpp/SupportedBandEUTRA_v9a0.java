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
public  class SupportedBandEUTRA_v9a0 extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_SupportedBandEUTRA_v9a0
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public SupportedBandEUTRA_v9a0() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_SupportedBandEUTRA_v9a0;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_SupportedBandEUTRA_v9a0 != null) {
      return ImmutableList.of(TAG_SupportedBandEUTRA_v9a0);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new SupportedBandEUTRA_v9a0 from encoded stream.
   */
  public static SupportedBandEUTRA_v9a0 fromPerUnaligned(byte[] encodedBytes) {
    SupportedBandEUTRA_v9a0 result = new SupportedBandEUTRA_v9a0();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new SupportedBandEUTRA_v9a0 from encoded stream.
   */
  public static SupportedBandEUTRA_v9a0 fromPerAligned(byte[] encodedBytes) {
    SupportedBandEUTRA_v9a0 result = new SupportedBandEUTRA_v9a0();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }



  @Override protected boolean isExtensible() {
    return false;
  }

  @Override public boolean containsExtensionValues() {
    for (SequenceComponent extensionComponent : getExtensionComponents()) {
      if (extensionComponent.isExplicitlySet()) return true;
    }
    return false;
  }

  
  private SupportedBandEUTRA_v9a0.bandEUTRA_v9a0Type bandEUTRA_v9a0_;
  public SupportedBandEUTRA_v9a0.bandEUTRA_v9a0Type getBandEUTRA_v9a0() {
    return bandEUTRA_v9a0_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedBandEUTRA_v9a0.bandEUTRA_v9a0Type
   */
  public void setBandEUTRA_v9a0(Asn1Object value) {
    this.bandEUTRA_v9a0_ = (SupportedBandEUTRA_v9a0.bandEUTRA_v9a0Type) value;
  }
  public SupportedBandEUTRA_v9a0.bandEUTRA_v9a0Type setBandEUTRA_v9a0ToNewInstance() {
    bandEUTRA_v9a0_ = new SupportedBandEUTRA_v9a0.bandEUTRA_v9a0Type();
    return bandEUTRA_v9a0_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getBandEUTRA_v9a0() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getBandEUTRA_v9a0();
          }

          @Override public void setToNewInstance() {
            setBandEUTRA_v9a0ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedBandEUTRA_v9a0.bandEUTRA_v9a0Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bandEUTRA_v9a0 : "
                    + getBandEUTRA_v9a0().toIndentedString(indent);
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
public static class bandEUTRA_v9a0Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bandEUTRA_v9a0Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bandEUTRA_v9a0Type() {
    super();
    setValueRange(maxFBI_Plus1.VALUE, maxFBI2.VALUE);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bandEUTRA_v9a0Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bandEUTRA_v9a0Type != null) {
      return ImmutableList.of(TAG_bandEUTRA_v9a0Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bandEUTRA_v9a0Type from encoded stream.
   */
  public static bandEUTRA_v9a0Type fromPerUnaligned(byte[] encodedBytes) {
    bandEUTRA_v9a0Type result = new bandEUTRA_v9a0Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bandEUTRA_v9a0Type from encoded stream.
   */
  public static bandEUTRA_v9a0Type fromPerAligned(byte[] encodedBytes) {
    bandEUTRA_v9a0Type result = new bandEUTRA_v9a0Type();
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
    return "bandEUTRA_v9a0Type = " + getInteger() + ";\n";
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
    builder.append("SupportedBandEUTRA_v9a0 = {\n");
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
