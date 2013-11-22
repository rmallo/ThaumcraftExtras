package thaumcraftextras.items.foci;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.common.items.wands.ItemWandCasting;

public class DestroyFoci extends ItemFoci {

        private static final AspectList visUsage = new AspectList().add(Aspect.ORDER, 20);

        public DestroyFoci(int i) {
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
            			if(blockId != Block.bedrock.blockID)
            				world.setBlock(mop.blockX, mop.blockY, mop.blockZ, 0);
                	}
                	}
            	}
            	
      		return itemstack;
        }
  

        @Override
        public String getSortingHelper(ItemStack itemstack) {
                return "DESTROY";
        }

        @Override
        public int getFocusColor() {
                return 0x00CC99;
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