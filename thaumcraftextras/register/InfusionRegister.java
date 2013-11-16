package thaumcraftextras.register;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.ShapedArcaneRecipe;
import thaumcraft.common.Thaumcraft;
import thaumcraft.common.config.ConfigItems;
import thaumcraftextras.helpers.MainHelper;
import thaumcraftextras.items.ShardItem;
import thaumcraftextras.items.TCEItem;
import thaumcraftextras.items.foci.ArrowFoci;
import thaumcraftextras.items.foci.EnderFoci;
import thaumcraftextras.items.foci.HealFoci;
import thaumcraftextras.items.foci.PechFoci;
import thaumcraftextras.items.foci.SpeedFoci;
import thaumcraftextras.lib.TCELocalization;
import thaumcraftextras.main.Config;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class InfusionRegister {

	public static void load()
	{	
		lightShard = new ShardItem(Config.lightShardId).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.lightShardTexture);
		LanguageRegistry.addName(lightShard, TCELocalization.lightShard);
		
	}
	
	public static void recipe()
	{
		airBlock = ThaumcraftApi.addArcaneCraftingRecipe("Air Block", new ItemStack(BlockRegister.airBlock), new AspectList().add(Aspect.AIR, 18), new Object[]{
			"   ",
			"XI ",
			"   ",
			'X', ConfigItems.itemShard,
			'I', Block.stoneBrick});
		
		if(Config.lightBlock = true)
		{
		lightBlock = ThaumcraftApi.addArcaneCraftingRecipe("Light Block", new ItemStack(BlockRegister.lightBlock), new AspectList().add(Aspect.FIRE, 2).add(Aspect.AIR, 2), new Object[]{
			"   ",
			"XI ",
			"   ",
			'X', lightShard,
			'I', Block.stoneBrick});
		}
		
		if(Config.waterBlock = true)
		{
		waterBlock = ThaumcraftApi.addArcaneCraftingRecipe("Water Block", new ItemStack(BlockRegister.waterBlock), new AspectList().add(Aspect.WATER, 18), new Object[]{
			"   ",
			"XI ",
			"   ",
			'X', new ItemStack(ConfigItems.itemShard, 2, 2),
			'I', Block.stoneBrick});
		}
		
		if(Config.earthBlock = true)
		{
		earthBlock = ThaumcraftApi.addArcaneCraftingRecipe("Earth Block", new ItemStack(BlockRegister.earthBlock), new AspectList().add(Aspect.EARTH, 18), new Object[]{
			"   ",
			"XI ",
			"   ",
			'X', new ItemStack(ConfigItems.itemShard, 3, 3),
			'I', Block.stoneBrick});
		}
		
		if(Config.fireBlock = true)
		{
		fireBlock = ThaumcraftApi.addArcaneCraftingRecipe("Fire Block", new ItemStack(BlockRegister.fireBlock), new AspectList().add(Aspect.FIRE, 18), new Object[]{
			"   ",
			"XI ",
			"   ",
			'X', new ItemStack(ConfigItems.itemShard, 1, 1),
			'I', Block.stoneBrick});
		}
		
		if(Config.lightBlock = true)
		{
		lightShardRecipe = ThaumcraftApi.addArcaneCraftingRecipe("Light Shard", new ItemStack(lightShard), new AspectList().add(Aspect.AIR, 2).add(Aspect.FIRE, 2), new Object[]{
			"   ",
			"XI ",
			"   ",
			'X', Item.coal	,
			'I', ConfigItems.itemShard});
		}
		}
	

	public static ShapedArcaneRecipe airBlock;
	public static ShapedArcaneRecipe fireBlock;
	public static ShapedArcaneRecipe waterBlock;
	public static ShapedArcaneRecipe earthBlock;
	public static ShapedArcaneRecipe lightBlock;
	public static ShapedArcaneRecipe lightShardRecipe;
	
	public static Item lightShard;
	
	
	
	
	
	
	
	
	
	
	
	
	
}