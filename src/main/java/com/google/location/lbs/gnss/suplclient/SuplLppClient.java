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

import com.google.location.lbs.asn1.supl2.lpp_ver12.A_GNSS_ProvideAssistanceData;
import com.google.location.lbs.asn1.supl2.lpp_ver12.GNSS_CommonAssistData;
import com.google.location.lbs.asn1.supl2.lpp_ver12.GNSS_GenericAssistData;
import com.google.location.lbs.asn1.supl2.lpp_ver12.GNSS_GenericAssistDataElement;
import com.google.location.lbs.asn1.supl2.lpp_ver12.GNSS_NavModelSatelliteElement;
import com.google.location.lbs.asn1.supl2.lpp_ver12.LPP_Message;
import com.google.location.lbs.asn1.supl2.supl_pos.SUPLPOS;
import com.google.location.lbs.asn1.supl2.ulp_version_2_parameter_extensions.Ver2_PosPayLoad_extension;
import com.google.location.lbs.common.gnss.DateTimePicos;
import com.google.location.lbs.common.gnss.GnssTime;
import com.google.location.lbs.gnss.gps.pseudorange.ephemeris.EphemerisResponse;
import com.google.location.lbs.gnss.gps.pseudorange.ephemeris.GnssEphemeris;
import com.google.location.lbs.gnss.suplclient.Ephemeris.GpsNavMessageProto;
import com.google.location.lbs.gnss.suplclient.Ephemeris.IonosphericModelProto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

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
  protected GpsNavMessageProto buildNavMessageProto(SUPLPOS message) {
    A_GNSS_ProvideAssistanceData assistanceData =
        SuplLppClientHelper.getAssistanceDataFromSuplPos(message);

    Iterator<GNSS_GenericAssistDataElement> gnssAssistance =
        assistanceData.getGnss_GenericAssistData().getValues().iterator();

    GNSS_GenericAssistDataElement gpsAssistance = gnssAssistance.next();
    // Verify glonass assistance data element.
    gnssAssistance.next();

    GNSS_CommonAssistData commonAssistance = assistanceData.getGnss_CommonAssistData();

    return processGpsAssistance(commonAssistance, gpsAssistance);
  }

  @Override
  protected EphemerisResponse suplPosToEphResponse(SUPLPOS message) {
    A_GNSS_ProvideAssistanceData assistData =
        SuplLppClientHelper.getAssistanceDataFromSuplPos(message);

    IonosphericModelProto ionoProto =
        SuplLppClientHelper.buildIonoModelProto(
            assistData.getGnss_CommonAssistData().getGnss_IonosphericModel().getKlobucharModel());

    GnssTime gnssTime =
        SuplLppClientHelper.getReferenceGnssTime(
            assistData.getGnss_CommonAssistData().getGnss_ReferenceTime().getGnss_SystemTime());
    int gpsWeek = gnssTime.toGpsWeekTowPicos().first;
    int galWeek = gnssTime.toGalWeekTowPicos().first;
    DateTimePicos moscowDate = gnssTime.toGloDateTodPicos().first;

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

  private static GpsNavMessageProto processGpsAssistance(
      GNSS_CommonAssistData commonAssistance, GNSS_GenericAssistDataElement gpsAssistance) {
    GpsNavMessageProto.Builder navMessageBuilder = GpsNavMessageProto.newBuilder();
    navMessageBuilder.setRpcStatus(GpsNavMessageProto.RpcStatus.UNKNOWN_RPC_STATUS);

    int gpsWeek =
        SuplLppClientHelper.getReferenceGnssTime(
                commonAssistance.getGnss_ReferenceTime().getGnss_SystemTime())
            .toGpsWeekTowPicos()
            .first;

    for (GNSS_NavModelSatelliteElement satellite :
        gpsAssistance.getGnss_NavigationModel().getGnss_SatelliteList().getValues()) {
      navMessageBuilder.addEphemerids(
          SuplLppClientHelper.generateGpsEphemerisProto(satellite, gpsWeek));
    }
    navMessageBuilder.setRpcStatus(GpsNavMessageProto.RpcStatus.SUCCESS);

    navMessageBuilder.setIono(
        SuplLppClientHelper.buildIonoModelProto(
            commonAssistance.getGnss_IonosphericModel().getKlobucharModel()));

    return navMessageBuilder.build();
  }
}
