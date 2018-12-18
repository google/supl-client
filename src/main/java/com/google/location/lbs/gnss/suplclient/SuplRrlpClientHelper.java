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

import com.google.location.lbs.asn1.supl2.rrlp_components.GANSS_ID3;
import com.google.location.lbs.asn1.supl2.rrlp_components.GANSS_ID3_element;
import com.google.location.lbs.asn1.supl2.rrlp_components.GLONASSclockModel;
import com.google.location.lbs.asn1.supl2.rrlp_components.GPS_AssistData;
import com.google.location.lbs.asn1.supl2.rrlp_components.IonosphericModel;
import com.google.location.lbs.asn1.supl2.rrlp_components.NavModelElement;
import com.google.location.lbs.asn1.supl2.rrlp_components.NavModel_GLONASSecef;
import com.google.location.lbs.asn1.supl2.rrlp_components.NavModel_KeplerianSet;
import com.google.location.lbs.asn1.supl2.rrlp_components.NavigationModel;
import com.google.location.lbs.asn1.supl2.rrlp_components.SatStatus;
import com.google.location.lbs.asn1.supl2.rrlp_components.StandardClockModelElementV12;
import com.google.location.lbs.asn1.supl2.rrlp_components.UncompressedEphemeris;
import com.google.location.lbs.asn1.supl2.rrlp_components_ver12.GANSSGenericAssistDataElement;
import com.google.location.lbs.asn1.supl2.rrlp_components_ver12.GANSSNavModel;
import com.google.location.lbs.asn1.supl2.rrlp_components_ver12.GANSSSatelliteElement;
import com.google.location.lbs.asn1.supl2.rrlp_components_ver12.Rel7_AssistanceData_Extension;
import com.google.location.lbs.asn1.supl2.rrlp_components_ver12.SeqOfGANSSGenericAssistDataElement;
import com.google.location.lbs.common.gnss.DateTimePicos;
import com.google.location.lbs.common.gnss.GnssTime;
import com.google.location.lbs.common.gnss.TimeConstants;
import com.google.location.lbs.gnss.gps.pseudorange.Constants.GnssConstants;
import com.google.location.lbs.gnss.gps.pseudorange.Constants.GpsConstants;
import com.google.location.lbs.gnss.gps.pseudorange.Constants.ScaleFactors;
import com.google.location.lbs.gnss.gps.pseudorange.ephemeris.GalEphemeris;
import com.google.location.lbs.gnss.gps.pseudorange.ephemeris.GloEphemeris;
import com.google.location.lbs.gnss.gps.pseudorange.ephemeris.GnssEphemeris;
import com.google.location.lbs.gnss.gps.pseudorange.ephemeris.GpsEphemeris;
import com.google.location.lbs.gnss.gps.pseudorange.ephemeris.KeplerianModel;
import com.google.location.lbs.gnss.suplclient.Ephemeris.GpsEphemerisProto;
import com.google.location.lbs.gnss.suplclient.Ephemeris.IonosphericModelProto;
import com.google.location.lbs.gnss.suplclient.SuplConstants.RrlpConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

/**
 * A helper with methods to convert from SUPL RRLP messages to GNSS ephemeris and Ionospheric
 * protos.
 */
public class SuplRrlpClientHelper {

  private static final Logger logger = Logger.getLogger(SuplRrlpClientHelper.class.getName());

