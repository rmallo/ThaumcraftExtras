package thaumcraftextras.items;

import java.awt.Color;
import java.util.List;

import javax.swing.colorchooser.ColorSelectionModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import thaumcraft.common.config.ConfigItems;
import thaumcraft.common.items.wands.ItemFocusPouch;
import thaumcraftextras.register.ItemRegister;

public class FocusPouchColor extends ItemFocusPouch {

	public FocusPouchColor(int id) {
		super(id);
	}

	@Override
    public int getColorFromItemStack(ItemStack itemstack, int color)
    {
		int damage = ItemRegister.pouch.getDamage(itemstack);
		
		switch(damage)
		{
		case 1: return Color.red.hashCode();
		case 2: return Color.blue.hashCode();
		case 3: return Color.green.hashCode();
		case 4: return Color.cyan.hashCode();
		}
		return color;
    }
	
	@Override
    public void getSubItems(int id, CreativeTabs tab, List list)
    {
			list.add(new ItemStack(id, 1, 1));
			list.add(new ItemStack(id, 1, 2));
			list.add(new ItemStack(id, 1, 3));
			list.add(new ItemStack(id, 1, 4));

    }
}
