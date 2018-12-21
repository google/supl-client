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

import com.google.location.suplclient.asn1.supl2.lpp.GNSS_SystemTime;
import com.google.location.suplclient.asn1.supl2.lpp_ver12.A_GNSS_ProvideAssistanceData;
import com.google.location.suplclient.asn1.supl2.lpp_ver12.GNSS_GenericAssistData;
import com.google.location.suplclient.asn1.supl2.lpp_ver12.GNSS_GenericAssistDataElement;
import com.google.location.suplclient.asn1.supl2.lpp_ver12.LPP_Message;
import com.google.location.suplclient.asn1.supl2.supl_pos.SUPLPOS;
import com.google.location.suplclient.asn1.supl2.ulp_version_2_parameter_extensions.Ver2_PosPayLoad_extension;
import com.google.location.suplclient.ephemeris.EphemerisResponse;
import com.google.location.suplclient.ephemeris.GnssEphemeris;
import com.google.location.suplclient.supl.Ephemeris.IonosphericModelProto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;

/**
 * {@link SuplClient} implementation using LPP as positioning protocol.
 *
 * <p>Reference: 3GPP TS 36.355 V14.4.0,
 * http://www.3gpp.org/ftp/specs/archive/36_series/36.355/36355-e40.zip
 */
final class SuplLppClient extends SuplClient {

  public SuplLppClient(SuplConnectionRequest request) {
    super(request);
  }

  @Override
  protected SuplMessagesGenerator getSuplMessagesGenerator() {
    return new SuplLppMessagesGenerator();
  }

  @Override
  protected void validateAssistanceData(SUPLPOS message) {
    Ver2_PosPayLoad_extension.lPPPayloadType lppPayload =
        message.getPosPayLoad().getExtensionVer2_PosPayLoad_extension().getLPPPayload();
    Iterator<Ver2_PosPayLoad_extension.lPPPayloadType.lPPPayloadTypeComponentType> lppMessages =
        lppPayload.getValues().iterator();
    LPP_Message assistanceDataMessage = LPP_Message.fromPerUnaligned(lppMessages.next().getValue());
    if (request.isMessageLoggingEnabled()) {
      logger.info("Assistance data = \n" + assistanceDataMessage);
    }

    assert (assistanceDataMessage.getLpp_MessageBody().getC1().isProvideAssistanceData());
  }

  @Override
  protected EphemerisResponse suplPosToEphResponse(SUPLPOS message) {
    A_GNSS_ProvideAssistanceData assistData =
        SuplLppClientHelper.getAssistanceDataFromSuplPos(message);

    IonosphericModelProto ionoProto =
        SuplLppClientHelper.buildIonoModelProto(
            assistData.getGnss_CommonAssistData().getGnss_IonosphericModel().getKlobucharModel());

    GNSS_SystemTime gnssSystemTime =
        assistData.getGnss_CommonAssistData().getGnss_ReferenceTime().getGnss_SystemTime();
    DateTime gnssDateTime = SuplLppClientHelper.getReferenceGnssTime(gnssSystemTime);
    DateTime moscowDate = toGloTime(gnssDateTime);

    int gpsWeek =
        gnssSystemTime.getGnss_DayNumber().getInteger().intValue() / TimeConstants.DAYS_PER_WEEK;
    int galWeek = gpsWeek - TimeConstants.GAL_GPS_EPOCHS_OFFSET_WEEKS;

    List<GnssEphemeris> ephList = new ArrayList<>();
    GNSS_GenericAssistData assistDataSequence = assistData.getGnss_GenericAssistData();
    for (GNSS_GenericAssistDataElement element : assistDataSequence.getValues()) {
      switch (element.getGnss_ID().getGnss_id().enumValue()) {
        case gps:
          ephList.addAll(
              SuplLppClientHelper.generateGpsEphList(element.getGnss_NavigationModel(), gpsWeek));
          break;
        case glonass:
          Map<Integer, Integer> svidToFreqNumMap =
              SuplLppClientHelper.getGloSvidToFreqNumMap(
                  element.getGnss_AuxiliaryInformation().getGnss_ID_GLONASS());
          ephList.addAll(
              SuplLppClientHelper.generateGloEphList(
                  element.getGnss_NavigationModel(), moscowDate, svidToFreqNumMap));
          break;
        case galileo:
          ephList.addAll(
              SuplLppClientHelper.generateGalEphList(element.getGnss_NavigationModel(), galWeek));
          break;
        default:
          logger.info(
              "Unsupported LPP GNSS constellation: "
                  + element.getGnss_ID().getGnss_id().enumValue());
      }
    }

    return new EphemerisResponse(ephList, ionoProto);
  }

  private DateTime toGloTime(DateTime dateTime) {
    dateTime = dateTime.plus(TimeConstants.GPS_UTC_EPOCHS_OFFSET_MILLIS);
    int countLeapSec1 = getLeapSecond(dateTime);

    // The countLeapSec1 would produce the correct number of leap seconds except for an edge case
    // where a straddle leap second occurs (number of leap seconds now != number of leap seconds
    // after adjusting the time with the computed leap seconds). In such case, we need to add one to
    // the used leap second.
    DateTime gpsDateTimeMinusLeapSec = dateTime.minusSeconds(countLeapSec1);
    int countLeapSec2 = getLeapSecond(gpsDateTimeMinusLeapSec);

    gpsDateTimeMinusLeapSec = (countLeapSec1 == countLeapSec2)
        ? gpsDateTimeMinusLeapSec
        : gpsDateTimeMinusLeapSec.minusSeconds(countLeapSec2);

    gpsDateTimeMinusLeapSec.plusHours(TimeConstants.MOSCOW_UTC_TIME_OFFSET_HOURS);

    return gpsDateTimeMinusLeapSec;
  }

  /**
   * Returns the number of leap seconds occurred before the input UTC {@link DateTime} instance.
   */
  private static int getLeapSecond(DateTime dateTime) {
    int count = 0;
    for (DateTime leapSec : TimeConstants.LEAP_SECOND_LIST) {
      if (leapSec.compareTo(dateTime) <= 0) {
        count++;
      } else {
        break;
      }
    }
    return count;
  }
}
