package thaumcraftextras.register.modSupport;

import thaumcraftextras.helpers.MainHelper;
import thaumcraftextras.items.ItemFociEmpty;
import thaumcraftextras.main.Config;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class TinkersConstruct {
	public static void isInstalled()
	{
		if(Loader.isModLoaded("TinkersConstruct"))
		load();
	}
	
	public static void load()
	{
	items();
	blocks();
	recipes();
	}
	
	public static void items()
	{
	}
	
	public static void blocks()
	{
	
	}
	
	public static void recipes()
	{
		
	}
}
