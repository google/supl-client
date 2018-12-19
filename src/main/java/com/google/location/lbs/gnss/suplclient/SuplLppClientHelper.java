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

import com.google.location.lbs.asn1.supl2.lpp.GLONASS_ClockModel;
import com.google.location.lbs.asn1.supl2.lpp.GNSS_ID_GLONASS;
import com.google.location.lbs.asn1.supl2.lpp.GNSS_ID_GLONASS_SatElement;
import com.google.location.lbs.asn1.supl2.lpp.GNSS_SystemTime;
import com.google.location.lbs.asn1.supl2.lpp.KlobucharModelParameter;
import com.google.location.lbs.asn1.supl2.lpp.NAV_ClockModel;
import com.google.location.lbs.asn1.supl2.lpp.NavModelKeplerianSet;
import com.google.location.lbs.asn1.supl2.lpp.NavModelNAV_KeplerianSet;
import com.google.location.lbs.asn1.supl2.lpp.NavModel_GLONASS_ECEF;
import com.google.location.lbs.asn1.supl2.lpp.StandardClockModelElementV12;
import com.google.location.lbs.asn1.supl2.lpp_ver12.A_GNSS_ProvideAssistanceData;
import com.google.location.lbs.asn1.supl2.lpp_ver12.GNSS_NavModelSatelliteElement;
import com.google.location.lbs.asn1.supl2.lpp_ver12.GNSS_NavigationModel;
import com.google.location.lbs.asn1.supl2.lpp_ver12.LPP_Message;
import com.google.location.lbs.asn1.supl2.supl_pos.SUPLPOS;
import com.google.location.lbs.asn1.supl2.ulp_version_2_parameter_extensions.Ver2_PosPayLoad_extension;
import com.google.location.lbs.asn1.supl2.ulp_version_2_parameter_extensions.Ver2_PosPayLoad_extension.lPPPayloadType.lPPPayloadTypeComponentType;
import com.google.location.lbs.common.gnss.DateTimePicos;
import com.google.location.lbs.common.gnss.GnssTime;
import com.google.location.lbs.common.gnss.TimeConstants;
import com.google.location.lbs.gnss.gps.pseudorange.Constants.GnssConstants;
import com.google.location.lbs.gnss.gps.pseudorange.Constants.ScaleFactors;
import com.google.location.lbs.gnss.gps.pseudorange.ephemeris.GalEphemeris;
import com.google.location.lbs.gnss.gps.pseudorange.ephemeris.GloEphemeris;
import com.google.location.lbs.gnss.gps.pseudorange.ephemeris.GnssEphemeris;
import com.google.location.lbs.gnss.gps.pseudorange.ephemeris.GpsEphemeris;
import com.google.location.lbs.gnss.gps.pseudorange.ephemeris.KeplerianModel;
import com.google.location.lbs.gnss.suplclient.Ephemeris.IonosphericModelProto;
import com.google.location.lbs.gnss.suplclient.SuplConstants.LppConstants;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

/**
 * A helper that contains methods to convert SUPL LPP messages to {@link IonosphericModelProto} and
 * instances of {@link GnssEphemeris}.
 */
class SuplLppClientHelper {

  /**
   * Builds an instance of {@link IonosphericModelProto} containing Klobuchar model parameters
   * extracted from {@link KlobucharModelParameter}.
   */
  static IonosphericModelProto buildIonoModelProto(KlobucharModelParameter iono) {
    IonosphericModelProto.Builder ionoBuilder = IonosphericModelProto.newBuilder();
    double[] alpha = new double[4];
    alpha[0] = iono.getAlfa0().getInteger().byteValue() * ScaleFactors.IONO_ALFA_0;
    alpha[1] = iono.getAlfa1().getInteger().byteValue() * ScaleFactors.IONO_ALFA_1;
    alpha[2] = iono.getAlfa2().getInteger().byteValue() * ScaleFactors.IONO_ALFA_2;
    alpha[3] = iono.getAlfa3().getInteger().byteValue() * ScaleFactors.IONO_ALFA_3;
    for (int i = 0; i < alpha.length; ++i) {
      ionoBuilder.addAlpha(alpha[i]);
    }

    double[] beta = new double[4];
    beta[0] = iono.getBeta0().getInteger().byteValue() * ScaleFactors.IONO_BETA_0;
    beta[1] = iono.getBeta1().getInteger().byteValue() * ScaleFactors.IONO_BETA_1;
    beta[2] = iono.getBeta2().getInteger().byteValue() * ScaleFactors.IONO_BETA_2;
    beta[3] = iono.getBeta3().getInteger().byteValue() * ScaleFactors.IONO_BETA_3;
    for (int i = 0; i < beta.length; ++i) {
      ionoBuilder.addBeta(beta[i]);
    }
    return ionoBuilder.build();
  }

