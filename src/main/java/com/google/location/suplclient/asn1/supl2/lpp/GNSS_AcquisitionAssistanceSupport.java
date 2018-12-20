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
import com.google.location.suplclient.asn1.base.Asn1Enumerated;
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
public  class GNSS_AcquisitionAssistanceSupport extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GNSS_AcquisitionAssistanceSupport
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GNSS_AcquisitionAssistanceSupport() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GNSS_AcquisitionAssistanceSupport;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GNSS_AcquisitionAssistanceSupport != null) {
      return ImmutableList.of(TAG_GNSS_AcquisitionAssistanceSupport);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GNSS_AcquisitionAssistanceSupport from encoded stream.
   */
  public static GNSS_AcquisitionAssistanceSupport fromPerUnaligned(byte[] encodedBytes) {
    GNSS_AcquisitionAssistanceSupport result = new GNSS_AcquisitionAssistanceSupport();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GNSS_AcquisitionAssistanceSupport from encoded stream.
   */
  public static GNSS_AcquisitionAssistanceSupport fromPerAligned(byte[] encodedBytes) {
    GNSS_AcquisitionAssistanceSupport result = new GNSS_AcquisitionAssistanceSupport();
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

  

  
  private GNSS_AcquisitionAssistanceSupport.confidenceSupport_r10Type  extensionConfidenceSupport_r10;
  public GNSS_AcquisitionAssistanceSupport.confidenceSupport_r10Type getExtensionConfidenceSupport_r10() {
    return extensionConfidenceSupport_r10;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_AcquisitionAssistanceSupport.confidenceSupport_r10Type
   */
  public void setExtensionConfidenceSupport_r10(Asn1Object value) {
    extensionConfidenceSupport_r10 = (GNSS_AcquisitionAssistanceSupport.confidenceSupport_r10Type) value;
  }
  public void setExtensionConfidenceSupport_r10ToNewInstance() {
    extensionConfidenceSupport_r10 = new GNSS_AcquisitionAssistanceSupport.confidenceSupport_r10Type();
  }
    
  private GNSS_AcquisitionAssistanceSupport.dopplerUncertaintyExtSupport_r10Type  extensionDopplerUncertaintyExtSupport_r10;
  public GNSS_AcquisitionAssistanceSupport.dopplerUncertaintyExtSupport_r10Type getExtensionDopplerUncertaintyExtSupport_r10() {
    return extensionDopplerUncertaintyExtSupport_r10;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_AcquisitionAssistanceSupport.dopplerUncertaintyExtSupport_r10Type
   */
  public void setExtensionDopplerUncertaintyExtSupport_r10(Asn1Object value) {
    extensionDopplerUncertaintyExtSupport_r10 = (GNSS_AcquisitionAssistanceSupport.dopplerUncertaintyExtSupport_r10Type) value;
  }
  public void setExtensionDopplerUncertaintyExtSupport_r10ToNewInstance() {
    extensionDopplerUncertaintyExtSupport_r10 = new GNSS_AcquisitionAssistanceSupport.dopplerUncertaintyExtSupport_r10Type();
  }
    

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      builder.add(new SequenceComponent() {
            @Override public boolean isExplicitlySet() {
              return getExtensionConfidenceSupport_r10() != null;
            }

            @Override public boolean hasDefaultValue() {
              return false;
            }

            @Override public boolean isOptional() {
              return true;
            }

            @Override public Asn1Object getComponentValue() {
              return getExtensionConfidenceSupport_r10();
            }

            @Override public void setToNewInstance() {
              setExtensionConfidenceSupport_r10ToNewInstance();
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
              return "confidenceSupport_r10 : "
                  + getExtensionConfidenceSupport_r10().toIndentedString(indent);
            }
      });
      
      builder.add(new SequenceComponent() {
            @Override public boolean isExplicitlySet() {
              return getExtensionDopplerUncertaintyExtSupport_r10() != null;
            }

            @Override public boolean hasDefaultValue() {
              return false;
            }

            @Override public boolean isOptional() {
              return true;
            }

            @Override public Asn1Object getComponentValue() {
              return getExtensionDopplerUncertaintyExtSupport_r10();
            }

            @Override public void setToNewInstance() {
              setExtensionDopplerUncertaintyExtSupport_r10ToNewInstance();
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
              return "dopplerUncertaintyExtSupport_r10 : "
                  + getExtensionDopplerUncertaintyExtSupport_r10().toIndentedString(indent);
            }
      });
      
      return builder.build();
    }

  

    
    // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class confidenceSupport_r10Type extends Asn1Enumerated {
  public enum Value implements Asn1Enumerated.Value {
    asn_true(0),
    ;

    Value(int i) {
      value = i;
    }

    private int value;
    public int getAssignedValue() {
      return value;
    }

    @Override public boolean isExtensionValue() {
      return false;
    }
  }

  @Override
  protected Value getDefaultValue() {
    return null
;
  }

  @SuppressWarnings("unchecked")
  public Value enumValue() {
    return (Value) getValue();
  }


  
  public void setTo_asn_true() {
    setValue(Value.asn_true);
  }
  


  public enum ExtensionValue implements Asn1Enumerated.Value {
    ;

    ExtensionValue(int i) {
      value = i;
    }

    private int value;
    @Override public int getAssignedValue() {
      return value;
    }

    @Override public boolean isExtensionValue() {
      return true;
    }
  }

  @SuppressWarnings("unchecked")
  public ExtensionValue extEnumValue() {
    return (ExtensionValue) getValue();
  }

  

  

  private static final Asn1Tag TAG_confidenceSupport_r10Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public confidenceSupport_r10Type() {
    super();
    // use template substitution instead of calling getDefaultValue(), since
    // calling virtual methods from a ctor is frowned upon here.
    setValue(null
);
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_confidenceSupport_r10Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_confidenceSupport_r10Type != null) {
      return ImmutableList.of(TAG_confidenceSupport_r10Type);
    } else {
      return Asn1Enumerated.getPossibleFirstTags();
    }
  }

  @Override protected boolean isExtensible() {
    return false;
  }

  @Override protected Asn1Enumerated.Value lookupValue(int ordinal) {
    return Value.values()[ordinal];
  }

  @Override protected Asn1Enumerated.Value lookupExtensionValue(int ordinal) {
    return ExtensionValue.values()[ordinal];
  }

  @Override protected int getValueCount() {
    return Value.values().length;
  }

  /**
   * Creates a new confidenceSupport_r10Type from encoded stream.
   */
  public static confidenceSupport_r10Type fromPerUnaligned(byte[] encodedBytes) {
    confidenceSupport_r10Type result = new confidenceSupport_r10Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new confidenceSupport_r10Type from encoded stream.
   */
  public static confidenceSupport_r10Type fromPerAligned(byte[] encodedBytes) {
    confidenceSupport_r10Type result = new confidenceSupport_r10Type();
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
    return "confidenceSupport_r10Type = " + getValue() + ";\n";
  }
}

    
    // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class dopplerUncertaintyExtSupport_r10Type extends Asn1Enumerated {
  public enum Value implements Asn1Enumerated.Value {
    asn_true(0),
    ;

    Value(int i) {
      value = i;
    }

    private int value;
    public int getAssignedValue() {
      return value;
    }

    @Override public boolean isExtensionValue() {
      return false;
    }
  }

  @Override
  protected Value getDefaultValue() {
    return null
;
  }

  @SuppressWarnings("unchecked")
  public Value enumValue() {
    return (Value) getValue();
  }


  
  public void setTo_asn_true() {
    setValue(Value.asn_true);
  }
  


  public enum ExtensionValue implements Asn1Enumerated.Value {
    ;

    ExtensionValue(int i) {
      value = i;
    }

    private int value;
    @Override public int getAssignedValue() {
      return value;
    }

    @Override public boolean isExtensionValue() {
      return true;
    }
  }

  @SuppressWarnings("unchecked")
  public ExtensionValue extEnumValue() {
    return (ExtensionValue) getValue();
  }

  

  

  private static final Asn1Tag TAG_dopplerUncertaintyExtSupport_r10Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public dopplerUncertaintyExtSupport_r10Type() {
    super();
    // use template substitution instead of calling getDefaultValue(), since
    // calling virtual methods from a ctor is frowned upon here.
    setValue(null
);
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_dopplerUncertaintyExtSupport_r10Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_dopplerUncertaintyExtSupport_r10Type != null) {
      return ImmutableList.of(TAG_dopplerUncertaintyExtSupport_r10Type);
    } else {
      return Asn1Enumerated.getPossibleFirstTags();
    }
  }

  @Override protected boolean isExtensible() {
    return false;
  }

  @Override protected Asn1Enumerated.Value lookupValue(int ordinal) {
    return Value.values()[ordinal];
  }

  @Override protected Asn1Enumerated.Value lookupExtensionValue(int ordinal) {
    return ExtensionValue.values()[ordinal];
  }

  @Override protected int getValueCount() {
    return Value.values().length;
  }

  /**
   * Creates a new dopplerUncertaintyExtSupport_r10Type from encoded stream.
   */
  public static dopplerUncertaintyExtSupport_r10Type fromPerUnaligned(byte[] encodedBytes) {
    dopplerUncertaintyExtSupport_r10Type result = new dopplerUncertaintyExtSupport_r10Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new dopplerUncertaintyExtSupport_r10Type from encoded stream.
   */
  public static dopplerUncertaintyExtSupport_r10Type fromPerAligned(byte[] encodedBytes) {
    dopplerUncertaintyExtSupport_r10Type result = new dopplerUncertaintyExtSupport_r10Type();
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
    return "dopplerUncertaintyExtSupport_r10Type = " + getValue() + ";\n";
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
    builder.append("GNSS_AcquisitionAssistanceSupport = {\n");
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
