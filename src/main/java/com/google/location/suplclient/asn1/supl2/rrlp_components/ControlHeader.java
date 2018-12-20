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
public  class ControlHeader extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_ControlHeader
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ControlHeader() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ControlHeader;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ControlHeader != null) {
      return ImmutableList.of(TAG_ControlHeader);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ControlHeader from encoded stream.
   */
  public static ControlHeader fromPerUnaligned(byte[] encodedBytes) {
    ControlHeader result = new ControlHeader();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ControlHeader from encoded stream.
   */
  public static ControlHeader fromPerAligned(byte[] encodedBytes) {
    ControlHeader result = new ControlHeader();
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

  
  private ReferenceTime referenceTime_;
  public ReferenceTime getReferenceTime() {
    return referenceTime_;
  }
  /**
   * @throws ClassCastException if value is not a ReferenceTime
   */
  public void setReferenceTime(Asn1Object value) {
    this.referenceTime_ = (ReferenceTime) value;
  }
  public ReferenceTime setReferenceTimeToNewInstance() {
    referenceTime_ = new ReferenceTime();
    return referenceTime_;
  }
  
  private RefLocation refLocation_;
  public RefLocation getRefLocation() {
    return refLocation_;
  }
  /**
   * @throws ClassCastException if value is not a RefLocation
   */
  public void setRefLocation(Asn1Object value) {
    this.refLocation_ = (RefLocation) value;
  }
  public RefLocation setRefLocationToNewInstance() {
    refLocation_ = new RefLocation();
    return refLocation_;
  }
  
  private DGPSCorrections dgpsCorrections_;
  public DGPSCorrections getDgpsCorrections() {
    return dgpsCorrections_;
  }
  /**
   * @throws ClassCastException if value is not a DGPSCorrections
   */
  public void setDgpsCorrections(Asn1Object value) {
    this.dgpsCorrections_ = (DGPSCorrections) value;
  }
  public DGPSCorrections setDgpsCorrectionsToNewInstance() {
    dgpsCorrections_ = new DGPSCorrections();
    return dgpsCorrections_;
  }
  
  private NavigationModel navigationModel_;
  public NavigationModel getNavigationModel() {
    return navigationModel_;
  }
  /**
   * @throws ClassCastException if value is not a NavigationModel
   */
  public void setNavigationModel(Asn1Object value) {
    this.navigationModel_ = (NavigationModel) value;
  }
  public NavigationModel setNavigationModelToNewInstance() {
    navigationModel_ = new NavigationModel();
    return navigationModel_;
  }
  
  private IonosphericModel ionosphericModel_;
  public IonosphericModel getIonosphericModel() {
    return ionosphericModel_;
  }
  /**
   * @throws ClassCastException if value is not a IonosphericModel
   */
  public void setIonosphericModel(Asn1Object value) {
    this.ionosphericModel_ = (IonosphericModel) value;
  }
  public IonosphericModel setIonosphericModelToNewInstance() {
    ionosphericModel_ = new IonosphericModel();
    return ionosphericModel_;
  }
  
  private UTCModel utcModel_;
  public UTCModel getUtcModel() {
    return utcModel_;
  }
  /**
   * @throws ClassCastException if value is not a UTCModel
   */
  public void setUtcModel(Asn1Object value) {
    this.utcModel_ = (UTCModel) value;
  }
  public UTCModel setUtcModelToNewInstance() {
    utcModel_ = new UTCModel();
    return utcModel_;
  }
  
  private Almanac almanac_;
  public Almanac getAlmanac() {
    return almanac_;
  }
  /**
   * @throws ClassCastException if value is not a Almanac
   */
  public void setAlmanac(Asn1Object value) {
    this.almanac_ = (Almanac) value;
  }
  public Almanac setAlmanacToNewInstance() {
    almanac_ = new Almanac();
    return almanac_;
  }
  
  private AcquisAssist acquisAssist_;
  public AcquisAssist getAcquisAssist() {
    return acquisAssist_;
  }
  /**
   * @throws ClassCastException if value is not a AcquisAssist
   */
  public void setAcquisAssist(Asn1Object value) {
    this.acquisAssist_ = (AcquisAssist) value;
  }
  public AcquisAssist setAcquisAssistToNewInstance() {
    acquisAssist_ = new AcquisAssist();
    return acquisAssist_;
  }
  
  private SeqOf_BadSatelliteSet realTimeIntegrity_;
  public SeqOf_BadSatelliteSet getRealTimeIntegrity() {
    return realTimeIntegrity_;
  }
  /**
   * @throws ClassCastException if value is not a SeqOf_BadSatelliteSet
   */
  public void setRealTimeIntegrity(Asn1Object value) {
    this.realTimeIntegrity_ = (SeqOf_BadSatelliteSet) value;
  }
  public SeqOf_BadSatelliteSet setRealTimeIntegrityToNewInstance() {
    realTimeIntegrity_ = new SeqOf_BadSatelliteSet();
    return realTimeIntegrity_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getReferenceTime() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getReferenceTime();
          }

          @Override public void setToNewInstance() {
            setReferenceTimeToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ReferenceTime.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "referenceTime : "
                    + getReferenceTime().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getRefLocation() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getRefLocation();
          }

          @Override public void setToNewInstance() {
            setRefLocationToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? RefLocation.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "refLocation : "
                    + getRefLocation().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getDgpsCorrections() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getDgpsCorrections();
          }

          @Override public void setToNewInstance() {
            setDgpsCorrectionsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? DGPSCorrections.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "dgpsCorrections : "
                    + getDgpsCorrections().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getNavigationModel() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getNavigationModel();
          }

          @Override public void setToNewInstance() {
            setNavigationModelToNewInstance();
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
                return "navigationModel : "
                    + getNavigationModel().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getIonosphericModel() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getIonosphericModel();
          }

          @Override public void setToNewInstance() {
            setIonosphericModelToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? IonosphericModel.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ionosphericModel : "
                    + getIonosphericModel().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getUtcModel() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getUtcModel();
          }

          @Override public void setToNewInstance() {
            setUtcModelToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? UTCModel.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "utcModel : "
                    + getUtcModel().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getAlmanac() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getAlmanac();
          }

          @Override public void setToNewInstance() {
            setAlmanacToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Almanac.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "almanac : "
                    + getAlmanac().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 7);

          @Override public boolean isExplicitlySet() {
            return getAcquisAssist() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getAcquisAssist();
          }

          @Override public void setToNewInstance() {
            setAcquisAssistToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? AcquisAssist.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "acquisAssist : "
                    + getAcquisAssist().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 8);

          @Override public boolean isExplicitlySet() {
            return getRealTimeIntegrity() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getRealTimeIntegrity();
          }

          @Override public void setToNewInstance() {
            setRealTimeIntegrityToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SeqOf_BadSatelliteSet.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "realTimeIntegrity : "
                    + getRealTimeIntegrity().toIndentedString(indent);
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
    builder.append("ControlHeader = {\n");
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
