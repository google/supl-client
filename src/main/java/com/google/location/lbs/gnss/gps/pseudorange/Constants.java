package com.google.location.lbs.gnss.gps.pseudorange;

import com.google.common.collect.ImmutableSet;
import java.util.concurrent.TimeUnit;

/** A container for constants related to GNSS computations */
public class Constants {

  /** A container for constants that are commonly used by all GNSS constellations */
  public static class GnssConstants {
    /** The number of meters in one kilometer */
    public static final int METERS_PER_KM = 1000;
    /** The speed of light in vacuum, in meters per second */
    public static final double SPEED_OF_LIGHT_MPS = 299792458.0;
    /** The speed of light in vacuum, in meters per nanosecond */
    public static final double SPEED_OF_LIGHT_MPNS = SPEED_OF_LIGHT_MPS * 1E-9;
    /** The value of Earth universal gravitational parameter */
    public static final double EARTH_UNIVERSAL_GRAVITATIONAL_CONSTANT_M3_SM2 = 3.986005e14;
    /**
     * A constant to scale the computation of the satellite clock delay due to relativistic effect
     */
    public static final double RELATIVISTIC_CONSTANT_F = -4.442807633e-10;
    /** The self-spinning speed of the Earth (radians per second) */
    public static final double EARTH_ROTATION_RATE_RAD_PER_SEC = 7.2921151467e-5;
    /** Equatorial radius of the Earth (meters) */
    public static final double EARTH_EQUATORIAL_RADIUS = 6378.136E3;
    /** The minimum carrier-to-noise density ratio for a GNSS satellite measurement to be used */
    public static final double CN0_THRESHOLD_DB_HZ = 20.0;
    /**
     * The maximum uncertainty (nanoseconds) of the received SV time for a GNSS satellite
     * measurement to be used.
     *
     * <p>An uncertainty of 1000 nanoseconds is equivalent to around 300 meters.
     */
    public static final int MAXIMUM_RECEIVED_SV_TIME_UNCERTAINTY_NANOS = 1000;

    /**
     * Semi Major Axis threshold of a GEO satellite
     *
     * <p>Geo satellites have a semi major axis of 42164Km plus a margin of 1000Km is used.
     */
    public static final int GEO_SAT_SEMI_MAJOR_AXIS_KM = 42164;

    /** Margin around the GEO sat Semi Major Axis in Kilometers */
    public static final int GEO_SAT_SEMI_MAJOR_AXIS_MARGIN_KM = 1000;

    /**
     * Inclination below which a sat is considered to be Geo sat.
     *
     * <p>>Beidou Geo sats are reported with inclination of more than 10 degrees and that seems to
     * be wrong. Hence, 20 degress is used here to allow margin
     */
    public static final int INCLINATION_THRESHOLD_DEGREES = 20;

    /** Uncertainty threshold in nanos above which the reported full bias is considered invalid. */
    public static final double BIAS_UNCERTAINTY_THRESHOLD_NANOS = 2e6;

    /** Eccentricity threshold below which a satelite is considered Geostationary */
    public static final double GEO_SAT_ECC_THRESHOLD = 0.1;

    /** Elevation below which a satellite is considered not useful */
    public static final double SAT_ELEVATION_THRESHOLD_DEGREES = 5.0;

    /** Position uncertainty in meters below which low elevation satellites will be removed */
    public static final double POS_UNC_THRESHOLD_TO_REMOVE_SATS_METERS = 500;

    /** Maximum size of the pseudorange smoothing window */
    public static final int MAX_SMOOTHING_WINDOW_SIZE = 100;

    /** Minimum size of the pseudorange smoothing window */
    public static final int MIN_SMOOTHING_WINDOW_SIZE = 2;

    /** Maximum time interval between two samples to pseudorange smooth with the previous value */
    public static final double DELTA_TIME_FOR_SMOOTHING_NS = 1.1e9;

    /** Satellite ephemeris accuracy in meters below which a sat is considered unhealthy */
    public static final double SV_ACCURACY_THRESHOLD_M = 8;
  }

  /** A container for constants related to GPS */
  public static class GpsConstants {
    /**
     * GPS Week Number is a ten-bit count in the range 0-1023, repeating (cycle) every 1024 weeks or
     * 7168 days.
     */
    public static final long GPS_CYCLE_MS = TimeUnit.DAYS.toMillis(7168);
    /** The number of weeks in a GPS cycle. */
    public static final int GPS_CYCLE_WEEKS = 1024;
    /**
     * 3657 is the number of days between the unix epoch and GPS epoch as the GPS epoch started on
     * Jan 6, 1980
     */
    public static final long DELTA_GPS_UNIX_EPOCH_MS = TimeUnit.DAYS.toMillis(3657);
    /** Center frequency of the L1 band in Hz. */
    public static final double L1_FREQ_HZ = 10.23 * 1e6 * 154;
    /** Center frequency of the L2 band in Hz. */
    public static final double L2_FREQ_HZ = 10.23 * 1e6 * 120;
    /** Center frequency of the L5 band in Hz. */
    public static final double L5_FREQ_HZ = 10.23 * 1e6 * 115;
    /** GPS C/A code chip width Tc = 1.023^-1 microseconds */
    public static final double GPS_CHIP_WIDTH_T_C_SEC = 0.97751710654e-6;
    /** Narrow correlator with spacing d = 0.1 chip */
    public static final double GPS_CORRELATOR_SPACING_IN_CHIPS = 0.1;
    /** Averaging time of DLL correlator T */
    public static final double GPS_DLL_AVERAGING_TIME_SEC = 20.0e-3;
    /** Maximum possible number of GPS satellites */
    public static final int MAX_NUMBER_OF_GPS_SATELLITES = 32;
    /** The validity (seconds) of a GPS ephemeris (4 hours, or +- 2 hours) */
    public static final int GPS_EPH_VALID_PERIOD_SECONDS = 4 * 60 * 60;
  }

