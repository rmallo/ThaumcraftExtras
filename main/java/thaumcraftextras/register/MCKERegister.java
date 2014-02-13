package thaumcraftextras.register;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import thaumcraft.common.config.ConfigBlocks;
import thaumcraft.common.config.ConfigItems;
import thaumcraftextras.api.functions.ChargerFunctions;
import thaumcraftextras.api.functions.ExchangeFociFunctions;
import thaumcraftextras.api.functions.ExchangerFunctions;
import thaumcraftextras.api.items.Crystal;
import thaumcraftextras.blocks.BlockCable;
import thaumcraftextras.blocks.BlockCharger;
import thaumcraftextras.blocks.BlockExchanger;
import thaumcraftextras.blocks.MCKCharger;
import thaumcraftextras.helpers.MainHelper;
import thaumcraftextras.lib.TCELocalization;
import thaumcraftextras.main.Config;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class MCKERegister {
	public static void load()
	{
		//Items
		magicCrystal = new Crystal(Config.magicCrystalId, 50, "Tier 1", 0xFF3333);
		magicCrystal.setCreativeTab(CreativeTabRegister.tabMain);
		magicCrystalT2 = new Crystal(Config.magicCrystalT2Id, 100, "Tier 2", 0x0099FF);
		magicCrystalT2.setCreativeTab(CreativeTabRegister.tabMain);
		magicCrystalT3 = new Crystal(Config.magicCrystalT3Id, 250, "Tier 3", 0x6600CC);
		magicCrystalT3.setCreativeTab(CreativeTabRegister.tabMain);
		magicCrystalT4 = new Crystal(Config.magicCrystalT4Id, 500, "Tier 4", 0x9999CC);
		magicCrystalT4.setCreativeTab(CreativeTabRegister.tabMain);

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
	
	public static Crystal magicCrystal;
	public static Crystal magicCrystalT2;
	public static Crystal magicCrystalT3;
	public static Crystal magicCrystalT4;

	public static Block MCKCharger;
	public static Block exchanger;
	public static Block generator;
	public static Block smelter;
	public static Block charger;
	public static Block cable;

}
