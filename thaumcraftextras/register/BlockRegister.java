package thaumcraftextras.register;

import net.minecraft.block.Block;
import thaumcraftextras.blocks.TCEBlock;
import thaumcraftextras.helpers.MainHelper;
import thaumcraftextras.lib.TCELocalization;
import thaumcraftextras.main.Config;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class BlockRegister {

	public static void load()
	{
		System.out.print("Added Blocks, ");

		researchBlock = new TCEBlock(Config.researchBlockId).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.ResearchBlockTexture);
		GameRegistry.registerBlock(researchBlock, "ResearchBlock");
		LanguageRegistry.addName(researchBlock, TCELocalization.ResearchBlock);
		
		fireBlock = new TCEBlock(Config.fireBlockId).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.FireBlockTexture);
		GameRegistry.registerBlock(fireBlock, "FireBlock");
		LanguageRegistry.addName(fireBlock, TCELocalization.FireBlock);
		
		airBlock = new TCEBlock(Config.airBlockId).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.AirBlockTexture);
		GameRegistry.registerBlock(airBlock, "AirBlock");
		LanguageRegistry.addName(airBlock, TCELocalization.AirBlock);
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
}
