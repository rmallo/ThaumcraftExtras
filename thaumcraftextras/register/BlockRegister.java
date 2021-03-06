package thaumcraftextras.register;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCactus;
import net.minecraft.item.ItemStack;
import thaumcraftextras.blocks.TCEBlock;
import thaumcraftextras.blocks.TCEBlockAir;
import thaumcraftextras.blocks.TCEBlockEarth;
import thaumcraftextras.blocks.TCEBlockFire;
import thaumcraftextras.blocks.TCEBlockLight;
import thaumcraftextras.blocks.TCEBlockWater;
import thaumcraftextras.blocks.TCECactus;
import thaumcraftextras.helpers.MainHelper;
import thaumcraftextras.lib.TCELocalization;
import thaumcraftextras.main.Config;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class BlockRegister {

	public static void load()
	{

		researchBlock = new TCEBlock(Config.researchBlockId).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.ResearchBlockTexture);
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
		
		ignisFuelBlock = new TCEBlock(Config.ignisFuelBlockId).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.IgnisFuelBlockTexture);
		GameRegistry.registerBlock(ignisFuelBlock, "IgnisFuelBlock");
		LanguageRegistry.addName(ignisFuelBlock, TCELocalization.IgnisFuelBlock);
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
	public static Block ignisFuelBlock;
}
