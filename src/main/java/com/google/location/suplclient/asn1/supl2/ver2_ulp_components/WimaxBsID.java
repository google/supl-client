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
import com.google.location.suplclient.asn1.base.Asn1BitString;
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
public  class WimaxBsID extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_WimaxBsID
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public WimaxBsID() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_WimaxBsID;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_WimaxBsID != null) {
      return ImmutableList.of(TAG_WimaxBsID);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new WimaxBsID from encoded stream.
   */
  public static WimaxBsID fromPerUnaligned(byte[] encodedBytes) {
    WimaxBsID result = new WimaxBsID();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new WimaxBsID from encoded stream.
   */
  public static WimaxBsID fromPerAligned(byte[] encodedBytes) {
    WimaxBsID result = new WimaxBsID();
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

  
  private WimaxBsID.bsID_MSBType bsID_MSB_;
  public WimaxBsID.bsID_MSBType getBsID_MSB() {
    return bsID_MSB_;
  }
  /**
   * @throws ClassCastException if value is not a WimaxBsID.bsID_MSBType
   */
  public void setBsID_MSB(Asn1Object value) {
    this.bsID_MSB_ = (WimaxBsID.bsID_MSBType) value;
  }
  public WimaxBsID.bsID_MSBType setBsID_MSBToNewInstance() {
    bsID_MSB_ = new WimaxBsID.bsID_MSBType();
    return bsID_MSB_;
  }
  
  private WimaxBsID.bsID_LSBType bsID_LSB_;
  public WimaxBsID.bsID_LSBType getBsID_LSB() {
    return bsID_LSB_;
  }
  /**
   * @throws ClassCastException if value is not a WimaxBsID.bsID_LSBType
   */
  public void setBsID_LSB(Asn1Object value) {
    this.bsID_LSB_ = (WimaxBsID.bsID_LSBType) value;
  }
  public WimaxBsID.bsID_LSBType setBsID_LSBToNewInstance() {
    bsID_LSB_ = new WimaxBsID.bsID_LSBType();
    return bsID_LSB_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getBsID_MSB() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getBsID_MSB();
          }

          @Override public void setToNewInstance() {
            setBsID_MSBToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? WimaxBsID.bsID_MSBType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bsID_MSB : "
                    + getBsID_MSB().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getBsID_LSB() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBsID_LSB();
          }

          @Override public void setToNewInstance() {
            setBsID_LSBToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? WimaxBsID.bsID_LSBType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bsID_LSB : "
                    + getBsID_LSB().toIndentedString(indent);
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
public static class bsID_MSBType extends Asn1BitString {
  //

  // defined bit positions, if any
  

  // setters
  

  // clearers
  


  private static final Asn1Tag TAG_bsID_MSBType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bsID_MSBType() {
    super();
    setMinSize(24);
setMaxSize(24);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bsID_MSBType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bsID_MSBType != null) {
      return ImmutableList.of(TAG_bsID_MSBType);
    } else {
      return Asn1BitString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bsID_MSBType from encoded stream.
   */
  public static bsID_MSBType fromPerUnaligned(byte[] encodedBytes) {
    bsID_MSBType result = new bsID_MSBType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bsID_MSBType from encoded stream.
   */
  public static bsID_MSBType fromPerAligned(byte[] encodedBytes) {
    bsID_MSBType result = new bsID_MSBType();
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
    return "bsID_MSBType = " + getValue() + ";\n";
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
public static class bsID_LSBType extends Asn1BitString {
  //

  // defined bit positions, if any
  

  // setters
  

  // clearers
  


  private static final Asn1Tag TAG_bsID_LSBType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bsID_LSBType() {
    super();
    setMinSize(24);
setMaxSize(24);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bsID_LSBType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bsID_LSBType != null) {
      return ImmutableList.of(TAG_bsID_LSBType);
    } else {
      return Asn1BitString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bsID_LSBType from encoded stream.
   */
  public static bsID_LSBType fromPerUnaligned(byte[] encodedBytes) {
    bsID_LSBType result = new bsID_LSBType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bsID_LSBType from encoded stream.
   */
  public static bsID_LSBType fromPerAligned(byte[] encodedBytes) {
    bsID_LSBType result = new bsID_LSBType();
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
    return "bsID_LSBType = " + getValue() + ";\n";
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
    builder.append("WimaxBsID = {\n");
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
