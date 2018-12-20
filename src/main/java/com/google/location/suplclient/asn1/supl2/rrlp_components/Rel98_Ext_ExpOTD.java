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
public  class Rel98_Ext_ExpOTD extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_Rel98_Ext_ExpOTD
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public Rel98_Ext_ExpOTD() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_Rel98_Ext_ExpOTD;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_Rel98_Ext_ExpOTD != null) {
      return ImmutableList.of(TAG_Rel98_Ext_ExpOTD);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new Rel98_Ext_ExpOTD from encoded stream.
   */
  public static Rel98_Ext_ExpOTD fromPerUnaligned(byte[] encodedBytes) {
    Rel98_Ext_ExpOTD result = new Rel98_Ext_ExpOTD();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new Rel98_Ext_ExpOTD from encoded stream.
   */
  public static Rel98_Ext_ExpOTD fromPerAligned(byte[] encodedBytes) {
    Rel98_Ext_ExpOTD result = new Rel98_Ext_ExpOTD();
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

  
  private MsrAssistData_R98_ExpOTD msrAssistData_R98_ExpOTD_;
  public MsrAssistData_R98_ExpOTD getMsrAssistData_R98_ExpOTD() {
    return msrAssistData_R98_ExpOTD_;
  }
  /**
   * @throws ClassCastException if value is not a MsrAssistData_R98_ExpOTD
   */
  public void setMsrAssistData_R98_ExpOTD(Asn1Object value) {
    this.msrAssistData_R98_ExpOTD_ = (MsrAssistData_R98_ExpOTD) value;
  }
  public MsrAssistData_R98_ExpOTD setMsrAssistData_R98_ExpOTDToNewInstance() {
    msrAssistData_R98_ExpOTD_ = new MsrAssistData_R98_ExpOTD();
    return msrAssistData_R98_ExpOTD_;
  }
  
  private SystemInfoAssistData_R98_ExpOTD systemInfoAssistData_R98_ExpOTD_;
  public SystemInfoAssistData_R98_ExpOTD getSystemInfoAssistData_R98_ExpOTD() {
    return systemInfoAssistData_R98_ExpOTD_;
  }
  /**
   * @throws ClassCastException if value is not a SystemInfoAssistData_R98_ExpOTD
   */
  public void setSystemInfoAssistData_R98_ExpOTD(Asn1Object value) {
    this.systemInfoAssistData_R98_ExpOTD_ = (SystemInfoAssistData_R98_ExpOTD) value;
  }
  public SystemInfoAssistData_R98_ExpOTD setSystemInfoAssistData_R98_ExpOTDToNewInstance() {
    systemInfoAssistData_R98_ExpOTD_ = new SystemInfoAssistData_R98_ExpOTD();
    return systemInfoAssistData_R98_ExpOTD_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getMsrAssistData_R98_ExpOTD() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getMsrAssistData_R98_ExpOTD();
          }

          @Override public void setToNewInstance() {
            setMsrAssistData_R98_ExpOTDToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? MsrAssistData_R98_ExpOTD.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "msrAssistData_R98_ExpOTD : "
                    + getMsrAssistData_R98_ExpOTD().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getSystemInfoAssistData_R98_ExpOTD() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getSystemInfoAssistData_R98_ExpOTD();
          }

          @Override public void setToNewInstance() {
            setSystemInfoAssistData_R98_ExpOTDToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SystemInfoAssistData_R98_ExpOTD.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "systemInfoAssistData_R98_ExpOTD : "
                    + getSystemInfoAssistData_R98_ExpOTD().toIndentedString(indent);
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
    builder.append("Rel98_Ext_ExpOTD = {\n");
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
