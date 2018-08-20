package server.net.packets.impl;

import server.Server;
import server.event.CycleEvent;
import server.event.CycleEventContainer;
import server.event.CycleEventHandler;
import server.game.content.minigames.castlewars.CastleWars;
import server.game.content.music.sound.SoundList;
import server.game.content.skills.SkillHandler;
import server.game.content.skills.firemaking.Firemaking;
import server.game.content.skills.firemaking.LogData;
import server.game.items.ItemAssistant;
import server.game.items.impl.RareProtection;
import server.game.players.Client;
import server.net.packets.PacketType;
import server.util.GameLogger;
import server.world.GlobalDropsHandler;

/**
 * Pickup Item
 **/
public class PickupItem implements PacketType {

	@Override
	public void processPacket(final Client player, int packetType,
			int packetSize) {
		player.pItemY = player.getInStream().readSignedWordBigEndian();
		player.pItemId = player.getInStream().readUnsignedWord();
		player.pItemX = player.getInStream().readSignedWordBigEndian();
		if (Math.abs(player.getX() - player.pItemX) > 25
				|| Math.abs(player.getY() - player.pItemY) > 25) {
			player.resetWalkingQueue();
			return;
		}
		if (!Server.itemHandler.itemExists(player.pItemId, player.pItemX,
				player.pItemY)) {
			player.stopMovement();
			return;
		}
		player.getCombatAssistant().resetPlayerAttack();
		if (player.stopPlayerPacket) {
			return;
		}
		if (player.isBotting) {
			player.getActionSender().sendMessage(
					"You can't pickup items, until you confirm you aren't botting.");
			player.getActionSender().sendMessage(
					"If you need to you can type ::amibotting, to see if your botting.");
			return;
		}
		String itemName = ItemAssistant.getItemName(player.pItemId)
				.toLowerCase();
		if (player.getPlayerAssistant().isPlayer()) {
			GameLogger.writeLog(player.playerName, "pickupitem",
					player.playerName + " picked up " + itemName + " itemX: "
							+ player.pItemX + ", itemY: " + player.pItemY + "");
		}
		if (!CastleWars.deleteCastleWarsItems(player, player.pItemId)) {
			return;
		}
		if (!RareProtection.doOtherDupe(player, player.pItemId)) {
			return;
		}
		if (player.pItemY > 9817 && player.pItemY < 9825 && player.pItemX > 3186
				&& player.pItemX < 3197
				|| player.pItemX > 3107 && player.pItemX < 3113
						&& player.pItemY > 3155 && player.pItemY < 3159
						&& player.heightLevel == 2) {
			player.getActionSender()
					.sendMessage("You can't pick up these items!");
			return;
		}
		for (LogData logData : LogData.values()) {
			if (player.isFiremaking == true
					&& player.pItemId == logData.getLogId()) {
				player.getActionSender().sendMessage("You can't do that!");
				Firemaking.stopFiremaking = true;
				return;
			}
		}
		for (LogData logData : LogData.values()) {
			if (player.pItemId == logData.getLogId()) {
				Firemaking.pickedUpFiremakingLog = true;
			}
		}
		SkillHandler.resetSkills(player);
		player.getCombatAssistant().resetPlayerAttack();
		if (player.getX() == player.pItemX && player.getY() == player.pItemY
				|| player.getX() - 1 == player.pItemX
						&& player.getY() == player.pItemY
				|| player.getY() - 1 == player.pItemY
						&& player.getX() == player.pItemX
				|| player.getX() + 1 == player.pItemX
						&& player.getY() == player.pItemY
				|| player.getY() + 1 == player.pItemY
						&& player.getX() == player.pItemX) {
			Server.itemHandler.removeGroundItem(player, player.pItemId,
					player.pItemX, player.pItemY, true);
			player.getActionSender().sendSound(SoundList.ITEM_PICKUP, 100, 0);
			GlobalDropsHandler.pickup(player, player.pItemId, player.pItemX,
					player.pItemY);
		} else {
			player.walkingToItem = true;
			CycleEventHandler.getSingleton().addEvent(player, new CycleEvent() {
				@Override
				public void execute(CycleEventContainer container) {
					if (!player.walkingToItem) {
						container.stop();
					}
					if (player.getX() == player.pItemX
							&& player.getY() == player.pItemY
							&& player.walkingToItem) {
						Server.itemHandler.removeGroundItem(player,
								player.pItemId, player.pItemX, player.pItemY,
								true);
						container.stop();
					}
				}

				@Override
				public void stop() {
					player.walkingToItem = false;
				}
			}, 1);
		}
	}
}
