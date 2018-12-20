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

import static com.google.common.base.Preconditions.checkNotNull;

import com.google.location.suplclient.asn1.base.PacketBuilder;
import com.google.location.suplclient.asn1.supl2.supl_pos_init.NavigationModel;
import com.google.location.suplclient.asn1.supl2.supl_pos_init.RequestedAssistData;
import com.google.location.suplclient.asn1.supl2.supl_pos_init.SUPLPOSINIT;
import com.google.location.suplclient.asn1.supl2.supl_start.PosProtocol;
import com.google.location.suplclient.asn1.supl2.supl_start.PosTechnology;
import com.google.location.suplclient.asn1.supl2.supl_start.PrefMethod;
import com.google.location.suplclient.asn1.supl2.supl_start.SETCapabilities;
import com.google.location.suplclient.asn1.supl2.supl_start.SUPLSTART;
import com.google.location.suplclient.asn1.supl2.ulp.ULP_PDU;
import com.google.location.suplclient.asn1.supl2.ulp.UlpMessage;
import com.google.location.suplclient.asn1.supl2.ulp_components.CellInfo;
import com.google.location.suplclient.asn1.supl2.ulp_components.LocationId;
import com.google.location.suplclient.asn1.supl2.ulp_components.Position;
import com.google.location.suplclient.asn1.supl2.ulp_components.Position.timestampType;
import com.google.location.suplclient.asn1.supl2.ulp_components.PositionEstimate;
import com.google.location.suplclient.asn1.supl2.ulp_components.PositionEstimate.latitudeSignType;
import com.google.location.suplclient.asn1.supl2.ulp_components.SessionID;
import com.google.location.suplclient.asn1.supl2.ulp_components.SetSessionID;
import com.google.location.suplclient.asn1.supl2.ulp_components.Status;
import com.google.location.suplclient.asn1.supl2.ulp_components.Version;
import com.google.location.suplclient.asn1.supl2.ulp_components.WcdmaCellInformation;
import com.google.location.suplclient.asn1.supl2.ulp_version_2_parameter_extensions.GanssNavigationModelData;
import com.google.location.suplclient.asn1.supl2.ulp_version_2_parameter_extensions.GanssReqGenericData;
import com.google.location.suplclient.asn1.supl2.ulp_version_2_parameter_extensions.GanssRequestedGenericAssistanceDataList;
import com.google.location.suplclient.asn1.supl2.ulp_version_2_parameter_extensions.PosProtocolVersion3GPP;
import com.google.location.suplclient.asn1.supl2.ulp_version_2_parameter_extensions.Ver2_PosProtocol_extension;
import com.google.location.suplclient.asn1.supl2.ulp_version_2_parameter_extensions.Ver2_RequestedAssistData_extension;
import com.google.location.suplclient.supl.SuplConstants.UlpConstants;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.BitSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.TimeZone;
import java.util.logging.Logger;
import javax.annotation.Nullable;

/**
 * A class that generates several types of GPS SUPL client payloads that can be transmitted over a
 * GPS socket.
 *
 * <p>Two types of SUPL payloads are supported in this version: Local Location and WCDMA versions.
 * However, it should be straightforward to extend this class to support other types of SUPL
 * requests.
 */
abstract class SuplMessagesGenerator {

  protected static final Logger logger = Logger.getLogger(SuplMessagesGenerator.class.getName());

  /**
   * Generate a SUPL START message that can be send by the SUPL client to the server in the case
   * that device location is known via the WCDMA cell the device is connected to.
   *
   * <p>SUPL START is the first message to be send from the client to the server. The server should
   * response to the SUPL START message with a SUPL RESPONSE message containing a {@link SessionID}.
   *
   * <p>Filling the fields of the ULP_PDU to a WCDMA SUPLSTART packet are done following the field
   * contents from: /depot/google3/java/com/google/location/lbs/supl/tools/wcdma.supl
   *
   * @param mcc Mobile Country Code
   * @param mnc Mobile Network Code
   * @param uc cell identity
   * @param ipAddress
   */
  public ULP_PDU newSuplStartMessage(int mcc, int mnc, int uc, @Nullable InetAddress ipAddress) {
    UlpMessage message = newSuplStartMessage();

    // Set Location Details.
    LocationId locationId = message.getMsSUPLSTART().setLocationIdToNewInstance();
    CellInfo cellInfo = locationId.setCellInfoToNewInstance();
    WcdmaCellInformation wcdmaCellInfo = cellInfo.setWcdmaCellToNewInstance();
    wcdmaCellInfo.setRefMCCToNewInstance().setInteger(BigInteger.valueOf(mcc));
    wcdmaCellInfo.setRefMNCToNewInstance().setInteger(BigInteger.valueOf(mnc));
    wcdmaCellInfo.setRefUCToNewInstance().setInteger(BigInteger.valueOf(uc));

    locationId.setStatusToNewInstance().setValue(Status.Value.current);

    return createUlpPdu(message, ipAddress);
  }

