package thaumcraftextras.blocks.container;

import java.util.ArrayList;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import thaumcraftextras.api.functions.ChargerFunctions;
import thaumcraftextras.blocks.tileEntity.TileEntityCharger;
import thaumcraftextras.register.ItemRegister;

public class ContainerCharger extends Container {
		int x, y;
        
		public static TileEntityCharger tile;
        Slot slot;
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
        public ItemStack transferStackInSlot(EntityPlayer player, int id)
        {
        	return null;
        }
        /*
        @Override
        public ItemStack transferStackInSlot(EntityPlayer player, int id)
        {
        ItemStack stack = null;
        Slot slotId = (Slot)inventorySlots.get(id);
        
        if(slotId != null && slotId.getHasStack())
        {
        	ItemStack stack2 = slotId.getStack();
        
        	if(stack2 != null && !getStuff(stack2.getItem(), 0))
        		return null;
        	
        	boolean slot1 = ((Slot)inventorySlots.get(0)).isItemValid(stack2);
        	boolean slot2 = ((Slot)inventorySlots.get(1)).isItemValid(stack2);
        	
        	stack = stack2.copy();
        	
        	if(id < 2)
        	{
        		if(!mergeItemStack(stack2, 1, 37, false))
        			return null;
        		
        	}
        	else if(slot1 ? !mergeItemStack(stack2, 1, 2, false) : getStuff(stack2.getItem(), 0) && !mergeItemStack(stack2, 0, 1, false))
        	{
        		if(stack2.stackSize == 0)
        			slotId.putStack((ItemStack)null);
        		else
        			slotId.onSlotChanged();
        		
        		if(stack2.stackSize == stack.stackSize)
        			return null;
        		
        		slotId.onPickupFromSlot(player, stack2);
        	}
        }
        return stack;
        }
        */
        
        public boolean getStuff(Item item, int id)
        {
        	switch(id)
        	{
        	case 0: return ChargerFunctions.isChargeAble.contains(item);
        	case 1: return ChargerFunctions.isFuel.containsKey(item);
        	default: return ChargerFunctions.isFuel.containsKey(item);
        	}
        }
}