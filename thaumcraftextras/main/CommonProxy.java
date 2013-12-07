package thaumcraftextras.main;

import thaumcraftextras.register.ParticleRegister;
import net.minecraft.client.particle.EntityFlameFX;
import net.minecraft.client.particle.EntityHeartFX;
import net.minecraft.client.particle.EntityPortalFX;
import net.minecraft.client.particle.EntitySmokeFX;
import net.minecraft.client.particle.EntitySnowShovelFX;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class CommonProxy {
	
	public void load()
	{
        registerRenderInformation();
        registerParticles();
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

