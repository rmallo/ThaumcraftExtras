package thaumcraftextras.register;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.InfusionRecipe;
import thaumcraft.api.crafting.ShapedArcaneRecipe;
import thaumcraft.common.config.ConfigItems;

public class ThaumcraftRecipeRegister {

	public static void load()
	{
	pechTradeTier1 = ThaumcraftApi.addArcaneCraftingRecipe("Pech Trade", new ItemStack(ItemRegister.pechTradeTier1), new AspectList().add(Aspect.FIRE, 2), new Object[]{
		"XXX",
		"XIX",
		"XXX",
		'X', Item.goldNugget,
		'I', Item.ingotGold});

	pechTradeTier2 = ThaumcraftApi.addArcaneCraftingRecipe("Pech Trade", new ItemStack(ItemRegister.pechTradeTier2), new AspectList().add(Aspect.ORDER, 15), new Object[]{
		"XXX",
		"XXX",
		"XXX",
		'X', ItemRegister.pechTradeTier1});

	pechTradeTier3 = ThaumcraftApi.addArcaneCraftingRecipe("Pech Trade", new ItemStack(ItemRegister.pechTradeTier3), new AspectList().add(Aspect.ORDER, 15), new Object[]{
		"XXX",
		"XXX",
		"XXX",
		'X', ItemRegister.pechTradeTier2});
	
	pechTradeTier4 = ThaumcraftApi.addArcaneCraftingRecipe("Pech Trade", new ItemStack(ItemRegister.pechTradeTier4), new AspectList().add(Aspect.ORDER, 15), new Object[]{
		"XXX",
		"XXX",
		"XXX",
		'X', ItemRegister.pechTradeTier3});
	
	pechTradeTier5 = ThaumcraftApi.addArcaneCraftingRecipe("Pech Trade", new ItemStack(ItemRegister.pechTradeTier5), new AspectList().add(Aspect.ORDER, 15), new Object[]{
		"XXX",
		"XXX",
		"XXX",
		'X', ItemRegister.pechTradeTier4});
	
	magicTradeTier1 = ThaumcraftApi.addArcaneCraftingRecipe("Magic Trade", new ItemStack(ItemRegister.magicTradeTier1), new AspectList().add(Aspect.ORDER, 15), new Object[]{
		"XXX",
		"XIX",
		"XXX",
		'X', Item.goldNugget,
		'I', Item.diamond});

	magicTradeTier2 = ThaumcraftApi.addArcaneCraftingRecipe("Magic Trade", new ItemStack(ItemRegister.magicTradeTier2), new AspectList().add(Aspect.ORDER, 15), new Object[]{
		"XXX",
		"XXX",
		"XXX",
		'X', ItemRegister.magicTradeTier1});
	
	magicTradeTier3 = ThaumcraftApi.addArcaneCraftingRecipe("Magic Trade", new ItemStack(ItemRegister.magicTradeTier3), new AspectList().add(Aspect.ORDER, 15), new Object[]{
		"XXX",
		"XXX",
		"XXX",
		'X', ItemRegister.magicTradeTier2});
	
	magicTradeTier4 = ThaumcraftApi.addArcaneCraftingRecipe("Magic Trade", new ItemStack(ItemRegister.magicTradeTier4), new AspectList().add(Aspect.ORDER, 15), new Object[]{
		"XXX",
		"XXX",
		"XXX",
		'X', ItemRegister.magicTradeTier3});
	
	magicTradeTier5 = ThaumcraftApi.addArcaneCraftingRecipe("Magic Trade", new ItemStack(ItemRegister.magicTradeTier5), new AspectList().add(Aspect.ORDER, 15), new Object[]{
		"XXX",
		"XXX",
		"XXX",
		'X', ItemRegister.magicTradeTier4});
	

	enderFoci = ThaumcraftApi.addInfusionCraftingRecipe("Ender Foci", new ItemStack(ItemRegister.enderFoci),4 , 
			new AspectList().add(Aspect.MAGIC, 50).add(Aspect.ELDRITCH, 50).add(Aspect.ENTROPY, 25), 
			new ItemStack(Item.enderPearl), new ItemStack[]{
		new ItemStack(Item.netherQuartz), new ItemStack(Item.netherrackBrick), new ItemStack(Item.netherQuartz),
		new ItemStack(Item.netherrackBrick), new ItemStack(Item.netherQuartz), new ItemStack(Item.netherrackBrick), 
		new ItemStack(Item.netherQuartz), new ItemStack(Item.netherrackBrick)});
	
	
	arrowFoci = ThaumcraftApi.addInfusionCraftingRecipe("Arrow Foci", new ItemStack(ItemRegister.arrowFoci),4 , 
			new AspectList().add(Aspect.MAGIC, 20).add(Aspect.AIR, 20).add(Aspect.WEAPON, 10), 
			new ItemStack(Item.bow), new ItemStack[]{
			new ItemStack(Item.netherQuartz), new ItemStack(Item.arrow), new ItemStack(Item.netherQuartz),
			new ItemStack(Item.arrow), new ItemStack(Item.netherQuartz), new ItemStack(Item.arrow), 
			new ItemStack(Item.netherQuartz), new ItemStack(Item.arrow)});
	
	healFoci = ThaumcraftApi.addInfusionCraftingRecipe("Heal Foci", new ItemStack(ItemRegister.healFoci),10 , 
			new AspectList().add(Aspect.MAGIC, 50).add(Aspect.HEAL, 25).add(Aspect.ORDER, 1).add(Aspect.SENSES, 10), 
			new ItemStack(Item.appleGold), new ItemStack[]{
			new ItemStack(Item.netherQuartz), new ItemStack(Item.paper), new ItemStack(Item.netherQuartz),
			new ItemStack(Item.paper), new ItemStack(Item.netherQuartz), new ItemStack(Item.paper), 
			new ItemStack(Item.netherQuartz), new ItemStack(Item.paper)});
	
	speedFoci = ThaumcraftApi.addInfusionCraftingRecipe("Speed Foci", new ItemStack(ItemRegister.speedFoci),4 , 
			new AspectList().add(Aspect.MAGIC, 50).add(Aspect.AIR, 25).add(Aspect.ORDER, 1).add(Aspect.SENSES, 10), 
			new ItemStack(Item.bootsLeather), new ItemStack[]{
			new ItemStack(Item.netherQuartz), new ItemStack(Item.feather), new ItemStack(Item.netherQuartz),
			new ItemStack(Item.feather), new ItemStack(Item.netherQuartz), new ItemStack(Item.feather), 
			new ItemStack(Item.netherQuartz), new ItemStack(Item.feather)});
	
	pechFoci = ThaumcraftApi.addInfusionCraftingRecipe("Pech Foci", new ItemStack(ItemRegister.pechFoci),4 , 
			new AspectList().add(Aspect.MAGIC, 50).add(Aspect.AIR, 25).add(Aspect.EXCHANGE, 1).add(Aspect.LIFE, 10), 
			new ItemStack(ConfigItems.itemFocusPech), new ItemStack[]{
			new ItemStack(Item.netherQuartz), new ItemStack(ConfigItems.itemManaBean), new ItemStack(Item.netherQuartz),
			new ItemStack(ConfigItems.itemManaBean), new ItemStack(Item.netherQuartz), new ItemStack(ConfigItems.itemManaBean), 
			new ItemStack(Item.netherQuartz), new ItemStack(ConfigItems.itemManaBean)});
	}

	public static ShapedArcaneRecipe pechTradeTier1;
	public static ShapedArcaneRecipe pechTradeTier2;
	public static ShapedArcaneRecipe pechTradeTier3;
	public static ShapedArcaneRecipe pechTradeTier4;
	public static ShapedArcaneRecipe pechTradeTier5;
	public static ShapedArcaneRecipe magicTradeTier1;
	public static ShapedArcaneRecipe magicTradeTier2;
	public static ShapedArcaneRecipe magicTradeTier3;
	public static ShapedArcaneRecipe magicTradeTier4;
	public static ShapedArcaneRecipe magicTradeTier5;
	
	public static InfusionRecipe enderFoci;
	public static InfusionRecipe arrowFoci;
	public static InfusionRecipe healFoci;
	public static InfusionRecipe speedFoci;
	public static InfusionRecipe pechFoci;
}
