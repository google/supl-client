package com.google.location.lbs.asn1.supl2.rrlp_components;

// AUTO-GENERATED TYPE ALIAS
import com.google.location.lbs.asn1.base.Asn1Tag;
import com.google.location.lbs.asn1.supl2.map_lcs_datatypes.Ext_GeographicalInformation;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;
public  class BTSPosition extends Ext_GeographicalInformation {
  private static final Asn1Tag TAG_BTSPosition = Asn1Tag.fromClassAndNumber(-1, -1);
  public BTSPosition() {
  }

  
  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_BTSPosition;
  }
  
  @Override
  protected boolean isTagImplicit() {
    return true;
  }
  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_BTSPosition != null) {
      return ImmutableList.of(TAG_BTSPosition);
    } else {
      return Ext_GeographicalInformation.getPossibleFirstTags();
    }  }
}