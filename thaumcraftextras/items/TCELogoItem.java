package thaumcraftextras.items;


import thaumcraftextras.helpers.IconHelper;
import thaumcraftextras.register.CreativeTabRegister;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;


public class TCELogoItem extends Item{


        public TCELogoItem(int id) {
                super(id);
        }
        
        @Override
    public void registerIcons(IconRegister par1IconRegister) 
        {
        itemIcon = IconHelper.forItem(par1IconRegister, this);
}


        
}

