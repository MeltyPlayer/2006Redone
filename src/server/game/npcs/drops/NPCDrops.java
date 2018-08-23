package server.game.npcs.drops;

/**
 * Npc Drops
 * 
 * @author Andrew (I'm A Boss on Rune-Server, Mr Extremez on Moparscape &
 *         Runelocus)
 */

public class NPCDrops extends NPCDropsHandler {

  public static final int[][] DEFAULT = { { i("bones"), 1, ALWAYS }, { 995, r(10), COINSRATE } };

  public static final int[][] rivertroll = { { i("bones"), 1, ALWAYS }, { 405, 1, COMMON },
      { i("spinach roll"), 1, COMMON }, { i("fishing bait"), 1 + r(49), UNCOMMON }, { 985, 1, RARE }, { 987, 1, RARE },
      { i("feather"), 2 + r(3), COMMON }, { 151, 1, UNCOMMON }, { i("raw tuna"), 1, UNCOMMON },
      { i("raw salmon"), 1, UNCOMMON }, { i("raw trout"), 1, UNCOMMON }, { i("raw herring"), 1, UNCOMMON },
      { i("raw pike"), 1, UNCOMMON }, { i("raw sardine"), 1, UNCOMMON }, { i("raw shrimps"), 1, UNCOMMON },
      { i("raw anchovies"), 1, UNCOMMON }, { i("raw swordfish"), 1, UNCOMMON }, { i("raw shark"), 1, UNCOMMON } };

  public static final int[][] darkbeast = { { i("rune 2h sword"), 1, UNCOMMON }, { i("black 2h sword"), 1, COMMON },
      { i("black battleaxe"), 1, COMMON }, { i("black axe"), 1, UNCOMMON }, { i("rune battleaxe"), 1, RARE },
      { i("adamant sq shield"), 1, COMMON }, { i("rune chainbody"), 1, UNCOMMON }, { i("rune full helm"), 1, RARE },
      { i("rune sq shield"), 1, RARE }, { i("chaos rune"), 10, COMMON }, { i("blood rune"), 7, COMMON },
      { i("air rune"), 47, UNCOMMON }, { i("death rune"), 3 + r(2), UNCOMMON }, { i("law rune"), 3, UNCOMMON },
      { 995, 64 + r(2936), COMMON }, { 121, 1, UNCOMMON }, { 385, 1 + r(1), UNCOMMON },
      { i("death talisman"), 1, UNCOMMON }, { i("adamant bar"), 1, UNCOMMON }, { 199, 1 + r(1), COMMON },
      { 201, 1 + r(1), COMMON }, { 203, 1 + r(1), COMMON }, { 205, 1 + r(1), UNCOMMON }, { 207, 1 + r(1), UNCOMMON },
      { 209, 1 + r(1), UNCOMMON }, { 211, 1 + r(1), UNCOMMON }, { 215, 1 + r(1), UNCOMMON },
      { 2485, 1 + r(1), UNCOMMON }, { 213, 1 + r(1), UNCOMMON }, { 217, 1 + r(1), UNCOMMON }, };

  public static final int[][] ogre = { { i("big bones"), 1, ALWAYS }, { i("strawberry seed"), 1, UNCOMMON },
      { i("avantoe seed"), 1, UNCOMMON }, { i("belladonna seed"), 1, UNCOMMON }, { 5282, 1, UNCOMMON },
      { i("cadantine seed"), 1, UNCOMMON }, { i("cactus seed"), 1, UNCOMMON }, { i("harralander seed"), 1, UNCOMMON },
      { i("irit seed"), 1, UNCOMMON }, { i("jangerberry seed"), 1, UNCOMMON }, { i("limpwurt seed"), 1, UNCOMMON },
      { i("poison ivy seed"), 1, UNCOMMON }, { i("spirit weed seed"), 1, UNCOMMON },
      { i("tarromin seed"), 1, UNCOMMON }, { i("toadflax seed"), 1, UNCOMMON }, { i("wildblood seed"), 1, UNCOMMON },
      { i("whiteberry seed"), 1, UNCOMMON }, { i("marentill seed"), 1, UNCOMMON }, { i("ranarr seed"), 1, RARE },
      { i("dwarf weed seed"), 1, RARE }, { i("lantadyme seed"), 1, RARE }, { i("watermelon seed"), 1, RARE },
      { i("kwuarm seed"), 1, RARE } };

  public static final int[][] shade = { { 546, 1, COMMON }, { 548, 1, COMMON } };

  public static final int[][] babybluedragon = { { i("babydragon bones"), 1, ALWAYS } };

  public static final int[][] bear = { { 526, 1, ALWAYS }, { i("bear fur"), 1, ALWAYS },
      { i("raw bear meat"), 1, ALWAYS } };

  public static final int[][] monk = { { 526, 1, ALWAYS }, { 542, 1, RARE }, { 544, 1, RARE } };

  public static final int[][] tzhaarxil = { { 6522, 9 + r(11), RARE }, { 6523, 1, RARE }, { 6525, 1, RARE },
      { 6524, 1, RARE }, { 6568, 1, RARE }, { 161, 1, UNCOMMON }, { 149, 1, UNCOMMON }, { 167, 1, UNCOMMON },
      { i("tokkul"), 100 + r(1400), COMMON }, { i("lobster"), 1, UNCOMMON } };

  public static final int[][] tzhaarket = { { 6527, 1, RARE }, { i("fire battlestaff"), 1, RARE }, { 6524, 1, RARE },
      { 6568, 1, RARE }, { 167, 1, UNCOMMON }, { 161, 1, UNCOMMON }, { i("tokkul"), 100 + r(1800), COMMON },
      { i("lobster"), 1, UNCOMMON }, { i("chilli potato"), 1 + r(1), UNCOMMON }, { i("pure essence"), 5, VERY_RARE } };

  public static final int[][] tzhaarhur = { { i("gold ore"), 1, COMMON }, { 443, 1 + r(1), COMMON },
      { 1762, 3, UNCOMMON }, { i("steel bar"), 1, UNCOMMON }, { i("tokkul"), 150 + r(650), COMMON },
      { i("molten glass"), 2, UNCOMMON }, { 149, 1, UNCOMMON }, { 161, 1, UNCOMMON }, { 1780, 4 + r(8), UNCOMMON },
      { i("battlestaff"), 1, RARE }, { 1744, 3, RARE }, { i("leather"), 3, RARE }, { 1738, 2 + r(6), RARE },
      { 7937, 2 + r(4), RARE }, { i("lobster"), 1, RARE } };

  public static final int[][] thief = { { 526, 1, ALWAYS }, { 199, 1, COMMON }, { 201, 1, COMMON }, { 203, 1, COMMON },
      { 205, 1, COMMON }, { 207, 1, UNCOMMON }, { 209, 1, VERY_RARE }, { 211, 1, VERY_RARE }, { 213, 1, VERY_RARE },
      { 217, 1, VERY_RARE }, { 2485, 1, VERY_RARE }, { i("bronze arrow"), 3 + r(5), UNCOMMON },
      { i("staff of air"), 1, UNCOMMON }, { i("iron knife"), 3 + r(7), UNCOMMON }, { i("chaos rune"), 3 + r(5), RARE },
      { i("mind rune"), 5 + r(5), VERY_RARE }, { i("earth rune"), 5 + r(5), VERY_RARE },
      { i("fire rune"), 5 + r(5), VERY_RARE }, { 995, 3 + r(22), COMMON }, { i("earth talisman"), 1, RARE },
      { i("copper ore"), 1, RARE } };

  public static final int[][] tzhaarmej = { { i("fire battlestaff"), 1, UNCOMMON }, { i("staff of fire"), 1, UNCOMMON },
      { 6568, 1, RARE }, { 6526, 1, VERY_RARE }, { i("earth rune"), 10 + r(70), COMMON },
      { i("fire rune"), 10 + r(70), COMMON }, { i("air rune"), 10 + r(70), UNCOMMON },
      { i("water rune"), 10 + r(70), UNCOMMON }, { i("choas rune"), 5 + r(5), UNCOMMON },
      { i("nature rune"), 1 + r(7), UNCOMMON }, { i("law rune"), 2 + r(3), UNCOMMON },
      { i("death rune"), 1 + r(5), RARE }, { i("blood rune"), 1 + r(5), RARE }, { i("smoke rune"), 1 + r(9), RARE },
      { i("lava rune"), 1 + r(39), RARE }, { i("fire talisman"), 1, VERY_RARE }, { i("tokkul"), 1 + r(699), COMMON },
      { i("pure essence"), 4 + r(6), COMMON } };

  public static final int[][] watchman = { { i("bones"), 1, ALWAYS }, { i("bread"), 1, COMMON }, };

  public static final int[][] treespirit = { { i("knife"), 1, ALWAYS }, { i("bronze axe"), 1, COMMON },
      { i("iron axe"), 1, COMMON }, { i("steel axe"), 1, COMMON }, { i("black axe"), 1, UNCOMMON },
      { i("mithril axe"), 1, UNCOMMON }, { i("adamant axe"), 1, UNCOMMON + r(50) }, { i("rune axe"), 1, RARE },
      { i("nature rune"), 5 + r(23), COMMON }, { i("banana"), 1, COMMON }, { i("uncut ruby"), 1, UNCOMMON },
      { i("uncut emerald"), 1, UNCOMMON }, { i("uncut diamond"), 1, RARE }, { i("uncut sapphire"), 1, UNCOMMON },
      { i("rune javelin"), 5, UNCOMMON }, { i("rune spear"), 1, RARE }, { i("dragon spear"), 1, VERY_RARE },
      { i("cactus seed"), 1, COMMON }, { i("poison ivy seed"), 1, COMMON }, { i("belladonna seed"), 1, COMMON },
      { i("kwuarm seed"), 1, COMMON }, { i("half of a key"), 1, RARE }, { i("nature talisman"), 1, UNCOMMON },
      { i("shield left half"), 1, VERY_RARE }, { 199, 1, COMMON }, { 3049, 1, UNCOMMON }, { 3051, 1, RARE },
      { 211, 1, UNCOMMON } };

  public static final int[][] cockatrice = { { 526, 1, ALWAYS }, { i("iron sword"), 1, COMMON },
      { i("steel dagger"), 1, COMMON }, { i("steel longsword"), 1, COMMON }, { i("iron javelin"), 5, UNCOMMON },
      { i("steel platelegs"), 1, UNCOMMON }, { 4097, 1, RARE }, { i("iron boots"), 1, RARE },
      { i("rune med helm"), 1, VERY_RARE }, { i("rune chainbody"), 1, VERY_RARE },
      { i("water rune"), 1 + r(1), COMMON }, { i("fire rune"), 7, COMMON }, { i("nature rune"), 2 + r(4), COMMON },
      { i("law rune"), 2 + r(1), COMMON }, { i("death rune"), 50, UNCOMMON }, { 199, 1, COMMON }, { 201, 1, COMMON },
      { 203, 1, COMMON }, { 205, 1, COMMON }, { 209, 1, COMMON }, { 211, 1, COMMON }, { 207, 1, RARE },
      { 213, 1, RARE }, { 215, 1, RARE }, { 2485, 1, RARE }, { 217, 1, VERY_RARE }, { i("potato seed"), 4, COMMON },
      { i("onion seed"), 4, COMMON }, { i("cabbage seed"), 4, COMMON }, { i("tomato seed"), 3, COMMON },
      { i("asgarnian seed"), 2, COMMON }, { i("yanillian seed"), 2, COMMON }, { i("sweetcorn seed"), 3, COMMON },
      { i("strawberry seed"), 2, COMMON }, { i("watermelon seed"), 2, RARE }, { i("ranarr seed"), 1, RARE },
      { i("marigold seed"), 1, RARE }, { 995, 1 + r(308), COMMON }, { i("limpwurt root"), 1, COMMON },
      { i("mithril ore"), 1, RARE } };

  public static final int[][] unicorn = { { i("bones"), 1, ALWAYS }, { i("unicorn horn"), 1, ALWAYS } };

  public static final int[][] giantrat = { { i("bones"), 1, ALWAYS }, { 2134, 1, ALWAYS } };

