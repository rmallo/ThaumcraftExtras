package thaumcraftextras.items.foci;

import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.common.items.wands.ItemWandCasting;

public class EnderFoci extends ItemFoci {

        private static final AspectList visUsage = new AspectList().add(Aspect.AIR, 1500);

        public EnderFoci(int i) {
                super(i);
        }

        @Override
        public ItemStack onFocusRightClick(ItemStack itemstack, World world, EntityPlayer player, MovingObjectPosition movingobjectposition) {
            ItemWandCasting wand = (ItemWandCasting)itemstack.getItem();
            if (wand.consumeAllVis(itemstack, player, getVisCost(), true)) {
        	if(!world.isRemote)
        	{
                world.spawnEntityInWorld(new EntityEnderPearl(world, player));
        	}
            }
    		return itemstack;

        }

        @Override
        public String getSortingHelper(ItemStack itemstack) {
                return "ENDER";
        }

        @Override
        public int getFocusColor() {
                return 0x006633;
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