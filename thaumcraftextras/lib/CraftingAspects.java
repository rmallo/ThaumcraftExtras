package thaumcraftextras.lib;

import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;

public class CraftingAspects {

	public static AspectList pechTradeTier1 = new AspectList().add(Aspect.ORDER, 5);
	public static AspectList pechTradeTier2 = new AspectList().add(Aspect.ORDER, 15);
	public static AspectList pechTradeTier3 = new AspectList().add(Aspect.ORDER, 15);
	public static AspectList pechTradeTier4 = new AspectList().add(Aspect.ORDER, 15);
	public static AspectList pechTradeTier5 = new AspectList().add(Aspect.ORDER, 15);

	public static AspectList magicTradeTier1 = new AspectList().add(Aspect.ORDER, 15);
	public static AspectList magicTradeTier2 = new AspectList().add(Aspect.ORDER, 15);
	public static AspectList magicTradeTier3 = new AspectList().add(Aspect.ORDER, 15);
	public static AspectList magicTradeTier4 = new AspectList().add(Aspect.ORDER, 15);
	public static AspectList magicTradeTier5 = new AspectList().add(Aspect.ORDER, 15);
	public static AspectList xpExtractor = new AspectList().add(Aspect.MAGIC, 25).add(Aspect.LIFE, 1).add(Aspect.LIFE, 10).add(Aspect.EXCHANGE, 5);
	public static AspectList ignisFuel = new AspectList().add(Aspect.FIRE, 5);

	public static AspectList enderFoci = new AspectList().add(Aspect.MAGIC, 50).add(Aspect.ELDRITCH, 50).add(Aspect.ENTROPY, 25);
	public static AspectList arrowFoci = new AspectList().add(Aspect.MAGIC, 20).add(Aspect.AIR, 20).add(Aspect.WEAPON, 10);
	public static AspectList healFoci = new AspectList().add(Aspect.MAGIC, 50).add(Aspect.HEAL, 25).add(Aspect.ORDER, 1).add(Aspect.SENSES, 10);
	public static AspectList speedFoci = new AspectList().add(Aspect.MAGIC, 50).add(Aspect.AIR, 25).add(Aspect.ORDER, 1).add(Aspect.SENSES, 10);
	public static AspectList xpFoci = new AspectList().add(Aspect.MAGIC, 25).add(Aspect.LIFE, 1).add(Aspect.LIFE, 10).add(Aspect.EXCHANGE, 5);
	public static AspectList returnFoci = new AspectList().add(Aspect.MAGIC, 25).add(Aspect.ELDRITCH, 40).add(Aspect.MOTION, 10);
	public static AspectList exchangeFoci = new AspectList().add(Aspect.MAGIC, 25).add(Aspect.EXCHANGE, 40);
	public static AspectList smeltingFoci = new AspectList().add(Aspect.MAGIC, 25).add(Aspect.EXCHANGE, 40).add(Aspect.FIRE, 10);
	public static AspectList dispelFoci = new AspectList().add(Aspect.MAGIC, 25).add(Aspect.HEAL, 10).add(Aspect.ORDER, 10);
	public static AspectList destroyFoci = new AspectList().add(Aspect.MAGIC, 25).add(Aspect.ORDER, 10).add(Aspect.ENTROPY, 10).add(Aspect.DARKNESS, 5);
	public static AspectList freezeFoci = new AspectList().add(Aspect.MAGIC, 10).add(Aspect.ICE, 10).add(Aspect.WEAPON, 10).add(Aspect.WATER, 10);

}
