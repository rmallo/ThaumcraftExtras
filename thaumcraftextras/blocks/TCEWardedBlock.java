package thaumcraftextras.blocks;

import java.awt.Color;
import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

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
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import thaumcraftextras.blocks.tileEntity.TileEntityWarded;
import thaumcraftextras.helpers.IconHelper;
import thaumcraftextras.helpers.MainHelper;
import thaumcraftextras.lib.TCELocalization;
import thaumcraftextras.register.CreativeTabRegister;

public class TCEWardedBlock extends Block implements ITileEntityProvider{

	public TCEWardedBlock(int id) {
		super(id, Material.iron);
		setCreativeTab(CreativeTabRegister.tabMain);
		setBlockUnbreakable();
	}
	int metaId;

    @Override
    public int damageDropped(int meta)
    {
    	metaId = meta;
    	return meta;
    }

    @SideOnly(Side.CLIENT)
    private Icon[] icons;
  
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
        icons = new Icon[11];
        
        for(int i = 0; i < icons.length; i++)
        {
            icons[i] = par1IconRegister.registerIcon((this.getUnlocalizedName().substring(5)) + i);
        }
    }
    
    /**
     * 0 = White
     * 1 = Red
     * 2 = Blue
     * 3 = Green
     * 4 = Yellow
     * 5 = Brown
     * 6 = Cyan
     * 7 = Gray
     * 8 = Orange
     * 9 = Pink
     * 10 = Purple
     */
    
    @SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int metadata) {
    	switch(metadata)
    	{
    	case 0: return icons[0];
    	case 1: return icons[1];
        case 2: return icons[2];
       	case 3: return icons[3];
       	case 4: return icons[4];
       	case 5: return icons[5];
       	case 6: return icons[6];
       	case 7: return icons[7];
       	case 8: return icons[8];
       	case 9: return icons[9];
       	case 10: return icons[10];
       	default: return icons[0];
    	}
    }
  
	
	@Override
    public void getSubBlocks(int id, CreativeTabs tabs, List list)
    {
		int meta = 0;
		int end = 10;
		while(meta >= 0 && meta <= end)
		{
            list.add(new ItemStack(id, 1, meta));     
            meta++;
		}
    }
	
	@Override
	public TileEntity createNewTileEntity(World world) 
	{
        return new TileEntityWarded();
	}
	
	@Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemstack)
	{
		if(!world.isRemote)
		{
			TileEntityWarded tile = (TileEntityWarded)world.getBlockTileEntity(x, y, z);
			EntityPlayer player = ((EntityPlayer)entity);
		
			if (tile != null)
			{
				tile.setName(player.username);
				String l = tile.username;
			}
		}
	}
	
    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par1, float par2, float par3, float par4) 
    {
    	if(!world.isRemote && !player.isSneaking()) 
    	{
    		TileEntityWarded tile = (TileEntityWarded)world.getBlockTileEntity(x, y, z);
    		int blockId = world.getBlockId(x, y, z);
    		
    		if(tile != null && tile.username != null && tile.username == player.username)
    		{
    			dropBlockAsItem(world, x, y, z, new ItemStack(blockId, 1, world.getBlockMetadata(x, y, z)));
    			world.setBlock(x, y, z, 0);
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
    
}