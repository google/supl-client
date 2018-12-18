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

package com.google.location.lbs.common.gnss;

import com.google.common.collect.ImmutableList;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

/** A container for constants related to UTC and GNSS times. */
public class TimeConstants {
  public static final int DAYS_PER_WEEK = 7;
  public static final int SECONDS_PER_HOUR = 3600;
  public static final int HOURS_PER_DAY = 24;
  public static final int SECONDS_PER_DAY = HOURS_PER_DAY * SECONDS_PER_HOUR;
  public static final int SECONDS_PER_WEEK = DAYS_PER_WEEK * SECONDS_PER_DAY;
  public static final int MILLIS_PER_SECOND = 1000;
  public static final double SECONDS_PER_MILLI = 1.0 / MILLIS_PER_SECOND;
  public static final long MILLIS_PER_DAY = SECONDS_PER_DAY * MILLIS_PER_SECOND;
  public static final long MILLIS_PER_WEEK = MILLIS_PER_DAY * DAYS_PER_WEEK;
  public static final int SECONDS_PER_MINUTE = 60;
  public static final long PICOS_PER_NANO = 1000;
  public static final int MINUTES_PER_HOUR = 60;
  public static final int NANOS_PER_MILLI = 1000000;
  public static final long NANOS_PER_SECOND = NANOS_PER_MILLI * MILLIS_PER_SECOND;
  public static final long NANOS_PER_MINUTE = NANOS_PER_SECOND * SECONDS_PER_MINUTE;
  public static final long NANOS_PER_HOUR = NANOS_PER_SECOND * SECONDS_PER_HOUR;
  public static final long NANOS_PER_DAY = NANOS_PER_SECOND * SECONDS_PER_DAY;
  public static final double SECONDS_PER_NANO = 1.0 / NANOS_PER_SECOND;
  public static final long NANOS_PER_WEEK = DAYS_PER_WEEK * SECONDS_PER_DAY * NANOS_PER_SECOND;
  public static final long PICOS_PER_MILLI = PICOS_PER_NANO * NANOS_PER_MILLI;
  public static final long PICOS_PER_SECOND = PICOS_PER_MILLI * MILLIS_PER_SECOND;
  public static final long PICOS_PER_WEEK = PICOS_PER_SECOND * SECONDS_PER_WEEK;
  public static final double SECONDS_PER_PICO = 1.0 / PICOS_PER_SECOND;

  /** The GPS epoch is equal to the QZSS epoch. */
  public static final DateTimePicos GPS_EPOCH =
      DateTimePicos.newBuilder()
          .setYear(1980)
          .setMonthOfYear(1)
          .setDayOfMonth(6)
          .setHourOfDay(0)
          .setMinuteOfHour(0)
          .setSecondOfMinute(0)
          .setPicoOfSecond(0)
          .build();

  /**
   * The starting time of Galileo system time
   *
   * <p>This UTC epoch is 13 (leap) seconds behind the GPS time. However, at the start epoch of
   * Galileo, the Galileo System Time was adjusted with these 13 leap seconds to make its time of
   * week in sync with GPS.
   */
  public static final DateTimePicos GAL_EPOCH =
      DateTimePicos.newBuilder()
          .setYear(1999)
          .setMonthOfYear(8)
          .setDayOfMonth(22)
          .setHourOfDay(0)
          .setMinuteOfHour(0)
          .setSecondOfMinute(0)
          .setPicoOfSecond(0)
          .build();

  /**
   * The starting time of the Beidou system time
   *
   * <p>This UTC time is 14 (leap) seconds behind the GPS time. This makes the Beidou System Time
   * having a difference of 14 leap seconds to GPS.
   */
  public static final DateTimePicos BDS_EPOCH =
      DateTimePicos.newBuilder()
          .setYear(2006)
          .setMonthOfYear(1)
          .setDayOfMonth(1)
          .setHourOfDay(0)
          .setMinuteOfHour(0)
          .setSecondOfMinute(0)
          .setPicoOfSecond(0)
          .build();

