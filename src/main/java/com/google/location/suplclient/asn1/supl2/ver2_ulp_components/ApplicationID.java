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
import com.google.location.suplclient.asn1.base.Asn1IA5String;
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
public  class ApplicationID extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_ApplicationID
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ApplicationID() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ApplicationID;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ApplicationID != null) {
      return ImmutableList.of(TAG_ApplicationID);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ApplicationID from encoded stream.
   */
  public static ApplicationID fromPerUnaligned(byte[] encodedBytes) {
    ApplicationID result = new ApplicationID();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ApplicationID from encoded stream.
   */
  public static ApplicationID fromPerAligned(byte[] encodedBytes) {
    ApplicationID result = new ApplicationID();
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

  
  private ApplicationID.appProviderType appProvider_;
  public ApplicationID.appProviderType getAppProvider() {
    return appProvider_;
  }
  /**
   * @throws ClassCastException if value is not a ApplicationID.appProviderType
   */
  public void setAppProvider(Asn1Object value) {
    this.appProvider_ = (ApplicationID.appProviderType) value;
  }
  public ApplicationID.appProviderType setAppProviderToNewInstance() {
    appProvider_ = new ApplicationID.appProviderType();
    return appProvider_;
  }
  
  private ApplicationID.appNameType appName_;
  public ApplicationID.appNameType getAppName() {
    return appName_;
  }
  /**
   * @throws ClassCastException if value is not a ApplicationID.appNameType
   */
  public void setAppName(Asn1Object value) {
    this.appName_ = (ApplicationID.appNameType) value;
  }
  public ApplicationID.appNameType setAppNameToNewInstance() {
    appName_ = new ApplicationID.appNameType();
    return appName_;
  }
  
  private ApplicationID.appVersionType appVersion_;
  public ApplicationID.appVersionType getAppVersion() {
    return appVersion_;
  }
  /**
   * @throws ClassCastException if value is not a ApplicationID.appVersionType
   */
  public void setAppVersion(Asn1Object value) {
    this.appVersion_ = (ApplicationID.appVersionType) value;
  }
  public ApplicationID.appVersionType setAppVersionToNewInstance() {
    appVersion_ = new ApplicationID.appVersionType();
    return appVersion_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getAppProvider() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getAppProvider();
          }

          @Override public void setToNewInstance() {
            setAppProviderToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ApplicationID.appProviderType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "appProvider : "
                    + getAppProvider().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getAppName() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getAppName();
          }

          @Override public void setToNewInstance() {
            setAppNameToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ApplicationID.appNameType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "appName : "
                    + getAppName().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getAppVersion() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getAppVersion();
          }

          @Override public void setToNewInstance() {
            setAppVersionToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ApplicationID.appVersionType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "appVersion : "
                    + getAppVersion().toIndentedString(indent);
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
public static class appProviderType extends Asn1IA5String {
  //

  private static final Asn1Tag TAG_appProviderType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public appProviderType() {
    super();
    setMinSize(1);
setMaxSize(24);

    
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_appProviderType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_appProviderType != null) {
      return ImmutableList.of(TAG_appProviderType);
    } else {
      return Asn1IA5String.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new appProviderType from encoded stream.
   */
  public static appProviderType fromPerUnaligned(byte[] encodedBytes) {
    appProviderType result = new appProviderType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new appProviderType from encoded stream.
   */
  public static appProviderType fromPerAligned(byte[] encodedBytes) {
    appProviderType result = new appProviderType();
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
    return "appProviderType = " + getValue() + ";\n";
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
public static class appNameType extends Asn1IA5String {
  //

  private static final Asn1Tag TAG_appNameType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public appNameType() {
    super();
    setMinSize(1);
setMaxSize(32);

    
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_appNameType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_appNameType != null) {
      return ImmutableList.of(TAG_appNameType);
    } else {
      return Asn1IA5String.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new appNameType from encoded stream.
   */
  public static appNameType fromPerUnaligned(byte[] encodedBytes) {
    appNameType result = new appNameType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new appNameType from encoded stream.
   */
  public static appNameType fromPerAligned(byte[] encodedBytes) {
    appNameType result = new appNameType();
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
    return "appNameType = " + getValue() + ";\n";
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
public static class appVersionType extends Asn1IA5String {
  //

  private static final Asn1Tag TAG_appVersionType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public appVersionType() {
    super();
    setMinSize(1);
setMaxSize(8);

    
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_appVersionType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_appVersionType != null) {
      return ImmutableList.of(TAG_appVersionType);
    } else {
      return Asn1IA5String.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new appVersionType from encoded stream.
   */
  public static appVersionType fromPerUnaligned(byte[] encodedBytes) {
    appVersionType result = new appVersionType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new appVersionType from encoded stream.
   */
  public static appVersionType fromPerAligned(byte[] encodedBytes) {
    appVersionType result = new appVersionType();
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
    return "appVersionType = " + getValue() + ";\n";
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
    builder.append("ApplicationID = {\n");
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
