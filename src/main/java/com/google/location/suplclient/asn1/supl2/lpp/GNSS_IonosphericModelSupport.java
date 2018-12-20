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
public  class GNSS_IonosphericModelSupport extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GNSS_IonosphericModelSupport
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GNSS_IonosphericModelSupport() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GNSS_IonosphericModelSupport;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GNSS_IonosphericModelSupport != null) {
      return ImmutableList.of(TAG_GNSS_IonosphericModelSupport);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GNSS_IonosphericModelSupport from encoded stream.
   */
  public static GNSS_IonosphericModelSupport fromPerUnaligned(byte[] encodedBytes) {
    GNSS_IonosphericModelSupport result = new GNSS_IonosphericModelSupport();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GNSS_IonosphericModelSupport from encoded stream.
   */
  public static GNSS_IonosphericModelSupport fromPerAligned(byte[] encodedBytes) {
    GNSS_IonosphericModelSupport result = new GNSS_IonosphericModelSupport();
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

  
  private GNSS_IonosphericModelSupport.ionoModelType ionoModel_;
  public GNSS_IonosphericModelSupport.ionoModelType getIonoModel() {
    return ionoModel_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_IonosphericModelSupport.ionoModelType
   */
  public void setIonoModel(Asn1Object value) {
    this.ionoModel_ = (GNSS_IonosphericModelSupport.ionoModelType) value;
  }
  public GNSS_IonosphericModelSupport.ionoModelType setIonoModelToNewInstance() {
    ionoModel_ = new GNSS_IonosphericModelSupport.ionoModelType();
    return ionoModel_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getIonoModel() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getIonoModel();
          }

          @Override public void setToNewInstance() {
            setIonoModelToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_IonosphericModelSupport.ionoModelType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ionoModel : "
                    + getIonoModel().toIndentedString(indent);
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
public static class ionoModelType extends Asn1BitString {
  //

  // defined bit positions, if any
  public static final int klobuchar = 0;
  public static final int neQuick = 1;
  

  // setters
  public final void set_klobuchar() {
    ensureValuePopulated();
    getValue().set(0);
  }
  public final void set_neQuick() {
    ensureValuePopulated();
    getValue().set(1);
  }
  

  // clearers
  public final boolean get_klobuchar() {
    ensureValuePopulated();
    return getValue().get(0);
  }
  public final boolean get_neQuick() {
    ensureValuePopulated();
    return getValue().get(1);
  }
  


  private static final Asn1Tag TAG_ionoModelType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ionoModelType() {
    super();
    setMinSize(1);
setMaxSize(8);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ionoModelType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ionoModelType != null) {
      return ImmutableList.of(TAG_ionoModelType);
    } else {
      return Asn1BitString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ionoModelType from encoded stream.
   */
  public static ionoModelType fromPerUnaligned(byte[] encodedBytes) {
    ionoModelType result = new ionoModelType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ionoModelType from encoded stream.
   */
  public static ionoModelType fromPerAligned(byte[] encodedBytes) {
    ionoModelType result = new ionoModelType();
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
    return "ionoModelType = " + getValue() + ";\n";
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
    builder.append("GNSS_IonosphericModelSupport = {\n");
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
