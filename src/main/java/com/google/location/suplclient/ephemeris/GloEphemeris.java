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

import org.joda.time.DateTime;

/** A container for fields in Glonass ephemeris */
public class GloEphemeris extends GnssEphemeris {

  /**
   * UTC epoch of ephemeris
   *
   * <p>An ephemeris of GLONASS is valid within -15 to 15 minutes with respect to this time of
   * ephemeris, according to GLONASS ICD v5.0 A.3.1.1.
   */
  public final DateTime utcTime;

  /** Satellite position X (meters) */
  public final double xSatPosM;

  /** Satellite position Y (meters) */
  public final double ySatPosM;

  /** Satellite position Z (meters) */
  public final double zSatPosM;

  /** Satellite velocity X dot (meters per sec) */
  public final double xSatVelMps;

  /** Satellite velocity Y dot (meters per sec) */
  public final double ySatVelMps;

  /** Satellite velocity Z dot (meters per sec) */
  public final double zSatVelMps;

  /**
   * Satellite acceleration X (meters per sec square) caused by the effect of the sun and the moon
   */
  public final double xMoonSunAccMps2;

  /**
   * Satellite acceleration Y (meters per sec square) caused by the effect of the sun and the moon
   */
  public final double yMoonSunAccMps2;

  /**
   * Satellite acceleration Z (meters per sec square) caused by the effect of the sun and the moon
   */
  public final double zMoonSunAccMps2;

  /** Satellite clock bias (sec) (TauN) */
  public final double biasS;

  /** Satellite relative frequency bias (GammaN) */
  public final double relFreqBias;

  /** Message frame time (seconds of day) (tk) */
  public final double frameTimeSecOfDay;

  /** State of satellite health (0=healthy, 1=unhealthy) (Bn) */
  public final int health;

  /** Frequency number (-7 ... +13) */
  public final int freqNum;

  /** Age of operation information (days) (E) */
  public final int ageDays;

  private GloEphemeris(Builder builder) {
    super(builder);
    utcTime = builder.utcTime;
    xSatPosM = builder.xSatPosM;
    ySatPosM = builder.ySatPosM;
    zSatPosM = builder.zSatPosM;
    xSatVelMps = builder.xSatVelMps;
    ySatVelMps = builder.ySatVelMps;
    zSatVelMps = builder.zSatVelMps;
    xMoonSunAccMps2 = builder.xMoonSunAccMps2;
    yMoonSunAccMps2 = builder.yMoonSunAccMps2;
    zMoonSunAccMps2 = builder.zMoonSunAccMps2;
    biasS = builder.biasS;
    relFreqBias = builder.relFreqBias;
    frameTimeSecOfDay = builder.frameTime;
    health = builder.health;
    freqNum = builder.freqNum;
    ageDays = builder.ageDays;
  }

  /** Creates a builder with no fields set. */
  public static Builder newBuilder() {
    return new Builder();
  }

  /** Builder for {@link GloEphemeris} */
  public static class Builder extends GnssEphemeris.Builder<Builder> {

    // For documentation of these fields, see corresponding fields in {@link GloEphemeris}.
    private DateTime utcTime;
    private double xSatPosM;
    private double ySatPosM;
    private double zSatPosM;
    private double xSatVelMps;
    private double ySatVelMps;
    private double zSatVelMps;
    private double xMoonSunAccMps2;
    private double yMoonSunAccMps2;
    private double zMoonSunAccMps2;
    private double biasS;
    private double relFreqBias;
    private double frameTime;
    private int health;
    private int freqNum;
    private int ageDays;

    private Builder() {}

    @Override
    public Builder getThis() {
      return this;
    }

    /** Sets the UTC time of ephemeris. */
    public Builder setUtcTime(DateTime utcTime) {
      this.utcTime = utcTime;
      return getThis();
    }

    /** Sets the satellite position X (meters). */
    public Builder setXSatPosM(double xSatPosM) {
      this.xSatPosM = xSatPosM;
      return getThis();
    }

    /** Sets the satellite position Y (meters). */
    public Builder setYSatPosM(double ySatPosM) {
      this.ySatPosM = ySatPosM;
      return getThis();
    }

    /** Sets the satellite position Z (meters). */
    public Builder setZSatPosM(double zSatPosM) {
      this.zSatPosM = zSatPosM;
      return getThis();
    }

    /** Sets the satellite velocity X (meters per second). */
    public Builder setXSatVelMps(double xSatVelMps) {
      this.xSatVelMps = xSatVelMps;
      return getThis();
    }

    /** Sets the satellite velocity Y (meters per second). */
    public Builder setYSatVelMps(double ySatVelMps) {
      this.ySatVelMps = ySatVelMps;
      return getThis();
    }

    /** Sets the satellite velocity Z (meters per second). */
    public Builder setZSatVelMps(double zSatVelMps) {
      this.zSatVelMps = zSatVelMps;
      return getThis();
    }

    /** Sets the satellite acceleration X (meters per sec square). */
    public Builder setXMoonSunAccMps2(double xMoonSunAccMps2) {
      this.xMoonSunAccMps2 = xMoonSunAccMps2;
      return getThis();
    }

    /** Sets the satellite acceleration Y (meters per sec square). */
    public Builder setYMoonSunAccMps2(double yMoonSunAccMps2) {
      this.yMoonSunAccMps2 = yMoonSunAccMps2;
      return getThis();
    }

    /** Sets the satellite acceleration Z (meters per sec square). */
    public Builder setZMoonSunAccMps2(double zMoonSunAccMps2) {
      this.zMoonSunAccMps2 = zMoonSunAccMps2;
      return getThis();
    }

    /** Sets the satellite clock bias (meters). */
    public Builder setBiasS(double biasS) {
      this.biasS = biasS;
      return getThis();
    }

    /** Sets the satellite relative frequency bias. */
    public Builder setRelFreqBias(double relFreqBias) {
      this.relFreqBias = relFreqBias;
      return getThis();
    }

    /** Sets the message frame time (seconds of day). */
    public Builder setFrameTime(double frameTime) {
      this.frameTime = frameTime;
      return getThis();
    }

    /** Sets the satellite health (0=healthy, 1=unhealthy). */
    public Builder setHealth(int health) {
      this.health = health;
      return getThis();
    }

    /** Sets frequency number (-7 ... +13). */
    public Builder setFreqNum(int freqNum) {
      this.freqNum = freqNum;
      return getThis();
    }

    /** Sets the age of operation information (days). */
    public Builder setAgeDays(int ageDays) {
      this.ageDays = ageDays;
      return getThis();
    }

    /** Builds a {@link GloEphemeris} object as specified by this builder. */
    public GloEphemeris build() {
      return new GloEphemeris(this);
    }
  }
}
