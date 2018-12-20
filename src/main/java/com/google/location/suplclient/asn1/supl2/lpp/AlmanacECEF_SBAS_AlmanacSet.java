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
import com.google.location.suplclient.asn1.base.Asn1BitString;
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
public  class AlmanacECEF_SBAS_AlmanacSet extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_AlmanacECEF_SBAS_AlmanacSet
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public AlmanacECEF_SBAS_AlmanacSet() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_AlmanacECEF_SBAS_AlmanacSet;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_AlmanacECEF_SBAS_AlmanacSet != null) {
      return ImmutableList.of(TAG_AlmanacECEF_SBAS_AlmanacSet);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new AlmanacECEF_SBAS_AlmanacSet from encoded stream.
   */
  public static AlmanacECEF_SBAS_AlmanacSet fromPerUnaligned(byte[] encodedBytes) {
    AlmanacECEF_SBAS_AlmanacSet result = new AlmanacECEF_SBAS_AlmanacSet();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new AlmanacECEF_SBAS_AlmanacSet from encoded stream.
   */
  public static AlmanacECEF_SBAS_AlmanacSet fromPerAligned(byte[] encodedBytes) {
    AlmanacECEF_SBAS_AlmanacSet result = new AlmanacECEF_SBAS_AlmanacSet();
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

  
  private AlmanacECEF_SBAS_AlmanacSet.sbasAlmDataIDType sbasAlmDataID_;
  public AlmanacECEF_SBAS_AlmanacSet.sbasAlmDataIDType getSbasAlmDataID() {
    return sbasAlmDataID_;
  }
  /**
   * @throws ClassCastException if value is not a AlmanacECEF_SBAS_AlmanacSet.sbasAlmDataIDType
   */
  public void setSbasAlmDataID(Asn1Object value) {
    this.sbasAlmDataID_ = (AlmanacECEF_SBAS_AlmanacSet.sbasAlmDataIDType) value;
  }
  public AlmanacECEF_SBAS_AlmanacSet.sbasAlmDataIDType setSbasAlmDataIDToNewInstance() {
    sbasAlmDataID_ = new AlmanacECEF_SBAS_AlmanacSet.sbasAlmDataIDType();
    return sbasAlmDataID_;
  }
  
  private SV_ID svID_;
  public SV_ID getSvID() {
    return svID_;
  }
  /**
   * @throws ClassCastException if value is not a SV_ID
   */
  public void setSvID(Asn1Object value) {
    this.svID_ = (SV_ID) value;
  }
  public SV_ID setSvIDToNewInstance() {
    svID_ = new SV_ID();
    return svID_;
  }
  
  private AlmanacECEF_SBAS_AlmanacSet.sbasAlmHealthType sbasAlmHealth_;
  public AlmanacECEF_SBAS_AlmanacSet.sbasAlmHealthType getSbasAlmHealth() {
    return sbasAlmHealth_;
  }
  /**
   * @throws ClassCastException if value is not a AlmanacECEF_SBAS_AlmanacSet.sbasAlmHealthType
   */
  public void setSbasAlmHealth(Asn1Object value) {
    this.sbasAlmHealth_ = (AlmanacECEF_SBAS_AlmanacSet.sbasAlmHealthType) value;
  }
  public AlmanacECEF_SBAS_AlmanacSet.sbasAlmHealthType setSbasAlmHealthToNewInstance() {
    sbasAlmHealth_ = new AlmanacECEF_SBAS_AlmanacSet.sbasAlmHealthType();
    return sbasAlmHealth_;
  }
  
  private AlmanacECEF_SBAS_AlmanacSet.sbasAlmXgType sbasAlmXg_;
  public AlmanacECEF_SBAS_AlmanacSet.sbasAlmXgType getSbasAlmXg() {
    return sbasAlmXg_;
  }
  /**
   * @throws ClassCastException if value is not a AlmanacECEF_SBAS_AlmanacSet.sbasAlmXgType
   */
  public void setSbasAlmXg(Asn1Object value) {
    this.sbasAlmXg_ = (AlmanacECEF_SBAS_AlmanacSet.sbasAlmXgType) value;
  }
  public AlmanacECEF_SBAS_AlmanacSet.sbasAlmXgType setSbasAlmXgToNewInstance() {
    sbasAlmXg_ = new AlmanacECEF_SBAS_AlmanacSet.sbasAlmXgType();
    return sbasAlmXg_;
  }
  
  private AlmanacECEF_SBAS_AlmanacSet.sbasAlmYgType sbasAlmYg_;
  public AlmanacECEF_SBAS_AlmanacSet.sbasAlmYgType getSbasAlmYg() {
    return sbasAlmYg_;
  }
  /**
   * @throws ClassCastException if value is not a AlmanacECEF_SBAS_AlmanacSet.sbasAlmYgType
   */
  public void setSbasAlmYg(Asn1Object value) {
    this.sbasAlmYg_ = (AlmanacECEF_SBAS_AlmanacSet.sbasAlmYgType) value;
  }
  public AlmanacECEF_SBAS_AlmanacSet.sbasAlmYgType setSbasAlmYgToNewInstance() {
    sbasAlmYg_ = new AlmanacECEF_SBAS_AlmanacSet.sbasAlmYgType();
    return sbasAlmYg_;
  }
  
  private AlmanacECEF_SBAS_AlmanacSet.sbasAlmZgType sbasAlmZg_;
  public AlmanacECEF_SBAS_AlmanacSet.sbasAlmZgType getSbasAlmZg() {
    return sbasAlmZg_;
  }
  /**
   * @throws ClassCastException if value is not a AlmanacECEF_SBAS_AlmanacSet.sbasAlmZgType
   */
  public void setSbasAlmZg(Asn1Object value) {
    this.sbasAlmZg_ = (AlmanacECEF_SBAS_AlmanacSet.sbasAlmZgType) value;
  }
  public AlmanacECEF_SBAS_AlmanacSet.sbasAlmZgType setSbasAlmZgToNewInstance() {
    sbasAlmZg_ = new AlmanacECEF_SBAS_AlmanacSet.sbasAlmZgType();
    return sbasAlmZg_;
  }
  
  private AlmanacECEF_SBAS_AlmanacSet.sbasAlmXgdotType sbasAlmXgdot_;
  public AlmanacECEF_SBAS_AlmanacSet.sbasAlmXgdotType getSbasAlmXgdot() {
    return sbasAlmXgdot_;
  }
  /**
   * @throws ClassCastException if value is not a AlmanacECEF_SBAS_AlmanacSet.sbasAlmXgdotType
   */
  public void setSbasAlmXgdot(Asn1Object value) {
    this.sbasAlmXgdot_ = (AlmanacECEF_SBAS_AlmanacSet.sbasAlmXgdotType) value;
  }
  public AlmanacECEF_SBAS_AlmanacSet.sbasAlmXgdotType setSbasAlmXgdotToNewInstance() {
    sbasAlmXgdot_ = new AlmanacECEF_SBAS_AlmanacSet.sbasAlmXgdotType();
    return sbasAlmXgdot_;
  }
  
  private AlmanacECEF_SBAS_AlmanacSet.sbasAlmYgDotType sbasAlmYgDot_;
  public AlmanacECEF_SBAS_AlmanacSet.sbasAlmYgDotType getSbasAlmYgDot() {
    return sbasAlmYgDot_;
  }
  /**
   * @throws ClassCastException if value is not a AlmanacECEF_SBAS_AlmanacSet.sbasAlmYgDotType
   */
  public void setSbasAlmYgDot(Asn1Object value) {
    this.sbasAlmYgDot_ = (AlmanacECEF_SBAS_AlmanacSet.sbasAlmYgDotType) value;
  }
  public AlmanacECEF_SBAS_AlmanacSet.sbasAlmYgDotType setSbasAlmYgDotToNewInstance() {
    sbasAlmYgDot_ = new AlmanacECEF_SBAS_AlmanacSet.sbasAlmYgDotType();
    return sbasAlmYgDot_;
  }
  
  private AlmanacECEF_SBAS_AlmanacSet.sbasAlmZgDotType sbasAlmZgDot_;
  public AlmanacECEF_SBAS_AlmanacSet.sbasAlmZgDotType getSbasAlmZgDot() {
    return sbasAlmZgDot_;
  }
  /**
   * @throws ClassCastException if value is not a AlmanacECEF_SBAS_AlmanacSet.sbasAlmZgDotType
   */
  public void setSbasAlmZgDot(Asn1Object value) {
    this.sbasAlmZgDot_ = (AlmanacECEF_SBAS_AlmanacSet.sbasAlmZgDotType) value;
  }
  public AlmanacECEF_SBAS_AlmanacSet.sbasAlmZgDotType setSbasAlmZgDotToNewInstance() {
    sbasAlmZgDot_ = new AlmanacECEF_SBAS_AlmanacSet.sbasAlmZgDotType();
    return sbasAlmZgDot_;
  }
  
  private AlmanacECEF_SBAS_AlmanacSet.sbasAlmToType sbasAlmTo_;
  public AlmanacECEF_SBAS_AlmanacSet.sbasAlmToType getSbasAlmTo() {
    return sbasAlmTo_;
  }
  /**
   * @throws ClassCastException if value is not a AlmanacECEF_SBAS_AlmanacSet.sbasAlmToType
   */
  public void setSbasAlmTo(Asn1Object value) {
    this.sbasAlmTo_ = (AlmanacECEF_SBAS_AlmanacSet.sbasAlmToType) value;
  }
  public AlmanacECEF_SBAS_AlmanacSet.sbasAlmToType setSbasAlmToToNewInstance() {
    sbasAlmTo_ = new AlmanacECEF_SBAS_AlmanacSet.sbasAlmToType();
    return sbasAlmTo_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getSbasAlmDataID() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getSbasAlmDataID();
          }

          @Override public void setToNewInstance() {
            setSbasAlmDataIDToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? AlmanacECEF_SBAS_AlmanacSet.sbasAlmDataIDType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "sbasAlmDataID : "
                    + getSbasAlmDataID().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getSvID() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getSvID();
          }

          @Override public void setToNewInstance() {
            setSvIDToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SV_ID.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "svID : "
                    + getSvID().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getSbasAlmHealth() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getSbasAlmHealth();
          }

          @Override public void setToNewInstance() {
            setSbasAlmHealthToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? AlmanacECEF_SBAS_AlmanacSet.sbasAlmHealthType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "sbasAlmHealth : "
                    + getSbasAlmHealth().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getSbasAlmXg() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getSbasAlmXg();
          }

          @Override public void setToNewInstance() {
            setSbasAlmXgToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? AlmanacECEF_SBAS_AlmanacSet.sbasAlmXgType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "sbasAlmXg : "
                    + getSbasAlmXg().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getSbasAlmYg() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getSbasAlmYg();
          }

          @Override public void setToNewInstance() {
            setSbasAlmYgToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? AlmanacECEF_SBAS_AlmanacSet.sbasAlmYgType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "sbasAlmYg : "
                    + getSbasAlmYg().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getSbasAlmZg() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getSbasAlmZg();
          }

          @Override public void setToNewInstance() {
            setSbasAlmZgToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? AlmanacECEF_SBAS_AlmanacSet.sbasAlmZgType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "sbasAlmZg : "
                    + getSbasAlmZg().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getSbasAlmXgdot() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getSbasAlmXgdot();
          }

          @Override public void setToNewInstance() {
            setSbasAlmXgdotToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? AlmanacECEF_SBAS_AlmanacSet.sbasAlmXgdotType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "sbasAlmXgdot : "
                    + getSbasAlmXgdot().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 7);

          @Override public boolean isExplicitlySet() {
            return getSbasAlmYgDot() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getSbasAlmYgDot();
          }

          @Override public void setToNewInstance() {
            setSbasAlmYgDotToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? AlmanacECEF_SBAS_AlmanacSet.sbasAlmYgDotType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "sbasAlmYgDot : "
                    + getSbasAlmYgDot().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 8);

          @Override public boolean isExplicitlySet() {
            return getSbasAlmZgDot() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getSbasAlmZgDot();
          }

          @Override public void setToNewInstance() {
            setSbasAlmZgDotToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? AlmanacECEF_SBAS_AlmanacSet.sbasAlmZgDotType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "sbasAlmZgDot : "
                    + getSbasAlmZgDot().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 9);

          @Override public boolean isExplicitlySet() {
            return getSbasAlmTo() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getSbasAlmTo();
          }

          @Override public void setToNewInstance() {
            setSbasAlmToToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? AlmanacECEF_SBAS_AlmanacSet.sbasAlmToType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "sbasAlmTo : "
                    + getSbasAlmTo().toIndentedString(indent);
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
public static class sbasAlmDataIDType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_sbasAlmDataIDType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public sbasAlmDataIDType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("3"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_sbasAlmDataIDType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_sbasAlmDataIDType != null) {
      return ImmutableList.of(TAG_sbasAlmDataIDType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new sbasAlmDataIDType from encoded stream.
   */
  public static sbasAlmDataIDType fromPerUnaligned(byte[] encodedBytes) {
    sbasAlmDataIDType result = new sbasAlmDataIDType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new sbasAlmDataIDType from encoded stream.
   */
  public static sbasAlmDataIDType fromPerAligned(byte[] encodedBytes) {
    sbasAlmDataIDType result = new sbasAlmDataIDType();
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
    return "sbasAlmDataIDType = " + getInteger() + ";\n";
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
public static class sbasAlmHealthType extends Asn1BitString {
  //

  // defined bit positions, if any
  

  // setters
  

  // clearers
  


  private static final Asn1Tag TAG_sbasAlmHealthType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public sbasAlmHealthType() {
    super();
    setMinSize(8);
setMaxSize(8);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_sbasAlmHealthType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_sbasAlmHealthType != null) {
      return ImmutableList.of(TAG_sbasAlmHealthType);
    } else {
      return Asn1BitString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new sbasAlmHealthType from encoded stream.
   */
  public static sbasAlmHealthType fromPerUnaligned(byte[] encodedBytes) {
    sbasAlmHealthType result = new sbasAlmHealthType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new sbasAlmHealthType from encoded stream.
   */
  public static sbasAlmHealthType fromPerAligned(byte[] encodedBytes) {
    sbasAlmHealthType result = new sbasAlmHealthType();
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
    return "sbasAlmHealthType = " + getValue() + ";\n";
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
public static class sbasAlmXgType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_sbasAlmXgType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public sbasAlmXgType() {
    super();
    setValueRange(new java.math.BigInteger("-16384"), new java.math.BigInteger("16383"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_sbasAlmXgType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_sbasAlmXgType != null) {
      return ImmutableList.of(TAG_sbasAlmXgType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new sbasAlmXgType from encoded stream.
   */
  public static sbasAlmXgType fromPerUnaligned(byte[] encodedBytes) {
    sbasAlmXgType result = new sbasAlmXgType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new sbasAlmXgType from encoded stream.
   */
  public static sbasAlmXgType fromPerAligned(byte[] encodedBytes) {
    sbasAlmXgType result = new sbasAlmXgType();
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
    return "sbasAlmXgType = " + getInteger() + ";\n";
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
public static class sbasAlmYgType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_sbasAlmYgType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public sbasAlmYgType() {
    super();
    setValueRange(new java.math.BigInteger("-16384"), new java.math.BigInteger("16383"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_sbasAlmYgType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_sbasAlmYgType != null) {
      return ImmutableList.of(TAG_sbasAlmYgType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new sbasAlmYgType from encoded stream.
   */
  public static sbasAlmYgType fromPerUnaligned(byte[] encodedBytes) {
    sbasAlmYgType result = new sbasAlmYgType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new sbasAlmYgType from encoded stream.
   */
  public static sbasAlmYgType fromPerAligned(byte[] encodedBytes) {
    sbasAlmYgType result = new sbasAlmYgType();
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
    return "sbasAlmYgType = " + getInteger() + ";\n";
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
public static class sbasAlmZgType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_sbasAlmZgType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public sbasAlmZgType() {
    super();
    setValueRange(new java.math.BigInteger("-256"), new java.math.BigInteger("255"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_sbasAlmZgType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_sbasAlmZgType != null) {
      return ImmutableList.of(TAG_sbasAlmZgType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new sbasAlmZgType from encoded stream.
   */
  public static sbasAlmZgType fromPerUnaligned(byte[] encodedBytes) {
    sbasAlmZgType result = new sbasAlmZgType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new sbasAlmZgType from encoded stream.
   */
  public static sbasAlmZgType fromPerAligned(byte[] encodedBytes) {
    sbasAlmZgType result = new sbasAlmZgType();
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
    return "sbasAlmZgType = " + getInteger() + ";\n";
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
public static class sbasAlmXgdotType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_sbasAlmXgdotType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public sbasAlmXgdotType() {
    super();
    setValueRange(new java.math.BigInteger("-4"), new java.math.BigInteger("3"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_sbasAlmXgdotType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_sbasAlmXgdotType != null) {
      return ImmutableList.of(TAG_sbasAlmXgdotType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new sbasAlmXgdotType from encoded stream.
   */
  public static sbasAlmXgdotType fromPerUnaligned(byte[] encodedBytes) {
    sbasAlmXgdotType result = new sbasAlmXgdotType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new sbasAlmXgdotType from encoded stream.
   */
  public static sbasAlmXgdotType fromPerAligned(byte[] encodedBytes) {
    sbasAlmXgdotType result = new sbasAlmXgdotType();
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
    return "sbasAlmXgdotType = " + getInteger() + ";\n";
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
public static class sbasAlmYgDotType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_sbasAlmYgDotType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public sbasAlmYgDotType() {
    super();
    setValueRange(new java.math.BigInteger("-4"), new java.math.BigInteger("3"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_sbasAlmYgDotType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_sbasAlmYgDotType != null) {
      return ImmutableList.of(TAG_sbasAlmYgDotType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new sbasAlmYgDotType from encoded stream.
   */
  public static sbasAlmYgDotType fromPerUnaligned(byte[] encodedBytes) {
    sbasAlmYgDotType result = new sbasAlmYgDotType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new sbasAlmYgDotType from encoded stream.
   */
  public static sbasAlmYgDotType fromPerAligned(byte[] encodedBytes) {
    sbasAlmYgDotType result = new sbasAlmYgDotType();
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
    return "sbasAlmYgDotType = " + getInteger() + ";\n";
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
public static class sbasAlmZgDotType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_sbasAlmZgDotType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public sbasAlmZgDotType() {
    super();
    setValueRange(new java.math.BigInteger("-8"), new java.math.BigInteger("7"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_sbasAlmZgDotType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_sbasAlmZgDotType != null) {
      return ImmutableList.of(TAG_sbasAlmZgDotType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new sbasAlmZgDotType from encoded stream.
   */
  public static sbasAlmZgDotType fromPerUnaligned(byte[] encodedBytes) {
    sbasAlmZgDotType result = new sbasAlmZgDotType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new sbasAlmZgDotType from encoded stream.
   */
  public static sbasAlmZgDotType fromPerAligned(byte[] encodedBytes) {
    sbasAlmZgDotType result = new sbasAlmZgDotType();
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
    return "sbasAlmZgDotType = " + getInteger() + ";\n";
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
public static class sbasAlmToType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_sbasAlmToType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public sbasAlmToType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("2047"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_sbasAlmToType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_sbasAlmToType != null) {
      return ImmutableList.of(TAG_sbasAlmToType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new sbasAlmToType from encoded stream.
   */
  public static sbasAlmToType fromPerUnaligned(byte[] encodedBytes) {
    sbasAlmToType result = new sbasAlmToType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new sbasAlmToType from encoded stream.
   */
  public static sbasAlmToType fromPerAligned(byte[] encodedBytes) {
    sbasAlmToType result = new sbasAlmToType();
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
    return "sbasAlmToType = " + getInteger() + ";\n";
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
    builder.append("AlmanacECEF_SBAS_AlmanacSet = {\n");
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
