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
public  class Almanac_ECEFsbasAlmanacSet extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_Almanac_ECEFsbasAlmanacSet
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public Almanac_ECEFsbasAlmanacSet() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_Almanac_ECEFsbasAlmanacSet;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_Almanac_ECEFsbasAlmanacSet != null) {
      return ImmutableList.of(TAG_Almanac_ECEFsbasAlmanacSet);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new Almanac_ECEFsbasAlmanacSet from encoded stream.
   */
  public static Almanac_ECEFsbasAlmanacSet fromPerUnaligned(byte[] encodedBytes) {
    Almanac_ECEFsbasAlmanacSet result = new Almanac_ECEFsbasAlmanacSet();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new Almanac_ECEFsbasAlmanacSet from encoded stream.
   */
  public static Almanac_ECEFsbasAlmanacSet fromPerAligned(byte[] encodedBytes) {
    Almanac_ECEFsbasAlmanacSet result = new Almanac_ECEFsbasAlmanacSet();
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

  
  private Almanac_ECEFsbasAlmanacSet.sbasAlmDataIDType sbasAlmDataID_;
  public Almanac_ECEFsbasAlmanacSet.sbasAlmDataIDType getSbasAlmDataID() {
    return sbasAlmDataID_;
  }
  /**
   * @throws ClassCastException if value is not a Almanac_ECEFsbasAlmanacSet.sbasAlmDataIDType
   */
  public void setSbasAlmDataID(Asn1Object value) {
    this.sbasAlmDataID_ = (Almanac_ECEFsbasAlmanacSet.sbasAlmDataIDType) value;
  }
  public Almanac_ECEFsbasAlmanacSet.sbasAlmDataIDType setSbasAlmDataIDToNewInstance() {
    sbasAlmDataID_ = new Almanac_ECEFsbasAlmanacSet.sbasAlmDataIDType();
    return sbasAlmDataID_;
  }
  
  private SVID svID_;
  public SVID getSvID() {
    return svID_;
  }
  /**
   * @throws ClassCastException if value is not a SVID
   */
  public void setSvID(Asn1Object value) {
    this.svID_ = (SVID) value;
  }
  public SVID setSvIDToNewInstance() {
    svID_ = new SVID();
    return svID_;
  }
  
  private Almanac_ECEFsbasAlmanacSet.sbasAlmHealthType sbasAlmHealth_;
  public Almanac_ECEFsbasAlmanacSet.sbasAlmHealthType getSbasAlmHealth() {
    return sbasAlmHealth_;
  }
  /**
   * @throws ClassCastException if value is not a Almanac_ECEFsbasAlmanacSet.sbasAlmHealthType
   */
  public void setSbasAlmHealth(Asn1Object value) {
    this.sbasAlmHealth_ = (Almanac_ECEFsbasAlmanacSet.sbasAlmHealthType) value;
  }
  public Almanac_ECEFsbasAlmanacSet.sbasAlmHealthType setSbasAlmHealthToNewInstance() {
    sbasAlmHealth_ = new Almanac_ECEFsbasAlmanacSet.sbasAlmHealthType();
    return sbasAlmHealth_;
  }
  
  private Almanac_ECEFsbasAlmanacSet.sbasAlmXgType sbasAlmXg_;
  public Almanac_ECEFsbasAlmanacSet.sbasAlmXgType getSbasAlmXg() {
    return sbasAlmXg_;
  }
  /**
   * @throws ClassCastException if value is not a Almanac_ECEFsbasAlmanacSet.sbasAlmXgType
   */
  public void setSbasAlmXg(Asn1Object value) {
    this.sbasAlmXg_ = (Almanac_ECEFsbasAlmanacSet.sbasAlmXgType) value;
  }
  public Almanac_ECEFsbasAlmanacSet.sbasAlmXgType setSbasAlmXgToNewInstance() {
    sbasAlmXg_ = new Almanac_ECEFsbasAlmanacSet.sbasAlmXgType();
    return sbasAlmXg_;
  }
  
  private Almanac_ECEFsbasAlmanacSet.sbasAlmYgType sbasAlmYg_;
  public Almanac_ECEFsbasAlmanacSet.sbasAlmYgType getSbasAlmYg() {
    return sbasAlmYg_;
  }
  /**
   * @throws ClassCastException if value is not a Almanac_ECEFsbasAlmanacSet.sbasAlmYgType
   */
  public void setSbasAlmYg(Asn1Object value) {
    this.sbasAlmYg_ = (Almanac_ECEFsbasAlmanacSet.sbasAlmYgType) value;
  }
  public Almanac_ECEFsbasAlmanacSet.sbasAlmYgType setSbasAlmYgToNewInstance() {
    sbasAlmYg_ = new Almanac_ECEFsbasAlmanacSet.sbasAlmYgType();
    return sbasAlmYg_;
  }
  
  private Almanac_ECEFsbasAlmanacSet.sbasAlmZgType sbasAlmZg_;
  public Almanac_ECEFsbasAlmanacSet.sbasAlmZgType getSbasAlmZg() {
    return sbasAlmZg_;
  }
  /**
   * @throws ClassCastException if value is not a Almanac_ECEFsbasAlmanacSet.sbasAlmZgType
   */
  public void setSbasAlmZg(Asn1Object value) {
    this.sbasAlmZg_ = (Almanac_ECEFsbasAlmanacSet.sbasAlmZgType) value;
  }
  public Almanac_ECEFsbasAlmanacSet.sbasAlmZgType setSbasAlmZgToNewInstance() {
    sbasAlmZg_ = new Almanac_ECEFsbasAlmanacSet.sbasAlmZgType();
    return sbasAlmZg_;
  }
  
  private Almanac_ECEFsbasAlmanacSet.sbasAlmXgdotType sbasAlmXgdot_;
  public Almanac_ECEFsbasAlmanacSet.sbasAlmXgdotType getSbasAlmXgdot() {
    return sbasAlmXgdot_;
  }
  /**
   * @throws ClassCastException if value is not a Almanac_ECEFsbasAlmanacSet.sbasAlmXgdotType
   */
  public void setSbasAlmXgdot(Asn1Object value) {
    this.sbasAlmXgdot_ = (Almanac_ECEFsbasAlmanacSet.sbasAlmXgdotType) value;
  }
  public Almanac_ECEFsbasAlmanacSet.sbasAlmXgdotType setSbasAlmXgdotToNewInstance() {
    sbasAlmXgdot_ = new Almanac_ECEFsbasAlmanacSet.sbasAlmXgdotType();
    return sbasAlmXgdot_;
  }
  
  private Almanac_ECEFsbasAlmanacSet.sbasAlmYgDotType sbasAlmYgDot_;
  public Almanac_ECEFsbasAlmanacSet.sbasAlmYgDotType getSbasAlmYgDot() {
    return sbasAlmYgDot_;
  }
  /**
   * @throws ClassCastException if value is not a Almanac_ECEFsbasAlmanacSet.sbasAlmYgDotType
   */
  public void setSbasAlmYgDot(Asn1Object value) {
    this.sbasAlmYgDot_ = (Almanac_ECEFsbasAlmanacSet.sbasAlmYgDotType) value;
  }
  public Almanac_ECEFsbasAlmanacSet.sbasAlmYgDotType setSbasAlmYgDotToNewInstance() {
    sbasAlmYgDot_ = new Almanac_ECEFsbasAlmanacSet.sbasAlmYgDotType();
    return sbasAlmYgDot_;
  }
  
  private Almanac_ECEFsbasAlmanacSet.sbasAlmZgDotType sbasAlmZgDot_;
  public Almanac_ECEFsbasAlmanacSet.sbasAlmZgDotType getSbasAlmZgDot() {
    return sbasAlmZgDot_;
  }
  /**
   * @throws ClassCastException if value is not a Almanac_ECEFsbasAlmanacSet.sbasAlmZgDotType
   */
  public void setSbasAlmZgDot(Asn1Object value) {
    this.sbasAlmZgDot_ = (Almanac_ECEFsbasAlmanacSet.sbasAlmZgDotType) value;
  }
  public Almanac_ECEFsbasAlmanacSet.sbasAlmZgDotType setSbasAlmZgDotToNewInstance() {
    sbasAlmZgDot_ = new Almanac_ECEFsbasAlmanacSet.sbasAlmZgDotType();
    return sbasAlmZgDot_;
  }
  
  private Almanac_ECEFsbasAlmanacSet.sbasAlmToType sbasAlmTo_;
  public Almanac_ECEFsbasAlmanacSet.sbasAlmToType getSbasAlmTo() {
    return sbasAlmTo_;
  }
  /**
   * @throws ClassCastException if value is not a Almanac_ECEFsbasAlmanacSet.sbasAlmToType
   */
  public void setSbasAlmTo(Asn1Object value) {
    this.sbasAlmTo_ = (Almanac_ECEFsbasAlmanacSet.sbasAlmToType) value;
  }
  public Almanac_ECEFsbasAlmanacSet.sbasAlmToType setSbasAlmToToNewInstance() {
    sbasAlmTo_ = new Almanac_ECEFsbasAlmanacSet.sbasAlmToType();
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
            return tag == null ? Almanac_ECEFsbasAlmanacSet.sbasAlmDataIDType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? SVID.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? Almanac_ECEFsbasAlmanacSet.sbasAlmHealthType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? Almanac_ECEFsbasAlmanacSet.sbasAlmXgType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? Almanac_ECEFsbasAlmanacSet.sbasAlmYgType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? Almanac_ECEFsbasAlmanacSet.sbasAlmZgType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? Almanac_ECEFsbasAlmanacSet.sbasAlmXgdotType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? Almanac_ECEFsbasAlmanacSet.sbasAlmYgDotType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? Almanac_ECEFsbasAlmanacSet.sbasAlmZgDotType.getPossibleFirstTags() : ImmutableList.of(tag);
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
            return tag == null ? Almanac_ECEFsbasAlmanacSet.sbasAlmToType.getPossibleFirstTags() : ImmutableList.of(tag);
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
    builder.append("Almanac_ECEFsbasAlmanacSet = {\n");
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
