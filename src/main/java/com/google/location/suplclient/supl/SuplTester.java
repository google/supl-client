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

  private static final int serverPort = 7279;

  private static final boolean sslEnabled = true;

  public static void main(String[] args) throws Exception {
    SuplTester tester = new SuplTester();
    // run step by step test
    long a = TimeConstants.GAL_GPS_EPOCHS_OFFSET_WEEKS;

    tester.runStepByStepTcpClientTest();
  }

  /** Step by step test of the supl client */
  private void runStepByStepTcpClientTest() {
    SuplConnectionRequest request =
        SuplConnectionRequest.builder()
            .setServerHost(serverHost)
            .setServerPort(serverPort)
            .setSslEnabled(sslEnabled)
            .setMessageLoggingEnabled(true)
            .setLoggingEnabled(true)
            .build();
    SuplController suplController = new SuplController(request);
    long latE7 = 374220030;
    long lngE7 = -1220841890;
    // Try to call methods to access SUPL server and see if they report any exception
    suplController.sendSuplRequest(latE7, lngE7);
    EphemerisResponse ephResponse = suplController.generateEphResponse(latE7, lngE7);
  }
}
