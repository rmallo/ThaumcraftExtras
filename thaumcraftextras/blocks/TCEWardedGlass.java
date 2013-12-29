package thaumcraftextras.blocks;

import java.awt.Color;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import thaumcraftextras.blocks.tileEntity.TileWarded;
import thaumcraftextras.helpers.ColorHelper;
import thaumcraftextras.helpers.IconHelper;
import thaumcraftextras.register.CreativeTabRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TCEWardedGlass extends Block implements ITileEntityProvider{

	public TCEWardedGlass(int id) {
		super(id, Material.rock);
		setCreativeTab(CreativeTabRegister.tabMain);
		setBlockUnbreakable();
		setResistance(6000000.0F);
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
	
	@Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemstack)
	{
		if(!world.isRemote)
		{
			TileWarded tile = (TileWarded)world.getBlockTileEntity(x, y, z);
			EntityPlayer player = ((EntityPlayer)entity);
		
			if (tile != null)
			{
				tile.setName(player.username);
			}
		}
	}
	
    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par1, float par2, float par3, float par4) 
    {
    	if(!player.isSneaking())
    		return false;
    	if(!world.isRemote && player.isSneaking()) 
    	{
    		TileWarded tile = (TileWarded)world.getBlockTileEntity(x, y, z);
    		int blockId = world.getBlockId(x, y, z);
    		
    		if(tile != null && tile.getName().equals(player.username))
    		{
    			dropBlockAsItem(world, x, y, z, new ItemStack(blockId, 1, world.getBlockMetadata(x, y, z)));
    			world.setBlock(x, y, z, 0);
    			world.removeBlockTileEntity(x, y, z);
    		}
    	}
    	return true;
    }
	

    public static void dropBlockAsItem(World world, int x, int y, int z, ItemStack itemstack)
    {
        float f = 0.7F;
        double d0 = (double)(world.rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
        double d1 = (double)(world.rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
        double d2 = (double)(world.rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
        EntityItem entityitem = new EntityItem(world, (double)x + d0, (double)y + d1, (double)z + d2, itemstack);
        world.spawnEntityInWorld(entityitem);
    }

    @Override
    public void getSubBlocks(int id, CreativeTabs tabs, List list)
    {
		int meta = 0;
		int end = 15;
		while(meta >= 0 && meta <= end)
		{
            list.add(new ItemStack(id, 1, meta));     
            meta++;
            //getBlockColor();
            getRenderColor(meta);
		}
    }


    @SideOnly(Side.CLIENT)
    @Override
    public int getRenderColor(int par1)
    {
        return ColorHelper.getColorCode(par1);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public int colorMultiplier(IBlockAccess acces, int x, int y, int z)
    {
    	int meta = acces.getBlockMetadata(x, y, z);
    	return ColorHelper.getColorCode(meta);
    }
    
	@Override
	public TileEntity createNewTileEntity(World world) {
		return new TileWarded();
	}
}