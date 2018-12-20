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

import com.google.location.suplclient.asn1.base.PacketBuilder;
import com.google.location.suplclient.asn1.supl2.lpp.A_GNSS_ProvideCapabilities;
import com.google.location.suplclient.asn1.supl2.lpp.A_GNSS_RequestAssistanceData;
import com.google.location.suplclient.asn1.supl2.lpp.AssistanceDataSupportList;
import com.google.location.suplclient.asn1.supl2.lpp.ECGI;
import com.google.location.suplclient.asn1.supl2.lpp.GNSS_CommonAssistDataReq;
import com.google.location.suplclient.asn1.supl2.lpp.GNSS_CommonAssistanceDataSupport;
import com.google.location.suplclient.asn1.supl2.lpp.GNSS_GenericAssistDataReq;
import com.google.location.suplclient.asn1.supl2.lpp.GNSS_GenericAssistDataReqElement;
import com.google.location.suplclient.asn1.supl2.lpp.GNSS_GenericAssistDataSupportElement;
import com.google.location.suplclient.asn1.supl2.lpp.GNSS_GenericAssistanceDataSupport;
import com.google.location.suplclient.asn1.supl2.lpp.GNSS_ID;
import com.google.location.suplclient.asn1.supl2.lpp.GNSS_NavigationModelSupport;
import com.google.location.suplclient.asn1.supl2.lpp.GNSS_ReferenceTimeReq;
import com.google.location.suplclient.asn1.supl2.lpp.GNSS_SupportElement;
import com.google.location.suplclient.asn1.supl2.lpp.GNSS_SupportList;
import com.google.location.suplclient.asn1.supl2.lpp.GNSS_TimeModelElementReq;
import com.google.location.suplclient.asn1.supl2.lpp.LocationCoordinateTypes;
import com.google.location.suplclient.asn1.supl2.lpp.ProvideCapabilities_r9_IEs;
import com.google.location.suplclient.asn1.supl2.lpp.RequestAssistanceData_r9_IEs;
import com.google.location.suplclient.asn1.supl2.lpp.VelocityTypes;
import com.google.location.suplclient.asn1.supl2.lpp_ver12.Initiator;
import com.google.location.suplclient.asn1.supl2.lpp_ver12.LPP_Message;
import com.google.location.suplclient.asn1.supl2.lpp_ver12.LPP_MessageBody;
import com.google.location.suplclient.asn1.supl2.lpp_ver12.LPP_TransactionID;
import com.google.location.suplclient.asn1.supl2.lpp_ver12.TransactionNumber;
import com.google.location.suplclient.asn1.supl2.supl_pos.SUPLPOS;
import com.google.location.suplclient.asn1.supl2.supl_pos_init.SUPLPOSINIT;
import com.google.location.suplclient.asn1.supl2.supl_start.PosProtocol;
import com.google.location.suplclient.asn1.supl2.supl_start.SUPLSTART;
import com.google.location.suplclient.asn1.supl2.ulp.ULP_PDU;
import com.google.location.suplclient.asn1.supl2.ulp.UlpMessage;
import com.google.location.suplclient.asn1.supl2.ulp_components.SessionID;
import com.google.location.suplclient.asn1.supl2.ulp_components.Version;
import com.google.location.suplclient.asn1.supl2.ulp_version_2_parameter_extensions.PosProtocolVersion3GPP;
import com.google.location.suplclient.asn1.supl2.ulp_version_2_parameter_extensions.Ver2_PosPayLoad_extension;
import com.google.location.suplclient.asn1.supl2.ulp_version_2_parameter_extensions.Ver2_PosProtocol_extension;
import java.math.BigInteger;
import java.net.InetAddress;
import java.util.BitSet;
import javax.annotation.Nullable;

final class SuplLppMessagesGenerator extends SuplMessagesGenerator {
  SuplLppMessagesGenerator() {}

