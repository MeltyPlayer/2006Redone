package server.net.packets.impl;

import server.game.players.Client;
import server.net.packets.PacketType;

/**
 * @author Andrew
 */

public class IdleLogout implements PacketType {

  @Override
  public void processPacket(Client player, int packetType, int packetSize) {
    if (player.underAttackBy > 0 || player.underAttackBy2 > 0) {
      return;
    } else {
      player.logout();
      // Misc.println(player.playerName + " is idle, kicked.");
    }
  }
}
