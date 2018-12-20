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

package com.google.location.suplclient.asn1.supl2.supl_report;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.google.location.suplclient.asn1.base.Asn1Null;
import com.google.location.suplclient.asn1.base.Asn1Object;
import com.google.location.suplclient.asn1.base.Asn1Sequence;
import com.google.location.suplclient.asn1.base.Asn1Tag;
import com.google.location.suplclient.asn1.base.BitStream;
import com.google.location.suplclient.asn1.base.BitStreamReader;
import com.google.location.suplclient.asn1.base.SequenceComponent;
import com.google.location.suplclient.asn1.supl2.supl_start.SETCapabilities;
import com.google.location.suplclient.asn1.supl2.ulp_components.Ver;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
* 
*/
public  class Ver2_SUPLREPORT extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_Ver2_SUPLREPORT
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public Ver2_SUPLREPORT() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_Ver2_SUPLREPORT;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_Ver2_SUPLREPORT != null) {
      return ImmutableList.of(TAG_Ver2_SUPLREPORT);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new Ver2_SUPLREPORT from encoded stream.
   */
  public static Ver2_SUPLREPORT fromPerUnaligned(byte[] encodedBytes) {
    Ver2_SUPLREPORT result = new Ver2_SUPLREPORT();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new Ver2_SUPLREPORT from encoded stream.
   */
  public static Ver2_SUPLREPORT fromPerAligned(byte[] encodedBytes) {
    Ver2_SUPLREPORT result = new Ver2_SUPLREPORT();
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

  
  private SessionList sessionList_;
  public SessionList getSessionList() {
    return sessionList_;
  }
  /**
   * @throws ClassCastException if value is not a SessionList
   */
  public void setSessionList(Asn1Object value) {
    this.sessionList_ = (SessionList) value;
  }
  public SessionList setSessionListToNewInstance() {
    sessionList_ = new SessionList();
    return sessionList_;
  }
  
  private SETCapabilities sETCapabilities_;
  public SETCapabilities getSETCapabilities() {
    return sETCapabilities_;
  }
  /**
   * @throws ClassCastException if value is not a SETCapabilities
   */
  public void setSETCapabilities(Asn1Object value) {
    this.sETCapabilities_ = (SETCapabilities) value;
  }
  public SETCapabilities setSETCapabilitiesToNewInstance() {
    sETCapabilities_ = new SETCapabilities();
    return sETCapabilities_;
  }
  
  private ReportDataList reportDataList_;
  public ReportDataList getReportDataList() {
    return reportDataList_;
  }
  /**
   * @throws ClassCastException if value is not a ReportDataList
   */
  public void setReportDataList(Asn1Object value) {
    this.reportDataList_ = (ReportDataList) value;
  }
  public ReportDataList setReportDataListToNewInstance() {
    reportDataList_ = new ReportDataList();
    return reportDataList_;
  }
  
  private Ver ver_;
  public Ver getVer() {
    return ver_;
  }
  /**
   * @throws ClassCastException if value is not a Ver
   */
  public void setVer(Asn1Object value) {
    this.ver_ = (Ver) value;
  }
  public Ver setVerToNewInstance() {
    ver_ = new Ver();
    return ver_;
  }
  
  private Ver2_SUPLREPORT.moreComponentsType moreComponents_;
  public Ver2_SUPLREPORT.moreComponentsType getMoreComponents() {
    return moreComponents_;
  }
  /**
   * @throws ClassCastException if value is not a Ver2_SUPLREPORT.moreComponentsType
   */
  public void setMoreComponents(Asn1Object value) {
    this.moreComponents_ = (Ver2_SUPLREPORT.moreComponentsType) value;
  }
  public Ver2_SUPLREPORT.moreComponentsType setMoreComponentsToNewInstance() {
    moreComponents_ = new Ver2_SUPLREPORT.moreComponentsType();
    return moreComponents_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getSessionList() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getSessionList();
          }

          @Override public void setToNewInstance() {
            setSessionListToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SessionList.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "sessionList : "
                    + getSessionList().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getSETCapabilities() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getSETCapabilities();
          }

          @Override public void setToNewInstance() {
            setSETCapabilitiesToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SETCapabilities.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "sETCapabilities : "
                    + getSETCapabilities().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getReportDataList() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getReportDataList();
          }

          @Override public void setToNewInstance() {
            setReportDataListToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ReportDataList.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "reportDataList : "
                    + getReportDataList().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getVer() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getVer();
          }

          @Override public void setToNewInstance() {
            setVerToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Ver.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ver : "
                    + getVer().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getMoreComponents() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getMoreComponents();
          }

          @Override public void setToNewInstance() {
            setMoreComponentsToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Ver2_SUPLREPORT.moreComponentsType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "moreComponents : "
                    + getMoreComponents().toIndentedString(indent);
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
public static class moreComponentsType extends Asn1Null {
  //

  private static final Asn1Tag TAG_moreComponentsType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public moreComponentsType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_moreComponentsType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_moreComponentsType != null) {
      return ImmutableList.of(TAG_moreComponentsType);
    } else {
      return Asn1Null.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new moreComponentsType from encoded stream.
   */
  public static moreComponentsType fromPerUnaligned(byte[] encodedBytes) {
    moreComponentsType result = new moreComponentsType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new moreComponentsType from encoded stream.
   */
  public static moreComponentsType fromPerAligned(byte[] encodedBytes) {
    moreComponentsType result = new moreComponentsType();
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
    return "moreComponentsType (null value);\n";
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
    builder.append("Ver2_SUPLREPORT = {\n");
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
