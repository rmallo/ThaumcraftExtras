package thaumcraftextras.items.foci;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.common.items.wands.ItemWandCasting;

public class ReturnFoci extends ItemFoci {

        private static final AspectList visUsage = new AspectList().add(Aspect.ORDER, 1200);

        public ReturnFoci(int i) {
                super(i);
        }

        @Override
        public ItemStack onFocusRightClick(ItemStack itemstack, World world, EntityPlayer player, MovingObjectPosition movingobjectposition) {
            ItemWandCasting wand = (ItemWandCasting)itemstack.getItem();
            if (wand.consumeAllVis(itemstack, player, getVisCost(), true)) {
            	int bedX = player.getBedLocation().posX;
            	int bedY = player.getBedLocation().posY;
            	int bedZ = player.getBedLocation().posZ;
            	player.setPosition(bedX, bedY, bedZ);
            }
      		return itemstack;
        }

        @Override
        public String getSortingHelper(ItemStack itemstack) {
                return "RETURN";
        }

        @Override
        public int getFocusColor() {
                return 0xCC0066;
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