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
import com.google.location.suplclient.asn1.base.Asn1BitString;
import com.google.location.suplclient.asn1.base.Asn1Tag;
import com.google.location.suplclient.asn1.base.BitStream;
import com.google.location.suplclient.asn1.base.BitStreamReader;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
 * 
 */
public  class LocationSource_r13 extends Asn1BitString {
  //

  // defined bit positions, if any
  public static final int a_gnss = 0;
  public static final int wlan = 1;
  public static final int bt = 2;
  public static final int tbs = 3;
  public static final int sensor = 4;
  

  // setters
  public final void set_a_gnss() {
    ensureValuePopulated();
    getValue().set(0);
  }
  public final void set_wlan() {
    ensureValuePopulated();
    getValue().set(1);
  }
  public final void set_bt() {
    ensureValuePopulated();
    getValue().set(2);
  }
  public final void set_tbs() {
    ensureValuePopulated();
    getValue().set(3);
  }
  public final void set_sensor() {
    ensureValuePopulated();
    getValue().set(4);
  }
  

  // clearers
  public final boolean get_a_gnss() {
    ensureValuePopulated();
    return getValue().get(0);
  }
  public final boolean get_wlan() {
    ensureValuePopulated();
    return getValue().get(1);
  }
  public final boolean get_bt() {
    ensureValuePopulated();
    return getValue().get(2);
  }
  public final boolean get_tbs() {
    ensureValuePopulated();
    return getValue().get(3);
  }
  public final boolean get_sensor() {
    ensureValuePopulated();
    return getValue().get(4);
  }
  


  private static final Asn1Tag TAG_LocationSource_r13
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public LocationSource_r13() {
    super();
    setMinSize(1);
setMaxSize(16);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_LocationSource_r13;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_LocationSource_r13 != null) {
      return ImmutableList.of(TAG_LocationSource_r13);
    } else {
      return Asn1BitString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new LocationSource_r13 from encoded stream.
   */
  public static LocationSource_r13 fromPerUnaligned(byte[] encodedBytes) {
    LocationSource_r13 result = new LocationSource_r13();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new LocationSource_r13 from encoded stream.
   */
  public static LocationSource_r13 fromPerAligned(byte[] encodedBytes) {
    LocationSource_r13 result = new LocationSource_r13();
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
    return "LocationSource_r13 = " + getValue() + ";\n";
  }
}
