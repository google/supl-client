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

package com.google.location.suplclient.asn1.supl2.supl_pos_init;

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
import com.google.location.suplclient.asn1.supl2.ulp_version_2_parameter_extensions.Ver2_RequestedAssistData_extension;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
* 
*/
public  class RequestedAssistData extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_RequestedAssistData
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public RequestedAssistData() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_RequestedAssistData;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_RequestedAssistData != null) {
      return ImmutableList.of(TAG_RequestedAssistData);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new RequestedAssistData from encoded stream.
   */
  public static RequestedAssistData fromPerUnaligned(byte[] encodedBytes) {
    RequestedAssistData result = new RequestedAssistData();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new RequestedAssistData from encoded stream.
   */
  public static RequestedAssistData fromPerAligned(byte[] encodedBytes) {
    RequestedAssistData result = new RequestedAssistData();
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

  
  private RequestedAssistData.almanacRequestedType almanacRequested_;
  public RequestedAssistData.almanacRequestedType getAlmanacRequested() {
    return almanacRequested_;
  }
  /**
   * @throws ClassCastException if value is not a RequestedAssistData.almanacRequestedType
   */
  public void setAlmanacRequested(Asn1Object value) {
    this.almanacRequested_ = (RequestedAssistData.almanacRequestedType) value;
  }
  public RequestedAssistData.almanacRequestedType setAlmanacRequestedToNewInstance() {
    almanacRequested_ = new RequestedAssistData.almanacRequestedType();
    return almanacRequested_;
  }
  
  private RequestedAssistData.utcModelRequestedType utcModelRequested_;
  public RequestedAssistData.utcModelRequestedType getUtcModelRequested() {
    return utcModelRequested_;
  }
  /**
   * @throws ClassCastException if value is not a RequestedAssistData.utcModelRequestedType
   */
  public void setUtcModelRequested(Asn1Object value) {
    this.utcModelRequested_ = (RequestedAssistData.utcModelRequestedType) value;
  }
  public RequestedAssistData.utcModelRequestedType setUtcModelRequestedToNewInstance() {
    utcModelRequested_ = new RequestedAssistData.utcModelRequestedType();
    return utcModelRequested_;
  }
  
  private RequestedAssistData.ionosphericModelRequestedType ionosphericModelRequested_;
  public RequestedAssistData.ionosphericModelRequestedType getIonosphericModelRequested() {
    return ionosphericModelRequested_;
  }
  /**
   * @throws ClassCastException if value is not a RequestedAssistData.ionosphericModelRequestedType
   */
  public void setIonosphericModelRequested(Asn1Object value) {
    this.ionosphericModelRequested_ = (RequestedAssistData.ionosphericModelRequestedType) value;
  }
  public RequestedAssistData.ionosphericModelRequestedType setIonosphericModelRequestedToNewInstance() {
    ionosphericModelRequested_ = new RequestedAssistData.ionosphericModelRequestedType();
    return ionosphericModelRequested_;
  }
  
  private RequestedAssistData.dgpsCorrectionsRequestedType dgpsCorrectionsRequested_;
  public RequestedAssistData.dgpsCorrectionsRequestedType getDgpsCorrectionsRequested() {
    return dgpsCorrectionsRequested_;
  }
  /**
   * @throws ClassCastException if value is not a RequestedAssistData.dgpsCorrectionsRequestedType
   */
  public void setDgpsCorrectionsRequested(Asn1Object value) {
    this.dgpsCorrectionsRequested_ = (RequestedAssistData.dgpsCorrectionsRequestedType) value;
  }
  public RequestedAssistData.dgpsCorrectionsRequestedType setDgpsCorrectionsRequestedToNewInstance() {
    dgpsCorrectionsRequested_ = new RequestedAssistData.dgpsCorrectionsRequestedType();
    return dgpsCorrectionsRequested_;
  }
  
  private RequestedAssistData.referenceLocationRequestedType referenceLocationRequested_;
  public RequestedAssistData.referenceLocationRequestedType getReferenceLocationRequested() {
    return referenceLocationRequested_;
  }
  /**
   * @throws ClassCastException if value is not a RequestedAssistData.referenceLocationRequestedType
   */
  public void setReferenceLocationRequested(Asn1Object value) {
    this.referenceLocationRequested_ = (RequestedAssistData.referenceLocationRequestedType) value;
  }
  public RequestedAssistData.referenceLocationRequestedType setReferenceLocationRequestedToNewInstance() {
    referenceLocationRequested_ = new RequestedAssistData.referenceLocationRequestedType();
    return referenceLocationRequested_;
  }
  
  private RequestedAssistData.referenceTimeRequestedType referenceTimeRequested_;
  public RequestedAssistData.referenceTimeRequestedType getReferenceTimeRequested() {
    return referenceTimeRequested_;
  }
  /**
   * @throws ClassCastException if value is not a RequestedAssistData.referenceTimeRequestedType
   */
  public void setReferenceTimeRequested(Asn1Object value) {
    this.referenceTimeRequested_ = (RequestedAssistData.referenceTimeRequestedType) value;
  }
  public RequestedAssistData.referenceTimeRequestedType setReferenceTimeRequestedToNewInstance() {
    referenceTimeRequested_ = new RequestedAssistData.referenceTimeRequestedType();
    return referenceTimeRequested_;
  }
  
  private RequestedAssistData.acquisitionAssistanceRequestedType acquisitionAssistanceRequested_;
  public RequestedAssistData.acquisitionAssistanceRequestedType getAcquisitionAssistanceRequested() {
    return acquisitionAssistanceRequested_;
  }
  /**
   * @throws ClassCastException if value is not a RequestedAssistData.acquisitionAssistanceRequestedType
   */
  public void setAcquisitionAssistanceRequested(Asn1Object value) {
    this.acquisitionAssistanceRequested_ = (RequestedAssistData.acquisitionAssistanceRequestedType) value;
  }
  public RequestedAssistData.acquisitionAssistanceRequestedType setAcquisitionAssistanceRequestedToNewInstance() {
    acquisitionAssistanceRequested_ = new RequestedAssistData.acquisitionAssistanceRequestedType();
    return acquisitionAssistanceRequested_;
  }
  
  private RequestedAssistData.realTimeIntegrityRequestedType realTimeIntegrityRequested_;
  public RequestedAssistData.realTimeIntegrityRequestedType getRealTimeIntegrityRequested() {
    return realTimeIntegrityRequested_;
  }
  /**
   * @throws ClassCastException if value is not a RequestedAssistData.realTimeIntegrityRequestedType
   */
  public void setRealTimeIntegrityRequested(Asn1Object value) {
    this.realTimeIntegrityRequested_ = (RequestedAssistData.realTimeIntegrityRequestedType) value;
  }
  public RequestedAssistData.realTimeIntegrityRequestedType setRealTimeIntegrityRequestedToNewInstance() {
    realTimeIntegrityRequested_ = new RequestedAssistData.realTimeIntegrityRequestedType();
    return realTimeIntegrityRequested_;
  }
  
  private RequestedAssistData.navigationModelRequestedType navigationModelRequested_;
  public RequestedAssistData.navigationModelRequestedType getNavigationModelRequested() {
    return navigationModelRequested_;
  }
  /**
   * @throws ClassCastException if value is not a RequestedAssistData.navigationModelRequestedType
   */
  public void setNavigationModelRequested(Asn1Object value) {
    this.navigationModelRequested_ = (RequestedAssistData.navigationModelRequestedType) value;
  }
  public RequestedAssistData.navigationModelRequestedType setNavigationModelRequestedToNewInstance() {
    navigationModelRequested_ = new RequestedAssistData.navigationModelRequestedType();
    return navigationModelRequested_;
  }
  
  private NavigationModel navigationModelData_;
  public NavigationModel getNavigationModelData() {
    return navigationModelData_;
  }
  /**
   * @throws ClassCastException if value is not a NavigationModel
   */
  public void setNavigationModelData(Asn1Object value) {
    this.navigationModelData_ = (NavigationModel) value;
  }
  public NavigationModel setNavigationModelDataToNewInstance() {
    navigationModelData_ = new NavigationModel();
    return navigationModelData_;
  }
  

  
  private Ver2_RequestedAssistData_extension extensionVer2_RequestedAssistData_extension;
  public Ver2_RequestedAssistData_extension getExtensionVer2_RequestedAssistData_extension() {
    return extensionVer2_RequestedAssistData_extension;
  }
  /**
   * @throws ClassCastException if value is not a Ver2_RequestedAssistData_extension
   */
  public void setExtensionVer2_RequestedAssistData_extension(Asn1Object value) {
    extensionVer2_RequestedAssistData_extension = (Ver2_RequestedAssistData_extension) value;
  }
  public void setExtensionVer2_RequestedAssistData_extensionToNewInstance() {
    extensionVer2_RequestedAssistData_extension = new Ver2_RequestedAssistData_extension();
  }
    

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getAlmanacRequested() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getAlmanacRequested();
          }

          @Override public void setToNewInstance() {
            setAlmanacRequestedToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? RequestedAssistData.almanacRequestedType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "almanacRequested : "
                    + getAlmanacRequested().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getUtcModelRequested() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getUtcModelRequested();
          }

          @Override public void setToNewInstance() {
            setUtcModelRequestedToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? RequestedAssistData.utcModelRequestedType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "utcModelRequested : "
                    + getUtcModelRequested().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getIonosphericModelRequested() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getIonosphericModelRequested();
          }

          @Override public void setToNewInstance() {
            setIonosphericModelRequestedToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? RequestedAssistData.ionosphericModelRequestedType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ionosphericModelRequested : "
                    + getIonosphericModelRequested().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getDgpsCorrectionsRequested() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getDgpsCorrectionsRequested();
          }

          @Override public void setToNewInstance() {
            setDgpsCorrectionsRequestedToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? RequestedAssistData.dgpsCorrectionsRequestedType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "dgpsCorrectionsRequested : "
                    + getDgpsCorrectionsRequested().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getReferenceLocationRequested() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getReferenceLocationRequested();
          }

          @Override public void setToNewInstance() {
            setReferenceLocationRequestedToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? RequestedAssistData.referenceLocationRequestedType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "referenceLocationRequested : "
                    + getReferenceLocationRequested().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getReferenceTimeRequested() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getReferenceTimeRequested();
          }

          @Override public void setToNewInstance() {
            setReferenceTimeRequestedToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? RequestedAssistData.referenceTimeRequestedType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "referenceTimeRequested : "
                    + getReferenceTimeRequested().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getAcquisitionAssistanceRequested() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getAcquisitionAssistanceRequested();
          }

          @Override public void setToNewInstance() {
            setAcquisitionAssistanceRequestedToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? RequestedAssistData.acquisitionAssistanceRequestedType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "acquisitionAssistanceRequested : "
                    + getAcquisitionAssistanceRequested().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 7);

          @Override public boolean isExplicitlySet() {
            return getRealTimeIntegrityRequested() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getRealTimeIntegrityRequested();
          }

          @Override public void setToNewInstance() {
            setRealTimeIntegrityRequestedToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? RequestedAssistData.realTimeIntegrityRequestedType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "realTimeIntegrityRequested : "
                    + getRealTimeIntegrityRequested().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 8);

          @Override public boolean isExplicitlySet() {
            return getNavigationModelRequested() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getNavigationModelRequested();
          }

          @Override public void setToNewInstance() {
            setNavigationModelRequestedToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? RequestedAssistData.navigationModelRequestedType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "navigationModelRequested : "
                    + getNavigationModelRequested().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 9);

          @Override public boolean isExplicitlySet() {
            return getNavigationModelData() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getNavigationModelData();
          }

          @Override public void setToNewInstance() {
            setNavigationModelDataToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NavigationModel.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "navigationModelData : "
                    + getNavigationModelData().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      builder.add(new SequenceComponent() {
            @Override public boolean isExplicitlySet() {
              return getExtensionVer2_RequestedAssistData_extension() != null;
            }

            @Override public boolean hasDefaultValue() {
              return false;
            }

            @Override public boolean isOptional() {
              return true;
            }

            @Override public Asn1Object getComponentValue() {
              return getExtensionVer2_RequestedAssistData_extension();
            }

            @Override public void setToNewInstance() {
              setExtensionVer2_RequestedAssistData_extensionToNewInstance();
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
              return "ver2_RequestedAssistData_extension : "
                  + getExtensionVer2_RequestedAssistData_extension().toIndentedString(indent);
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
public static class almanacRequestedType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_almanacRequestedType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public almanacRequestedType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_almanacRequestedType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_almanacRequestedType != null) {
      return ImmutableList.of(TAG_almanacRequestedType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new almanacRequestedType from encoded stream.
   */
  public static almanacRequestedType fromPerUnaligned(byte[] encodedBytes) {
    almanacRequestedType result = new almanacRequestedType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new almanacRequestedType from encoded stream.
   */
  public static almanacRequestedType fromPerAligned(byte[] encodedBytes) {
    almanacRequestedType result = new almanacRequestedType();
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
    return "almanacRequestedType = " + getValue() + ";\n";
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
public static class utcModelRequestedType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_utcModelRequestedType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public utcModelRequestedType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_utcModelRequestedType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_utcModelRequestedType != null) {
      return ImmutableList.of(TAG_utcModelRequestedType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new utcModelRequestedType from encoded stream.
   */
  public static utcModelRequestedType fromPerUnaligned(byte[] encodedBytes) {
    utcModelRequestedType result = new utcModelRequestedType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new utcModelRequestedType from encoded stream.
   */
  public static utcModelRequestedType fromPerAligned(byte[] encodedBytes) {
    utcModelRequestedType result = new utcModelRequestedType();
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
    return "utcModelRequestedType = " + getValue() + ";\n";
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
public static class ionosphericModelRequestedType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_ionosphericModelRequestedType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ionosphericModelRequestedType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ionosphericModelRequestedType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ionosphericModelRequestedType != null) {
      return ImmutableList.of(TAG_ionosphericModelRequestedType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ionosphericModelRequestedType from encoded stream.
   */
  public static ionosphericModelRequestedType fromPerUnaligned(byte[] encodedBytes) {
    ionosphericModelRequestedType result = new ionosphericModelRequestedType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ionosphericModelRequestedType from encoded stream.
   */
  public static ionosphericModelRequestedType fromPerAligned(byte[] encodedBytes) {
    ionosphericModelRequestedType result = new ionosphericModelRequestedType();
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
    return "ionosphericModelRequestedType = " + getValue() + ";\n";
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
public static class dgpsCorrectionsRequestedType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_dgpsCorrectionsRequestedType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public dgpsCorrectionsRequestedType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_dgpsCorrectionsRequestedType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_dgpsCorrectionsRequestedType != null) {
      return ImmutableList.of(TAG_dgpsCorrectionsRequestedType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new dgpsCorrectionsRequestedType from encoded stream.
   */
  public static dgpsCorrectionsRequestedType fromPerUnaligned(byte[] encodedBytes) {
    dgpsCorrectionsRequestedType result = new dgpsCorrectionsRequestedType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new dgpsCorrectionsRequestedType from encoded stream.
   */
  public static dgpsCorrectionsRequestedType fromPerAligned(byte[] encodedBytes) {
    dgpsCorrectionsRequestedType result = new dgpsCorrectionsRequestedType();
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
    return "dgpsCorrectionsRequestedType = " + getValue() + ";\n";
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
public static class referenceLocationRequestedType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_referenceLocationRequestedType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public referenceLocationRequestedType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_referenceLocationRequestedType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_referenceLocationRequestedType != null) {
      return ImmutableList.of(TAG_referenceLocationRequestedType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new referenceLocationRequestedType from encoded stream.
   */
  public static referenceLocationRequestedType fromPerUnaligned(byte[] encodedBytes) {
    referenceLocationRequestedType result = new referenceLocationRequestedType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new referenceLocationRequestedType from encoded stream.
   */
  public static referenceLocationRequestedType fromPerAligned(byte[] encodedBytes) {
    referenceLocationRequestedType result = new referenceLocationRequestedType();
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
    return "referenceLocationRequestedType = " + getValue() + ";\n";
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
public static class referenceTimeRequestedType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_referenceTimeRequestedType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public referenceTimeRequestedType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_referenceTimeRequestedType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_referenceTimeRequestedType != null) {
      return ImmutableList.of(TAG_referenceTimeRequestedType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new referenceTimeRequestedType from encoded stream.
   */
  public static referenceTimeRequestedType fromPerUnaligned(byte[] encodedBytes) {
    referenceTimeRequestedType result = new referenceTimeRequestedType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new referenceTimeRequestedType from encoded stream.
   */
  public static referenceTimeRequestedType fromPerAligned(byte[] encodedBytes) {
    referenceTimeRequestedType result = new referenceTimeRequestedType();
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
    return "referenceTimeRequestedType = " + getValue() + ";\n";
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
public static class acquisitionAssistanceRequestedType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_acquisitionAssistanceRequestedType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public acquisitionAssistanceRequestedType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_acquisitionAssistanceRequestedType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_acquisitionAssistanceRequestedType != null) {
      return ImmutableList.of(TAG_acquisitionAssistanceRequestedType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new acquisitionAssistanceRequestedType from encoded stream.
   */
  public static acquisitionAssistanceRequestedType fromPerUnaligned(byte[] encodedBytes) {
    acquisitionAssistanceRequestedType result = new acquisitionAssistanceRequestedType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new acquisitionAssistanceRequestedType from encoded stream.
   */
  public static acquisitionAssistanceRequestedType fromPerAligned(byte[] encodedBytes) {
    acquisitionAssistanceRequestedType result = new acquisitionAssistanceRequestedType();
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
    return "acquisitionAssistanceRequestedType = " + getValue() + ";\n";
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
public static class realTimeIntegrityRequestedType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_realTimeIntegrityRequestedType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public realTimeIntegrityRequestedType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_realTimeIntegrityRequestedType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_realTimeIntegrityRequestedType != null) {
      return ImmutableList.of(TAG_realTimeIntegrityRequestedType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new realTimeIntegrityRequestedType from encoded stream.
   */
  public static realTimeIntegrityRequestedType fromPerUnaligned(byte[] encodedBytes) {
    realTimeIntegrityRequestedType result = new realTimeIntegrityRequestedType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new realTimeIntegrityRequestedType from encoded stream.
   */
  public static realTimeIntegrityRequestedType fromPerAligned(byte[] encodedBytes) {
    realTimeIntegrityRequestedType result = new realTimeIntegrityRequestedType();
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
    return "realTimeIntegrityRequestedType = " + getValue() + ";\n";
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
public static class navigationModelRequestedType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_navigationModelRequestedType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public navigationModelRequestedType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_navigationModelRequestedType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_navigationModelRequestedType != null) {
      return ImmutableList.of(TAG_navigationModelRequestedType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new navigationModelRequestedType from encoded stream.
   */
  public static navigationModelRequestedType fromPerUnaligned(byte[] encodedBytes) {
    navigationModelRequestedType result = new navigationModelRequestedType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new navigationModelRequestedType from encoded stream.
   */
  public static navigationModelRequestedType fromPerAligned(byte[] encodedBytes) {
    navigationModelRequestedType result = new navigationModelRequestedType();
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
    return "navigationModelRequestedType = " + getValue() + ";\n";
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
    builder.append("RequestedAssistData = {\n");
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
