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

package com.google.location.suplclient.asn1.supl2.rrlp_components;

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
public  class MultipleSets extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_MultipleSets
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public MultipleSets() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_MultipleSets;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_MultipleSets != null) {
      return ImmutableList.of(TAG_MultipleSets);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new MultipleSets from encoded stream.
   */
  public static MultipleSets fromPerUnaligned(byte[] encodedBytes) {
    MultipleSets result = new MultipleSets();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new MultipleSets from encoded stream.
   */
  public static MultipleSets fromPerAligned(byte[] encodedBytes) {
    MultipleSets result = new MultipleSets();
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

  
  private MultipleSets.nbrOfSetsType nbrOfSets_;
  public MultipleSets.nbrOfSetsType getNbrOfSets() {
    return nbrOfSets_;
  }
  /**
   * @throws ClassCastException if value is not a MultipleSets.nbrOfSetsType
   */
  public void setNbrOfSets(Asn1Object value) {
    this.nbrOfSets_ = (MultipleSets.nbrOfSetsType) value;
  }
  public MultipleSets.nbrOfSetsType setNbrOfSetsToNewInstance() {
    nbrOfSets_ = new MultipleSets.nbrOfSetsType();
    return nbrOfSets_;
  }
  
  private MultipleSets.nbrOfReferenceBTSsType nbrOfReferenceBTSs_;
  public MultipleSets.nbrOfReferenceBTSsType getNbrOfReferenceBTSs() {
    return nbrOfReferenceBTSs_;
  }
  /**
   * @throws ClassCastException if value is not a MultipleSets.nbrOfReferenceBTSsType
   */
  public void setNbrOfReferenceBTSs(Asn1Object value) {
    this.nbrOfReferenceBTSs_ = (MultipleSets.nbrOfReferenceBTSsType) value;
  }
  public MultipleSets.nbrOfReferenceBTSsType setNbrOfReferenceBTSsToNewInstance() {
    nbrOfReferenceBTSs_ = new MultipleSets.nbrOfReferenceBTSsType();
    return nbrOfReferenceBTSs_;
  }
  
  private ReferenceRelation referenceRelation_;
  public ReferenceRelation getReferenceRelation() {
    return referenceRelation_;
  }
  /**
   * @throws ClassCastException if value is not a ReferenceRelation
   */
  public void setReferenceRelation(Asn1Object value) {
    this.referenceRelation_ = (ReferenceRelation) value;
  }
  public ReferenceRelation setReferenceRelationToNewInstance() {
    referenceRelation_ = new ReferenceRelation();
    return referenceRelation_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getNbrOfSets() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getNbrOfSets();
          }

          @Override public void setToNewInstance() {
            setNbrOfSetsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? MultipleSets.nbrOfSetsType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "nbrOfSets : "
                    + getNbrOfSets().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getNbrOfReferenceBTSs() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getNbrOfReferenceBTSs();
          }

          @Override public void setToNewInstance() {
            setNbrOfReferenceBTSsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? MultipleSets.nbrOfReferenceBTSsType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "nbrOfReferenceBTSs : "
                    + getNbrOfReferenceBTSs().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getReferenceRelation() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getReferenceRelation();
          }

          @Override public void setToNewInstance() {
            setReferenceRelationToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ReferenceRelation.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "referenceRelation : "
                    + getReferenceRelation().toIndentedString(indent);
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
public static class nbrOfSetsType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_nbrOfSetsType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public nbrOfSetsType() {
    super();
    setValueRange(new java.math.BigInteger("2"), new java.math.BigInteger("3"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_nbrOfSetsType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_nbrOfSetsType != null) {
      return ImmutableList.of(TAG_nbrOfSetsType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new nbrOfSetsType from encoded stream.
   */
  public static nbrOfSetsType fromPerUnaligned(byte[] encodedBytes) {
    nbrOfSetsType result = new nbrOfSetsType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new nbrOfSetsType from encoded stream.
   */
  public static nbrOfSetsType fromPerAligned(byte[] encodedBytes) {
    nbrOfSetsType result = new nbrOfSetsType();
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
    return "nbrOfSetsType = " + getInteger() + ";\n";
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
public static class nbrOfReferenceBTSsType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_nbrOfReferenceBTSsType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public nbrOfReferenceBTSsType() {
    super();
    setValueRange(new java.math.BigInteger("1"), new java.math.BigInteger("3"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_nbrOfReferenceBTSsType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_nbrOfReferenceBTSsType != null) {
      return ImmutableList.of(TAG_nbrOfReferenceBTSsType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new nbrOfReferenceBTSsType from encoded stream.
   */
  public static nbrOfReferenceBTSsType fromPerUnaligned(byte[] encodedBytes) {
    nbrOfReferenceBTSsType result = new nbrOfReferenceBTSsType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new nbrOfReferenceBTSsType from encoded stream.
   */
  public static nbrOfReferenceBTSsType fromPerAligned(byte[] encodedBytes) {
    nbrOfReferenceBTSsType result = new nbrOfReferenceBTSsType();
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
    return "nbrOfReferenceBTSsType = " + getInteger() + ";\n";
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
    builder.append("MultipleSets = {\n");
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