  /**
   * Builds an instance of {@link IonosphericModelProto} containing Klobuchar model parameters from
   * {@link IonosphericModel}.
   */
  static IonosphericModelProto buildIonoModelProto(IonosphericModel ionoModel) {
    IonosphericModelProto.Builder ionoBuilder = IonosphericModelProto.newBuilder();
    double[] alpha = new double[4];
    alpha[0] = ionoModel.getAlfa0().getInteger().byteValue() * ScaleFactors.IONO_ALFA_0;
    alpha[1] = ionoModel.getAlfa1().getInteger().byteValue() * ScaleFactors.IONO_ALFA_1;
    alpha[2] = ionoModel.getAlfa2().getInteger().byteValue() * ScaleFactors.IONO_ALFA_2;
    alpha[3] = ionoModel.getAlfa3().getInteger().byteValue() * ScaleFactors.IONO_ALFA_3;
    for (int i = 0; i < alpha.length; ++i) {
      ionoBuilder.addAlpha(alpha[i]);
    }

    double[] beta = new double[4];
    beta[0] = ionoModel.getBeta0().getInteger().byteValue() * ScaleFactors.IONO_BETA_0;
    beta[1] = ionoModel.getBeta1().getInteger().byteValue() * ScaleFactors.IONO_BETA_1;
    beta[2] = ionoModel.getBeta2().getInteger().byteValue() * ScaleFactors.IONO_BETA_2;
    beta[3] = ionoModel.getBeta3().getInteger().byteValue() * ScaleFactors.IONO_BETA_3;
    for (int i = 0; i < beta.length; ++i) {
      ionoBuilder.addBeta(beta[i]);
    }

    return ionoBuilder.build();
  }

  /**
   * Fills {@link GpsEphemerisProto} with the assistance data obtained in {@link
   * UncompressedEphemeris} for the given satellite id.
   */
  static GpsEphemerisProto generateGpsEphemerisProto(
      int satId, int gpsWeek, UncompressedEphemeris rawEph) {
    GpsEphemerisProto.Builder builder = GpsEphemerisProto.newBuilder();
    builder.setPrn(satId + 1);
    builder.setL2Code(rawEph.getEphemCodeOnL2().getInteger().intValue());
    builder.setL2Flag(rawEph.getEphemL2Pflag().getInteger().intValue());
    builder.setSvHealth(rawEph.getEphemSVhealth().getInteger().intValue());
    builder.setIodc(rawEph.getEphemIODC().getInteger().intValue());
    builder.setIode(rawEph.getEphemIODC().getInteger().intValue());

    builder.setToc(rawEph.getEphemToc().getInteger().intValue() * ScaleFactors.GPS_NAV_TOC);
    builder.setToe(rawEph.getEphemToe().getInteger().intValue() * ScaleFactors.GPS_NAV_TOE);

    builder.setAf0(rawEph.getEphemAF0().getInteger().intValue() * ScaleFactors.GPS_NAV_AF0);
    builder.setAf1(rawEph.getEphemAF1().getInteger().shortValue() * ScaleFactors.GPS_NAV_AF1);
    builder.setAf2(rawEph.getEphemAF2().getInteger().byteValue() * ScaleFactors.GPS_NAV_AF2);

    builder.setTgd(rawEph.getEphemTgd().getInteger().byteValue() * ScaleFactors.GPS_NAV_TGD);
    builder.setRootOfA(
        rawEph.getEphemAPowerHalf().getInteger().longValue() * ScaleFactors.GPS_NAV_A_POWER_HALF);
    builder.setE(rawEph.getEphemE().getInteger().longValue() * ScaleFactors.GPS_NAV_E);
    builder.setI0(rawEph.getEphemI0().getInteger().intValue() * ScaleFactors.GPS_NAV_I0);
    builder.setIDot(rawEph.getEphemIDot().getInteger().intValue() * ScaleFactors.GPS_NAV_I_DOT);
    builder.setOmega(rawEph.getEphemW().getInteger().intValue() * ScaleFactors.GPS_NAV_W);
    builder.setOmega0(
        rawEph.getEphemOmegaA0().getInteger().intValue() * ScaleFactors.GPS_NAV_OMEGA0);
    builder.setOmegaDot(
        rawEph.getEphemOmegaADot().getInteger().intValue() * ScaleFactors.GPS_NAV_OMEGA_A_DOT);
    builder.setM0(rawEph.getEphemM0().getInteger().intValue() * ScaleFactors.GPS_NAV_M0);
    builder.setDeltaN(
        rawEph.getEphemDeltaN().getInteger().shortValue() * ScaleFactors.GPS_NAV_DELTA_N);
    builder.setCrc(rawEph.getEphemCrc().getInteger().shortValue() * ScaleFactors.GPS_NAV_CRC);
    builder.setCrs(rawEph.getEphemCrs().getInteger().shortValue() * ScaleFactors.GPS_NAV_CRS);
    builder.setCuc(rawEph.getEphemCuc().getInteger().shortValue() * ScaleFactors.GPS_NAV_CUC);
    builder.setCus(rawEph.getEphemCus().getInteger().shortValue() * ScaleFactors.GPS_NAV_CUS);
    builder.setCic(rawEph.getEphemCic().getInteger().shortValue() * ScaleFactors.GPS_NAV_CIC);
    builder.setCis(rawEph.getEphemCis().getInteger().shortValue() * ScaleFactors.GPS_NAV_CIS);
    builder.setWeek(gpsWeek);

    return builder.build();
  }

