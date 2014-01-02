package thaumcraftextras.register;

import thaumcraftextras.helpers.LanguageConverting;


public class ModRegister {

	public static void load()
	{
    	AspectRegister.addAspects();
    	MiscRegister.load();
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