  @Override
  public ULP_PDU newSuplStartMessage(int mcc, int mnc, int uc, @Nullable InetAddress ipAddress) {
    ULP_PDU ulpPdu = super.newSuplStartMessage(mcc, mnc, uc, ipAddress);
    requestLppCapability(ulpPdu.getMessage().getMsSUPLSTART());
    return ulpPdu;
  }

  @Override
  public ULP_PDU newSuplStartMessage(@Nullable InetAddress ipAddress) throws Exception {
    ULP_PDU ulpPdu = super.newSuplStartMessage(ipAddress);
    requestLppCapability(ulpPdu.getMessage().getMsSUPLSTART());
    return ulpPdu;
  }

  /** Updates {@link SUPLSTART} message to request LPP Protocol. */
  private void requestLppCapability(SUPLSTART suplStart) {
    PosProtocol posProtocol = suplStart.getSETCapabilities().getPosProtocol();
    Ver2_PosProtocol_extension posExtension = new Ver2_PosProtocol_extension();
    posExtension.setLppToNewInstance().setValue(true);
    posProtocol.setExtensionVer2_PosProtocol_extension(posExtension);
  }

  @Override
  public ULP_PDU newSuplPosInitMessage(SessionID sessionId, int mcc, int mnc, int uc) {
    ULP_PDU ulpPdu = super.newSuplPosInitMessage(sessionId, mcc, mnc, uc);

    addLppCapability(ulpPdu.getMessage().getMsSUPLPOSINIT());

    return ulpPdu;
  }

  @Override
  public ULP_PDU newSuplPosInitMessage(SessionID sessionId, long latE7, long lngE7) {
    ULP_PDU ulpPdu = super.newSuplPosInitMessage(sessionId, latE7, lngE7);

    addLppCapability(ulpPdu.getMessage().getMsSUPLPOSINIT());

    return ulpPdu;
  }

  private void addLppCapability(SUPLPOSINIT suplPosInit) {
    requestLppCapability(suplPosInit);
    addSuplPosMessage(suplPosInit);
  }

  private void addSuplPosMessage(SUPLPOSINIT suplPosInit) {
    SUPLPOS suplPos = new SUPLPOS();
    Ver2_PosPayLoad_extension.lPPPayloadType lpp = new Ver2_PosPayLoad_extension.lPPPayloadType();
    lpp.createAndAddValue().setValue(encodeLpp(newProvideCapabilitiesMessage()));
    lpp.createAndAddValue().setValue(encodeLpp(newRequestAssistanceDataMessage()));
    Ver2_PosPayLoad_extension extension = new Ver2_PosPayLoad_extension();
    extension.setLPPPayload(lpp);

    suplPos.setPosPayLoadToNewInstance().setExtensionVer2_PosPayLoad_extension(extension);

    suplPosInit.setSUPLPOS(suplPos);
  }

  /** Updates {@link SUPLPOSINIT} message to request LPP Protocol. */
  private void requestLppCapability(SUPLPOSINIT suplPosInit) {
    PosProtocol posProtocol = suplPosInit.getSETCapabilities().getPosProtocol();
    Ver2_PosProtocol_extension posExtension = new Ver2_PosProtocol_extension();

    PosProtocolVersion3GPP lppVersion = posExtension.setPosProtocolVersionLPPToNewInstance();
    lppVersion.setMajorVersionFieldToNewInstance().setLong(14);
    lppVersion.setEditorialVersionFieldToNewInstance().setLong(1);
    lppVersion.setTechnicalVersionFieldToNewInstance().setLong(0);

    posExtension.setLppToNewInstance().setValue(true);
    posProtocol.setExtensionVer2_PosProtocol_extension(posExtension);
  }