  /**
   * Calculates the total number of weeks since the GPS epoch.
   *
   * @param gpsWeek The modulo-1024 GPS week. A rollover happens at every 1024 weeks.
   * @return The absolute GPS week since the GPS epoch.
   */
  static int getGpsWeekWithRollover(int gpsWeek) {
    long nowMs = System.currentTimeMillis();
    long elapsedTimeFromGpsEpochMs = nowMs - GpsConstants.DELTA_GPS_UNIX_EPOCH_MS;
    long rolloverCycles = elapsedTimeFromGpsEpochMs / GpsConstants.GPS_CYCLE_MS;
    int rolloverWeeks = (int) rolloverCycles * GpsConstants.GPS_CYCLE_WEEKS;
    return gpsWeek + rolloverWeeks;
  }

  /**
   * Builds a list of {@link GnssEphemeris} instances for GPS satellites with information from
   * {@link GPS_AssistData}.
   */
  static List<GnssEphemeris> generateGpsEphList(GPS_AssistData gpsAssistData) {
    List<GnssEphemeris> ephList = new ArrayList<>();
    NavigationModel navModel = gpsAssistData.getControlHeader().getNavigationModel();
    int gpsWeek =
        gpsAssistData
            .getControlHeader()
            .getReferenceTime()
            .getGpsTime()
            .getGpsWeek()
            .getInteger()
            .intValue();
    gpsWeek = getGpsWeekWithRollover(gpsWeek);
    Iterable<NavModelElement> navModelElements = navModel.getNavModelList().getValues();

    for (NavModelElement navModelElement : navModelElements) {
      int svid = navModelElement.getSatelliteID().getInteger().intValue() + 1;
      SatStatus satStatus = navModelElement.getSatStatus();
      UncompressedEphemeris uncompressedEph = satStatus.getNewSatelliteAndModelUC();
      GpsEphemeris gpsEph = buildGpsEphemeris(svid, gpsWeek, uncompressedEph);
      if (gpsEph.health == 0) {
        ephList.add(gpsEph);
      }
    }
    return ephList;
  }

  /**
   * Builds a list of {@link GnssEphemeris} for GANSS (Galileo And Additional Navigation Satellite
   * Systems) satellites with information from {@link Rel7_AssistanceData_Extension}.
   *
   * <p>TODO(guoyuf): add support for the ephemeris of Beidou and Qzss satellites
   */
  static List<GnssEphemeris> generateGanssEphList(
      Rel7_AssistanceData_Extension rel7AssistData, GnssTime gnssTime) {
    List<GnssEphemeris> ephList = new ArrayList<>();
    SeqOfGANSSGenericAssistDataElement sequence =
        rel7AssistData
            .getGanss_AssistData()
            .getGanss_controlHeader()
            .getGanssGenericAssistDataList();
    for (GANSSGenericAssistDataElement assistDataElement : sequence.getValues()) {
      // Absence of GANSS ID indicates Galileo according to section A.8.2 (pages 160-161) in the
      // RRLP protocol, 3GPP TS 44.031 V14.3.0,
      // http://www.3gpp.org/ftp/Specs/archive/44_series/44.031/44031-e20.zip
      if (assistDataElement.getGanssID() == null) {
        ephList.addAll(generateGalEphList(assistDataElement.getGanssNavigationModel(), gnssTime));
        continue;
      }

      // Process non-Galileo GANSS satellites
      switch (assistDataElement.getGanssID().getInteger().intValue()) {
        case RrlpConstants.RRLP_GANSS_ID_GLO:
          Map<Integer, Integer> svidToFreqNumMap =
              getGloSvidToFreqNumMap(
                  assistDataElement.getExtensionGanssAuxiliaryInfo().getGanssID3());
          ephList.addAll(
              generateGloEphList(
                  assistDataElement.getGanssNavigationModel(), gnssTime, svidToFreqNumMap));
          break;
        default:
          logger.info(
              "Unsupported RRLP GNSS constellation: "
                  + assistDataElement.getGanssID().getInteger().intValue());
      }
    }
    return ephList;
  }

