package thaumcraftextras.items;

import net.minecraft.client.renderer.texture.IconRegister;
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
