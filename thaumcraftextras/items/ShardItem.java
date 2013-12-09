package thaumcraftextras.items;

import java.awt.Color;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import thaumcraftextras.helpers.IconHelper;
import thaumcraftextras.register.CreativeTabRegister;

public class ShardItem extends RodItem{

	public ShardItem(int id) {
		super(id);
		setCreativeTab(CreativeTabRegister.tabMain);
		setMaxStackSize(64);
	}
	
	@Override
    public void registerIcons(IconRegister par1IconRegister) 
	{
        itemIcon = IconHelper.forItem(par1IconRegister, this);
	}	
	
}
