package server.net.packets.impl;

import server.game.items.impl.HandleEmpty;
import server.game.players.Client;
import server.net.packets.PacketType;

/**
 * Item Click 2 Or Alternative Item Option 1
 * 
 * @author Ryan / Lmctruck30 Proper Streams
 */

public class ItemClick2 implements PacketType {

	@Override
	public void processPacket(Client c, int packetType, int packetSize) {
		int itemId = c.getInStream().readSignedWordA();

		if (!c.getItemAssistant().playerHasItem(itemId, 1)) {
			return;
		}

		if (HandleEmpty.canEmpty(c, itemId)) {
			HandleEmpty.handleEmptyItem(c, itemId,
					HandleEmpty.filledToEmpty(c, itemId));
			return;
		}

		switch (itemId) {
		}

	}

}
