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
public  class ReportingCap extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_ReportingCap
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ReportingCap() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ReportingCap;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ReportingCap != null) {
      return ImmutableList.of(TAG_ReportingCap);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ReportingCap from encoded stream.
   */
  public static ReportingCap fromPerUnaligned(byte[] encodedBytes) {
    ReportingCap result = new ReportingCap();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ReportingCap from encoded stream.
   */
  public static ReportingCap fromPerAligned(byte[] encodedBytes) {
    ReportingCap result = new ReportingCap();
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

  
  private ReportingCap.minIntType minInt_;
  public ReportingCap.minIntType getMinInt() {
    return minInt_;
  }
  /**
   * @throws ClassCastException if value is not a ReportingCap.minIntType
   */
  public void setMinInt(Asn1Object value) {
    this.minInt_ = (ReportingCap.minIntType) value;
  }
  public ReportingCap.minIntType setMinIntToNewInstance() {
    minInt_ = new ReportingCap.minIntType();
    return minInt_;
  }
  
  private ReportingCap.maxIntType maxInt_;
  public ReportingCap.maxIntType getMaxInt() {
    return maxInt_;
  }
  /**
   * @throws ClassCastException if value is not a ReportingCap.maxIntType
   */
  public void setMaxInt(Asn1Object value) {
    this.maxInt_ = (ReportingCap.maxIntType) value;
  }
  public ReportingCap.maxIntType setMaxIntToNewInstance() {
    maxInt_ = new ReportingCap.maxIntType();
    return maxInt_;
  }
  
  private RepMode_cap repMode_;
  public RepMode_cap getRepMode() {
    return repMode_;
  }
  /**
   * @throws ClassCastException if value is not a RepMode_cap
   */
  public void setRepMode(Asn1Object value) {
    this.repMode_ = (RepMode_cap) value;
  }
  public RepMode_cap setRepModeToNewInstance() {
    repMode_ = new RepMode_cap();
    return repMode_;
  }
  
  private BatchRepCap batchRepCap_;
  public BatchRepCap getBatchRepCap() {
    return batchRepCap_;
  }
  /**
   * @throws ClassCastException if value is not a BatchRepCap
   */
  public void setBatchRepCap(Asn1Object value) {
    this.batchRepCap_ = (BatchRepCap) value;
  }
  public BatchRepCap setBatchRepCapToNewInstance() {
    batchRepCap_ = new BatchRepCap();
    return batchRepCap_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getMinInt() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getMinInt();
          }

          @Override public void setToNewInstance() {
            setMinIntToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ReportingCap.minIntType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "minInt : "
                    + getMinInt().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getMaxInt() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getMaxInt();
          }

          @Override public void setToNewInstance() {
            setMaxIntToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ReportingCap.maxIntType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "maxInt : "
                    + getMaxInt().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getRepMode() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getRepMode();
          }

          @Override public void setToNewInstance() {
            setRepModeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? RepMode_cap.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "repMode : "
                    + getRepMode().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getBatchRepCap() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getBatchRepCap();
          }

          @Override public void setToNewInstance() {
            setBatchRepCapToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? BatchRepCap.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "batchRepCap : "
                    + getBatchRepCap().toIndentedString(indent);
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
public static class minIntType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_minIntType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public minIntType() {
    super();
    setValueRange(new java.math.BigInteger("1"), new java.math.BigInteger("3600"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_minIntType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_minIntType != null) {
      return ImmutableList.of(TAG_minIntType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new minIntType from encoded stream.
   */
  public static minIntType fromPerUnaligned(byte[] encodedBytes) {
    minIntType result = new minIntType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new minIntType from encoded stream.
   */
  public static minIntType fromPerAligned(byte[] encodedBytes) {
    minIntType result = new minIntType();
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
    return "minIntType = " + getInteger() + ";\n";
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
public static class maxIntType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_maxIntType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public maxIntType() {
    super();
    setValueRange(new java.math.BigInteger("1"), new java.math.BigInteger("1440"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_maxIntType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_maxIntType != null) {
      return ImmutableList.of(TAG_maxIntType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new maxIntType from encoded stream.
   */
  public static maxIntType fromPerUnaligned(byte[] encodedBytes) {
    maxIntType result = new maxIntType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new maxIntType from encoded stream.
   */
  public static maxIntType fromPerAligned(byte[] encodedBytes) {
    maxIntType result = new maxIntType();
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
    return "maxIntType = " + getInteger() + ";\n";
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
    builder.append("ReportingCap = {\n");
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
