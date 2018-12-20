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

package com.google.location.suplclient.asn1.supl2.ulp_version_2_message_extensions;

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
import com.google.location.suplclient.asn1.supl2.ver2_ulp_components.MultipleLocationIds;
import com.google.location.suplclient.asn1.supl2.ver2_ulp_components.UTRAN_GANSSReferenceTimeResult;
import com.google.location.suplclient.asn1.supl2.ver2_ulp_components.UTRAN_GPSReferenceTimeResult;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
* 
*/
public  class Ver2_SUPL_POS_INIT_extension extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_Ver2_SUPL_POS_INIT_extension
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public Ver2_SUPL_POS_INIT_extension() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_Ver2_SUPL_POS_INIT_extension;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_Ver2_SUPL_POS_INIT_extension != null) {
      return ImmutableList.of(TAG_Ver2_SUPL_POS_INIT_extension);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new Ver2_SUPL_POS_INIT_extension from encoded stream.
   */
  public static Ver2_SUPL_POS_INIT_extension fromPerUnaligned(byte[] encodedBytes) {
    Ver2_SUPL_POS_INIT_extension result = new Ver2_SUPL_POS_INIT_extension();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new Ver2_SUPL_POS_INIT_extension from encoded stream.
   */
  public static Ver2_SUPL_POS_INIT_extension fromPerAligned(byte[] encodedBytes) {
    Ver2_SUPL_POS_INIT_extension result = new Ver2_SUPL_POS_INIT_extension();
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

  
  private MultipleLocationIds multipleLocationIds_;
  public MultipleLocationIds getMultipleLocationIds() {
    return multipleLocationIds_;
  }
  /**
   * @throws ClassCastException if value is not a MultipleLocationIds
   */
  public void setMultipleLocationIds(Asn1Object value) {
    this.multipleLocationIds_ = (MultipleLocationIds) value;
  }
  public MultipleLocationIds setMultipleLocationIdsToNewInstance() {
    multipleLocationIds_ = new MultipleLocationIds();
    return multipleLocationIds_;
  }
  
  private UTRAN_GPSReferenceTimeResult utran_GPSReferenceTimeResult_;
  public UTRAN_GPSReferenceTimeResult getUtran_GPSReferenceTimeResult() {
    return utran_GPSReferenceTimeResult_;
  }
  /**
   * @throws ClassCastException if value is not a UTRAN_GPSReferenceTimeResult
   */
  public void setUtran_GPSReferenceTimeResult(Asn1Object value) {
    this.utran_GPSReferenceTimeResult_ = (UTRAN_GPSReferenceTimeResult) value;
  }
  public UTRAN_GPSReferenceTimeResult setUtran_GPSReferenceTimeResultToNewInstance() {
    utran_GPSReferenceTimeResult_ = new UTRAN_GPSReferenceTimeResult();
    return utran_GPSReferenceTimeResult_;
  }
  
  private UTRAN_GANSSReferenceTimeResult utran_GANSSReferenceTimeResult_;
  public UTRAN_GANSSReferenceTimeResult getUtran_GANSSReferenceTimeResult() {
    return utran_GANSSReferenceTimeResult_;
  }
  /**
   * @throws ClassCastException if value is not a UTRAN_GANSSReferenceTimeResult
   */
  public void setUtran_GANSSReferenceTimeResult(Asn1Object value) {
    this.utran_GANSSReferenceTimeResult_ = (UTRAN_GANSSReferenceTimeResult) value;
  }
  public UTRAN_GANSSReferenceTimeResult setUtran_GANSSReferenceTimeResultToNewInstance() {
    utran_GANSSReferenceTimeResult_ = new UTRAN_GANSSReferenceTimeResult();
    return utran_GANSSReferenceTimeResult_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getMultipleLocationIds() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getMultipleLocationIds();
          }

          @Override public void setToNewInstance() {
            setMultipleLocationIdsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? MultipleLocationIds.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "multipleLocationIds : "
                    + getMultipleLocationIds().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getUtran_GPSReferenceTimeResult() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getUtran_GPSReferenceTimeResult();
          }

          @Override public void setToNewInstance() {
            setUtran_GPSReferenceTimeResultToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UTRAN_GPSReferenceTimeResult.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "utran_GPSReferenceTimeResult : "
                    + getUtran_GPSReferenceTimeResult().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getUtran_GANSSReferenceTimeResult() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getUtran_GANSSReferenceTimeResult();
          }

          @Override public void setToNewInstance() {
            setUtran_GANSSReferenceTimeResultToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UTRAN_GANSSReferenceTimeResult.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "utran_GANSSReferenceTimeResult : "
                    + getUtran_GANSSReferenceTimeResult().toIndentedString(indent);
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
    builder.append("Ver2_SUPL_POS_INIT_extension = {\n");
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