  public static final int[][] jogre = { { i("jogre bones"), 1, ALWAYS }, { i("bronze spear"), 1, COMMON },
      { i("iron spear"), 1, COMMON }, { i("steel javelin"), 3 + r(2), UNCOMMON },
      { i("nature rune"), 2 + r(8), COMMON }, { i("knife"), 1, COMMON }, { i("pineapple"), 2, COMMON },
      { 6306, 22, COMMON }, { 995, 22, COMMON }, { 3125, 1, COMMON }, { i("big bones"), 1 + r(5), COMMON },
      { 526, 1 + r(1), COMMON }, { i("banana"), 1, UNCOMMON }, { i("limpwurt seed"), 1, COMMON },
      { i("marentill seed"), 1, COMMON }, { i("tarromin seed"), 1, COMMON }, { i("harralander seed"), 1, UNCOMMON },
      { i("strawberry sed"), 1, UNCOMMON }, { i("watermelon seeed"), 1, UNCOMMON },
      { i("wildblood seed"), 1, UNCOMMON }, { i("toadflax seed"), 1, UNCOMMON }, { i("avantoe seed"), 1, UNCOMMON },
      { i("cactus seed"), 1, UNCOMMON }, { i("jangerberry seed"), 1, UNCOMMON }, { i("whiteberry seed"), 1, UNCOMMON },
      { i("belladonna seed"), 1, UNCOMMON }, { 5282, 1, UNCOMMON }, { i("poison ivy seed"), 1, UNCOMMON },
      { i("kwuarm seed"), 1, UNCOMMON }, { i("cadantine seed"), 1, UNCOMMON }, { i("ranarr seed"), 1, RARE },
      { i("lantadyme seed"), 1, RARE }, { i("dwarf weed seed"), 1, RARE }, { 1533, 1, COMMON }, { 1525, 1, COMMON },
      { 203, 1, COMMON }, { 201, 1, COMMON }, { 205, 1, UNCOMMON }, { 207, 1, UNCOMMON }, { 209, 1, UNCOMMON },
      { 217, 1, RARE }, { 2485, 1, RARE } };

  public static final int[][] blackdemon = { { i("steel battleaxe"), 1, COMMON }, { i("black axe"), 1, COMMON },
      { i("black sword"), 1, COMMON }, { i("black 2h sword"), 1, COMMON }, { i("rune battleaxe"), 1, RARE },
      { i("rune 2h sword"), 1, VERY_RARE }, { i("black full helm"), 1, COMMON }, { i("mithril kiteshield"), 1, COMMON },
      { i("rune med helm"), 1, RARE }, { i("rune full helm"), 1, RARE }, { i("rune chainbody"), 1, RARE },
      { i("rune sq shield"), 1, RARE }, { i("air rune"), 50 + r(25), COMMON }, { i("blood rune"), 7, UNCOMMON },
      { i("fire rune"), 37 + r(3), COMMON }, { i("chaos rune"), 10, COMMON }, { i("law rune"), 3 + r(42), COMMON },
      { i("adamant bar"), 1, COMMON }, { 454, 20, RARE }, { 995, 132 + r(968), COMMON }, { i("lobster"), 1, UNCOMMON },
      { 133, 1, UNCOMMON }, { 199, 1, COMMON }, { 201, 1, COMMON }, { 203, 1, COMMON }, { 205, 1, COMMON },
      { 207, 1, UNCOMMON }, { 209, 1, UNCOMMON }, { 211, 1, UNCOMMON }, { 213, 1, UNCOMMON }, { 215, 1, UNCOMMON },
      { 2485, 1, RARE }, { 217, 1, RARE }, { i("ashes"), 1, ALWAYS } };

  public static final int[][] firegiant = { { i("big bones"), 1, ALWAYS }, { i("steel axe"), 1, COMMON },
      { i("fire battlestaff"), 1, UNCOMMON }, { i("rune scimitar"), 1, RARE }, { i("mithril sq shield"), 1, COMMON },
      { i("rune arrow"), 12, UNCOMMON }, { i("fire rune"), 37 + r(167), COMMON }, { i("chaos rune"), 5, UNCOMMON },
      { i("blood rune"), 5, UNCOMMON }, { i("law rune"), 2 + r(2), UNCOMMON }, { 199, 1, COMMON }, { 201, 1, COMMON },
      { 203, 1, COMMON }, { 211, 1, COMMON }, { 205, 1, UNCOMMON }, { 207, 1, UNCOMMON }, { 209, 1, UNCOMMON },
      { 215, 1, UNCOMMON }, { 217, 1, UNCOMMON }, { 995, 15 + r(345), COMMON }, { i("lobster"), 1, UNCOMMON },
      { i("steel bar"), 1, UNCOMMON }, { 117, 1, UNCOMMON } };

  public static final int[][] evilchicken = { { i("raw chicken"), 1, ALWAYS }, { 526, 1, ALWAYS },
      { i("feather"), 32 + r(718), ALWAYS } };

  public static final int[][] pyrefiend = { { i("fire rune"), 30 + r(60), COMMON }, { i("chaos rune"), 12, COMMON },
      { i("law rune"), 1, UNCOMMON }, { i("death rune"), 3, UNCOMMON }, { i("steel full helm"), 1, COMMON },
      { i("staff of fire"), 1, COMMON }, { i("steel axe"), 1, COMMON }, { i("steel battleaxe"), 1, UNCOMMON },
      { i("steel arrow"), 1, UNCOMMON }, { i("mithril chainbody"), 1, UNCOMMON }, { i("steel boots"), 1, RARE },
      { i("adamant med helm"), 1, RARE }, { 995, 10 + r(464), COMMON }, { i("gold ore"), 1, COMMON },
      { i("jug of wine"), 1, UNCOMMON } };

  public static final int[][] jelly = { { i("choas rune"), 15, UNCOMMON }, { i("death rune"), 5, UNCOMMON },
      { i("water rune"), 5 + r(16), RARE }, { i("blood rune"), 7, RARE }, { i("steel battleaxe"), 1, COMMON },
      { i("steel 2h sword"), 1, COMMON }, { i("mithril kiteshield"), 1, UNCOMMON }, { i("mithril boots"), 1, UNCOMMON },
      { i("rune full helm"), 1, RARE }, { i("steel platebody"), 1, RARE }, { i("rune battleaxe"), 1, VERY_RARE },
      { 995, 11 + r(486), COMMON }, { i("gold bar"), 1, UNCOMMON }, { i("thread"), 10, RARE } };

  public static final int[][] rockslug = { { i("earth rune"), 5 + r(37), COMMON }, { i("pure essence"), 1, COMMON },
      { i("chaos rune"), 2 + r(3), UNCOMMON }, { i("tin ore"), 1, COMMON }, { i("copper ore"), 1, COMMON },
      { i("bronze bar"), 1, COMMON }, { i("iron ore"), 1, COMMON }, { i("iron bar"), 1, COMMON },
      { i("coal"), 1, COMMON }, { i("mithril ore"), 1, UNCOMMON }, { i("potato seed"), 4, COMMON },
      { i("onion seed"), 4, COMMON }, { i("cabbage seed"), 4, COMMON }, { i("tomato seed"), 3, UNCOMMON },
      { i("sweetcorn seed"), 3, UNCOMMON }, { 5308, 3, UNCOMMON }, { i("strawberry seed"), 2, RARE },
      { i("watermelon seed"), 2, RARE }, { i("hammer"), 1, COMMON }, { i("dwarven stout"), 1, COMMON },
      { 995, 23, UNCOMMON }, { 4115, 1, RARE } };

  public static final int[][] kurask = { { i("bones"), 1, ALWAYS }, { i("nature rune"), 5 + r(25), UNCOMMON },
      { i("death rune"), 1 + r(5), UNCOMMON }, { i("mind rune"), 4 + r(12), UNCOMMON },
      { i("mithril axe"), 1, UNCOMMON }, { i("broad arrow"), 1 + r(9), UNCOMMON }, { i("rune longsword"), 1, RARE },
      { i("adamant platebody"), 1, UNCOMMON }, { i("mithril kiteshield"), 1, UNCOMMON }, { 4111, 1, VERY_RARE },
      { i("white berries"), 1, COMMON }, { i("limpwurt root"), 2, COMMON }, { 199, 1, COMMON }, { 201, 1, COMMON },
      { 203, 1, COMMON }, { 205, 1, COMMON }, { 209, 1, UNCOMMON }, { 211, 1, UNCOMMON }, { 213, 1, UNCOMMON },
      { 215, 1, UNCOMMON }, { 217, 1, UNCOMMON }, { 207, 1, RARE }, { 2485, 1, RARE }, { i("irit seed"), 1, UNCOMMON },
      { i("cactus seed"), 1, UNCOMMON }, { i("toadflax seed"), 1, UNCOMMON }, { i("poison ivy seed"), 1, UNCOMMON },
      { i("avantoe seed"), 1, UNCOMMON }, { i("kwuarm seed"), 1, UNCOMMON }, { i("cadantine seed"), 1, UNCOMMON },
      { i("belladonna seed"), 1, UNCOMMON }, { i("lantadyme seed"), 1, UNCOMMON }, { i("snapdragon seed"), 1, RARE },
      { i("dwarf weed seed"), 1, RARE }, { i("torstol seed"), 1, VERY_RARE }, { i("plain pizza"), 1, UNCOMMON },
      { i("banana"), 1 + r(1), COMMON }, { 2115, 2 + r(6), COMMON }, { 995, 22 + r(726), COMMON },
      { 1780, 20 + r(10), COMMON }, { 161, 1, COMMON }, { 173, 1, UNCOMMON }, { i("bones"), 1 + r(1), UNCOMMON },
      { i("big bones"), 1 + r(1), UNCOMMON } };

  public static final int[][] earthwarrior = { { 199, 1, COMMON }, { 201, 1, COMMON }, { 203, 1, COMMON },
      { 205, 1, COMMON }, { 207, 1, UNCOMMON }, { 209, 1, UNCOMMON }, { 211, 1, UNCOMMON }, { 213, 1, UNCOMMON },
      { 215, 1, RARE }, { 2485, 1, RARE }, { 217, 1, RARE }, { i("earth rune"), 12 + r(48), COMMON },
      { i("law rune"), 2, COMMON }, { i("nature rune"), 3 + r(3), COMMON }, { i("chaos rune"), 3, UNCOMMON },
      { i("death rune"), 2, UNCOMMON }, { i("blood rune"), 2, RARE }, { i("air rune"), 45, VERY_RARE },
      { i("fire rune"), 6, VERY_RARE }, { i("limpwurt seed"), 1, COMMON }, { i("jangerberry seed"), 1, COMMON },
      { i("marrentill seed"), 1, COMMON }, { 5282, 1, COMMON }, { i("strawberry seed"), 1, COMMON },
      { i("tarromin seed"), 1, COMMON }, { i("toadflax seed"), 1, COMMON }, { i("wildblood seed"), 1, COMMON },
      { i("belladonna seed"), 1, UNCOMMON }, { i("harralander seed"), 1, UNCOMMON }, { i("irit seed"), 1, UNCOMMON },
      { i("avantoe seed"), 1, RARE }, { i("cactus seed"), 1, RARE }, { i("dwarf weed seed"), 1, RARE },
      { i("kwuarm seed"), 1, RARE }, { i("lantadyme seed"), 1, RARE }, { i("poison ivy seed"), 1, RARE },
      { i("ranarr seed"), 1, RARE }, { i("cadantine seed"), 1, VERY_RARE }, { i("snapdragon seed"), 1, VERY_RARE },
      { 995, 1 + r(478), COMMON }, { i("steel spear"), 1, COMMON }, { i("staff of earth"), 1, UNCOMMON } };

  public static final int[][] basilisk = { { i("bones"), 1, ALWAYS }, { i("water rune"), 75 + r(100), COMMON },
      { i("nature rune"), 15 + r(30), UNCOMMON }, { i("chaos rune"), 12, UNCOMMON }, { i("law rune"), 3, UNCOMMON },
      { i("steel battleaxe"), 1, COMMON }, { i("mithril spear"), 1, UNCOMMON }, { i("mithril axe"), 1, UNCOMMON },
      { i("mithril kiteshield"), 1, UNCOMMON }, { i("rune dagger"), 1, UNCOMMON },
      { i("adamant full helm"), 1, UNCOMMON }, { 4109, 1, RARE }, { 4117, 1, VERY_RARE }, { 199, 1, COMMON },
      { 201, 1, COMMON }, { 203, 1, COMMON }, { 205, 1, COMMON }, { 207, 1 + r(1), COMMON }, { 209, 1, RARE },
      { 2485, 1, RARE }, { 211, 1, RARE }, { 215, 1, RARE }, { 213, 1, RARE }, { 217, 1, RARE } };

  public static final int[][] abberantspectre = { { i("belladonna seed"), 1, COMMON }, { i("cactus seed"), 1, COMMON },
      { i("irit seed"), 1, COMMON }, { i("toadflax seed"), 1, COMMON }, { i("avantoe seed"), 1, COMMON },
      { i("cadantine seed"), 1, UNCOMMON }, { i("kwuarm seed"), 1, UNCOMMON }, { i("poison ivy seed"), 1, UNCOMMON },
      { i("lantadyme seed"), 1, UNCOMMON }, { i("dwarf weed seed"), 1, RARE }, { i("snapdragon seed"), 1, RARE },
      { i("torstol seed"), 1, VERY_RARE }, { 199, 1 + r(2), COMMON }, { 201, 1 + r(2), COMMON },
      { 203, 1 + r(2), COMMON }, { 205, 1 + r(2), COMMON }, { 207, 1 + r(2), COMMON }, { 209, 1 + r(2), COMMON },
      { 211, 1 + r(2), COMMON }, { 213, 1 + r(2), COMMON }, { 5302, 1 + r(2), UNCOMMON }, { 215, 1 + r(2), UNCOMMON },
      { 217, 1 + r(2), UNCOMMON }, { 3051, 1 + r(1), VERY_RARE }, { i("steel axe"), 1, UNCOMMON },
      { i("mithril kiteshield"), 1, UNCOMMON }, { i("lava battlestaff"), 1, UNCOMMON },
      { i("adamant platelegs"), 1, UNCOMMON }, { i("rune full helm"), 1, RARE }, { 4103, 1, RARE },
      { 995, 278 + r(209), UNCOMMON } };