  /**
   * Generate a SUPL START message that can be send by the SUPL client to the server in the case
   * that device location is known via a latitude and a longitude.
   *
   * <p>SUPL START is the first message to be sent from the client to the server. The server should
   * response to the SUPL START message with a SUPL RESPONSE message containing a {@link SessionID}.
   *
   * <p>Filling the fields of the ULP_PDU to a local location SUPLSTART packet are done following
   * the field contents from:
   * /depot/google3/java/com/google/location/lbs/supl/tools/local-location.supl
   */
  public ULP_PDU newSuplStartMessage(@Nullable InetAddress ipAddress) throws Exception {
    UlpMessage message = newSuplStartMessage();

    // Set Location Details.
    LocationId locationId = message.getMsSUPLSTART().setLocationIdToNewInstance();
    CellInfo cellInfo = locationId.setCellInfoToNewInstance();
    cellInfo.setExtensionVer2_CellInfo_extensionToNewInstance();
    // FF-FF-FF-FF-FF-FF
    final String macBinary = "111111111111111111111111111111111111111111111111";
    BitSet bits = new BitSet(macBinary.length());
    for (int i = 0; i < macBinary.length(); ++i) {
      if (macBinary.charAt(i) == '1') {
        bits.set(i);
      }
    }
    cellInfo
        .getExtensionVer2_CellInfo_extension()
        .setWlanAPToNewInstance()
        .setApMACAddressToNewInstance()
        .setValue(bits);
    locationId.setStatusToNewInstance().setValue(Status.Value.current);

    return createUlpPdu(message, ipAddress);
  }

  private UlpMessage newSuplStartMessage() {
    UlpMessage message = new UlpMessage();
    SUPLSTART suplStart = message.setMsSUPLSTARTToNewInstance();
    SETCapabilities setCapabilities = suplStart.setSETCapabilitiesToNewInstance();
    PosTechnology posTechnology = setCapabilities.setPosTechnologyToNewInstance();
    posTechnology.setAgpsSETassistedToNewInstance().setValue(false);
    posTechnology.setAgpsSETBasedToNewInstance().setValue(true);
    posTechnology.setAutonomousGPSToNewInstance().setValue(true);
    posTechnology.setAFLTToNewInstance().setValue(false);
    posTechnology.setECIDToNewInstance().setValue(false);
    posTechnology.setEOTDToNewInstance().setValue(false);
    posTechnology.setOTDOAToNewInstance().setValue(false);

    setCapabilities.setPrefMethodToNewInstance().setValue(PrefMethod.Value.agpsSETBasedPreferred);

    PosProtocol posProtocol = setCapabilities.setPosProtocolToNewInstance();
    posProtocol.setTia801ToNewInstance().setValue(false);
    posProtocol.setRrlpToNewInstance().setValue(true);
    posProtocol.setRrcToNewInstance().setValue(false);

    Ver2_PosProtocol_extension extension = new Ver2_PosProtocol_extension();
    posProtocol.setExtensionVer2_PosProtocol_extension(extension);
    extension.setLppToNewInstance().setValue(false);

    PosProtocolVersion3GPP lppVersion = extension.setPosProtocolVersionLPPToNewInstance();
    // The LPP version must be no less than 12, for the correctness of Galileo assistance data.
    lppVersion.setMajorVersionFieldToNewInstance().setLong(14);
    lppVersion.setTechnicalVersionFieldToNewInstance().setLong(1);
    lppVersion.setEditorialVersionFieldToNewInstance().setLong(0);

    PosProtocolVersion3GPP rrlpVersion = extension.setPosProtocolVersionRRLPToNewInstance();
    // The RRLP version must be no less than 12, for the correctness of Galileo assistance data.
    rrlpVersion.setMajorVersionFieldToNewInstance().setLong(14);
    rrlpVersion.setTechnicalVersionFieldToNewInstance().setLong(1);
    rrlpVersion.setEditorialVersionFieldToNewInstance().setLong(0);

    return message;
  }

