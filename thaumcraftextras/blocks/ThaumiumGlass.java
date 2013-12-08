package thaumcraftextras.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.world.World;
import thaumcraftextras.helpers.IconHelper;
import thaumcraftextras.register.CreativeTabRegister;

public class ThaumiumGlass extends Block{

	public ThaumiumGlass(int id) {
		super(id, Material.rock);
		setCreativeTab(CreativeTabRegister.tabMain);
		setHardness(1.0F);
	}


    public int getRenderBlockPass()
    {
        return 0;
    }


    public boolean isOpaqueCube()
    {
        return false;
    }


    public boolean renderAsNormalBlock()
    {
        return false;
    }


	@Override
    public void registerIcons(IconRegister par1IconRegister) 
	{
        blockIcon = IconHelper.forBlock(par1IconRegister, this);
	}	
}