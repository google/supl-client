package com.google.location.lbs.gnss.suplclient;

import com.google.location.lbs.asn1.base.PacketBuilder;
import com.google.location.lbs.asn1.supl2.rrlp_messages.PDU;
import com.google.location.lbs.asn1.supl2.supl_pos.PosPayLoad;
import com.google.location.lbs.asn1.supl2.supl_pos.SUPLPOS;
import com.google.location.lbs.asn1.supl2.ulp.ULP_PDU;
import com.google.location.lbs.asn1.supl2.ulp.UlpMessage;
import com.google.location.lbs.asn1.supl2.ulp_components.SessionID;
import com.google.location.lbs.asn1.supl2.ulp_components.Version;

import java.math.BigInteger;

/**
 * A class that generates several types of GPS SUPL client payloads that can be transmitted over a 
 * GPS socket.
 * 
 * <p>Two types of SUPL payloads are supported in this version: Local Location and WCDMA versions.
 * However, it should be straightforward to extend this class to support other types of SUPL 
 * requests. 
 */
final class SuplRrlpMessagesGenerator extends SuplMessagesGenerator {
  SuplRrlpMessagesGenerator() {}

  @Override
  public ULP_PDU newSuplPosAckMessage(SessionID sessionId) {
    ULP_PDU ulpPdu = new ULP_PDU();
    Version version = ulpPdu.setVersionToNewInstance();
    version.setMinToNewInstance().setInteger(BigInteger.ZERO);
    version.setMajToNewInstance().setInteger(BigInteger.valueOf(2));
    version.setServindToNewInstance().setInteger(BigInteger.ZERO);
    ulpPdu.setVersion(version);

    ulpPdu.setSessionID(sessionId);

    PDU pdu = new PDU();
    pdu.setReferenceNumberToNewInstance();
    pdu.getReferenceNumber().setInteger(BigInteger.ONE);
    pdu.setComponentToNewInstance();
    pdu.getComponent().setAssistanceDataAckToNewInstance();

    PacketBuilder payloadBuilder = new PacketBuilder();
    try {
      payloadBuilder.appendAll(pdu.encodePerUnaligned());
    } catch (IllegalArgumentException | IllegalStateException | IndexOutOfBoundsException
        | UnsupportedOperationException e) {
      throw new RuntimeException(e);
    }
    PosPayLoad.rrlpPayloadType rrlpPayload = new PosPayLoad.rrlpPayloadType();
    rrlpPayload.setValue(payloadBuilder.getPaddedBytes());

    UlpMessage message = new UlpMessage();
    SUPLPOS suplPos = message.setMsSUPLPOSToNewInstance();
    suplPos.setPosPayLoadToNewInstance();
    suplPos.getPosPayLoad().setRrlpPayload(rrlpPayload);

    ulpPdu.setMessage(message);

    return ulpPdu;
  }
}
