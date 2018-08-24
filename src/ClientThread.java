import java.net.InetAddress;
import java.net.UnknownHostException;

import client.Signlink;

public class ClientThread implements Runnable {
  @Override
  public void run() {
    try {
      Game game = new Game();
      Game.nodeID = 10;
      Game.portOff = 0;
      Game.setHighMem();
      Game.isMembers = true;
      Signlink.storeid = 32;
      Signlink.startpriv(InetAddress.getLocalHost());
      game.createClientFrame(503, 765);
    } catch (UnknownHostException e) {
      e.printStackTrace();
    }
  }
}
