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
 * A class that applies the SUPL protocol call flow to obtain GPS assistance data over a TCP
 * connection.
 *
 * <p>A rough location of the receiver has to be known in advance which is passed to the method
 * {@link #generateEphResponse} to obtain a {@link EphemerisResponse} containing the GNSS assistance
 * data.
 */
public class SuplController {
  private final SuplClient client;

  public SuplController(SuplConnectionRequest request) {
    this.client = new SuplLppClient(request);
  }


  /**
   * Applies the SUPL protocol call flow to obtain the assistance data and store the result in
   * {@link EphemerisResponse}.
   */
  public EphemerisResponse generateEphResponse(long latE7, long lngE7) {
    return client.generateSuplResult(latE7, lngE7);
  }

  /** Sends a new SUPL request for the provided lat/lng pair. */
  public void sendSuplRequest(long latE7, long lngE7) {
    client.sendSuplRequest(latE7, lngE7);
  }
}
