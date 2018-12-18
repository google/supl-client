package com.google.location.lbs.gnss.gps.pseudorange.ephemeris;

import com.google.common.base.Preconditions;
import com.google.common.collect.ComparisonChain;
import com.google.location.lbs.common.gnss.GnssTime;
import com.google.location.lbs.common.gnss.TimeConstants;
import com.google.location.lbs.gnss.gps.pseudorange.Constants.BdsConstants;

/** A container for fields in Beidou ephemeris */
public class BdsEphemeris extends KeplerianEphemeris {

  /**
   * The group delay term (seconds) between B1 and B3 channels.
   *
   * <p>For B1 users, the satellite clock bias should include this term according to section
   * 5.2.4.10 in BDS-SIS-ICD-2.0.
   */
  public final double tgd1S;

  /**
   * The group delay term (seconds) between B2 and B3 channels.
   *
   * <p>For B2 users, the satellite clock bias should include this term according to section
   * 5.2.4.10 in BDS-SIS-ICD-2.0.
   */
  public final double tgd2S;

  /** Satellite user range accuracy (meters) */
  public final double accuracyM;

  /** Age of data, clock (AODC) defined in section 5.2.4.9 in BDS-SIS-ICD-2.0 */
  public final int aodc;

  private BdsEphemeris(Builder builder) {
    super(builder);
    accuracyM = builder.accuracyM;
    tgd1S = builder.tgd1S;
    tgd2S = builder.tgd2S;
    aodc = builder.aodc;
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
        (other instanceof BdsEphemeris), "Expecting the input to be an instance of BdsEphemeris");
    BdsEphemeris otherBdsEph = (BdsEphemeris) other;
    return ComparisonChain.start()
        .compare(week, otherBdsEph.week)
        .compare(keplerModel.toeS, otherBdsEph.keplerModel.toeS)
        .result();
  }

  @Override
  public GnssTime getTocInGnssTime() {
    return GnssTime.fromBdsWeekTowPicos(week, (long) (tocS * TimeConstants.PICOS_PER_SECOND));
  }

  @Override
  public GnssTime getToeInGnssTime() {
    return GnssTime.fromBdsWeekTowPicos(
        week, (long) (keplerModel.toeS * TimeConstants.PICOS_PER_SECOND));
  }

  @Override
  public double getGroupDelayS(double carrierFreqHz) {
    // Only for the computation of B1 channel
    return tgd1S;
  }

  @Override
  public boolean isExpired(GnssTime gnssTimeOfInterest) {
    return Math.abs(computeElapsedSecondsFromToe(gnssTimeOfInterest))
        > BdsConstants.BDS_EPH_VALID_PERIOD_SECONDS / 2;
  }

  /** Builder for {@link BdsEphemeris} */
  public static class Builder extends KeplerianEphemeris.Builder<Builder> {

    // For documentation, see corresponding fields in {@link BdsEphemeris}.
    private double tgd1S;
    private double tgd2S;
    private double accuracyM;
    private int aodc;

    private Builder() {}

    @Override
    public Builder getThis() {
      return this;
    }

    /** Sets the group delay term (seconds) between B1 and B3 channels. */
    public Builder setTgd1S(double tgd1S) {
      this.tgd1S = tgd1S;
      return getThis();
    }

    /** Sets the group delay term (seconds) between B2 and B3 channels. */
    public Builder setTgd2S(double tgd2S) {
      this.tgd2S = tgd2S;
      return getThis();
    }

    /** Sets the satellite user range accuracy (meters). */
    public Builder setAccuracyM(double accuracyM) {
      this.accuracyM = accuracyM;
      return getThis();
    }

    /** Sets the age of data, clock (AODC). */
    public Builder setAodc(int aodc) {
      this.aodc = aodc;
      return getThis();
    }

    /** Builds a {@link BdsEphemeris} object as specified by this builder. */
    public BdsEphemeris build() {
      return new BdsEphemeris(this);
    }
  }
}
