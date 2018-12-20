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
import com.google.location.suplclient.asn1.base.Asn1Boolean;
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
public  class GNSS_DifferentialCorrectionsReq extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GNSS_DifferentialCorrectionsReq
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GNSS_DifferentialCorrectionsReq() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GNSS_DifferentialCorrectionsReq;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GNSS_DifferentialCorrectionsReq != null) {
      return ImmutableList.of(TAG_GNSS_DifferentialCorrectionsReq);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GNSS_DifferentialCorrectionsReq from encoded stream.
   */
  public static GNSS_DifferentialCorrectionsReq fromPerUnaligned(byte[] encodedBytes) {
    GNSS_DifferentialCorrectionsReq result = new GNSS_DifferentialCorrectionsReq();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GNSS_DifferentialCorrectionsReq from encoded stream.
   */
  public static GNSS_DifferentialCorrectionsReq fromPerAligned(byte[] encodedBytes) {
    GNSS_DifferentialCorrectionsReq result = new GNSS_DifferentialCorrectionsReq();
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

  
  private GNSS_SignalIDs dgnss_SignalsReq_;
  public GNSS_SignalIDs getDgnss_SignalsReq() {
    return dgnss_SignalsReq_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_SignalIDs
   */
  public void setDgnss_SignalsReq(Asn1Object value) {
    this.dgnss_SignalsReq_ = (GNSS_SignalIDs) value;
  }
  public GNSS_SignalIDs setDgnss_SignalsReqToNewInstance() {
    dgnss_SignalsReq_ = new GNSS_SignalIDs();
    return dgnss_SignalsReq_;
  }
  
  private GNSS_DifferentialCorrectionsReq.dgnss_ValidityTimeReqType dgnss_ValidityTimeReq_;
  public GNSS_DifferentialCorrectionsReq.dgnss_ValidityTimeReqType getDgnss_ValidityTimeReq() {
    return dgnss_ValidityTimeReq_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_DifferentialCorrectionsReq.dgnss_ValidityTimeReqType
   */
  public void setDgnss_ValidityTimeReq(Asn1Object value) {
    this.dgnss_ValidityTimeReq_ = (GNSS_DifferentialCorrectionsReq.dgnss_ValidityTimeReqType) value;
  }
  public GNSS_DifferentialCorrectionsReq.dgnss_ValidityTimeReqType setDgnss_ValidityTimeReqToNewInstance() {
    dgnss_ValidityTimeReq_ = new GNSS_DifferentialCorrectionsReq.dgnss_ValidityTimeReqType();
    return dgnss_ValidityTimeReq_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getDgnss_SignalsReq() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getDgnss_SignalsReq();
          }

          @Override public void setToNewInstance() {
            setDgnss_SignalsReqToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_SignalIDs.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "dgnss_SignalsReq : "
                    + getDgnss_SignalsReq().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getDgnss_ValidityTimeReq() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getDgnss_ValidityTimeReq();
          }

          @Override public void setToNewInstance() {
            setDgnss_ValidityTimeReqToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_DifferentialCorrectionsReq.dgnss_ValidityTimeReqType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "dgnss_ValidityTimeReq : "
                    + getDgnss_ValidityTimeReq().toIndentedString(indent);
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
public static class dgnss_ValidityTimeReqType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_dgnss_ValidityTimeReqType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public dgnss_ValidityTimeReqType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_dgnss_ValidityTimeReqType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_dgnss_ValidityTimeReqType != null) {
      return ImmutableList.of(TAG_dgnss_ValidityTimeReqType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new dgnss_ValidityTimeReqType from encoded stream.
   */
  public static dgnss_ValidityTimeReqType fromPerUnaligned(byte[] encodedBytes) {
    dgnss_ValidityTimeReqType result = new dgnss_ValidityTimeReqType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new dgnss_ValidityTimeReqType from encoded stream.
   */
  public static dgnss_ValidityTimeReqType fromPerAligned(byte[] encodedBytes) {
    dgnss_ValidityTimeReqType result = new dgnss_ValidityTimeReqType();
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
    return "dgnss_ValidityTimeReqType = " + getValue() + ";\n";
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
    builder.append("GNSS_DifferentialCorrectionsReq = {\n");
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
