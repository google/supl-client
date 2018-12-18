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

package com.google.location.lbs.gnss.suplclient;

import com.google.common.collect.ImmutableSet;

/** A container for all constants related to SUPL */
public class SuplConstants {

  /** A container for constants defined in the Userplane Location Protocol (ULP) v2.1 protocol */
  static class UlpConstants {
    // Scale factors used for conversion from latitude and longitude in SUPL protocol format
    // to decimal format
    static final double POSITION_ESTIMATE_LAT_SCALE_FACTOR = 90.0 / 8388608.0;
    static final double POSITION_ESTIMATE_LNG_SCALE_FACTOR = 180.0 / 8388608.0;

    // Supl GANSS IDs for all non-GPS constellations
    static final int ULP_GANSS_ID_GAL = 0;
    static final int ULP_GANSS_ID_SBAS = 1;
    static final int ULP_GANSS_ID_MODERNIZED_GPS = 2;
    static final int ULP_GANSS_ID_QZS = 3;
    static final int ULP_GANSS_ID_GLO = 4;
    static final int ULP_GANSS_ID_BDS = 5;
  }

  /** A container for constants defined in the RRLP v14 protocol (3GPP TS 44.031) */
  static class RrlpConstants {
    // Rrlp GNSS IDs for all constellations.
    // Absence of GANSS ID field indicates Galileo.
    static final int RRLP_GANSS_ID_SBAS = 0;
    static final int RRLP_GANSS_ID_MODERNIZED_GPS = 1;
    static final int RRLP_GANSS_ID_QZS = 2;
    static final int RRLP_GANSS_ID_GLO = 3;
    static final int RRLP_GANSS_ID_BDS = 4;
    static final int RRLP_GANSS_TIME_ID_GPS = 0;
    static final int RRLP_GANSS_TIME_ID_QZS = 1;
    static final int RRLP_GANSS_TIME_ID_GLO = 2;
    static final int RRLP_GANSS_TIME_ID_BDS = 3;
    static final int RRLP_GLO_IOD_SCALE_FACTOR = 15;
    static final double RRLP_GPS_TOW_23B_SCALE_FACTOR_SEC = 0.08;
  }

  /** A container for constants defined in the LPP v14.4.0 protocol (3GPP TS 36.355) */
  static class LppConstants {
    static final int LPP_GLO_IOD_SCALE_FACTOR = 15;
  }

  /** A container for Google SUPL server related constants */
  static class SuplServerConstants {
    static final ImmutableSet<Integer> SSL_PORTS =
        ImmutableSet.of(7275 /* SSL_PROD_PORT */, 7279 /* SSL_DEV_PORT */);
    static final ImmutableSet<Integer> NON_SSL_PORTS =
        ImmutableSet.of(7276 /* NON_SSL_PROD_PORT */, 7280 /* NON_SSL_DEV_PORT */);
  }
}
