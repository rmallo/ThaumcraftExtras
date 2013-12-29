package thaumcraftextras.register;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import thaumcraft.common.config.ConfigItems;
import thaumcraft.common.items.ItemWispEssence;
import thaumcraft.common.items.wands.ItemFocusPouch;
import thaumcraftextras.api.ChargerFunctions;
import thaumcraftextras.api.ExchangerFunctions;
import thaumcraftextras.blocks.BlockExchanger;
import thaumcraftextras.blocks.MCKCharger;
import thaumcraftextras.helpers.MainHelper;
import thaumcraftextras.items.MagicCrystal;
import thaumcraftextras.lib.TCELocalization;
import thaumcraftextras.main.Config;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class MCKERegister {
	public static void load()
	{
		//Items
		magicCrystal = new MagicCrystal(Config.magicCrystalId).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.magicCrystalTexture);
		GameRegistry.registerItem(magicCrystal, "MagicCrystal");
		LanguageRegistry.addName(magicCrystal, TCELocalization.magicCrystal);
		
		addToCharger();
		addToExchanger();
		
		MCKCharger = new MCKCharger(Config.mckChargerId).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.magicChargerTexture);
		GameRegistry.registerBlock(MCKCharger, "MagicCharger");
		LanguageRegistry.addName(MCKCharger, TCELocalization.magicCharger);
		
		exchanger = new BlockExchanger(Config.exchangerId).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.exchangerTexture);
		GameRegistry.registerBlock(exchanger, "Exchanger");
		LanguageRegistry.addName(exchanger, TCELocalization.exchanger);
		
	}
	
	public static void addToCharger()
	{
		ChargerFunctions.addChargeAble(magicCrystal);
		
		ChargerFunctions.addFuel(ConfigItems.itemShard);
		ChargerFunctions.addFuel(InfusionRegister.lightShard);
		ChargerFunctions.addFuel(ItemRegister.ignisFuel);
	}
	
	public static void addToExchanger()
	{
		ExchangerFunctions.addItem(Item.dyePowder);
	}
	
	public static Item magicCrystal;
	public static Block MCKCharger;
	public static Block exchanger;
}
