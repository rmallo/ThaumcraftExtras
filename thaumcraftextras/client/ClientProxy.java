package thaumcraftextras.client;

import net.minecraft.client.particle.EntityEnchantmentTableParticleFX;
import net.minecraft.client.particle.EntityFlameFX;
import net.minecraft.client.particle.EntityHeartFX;
import net.minecraft.client.particle.EntityPortalFX;
import net.minecraft.client.particle.EntitySmokeFX;
import net.minecraft.client.particle.EntitySnowShovelFX;
import net.minecraft.world.World;
import thaumcraftextras.items.foci.entities.ProjectileFreeze;
import thaumcraftextras.items.foci.entities.renders.RenderProjectileFreeze;
import thaumcraftextras.main.CommonProxy;
import thaumcraftextras.register.ParticleRegister;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;

public class ClientProxy extends CommonProxy {

	@Override
	public void load()
	{
		render();
		registerParticles();
	}
	
	public void render()
    {
		 EntityRegistry.registerGlobalEntityID(ProjectileFreeze.class, "projectileFreeze", EntityRegistry.findGlobalUniqueEntityId());
		 RenderingRegistry.registerEntityRenderingHandler(ProjectileFreeze.class, new RenderProjectileFreeze());
    }
		
	@Override
    public World getClientWorld()
    {
        return FMLClientHandler.instance().getClient().theWorld;
    }
	
	@Override
    public void registerParticles()
    {
            ParticleRegister.registerParticle("portal", EntityPortalFX.class);
            ParticleRegister.registerParticle("snowballpoof", EntitySnowShovelFX.class);
            ParticleRegister.registerParticle("flame", EntityFlameFX.class);
            ParticleRegister.registerParticle("largesmoke", EntitySmokeFX.class);
            ParticleRegister.registerParticle("heart", EntityHeartFX.class);
            ParticleRegister.registerParticle("enchantmenttable", EntityEnchantmentTableParticleFX.class);

    }
}