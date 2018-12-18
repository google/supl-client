package com.google.location.lbs.gnss.suplclient;

import static com.google.common.base.Preconditions.checkNotNull;

import com.google.location.lbs.asn1.supl2.rrlp_components.ControlHeader;
import com.google.location.lbs.asn1.supl2.rrlp_components.GPSTime;
import com.google.location.lbs.asn1.supl2.rrlp_components.NavModelElement;
import com.google.location.lbs.asn1.supl2.rrlp_components.NavigationModel;
import com.google.location.lbs.asn1.supl2.rrlp_components.SatStatus;
import com.google.location.lbs.asn1.supl2.rrlp_components.UncompressedEphemeris;
import com.google.location.lbs.asn1.supl2.rrlp_components_ver12.AssistanceData;
import com.google.location.lbs.asn1.supl2.rrlp_components_ver12.GANSSGenericAssistDataElement;
import com.google.location.lbs.asn1.supl2.rrlp_messages_ver12.PDU;
import com.google.location.lbs.asn1.supl2.supl_pos.PosPayLoad;
import com.google.location.lbs.asn1.supl2.supl_pos.SUPLPOS;
import com.google.location.lbs.common.gnss.GnssTime;
import com.google.location.lbs.common.gnss.TimeConstants;
import com.google.location.lbs.gnss.gps.pseudorange.ephemeris.EphemerisResponse;
import com.google.location.lbs.gnss.gps.pseudorange.ephemeris.GnssEphemeris;
import com.google.location.lbs.gnss.suplclient.Ephemeris.GpsNavMessageProto;
import com.google.location.lbs.gnss.suplclient.Ephemeris.IonosphericModelProto;
import com.google.location.lbs.gnss.suplclient.SuplConstants.RrlpConstants;
import java.util.ArrayList;
import java.util.List;

/**
 * {@link SuplClient} implementation using RRLP as positioning protocol.
 *
 * <p>Reference: 3GPP TS 44.031 V14.3.0,
 * http://www.3gpp.org/ftp/Specs/archive/44_series/44.031/44031-e20.zip
 */
public final class SuplRrlpClient extends SuplClient {
  public SuplRrlpClient(SuplConnectionRequest request) {
    super(request);
  }

  @Override
  protected SuplMessagesGenerator getSuplMessagesGenerator() {
    return new SuplRrlpMessagesGenerator();
  }

  @Override
  protected void validateAssistanceData(SUPLPOS message) {
    PosPayLoad.rrlpPayloadType rrlpPayload = message.getPosPayLoad().getRrlpPayload();
    PDU pdu = PDU.fromPerUnaligned(rrlpPayload.getValue());
    assert (pdu.getComponent().isAssistanceData());
    AssistanceData assistance = pdu.getComponent().getAssistanceData();
    if (request.isMessageLoggingEnabled()) {
      logger.info("Assistance data = \n" + assistance);
    }

    ControlHeader header = assistance.getGps_AssistData().getControlHeader();
    checkNotNull(header.getNavigationModel());
    checkNotNull(header.getIonosphericModel());
    checkNotNull(header.getReferenceTime());
    checkNotNull(header.getRefLocation());
    GANSSGenericAssistDataElement glonassAssistance =
        assistance
            .getExtensionRel7_AssistanceData_Extension()
            .getGanss_AssistData()
            .getGanss_controlHeader()
            .getGanssGenericAssistDataList()
            .getValues()
            .iterator()
            .next();
    checkNotNull(glonassAssistance);
  }

  @Override
  protected GpsNavMessageProto buildNavMessageProto(SUPLPOS message) {
    PosPayLoad.rrlpPayloadType rrlpPayload = message.getPosPayLoad().getRrlpPayload();
    PDU pdu = PDU.fromPerUnaligned(rrlpPayload.getValue());
    ControlHeader controlHeader =
        pdu.getComponent().getAssistanceData().getGps_AssistData().getControlHeader();

    NavigationModel navModel = controlHeader.getNavigationModel();

    int gpsWeek =
        controlHeader.getReferenceTime().getGpsTime().getGpsWeek().getInteger().intValue();
    gpsWeek = SuplRrlpClientHelper.getGpsWeekWithRollover(gpsWeek);
    Iterable<NavModelElement> navModelElements = navModel.getNavModelList().getValues();
    GpsNavMessageProto.Builder navMessageBuilder = GpsNavMessageProto.newBuilder();
    navMessageBuilder.setRpcStatus(GpsNavMessageProto.RpcStatus.UNKNOWN_RPC_STATUS);

    for (NavModelElement navModelElement : navModelElements) {
      int satID = navModelElement.getSatelliteID().getInteger().intValue();
      SatStatus satStatus = navModelElement.getSatStatus();
      UncompressedEphemeris ephemeris = satStatus.getNewSatelliteAndModelUC();
      navMessageBuilder.addEphemerids(
          SuplRrlpClientHelper.generateGpsEphemerisProto(satID, gpsWeek, ephemeris));
    }
    navMessageBuilder.setRpcStatus(GpsNavMessageProto.RpcStatus.SUCCESS);
    navMessageBuilder.setIono(
        SuplRrlpClientHelper.buildIonoModelProto(controlHeader.getIonosphericModel()));

    return navMessageBuilder.build();
  }

  @Override
  protected EphemerisResponse suplPosToEphResponse(SUPLPOS message) {
    PosPayLoad.rrlpPayloadType rrlpPayload = message.getPosPayLoad().getRrlpPayload();
    PDU pdu = PDU.fromPerUnaligned(rrlpPayload.getValue());
    AssistanceData assistData = pdu.getComponent().getAssistanceData();
    List<GnssEphemeris> ephList = new ArrayList<>();
    ephList.addAll(SuplRrlpClientHelper.generateGpsEphList(assistData.getGps_AssistData()));

    GPSTime gpsTime =
        assistData.getGps_AssistData().getControlHeader().getReferenceTime().getGpsTime();
    int gpsWeek =
        SuplRrlpClientHelper.getGpsWeekWithRollover(gpsTime.getGpsWeek().getInteger().intValue());
    GnssTime gnssTime =
        GnssTime.fromGpsWeekTowPicos(
            gpsWeek,
            (long)
                ((gpsTime.getGpsTOW23b().getInteger().intValue()
                        * RrlpConstants.RRLP_GPS_TOW_23B_SCALE_FACTOR_SEC)
                    * TimeConstants.PICOS_PER_SECOND));
    ephList.addAll(
        SuplRrlpClientHelper.generateGanssEphList(
            assistData.getExtensionRel7_AssistanceData_Extension(), gnssTime));

    IonosphericModelProto ionoProto =
        SuplRrlpClientHelper.buildIonoModelProto(
            assistData.getGps_AssistData().getControlHeader().getIonosphericModel());

    return new EphemerisResponse(ephList, ionoProto);
  }
}
