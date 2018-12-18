package com.google.location.lbs.asn1.supl2.rrlp_components;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
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
public  class Rel5_AssistanceData_Extension extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_Rel5_AssistanceData_Extension
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public Rel5_AssistanceData_Extension() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_Rel5_AssistanceData_Extension;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_Rel5_AssistanceData_Extension != null) {
      return ImmutableList.of(TAG_Rel5_AssistanceData_Extension);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new Rel5_AssistanceData_Extension from encoded stream.
   */
  public static Rel5_AssistanceData_Extension fromPerUnaligned(byte[] encodedBytes) {
    Rel5_AssistanceData_Extension result = new Rel5_AssistanceData_Extension();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new Rel5_AssistanceData_Extension from encoded stream.
   */
  public static Rel5_AssistanceData_Extension fromPerAligned(byte[] encodedBytes) {
    Rel5_AssistanceData_Extension result = new Rel5_AssistanceData_Extension();
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

  
  private Extended_reference extended_reference_;
  public Extended_reference getExtended_reference() {
    return extended_reference_;
  }
  /**
   * @throws ClassCastException if value is not a Extended_reference
   */
  public void setExtended_reference(Asn1Object value) {
    this.extended_reference_ = (Extended_reference) value;
  }
  public Extended_reference setExtended_referenceToNewInstance() {
    extended_reference_ = new Extended_reference();
    return extended_reference_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getExtended_reference() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getExtended_reference();
          }

          @Override public void setToNewInstance() {
            setExtended_referenceToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Extended_reference.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "extended_reference : "
                    + getExtended_reference().toIndentedString(indent);
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
    builder.append("Rel5_AssistanceData_Extension = {\n");
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
