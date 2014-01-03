package thaumcraftextras.register;

import thaumcraftextras.helpers.LanguageConverting;


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
	ThaumonomiconRegister.addPage();
	ThaumonomiconRegister.addEntryToThaumonomicon();
	LanguageConverting.load();
	}
}
