package com.google.location.lbs.gnss.suplclient;

import com.google.location.lbs.gnss.gps.pseudorange.ephemeris.EphemerisResponse;
import com.google.location.lbs.gnss.suplclient.Ephemeris.GpsNavMessageProto;

/**
 * A class that applies the SUPL protocol call flow to obtain GPS assistance data over a TCP
 * connection.
 *
 * <p>A rough location of the receiver has to be known in advance which is passed to the method
 * {@link #generateNavMessage} to obtain a {@link GpsNavMessageProto} containing the GPS assistance
 * data.
 */
public class SuplController {
  private final SuplClient client;

  public SuplController(SuplConnectionRequest request) {
    this.client = request.isLppEnabled() ? new SuplLppClient(request) : new SuplRrlpClient(request);
  }

  /**
   * Applies the SUPL protocol call flow to obtain the assistance data and store the result in
   * {@link GpsNavMessageProto}.
   */
  public GpsNavMessageProto generateNavMessage(long latE7, long lngE7) {
    return client.generateNavMessage(latE7, lngE7);
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
