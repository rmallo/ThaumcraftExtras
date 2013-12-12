package thaumcraftextras.blocks;

import java.awt.Color;
import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import thaumcraftextras.helpers.IconHelper;
import thaumcraftextras.register.BlockRegister;
import thaumcraftextras.register.CreativeTabRegister;

public class ColoredThaumiumBlock extends Block{

	public ColoredThaumiumBlock(int id) {
		super(id, Material.iron);
		setCreativeTab(CreativeTabRegister.tabMain);
		setHardness(1.0F);
	}
	
	@Override
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        par3List.add(new ItemStack(par1, 1, 0));
    }
	
    public void registerIcons(IconRegister par1IconRegister) 
	{
    	blockIcon = par1IconRegister.registerIcon("thaumcraft:thaumiumblock");
	}

    @Override
    public int getBlockColor()
    {
    	return Color.red.hashCode();
    }

    @Override
    public int getRenderColor(int par1)
    {
    	return Color.red.hashCode();
  
    }
}