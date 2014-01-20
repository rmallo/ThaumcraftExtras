package thaumcraftextras.helpers;

import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.FMLModContainer;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.network.FMLNetworkHandler;

public class ModSupportHelper {

	public static boolean isICEnabled()
	{
		if(Loader.isModLoaded("IC2"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
