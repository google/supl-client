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

/** A class representing the ephemeris of any GNSS satellite */
public abstract class GnssEphemeris {

  /** The satellite (or space vehicle, SV) ID associated with this ephemeris */
  public final int svid;

  protected GnssEphemeris(Builder<?> builder) {
    svid = builder.svid;
  }

  /** Builder for {@link GnssEphemeris} */
  public abstract static class Builder<T extends Builder<T>> {

    private int svid;

    public Builder() {}

    public abstract T getThis();

    /** Sets the {@link #svid}. */
    public T setSvid(int svid) {
      this.svid = svid;
      return getThis();
    }
  }
}