  public static final int[][] turoth = { { i("bones"), 1, ALWAYS }, { i("mithril axe"), 1, COMMON },
      { i("steel platelegs"), 1, COMMON }, { i("mithril kiteshield"), 1, COMMON },
      { i("adamant full helm"), 1, UNCOMMON }, { i("rune dagger"), 1, UNCOMMON }, { 4113, 1, RARE },
      { i("law rune"), 3, COMMON }, { i("nature rune"), 15 + r(30), UNCOMMON }, { i("poision ivy seed"), 1, COMMON },
      { i("cactus seed"), 1, COMMON }, { i("belladonna seed"), 1, COMMON }, { i("toadflax seed"), 1, COMMON },
      { i("irit seed"), 1, COMMON }, { i("snapdragon seed"), 1, UNCOMMON }, { i("cadantine seed"), 1, UNCOMMON },
      { i("avantoe seed"), 1, UNCOMMON }, { i("kwuarm seed"), 1, UNCOMMON }, { i("lantadyme seed"), 1, RARE },
      { i("dwarf weed seed"), 1, RARE }, { i("ranarr seed"), 1, RARE }, { i("torstol seed"), 1, VERY_RARE },
      { 199, 1 + r(2), COMMON }, { 201, 1 + r(2), COMMON }, { 203, 1 + r(2), COMMON }, { 205, 1 + r(2), COMMON },
      { 207, 1 + r(2), UNCOMMON }, { 209, 1 + r(2), UNCOMMON }, { 211, 1 + r(2), UNCOMMON },
      { 213, 1 + r(2), UNCOMMON }, { 5302, 1 + r(2), RARE }, { 217, 1 + r(2), RARE }, { 215, 1 + r(2), RARE },
      { 995, 44 + r(396), COMMON }, { i("limpwurt root"), 1, COMMON } };

  public static final int[][] elfwarrior = { { i("bones"), 1, ALWAYS }, { i("water rune"), 70, COMMON },
      { i("fire rune"), 37, UNCOMMON }, { i("law rune"), 1 + r(2), UNCOMMON }, { i("nature rune"), 12, UNCOMMON },
      { i("mithril spear"), 1, COMMON }, { i("rune dagger"), 1, UNCOMMON }, { i("mithril kiteshield"), 1, COMMON },
      { 1099, 1, COMMON }, { 1135, 1, COMMON }, { 1065, 1, COMMON }, { i("adamant med helm"), 1, UNCOMMON },
      { i("rune med helm"), 1, RARE }, { i("bass"), 1, UNCOMMON }, { i("shark"), 1, UNCOMMON },
      { i("lobster"), 1, UNCOMMON }, { i("sea turtle"), 1, RARE }, { i("manta ray"), 1, VERY_RARE },
      { i("kwuarm seed"), 1, UNCOMMON }, { i("irit seed"), 1, UNCOMMON }, { i("avantoe seed"), 1, UNCOMMON },
      { i("toadflax seed"), 1, UNCOMMON }, { i("poison ivy seed"), 1, UNCOMMON }, { i("belladonna seed"), 1, UNCOMMON },
      { i("cadantine seed"), 1, UNCOMMON }, { i("dwarf weed seed"), 1, UNCOMMON }, { i("cactus seed"), 1, UNCOMMON },
      { i("lantadyme seed"), 1, RARE }, { i("snapdragon seed"), 1, RARE }, { 199, 1, COMMON }, { 201, 1, COMMON },
      { 203, 1, COMMON }, { 205, 1, COMMON }, { 209, 1, COMMON }, { 211, 1, COMMON }, { 213, 1, COMMON },
      { 215, 1, RARE }, { 2485, 1, RARE }, { 207, 1, RARE }, { 217, 1, RARE }, { 995, 20 + r(407), COMMON },
      { i("adamantite ore"), 1, UNCOMMON } };

  public static final int[][] man = { { 526, 1, ALWAYS }, { 995, 1 + r(39), COMMON }, { i("water rune"), 7, UNCOMMON },
      { i("earth rune"), 4, UNCOMMON }, { i("fire rune"), 6, UNCOMMON }, { i("mind rune"), 9, UNCOMMON },
      { i("bronze arrow"), 7, UNCOMMON }, { i("iron dagger"), 1, UNCOMMON }, { i("bronze full helm"), 1, UNCOMMON },
      { i("air talisman"), 1, UNCOMMON }, { i("earth talisman"), 1, UNCOMMON }, { i("fishing bait"), 1, UNCOMMON },
      { i("copper ore"), 1, UNCOMMON }, { i("tin ore"), 1, UNCOMMON }, { i("chaos rune"), 2, RARE },
      { i("body rune"), 7, RARE }, { i("staff of air"), 1, RARE + r(5) }, { 199, 1, COMMON }, { 201, 1, UNCOMMON },
      { 203, 1, UNCOMMON }, { 205, 1, UNCOMMON }, { 207, 1, UNCOMMON }, { 213, 1, UNCOMMON }, { 209, 1, UNCOMMON },
      { 211, 1, RARE }, { 215, 1, RARE }, { 217, 1, RARE }, { 2485, 1, RARE } };

  public static final int[][] dagannoth = { { 526, 1, ALWAYS }, { i("bronze spear"), 1, COMMON },
      { i("bronze axe"), 1, COMMON }, { i("iron spear"), 1, COMMON }, { i("mithril spear"), 1, UNCOMMON },
      { i("cactus seed"), 1, COMMON }, { i("poison ivy seed"), 1, COMMON }, { i("belladonna seed"), 1, COMMON },
      { i("irit seed"), 1, COMMON }, { i("avantoe seed"), 1, COMMON }, { i("toadflax seed"), 1, COMMON },
      { i("ranarr seed"), 1, UNCOMMON }, { i("cadantine seed"), 1, UNCOMMON }, { i("kwuarm seed"), 1, UNCOMMON },
      { i("lantadyme seed"), 1, UNCOMMON }, { i("dwarf weed seed"), 1, UNCOMMON },
      { i("snapdragon seed"), 1, UNCOMMON }, { i("torstol seed"), 1, UNCOMMON }, { i("steel arrow"), 15, COMMON },
      { i("mithril javelin"), 2 + r(2), UNCOMMON }, { i("harpoon"), 1, COMMON }, { i("lobster pot"), 1, COMMON },
      { i("fishing bait"), 50, COMMON }, { i("feather"), 15, COMMON }, { i("raw sardine"), 5, COMMON },
      { i("raw herring"), 4, COMMON }, { 402, 10, COMMON }, { 411, 1 + r(1), COMMON }, { i("raw lobster"), 1, COMMON },
      { i("raw tuna"), 1, UNCOMMON }, { 995, 1 + r(84), COMMON }, { i("water rune"), 15 + r(15), COMMON },
      { 46, 12, COMMON }, { 405, 1, UNCOMMON }, { 45, 12, UNCOMMON } };

  public static final int[][] chaoselemental = { { i("rune sword"), 1, UNCOMMON }, { i("dragon 2h sword"), 1, RARE },
      { i("iron arrow"), 500 + r(500), COMMON }, { i("mithril dart"), 400, COMMON }, { i("rune arrow"), 200, COMMON },
      { i("air rune"), 500, UNCOMMON }, { i("chaos rune"), 250 + r(2250), COMMON }, { i("death rune"), 500, RARE },
      { i("blood rune"), 500, RARE }, { 119, 1, COMMON }, { 2446, 1, COMMON }, { 125, 1, COMMON }, { 137, 1, COMMON },
      { 2289, 3, COMMON }, { 361, 5, COMMON }, { 464, 1 + r(5), COMMON }, { i("shark"), 10, COMMON },
      { 187, 1, UNCOMMON }, { 2003, 10, UNCOMMON }, { 6689, 4 + r(2), UNCOMMON }, { 995, 3000 + r(9000), UNCOMMON },
      { i("bones"), 4, COMMON }, { i("bat bones"), 5, COMMON }, { i("big bones"), 3, COMMON },
      { i("dragon bones"), 1, UNCOMMON }, { i("babydragon bones"), 1 + r(1), UNCOMMON },
      { i("wildblood seed"), 1 + r(2), COMMON }, { i("avantoe seed"), 1 + r(2), UNCOMMON },
      { i("limpwurt seed"), 1 + r(2), UNCOMMON }, { i("strawberry seed"), 1 + r(2), UNCOMMON },
      { i("tarromin seed"), 1 + r(2), UNCOMMON }, { i("ranarr seed"), 1 + r(2), UNCOMMON },
      { i("toadflax seed"), 1 + r(2), UNCOMMON }, { i("jangerberry seed"), 1 + r(2), UNCOMMON },
      { i("irit seed"), 1 + r(2), UNCOMMON }, { i("poison ivy seed"), 1 + r(2), UNCOMMON },
      { i("marrentill seed"), 1 + r(2), UNCOMMON }, { i("cactus seed"), 1 + r(2), UNCOMMON },
      { i("kwuarm seed"), 1 + r(2), UNCOMMON }, { i("harralander seed"), 1 + r(2), UNCOMMON },
      { i("belladonna seed"), 1 + r(2), UNCOMMON }, { i("cadantine seed"), 1 + r(2), UNCOMMON },
      { i("whiteberry seed"), 1 + r(2), COMMON }, { i("lantadyme seed"), 1, RARE } };

  public static final int[][] dagannothsupereme = { { i("dragon bones"), 1, ALWAYS }, { i("steel bar"), 5, ALWAYS },
      { i("adamant axe"), 1, UNCOMMON }, { i("rune longsword"), 1, RARE }, { i("fremennik blade"), 1, RARE },
      { i("rune battleaxe"), 1, RARE }, // fremennik
                                        // blade
                                        // not
                                        // tradeable
      { i("rune 2h sword"), 1, RARE }, { i("seercull"), 1, RARE }, { i("dragon axe"), 1, RARE },
      { i("iron arrow"), 218 + r(372), COMMON }, { i("steel arrow"), 54 + r(44), COMMON },
      { i("iron knife"), 214 + r(286), UNCOMMON }, { i("steel knife"), 54 + r(36), UNCOMMON },
      { i("mithril knife"), 31 + r(38), UNCOMMON }, { i("rune throwing axe"), 7, UNCOMMON },
      { i("rune javelin"), 1 + r(9), UNCOMMON }, { 2489, 1, UNCOMMON }, { i("spined body"), 1, UNCOMMON },
      { i("spined chaps"), 1, UNCOMMON }, { i("fremennik shield"), 1, UNCOMMON }, { i("fremennik helm"), 1, UNCOMMON }, // fremennik
                                                                                                                        // shield
                                                                                                                        // +
                                                                                                                        // helm
                                                                                                                        // not
                                                                                                                        // tradeable
      { i("archer helm"), 1, RARE }, { i("archers' ring"), 1, RARE }, { i("shark"), 5, UNCOMMON },
      { i("belladonna seed"), 1, UNCOMMON }, { i("cactus seed"), 1, UNCOMMON }, { i("poison ivy seed"), 1, UNCOMMON },
      { i("irit seed"), 1, UNCOMMON }, { i("toadflax seed"), UNCOMMON }, { i("avantoe seed"), 1, UNCOMMON },
      { i("kwuarm seed"), 1, RARE }, { i("cadantine seed"), 1, RARE }, { i("lantadyme seed"), 1, RARE },
      { i("dwarf weed seed"), 1, RARE }, { i("air talisman"), 1, RARE }, { i("mind talisman"), 1, RARE },
      { i("earth talisman"), 1, RARE }, { i("fire talisman"), 1, RARE }, { i("body talisman"), 1, RARE },
      { i("cosmic talisman"), 1, RARE }, { 995, 900 + r(2100), COMMON }, { i("opal bolt tips"), 1 + r(2), COMMON },
      { 1516, 94, UNCOMMON }, { 1518, 91 + r(31), UNCOMMON }, { i("oyster pearls"), 1, COMMON }, { 207, 1, UNCOMMON },
      { i("feather"), 1 + r(199), RARE }, { i("runite limbs"), 1, RARE } };

