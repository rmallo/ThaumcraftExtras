package thaumcraftextras.register.modSupport.bees;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import thaumcraft.common.config.ConfigBlocks;
import thaumcraft.common.config.ConfigItems;
import thaumcraftextras.register.BlockRegister;
import thaumcraftextras.register.InfusionRegister;
import thaumcraftextras.register.ItemRegister;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import forestry.api.apiculture.EnumBeeType;
import forestry.api.apiculture.IAlleleBeeSpecies;
import forestry.api.apiculture.IBeeGenome;
import forestry.api.apiculture.IBeeHousing;
import forestry.api.apiculture.IBeeRoot;
import forestry.api.core.EnumHumidity;
import forestry.api.core.EnumTemperature;
import forestry.api.core.IIconProvider;
import forestry.api.genetics.AlleleManager;
import forestry.api.genetics.IAllele;
import forestry.api.genetics.IClassification;
import forestry.api.genetics.IIndividual;
import forestry.core.config.Config;

public class Species implements IAlleleBeeSpecies, IIconProvider{

	private String binomial;
    private String authority;
    private int primaryColour;
    private int secondaryColour;
    private EnumTemperature temperature;
    private EnumHumidity humidity;
    private boolean hasEffect;
    private boolean isSecret;
    private boolean isCounted;
    private boolean isActive;
    private boolean isNocturnal;
    private IClassification branch;
    private HashMap<ItemStack, Integer> products;
    private HashMap<ItemStack, Integer> specialties;
    private IAllele genomeTemplate[];
    private String uid;
    private boolean dominant;
    private int complexity;
    
    @SideOnly(Side.CLIENT)
    private Icon[][] icons;

    private Species(String speciesName, String genusName, IClassification classification, int firstColour,
                    int secondColour, EnumTemperature preferredTemp, EnumHumidity preferredHumidity,
                    boolean hasGlowEffect, boolean isSpeciesSecret, boolean isSpeciesCounted,
                    boolean isSpeciesDominant) {
        this.uid = "tce.species." + speciesName;
        this.dominant = isSpeciesDominant;
        AlleleManager.alleleRegistry.registerAllele(this);
        binomial = genusName;
        authority = "wasliebob";
        primaryColour = firstColour;
        secondaryColour = secondColour;
        temperature = preferredTemp;
        humidity = preferredHumidity;
        hasEffect = hasGlowEffect;
        isSecret = isSpeciesSecret;
        isCounted = isSpeciesCounted;
        products = new HashMap<ItemStack, Integer>();
        specialties = new HashMap<ItemStack, Integer>();
        this.branch = classification;
        this.branch.addMemberSpecies(this);
        this.isActive = true;
        this.isNocturnal = false;
    }
    