  @Override
  public ULP_PDU newSuplPosAckMessage(SessionID sessionId) {
    ULP_PDU ulpPdu = new ULP_PDU();
    Version version = ulpPdu.setVersionToNewInstance();
    version.setMinToNewInstance().setInteger(BigInteger.ZERO);
    version.setMajToNewInstance().setInteger(BigInteger.valueOf(2));
    version.setServindToNewInstance().setInteger(BigInteger.ZERO);
    ulpPdu.setVersion(version);

    ulpPdu.setSessionID(sessionId);

    Ver2_PosPayLoad_extension extension = new Ver2_PosPayLoad_extension();
    extension
        .setLPPPayloadToNewInstance()
        .createAndAddValue()
        .setValue(encodeLpp(newProvideLocationMessage()));

    SUPLPOS suplPos = new SUPLPOS();
    suplPos.setPosPayLoadToNewInstance().setExtensionVer2_PosPayLoad_extension(extension);

    UlpMessage message = new UlpMessage();
    message.setMsSUPLPOS(suplPos);

    ulpPdu.setMessage(message);
    return ulpPdu;
  }

  private LPP_Message newProvideCapabilitiesMessage() {
    BitSet gnssSignal = new BitSet(8);
    gnssSignal.set(7);

    GNSS_SupportElement gpsElement = new GNSS_SupportElement();
    gpsElement.setGnss_IDToNewInstance().setGnss_idToNewInstance().setTo_gps();
    gpsElement.setAgnss_ModesToNewInstance().setPosModesToNewInstance().set_ue_based();
    gpsElement.setGnss_SignalsToNewInstance().setGnss_SignalIDsToNewInstance().setValue(gnssSignal);
    gpsElement.setVelocityMeasurementSupportToNewInstance().setValue(true);
    gpsElement.setAdr_SupportToNewInstance().setValue(false);

    GNSS_SupportElement glonassElement = new GNSS_SupportElement();
    glonassElement.setGnss_IDToNewInstance().setGnss_idToNewInstance().setTo_glonass();
    glonassElement.setAgnss_ModesToNewInstance().setPosModesToNewInstance().set_ue_based();
    glonassElement
        .setGnss_SignalsToNewInstance()
        .setGnss_SignalIDsToNewInstance()
        .setValue(gnssSignal);
    glonassElement.setVelocityMeasurementSupportToNewInstance().setValue(true);
    glonassElement.setAdr_SupportToNewInstance().setValue(false);

    GNSS_SupportElement galElement = new GNSS_SupportElement();
    galElement.setGnss_IDToNewInstance().setGnss_idToNewInstance().setTo_galileo();
    galElement.setAgnss_ModesToNewInstance().setPosModesToNewInstance().set_ue_based();
    galElement.setGnss_SignalsToNewInstance().setGnss_SignalIDsToNewInstance().setValue(gnssSignal);
    galElement.setVelocityMeasurementSupportToNewInstance().setValue(true);
    galElement.setAdr_SupportToNewInstance().setValue(false);

    GNSS_SupportList gnssList = new GNSS_SupportList();
    gnssList.add(gpsElement);
    gnssList.add(glonassElement);
    gnssList.add(galElement);

    GNSS_CommonAssistanceDataSupport commonAssistance = new GNSS_CommonAssistanceDataSupport();
    commonAssistance
        .setGnss_ReferenceTimeSupportToNewInstance()
        .setGnss_SystemTimeToNewInstance()
        .setGnss_idsToNewInstance()
        .set_gps();
    commonAssistance.setGnss_ReferenceLocationSupportToNewInstance();

    // Prepare request for GPS assistance data
    GNSS_NavigationModelSupport gpsNav = new GNSS_NavigationModelSupport();
    gpsNav.setClockModelToNewInstance().set_model_2();
    gpsNav.setOrbitModelToNewInstance().set_model_2();

    GNSS_GenericAssistDataSupportElement gpsAssistance = new GNSS_GenericAssistDataSupportElement();
    gpsAssistance.setGnss_IDToNewInstance().setGnss_idToNewInstance().setTo_gps();
    gpsAssistance.setGnss_NavigationModelSupport(gpsNav);
    gpsAssistance.setGnss_RealTimeIntegritySupportToNewInstance();
    gpsAssistance.setGnss_AcquisitionAssistanceSupportToNewInstance();
    gpsAssistance
        .setGnss_AlmanacSupportToNewInstance()
        .setAlmanacModelToNewInstance()
        .set_model_2();

    // Prepare request for GLONASS assistance data
    GNSS_NavigationModelSupport glonassNav = new GNSS_NavigationModelSupport();
    gpsNav.setClockModelToNewInstance().set_model_4();
    gpsNav.setOrbitModelToNewInstance().set_model_4();

    GNSS_GenericAssistDataSupportElement glonassAssistance =
        new GNSS_GenericAssistDataSupportElement();
    glonassAssistance.setGnss_IDToNewInstance().setGnss_idToNewInstance().setTo_glonass();
    glonassAssistance.setGnss_NavigationModelSupport(glonassNav);
    glonassAssistance.setGnss_RealTimeIntegritySupportToNewInstance();
    glonassAssistance.setGnss_AcquisitionAssistanceSupportToNewInstance();
    glonassAssistance
        .setGnss_AlmanacSupportToNewInstance()
        .setAlmanacModelToNewInstance()
        .set_model_5();
    glonassAssistance.setGnss_AuxiliaryInformationSupportToNewInstance();

    // Prepare request for Galileo assistance data
    GNSS_NavigationModelSupport galileoNav = new GNSS_NavigationModelSupport();
    galileoNav.setClockModelToNewInstance().set_model_1();
    galileoNav.setOrbitModelToNewInstance().set_model_1();

    GNSS_GenericAssistDataSupportElement galileoAssistance =
        new GNSS_GenericAssistDataSupportElement();
    galileoAssistance.setGnss_IDToNewInstance().setGnss_idToNewInstance().setTo_galileo();
    galileoAssistance.setGnss_NavigationModelSupport(galileoNav);
    galileoAssistance.setGnss_RealTimeIntegritySupportToNewInstance();
    galileoAssistance.setGnss_AcquisitionAssistanceSupportToNewInstance();
    galileoAssistance
        .setGnss_AlmanacSupportToNewInstance()
        .setAlmanacModelToNewInstance()
        .set_model_1();

    GNSS_GenericAssistanceDataSupport genericAssistance = new GNSS_GenericAssistanceDataSupport();
    genericAssistance.add(gpsAssistance);
    genericAssistance.add(glonassAssistance);
    genericAssistance.add(galileoAssistance);

    AssistanceDataSupportList assistanceData = new AssistanceDataSupportList();
    assistanceData.setGnss_CommonAssistanceDataSupport(commonAssistance);
    assistanceData.setGnss_GenericAssistanceDataSupport(genericAssistance);

    LocationCoordinateTypes locationAssistance = new LocationCoordinateTypes();
    locationAssistance.setEllipsoidPointToNewInstance().setValue(false);
    locationAssistance.setEllipsoidPointWithUncertaintyCircleToNewInstance().setValue(false);
    locationAssistance.setEllipsoidPointWithUncertaintyEllipseToNewInstance().setValue(false);
    locationAssistance.setPolygonToNewInstance().setValue(false);
    locationAssistance.setEllipsoidPointWithAltitudeToNewInstance().setValue(false);
    locationAssistance
        .setEllipsoidPointWithAltitudeAndUncertaintyEllipsoidToNewInstance()
        .setValue(true);
    locationAssistance.setEllipsoidArcToNewInstance().setValue(false);

    VelocityTypes velocityAssistance = new VelocityTypes();
    velocityAssistance.setHorizontalVelocityToNewInstance().setValue(false);
    velocityAssistance.setHorizontalWithVerticalVelocityToNewInstance().setValue(false);
    velocityAssistance.setHorizontalVelocityWithUncertaintyToNewInstance().setValue(false);
    velocityAssistance
        .setHorizontalWithVerticalVelocityAndUncertaintyToNewInstance()
        .setValue(true);

    A_GNSS_ProvideCapabilities gnssCapabilities = new A_GNSS_ProvideCapabilities();
    gnssCapabilities.setGnss_SupportList(gnssList);
    gnssCapabilities.setAssistanceDataSupportList(assistanceData);
    gnssCapabilities.setLocationCoordinateTypes(locationAssistance);
    gnssCapabilities.setVelocityTypes(velocityAssistance);

    ProvideCapabilities_r9_IEs capabilities = new ProvideCapabilities_r9_IEs();
    capabilities.setA_gnss_ProvideCapabilities(gnssCapabilities);

    LPP_MessageBody messageBody = new LPP_MessageBody();
    messageBody
        .setC1ToNewInstance()
        .setProvideCapabilitiesToNewInstance()
        .setCriticalExtensionsToNewInstance()
        .setC1ToNewInstance()
        .setProvideCapabilities_r9(capabilities);

    LPP_Message message = new LPP_Message();
    message.setTransactionID(newTransactionId(3));
    message.setEndTransactionToNewInstance().setValue(true);
    message.setLpp_MessageBody(messageBody);

    return message;
  }

