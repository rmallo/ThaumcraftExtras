package thaumcraftextras.register;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import thaumcraft.common.config.ConfigItems;
import thaumcraftextras.api.ChargerFunctions;
import thaumcraftextras.blocks.MCKCharger;
import thaumcraftextras.helpers.MainHelper;
import thaumcraftextras.items.MagicCrystal;
import thaumcraftextras.lib.TCELocalization;
import thaumcraftextras.main.Config;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class PostRegister {

	public static void load()
	{
		//Items
		magicCrystal = new MagicCrystal(Config.magicCrystalId).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.magicCrystalTexture);
		GameRegistry.registerItem(magicCrystal, "MagicCrystal");
		LanguageRegistry.addName(magicCrystal, TCELocalization.magicCrystal);
		
		addToCharger();
		
		MCKCharger = new MCKCharger(Config.mckChargerId).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.magicChargerTexture);
		GameRegistry.registerBlock(MCKCharger, "MagicCharger");
		LanguageRegistry.addName(MCKCharger, TCELocalization.magicCharger);
		
		
	}
	
	public static void addToCharger()
	{
		ChargerFunctions.addChargeAble(magicCrystal);
		
		
		ChargerFunctions.addFuel(ConfigItems.itemShard);
		ChargerFunctions.addFuel(InfusionRegister.lightShard);
		ChargerFunctions.addFuel(ItemRegister.ignisFuel);
	}
	
	public static Item magicCrystal;
	public static Block MCKCharger;
}
