package thaumcraftextras.main;

import java.io.File;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import net.minecraftforge.common.Configuration;

public class Config {


	public static void loadConfig(FMLPreInitializationEvent e){
		Configuration config = new Configuration(e.getSuggestedConfigurationFile());

	        researchBlockId = config.getBlock("researchBlock", 224).getInt();
	        fireBlockId = config.getBlock("fireBlock", 225).getInt();
	        airBlockId = config.getBlock("airBlock", 226).getInt();
	        earthBlockId = config.getBlock("earthBlock", 227).getInt();
	        waterBlockId = config.getBlock("waterBlock", 228).getInt();
	        lightBlockId = config.getBlock("lightBlock", 229).getInt();
	        ignisFuelBlockId = config.getBlock("ignisFuelBlock", 330).getInt();
	        cactusBlockId = config.getBlock("cactusBlock", 331).getInt();
	        enderBlockId = config.getBlock("enderBlock", 332).getInt();
	        thaumiumGlassId = config.getBlock("thaumiumGlass", 333).getInt();
	       // colorBlockId = config.getBlock("colorBlock", 555).getInt();
	        //teslaBlockId = config.getBlock("teslaBlock", 335).getInt();
	       // teleporterBlockId = config.getBlock("teleporterBlock", 366).getInt();

	        pechTradeTier1Id = config.getItem("pechTradeTier1", 12225).getInt();
	        pechTradeTier2Id = config.getItem("pechTradeTier2", 12226).getInt();
	        pechTradeTier3Id = config.getItem("pechTradeTier3", 12227).getInt();
	        pechTradeTier4Id = config.getItem("pechTradeTier4", 12228).getInt();
	        pechTradeTier5Id = config.getItem("pechTradeTier5", 12229).getInt();

	        magicTradeTier1Id = config.getItem("magicTradeTier1", 12230).getInt();
	        magicTradeTier2Id = config.getItem("magicTradeTier2", 12231).getInt();
	        magicTradeTier3Id = config.getItem("magicTradeTier3", 12232).getInt();
	        magicTradeTier4Id = config.getItem("magicTradeTier4", 12233).getInt();
	        magicTradeTier5Id = config.getItem("magicTradeTier5", 12234).getInt();
	        ignisFuelId = config.getItem("ignisFuel", 12235).getInt();
	        ultimateRodId = config.getItem("ultimateRod", 12236).getInt();
	        ironRodId = config.getItem("ironRod", 12237).getInt();
	        goldRodId = config.getItem("goldRod", 12238).getInt();
	        diamondRodId = config.getItem("diamondRod", 12239).getInt();
	        emeraldRodId = config.getItem("emeraldRod", 12240).getInt();

	        enderFociId = config.getItem("enderFoci", 13230).getInt();
	        arrowFociId = config.getItem("arrowFoci", 13231).getInt();
	        healFociId = config.getItem("healFoci", 13232).getInt();
	        speedFociId = config.getItem("speedFoci", 13233).getInt();
	        xpFociId = config.getItem("xpFoci", 13235).getInt();
	        returnFociId = config.getItem("returnFoci", 13256).getInt();
	        exchangeFociId = config.getItem("exchangeFoci", 13257).getInt();
	        smeltingFociId = config.getItem("smeltingFoci", 13258).getInt();
	        dispelFociId = config.getItem("dispelFoci", 13259).getInt();
	        destroyFociId = config.getItem("destoryFoci", 13260).getInt();
	        freezeFociId = config.getItem("freezeFoci", 13263).getInt();
	        beamExchangeFociId = config.getItem("beamExchangeFoci", 13264).getInt();

	        lightShardId = config.getItem("lightShard", 14201).getInt();
	        emptyShardId = config.getItem("emptyShard", 14202).getInt();
	        xpShardId = config.getItem("xpShard", 14203).getInt();
	        xpExtractorId = config.getItem("xpExtractor", 14204).getInt();
	        colorPouchId = config.getItem("colorPouch", 14205).getInt();

	        enderFoci = config.get(Configuration.CATEGORY_GENERAL, "enderFoci", true).getBoolean(enderFoci);
	    	arrowFoci = config.get(Configuration.CATEGORY_GENERAL, "arrowFoci", true).getBoolean(arrowFoci);
	    	healFoci = config.get(Configuration.CATEGORY_GENERAL, "healFoci", true).getBoolean(healFoci);
	    	speedFoci = config.get(Configuration.CATEGORY_GENERAL, "speedFoci", true).getBoolean(speedFoci);
	    	fireBlock = config.get(Configuration.CATEGORY_GENERAL, "fireBlock", true).getBoolean(fireBlock);
	    	earthBlock = config.get(Configuration.CATEGORY_GENERAL, "earthBlock", true).getBoolean(earthBlock);
	    	waterBlock = config.get(Configuration.CATEGORY_GENERAL, "waterBlock", true).getBoolean(waterBlock);
	    	lightBlock = config.get(Configuration.CATEGORY_GENERAL, "lightBlock", true).getBoolean(lightBlock);
	    	pechTrade = config.get(Configuration.CATEGORY_GENERAL, "pechTrade", true).getBoolean(pechTrade);
	    	magicTrade = config.get(Configuration.CATEGORY_GENERAL, "magicTrade", true).getBoolean(magicTrade);
	    	xpFoci = config.get(Configuration.CATEGORY_GENERAL, "xpFoci", true).getBoolean(xpFoci);
	    	xpExtractor = config.get(Configuration.CATEGORY_GENERAL, "xpExtractor", true).getBoolean(xpExtractor);
	    	returnFoci = config.get(Configuration.CATEGORY_GENERAL, "returnFoci", true).getBoolean(returnFoci);
	    	exchangeFoci = config.get(Configuration.CATEGORY_GENERAL, "exchangeFoci", true).getBoolean(exchangeFoci);
	    	smeltingFoci = config.get(Configuration.CATEGORY_GENERAL, "smeltingFoci", true).getBoolean(smeltingFoci);
	    	dispelFoci = config.get(Configuration.CATEGORY_GENERAL, "dispelFoci", true).getBoolean(dispelFoci);
	    	destroyFoci = config.get(Configuration.CATEGORY_GENERAL, "destroyFoci", true).getBoolean(destroyFoci);
	    	freezeFoci = config.get(Configuration.CATEGORY_GENERAL, "freezeFoci", true).getBoolean(freezeFoci);
	    	enderBlock = config.get(Configuration.CATEGORY_GENERAL, "enderBlock", true).getBoolean(enderBlock);
	    	beamExchangeFoci = config.get(Configuration.CATEGORY_GENERAL, "beamExchangeFoci", true).getBoolean(beamExchangeFoci);

	    	config.save();
}
	
