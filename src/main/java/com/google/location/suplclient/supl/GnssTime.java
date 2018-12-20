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

import com.google.gdata.util.common.base.Pair;
import com.google.common.base.Preconditions;
import com.google.common.collect.ComparisonChain;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

/**
 * The time parameters for Global Navigation Satellite Systems (GNSS).
 *
 * <p>GPS Time which starts at the GPS epoch (1980/01/06) is what this class refers to as GNSS time.
 */
public class GnssTime implements Comparable<GnssTime> {

  /** The number of weeks since the GPS epoch (without rollover) */
  private final int gpsWeek;

  /** The time of week (picoseconds) since the start of a GPS week */
  private final long gpsTowPicos;

  /**
   * Constructs a {@link GnssTime} instance from the number of weeks since the GPS epoch and the
   * time of week (picoseconds).
   */
  private GnssTime(int gpsWeek, long gpsTowPicos) {
    this.gpsWeek = gpsWeek;
    this.gpsTowPicos = gpsTowPicos;
  }

  /**
   * Creates a {@link GnssTime} instance from the number of nanoseconds since the GPS epoch.
   *
   * <p>Note: Using the primitive type long to represent nanoseconds since GPS epoch will cause
   * overflow after the year 2271, hence this method should be deprecated by then.
   */
  public static GnssTime fromGpsNanosSinceEpoch(long gpsNanos) {
    return fromGpsNanosSinceEpoch(gpsNanos, 0.0 /* subNanos */);
  }

  /**
   * Creates a {@link GnssTime} instance from the number of nanoseconds since the GPS epoch, and the
   * fraction of the nanosecond.
   *
   * <p>Note: Using the primitive type long to represent nanoseconds since GPS epoch will cause
   * overflow after the year 2271, hence this method should be deprecated by then.
   */
  public static GnssTime fromGpsNanosSinceEpoch(long gpsNanos, double subNanos) {
    int gpsWeek = (int) (gpsNanos / TimeConstants.NANOS_PER_WEEK);
    long towPicos =
        (long)
            ((gpsNanos % TimeConstants.NANOS_PER_WEEK + subNanos) * TimeConstants.PICOS_PER_NANO);
    return new GnssTime(gpsWeek, towPicos);
  }

  /** Creates a {@link GnssTime} instance from a {@link DateTimePicos} instance in UTC time. */
  public static GnssTime fromDateTimePicosInUtc(DateTimePicos dateTimePicosInUtc) {
    int leapSeconds = DateTimePicos.getLeapSecond(dateTimePicosInUtc);
    long millisSinceGpsEpochWithLeapSeconds =
        dateTimePicosInUtc.computeElapsedMillisFrom(TimeConstants.GPS_EPOCH)
            + leapSeconds * TimeConstants.MILLIS_PER_SECOND;
    long picosOfMillis = dateTimePicosInUtc.picoOfSecond % TimeConstants.PICOS_PER_MILLI;

    int gpsWeek = (int) (millisSinceGpsEpochWithLeapSeconds / TimeConstants.MILLIS_PER_WEEK);
    long gpsTowPicos =
        (millisSinceGpsEpochWithLeapSeconds % TimeConstants.MILLIS_PER_WEEK)
                * TimeConstants.PICOS_PER_MILLI
            + picosOfMillis;
    return new GnssTime(gpsWeek, gpsTowPicos);
  }

  /** Creates a {@link GnssTime} instance from a {@link DateTimePicos} instance in GPS time. */
  public static GnssTime fromDateTimePicosInGps(DateTimePicos dateTimePicosInGps) {
    long millisSinceGpsEpoch = dateTimePicosInGps.computeElapsedMillisFrom(TimeConstants.GPS_EPOCH);
    long picosOfMillis = dateTimePicosInGps.picoOfSecond % TimeConstants.PICOS_PER_MILLI;

    int gpsWeek = (int) (millisSinceGpsEpoch / TimeConstants.MILLIS_PER_WEEK);
    long gpsTowPicos =
        (millisSinceGpsEpoch % TimeConstants.MILLIS_PER_WEEK) * TimeConstants.PICOS_PER_MILLI
            + picosOfMillis;
    return new GnssTime(gpsWeek, gpsTowPicos);
  }

  /** Creates a {@link GnssTime} instance from a {@link DateTimePicos} instance in GLONASS time. */
  public static GnssTime fromDateTimePicosInGlo(DateTimePicos dateTimePicosInGlo) {
    return fromDateTimePicosInUtc(
        dateTimePicosInGlo.minusHours(TimeConstants.MOSCOW_UTC_TIME_OFFSET_HOURS));
  }

