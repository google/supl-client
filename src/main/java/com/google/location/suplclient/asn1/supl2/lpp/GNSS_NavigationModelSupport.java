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
public  class GNSS_NavigationModelSupport extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GNSS_NavigationModelSupport
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GNSS_NavigationModelSupport() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GNSS_NavigationModelSupport;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GNSS_NavigationModelSupport != null) {
      return ImmutableList.of(TAG_GNSS_NavigationModelSupport);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GNSS_NavigationModelSupport from encoded stream.
   */
  public static GNSS_NavigationModelSupport fromPerUnaligned(byte[] encodedBytes) {
    GNSS_NavigationModelSupport result = new GNSS_NavigationModelSupport();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GNSS_NavigationModelSupport from encoded stream.
   */
  public static GNSS_NavigationModelSupport fromPerAligned(byte[] encodedBytes) {
    GNSS_NavigationModelSupport result = new GNSS_NavigationModelSupport();
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

  
  private GNSS_NavigationModelSupport.clockModelType clockModel_;
  public GNSS_NavigationModelSupport.clockModelType getClockModel() {
    return clockModel_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_NavigationModelSupport.clockModelType
   */
  public void setClockModel(Asn1Object value) {
    this.clockModel_ = (GNSS_NavigationModelSupport.clockModelType) value;
  }
  public GNSS_NavigationModelSupport.clockModelType setClockModelToNewInstance() {
    clockModel_ = new GNSS_NavigationModelSupport.clockModelType();
    return clockModel_;
  }
  
  private GNSS_NavigationModelSupport.orbitModelType orbitModel_;
  public GNSS_NavigationModelSupport.orbitModelType getOrbitModel() {
    return orbitModel_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_NavigationModelSupport.orbitModelType
   */
  public void setOrbitModel(Asn1Object value) {
    this.orbitModel_ = (GNSS_NavigationModelSupport.orbitModelType) value;
  }
  public GNSS_NavigationModelSupport.orbitModelType setOrbitModelToNewInstance() {
    orbitModel_ = new GNSS_NavigationModelSupport.orbitModelType();
    return orbitModel_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getClockModel() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getClockModel();
          }

          @Override public void setToNewInstance() {
            setClockModelToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_NavigationModelSupport.clockModelType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "clockModel : "
                    + getClockModel().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getOrbitModel() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getOrbitModel();
          }

          @Override public void setToNewInstance() {
            setOrbitModelToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_NavigationModelSupport.orbitModelType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "orbitModel : "
                    + getOrbitModel().toIndentedString(indent);
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
public static class clockModelType extends Asn1BitString {
  //

  // defined bit positions, if any
  public static final int model_1 = 0;
  public static final int model_2 = 1;
  public static final int model_3 = 2;
  public static final int model_4 = 3;
  public static final int model_5 = 4;
  public static final int model_6 = 5;
  

  // setters
  public final void set_model_1() {
    ensureValuePopulated();
    getValue().set(0);
  }
  public final void set_model_2() {
    ensureValuePopulated();
    getValue().set(1);
  }
  public final void set_model_3() {
    ensureValuePopulated();
    getValue().set(2);
  }
  public final void set_model_4() {
    ensureValuePopulated();
    getValue().set(3);
  }
  public final void set_model_5() {
    ensureValuePopulated();
    getValue().set(4);
  }
  public final void set_model_6() {
    ensureValuePopulated();
    getValue().set(5);
  }
  

  // clearers
  public final boolean get_model_1() {
    ensureValuePopulated();
    return getValue().get(0);
  }
  public final boolean get_model_2() {
    ensureValuePopulated();
    return getValue().get(1);
  }
  public final boolean get_model_3() {
    ensureValuePopulated();
    return getValue().get(2);
  }
  public final boolean get_model_4() {
    ensureValuePopulated();
    return getValue().get(3);
  }
  public final boolean get_model_5() {
    ensureValuePopulated();
    return getValue().get(4);
  }
  public final boolean get_model_6() {
    ensureValuePopulated();
    return getValue().get(5);
  }
  


  private static final Asn1Tag TAG_clockModelType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public clockModelType() {
    super();
    setMinSize(1);
setMaxSize(8);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_clockModelType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_clockModelType != null) {
      return ImmutableList.of(TAG_clockModelType);
    } else {
      return Asn1BitString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new clockModelType from encoded stream.
   */
  public static clockModelType fromPerUnaligned(byte[] encodedBytes) {
    clockModelType result = new clockModelType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new clockModelType from encoded stream.
   */
  public static clockModelType fromPerAligned(byte[] encodedBytes) {
    clockModelType result = new clockModelType();
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
    return "clockModelType = " + getValue() + ";\n";
  }
}

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class orbitModelType extends Asn1BitString {
  //

  // defined bit positions, if any
  public static final int model_1 = 0;
  public static final int model_2 = 1;
  public static final int model_3 = 2;
  public static final int model_4 = 3;
  public static final int model_5 = 4;
  public static final int model_6 = 5;
  

  // setters
  public final void set_model_1() {
    ensureValuePopulated();
    getValue().set(0);
  }
  public final void set_model_2() {
    ensureValuePopulated();
    getValue().set(1);
  }
  public final void set_model_3() {
    ensureValuePopulated();
    getValue().set(2);
  }
  public final void set_model_4() {
    ensureValuePopulated();
    getValue().set(3);
  }
  public final void set_model_5() {
    ensureValuePopulated();
    getValue().set(4);
  }
  public final void set_model_6() {
    ensureValuePopulated();
    getValue().set(5);
  }
  

  // clearers
  public final boolean get_model_1() {
    ensureValuePopulated();
    return getValue().get(0);
  }
  public final boolean get_model_2() {
    ensureValuePopulated();
    return getValue().get(1);
  }
  public final boolean get_model_3() {
    ensureValuePopulated();
    return getValue().get(2);
  }
  public final boolean get_model_4() {
    ensureValuePopulated();
    return getValue().get(3);
  }
  public final boolean get_model_5() {
    ensureValuePopulated();
    return getValue().get(4);
  }
  public final boolean get_model_6() {
    ensureValuePopulated();
    return getValue().get(5);
  }
  


  private static final Asn1Tag TAG_orbitModelType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public orbitModelType() {
    super();
    setMinSize(1);
setMaxSize(8);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_orbitModelType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_orbitModelType != null) {
      return ImmutableList.of(TAG_orbitModelType);
    } else {
      return Asn1BitString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new orbitModelType from encoded stream.
   */
  public static orbitModelType fromPerUnaligned(byte[] encodedBytes) {
    orbitModelType result = new orbitModelType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new orbitModelType from encoded stream.
   */
  public static orbitModelType fromPerAligned(byte[] encodedBytes) {
    orbitModelType result = new orbitModelType();
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
    return "orbitModelType = " + getValue() + ";\n";
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
    builder.append("GNSS_NavigationModelSupport = {\n");
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