  /** Obtains the reference of {@link A_GNSS_ProvideAssistanceData} from {@link SUPLPOS}. */
  static A_GNSS_ProvideAssistanceData getAssistanceDataFromSuplPos(SUPLPOS message) {
    Ver2_PosPayLoad_extension.lPPPayloadType lppPayload =
        message.getPosPayLoad().getExtensionVer2_PosPayLoad_extension().getLPPPayload();
    Iterator<lPPPayloadTypeComponentType> lppMessages = lppPayload.getValues().iterator();
    LPP_Message assistanceDataMessage = LPP_Message.fromPerUnaligned(lppMessages.next().getValue());

    return assistanceDataMessage
        .getLpp_MessageBody()
        .getC1()
        .getProvideAssistanceData()
        .getCriticalExtensions()
        .getC1()
        .getProvideAssistanceData_r9()
        .getA_gnss_ProvideAssistanceData();
  }

  /**
   * Builds a list of {@link GnssEphemeris} instances for GLONASS satellites with information from
   * {@link GNSS_NavigationModel}.
   */
  static List<GnssEphemeris> generateGloEphList(
      GNSS_NavigationModel navModel,
      DateTimePicos moscowDate,
      Map<Integer, Integer> svidToFreqNumMap) {
    List<GnssEphemeris> ephList = new ArrayList<>();
    for (GNSS_NavModelSatelliteElement element : navModel.getGnss_SatelliteList().getValues()) {
      GloEphemeris gloEph = buildGloEphemeris(element, moscowDate, svidToFreqNumMap);
      if (gloEph.health == 0) {
        ephList.add(gloEph);
      }
    }
    return ephList;
  }

  /**
   * Builds a list of {@link GnssEphemeris} instances for GPS satellites with information from
   * {@link GNSS_NavigationModel}.
   */
  static List<GnssEphemeris> generateGpsEphList(GNSS_NavigationModel navModel, int gpsWeek) {
    List<GnssEphemeris> ephList = new ArrayList<>();
    for (GNSS_NavModelSatelliteElement element : navModel.getGnss_SatelliteList().getValues()) {
      int svid = element.getSvID().getSatellite_id().getInteger().intValue() + 1;
      GpsEphemeris gpsEph = buildGpsEphemeris(svid, element, gpsWeek);
      if (gpsEph.health == 0) {
        ephList.add(gpsEph);
      }
    }
    return ephList;
  }

  /**
   * Builds a list of {@link GnssEphemeris} instances for Galileo satellites with information from
   * {@link GNSS_NavigationModel}.
   */
  static List<GnssEphemeris> generateGalEphList(GNSS_NavigationModel navModel, int galWeek) {
    List<GnssEphemeris> ephList = new ArrayList<>();
    for (GNSS_NavModelSatelliteElement element : navModel.getGnss_SatelliteList().getValues()) {
      KeplerianModel keplerModel = getGalKeplerianModel(element);
      int svid = element.getSvID().getSatellite_id().getInteger().intValue() + 1;
      for (StandardClockModelElementV12 clock :
          element.getGnss_ClockModel().getStandardClockModelList().getValues()) {
        int svHealth = convertBitSetToInt(element.getSvHealth().getValue());
        if (svHealth == 0) {
          ephList.add(
              GalEphemeris.newBuilder()
                  .setSvid(svid)
                  .setTocS(clock.getStanClockToc().getLong() * ScaleFactors.GAL_CLK_TOC)
                  .setAf0S(clock.getStanClockAF0().getLong() * ScaleFactors.GAL_CLK_AF0)
                  .setAf1SecPerSec(clock.getStanClockAF1().getLong() * ScaleFactors.GAL_CLK_AF1)
                  .setAf2SecPerSec2(clock.getStanClockAF2().getLong() * ScaleFactors.GAL_CLK_AF2)
                  .setTgdS(clock.getStanClockTgd().getLong() * ScaleFactors.GAL_CLK_TGD)
                  .setIsINav(clock.getStanModelID().getLong() == 0)
                  .setKeplerianModel(keplerModel)
                  .setWeek(galWeek)
                  .setIode(convertBitSetToInt(element.getIod().getValue()))
                  .setHealth(svHealth)
                  .build());
        }
      }
    }
    return ephList;
  }

