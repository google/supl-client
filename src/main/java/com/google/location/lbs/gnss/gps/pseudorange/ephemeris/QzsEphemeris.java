package com.google.location.lbs.gnss.gps.pseudorange.ephemeris;

import com.google.common.base.Preconditions;
import com.google.common.collect.ComparisonChain;
import com.google.location.lbs.common.gnss.GnssTime;
import com.google.location.lbs.common.gnss.TimeConstants;
import com.google.location.lbs.gnss.gps.pseudorange.Constants.QzsConstants;

/** A container for fields in QZSS ephemeris */
public class QzsEphemeris extends KeplerianEphemeris {

  /** The group delay term (seconds) */
  public final double tgdS;

  /** Satellite user range accuracy (meters) */
  public final double accuracyM;

  /** The flag of the fit interval of the ephemeris: 0=2 hours, 1=more than 4 hours. */
  public final boolean fitIntvFlag;

  /** Issue of data, clock */
  public final int iodc;

  /** True if the QZS navigation data was commanded OFF on the P-code of the L2 channel */
  public final boolean l2PDataFlag;

  /** Codes on L2 channel: 1=P code ON, 2=C/A code ON, 0=Reserved. */
  public final int codeL2;

  private QzsEphemeris(Builder builder) {
    super(builder);
    accuracyM = builder.accuracyM;
    tgdS = builder.tgdS;
    fitIntvFlag = builder.fitIntvFlag;
    l2PDataFlag = builder.l2PDataFlag;
    codeL2 = builder.codeL2;
    iodc = builder.iodc;
  }

  /** Creates a builder with no fields set. */
  public static Builder newBuilder() {
    return new Builder();
  }

  @Override
  public int newerThan(GnssEphemeris other) {
    if (other == null) {
      return 1;
    }
    Preconditions.checkArgument(
        (other instanceof QzsEphemeris), "Expecting the input to be an instance of QzsEphemeris");
    QzsEphemeris otherQzsEph = (QzsEphemeris) other;
    return ComparisonChain.start()
        .compare(week, otherQzsEph.week)
        .compare(keplerModel.toeS, otherQzsEph.keplerModel.toeS)
        .result();
  }

  @Override
  public GnssTime getTocInGnssTime() {
    return GnssTime.fromGpsWeekTowPicos(week, (long) (tocS * TimeConstants.PICOS_PER_SECOND));
  }

  @Override
  public GnssTime getToeInGnssTime() {
    return GnssTime.fromGpsWeekTowPicos(
        week, (long) (keplerModel.toeS * TimeConstants.PICOS_PER_SECOND));
  }

  @Override
  public double getGroupDelayS(double carrierFreqHz) {
    return tgdS;
  }

  @Override
  public boolean isExpired(GnssTime gnssTimeOfInterest) {
    return Math.abs(computeElapsedSecondsFromToe(gnssTimeOfInterest))
        > QzsConstants.QZS_EPH_VALID_PERIOD_SECONDS / 2;
  }

  /** Builder for {@link QzsEphemeris} */
  public static class Builder extends KeplerianEphemeris.Builder<Builder> {

    // For documentation, see corresponding fields in {@link QzsEphemeris}.
    private double accuracyM;
    private double tgdS;
    private boolean fitIntvFlag;
    private boolean l2PDataFlag;
    private int codeL2;
    private int iodc;

    private Builder() {}

    @Override
    public Builder getThis() {
      return this;
    }

    /** Sets the satellite user range accuracy (meters). */
    public Builder setAccuracyM(double accuracyM) {
      this.accuracyM = accuracyM;
      return getThis();
    }

    /** Sets the group delay term (seconds). */
    public Builder setTgdS(double tgdS) {
      this.tgdS = tgdS;
      return getThis();
    }

    /** Sets the flag of the fit interval of the ephemeris: 0=4 hours, 1=more than 4 hours. */
    public Builder setFitIntvFlag(boolean fitIntvFlag) {
      this.fitIntvFlag = fitIntvFlag;
      return getThis();
    }

    /** Sets the flag of L2 P data. */
    public Builder setL2PDataFlag(boolean l2PDataFlag) {
      this.l2PDataFlag = l2PDataFlag;
      return getThis();
    }

    /** Sets the flag of codes on L2 channel. */
    public Builder setCodeL2(int codeL2) {
      this.codeL2 = codeL2;
      return getThis();
    }

    /** Sets the issue of data, clock. */
    public Builder setIodc(int iodc) {
      this.iodc = iodc;
      return getThis();
    }

    /** Builds a {@link QzsEphemeris} object as specified by this builder. */
    public QzsEphemeris build() {
      return new QzsEphemeris(this);
    }
  }
}
