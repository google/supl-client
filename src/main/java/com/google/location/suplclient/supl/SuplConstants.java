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

import com.google.common.collect.ImmutableSet;

/** A container for all constants related to SUPL */
public class SuplConstants {

  /** A container for constants defined in the Userplane Location Protocol (ULP) v2.1 protocol */
  static class UlpConstants {
    // Scale factors used for conversion from latitude and longitude in SUPL protocol format
    // to decimal format
    static final double POSITION_ESTIMATE_LAT_SCALE_FACTOR = 90.0 / 8388608.0;
    static final double POSITION_ESTIMATE_LNG_SCALE_FACTOR = 180.0 / 8388608.0;

    // Supl GANSS IDs for GAL GLO constellations
    static final int ULP_GANSS_ID_GAL = 0;
    static final int ULP_GANSS_ID_GLO = 4;
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

  /** A container for constants that are commonly used by all GNSS constellations */
  static class GnssConstants {
    /** The number of meters in one kilometer */
    public static final int METERS_PER_KM = 1000;
  }

  /**
   * A container for all scale factors used in GNSS binary navigation message decoding, and SUPL
   * message decoding
   */
  static class ScaleFactors {
    // Details of the following constants can be found in hte IS-GPS-200F which can be found at:
    // http://www.navcen.uscg.gov/pdf/is-gps-200f.pdf.
    public static final double GPS_NAV_TGD = Math.pow(2, -31);
    public static final double GPS_NAV_TOC = Math.pow(2, 4);
    public static final double GPS_NAV_AF2 = Math.pow(2, -55);
    public static final double GPS_NAV_AF1 = Math.pow(2, -43);
    public static final double GPS_NAV_AF0 = Math.pow(2, -31);
    public static final double GPS_NAV_CRS = Math.pow(2, -5);
    public static final double GPS_NAV_DELTA_N = Math.scalb(Math.PI, -43);
    public static final double GPS_NAV_M0 = Math.scalb(Math.PI, -31);
    public static final double GPS_NAV_CUC = Math.pow(2, -29);
    public static final double GPS_NAV_E = Math.pow(2, -33);
    public static final double GPS_NAV_CUS = Math.pow(2, -29);
    public static final double GPS_NAV_A_POWER_HALF = Math.pow(2, -19);
    public static final double GPS_NAV_TOE = Math.pow(2, 4);
    public static final double GPS_NAV_CIC = Math.pow(2, -29);
    public static final double GPS_NAV_OMEGA0 = Math.scalb(Math.PI, -31);
    public static final double GPS_NAV_CIS = Math.pow(2, -29);
    public static final double GPS_NAV_I0 = Math.scalb(Math.PI, -31);
    public static final double GPS_NAV_CRC = Math.pow(2, -5);
    public static final double GPS_NAV_W = Math.scalb(Math.PI, -31);
    public static final double GPS_NAV_OMEGA_A_DOT = Math.scalb(Math.PI, -43);
    public static final double GPS_NAV_I_DOT = Math.scalb(Math.PI, -43);
    public static final double IONO_ALFA_0 = Math.pow(2, -30);
    public static final double IONO_ALFA_1 = Math.pow(2, -27);
    public static final double IONO_ALFA_2 = Math.pow(2, -24);
    public static final double IONO_ALFA_3 = Math.pow(2, -24);
    public static final double IONO_BETA_0 = Math.pow(2, 11);
    public static final double IONO_BETA_1 = Math.pow(2, 14);
    public static final double IONO_BETA_2 = Math.pow(2, 16);
    public static final double IONO_BETA_3 = Math.pow(2, 16);

    // Details of the following constants can be found in the GLONASS_ICD_5_1_EN protocol:
    // http://gauss.gge.unb.ca/GLONASS.ICD.pdf.
    public static final double GLO_CLK_TAU = Math.pow(2, -30);
    public static final double GLO_CLK_GAMMA = Math.pow(2, -40);
    public static final double GLO_ORB_POS_KM = Math.pow(2, -11);
    public static final double GLO_ORB_VEL_KMPS = Math.pow(2, -20);
    public static final double GLO_ORB_ACCELERATION_KMPS2 = Math.pow(2, -30);
    // Details of the following constants can be found in the Galileo ICD issue 1.3, 2016:
    // https://www.gsc-europa.eu/system/files/galileo_documents/Galileo-OS-SIS-ICD.pdf
    public static final double GAL_NAV_TOE = 60;
    public static final double GAL_NAV_W = Math.scalb(Math.PI, -31);
    public static final double GAL_NAV_DELTA_N = Math.scalb(Math.PI, -43);
    public static final double GAL_NAV_M0 = Math.scalb(Math.PI, -31);
    public static final double GAL_NAV_OMEGA_DOT = Math.scalb(Math.PI, -43);
    public static final double GAL_NAV_E = Math.pow(2, -33);
    public static final double GAL_NAV_I_DOT = Math.scalb(Math.PI, -43);
    public static final double GAL_NAV_SQRT_A = Math.pow(2, -19);
    public static final double GAL_NAV_I0 = Math.scalb(Math.PI, -31);
    public static final double GAL_NAV_OMEGA0 = Math.scalb(Math.PI, -31);
    public static final double GAL_NAV_CRS = Math.pow(2, -5);
    public static final double GAL_NAV_CIS = Math.pow(2, -29);
    public static final double GAL_NAV_CUS = Math.pow(2, -29);
    public static final double GAL_NAV_CRC = Math.pow(2, -5);
    public static final double GAL_NAV_CIC = Math.pow(2, -29);
    public static final double GAL_NAV_CUC = Math.pow(2, -29);
    public static final double GAL_CLK_AF0 = Math.pow(2, -34);
    public static final double GAL_CLK_AF1 = Math.pow(2, -46);
    public static final double GAL_CLK_AF2 = Math.pow(2, -59);
    public static final double GAL_CLK_TGD = Math.pow(2, -32);
    public static final double GAL_CLK_TOC = 60;
  }
}
