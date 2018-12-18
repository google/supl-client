package com.google.location.lbs.gnss.suplclient;

import com.google.location.lbs.gnss.gps.pseudorange.ephemeris.EphemerisResponse;
import com.google.location.lbs.gnss.suplclient.Ephemeris.GpsNavMessageProto;

/**
 * SUPL Tester to verify SUPL connections.
 *
 */
public final class SuplTester {

  private static final String serverHost = "supl.google.com";

  private static final int serverPort = 7279;

  private static final boolean lppEnabled = true;
  private static final boolean sslEnabled = true;

  public static void main(String[] args) throws Exception {
    // Flags.parse(args);
    SuplTester tester = new SuplTester();
    // run step by step test
    tester.runStepByStepTcpClientTest();
  }

  /** Step by step test of the supl client */
  private void runStepByStepTcpClientTest() {
    SuplConnectionRequest request =
        SuplConnectionRequest.builder()
            .setServerHost(serverHost)
            .setServerPort(serverPort)
            .setLppEnabled(lppEnabled)
            .setSslEnabled(sslEnabled)
            .setMessageLoggingEnabled(true)
            .setLoggingEnabled(true)
            .build();
    SuplController suplController = new SuplController(request);
    long latE7 = 374220030;
    long lngE7 = -1220841890;
    // Try to call methods to access SUPL server and see if they report any exception
    suplController.sendSuplRequest(latE7, lngE7);
    GpsNavMessageProto gpsNavMsgProto = suplController.generateNavMessage(latE7, lngE7);
    EphemerisResponse ephResponse = suplController.generateEphResponse(latE7, lngE7);
  }
}
