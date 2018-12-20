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
public  class GridIonElement_r12 extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GridIonElement_r12
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GridIonElement_r12() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GridIonElement_r12;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GridIonElement_r12 != null) {
      return ImmutableList.of(TAG_GridIonElement_r12);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GridIonElement_r12 from encoded stream.
   */
  public static GridIonElement_r12 fromPerUnaligned(byte[] encodedBytes) {
    GridIonElement_r12 result = new GridIonElement_r12();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GridIonElement_r12 from encoded stream.
   */
  public static GridIonElement_r12 fromPerAligned(byte[] encodedBytes) {
    GridIonElement_r12 result = new GridIonElement_r12();
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

  
  private GridIonElement_r12.igp_ID_r12Type igp_ID_r12_;
  public GridIonElement_r12.igp_ID_r12Type getIgp_ID_r12() {
    return igp_ID_r12_;
  }
  /**
   * @throws ClassCastException if value is not a GridIonElement_r12.igp_ID_r12Type
   */
  public void setIgp_ID_r12(Asn1Object value) {
    this.igp_ID_r12_ = (GridIonElement_r12.igp_ID_r12Type) value;
  }
  public GridIonElement_r12.igp_ID_r12Type setIgp_ID_r12ToNewInstance() {
    igp_ID_r12_ = new GridIonElement_r12.igp_ID_r12Type();
    return igp_ID_r12_;
  }
  
  private GridIonElement_r12.dt_r12Type dt_r12_;
  public GridIonElement_r12.dt_r12Type getDt_r12() {
    return dt_r12_;
  }
  /**
   * @throws ClassCastException if value is not a GridIonElement_r12.dt_r12Type
   */
  public void setDt_r12(Asn1Object value) {
    this.dt_r12_ = (GridIonElement_r12.dt_r12Type) value;
  }
  public GridIonElement_r12.dt_r12Type setDt_r12ToNewInstance() {
    dt_r12_ = new GridIonElement_r12.dt_r12Type();
    return dt_r12_;
  }
  
  private GridIonElement_r12.givei_r12Type givei_r12_;
  public GridIonElement_r12.givei_r12Type getGivei_r12() {
    return givei_r12_;
  }
  /**
   * @throws ClassCastException if value is not a GridIonElement_r12.givei_r12Type
   */
  public void setGivei_r12(Asn1Object value) {
    this.givei_r12_ = (GridIonElement_r12.givei_r12Type) value;
  }
  public GridIonElement_r12.givei_r12Type setGivei_r12ToNewInstance() {
    givei_r12_ = new GridIonElement_r12.givei_r12Type();
    return givei_r12_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getIgp_ID_r12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getIgp_ID_r12();
          }

          @Override public void setToNewInstance() {
            setIgp_ID_r12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GridIonElement_r12.igp_ID_r12Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "igp_ID_r12 : "
                    + getIgp_ID_r12().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getDt_r12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getDt_r12();
          }

          @Override public void setToNewInstance() {
            setDt_r12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GridIonElement_r12.dt_r12Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "dt_r12 : "
                    + getDt_r12().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getGivei_r12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getGivei_r12();
          }

          @Override public void setToNewInstance() {
            setGivei_r12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GridIonElement_r12.givei_r12Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "givei_r12 : "
                    + getGivei_r12().toIndentedString(indent);
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
public static class igp_ID_r12Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_igp_ID_r12Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public igp_ID_r12Type() {
    super();
    setValueRange(new java.math.BigInteger("1"), new java.math.BigInteger("320"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_igp_ID_r12Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_igp_ID_r12Type != null) {
      return ImmutableList.of(TAG_igp_ID_r12Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new igp_ID_r12Type from encoded stream.
   */
  public static igp_ID_r12Type fromPerUnaligned(byte[] encodedBytes) {
    igp_ID_r12Type result = new igp_ID_r12Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new igp_ID_r12Type from encoded stream.
   */
  public static igp_ID_r12Type fromPerAligned(byte[] encodedBytes) {
    igp_ID_r12Type result = new igp_ID_r12Type();
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
    return "igp_ID_r12Type = " + getInteger() + ";\n";
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
public static class dt_r12Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_dt_r12Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public dt_r12Type() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("511"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_dt_r12Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_dt_r12Type != null) {
      return ImmutableList.of(TAG_dt_r12Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new dt_r12Type from encoded stream.
   */
  public static dt_r12Type fromPerUnaligned(byte[] encodedBytes) {
    dt_r12Type result = new dt_r12Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new dt_r12Type from encoded stream.
   */
  public static dt_r12Type fromPerAligned(byte[] encodedBytes) {
    dt_r12Type result = new dt_r12Type();
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
    return "dt_r12Type = " + getInteger() + ";\n";
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
public static class givei_r12Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_givei_r12Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public givei_r12Type() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("15"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_givei_r12Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_givei_r12Type != null) {
      return ImmutableList.of(TAG_givei_r12Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new givei_r12Type from encoded stream.
   */
  public static givei_r12Type fromPerUnaligned(byte[] encodedBytes) {
    givei_r12Type result = new givei_r12Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new givei_r12Type from encoded stream.
   */
  public static givei_r12Type fromPerAligned(byte[] encodedBytes) {
    givei_r12Type result = new givei_r12Type();
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
    return "givei_r12Type = " + getInteger() + ";\n";
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
    builder.append("GridIonElement_r12 = {\n");
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
