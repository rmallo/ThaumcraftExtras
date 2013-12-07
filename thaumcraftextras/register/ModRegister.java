package thaumcraftextras.register;

import thaumcraftextras.helpers.LanguageConverting;


public class ModRegister {

	public static void load()
	{
    	BlockRegister.load();
    	BlockRegister.recipe();
    	BlockRegister.oreDictionary();
    	ItemRegister.load();
    	AspectRegister.addAspects();
    	ItemRegister.recipe();
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
