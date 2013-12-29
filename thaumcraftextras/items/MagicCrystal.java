package thaumcraftextras.items;

import java.awt.Color;
import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import thaumcraftextras.helpers.IconHelper;

public class MagicCrystal extends TCEItem{

	public MagicCrystal(int id) {
		super(id);
		setMaxStackSize(1);
        setMaxDamage(50);
	}
	
	@Override
    public void registerIcons(IconRegister par1IconRegister) 
	{
        itemIcon = IconHelper.forItem(par1IconRegister, this);
	}
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean id)
	{
		list.add("Chargeable Crystal");
	}
	
	@Override
	public void getSubItems(int id, CreativeTabs tabs, List list)
	{
		list.add(new ItemStack(id, 1, 50));     
	}
	
}