    public static void loadSpecies()
    {
    	/**
    	 * String speciesName, 
    	 * String genusName, 
    	 * IClassification classification, 
    	 * int firstColour, 
    	 * int secondColour, 
    	 * EnumTemperature preferredTemp, 
    	 * EnumHumidity preferredHumidity, 
    	 * boolean hasGlowEffect, 
    	 * boolean isSpeciesSecret, 
    	 * boolean isSpeciesCounted, 
    	 * boolean isSpeciesDominant */
    	
    	thaumium = new Species("thaumium", "thaumium", BeeClassification.THAUMIUM, 0xafffb7, 0xafffb7, EnumTemperature.NORMAL, EnumHumidity.NORMAL, true, false, false, true);
    	thaumium.addProduct(new ItemStack(ConfigItems.itemNugget, 1, 6), 12)
    	.addProduct(OreDictionary.getOres("dropRoyalJelly").get(0), 10)
    	.addProduct(OreDictionary.getOres("dropHoney").get(0), 50)
    	.setGenome(GenomeManager.getTemplateThaumium())
		.register();
    	
    	darkThaumium = new Species("darkThaumium", "darkThaumium", BeeClassification.DARKTHAUMIUM, 0x000000, 0x9900FF, EnumTemperature.NORMAL, EnumHumidity.NORMAL, true, false, false, true);
    	darkThaumium.addProduct(new ItemStack(ItemRegister.darkThaumiumNugget), 3)
    	.addProduct(OreDictionary.getOres("dropRoyalJelly").get(0), 10)
    	.addProduct(OreDictionary.getOres("dropHoney").get(0), 50)
    	.setGenome(GenomeManager.getTemplateDarkThaumium())
		.register();
    	
    	darkSilverwood = new Species("darkSilverwood", "darkSilverwood", BeeClassification.DARKSILVERWOOD, 0x000000, 0xFFFFCC, EnumTemperature.NORMAL, EnumHumidity.NORMAL, false, false, false, true);
    	darkSilverwood.addProduct(new ItemStack(BlockRegister.darkSilverwoodLog), 60)
    	.addProduct(OreDictionary.getOres("dropHoney").get(0), 50)
    	.setGenome(GenomeManager.getTemplateDarkSilverwood())
		.register();
    	
    	greatwood = new Species("greatwood", "greatwood", BeeClassification.GREATWOOD, 0xCC6600, 0x996633, EnumTemperature.NORMAL, EnumHumidity.NORMAL, false, false, false, true);
    	greatwood.addProduct(new ItemStack(ConfigBlocks.blockMagicalLog, 1, 0), 60)
    	.addProduct(OreDictionary.getOres("dropHoney").get(0), 50)
    	.setGenome(GenomeManager.getTemplateGreatwood())
		.register();
    	
    	silverwood = new Species("silverwood", "silverwood", BeeClassification.SILVERWOOD, 0xFFFFCC, 0xFFFF99, EnumTemperature.NORMAL, EnumHumidity.NORMAL, false, false, false, true);
    	silverwood.addProduct(new ItemStack(ConfigBlocks.blockMagicalLog, 1, 1), 60)
    	.addProduct(OreDictionary.getOres("dropHoney").get(0), 50)
    	.setGenome(GenomeManager.getTemplateSilverwood())
		.register();
    	
    	lightShard = new Species("lightShard", "lightShard", BeeClassification.LIGHTSHARD, 0xFFFFCC, 0xFFFFFF, EnumTemperature.NORMAL, EnumHumidity.NORMAL, false, false, false, true);
    	lightShard.addProduct(new ItemStack(InfusionRegister.lightShard), 30)
    	.addProduct(OreDictionary.getOres("dropHoney").get(0), 50)
    	.setGenome(GenomeManager.getTemplateLightShard())
		.register();
    	
    	magicEssence = new Species("magicEssence", "magicEssence", BeeClassification.MAGICESSENCE, 0x99FF00, 0x990033, EnumTemperature.NORMAL, EnumHumidity.NORMAL, true, false, false, true);
    	magicEssence.addProduct(new ItemStack(ItemRegister.magicShard), 15)
    	.addProduct(OreDictionary.getOres("dropHoney").get(0), 50)
    	.setGenome(GenomeManager.getTemplateMagicEssence())
		.register();
    	
    	tradeEssence = new Species("greedEssence", "greedEssence", BeeClassification.GREEDESSENCE, 0x99FF00, 0xFFFF33, EnumTemperature.NORMAL, EnumHumidity.NORMAL, true, false, false, true);
    	tradeEssence.addProduct(new ItemStack(ItemRegister.greedShard), 15)
    	.addProduct(OreDictionary.getOres("dropHoney").get(0), 50)
    	.setGenome(GenomeManager.getTemplateTradeEssence())
		.register();
    	
    	ignisFuel = new Species("ignisFuel", "ignisFuel", BeeClassification.IGNISFUEL, 0x993333, 0xCC3333, EnumTemperature.NORMAL, EnumHumidity.NORMAL, true, false, false, true);
    	ignisFuel.addProduct(new ItemStack(ItemRegister.ignisFuel), 15)
    	.addProduct(OreDictionary.getOres("dropHoney").get(0), 50)
    	.setGenome(GenomeManager.getTemplateIgnisFuel())
		.register();
    	
    	salis = new Species("salis", "salis", BeeClassification.SALIS, 0xCC6666, 0x9933CC, EnumTemperature.NORMAL, EnumHumidity.NORMAL, true, false, false, true);
    	salis.addProduct(new ItemStack(ConfigItems.itemResource, 1, 14), 50)
    	.addProduct(OreDictionary.getOres("dropHoney").get(0), 50)
    	.setGenome(GenomeManager.getTemplateSalis())
		.register();
    	
    	if(Loader.isModLoaded("TConstruct") && OreDictionary.getOres("nuggetPigIron").size() > 0)
    	{
    	ItemStack pigItem = OreDictionary.getOres("nuggetPigIron").get(0);
    	pig = new Species("pig", "pig", BeeClassification.PIG, 0x9966CC, 0xFF66FF, EnumTemperature.NORMAL, EnumHumidity.NORMAL, true, false, false, true);
    	pig.addProduct(pigItem, 5)
    	.addProduct(OreDictionary.getOres("dropHoney").get(0), 50)
    	.setGenome(GenomeManager.getTemplatePig())
		.register();
    	}
    }

