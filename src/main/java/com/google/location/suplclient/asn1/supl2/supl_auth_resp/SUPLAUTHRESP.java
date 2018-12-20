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

package com.google.location.suplclient.asn1.supl2.supl_auth_resp;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.google.location.suplclient.asn1.base.Asn1Object;
import com.google.location.suplclient.asn1.base.Asn1Sequence;
import com.google.location.suplclient.asn1.base.Asn1Tag;
import com.google.location.suplclient.asn1.base.BitStream;
import com.google.location.suplclient.asn1.base.BitStreamReader;
import com.google.location.suplclient.asn1.base.SequenceComponent;
import com.google.location.suplclient.asn1.supl2.ver2_ulp_components.SPCSETKey;
import com.google.location.suplclient.asn1.supl2.ver2_ulp_components.SPCSETKeylifetime;
import com.google.location.suplclient.asn1.supl2.ver2_ulp_components.SPCTID;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
* 
*/
public  class SUPLAUTHRESP extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_SUPLAUTHRESP
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public SUPLAUTHRESP() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_SUPLAUTHRESP;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_SUPLAUTHRESP != null) {
      return ImmutableList.of(TAG_SUPLAUTHRESP);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new SUPLAUTHRESP from encoded stream.
   */
  public static SUPLAUTHRESP fromPerUnaligned(byte[] encodedBytes) {
    SUPLAUTHRESP result = new SUPLAUTHRESP();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new SUPLAUTHRESP from encoded stream.
   */
  public static SUPLAUTHRESP fromPerAligned(byte[] encodedBytes) {
    SUPLAUTHRESP result = new SUPLAUTHRESP();
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

  
  private SPCSETKey sPCSETKey_;
  public SPCSETKey getSPCSETKey() {
    return sPCSETKey_;
  }
  /**
   * @throws ClassCastException if value is not a SPCSETKey
   */
  public void setSPCSETKey(Asn1Object value) {
    this.sPCSETKey_ = (SPCSETKey) value;
  }
  public SPCSETKey setSPCSETKeyToNewInstance() {
    sPCSETKey_ = new SPCSETKey();
    return sPCSETKey_;
  }
  
  private SPCTID sPCTID_;
  public SPCTID getSPCTID() {
    return sPCTID_;
  }
  /**
   * @throws ClassCastException if value is not a SPCTID
   */
  public void setSPCTID(Asn1Object value) {
    this.sPCTID_ = (SPCTID) value;
  }
  public SPCTID setSPCTIDToNewInstance() {
    sPCTID_ = new SPCTID();
    return sPCTID_;
  }
  
  private SPCSETKeylifetime sPCSETKeylifetime_;
  public SPCSETKeylifetime getSPCSETKeylifetime() {
    return sPCSETKeylifetime_;
  }
  /**
   * @throws ClassCastException if value is not a SPCSETKeylifetime
   */
  public void setSPCSETKeylifetime(Asn1Object value) {
    this.sPCSETKeylifetime_ = (SPCSETKeylifetime) value;
  }
  public SPCSETKeylifetime setSPCSETKeylifetimeToNewInstance() {
    sPCSETKeylifetime_ = new SPCSETKeylifetime();
    return sPCSETKeylifetime_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getSPCSETKey() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getSPCSETKey();
          }

          @Override public void setToNewInstance() {
            setSPCSETKeyToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SPCSETKey.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "sPCSETKey : "
                    + getSPCSETKey().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getSPCTID() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getSPCTID();
          }

          @Override public void setToNewInstance() {
            setSPCTIDToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SPCTID.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "sPCTID : "
                    + getSPCTID().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getSPCSETKeylifetime() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getSPCSETKeylifetime();
          }

          @Override public void setToNewInstance() {
            setSPCSETKeylifetimeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SPCSETKeylifetime.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "sPCSETKeylifetime : "
                    + getSPCSETKeylifetime().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      return builder.build();
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
    builder.append("SUPLAUTHRESP = {\n");
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
