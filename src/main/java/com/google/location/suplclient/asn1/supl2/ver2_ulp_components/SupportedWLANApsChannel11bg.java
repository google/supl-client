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
import com.google.location.suplclient.asn1.base.Asn1Boolean;
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
public  class SupportedWLANApsChannel11bg extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_SupportedWLANApsChannel11bg
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public SupportedWLANApsChannel11bg() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_SupportedWLANApsChannel11bg;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_SupportedWLANApsChannel11bg != null) {
      return ImmutableList.of(TAG_SupportedWLANApsChannel11bg);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new SupportedWLANApsChannel11bg from encoded stream.
   */
  public static SupportedWLANApsChannel11bg fromPerUnaligned(byte[] encodedBytes) {
    SupportedWLANApsChannel11bg result = new SupportedWLANApsChannel11bg();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new SupportedWLANApsChannel11bg from encoded stream.
   */
  public static SupportedWLANApsChannel11bg fromPerAligned(byte[] encodedBytes) {
    SupportedWLANApsChannel11bg result = new SupportedWLANApsChannel11bg();
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

  
  private SupportedWLANApsChannel11bg.ch1Type ch1_;
  public SupportedWLANApsChannel11bg.ch1Type getCh1() {
    return ch1_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedWLANApsChannel11bg.ch1Type
   */
  public void setCh1(Asn1Object value) {
    this.ch1_ = (SupportedWLANApsChannel11bg.ch1Type) value;
  }
  public SupportedWLANApsChannel11bg.ch1Type setCh1ToNewInstance() {
    ch1_ = new SupportedWLANApsChannel11bg.ch1Type();
    return ch1_;
  }
  
  private SupportedWLANApsChannel11bg.ch2Type ch2_;
  public SupportedWLANApsChannel11bg.ch2Type getCh2() {
    return ch2_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedWLANApsChannel11bg.ch2Type
   */
  public void setCh2(Asn1Object value) {
    this.ch2_ = (SupportedWLANApsChannel11bg.ch2Type) value;
  }
  public SupportedWLANApsChannel11bg.ch2Type setCh2ToNewInstance() {
    ch2_ = new SupportedWLANApsChannel11bg.ch2Type();
    return ch2_;
  }
  
  private SupportedWLANApsChannel11bg.ch3Type ch3_;
  public SupportedWLANApsChannel11bg.ch3Type getCh3() {
    return ch3_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedWLANApsChannel11bg.ch3Type
   */
  public void setCh3(Asn1Object value) {
    this.ch3_ = (SupportedWLANApsChannel11bg.ch3Type) value;
  }
  public SupportedWLANApsChannel11bg.ch3Type setCh3ToNewInstance() {
    ch3_ = new SupportedWLANApsChannel11bg.ch3Type();
    return ch3_;
  }
  
  private SupportedWLANApsChannel11bg.ch4Type ch4_;
  public SupportedWLANApsChannel11bg.ch4Type getCh4() {
    return ch4_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedWLANApsChannel11bg.ch4Type
   */
  public void setCh4(Asn1Object value) {
    this.ch4_ = (SupportedWLANApsChannel11bg.ch4Type) value;
  }
  public SupportedWLANApsChannel11bg.ch4Type setCh4ToNewInstance() {
    ch4_ = new SupportedWLANApsChannel11bg.ch4Type();
    return ch4_;
  }
  
  private SupportedWLANApsChannel11bg.ch5Type ch5_;
  public SupportedWLANApsChannel11bg.ch5Type getCh5() {
    return ch5_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedWLANApsChannel11bg.ch5Type
   */
  public void setCh5(Asn1Object value) {
    this.ch5_ = (SupportedWLANApsChannel11bg.ch5Type) value;
  }
  public SupportedWLANApsChannel11bg.ch5Type setCh5ToNewInstance() {
    ch5_ = new SupportedWLANApsChannel11bg.ch5Type();
    return ch5_;
  }
  
  private SupportedWLANApsChannel11bg.ch6Type ch6_;
  public SupportedWLANApsChannel11bg.ch6Type getCh6() {
    return ch6_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedWLANApsChannel11bg.ch6Type
   */
  public void setCh6(Asn1Object value) {
    this.ch6_ = (SupportedWLANApsChannel11bg.ch6Type) value;
  }
  public SupportedWLANApsChannel11bg.ch6Type setCh6ToNewInstance() {
    ch6_ = new SupportedWLANApsChannel11bg.ch6Type();
    return ch6_;
  }
  
  private SupportedWLANApsChannel11bg.ch7Type ch7_;
  public SupportedWLANApsChannel11bg.ch7Type getCh7() {
    return ch7_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedWLANApsChannel11bg.ch7Type
   */
  public void setCh7(Asn1Object value) {
    this.ch7_ = (SupportedWLANApsChannel11bg.ch7Type) value;
  }
  public SupportedWLANApsChannel11bg.ch7Type setCh7ToNewInstance() {
    ch7_ = new SupportedWLANApsChannel11bg.ch7Type();
    return ch7_;
  }
  
  private SupportedWLANApsChannel11bg.ch8Type ch8_;
  public SupportedWLANApsChannel11bg.ch8Type getCh8() {
    return ch8_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedWLANApsChannel11bg.ch8Type
   */
  public void setCh8(Asn1Object value) {
    this.ch8_ = (SupportedWLANApsChannel11bg.ch8Type) value;
  }
  public SupportedWLANApsChannel11bg.ch8Type setCh8ToNewInstance() {
    ch8_ = new SupportedWLANApsChannel11bg.ch8Type();
    return ch8_;
  }
  
  private SupportedWLANApsChannel11bg.ch9Type ch9_;
  public SupportedWLANApsChannel11bg.ch9Type getCh9() {
    return ch9_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedWLANApsChannel11bg.ch9Type
   */
  public void setCh9(Asn1Object value) {
    this.ch9_ = (SupportedWLANApsChannel11bg.ch9Type) value;
  }
  public SupportedWLANApsChannel11bg.ch9Type setCh9ToNewInstance() {
    ch9_ = new SupportedWLANApsChannel11bg.ch9Type();
    return ch9_;
  }
  
  private SupportedWLANApsChannel11bg.ch10Type ch10_;
  public SupportedWLANApsChannel11bg.ch10Type getCh10() {
    return ch10_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedWLANApsChannel11bg.ch10Type
   */
  public void setCh10(Asn1Object value) {
    this.ch10_ = (SupportedWLANApsChannel11bg.ch10Type) value;
  }
  public SupportedWLANApsChannel11bg.ch10Type setCh10ToNewInstance() {
    ch10_ = new SupportedWLANApsChannel11bg.ch10Type();
    return ch10_;
  }
  
  private SupportedWLANApsChannel11bg.ch11Type ch11_;
  public SupportedWLANApsChannel11bg.ch11Type getCh11() {
    return ch11_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedWLANApsChannel11bg.ch11Type
   */
  public void setCh11(Asn1Object value) {
    this.ch11_ = (SupportedWLANApsChannel11bg.ch11Type) value;
  }
  public SupportedWLANApsChannel11bg.ch11Type setCh11ToNewInstance() {
    ch11_ = new SupportedWLANApsChannel11bg.ch11Type();
    return ch11_;
  }
  
  private SupportedWLANApsChannel11bg.ch12Type ch12_;
  public SupportedWLANApsChannel11bg.ch12Type getCh12() {
    return ch12_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedWLANApsChannel11bg.ch12Type
   */
  public void setCh12(Asn1Object value) {
    this.ch12_ = (SupportedWLANApsChannel11bg.ch12Type) value;
  }
  public SupportedWLANApsChannel11bg.ch12Type setCh12ToNewInstance() {
    ch12_ = new SupportedWLANApsChannel11bg.ch12Type();
    return ch12_;
  }
  
  private SupportedWLANApsChannel11bg.ch13Type ch13_;
  public SupportedWLANApsChannel11bg.ch13Type getCh13() {
    return ch13_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedWLANApsChannel11bg.ch13Type
   */
  public void setCh13(Asn1Object value) {
    this.ch13_ = (SupportedWLANApsChannel11bg.ch13Type) value;
  }
  public SupportedWLANApsChannel11bg.ch13Type setCh13ToNewInstance() {
    ch13_ = new SupportedWLANApsChannel11bg.ch13Type();
    return ch13_;
  }
  
  private SupportedWLANApsChannel11bg.ch14Type ch14_;
  public SupportedWLANApsChannel11bg.ch14Type getCh14() {
    return ch14_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedWLANApsChannel11bg.ch14Type
   */
  public void setCh14(Asn1Object value) {
    this.ch14_ = (SupportedWLANApsChannel11bg.ch14Type) value;
  }
  public SupportedWLANApsChannel11bg.ch14Type setCh14ToNewInstance() {
    ch14_ = new SupportedWLANApsChannel11bg.ch14Type();
    return ch14_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getCh1() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCh1();
          }

          @Override public void setToNewInstance() {
            setCh1ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedWLANApsChannel11bg.ch1Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ch1 : "
                    + getCh1().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getCh2() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCh2();
          }

          @Override public void setToNewInstance() {
            setCh2ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedWLANApsChannel11bg.ch2Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ch2 : "
                    + getCh2().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getCh3() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCh3();
          }

          @Override public void setToNewInstance() {
            setCh3ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedWLANApsChannel11bg.ch3Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ch3 : "
                    + getCh3().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getCh4() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCh4();
          }

          @Override public void setToNewInstance() {
            setCh4ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedWLANApsChannel11bg.ch4Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ch4 : "
                    + getCh4().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getCh5() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCh5();
          }

          @Override public void setToNewInstance() {
            setCh5ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedWLANApsChannel11bg.ch5Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ch5 : "
                    + getCh5().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getCh6() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCh6();
          }

          @Override public void setToNewInstance() {
            setCh6ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedWLANApsChannel11bg.ch6Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ch6 : "
                    + getCh6().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getCh7() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCh7();
          }

          @Override public void setToNewInstance() {
            setCh7ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedWLANApsChannel11bg.ch7Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ch7 : "
                    + getCh7().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 7);

          @Override public boolean isExplicitlySet() {
            return getCh8() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCh8();
          }

          @Override public void setToNewInstance() {
            setCh8ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedWLANApsChannel11bg.ch8Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ch8 : "
                    + getCh8().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 8);

          @Override public boolean isExplicitlySet() {
            return getCh9() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCh9();
          }

          @Override public void setToNewInstance() {
            setCh9ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedWLANApsChannel11bg.ch9Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ch9 : "
                    + getCh9().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 9);

          @Override public boolean isExplicitlySet() {
            return getCh10() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCh10();
          }

          @Override public void setToNewInstance() {
            setCh10ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedWLANApsChannel11bg.ch10Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ch10 : "
                    + getCh10().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 10);

          @Override public boolean isExplicitlySet() {
            return getCh11() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCh11();
          }

          @Override public void setToNewInstance() {
            setCh11ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedWLANApsChannel11bg.ch11Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ch11 : "
                    + getCh11().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 11);

          @Override public boolean isExplicitlySet() {
            return getCh12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCh12();
          }

          @Override public void setToNewInstance() {
            setCh12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedWLANApsChannel11bg.ch12Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ch12 : "
                    + getCh12().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 12);

          @Override public boolean isExplicitlySet() {
            return getCh13() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCh13();
          }

          @Override public void setToNewInstance() {
            setCh13ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedWLANApsChannel11bg.ch13Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ch13 : "
                    + getCh13().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 13);

          @Override public boolean isExplicitlySet() {
            return getCh14() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCh14();
          }

          @Override public void setToNewInstance() {
            setCh14ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedWLANApsChannel11bg.ch14Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ch14 : "
                    + getCh14().toIndentedString(indent);
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
public static class ch1Type extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_ch1Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ch1Type() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ch1Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ch1Type != null) {
      return ImmutableList.of(TAG_ch1Type);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ch1Type from encoded stream.
   */
  public static ch1Type fromPerUnaligned(byte[] encodedBytes) {
    ch1Type result = new ch1Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ch1Type from encoded stream.
   */
  public static ch1Type fromPerAligned(byte[] encodedBytes) {
    ch1Type result = new ch1Type();
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
    return "ch1Type = " + getValue() + ";\n";
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
public static class ch2Type extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_ch2Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ch2Type() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ch2Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ch2Type != null) {
      return ImmutableList.of(TAG_ch2Type);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ch2Type from encoded stream.
   */
  public static ch2Type fromPerUnaligned(byte[] encodedBytes) {
    ch2Type result = new ch2Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ch2Type from encoded stream.
   */
  public static ch2Type fromPerAligned(byte[] encodedBytes) {
    ch2Type result = new ch2Type();
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
    return "ch2Type = " + getValue() + ";\n";
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
public static class ch3Type extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_ch3Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ch3Type() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ch3Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ch3Type != null) {
      return ImmutableList.of(TAG_ch3Type);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ch3Type from encoded stream.
   */
  public static ch3Type fromPerUnaligned(byte[] encodedBytes) {
    ch3Type result = new ch3Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ch3Type from encoded stream.
   */
  public static ch3Type fromPerAligned(byte[] encodedBytes) {
    ch3Type result = new ch3Type();
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
    return "ch3Type = " + getValue() + ";\n";
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
public static class ch4Type extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_ch4Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ch4Type() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ch4Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ch4Type != null) {
      return ImmutableList.of(TAG_ch4Type);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ch4Type from encoded stream.
   */
  public static ch4Type fromPerUnaligned(byte[] encodedBytes) {
    ch4Type result = new ch4Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ch4Type from encoded stream.
   */
  public static ch4Type fromPerAligned(byte[] encodedBytes) {
    ch4Type result = new ch4Type();
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
    return "ch4Type = " + getValue() + ";\n";
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
public static class ch5Type extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_ch5Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ch5Type() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ch5Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ch5Type != null) {
      return ImmutableList.of(TAG_ch5Type);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ch5Type from encoded stream.
   */
  public static ch5Type fromPerUnaligned(byte[] encodedBytes) {
    ch5Type result = new ch5Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ch5Type from encoded stream.
   */
  public static ch5Type fromPerAligned(byte[] encodedBytes) {
    ch5Type result = new ch5Type();
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
    return "ch5Type = " + getValue() + ";\n";
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
public static class ch6Type extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_ch6Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ch6Type() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ch6Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ch6Type != null) {
      return ImmutableList.of(TAG_ch6Type);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ch6Type from encoded stream.
   */
  public static ch6Type fromPerUnaligned(byte[] encodedBytes) {
    ch6Type result = new ch6Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ch6Type from encoded stream.
   */
  public static ch6Type fromPerAligned(byte[] encodedBytes) {
    ch6Type result = new ch6Type();
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
    return "ch6Type = " + getValue() + ";\n";
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
public static class ch7Type extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_ch7Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ch7Type() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ch7Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ch7Type != null) {
      return ImmutableList.of(TAG_ch7Type);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ch7Type from encoded stream.
   */
  public static ch7Type fromPerUnaligned(byte[] encodedBytes) {
    ch7Type result = new ch7Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ch7Type from encoded stream.
   */
  public static ch7Type fromPerAligned(byte[] encodedBytes) {
    ch7Type result = new ch7Type();
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
    return "ch7Type = " + getValue() + ";\n";
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
public static class ch8Type extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_ch8Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ch8Type() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ch8Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ch8Type != null) {
      return ImmutableList.of(TAG_ch8Type);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ch8Type from encoded stream.
   */
  public static ch8Type fromPerUnaligned(byte[] encodedBytes) {
    ch8Type result = new ch8Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ch8Type from encoded stream.
   */
  public static ch8Type fromPerAligned(byte[] encodedBytes) {
    ch8Type result = new ch8Type();
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
    return "ch8Type = " + getValue() + ";\n";
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
public static class ch9Type extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_ch9Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ch9Type() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ch9Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ch9Type != null) {
      return ImmutableList.of(TAG_ch9Type);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ch9Type from encoded stream.
   */
  public static ch9Type fromPerUnaligned(byte[] encodedBytes) {
    ch9Type result = new ch9Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ch9Type from encoded stream.
   */
  public static ch9Type fromPerAligned(byte[] encodedBytes) {
    ch9Type result = new ch9Type();
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
    return "ch9Type = " + getValue() + ";\n";
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
public static class ch10Type extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_ch10Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ch10Type() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ch10Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ch10Type != null) {
      return ImmutableList.of(TAG_ch10Type);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ch10Type from encoded stream.
   */
  public static ch10Type fromPerUnaligned(byte[] encodedBytes) {
    ch10Type result = new ch10Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ch10Type from encoded stream.
   */
  public static ch10Type fromPerAligned(byte[] encodedBytes) {
    ch10Type result = new ch10Type();
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
    return "ch10Type = " + getValue() + ";\n";
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
public static class ch11Type extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_ch11Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ch11Type() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ch11Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ch11Type != null) {
      return ImmutableList.of(TAG_ch11Type);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ch11Type from encoded stream.
   */
  public static ch11Type fromPerUnaligned(byte[] encodedBytes) {
    ch11Type result = new ch11Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ch11Type from encoded stream.
   */
  public static ch11Type fromPerAligned(byte[] encodedBytes) {
    ch11Type result = new ch11Type();
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
    return "ch11Type = " + getValue() + ";\n";
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
public static class ch12Type extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_ch12Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ch12Type() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ch12Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ch12Type != null) {
      return ImmutableList.of(TAG_ch12Type);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ch12Type from encoded stream.
   */
  public static ch12Type fromPerUnaligned(byte[] encodedBytes) {
    ch12Type result = new ch12Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ch12Type from encoded stream.
   */
  public static ch12Type fromPerAligned(byte[] encodedBytes) {
    ch12Type result = new ch12Type();
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
    return "ch12Type = " + getValue() + ";\n";
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
public static class ch13Type extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_ch13Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ch13Type() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ch13Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ch13Type != null) {
      return ImmutableList.of(TAG_ch13Type);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ch13Type from encoded stream.
   */
  public static ch13Type fromPerUnaligned(byte[] encodedBytes) {
    ch13Type result = new ch13Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ch13Type from encoded stream.
   */
  public static ch13Type fromPerAligned(byte[] encodedBytes) {
    ch13Type result = new ch13Type();
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
    return "ch13Type = " + getValue() + ";\n";
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
public static class ch14Type extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_ch14Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ch14Type() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ch14Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ch14Type != null) {
      return ImmutableList.of(TAG_ch14Type);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ch14Type from encoded stream.
   */
  public static ch14Type fromPerUnaligned(byte[] encodedBytes) {
    ch14Type result = new ch14Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ch14Type from encoded stream.
   */
  public static ch14Type fromPerAligned(byte[] encodedBytes) {
    ch14Type result = new ch14Type();
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
    return "ch14Type = " + getValue() + ";\n";
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
    builder.append("SupportedWLANApsChannel11bg = {\n");
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
