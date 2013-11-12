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
import thaumcraftextras.lib.TCELocalization;

public class ThaumonomiconRegister {

	public static void addEntryToThaumonomicon()
	{
		ResearchItem research;

		String text;
		String text2;
		
		text = "You found out there is a lot more in Thaumcraft then you expected.";
		research = new ResearchHelper("Thaumcraft Extras", "TCE", new AspectList(), 0, 0, 30, new ItemStack(BlockRegister.researchBlock)).setRound().setAutoUnlock().registerResearchItem();
		research.setPages(new ResearchPage(text));
		
		text = "Good for trading with Pech's.";
		text2 = "You can craft them until you have a tier 5 Pech Trade.";
		research = new ResearchHelper("Pech Trade", "TCE", new AspectList().add(Aspect.GREED, 10).add(Aspect.EXCHANGE, 10), 2, -2, 3, new ItemStack(ItemRegister.pechTradeTier1)).setParents("Thaumcraft Extras").registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(ThaumcraftRecipeRegister.pechTradeTier1), new ResearchPage(text2), new ResearchPage(ThaumcraftRecipeRegister.pechTradeTier2));

		text = "A collection of Aspects.";
		text2 = "You can craft them until you have a tier 5 Magic Trade.";
		research = new ResearchHelper("Magic Trade", "TCE", new AspectList().add(Aspect.MAGIC, 10), 2, -4, 3, new ItemStack(ItemRegister.magicTradeTier1)).setParents("Pech Trade").setConcealed().registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(ThaumcraftRecipeRegister.magicTradeTier1), new ResearchPage(text2), new ResearchPage(ThaumcraftRecipeRegister.magicTradeTier2));
		
		text = "A collection of Fire Made out of the holy fire of hell.";
		research = new ResearchHelper("Fire Block", "TCE", new AspectList().add(Aspect.FIRE, 10), 0, -2, 3, new ItemStack(BlockRegister.fireBlock)).setParents("Thaumcraft Extras").registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(ThaumcraftRecipeRegister.fireBlock));
		
		text = "A collection of Air Scooped out of the Air itself, you can place blocks in it just like you can in air.";
		research = new ResearchHelper("Air Block", "TCE", new AspectList().add(Aspect.AIR, 10), 0, -4, 3, new ItemStack(BlockRegister.airBlock)).setParents("Fire Block").setConcealed().registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(ThaumcraftRecipeRegister.airBlock));
		
		text = "The magic of arrows will sometimes do good when your not getting hit by them.";
		research = new ResearchHelper(TCELocalization.arrowFoci, "TCE", new AspectList().add(Aspect.AIR, 20), -2, -2, 3, new ItemStack(ItemRegister.arrowFoci)).setParents("Thaumcraft Extras").registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(ThaumcraftRecipeRegister.arrowFoci));

		text = "You discovered a way to teleport around with this wonderful focus, Go to whatever place you want to be in!";
		research = new ResearchHelper(TCELocalization.enderFoci, "TCE", new AspectList().add(Aspect.AIR, 20), -2, -3, 3, new ItemStack(ItemRegister.enderFoci)).setParents("Wand Focus: Arrow").registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(ThaumcraftRecipeRegister.enderFoci));
		
		text = "You discovered a way to heal yourself with this wonderful focus, But is there a negetive side to that all?";
		research = new ResearchHelper(TCELocalization.healFoci, "TCE", new AspectList().add(Aspect.ORDER, 20).add(Aspect.HEAL, 25), -3, -2, 3, new ItemStack(ItemRegister.healFoci)).setParents("Thaumcraft Extras").registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(ThaumcraftRecipeRegister.healFoci));
		
		text = "You discovered a way to run faster and faster, You can use this to make your journey go way faster.";
		research = new ResearchHelper(TCELocalization.speedFoci, "TCE", new AspectList().add(Aspect.AIR, 10), -3, -3, 3, new ItemStack(ItemRegister.speedFoci)).setParents("Wand Focus: Heal").registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(ThaumcraftRecipeRegister.speedFoci));
	
		text = "You found a way to summon this mysterious creature called The Pech, Please don't make him angry.";
		research = new ResearchHelper(TCELocalization.pechFoci, "TCE", new AspectList().add(Aspect.EXCHANGE, 10), -2, 2, 3, new ItemStack(ItemRegister.pechFoci)).setParents("Thaumcraft Extras").registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(ThaumcraftRecipeRegister.pechFoci));
	}
	
	public static void addPage()
	{
		 ResourceLocation background = new ResourceLocation("thaumcraft", "textures/gui/gui_researchback.png");
         ResearchCategories.registerCategory("TCE", new ResourceLocation(MainHelper.modName + ":" + TCELocalization.TCETabIcon), background);
         LanguageRegistry.instance().addStringLocalization("tc.research_category.TCE", "Thaumcraft Extras");
	}
	
}
