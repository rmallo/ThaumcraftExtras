package thaumcraftextras.register;

import net.minecraft.entity.Entity;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraftextras.main.Config;

public class AspectRegister{

	public static void addAspects()
	{
		ThaumcraftApi.registerObjectTag(Config.researchBlockId, -1, new AspectList().add(Aspect.AIR, 999).add(Aspect.ARMOR, 999).add(Aspect.AURA, 999).add(Aspect.BEAST, 999).add(Aspect.CLOTH, 999).add(Aspect.CRAFT, 999).add(Aspect.CROP, 999).add(Aspect.CRYSTAL, 999).add(Aspect.DARKNESS ,999).add(Aspect.DEATH, 999).add(Aspect.EARTH, 999).add(Aspect.ELDRITCH, 999).add(Aspect.ENERGY, 999).add(Aspect.ENTROPY, 999).add(Aspect.EXCHANGE, 999).add(Aspect.FIRE, 999).add(Aspect.FLESH, 999).add(Aspect.FLIGHT, 999).add(Aspect.GREED, 999).add(Aspect.HARVEST, 999).add(Aspect.HEAL, 999).add(Aspect.HUNGER, 999).add(Aspect.ICE, 999).add(Aspect.LIFE, 999).add(Aspect.LIGHT, 999).add(Aspect.MAGIC, 999).add(Aspect.MAN, 999).add(Aspect.MECHANISM, 999).add(Aspect.METAL, 999).add(Aspect.MIND, 999).add(Aspect.MINE, 999).add(Aspect.MOTION, 9).add(Aspect.ORDER, 999).add(Aspect.PLANT, 999).add(Aspect.POISON, 999).add(Aspect.SEED, 999).add(Aspect.SENSES, 999).add(Aspect.SLIME, 999).add(Aspect.SOUL, 999).add(Aspect.STONE, 999).add(Aspect.TAINT, 999).add(Aspect.TOOL, 999).add(Aspect.TRAP, 999).add(Aspect.TRAVEL, 999).add(Aspect.TREE, 999).add(Aspect.UNDEAD, 999).add(Aspect.VOID, 999).add(Aspect.WATER, 999).add(Aspect.WEAPON, 999).add(Aspect.WEATHER, 999));
		
		ThaumcraftApi.registerObjectTag(Config.fireBlockId, -1, new AspectList().add(Aspect.FIRE, 4));
		ThaumcraftApi.registerObjectTag(Config.airBlockId, -1, new AspectList().add(Aspect.AIR, 4));
		ThaumcraftApi.registerObjectTag(Config.waterBlockId , -1, new AspectList().add(Aspect.WATER, 4));
		ThaumcraftApi.registerObjectTag(Config.earthBlockId , -1, new AspectList().add(Aspect.EARTH, 4));
		//ThaumcraftApi.registerObjectTag(Config.darkBlockId , -1, new AspectList().add(Aspect.DARKNESS, 18));

		ThaumcraftApi.registerObjectTag(Config.pechTradeTier1Id, -1, new AspectList().add(Aspect.EXCHANGE, 2).add(Aspect.GREED, 2));
		ThaumcraftApi.registerObjectTag(Config.pechTradeTier2Id, -1, new AspectList().add(Aspect.EXCHANGE, 4).add(Aspect.GREED, 4));
		ThaumcraftApi.registerObjectTag(Config.pechTradeTier3Id, -1, new AspectList().add(Aspect.EXCHANGE, 6).add(Aspect.GREED, 6));
		ThaumcraftApi.registerObjectTag(Config.pechTradeTier4Id, -1, new AspectList().add(Aspect.EXCHANGE, 8).add(Aspect.GREED, 8));
		ThaumcraftApi.registerObjectTag(Config.pechTradeTier5Id, -1, new AspectList().add(Aspect.EXCHANGE, 10).add(Aspect.GREED, 10));
	
		ThaumcraftApi.registerObjectTag(Config.magicTradeTier1Id, -1, new AspectList().add(Aspect.MAGIC, 2));
		ThaumcraftApi.registerObjectTag(Config.magicTradeTier2Id, -1, new AspectList().add(Aspect.MAGIC, 4));
		ThaumcraftApi.registerObjectTag(Config.magicTradeTier3Id, -1, new AspectList().add(Aspect.MAGIC, 6));
		ThaumcraftApi.registerObjectTag(Config.magicTradeTier4Id, -1, new AspectList().add(Aspect.MAGIC, 8));
		ThaumcraftApi.registerObjectTag(Config.magicTradeTier5Id, -1, new AspectList().add(Aspect.MAGIC, 10));

		ThaumcraftApi.registerObjectTag(Config.enderFociId, -1, new AspectList().add(Aspect.MAGIC, 10).add(Aspect.ELDRITCH, 10));
		ThaumcraftApi.registerObjectTag(Config.arrowFociId, -1, new AspectList().add(Aspect.MAGIC, 10).add(Aspect.AIR, 10));
		ThaumcraftApi.registerObjectTag(Config.healFociId, -1, new AspectList().add(Aspect.MAGIC, 10).add(Aspect.HEAL, 5));
		ThaumcraftApi.registerObjectTag(Config.speedFociId, -1, new AspectList().add(Aspect.MAGIC, 10).add(Aspect.AIR, 5));

	}
}
