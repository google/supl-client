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

/** A container for fields in Galileo ephemeris */
public class GalEphemeris extends KeplerianEphemeris {

  /** Signal in space accuracy (meters) */
  public final double sisaM;

  /** The group delay term (seconds) */
  public final double tgdS;

  /** True if the ephemeris is for an INAV message, or false if it is for an FNAV message */
  public final boolean isINav;

  private GalEphemeris(Builder builder) {
    super(builder);
    sisaM = builder.sisaM;
    tgdS = builder.tgdS;
    isINav = builder.isINav;
  }

  /** Creates a builder with no fields set. */
  public static Builder newBuilder() {
    return new Builder();
  }

  /** Builder for {@link GalEphemeris} */
  public static class Builder extends KeplerianEphemeris.Builder<Builder> {
    /** For documentation, see corresponding fields in {@link GalEphemeris}. */
    private double sisaM;
    private double tgdS;
    private boolean isINav;

    private Builder() {}

    @Override
    public Builder getThis() {
      return this;
    }

    /** Sets the signal in space accuracy (meters). */
    public Builder setSisaM(double sisaM) {
      this.sisaM = sisaM;
      return getThis();
    }

    /** Sets the group delay term (seconds). */
    public Builder setTgdS(double tgdS) {
      this.tgdS = tgdS;
      return getThis();
    }

    /**
     * Sets {@link GalEphemeris#isINav} to true if the ephemeris is for INAV, or false if it is for
     * FNAV.
     */
    public Builder setIsINav(boolean isINav) {
      this.isINav = isINav;
      return getThis();
    }

    /** Builds a {@link GalEphemeris} object as specified by this builder. */
    public GalEphemeris build() {
      return new GalEphemeris(this);
    }
  }
}
