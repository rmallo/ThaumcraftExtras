package thaumcraftextras.main;

import net.minecraftforge.common.MinecraftForge;
import thaumcraftextras.register.GuiHandler;
import thaumcraftextras.register.ModRegister;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;

@Mod(modid = "ThaumcraftExtras", name = "ThaumcraftExtras", version = "0.4.1" ,dependencies = "required-after:Thaumcraft")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class Main {
	
    @SidedProxy(clientSide = "thaumcraftextras.client.ClientProxy", serverSide = "thaumcraftextras.main.CommonProxy")
    public static CommonProxy proxy;
 
    @Instance("ThaumcraftExtras")
    public static Main instance;

    
    @PreInit
    public void preInit(FMLPreInitializationEvent event)
    {
		Config config = new Config();
		Config.loadConfig(event);
    }

    
    @Init
    public void load(FMLInitializationEvent evt)
    {
    	proxy.load();
        //NetworkRegistry.instance().registerGuiHandler(this, new GuiHandler());
        ModRegister.load();
    	MinecraftForge.EVENT_BUS.register(this);            
    }

    @PostInit
    public void modsLoaded(FMLPostInitializationEvent evt)
    {
    	ModRegister.postLoad();
    }
}