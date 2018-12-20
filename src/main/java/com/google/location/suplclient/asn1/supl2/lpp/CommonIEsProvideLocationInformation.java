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
public  class CommonIEsProvideLocationInformation extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_CommonIEsProvideLocationInformation
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public CommonIEsProvideLocationInformation() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_CommonIEsProvideLocationInformation;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_CommonIEsProvideLocationInformation != null) {
      return ImmutableList.of(TAG_CommonIEsProvideLocationInformation);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new CommonIEsProvideLocationInformation from encoded stream.
   */
  public static CommonIEsProvideLocationInformation fromPerUnaligned(byte[] encodedBytes) {
    CommonIEsProvideLocationInformation result = new CommonIEsProvideLocationInformation();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new CommonIEsProvideLocationInformation from encoded stream.
   */
  public static CommonIEsProvideLocationInformation fromPerAligned(byte[] encodedBytes) {
    CommonIEsProvideLocationInformation result = new CommonIEsProvideLocationInformation();
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

  
  private LocationCoordinates locationEstimate_;
  public LocationCoordinates getLocationEstimate() {
    return locationEstimate_;
  }
  /**
   * @throws ClassCastException if value is not a LocationCoordinates
   */
  public void setLocationEstimate(Asn1Object value) {
    this.locationEstimate_ = (LocationCoordinates) value;
  }
  public LocationCoordinates setLocationEstimateToNewInstance() {
    locationEstimate_ = new LocationCoordinates();
    return locationEstimate_;
  }
  
  private Velocity velocityEstimate_;
  public Velocity getVelocityEstimate() {
    return velocityEstimate_;
  }
  /**
   * @throws ClassCastException if value is not a Velocity
   */
  public void setVelocityEstimate(Asn1Object value) {
    this.velocityEstimate_ = (Velocity) value;
  }
  public Velocity setVelocityEstimateToNewInstance() {
    velocityEstimate_ = new Velocity();
    return velocityEstimate_;
  }
  
  private LocationError locationError_;
  public LocationError getLocationError() {
    return locationError_;
  }
  /**
   * @throws ClassCastException if value is not a LocationError
   */
  public void setLocationError(Asn1Object value) {
    this.locationError_ = (LocationError) value;
  }
  public LocationError setLocationErrorToNewInstance() {
    locationError_ = new LocationError();
    return locationError_;
  }
  

  
  private CommonIEsProvideLocationInformation.ext1Type  extensionExt1;
  public CommonIEsProvideLocationInformation.ext1Type getExtensionExt1() {
    return extensionExt1;
  }
  /**
   * @throws ClassCastException if value is not a CommonIEsProvideLocationInformation.ext1Type
   */
  public void setExtensionExt1(Asn1Object value) {
    extensionExt1 = (CommonIEsProvideLocationInformation.ext1Type) value;
  }
  public void setExtensionExt1ToNewInstance() {
    extensionExt1 = new CommonIEsProvideLocationInformation.ext1Type();
  }
    
  private CommonIEsProvideLocationInformation.ext2Type  extensionExt2;
  public CommonIEsProvideLocationInformation.ext2Type getExtensionExt2() {
    return extensionExt2;
  }
  /**
   * @throws ClassCastException if value is not a CommonIEsProvideLocationInformation.ext2Type
   */
  public void setExtensionExt2(Asn1Object value) {
    extensionExt2 = (CommonIEsProvideLocationInformation.ext2Type) value;
  }
  public void setExtensionExt2ToNewInstance() {
    extensionExt2 = new CommonIEsProvideLocationInformation.ext2Type();
  }
    

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getLocationEstimate() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getLocationEstimate();
          }

          @Override public void setToNewInstance() {
            setLocationEstimateToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? LocationCoordinates.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "locationEstimate : "
                    + getLocationEstimate().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getVelocityEstimate() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getVelocityEstimate();
          }

          @Override public void setToNewInstance() {
            setVelocityEstimateToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Velocity.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "velocityEstimate : "
                    + getVelocityEstimate().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getLocationError() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getLocationError();
          }

          @Override public void setToNewInstance() {
            setLocationErrorToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? LocationError.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "locationError : "
                    + getLocationError().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      builder.add(new SequenceComponent() {
            @Override public boolean isExplicitlySet() {
              return getExtensionExt1() != null;
            }

            @Override public boolean hasDefaultValue() {
              return false;
            }

            @Override public boolean isOptional() {
              return false;
            }

            @Override public Asn1Object getComponentValue() {
              return getExtensionExt1();
            }

            @Override public void setToNewInstance() {
              setExtensionExt1ToNewInstance();
            }

            @Override public Collection<Asn1Tag> getPossibleFirstTags() {
              throw new UnsupportedOperationException(
                  "BER decoding not supported for extension elements");
            }

            @Override
            public Asn1Tag getTag() {
              throw new UnsupportedOperationException(
                  "BER is not supported for extension elements");
            }

            @Override
            public boolean isImplicitTagging() {
              throw new UnsupportedOperationException(
                  "BER is not supported for extension elements");
            }

            @Override public String toIndentedString(String indent) {
              return "ext1 : "
                  + getExtensionExt1().toIndentedString(indent);
            }
      });
      
      builder.add(new SequenceComponent() {
            @Override public boolean isExplicitlySet() {
              return getExtensionExt2() != null;
            }

            @Override public boolean hasDefaultValue() {
              return false;
            }

            @Override public boolean isOptional() {
              return false;
            }

            @Override public Asn1Object getComponentValue() {
              return getExtensionExt2();
            }

            @Override public void setToNewInstance() {
              setExtensionExt2ToNewInstance();
            }

            @Override public Collection<Asn1Tag> getPossibleFirstTags() {
              throw new UnsupportedOperationException(
                  "BER decoding not supported for extension elements");
            }

            @Override
            public Asn1Tag getTag() {
              throw new UnsupportedOperationException(
                  "BER is not supported for extension elements");
            }

            @Override
            public boolean isImplicitTagging() {
              throw new UnsupportedOperationException(
                  "BER is not supported for extension elements");
            }

            @Override public String toIndentedString(String indent) {
              return "ext2 : "
                  + getExtensionExt2().toIndentedString(indent);
            }
      });
      
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
public static class ext1Type extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_ext1Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ext1Type() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ext1Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ext1Type != null) {
      return ImmutableList.of(TAG_ext1Type);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ext1Type from encoded stream.
   */
  public static ext1Type fromPerUnaligned(byte[] encodedBytes) {
    ext1Type result = new ext1Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ext1Type from encoded stream.
   */
  public static ext1Type fromPerAligned(byte[] encodedBytes) {
    ext1Type result = new ext1Type();
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

  
  private EarlyFixReport_r12 earlyFixReport_r12_;
  public EarlyFixReport_r12 getEarlyFixReport_r12() {
    return earlyFixReport_r12_;
  }
  /**
   * @throws ClassCastException if value is not a EarlyFixReport_r12
   */
  public void setEarlyFixReport_r12(Asn1Object value) {
    this.earlyFixReport_r12_ = (EarlyFixReport_r12) value;
  }
  public EarlyFixReport_r12 setEarlyFixReport_r12ToNewInstance() {
    earlyFixReport_r12_ = new EarlyFixReport_r12();
    return earlyFixReport_r12_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getEarlyFixReport_r12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getEarlyFixReport_r12();
          }

          @Override public void setToNewInstance() {
            setEarlyFixReport_r12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? EarlyFixReport_r12.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "earlyFixReport_r12 : "
                    + getEarlyFixReport_r12().toIndentedString(indent);
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
    builder.append("ext1Type = {\n");
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

    
    // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
* 
*/
public static class ext2Type extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_ext2Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ext2Type() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ext2Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ext2Type != null) {
      return ImmutableList.of(TAG_ext2Type);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ext2Type from encoded stream.
   */
  public static ext2Type fromPerUnaligned(byte[] encodedBytes) {
    ext2Type result = new ext2Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ext2Type from encoded stream.
   */
  public static ext2Type fromPerAligned(byte[] encodedBytes) {
    ext2Type result = new ext2Type();
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

  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
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
    builder.append("ext2Type = {\n");
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
    builder.append("CommonIEsProvideLocationInformation = {\n");
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
