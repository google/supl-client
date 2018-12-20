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
public  class OTDOA_ProvideAssistanceData extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_OTDOA_ProvideAssistanceData
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public OTDOA_ProvideAssistanceData() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_OTDOA_ProvideAssistanceData;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_OTDOA_ProvideAssistanceData != null) {
      return ImmutableList.of(TAG_OTDOA_ProvideAssistanceData);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new OTDOA_ProvideAssistanceData from encoded stream.
   */
  public static OTDOA_ProvideAssistanceData fromPerUnaligned(byte[] encodedBytes) {
    OTDOA_ProvideAssistanceData result = new OTDOA_ProvideAssistanceData();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new OTDOA_ProvideAssistanceData from encoded stream.
   */
  public static OTDOA_ProvideAssistanceData fromPerAligned(byte[] encodedBytes) {
    OTDOA_ProvideAssistanceData result = new OTDOA_ProvideAssistanceData();
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

  
  private OTDOA_ReferenceCellInfo otdoa_ReferenceCellInfo_;
  public OTDOA_ReferenceCellInfo getOtdoa_ReferenceCellInfo() {
    return otdoa_ReferenceCellInfo_;
  }
  /**
   * @throws ClassCastException if value is not a OTDOA_ReferenceCellInfo
   */
  public void setOtdoa_ReferenceCellInfo(Asn1Object value) {
    this.otdoa_ReferenceCellInfo_ = (OTDOA_ReferenceCellInfo) value;
  }
  public OTDOA_ReferenceCellInfo setOtdoa_ReferenceCellInfoToNewInstance() {
    otdoa_ReferenceCellInfo_ = new OTDOA_ReferenceCellInfo();
    return otdoa_ReferenceCellInfo_;
  }
  
  private OTDOA_NeighbourCellInfoList otdoa_NeighbourCellInfo_;
  public OTDOA_NeighbourCellInfoList getOtdoa_NeighbourCellInfo() {
    return otdoa_NeighbourCellInfo_;
  }
  /**
   * @throws ClassCastException if value is not a OTDOA_NeighbourCellInfoList
   */
  public void setOtdoa_NeighbourCellInfo(Asn1Object value) {
    this.otdoa_NeighbourCellInfo_ = (OTDOA_NeighbourCellInfoList) value;
  }
  public OTDOA_NeighbourCellInfoList setOtdoa_NeighbourCellInfoToNewInstance() {
    otdoa_NeighbourCellInfo_ = new OTDOA_NeighbourCellInfoList();
    return otdoa_NeighbourCellInfo_;
  }
  
  private OTDOA_Error otdoa_Error_;
  public OTDOA_Error getOtdoa_Error() {
    return otdoa_Error_;
  }
  /**
   * @throws ClassCastException if value is not a OTDOA_Error
   */
  public void setOtdoa_Error(Asn1Object value) {
    this.otdoa_Error_ = (OTDOA_Error) value;
  }
  public OTDOA_Error setOtdoa_ErrorToNewInstance() {
    otdoa_Error_ = new OTDOA_Error();
    return otdoa_Error_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getOtdoa_ReferenceCellInfo() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getOtdoa_ReferenceCellInfo();
          }

          @Override public void setToNewInstance() {
            setOtdoa_ReferenceCellInfoToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? OTDOA_ReferenceCellInfo.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "otdoa_ReferenceCellInfo : "
                    + getOtdoa_ReferenceCellInfo().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getOtdoa_NeighbourCellInfo() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getOtdoa_NeighbourCellInfo();
          }

          @Override public void setToNewInstance() {
            setOtdoa_NeighbourCellInfoToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? OTDOA_NeighbourCellInfoList.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "otdoa_NeighbourCellInfo : "
                    + getOtdoa_NeighbourCellInfo().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getOtdoa_Error() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getOtdoa_Error();
          }

          @Override public void setToNewInstance() {
            setOtdoa_ErrorToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? OTDOA_Error.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "otdoa_Error : "
                    + getOtdoa_Error().toIndentedString(indent);
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
    builder.append("OTDOA_ProvideAssistanceData = {\n");
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
