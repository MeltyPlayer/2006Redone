import java.io.IOException;

import fileserver.FileServer;
import server.Server;

public class Main {
  public static void main(String args[]) {
    // TODO: Do this with just a single thread for safety/no need to fire up
    // server.
    Thread fileServerThread = new Thread() {
      @Override
      public void run() {
        try {
          FileServer fileServer = new FileServer();
          fileServer.start();
        } catch (Exception e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
      }
    };
    Thread serverThread = new Thread() {
      @Override
      public void run() {
        try {
          Server server = new Server();
          server.start();
        } catch (NullPointerException | IOException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
      }
    };
    Thread clientThread = new Thread(new ClientThread());
    fileServerThread.start();
    serverThread.start();
    clientThread.start();
  }
}
