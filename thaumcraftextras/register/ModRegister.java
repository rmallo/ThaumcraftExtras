package thaumcraftextras.register;

import net.minecraft.item.Item;
import thaumcraftextras.api.ChargerFunctions;
import thaumcraftextras.helpers.LanguageConverting;
import thaumcraftextras.helpers.ModSupportHelper;


public class ModRegister {

	public static void load()
	{
    	AspectRegister.addAspects();
    	ItemRegister.load();
    	ItemRegister.recipe();
    	BlockRegister.load();
    	BlockRegister.recipe();
    	BlockRegister.oreDictionary();
    	EntityRegister.load();
    	InfusionRegister.load();
    	InfusionRegister.recipe();
    	MCKERegister.load();
    	ThaumcraftRecipeRegister.load();
    	CreativeTabRegister.load();
	}
	
	public static void postLoad()
	{
	ThaumonomiconRegister.addPage();
	ThaumonomiconRegister.addEntryToThaumonomicon();
	LanguageConverting.load();
	}
}
