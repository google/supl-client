package com.google.location.lbs.gnss.suplclient;

import com.google.auto.value.AutoValue;

/**
 * Holds SUPL Connection request parameters.
 */
@AutoValue
public abstract class SuplConnectionRequest {
  public abstract String getServerHost();

  public abstract int getServerPort();

  public abstract boolean isLppEnabled();

  public abstract boolean isSslEnabled();

  public abstract boolean isLoggingEnabled();

  public abstract boolean isMessageLoggingEnabled();

  public static Builder builder() {
    return new AutoValue_SuplConnectionRequest.Builder()
        .setMessageLoggingEnabled(false)
        .setLoggingEnabled(false)
        .setLppEnabled(false)
        .setSslEnabled(false);
  }

  /**
   * Builder for {@link SuplConnectionRequest}.
   */
  @AutoValue.Builder
  public abstract static class Builder {
    public abstract Builder setServerHost(String host);

    public abstract Builder setServerPort(int port);

    public abstract Builder setLppEnabled(boolean enableLpp);

    public abstract Builder setSslEnabled(boolean enableSsl);

    public abstract Builder setLoggingEnabled(boolean enableLogging);

    public abstract Builder setMessageLoggingEnabled(boolean enableMessageLogging);

    public abstract SuplConnectionRequest build();
  }
}
