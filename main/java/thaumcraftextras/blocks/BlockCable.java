package thaumcraftextras.blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import thaumcraftextras.helpers.IconHelper;
import thaumcraftextras.register.CreativeTabRegister;
import thaumcraftextras.register.MCKERegister;

public class BlockCable extends Block{

	public BlockCable(int id) {
		super(id, Material.iron);
		setCreativeTab(CreativeTabRegister.tabMain);
		setHardness(1.0F);
	}
	
	@Override
    public void setBlockBoundsBasedOnState(IBlockAccess acces, int x, int y, int z)
    {
		int block = MCKERegister.cable.blockID;
		
    	if(acces.getBlockId(x, y + 1, z) == block)
    	{
    		setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    	}
    	else if(acces.getBlockId(x, y -1, z) == block)
    	{
    		setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    	}
    	else
    	{
        	setBlockBounds(0.4F, 0.3F, 0.0F, 0.5F, 0.5F, 1.0F); 
    	}
    }


    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }


    @Override
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