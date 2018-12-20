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

package com.google.location.suplclient.ephemeris;

/** A container for fields related to the Keplerian model used for satellite orbit computation */
public class KeplerianModel {

  /** Time of ephemeris (Toe), in time of week (seconds) */
  public final double toeS;

  /** Mean motion difference from computed value (radians/sec) */
  public final double deltaN;

  /** Mean anomaly at reference time (radians) */
  public final double m0;

  /** Eccentricity (dimensionless) */
  public final double eccentricity;

  /** Square root of semi-major axis (meters^1/2) */
  public final double sqrtA;

  /** Rate of right ascension (radians/sec) */
  public final double omegaDot;

  /** Argument of perigee (radians) */
  public final double omega;

  /** Longitude of ascending node at weekly epoch (radians) */
  public final double omega0;

  /** Rate of inclination angle (radians/sec) */
  public final double iDot;

  /** Inclination angle at reference time (radians) */
  public final double i0;

  /** Amplitude of cosine harmonic correction term to angle of inclination */
  public final double cic;

  /** Amplitude of sine harmonic correction term to angle of inclination */
  public final double cis;

  /** Amplitude of cosine harmonic correction term to the orbit radius */
  public final double crc;

  /** Amplitude of sine harmonic correction term to the orbit radius */
  public final double crs;

  /** Amplitude of cosine harmonic correction term to the argument of latitude */
  public final double cuc;

  /** Amplitude of sine harmonic correction term to the argument of latitude */
  public final double cus;

  public KeplerianModel(Builder builder) {
    toeS = builder.toeS;
    deltaN = builder.deltaN;
    m0 = builder.m0;
    eccentricity = builder.eccentricity;
    sqrtA = builder.sqrtA;
    omegaDot = builder.omegaDot;
    omega = builder.omega;
    iDot = builder.iDot;
    i0 = builder.i0;
    omega0 = builder.omega0;
    cic = builder.cic;
    cis = builder.cis;
    crc = builder.crc;
    crs = builder.crs;
    cuc = builder.cuc;
    cus = builder.cus;
  }

  /** Creates a builder with no fields set. */
  public static Builder newBuilder() {
    return new Builder();
  }

  /** Builder for {@link KeplerianModel} */
  public static class Builder {

    // For documentation, see corresponding fields in {@link KeplerianModel}.
    private double toeS;
    private double deltaN;
    private double m0;
    private double eccentricity;
    private double sqrtA;
    private double omegaDot;
    private double omega;
    private double iDot;
    private double i0;
    private double omega0;
    private double cic;
    private double cis;
    private double crc;
    private double crs;
    private double cuc;
    private double cus;

    private Builder() {}

    /** Sets the time of ephemeris (Toe), in time of week (seconds). */
    public Builder setToeS(double toeS) {
      this.toeS = toeS;
      return this;
    }

    /** Sets the mean motion difference from computed value (rad/sec). */
    public Builder setDeltaN(double deltaN) {
      this.deltaN = deltaN;
      return this;
    }

    /** Sets the mean anomaly at reference time (radians). */
    public Builder setM0(double m0) {
      this.m0 = m0;
      return this;
    }

    /** Sets the eccentricity (dimensionless). */
    public Builder setEccentricity(double eccentricity) {
      this.eccentricity = eccentricity;
      return this;
    }

    /** Sets the square root of semi-major axis (meters^1/2). */
    public Builder setSqrtA(double sqrtA) {
      this.sqrtA = sqrtA;
      return this;
    }

    /** Sets the rate of right ascension (rad/sec). */
    public Builder setOmegaDot(double omegaDot) {
      this.omegaDot = omegaDot;
      return this;
    }

    /** Sets argument of perigee (radians). */
    public Builder setOmega(double omega) {
      this.omega = omega;
      return this;
    }

    /** Sets the rate of inclination angle (rad/sec). */
    public Builder setIDot(double iDot) {
      this.iDot = iDot;
      return this;
    }

    /** Sets the inclination angle at reference time (radians). */
    public Builder setI0(double i0) {
      this.i0 = i0;
      return this;
    }

    /** Sets the longitude of ascending node at weekly epoch (radians). */
    public Builder setOmega0(double omega0) {
      this.omega0 = omega0;
      return this;
    }

    /** Sets the amplitude of cosine harmonic correction term to angle of inclination. */
    public Builder setCic(double cic) {
      this.cic = cic;
      return this;
    }

    /** Sets the amplitude of sine harmonic correction term to angle of inclination. */
    public Builder setCis(double cis) {
      this.cis = cis;
      return this;
    }

    /** Sets the amplitude of cosine harmonic correction term to the orbit radius. */
    public Builder setCrc(double crc) {
      this.crc = crc;
      return this;
    }

    /** Sets the amplitude of sine harmonic correction term to the orbit radius. */
    public Builder setCrs(double crs) {
      this.crs = crs;
      return this;
    }

    /** Sets the amplitude of cosine harmonic correction term to the argument of latitude. */
    public Builder setCuc(double cuc) {
      this.cuc = cuc;
      return this;
    }

    /** Sets the amplitude of sine harmonic correction term to the argument of latitude. */
    public Builder setCus(double cus) {
      this.cus = cus;
      return this;
    }

    /** Builds a {@link KeplerianModel} object as specified by this builder. */
    public KeplerianModel build() {
      return new KeplerianModel(this);
    }
  }
}
