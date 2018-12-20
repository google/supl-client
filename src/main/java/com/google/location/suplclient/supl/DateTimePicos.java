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

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.collect.ComparisonChain;
import java.util.Objects;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

/**
 * A container of date and time values with picosecond resolution.
 *
 * <p>Note: this is a time format class, and does not belong to any time system. It can be used to
 * represent GPS time and as well UTC time.
 */
public class DateTimePicos implements Comparable<DateTimePicos> {
  /** The year value */
  public final int year;
  /** The month of year [1, 12] */
  public final int monthOfYear;
  /** The day of month [1, 31] */
  public final int dayOfMonth;
  /** The hour of day [0, 23] */
  public final int hourOfDay;
  /** The minute of hour [0, 59] */
  public final int minuteOfHour;
  /** The second of minute [0, 59] */
  public final int secondOfMinute;
  /** The picosecond of second [0, 1E12 - 1] */
  public final long picoOfSecond;
  /**
   * A {@link DateTime} representation of this object, yet without the sub-millisecond information
   */
  private final DateTime dateTime;

  /** Constructor */
  private DateTimePicos(Builder builder) {
    year = builder.year;
    monthOfYear = builder.monthOfYear;
    dayOfMonth = builder.dayOfMonth;
    hourOfDay = builder.hourOfDay;
    minuteOfHour = builder.minuteOfHour;
    secondOfMinute = builder.secondOfMinute;
    picoOfSecond = builder.picoOfSecond;
    this.dateTime = toDateTime();
  }

  /** Creates a builder with no field set. */
  public static Builder newBuilder() {
    return new Builder();
  }

  /**
   * Creates a {@link DateTimePicos} instance from the {@link DateTime} and the sub-millisecond part
   * (picoseconds of millisecond).
   */
  public static DateTimePicos fromDateTimeAndSubMillis(DateTime dateTime, long picoOfMillis) {
    long picoOfSecond = dateTime.getMillisOfSecond() * TimeConstants.PICOS_PER_MILLI + picoOfMillis;
    return fromDateTimeAndPicoOfSec(dateTime, picoOfSecond);
  }

  /**
   * Returns the number of leap seconds occurred before the input UTC {@link DateTimePicos}
   * instance.
   */
  public static int getLeapSecond(DateTimePicos dateTimePicos) {
    int count = 0;
    for (DateTime leapSec : TimeConstants.LEAP_SECOND_LIST) {
      if (leapSec.compareTo(dateTimePicos.dateTime) <= 0) {
        count++;
      } else {
        break;
      }
    }
    return count;
  }

  /** Returns the number of milliseconds since {@code originTime}. */
  public long computeElapsedMillisFrom(DateTimePicos originTime) {
    // The getMillis() of DateTime returns the milliseconds since the UTC/JAVA epoch as a continuous
    // measurement and does not consider leap seconds.
    return dateTime.getMillis() - originTime.toDateTime().getMillis();
  }

  /** Returns the number of milliseconds since {@code originTime}. */
  public long computeElapsedMillisFrom(DateTime originTime) {
    // The getMillis() of DateTime returns the milliseconds since the UTC/JAVA epoch as a continuous
    // measurement and does not consider leap seconds.
    return toDateTime().getMillis() - originTime.getMillis();
  }

  /**
   * Returns a copy of this {@link DateTimePicos} instance minus the specified number of seconds.
   */
  public DateTimePicos minusSeconds(int sec) {
    DateTime dt = dateTime.minusSeconds(sec);
    return fromDateTimeAndPicoOfSec(dt, this.picoOfSecond);
  }

  /** Returns a copy of this {@link DateTimePicos} instance plus the specified number of hours. */
  public DateTimePicos plusHours(int hours) {
    DateTime dt = dateTime.plusHours(hours);
    return fromDateTimeAndPicoOfSec(dt, this.picoOfSecond);
  }

  /** Returns a copy of this {@link DateTimePicos} instance minus the specified number of hours. */
  public DateTimePicos minusHours(int hours) {
    DateTime dt = dateTime.minusHours(hours);
    return fromDateTimeAndPicoOfSec(dt, this.picoOfSecond);
  }

  /** Returns seconds of the day. */
  public int getSecondOfDay() {
    return dateTime.getSecondOfDay();
  }

