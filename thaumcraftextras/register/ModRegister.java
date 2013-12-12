package thaumcraftextras.register;

import thaumcraftextras.helpers.LanguageConverting;


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
