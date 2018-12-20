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
public  class MBS_BeaconMeasElement_r13 extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_MBS_BeaconMeasElement_r13
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public MBS_BeaconMeasElement_r13() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_MBS_BeaconMeasElement_r13;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_MBS_BeaconMeasElement_r13 != null) {
      return ImmutableList.of(TAG_MBS_BeaconMeasElement_r13);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new MBS_BeaconMeasElement_r13 from encoded stream.
   */
  public static MBS_BeaconMeasElement_r13 fromPerUnaligned(byte[] encodedBytes) {
    MBS_BeaconMeasElement_r13 result = new MBS_BeaconMeasElement_r13();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new MBS_BeaconMeasElement_r13 from encoded stream.
   */
  public static MBS_BeaconMeasElement_r13 fromPerAligned(byte[] encodedBytes) {
    MBS_BeaconMeasElement_r13 result = new MBS_BeaconMeasElement_r13();
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

  
  private MBS_BeaconMeasElement_r13.transmitterID_r13Type transmitterID_r13_;
  public MBS_BeaconMeasElement_r13.transmitterID_r13Type getTransmitterID_r13() {
    return transmitterID_r13_;
  }
  /**
   * @throws ClassCastException if value is not a MBS_BeaconMeasElement_r13.transmitterID_r13Type
   */
  public void setTransmitterID_r13(Asn1Object value) {
    this.transmitterID_r13_ = (MBS_BeaconMeasElement_r13.transmitterID_r13Type) value;
  }
  public MBS_BeaconMeasElement_r13.transmitterID_r13Type setTransmitterID_r13ToNewInstance() {
    transmitterID_r13_ = new MBS_BeaconMeasElement_r13.transmitterID_r13Type();
    return transmitterID_r13_;
  }
  
  private MBS_BeaconMeasElement_r13.codePhase_r13Type codePhase_r13_;
  public MBS_BeaconMeasElement_r13.codePhase_r13Type getCodePhase_r13() {
    return codePhase_r13_;
  }
  /**
   * @throws ClassCastException if value is not a MBS_BeaconMeasElement_r13.codePhase_r13Type
   */
  public void setCodePhase_r13(Asn1Object value) {
    this.codePhase_r13_ = (MBS_BeaconMeasElement_r13.codePhase_r13Type) value;
  }
  public MBS_BeaconMeasElement_r13.codePhase_r13Type setCodePhase_r13ToNewInstance() {
    codePhase_r13_ = new MBS_BeaconMeasElement_r13.codePhase_r13Type();
    return codePhase_r13_;
  }
  
  private MBS_BeaconMeasElement_r13.codePhaseRMSError_r13Type codePhaseRMSError_r13_;
  public MBS_BeaconMeasElement_r13.codePhaseRMSError_r13Type getCodePhaseRMSError_r13() {
    return codePhaseRMSError_r13_;
  }
  /**
   * @throws ClassCastException if value is not a MBS_BeaconMeasElement_r13.codePhaseRMSError_r13Type
   */
  public void setCodePhaseRMSError_r13(Asn1Object value) {
    this.codePhaseRMSError_r13_ = (MBS_BeaconMeasElement_r13.codePhaseRMSError_r13Type) value;
  }
  public MBS_BeaconMeasElement_r13.codePhaseRMSError_r13Type setCodePhaseRMSError_r13ToNewInstance() {
    codePhaseRMSError_r13_ = new MBS_BeaconMeasElement_r13.codePhaseRMSError_r13Type();
    return codePhaseRMSError_r13_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getTransmitterID_r13() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getTransmitterID_r13();
          }

          @Override public void setToNewInstance() {
            setTransmitterID_r13ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? MBS_BeaconMeasElement_r13.transmitterID_r13Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "transmitterID_r13 : "
                    + getTransmitterID_r13().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getCodePhase_r13() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCodePhase_r13();
          }

          @Override public void setToNewInstance() {
            setCodePhase_r13ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? MBS_BeaconMeasElement_r13.codePhase_r13Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "codePhase_r13 : "
                    + getCodePhase_r13().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getCodePhaseRMSError_r13() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCodePhaseRMSError_r13();
          }

          @Override public void setToNewInstance() {
            setCodePhaseRMSError_r13ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? MBS_BeaconMeasElement_r13.codePhaseRMSError_r13Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "codePhaseRMSError_r13 : "
                    + getCodePhaseRMSError_r13().toIndentedString(indent);
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
public static class transmitterID_r13Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_transmitterID_r13Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public transmitterID_r13Type() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("32767"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_transmitterID_r13Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_transmitterID_r13Type != null) {
      return ImmutableList.of(TAG_transmitterID_r13Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new transmitterID_r13Type from encoded stream.
   */
  public static transmitterID_r13Type fromPerUnaligned(byte[] encodedBytes) {
    transmitterID_r13Type result = new transmitterID_r13Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new transmitterID_r13Type from encoded stream.
   */
  public static transmitterID_r13Type fromPerAligned(byte[] encodedBytes) {
    transmitterID_r13Type result = new transmitterID_r13Type();
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
    return "transmitterID_r13Type = " + getInteger() + ";\n";
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
public static class codePhase_r13Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_codePhase_r13Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public codePhase_r13Type() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("2097151"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_codePhase_r13Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_codePhase_r13Type != null) {
      return ImmutableList.of(TAG_codePhase_r13Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new codePhase_r13Type from encoded stream.
   */
  public static codePhase_r13Type fromPerUnaligned(byte[] encodedBytes) {
    codePhase_r13Type result = new codePhase_r13Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new codePhase_r13Type from encoded stream.
   */
  public static codePhase_r13Type fromPerAligned(byte[] encodedBytes) {
    codePhase_r13Type result = new codePhase_r13Type();
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
    return "codePhase_r13Type = " + getInteger() + ";\n";
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
public static class codePhaseRMSError_r13Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_codePhaseRMSError_r13Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public codePhaseRMSError_r13Type() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("63"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_codePhaseRMSError_r13Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_codePhaseRMSError_r13Type != null) {
      return ImmutableList.of(TAG_codePhaseRMSError_r13Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new codePhaseRMSError_r13Type from encoded stream.
   */
  public static codePhaseRMSError_r13Type fromPerUnaligned(byte[] encodedBytes) {
    codePhaseRMSError_r13Type result = new codePhaseRMSError_r13Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new codePhaseRMSError_r13Type from encoded stream.
   */
  public static codePhaseRMSError_r13Type fromPerAligned(byte[] encodedBytes) {
    codePhaseRMSError_r13Type result = new codePhaseRMSError_r13Type();
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
    return "codePhaseRMSError_r13Type = " + getInteger() + ";\n";
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
    builder.append("MBS_BeaconMeasElement_r13 = {\n");
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
