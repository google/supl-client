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
public  class Rel_5_MsrPosition_Rsp_Extension extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_Rel_5_MsrPosition_Rsp_Extension
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public Rel_5_MsrPosition_Rsp_Extension() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_Rel_5_MsrPosition_Rsp_Extension;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_Rel_5_MsrPosition_Rsp_Extension != null) {
      return ImmutableList.of(TAG_Rel_5_MsrPosition_Rsp_Extension);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new Rel_5_MsrPosition_Rsp_Extension from encoded stream.
   */
  public static Rel_5_MsrPosition_Rsp_Extension fromPerUnaligned(byte[] encodedBytes) {
    Rel_5_MsrPosition_Rsp_Extension result = new Rel_5_MsrPosition_Rsp_Extension();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new Rel_5_MsrPosition_Rsp_Extension from encoded stream.
   */
  public static Rel_5_MsrPosition_Rsp_Extension fromPerAligned(byte[] encodedBytes) {
    Rel_5_MsrPosition_Rsp_Extension result = new Rel_5_MsrPosition_Rsp_Extension();
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

  
  private Extended_reference extended_reference_;
  public Extended_reference getExtended_reference() {
    return extended_reference_;
  }
  /**
   * @throws ClassCastException if value is not a Extended_reference
   */
  public void setExtended_reference(Asn1Object value) {
    this.extended_reference_ = (Extended_reference) value;
  }
  public Extended_reference setExtended_referenceToNewInstance() {
    extended_reference_ = new Extended_reference();
    return extended_reference_;
  }
  
  private OTD_MeasureInfo_5_Ext otd_MeasureInfo_5_Ext_;
  public OTD_MeasureInfo_5_Ext getOtd_MeasureInfo_5_Ext() {
    return otd_MeasureInfo_5_Ext_;
  }
  /**
   * @throws ClassCastException if value is not a OTD_MeasureInfo_5_Ext
   */
  public void setOtd_MeasureInfo_5_Ext(Asn1Object value) {
    this.otd_MeasureInfo_5_Ext_ = (OTD_MeasureInfo_5_Ext) value;
  }
  public OTD_MeasureInfo_5_Ext setOtd_MeasureInfo_5_ExtToNewInstance() {
    otd_MeasureInfo_5_Ext_ = new OTD_MeasureInfo_5_Ext();
    return otd_MeasureInfo_5_Ext_;
  }
  
  private UlPseudoSegInd ulPseudoSegInd_;
  public UlPseudoSegInd getUlPseudoSegInd() {
    return ulPseudoSegInd_;
  }
  /**
   * @throws ClassCastException if value is not a UlPseudoSegInd
   */
  public void setUlPseudoSegInd(Asn1Object value) {
    this.ulPseudoSegInd_ = (UlPseudoSegInd) value;
  }
  public UlPseudoSegInd setUlPseudoSegIndToNewInstance() {
    ulPseudoSegInd_ = new UlPseudoSegInd();
    return ulPseudoSegInd_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getExtended_reference() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getExtended_reference();
          }

          @Override public void setToNewInstance() {
            setExtended_referenceToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Extended_reference.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "extended_reference : "
                    + getExtended_reference().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getOtd_MeasureInfo_5_Ext() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getOtd_MeasureInfo_5_Ext();
          }

          @Override public void setToNewInstance() {
            setOtd_MeasureInfo_5_ExtToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? OTD_MeasureInfo_5_Ext.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "otd_MeasureInfo_5_Ext : "
                    + getOtd_MeasureInfo_5_Ext().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getUlPseudoSegInd() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getUlPseudoSegInd();
          }

          @Override public void setToNewInstance() {
            setUlPseudoSegIndToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UlPseudoSegInd.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ulPseudoSegInd : "
                    + getUlPseudoSegInd().toIndentedString(indent);
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
    builder.append("Rel_5_MsrPosition_Rsp_Extension = {\n");
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
