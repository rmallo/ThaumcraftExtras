package thaumcraftextras.items;

import thaumcraftextras.helpers.IconHelper;
import thaumcraftextras.register.CreativeTabRegister;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ShardItem extends Item{

	public ShardItem(int id) {
		super(id);
		setCreativeTab(CreativeTabRegister.tabMain);
	}
	
	@Override
    public void registerIcons(IconRegister par1IconRegister) 
	{
        itemIcon = IconHelper.forItem(par1IconRegister, this);
}	
}