  public static final int[][] giantmole = { { i("big bones"), 1, ALWAYS }, { i("mole claw"), 1, ALWAYS },
      { i("mole skin"), 1 + r(5), ALWAYS }, { i("air rune"), 105, COMMON }, { i("fire rune"), 105, COMMON },
      { i("blood rune"), 15, COMMON }, { i("death rune"), 7, COMMON }, { i("law rune"), 15, UNCOMMON },
      { i("iron arrow"), 690 + r(690), UNCOMMON }, { i("adamant longsword"), 1, COMMON },
      { i("mithril axe"), 1, COMMON }, { i("mithril battleaxe"), 1, COMMON }, { i("mithril 2h sword"), 1, COMMON },
      { i("rune battleaxe"), 1, UNCOMMON }, { i("rune 2h sword"), 1, RARE }, { i("mithril platebody"), 1, COMMON },
      { i("rune med helm"), 1, COMMON }, { i("amulet of strength"), 1, COMMON }, { i("rune sq shield"), 1, UNCOMMON },
      { 441, 100, UNCOMMON }, { i("mithril bar"), 1, RARE }, { 995, 360 + r(10640), UNCOMMON },
      { i("shark"), 1 + r(4), UNCOMMON }, { i("oyster pearls"), 1, RARE }, { 1516, 50 + r(50), UNCOMMON } };

  public static final int[][] dagannothprime = { { i("dagganoth bones"), 1, ALWAYS },
      { i("dagganoth hide"), 1, ALWAYS }, { i("air battlestaff"), 1, COMMON }, { i("earth battlestaff"), 1, COMMON },
      { i("water battlestaff"), 1, COMMON }, { i("mud battlestaff"), 1, RARE }, { 1392, 1 + r(9), RARE },
      { i("dragon axe"), 1, RARE }, { i("air talisman"), 1 + r(79), UNCOMMON },
      { i("earth talisman"), 1 + r(79), UNCOMMON }, { i("water talisman"), 1 + r(79), UNCOMMON },
      { i("air rune"), 155, UNCOMMON }, { i("mud rune"), 32, UNCOMMON }, { i("death rune"), 63, UNCOMMON },
      { i("fremennik shield"), 1, UNCOMMON }, { i("fremennik helm"), 1, UNCOMMON }, // shield
                                                                                    // +
                                                                                    // helm
                                                                                    // not
                                                                                    // tradeable
      { i("seers' ring"), 1, RARE }, { i("skeletal top"), 1, RARE }, { i("skeletal bottoms"), 1, RARE },
      { i("farseer helm"), 1, RARE }, { 995, 972 + r(2022), COMMON }, { 7937, 150, UNCOMMON }, { 207, 1, UNCOMMON },
      { i("belladonna seed"), 1, UNCOMMON }, { i("cactus seed"), 1, UNCOMMON }, { i("poison ivy seed"), 1, UNCOMMON },
      { i("irit seed"), 1, UNCOMMON }, { i("toadflax seed"), 1, UNCOMMON }, { i("avantoe seed"), 1, UNCOMMON },
      { i("kwuarm seed"), 1, RARE }, { i("cadantine seed"), 1, RARE }, { i("lantadyme seed"), 1, RARE },
      { i("dwarf weed seed"), 1, RARE } };

  public static final int[][] daggannothrex = { { i("dagganoth bones"), 1, ALWAYS }, { i("dagganoth hide"), 1, ALWAYS },
      { i("fremennik blade"), 1, COMMON }, { i("mithril warhammer"), 1, COMMON }, // fremy
                                                                                  // blade
                                                                                  // not
                                                                                  // tradeable
      { i("adamant axe"), 1, COMMON }, { i("mithril 2h sword"), 1, UNCOMMON }, { i("rune axe"), UNCOMMON },
      { i("dragon axe"), 1, RARE }, { i("steel kiteshield"), 1, COMMON }, { i("steel platebody"), 1, COMMON },
      { i("adamant platebody"), 1, UNCOMMON }, { i("fremennik shield"), 1, UNCOMMON }, // fremmy
                                                                                       // helm
                                                                                       // +
                                                                                       // shield
                                                                                       // not
                                                                                       // tradeable
      { i("fremennik helm"), 1, UNCOMMON }, { i("berserker ring"), 1, RARE }, { i("warrior ring"), 1, RARE },
      { i("ring of life"), 1, RARE }, { i("rock-shell plate"), 1, RARE }, { i("rock-shell legs"), 1, RARE },
      { 147, 1, UNCOMMON }, { 159, 1, UNCOMMON }, { 165, 1, UNCOMMON }, { 141, 1, UNCOMMON }, { 2456, 1, UNCOMMON },
      { 191, 1, UNCOMMON }, { 129, 1, UNCOMMON }, { i("adamant bar"), 1, UNCOMMON }, { 4448, 25, UNCOMMON },
      { 454, 100, UNCOMMON }, { 441, 150, UNCOMMON }, { 2354, 17 + r(21), UNCOMMON }, { 365, 5, UNCOMMON },
      { 373, 5, UNCOMMON }, { 385, 5, UNCOMMON }, { 207, 1, UNCOMMON }, { i("body talisman"), 1, COMMON },
      { i("earth talisman"), 1, COMMON }, { 995, 995 + r(2844), UNCOMMON } };

  public static final int[][] monkeyguard = { { 3182, 1, ALWAYS } };

  public static final int[][] bandit = { { 526, 1, ALWAYS }, { i("chaos rune"), 2, COMMON },
      { i("death rune"), 2, UNCOMMON }, { i("nature rune"), 2, UNCOMMON }, { i("law rune"), 2, UNCOMMON },
      { i("cosmic rune"), 2, UNCOMMON }, { 205, 1, UNCOMMON }, { 203, 1, UNCOMMON }, { 201, 1, UNCOMMON },
      { 199, 1, UNCOMMON }, { 217, 1, RARE }, { 2485, 1, RARE }, { 215, 1, RARE }, { 213, 1, RARE }, { 211, 1, RARE },
      { 209, 1, RARE }, { 207, 1, UNCOMMON + r(200) }, { i("steel axe"), 1, COMMON },
      { i("iron battleaxe"), 1, UNCOMMON }, { i("iron scimitar"), 1, UNCOMMON }, { i("steel sq shield"), 1, UNCOMMON },
      { 995, 12 + r(37), COMMON }, { i("coal"), 1, COMMON }, { i("steel bar"), 1, UNCOMMON } };

  public static final int[][] abyssaldemon = { { i("black sword"), 1, COMMON }, { i("black axe"), 1, COMMON },
      { i("steel battleaxe"), 1, COMMON }, { i("abyssal whip"), 1, VERY_RARE },
      { i("mithril kiteshield"), 1, UNCOMMON }, { i("rune chainbody"), 1, UNCOMMON },
      { i("rune med helm"), 1, UNCOMMON }, { 199, 1, COMMON }, { 201, 1, COMMON }, { 203, 1, COMMON },
      { 205, 1, UNCOMMON }, { 207, 1, UNCOMMON }, { 209, 1, UNCOMMON }, { 211, 1, UNCOMMON }, { 215, 1, UNCOMMON },
      { 2485, 1, UNCOMMON }, { 213, 1, UNCOMMON }, { 217, 1, UNCOMMON }, { i("air rune"), 50, COMMON },
      { i("blood rune"), 7, COMMON }, { i("chaos rune"), 10, COMMON }, { i("law rune"), 3, UNCOMMON },
      { 995, 9 + r(2991), COMMON }, { i("lobster"), 1, COMMON }, { i("cosmic talisman"), 1, COMMON },
      { 7937, 60, UNCOMMON }, { i("earth talisman"), 1, UNCOMMON }, { i("adamant bar"), 1, UNCOMMON },
      { 133, 1, UNCOMMON } };

  public static final int[][] nechryael = { { i("rune full helm"), 1, UNCOMMON },
      { i("adamant platelegs"), 1, UNCOMMON }, { i("mithril kiteshield"), 1, UNCOMMON },
      { i("rune boots"), 1, UNCOMMON }, { i("rune sq shield"), 1, VERY_RARE }, { i("steel 2h sword"), 1, COMMON },
      { i("steel battleaxe"), 1, COMMON }, { i("steel axe"), 1, COMMON }, { i("rune longsword"), 1, VERY_RARE },
      { i("rune battleaxe"), 1, VERY_RARE }, { i("rune 2h sword"), 1, VERY_RARE },
      { i("death rune"), 5 + r(5), COMMON }, { i("chaos rune"), 3 + r(34), UNCOMMON },
      { i("belladonna seed"), 1, COMMON }, { i("irit seed"), 1, COMMON }, { i("cactus seed"), 1, COMMON },
      { i("avantoe seed"), 1, UNCOMMON }, { i("kwuarm seed"), 1, UNCOMMON }, { i("poison ivy seed"), 1, UNCOMMON },
      { i("toadflax seed"), 1, UNCOMMON }, { i("cadantine seed"), 1, UNCOMMON }, { i("dwarf weed seed"), 1, RARE },
      { i("lantadyme seed"), 1, RARE }, { 995, 11 + r(8981), COMMON }, { i("tuna"), 1, COMMON },
      { i("thread"), 10, UNCOMMON }, { i("gold bar"), 1, UNCOMMON }, { i("rune bar"), 1, RARE } };

  public static final int[][] gargoyle = { { i("steel 2h sword"), 1, COMMON }, { i("steel battleaxe"), 1, COMMON },
      { i("steel axe"), 1, COMMON }, { i("granite maul"), 1, VERY_RARE + r(50) }, { i("rune full helm"), 1, UNCOMMON },
      { i("adamant boots"), 1, UNCOMMON }, { i("steel full helm"), 1, RARE }, { 4101, 1, RARE },
      { i("fire rune"), 37 + r(38), COMMON }, { i("chaos rune"), 15, COMMON }, { i("death rune"), 5, UNCOMMON },
      { 995, 11 + r(487), COMMON }, { 7937, 35, UNCOMMON }, { i("mithril bar"), 3, UNCOMMON },
      { i("steel bar"), 3, UNCOMMON }, { i("gold bar"), 1, UNCOMMON }, { i("thread"), 10, UNCOMMON } };

  public static final int[][] dustdevil = { { 526, 1, ALWAYS }, { i("steel axe"), 1, COMMON },
      { i("rune arrow"), 12, COMMON }, { 2489, 1, COMMON }, { i("earth battlestaff"), 1, RARE },
      { i("rune dagger"), 1, RARE }, { i("rune javelin"), 5, RARE }, { i("dragon chainbody"), 1, VERY_RARE + r(30000) },
      { i("fire rune"), 3 + r(263), COMMON }, { i("chaos rune"), 5, UNCOMMON }, { i("soul rune"), 1 + r(4), UNCOMMON },
      { i("law rune"), 1, VERY_RARE }, { 995, 15 + r(381), COMMON }, { i("mithril bar"), 1, COMMON },
      { 1883, 1 + r(1), UNCOMMON }, { 199, 1, COMMON }, { 201, 1, COMMON }, { 203, 1, COMMON }, { 205, 1, UNCOMMON },
      { 207, 1, UNCOMMON }, { 209, 1, UNCOMMON }, { 211, 1, UNCOMMON }, { 215, 1, UNCOMMON }, { 2485, 1, RARE },
      { 213, 1, RARE }, { 217, 1, RARE } };

  public static final int[][] banshee = { { i("iron mace"), 1, UNCOMMON }, { i("iron dagger"), 1, RARE },
      { i("iron kiteshield"), 1, RARE }, { i("adamant kiteshield"), 1, VERY_RARE }, { 4105, 1, VERY_RARE },
      { 556, 3, COMMON }, { i("chaos rune"), 3 + r(14), COMMON }, { i("cosmic rune"), 2, UNCOMMON },
      { i("fire rune"), 5 + r(2), UNCOMMON }, { 995, 13 + r(22), COMMON }, { 7937, 23, COMMON },
      { 313, 7 + r(8), COMMON }, { i("iron ore"), 1, UNCOMMON }, { i("eye of newt"), 1, UNCOMMON }, { 199, 1, COMMON },
      { 203, 1, COMMON }, { 201, 1, COMMON }, { 205, 1, COMMON }, { 213, 1, COMMON }, { 207, 1, UNCOMMON },
      { 209, 1, UNCOMMON }, { 211, 1, UNCOMMON }, { 2485, 1, UNCOMMON }, { 217, 1, UNCOMMON }, { 215, 1, UNCOMMON } };

  public static final int[][] infernalmage = { { 526, 1, ALWAYS }, { i("staff"), 1, COMMON },
      { i("staff of fire"), 1, UNCOMMON }, { i("lava battlestaff"), 1, RARE }, { i("mystic fire staff"), 1, RARE },
      { 4099, 1, RARE }, { 4107, 1, RARE }, { i("earth rune"), 5 + r(31), COMMON },
      { i("fire rune"), 10 + r(8), COMMON }, { i("death rune"), 7, COMMON }, { i("blood rune"), 4 + r(3), UNCOMMON },
      { i("air rune"), 10 + r(8), UNCOMMON }, { i("mind rune"), 18, UNCOMMON },
      { i("water rune"), 10 + r(8), UNCOMMON }, { i("body rune"), 18, UNCOMMON }, { 995, 1 + r(28), COMMON } };