  public static final DateTimePicos UTC_EPOCH =
      DateTimePicos.newBuilder()
          .setYear(1970)
          .setMonthOfYear(1)
          .setDayOfMonth(1)
          .setHourOfDay(0)
          .setMinuteOfHour(0)
          .setSecondOfMinute(0)
          .setPicoOfSecond(0)
          .build();

  public static final int MOSCOW_UTC_TIME_OFFSET_HOURS = 3;
  public static final long GAL_GPS_EPOCHS_OFFSET_MILLIS =
      GAL_EPOCH.computeElapsedMillisFrom(GPS_EPOCH);

  /** The number of leap seconds that occurred from GPS epoch to Beidou epoch, inclusively */
  public static final int LEAP_SECONDS_BETWEEN_GPS_BDS_EPOCHS = 14;

  /** The number of weeks elapsed from the GPS epoch to the Beidou epoch */
  public static final int BDS_GPS_EPOCHS_OFFSETS_WEEKS = 1356;

  /** The number of milliseconds from the GPS epoch to the Beidou epoch */
  public static final long BDS_GPS_EPOCHS_OFFSET_MILLIS =
      BDS_GPS_EPOCHS_OFFSETS_WEEKS * MILLIS_PER_WEEK
          + LEAP_SECONDS_BETWEEN_GPS_BDS_EPOCHS * MILLIS_PER_SECOND;

  /**
   * The number of milliseconds from the GPS epoch to the UTC epoch
   *
   * <p>This is a normal delta, with no leap seconds considered.
   */
  public static final long GPS_UTC_EPOCHS_OFFSET_MILLIS =
      GPS_EPOCH.computeElapsedMillisFrom(UTC_EPOCH);

  /** The number of weeks from the Galileo epoch to the GPS epoch */
  public static final int GAL_GPS_EPOCHS_OFFSET_WEEKS =
      (int) (TimeConstants.GAL_GPS_EPOCHS_OFFSET_MILLIS / TimeConstants.MILLIS_PER_WEEK);

  /**
   * All leap seconds occurred are listed here. Newly occurred leap second should be appended to
   * this list.
   */
  static final ImmutableList<DateTime> LEAP_SECOND_LIST =
      ImmutableList.of(
          new DateTime(1982, 1, 1, 0, 0, 0, DateTimeZone.UTC),
          new DateTime(1982, 7, 1, 0, 0, 0, DateTimeZone.UTC),
          new DateTime(1983, 7, 1, 0, 0, 0, DateTimeZone.UTC),
          new DateTime(1985, 7, 1, 0, 0, 0, DateTimeZone.UTC),
          new DateTime(1988, 1, 1, 0, 0, 0, DateTimeZone.UTC),
          new DateTime(1990, 1, 1, 0, 0, 0, DateTimeZone.UTC),
          new DateTime(1991, 1, 1, 0, 0, 0, DateTimeZone.UTC),
          new DateTime(1992, 7, 1, 0, 0, 0, DateTimeZone.UTC),
          new DateTime(1993, 7, 1, 0, 0, 0, DateTimeZone.UTC),
          new DateTime(1994, 7, 1, 0, 0, 0, DateTimeZone.UTC),
          new DateTime(1996, 1, 1, 0, 0, 0, DateTimeZone.UTC),
          new DateTime(1997, 7, 1, 0, 0, 0, DateTimeZone.UTC),
          new DateTime(1999, 1, 1, 0, 0, 0, DateTimeZone.UTC),
          new DateTime(2006, 1, 1, 0, 0, 0, DateTimeZone.UTC),
          new DateTime(2009, 1, 1, 0, 0, 0, DateTimeZone.UTC),
          new DateTime(2012, 7, 1, 0, 0, 0, DateTimeZone.UTC),
          new DateTime(2015, 7, 1, 0, 0, 0, DateTimeZone.UTC),
          new DateTime(2017, 1, 1, 0, 0, 0, DateTimeZone.UTC));
}
