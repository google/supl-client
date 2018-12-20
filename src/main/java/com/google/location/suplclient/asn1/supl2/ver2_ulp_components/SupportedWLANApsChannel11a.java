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
public  class SupportedWLANApsChannel11a extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_SupportedWLANApsChannel11a
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public SupportedWLANApsChannel11a() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_SupportedWLANApsChannel11a;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_SupportedWLANApsChannel11a != null) {
      return ImmutableList.of(TAG_SupportedWLANApsChannel11a);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new SupportedWLANApsChannel11a from encoded stream.
   */
  public static SupportedWLANApsChannel11a fromPerUnaligned(byte[] encodedBytes) {
    SupportedWLANApsChannel11a result = new SupportedWLANApsChannel11a();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new SupportedWLANApsChannel11a from encoded stream.
   */
  public static SupportedWLANApsChannel11a fromPerAligned(byte[] encodedBytes) {
    SupportedWLANApsChannel11a result = new SupportedWLANApsChannel11a();
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

  
  private SupportedWLANApsChannel11a.ch34Type ch34_;
  public SupportedWLANApsChannel11a.ch34Type getCh34() {
    return ch34_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedWLANApsChannel11a.ch34Type
   */
  public void setCh34(Asn1Object value) {
    this.ch34_ = (SupportedWLANApsChannel11a.ch34Type) value;
  }
  public SupportedWLANApsChannel11a.ch34Type setCh34ToNewInstance() {
    ch34_ = new SupportedWLANApsChannel11a.ch34Type();
    return ch34_;
  }
  
  private SupportedWLANApsChannel11a.ch36Type ch36_;
  public SupportedWLANApsChannel11a.ch36Type getCh36() {
    return ch36_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedWLANApsChannel11a.ch36Type
   */
  public void setCh36(Asn1Object value) {
    this.ch36_ = (SupportedWLANApsChannel11a.ch36Type) value;
  }
  public SupportedWLANApsChannel11a.ch36Type setCh36ToNewInstance() {
    ch36_ = new SupportedWLANApsChannel11a.ch36Type();
    return ch36_;
  }
  
  private SupportedWLANApsChannel11a.ch38Type ch38_;
  public SupportedWLANApsChannel11a.ch38Type getCh38() {
    return ch38_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedWLANApsChannel11a.ch38Type
   */
  public void setCh38(Asn1Object value) {
    this.ch38_ = (SupportedWLANApsChannel11a.ch38Type) value;
  }
  public SupportedWLANApsChannel11a.ch38Type setCh38ToNewInstance() {
    ch38_ = new SupportedWLANApsChannel11a.ch38Type();
    return ch38_;
  }
  
  private SupportedWLANApsChannel11a.ch40Type ch40_;
  public SupportedWLANApsChannel11a.ch40Type getCh40() {
    return ch40_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedWLANApsChannel11a.ch40Type
   */
  public void setCh40(Asn1Object value) {
    this.ch40_ = (SupportedWLANApsChannel11a.ch40Type) value;
  }
  public SupportedWLANApsChannel11a.ch40Type setCh40ToNewInstance() {
    ch40_ = new SupportedWLANApsChannel11a.ch40Type();
    return ch40_;
  }
  
  private SupportedWLANApsChannel11a.ch42Type ch42_;
  public SupportedWLANApsChannel11a.ch42Type getCh42() {
    return ch42_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedWLANApsChannel11a.ch42Type
   */
  public void setCh42(Asn1Object value) {
    this.ch42_ = (SupportedWLANApsChannel11a.ch42Type) value;
  }
  public SupportedWLANApsChannel11a.ch42Type setCh42ToNewInstance() {
    ch42_ = new SupportedWLANApsChannel11a.ch42Type();
    return ch42_;
  }
  
  private SupportedWLANApsChannel11a.ch44Type ch44_;
  public SupportedWLANApsChannel11a.ch44Type getCh44() {
    return ch44_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedWLANApsChannel11a.ch44Type
   */
  public void setCh44(Asn1Object value) {
    this.ch44_ = (SupportedWLANApsChannel11a.ch44Type) value;
  }
  public SupportedWLANApsChannel11a.ch44Type setCh44ToNewInstance() {
    ch44_ = new SupportedWLANApsChannel11a.ch44Type();
    return ch44_;
  }
  
  private SupportedWLANApsChannel11a.ch46Type ch46_;
  public SupportedWLANApsChannel11a.ch46Type getCh46() {
    return ch46_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedWLANApsChannel11a.ch46Type
   */
  public void setCh46(Asn1Object value) {
    this.ch46_ = (SupportedWLANApsChannel11a.ch46Type) value;
  }
  public SupportedWLANApsChannel11a.ch46Type setCh46ToNewInstance() {
    ch46_ = new SupportedWLANApsChannel11a.ch46Type();
    return ch46_;
  }
  
  private SupportedWLANApsChannel11a.ch48Type ch48_;
  public SupportedWLANApsChannel11a.ch48Type getCh48() {
    return ch48_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedWLANApsChannel11a.ch48Type
   */
  public void setCh48(Asn1Object value) {
    this.ch48_ = (SupportedWLANApsChannel11a.ch48Type) value;
  }
  public SupportedWLANApsChannel11a.ch48Type setCh48ToNewInstance() {
    ch48_ = new SupportedWLANApsChannel11a.ch48Type();
    return ch48_;
  }
  
  private SupportedWLANApsChannel11a.ch52Type ch52_;
  public SupportedWLANApsChannel11a.ch52Type getCh52() {
    return ch52_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedWLANApsChannel11a.ch52Type
   */
  public void setCh52(Asn1Object value) {
    this.ch52_ = (SupportedWLANApsChannel11a.ch52Type) value;
  }
  public SupportedWLANApsChannel11a.ch52Type setCh52ToNewInstance() {
    ch52_ = new SupportedWLANApsChannel11a.ch52Type();
    return ch52_;
  }
  
  private SupportedWLANApsChannel11a.ch56Type ch56_;
  public SupportedWLANApsChannel11a.ch56Type getCh56() {
    return ch56_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedWLANApsChannel11a.ch56Type
   */
  public void setCh56(Asn1Object value) {
    this.ch56_ = (SupportedWLANApsChannel11a.ch56Type) value;
  }
  public SupportedWLANApsChannel11a.ch56Type setCh56ToNewInstance() {
    ch56_ = new SupportedWLANApsChannel11a.ch56Type();
    return ch56_;
  }
  
  private SupportedWLANApsChannel11a.ch60Type ch60_;
  public SupportedWLANApsChannel11a.ch60Type getCh60() {
    return ch60_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedWLANApsChannel11a.ch60Type
   */
  public void setCh60(Asn1Object value) {
    this.ch60_ = (SupportedWLANApsChannel11a.ch60Type) value;
  }
  public SupportedWLANApsChannel11a.ch60Type setCh60ToNewInstance() {
    ch60_ = new SupportedWLANApsChannel11a.ch60Type();
    return ch60_;
  }
  
  private SupportedWLANApsChannel11a.ch64Type ch64_;
  public SupportedWLANApsChannel11a.ch64Type getCh64() {
    return ch64_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedWLANApsChannel11a.ch64Type
   */
  public void setCh64(Asn1Object value) {
    this.ch64_ = (SupportedWLANApsChannel11a.ch64Type) value;
  }
  public SupportedWLANApsChannel11a.ch64Type setCh64ToNewInstance() {
    ch64_ = new SupportedWLANApsChannel11a.ch64Type();
    return ch64_;
  }
  
  private SupportedWLANApsChannel11a.ch149Type ch149_;
  public SupportedWLANApsChannel11a.ch149Type getCh149() {
    return ch149_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedWLANApsChannel11a.ch149Type
   */
  public void setCh149(Asn1Object value) {
    this.ch149_ = (SupportedWLANApsChannel11a.ch149Type) value;
  }
  public SupportedWLANApsChannel11a.ch149Type setCh149ToNewInstance() {
    ch149_ = new SupportedWLANApsChannel11a.ch149Type();
    return ch149_;
  }
  
  private SupportedWLANApsChannel11a.ch153Type ch153_;
  public SupportedWLANApsChannel11a.ch153Type getCh153() {
    return ch153_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedWLANApsChannel11a.ch153Type
   */
  public void setCh153(Asn1Object value) {
    this.ch153_ = (SupportedWLANApsChannel11a.ch153Type) value;
  }
  public SupportedWLANApsChannel11a.ch153Type setCh153ToNewInstance() {
    ch153_ = new SupportedWLANApsChannel11a.ch153Type();
    return ch153_;
  }
  
  private SupportedWLANApsChannel11a.ch157Type ch157_;
  public SupportedWLANApsChannel11a.ch157Type getCh157() {
    return ch157_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedWLANApsChannel11a.ch157Type
   */
  public void setCh157(Asn1Object value) {
    this.ch157_ = (SupportedWLANApsChannel11a.ch157Type) value;
  }
  public SupportedWLANApsChannel11a.ch157Type setCh157ToNewInstance() {
    ch157_ = new SupportedWLANApsChannel11a.ch157Type();
    return ch157_;
  }
  
  private SupportedWLANApsChannel11a.ch161Type ch161_;
  public SupportedWLANApsChannel11a.ch161Type getCh161() {
    return ch161_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedWLANApsChannel11a.ch161Type
   */
  public void setCh161(Asn1Object value) {
    this.ch161_ = (SupportedWLANApsChannel11a.ch161Type) value;
  }
  public SupportedWLANApsChannel11a.ch161Type setCh161ToNewInstance() {
    ch161_ = new SupportedWLANApsChannel11a.ch161Type();
    return ch161_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getCh34() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCh34();
          }

          @Override public void setToNewInstance() {
            setCh34ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedWLANApsChannel11a.ch34Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ch34 : "
                    + getCh34().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getCh36() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCh36();
          }

          @Override public void setToNewInstance() {
            setCh36ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedWLANApsChannel11a.ch36Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ch36 : "
                    + getCh36().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getCh38() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCh38();
          }

          @Override public void setToNewInstance() {
            setCh38ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedWLANApsChannel11a.ch38Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ch38 : "
                    + getCh38().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getCh40() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCh40();
          }

          @Override public void setToNewInstance() {
            setCh40ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedWLANApsChannel11a.ch40Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ch40 : "
                    + getCh40().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getCh42() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCh42();
          }

          @Override public void setToNewInstance() {
            setCh42ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedWLANApsChannel11a.ch42Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ch42 : "
                    + getCh42().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getCh44() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCh44();
          }

          @Override public void setToNewInstance() {
            setCh44ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedWLANApsChannel11a.ch44Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ch44 : "
                    + getCh44().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getCh46() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCh46();
          }

          @Override public void setToNewInstance() {
            setCh46ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedWLANApsChannel11a.ch46Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ch46 : "
                    + getCh46().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 7);

          @Override public boolean isExplicitlySet() {
            return getCh48() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCh48();
          }

          @Override public void setToNewInstance() {
            setCh48ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedWLANApsChannel11a.ch48Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ch48 : "
                    + getCh48().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 8);

          @Override public boolean isExplicitlySet() {
            return getCh52() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCh52();
          }

          @Override public void setToNewInstance() {
            setCh52ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedWLANApsChannel11a.ch52Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ch52 : "
                    + getCh52().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 9);

          @Override public boolean isExplicitlySet() {
            return getCh56() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCh56();
          }

          @Override public void setToNewInstance() {
            setCh56ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedWLANApsChannel11a.ch56Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ch56 : "
                    + getCh56().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 10);

          @Override public boolean isExplicitlySet() {
            return getCh60() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCh60();
          }

          @Override public void setToNewInstance() {
            setCh60ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedWLANApsChannel11a.ch60Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ch60 : "
                    + getCh60().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 11);

          @Override public boolean isExplicitlySet() {
            return getCh64() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCh64();
          }

          @Override public void setToNewInstance() {
            setCh64ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedWLANApsChannel11a.ch64Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ch64 : "
                    + getCh64().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 12);

          @Override public boolean isExplicitlySet() {
            return getCh149() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCh149();
          }

          @Override public void setToNewInstance() {
            setCh149ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedWLANApsChannel11a.ch149Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ch149 : "
                    + getCh149().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 13);

          @Override public boolean isExplicitlySet() {
            return getCh153() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCh153();
          }

          @Override public void setToNewInstance() {
            setCh153ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedWLANApsChannel11a.ch153Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ch153 : "
                    + getCh153().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 14);

          @Override public boolean isExplicitlySet() {
            return getCh157() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCh157();
          }

          @Override public void setToNewInstance() {
            setCh157ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedWLANApsChannel11a.ch157Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ch157 : "
                    + getCh157().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 15);

          @Override public boolean isExplicitlySet() {
            return getCh161() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCh161();
          }

          @Override public void setToNewInstance() {
            setCh161ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedWLANApsChannel11a.ch161Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ch161 : "
                    + getCh161().toIndentedString(indent);
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
public static class ch34Type extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_ch34Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ch34Type() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ch34Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ch34Type != null) {
      return ImmutableList.of(TAG_ch34Type);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ch34Type from encoded stream.
   */
  public static ch34Type fromPerUnaligned(byte[] encodedBytes) {
    ch34Type result = new ch34Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ch34Type from encoded stream.
   */
  public static ch34Type fromPerAligned(byte[] encodedBytes) {
    ch34Type result = new ch34Type();
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
    return "ch34Type = " + getValue() + ";\n";
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
public static class ch36Type extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_ch36Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ch36Type() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ch36Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ch36Type != null) {
      return ImmutableList.of(TAG_ch36Type);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ch36Type from encoded stream.
   */
  public static ch36Type fromPerUnaligned(byte[] encodedBytes) {
    ch36Type result = new ch36Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ch36Type from encoded stream.
   */
  public static ch36Type fromPerAligned(byte[] encodedBytes) {
    ch36Type result = new ch36Type();
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
    return "ch36Type = " + getValue() + ";\n";
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
public static class ch38Type extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_ch38Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ch38Type() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ch38Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ch38Type != null) {
      return ImmutableList.of(TAG_ch38Type);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ch38Type from encoded stream.
   */
  public static ch38Type fromPerUnaligned(byte[] encodedBytes) {
    ch38Type result = new ch38Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ch38Type from encoded stream.
   */
  public static ch38Type fromPerAligned(byte[] encodedBytes) {
    ch38Type result = new ch38Type();
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
    return "ch38Type = " + getValue() + ";\n";
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
public static class ch40Type extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_ch40Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ch40Type() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ch40Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ch40Type != null) {
      return ImmutableList.of(TAG_ch40Type);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ch40Type from encoded stream.
   */
  public static ch40Type fromPerUnaligned(byte[] encodedBytes) {
    ch40Type result = new ch40Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ch40Type from encoded stream.
   */
  public static ch40Type fromPerAligned(byte[] encodedBytes) {
    ch40Type result = new ch40Type();
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
    return "ch40Type = " + getValue() + ";\n";
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
public static class ch42Type extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_ch42Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ch42Type() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ch42Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ch42Type != null) {
      return ImmutableList.of(TAG_ch42Type);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ch42Type from encoded stream.
   */
  public static ch42Type fromPerUnaligned(byte[] encodedBytes) {
    ch42Type result = new ch42Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ch42Type from encoded stream.
   */
  public static ch42Type fromPerAligned(byte[] encodedBytes) {
    ch42Type result = new ch42Type();
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
    return "ch42Type = " + getValue() + ";\n";
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
public static class ch44Type extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_ch44Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ch44Type() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ch44Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ch44Type != null) {
      return ImmutableList.of(TAG_ch44Type);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ch44Type from encoded stream.
   */
  public static ch44Type fromPerUnaligned(byte[] encodedBytes) {
    ch44Type result = new ch44Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ch44Type from encoded stream.
   */
  public static ch44Type fromPerAligned(byte[] encodedBytes) {
    ch44Type result = new ch44Type();
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
    return "ch44Type = " + getValue() + ";\n";
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
public static class ch46Type extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_ch46Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ch46Type() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ch46Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ch46Type != null) {
      return ImmutableList.of(TAG_ch46Type);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ch46Type from encoded stream.
   */
  public static ch46Type fromPerUnaligned(byte[] encodedBytes) {
    ch46Type result = new ch46Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ch46Type from encoded stream.
   */
  public static ch46Type fromPerAligned(byte[] encodedBytes) {
    ch46Type result = new ch46Type();
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
    return "ch46Type = " + getValue() + ";\n";
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
public static class ch48Type extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_ch48Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ch48Type() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ch48Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ch48Type != null) {
      return ImmutableList.of(TAG_ch48Type);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ch48Type from encoded stream.
   */
  public static ch48Type fromPerUnaligned(byte[] encodedBytes) {
    ch48Type result = new ch48Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ch48Type from encoded stream.
   */
  public static ch48Type fromPerAligned(byte[] encodedBytes) {
    ch48Type result = new ch48Type();
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
    return "ch48Type = " + getValue() + ";\n";
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
public static class ch52Type extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_ch52Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ch52Type() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ch52Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ch52Type != null) {
      return ImmutableList.of(TAG_ch52Type);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ch52Type from encoded stream.
   */
  public static ch52Type fromPerUnaligned(byte[] encodedBytes) {
    ch52Type result = new ch52Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ch52Type from encoded stream.
   */
  public static ch52Type fromPerAligned(byte[] encodedBytes) {
    ch52Type result = new ch52Type();
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
    return "ch52Type = " + getValue() + ";\n";
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
public static class ch56Type extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_ch56Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ch56Type() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ch56Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ch56Type != null) {
      return ImmutableList.of(TAG_ch56Type);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ch56Type from encoded stream.
   */
  public static ch56Type fromPerUnaligned(byte[] encodedBytes) {
    ch56Type result = new ch56Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ch56Type from encoded stream.
   */
  public static ch56Type fromPerAligned(byte[] encodedBytes) {
    ch56Type result = new ch56Type();
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
    return "ch56Type = " + getValue() + ";\n";
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
public static class ch60Type extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_ch60Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ch60Type() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ch60Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ch60Type != null) {
      return ImmutableList.of(TAG_ch60Type);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ch60Type from encoded stream.
   */
  public static ch60Type fromPerUnaligned(byte[] encodedBytes) {
    ch60Type result = new ch60Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ch60Type from encoded stream.
   */
  public static ch60Type fromPerAligned(byte[] encodedBytes) {
    ch60Type result = new ch60Type();
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
    return "ch60Type = " + getValue() + ";\n";
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
public static class ch64Type extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_ch64Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ch64Type() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ch64Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ch64Type != null) {
      return ImmutableList.of(TAG_ch64Type);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ch64Type from encoded stream.
   */
  public static ch64Type fromPerUnaligned(byte[] encodedBytes) {
    ch64Type result = new ch64Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ch64Type from encoded stream.
   */
  public static ch64Type fromPerAligned(byte[] encodedBytes) {
    ch64Type result = new ch64Type();
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
    return "ch64Type = " + getValue() + ";\n";
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
public static class ch149Type extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_ch149Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ch149Type() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ch149Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ch149Type != null) {
      return ImmutableList.of(TAG_ch149Type);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ch149Type from encoded stream.
   */
  public static ch149Type fromPerUnaligned(byte[] encodedBytes) {
    ch149Type result = new ch149Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ch149Type from encoded stream.
   */
  public static ch149Type fromPerAligned(byte[] encodedBytes) {
    ch149Type result = new ch149Type();
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
    return "ch149Type = " + getValue() + ";\n";
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
public static class ch153Type extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_ch153Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ch153Type() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ch153Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ch153Type != null) {
      return ImmutableList.of(TAG_ch153Type);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ch153Type from encoded stream.
   */
  public static ch153Type fromPerUnaligned(byte[] encodedBytes) {
    ch153Type result = new ch153Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ch153Type from encoded stream.
   */
  public static ch153Type fromPerAligned(byte[] encodedBytes) {
    ch153Type result = new ch153Type();
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
    return "ch153Type = " + getValue() + ";\n";
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
public static class ch157Type extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_ch157Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ch157Type() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ch157Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ch157Type != null) {
      return ImmutableList.of(TAG_ch157Type);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ch157Type from encoded stream.
   */
  public static ch157Type fromPerUnaligned(byte[] encodedBytes) {
    ch157Type result = new ch157Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ch157Type from encoded stream.
   */
  public static ch157Type fromPerAligned(byte[] encodedBytes) {
    ch157Type result = new ch157Type();
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
    return "ch157Type = " + getValue() + ";\n";
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
public static class ch161Type extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_ch161Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ch161Type() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ch161Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ch161Type != null) {
      return ImmutableList.of(TAG_ch161Type);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ch161Type from encoded stream.
   */
  public static ch161Type fromPerUnaligned(byte[] encodedBytes) {
    ch161Type result = new ch161Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ch161Type from encoded stream.
   */
  public static ch161Type fromPerAligned(byte[] encodedBytes) {
    ch161Type result = new ch161Type();
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
    return "ch161Type = " + getValue() + ";\n";
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
    builder.append("SupportedWLANApsChannel11a = {\n");
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