  private LPP_Message newRequestAssistanceDataMessage() {
    BitSet cellIdentity = new BitSet(28);
    cellIdentity.set(1);
    cellIdentity.set(5);
    cellIdentity.set(10);
    cellIdentity.set(16);
    cellIdentity.set(17);
    cellIdentity.set(18);
    cellIdentity.set(26);

    ECGI.mccType mcc = new ECGI.mccType();
    mcc.createAndAddValue().setLong(3);
    mcc.createAndAddValue().setLong(1);
    mcc.createAndAddValue().setLong(0);

    ECGI.mncType mnc = new ECGI.mncType();
    mnc.createAndAddValue().setLong(2);
    mnc.createAndAddValue().setLong(6);
    mnc.createAndAddValue().setLong(0);

    ECGI primaryCellId = new ECGI();
    primaryCellId.setMcc(mcc);
    primaryCellId.setMnc(mnc);

    primaryCellId.setCellidentityToNewInstance().setValue(cellIdentity);

    GNSS_ReferenceTimeReq.gnss_TimeReqPrefListType timeAssistList =
        new GNSS_ReferenceTimeReq.gnss_TimeReqPrefListType();
    GNSS_ID gpsId = new GNSS_ID();
    gpsId.setGnss_idToNewInstance().setTo_gps();
    GNSS_ID glonassId = new GNSS_ID();
    glonassId.setGnss_idToNewInstance().setTo_glonass();
    timeAssistList.add(gpsId);
    timeAssistList.add(glonassId);
    GNSS_ID galId = new GNSS_ID();
    galId.setGnss_idToNewInstance().setTo_galileo();
    timeAssistList.add(galId);

    GNSS_ReferenceTimeReq referenceTime = new GNSS_ReferenceTimeReq();
    referenceTime.setGnss_TimeReqPrefList(timeAssistList);

    GNSS_CommonAssistDataReq commonAssistance = new GNSS_CommonAssistDataReq();
    commonAssistance.setGnss_ReferenceTimeReq(referenceTime);
    commonAssistance.setGnss_ReferenceLocationReqToNewInstance();
    commonAssistance.setGnss_IonosphericModelReqToNewInstance();

    BitSet svReq = new BitSet(64);
    svReq.set(0, 63);

    // Prepare request for GPS assistance data
    GNSS_GenericAssistDataReqElement gpsElement = new GNSS_GenericAssistDataReqElement();
    gpsElement.setGnss_IDToNewInstance().setGnss_idToNewInstance().setTo_gps();
    gpsElement
        .setGnss_NavigationModelReqToNewInstance()
        .setReqNavListToNewInstance()
        .setSvReqListToNewInstance()
        .setValue(svReq);
    gpsElement.setGnss_RealTimeIntegrityReqToNewInstance();
    gpsElement.setGnss_AlmanacReqToNewInstance();
    gpsElement.setGnss_UTCModelReqToNewInstance();

    // Prepare request for GLONASS assistance data
    GNSS_GenericAssistDataReqElement glonassElement = new GNSS_GenericAssistDataReqElement();
    glonassElement.setGnss_IDToNewInstance().setGnss_idToNewInstance().setTo_glonass();
    glonassElement
        .setGnss_NavigationModelReqToNewInstance()
        .setReqNavListToNewInstance()
        .setSvReqListToNewInstance()
        .setValue(svReq);
    glonassElement.setGnss_RealTimeIntegrityReqToNewInstance();
    glonassElement.setGnss_AlmanacReqToNewInstance();
    glonassElement.setGnss_UTCModelReqToNewInstance();
    glonassElement.setGnss_AuxiliaryInformationReqToNewInstance();
    GNSS_TimeModelElementReq timeModel = new GNSS_TimeModelElementReq();
    timeModel.setGnss_TO_IDsReqToNewInstance().setLong(1);
    timeModel.setDeltaTreqToNewInstance().setValue(true);
    glonassElement.setGnss_TimeModelsReqToNewInstance().add(timeModel);

    // Prepare request for Galileo assistance data
    GNSS_GenericAssistDataReqElement galElement = new GNSS_GenericAssistDataReqElement();
    galElement.setGnss_IDToNewInstance().setGnss_idToNewInstance().setTo_galileo();
    galElement
        .setGnss_NavigationModelReqToNewInstance()
        .setReqNavListToNewInstance()
        .setSvReqListToNewInstance()
        .setValue(svReq);
    galElement.setGnss_RealTimeIntegrityReqToNewInstance();
    galElement.setGnss_AlmanacReqToNewInstance();
    galElement.setGnss_UTCModelReqToNewInstance();

    GNSS_GenericAssistDataReq genericAssistance = new GNSS_GenericAssistDataReq();
    genericAssistance.add(gpsElement);
    genericAssistance.add(glonassElement);
    genericAssistance.add(galElement);

    A_GNSS_RequestAssistanceData gnssAssistance = new A_GNSS_RequestAssistanceData();
    gnssAssistance.setGnss_CommonAssistDataReq(commonAssistance);
    gnssAssistance.setGnss_GenericAssistDataReq(genericAssistance);

    RequestAssistanceData_r9_IEs assistance = new RequestAssistanceData_r9_IEs();
    assistance.setCommonIEsRequestAssistanceDataToNewInstance().setPrimaryCellID(primaryCellId);
    assistance.setA_gnss_RequestAssistanceData(gnssAssistance);

    LPP_MessageBody messageBody = new LPP_MessageBody();
    messageBody
        .setC1ToNewInstance()
        .setRequestAssistanceDataToNewInstance()
        .setCriticalExtensionsToNewInstance()
        .setC1ToNewInstance()
        .setRequestAssistanceData_r9(assistance);

    LPP_Message message = new LPP_Message();
    message.setTransactionID(newTransactionId(4));
    message.setEndTransactionToNewInstance().setValue(false);
    message.setLpp_MessageBody(messageBody);

    return message;
  }

