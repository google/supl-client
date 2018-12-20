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

package com.google.location.suplclient.asn1.supl2.ulp_components;

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
public  class MeasuredResults extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_MeasuredResults
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public MeasuredResults() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_MeasuredResults;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_MeasuredResults != null) {
      return ImmutableList.of(TAG_MeasuredResults);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new MeasuredResults from encoded stream.
   */
  public static MeasuredResults fromPerUnaligned(byte[] encodedBytes) {
    MeasuredResults result = new MeasuredResults();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new MeasuredResults from encoded stream.
   */
  public static MeasuredResults fromPerAligned(byte[] encodedBytes) {
    MeasuredResults result = new MeasuredResults();
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

  
  private FrequencyInfo frequencyInfo_;
  public FrequencyInfo getFrequencyInfo() {
    return frequencyInfo_;
  }
  /**
   * @throws ClassCastException if value is not a FrequencyInfo
   */
  public void setFrequencyInfo(Asn1Object value) {
    this.frequencyInfo_ = (FrequencyInfo) value;
  }
  public FrequencyInfo setFrequencyInfoToNewInstance() {
    frequencyInfo_ = new FrequencyInfo();
    return frequencyInfo_;
  }
  
  private UTRA_CarrierRSSI utra_CarrierRSSI_;
  public UTRA_CarrierRSSI getUtra_CarrierRSSI() {
    return utra_CarrierRSSI_;
  }
  /**
   * @throws ClassCastException if value is not a UTRA_CarrierRSSI
   */
  public void setUtra_CarrierRSSI(Asn1Object value) {
    this.utra_CarrierRSSI_ = (UTRA_CarrierRSSI) value;
  }
  public UTRA_CarrierRSSI setUtra_CarrierRSSIToNewInstance() {
    utra_CarrierRSSI_ = new UTRA_CarrierRSSI();
    return utra_CarrierRSSI_;
  }
  
  private CellMeasuredResultsList cellMeasuredResultsList_;
  public CellMeasuredResultsList getCellMeasuredResultsList() {
    return cellMeasuredResultsList_;
  }
  /**
   * @throws ClassCastException if value is not a CellMeasuredResultsList
   */
  public void setCellMeasuredResultsList(Asn1Object value) {
    this.cellMeasuredResultsList_ = (CellMeasuredResultsList) value;
  }
  public CellMeasuredResultsList setCellMeasuredResultsListToNewInstance() {
    cellMeasuredResultsList_ = new CellMeasuredResultsList();
    return cellMeasuredResultsList_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getFrequencyInfo() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getFrequencyInfo();
          }

          @Override public void setToNewInstance() {
            setFrequencyInfoToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? FrequencyInfo.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "frequencyInfo : "
                    + getFrequencyInfo().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getUtra_CarrierRSSI() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getUtra_CarrierRSSI();
          }

          @Override public void setToNewInstance() {
            setUtra_CarrierRSSIToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UTRA_CarrierRSSI.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "utra_CarrierRSSI : "
                    + getUtra_CarrierRSSI().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getCellMeasuredResultsList() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getCellMeasuredResultsList();
          }

          @Override public void setToNewInstance() {
            setCellMeasuredResultsListToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? CellMeasuredResultsList.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "cellMeasuredResultsList : "
                    + getCellMeasuredResultsList().toIndentedString(indent);
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
    builder.append("MeasuredResults = {\n");
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