	@Override
    public IBeeRoot getRoot() {
        return BeeManager.beeRoot;
    }

    @Override
    public boolean isNocturnal() {
        return isNocturnal;
    }

    @Override
    public Map<ItemStack, Integer> getProducts() {
        return products;
    }

    public Species addProduct(ItemStack out, int percentileChance) {
        products.put(out, percentileChance);
        return this;
    }

    @Override
    public Map<ItemStack, Integer> getSpecialty() {
        return specialties;
    }

    public Species addSpeciality(ItemStack out, int percentileChance) {
        specialties.put(out, percentileChance);
        return this;
    }

    @Override
    public boolean isJubilant(IBeeGenome genome, IBeeHousing housing) {
        return true;
    }

    @Override
    public Icon getIcon(EnumBeeType type, int renderPass) {
        return icons[type.ordinal()][Math.min(renderPass, 2)];
    }

    @Override
    public String getEntityTexture() {
        return "/gfx/forestry/entities/bees/honeyBee.png"; // Because we don't need custom bee textures...
    }

    @Override
    public String getDescription() {
        return StatCollector.translateToLocal(getUID() + ".description");
    }

    @Override
    public String getBinomial() {
        return binomial;
    }

    @Override
    public String getAuthority() {
        return authority;
    }

    @Override
    public IClassification getBranch() {
        return branch;
    }

    @Override
    public int getComplexity() {
        return 1;
    }

    @Override
    public float getResearchSuitability(ItemStack itemstack) {
        return 0f; // TODO: Researchability!
    }

    @Override
    public ItemStack[] getResearchBounty(World world, String researcher, IIndividual individual, int bountyLevel) {
        return new ItemStack[0];
    }

    @Override
    public EnumTemperature getTemperature() {
        return temperature;
    }

    @Override
    public EnumHumidity getHumidity() {
        return humidity;
    }

    @Override
    public boolean hasEffect() {
        return hasEffect;
    }

    @Override
    public boolean isSecret() {
        return isSecret;
    }

    @Override
    public boolean isCounted() {
        return isCounted;
    }

    @Override
    public int getIconColour(int renderPass) {
        int value = 0xffffff;
        if (renderPass == 0) {
            value = this.primaryColour;
        }
        else if (renderPass == 1) {
            value = this.secondaryColour;
        }
        return value;
    }

    @Override
    public IIconProvider getIconProvider() {
        return this;
    }

    @Override
    public String getUID() {
        return uid;
    }

    @Override
    public boolean isDominant() {
        return dominant;
    }

    @Override
    public String getName() {
        return StatCollector.translateToLocal(getUID());
    }

    @Override
    public Icon getIcon(short texUID) {
        return icons[0][0]; // According to Myst... Unused.
    }

    @Override
    public void registerIcons(IconRegister itemMap) {
        this.icons = new Icon[EnumBeeType.values().length][3];

        String root = "Forestry:bees/default/";

        Icon body1 = itemMap.registerIcon(root + "body1");

        for (int i = 0; i < EnumBeeType.values().length; i++)
        {
            if(EnumBeeType.values()[i] == EnumBeeType.NONE)
                continue;

            icons[i][0] = itemMap.registerIcon(root +
                    EnumBeeType.values()[i].toString().toLowerCase(Locale.ENGLISH) + ".outline");
            icons[i][1] = (EnumBeeType.values()[i] != EnumBeeType.LARVAE) ? body1 : itemMap.registerIcon(root +
                    EnumBeeType.values()[i].toString().toLowerCase(Locale.ENGLISH) + ".body");
            icons[i][2] = itemMap.registerIcon(root +
                    EnumBeeType.values()[i].toString().toLowerCase(Locale.ENGLISH) + ".body2");
        }
    }
    
	public Species setGenome(IAllele genome[])
	{
		genomeTemplate = genome;
		return this;
	}

	public IAllele[] getGenome()
	{
		return genomeTemplate;
	}
	
	private Species register()
	{
		BeeManager.beeRoot.registerTemplate(this.getGenome());
		if (!this.isActive)
		{
			AlleleManager.alleleRegistry.blacklistAllele(this.getUID());
		}
		return this;
	}
	
    public static Species thaumium;
    public static Species darkThaumium;
    public static Species darkSilverwood;
    public static Species lightShard;
    public static Species magicEssence;
    public static Species tradeEssence;
    public static Species silverwood;
    public static Species greatwood;
    public static Species ignisFuel;
    public static Species salis;
    public static Species pig;

}
