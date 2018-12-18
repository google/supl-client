package com.google.location.lbs.gnss.suplclient;

import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Preconditions.checkState;

import com.google.location.lbs.asn1.supl2.supl_pos.SUPLPOS;
import com.google.location.lbs.asn1.supl2.ulp.ULP_PDU;
import com.google.location.lbs.asn1.supl2.ulp_components.SessionID;
import com.google.location.lbs.gnss.gps.pseudorange.ephemeris.EphemerisResponse;
import com.google.location.lbs.gnss.suplclient.Ephemeris.GpsNavMessageProto;
import java.util.logging.Logger;

/**
 * A class that applies the SUPL protocol call flow to obtain GPS assistance data over a TCP
 * connection.
 *
 * <p>A rough location of the receiver has to be known in advance which is passed to the method
 * {@link #generateNavMessage} to obtain a {@link GpsNavMessageProto} containing the GPS assistance
 * data.
 *
 * <p>The SUPL protocol flow is made over a TCP socket to a server specified via constructor params.
 *
 * <p>TODO(gomo): add unit tests for both LPP and RRLP client implemenations.
 */
abstract class SuplClient {

  protected static final Logger logger = Logger.getLogger(SuplClient.class.getName());

  protected final SuplConnectionRequest request;

  public SuplClient(SuplConnectionRequest request) {
    this.request = request;
  }

  /**
   * Applies the SUPL protocol call flow to obtain the assistance data and store the result in a
   * {@link GpsNavMessageProto}.
   */
  public final GpsNavMessageProto generateNavMessage(long latE7, long lngE7) {
    try {
      SUPLPOS message = sendSuplRequest(latE7, lngE7);
      return message != null ? buildNavMessageProto(message) : null;
    } catch (Exception e) {
      e.printStackTrace();
      return GpsNavMessageProto.getDefaultInstance();
    }
  }

  /**
   * Applies the SUPL protocol call flow to obtain the assistance data and store the result in
   * {@link EphemerisResponse}.
   *
   * <p>A null will be returned if Supl communication fails or if parsing the received message
   * fails.
   */
  public final EphemerisResponse generateSuplResult(long latE7, long lngE7) {
    try {
      SUPLPOS message = sendSuplRequest(latE7, lngE7);
      return message != null ? suplPosToEphResponse(message) : null;
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }

  /**
   * Sends a new SUPL request for provided lat/lng pair and returns {@link SUPLPOS} message for
   * assistance data processing.
   */
  public final SUPLPOS sendSuplRequest(long latE7, long lngE7) {
    try {
      // Establishes a TCP socket that is used to send and receive SUPL messages
      SuplTcpConnection tcpClient = new SuplTcpConnection(request);

      SuplMessagesGenerator messagesGenerator = getSuplMessagesGenerator();

      // Send a SUPL START message from the client to server
      ULP_PDU suplStartMessage = messagesGenerator.newSuplStartMessage(null);
      tcpClient.sendSuplRequest(messagesGenerator.encodeUlp(suplStartMessage));
      logMessage("SUPL START sent to server", suplStartMessage);

      // Receive a SUPL RESPONSE from the server and obtain the Session ID send by the server
      byte[] response = tcpClient.getSuplResponse();
      checkNotNull(response, "SUPL Response null");
      ULP_PDU suplResponseMessage = ULP_PDU.fromPerUnaligned(response);
      checkState(suplResponseMessage.getMessage().isMsSUPLRESPONSE());
      logMessage("SUPL RESPONSE received from server", suplResponseMessage);
      SessionID sessionId = suplResponseMessage.getSessionID();

      ULP_PDU suplPosInitMessage = messagesGenerator.newSuplPosInitMessage(sessionId, latE7, lngE7);
      tcpClient.sendSuplRequest(messagesGenerator.encodeUlp(suplPosInitMessage));
      logMessage("SUPL POS INIT sent to server", suplPosInitMessage);

      // Receive a SUPL POS message from the server containing all the assitance data requested
      response = tcpClient.getSuplResponse();
      checkNotNull(response, "SUPL POS null");

      ULP_PDU suplPosMessage = ULP_PDU.fromPerUnaligned(response);
      checkState(suplPosMessage.getMessage().isMsSUPLPOS());
      logMessage("SUPL POS received from server", suplPosMessage);
      SUPLPOS suplPos = suplPosMessage.getMessage().getMsSUPLPOS();
      validateAssistanceData(suplPos);

      ULP_PDU posAckMessage = messagesGenerator.newSuplPosAckMessage(sessionId);
      tcpClient.sendSuplRequest(messagesGenerator.encodeUlp(posAckMessage));
      logMessage("SUPL POS ACK sent to server", posAckMessage);

      // Receive a SUPL END message from the server indicating successful completion.
      response = tcpClient.getSuplResponse();
      checkNotNull(response, "SUPL END null");
      ULP_PDU suplEndMessage = ULP_PDU.fromPerUnaligned(response);
      if (!suplEndMessage.getMessage().isMsSUPLEND()) {
        logger.info("Unexpected message...Ignored.\n" + suplEndMessage);
      } else {
        logMessage("SUPL END received from server", suplEndMessage);
      }

      logger.info("SUPL Script finished successfully!");

      tcpClient.closeSocket();

      return suplPos;
    } catch (Exception e) {
      logger.warning("SUPL Script failed.");
      e.printStackTrace();
      return null;
    }
  }

  private void logMessage(String log, ULP_PDU message) {
    if (request.isMessageLoggingEnabled()) {
      logger.info(log + "Message: \n" + message);
    } else if (request.isLoggingEnabled()) {
      logger.info(log);
    }
  }

  /** Subclasses should implement this method to return specific {@link SuplMessagesGenerator}. */
  protected abstract SuplMessagesGenerator getSuplMessagesGenerator();

  /** Validates assistance data received as part of this message. */
  protected abstract void validateAssistanceData(SUPLPOS message);

  /** Fills {@link GpsNavMessageProto} with the assistance data obtained in SUPL POS message */
  protected abstract GpsNavMessageProto buildNavMessageProto(SUPLPOS message);

  /**
   * Builds an instance of {@link EphemerisResponse} with the assistance data from the values stored
   * in the input {@link SUPLPOS}.
   */
  protected abstract EphemerisResponse suplPosToEphResponse(SUPLPOS message);
}
