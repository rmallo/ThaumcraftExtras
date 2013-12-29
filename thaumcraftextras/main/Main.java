package thaumcraftextras.main;

import net.minecraftforge.common.MinecraftForge;
import thaumcraft.api.ThaumcraftApiHelper;
import thaumcraftextras.register.GuiHandler;
import thaumcraftextras.register.ModRegister;
import thaumcraftextras.register.ThaumcraftRecipeRegister;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
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
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "ThaumcraftExtras", name = "ThaumcraftExtras", version = "0.7.1" ,dependencies = "required-after:Thaumcraft")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class Main {
    @SidedProxy(clientSide = "thaumcraftextras.client.ClientProxy", serverSide = "thaumcraftextras.main.CommonProxy")
    public static CommonProxy proxy;
 
    @Instance("ThaumcraftExtras")
    public static Main instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
		Config config = new Config();
		Config.loadConfig(event);
    }

    
    @EventHandler
    public void init(FMLInitializationEvent evt)
    {
    	proxy.load();
        ModRegister.load();
        NetworkRegistry.instance().registerGuiHandler(this, new GuiHandler());
        GameRegistry.registerTileEntity(thaumcraftextras.blocks.tileEntity.TileEntityInfusion.class, "0");
        GameRegistry.registerTileEntity(thaumcraftextras.blocks.tileEntity.TileEntityColor.class, "1");
    	GameRegistry.registerTileEntity(thaumcraftextras.blocks.tileEntity.TileWarded.class, "2");
    	GameRegistry.registerTileEntity(thaumcraftextras.blocks.tileEntity.TileEntityLight.class, "3");
        GameRegistry.registerTileEntity(thaumcraftextras.blocks.tileEntity.TileEntityCharger.class, "4");
        GameRegistry.registerTileEntity(thaumcraftextras.blocks.tileEntity.TileEntityExchanger.class, "5");

        MinecraftForge.EVENT_BUS.register(this); 
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent evt)
    {
    	ModRegister.postLoad();
    }
}