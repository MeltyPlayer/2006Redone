package server;

import java.io.IOException;
import java.net.InetSocketAddress;

import org.apache.mina.common.IoAcceptor;
import org.apache.mina.transport.socket.nio.SocketAcceptor;
import org.apache.mina.transport.socket.nio.SocketAcceptorConfig;

import server.event.CycleEventHandler;
import server.event.TaskScheduler;
import server.game.content.minigames.FightCaves;
import server.game.content.minigames.FightPits;
import server.game.content.minigames.PestControl;
import server.game.content.minigames.castlewars.CastleWars;
import server.game.content.minigames.trawler.Trawler;
import server.game.globalworldobjects.Doors;
import server.game.globalworldobjects.DoubleDoors;
import server.game.items.ItemDefinitions;
import server.game.npcs.NpcHandler;
import server.game.players.Client;
import server.game.players.Player;
import server.game.players.PlayerHandler;
import server.game.players.PlayerSave;
import server.game.shops.ShopHandler;
import server.net.ConnectionHandler;
import server.net.ConnectionThrottleFilter;
import server.util.HostBlacklist;
import server.world.ClanChatHandler;
import server.world.GlobalDropsHandler;
import server.world.ItemHandler;
import server.world.ObjectHandler;
import server.world.ObjectManager;
import server.world.clip.ObjectDef;
import server.world.clip.Region;

/**
 * Server.java
 * 
 * @author Sanity
 * @author Graham
 * @author Blake
 * @author Ryan Lmctruck30
 * @author Integration Julian.
 */
public class Server {

  public static int[] cannonsX = new int[50];
  public static int[] cannonsY = new int[50];
  public static String[] cannonsO = new String[50];
  public static boolean sleeping;
  public static final int cycleRate;
  public static boolean UpdateServer = false;
  public static long lastMassSave = System.currentTimeMillis();
  private static IoAcceptor acceptor;
  private static ConnectionHandler connectionHandler;
  private static ConnectionThrottleFilter throttleFilter;
  public static boolean shutdownServer = false;
  public static int garbageCollectDelay = 40;
  public static boolean shutdownClientHandler;
  public static int serverlistenerPort;
  public static ItemHandler itemHandler = new ItemHandler();
  public static PlayerHandler playerHandler = new PlayerHandler();
  public static NpcHandler npcHandler = new NpcHandler();
  public static ShopHandler shopHandler = new ShopHandler();
  public static ObjectHandler objectHandler = new ObjectHandler();
  public static ObjectManager objectManager = new ObjectManager();
  public static FightCaves fightCaves = new FightCaves();
  public static PestControl pestControl = new PestControl();
  public static Trawler trawler = new Trawler();
  private static final TaskScheduler scheduler = new TaskScheduler();
  public static ClanChatHandler clanChat = new ClanChatHandler();

  public static TaskScheduler getTaskScheduler() {
    return scheduler;
  }

  /**
   * Port and Cycle rate.
   */
  static {
    serverlistenerPort = 43594;
    cycleRate = 600;
    shutdownServer = false;
  }

  public void start() throws NullPointerException, IOException {
    if (Constants.SERVER_DEBUG) {
      System.out.println("@@@@ DEBUG MODE IS ENABLED @@@@");
    }

    /**
     * Starting Up Server
     */
    System.out.println("Launching " + Constants.SERVER_NAME + "...");

    /**
     * Accepting Connections
     */
    acceptor = new SocketAcceptor();
    connectionHandler = new ConnectionHandler();

    SocketAcceptorConfig sac = new SocketAcceptorConfig();
    sac.getSessionConfig().setTcpNoDelay(false);
    sac.setReuseAddress(true);
    sac.setBacklog(100);

    throttleFilter = new ConnectionThrottleFilter(Constants.CONNECTION_DELAY);
    sac.getFilterChain().addFirst("throttleFilter", throttleFilter);
    acceptor.bind(new InetSocketAddress(serverlistenerPort), connectionHandler, sac);

    /**
     * Initialise Handlers
     */
    ObjectDef.loadConfig();
    Region.load();
    Doors.getSingleton().load();
    DoubleDoors.getSingleton().load();
    ItemDefinitions.read();
    GlobalDropsHandler.initialize();
    Connection.initialize();
    HostBlacklist.loadBlacklist();

    /**
     * Server Successfully Loaded
     */
    System.out.println("Server listening on port 85.214.117.88: " + serverlistenerPort);

    /**
     * Main Server Tick
     */
    try {
      while (!Server.shutdownServer) {
        Thread.sleep(600);
        itemHandler.process();
        playerHandler.process();
        npcHandler.process();
        shopHandler.process();
        objectManager.process();
        CastleWars.process();
        FightPits.process();
        pestControl.process();
        CycleEventHandler.getSingleton().process();
        if (System.currentTimeMillis() - lastMassSave > 300000) {
          for (Player p : PlayerHandler.players) {
            if (p == null) {
              continue;
            }
            PlayerSave.saveGame((Client) p);
            System.out.println("Saved game for " + p.playerName + ".");
            lastMassSave = System.currentTimeMillis();
          }
        }
      }
    } catch (Exception ex) {
      ex.printStackTrace();
      System.out.println("A fatal exception has been thrown!");
      for (Player p : PlayerHandler.players) {
        if (p == null) {
          continue;
        }
        if (p.inTrade) {
          ((Client) p).getTrading().declineTrade();
        }
        if (p.duelStatus == 6) {
          ((Client) p).getDueling().claimStakedItems();
        }
        PlayerSave.saveGame((Client) p);
        System.out.println("Saved game for " + p.playerName + ".");
      }
    }
    acceptor = null;
    connectionHandler = null;
    sac = null;
    System.exit(0);
  }

  public static boolean playerExecuted = false;

}
