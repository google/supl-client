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

import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.MutableDateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * A UTCTime is a string representation for a UTC timestamp
 *
 * <p>Implements ASN.1 functionality.
 *
 * 
 */
public class Asn1UTCTime extends Asn1Object {
  private static final Collection<Asn1Tag> possibleFirstTags =
      ImmutableList.of(Asn1Tag.UTC_TIME);

  // duplicate previous behavior of all 0 fields for ctor().
  private MutableDateTime value = new MutableDateTime(0, 1, 1, 0, 0, 0, 0, DateTimeZone.UTC);

  private static final DateTimeFormatter humanFormatter =
      DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");

  private static final DateTimeFormatter ia5Formatter =
      DateTimeFormat.forPattern("yyMMddHHmmss'Z'");

  public Asn1UTCTime() {
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    return possibleFirstTags;
  }

  public void assignTo(Asn1UTCTime other) {
    value = other.value;
  }

  public int getYear() {
    return value.year().get();
  }

  public void setYear(int newYear) {
    value.setYear(newYear);
  }

  public int getMonth() {
    return value.monthOfYear().get();
  }

  public void setMonth(int newMonth) {
    value.setMonthOfYear(newMonth);
  }

  public int getDay() {
    return value.dayOfMonth().get();
  }

  public void setDay(int newDay) {
    value.setDayOfMonth(newDay);
  }

  public int getHour() {
    return value.hourOfDay().get();
  }

  public void setHour(int newHour) {
    value.setHourOfDay(newHour);
  }

  public int getMinute() {
    return value.minuteOfHour().get();
  }

  public void setMinute(int newMinute) {
    value.setMinuteOfHour(newMinute);
  }

  public int getSecond() {
    return value.secondOfMinute().get();
  }

  public void setSecond(int newSecond) {
    value.setSecondOfMinute(newSecond);
  }

  private Asn1IA5String encodeToIA5String() {
    String textRepresentation = ia5Formatter.print(value);
    Asn1IA5String result = new Asn1IA5String();
    result.setMaxSize(255);
    result.setValue(textRepresentation);
    return result;
  }

  public String toHumanReadableString() {
    return humanFormatter.print(value);
  }

  @Override Asn1Tag getDefaultTag() {
    return Asn1Tag.UTC_TIME;
  }

  @Override int getBerValueLength() {
    return encodeToIA5String().getBerValueLength();
  }

  @Override void encodeBerValue(ByteBuffer buf) {
    encodeToIA5String().encodeBerValue(buf);
  }

  @Override public void decodeBerValue(ByteBuffer buf) {
    Asn1IA5String result = new Asn1IA5String();
    result.setMaxSize(255);
    result.decodeBerValue(buf);
    retrieveResult(result);
  }

  @Override
  public Iterable<BitStream> encodePerAligned() {
    Asn1IA5String result = encodeToIA5String();
    return result.encodePerAligned();
  }

  @Override
  public Iterable<BitStream> encodePerUnaligned() {
    Asn1IA5String result = encodeToIA5String();
    return result.encodePerUnaligned();
  }

  /**
   * Gets the value as a {@link DateTime} in UTC.
   *
   * @return the datetime
   */
  public DateTime getValue() {
    return value.toDateTime();
  }

  /**
   * Sets the value from a {@link DateTime}.
   *
   * @param dateTime the datetime
   */
  public void setValue(DateTime dateTime) {
    value = new MutableDateTime(dateTime);
    value.setZone(DateTimeZone.UTC);
  }

  private static final int LENGTH_OF_SIGN = "+".length();
  private static final int LENGTH_OF_2_DIGIT = "00".length();
  private static final int LENGTH_OF_ZONE_HOUR_OFFSET = LENGTH_OF_SIGN + LENGTH_OF_2_DIGIT;
  private static final int LENGTH_OF_ZONE_OFFSET = LENGTH_OF_ZONE_HOUR_OFFSET + LENGTH_OF_2_DIGIT;
  private static final Splitter SPLITTER_2_DIGIT = Splitter.fixedLength(LENGTH_OF_2_DIGIT);

  private static class TimeTextAndZone {
    public String timeString;
    public DateTimeZone zone;
  }

