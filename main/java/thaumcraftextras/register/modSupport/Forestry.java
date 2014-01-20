package thaumcraftextras.register.modSupport;

import thaumcraftextras.helpers.MainHelper;
import thaumcraftextras.items.ItemFociEmpty;
import thaumcraftextras.main.Config;
import thaumcraftextras.register.modSupport.bees.BeeManager;
import thaumcraftextras.register.modSupport.bees.Species;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Forestry {
	public static void isInstalled()
	{
		if(Loader.isModLoaded("Forestry"))
		load();
	}
	
	public static void load()
	{
	items();
	bees();
	blocks();
	recipes();
	}
	
	public static void items()
	{
		
	}
	
	public static void bees()
	{
		BeeManager.setupController();
	}
	
	public static void blocks()
	{
	
	}
	
	public static void recipes()
	{
		
	}
	
}
