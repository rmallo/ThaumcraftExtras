package thaumcraftextras.blocks.tileEntity;

import java.sql.Time;
import java.util.HashMap;
import java.util.Map;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import thaumcraftextras.api.ChargerFunctions;

public class TileEntityCharger extends TileEntity implements ISidedInventory
{
    
	ItemStack ItemStacks[]; 
    private static final int[] slots_top = new int[] {0};
    private static final int[] slots_bottom = new int[] {2, 1};
    private static final int[] slots_sides = new int[] {1};
    private static int chargeTime;
    
    public TileEntityCharger()
    {
    	ItemStacks = new ItemStack[2];
    	chargeTime = 60;
    }
    
	@Override
	public int getSizeInventory() {
		return ItemStacks.length;
	}
	
	@Override
	public ItemStack getStackInSlot(int i) 
	{
        return ItemStacks[i];
	}

	
	@Override
	public ItemStack decrStackSize(int i, int j)
	{
		if (ItemStacks[i] != null)
        {

            if (ItemStacks[i].stackSize <= j)
            {
                ItemStack itemstack = ItemStacks[i];
                ItemStacks[i] = null;
                return itemstack;
            }
            else
            {
                ItemStack itemstack1 = ItemStacks[i].splitStack(j);

                if (ItemStacks[i].stackSize == 0)
                {
                    ItemStacks[i] = null;
                }

                return itemstack1;
            }
        }
        else
        {
            return null;
        }
	}

    @Override
    public ItemStack getStackInSlotOnClosing(int i)
{
        if (ItemStacks[i] != null)
        {
            ItemStack itemstack = ItemStacks[i];
            ItemStacks[i] = null;
            return itemstack;
        }
        else
        {
            return null;
        }
    }

    @Override
    public void updateEntity()
    {
    	if(!this.worldObj.isRemote)
    	{
    		
    		if(getStackInSlot(0) != null && getStackInSlot(1) != null)
    		{
    		    			
    			Item inChargeSlot = getStackInSlot(0).getItem();
    			Item inFuelSlot = getStackInSlot(1).getItem();
    			
    			ItemStack inChargeSlotStack = getStackInSlot(0);
    			
    			if(ChargerFunctions.isFuel.contains(inFuelSlot) && ChargerFunctions.isChargeAble.contains(inChargeSlot))
    			{
    				if(chargeTime > 0)
    					chargeTime--;
    				
    				if(chargeTime <= 0)
    				{
    				Item item;
    				item = inChargeSlot;
    				int getDamage = item.getDamage(inChargeSlotStack);
    			
    				item.setDamage(inChargeSlotStack, getDamage - 1);
    				
    				if(ItemStacks[1].stackSize > 1)
    				{
    				ItemStacks[1] = new ItemStack(inFuelSlot, ItemStacks[1].stackSize - 1);
        			chargeTime = 60;

    				}
    				else if(ItemStacks[1].stackSize <= 1)
    				{
    				ItemStacks[1] = null;
    				}
    				
    				worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
    				}
    			}
    		}
    	}
    }
    
	@Override
	public void setInventorySlotContents(int i, ItemStack itemstack) 
	{	
        ItemStacks[i] = itemstack;

        if (itemstack != null && itemstack.stackSize > getInventoryStackLimit())
        {
            itemstack.stackSize = getInventoryStackLimit();
        }        
	}

	@Override
	public String getInvName() {
		return "mcke.charger";
	}

	@Override
	public boolean isInvNameLocalized() {
		return false;
	}

	@Override
	public int getInventoryStackLimit()
	{
		return 64;
	}
	

	@Override
	public void openChest() 
	{
		
	}

	@Override
	public void closeChest() 
	{
		
	}
	

	
	 @Override
     public void readFromNBT(NBTTagCompound tagCompound) {
             super.readFromNBT(tagCompound);
            
             NBTTagList tagList = tagCompound.getTagList("Inventory");
             for (int i = 0; i < tagList.tagCount(); i++) {
                     NBTTagCompound tag = (NBTTagCompound) tagList.tagAt(i);
                     byte slot = tag.getByte("Slot");
                     if (slot >= 0 && slot < ItemStacks.length) {
                             ItemStacks[slot] = ItemStack.loadItemStackFromNBT(tag);
                     }
             }
     }

     @Override
     public void writeToNBT(NBTTagCompound tagCompound) {
             super.writeToNBT(tagCompound);
                            
             NBTTagList itemList = new NBTTagList();
             for (int i = 0; i < ItemStacks.length; i++) {
                     ItemStack stack = ItemStacks[i];
                     if (stack != null) {
                             NBTTagCompound tag = new NBTTagCompound();
                             tag.setByte("Slot", (byte) i);
                             stack.writeToNBT(tag);
                             itemList.appendTag(tag);
                     }
             }
             tagCompound.setTag("Inventory", itemList);
     }
	
 	@Override
 	public boolean isUseableByPlayer(EntityPlayer player) 
 	{
         if (worldObj.getBlockTileEntity(xCoord, yCoord, zCoord) != this)
         {
                 return false;
         }

         return player.getDistanceSq((double)xCoord + 0.5D, (double)yCoord + 0.5D, (double)zCoord + 0.5D) <= 64D;
 	}
 	
	@Override
	public boolean isItemValidForSlot(int i, ItemStack itemstack) 
	{
        return true;
	}

	@Override
	public int[] getAccessibleSlotsFromSide(int side) 
	{
		switch(side)
		{
		case 0: return slots_bottom;
		case 1: return slots_top;
		case 2: return slots_sides;
		default: return null;
		}
	}

	@Override
	public boolean canInsertItem(int i, ItemStack itemstack, int j) {
		return true;
	}

	@Override
	public boolean canExtractItem(int i, ItemStack itemstack, int j) {
		return false;
	}
}