package thaumcraftextras.register;

import cpw.mods.fml.common.registry.LanguageRegistry;
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
import thaumcraftextras.lib.TCELocalization;

public class ThaumonomiconRegister {

	public static void addEntryToThaumonomicon()
	{
		ResearchItem research;

		String text;
		String text2;
		
		text = BookEntry.mainEntry;
		research = new ResearchHelper("Thaumcraft Extras", "TCE", new AspectList(), 0, 0, 30, new ItemStack(BlockRegister.researchBlock)).setRound().setAutoUnlock().registerResearchItem();
		research.setPages(new ResearchPage(text));
		
		text = BookEntry.pechTradeEntryPage1;
		text2 = BookEntry.pechTradeEntryPage2;
		research = new ResearchHelper("Pech Trade", "TCE", new AspectList().add(Aspect.GREED, 10).add(Aspect.EXCHANGE, 10), 2, -2, 3, new ItemStack(ItemRegister.pechTradeTier1)).setParents("Thaumcraft Extras").registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(ThaumcraftRecipeRegister.pechTradeTier1), new ResearchPage(text2), new ResearchPage(ThaumcraftRecipeRegister.pechTradeTier2));

		text = BookEntry.magicTradeEntryPage1;
		text2 = BookEntry.magicTradeEntryPage2;
		research = new ResearchHelper("Magic Trade", "TCE", new AspectList().add(Aspect.MAGIC, 10), 2, -4, 3, new ItemStack(ItemRegister.magicTradeTier1)).setParents("Pech Trade").setConcealed().registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(ThaumcraftRecipeRegister.magicTradeTier1), new ResearchPage(text2), new ResearchPage(ThaumcraftRecipeRegister.magicTradeTier2));
	
		text = BookEntry.arrowFociEntry;
		research = new ResearchHelper(TCELocalization.arrowFoci, "TCE", new AspectList().add(Aspect.AIR, 20), -2, -2, 3, new ItemStack(ItemRegister.arrowFoci)).setParents("Thaumcraft Extras").registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(ThaumcraftRecipeRegister.arrowFoci));

		text = BookEntry.enderFociEntry; 
		research = new ResearchHelper(TCELocalization.enderFoci, "TCE", new AspectList().add(Aspect.AIR, 20), -2, -3, 3, new ItemStack(ItemRegister.enderFoci)).setParents("Wand Focus: Arrow").registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(ThaumcraftRecipeRegister.enderFoci));
		
		text = BookEntry.healFociEntry;
		research = new ResearchHelper(TCELocalization.healFoci, "TCE", new AspectList().add(Aspect.ORDER, 20).add(Aspect.HEAL, 25), -3, -2, 3, new ItemStack(ItemRegister.healFoci)).setParents("Thaumcraft Extras").registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(ThaumcraftRecipeRegister.healFoci));
		
		text = BookEntry.speedFociEntry;
		research = new ResearchHelper(TCELocalization.speedFoci, "TCE", new AspectList().add(Aspect.AIR, 10), -3, -3, 3, new ItemStack(ItemRegister.speedFoci)).setParents("Wand Focus: Heal").registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(ThaumcraftRecipeRegister.speedFoci));
	
		text = BookEntry.pechFociEntry;
		research = new ResearchHelper(TCELocalization.pechFoci, "TCE", new AspectList().add(Aspect.EXCHANGE, 10), -2, 2, 3, new ItemStack(ItemRegister.pechFoci)).setParents("Thaumcraft Extras").registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(ThaumcraftRecipeRegister.pechFoci));
		
		text = BookEntry.shardInfusionEntry;
		research = new ResearchHelper("Shard Infusion", "TCE", new AspectList().add(Aspect.LIGHT, 10), 2, 0, 3, new ItemStack(InfusionRegister.lightShard)).setParents("Thaumcraft Extras").setRound().setAutoUnlock().registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(InfusionRegister.lightShardRecipe));
		
		text = BookEntry.blockInfusionEntry;
		text2 = BookEntry.airBlockEntry;
		research = new ResearchHelper("Block Infusion", "TCE", new AspectList().add(Aspect.FIRE, 10), 2, 3, 3, new ItemStack(BlockRegister.airBlock)).setParents("Shard Infusion").setRound().setAutoUnlock().registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(text2), new ResearchPage(InfusionRegister.airBlock));
		

		text = BookEntry.fireBlockEntry;
		research = new ResearchHelper("Fire Block", "TCE", new AspectList().add(Aspect.FIRE, 10), 0, 3, 3, new ItemStack(BlockRegister.fireBlock)).setParents("Block Infusion").registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(InfusionRegister.fireBlock));

		text = BookEntry.waterBlockEntry;
		research = new ResearchHelper("Water Block", "TCE", new AspectList().add(Aspect.WATER, 10), 0, 2, 3, new ItemStack(BlockRegister.waterBlock)).setParents("Block Infusion").registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(InfusionRegister.waterBlock));
	
		text = BookEntry.earthBlockEntry;
		research = new ResearchHelper("Earth Block", "TCE", new AspectList().add(Aspect.EARTH, 10), 0, 4, 3, new ItemStack(BlockRegister.earthBlock)).setParents("Block Infusion").registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(InfusionRegister.earthBlock));
		
		text = BookEntry.lightBlockEntry;
		research = new ResearchHelper("Light Block", "TCE", new AspectList().add(Aspect.LIGHT, 10), 0, 5, 3, new ItemStack(BlockRegister.lightBlock)).setParents("Block Infusion").registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(InfusionRegister.lightBlock));
		
	}
	
	public static void addPage()
	{
		 ResourceLocation background = new ResourceLocation("thaumcraft", "textures/gui/gui_researchback.png");
         ResearchCategories.registerCategory("TCE", new ResourceLocation(MainHelper.modName + ":" + TCELocalization.TCETabIcon), background);
         LanguageRegistry.instance().addStringLocalization("tc.research_category.TCE", "Thaumcraft Extras");
	}
	
}
