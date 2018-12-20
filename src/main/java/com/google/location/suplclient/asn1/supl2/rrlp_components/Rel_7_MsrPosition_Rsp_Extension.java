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
import com.google.location.suplclient.asn1.supl2.map_lcs_datatypes.VelocityEstimate;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
* 
*/
public  class Rel_7_MsrPosition_Rsp_Extension extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_Rel_7_MsrPosition_Rsp_Extension
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public Rel_7_MsrPosition_Rsp_Extension() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_Rel_7_MsrPosition_Rsp_Extension;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_Rel_7_MsrPosition_Rsp_Extension != null) {
      return ImmutableList.of(TAG_Rel_7_MsrPosition_Rsp_Extension);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new Rel_7_MsrPosition_Rsp_Extension from encoded stream.
   */
  public static Rel_7_MsrPosition_Rsp_Extension fromPerUnaligned(byte[] encodedBytes) {
    Rel_7_MsrPosition_Rsp_Extension result = new Rel_7_MsrPosition_Rsp_Extension();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new Rel_7_MsrPosition_Rsp_Extension from encoded stream.
   */
  public static Rel_7_MsrPosition_Rsp_Extension fromPerAligned(byte[] encodedBytes) {
    Rel_7_MsrPosition_Rsp_Extension result = new Rel_7_MsrPosition_Rsp_Extension();
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

  
  private VelocityEstimate velEstimate_;
  public VelocityEstimate getVelEstimate() {
    return velEstimate_;
  }
  /**
   * @throws ClassCastException if value is not a VelocityEstimate
   */
  public void setVelEstimate(Asn1Object value) {
    this.velEstimate_ = (VelocityEstimate) value;
  }
  public VelocityEstimate setVelEstimateToNewInstance() {
    velEstimate_ = new VelocityEstimate();
    return velEstimate_;
  }
  
  private GANSSLocationInfo ganssLocationInfo_;
  public GANSSLocationInfo getGanssLocationInfo() {
    return ganssLocationInfo_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSLocationInfo
   */
  public void setGanssLocationInfo(Asn1Object value) {
    this.ganssLocationInfo_ = (GANSSLocationInfo) value;
  }
  public GANSSLocationInfo setGanssLocationInfoToNewInstance() {
    ganssLocationInfo_ = new GANSSLocationInfo();
    return ganssLocationInfo_;
  }
  
  private GANSSMeasureInfo ganssMeasureInfo_;
  public GANSSMeasureInfo getGanssMeasureInfo() {
    return ganssMeasureInfo_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSMeasureInfo
   */
  public void setGanssMeasureInfo(Asn1Object value) {
    this.ganssMeasureInfo_ = (GANSSMeasureInfo) value;
  }
  public GANSSMeasureInfo setGanssMeasureInfoToNewInstance() {
    ganssMeasureInfo_ = new GANSSMeasureInfo();
    return ganssMeasureInfo_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getVelEstimate() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getVelEstimate();
          }

          @Override public void setToNewInstance() {
            setVelEstimateToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? VelocityEstimate.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "velEstimate : "
                    + getVelEstimate().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getGanssLocationInfo() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssLocationInfo();
          }

          @Override public void setToNewInstance() {
            setGanssLocationInfoToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSLocationInfo.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssLocationInfo : "
                    + getGanssLocationInfo().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getGanssMeasureInfo() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getGanssMeasureInfo();
          }

          @Override public void setToNewInstance() {
            setGanssMeasureInfoToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSMeasureInfo.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ganssMeasureInfo : "
                    + getGanssMeasureInfo().toIndentedString(indent);
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
    builder.append("Rel_7_MsrPosition_Rsp_Extension = {\n");
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
