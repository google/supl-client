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

import com.google.common.base.Preconditions;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/**
 * A TCP client that is used to send and receive SUPL request and responses by the SUPL client. The
 * constructor establishes a connection to the SUPL server specified by a given address and port.
 */
final class SuplTcpConnection {

  private static final Logger logger = Logger.getLogger(SuplTcpConnection.class.getName());
  private static final int READ_TIMEOUT_MILLIS = (int) TimeUnit.SECONDS.toMillis(10);
  private static final short HEADER_SIZE = 2;
  /** BUFFER_SIZE data size that is enough to hold SUPL responses */
  private static final int RESPONSE_BUFFER_SIZE = 16384;

  private final ByteBuffer messageLengthReadBuffer =
      ByteBuffer.allocate(2).order(ByteOrder.BIG_ENDIAN);

  private Socket socket;
  private BufferedInputStream bufferedInputStream;

  public SuplTcpConnection(SuplConnectionRequest request) throws UnknownHostException, IOException {
    socket = createSocket(request);
    socket.setSoTimeout(READ_TIMEOUT_MILLIS);
    socket.setReceiveBufferSize(RESPONSE_BUFFER_SIZE);
    bufferedInputStream = new BufferedInputStream(socket.getInputStream());

    System.out.println("Connection established to " + socket.getOutputStream());
  }

  /** Sends a byte array of SUPL data to the server */
  public void sendSuplRequest(byte[] data) throws IOException {
    socket.getOutputStream().write(data);
  }

  /**
   * Reads SUPL server response and returns it as a byte array.
   *
   * <p>Upon the SUPL protocol, the size of the payload is stored in the first two bytes of the
   * response, hence these two bytes are read first followed by reading a payload of that size. Null
   * is returned if the size of the payload is not readable.
   */
  public byte[] getSuplResponse() throws IOException {
    byte[] buffer = new byte[RESPONSE_BUFFER_SIZE];
    int sizeOfRead = bufferedInputStream.read(buffer, 0, HEADER_SIZE);
    if (sizeOfRead == HEADER_SIZE) {
      messageLengthReadBuffer.clear();
      messageLengthReadBuffer.put(0, buffer[0]);
      messageLengthReadBuffer.put(1, buffer[1]);
      int messageLength = messageLengthReadBuffer.getShort(0);

      int bytesRead = sizeOfRead;
      while (bytesRead < messageLength) {
        sizeOfRead = bufferedInputStream.read(buffer, bytesRead, messageLength - bytesRead);
        Preconditions.checkState(
            sizeOfRead != -1,
            "Expected length of the messagte in bytes = "
                + messageLength
                + " while total number of bytes received = "
                + bytesRead);
        bytesRead = bytesRead + sizeOfRead;
      }
      return Arrays.copyOf(buffer, messageLength);
    } else {
      return null;
    }
  }

  /** Closes the TCP socket */
  public void closeSocket() throws IOException {
    socket.close();
  }

  private static Socket createSocket(SuplConnectionRequest request) throws IOException {
    String host = request.getServerHost();
    int port = request.getServerPort();
    logger.info("Connecting to " + host + " on port " + port);

    if (request.isSslEnabled()) {
      Preconditions.checkState(
          SuplConstants.SuplServerConstants.SSL_PORTS.contains(port),
          "An SSL connection is requested on a non SSL port, this should not happen.");
      SSLSocketFactory factory = (SSLSocketFactory) SSLSocketFactory.getDefault();
      SSLSocket sslSocket = (SSLSocket) factory.createSocket(host, port);
      sslSocket.startHandshake();
      return sslSocket;
    } else {
      Preconditions.checkState(
          SuplConstants.SuplServerConstants.NON_SSL_PORTS.contains(port),
          "A NON-SSL connection is requested on an SSL port, this should not happen.");
      return new Socket(host, port);
    }
  }
}
