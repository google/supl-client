package com.google.location.lbs.gnss.gps.pseudorange.ephemeris;

import com.google.location.lbs.common.gnss.GnssTime;
import com.google.location.lbs.common.gnss.TimeConstants;
import com.google.location.lbs.gnss.gps.pseudorange.Constants.GnssConstants;

/**
 * A container for common fields of GNSS constellations with Keplerian models such as GPS, GAL, BDS,
 * and QZS
 */
public abstract class KeplerianEphemeris extends GnssEphemeris {

  /** Week number with respect to the epoch */
  public final int week;

  /** Time of clock (Toc), in time of week (seconds) */
  public final double tocS;

  /** Health status of the satellite */
  public final int health;

  /** Transmission time of message (seconds) */
  public final double ttxS;

  /** Issue of data, ephemeris */
  public final int iode;

  /** An instance of {@link KeplerianModel} containing fields related to orbit computation */
  public final KeplerianModel keplerModel;

  /** The satellite clock bias correction coefficient (seconds) */
  public final double af0S;

  /** The satellite clock drift correction coefficient (sec/sec) */
  public final double af1SecPerSec;

  /** The satellite clock drift rate correction coefficient (sec/sec^2) */
  public final double af2SecPerSec2;

  protected KeplerianEphemeris(Builder<?> builder) {
    super(builder);
    week = builder.week;
    tocS = builder.tocS;
    ttxS = builder.ttxS;
    af0S = builder.af0S;
    iode = builder.iode;
    af1SecPerSec = builder.af1SecPerSec;
    af2SecPerSec2 = builder.af2SecPerSec2;
    keplerModel = builder.keplerModel;
    // if the satellite is found to be a Geo satellite, then set unhealthy
    // TODO(gomo): re-enable Geostationary satellites after finding why they cause blowouts to WLS
    if (isGeoSat()) {
      health = 1; // set unhealthy
    } else {
      health = builder.health;
    }
  }

  /** Returns a {@link GnssTime} indicating the time of clock in this ephemeris. */
  public abstract GnssTime getTocInGnssTime();

  /** Returns a {@link GnssTime} indicating the time of ephemeris. */
  public abstract GnssTime getToeInGnssTime();

  @Override
  public double computeElapsedSecondsFromToe(GnssTime gnssTimeOfInterest) {
    return gnssTimeOfInterest.computeElapsedNanosFrom(getToeInGnssTime())
        * TimeConstants.SECONDS_PER_NANO;
  }

  /**
   * Returns the group delay (seconds).
   *
   * <p>TODO(guoyuf): returns the group delay according to the input carrier frequency
   */
  public abstract double getGroupDelayS(double carrierFreqHz);

  /** Builder for {@link KeplerianEphemeris} */
  public abstract static class Builder<T extends Builder<T>> extends GnssEphemeris.Builder<T> {

    // For documentation, see corresponding fields in {@link KeplerianEphemeris}.
    private int week;
    private double tocS;
    private int health;
    private double ttxS;
    private double af0S;
    private int iode;
    private double af1SecPerSec;
    private double af2SecPerSec2;
    private KeplerianModel keplerModel;

    protected Builder() {}

    @Override
    public abstract T getThis();

    /** Sets the time of clock (Toc), in time of week (seconds). */
    public T setTocS(double tocS) {
      this.tocS = tocS;
      return getThis();
    }

    /** Sets the health status of the satellite. */
    public T setHealth(int health) {
      this.health = health;
      return getThis();
    }

    /** Sets issue of data, ephemeris. */
    public T setIode(int iode) {
      this.iode = iode;
      return getThis();
    }

    /** Sets the satellite clock bias correction coefficient (seconds). */
    public T setAf0S(double af0S) {
      this.af0S = af0S;
      return getThis();
    }

    /** Sets the satellite clock drift correction coefficient (sec/sec). */
    public T setAf1SecPerSec(double af1SecPerSec) {
      this.af1SecPerSec = af1SecPerSec;
      return getThis();
    }

    /** Sets the satellite clock drift rate correction coefficient (sec/sec^2). */
    public T setAf2SecPerSec2(double af2SecPerSec2) {
      this.af2SecPerSec2 = af2SecPerSec2;
      return getThis();
    }

    /**
     * Sets the week number with respect to the epoch of one of GPS, GAL, BDS, and QZS
     * constellations.
     */
    public T setWeek(int week) {
      this.week = week;
      return getThis();
    }

    /** Sets the transmission time of message (seconds). */
    public T setTtxS(double ttxS) {
      this.ttxS = ttxS;
      return getThis();
    }

    /**
     * Sets the instance of {@link KeplerianModel} containing fields related to orbit computation.
     */
    public T setKeplerianModel(KeplerianModel keplerModel) {
      this.keplerModel = keplerModel;
      return getThis();
    }
  }

  /**
   * Returns true if this ephemeris belongs to a Geostationary satellite.
   *
   * <p>Geo satellites have a Semi Major Axis of {@link GnssConstants#GEO_SAT_SEMI_MAJOR_AXIS_KM},
   * they are inclined below {@link GnssConstants#INCLINATION_THRESHOLD_DEGREES} and have
   * eccentricity below {@link GnssConstants.GEO_SAT_ECC_THRESHOLD}.
   */
  public boolean isGeoSat() {
    double aKilometers = (keplerModel.sqrtA * keplerModel.sqrtA) / 1000.0; // semi major axis
    boolean withinGeoSatSemiMajorAxis =
        Math.abs(aKilometers - GnssConstants.GEO_SAT_SEMI_MAJOR_AXIS_KM)
            <= GnssConstants.GEO_SAT_SEMI_MAJOR_AXIS_MARGIN_KM;
    boolean withinGeoSatInclination =
        Math.abs(Math.toDegrees(keplerModel.i0)) <= GnssConstants.INCLINATION_THRESHOLD_DEGREES;
    return withinGeoSatSemiMajorAxis
        && withinGeoSatInclination
        && keplerModel.eccentricity < GnssConstants.GEO_SAT_ECC_THRESHOLD;
  }
}
