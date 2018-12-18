package com.google.location.lbs.gnss.gps.pseudorange.ephemeris;

import com.google.location.lbs.gnss.suplclient.Ephemeris.IonosphericModelProto;
import java.util.List;

/** A container for GNSS satellite ephemeris and Ionospheric model parameters. */
public class EphemerisResponse {

  /* A list of ephemeris for GNSS satellites */
  public final List<GnssEphemeris> ephList;

  /* The parameters of the ionospheric model */
  public final IonosphericModelProto ionoProto;

  /* Constructor */
  public EphemerisResponse(List<GnssEphemeris> ephList, IonosphericModelProto ionoProto) {
    this.ephList = ephList;
    this.ionoProto = ionoProto;
  }
}
