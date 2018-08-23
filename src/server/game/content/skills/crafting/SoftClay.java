package server.game.content.skills.crafting;

import server.event.CycleEvent;
import server.event.CycleEventContainer;
import server.event.CycleEventHandler;
import server.game.content.randomevents.RandomEventHandler;
import server.game.players.Client;

/**
 * Soft Clay
 * 
 * @author Andrew
 */

public class SoftClay {

  public static final int SOFT_CLAY = 1761, CLAY = 434;

  public static void makeClay(final Client client) {
    if (!client.getItemAssistant().playerHasItem(CLAY)) {
      client.getActionSender().sendMessage("You need clay to do this.");
      return;
    }
    CycleEventHandler.getSingleton().addEvent(client, new CycleEvent() {
      @Override
      public void execute(CycleEventContainer container) {
        int amountToSubtract = client.getItemAssistant().getItemAmount(CLAY);
        int amountToAdd = amountToSubtract;
        client.doAmount = amountToSubtract;
        client.addAmount = amountToAdd;
        if (client.getItemAssistant().playerHasItem(CLAY)) {
          client.getItemAssistant().deleteItem(CLAY, client.doAmount);
          client.doAmount--;
          client.getItemAssistant().addItem(SOFT_CLAY, client.addAmount);
          client.addAmount++;
          RandomEventHandler.addRandom(client);
          if (client.doAmount == 0) {
            client.getActionSender().sendMessage("You have ran out of clay to turn to soft clay.");
            container.stop();
          }
          if (client.disconnected) {
            container.stop();
          }
        }
      }

      @Override
      public void stop() {

      }
    }, 1);
  }

}
