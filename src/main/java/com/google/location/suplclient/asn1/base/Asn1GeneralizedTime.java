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

package com.google.location.suplclient.asn1.base;

import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.util.Collection;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * Base class for instances of the ASN.1 GeneralizedTime type.
 */
public class Asn1GeneralizedTime extends Asn1Object {
  // Supported formats:
  // yyyymmddhhmmss.SSSZ
  // yyyymmddhhmm[ss]Z
  // yyyymmddhhmm[ss]+hhmm
  // yyyymmddhhmm[ss]-hhmm

  private static final Collection<Asn1Tag> possibleFirstTags =
      ImmutableList.of(Asn1Tag.GENERALIZED_TIME);
  private static final DateTimeFormatter UTC_WITH_MILLISECONDS_FORMATTER =
      DateTimeFormat.forPattern("yyyyMMddHHmmss.SSS'Z").withZoneUTC();

  private static enum Format {
    UTC_WITH_MILLISECONDS(UTC_WITH_MILLISECONDS_FORMATTER),
    UTC_WITH_SECONDS(DateTimeFormat.forPattern("yyyyMMddHHmmss'Z").withZoneUTC()),
    UTC_WITHOUT_SECONDS(DateTimeFormat.forPattern("yyyyMMddHHmm'Z").withZoneUTC()),
    TIME_DIFF_WITH_SECONDS(DateTimeFormat.forPattern("yyyyMMddHHmmssZ").withOffsetParsed()),
    TIME_DIFF_WITHOUT_SECONDS(DateTimeFormat.forPattern("yyyyMMddHHmmZ").withOffsetParsed());

    private final DateTimeFormatter formatter;

    private Format(DateTimeFormatter formatter) {
      this.formatter = formatter;
    }

    static long parseDateTime(String s) {
      for (Format format : values()) {
        try {
          return format.formatter.parseDateTime(s).getMillis();
        } catch (Exception e) {
          // ignore
        }
      }
      throw new IllegalArgumentException("Invalid datetime: " + s);
    }
  }

  /** Time in milliseconds (as {@link System#currentTimeMillis}). */
  private long time = 0;

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    return possibleFirstTags;
  }

  /**
   * Returns the number of milliseconds since January 1, 1970, 00:00:00 GMT
   * represented by this object.
   */
  public long getTime() {
    return time;
  }

  /**
   * Sets this Date object to represent a point in time that is time milliseconds
   * after January 1, 1970 00:00:00 GMT.
   */
  public void setTime(long time) {
    this.time = time;
  }

  @Override Asn1Tag getDefaultTag() {
    return Asn1Tag.GENERALIZED_TIME;
  }

  @Override int getBerValueLength() {
    return toAsn1IA5String().getBerValueLength();
  }

  @Override void encodeBerValue(ByteBuffer buf) {
    toAsn1IA5String().encodeBerValue(buf);
  }

  @Override void decodeBerValue(ByteBuffer buf) {
    Asn1IA5String result = new Asn1IA5String();
    result.setMaxSize(255);
    result.decodeBerValue(buf);
    time = Format.parseDateTime(result.getValue());
  }

  @Override
  public Iterable<BitStream> encodePerAligned() {
    Asn1IA5String result = toAsn1IA5String();
    return result.encodePerAligned();
  }

  @Override
  public Iterable<BitStream> encodePerUnaligned() {
    Asn1IA5String result = toAsn1IA5String();
    return result.encodePerUnaligned();
  }

  private Asn1IA5String toAsn1IA5String() {
    Asn1IA5String result = new Asn1IA5String();
    result.setMaxSize(255);
    result.setValue(formatAsAsn1GeneralizedTime(time));
    return result;
  }

  private static String formatAsAsn1GeneralizedTime(long time) {
    return new DateTime(time).toString(UTC_WITH_MILLISECONDS_FORMATTER);
  }

  @Override
  public void decodePerAligned(BitStreamReader reader) {
    Asn1IA5String result = new Asn1IA5String();
    result.setMaxSize(255);
    result.decodePerAligned(reader);
    time = Format.parseDateTime(result.getValue());
  }

  @Override
  public void decodePerUnaligned(BitStreamReader reader) {
    Asn1IA5String result = new Asn1IA5String();
    result.setMaxSize(255);
    result.decodePerUnaligned(reader);
    time = Format.parseDateTime(result.getValue());
  }

  @Override public String toString() {
    return new DateTime(time).toString(UTC_WITH_MILLISECONDS_FORMATTER);
  }

  public String toIndentedString(String indent) {
    return "Asn1GeneralizedTime [ " + this + " ]";
  }
}
