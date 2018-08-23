package server.game.dialogues;

import server.game.players.Client;
import server.net.packets.PacketType;

/**
 * Dialogue
 **/

public class Dialogue implements PacketType {

  @Override
  public void processPacket(Client c, int packetType, int packetSize) {
    if (c.nextChat > 0) {
      c.getDialogueHandler().sendDialogues(c.nextChat, c.talkingNpc);
    } else {
      c.getDialogueHandler().sendDialogues(0, -1);
    }
  }
}
