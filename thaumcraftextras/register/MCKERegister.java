package thaumcraftextras.register;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import thaumcraft.common.config.ConfigItems;
import thaumcraftextras.api.functions.ChargerFunctions;
import thaumcraftextras.api.functions.ExchangerFunctions;
import thaumcraftextras.blocks.BlockCable;
import thaumcraftextras.blocks.BlockCharger;
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
		
		charger = new BlockCharger(Config.chargerId).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.chargerTexture);
		GameRegistry.registerBlock(charger, "Charger");
		LanguageRegistry.addName(charger, TCELocalization.charger);
		
		cable = new BlockCable(Config.cableId).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.cableTexture);
		GameRegistry.registerBlock(cable, "MagicCable");
		LanguageRegistry.addName(cable, TCELocalization.cable);
		
		/*
		magicCable = new MagicCable(Config.cableId).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.cableTexture);
		GameRegistry.registerBlock(magicCable, "MagicCable");
		LanguageRegistry.addName(magicCable, TCELocalization.cable);
		*/
		
	}
	
	public static void addToCharger()
	{
		ChargerFunctions.addChargeAble(magicCrystal);
		
		ChargerFunctions.addFuel(ConfigItems.itemShard, 1);
		ChargerFunctions.addFuel(InfusionRegister.lightShard, 2);
		ChargerFunctions.addFuel(ItemRegister.ignisFuel, 3);
		ChargerFunctions.addFuel(ItemRegister.pechTradeTier1, 4);
		ChargerFunctions.addFuel(ItemRegister.magicTradeTier1, 5);
		ChargerFunctions.addFuel(ConfigItems.itemManaBean, 5);
		ChargerFunctions.addFuel(ItemRegister.darkThaumium, 8);
	}
	
	public static void addToExchanger()
	{
		ExchangerFunctions.addItem(Item.dyePowder, 15);
		ExchangerFunctions.addItem(ConfigItems.itemShard, 5);
	}
	
	public static Item magicCrystal;
	public static Block MCKCharger;
	public static Block exchanger;
	public static Block generator;
	public static Block smelter;
	public static Block charger;
	public static Block cable;

}