  /**
   * Creates a {@link GnssTime} instance from the current UTC time.
   *
   * <p>Note that the returned {@link GnssTime} does not include the sub-millisecond part of current
   * time.
   */
  public static GnssTime now() {
    DateTimePicos utcDateTimePicos =
        DateTimePicos.fromDateTimeAndSubMillis(DateTime.now(DateTimeZone.UTC), 0);
    return fromDateTimePicosInUtc(utcDateTimePicos);
  }

  /**
   * Creates a {@link GnssTime} instance using YUMA GPS week number [0, 1023], and the time of week
   * (picoseconds).
   */
  public static GnssTime fromYumaWeekTow(int yumaWeek, long gpsTowPicos) {
    Preconditions.checkArgument(
        yumaWeek >= 0 && yumaWeek < 1024,
        "Expecting the input Yuma week to be within range [0, 1023], but found = %s",
        yumaWeek);

    // Estimate the multiplier of current week.
    DateTimePicos currentUtc =
        DateTimePicos.fromDateTimeAndSubMillis(DateTime.now(DateTimeZone.UTC), 0);
    GnssTime refTime = fromDateTimePicosInUtc(currentUtc);
    Pair<Integer, Long> refWeekTowPicos = refTime.toGpsWeekTowPicos();
    int weekMultiplier = refWeekTowPicos.first / 1024;

    int gpsWeek = weekMultiplier * 1024 + yumaWeek;
    return new GnssTime(gpsWeek, gpsTowPicos);
  }

  /**
   * Computes the time at the beginning of the week in nanoseconds since the GPS epoch given {@code
   * refTime}.
   *
   * <p>A GPS week begins at the midnight between every Saturday and Sunday.
   *
   * <p>Note: Using the primitive type long to represent nanoseconds since GPS epoch will cause
   * overflow after the year 2271, hence this method should be deprecated by then.
   */
  public static Long getGpsWeekEpochNano(GnssTime refTime) {
    Pair<Integer, Long> weekTowPicos = refTime.toGpsWeekTowPicos();
    return weekTowPicos.first * TimeConstants.NANOS_PER_WEEK;
  }

  /**
   * Creates a {@link GnssTime} instance from the number of weeks since the GPS epoch and the time
   * of week (picoseconds).
   */
  public static GnssTime fromGpsWeekTowPicos(int gpsWeek, long gpsTowPicos) {
    return new GnssTime(gpsWeek, gpsTowPicos);
  }

  /**
   * Creates a {@link GnssTime} instance from the number of weeks since the Beidou epoch and the
   * time of week (picoseconds).
   *
   * <p>The elapsed time from BDS epoch to GPS epoch is some number of weeks plus extra 14 leap
   * seconds. The 14 leap seconds may cause week rollover and should be handled.
   */
  public static GnssTime fromBdsWeekTowPicos(int bdsWeek, long bdsTowPicos) {
    int gpsWeek = bdsWeek + TimeConstants.BDS_GPS_EPOCHS_OFFSETS_WEEKS;
    long gpsTowPicos =
        bdsTowPicos
            + TimeConstants.LEAP_SECONDS_BETWEEN_GPS_BDS_EPOCHS * TimeConstants.PICOS_PER_SECOND;
    // Adjust for week rollover
    if (gpsTowPicos >= TimeConstants.PICOS_PER_WEEK) {
      gpsWeek++;
      gpsTowPicos -= TimeConstants.PICOS_PER_WEEK;
    }
    return new GnssTime(gpsWeek, gpsTowPicos);
  }

  /**
   * Creates a {@link GnssTime} instance from the number of weeks since the Galileo epoch and the
   * time of week (picoseconds).
   */
  public static GnssTime fromGalWeekTowPicos(int galWeek, long galTowPicos) {
    return new GnssTime(galWeek + TimeConstants.GAL_GPS_EPOCHS_OFFSET_WEEKS, galTowPicos);
  }

  /**
   * Subtracts {@code subtrahendNanos} from the time specified by this {@link GnssTime} instance and
   * returns a new instance.
   */
  public GnssTime minusNanoseconds(long subtrahendNanos) {
    return fromGpsNanosSinceEpoch(getNanosSinceGpsEpoch() - subtrahendNanos);
  }

  /**
   * Adds {@code addendNanos} to the time specified by this {@link GnssTime} instance and returns a
   * new instance.
   */
  public GnssTime plusNanoseconds(long addendNanos) {
    return fromGpsNanosSinceEpoch(getNanosSinceGpsEpoch() + addendNanos);
  }

  /** Returns the day of year [1, 366] corresponding to the GPS time. */
  public int getGpsDayOfYear() {
    DateTimePicos gpsTime = toGpsDateTimePicos();
    return gpsTime.getDayOfYear();
  }

