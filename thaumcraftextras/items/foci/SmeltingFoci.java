package thaumcraftextras.items.foci;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.common.items.wands.ItemWandCasting;

public class SmeltingFoci extends ItemFoci {

        private static final AspectList visUsage = new AspectList().add(Aspect.ORDER, 50).add(Aspect.FIRE, 60);

        public SmeltingFoci(int i) {
                super(i);
        }
        
        @Override
        public ItemStack onFocusRightClick(ItemStack itemstack, World world, EntityPlayer player, MovingObjectPosition mop) {
    		if(mop == null)
				return itemstack;
        	ItemWandCasting wand = (ItemWandCasting)itemstack.getItem();
            int blockId = world.getBlockId(mop.blockX, mop.blockY, mop.blockZ);
    		
            	if(player.canPlayerEdit(mop.blockX, mop.blockY, mop.blockZ, mop.sideHit, itemstack)){
                	if (wand.consumeAllVis(itemstack, player, getVisCost(), true)) {
            		if(!world.isRemote)
            		{
                    	setSmeltingResult(mop, world, player, itemstack);
            		}
                	}
            	}
      		return itemstack;
        }
        private static int block;
        
        public static void setSmeltingResult(MovingObjectPosition mop, World world, EntityPlayer player, ItemStack itemstack)
        {
            int blockId = world.getBlockId(mop.blockX, mop.blockY, mop.blockZ);
            ItemStack block = new ItemStack(blockId, 1, 0);
            ItemStack blockAir = new ItemStack(blockId, 1, 0);
            ItemStack sResult = FurnaceRecipes.smelting().getSmeltingResult(block);
            if(sResult != null  && sResult.getItem() instanceof ItemBlock)
            {
            	world.setBlock(mop.blockX, mop.blockY, mop.blockZ, sResult.itemID);
            }
            else if(sResult != null) 
            {
            	int meta = sResult.getItemDamage();
        		world.setBlock(mop.blockX, mop.blockY, mop.blockZ, 0);
        		player.inventory.addItemStackToInventory(new ItemStack(sResult.itemID, 1, meta));
            }
        	else if (sResult != block)
        	{
        		return;
        	}

        }
        @Override
        public String getSortingHelper(ItemStack itemstack) {
                return "SMELTING";
        }

        @Override
        public int getFocusColor() {
                return 0x333300;
        }

        @Override
        boolean hasOrnament() {
                return false;
        }

        @Override
        public AspectList getVisCost() {
                return visUsage;
        }
        
		@Override
		public boolean acceptsEnchant(int id) {
			return false;
		}
}