  public static final int[][] bloodveld = { { 526, 1, ALWAYS }, { i("steel axe"), 1, COMMON },
      { i("steel scimitar"), 1, UNCOMMON }, { i("steel full helm"), 1, COMMON },
      { i("mithril sq shield"), 1, UNCOMMON }, { i("mithril chainbody"), 1, UNCOMMON }, { i("black boots"), 1, RARE },
      { i("rune med helm"), 1, RARE }, { i("rune full helm"), 1, RARE }, { i("fire rune"), 60, COMMON },
      { i("blood rune"), 3 + r(27), UNCOMMON }, { 995, 10 + r(450), COMMON }, { i("gold ore"), 1, UNCOMMON },
      { 526, 1 + r(2), UNCOMMON }, { i("big bones"), 1 + r(4), UNCOMMON }, { i("meat pizza"), 1, UNCOMMON },
      { i("gold ring"), 1, RARE }, { 199, 1, UNCOMMON }, { 201, 1, UNCOMMON }, { 203, 1, UNCOMMON },
      { 205, 1, UNCOMMON }, { 207, 1, UNCOMMON }, { 209, 1, UNCOMMON }, { 211, 1, UNCOMMON }, { 213, 1, UNCOMMON },
      { 215, 1, UNCOMMON }, { 2485, 1, UNCOMMON }, { 217, 1, UNCOMMON } };

  public static final int[][] dwarf = { { 526, 1, ALWAYS }, { i("bronze pickaxe"), 1, COMMON },
      { i("tin ore"), 1, COMMON }, { i("bronze bar"), 1, COMMON }, { i("copper ore"), 1, COMMON },
      { i("iron ore"), 1, COMMON }, { i("iron pickaxe"), 1, UNCOMMON }, { i("coal"), 1, UNCOMMON },
      { i("iron bar"), 1, UNCOMMON }, { i("nature rune"), 2, RARE }, { i("chaos rune"), 2, RARE },
      { i("bronze med helm"), 1, COMMON }, { i("bronze battleaxe"), 1, UNCOMMON }, { i("iron battleaxe"), 1, UNCOMMON },
      { 995, 3 + r(27), COMMON }, { i("hammer"), 1, UNCOMMON }, { i("dwarven stout"), 1, UNCOMMON } };

  public static final int[][] mossgiant = { { i("big bones"), 1, ALWAYS }, { i("magic staff"), 1, COMMON },
      { i("mithril spear"), 1, COMMON }, { i("mithril sword"), 1, COMMON }, { i("steel arrow"), 30, COMMON },
      { i("iron arrow"), 15, COMMON }, { i("adamant sword"), 1, RARE }, { i("black full helm"), 1, COMMON },
      { i("black sq shield"), 1, COMMON }, { i("steel med helm"), 1, COMMON }, { i("steel kiteshield"), 1, UNCOMMON },
      { i("air rune"), 18, COMMON }, { i("cosmic rune"), 3, COMMON }, { i("earth rune"), 27, COMMON },
      { i("nature rune"), 6, COMMON }, { i("law rune"), 2 + r(4), UNCOMMON }, { i("blood rune"), 1, UNCOMMON },
      { i("chaos rune"), 7, UNCOMMON }, { i("death rune"), 1 + r(2), RARE }, { i("strawberry seed"), 1, COMMON },
      { i("wildblood seed"), 1, COMMON }, { i("tarromin seed"), 1, COMMON }, { i("harralander seed"), 1, COMMON },
      { i("jangerberry seed"), 1, COMMON }, { i("marentill seed"), 1, COMMON }, { i("belladonna seed"), 1, UNCOMMON },
      { i("limpwurt seed"), 1, UNCOMMON }, { i("toadflax seed"), 1, UNCOMMON }, { i("whiteberry seed"), 1, UNCOMMON },
      { 5282, 1, UNCOMMON }, { i("avantoe seed"), 1, RARE }, { i("cactus seed"), 1, RARE }, { i("irit seed"), 1, RARE },
      { i("kwuarm seed"), 1, RARE }, { i("poison ivy seed"), 1, RARE }, { i("ranarr seed"), 1, RARE },
      { i("cadantine seed"), 1, RARE }, { i("lantadyme seed"), 1, RARE }, { i("watermelon seed"), 1, RARE },
      { i("dwarf weed seed"), 1, VERY_RARE }, { 205, 1, COMMON }, { 201, 1, COMMON }, { 203, 1, COMMON },
      { 199, 1, COMMON }, { 211, 1, RARE }, { 215, 1, RARE }, { 217, 1, RARE }, { 209, 1, RARE }, { 2485, 1, RARE },
      { 207, 1, RARE }, { 995, 2 + r(498), COMMON }, { i("steel bar"), 1, COMMON }, { i("coal"), 1, UNCOMMON },
      { i("spinach roll"), 1, UNCOMMON }, { i("fire talisman"), 1, RARE } };

  public static final int[][] goblin = { { 526, 1, ALWAYS }, { 995, 1 + r(23), COMMON },
      { i("iron dagger"), 1, COMMON }, { i("bronze arrow"), 4 + r(16), COMMON }, { i("bronze med helm"), 1, COMMON },
      { i("bronze sq shield"), 1, COMMON }, { i("air rune"), 2 + r(4), COMMON }, { i("body rune"), 2 + r(7), COMMON },
      { i("earth rune"), 4, COMMON }, { i("water rune"), 6, COMMON }, { i("air talisman"), 1, COMMON },
      { i("chef's hat"), 1, COMMON }, { i("goblin mail"), 1, COMMON }, { i("bronze full helm"), 1, UNCOMMON },
      { i("bronze sword"), 1, UNCOMMON }, { i("bronze longsword"), 1, UNCOMMON },
      { i("iron arrow"), 3 + r(3), UNCOMMON }, { i("bronze chainbody"), 1, UNCOMMON }, { i("staff of air"), 1, RARE },
      { i("bronze kiteshield"), 1, UNCOMMON }, { i("raw chicken"), 1, UNCOMMON }, { i("fire talisman"), 1, UNCOMMON },
      { i("mind rune"), 2 + r(17), UNCOMMON }, { i("earth talisman"), 1, UNCOMMON }, { i("bronze axe"), 1, RARE },
      { i("bronze scimitar"), 1, RARE }, { i("iron full helm"), 1, RARE }, { i("leather body"), 1, RARE },
      { i("cape"), 1, RARE }, { i("chaos rune"), 1, RARE }, { i("nature rune"), 1, RARE },
      { i("mind talisman"), 1, RARE }, { 946, 1, RARE }, { i("tin ore"), 1, RARE } };

  public static final int[][] lesserdemon = { { i("ashes"), 1, ALWAYS }, { 995, 10 + r(640), COMMON },
      { i("steel axe"), 1, COMMON }, { i("steel scimitar"), 1, COMMON }, { i("steel full helm"), 1, COMMON },
      { i("black 2h sword"), 1, COMMON }, { i("mithril sq shield"), 1, UNCOMMON },
      { i("mithril chainbody"), 1, UNCOMMON }, { i("fire rune"), 6 + r(114), UNCOMMON },
      { i("chaos rune"), 7 + r(17), UNCOMMON }, { 445, 2 + r(2), UNCOMMON }, { i("jug of wine"), 1, UNCOMMON },
      { i("death rune"), 3 + r(3), RARE }, { i("black kiteshield"), 1, RARE }, { i("rune med helm"), 1, VERY_RARE } };

  public static final int[][] greaterdemon = { { i("steel axe"), 1, COMMON }, { i("steel battleaxe"), 1, COMMON },
      { i("steel 2h sword"), 1, COMMON }, { i("mithril kitesiheld"), 1, UNCOMMON },
      { i("black 2h sword"), 1, UNCOMMON }, { i("rune full helm"), 1, RARE }, { i("adamant platelegs"), 1, RARE },
      { i("adamant 2h sword"), 1, VERY_RARE }, { 995, 9 + r(621), COMMON }, { i("fire rune"), 75, COMMON },
      { i("chaos rune"), 15, COMMON }, { i("death rune"), 5, COMMON }, { i("thread"), 10, UNCOMMON },
      { i("tuna"), 1, UNCOMMON }, { i("gold bar"), 1, UNCOMMON }, { i("ashes"), 1, ALWAYS } };

  public static final int[][] guard = { { i("bones"), 1, ALWAYS }, { 995, 1 + r(24), COMMON },
      { i("grapes"), 1, COMMON }, { i("air rune"), 6, COMMON }, { i("earth rune"), 3 + r(3), COMMON },
      { i("fire rune"), 2, COMMON }, { i("body talisman"), 1, COMMON }, { i("iron dagger"), 1, COMMON },
      { i("law talisman"), 1, RARE }, { i("iron arrow"), 1 + r(2), COMMON }, { i("bronze arrow"), 1 + r(4), UNCOMMON },
      { i("steel arrow"), 1 + r(10), UNCOMMON }, { i("law rune"), 2, RARE }, { i("nature rune"), 1, RARE },
      { i("chaos rune"), 1 + r(1), RARE }, { i("steel warhammer"), 1, RARE }, { 1947, 1 + r(3), RARE },
      { i("iron ore"), 1, RARE }, { i("iron platebody"), 1, RARE }, { i("steel bar"), 1, RARE },
      { i("potato seed"), 4 + r(2), COMMON }, { i("onion seed"), 4, COMMON }, { i("cabbage seed"), 4, UNCOMMON },
      { i("tomato seed"), 3 + r(1), UNCOMMON }, { i("strawberry seed"), 1 + r(3), RARE },
      { i("watermelon seed"), 2 + r(2), RARE }, { 199, 1, RARE } };

  public static final int[][] alkharidwarrior = { { i("bones"), 1, ALWAYS }, { i("air rune"), 5, UNCOMMON },
      { i("mind rune"), 9, COMMON }, { i("fire rune"), 6, COMMON }, { i("earth rune"), 4, COMMON },
      { i("chaos rune"), 2, RARE }, { i("law rune"), 1, VERY_RARE }, { i("bronze med helm"), 1, COMMON },
      { i("bronze arrow"), 7, COMMON }, { i("iron dagger"), 1, UNCOMMON }, { i("iron med helm"), 1, UNCOMMON },
      { i("staff of air"), 1, UNCOMMON }, { 199, 1, COMMON }, { 201, 1, COMMON }, { 203, 1, UNCOMMON },
      { 205, 1, UNCOMMON }, { 207, 1, UNCOMMON }, { 209, 1, UNCOMMON }, { 211, 1, UNCOMMON }, { 213, 1, UNCOMMON },
      { 215, 1, UNCOMMON }, { 2485, 1, UNCOMMON }, { 217, 1, UNCOMMON } };

  public static final int[][] icewarrior = { { i("bones"), 1, ALWAYS }, { 995, 1 + r(14), COMMON },
      { i("iron battleaxe"), 1, COMMON }, { i("mithril arrow"), 3, COMMON }, { i("cosmic rune"), 2, COMMON },
      { i("chaos rune"), 3, COMMON }, { i("nature rune"), 4, COMMON }, { i("law rune"), 2, COMMON },
      { i("mithril mace"), 1, UNCOMMON }, { i("adamant arrow"), 2, UNCOMMON }, { i("tarromin seed"), 1, COMMON },
      { i("death rune"), 2, UNCOMMON }, { i("mind rune"), 24, RARE }, { i("mithril ore"), 1, RARE },
      { i("guam seed"), 1, COMMON }, { i("iron 2h sword"), 1, UNCOMMON }, { i("harralander seed"), 1, COMMON },
      { i("steel sword"), 1, VERY_RARE }, { i("limpwurt seed"), 1, COMMON }, { i("black kiteshield"), 1, VERY_RARE },
      { i("wildblood seed"), 1, COMMON }, { i("mithril sq shield"), 1, VERY_RARE }, { i("strawberry seed"), 1, COMMON },
      { i("rune longsword"), 1, VERY_RARE }, { i("jangerberry seed"), 1, COMMON }, { i("marentill seed"), 1, UNCOMMON },
      { i("cadantine seed"), 1, UNCOMMON }, { i("bittecape mushroom spore"), 1, UNCOMMON },
      { i("irit seed"), 1, UNCOMMON }, { i("avantoe seed"), 1, UNCOMMON }, { i("dwarf weed seed"), 1, RARE },
      { i("toadflax seed"), 1, RARE }, { i("ranarr seed"), 1, RARE }, { i("whiteberry seed"), 1, RARE },
      { i("poison ivy seed"), 1, RARE }, { i("kwuarm seed"), 1, RARE }, { i("cactus seed"), 1, RARE },
      { i("watermelon seed"), 1, RARE }, { i("belladonna seed"), 1, VERY_RARE }, { i("lantadyme seed"), 1, VERY_RARE },
      { 199, 1, COMMON }, { 201, 1, COMMON }, { 203, 1, COMMON }, { 205, 1, COMMON }, { 207, 1, UNCOMMON },
      { 209, 1, UNCOMMON }, { 211, 1, UNCOMMON }, { 213, 1, RARE }, { 215, 1, RARE }, { 217, 1, RARE },
      { 2485, 1, RARE } };