  /**
   * Gets the {@link GnssTime} from a {@link GNSS_SystemTime} instance based on the GNSS ID
   * associated with the {@link GNSS_SystemTime}.
   */
  static GnssTime getReferenceGnssTime(GNSS_SystemTime systemTime) {
    GnssTime result = null;
    switch (systemTime.getGnss_TimeID().getGnss_id().enumValue()) {
      case gps:
        result =
            GnssTime.fromGpsNanosSinceEpoch(
                systemTime.getGnss_DayNumber().getInteger().intValue() * TimeConstants.NANOS_PER_DAY
                    + systemTime.getGnss_TimeOfDay().getInteger().intValue()
                        * TimeConstants.NANOS_PER_SECOND
                    + systemTime.getGnss_TimeOfDayFrac_msec().getInteger().intValue()
                        * TimeConstants.NANOS_PER_MILLI);
        break;
      default:
        throw new UnsupportedOperationException(
            "Unsupported LPP GNSS constellation: "
                + systemTime.getGnss_TimeID().getGnss_id().enumValue());
    }
    return result;
  }

  /**
   * Creates a map with svid of GLONASS satellites as keys and carrier frequency numbers ([-7, 13])
   * as values from information in {@link GNSS_ID_GLONASS}.
   */
  static Map<Integer, Integer> getGloSvidToFreqNumMap(GNSS_ID_GLONASS gloId) {
    Map<Integer, Integer> svidToFreqNumMap = new HashMap<>();
    for (GNSS_ID_GLONASS_SatElement element : gloId.getValues()) {
      int svid = element.getSvID().getSatellite_id().getInteger().intValue() + 1;
      int freqNum = element.getChannelNumber().getInteger().intValue();
      svidToFreqNumMap.put(svid, freqNum);
    }
    return svidToFreqNumMap;
  }

  /**
   * Converts the value in {@link BitSet} to an integer, where in the input {@code bits}, LSBs have
   * greater indices than MSBs.
   */
  public static int convertBitSetToInt(BitSet bits) {
    int sum = 0;
    for (int i = 0; i < bits.length(); i++) {
      sum = (sum << 1) + (bits.get(i) ? 1 : 0);
    }
    return sum;
  }

