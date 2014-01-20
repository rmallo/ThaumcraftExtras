package thaumcraftextras.register.modSupport.bees;

import net.minecraft.potion.Potion;
import forestry.api.apiculture.IAlleleBeeEffect;
import forestry.api.apiculture.IAlleleBeeSpecies;
import forestry.api.genetics.AlleleManager;
import forestry.api.genetics.IAllele;
import forestry.api.genetics.IAlleleEffect;
import forestry.api.genetics.IAlleleFlowers;
import forestry.api.genetics.IAlleleRegistry;
import forestry.apiculture.genetics.AlleleEffectPotion;
import forestry.core.genetics.AlleleFloat;

public class Allele implements IAllele
{
	public static AlleleFloat speedBlinding;
	
	public static IAlleleBeeEffect forestryBaseEffect;
	
	public static IAlleleFlowers flowerBookshelf;
	public static IAlleleFlowers flowerThaumcraft;
	public static IAlleleFlowers flowerArsMagica;
	public static IAlleleFlowers flowerAuraNode;
	
	public static IAlleleEffect effectCleansing;
	public static IAlleleEffect effectDigSpeed;
	public static IAlleleEffect effectMoveSpeed;
	public static IAlleleEffect effectSlowSpeed;
	public static IAlleleEffect effectWithering;
	public static IAlleleEffect effectTransmuting;
	public static IAlleleEffect effectCrumbling;
	public static IAlleleEffect effectInvisibility;
	
	public static IAlleleEffect spawnBrainyZombie;
	public static IAlleleEffect spawnWisp;
	public static IAlleleEffect spawnBats;
	public static IAlleleEffect spawnGhast;
	public static IAlleleEffect spawnSpider;
	public static IAlleleEffect spawnBlaze;
	public static IAlleleEffect spawnBlizz;
	public static IAlleleEffect spawnManaDrainer;
	public static IAlleleEffect spawnWispOrHecate;
	
	/*public static IAlleleEffect effectNodeAttract;
	public static IAlleleEffect effectNodePurify;
	public static IAlleleEffect effectNodeFlux;
	public static IAlleleEffect effectNodeCharge;*/
	
	

	public static IAlleleBeeSpecies getBaseSpecies(String name)
	{
		return (IAlleleBeeSpecies) AlleleManager.alleleRegistry.getAllele((new StringBuilder()).append("forestry.species").append(name).toString());
	}
	
	public static IAlleleBeeSpecies getExtraSpecies(String name)
	{
		return (IAlleleBeeSpecies) AlleleManager.alleleRegistry.getAllele((new StringBuilder()).append("extrabees.species.").append(name).toString());
	}
	
	public static IAllele getBaseAllele(String name)
	{
		return AlleleManager.alleleRegistry.getAllele("forestry." + name);
	}
	
	public static IAllele getAllele(String name)
	{
		return AlleleManager.alleleRegistry.getAllele(name);
	}
	
	private String uid;
	private boolean dominant;

	public Allele(String id, boolean isDominant)
	{
		this.uid = "tce." + id;
		this.dominant = isDominant;
		AlleleManager.alleleRegistry.registerAllele(this);
	}

	@Override
	public String getUID()
	{
		return this.uid;
	}

	@Override
	public boolean isDominant()
	{
		return this.dominant;
	}

	@Override
	public String getName()
	{
		return "tce.species";
	}

}
