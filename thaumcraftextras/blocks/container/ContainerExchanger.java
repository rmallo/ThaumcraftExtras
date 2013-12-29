package thaumcraftextras.blocks.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import thaumcraftextras.blocks.container.slots.SlotChargeable;
import thaumcraftextras.blocks.container.slots.SlotExchange;
import thaumcraftextras.blocks.tileEntity.TileEntityCharger;
import thaumcraftextras.blocks.tileEntity.TileEntityExchanger;

public class ContainerExchanger extends Container {
		int x, y;
        
		public static TileEntityExchanger tile;
        
        public ContainerExchanger(TileEntityExchanger tileI, InventoryPlayer inventory) {
                super();
                this.tile = tileI;
                
                this.addSlotToContainer(new SlotExchange(tile, 0, 79, 17));
                this.addSlotToContainer(new SlotChargeable(tile, 1, 79, 53));
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