  /**
   * Generate a SUPL POS INIT message that can be send by the SUPL client to the server in the case
   * that device location is known via the WCDMA cell the device is connected to.
   *
   * <p>SUPL POS INIT is the second message to be send from the client to the server after receiving
   * a SUPL RESPONSE containing a {@link SessionID} from the server. The {@link SessionID} received
   * from the server response should set in the SUPL POS INIT message.
   *
   * <p>Filling the fields of the ULP_PDU to a WCDMA SUPL POS INIT packet are done following the
   * field contents from: /depot/google3/java/com/google/location/lbs/supl/tools/wcdma.supl
   *
   * @param mcc Mobile Country Code
   * @param mnc Mobile Network Code
   * @param uc cell identity
   */
  public ULP_PDU newSuplPosInitMessage(SessionID sessionId, int mcc, int mnc, int uc) {
    UlpMessage message = newSuplPosInitMessage();
    SUPLPOSINIT suplPosInit = message.getMsSUPLPOSINIT();

    LocationId locationId = suplPosInit.setLocationIdToNewInstance();
    CellInfo cellInfo = locationId.setCellInfoToNewInstance();
    WcdmaCellInformation wcdmaCellInformation = cellInfo.setWcdmaCellToNewInstance();
    wcdmaCellInformation.setRefMCCToNewInstance().setInteger(BigInteger.valueOf(mcc));
    wcdmaCellInformation.setRefMNCToNewInstance().setInteger(BigInteger.valueOf(mnc));
    wcdmaCellInformation.setRefUCToNewInstance().setInteger(BigInteger.valueOf(uc));

    locationId.setStatusToNewInstance().setValue(Status.Value.current);

    return createUlpPdu(message, sessionId);
  }

  /**
   * Generate a SUPL POS INIT message that can be send by the SUPL client to the server in the case
   * that device location is known via a latitude and a longitude.
   *
   * <p>SUPL POS INIT is the second message to be send from the client to the server after receiving
   * a SUPL RESPONSE containing a {@link SessionID} from the server. The {@link SessionID} received
   * from the server response should set in the SUPL POS INIT message.
   *
   * <p>Filling the fields of the ULP_PDU to a local location SUPL POS INIT packet are done
   * following the field contents from:
   * /depot/google3/java/com/google/location/lbs/supl/tools/local-location.supl
   */
  public ULP_PDU newSuplPosInitMessage(SessionID sessionId, long latE7, long lngE7) {
    UlpMessage message = newSuplPosInitMessage();
    SUPLPOSINIT suplPosInit = message.getMsSUPLPOSINIT();

    LocationId locationId = suplPosInit.setLocationIdToNewInstance();
    CellInfo cellInfo = locationId.setCellInfoToNewInstance();
    cellInfo.setExtensionVer2_CellInfo_extensionToNewInstance();
    // FF-FF-FF-FF-FF-FF
    final String macBinary = "111111111111111111111111111111111111111111111111";
    BitSet bits = new BitSet(macBinary.length());
    for (int i = 0; i < macBinary.length(); ++i) {
      if (macBinary.charAt(i) == '1') {
        bits.set(i);
      }
    }
    cellInfo
        .getExtensionVer2_CellInfo_extension()
        .setWlanAPToNewInstance()
        .setApMACAddressToNewInstance()
        .setValue(bits);
    locationId.setStatusToNewInstance().setValue(Status.Value.current);

    Position pos = suplPosInit.setPositionToNewInstance();
    timestampType utcTime = pos.setTimestampToNewInstance();
    Calendar currentTime = GregorianCalendar.getInstance(TimeZone.getTimeZone("UTC"));
    utcTime.setYear(currentTime.get(Calendar.YEAR));
    utcTime.setMonth(currentTime.get(Calendar.MONTH) + 1); // Calendar's MONTH starts from 0.
    utcTime.setDay(currentTime.get(Calendar.DAY_OF_MONTH));
    utcTime.setHour(currentTime.get(Calendar.HOUR_OF_DAY));
    utcTime.setMinute(currentTime.get(Calendar.MINUTE));
    utcTime.setSecond(currentTime.get(Calendar.SECOND));

    PositionEstimate posEstimate = pos.setPositionEstimateToNewInstance();

    long latSuplFormat =
        (long) (Math.abs(latE7) / (UlpConstants.POSITION_ESTIMATE_LAT_SCALE_FACTOR * 1E7));
    long lngSuplFormat = (long) (lngE7 / (UlpConstants.POSITION_ESTIMATE_LNG_SCALE_FACTOR * 1E7));
    posEstimate.setLatitudeToNewInstance().setInteger(BigInteger.valueOf(latSuplFormat));
    posEstimate.setLongitudeToNewInstance().setInteger(BigInteger.valueOf(lngSuplFormat));
    posEstimate
        .setLatitudeSignToNewInstance()
        .setValue(latE7 > 0 ? latitudeSignType.Value.north : latitudeSignType.Value.south);

    message.setMsSUPLPOSINIT(suplPosInit);

    return createUlpPdu(message, sessionId);
  }

