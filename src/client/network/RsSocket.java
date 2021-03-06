package client.network;

// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public interface RsSocket extends Runnable {

  public void close();

  public int read() throws IOException;

  public int available() throws IOException;

  public void flushInputStream(byte abyte0[], int j) throws IOException;

  public void queueBytes(int i, byte abyte0[]) throws IOException;

  @Override
  public void run();

  public void printDebug();
}
