package server.net.packets.impl;

import server.ServerConstants;
import server.Server;
import server.game.content.music.Music;
import server.game.globalworldobjects.Doors;
import server.game.players.Client;
import server.net.packets.PacketType;
import server.world.GlobalDropsHandler;

/**
 * Change Regions
 */
public class ChangeRegions implements PacketType {

  @Override
  public void processPacket(Client c, int packetType, int packetSize) {
    if (ServerConstants.SOUND && c.musicOn) {
      Music.playMusic(c);
    }
    Server.objectHandler.updateObjects(c);// testing
    Doors.getSingleton().load();
    Server.itemHandler.reloadItems(c);
    Server.objectManager.loadObjects(c);
    GlobalDropsHandler.load(c);
    c.getPlayerAssistant().removeObjects();// testing
    c.saveFile = true;
    if (c.skullTimer > 0) {
      c.isSkulled = true;
      c.headIconPk = 0;
      c.getPlayerAssistant().requestUpdates();
    }
  }
}