  /**
   * A container for constants related to GLONASS
   *
   * <p>Details of the following constants can be found in the GLONASS-ICD-5.1:
   * http://gauss.gge.unb.ca/GLONASS.ICD.pdf
   */
  public static class GloConstants {
    /** The time difference in seconds between GLONASS and UTC times (3 hours) */
    public static final int DELTA_GLO_UTC_SEC = 3 * 60 * 60;
    /** PZ90 Earth's rotation rate (radians per second) */
    public static final double WE_RAD_PER_SEC = 7.292115e-5;
    /** Second zonal coefficient of spherical harmonic expression */
    public static final double J0 = 1082625.75e-9;
    /**
     * The validity (seconds) of a GLONASS ephemeris (30 minutes, or +- 15 minutes). However, due to
     * Google SUPL server providing GLONASS ephemeris every 15 and 45 minutes of the hour, the
     * validity is extended to +- 30 minutes.
     *
     * <p>TODO(gomo): Change this constant to 30 * 60 when the SUPL server is fixed
     */
    public static final int GLO_EPH_VALID_PERIOD_SECONDS = 60 * 60;
    /** The base frequency in Hz of the GLONASS L1 channel */
    public static final double L1_BASE_FREQ_HZ = 1602 * 1e6;
    /** The frequency step size in Hz of the GLONASS L1 channel */
    public static final double L1_STEP_SIZE_HZ = 0.5625 * 1e6;
    /** The base frequency in Hz of the GLONASS L2 channel */
    public static final double L2_BASE_FREQ_HZ = 1246 * 1e6;
    /** The frequency step size in Hz of the GLONASS L2 channel */
    public static final double L2_STEP_SIZE_HZ = 0.4375 * 1e6;
  }

  /**
   * A container for constants related to Galileo
   *
   * <p>Details of the following constants can be found in the Galileo SIS ICD 1.1:
   * http://ec.europa.eu/DocsRoom/documents/11870/attachments/1/translations/en/renditions/native
   */
  public static class GalConstants {
    /** The validity (seconds) of a Galileo ephemeris (4 hours, or +- 2 hours) */
    public static final int GAL_EPH_VALID_PERIOD_SECONDS = 4 * 60 * 60;
    /** Center frequency of the E1 band in Hz. */
    public static final double E1_FREQ_HZ = 10.23 * 1e6 * 154;
    /** Center frequency of the E5 band in Hz. */
    public static final double E5_FREQ_HZ = 1191.795e6;
  }

  /**
   * A container for constants related to Beidou
   *
   * <p>Details of the following constants can be found in the Beidou SIS ICD 2.0:
   * http://www2.unb.ca/gge/Resources/beidou_icd_english_ver2.0.pdf
   */
  public static class BdsConstants {
    /** The validity (seconds) of a Beidou ephemeris (3 hours, or +- 1.5 hours) */
    public static final int BDS_EPH_VALID_PERIOD_SECONDS = 3 * 60 * 60;
    /** Center frequency of the B1 band in Hz. */
    public static final double B1_FREQ_HZ = 10.23 * 1e6 * 154;
    /** Center frequency of the B2 band in Hz. */
    public static final double B2_FREQ_HZ = 1207.14e6;
  }

  /**
   * A container for constants related to QZSS
   *
   * <p>Details of the following constants can be found in the IS-QZSS-PNT-001:
   * http://qzss.go.jp/en/technical/download/pdf/ps-is-qzss/is-qzss-pnt-001.pdf and
   * http://qzss.go.jp/en/technical/satellites/index.html#QZSS
   */
  public static class QzsConstants {
    /** The validity (seconds) of a QZSS ephemeris (4 hours, or +- 2 hours) */
    public static final int QZS_EPH_VALID_PERIOD_SECONDS = 4 * 60 * 60;
    /** Center frequency of the L1 band in Hz. */
    public static final double L1_FREQ_HZ = 10.23 * 1e6 * 154;
    /** Center frequency of the L2 band in Hz. */
    public static final double L2_FREQ_HZ = 1227.60e6;
    /** Center frequency of the L5 band in Hz. */
    public static final double L5_FREQ_HZ = 1176.45e6;
    /** A set of PRNs belonging to J001 satellite */
    public static final ImmutableSet<Integer> J001_PRN_LIST = ImmutableSet.of(183, 193);
    /** A set of PRNs belonging to J002 satellite */
    public static final ImmutableSet<Integer> J002_PRN_LIST = ImmutableSet.of(184, 194);
    /** A set of PRNs belonging to J003 satellite */
    public static final ImmutableSet<Integer> J003_PRN_LIST = ImmutableSet.of(187, 189, 197, 199);
    /** A set of PRNs belonging to J004 satellite */
    public static final ImmutableSet<Integer> J004_PRN_LIST = ImmutableSet.of(185, 195, 200);
  }

  /**
   * A container for all scale factors used in GNSS binary navigation message decoding, and SUPL
   * message decoding
   */
  public static class ScaleFactors {
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
    public static final double GPS_UTC_A0 = Math.pow(2, -30);
    public static final double GPS_UTC_A1 = Math.pow(2, -50);
    public static final double GPS_UTC_TOT = Math.pow(2, 12);
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
    public static final double GLO_CLK_DELTA_TAU = Math.pow(2, -30);
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

  /** A container for constants related to Lorentz corrections. */
  public static class LorentzConstants {
    public static final double INVALID_PR = 999;
  }
}