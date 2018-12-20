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
import com.google.location.suplclient.asn1.base.Asn1Null;
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
public  class GNSS_IonosphericModelReq extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GNSS_IonosphericModelReq
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GNSS_IonosphericModelReq() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GNSS_IonosphericModelReq;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GNSS_IonosphericModelReq != null) {
      return ImmutableList.of(TAG_GNSS_IonosphericModelReq);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GNSS_IonosphericModelReq from encoded stream.
   */
  public static GNSS_IonosphericModelReq fromPerUnaligned(byte[] encodedBytes) {
    GNSS_IonosphericModelReq result = new GNSS_IonosphericModelReq();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GNSS_IonosphericModelReq from encoded stream.
   */
  public static GNSS_IonosphericModelReq fromPerAligned(byte[] encodedBytes) {
    GNSS_IonosphericModelReq result = new GNSS_IonosphericModelReq();
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

  
  private GNSS_IonosphericModelReq.klobucharModelReqType klobucharModelReq_;
  public GNSS_IonosphericModelReq.klobucharModelReqType getKlobucharModelReq() {
    return klobucharModelReq_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_IonosphericModelReq.klobucharModelReqType
   */
  public void setKlobucharModelReq(Asn1Object value) {
    this.klobucharModelReq_ = (GNSS_IonosphericModelReq.klobucharModelReqType) value;
  }
  public GNSS_IonosphericModelReq.klobucharModelReqType setKlobucharModelReqToNewInstance() {
    klobucharModelReq_ = new GNSS_IonosphericModelReq.klobucharModelReqType();
    return klobucharModelReq_;
  }
  
  private GNSS_IonosphericModelReq.neQuickModelReqType neQuickModelReq_;
  public GNSS_IonosphericModelReq.neQuickModelReqType getNeQuickModelReq() {
    return neQuickModelReq_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_IonosphericModelReq.neQuickModelReqType
   */
  public void setNeQuickModelReq(Asn1Object value) {
    this.neQuickModelReq_ = (GNSS_IonosphericModelReq.neQuickModelReqType) value;
  }
  public GNSS_IonosphericModelReq.neQuickModelReqType setNeQuickModelReqToNewInstance() {
    neQuickModelReq_ = new GNSS_IonosphericModelReq.neQuickModelReqType();
    return neQuickModelReq_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getKlobucharModelReq() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getKlobucharModelReq();
          }

          @Override public void setToNewInstance() {
            setKlobucharModelReqToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_IonosphericModelReq.klobucharModelReqType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "klobucharModelReq : "
                    + getKlobucharModelReq().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getNeQuickModelReq() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getNeQuickModelReq();
          }

          @Override public void setToNewInstance() {
            setNeQuickModelReqToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_IonosphericModelReq.neQuickModelReqType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "neQuickModelReq : "
                    + getNeQuickModelReq().toIndentedString(indent);
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
public static class klobucharModelReqType extends Asn1BitString {
  //

  // defined bit positions, if any
  

  // setters
  

  // clearers
  


  private static final Asn1Tag TAG_klobucharModelReqType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public klobucharModelReqType() {
    super();
    setMinSize(2);
setMaxSize(2);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_klobucharModelReqType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_klobucharModelReqType != null) {
      return ImmutableList.of(TAG_klobucharModelReqType);
    } else {
      return Asn1BitString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new klobucharModelReqType from encoded stream.
   */
  public static klobucharModelReqType fromPerUnaligned(byte[] encodedBytes) {
    klobucharModelReqType result = new klobucharModelReqType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new klobucharModelReqType from encoded stream.
   */
  public static klobucharModelReqType fromPerAligned(byte[] encodedBytes) {
    klobucharModelReqType result = new klobucharModelReqType();
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
    return "klobucharModelReqType = " + getValue() + ";\n";
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
public static class neQuickModelReqType extends Asn1Null {
  //

  private static final Asn1Tag TAG_neQuickModelReqType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public neQuickModelReqType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_neQuickModelReqType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_neQuickModelReqType != null) {
      return ImmutableList.of(TAG_neQuickModelReqType);
    } else {
      return Asn1Null.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new neQuickModelReqType from encoded stream.
   */
  public static neQuickModelReqType fromPerUnaligned(byte[] encodedBytes) {
    neQuickModelReqType result = new neQuickModelReqType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new neQuickModelReqType from encoded stream.
   */
  public static neQuickModelReqType fromPerAligned(byte[] encodedBytes) {
    neQuickModelReqType result = new neQuickModelReqType();
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
    return "neQuickModelReqType (null value);\n";
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
    builder.append("GNSS_IonosphericModelReq = {\n");
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