  /**
   * Builds a {@link GpsEphemeris} instance for the GPS satellite with id {@code svid} at GPS week
   * {@code gpsWeek} containing the ephemeris parameters from {@link UncompressedEphemeris}.
   */
  private static GpsEphemeris buildGpsEphemeris(
      int svid, int gpsWeek, UncompressedEphemeris rawEph) {
    /* TODO(guoyuf): this Kepler wrapping can be moved out as an independent method if it also
     * applies for other constellations. */
    KeplerianModel keplerModel =
        KeplerianModel.newBuilder()
            .setToeS(rawEph.getEphemToe().getInteger().intValue() * ScaleFactors.GPS_NAV_TOE)
            .setCic(rawEph.getEphemCic().getInteger().shortValue() * ScaleFactors.GPS_NAV_CIC)
            .setCis(rawEph.getEphemCis().getInteger().shortValue() * ScaleFactors.GPS_NAV_CIS)
            .setCuc(rawEph.getEphemCuc().getInteger().shortValue() * ScaleFactors.GPS_NAV_CUC)
            .setCus(rawEph.getEphemCus().getInteger().shortValue() * ScaleFactors.GPS_NAV_CUS)
            .setCrc(rawEph.getEphemCrc().getInteger().shortValue() * ScaleFactors.GPS_NAV_CRC)
            .setCrs(rawEph.getEphemCrs().getInteger().shortValue() * ScaleFactors.GPS_NAV_CRS)
            .setDeltaN(
                rawEph.getEphemDeltaN().getInteger().shortValue() * ScaleFactors.GPS_NAV_DELTA_N)
            .setM0(rawEph.getEphemM0().getInteger().intValue() * ScaleFactors.GPS_NAV_M0)
            .setEccentricity(rawEph.getEphemE().getInteger().longValue() * ScaleFactors.GPS_NAV_E)
            .setSqrtA(
                rawEph.getEphemAPowerHalf().getInteger().longValue()
                    * ScaleFactors.GPS_NAV_A_POWER_HALF)
            .setOmegaDot(
                rawEph.getEphemOmegaADot().getInteger().intValue()
                    * ScaleFactors.GPS_NAV_OMEGA_A_DOT)
            .setOmega(rawEph.getEphemW().getInteger().intValue() * ScaleFactors.GPS_NAV_W)
            .setOmega0(
                rawEph.getEphemOmegaA0().getInteger().intValue() * ScaleFactors.GPS_NAV_OMEGA0)
            .setI0(rawEph.getEphemI0().getInteger().intValue() * ScaleFactors.GPS_NAV_I0)
            .setIDot(rawEph.getEphemIDot().getInteger().intValue() * ScaleFactors.GPS_NAV_I_DOT)
            .build();

    return GpsEphemeris.newBuilder()
        .setSvid(svid)
        .setWeek(gpsWeek)
        .setHealth(rawEph.getEphemSVhealth().getInteger().intValue())
        .setCodeL2(rawEph.getEphemCodeOnL2().getInteger().intValue())
        .setL2PDataFlag(rawEph.getEphemL2Pflag().getInteger().intValue() != 0)
        .setIodc(rawEph.getEphemIODC().getInteger().intValue())
        .setIode(rawEph.getEphemIODC().getInteger().intValue())
        .setTocS(rawEph.getEphemToc().getInteger().intValue() * ScaleFactors.GPS_NAV_TOC)
        .setAf0S(rawEph.getEphemAF0().getInteger().intValue() * ScaleFactors.GPS_NAV_AF0)
        .setAf1SecPerSec(rawEph.getEphemAF1().getInteger().shortValue() * ScaleFactors.GPS_NAV_AF1)
        .setAf2SecPerSec2(rawEph.getEphemAF2().getInteger().byteValue() * ScaleFactors.GPS_NAV_AF2)
        .setTgdS(rawEph.getEphemTgd().getInteger().byteValue() * ScaleFactors.GPS_NAV_TGD)
        .setKeplerianModel(keplerModel)
        .build();
  }

