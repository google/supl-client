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

package com.google.location.suplclient.supl;

import com.google.common.collect.ImmutableList;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

/** A container for constants related to UTC and GNSS times. */
public class TimeConstants {
  public static final int DAYS_PER_WEEK = 7;
  public static final int SECONDS_PER_HOUR = 3600;
  public static final int HOURS_PER_DAY = 24;
  public static final int SECONDS_PER_DAY = HOURS_PER_DAY * SECONDS_PER_HOUR;
  public static final int MILLIS_PER_SECOND = 1000;
  public static final long MILLIS_PER_DAY = SECONDS_PER_DAY * MILLIS_PER_SECOND;

  public static final int MOSCOW_UTC_TIME_OFFSET_HOURS = 3;

  /**
   * The number of milliseconds from the GPS epoch to the UTC epoch
   *
   * <p>This is a normal delta, with no leap seconds considered.
   */
  public static final long GPS_UTC_EPOCHS_OFFSET_MILLIS = 315964800000L;

  /** The number of weeks from the Galileo epoch to the GPS epoch */
  public static final int GAL_GPS_EPOCHS_OFFSET_WEEKS = 1024;

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