  /**
   * Computes the UTC time corresponding to this {@link GnssTime} and returns the result as {@link
   * DateTimePicos}.
   */
  public DateTimePicos toUtcTime() {
    DateTimePicos gpsDateTimePicos = toGpsDateTimePicos();
    int countLeapSec1 = DateTimePicos.getLeapSecond(gpsDateTimePicos);

    // The countLeapSec1 would produce the correct number of leap seconds except for an edge case
    // where a straddle leap second occurs (number of leap seconds now != number of leap seconds
    // after adjusting the time with the computed leap seconds). In such case, we need to add one to
    // the used leap second.
    DateTimePicos gpsDateTimePicosMinusLeapSec = gpsDateTimePicos.minusSeconds(countLeapSec1);
    int countLeapSec2 = DateTimePicos.getLeapSecond(gpsDateTimePicosMinusLeapSec);

    return (countLeapSec1 == countLeapSec2)
        ? gpsDateTimePicosMinusLeapSec
        : gpsDateTimePicos.minusSeconds(countLeapSec2);
  }

  /**
   * Computes GnssTime from UTC timestamp in nanos.
   *
   * <p>Note: Using the primitive type long to represent Unix timestamps in nanoseconds epoch will
   * cause overflow after the year 2262, hence this method should be deprecated by then.
   */
  public static GnssTime fromUnixTimestampNanos(long timestampNanosUnix) {
    // Add leap seconds.
    long timestampMillisUnix = timestampNanosUnix / TimeConstants.NANOS_PER_MILLI;
    long nanosRemainderUnix =
        timestampNanosUnix - (timestampMillisUnix * TimeConstants.NANOS_PER_MILLI);

    DateTimePicos utcDateTimePicos =
        DateTimePicos.fromDateTimeAndSubMillis(
            new DateTime(timestampMillisUnix), nanosRemainderUnix * TimeConstants.PICOS_PER_NANO);

    int leapSeconds = DateTimePicos.getLeapSecond(utcDateTimePicos);

    // Convert to GPS epoch.
    final long timestampNanosGps =
        timestampNanosUnix
            - TimeConstants.GPS_UTC_EPOCHS_OFFSET_MILLIS * TimeConstants.NANOS_PER_MILLI
            + leapSeconds * TimeConstants.NANOS_PER_SECOND;

    int gpsWeek = (int) (timestampNanosGps / TimeConstants.NANOS_PER_WEEK);
    long gpsTowNanos = timestampNanosGps - gpsWeek * TimeConstants.NANOS_PER_WEEK;

    return GnssTime.fromGpsWeekTowPicos(gpsWeek, gpsTowNanos * TimeConstants.PICOS_PER_NANO);
  }

  /**
   * Computes the Unix timestamp corresponding to this {@link GnssTime} and returns as nanoseconds.
   *
   * <p>Note: Using the primitive type long to represent Unix timestamps in nanoseconds epoch will
   * cause overflow after the year 2262, hence this method should be deprecated by then.
   */
  public long toUnixTimestampNanos() {
    DateTimePicos utcTime = toUtcTime();
    int leapSeconds = DateTimePicos.getLeapSecond(utcTime);
    return getNanosSinceUtcEpoch() - leapSeconds * TimeConstants.NANOS_PER_SECOND;
  }

  /** Returns a pair of week count since the GPS epoch and time of week (picoseconds). */
  public Pair<Integer, Long> toGpsWeekTowPicos() {
    return Pair.of(gpsWeek, gpsTowPicos);
  }

  /**
   * Returns a pair of week count since the Beidou epoch and time of week (picoseconds).
   *
   * <p>The elapsed time from BDS epoch to GPS epoch is some number of weeks plus extra 14 leap
   * seconds. The 14 leap seconds may cause week rollover and should be handled.
   */
  public Pair<Integer, Long> toBdsWeekTowPicos() {
    int bdsWeek = gpsWeek - TimeConstants.BDS_GPS_EPOCHS_OFFSETS_WEEKS;
    long bdsTowPicos =
        gpsTowPicos
            - TimeConstants.LEAP_SECONDS_BETWEEN_GPS_BDS_EPOCHS * TimeConstants.PICOS_PER_SECOND;
    // Adjust for week rollover
    if (bdsTowPicos < 0) {
      bdsWeek--;
      bdsTowPicos += TimeConstants.PICOS_PER_WEEK;
    }
    return Pair.of(bdsWeek, bdsTowPicos);
  }

