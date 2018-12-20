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
public  class SystemInfoAssistData_R98_ExpOTD extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_SystemInfoAssistData_R98_ExpOTD
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public SystemInfoAssistData_R98_ExpOTD() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_SystemInfoAssistData_R98_ExpOTD;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_SystemInfoAssistData_R98_ExpOTD != null) {
      return ImmutableList.of(TAG_SystemInfoAssistData_R98_ExpOTD);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new SystemInfoAssistData_R98_ExpOTD from encoded stream.
   */
  public static SystemInfoAssistData_R98_ExpOTD fromPerUnaligned(byte[] encodedBytes) {
    SystemInfoAssistData_R98_ExpOTD result = new SystemInfoAssistData_R98_ExpOTD();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new SystemInfoAssistData_R98_ExpOTD from encoded stream.
   */
  public static SystemInfoAssistData_R98_ExpOTD fromPerAligned(byte[] encodedBytes) {
    SystemInfoAssistData_R98_ExpOTD result = new SystemInfoAssistData_R98_ExpOTD();
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

  
  private SeqOfSystemInfoAssistBTS_R98_ExpOTD systemInfoAssistListR98_ExpOTD_;
  public SeqOfSystemInfoAssistBTS_R98_ExpOTD getSystemInfoAssistListR98_ExpOTD() {
    return systemInfoAssistListR98_ExpOTD_;
  }
  /**
   * @throws ClassCastException if value is not a SeqOfSystemInfoAssistBTS_R98_ExpOTD
   */
  public void setSystemInfoAssistListR98_ExpOTD(Asn1Object value) {
    this.systemInfoAssistListR98_ExpOTD_ = (SeqOfSystemInfoAssistBTS_R98_ExpOTD) value;
  }
  public SeqOfSystemInfoAssistBTS_R98_ExpOTD setSystemInfoAssistListR98_ExpOTDToNewInstance() {
    systemInfoAssistListR98_ExpOTD_ = new SeqOfSystemInfoAssistBTS_R98_ExpOTD();
    return systemInfoAssistListR98_ExpOTD_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getSystemInfoAssistListR98_ExpOTD() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getSystemInfoAssistListR98_ExpOTD();
          }

          @Override public void setToNewInstance() {
            setSystemInfoAssistListR98_ExpOTDToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SeqOfSystemInfoAssistBTS_R98_ExpOTD.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "systemInfoAssistListR98_ExpOTD : "
                    + getSystemInfoAssistListR98_ExpOTD().toIndentedString(indent);
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
    builder.append("SystemInfoAssistData_R98_ExpOTD = {\n");
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