  /**
   * Creates a map with svid of GLONASS satellites as keys and carrier frequency number ([-7, 13])
   * as values from information in {@link GANSS_ID3}.
   */
  private static Map<Integer, Integer> getGloSvidToFreqNumMap(GANSS_ID3 ganssId3) {
    Map<Integer, Integer> svidToFreqNumMap = new HashMap<>();
    for (GANSS_ID3_element element : ganssId3.getValues()) {
      int svid = element.getSvID().getInteger().intValue() + 1;
      int freqNum = element.getChannelNumber().getInteger().intValue();
      svidToFreqNumMap.put(svid, freqNum);
    }
    return svidToFreqNumMap;
  }

  /**
   * Builds a list of {@link GloEphemeris} instances for GLONASS satellites with information from
   * {@link GANSSNavModel}, a reference {@link GnssTime}, and a map with GLONASS svid as keys and
   * carrier frequency numbers as values.
   */
  private static List<GloEphemeris> generateGloEphList(
      GANSSNavModel nav, GnssTime gnssTime, Map<Integer, Integer> svidToFreqNumMap) {
    List<GloEphemeris> ephList = new ArrayList<>();
    DateTimePicos moscowDate = gnssTime.toGloDateTodPicos().first;
    for (GANSSSatelliteElement satElement : nav.getGanssSatelliteList().getValues()) {
      GloEphemeris gloEph = buildGloEphemeris(satElement, moscowDate, svidToFreqNumMap);
      if (gloEph.health == 0) {
        ephList.add(gloEph);
      }
    }
    return ephList;
  }

  /**
   * Builds a list of {@link GalEphemeris} instances for Galileo satellites with information from
   * {@link GANSSNavModel}, and a reference {@link GnssTime}.
   */
  private static List<GalEphemeris> generateGalEphList(GANSSNavModel nav, GnssTime gnssTime) {
    List<GalEphemeris> ephList = new ArrayList<>();
    int galWeek = gnssTime.toGalWeekTowPicos().first;
    for (GANSSSatelliteElement satElement : nav.getGanssSatelliteList().getValues()) {
      KeplerianModel kepler = getGalKeplerianModel(satElement);
      for (StandardClockModelElementV12 clock :
          satElement.getGanssClockModel().getStandardClockModelList().getValues()) {
        int svHealth = SuplLppClientHelper.convertBitSetToInt(satElement.getSvHealth().getValue());
        if (svHealth == 0) {
          GalEphemeris galEph =
              GalEphemeris.newBuilder()
                  .setWeek(galWeek)
                  .setSvid(satElement.getSvID().getInteger().intValue() + 1)
                  .setAf0S(clock.getStanClockAF0().getLong() * ScaleFactors.GAL_CLK_AF0)
                  .setAf1SecPerSec(clock.getStanClockAF1().getLong() * ScaleFactors.GAL_CLK_AF1)
                  .setAf2SecPerSec2(clock.getStanClockAF2().getLong() * ScaleFactors.GAL_CLK_AF2)
                  .setTocS(
                      clock.getStanClockToc().getInteger().intValue() * ScaleFactors.GAL_CLK_TOC)
                  .setTgdS(
                      clock.getStanClockTgd().getInteger().intValue() * ScaleFactors.GAL_CLK_TGD)
                  .setIsINav(clock.getStanModelID().getInteger().intValue() == 0)
                  .setKeplerianModel(kepler)
                  .setIode(satElement.getIod().getInteger().intValue())
                  .setHealth(svHealth)
                  .build();
          ephList.add(galEph);
        }
      }
    }
    return ephList;
  }

