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

import com.google.auto.value.AutoValue;

/**
 * Holds SUPL Connection request parameters.
 */
@AutoValue
public abstract class SuplConnectionRequest {
  public abstract String getServerHost();

  public abstract int getServerPort();

  public abstract boolean isSslEnabled();

  public abstract boolean isLoggingEnabled();

  public abstract boolean isMessageLoggingEnabled();

  public static Builder builder() {
    return new AutoValue_SuplConnectionRequest.Builder()
        .setMessageLoggingEnabled(false)
        .setLoggingEnabled(false)
        .setSslEnabled(false);
  }

  /**
   * Builder for {@link SuplConnectionRequest}.
   */
  @AutoValue.Builder
  public abstract static class Builder {
    public abstract Builder setServerHost(String host);

    public abstract Builder setServerPort(int port);

    public abstract Builder setSslEnabled(boolean enableSsl);

    public abstract Builder setLoggingEnabled(boolean enableLogging);

    public abstract Builder setMessageLoggingEnabled(boolean enableMessageLogging);

    public abstract SuplConnectionRequest build();
  }
}
