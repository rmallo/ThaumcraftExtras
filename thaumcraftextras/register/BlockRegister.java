package thaumcraftextras.register;

import java.awt.Color;

import net.minecraft.block.Block;
import thaumcraftextras.blocks.ColoredThaumiumBlock;
import thaumcraftextras.blocks.TCEBlock;
import thaumcraftextras.blocks.TCEBlockAir;
import thaumcraftextras.blocks.TCEBlockColor;
import thaumcraftextras.blocks.TCEBlockEarth;
import thaumcraftextras.blocks.TCEBlockEnder;
import thaumcraftextras.blocks.TCEBlockFire;
import thaumcraftextras.blocks.TCEBlockLight;
import thaumcraftextras.blocks.TCEBlockResearch;
import thaumcraftextras.blocks.TCEBlockWater;
import thaumcraftextras.blocks.TCECactus;
import thaumcraftextras.blocks.ThaumiumGlass;
import thaumcraftextras.helpers.MainHelper;
import thaumcraftextras.lib.TCELocalization;
import thaumcraftextras.main.Config;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class BlockRegister {

	public static void load()
	{

		researchBlock = new TCEBlockResearch(Config.researchBlockId).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.ResearchBlockTexture);
		GameRegistry.registerBlock(researchBlock, "ResearchBlock");
		LanguageRegistry.addName(researchBlock, TCELocalization.ResearchBlock);
		
		fireBlock = new TCEBlockFire(Config.fireBlockId);//.setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.FireBlockTexture);
		GameRegistry.registerBlock(fireBlock, "FireBlock");
		LanguageRegistry.addName(fireBlock, TCELocalization.FireBlock);
		
		airBlock = new TCEBlockAir(Config.airBlockId).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.AirBlockTexture);
		GameRegistry.registerBlock(airBlock, "AirBlock");
		LanguageRegistry.addName(airBlock, TCELocalization.AirBlock);
		
		earthBlock = new TCEBlockEarth(Config.earthBlockId).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.EarthBlockTexture);
		GameRegistry.registerBlock(earthBlock, "EarthBlock");
		LanguageRegistry.addName(earthBlock, TCELocalization.EarthBlock);
		
		waterBlock = new TCEBlockWater(Config.waterBlockId).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.WaterBlockTexture);
		GameRegistry.registerBlock(waterBlock, "WaterBlock");
		LanguageRegistry.addName(waterBlock, TCELocalization.WaterBlock);
		
		lightBlock = new TCEBlockLight(Config.lightBlockId).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.LightBlockTexture);
		GameRegistry.registerBlock(lightBlock, "LightBlock");
		LanguageRegistry.addName(lightBlock, TCELocalization.LightBlock);
		
		cactusBlock = new TCECactus(Config.cactusBlockId).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.cactusBlockTexture);
		GameRegistry.registerBlock(cactusBlock, "CactusBlock");
		LanguageRegistry.addName(cactusBlock, TCELocalization.CactusBlock);
		
		enderBlock = new TCEBlockEnder(Config.enderBlockId).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.EnderBlockTexture);
		GameRegistry.registerBlock(enderBlock, "EnderBlock");
		LanguageRegistry.addName(enderBlock, TCELocalization.EnderBlock);
		
		ignisFuelBlock = new TCEBlock(Config.ignisFuelBlockId).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.IgnisFuelBlockTexture);
		GameRegistry.registerBlock(ignisFuelBlock, "IgnisFuelBlock");
		LanguageRegistry.addName(ignisFuelBlock, TCELocalization.IgnisFuelBlock);
			
		thaumiumGlass = new ThaumiumGlass(Config.thaumiumGlassId).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.ThaumiumGlassTexture);
		GameRegistry.registerBlock(thaumiumGlass, "ThaumiumGlass");
		LanguageRegistry.addName(thaumiumGlass, TCELocalization.ThaumiumGlass);
		 
		//colorBlock = new ColoredThaumiumBlock(Config.colorBlockId);
		//GameRegistry.registerBlock(colorBlock, "ColorBlock");
		//LanguageRegistry.addName(colorBlock, TCELocalization.colorBlock);
		
		
		/*
		teleporterBlock = new TCETeleporter(Config.teleporterBlockId).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.TeleporterBlock);
		GameRegistry.registerBlock(teleporterBlock, "TeleporterBlock");
		LanguageRegistry.addName(teleporterBlock, TCELocalization.TeleporterBlock);
		*/
		
		/*
		teslaBlock = new TCETesla(Config.teslaBlockId).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.TeslaBlockTexture);
		GameRegistry.registerBlock(teslaBlock, "TeslaBlock");
		LanguageRegistry.addName(teslaBlock, TCELocalization.teslaBlock);
		*/
	}
	
	public static void recipe()
	{
	}
	
	public static void oreDictionary()
	{
		
	}
	public static Block researchBlock;
	public static Block fireBlock;
	public static Block airBlock;
	public static Block waterBlock;
	public static Block earthBlock;
	public static Block lightBlock;
	public static Block cactusBlock;
	public static Block enderBlock;
	public static Block ignisFuelBlock;
	public static Block teleporterBlock;
	public static Block teslaBlock;
	public static Block thaumiumGlass;
	public static ColoredThaumiumBlock colorBlock;
}
