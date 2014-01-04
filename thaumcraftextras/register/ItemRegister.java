package thaumcraftextras.register;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.wands.WandRod;
import thaumcraft.common.items.wands.WandRodPrimalOnUpdate;
import thaumcraftextras.api.functions.DestroyFunctions;
import thaumcraftextras.helpers.FuelHelper;
import thaumcraftextras.helpers.MainHelper;
import thaumcraftextras.items.RodItem;
import thaumcraftextras.items.TCEItem;
import thaumcraftextras.items.XPExtractor;
import thaumcraftextras.items.foci.ArrowFoci;
import thaumcraftextras.items.foci.BeamExchangeFoci;
import thaumcraftextras.items.foci.CleanFoci;
import thaumcraftextras.items.foci.ConfusionFoci;
import thaumcraftextras.items.foci.DestroyFoci;
import thaumcraftextras.items.foci.DispelFoci;
import thaumcraftextras.items.foci.EnderFoci;
import thaumcraftextras.items.foci.EntityFoci;
import thaumcraftextras.items.foci.ExchangeFoci;
import thaumcraftextras.items.foci.ExperienceFoci;
import thaumcraftextras.items.foci.FreezeFoci;
import thaumcraftextras.items.foci.HealFoci;
import thaumcraftextras.items.foci.ReturnFoci;
import thaumcraftextras.items.foci.SmeltingFoci;
import thaumcraftextras.items.foci.SnowballFoci;
import thaumcraftextras.items.foci.SpeedFoci;
import thaumcraftextras.lib.TCELocalization;
import thaumcraftextras.main.Config;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ItemRegister {

	public static void load()
	{	
		ignisFuel = new TCEItem(Config.ignisFuelId).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.IgnisFuelTexture);
		LanguageRegistry.addName(ignisFuel, TCELocalization.IgnisFuel);
		GameRegistry.registerFuelHandler(new FuelHelper());
		
		darkThaumium = new TCEItem(Config.darkThaumiumId).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.DarkThaumiumTexture);
		LanguageRegistry.addName(darkThaumium, TCELocalization.DarkThaumium);
		
		pechTradeTier1 = new TCEItem(Config.pechTradeTier1Id).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.PechTradeTier1Texture);
		LanguageRegistry.addName(pechTradeTier1, TCELocalization.PechTradeTier1);

		pechTradeTier2 = new TCEItem(Config.pechTradeTier2Id).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.PechTradeTier2Texture);
		LanguageRegistry.addName(pechTradeTier2, TCELocalization.PechTradeTier2);
		
		pechTradeTier3 = new TCEItem(Config.pechTradeTier3Id).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.PechTradeTier3Texture);
		LanguageRegistry.addName(pechTradeTier3, TCELocalization.PechTradeTier3);
		
		pechTradeTier4 = new TCEItem(Config.pechTradeTier4Id).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.PechTradeTier4Texture);
		LanguageRegistry.addName(pechTradeTier4, TCELocalization.PechTradeTier4);
		
		pechTradeTier5 = new TCEItem(Config.pechTradeTier5Id).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.PechTradeTier5Texture);
		LanguageRegistry.addName(pechTradeTier5, TCELocalization.PechTradeTier5);
		
		magicTradeTier1 = new TCEItem(Config.magicTradeTier1Id).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.MagicTradeTier1Texture);
		LanguageRegistry.addName(magicTradeTier1, TCELocalization.MagicTradeTier1);
		
		magicTradeTier2 = new TCEItem(Config.magicTradeTier2Id).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.MagicTradeTier2Texture);
		LanguageRegistry.addName(magicTradeTier2, TCELocalization.MagicTradeTier2);
		
		magicTradeTier3 = new TCEItem(Config.magicTradeTier3Id).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.MagicTradeTier3Texture);
		LanguageRegistry.addName(magicTradeTier3, TCELocalization.MagicTradeTier3);
		
		magicTradeTier4 = new TCEItem(Config.magicTradeTier4Id).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.MagicTradeTier4Texture);
		LanguageRegistry.addName(magicTradeTier4, TCELocalization.MagicTradeTier4);
		
		magicTradeTier5 = new TCEItem(Config.magicTradeTier5Id).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.MagicTradeTier5Texture);
		LanguageRegistry.addName(magicTradeTier5, TCELocalization.MagicTradeTier5);
		
		enderFoci = new EnderFoci(Config.enderFociId).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.enderFociTexture);
		LanguageRegistry.addName(enderFoci, TCELocalization.enderFoci);
		
		arrowFoci = new ArrowFoci(Config.arrowFociId).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.arrowFociTexture);
		LanguageRegistry.addName(arrowFoci, TCELocalization.arrowFoci);
		
		healFoci = new HealFoci(Config.healFociId).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.healFociTexture);
		LanguageRegistry.addName(healFoci, TCELocalization.healFoci);
		
		speedFoci = new SpeedFoci(Config.speedFociId).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.speedFociTexture);
		LanguageRegistry.addName(speedFoci, TCELocalization.speedFoci);

		xpFoci = new ExperienceFoci(Config.xpFociId).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.xpFociTexture);
		LanguageRegistry.addName(xpFoci, TCELocalization.xpFoci);
		
		xpExtractor = new XPExtractor(Config.xpExtractorId).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.xpExtractorTexture);
		LanguageRegistry.addName(xpExtractor, TCELocalization.xpExtractor);
		
		returnFoci = new ReturnFoci(Config.returnFociId).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.returnFociTexture);
		LanguageRegistry.addName(returnFoci,  TCELocalization.returnFoci);
		
		exchangeFoci = new ExchangeFoci(Config.exchangeFociId).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.exchangeFociTexture);
		LanguageRegistry.addName(exchangeFoci,  TCELocalization.exchangeFoci);
		
		smeltingFoci = new SmeltingFoci(Config.smeltingFociId).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.smeltingFociTexture);
		LanguageRegistry.addName(smeltingFoci,  TCELocalization.smeltingFoci);
		
		dispelFoci = new DispelFoci(Config.dispelFociId).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.dispelFociTexture);
		LanguageRegistry.addName(dispelFoci,  TCELocalization.dispelFoci);
        
		addToDestroy();
		destroyFoci = new DestroyFoci(Config.destroyFociId).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.destroyFociTexture);
		LanguageRegistry.addName(destroyFoci,  TCELocalization.destroyFoci);
		
		freezeFoci = new FreezeFoci(Config.freezeFociId).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.freezeFociTexture);
		LanguageRegistry.addName(freezeFoci,  TCELocalization.freezeFoci);
		
		beamExchangeFoci = new BeamExchangeFoci(Config.beamExchangeFociId).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.beamExchangeFociTexture);
		LanguageRegistry.addName(beamExchangeFoci,  TCELocalization.beamExchangeFoci);

		confusionFoci = new ConfusionFoci(Config.confusionFociId).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.confusionFociTexture);
		LanguageRegistry.addName(confusionFoci,  TCELocalization.confusionFoci);
		
		snowFoci = new SnowballFoci(Config.snowballFociId).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.snowFociTexture);
		LanguageRegistry.addName(snowFoci,  TCELocalization.snowFoci);
		
		cleanFoci = new CleanFoci(Config.cleanFociId).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.cleanFociTexture);
		LanguageRegistry.addName(cleanFoci,  TCELocalization.cleanFoci);
		
		/*
		colorPouch = new ColorPouch(Config.colorPouchId);
		LanguageRegistry.addName(colorPouch, TCELocalization.colorPouch);
		*/
		
		/** Special Wands */
		ultimateRodItem = new RodItem(Config.ultimateRodId).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.ultimateRodTexture);
        ultimateRod = new WandRod("ultimate", 99999, new ItemStack(ultimateRodItem), 999, new WandRodPrimalOnUpdate(Aspect.ORDER),  new ResourceLocation("thaumcraftextras","textures/models/wand_rod_ultimate.png"));
        LanguageRegistry.addName(ultimateRodItem, "Ultimate Rod");
        
        /** Tier Rods */
		ironRodItem = new RodItem(Config.ironRodId).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.ironRodTexture);
        ironRod = new WandRod("iron", 65, new ItemStack(ironRodItem), 14,  new ResourceLocation("thaumcraftextras","textures/models/wand_rod_iron.png"));
        LanguageRegistry.addName(ironRodItem, "Iron Rod");
        
		goldRodItem = new RodItem(Config.goldRodId).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.goldRodTexture);
        goldRod = new WandRod("gold", 60, new ItemStack(goldRodItem), 12,  new ResourceLocation("thaumcraftextras","textures/models/wand_rod_gold.png"));
        LanguageRegistry.addName(goldRodItem, "Gold Rod");
        
		diamondRodItem = new RodItem(Config.diamondRodId).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.diamondRodTexture);
        diamondRod = new WandRod("diamond", 90, new ItemStack(diamondRodItem), 18,  new ResourceLocation("thaumcraftextras","textures/models/wand_rod_diamond.png"));
        LanguageRegistry.addName(diamondRodItem, "Diamond Rod");
        
		emeraldRodItem = new RodItem(Config.emeraldRodId).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.emeraldRodTexture);
        emeraldRod = new WandRod("emerald", 80, new ItemStack(emeraldRodItem), 16,  new ResourceLocation("thaumcraftextras","textures/models/wand_rod_emerald.png"));
        LanguageRegistry.addName(emeraldRodItem, "Emerald Rod");
	
		angelRodItem = new RodItem(Config.angelRodId).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.angelRodTexture);
        angelRod = new WandRod("angel", 150, new ItemStack(angelRodItem), 20,  new ResourceLocation("thaumcraftextras","textures/models/wand_rod_angel.png"));
        LanguageRegistry.addName(angelRodItem, "Angel Rod");
        
        devilRodItem = new RodItem(Config.devilRodId).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.devilRodTexture);
        devilRod = new WandRod("devil", 250, new ItemStack(devilRodItem), 30,  new ResourceLocation("thaumcraftextras","textures/models/wand_rod_devil.png"));
        LanguageRegistry.addName(devilRodItem, "Devil Rod");
        
        godRodItem = new RodItem(Config.godRodId).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.godRodTexture);
        godRod = new WandRod("god", 500, new ItemStack(godRodItem), 40,  new ResourceLocation("thaumcraftextras","textures/models/wand_rod_god.png"));
        LanguageRegistry.addName(godRodItem, "God Rod");
        
        
        /** Event Items */
		candyRodItem = new RodItem(Config.candyRodId).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.candyRodTexture);
        candyRod = new WandRod("candy", 35, new ItemStack(candyRodItem), 6,  new ResourceLocation("thaumcraftextras","textures/models/wand_rod_candy.png"));
        LanguageRegistry.addName(candyRodItem, "Candy Rod");
	}
	
	public static void addToDestroy()
	{
	    DestroyFunctions.canDestroy.put(BlockRegister.wardedBlock.blockID, 0);
	    DestroyFunctions.canDestroy.put(BlockRegister.wardedCarpet.blockID, 1);
	    DestroyFunctions.canDestroy.put(BlockRegister.wardedCover.blockID, 2);
	    DestroyFunctions.canDestroy.put(BlockRegister.wardedGlass.blockID, 3);
	    DestroyFunctions.canDestroy.put(BlockRegister.wardedPilar.blockID, 4);
	    DestroyFunctions.canDestroy.put(BlockRegister.wardedSlab.blockID, 5);
	    DestroyFunctions.canDestroy.put(BlockRegister.wardedWall.blockID, 6);
	    DestroyFunctions.canDestroy.put(BlockRegister.openWarded.blockID, 7);
	    DestroyFunctions.canDestroy.put(BlockRegister.hiddenWarded.blockID, 8);
	    DestroyFunctions.canDestroy.put(Block.bedrock.blockID, 9);
	}
	public static void recipe()
	{
	}
	
	public static Item colorPouch;
	public static Item pechTradeTier1;
	public static Item pechTradeTier2;
	public static Item pechTradeTier3;
	public static Item pechTradeTier4;
	public static Item pechTradeTier5;
	
	public static Item magicTradeTier1;
	public static Item magicTradeTier2;
	public static Item magicTradeTier3;
	public static Item magicTradeTier4;
	public static Item magicTradeTier5;
	
	public static Item ignisFuel;
	public static Item xpExtractor;
	public static Item darkThaumium;

	
	public static Item enderFoci;
	public static Item arrowFoci;
	public static Item healFoci;
	public static Item speedFoci;
	public static Item xpFoci;
	public static Item returnFoci;
	public static Item exchangeFoci;
	public static Item smeltingFoci;
	public static Item dispelFoci;
	public static Item destroyFoci;
	public static Item freezeFoci;
	public static Item beamExchangeFoci;
	public static Item beamHealFoci;
	public static Item confusionFoci;
	public static Item fireworkFoci;
	public static Item snowFoci;
	public static Item cleanFoci;
	
	public static WandRod ultimateRod;
	public static WandRod ironRod;
	public static WandRod goldRod;
	public static WandRod diamondRod;
	public static WandRod emeraldRod;
	public static WandRod candyRod;
	public static WandRod angelRod;
	public static WandRod devilRod;
	public static WandRod godRod;

	public static Item ultimateRodItem;
	public static Item ironRodItem;
	public static Item goldRodItem;
	public static Item diamondRodItem;
	public static Item emeraldRodItem;
	public static Item candyRodItem;
	public static Item angelRodItem;
	public static Item devilRodItem;
	public static Item godRodItem;

}