  public static final int[][] blackknight = { { 526, 1, ALWAYS }, { i("iron sword"), 1, COMMON },
      { i("iron full helm"), 1, COMMON }, { i("steel mace"), 1, COMMON }, { i("black full helm"), 1, RARE },
      { i("mithril arrow"), 3, UNCOMMON }, { i("black 2h sword"), 1, RARE }, { i("black sword"), 1, RARE },
      { i("mind rune"), 2 + r(7), UNCOMMON }, { i("earth rune"), 10, UNCOMMON }, { i("body rune"), 9, UNCOMMON },
      { i("cosmic rune"), 7, UNCOMMON }, { i("chaos rune"), 4 + r(2), UNCOMMON }, { i("death rune"), 2, UNCOMMON },
      { i("law rune"), 2 + r(2), UNCOMMON }, { i("nature rune"), 6, RARE }, { 199, 1, COMMON }, { 201, 1, COMMON },
      { 203, 1, COMMON }, { 205, 1, COMMON }, { 207, 1, UNCOMMON }, { 209, 1, UNCOMMON }, { 211, 1, UNCOMMON },
      { 213, 1, UNCOMMON }, { 215, 1, UNCOMMON }, { 2485, 1, UNCOMMON }, { 217, 1, UNCOMMON } };

  public static final int[][] whiteknight = { { 526, 1, ALWAYS }, { i("water rune"), 20 + r(27), COMMON },
      { i("body rune"), 9 + r(15), COMMON }, { i("mind rune"), 5 + r(7), COMMON },
      { i("choas rune"), 2 + r(3), UNCOMMON }, { i("nature rune"), 4 + r(3), UNCOMMON },
      { i("law rune"), 2 + r(1), RARE }, { i("blood rune"), 2 + r(1), RARE }, // members
      { i("iron longsword"), 1, COMMON }, { i("steel sword"), 1, COMMON }, { i("mithril arrow"), 5 + r(4), COMMON },
      { i("adamant arrow"), 2 + r(5), UNCOMMON }, { i("steel med helm"), 1, COMMON }, { i("potato seed"), 4, COMMON },
      { i("tomato seed"), 3, COMMON }, { i("cabbage seed"), 4, COMMON }, { i("onion seed"), 4, COMMON },
      { i("sweetcorn seed"), 3, UNCOMMON }, { i("watermelon seed"), 2, UNCOMMON }, { i("strawberry seed"), 2, RARE },
      { 995, 1 + r(199), COMMON }, { i("pot of flour"), 1, RARE }, { 2335, 1, UNCOMMON },
      { i("iron ore"), 1, UNCOMMON }, { i("iron bar"), 1 + r(1), COMMON }, { 199, 1, UNCOMMON }, { 201, 1, UNCOMMON },
      { 203, 1, UNCOMMON }, { 205, 1, UNCOMMON }, { 207, 1, UNCOMMON }, { 209, 1, RARE }, { 211, 1, RARE },
      { 213, 1, RARE }, { 215, 1, RARE }, { 2485, 1, RARE }, { 217, 1, RARE } };

  public static final int[][] icegiant = { { i("big bones"), 1, ALWAYS }, { i("iron battleaxe"), 1, COMMON },
      { i("iron platelegs"), 1, COMMON }, { i("iron 2h sword"), 1, COMMON }, { i("steel axe"), 1, COMMON },
      { i("steel sword"), 1, COMMON }, { i("black kiteshield"), 1, COMMON }, { i("water rune"), 12, COMMON },
      { i("mind rune"), 24, COMMON }, { i("body rune"), 37, COMMON }, { i("cosmic rune"), 2 + r(2), COMMON },
      { 995, 8 + r(446), COMMON }, { i("adamant arrow"), 5, UNCOMMON }, { i("law rune"), 3, UNCOMMON },
      { i("nature rune"), 6, UNCOMMON }, { i("banana"), 1, UNCOMMON }, { i("jug of wine"), 1, UNCOMMON },
      { i("mithril ore"), 1, UNCOMMON }, { i("mithril sq shield"), 1, RARE }, { i("mithril mace"), 1, RARE },
      { i("death rune"), 2 + r(2), RARE } };

  public static final int[][] hobgoblin = { { i("bones"), 1, ALWAYS }, { 995, 1 + r(70), COMMON },
      { i("iron sword"), 1, COMMON }, { i("iron longsword"), 1, UNCOMMON }, { i("steel longsword"), 1, UNCOMMON },
      { i("steel dagger"), 1, UNCOMMON }, { i("limpwurt root"), 1, 2 + r(18) }, { i("water rune"), 2, UNCOMMON },
      { i("body rune"), 6, UNCOMMON }, { i("fire rune"), 7, UNCOMMON }, { i("cosmic rune"), 2, UNCOMMON },
      { i("chaos rune"), 3, UNCOMMON }, { i("nature rune"), 4, UNCOMMON }, { i("law rune"), 2, UNCOMMON } };

  public static final int[][] pirate = { { i("bones"), 1, ALWAYS }, { i("air rune"), 10, COMMON },
      { i("earth rune"), 9, COMMON }, { i("fire rune"), 5, COMMON }, { i("chaos rune"), 2, COMMON },
      { i("nature rune"), 2, COMMON }, { i("law rune"), 2, RARE }, { i("bronze scimitar"), 1, COMMON },
      { i("bronze arrow"), 9 + r(3), COMMON }, { i("iron dagger"), 1, COMMON }, { i("staff of air"), 1, UNCOMMON },
      { 995, 4 + r(51), COMMON }, { i("iron bar"), 1, RARE }, { i("chef's hat"), 1, RARE },
      { i("limpwurt root"), 1, RARE }, { i("tinderbox"), 1, RARE }, { i("iron platebody"), 1, VERY_RARE },
      { i("eye patch"), 1, COMMON }, { i("knife"), 1, RARE } };

  public static final int[][] zombie = { { i("bones"), 1, ALWAYS }, { 995, 1 + r(25), COMMON },
      { i("fishing bait"), 7, COMMON }, { i("bronze axe"), 1, UNCOMMON }, { i("iron axe"), 1, UNCOMMON },
      { i("bronze med helm"), 1, UNCOMMON }, { i("iron mace"), 1, UNCOMMON }, { i("bronze kiteshield"), 1, UNCOMMON },
      { i("iron arrow"), 5, UNCOMMON }, { i("iron dagger"), 1, UNCOMMON }, { i("steel arrow"), 5 + r(27), UNCOMMON },
      { i("mithril arrow"), 2, UNCOMMON }, { i("chaos rune"), 4, UNCOMMON }, { i("air rune"), 3, UNCOMMON },
      { i("fire rune"), 7, UNCOMMON }, { i("mind rune"), 5, UNCOMMON }, { i("body rune"), 3 + r(5), UNCOMMON },
      { i("nature rune"), 5, UNCOMMON }, { i("law rune"), 3, UNCOMMON }, { i("cosmic rune"), 2, UNCOMMON },
      { i("tinderbox"), 1, UNCOMMON }, { i("copper ore"), 1, UNCOMMON }, { i("iron ore"), 1, UNCOMMON },
      { i("tin ore"), 1, UNCOMMON }, { i("eye of newt"), 1, UNCOMMON }, { i("ashes"), 1, UNCOMMON },
      { i("half a meat pie"), 1, VERY_RARE } };

  public static final int[][] skeleton = { { i("bones"), 1, ALWAYS }, { i("iron dagger"), 1, COMMON },
      { i("iron med helm"), 1, COMMON }, { i("air rune"), 12, COMMON }, { i("water rune"), 5, COMMON },
      { i("earth rune"), 3, COMMON }, { i("fire rune"), 2, COMMON }, { i("mind rune"), 1 + r(24), COMMON },
      { 995, 10, COMMON }, { i("bronze arrow"), 1 + r(10), COMMON }, { i("iron mace"), 1, COMMON },
      { i("iron axe"), 1, UNCOMMON }, { i("cosmic rune"), 2, UNCOMMON }, { i("iron arrow"), 5, UNCOMMON },
      { i("iron sword"), 1, UNCOMMON }, { i("chaos rune"), 4, UNCOMMON }, { i("nature rune"), 1 + r(2), UNCOMMON },
      { i("iron sword"), 1, UNCOMMON }, { i("law rune"), 2, UNCOMMON }, { i("bucket"), 1, UNCOMMON },
      { 1947, 1, UNCOMMON }, { i("iron ore"), 1, UNCOMMON }, { i("bronze bar"), 1, UNCOMMON },
      { i("iron scimitar"), 1, RARE }, { i("steel arrow"), 1, RARE }, { i("fire talisman"), 1, RARE },
      { i("adamant kiteshield"), 1, VERY_RARE }, };

  public static final int[][] hillgiant = { { i("big bones"), 1, ALWAYS }, { i("limpwurt root"), 1, 2 + r(23) },
      { i("beer"), 1, COMMON }, { i("iron arrow"), 3, COMMON }, { i("iron full helm"), 1, COMMON },
      { i("water rune"), 7, COMMON }, { 995, 8 + r(15), COMMON }, { i("body talisman"), 1, UNCOMMON },
      { i("fire rune"), 15, UNCOMMON }, { i("law rune"), 1 + r(2), UNCOMMON }, { i("nature rune"), 6, UNCOMMON },
      { i("mind rune"), 3, UNCOMMON }, { i("steel longsword"), 1, UNCOMMON }, { i("steel arrow"), 10 + r(5), UNCOMMON },
      { i("iron kiteshield"), 1, UNCOMMON }, { i("iron 2h sword"), 1, RARE }, { i("mithril arrow"), 1, RARE },
      { i("steel dagger"), 1, RARE }, { i("death rune"), 2, RARE }, { i("chaos rune"), 2, RARE },
      { i("steel platebody"), 1, VERY_RARE }, { i("adamant arrow"), 1 + r(4), VERY_RARE }, };

  public static final int[][] deadlyredspider = { { i("red spiders' eggs"), 1, UNCOMMON } };

  public static final int[][] reddragon = { { i("dragon bones"), 1, ALWAYS }, { i("red dragonhide"), 1, ALWAYS },
      { i("mithril 2h sword"), 1, COMMON }, { i("mithril javelin"), 1, COMMON }, { i("mithril axe"), 1, COMMON },
      { i("mithril kiteshield"), 1, UNCOMMON }, { i("adamant platebody"), 1, UNCOMMON },
      { i("mithril battleaxe"), 1, UNCOMMON }, { i("rune arrow"), 4, UNCOMMON }, { i("rune dart"), 8, UNCOMMON },
      { i("rune longsword"), 1, UNCOMMON }, { i("law rune"), 4, UNCOMMON }, { i("death rune"), 5, UNCOMMON },
      { i("blood rune"), 2, UNCOMMON }, { 199, 1, COMMON }, { 201, 1, COMMON }, { 203, 1, COMMON }, { 205, 1, COMMON },
      { 207, 1, UNCOMMON }, { 209, 1, UNCOMMON }, { 211, 1, UNCOMMON }, { 213, 1, UNCOMMON }, { 215, 1, UNCOMMON },
      { 2485, 1, UNCOMMON }, { 217, 1, UNCOMMON }, { 995, 30 + r(630), COMMON }, { i("chocolate cake"), 3, UNCOMMON },
      { i("adamant bar"), 1, UNCOMMON } };

  public static final int[][] rat = { { i("bones"), 1, ALWAYS } };

  public static final int[][] cow = { { i("bones"), 1, ALWAYS }, { i("cowhide"), 1, ALWAYS },
      { i("raw beef"), 1, ALWAYS }, };

  public static final int[][] chicken = { { i("bones"), 1, ALWAYS }, { i("feather"), 5 + r(10), ALWAYS },
      { i("raw chicken"), 1, ALWAYS }, { i("egg"), 1, UNCOMMON }, };

  public static final int[][] rockcrab = { { 207, 1, RARE }, { 211, 1, RARE }, { i("tarromin seed"), 1, RARE },
      { i("ranarr seed"), 1, RARE }, { i("irit seed"), 1, VERY_RARE }, { i("bronze pickaxe"), 1, COMMON },
      { i("iron pickaxe"), 1, COMMON }, { i("bronze axe"), 1, UNCOMMON }, { i("fire rune"), 7, COMMON },
      { i("nature rune"), 4, UNCOMMON }, { i("chaos rune"), 1, RARE }, { i("cosmic talisman"), 1, RARE },
      { 995, 3 + r(495), COMMON }, { i("oyster"), 1 + r(1), COMMON }, { 402, 1 + r(4), COMMON },
      { i("edible seaweed"), 2, RARE }, { i("oyster pearl"), 1, COMMON }, { i("empty oyster"), 1, COMMON },
      { i("spinach roll"), 1, UNCOMMON }, { i("knife"), 1, UNCOMMON }, { i("iron ore"), 1, UNCOMMON },
      { i("coal"), 2, UNCOMMON }, { i("copper ore"), 3, UNCOMMON }, { i("tin ore"), 3, UNCOMMON },
      { i("fishing bait"), 1 + r(9), UNCOMMON }, { 45, 5, UNCOMMON }, { i("limpwurt root"), 1, RARE } };

