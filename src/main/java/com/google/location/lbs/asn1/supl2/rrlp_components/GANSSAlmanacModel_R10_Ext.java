package com.google.location.lbs.asn1.supl2.rrlp_components;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.google.location.lbs.asn1.base.Asn1Boolean;
import com.google.location.lbs.asn1.base.Asn1Null;
import com.google.location.lbs.asn1.base.Asn1Object;
import com.google.location.lbs.asn1.base.Asn1Sequence;
import com.google.location.lbs.asn1.base.Asn1Tag;
import com.google.location.lbs.asn1.base.BitStream;
import com.google.location.lbs.asn1.base.BitStreamReader;
import com.google.location.lbs.asn1.base.SequenceComponent;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
* @author Torbjorn Gannholm (tobe@google.com)
*/
public  class GANSSAlmanacModel_R10_Ext extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GANSSAlmanacModel_R10_Ext
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GANSSAlmanacModel_R10_Ext() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GANSSAlmanacModel_R10_Ext;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GANSSAlmanacModel_R10_Ext != null) {
      return ImmutableList.of(TAG_GANSSAlmanacModel_R10_Ext);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GANSSAlmanacModel_R10_Ext from encoded stream.
   */
  public static GANSSAlmanacModel_R10_Ext fromPerUnaligned(byte[] encodedBytes) {
    GANSSAlmanacModel_R10_Ext result = new GANSSAlmanacModel_R10_Ext();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GANSSAlmanacModel_R10_Ext from encoded stream.
   */
  public static GANSSAlmanacModel_R10_Ext fromPerAligned(byte[] encodedBytes) {
    GANSSAlmanacModel_R10_Ext result = new GANSSAlmanacModel_R10_Ext();
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

  
  private GANSSAlmanacModel_R10_Ext.completeAlmanacProvidedType completeAlmanacProvided_;
  public GANSSAlmanacModel_R10_Ext.completeAlmanacProvidedType getCompleteAlmanacProvided() {
    return completeAlmanacProvided_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSAlmanacModel_R10_Ext.completeAlmanacProvidedType
   */
  public void setCompleteAlmanacProvided(Asn1Object value) {
    this.completeAlmanacProvided_ = (GANSSAlmanacModel_R10_Ext.completeAlmanacProvidedType) value;
  }
  public GANSSAlmanacModel_R10_Ext.completeAlmanacProvidedType setCompleteAlmanacProvidedToNewInstance() {
    completeAlmanacProvided_ = new GANSSAlmanacModel_R10_Ext.completeAlmanacProvidedType();
    return completeAlmanacProvided_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getCompleteAlmanacProvided() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getCompleteAlmanacProvided();
          }

          @Override public void setToNewInstance() {
            setCompleteAlmanacProvidedToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSAlmanacModel_R10_Ext.completeAlmanacProvidedType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "completeAlmanacProvided : "
                    + getCompleteAlmanacProvided().toIndentedString(indent);
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
 * @author Torbjorn Gannholm (tobe@google.com)
 */
public static class completeAlmanacProvidedType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_completeAlmanacProvidedType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public completeAlmanacProvidedType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_completeAlmanacProvidedType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_completeAlmanacProvidedType != null) {
      return ImmutableList.of(TAG_completeAlmanacProvidedType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new completeAlmanacProvidedType from encoded stream.
   */
  public static completeAlmanacProvidedType fromPerUnaligned(byte[] encodedBytes) {
    completeAlmanacProvidedType result = new completeAlmanacProvidedType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new completeAlmanacProvidedType from encoded stream.
   */
  public static completeAlmanacProvidedType fromPerAligned(byte[] encodedBytes) {
    completeAlmanacProvidedType result = new completeAlmanacProvidedType();
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
    return "completeAlmanacProvidedType = " + getValue() + ";\n";
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
    builder.append("GANSSAlmanacModel_R10_Ext = {\n");
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