  private LPP_Message newProvideLocationMessage() {
    LPP_MessageBody messageBody = new LPP_MessageBody();
    messageBody
        .setC1ToNewInstance()
        .setProvideLocationInformationToNewInstance()
        .setCriticalExtensionsToNewInstance()
        .setC1ToNewInstance()
        .setProvideLocationInformation_r9ToNewInstance();

    LPP_Message message = new LPP_Message();
    message.setTransactionID(newTransactionId(4));
    message.setEndTransactionToNewInstance().setValue(false);
    message.setLpp_MessageBody(messageBody);

    return message;
  }

  private LPP_TransactionID newTransactionId(int id) {
    LPP_TransactionID transactionId = new LPP_TransactionID();

    TransactionNumber transactionNumber = new TransactionNumber();
    transactionNumber.setLong(id);
    transactionId.setTransactionNumber(transactionNumber);

    Initiator initiator = new Initiator();
    initiator.setTo_targetDevice();
    transactionId.setInitiator(initiator);

    return transactionId;
  }

  public byte[] encodeLpp(LPP_Message message) {
    logger.info("Encoding LPP Message \n" + message);
    PacketBuilder messageBuilder = new PacketBuilder();
    messageBuilder.appendAll(message.encodePerUnaligned());
    return messageBuilder.getPaddedBytes();
  }
}
