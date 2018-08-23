package server.net.packets.impl;

import server.game.players.Client;
import server.net.packets.PacketType;

/**
 * Magic on items
 **/
public class MagicOnItems implements PacketType {

  @Override
  public void processPacket(Client player, int packetType, int packetSize) {
    int slot = player.getInStream().readSignedWord();
    int itemId = player.getInStream().readSignedWordA();
    player.getInStream().readSignedWord();
    int spellId = player.getInStream().readSignedWordA();
    if (!player.getItemAssistant().playerHasItem(itemId, 1, slot)) {
      return;
    }
    player.usingMagic = true;
    player.getPlayerAssistant().magicOnItems(slot, itemId, spellId);
    player.usingMagic = false;

  }

}