  /** Returns the day of year [1, 366]. */
  public int getDayOfYear() {
    return dateTime.getDayOfYear();
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof DateTimePicos)) {
      return false;
    }
    DateTimePicos pdt = (DateTimePicos) obj;
    return pdt.year == this.year
        && pdt.monthOfYear == this.monthOfYear
        && pdt.dayOfMonth == this.dayOfMonth
        && pdt.hourOfDay == this.hourOfDay
        && pdt.minuteOfHour == this.minuteOfHour
        && pdt.secondOfMinute == this.secondOfMinute
        && pdt.picoOfSecond == this.picoOfSecond;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, secondOfMinute, picoOfSecond);
  }

  @Override
  public int compareTo(DateTimePicos another) {
    return ComparisonChain.start()
        .compare(this.year, another.year)
        .compare(this.monthOfYear, another.monthOfYear)
        .compare(this.dayOfMonth, another.dayOfMonth)
        .compare(this.hourOfDay, another.hourOfDay)
        .compare(this.minuteOfHour, another.minuteOfHour)
        .compare(this.secondOfMinute, another.secondOfMinute)
        .compare(this.picoOfSecond, another.picoOfSecond)
        .result();
  }

  /**
   * Creates a {@link DateTime} instance.
   *
   * <p>This conversion will result in losing the sub-millisecond information.
   */
  @VisibleForTesting
  protected DateTime toDateTime() {
    return new DateTime(
        year,
        monthOfYear,
        dayOfMonth,
        hourOfDay,
        minuteOfHour,
        secondOfMinute,
        (int) (picoOfSecond / TimeConstants.PICOS_PER_MILLI),
        DateTimeZone.UTC);
  }

  /**
   * Converts a {@link DateTime} and the picoseconds in second to a {@link DateTimePicos} instance.
   */
  private static DateTimePicos fromDateTimeAndPicoOfSec(DateTime dateTime, long picoOfSecond) {
    return DateTimePicos.newBuilder()
        .setYear(dateTime.getYear())
        .setMonthOfYear(dateTime.getMonthOfYear())
        .setDayOfMonth(dateTime.getDayOfMonth())
        .setHourOfDay(dateTime.getHourOfDay())
        .setMinuteOfHour(dateTime.getMinuteOfHour())
        .setSecondOfMinute(dateTime.getSecondOfMinute())
        .setPicoOfSecond(picoOfSecond)
        .build();
  }

  /** Builder for {@link DateTimePicos} */
  public static class Builder {
    /** For documentation of these fields, see corresponding fields in {@link DateTimePicos}. */
    private int year;
    private int monthOfYear;
    private int dayOfMonth;
    private int hourOfDay;
    private int minuteOfHour;
    private int secondOfMinute;
    private long picoOfSecond;

    private Builder() {}

    /** Sets the year value. */
    public Builder setYear(int year) {
      this.year = year;
      return this;
    }

    /** Sets the month of year value in [1, 12]. */
    public Builder setMonthOfYear(int monthOfYear) {
      Preconditions.checkArgument(
          monthOfYear >= 1 && monthOfYear <= 12,
          "The input month of year is out of range [1, 12]: %s. ",
          monthOfYear);
      this.monthOfYear = monthOfYear;
      return this;
    }

    /** Sets the day of month value in [1, 31]. */
    public Builder setDayOfMonth(int dayOfMonth) {
      Preconditions.checkArgument(
          dayOfMonth >= 1 && dayOfMonth <= 31,
          "The input day of month is out of range [1, 31]: %s. ",
          dayOfMonth);
      this.dayOfMonth = dayOfMonth;
      return this;
    }

    /** Sets the hour of day value in [0, 23]. */
    public Builder setHourOfDay(int hourOfDay) {
      Preconditions.checkArgument(
          hourOfDay >= 0 && hourOfDay <= 23,
          "The input hour of day is out of range [0, 23]: %s. ",
          hourOfDay);
      this.hourOfDay = hourOfDay;
      return this;
    }

    /** Sets the minute of hour value in [0, 59]. */
    public Builder setMinuteOfHour(int minuteOfHour) {
      Preconditions.checkArgument(
          minuteOfHour >= 0 && minuteOfHour <= 59,
          "The input minute of hour is out of range [0, 59]: %s. ",
          minuteOfHour);
      this.minuteOfHour = minuteOfHour;
      return this;
    }

    /** Sets the second of minute value in [0, 59]. */
    public Builder setSecondOfMinute(int secondOfMinute) {
      Preconditions.checkArgument(
          secondOfMinute >= 0 && secondOfMinute <= 59,
          "The input second of minute is out of range [0, 59]: %s. ",
          secondOfMinute);
      this.secondOfMinute = secondOfMinute;
      return this;
    }

    /** Sets the picosecond of second value in [0, 1E12). */
    public Builder setPicoOfSecond(long picoOfSecond) {
      Preconditions.checkArgument(
          picoOfSecond >= 0 && picoOfSecond < TimeConstants.PICOS_PER_SECOND,
          "The input picosecond of second is out of range [0, 1E12): %s. ",
          picoOfSecond);
      this.picoOfSecond = picoOfSecond;
      return this;
    }

    /** Builds a {@link DateTimePicos} instance as specified by this builder. */
    public DateTimePicos build() {
      return new DateTimePicos(this);
    }
  }
}
