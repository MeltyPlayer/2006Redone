package server.net.packets.impl;

import server.game.players.Client;
import server.net.packets.PacketType;

/**
 * Slient Packet
 **/
public class SilentPacket implements PacketType {

  @Override
  public void processPacket(Client c, int packetType, int packetSize) {

  }
}
