package thaumcraftextras.register;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.research.ResearchCategories;
import thaumcraft.api.research.ResearchItem;
import thaumcraft.api.research.ResearchPage;
import thaumcraftextras.helpers.MainHelper;
import thaumcraftextras.helpers.ResearchHelper;
import thaumcraftextras.lib.ResearchAspect;
import thaumcraftextras.lib.TCELocalization;
import thaumcraftextras.main.Config;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ThaumonomiconRegister {

	public static void addEntryToThaumonomicon()
	{
		ResearchItem research;

		String text;
		String text2;
		
		text = "1";
		research = new ResearchHelper("Thaumcraft Extras", "TCE", new AspectList(), 0, 0, 30, new ItemStack(BlockRegister.researchBlock)).setRound().setAutoUnlock().registerResearchItem();
		research.setPages(new ResearchPage(text));
		
		if(Config.pechTrade = true)
		{
		text = "1";
		research = new ResearchHelper("Essence of Greed", "TCE", ResearchAspect.pechTradeResearch, 2, -2, 3, new ItemStack(ItemRegister.pechTradeTier1)).setParents("Thaumcraft Extras").registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(ThaumcraftRecipeRegister.pechTradeTier1), new ResearchPage(ThaumcraftRecipeRegister.pechTradeTier2));
		}
		
		if(Config.magicTrade = true)
		{
		text = "1";
		research = new ResearchHelper("Essence of Magic", "TCE", ResearchAspect.magicTradeResearch, 2, -4, 3, new ItemStack(ItemRegister.magicTradeTier1)).setParents("Essence of Greed").setConcealed().registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(ThaumcraftRecipeRegister.magicTradeTier1), new ResearchPage(ThaumcraftRecipeRegister.magicTradeTier2));
		}
		
		if(Config.arrowFoci = true)
		{
		text = "1";
		research = new ResearchHelper(TCELocalization.arrowFoci, "TCE", ResearchAspect.arrowFociResearch, -3, 0, 3, new ItemStack(ItemRegister.arrowFoci)).setParents("Thaumcraft Extras").registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(ThaumcraftRecipeRegister.arrowFoci));
		}
		
		if(Config.enderFoci = true)
		{
		text = "1";
		research = new ResearchHelper(TCELocalization.enderFoci, "TCE", ResearchAspect.enderFociResearch, -2, -2, 3, new ItemStack(ItemRegister.enderFoci)).setParents("Wand Focus: Arrow").setHidden().registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(ThaumcraftRecipeRegister.enderFoci));
		}
		
		if(Config.healFoci == true)
		{
		text = "1";
		research = new ResearchHelper(TCELocalization.healFoci, "TCE", ResearchAspect.healFociResearch, -3, -2, 3, new ItemStack(ItemRegister.healFoci)).setParents("Wand Focus: Arrow").setHidden().registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(ThaumcraftRecipeRegister.healFoci));
		}
		
		if(Config.speedFoci == true)
		{
		text = "1";	
		research = new ResearchHelper(TCELocalization.speedFoci, "TCE", ResearchAspect.speedFociResearch, -4, -2, 3, new ItemStack(ItemRegister.speedFoci)).setParents("Wand Focus: Arrow").setHidden().registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(ThaumcraftRecipeRegister.speedFoci));
		}
		if(Config.xpExtractor == true)
		{
		text = "1";
		research = new ResearchHelper(TCELocalization.xpExtractor, "TCE", ResearchAspect.xpExtractorResearch, -5, 1, 3, new ItemStack(ItemRegister.xpExtractor)).setParents("Wand Focus: Arrow").setHidden().registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(ThaumcraftRecipeRegister.xpExtractor));
		}
		
		if(Config.xpFoci == true)
		{
		text = "1";
		research = new ResearchHelper(TCELocalization.xpFoci, "TCE", ResearchAspect.xpFociResearch, -6, 1, 3, new ItemStack(ItemRegister.xpFoci)).setParents("Experience Extractor").setHidden().registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(ThaumcraftRecipeRegister.xpFoci));
		}
		
		text = "1";
		research = new ResearchHelper("Shard Infusion", "TCE", new AspectList(), 2, 0, 3, new ItemStack(InfusionRegister.lightShard)).setParents("Thaumcraft Extras").setRound().setAutoUnlock().registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(InfusionRegister.lightShardRecipe));
		
		text = "1";
		text2 = "2";
		research = new ResearchHelper("Block Infusion", "TCE", new AspectList(), 2, 3, 3, new ItemStack(BlockRegister.airBlock)).setParents("Shard Infusion").setRound().setAutoUnlock().registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(text2), new ResearchPage(InfusionRegister.airBlock));
		
		
		if(Config.fireBlock == true)
		{
		text = "1";
		research = new ResearchHelper("Fire Block", "TCE", ResearchAspect.fireBlockResearch, 0, 3, 3, new ItemStack(BlockRegister.fireBlock)).setParents("Block Infusion").registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(InfusionRegister.fireBlock));
		}
		
		if(Config.waterBlock == true)
		{
		text = "1";
		research = new ResearchHelper("Water Block", "TCE",  ResearchAspect.waterBlockResearch, 0, 2, 3, new ItemStack(BlockRegister.waterBlock)).setParents("Block Infusion").registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(InfusionRegister.waterBlock));
		}
		
		if(Config.earthBlock == true)
		{
		text = "1";
		research = new ResearchHelper("Earth Block", "TCE",  ResearchAspect.earthBlockResearch, 0, 4, 3, new ItemStack(BlockRegister.earthBlock)).setParents("Block Infusion").registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(InfusionRegister.earthBlock));
		}
		
		if(Config.lightBlock == true)
		{
		text = "1";
		research = new ResearchHelper("Light Block", "TCE",  ResearchAspect.lightBlockResearch, 0, 5, 3, new ItemStack(BlockRegister.lightBlock)).setParents("Block Infusion").registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(InfusionRegister.lightBlock));
		}
		
		if(Config.enderBlock == true)
		{
		text = "1";
		research = new ResearchHelper("Ender Block", "TCE",  ResearchAspect.enderBlockResearch, 0, 6, 3, new ItemStack(BlockRegister.enderBlock)).setParents("Block Infusion").registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(InfusionRegister.enderBlock));
		}
		
		text = "1";
		research = new ResearchHelper("Ignis Fuel", "TCE",  ResearchAspect.ignisFuelResearch, 2, 5, 3, new ItemStack(ItemRegister.ignisFuel)).setParents("Shard Infusion").registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(ThaumcraftRecipeRegister.ignisFuel));
		
		
		if(Config.exchangeFoci == true)
		{
		text = "1";
		research = new ResearchHelper(TCELocalization.exchangeFoci, "TCE",  ResearchAspect.exchangeFociResearch, -3, 2, 3, new ItemStack(ItemRegister.exchangeFoci)).setParents("Wand Focus: Arrow").setHidden().registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(ThaumcraftRecipeRegister.exchangeFoci), new ResearchPage(ThaumcraftRecipeRegister.beamExchangeFoci));
		}
		
		if(Config.returnFoci == true)
		{
		text = "1";
		research = new ResearchHelper(TCELocalization.returnFoci, "TCE", ResearchAspect.returnFociResearch, -4, 2, 3, new ItemStack(ItemRegister.returnFoci)).setParents("Wand Focus: Arrow").setHidden().registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(ThaumcraftRecipeRegister.returnFoci));
		}	
		
		if(Config.smeltingFoci == true)
		{
		text = "1";
		research = new ResearchHelper(TCELocalization.smeltingFoci, "TCE", ResearchAspect.smeltingFociResearch, -2, 2, 3, new ItemStack(ItemRegister.smeltingFoci)).setParents("Wand Focus: Arrow").setHidden().registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(ThaumcraftRecipeRegister.smeltingFoci));
		}
		
		
		if(Config.dispelFoci == true)
		{
		text = "1";
		research = new ResearchHelper(TCELocalization.dispelFoci, "TCE", ResearchAspect.dispelFociResearch, -5, -1, 3, new ItemStack(ItemRegister.dispelFoci)).setParents("Wand Focus: Arrow").setHidden().registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(ThaumcraftRecipeRegister.dispelFoci));
		}
		
		if(Config.destroyFoci == true)
		{
		text = "1";
		research = new ResearchHelper(TCELocalization.destroyFoci, "THAUMATURGY", ResearchAspect.destroyFociResearch, -2, -4, -3, new ItemStack(ItemRegister.destroyFoci)).setParents("FOCUSEXCAVATION").setHidden().registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(ThaumcraftRecipeRegister.destroyFoci));
		}
		
		if(Config.freezeFoci = true)
		{
		text = "1";
		research = new ResearchHelper(TCELocalization.freezeFoci, "THAUMATURGY", ResearchAspect.freezeFociResearch, 1, -7, 3, new ItemStack(ItemRegister.freezeFoci)).setParents("FOCUSFROST").setHidden().registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(ThaumcraftRecipeRegister.freezeFoci));
		}
		
		text = "1";
		research = new ResearchHelper("Wand Rods", "THAUMATURGY", ResearchAspect.wandRodResearch, -9, 1, 3, new ItemStack(ItemRegister.goldRodItem)).setParents("ROD_greatwood").setHidden().registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(ThaumcraftRecipeRegister.ironRod), new ResearchPage(ThaumcraftRecipeRegister.goldRod), new ResearchPage(ThaumcraftRecipeRegister.diamondRod), new ResearchPage(ThaumcraftRecipeRegister.emeraldRod));
	}
	
	public static void addPage()
	{
		 ResourceLocation background = new ResourceLocation("thaumcraft", "textures/gui/gui_researchback.png");
         ResearchCategories.registerCategory("TCE", new ResourceLocation(MainHelper.modName + ":" + TCELocalization.TCETabIcon), background);
         LanguageRegistry.instance().addStringLocalization("tc.research_category.TCE", "Thaumcraft Extras");
	}
	
}
