package thaumcraftextras.register;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.ShapedArcaneRecipe;
import thaumcraft.api.crafting.ShapelessArcaneRecipe;
import thaumcraft.common.Thaumcraft;
import thaumcraft.common.config.ConfigItems;
import thaumcraftextras.helpers.MainHelper;
import thaumcraftextras.items.ShardItem;
import thaumcraftextras.items.TCEItem;
import thaumcraftextras.items.XPShard;
import thaumcraftextras.items.foci.ArrowFoci;
import thaumcraftextras.items.foci.HealFoci;
import thaumcraftextras.items.foci.SpeedFoci;
import thaumcraftextras.lib.TCELocalization;
import thaumcraftextras.main.Config;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class InfusionRegister {

	public static void load()
	{	
		lightShard = new ShardItem(Config.lightShardId).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.lightShardTexture);
		LanguageRegistry.addName(lightShard, TCELocalization.lightShard);
		
		emptyShard = new ShardItem(Config.emptyShardId).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.emptyShardTexture);
		LanguageRegistry.addName(emptyShard, TCELocalization.emptyShard);
		
		xpShard = new XPShard(Config.xpShardId).setUnlocalizedName(MainHelper.modName + ":" + TCELocalization.xpShardTexture);
		LanguageRegistry.addName(xpShard, TCELocalization.xpShard);
	}
	
	public static void recipe()
	{
		airBlock = ThaumcraftApi.addShapelessArcaneCraftingRecipe("Block Infusion",
				new ItemStack(BlockRegister.airBlock),
				new AspectList().add(Aspect.AIR, 18), Block.stoneBrick, 
				new ItemStack(ConfigItems.itemShard, 1, 0));
		
		if(Config.lightBlock = true)
		{
			lightBlock = ThaumcraftApi.addShapelessArcaneCraftingRecipe(TCELocalization.LightBlock, 
					new ItemStack(BlockRegister.lightBlock), new AspectList().add(Aspect.FIRE, 2).add(Aspect.AIR, 2), 
					Block.stoneBrick, 
					lightShard);
		}
		
		if(Config.waterBlock = true)
		{
			waterBlock = ThaumcraftApi.addShapelessArcaneCraftingRecipe(TCELocalization.WaterBlock, 
					new ItemStack(BlockRegister.waterBlock), new AspectList().add(Aspect.WATER, 2), 
					Block.stoneBrick, 
					new ItemStack(ConfigItems.itemShard, 1, 2));
		}
		
		if(Config.earthBlock = true)
		{
			earthBlock = ThaumcraftApi.addShapelessArcaneCraftingRecipe(TCELocalization.EarthBlock, 
					new ItemStack(BlockRegister.earthBlock), new AspectList().add(Aspect.EARTH, 2), 
					Block.stoneBrick, 
					new ItemStack(ConfigItems.itemShard, 1, 3));
		}
		
		if(Config.fireBlock = true)
		{
			fireBlock = ThaumcraftApi.addShapelessArcaneCraftingRecipe(TCELocalization.FireBlock, 
					new ItemStack(BlockRegister.fireBlock), new AspectList().add(Aspect.FIRE, 2), 
					Block.stoneBrick, 
					new ItemStack(ConfigItems.itemShard, 1, 1));
		}
		
		if(Config.lightBlock = true)
		{
			lightShardRecipe = ThaumcraftApi.addShapelessArcaneCraftingRecipe("Shard Infusion", 
					new ItemStack(lightShard), new AspectList().add(Aspect.AIR, 2), 
					Item.coal, 
					new ItemStack(ConfigItems.itemShard, 1, 0));
		}
		
		if(Config.enderBlock = true)
		{
			enderBlock = ThaumcraftApi.addShapelessArcaneCraftingRecipe(TCELocalization.EnderBlock, 
					new ItemStack(BlockRegister.enderBlock), new AspectList().add(Aspect.ENTROPY, 2), 
					Block.stoneBrick, 
					Item.enderPearl);
		}
		
		}
	

	public static ShapelessArcaneRecipe airBlock;
	public static ShapelessArcaneRecipe fireBlock;
	public static ShapelessArcaneRecipe waterBlock;
	public static ShapelessArcaneRecipe earthBlock;
	public static ShapelessArcaneRecipe lightBlock;
	public static ShapelessArcaneRecipe enderBlock;
	
	public static ShapelessArcaneRecipe lightShardRecipe;
	
	public static Item lightShard;
	public static Item xpShard;
	public static Item emptyShard;	
}