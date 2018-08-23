package server.net.packets.impl;

import server.game.players.Client;
import server.net.packets.PacketType;

public class Report implements PacketType {

  @Override
  public void processPacket(Client c, int packetType, int packetSize) {
    try {
      ReportHandler.handleReport(c);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
