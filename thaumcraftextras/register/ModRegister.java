package thaumcraftextras.register;


public class ModRegister {

	public static void load()
	{
    	BlockRegister.load();
    	BlockRegister.recipe();
    	BlockRegister.oreDictionary();
    	ItemRegister.load();
    	AspectRegister.addAspects();
    	ItemRegister.recipe();
    	ThaumcraftRecipeRegister.load();
    	CreativeTabRegister.load();
	}
	
	public static void postLoad()
	{
	ThaumonomiconRegister.addPage();
	ThaumonomiconRegister.addEntryToThaumonomicon();
	}
}
