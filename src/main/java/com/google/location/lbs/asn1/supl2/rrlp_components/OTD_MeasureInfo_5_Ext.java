package com.google.location.lbs.asn1.supl2.rrlp_components;

// AUTO-GENERATED TYPE ALIAS
import com.google.location.lbs.asn1.base.Asn1Tag;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;
public  class OTD_MeasureInfo_5_Ext extends SeqOfOTD_MsrElementRest {
  private static final Asn1Tag TAG_OTD_MeasureInfo_5_Ext = Asn1Tag.fromClassAndNumber(-1, -1);
  public OTD_MeasureInfo_5_Ext() {
  }

  
  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_OTD_MeasureInfo_5_Ext;
  }
  
  @Override
  protected boolean isTagImplicit() {
    return true;
  }
  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_OTD_MeasureInfo_5_Ext != null) {
      return ImmutableList.of(TAG_OTD_MeasureInfo_5_Ext);
    } else {
      return SeqOfOTD_MsrElementRest.getPossibleFirstTags();
    }  }
}