  /**
   * Builds a {@link GloEphemeris} instance for the GLONASS satellite from the {@link
   * GNSS_NavModelSatelliteElement} instance containing ephemeris parameters, the reference date
   * {@code DateTime} in Moscow time, and a map with svid as keys and frequency number as values.
   */
  private static GloEphemeris buildGloEphemeris(
      GNSS_NavModelSatelliteElement element,
      DateTimePicos moscowDate,
      Map<Integer, Integer> svidToFreqNumMap) {
    GLONASS_ClockModel clock = element.getGnss_ClockModel().getGlonass_ClockModel();
    NavModel_GLONASS_ECEF orbit = element.getGnss_OrbitModel().getGlonass_ECEF();

    // Gets the time of ephemeris, and converts it to UTC time zone.
    // Time of day (minutes) in UTC(SU)
    int iodMin =
        convertBitSetToInt(element.getIod().getValue()) * LppConstants.LPP_GLO_IOD_SCALE_FACTOR;
    DateTime moscowTimeOfEph =
        new DateTime(
            moscowDate.year,
            moscowDate.monthOfYear,
            moscowDate.dayOfMonth,
            iodMin / 60,
            iodMin % 60,
            DateTimeZone.UTC);
    DateTime utcTimeOfEph = moscowTimeOfEph.minusHours(TimeConstants.MOSCOW_UTC_TIME_OFFSET_HOURS);

    int svid = element.getSvID().getSatellite_id().getInteger().intValue() + 1;
    int carrierFreqNum = svidToFreqNumMap.get(svid);

    return GloEphemeris.newBuilder()
        .setFreqNum(carrierFreqNum)
        .setSvid(svid)
        .setUtcTime(utcTimeOfEph)
        .setHealth(element.getSvHealth().getValue().get(1) ? 1 : 0)
        .setBiasS(clock.getGloTau().getInteger().intValue() * ScaleFactors.GLO_CLK_TAU)
        .setRelFreqBias(clock.getGloGamma().getInteger().intValue() * ScaleFactors.GLO_CLK_GAMMA)
        .setAgeDays(orbit.getGloEn().getInteger().intValue())
        .setXSatPosM(
            orbit.getGloX().getInteger().intValue()
                * ScaleFactors.GLO_ORB_POS_KM
                * GnssConstants.METERS_PER_KM)
        .setYSatPosM(
            orbit.getGloY().getInteger().intValue()
                * ScaleFactors.GLO_ORB_POS_KM
                * GnssConstants.METERS_PER_KM)
        .setZSatPosM(
            orbit.getGloZ().getInteger().intValue()
                * ScaleFactors.GLO_ORB_POS_KM
                * GnssConstants.METERS_PER_KM)
        .setXSatVelMps(
            orbit.getGloXdot().getInteger().intValue()
                * ScaleFactors.GLO_ORB_VEL_KMPS
                * GnssConstants.METERS_PER_KM)
        .setYSatVelMps(
            orbit.getGloYdot().getInteger().intValue()
                * ScaleFactors.GLO_ORB_VEL_KMPS
                * GnssConstants.METERS_PER_KM)
        .setZSatVelMps(
            orbit.getGloZdot().getInteger().intValue()
                * ScaleFactors.GLO_ORB_VEL_KMPS
                * GnssConstants.METERS_PER_KM)
        .setXMoonSunAccMps2(
            orbit.getGloXdotdot().getInteger().intValue()
                * ScaleFactors.GLO_ORB_ACCELERATION_KMPS2
                * GnssConstants.METERS_PER_KM)
        .setYMoonSunAccMps2(
            orbit.getGloYdotdot().getInteger().intValue()
                * ScaleFactors.GLO_ORB_ACCELERATION_KMPS2
                * GnssConstants.METERS_PER_KM)
        .setZMoonSunAccMps2(
            orbit.getGloZdotdot().getInteger().intValue()
                * ScaleFactors.GLO_ORB_ACCELERATION_KMPS2
                * GnssConstants.METERS_PER_KM)
        .build();
  }

  /**
   * Builds a {@link GpsEphemeris} instance for the GPS satellite with id {@code svid} containing
   * the ephemeris parameters from {@link GNSS_NavModelSatelliteElement}.
   */
  private static GpsEphemeris buildGpsEphemeris(
      int svid, GNSS_NavModelSatelliteElement element, int gpsWeek) {
    NavModelNAV_KeplerianSet orbit = element.getGnss_OrbitModel().getNav_KeplerianSet();
    KeplerianModel keplerModel = getGpsKeplerianModel(element);
    NAV_ClockModel clock = element.getGnss_ClockModel().getNav_ClockModel();
    int iod = convertBitSetToInt(element.getIod().getValue());
    return GpsEphemeris.newBuilder()
        .setSvid(svid)
        .setWeek(gpsWeek)
        .setHealth(convertBitSetToInt(element.getSvHealth().getValue()))
        .setTgdS(clock.getNavTgd().getInteger().byteValue() * ScaleFactors.GPS_NAV_TGD)
        .setAf0S(clock.getNavaf0().getInteger().intValue() * ScaleFactors.GPS_NAV_AF0)
        .setAf1SecPerSec(clock.getNavaf1().getInteger().shortValue() * ScaleFactors.GPS_NAV_AF1)
        .setAf2SecPerSec2(clock.getNavaf2().getInteger().byteValue() * ScaleFactors.GPS_NAV_AF2)
        .setTocS(clock.getNavToc().getInteger().intValue() * ScaleFactors.GPS_NAV_TOC)
        .setIodc(iod)
        .setIode(iod)
        .setL2PDataFlag(orbit.getAddNAVparam().getEphemL2Pflag().getInteger().intValue() != 0)
        .setCodeL2(orbit.getAddNAVparam().getEphemCodeOnL2().getInteger().intValue())
        .setKeplerianModel(keplerModel)
        .build();
  }

