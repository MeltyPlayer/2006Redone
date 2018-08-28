package server.net.packets.impl;

import server.ServerConstants;
import server.game.players.Client;
import server.net.packets.PacketType;

/**
 * Trading
 */

public class Trade implements PacketType {

  @Override
  public void processPacket(Client c, int packetType, int packetSize) {
    int tradeId = c.getInStream().readSignedWordBigEndian();
    c.getPlayerAssistant().resetFollow();
    if (c.disconnected) {
      c.tradeStatus = 0;
    }
    if (c.duelingArena()) {
      c.getActionSender().sendMessage("You can't trade inside the arena!");
      return;
    }

    if (c.playerRights == 2 && !ServerConstants.ADMIN_CAN_TRADE) {
      c.getActionSender().sendMessage("Trading as an admin has been disabled.");
      return;
    }

    if (tradeId < 1) {
      return;
    }
    if (tradeId != c.playerId) {
      c.getTrading().requestTrade(tradeId);
    }
  }

}
