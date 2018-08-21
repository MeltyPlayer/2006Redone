package client.network;
// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.

// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import client.RSApplet;

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
