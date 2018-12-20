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
public  class GNSS_ID_Bitmap extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GNSS_ID_Bitmap
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GNSS_ID_Bitmap() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GNSS_ID_Bitmap;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GNSS_ID_Bitmap != null) {
      return ImmutableList.of(TAG_GNSS_ID_Bitmap);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GNSS_ID_Bitmap from encoded stream.
   */
  public static GNSS_ID_Bitmap fromPerUnaligned(byte[] encodedBytes) {
    GNSS_ID_Bitmap result = new GNSS_ID_Bitmap();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GNSS_ID_Bitmap from encoded stream.
   */
  public static GNSS_ID_Bitmap fromPerAligned(byte[] encodedBytes) {
    GNSS_ID_Bitmap result = new GNSS_ID_Bitmap();
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

  
  private GNSS_ID_Bitmap.gnss_idsType gnss_ids_;
  public GNSS_ID_Bitmap.gnss_idsType getGnss_ids() {
    return gnss_ids_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_ID_Bitmap.gnss_idsType
   */
  public void setGnss_ids(Asn1Object value) {
    this.gnss_ids_ = (GNSS_ID_Bitmap.gnss_idsType) value;
  }
  public GNSS_ID_Bitmap.gnss_idsType setGnss_idsToNewInstance() {
    gnss_ids_ = new GNSS_ID_Bitmap.gnss_idsType();
    return gnss_ids_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getGnss_ids() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGnss_ids();
          }

          @Override public void setToNewInstance() {
            setGnss_idsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_ID_Bitmap.gnss_idsType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "gnss_ids : "
                    + getGnss_ids().toIndentedString(indent);
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
public static class gnss_idsType extends Asn1BitString {
  //

  // defined bit positions, if any
  public static final int gps = 0;
  public static final int sbas = 1;
  public static final int qzss = 2;
  public static final int galileo = 3;
  public static final int glonass = 4;
  public static final int bds = 5;
  

  // setters
  public final void set_gps() {
    ensureValuePopulated();
    getValue().set(0);
  }
  public final void set_sbas() {
    ensureValuePopulated();
    getValue().set(1);
  }
  public final void set_qzss() {
    ensureValuePopulated();
    getValue().set(2);
  }
  public final void set_galileo() {
    ensureValuePopulated();
    getValue().set(3);
  }
  public final void set_glonass() {
    ensureValuePopulated();
    getValue().set(4);
  }
  public final void set_bds() {
    ensureValuePopulated();
    getValue().set(5);
  }
  

  // clearers
  public final boolean get_gps() {
    ensureValuePopulated();
    return getValue().get(0);
  }
  public final boolean get_sbas() {
    ensureValuePopulated();
    return getValue().get(1);
  }
  public final boolean get_qzss() {
    ensureValuePopulated();
    return getValue().get(2);
  }
  public final boolean get_galileo() {
    ensureValuePopulated();
    return getValue().get(3);
  }
  public final boolean get_glonass() {
    ensureValuePopulated();
    return getValue().get(4);
  }
  public final boolean get_bds() {
    ensureValuePopulated();
    return getValue().get(5);
  }
  


  private static final Asn1Tag TAG_gnss_idsType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public gnss_idsType() {
    super();
    setMinSize(1);
setMaxSize(16);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_gnss_idsType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_gnss_idsType != null) {
      return ImmutableList.of(TAG_gnss_idsType);
    } else {
      return Asn1BitString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new gnss_idsType from encoded stream.
   */
  public static gnss_idsType fromPerUnaligned(byte[] encodedBytes) {
    gnss_idsType result = new gnss_idsType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new gnss_idsType from encoded stream.
   */
  public static gnss_idsType fromPerAligned(byte[] encodedBytes) {
    gnss_idsType result = new gnss_idsType();
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
    return "gnss_idsType = " + getValue() + ";\n";
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
    builder.append("GNSS_ID_Bitmap = {\n");
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
