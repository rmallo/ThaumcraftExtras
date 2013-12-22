package thaumcraftextras.register;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.ConfigCategory;
import net.minecraftforge.oredict.OreDictionary;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.InfusionRecipe;
import thaumcraft.api.crafting.ShapedArcaneRecipe;
import thaumcraft.common.config.ConfigItems;
import thaumcraft.common.config.ConfigResearch;
import thaumcraftextras.helpers.MainHelper;
import thaumcraftextras.lib.CraftingAspects;
import thaumcraftextras.lib.TCELocalization;
import thaumcraftextras.main.Config;

public class ThaumcraftRecipeRegister {

	public static void load()
	{
	if(Config.pechTrade == true)
	{
	pechTradeTier1 = ThaumcraftApi.addArcaneCraftingRecipe("Essence of Greed", new ItemStack(ItemRegister.pechTradeTier1), CraftingAspects.pechTradeTier1, new Object[]{
		"XXX",
		"XIX",
		"XXX",
		'X', Item.goldNugget,
		'I', Item.ingotGold});
	}
	if(Config.pechTrade == true)
	{
	pechTradeTier2 = ThaumcraftApi.addArcaneCraftingRecipe("Essence of Greed", new ItemStack(ItemRegister.pechTradeTier2), CraftingAspects.pechTradeTier2, new Object[]{
		"XXX",
		"XXX",
		"XXX",
		'X', ItemRegister.pechTradeTier1});
	}
	if(Config.pechTrade == true)
	{
	pechTradeTier3 = ThaumcraftApi.addArcaneCraftingRecipe("Essence of Greed", new ItemStack(ItemRegister.pechTradeTier3), CraftingAspects.pechTradeTier3, new Object[]{
		"XXX",
		"XXX",
		"XXX",
		'X', ItemRegister.pechTradeTier2});
	}
	if(Config.pechTrade == true)
	{
	pechTradeTier4 = ThaumcraftApi.addArcaneCraftingRecipe("Essence of Greed", new ItemStack(ItemRegister.pechTradeTier4), CraftingAspects.pechTradeTier4, new Object[]{
		"XXX",
		"XXX",
		"XXX",
		'X', ItemRegister.pechTradeTier3});
	
	if(Config.pechTrade == true)
	{
	pechTradeTier5 = ThaumcraftApi.addArcaneCraftingRecipe("Essence of Greed", new ItemStack(ItemRegister.pechTradeTier5), CraftingAspects.pechTradeTier5, new Object[]{
		"XXX",
		"XXX",
		"XXX",
		'X', ItemRegister.pechTradeTier4});
	}
	if(Config.magicTrade == true)
	{
	magicTradeTier1 = ThaumcraftApi.addArcaneCraftingRecipe("Essence of Magic", new ItemStack(ItemRegister.magicTradeTier1), CraftingAspects.magicTradeTier1, new Object[]{
		"XXX",
		"XIX",
		"XXX",
		'X', Item.goldNugget,
		'I', Item.diamond});
	}
	if(Config.magicTrade == true)
	{
	magicTradeTier2 = ThaumcraftApi.addArcaneCraftingRecipe("Essence of Magic", new ItemStack(ItemRegister.magicTradeTier2), CraftingAspects.magicTradeTier2, new Object[]{
		"XXX",
		"XXX",
		"XXX",
		'X', ItemRegister.magicTradeTier1});
	}
	if(Config.magicTrade == true)
	{
	magicTradeTier3 = ThaumcraftApi.addArcaneCraftingRecipe("Essence of Magic", new ItemStack(ItemRegister.magicTradeTier3), CraftingAspects.magicTradeTier3, new Object[]{
		"XXX",
		"XXX",
		"XXX",
		'X', ItemRegister.magicTradeTier2});
	}
	if(Config.magicTrade == true)
	{
	magicTradeTier4 = ThaumcraftApi.addArcaneCraftingRecipe("Essence of Magic", new ItemStack(ItemRegister.magicTradeTier4), CraftingAspects.magicTradeTier4, new Object[]{
		"XXX",
		"XXX",
		"XXX",
		'X', ItemRegister.magicTradeTier3});
	}
	if(Config.magicTrade == true)
	magicTradeTier5 = ThaumcraftApi.addArcaneCraftingRecipe("Essence of Magic", new ItemStack(ItemRegister.magicTradeTier5),	CraftingAspects.magicTradeTier5,  new Object[]{
		"XXX",
		"XXX",
		"XXX",
		'X', ItemRegister.magicTradeTier4});
	
	}
	if(Config.enderFoci == true)
	{
	enderFoci = ThaumcraftApi.addInfusionCraftingRecipe(TCELocalization.enderFoci, new ItemStack(ItemRegister.enderFoci),4 , 
			CraftingAspects.enderFoci, 
			new ItemStack(Item.enderPearl), new ItemStack[]{
		new ItemStack(Item.netherQuartz), new ItemStack(Item.netherrackBrick), new ItemStack(Item.netherQuartz),
		new ItemStack(Item.netherrackBrick), new ItemStack(Item.netherQuartz), new ItemStack(Item.netherrackBrick), 
		new ItemStack(Item.netherQuartz), new ItemStack(Item.netherrackBrick)});
	}
	if(Config.arrowFoci == true)
	{
	arrowFoci = ThaumcraftApi.addInfusionCraftingRecipe(TCELocalization.arrowFoci, new ItemStack(ItemRegister.arrowFoci),4 , 
			CraftingAspects.arrowFoci, 
		new ItemStack(Item.bow), new ItemStack[]{
		new ItemStack(Item.netherQuartz), new ItemStack(Item.arrow), new ItemStack(Item.netherQuartz),
		new ItemStack(Item.arrow), new ItemStack(Item.netherQuartz), new ItemStack(Item.arrow), 
		new ItemStack(Item.netherQuartz), new ItemStack(Item.arrow)});
	}
	if(Config.healFoci == true)
	{
	healFoci = ThaumcraftApi.addInfusionCraftingRecipe(TCELocalization.healFoci, new ItemStack(ItemRegister.healFoci),10 , 
			CraftingAspects.healFoci, 
			new ItemStack(Item.appleGold), new ItemStack[]{
			new ItemStack(Item.netherQuartz), new ItemStack(Item.paper), new ItemStack(Item.netherQuartz),
			new ItemStack(Item.paper), new ItemStack(Item.netherQuartz), new ItemStack(Item.paper), 
			new ItemStack(Item.netherQuartz), new ItemStack(Item.paper)});
	}
	if(Config.speedFoci == true)
	{
	speedFoci = ThaumcraftApi.addInfusionCraftingRecipe(TCELocalization.speedFoci, new ItemStack(ItemRegister.speedFoci),4 , 
			CraftingAspects.speedFoci, 
			new ItemStack(Item.bootsLeather), new ItemStack[]{
			new ItemStack(Item.netherQuartz), new ItemStack(Item.feather), new ItemStack(Item.netherQuartz),
			new ItemStack(Item.feather), new ItemStack(Item.netherQuartz), new ItemStack(Item.feather), 
			new ItemStack(Item.netherQuartz), new ItemStack(Item.feather)});
	}
	
	if(Config.xpFoci == true)
	{
	xpFoci = ThaumcraftApi.addInfusionCraftingRecipe(TCELocalization.xpFoci, new ItemStack(ItemRegister.xpFoci),4 , 
			CraftingAspects.xpFoci, 
			new ItemStack(ItemRegister.xpExtractor), new ItemStack[]{
			new ItemStack(Item.netherQuartz), new ItemStack(InfusionRegister.xpShard), new ItemStack(Item.netherQuartz),
			new ItemStack(InfusionRegister.xpShard), new ItemStack(Item.netherQuartz), new ItemStack(InfusionRegister.xpShard), 
			new ItemStack(Item.netherQuartz), new ItemStack(InfusionRegister.xpShard)});
	}
	
	if(Config.xpExtractor == true)
	{
		xpExtractor = ThaumcraftApi.addArcaneCraftingRecipe(TCELocalization.xpExtractor, new ItemStack(ItemRegister.xpExtractor),	CraftingAspects.xpExtractor,  new Object[]{
			"YIY",
			"IXI",
			"YIY",
			'X', ItemRegister.magicTradeTier2,
			'Y', ItemRegister.pechTradeTier1,
			'I', ItemRegister.magicTradeTier1});
	}
	
	if(Config.returnFoci == true)
	{
		returnFoci = ThaumcraftApi.addInfusionCraftingRecipe(TCELocalization.returnFoci, new ItemStack(ItemRegister.returnFoci),4,
			CraftingAspects.returnFoci,
			new ItemStack(ItemRegister.enderFoci), new ItemStack[]{
			new ItemStack(Item.netherQuartz), new ItemStack(Item.enderPearl), new ItemStack(Item.netherQuartz),
			new ItemStack(Item.enderPearl), new ItemStack(Item.netherQuartz), new ItemStack(Item.enderPearl), 
			new ItemStack(Item.netherQuartz), new ItemStack(Item.enderPearl)});
	}
	
	if(Config.exchangeFoci == true)
	{
		exchangeFoci = ThaumcraftApi.addInfusionCraftingRecipe(TCELocalization.exchangeFoci, new ItemStack(ItemRegister.exchangeFoci),4,
			CraftingAspects.exchangeFoci,
			new ItemStack(ItemRegister.pechTradeTier4), new ItemStack[]{
			new ItemStack(Item.netherQuartz), new ItemStack(ItemRegister.pechTradeTier2), new ItemStack(Item.netherQuartz),
			new ItemStack(ItemRegister.pechTradeTier2), new ItemStack(Item.netherQuartz), new ItemStack(ItemRegister.pechTradeTier2), 
			new ItemStack(Item.netherQuartz), new ItemStack(ItemRegister.pechTradeTier2)});
	}
	if(Config.smeltingFoci == true)
	{
		smeltingFoci = ThaumcraftApi.addInfusionCraftingRecipe(TCELocalization.smeltingFoci, new ItemStack(ItemRegister.smeltingFoci),4,
				CraftingAspects.smeltingFoci,
				new ItemStack(ItemRegister.exchangeFoci), new ItemStack[]{
				new ItemStack(Item.netherQuartz), new ItemStack(ItemRegister.magicTradeTier1), new ItemStack(Item.netherQuartz),
				new ItemStack(ItemRegister.magicTradeTier1), new ItemStack(Item.netherQuartz), new ItemStack(ItemRegister.magicTradeTier1), 
				new ItemStack(Item.netherQuartz), new ItemStack(ItemRegister.magicTradeTier1)});
	}
	if(Config.dispelFoci == true)
	{
		dispelFoci = ThaumcraftApi.addInfusionCraftingRecipe(TCELocalization.dispelFoci, new ItemStack(ItemRegister.dispelFoci),4,
				CraftingAspects.dispelFoci,
				new ItemStack(ItemRegister.speedFoci), new ItemStack[]{
				new ItemStack(Item.netherQuartz), new ItemStack(Item.sugar), new ItemStack(Item.netherQuartz),
				new ItemStack(Item.sugar), new ItemStack(Item.netherQuartz), new ItemStack(Item.sugar), 
				new ItemStack(Item.netherQuartz), new ItemStack(Item.sugar)});
	}
	
	if(Config.destroyFoci == true)
	{
	destroyFoci = ThaumcraftApi.addInfusionCraftingRecipe(TCELocalization.destroyFoci, new ItemStack(ItemRegister.destroyFoci),4,
			CraftingAspects.destroyFoci,
			new ItemStack(ItemRegister.exchangeFoci), new ItemStack[]{
			new ItemStack(Item.netherQuartz), new ItemStack(Item.enderPearl), new ItemStack(Item.netherQuartz),
			new ItemStack(Item.enderPearl), new ItemStack(Item.netherQuartz), new ItemStack(Item.enderPearl), 
			new ItemStack(Item.netherQuartz), new ItemStack(Item.enderPearl)});
	}
	
	if(Config.freezeFoci == true)
	{
	freezeFoci = ThaumcraftApi.addInfusionCraftingRecipe(TCELocalization.freezeFoci, new ItemStack(ItemRegister.freezeFoci),4,
			CraftingAspects.freezeFoci,
			new ItemStack(ConfigItems.itemFocusFrost), new ItemStack[]{
			new ItemStack(Block.ice), new ItemStack(Item.snowball), new ItemStack(Block.ice),
			new ItemStack(Item.snowball), new ItemStack(Block.ice), new ItemStack(Item.snowball), 
			new ItemStack(Block.ice), new ItemStack(Item.snowball)});
	}
	
	if(Config.beamExchangeFoci == true)
	{
	beamExchangeFoci = ThaumcraftApi.addInfusionCraftingRecipe(TCELocalization.beamExchangeFoci, new ItemStack(ItemRegister.beamExchangeFoci),4,
			CraftingAspects.beamExchangeFoci,
			new ItemStack(ItemRegister.exchangeFoci), new ItemStack[]{
			new ItemStack(Item.netherQuartz), new ItemStack(ItemRegister.pechTradeTier2), new ItemStack(Item.netherQuartz),
			new ItemStack(ItemRegister.pechTradeTier2), new ItemStack(Item.netherQuartz), new ItemStack(ItemRegister.pechTradeTier2), 
			new ItemStack(Item.netherQuartz), new ItemStack(ItemRegister.pechTradeTier2)});
	}
	
	if(Config.confusionFoci == true)
	{
	confusionFoci = ThaumcraftApi.addInfusionCraftingRecipe(TCELocalization.confusionFoci, new ItemStack(ItemRegister.confusionFoci),4,
			CraftingAspects.confusionFoci,
			new ItemStack(ItemRegister.confusionFoci), new ItemStack[]{
			new ItemStack(Item.netherQuartz), new ItemStack(Item.spiderEye), new ItemStack(Item.netherQuartz),
			new ItemStack(Item.spiderEye), new ItemStack(Item.netherQuartz), new ItemStack(Item.spiderEye), 
			new ItemStack(Item.netherQuartz), new ItemStack(Item.spiderEye)});
	}
	
	ironRod = ThaumcraftApi.addArcaneCraftingRecipe("Wand Rods", new ItemStack(ItemRegister.ironRodItem), CraftingAspects.ironRod, new Object[]{
		"  X",
		" I ",
		"X  ",
		'X', Item.ingotIron,
		'I', Item.stick});
	
	goldRod = ThaumcraftApi.addArcaneCraftingRecipe("Wand Rods", new ItemStack(ItemRegister.goldRodItem), CraftingAspects.goldRod, new Object[]{
		"  X",
		" I ",
		"X  ",
		'X', Item.ingotGold,
		'I', Item.stick});
	
	diamondRod = ThaumcraftApi.addArcaneCraftingRecipe("Wand Rods", new ItemStack(ItemRegister.diamondRodItem), CraftingAspects.diamondRod, new Object[]{
		"  X",
		" I ",
		"X  ",
		'X', Item.diamond,
		'I', Item.stick});
	
	
	emeraldRod = ThaumcraftApi.addArcaneCraftingRecipe("Wand Rods", new ItemStack(ItemRegister.emeraldRodItem), CraftingAspects.emeraldRod, new Object[]{
		"  X",
		" I ",
		"X  ",
		'X', Item.emerald,
		'I', Item.stick});
	
	candyRod = ThaumcraftApi.addArcaneCraftingRecipe("Wand Rods", new ItemStack(ItemRegister.candyRodItem), CraftingAspects.candyRod, new Object[]{
		"  X",
		" I ",
		"X  ",
		'X', Item.sugar,
		'I', Item.bucketMilk});
	
	ignisFuel = ThaumcraftApi.addArcaneCraftingRecipe(TCELocalization.IgnisFuel, new ItemStack(ItemRegister.ignisFuel),	CraftingAspects.ignisFuel,  new Object[]{
		"Y  ",
		"X  ",
		"   ",
		'X', Item.coal,
		'Y', Item.flint});
	
	
	wardedBlock = ThaumcraftApi.addArcaneCraftingRecipe("Warded Blocks", new ItemStack(BlockRegister.wardedBlock, 8), CraftingAspects.wardedBlockResearch,  new Object[]{
		"XYX",
		"YYY",
		"XYX",
		'X', new ItemStack(ConfigItems.itemResource, 1, 2),
		'Y', Block.stone});
		
		GameRegistry.addShapedRecipe(new ItemStack(BlockRegister.ignisFuelBlock), new Object[] {
		"XXX",
		"XXX",
		"XXX",
		'X', ItemRegister.ignisFuel});
		
		GameRegistry.addShapedRecipe(new ItemStack(BlockRegister.thaumiumGlass, 8), new Object[] {
		"XIX",
		"III",
		"XIX",
		'X', new ItemStack(ConfigItems.itemResource, 1, 2),
		'I', Block.glass});
		
		GameRegistry.addShapedRecipe(new ItemStack(BlockRegister.infusionInfo, 1), new Object[] {
		"XIX",
		"IYI",
		"XIX",
		'X', new ItemStack(Block.blockRedstone),
		'I', Item.ingotGold,
		'Y', Block.glass});
		
		GameRegistry.addShapedRecipe(new ItemStack(BlockRegister.wardedBlock, 8, 1), new Object[] {
		"XXX",
		"XYX",
		"XXX",
		'Y', new ItemStack(Item.dyePowder, 1, 1),
		'X', BlockRegister.wardedBlock});
		
		GameRegistry.addShapedRecipe(new ItemStack(BlockRegister.wardedBlock, 8, 2), new Object[] {
		"XXX",
		"XYX",
		"XXX",
		'Y', new ItemStack(Item.dyePowder, 1, 4),
		'X', BlockRegister.wardedBlock});
		
		GameRegistry.addShapedRecipe(new ItemStack(BlockRegister.wardedBlock, 8, 3), new Object[] {
		"XXX",
		"XYX",
		"XXX",
		'Y', new ItemStack(Item.dyePowder, 1, 2),
		'X', BlockRegister.wardedBlock});
		
		GameRegistry.addShapedRecipe(new ItemStack(BlockRegister.wardedBlock, 8, 4), new Object[] {
		"XXX",
		"XYX",
		"XXX",
		'Y', new ItemStack(Item.dyePowder, 1, 11),
		'X', BlockRegister.wardedBlock});
		
		GameRegistry.addShapedRecipe(new ItemStack(BlockRegister.wardedBlock, 8, 5), new Object[] {
		"XXX",
		"XYX",
		"XXX",
		'Y', new ItemStack(Item.dyePowder, 1, 3),
		'X', BlockRegister.wardedBlock});
		
		GameRegistry.addShapedRecipe(new ItemStack(BlockRegister.wardedBlock, 8, 6), new Object[] {
		"XXX",
		"XYX",
		"XXX",
		'Y', new ItemStack(Item.dyePowder, 1, 6),
		'X', BlockRegister.wardedBlock});
		
		GameRegistry.addShapedRecipe(new ItemStack(BlockRegister.wardedBlock, 8, 7), new Object[] {
		"XXX",
		"XYX",
		"XXX",
		'Y', new ItemStack(Item.dyePowder, 1, 8),
		'X', BlockRegister.wardedBlock});
		
		GameRegistry.addShapedRecipe(new ItemStack(BlockRegister.wardedBlock, 8, 8), new Object[] {
		"XXX",
		"XYX",
		"XXX",
		'Y', new ItemStack(Item.dyePowder, 1, 14),
		'X', BlockRegister.wardedBlock});
		
		GameRegistry.addShapedRecipe(new ItemStack(BlockRegister.wardedBlock, 8, 9), new Object[] {
		"XXX",
		"XYX",
		"XXX",
		'Y', new ItemStack(Item.dyePowder, 1, 9),
		'X', BlockRegister.wardedBlock});
		
		GameRegistry.addShapedRecipe(new ItemStack(BlockRegister.wardedBlock, 8, 10), new Object[] {
		"XXX",
		"XYX",
		"XXX",
		'Y', new ItemStack(Item.dyePowder, 1, 5),
		'X', BlockRegister.wardedBlock});
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
	public static ShapedArcaneRecipe xpExtractor;
	public static ShapedArcaneRecipe ignisFuel;
	public static ShapedArcaneRecipe ironRod;
	public static ShapedArcaneRecipe goldRod;
	public static ShapedArcaneRecipe diamondRod;
	public static ShapedArcaneRecipe emeraldRod;
	public static ShapedArcaneRecipe candyRod;
	public static ShapedArcaneRecipe wardedBlock;
	
	public static ShapedArcaneRecipe copperRod;
	public static ShapedArcaneRecipe tinRod;
	
	public static InfusionRecipe enderFoci;
	public static InfusionRecipe arrowFoci;
	public static InfusionRecipe healFoci;
	public static InfusionRecipe speedFoci;
	public static InfusionRecipe pechFoci;
	public static InfusionRecipe xpFoci;
	public static InfusionRecipe returnFoci;
	public static InfusionRecipe exchangeFoci;
	public static InfusionRecipe smeltingFoci;
	public static InfusionRecipe dispelFoci;
	public static InfusionRecipe destroyFoci;
	public static InfusionRecipe freezeFoci;
	public static InfusionRecipe beamExchangeFoci;
	public static InfusionRecipe confusionFoci;
}