  /**
   * Builds a {@link KeplerianModel} for a Galileo satellite from the information in {@link
   * GANSSSatelliteElement}.
   */
  private static KeplerianModel getGalKeplerianModel(GANSSSatelliteElement satElement) {
    NavModel_KeplerianSet orbit = satElement.getGanssOrbitModel().getKeplerianSet();
    return KeplerianModel.newBuilder()
        .setToeS(orbit.getKeplerToe().getInteger().intValue() * ScaleFactors.GAL_NAV_TOE)
        .setCic(orbit.getKeplerCic().getInteger().shortValue() * ScaleFactors.GAL_NAV_CIC)
        .setCrc(orbit.getKeplerCrc().getInteger().shortValue() * ScaleFactors.GAL_NAV_CRC)
        .setCis(orbit.getKeplerCis().getInteger().shortValue() * ScaleFactors.GAL_NAV_CIS)
        .setCrs(orbit.getKeplerCrs().getInteger().shortValue() * ScaleFactors.GAL_NAV_CRS)
        .setCuc(orbit.getKeplerCuc().getInteger().shortValue() * ScaleFactors.GAL_NAV_CUC)
        .setCus(orbit.getKeplerCus().getInteger().shortValue() * ScaleFactors.GAL_NAV_CUS)
        .setDeltaN(orbit.getKeplerDeltaN().getInteger().shortValue() * ScaleFactors.GAL_NAV_DELTA_N)
        .setM0(orbit.getKeplerM0().getInteger().intValue() * ScaleFactors.GAL_NAV_M0)
        .setEccentricity(orbit.getKeplerE().getInteger().longValue() * ScaleFactors.GAL_NAV_E)
        .setI0(orbit.getKeplerI0().getInteger().intValue() * ScaleFactors.GAL_NAV_I0)
        .setIDot(orbit.getKeplerIDot().getInteger().intValue() * ScaleFactors.GAL_NAV_I_DOT)
        .setOmega(orbit.getKeplerW().getInteger().intValue() * ScaleFactors.GAL_NAV_W)
        .setOmega0(orbit.getKeplerOmega0().getInteger().intValue() * ScaleFactors.GAL_NAV_OMEGA0)
        .setOmegaDot(
            orbit.getKeplerOmegaDot().getInteger().intValue() * ScaleFactors.GAL_NAV_OMEGA_DOT)
        .setSqrtA(
            orbit.getKeplerAPowerHalf().getInteger().longValue() * ScaleFactors.GAL_NAV_SQRT_A)
        .build();
  }

  /**
   * Builds a {@link GloEphemeris} instance for the GLONASS satellite from the ephemeris parameters
   * from {@link GANSSSatelliteElement}, the reference date {@code DateTime} in Moscow time, and a
   * map with svid as keys and frequency number as values.
   */
  private static GloEphemeris buildGloEphemeris(
      GANSSSatelliteElement satElement,
      DateTimePicos moscowDate,
      Map<Integer, Integer> svidToFreqNumMap) {
    GLONASSclockModel clock = satElement.getGanssClockModel().getExtensionGlonassClockModel();
    NavModel_GLONASSecef orbit = satElement.getGanssOrbitModel().getExtensionGlonassECEF();

    // Gets the time of ephemeris, and converts it to UTC time zone.
    // Time of day (minutes) in UTC(SU)+3 (Moscow)
    int iodMin =
        satElement.getIod().getInteger().intValue() * RrlpConstants.RRLP_GLO_IOD_SCALE_FACTOR;
    DateTime moscowTimeOfEph =
        new DateTime(
            moscowDate.year,
            moscowDate.monthOfYear,
            moscowDate.dayOfMonth,
            iodMin / 60,
            iodMin % 60,
            DateTimeZone.UTC);
    DateTime utcTimeOfEph = moscowTimeOfEph.minusHours(TimeConstants.MOSCOW_UTC_TIME_OFFSET_HOURS);

    int svid = satElement.getSvID().getInteger().intValue() + 1;
    int carrierFreqNum = svidToFreqNumMap.get(svid);

    return GloEphemeris.newBuilder()
        .setFreqNum(carrierFreqNum)
        .setHealth(satElement.getSvHealth().getValue().get(1) ? 1 : 0)
        .setSvid(svid)
        .setUtcTime(utcTimeOfEph)
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
}
