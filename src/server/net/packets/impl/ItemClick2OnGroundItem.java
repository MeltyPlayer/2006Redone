package server.net.packets.impl;

import server.game.content.skills.firemaking.Firemaking;
import server.game.content.skills.firemaking.LogData;
import server.game.players.Client;
import server.net.packets.PacketType;

public class ItemClick2OnGroundItem implements PacketType {

  @Override
  public void processPacket(Client c, int packetType, int packetSize) {
    final int itemX = c.getInStream().readSignedWordBigEndian();
    final int itemY = c.getInStream().readSignedWordBigEndianA();
    final int itemId = c.getInStream().readUnsignedWordA();
    System.out.println("ItemClick2OnGroundItem - " + c.playerName + " - " + itemId + " - " + itemX + " - " + itemY);
    if (c.absX != itemX || c.absY != itemY) {
      c.getActionSender().sendMessage("You can't do that there!");
      return;
    }
    for (LogData l : LogData.values()) {
      if (itemId == l.getLogId()) {
        Firemaking.attemptGroundFire(c, itemId, itemX, itemY, true);
        return;
      }
    }
  }
}
