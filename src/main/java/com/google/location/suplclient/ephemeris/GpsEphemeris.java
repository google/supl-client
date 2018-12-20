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

/** A container for fields in GPS ephemeris */
public class GpsEphemeris extends KeplerianEphemeris {

  /** Satellite user range accuracy (meters) */
  public final double accuracyM;

  /** The group delay term (seconds) */
  public final double tgdS;

  /** The flag of the fit interval of the ephemeris: 0=4 hours, 1=more than 4 hours. */
  public final boolean fitIntvFlag;

  /** True if the GPS navigation data was commanded OFF on the P-code of the L2 channel */
  public final boolean l2PDataFlag;

  /** Codes on L2 channel: 1=P code ON, 2=C/A code ON, 0=Reserved. */
  public final int codeL2;

  /** Issue of data, clock */
  public final int iodc;

  private GpsEphemeris(Builder builder) {
    super(builder);
    accuracyM = builder.accuracyM;
    tgdS = builder.tgdS;
    fitIntvFlag = builder.fitIntvFlag;
    l2PDataFlag = builder.l2PDataFlag;
    codeL2 = builder.codeL2;
    iodc = builder.iodc;
  }

  /** Creates a builder with no fields set. */
  public static Builder newBuilder() {
    return new Builder();
  }

  /** Builder for {@link GpsEphemeris} */
  public static class Builder extends KeplerianEphemeris.Builder<Builder> {

    // For documentation, see corresponding fields in {@link GpsEphemeris}.
    private double accuracyM;
    private double tgdS;
    private boolean fitIntvFlag;
    private boolean l2PDataFlag;
    private int codeL2;
    private int iodc;

    private Builder() {}

    @Override
    public Builder getThis() {
      return this;
    }

    /** Sets the satellite user range accuracy (meters). */
    public Builder setAccuracyM(double accuracyM) {
      this.accuracyM = accuracyM;
      return getThis();
    }

    /** Sets the group delay term (seconds). */
    public Builder setTgdS(double tgdS) {
      this.tgdS = tgdS;
      return getThis();
    }

    /** Sets the flag of the fit interval of the ephemeris: 0=4 hours, 1=more than 4 hours. */
    public Builder setFitIntvFlag(boolean fitIntvFlag) {
      this.fitIntvFlag = fitIntvFlag;
      return getThis();
    }

    /** Sets the flag of L2 P data. */
    public Builder setL2PDataFlag(boolean l2PDataFlag) {
      this.l2PDataFlag = l2PDataFlag;
      return getThis();
    }

    /** Sets the flag of codes on L2 channel. */
    public Builder setCodeL2(int codeL2) {
      this.codeL2 = codeL2;
      return getThis();
    }

    /** Sets the issue of data, clock. */
    public Builder setIodc(int iodc) {
      this.iodc = iodc;
      return getThis();
    }

    /** Builds a {@link GpsEphemeris} object as specified by this builder. */
    public GpsEphemeris build() {
      return new GpsEphemeris(this);
    }
  }
}
