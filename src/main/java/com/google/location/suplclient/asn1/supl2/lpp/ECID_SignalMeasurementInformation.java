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
public  class ECID_SignalMeasurementInformation extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_ECID_SignalMeasurementInformation
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ECID_SignalMeasurementInformation() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ECID_SignalMeasurementInformation;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ECID_SignalMeasurementInformation != null) {
      return ImmutableList.of(TAG_ECID_SignalMeasurementInformation);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ECID_SignalMeasurementInformation from encoded stream.
   */
  public static ECID_SignalMeasurementInformation fromPerUnaligned(byte[] encodedBytes) {
    ECID_SignalMeasurementInformation result = new ECID_SignalMeasurementInformation();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ECID_SignalMeasurementInformation from encoded stream.
   */
  public static ECID_SignalMeasurementInformation fromPerAligned(byte[] encodedBytes) {
    ECID_SignalMeasurementInformation result = new ECID_SignalMeasurementInformation();
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

  
  private MeasuredResultsElement primaryCellMeasuredResults_;
  public MeasuredResultsElement getPrimaryCellMeasuredResults() {
    return primaryCellMeasuredResults_;
  }
  /**
   * @throws ClassCastException if value is not a MeasuredResultsElement
   */
  public void setPrimaryCellMeasuredResults(Asn1Object value) {
    this.primaryCellMeasuredResults_ = (MeasuredResultsElement) value;
  }
  public MeasuredResultsElement setPrimaryCellMeasuredResultsToNewInstance() {
    primaryCellMeasuredResults_ = new MeasuredResultsElement();
    return primaryCellMeasuredResults_;
  }
  
  private MeasuredResultsList measuredResultsList_;
  public MeasuredResultsList getMeasuredResultsList() {
    return measuredResultsList_;
  }
  /**
   * @throws ClassCastException if value is not a MeasuredResultsList
   */
  public void setMeasuredResultsList(Asn1Object value) {
    this.measuredResultsList_ = (MeasuredResultsList) value;
  }
  public MeasuredResultsList setMeasuredResultsListToNewInstance() {
    measuredResultsList_ = new MeasuredResultsList();
    return measuredResultsList_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getPrimaryCellMeasuredResults() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getPrimaryCellMeasuredResults();
          }

          @Override public void setToNewInstance() {
            setPrimaryCellMeasuredResultsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? MeasuredResultsElement.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "primaryCellMeasuredResults : "
                    + getPrimaryCellMeasuredResults().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getMeasuredResultsList() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getMeasuredResultsList();
          }

          @Override public void setToNewInstance() {
            setMeasuredResultsListToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? MeasuredResultsList.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "measuredResultsList : "
                    + getMeasuredResultsList().toIndentedString(indent);
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
    builder.append("ECID_SignalMeasurementInformation = {\n");
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
