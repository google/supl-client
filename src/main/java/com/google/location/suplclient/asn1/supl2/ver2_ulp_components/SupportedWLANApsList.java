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

package com.google.location.suplclient.asn1.supl2.ver2_ulp_components;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.google.location.suplclient.asn1.base.Asn1Object;
import com.google.location.suplclient.asn1.base.Asn1Sequence;
import com.google.location.suplclient.asn1.base.Asn1SequenceOf;
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
public  class SupportedWLANApsList extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_SupportedWLANApsList
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public SupportedWLANApsList() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_SupportedWLANApsList;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_SupportedWLANApsList != null) {
      return ImmutableList.of(TAG_SupportedWLANApsList);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new SupportedWLANApsList from encoded stream.
   */
  public static SupportedWLANApsList fromPerUnaligned(byte[] encodedBytes) {
    SupportedWLANApsList result = new SupportedWLANApsList();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new SupportedWLANApsList from encoded stream.
   */
  public static SupportedWLANApsList fromPerAligned(byte[] encodedBytes) {
    SupportedWLANApsList result = new SupportedWLANApsList();
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

  
  private SupportedWLANApsList.supportedWLANApDataListType supportedWLANApDataList_;
  public SupportedWLANApsList.supportedWLANApDataListType getSupportedWLANApDataList() {
    return supportedWLANApDataList_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedWLANApsList.supportedWLANApDataListType
   */
  public void setSupportedWLANApDataList(Asn1Object value) {
    this.supportedWLANApDataList_ = (SupportedWLANApsList.supportedWLANApDataListType) value;
  }
  public SupportedWLANApsList.supportedWLANApDataListType setSupportedWLANApDataListToNewInstance() {
    supportedWLANApDataList_ = new SupportedWLANApsList.supportedWLANApDataListType();
    return supportedWLANApDataList_;
  }
  
  private SupportedWLANApsChannel11a supportedWLANapsChannel11a_;
  public SupportedWLANApsChannel11a getSupportedWLANapsChannel11a() {
    return supportedWLANapsChannel11a_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedWLANApsChannel11a
   */
  public void setSupportedWLANapsChannel11a(Asn1Object value) {
    this.supportedWLANapsChannel11a_ = (SupportedWLANApsChannel11a) value;
  }
  public SupportedWLANApsChannel11a setSupportedWLANapsChannel11aToNewInstance() {
    supportedWLANapsChannel11a_ = new SupportedWLANApsChannel11a();
    return supportedWLANapsChannel11a_;
  }
  
  private SupportedWLANApsChannel11bg supportedWLANapsChannel11bg_;
  public SupportedWLANApsChannel11bg getSupportedWLANapsChannel11bg() {
    return supportedWLANapsChannel11bg_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedWLANApsChannel11bg
   */
  public void setSupportedWLANapsChannel11bg(Asn1Object value) {
    this.supportedWLANapsChannel11bg_ = (SupportedWLANApsChannel11bg) value;
  }
  public SupportedWLANApsChannel11bg setSupportedWLANapsChannel11bgToNewInstance() {
    supportedWLANapsChannel11bg_ = new SupportedWLANApsChannel11bg();
    return supportedWLANapsChannel11bg_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getSupportedWLANApDataList() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getSupportedWLANApDataList();
          }

          @Override public void setToNewInstance() {
            setSupportedWLANApDataListToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedWLANApsList.supportedWLANApDataListType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "supportedWLANApDataList : "
                    + getSupportedWLANApDataList().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getSupportedWLANapsChannel11a() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getSupportedWLANapsChannel11a();
          }

          @Override public void setToNewInstance() {
            setSupportedWLANapsChannel11aToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedWLANApsChannel11a.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "supportedWLANapsChannel11a : "
                    + getSupportedWLANapsChannel11a().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getSupportedWLANapsChannel11bg() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getSupportedWLANapsChannel11bg();
          }

          @Override public void setToNewInstance() {
            setSupportedWLANapsChannel11bgToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedWLANApsChannel11bg.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "supportedWLANapsChannel11bg : "
                    + getSupportedWLANapsChannel11bg().toIndentedString(indent);
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
public static class supportedWLANApDataListType
    extends Asn1SequenceOf<SupportedWLANApData> {
  //

  private static final Asn1Tag TAG_supportedWLANApDataListType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public supportedWLANApDataListType() {
    super();
    setMinSize(1);
setMaxSize(128);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_supportedWLANApDataListType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_supportedWLANApDataListType != null) {
      return ImmutableList.of(TAG_supportedWLANApDataListType);
    } else {
      return Asn1SequenceOf.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new supportedWLANApDataListType from encoded stream.
   */
  public static supportedWLANApDataListType fromPerUnaligned(byte[] encodedBytes) {
    supportedWLANApDataListType result = new supportedWLANApDataListType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new supportedWLANApDataListType from encoded stream.
   */
  public static supportedWLANApDataListType fromPerAligned(byte[] encodedBytes) {
    supportedWLANApDataListType result = new supportedWLANApDataListType();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  
  @Override public SupportedWLANApData createAndAddValue() {
    SupportedWLANApData value = new SupportedWLANApData();
    add(value);
    return value;
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
    builder.append("supportedWLANApDataListType = [\n");
    final String internalIndent = indent + "  ";
    for (SupportedWLANApData value : getValues()) {
      builder.append(internalIndent)
          .append(value.toIndentedString(internalIndent));
    }
    builder.append(indent).append("];\n");
    return builder.toString();
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
    builder.append("SupportedWLANApsList = {\n");
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