  private static TimeTextAndZone extractZone(String rawTimeString) {
    int timeLength = rawTimeString.length();
    final TimeTextAndZone timeTextAndZone = new TimeTextAndZone();
    timeTextAndZone.zone = DateTimeZone.UTC;
    // If the raw time string has trailing 'Z', remove it.
    if (rawTimeString.charAt(timeLength - 1) == 'Z') {
      --timeLength;
    } else {
      int signIndicator;
      switch (rawTimeString.charAt(timeLength - LENGTH_OF_ZONE_OFFSET)) {
        case '+':
          signIndicator = 1;
          break;
        case '-':
          signIndicator = -1;
          break;
        default:
          signIndicator = 0;
          break;
      }
      if (signIndicator != 0) {
        timeLength -= LENGTH_OF_ZONE_OFFSET;
        int hourOffset = Integer.parseInt(rawTimeString.substring(
            timeLength + LENGTH_OF_SIGN, timeLength + LENGTH_OF_ZONE_HOUR_OFFSET));
        int minuteOffset = Integer.parseInt(rawTimeString.substring(
            timeLength + LENGTH_OF_ZONE_HOUR_OFFSET, timeLength + LENGTH_OF_ZONE_OFFSET));
        if (signIndicator < 0) {
          hourOffset = -hourOffset;
          minuteOffset = -minuteOffset;
        }
        if (hourOffset != 0 || minuteOffset != 0) {
          timeTextAndZone.zone = DateTimeZone.forOffsetHoursMinutes(hourOffset, minuteOffset);
        }
      }
    }
    timeTextAndZone.timeString = rawTimeString.substring(0, timeLength);
    return timeTextAndZone;
  }

  /**
   * Parses a text representation of a time into the new value of this instance.
   *
   * <p>The format definition of UTCTime:
   *
   * <p>http://www.obj-sys.com/asn1tutorial/node15.html
   * http://www.obj-sys.com/asn1tutorial/node14.html
   *
   * <p>We currently support "[YY]YYMMDDHHMM[SS][Z]" or "[YY]YYMMDDHHMM[SS][+|-]HHMM"
   *
   * @param asn1IA5String the text representation
   * @throws IllegalArgumentException if asn1IA5String contains a malformed representation or the
   *     date part values are out of range
   * @throws NumberFormatException if parts of asn1IA5String that should parse to numbers can't
   */
  private void retrieveResult(Asn1IA5String asn1IA5String) {
    TimeTextAndZone timeTextAndZone = extractZone(asn1IA5String.getValue());
    int yearLength;
    int timeLength = timeTextAndZone.timeString.length();
    boolean hasSecond = true;
    switch (timeLength) {
      case 10: // 2 digit year, no seconds
        hasSecond = false;
        // Fall-through
      case 12: // 2 digit year, with seconds
        yearLength = LENGTH_OF_2_DIGIT;
        break;
      case 14: // 4 digit year, with seconds
        yearLength = 2 * LENGTH_OF_2_DIGIT;
        break;
      default:
        throw new IllegalArgumentException(
            "malformed UTCTime format: " + timeTextAndZone.timeString);
    }
    int year = Integer.parseInt(timeTextAndZone.timeString.substring(0, yearLength));
    // Two-digit year's range is from 1954 to 2053.
    if (yearLength == LENGTH_OF_2_DIGIT) {
      if (year > 53) {
        year += 1900;
      } else {
        year += 2000;
      }
    }
    List<String> fields = SPLITTER_2_DIGIT.splitToList(
        timeTextAndZone.timeString.subSequence(yearLength, timeLength));
    int month = Integer.parseInt(fields.get(0));
    int day = Integer.parseInt(fields.get(1));
    int hour = Integer.parseInt(fields.get(2));
    int minute = Integer.parseInt(fields.get(3));
    int second = 0;
    if (hasSecond) {
      second = Integer.parseInt(fields.get(4));
    }
    value = new MutableDateTime(year, month, day, hour, minute, second, 0, timeTextAndZone.zone);
    if (!DateTimeZone.UTC.equals(timeTextAndZone.zone)) {
      value.setZone(DateTimeZone.UTC);
    }
  }
  @Override
  public void decodePerAligned(BitStreamReader reader) {
    Asn1IA5String result = new Asn1IA5String();
    result.setMaxSize(255);
    result.decodePerAligned(reader);
    retrieveResult(result);
  }

  @Override
  public void decodePerUnaligned(BitStreamReader reader) {
    Asn1IA5String result = new Asn1IA5String();
    result.setMaxSize(255);
    result.decodePerUnaligned(reader);
    retrieveResult(result);
  }
}