  public static final int[][] kingblackdragon = { { i("dragon bones"), 1, ALWAYS },
      { i("black dragonhide"), 1, ALWAYS }, { i("rune longsword"), 1, UNCOMMON }, { i("rune battleaxe"), 1, UNCOMMON },
      { i("blood rune"), 50, COMMON }, { i("death rune"), 50, COMMON }, { i("law rune"), 50, UNCOMMON },
      { i("mithril arrow"), 250, UNCOMMON }, { i("rune arrow"), 50, UNCOMMON }, { i("rune sq shield"), 1, UNCOMMON },
      { i("rune platebody"), 1, UNCOMMON }, { i("dragon med helm"), 1, RARE }, { 2361, 1 + r(4), UNCOMMON },
      { 2363, 1 + r(1), UNCOMMON }, { 443, 100, UNCOMMON }, { 445, 50, UNCOMMON }, { 453, 3, UNCOMMON },
      { 995, 1000 + r(2000), COMMON }, { 1516, 50, COMMON }, { 1514, 10, COMMON } };

  public static final int[][] greendragon = { { i("dragon bones"), 1, ALWAYS }, { i("green dragonhide"), 1, ALWAYS },
      { i("steel platelegs"), 1, COMMON }, { i("mithril kiteshield"), 1, UNCOMMON },
      { i("adamant full helm"), 1, RARE }, { i("steel battleaxe"), 1, COMMON }, { i("mithril axe"), 1, COMMON },
      { i("mithril spear"), 1, UNCOMMON }, { i("rune dagger"), 1, UNCOMMON }, { i("water rune"), 75 + r(75), COMMON },
      { i("fire rune"), 37, COMMON }, { i("nature rune"), 15 + r(60), COMMON }, { i("law rune"), 3, COMMON },
      { 995, 11 + r(429), COMMON }, { i("bass"), 1, COMMON }, { i("adamantite ore"), 1, UNCOMMON }, { 209, 1, COMMON },
      { 205, 1, COMMON }, { 199, 1, UNCOMMON }, { 211, 1, UNCOMMON }, { 215, 1, UNCOMMON }, { 201, 1, UNCOMMON },
      { 203, 1, UNCOMMON }, { 207, 1, UNCOMMON }, { 213, 1, UNCOMMON }, { 2485, 1, UNCOMMON }, { 217, 1, UNCOMMON },
      { i("nature talisman"), 1, RARE } };

  public static final int[][] bluedragon = { { i("dragon bones"), 1, ALWAYS }, { i("blue dragonhide"), 1, ALWAYS },
      { i("steel platelegs"), 1, COMMON }, { i("mithril kiteshield"), 1, UNCOMMON },
      { i("adamant full helm"), 1, UNCOMMON }, { i("steel battleaxe"), 1, COMMON }, { i("mithril axe"), 1, COMMON },
      { i("mithril spear"), 1, UNCOMMON }, { i("adamant dagger"), 1, UNCOMMON }, { i("rune dagger"), 1, RARE },
      { i("water rune"), 75, COMMON }, { i("fire rune"), 37, UNCOMMON }, { i("nature rune"), 15, UNCOMMON },
      { i("law rune"), 3, UNCOMMON }, { i("death rune"), 5, VERY_RARE }, { 995, 11 + r(443), COMMON },
      { i("bass"), 1, COMMON }, { i("adamantite ore"), 1, UNCOMMON }, { 199, 1, COMMON }, { 201, 1, COMMON },
      { 203, 1, COMMON }, { 205, 1, COMMON }, { 207, 1, UNCOMMON }, { 211, 1, UNCOMMON }, { 213, 1, UNCOMMON },
      { 215, 1, UNCOMMON }, { 2485, 1, UNCOMMON }, { 217, 1, RARE } };

  public static final int[][] kalphiteworker = { { i("water rune"), 2, UNCOMMON }, { i("fire rune"), 7, UNCOMMON },
      { i("body rune"), 6, UNCOMMON }, { i("cosmic rune"), 2, UNCOMMON }, { i("chaos rune"), 3, UNCOMMON },
      { i("nature rune"), 4, UNCOMMON }, { i("law rune"), 2, UNCOMMON }, { i("blood rune"), 1, VERY_RARE },
      { i("hard leather body"), 1, UNCOMMON }, { i("iron sword"), 1, UNCOMMON }, { i("iron dagger"), 1, UNCOMMON },
      { i("steel dagger"), 1, UNCOMMON }, { i("mithril sq shield"), 1, UNCOMMON }, { i("steel sword"), 1, RARE },
      { i("steel longsword"), 1, RARE }, { i("rune dagger"), 1, RARE }, { 995, 1 + r(999), COMMON },
      { 1823, 1, COMMON }, { i("bucket of sand"), 1, UNCOMMON }, { 199, 1, COMMON }, { 201, 1, COMMON },
      { 203, 1, COMMON }, { 205, 1, UNCOMMON }, { 207, 1, UNCOMMON }, { 209, 1, UNCOMMON }, { 211, 1, RARE },
      { 213, 1, RARE }, { 215, 1, RARE }, { 2485, 1, RARE }, { 217, 1, RARE } };

  public static final int[][] kalphitesolider = { { i("steel full helm"), 1, COMMON },
      { i("steel scimitar"), 1, COMMON }, { i("steel axe"), 1, COMMON }, { i("steel sword"), 1, UNCOMMON },
      { i("steel dagger"), 1, UNCOMMON }, { i("hard leather body"), 1, UNCOMMON },
      { i("adamant chain body"), 1, UNCOMMON }, { i("adamant sq shield"), 1, UNCOMMON }, { i("rune dagger"), 1, RARE },
      { i("adamant scimitar"), 1, RARE }, { i("adamant axe"), 1, RARE }, { i("adamant med helm"), 1, RARE },
      { i("adamant full helm"), 1, RARE }, { i("adamant dagger"), 1, RARE }, { i("rune chainbody"), 1, RARE },
      { i("air rune"), 15 + r(12), COMMON }, { i("fire rune"), 6 + r(54), COMMON }, { i("water rune"), 2, UNCOMMON },
      { i("body rune"), 2, UNCOMMON }, { i("chaos rune"), 12, UNCOMMON }, { i("cosmic rune"), 2, UNCOMMON },
      { i("death rune"), 3 + r(9), UNCOMMON }, { i("law rune"), 1 + r(2), UNCOMMON },
      { i("nature rune"), 1 + r(5), RARE }, { 995, 10 + r(440), COMMON }, { 3139, 1 + r(1), UNCOMMON },
      { i("lobster"), 1, UNCOMMON }, { 1823, 1, UNCOMMON }, { i("uncut diamond"), 1, RARE },
      { i("uncut dragonstone"), 1, RARE }, { 205, 1, COMMON }, { 203, 1, RARE }, { 201, 1, RARE }, { 199, 1, RARE },
      { 207, 1, RARE }, { 213, 1, RARE }, { 211, 1, RARE }, { 2485, 1, RARE }, { 209, 1, RARE } };

  public static final int[][] kalphiteguardian = { { i("mithril kiteshield"), 1, UNCOMMON },
      { i("adamant sq shield"), 1, UNCOMMON }, { i("rune med helm"), 1, UNCOMMON }, { i("rune chainbody"), 1, RARE },
      { i("rune platebody"), 1, VERY_RARE }, { i("rune sq shield"), 1, VERY_RARE }, { i("steel axe"), 1, COMMON },
      { i("steel battleaxe"), 1, COMMON }, { i("mithril longsword"), 1, COMMON }, { i("mithril sword"), 1, COMMON },
      { i("adamant dagger"), 1, UNCOMMON }, { i("rune 2h sword"), 1, UNCOMMON }, { i("rune battleaxe"), 1, UNCOMMON },
      { i("rune dagger"), 1, UNCOMMON }, { i("rune sword"), 1, RARE }, { i("air rune"), 50, UNCOMMON },
      { i("blood rune"), 7, UNCOMMON }, { i("fire rune"), 37, UNCOMMON }, { i("law rune"), 3 + r(43), UNCOMMON },
      { i("death rune"), 18 + r(27), UNCOMMON }, { i("chaos rune"), 10, UNCOMMON },
      { i("adamant javelin"), 1, UNCOMMON }, { i("cosmic rune"), 2, UNCOMMON },
      { i("rune arrow"), 42 + r(108), UNCOMMON }, { 995, 28 + r(2972), COMMON }, { i("lobster"), 1 + r(1), UNCOMMON },
      { 163, 1, UNCOMMON }, { 145, 1, UNCOMMON }, { 157, 1, UNCOMMON }, { 3138, 2 + r(2), UNCOMMON },
      { 199, 1, COMMON }, { 215, 1, COMMON }, { 203, 1, COMMON }, { 201, 1, COMMON }, { 205, 1, COMMON },
      { 211, 1, UNCOMMON }, { 207, 1, UNCOMMON }, { 209, 1, UNCOMMON }, { 213, 1, UNCOMMON }, { 2485, 1, RARE },
      { 217, 1, RARE } };

  public static final int[][] kalphitequeen = { { i("rune spear"), 2, COMMON }, { i("rune axe"), 1, COMMON },
      { i("rune battleaxe"), 1, UNCOMMON }, { i("rune 2h sword"), 1, UNCOMMON },
      { i("rune warhammer"), 1 + r(1), UNCOMMON }, { i("adamant longsword"), 1, UNCOMMON },
      { i("lava battlestaff"), 2, UNCOMMON }, { i("dragon 2h sword"), 1, VERY_RARE + r(20) },
      { i("rune chainbody"), 1 + r(3), COMMON }, { i("dragon chainbody"), 1, VERY_RARE + r(30000) },
      { i("mithril arrow"), 500, COMMON }, { i("iron arrow"), 1 + r(354), UNCOMMON },
      { i("steel arrow"), 1 + r(149), UNCOMMON }, { i("rune arrow"), 100, UNCOMMON },
      { i("blood rune"), 250 + r(50), UNCOMMON }, { i("nature rune"), 200 + r(50), COMMON },
      { i("fire rune"), 600, COMMON }, { i("law rune"), 20 + r(230), UNCOMMON },
      { i("death rune"), 200 + r(100), UNCOMMON }, { i("cosmic rune"), 200 + r(100), UNCOMMON },
      { i("sapphire"), 1, UNCOMMON }, { i("emerald"), 1, UNCOMMON }, { i("ruby"), 1, UNCOMMON }, { 414, 40, UNCOMMON },
      { 246, 20 + r(20), COMMON }, { i("amulet of power"), 1, COMMON }, { 995, 3000 + r(72000), UNCOMMON },
      { i("lobster"), 7, UNCOMMON }, { i("shark"), 7, UNCOMMON } };

  public static final int[][] imp = { { i("ashes"), 1, ALWAYS }, { i("red bead"), 1, UNCOMMON },
      { i("yellow bead"), 1, UNCOMMON }, { i("black bead"), 1, UNCOMMON }, { i("white bead"), 1, UNCOMMON },
      { i("tinderbox"), 1, UNCOMMON }, { i("ball of wool"), 1, COMMON }, { i("hammer"), 1, COMMON },
      { i("mind talisman"), 1, UNCOMMON }, { i("burnt meat"), 1, UNCOMMON }, { 1947, 1, UNCOMMON },
      { 753, 1, UNCOMMON }, { i("tinder"), 1, UNCOMMON }, { i("shears"), 1, UNCOMMON }, { i("bucket"), 1, UNCOMMON },
      { i("bucket of water"), 1, RARE }, { i("jug"), 1, RARE }, { i("jug of water"), 1, RARE },
      { i("jug of wine"), 1, RARE }, { 1931, 1, RARE }, { 2311, 1, RARE }, { i("flier"), 1, RARE } };

