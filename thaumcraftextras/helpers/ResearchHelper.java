package thaumcraftextras.helpers;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.research.ResearchItem;
import thaumcraft.api.research.ResearchPage;
import thaumcraft.api.research.ResearchPage.PageType;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ResearchHelper extends ResearchItem {

	public ResearchHelper(String par1, String par2) {
        super(par1, par2);
	}

	public ResearchHelper(String par1, String par2, AspectList tags, int par3, int par4, int par5, ItemStack icon) {
        super(par1, par2, tags, par3, par4, par5, icon);
	}

	public ResearchHelper(String par1, String par2, AspectList tags, int par3, int par4, int par5, ResourceLocation icon) {
        super(par1, par2, tags, par3, par4, par5, icon);
	}
	
    @Override
    @SideOnly(Side.CLIENT)
    public String getName() {
            return StatCollector.translateToLocal(key);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public String getText() {
            return StatCollector.translateToLocal("[TCE] ") + StatCollector.translateToLocal(key);
    }
}