    public static int researchBlockId;
    public static int fireBlockId;
    public static int airBlockId;
    public static int waterBlockId;
    public static int earthBlockId;
    public static int lightBlockId;
    //public static int darkBlockId;
    public static int cactusBlockId;
    public static int enderBlockId;
	//public static int teleporterBlockId;
    public static int teslaBlockId;
	public static int thaumiumGlassId;    
	public static int colorBlockId;
	
    public static int pechTradeTier1Id;
    public static int pechTradeTier2Id;
    public static int pechTradeTier3Id;
    public static int pechTradeTier4Id;
    public static int pechTradeTier5Id;
    
    public static int magicTradeTier1Id;
    public static int magicTradeTier2Id;
    public static int magicTradeTier3Id;
    public static int magicTradeTier4Id;
    public static int magicTradeTier5Id;
    public static int ignisFuelId;
    public static int ignisFuelBlockId;
    public static int ultimateRodId;
    public static int ironRodId;
	public static int goldRodId;
	public static int diamondRodId;
	public static int emeraldRodId;

    public static int enderFociId;
    public static int arrowFociId;  
    public static int healFociId;
    public static int speedFociId;
    public static int xpFociId;
    public static int returnFociId;
    public static int exchangeFociId;
    public static int smeltingFociId;
    public static int dispelFociId;
    public static int destroyFociId;
    public static int freezeFociId;
    public static int beamExchangeFociId;
    
    public static int lightShardId;
    public static int emptyShardId;
    public static int xpShardId;
    public static int xpExtractorId;
    public static int colorPouchId;
    
    public static boolean enderFoci;
    public static boolean arrowFoci;
    public static boolean healFoci;
    public static boolean speedFoci;
    public static boolean pechTrade;
    public static boolean magicTrade;
    public static boolean fireBlock;
    public static boolean waterBlock;
    public static boolean lightBlock;
    public static boolean earthBlock;
    public static boolean xpExtractor;
    public static boolean xpFoci;
    public static boolean returnFoci;
    public static boolean exchangeFoci;
    public static boolean dispelFoci;
    public static boolean smeltingFoci;
    public static boolean destroyFoci;
    public static boolean freezeFoci;
    public static boolean enderBlock;
	public static boolean beamExchangeFoci;
	}
