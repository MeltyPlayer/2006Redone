import client.Signlink;
import client.ui.Constants;
import common.CommonConstants;

public class ClientThread implements Runnable {
  @Override
  public void run() {
    Game game = new Game();
    Game.nodeID = 10;
    Game.portOff = 0;
    Game.setHighMem();
    Game.isMembers = true;
    Signlink.storeid = 32;
    Signlink.startpriv(CommonConstants.ADDRESS);
    game.createClientFrame(Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT);
  }
}
