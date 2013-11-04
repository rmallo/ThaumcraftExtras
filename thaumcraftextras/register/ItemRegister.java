package thaumcraftextras.register;

import net.minecraft.item.Item;
import thaumcraftextras.helpers.MainHelper;
import thaumcraftextras.items.TCEItem;
import thaumcraftextras.items.foci.ArrowFoci;
import thaumcraftextras.items.foci.EnderFoci;
import thaumcraftextras.items.foci.HealFoci;
import thaumcraftextras.items.foci.SpeedFoci;
import thaumcraftextras.lib.TCELocalization;
import thaumcraftextras.main.Config;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ItemRegister {

	public static void load()
	{
		System.out.print("Added Materials, ");
		
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
	}
	
	public static void recipe()
	{
	}
	
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
	
	public static Item enderFoci;
	public static Item arrowFoci;
	public static Item healFoci;
	public static Item speedFoci;
}
