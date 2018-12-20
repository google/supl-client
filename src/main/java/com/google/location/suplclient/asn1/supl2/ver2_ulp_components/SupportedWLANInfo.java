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
public  class SupportedWLANInfo extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_SupportedWLANInfo
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public SupportedWLANInfo() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_SupportedWLANInfo;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_SupportedWLANInfo != null) {
      return ImmutableList.of(TAG_SupportedWLANInfo);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new SupportedWLANInfo from encoded stream.
   */
  public static SupportedWLANInfo fromPerUnaligned(byte[] encodedBytes) {
    SupportedWLANInfo result = new SupportedWLANInfo();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new SupportedWLANInfo from encoded stream.
   */
  public static SupportedWLANInfo fromPerAligned(byte[] encodedBytes) {
    SupportedWLANInfo result = new SupportedWLANInfo();
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

  
  private SupportedWLANInfo.apTPType apTP_;
  public SupportedWLANInfo.apTPType getApTP() {
    return apTP_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedWLANInfo.apTPType
   */
  public void setApTP(Asn1Object value) {
    this.apTP_ = (SupportedWLANInfo.apTPType) value;
  }
  public SupportedWLANInfo.apTPType setApTPToNewInstance() {
    apTP_ = new SupportedWLANInfo.apTPType();
    return apTP_;
  }
  
  private SupportedWLANInfo.apAGType apAG_;
  public SupportedWLANInfo.apAGType getApAG() {
    return apAG_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedWLANInfo.apAGType
   */
  public void setApAG(Asn1Object value) {
    this.apAG_ = (SupportedWLANInfo.apAGType) value;
  }
  public SupportedWLANInfo.apAGType setApAGToNewInstance() {
    apAG_ = new SupportedWLANInfo.apAGType();
    return apAG_;
  }
  
  private SupportedWLANInfo.apSNType apSN_;
  public SupportedWLANInfo.apSNType getApSN() {
    return apSN_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedWLANInfo.apSNType
   */
  public void setApSN(Asn1Object value) {
    this.apSN_ = (SupportedWLANInfo.apSNType) value;
  }
  public SupportedWLANInfo.apSNType setApSNToNewInstance() {
    apSN_ = new SupportedWLANInfo.apSNType();
    return apSN_;
  }
  
  private SupportedWLANInfo.apDevTypeType apDevType_;
  public SupportedWLANInfo.apDevTypeType getApDevType() {
    return apDevType_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedWLANInfo.apDevTypeType
   */
  public void setApDevType(Asn1Object value) {
    this.apDevType_ = (SupportedWLANInfo.apDevTypeType) value;
  }
  public SupportedWLANInfo.apDevTypeType setApDevTypeToNewInstance() {
    apDevType_ = new SupportedWLANInfo.apDevTypeType();
    return apDevType_;
  }
  
  private SupportedWLANInfo.apRSSIType apRSSI_;
  public SupportedWLANInfo.apRSSIType getApRSSI() {
    return apRSSI_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedWLANInfo.apRSSIType
   */
  public void setApRSSI(Asn1Object value) {
    this.apRSSI_ = (SupportedWLANInfo.apRSSIType) value;
  }
  public SupportedWLANInfo.apRSSIType setApRSSIToNewInstance() {
    apRSSI_ = new SupportedWLANInfo.apRSSIType();
    return apRSSI_;
  }
  
  private SupportedWLANInfo.apChanFreqType apChanFreq_;
  public SupportedWLANInfo.apChanFreqType getApChanFreq() {
    return apChanFreq_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedWLANInfo.apChanFreqType
   */
  public void setApChanFreq(Asn1Object value) {
    this.apChanFreq_ = (SupportedWLANInfo.apChanFreqType) value;
  }
  public SupportedWLANInfo.apChanFreqType setApChanFreqToNewInstance() {
    apChanFreq_ = new SupportedWLANInfo.apChanFreqType();
    return apChanFreq_;
  }
  
  private SupportedWLANInfo.apRTDType apRTD_;
  public SupportedWLANInfo.apRTDType getApRTD() {
    return apRTD_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedWLANInfo.apRTDType
   */
  public void setApRTD(Asn1Object value) {
    this.apRTD_ = (SupportedWLANInfo.apRTDType) value;
  }
  public SupportedWLANInfo.apRTDType setApRTDToNewInstance() {
    apRTD_ = new SupportedWLANInfo.apRTDType();
    return apRTD_;
  }
  
  private SupportedWLANInfo.setTPType setTP_;
  public SupportedWLANInfo.setTPType getSetTP() {
    return setTP_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedWLANInfo.setTPType
   */
  public void setSetTP(Asn1Object value) {
    this.setTP_ = (SupportedWLANInfo.setTPType) value;
  }
  public SupportedWLANInfo.setTPType setSetTPToNewInstance() {
    setTP_ = new SupportedWLANInfo.setTPType();
    return setTP_;
  }
  
  private SupportedWLANInfo.setAGType setAG_;
  public SupportedWLANInfo.setAGType getSetAG() {
    return setAG_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedWLANInfo.setAGType
   */
  public void setSetAG(Asn1Object value) {
    this.setAG_ = (SupportedWLANInfo.setAGType) value;
  }
  public SupportedWLANInfo.setAGType setSetAGToNewInstance() {
    setAG_ = new SupportedWLANInfo.setAGType();
    return setAG_;
  }
  
  private SupportedWLANInfo.setSNType setSN_;
  public SupportedWLANInfo.setSNType getSetSN() {
    return setSN_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedWLANInfo.setSNType
   */
  public void setSetSN(Asn1Object value) {
    this.setSN_ = (SupportedWLANInfo.setSNType) value;
  }
  public SupportedWLANInfo.setSNType setSetSNToNewInstance() {
    setSN_ = new SupportedWLANInfo.setSNType();
    return setSN_;
  }
  
  private SupportedWLANInfo.setRSSIType setRSSI_;
  public SupportedWLANInfo.setRSSIType getSetRSSI() {
    return setRSSI_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedWLANInfo.setRSSIType
   */
  public void setSetRSSI(Asn1Object value) {
    this.setRSSI_ = (SupportedWLANInfo.setRSSIType) value;
  }
  public SupportedWLANInfo.setRSSIType setSetRSSIToNewInstance() {
    setRSSI_ = new SupportedWLANInfo.setRSSIType();
    return setRSSI_;
  }
  
  private SupportedWLANInfo.apRepLocType apRepLoc_;
  public SupportedWLANInfo.apRepLocType getApRepLoc() {
    return apRepLoc_;
  }
  /**
   * @throws ClassCastException if value is not a SupportedWLANInfo.apRepLocType
   */
  public void setApRepLoc(Asn1Object value) {
    this.apRepLoc_ = (SupportedWLANInfo.apRepLocType) value;
  }
  public SupportedWLANInfo.apRepLocType setApRepLocToNewInstance() {
    apRepLoc_ = new SupportedWLANInfo.apRepLocType();
    return apRepLoc_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getApTP() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getApTP();
          }

          @Override public void setToNewInstance() {
            setApTPToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedWLANInfo.apTPType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "apTP : "
                    + getApTP().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getApAG() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getApAG();
          }

          @Override public void setToNewInstance() {
            setApAGToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedWLANInfo.apAGType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "apAG : "
                    + getApAG().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getApSN() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getApSN();
          }

          @Override public void setToNewInstance() {
            setApSNToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedWLANInfo.apSNType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "apSN : "
                    + getApSN().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getApDevType() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getApDevType();
          }

          @Override public void setToNewInstance() {
            setApDevTypeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedWLANInfo.apDevTypeType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "apDevType : "
                    + getApDevType().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getApRSSI() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getApRSSI();
          }

          @Override public void setToNewInstance() {
            setApRSSIToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedWLANInfo.apRSSIType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "apRSSI : "
                    + getApRSSI().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getApChanFreq() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getApChanFreq();
          }

          @Override public void setToNewInstance() {
            setApChanFreqToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedWLANInfo.apChanFreqType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "apChanFreq : "
                    + getApChanFreq().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getApRTD() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getApRTD();
          }

          @Override public void setToNewInstance() {
            setApRTDToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedWLANInfo.apRTDType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "apRTD : "
                    + getApRTD().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 7);

          @Override public boolean isExplicitlySet() {
            return getSetTP() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getSetTP();
          }

          @Override public void setToNewInstance() {
            setSetTPToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedWLANInfo.setTPType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "setTP : "
                    + getSetTP().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 8);

          @Override public boolean isExplicitlySet() {
            return getSetAG() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getSetAG();
          }

          @Override public void setToNewInstance() {
            setSetAGToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedWLANInfo.setAGType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "setAG : "
                    + getSetAG().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 9);

          @Override public boolean isExplicitlySet() {
            return getSetSN() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getSetSN();
          }

          @Override public void setToNewInstance() {
            setSetSNToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedWLANInfo.setSNType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "setSN : "
                    + getSetSN().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 10);

          @Override public boolean isExplicitlySet() {
            return getSetRSSI() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getSetRSSI();
          }

          @Override public void setToNewInstance() {
            setSetRSSIToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedWLANInfo.setRSSIType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "setRSSI : "
                    + getSetRSSI().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 11);

          @Override public boolean isExplicitlySet() {
            return getApRepLoc() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getApRepLoc();
          }

          @Override public void setToNewInstance() {
            setApRepLocToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SupportedWLANInfo.apRepLocType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "apRepLoc : "
                    + getApRepLoc().toIndentedString(indent);
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
public static class apTPType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_apTPType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public apTPType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_apTPType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_apTPType != null) {
      return ImmutableList.of(TAG_apTPType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new apTPType from encoded stream.
   */
  public static apTPType fromPerUnaligned(byte[] encodedBytes) {
    apTPType result = new apTPType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new apTPType from encoded stream.
   */
  public static apTPType fromPerAligned(byte[] encodedBytes) {
    apTPType result = new apTPType();
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
    return "apTPType = " + getValue() + ";\n";
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
public static class apAGType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_apAGType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public apAGType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_apAGType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_apAGType != null) {
      return ImmutableList.of(TAG_apAGType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new apAGType from encoded stream.
   */
  public static apAGType fromPerUnaligned(byte[] encodedBytes) {
    apAGType result = new apAGType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new apAGType from encoded stream.
   */
  public static apAGType fromPerAligned(byte[] encodedBytes) {
    apAGType result = new apAGType();
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
    return "apAGType = " + getValue() + ";\n";
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
public static class apSNType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_apSNType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public apSNType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_apSNType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_apSNType != null) {
      return ImmutableList.of(TAG_apSNType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new apSNType from encoded stream.
   */
  public static apSNType fromPerUnaligned(byte[] encodedBytes) {
    apSNType result = new apSNType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new apSNType from encoded stream.
   */
  public static apSNType fromPerAligned(byte[] encodedBytes) {
    apSNType result = new apSNType();
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
    return "apSNType = " + getValue() + ";\n";
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
public static class apDevTypeType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_apDevTypeType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public apDevTypeType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_apDevTypeType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_apDevTypeType != null) {
      return ImmutableList.of(TAG_apDevTypeType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new apDevTypeType from encoded stream.
   */
  public static apDevTypeType fromPerUnaligned(byte[] encodedBytes) {
    apDevTypeType result = new apDevTypeType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new apDevTypeType from encoded stream.
   */
  public static apDevTypeType fromPerAligned(byte[] encodedBytes) {
    apDevTypeType result = new apDevTypeType();
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
    return "apDevTypeType = " + getValue() + ";\n";
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
public static class apRSSIType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_apRSSIType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public apRSSIType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_apRSSIType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_apRSSIType != null) {
      return ImmutableList.of(TAG_apRSSIType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new apRSSIType from encoded stream.
   */
  public static apRSSIType fromPerUnaligned(byte[] encodedBytes) {
    apRSSIType result = new apRSSIType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new apRSSIType from encoded stream.
   */
  public static apRSSIType fromPerAligned(byte[] encodedBytes) {
    apRSSIType result = new apRSSIType();
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
    return "apRSSIType = " + getValue() + ";\n";
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
public static class apChanFreqType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_apChanFreqType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public apChanFreqType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_apChanFreqType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_apChanFreqType != null) {
      return ImmutableList.of(TAG_apChanFreqType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new apChanFreqType from encoded stream.
   */
  public static apChanFreqType fromPerUnaligned(byte[] encodedBytes) {
    apChanFreqType result = new apChanFreqType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new apChanFreqType from encoded stream.
   */
  public static apChanFreqType fromPerAligned(byte[] encodedBytes) {
    apChanFreqType result = new apChanFreqType();
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
    return "apChanFreqType = " + getValue() + ";\n";
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
public static class apRTDType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_apRTDType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public apRTDType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_apRTDType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_apRTDType != null) {
      return ImmutableList.of(TAG_apRTDType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new apRTDType from encoded stream.
   */
  public static apRTDType fromPerUnaligned(byte[] encodedBytes) {
    apRTDType result = new apRTDType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new apRTDType from encoded stream.
   */
  public static apRTDType fromPerAligned(byte[] encodedBytes) {
    apRTDType result = new apRTDType();
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
    return "apRTDType = " + getValue() + ";\n";
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
public static class setTPType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_setTPType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public setTPType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_setTPType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_setTPType != null) {
      return ImmutableList.of(TAG_setTPType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new setTPType from encoded stream.
   */
  public static setTPType fromPerUnaligned(byte[] encodedBytes) {
    setTPType result = new setTPType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new setTPType from encoded stream.
   */
  public static setTPType fromPerAligned(byte[] encodedBytes) {
    setTPType result = new setTPType();
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
    return "setTPType = " + getValue() + ";\n";
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
public static class setAGType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_setAGType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public setAGType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_setAGType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_setAGType != null) {
      return ImmutableList.of(TAG_setAGType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new setAGType from encoded stream.
   */
  public static setAGType fromPerUnaligned(byte[] encodedBytes) {
    setAGType result = new setAGType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new setAGType from encoded stream.
   */
  public static setAGType fromPerAligned(byte[] encodedBytes) {
    setAGType result = new setAGType();
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
    return "setAGType = " + getValue() + ";\n";
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
public static class setSNType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_setSNType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public setSNType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_setSNType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_setSNType != null) {
      return ImmutableList.of(TAG_setSNType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new setSNType from encoded stream.
   */
  public static setSNType fromPerUnaligned(byte[] encodedBytes) {
    setSNType result = new setSNType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new setSNType from encoded stream.
   */
  public static setSNType fromPerAligned(byte[] encodedBytes) {
    setSNType result = new setSNType();
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
    return "setSNType = " + getValue() + ";\n";
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
public static class setRSSIType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_setRSSIType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public setRSSIType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_setRSSIType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_setRSSIType != null) {
      return ImmutableList.of(TAG_setRSSIType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new setRSSIType from encoded stream.
   */
  public static setRSSIType fromPerUnaligned(byte[] encodedBytes) {
    setRSSIType result = new setRSSIType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new setRSSIType from encoded stream.
   */
  public static setRSSIType fromPerAligned(byte[] encodedBytes) {
    setRSSIType result = new setRSSIType();
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
    return "setRSSIType = " + getValue() + ";\n";
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
public static class apRepLocType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_apRepLocType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public apRepLocType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_apRepLocType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_apRepLocType != null) {
      return ImmutableList.of(TAG_apRepLocType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new apRepLocType from encoded stream.
   */
  public static apRepLocType fromPerUnaligned(byte[] encodedBytes) {
    apRepLocType result = new apRepLocType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new apRepLocType from encoded stream.
   */
  public static apRepLocType fromPerAligned(byte[] encodedBytes) {
    apRepLocType result = new apRepLocType();
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
    return "apRepLocType = " + getValue() + ";\n";
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
    builder.append("SupportedWLANInfo = {\n");
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