  /** Returns a pair of week count since the Galileo epoch and time of week (picoseconds). */
  public Pair<Integer, Long> toGalWeekTowPicos() {
    return Pair.of(gpsWeek - TimeConstants.GAL_GPS_EPOCHS_OFFSET_WEEKS, gpsTowPicos);
  }

  /**
   * Returns a pair of week count since the QZSS epoch (same as the GPS epoch) and time of week
   * (picoseconds).
   */
  public Pair<Integer, Long> toQzsWeekTowPicos() {
    return toGpsWeekTowPicos();
  }

  /**
   * Returns a {@link DateTimePicos} and the time of day (picoseconds) in GLONASS time (with leap
   * seconds considered).
   */
  public Pair<DateTimePicos, Long> toGloDateTodPicos() {
    DateTimePicos utcTime = toUtcTime();

    DateTimePicos gloTime = utcTime.plusHours(TimeConstants.MOSCOW_UTC_TIME_OFFSET_HOURS);
    long picoOfDay =
        gloTime.getSecondOfDay() * TimeConstants.PICOS_PER_SECOND + gloTime.picoOfSecond;
    return Pair.of(gloTime, picoOfDay);
  }

  /**
   * Converts the GNSS time to a list of values in units specified by the input {@link TimeUnit}
   * instances.
   */
  public long[] getBreakdownEpoch(TimeUnit... units) {
    long nanos = getNanosSinceGpsEpoch();
    long[] values = new long[units.length];
    for (int idx = 0; idx < units.length; ++idx) {
      TimeUnit unit = units[idx];
      long value = unit.convert(nanos, TimeUnit.NANOSECONDS);
      values[idx] = value;
      nanos -= unit.toNanos(value);
    }
    return values;
  }

  /**
   * Returns the time in nanoseconds elapsed from the GPS time specified by (week number, time of
   * week in seconds).
   */
  public long computeElapsedNanosFrom(int gpsWeek, double towS) {
    return getNanosSinceGpsEpoch()
        - (long) (gpsWeek * TimeConstants.NANOS_PER_WEEK + towS * TimeConstants.NANOS_PER_SECOND);
  }

  /** Returns the time in nanoseconds elapsed from the input {@link GnssTime}. */
  public long computeElapsedNanosFrom(GnssTime otherGnssTime) {
    return getNanosSinceGpsEpoch() - otherGnssTime.getNanosSinceGpsEpoch();
  }

  /**
   * Returns nanoseconds since GPS epoch.
   *
   * <p>Note: Using the primitive type long to represent nanoseconds since GPS epoch will cause
   * overflow after the year 2271, hence this method should be deprecated by then.
   */
  public final long getNanosSinceGpsEpoch() {
    return gpsWeek * TimeConstants.NANOS_PER_WEEK + gpsTowPicos / TimeConstants.PICOS_PER_NANO;
  }

  /**
   * Returns nanoseconds since UTC epoch.
   *
   * <p>Note: Using the primitive type long to represent nanoseconds since UTC epoch will cause
   * overflow after the year 2262, hence this method should be deprecated by then.
   */
  public long getNanosSinceUtcEpoch() {
    return getNanosSinceGpsEpoch()
        + TimeConstants.GPS_UTC_EPOCHS_OFFSET_MILLIS * TimeConstants.NANOS_PER_MILLI;
  }

  /** Returns the number of week since GPS epoch. */
  public int getGpsWeek() {
    return gpsWeek;
  }

  /** Returns the GPS time of week (picoseconds). */
  public long getGpsTowPicos() {
    return gpsTowPicos;
  }

  @Override
  public int compareTo(GnssTime other) {
    return ComparisonChain.start()
        .compare(this.gpsWeek, other.gpsWeek)
        .compare(this.gpsTowPicos, other.gpsTowPicos)
        .result();
  }

  @Override
  public boolean equals(Object other) {
    if (!(other instanceof GnssTime)) {
      return false;
    }
    GnssTime time = (GnssTime) other;
    return this.gpsWeek == time.gpsWeek && this.gpsTowPicos == time.gpsTowPicos;
  }

  @Override
  public int hashCode() {
    return Objects.hash(gpsWeek, gpsTowPicos);
  }

  /** Converts GPS time to {@link DateTimePicos} format. */
  private DateTimePicos toGpsDateTimePicos() {
    DateTime gpsDateTime =
        new DateTime(
            getNanosSinceGpsEpoch() / TimeConstants.NANOS_PER_MILLI
                + TimeConstants.GPS_UTC_EPOCHS_OFFSET_MILLIS,
            DateTimeZone.UTC);
    return DateTimePicos.fromDateTimeAndSubMillis(
        gpsDateTime, gpsTowPicos % TimeConstants.PICOS_PER_MILLI);
  }
}
