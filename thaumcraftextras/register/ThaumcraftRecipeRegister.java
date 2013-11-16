package thaumcraftextras.register;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.InfusionRecipe;
import thaumcraft.api.crafting.ShapedArcaneRecipe;
import thaumcraft.common.config.ConfigItems;
import thaumcraftextras.lib.ResearchAspects;
import thaumcraftextras.main.Config;

public class ThaumcraftRecipeRegister {

	public static void load()
	{
	if(Config.pechTrade == true)
	{
	pechTradeTier1 = ThaumcraftApi.addArcaneCraftingRecipe("Pech Trade", new ItemStack(ItemRegister.pechTradeTier1), ResearchAspects.pechTradeTier1, new Object[]{
		"XXX",
		"XIX",
		"XXX",
		'X', Item.goldNugget,
		'I', Item.ingotGold});
	}
	if(Config.pechTrade == true)
	{
	pechTradeTier2 = ThaumcraftApi.addArcaneCraftingRecipe("Pech Trade", new ItemStack(ItemRegister.pechTradeTier2), ResearchAspects.pechTradeTier2, new Object[]{
		"XXX",
		"XXX",
		"XXX",
		'X', ItemRegister.pechTradeTier1});
	}
	if(Config.pechTrade == true)
	{
	pechTradeTier3 = ThaumcraftApi.addArcaneCraftingRecipe("Pech Trade", new ItemStack(ItemRegister.pechTradeTier3), ResearchAspects.pechTradeTier3, new Object[]{
		"XXX",
		"XXX",
		"XXX",
		'X', ItemRegister.pechTradeTier2});
	}
	if(Config.pechTrade == true)
	{
	pechTradeTier4 = ThaumcraftApi.addArcaneCraftingRecipe("Pech Trade", new ItemStack(ItemRegister.pechTradeTier4), ResearchAspects.pechTradeTier4, new Object[]{
		"XXX",
		"XXX",
		"XXX",
		'X', ItemRegister.pechTradeTier3});
	
	if(Config.pechTrade == true)
	{
	pechTradeTier5 = ThaumcraftApi.addArcaneCraftingRecipe("Pech Trade", new ItemStack(ItemRegister.pechTradeTier5), ResearchAspects.pechTradeTier5, new Object[]{
		"XXX",
		"XXX",
		"XXX",
		'X', ItemRegister.pechTradeTier4});
	}
	if(Config.magicTrade == true)
	{
	magicTradeTier1 = ThaumcraftApi.addArcaneCraftingRecipe("Magic Trade", new ItemStack(ItemRegister.magicTradeTier1), ResearchAspects.magicTradeTier1, new Object[]{
		"XXX",
		"XIX",
		"XXX",
		'X', Item.goldNugget,
		'I', Item.diamond});
	}
	if(Config.magicTrade == true)
	{
	magicTradeTier2 = ThaumcraftApi.addArcaneCraftingRecipe("Magic Trade", new ItemStack(ItemRegister.magicTradeTier2), ResearchAspects.magicTradeTier2, new Object[]{
		"XXX",
		"XXX",
		"XXX",
		'X', ItemRegister.magicTradeTier1});
	}
	if(Config.magicTrade == true)
	{
	magicTradeTier3 = ThaumcraftApi.addArcaneCraftingRecipe("Magic Trade", new ItemStack(ItemRegister.magicTradeTier3), ResearchAspects.magicTradeTier3, new Object[]{
		"XXX",
		"XXX",
		"XXX",
		'X', ItemRegister.magicTradeTier2});
	}
	if(Config.magicTrade == true)
	{
	magicTradeTier4 = ThaumcraftApi.addArcaneCraftingRecipe("Magic Trade", new ItemStack(ItemRegister.magicTradeTier4), ResearchAspects.magicTradeTier4, new Object[]{
		"XXX",
		"XXX",
		"XXX",
		'X', ItemRegister.magicTradeTier3});
	}
	if(Config.magicTrade == true)
	magicTradeTier5 = ThaumcraftApi.addArcaneCraftingRecipe("Magic Trade", new ItemStack(ItemRegister.magicTradeTier5),	ResearchAspects.magicTradeTier5,  new Object[]{
		"XXX",
		"XXX",
		"XXX",
		'X', ItemRegister.magicTradeTier4});
	
	}
	if(Config.enderFoci == true)
	{
	enderFoci = ThaumcraftApi.addInfusionCraftingRecipe("Ender Foci", new ItemStack(ItemRegister.enderFoci),4 , 
			ResearchAspects.enderFoci, 
			new ItemStack(Item.enderPearl), new ItemStack[]{
		new ItemStack(Item.netherQuartz), new ItemStack(Item.netherrackBrick), new ItemStack(Item.netherQuartz),
		new ItemStack(Item.netherrackBrick), new ItemStack(Item.netherQuartz), new ItemStack(Item.netherrackBrick), 
		new ItemStack(Item.netherQuartz), new ItemStack(Item.netherrackBrick)});
	}
	if(Config.arrowFoci == true)
	{
	arrowFoci = ThaumcraftApi.addInfusionCraftingRecipe("Arrow Foci", new ItemStack(ItemRegister.arrowFoci),4 , 
			ResearchAspects.arrowFoci, 
		new ItemStack(Item.bow), new ItemStack[]{
		new ItemStack(Item.netherQuartz), new ItemStack(Item.arrow), new ItemStack(Item.netherQuartz),
		new ItemStack(Item.arrow), new ItemStack(Item.netherQuartz), new ItemStack(Item.arrow), 
		new ItemStack(Item.netherQuartz), new ItemStack(Item.arrow)});
	}
	if(Config.healFoci == true)
	{
	healFoci = ThaumcraftApi.addInfusionCraftingRecipe("Heal Foci", new ItemStack(ItemRegister.healFoci),10 , 
			ResearchAspects.healFoci, 
			new ItemStack(Item.appleGold), new ItemStack[]{
			new ItemStack(Item.netherQuartz), new ItemStack(Item.paper), new ItemStack(Item.netherQuartz),
			new ItemStack(Item.paper), new ItemStack(Item.netherQuartz), new ItemStack(Item.paper), 
			new ItemStack(Item.netherQuartz), new ItemStack(Item.paper)});
	}
	if(Config.speedFoci == true)
	{
	speedFoci = ThaumcraftApi.addInfusionCraftingRecipe("Speed Foci", new ItemStack(ItemRegister.speedFoci),4 , 
			ResearchAspects.speedFoci, 
			new ItemStack(Item.bootsLeather), new ItemStack[]{
			new ItemStack(Item.netherQuartz), new ItemStack(Item.feather), new ItemStack(Item.netherQuartz),
			new ItemStack(Item.feather), new ItemStack(Item.netherQuartz), new ItemStack(Item.feather), 
			new ItemStack(Item.netherQuartz), new ItemStack(Item.feather)});
	}
	if(Config.pechFoci == true)
	{
	pechFoci = ThaumcraftApi.addInfusionCraftingRecipe("Pech Foci", new ItemStack(ItemRegister.pechFoci),4 , 
			ResearchAspects.pechFoci, 
			new ItemStack(ConfigItems.itemFocusPech), new ItemStack[]{
			new ItemStack(Item.netherQuartz), new ItemStack(ConfigItems.itemManaBean), new ItemStack(Item.netherQuartz),
			new ItemStack(ConfigItems.itemManaBean), new ItemStack(Item.netherQuartz), new ItemStack(ConfigItems.itemManaBean), 
			new ItemStack(Item.netherQuartz), new ItemStack(ConfigItems.itemManaBean)});
	}
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
