package thaumcraftextras.blocks.container;

import java.util.ArrayList;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import thaumcraftextras.blocks.tileEntity.TileEntityCharger;
import thaumcraftextras.register.ItemRegister;
import thaumcraftextras.register.PostRegister;

public class ContainerCharger extends Container {
		int x, y;
        
		public static TileEntityCharger tile;
        
        public ContainerCharger(TileEntityCharger tileI, InventoryPlayer inventory) {
                super();
                this.tile = tileI;
                
                this.addSlotToContainer(new Slot(tile, 0, 79, 17));
                this.addSlotToContainer(new Slot(tile, 1, 79, 53));
                int i;

                for (i = 0; i < 3; ++i)
                {
                    for (int j = 0; j < 9; ++j)
                    {
                        this.addSlotToContainer(new Slot(inventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
                    }
                }

                for (i = 0; i < 9; ++i)
                {
                    this.addSlotToContainer(new Slot(inventory, i, 8 + i * 18, 142));
                }
        }
        
        @Override
        public boolean canInteractWith(EntityPlayer entityplayer) {
                return tile.isUseableByPlayer(entityplayer);
        }
        
        
        @Override
        public ItemStack transferStackInSlot(EntityPlayer player, int slot) 
        {
        	return null;
        }

}