package thaumcraftextras.main;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class CommonProxy {
	
	public void load()
	{
    	registerParticles();
        registerRenderInformation();
	}
	
    public void registerRenderInformation()
    {

    }
    

    public World getClientWorld()
    {
        return null;
    }
    
	public void registerParticles()
	{
	}
	
}