  public static final int[][] cavecrawler = { { i("potato seed"), 1 + r(3), COMMON },
      { i("watermelon seed"), 1, UNCOMMON }, { i("tomato seed"), 1 + r(1), COMMON },
      { i("onion seed"), 1 + r(2), COMMON }, { i("sweetcorn seed"), 1 + r(1), COMMON },
      { i("cabbage seed"), 1 + r(1), COMMON }, { i("strawberry seed"), 1, COMMON }, { 239, 1, COMMON },
      { i("snape grass"), 1, RARE }, { 235, 1, UNCOMMON }, { 223, 1, UNCOMMON }, { i("eye of newt"), 1, COMMON },
      { i("limpwurt root"), 1, COMMON }, { i("vial of water"), 1, COMMON }, { i("earth rune"), 9 + r(1), COMMON },
      { i("nature rune"), 3, COMMON }, { i("fire rune"), 12, COMMON }, { 995, 3 + r(26), COMMON },
      { i("bronze boots"), 1, UNCOMMON }, { 187, 1, UNCOMMON }, { 199, 1 + r(1), COMMON }, { 201, 1 + r(1), COMMON },
      { 203, 1 + r(1), COMMON }, { 205, 1 + r(1), COMMON }, { 207, 1 + r(1), UNCOMMON }, { 209, 1 + r(1), UNCOMMON },
      { 211, 1 + r(1), UNCOMMON }, { 213, 1 + r(1), UNCOMMON }, { 215, 1 + r(1), RARE }, { 217, 1 + r(1), RARE },
      { 2485, 1 + r(1), RARE } };

  public static final int[][] crawlinghand = { { 526, 1, ALWAYS }, { i("leather gloves"), 1, COMMON },
      { i("gold ring"), 1, UNCOMMON }, { i("sapphire ring"), 1, UNCOMMON }, { i("emerald ring"), 1, UNCOMMON },
      { i("ruby ring"), 1, UNCOMMON }, { 995, 5 + r(437), COMMON }, { i("ashes"), 1, UNCOMMON }, { 2902, 1, COMMON },
      { 2912, 1, UNCOMMON }, { 2922, 1, UNCOMMON }, { 2932, 1, UNCOMMON }, { 2942, 1, UNCOMMON },
      { 4115, 1, VERY_RARE + r(20) } };

  public static final int[][] bronzedragon = { { i("dragon bones"), 1, ALWAYS }, { i("bronze bar"), 5, ALWAYS },
      { i("adamant javelin"), 30 + r(30), COMMON }, { i("adamant dart"), 16, UNCOMMON },
      { i("mithril axe"), 1, UNCOMMON }, { i("mithril 2h sword"), 1, UNCOMMON },
      { i("mithril battleaxe"), 1, UNCOMMON }, { i("rune knife"), 2 + r(3), UNCOMMON }, { i("rune javelin"), 1, RARE },
      { i("rune longsword"), 1, RARE }, { i("rune battleaxe"), 1, RARE }, { i("dragon dagger"), 1, VERY_RARE },
      { i("mithril kiteshield"), 1, UNCOMMON }, { i("adamant platebody"), 1, RARE }, { i("rune sq shield"), 1, RARE },
      { i("dragon plateskirt"), 1, VERY_RARE + 1498 }, { i("dragon platelegs"), 1, VERY_RARE + 1599 },
      { i("law rune"), 10 + r(35), COMMON }, { i("fire rune"), 50 + r(100), UNCOMMON },
      { i("blood rune"), 15 + r(15), UNCOMMON }, { i("nature rune"), 67, UNCOMMON },
      { i("death rune"), 25 + r(20), UNCOMMON }, { i("adamant bar"), 1, RARE }, { i("runite bar"), 1, RARE } };

  public static final int[][] blackdragon = { { i("dragon bones"), 1, ALWAYS }, { i("black dragonhide"), 1, ALWAYS },
      { i("mithril axe"), 1, UNCOMMON }, { i("black axe"), 1, UNCOMMON }, { i("mithril battleaxe"), 1, UNCOMMON },
      { i("mithril 2h sword"), 1, UNCOMMON }, { i("adamant platebody"), 1, UNCOMMON }, { i("rune longsword"), 1, RARE },
      { i("rune sq shield"), 1, RARE }, { i("rune battleaxe"), 1, VERY_RARE }, { i("rune 2h sword"), 1, VERY_RARE },
      { i("adamant dart"), 16, COMMON }, { i("rune knife"), 2, UNCOMMON }, { i("rune dart"), 10, UNCOMMON },
      { i("air rune"), 75, UNCOMMON }, { i("blood rune"), 15, UNCOMMON }, { i("death rune"), 5 + r(45), UNCOMMON },
      { i("fire rune"), 50, UNCOMMON }, { i("law rune"), 10 + r(35), UNCOMMON },
      { i("nature rune"), 67 + r(12), UNCOMMON }, { i("chaos rune"), 90, UNCOMMON },
      { i("adamant bar"), 1 + r(1), UNCOMMON }, { i("steel bar"), 1, VERY_RARE }, { 995, 129 + r(2771), COMMON },
      { i("chocolate cake"), 1, UNCOMMON } };

  public static final int[][] irondragon = { { i("dragon bones"), 1, ALWAYS }, { i("iron bar"), 5, ALWAYS },
      { i("adamant 2h sword"), 1, UNCOMMON }, { i("adamant battleaxe"), 1, UNCOMMON },
      { i("adamant axe"), 1, UNCOMMON }, { i("rune axe"), 1, RARE }, { i("rune mace"), 1, RARE },
      { i("rune longsword"), 1, RARE }, { i("rune battleaxe"), 1, UNCOMMON }, { i("rune 2h sword"), 1, VERY_RARE },
      { i("adamant sq shield"), 1, UNCOMMON }, { i("rune med helm"), 1, RARE }, { i("rune full helm"), 1, RARE },
      { i("rune sq shield"), 1, RARE }, { i("rune kiteshield"), 1, RARE },
      { i("dragon plateskirt"), 1, VERY_RARE + 592 }, { i("dragon platelegs"), 1, VERY_RARE + 541 },
      { i("rune javelin"), 4 + r(4), COMMON }, { i("rune dart"), 9, UNCOMMON }, { i("rune knife"), 1 + r(6), UNCOMMON },
      { i("steel arrow"), 150, RARE }, { i("blood rune"), 15, COMMON }, { i("soul rune"), 3 + r(2), UNCOMMON },
      { i("death rune"), 15 + r(30), RARE }, { i("chaos rune"), 25 + r(25), RARE },
      { i("nature rune"), 60 + r(19), RARE }, { i("law rune"), 45 + r(45), RARE }, { i("adamant bar"), 2, UNCOMMON },
      { i("runite bar"), 1, RARE }, { 161, 1, COMMON }, { 145, 1, RARE }, { 2442, 1, RARE },
      { 995, 270 + r(2730), COMMON }, { i("curry"), 1 + r(1), UNCOMMON } };

  public static final int[][] steeldragon = { { i("dragon bones"), 1, ALWAYS }, { i("steel bar"), 5, ALWAYS },
      { i("rune axe"), 1, UNCOMMON }, { i("rune mace"), 1, COMMON }, { i("rune battleaxe"), 1, RARE },
      { i("rune 2h sword"), 1, RARE }, { i("adamant kiteshield"), 1, UNCOMMON }, { i("rune full helm"), 1, UNCOMMON },
      { i("rune sq shield"), 1, VERY_RARE }, { i("dragon plateskirt"), 1, VERY_RARE + 30 },
      { i("dragon platelegs"), 1, VERY_RARE + 18 }, { i("blood rune"), 20, COMMON }, { i("rune javelin"), 7, COMMON },
      { i("soul rune"), 5, UNCOMMON }, { i("rune dart"), 9 + r(3), UNCOMMON }, { i("rune knife"), 7, UNCOMMON },
      { 995, 470 + r(12180), COMMON }, { 145, 3, COMMON }, { 165, 2, UNCOMMON }, { 161, 1, UNCOMMON },
      { i("runite bar"), 1, UNCOMMON }, { 2011, 1 + r(1), UNCOMMON } };

  public static final int[][] darkwizard = { { i("bones"), 1, ALWAYS }, { i("earth rune"), 10 + r(26), COMMON },
      { i("air rune"), 10 + r(8), COMMON }, { i("water rune"), 10 + r(8), COMMON },
      { i("fire rune"), 10 + r(8), COMMON }, { i("mind rune"), 10 + r(8), COMMON },
      { i("body rune"), 10 + r(8), COMMON }, { i("chaos rune"), 3 + r(2), COMMON },
      { i("nature rune"), 2 + r(3), UNCOMMON }, { i("law rune"), 3, COMMON }, { i("cosmic rune"), 2 + r(2), UNCOMMON },
      { i("blood rune"), 2 + r(2), COMMON }, { 995, 1 + r(29), COMMON }, { i("staff"), 1, COMMON },
      { i("staff of air"), 1, COMMON }, { 1017, 1, COMMON }, { 581, 1, COMMON }, { i("fire talisman"), 1, COMMON },
      { i("earth talisman"), 1, VERY_RARE }, { i("mind talisman"), 1, RARE }, { i("staff of water"), 1, VERY_RARE } };

  public static final int[][] highwayman = { { i("bones"), 1, ALWAYS }, { 1019, 1, ALWAYS } };

  public static final int[][] chaosdruid = { { 526, 1, ALWAYS }, { 199, 1 + r(1), COMMON }, { 201, 1 + r(1), COMMON },
      { 203, 1 + r(1), COMMON }, { 205, 1 + r(1), COMMON }, { 211, 1 + r(1), UNCOMMON }, { 209, 1 + r(1), UNCOMMON },
      { 213, 1 + r(1), UNCOMMON }, { 207, 1 + r(1), UNCOMMON }, { 2485, 1 + r(1), UNCOMMON },
      { 217, 1 + r(1), UNCOMMON }, { 215, 1 + r(1), UNCOMMON }, { 219, 1 + r(1), VERY_RARE },
      { i("law rune"), 2, COMMON }, { i("body rune"), 9, COMMON }, { i("air rune"), 9 + r(27), COMMON },
      { i("earth rune"), 9, COMMON }, { i("mind rune"), 12, COMMON }, { i("nature rune"), 3, UNCOMMON },
      { 995, 2 + r(483), COMMON }, { i("vail of water"), 1, COMMON }, { 540, 1, COMMON }, { 538, 1, COMMON },
      { i("bronze longsword"), 1, UNCOMMON }, { i("snape grass"), 1, RARE }, { i("unholy mould"), 1, RARE },
      { i("cosmic talisman"), 1, VERY_RARE }, { i("iron med helm"), 1, VERY_RARE }, { i("uncut jade"), 1, VERY_RARE } };

  public static final int[][] jailer = { { 526, 1, ALWAYS }, { i("jail key"), 1, ALWAYS } };

  public static final int[][] wyvern = { { 6812, 1, ALWAYS }, { i("mithril sword"), 1, COMMON },
      { i("black axe"), 1, UNCOMMON }, { i("adamant axe"), 1, UNCOMMON }, { i("snakeskin chaps"), 1, UNCOMMON },
      { i("earth battlesatff"), 1, RARE }, { i("granite legs"), 1, RARE }, { 7937, 60, RARE },
      { i("air rune"), 10 + r(54), UNCOMMON }, { i("water rune"), 11 + r(22), UNCOMMON },
      { i("chaos rune"), 10, UNCOMMON }, { i("law rune"), 2 + r(3), UNCOMMON }, { i("blood rune"), 2 + r(9), UNCOMMON },
      { i("soul rune"), 5 + r(9), UNCOMMON }, { i("death rune"), 1 + r(4), UNCOMMON },
      { i("belladonna seed"), 1, UNCOMMON }, { i("cadantine seed"), 1, UNCOMMON },
      { i("dwarf weed seed"), 1, UNCOMMON }, { i("snapdragon seed"), 1, UNCOMMON },
      { i("jangerberry seed"), 1, UNCOMMON }, { i("limpwurt seed"), 1, UNCOMMON }, { i("marentill seed"), 1, UNCOMMON },
      { 5282, 1, UNCOMMON }, { i("ranarr seed"), 1, UNCOMMON }, { i("strawberry seed"), 1, UNCOMMON },
      { i("tarromin seed"), 1, UNCOMMON }, { i("watermelon seed"), 1, UNCOMMON }, { i("whiteberry seed"), 1, UNCOMMON },
      { i("wildblood seed"), 1, UNCOMMON }, { i("toadflax seed"), 1, UNCOMMON }, { i("harralander seed"), 1, UNCOMMON },
      { 995, 20 + r(400), COMMON }, { i("lobster"), 3, UNCOMMON }, { i("bass"), 1, UNCOMMON }, { 149, 1, UNCOMMON },
      { 133, 1, UNCOMMON }, { 199, 1, UNCOMMON }, { 201, 1, UNCOMMON }, { 203, 1, UNCOMMON }, { 205, 1, UNCOMMON },
      { 207, 1, UNCOMMON }, { 209, 1, UNCOMMON }, { 211, 1, UNCOMMON }, { 213, 1, UNCOMMON }, { 215, 1, UNCOMMON },
      { 217, 1, UNCOMMON }, { 2485, 1, UNCOMMON }, };

  public static final int[][] alwaysbones = { { 526, 1, ALWAYS } };

  public static final int[][] bat = { { i("batbones"), 1, ALWAYS } };
}
