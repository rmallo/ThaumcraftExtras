package thaumcraftextras.helpers;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class LanguageConverting {

	public static void load()
	{
		  String[] lang = {
              "en_US", "nl_NL"};
		  
		for(String locale : lang)
            LanguageRegistry.instance().loadLocalization("/assets/thaumcraftextras/lang/" + locale + ".lang", locale, false);
		
		/*
		String language;
		language = "en_US";
        LanguageRegistry.instance().addStringLocalization("tce.tag.Thaumcraft Extras", language, EnglishLocalization.ThaumcraftExtrasTag);
        LanguageRegistry.instance().addStringLocalization("tce.tag.Shard Infusion", language, EnglishLocalization.ShardInfusionTag);
        LanguageRegistry.instance().addStringLocalization("tce.tag.Block Infusion", language, EnglishLocalization.BlockInfusionTag);
        LanguageRegistry.instance().addStringLocalization("tce.tag.Pech Trade", language, EnglishLocalization.PechTradeTag);
        LanguageRegistry.instance().addStringLocalization("tce.tag.Magic Trade", language, EnglishLocalization.MagicTradeTag);
        LanguageRegistry.instance().addStringLocalization("tce.tag.Air Block", language, EnglishLocalization.AirBlockTag);
        LanguageRegistry.instance().addStringLocalization("tce.tag.Fire Block", language, EnglishLocalization.FireBlockTag);
        LanguageRegistry.instance().addStringLocalization("tce.tag.Earth Block", language, EnglishLocalization.EarthBlockTag);
        LanguageRegistry.instance().addStringLocalization("tce.tag.Water Block", language, EnglishLocalization.WaterBlockTag);
        LanguageRegistry.instance().addStringLocalization("tce.tag.Light Block", language, EnglishLocalization.LightBlockTag);
        LanguageRegistry.instance().addStringLocalization("tce.tag.Wand Focus: Blink", language, EnglishLocalization.enderFociTag);
        LanguageRegistry.instance().addStringLocalization("tce.tag.Wand Focus: Arrow", language, EnglishLocalization.arrowFociTag);
        LanguageRegistry.instance().addStringLocalization("tce.tag.Wand Focus: Heal", language, EnglishLocalization.healFociTag);
        LanguageRegistry.instance().addStringLocalization("tce.tag.Wand Focus: Speed", language, EnglishLocalization.speedFociTag);
        LanguageRegistry.instance().addStringLocalization("tce.tag.Wand Focus: Pech Summon", language, EnglishLocalization.pechFociTag);

        LanguageRegistry.instance().addStringLocalization("tce.text.Thaumcraft Extras", language, EnglishLocalization.mainEntry);
        LanguageRegistry.instance().addStringLocalization("tce.text.Shard Infusion", language, EnglishLocalization.shardInfusionEntry);
        LanguageRegistry.instance().addStringLocalization("tce.text.Block Infusion", language, EnglishLocalization.blockInfusionEntry);
        LanguageRegistry.instance().addStringLocalization("tce.text.Pech Trade", language, EnglishLocalization.pechTradeEntryPage1);
        LanguageRegistry.instance().addStringLocalization("tce.text.Magic Trade", language, EnglishLocalization.magicTradeEntryPage1);
        LanguageRegistry.instance().addStringLocalization("tce.text.Air Block", language, EnglishLocalization.airBlockEntry);
        LanguageRegistry.instance().addStringLocalization("tce.text.Fire Block", language, EnglishLocalization.fireBlockEntry);
        LanguageRegistry.instance().addStringLocalization("tce.text.Earth Block", language, EnglishLocalization.earthBlockEntry);
        LanguageRegistry.instance().addStringLocalization("tce.text.Water Block", language, EnglishLocalization.waterBlockEntry);
        LanguageRegistry.instance().addStringLocalization("tce.text.Light Block", language, EnglishLocalization.lightBlockEntry);
        LanguageRegistry.instance().addStringLocalization("tce.text.Wand Focus: Blink", language, EnglishLocalization.enderFociEntry);
        LanguageRegistry.instance().addStringLocalization("tce.text.Wand Focus: Arrow", language, EnglishLocalization.arrowFociEntry);
        LanguageRegistry.instance().addStringLocalization("tce.text.Wand Focus: Heal", language, EnglishLocalization.healFociEntry);
        LanguageRegistry.instance().addStringLocalization("tce.text.Wand Focus: Speed", language, EnglishLocalization.speedFociEntry);
        LanguageRegistry.instance().addStringLocalization("tce.text.Wand Focus: Pech Summon", language, EnglishLocalization.pechFociEntry); 
	
        
        language = "nl_NL";
        LanguageRegistry.instance().addStringLocalization("tce.tag.Thaumcraft Extras", language, DutchLocalization.ThaumcraftExtrasTag);
        LanguageRegistry.instance().addStringLocalization("tce.tag.Shard Infusion", language, DutchLocalization.ShardInfusionTag);
        LanguageRegistry.instance().addStringLocalization("tce.tag.Block Infusion", language, DutchLocalization.BlockInfusionTag);
        LanguageRegistry.instance().addStringLocalization("tce.tag.Pech Trade", language, DutchLocalization.PechTradeTag);
        LanguageRegistry.instance().addStringLocalization("tce.tag.Magic Trade", language, DutchLocalization.MagicTradeTag);
        LanguageRegistry.instance().addStringLocalization("tce.tag.Air Block", language, DutchLocalization.AirBlockTag);
        LanguageRegistry.instance().addStringLocalization("tce.tag.Fire Block", language, DutchLocalization.FireBlockTag);
        LanguageRegistry.instance().addStringLocalization("tce.tag.Earth Block", language, DutchLocalization.EarthBlockTag);
        LanguageRegistry.instance().addStringLocalization("tce.tag.Water Block", language, DutchLocalization.WaterBlockTag);
        LanguageRegistry.instance().addStringLocalization("tce.tag.Light Block", language, DutchLocalization.LightBlockTag);
        LanguageRegistry.instance().addStringLocalization("tce.tag.Wand Focus: Blink", language, DutchLocalization.enderFociTag);
        LanguageRegistry.instance().addStringLocalization("tce.tag.Wand Focus: Arrow", language, DutchLocalization.arrowFociTag);
        LanguageRegistry.instance().addStringLocalization("tce.tag.Wand Focus: Heal", language, DutchLocalization.healFociTag);
        LanguageRegistry.instance().addStringLocalization("tce.tag.Wand Focus: Speed", language, DutchLocalization.speedFociTag);
        LanguageRegistry.instance().addStringLocalization("tce.tag.Wand Focus: Pech Summon", language, DutchLocalization.pechFociTag);

        LanguageRegistry.instance().addStringLocalization("tce.text.Thaumcraft Extras", language, DutchLocalization.mainEntry);
        LanguageRegistry.instance().addStringLocalization("tce.text.Shard Infusion", language, DutchLocalization.shardInfusionEntry);
        LanguageRegistry.instance().addStringLocalization("tce.text.Block Infusion", language, DutchLocalization.blockInfusionEntry);
        LanguageRegistry.instance().addStringLocalization("tce.text.Pech Trade", language, DutchLocalization.pechTradeEntryPage1);
        LanguageRegistry.instance().addStringLocalization("tce.text.Magic Trade", language, DutchLocalization.magicTradeEntryPage1);
        LanguageRegistry.instance().addStringLocalization("tce.text.Air Block", language, DutchLocalization.airBlockEntry);
        LanguageRegistry.instance().addStringLocalization("tce.text.Fire Block", language, DutchLocalization.fireBlockEntry);
        LanguageRegistry.instance().addStringLocalization("tce.text.Earth Block", language, DutchLocalization.earthBlockEntry);
        LanguageRegistry.instance().addStringLocalization("tce.text.Water Block", language, DutchLocalization.waterBlockEntry);
        LanguageRegistry.instance().addStringLocalization("tce.text.Light Block", language, DutchLocalization.lightBlockEntry);
        LanguageRegistry.instance().addStringLocalization("tce.text.Wand Focus: Blink", language, DutchLocalization.enderFociEntry);
        LanguageRegistry.instance().addStringLocalization("tce.text.Wand Focus: Arrow", language, DutchLocalization.arrowFociEntry);
        LanguageRegistry.instance().addStringLocalization("tce.text.Wand Focus: Heal", language, DutchLocalization.healFociEntry);
        LanguageRegistry.instance().addStringLocalization("tce.text.Wand Focus: Speed", language, DutchLocalization.speedFociEntry);
        LanguageRegistry.instance().addStringLocalization("tce.text.Wand Focus: Pech Summon", language, DutchLocalization.pechFociEntry); 
        
        */
	
	}
}