  private static KeplerianModel getGpsKeplerianModel(GNSS_NavModelSatelliteElement element) {
    NavModelNAV_KeplerianSet orbit = element.getGnss_OrbitModel().getNav_KeplerianSet();
    return KeplerianModel.newBuilder()
        .setToeS(orbit.getNavToe().getInteger().intValue() * ScaleFactors.GPS_NAV_TOE)
        .setCic(orbit.getNavCic().getInteger().shortValue() * ScaleFactors.GPS_NAV_CIC)
        .setCis(orbit.getNavCis().getInteger().shortValue() * ScaleFactors.GPS_NAV_CIS)
        .setCrc(orbit.getNavCrc().getInteger().shortValue() * ScaleFactors.GPS_NAV_CRC)
        .setCrs(orbit.getNavCrs().getInteger().shortValue() * ScaleFactors.GPS_NAV_CRS)
        .setCuc(orbit.getNavCuc().getInteger().shortValue() * ScaleFactors.GPS_NAV_CUC)
        .setCus(orbit.getNavCus().getInteger().shortValue() * ScaleFactors.GPS_NAV_CUS)
        .setDeltaN(orbit.getNavDeltaN().getInteger().shortValue() * ScaleFactors.GPS_NAV_DELTA_N)
        .setM0(orbit.getNavM0().getInteger().intValue() * ScaleFactors.GPS_NAV_M0)
        .setOmega(orbit.getNavOmega().getInteger().intValue() * ScaleFactors.GPS_NAV_W)
        .setOmega0(orbit.getNavOmegaA0().getInteger().intValue() * ScaleFactors.GPS_NAV_OMEGA0)
        .setOmegaDot(
            orbit.getNavOmegaADot().getInteger().intValue() * ScaleFactors.GPS_NAV_OMEGA_A_DOT)
        .setI0(orbit.getNavI0().getInteger().intValue() * ScaleFactors.GPS_NAV_I0)
        .setIDot(orbit.getNavIDot().getInteger().intValue() * ScaleFactors.GPS_NAV_I_DOT)
        .setEccentricity(orbit.getNavE().getInteger().longValue() * ScaleFactors.GPS_NAV_E)
        .setSqrtA(
            orbit.getNavAPowerHalf().getInteger().longValue() * ScaleFactors.GPS_NAV_A_POWER_HALF)
        .build();
  }

  private static KeplerianModel getGalKeplerianModel(GNSS_NavModelSatelliteElement element) {
    NavModelKeplerianSet orbit = element.getGnss_OrbitModel().getKeplerianSet();
    return KeplerianModel.newBuilder()
        .setToeS(orbit.getKeplerToe().getInteger().intValue() * ScaleFactors.GAL_NAV_TOE)
        .setCic(orbit.getKeplerCic().getInteger().shortValue() * ScaleFactors.GAL_NAV_CIC)
        .setCis(orbit.getKeplerCis().getInteger().shortValue() * ScaleFactors.GAL_NAV_CIS)
        .setCrc(orbit.getKeplerCrc().getInteger().shortValue() * ScaleFactors.GAL_NAV_CRC)
        .setCrs(orbit.getKeplerCrs().getInteger().shortValue() * ScaleFactors.GAL_NAV_CRS)
        .setCuc(orbit.getKeplerCuc().getInteger().shortValue() * ScaleFactors.GAL_NAV_CUC)
        .setCus(orbit.getKeplerCus().getInteger().shortValue() * ScaleFactors.GAL_NAV_CUS)
        .setDeltaN(orbit.getKeplerDeltaN().getInteger().shortValue() * ScaleFactors.GAL_NAV_DELTA_N)
        .setM0(orbit.getKeplerM0().getInteger().intValue() * ScaleFactors.GAL_NAV_M0)
        .setOmega(orbit.getKeplerW().getInteger().intValue() * ScaleFactors.GAL_NAV_W)
        .setOmega0(orbit.getKeplerOmega0().getInteger().intValue() * ScaleFactors.GAL_NAV_OMEGA0)
        .setOmegaDot(
            orbit.getKeplerOmegaDot().getInteger().intValue() * ScaleFactors.GAL_NAV_OMEGA_DOT)
        .setI0(orbit.getKeplerI0().getInteger().intValue() * ScaleFactors.GAL_NAV_I0)
        .setIDot(orbit.getKeplerIDot().getInteger().intValue() * ScaleFactors.GAL_NAV_I_DOT)
        .setEccentricity(orbit.getKeplerE().getInteger().longValue() * ScaleFactors.GAL_NAV_E)
        .setSqrtA(
            orbit.getKeplerAPowerHalf().getInteger().longValue() * ScaleFactors.GAL_NAV_SQRT_A)
        .build();
  }
}
