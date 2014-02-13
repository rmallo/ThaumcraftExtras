package thaumcraftextras.register;

import thaumcraftextras.helpers.LanguageConverting;
import thaumcraftextras.main.Config;
import thaumcraftextras.register.modSupport.Forestry;
import thaumcraftextras.register.modSupport.TinkersConstruct;


public class ModRegister {

	public static void load()
	{
    	AspectRegister.addAspects();
    	MiscRegister.load();
    	BlockRegister.load();
    	BlockRegister.recipe();
    	BlockRegister.oreDictionary();
    	ItemRegister.load();
    	ItemRegister.recipe();
    	EntityRegister.load();
    	InfusionRegister.load();
    	InfusionRegister.recipe();
    	MCKERegister.load();
    	ThaumcraftRecipeRegister.load();
    	CreativeTabRegister.load();
	}
	
	public static void postLoad()
	{
	if(Config.forestrySupport)
	Forestry.isInstalled();
	
	
	TinkersConstruct.isInstalled();
	ThaumonomiconRegister.addPage();
	ThaumonomiconRegister.addEntryToThaumonomicon();
	LanguageConverting.load();
	}
}