  private UlpMessage newSuplPosInitMessage() {
    UlpMessage message = new UlpMessage();
    SUPLPOSINIT suplPosInit = message.setMsSUPLPOSINITToNewInstance();
    SETCapabilities setCapabilities = suplPosInit.setSETCapabilitiesToNewInstance();
    PosTechnology posTechnology = setCapabilities.setPosTechnologyToNewInstance();
    posTechnology.setAgpsSETassistedToNewInstance().setValue(false);
    posTechnology.setAgpsSETBasedToNewInstance().setValue(true);
    posTechnology.setAutonomousGPSToNewInstance().setValue(true);
    posTechnology.setAFLTToNewInstance().setValue(false);
    posTechnology.setECIDToNewInstance().setValue(false);
    posTechnology.setEOTDToNewInstance().setValue(false);
    posTechnology.setOTDOAToNewInstance().setValue(false);

    setCapabilities.setPrefMethodToNewInstance().setValue(PrefMethod.Value.agpsSETBasedPreferred);

    PosProtocol posProtocol = setCapabilities.setPosProtocolToNewInstance();
    posProtocol.setTia801ToNewInstance().setValue(false);
    posProtocol.setRrlpToNewInstance().setValue(true);
    posProtocol.setRrcToNewInstance().setValue(false);

    RequestedAssistData reqAssistData = suplPosInit.setRequestedAssistDataToNewInstance();

    reqAssistData.setAlmanacRequestedToNewInstance().setValue(false);
    reqAssistData.setUtcModelRequestedToNewInstance().setValue(false);
    reqAssistData.setIonosphericModelRequestedToNewInstance().setValue(true);
    reqAssistData.setDgpsCorrectionsRequestedToNewInstance().setValue(false);
    reqAssistData.setReferenceLocationRequestedToNewInstance().setValue(true);
    reqAssistData.setReferenceTimeRequestedToNewInstance().setValue(true);
    reqAssistData.setAcquisitionAssistanceRequestedToNewInstance().setValue(true);
    reqAssistData.setRealTimeIntegrityRequestedToNewInstance().setValue(false);
    reqAssistData.setNavigationModelRequestedToNewInstance().setValue(true);
    NavigationModel navigationModelData = reqAssistData.setNavigationModelDataToNewInstance();
    navigationModelData.setGpsWeekToNewInstance().setInteger(BigInteger.ZERO);
    navigationModelData.setGpsToeToNewInstance().setInteger(BigInteger.ZERO);
    navigationModelData.setNSATToNewInstance().setInteger(BigInteger.ZERO);
    navigationModelData.setToeLimitToNewInstance().setInteger(BigInteger.ZERO);

    // Request GANSS assistance
    Ver2_RequestedAssistData_extension assistExtension = new Ver2_RequestedAssistData_extension();
    reqAssistData.setExtensionVer2_RequestedAssistData_extension(assistExtension);
    GanssRequestedGenericAssistanceDataList ganssRequestList =
        assistExtension.setGanssRequestedGenericAssistanceDataListToNewInstance();

    // Request GLONASS assistance
    GanssReqGenericData glonassRequest = new GanssReqGenericData();
    glonassRequest.setGanssIdToNewInstance().setLong(UlpConstants.ULP_GANSS_ID_GLO);
    glonassRequest.setGanssRealTimeIntegrityToNewInstance().setValue(false);
    glonassRequest.setGanssAlmanacToNewInstance().setValue(false);
    glonassRequest.setGanssUTCModelToNewInstance().setValue(false);
    glonassRequest.setGanssReferenceMeasurementInfoToNewInstance().setValue(false);
    glonassRequest.setGanssAuxiliaryInformationToNewInstance().setValue(true);
    GanssNavigationModelData navModel = glonassRequest.setGanssNavigationModelDataToNewInstance();
    navModel.setGanssToeToNewInstance().setInteger(BigInteger.ZERO);
    navModel.setGanssWeekToNewInstance().setInteger(BigInteger.ZERO);
    navModel.setT_toeLimitToNewInstance().setInteger(BigInteger.ZERO);
    ganssRequestList.add(glonassRequest);

    // Request Galileo assistance
    GanssReqGenericData galileoRequest = new GanssReqGenericData();
    galileoRequest.setGanssIdToNewInstance().setLong(UlpConstants.ULP_GANSS_ID_GAL);
    galileoRequest.setGanssRealTimeIntegrityToNewInstance().setValue(false);
    galileoRequest.setGanssAlmanacToNewInstance().setValue(false);
    galileoRequest.setGanssUTCModelToNewInstance().setValue(false);
    galileoRequest.setGanssReferenceMeasurementInfoToNewInstance().setValue(false);
    galileoRequest.setGanssAuxiliaryInformationToNewInstance().setValue(true);
    navModel = galileoRequest.setGanssNavigationModelDataToNewInstance();
    navModel.setGanssToeToNewInstance().setInteger(BigInteger.ZERO);
    navModel.setGanssWeekToNewInstance().setInteger(BigInteger.ZERO);
    navModel.setT_toeLimitToNewInstance().setInteger(BigInteger.ZERO);
    ganssRequestList.add(galileoRequest);

    return message;
  }

