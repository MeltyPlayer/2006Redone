package server.net.packets;

import server.game.players.Client;

public interface PacketType {

  public void processPacket(Client c, int packetType, int packetSize);
}
