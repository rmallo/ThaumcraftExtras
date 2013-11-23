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
import thaumcraftextras.lib.BookEntry;
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
		
		text = BookEntry.mainEntry;
		research = new ResearchHelper("Thaumcraft Extras", "TCE", new AspectList(), 0, 0, 30, new ItemStack(BlockRegister.researchBlock)).setRound().setAutoUnlock().registerResearchItem();
		research.setPages(new ResearchPage(text));
		
		if(Config.pechTrade = true)
		{
		text = BookEntry.pechTradeEntryPage1;
		research = new ResearchHelper("Pech Trade", "TCE", ResearchAspect.pechTradeResearch, 2, -2, 3, new ItemStack(ItemRegister.pechTradeTier1)).setParents("Thaumcraft Extras").registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(ThaumcraftRecipeRegister.pechTradeTier1), new ResearchPage(ThaumcraftRecipeRegister.pechTradeTier2));
		}
		if(Config.magicTrade = true)
		{
		text = BookEntry.magicTradeEntryPage1;
		research = new ResearchHelper("Magic Trade", "TCE", ResearchAspect.magicTradeResearch, 2, -4, 3, new ItemStack(ItemRegister.magicTradeTier1)).setParents("Pech Trade").setConcealed().registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(ThaumcraftRecipeRegister.magicTradeTier1), new ResearchPage(ThaumcraftRecipeRegister.magicTradeTier2));
		}
		if(Config.arrowFoci = true)
		{
		text = BookEntry.arrowFociEntry;
		research = new ResearchHelper(TCELocalization.arrowFoci, "TCE", ResearchAspect.arrowFociResearch, -2, -2, 3, new ItemStack(ItemRegister.arrowFoci)).setParents("Thaumcraft Extras").registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(ThaumcraftRecipeRegister.arrowFoci));
		}
		
		if(Config.enderFoci = true)
		{
		text = BookEntry.enderFociEntry; 
		research = new ResearchHelper(TCELocalization.enderFoci, "TCE", ResearchAspect.enderFociResearch, -2, -3, 3, new ItemStack(ItemRegister.enderFoci)).setParents("Wand Focus: Arrow").registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(ThaumcraftRecipeRegister.enderFoci));
		}
		
		if(Config.healFoci == true)
		{
		text = BookEntry.healFociEntry;
		research = new ResearchHelper(TCELocalization.healFoci, "TCE", ResearchAspect.healFociResearch, -3, -2, 3, new ItemStack(ItemRegister.healFoci)).setParents("Thaumcraft Extras").registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(ThaumcraftRecipeRegister.healFoci));
		}
		
		if(Config.speedFoci == true)
		{
		text = BookEntry.speedFociEntry;
		research = new ResearchHelper(TCELocalization.speedFoci, "TCE", ResearchAspect.speedFociResearch, -3, -3, 3, new ItemStack(ItemRegister.speedFoci)).setParents("Wand Focus: Heal").registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(ThaumcraftRecipeRegister.speedFoci));
		}
		if(Config.xpExtractor == true)
		{
		text = BookEntry.xpExtractorEntry;
		research = new ResearchHelper(TCELocalization.xpExtractor, "TCE", ResearchAspect.xpExtractorResearch, -3, -4, 3, new ItemStack(ItemRegister.xpExtractor)).setParents("Wand Focus: Heal").registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(ThaumcraftRecipeRegister.xpExtractor));
		}
		
		if(Config.xpFoci == true)
		{
		text = BookEntry.xpFociEntry;
		research = new ResearchHelper(TCELocalization.xpFoci, "TCE", ResearchAspect.xpFociResearch, -3, -5, 3, new ItemStack(ItemRegister.xpFoci)).setParents("Experience Extractor").registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(ThaumcraftRecipeRegister.xpFoci));
		}
		
		if(Config.pechFoci == true)
		{
		text = BookEntry.pechFociEntry;
		research = new ResearchHelper(TCELocalization.pechFoci, "TCE", ResearchAspect.pechFociResearch, -2, 2, 3, new ItemStack(ItemRegister.pechFoci)).setParents("Thaumcraft Extras").registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(ThaumcraftRecipeRegister.pechFoci));
		}
		
		text = BookEntry.shardInfusionEntry;
		research = new ResearchHelper("Shard Infusion", "TCE", new AspectList(), 2, 0, 3, new ItemStack(InfusionRegister.lightShard)).setParents("Thaumcraft Extras").setRound().setAutoUnlock().registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(InfusionRegister.lightShardRecipe));
		
		text = BookEntry.blockInfusionEntry;
		text2 = BookEntry.airBlockEntry;
		research = new ResearchHelper("Block Infusion", "TCE", new AspectList(), 2, 3, 3, new ItemStack(BlockRegister.airBlock)).setParents("Shard Infusion").setRound().setAutoUnlock().registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(text2), new ResearchPage(InfusionRegister.airBlock));
		
		if(Config.fireBlock == true)
		text = BookEntry.fireBlockEntry;
		research = new ResearchHelper("Fire Block", "TCE", ResearchAspect.fireBlockResearch, 0, 3, 3, new ItemStack(BlockRegister.fireBlock)).setParents("Block Infusion").registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(InfusionRegister.fireBlock));

		if(Config.waterBlock == true)
		text = BookEntry.waterBlockEntry;
		research = new ResearchHelper("Water Block", "TCE",  ResearchAspect.waterBlockResearch, 0, 2, 3, new ItemStack(BlockRegister.waterBlock)).setParents("Block Infusion").registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(InfusionRegister.waterBlock));
	
		if(Config.earthBlock == true)
		text = BookEntry.earthBlockEntry;
		research = new ResearchHelper("Earth Block", "TCE",  ResearchAspect.earthBlockResearch, 0, 4, 3, new ItemStack(BlockRegister.earthBlock)).setParents("Block Infusion").registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(InfusionRegister.earthBlock));
		
		if(Config.lightBlock == true)
		text = BookEntry.lightBlockEntry;
		research = new ResearchHelper("Light Block", "TCE",  ResearchAspect.lightBlockResearch, 0, 5, 3, new ItemStack(BlockRegister.lightBlock)).setParents("Block Infusion").registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(InfusionRegister.lightBlock));
		
		text = BookEntry.ignisFuelEntry;
		research = new ResearchHelper("Ignis Fuel", "TCE",  ResearchAspect.ignisFuelResearch, 2, 5, 3, new ItemStack(ItemRegister.ignisFuel)).setParents("Shard Infusion").registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(ThaumcraftRecipeRegister.ignisFuel));
		
		if(Config.exchangeFoci == true)
		{
		text = BookEntry.exchangeFociEntry;
		research = new ResearchHelper(TCELocalization.exchangeFoci, "TCE",  ResearchAspect.exchangeFociResearch, -2, 3, 3, new ItemStack(ItemRegister.exchangeFoci)).setParents("Wand Focus: Pech Summon").registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(ThaumcraftRecipeRegister.exchangeFoci));
		}
		if(Config.returnFoci == true)
		{
		text = BookEntry.returnFociEntry;
		research = new ResearchHelper(TCELocalization.returnFoci, "TCE", ResearchAspect.returnFociResearch, -2, -4, 3, new ItemStack(ItemRegister.returnFoci)).setParents("Wand Focus: Blink").registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(ThaumcraftRecipeRegister.returnFoci));
		}	
		if(Config.smeltingFoci == true)
		{
			text = BookEntry.smeltingFociEntry;
			research = new ResearchHelper(TCELocalization.smeltingFoci, "TCE", ResearchAspect.returnFociResearch, -2, 4, 3, new ItemStack(ItemRegister.smeltingFoci)).setParents("Wand Focus: Exchange").registerResearchItem();
			research.setPages(new ResearchPage(text), new ResearchPage(ThaumcraftRecipeRegister.smeltingFoci));
		}
		if(Config.dispelFoci == true)
		{
			text = BookEntry.dispelFociEntry;
			research = new ResearchHelper(TCELocalization.dispelFoci, "TCE", ResearchAspect.dispelFociResearch, -4, -3, 3, new ItemStack(ItemRegister.dispelFoci)).setParents("Wand Focus: Speed").registerResearchItem();
			research.setPages(new ResearchPage(text), new ResearchPage(ThaumcraftRecipeRegister.dispelFoci));
		}
		
		if(Config.destroyFoci == true)
		{
			text = BookEntry.destroyFociEntry;
			research = new ResearchHelper(TCELocalization.destroyFoci, "TCE", ResearchAspect.destroyFociResearch, -3, 3, 3, new ItemStack(ItemRegister.destroyFoci)).setParents("Wand Focus: Exchange").registerResearchItem();
			research.setPages(new ResearchPage(text), new ResearchPage(ThaumcraftRecipeRegister.destroyFoci));
		}
		
	}
	
	public static void addPage()
	{
		 ResourceLocation background = new ResourceLocation("thaumcraft", "textures/gui/gui_researchback.png");
         ResearchCategories.registerCategory("TCE", new ResourceLocation(MainHelper.modName + ":" + TCELocalization.TCETabIcon), background);
         LanguageRegistry.instance().addStringLocalization("tc.research_category.TCE", "Thaumcraft Extras");
	}
	
}