  /**
   * Generates SUPL POS/Assistance Ack message to acknowledge assistance data delivery using
   * underlying positioning protocol.
   */
  public abstract ULP_PDU newSuplPosAckMessage(SessionID sessionId);

  protected ULP_PDU createUlpPdu(UlpMessage message, SessionID sessionId) {
    return createUlpPdu(message, checkNotNull(sessionId), null /* ipAdddress */);
  }

  protected ULP_PDU createUlpPdu(UlpMessage message, @Nullable InetAddress ipAddress) {
    return createUlpPdu(message, null /* sessionId */, ipAddress);
  }

  protected ULP_PDU createUlpPdu(
      UlpMessage message, @Nullable SessionID sessionId, @Nullable InetAddress ipAddress) {
    ULP_PDU ulpPdu = new ULP_PDU();
    ulpPdu.setMessage(message);

    // Set the version of SUPL protocol
    // V2.1 or above is required for GLONASS assistance data
    Version version = ulpPdu.setVersionToNewInstance();
    version.setMajToNewInstance().setLong(2);
    version.setMinToNewInstance().setLong(1);
    version.setServindToNewInstance().setInteger(BigInteger.ZERO);
    ulpPdu.setVersion(version);

    if (sessionId == null) {
      sessionId = ulpPdu.setSessionIDToNewInstance();

      SetSessionID setSessionId = sessionId.setSetSessionIDToNewInstance();
      setSessionId
          .setSessionIdToNewInstance()
          .setInteger(BigInteger.valueOf(new Random().nextInt(65536)));
      if (ipAddress == null) {
        try {
          ipAddress = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
          throw new RuntimeException(e);
        }
      }
      byte[] ipAsbytes = ipAddress.getAddress();
      setSessionId
          .setSetIdToNewInstance()
          .setIPAddressToNewInstance()
          .setIpv4AddressToNewInstance()
          .setValue(ipAsbytes);
    }
    ulpPdu.setSessionID(sessionId);

    return ulpPdu;
  }

  /** Encodes a ULP_PDU message into bytes and sets the length field. */
  public byte[] encodeUlp(ULP_PDU message) {
    logger.info("Encoding ULP \n" + message);
    message.setLengthToNewInstance();
    message.getLength().setInteger(BigInteger.ZERO);
    PacketBuilder messageBuilder = new PacketBuilder();
    messageBuilder.appendAll(message.encodePerUnaligned());
    byte[] result = messageBuilder.getPaddedBytes();
    ByteBuffer buffer = ByteBuffer.wrap(result);
    buffer.order(ByteOrder.BIG_ENDIAN);
    buffer.putShort((short) result.length);
    return buffer.array();
  }
}
