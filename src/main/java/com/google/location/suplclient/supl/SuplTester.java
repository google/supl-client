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


import com.google.location.suplclient.ephemeris.EphemerisResponse;

/**
 * SUPL Tester to verify SUPL connections.
 *
 */
public final class SuplTester {

  private static final String serverHost = "supl.google.com";

  private static final int serverPort = 7275;

  private static final boolean sslEnabled = true;

  private static final boolean messageLoggingEnabled = true;

  private static final boolean loggingEnabled = true;

  private static final long latE7 = 374220030;

  private static final long lngE7 = -1220841890;

  public static void main(String[] args) throws Exception {
    SuplTester tester = new SuplTester();
    tester.runStepByStepTcpClientTest();
  }

  /** Step by step test of the supl client */
  private void runStepByStepTcpClientTest() {
    SuplConnectionRequest request =
        SuplConnectionRequest.builder()
            .setServerHost(serverHost)
            .setServerPort(serverPort)
            .setSslEnabled(sslEnabled)
            .setMessageLoggingEnabled(messageLoggingEnabled)
            .setLoggingEnabled(loggingEnabled)
            .build();
    SuplController suplController = new SuplController(request);
    // Try to call methods to access SUPL server and see if they report any exception
    suplController.sendSuplRequest(latE7, lngE7);
    EphemerisResponse ephResponse = suplController.generateEphResponse(latE7, lngE7);
  }
}
