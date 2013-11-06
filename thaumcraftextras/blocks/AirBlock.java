package thaumcraftextras.blocks;




import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import thaumcraftextras.helpers.IconHelper;
import thaumcraftextras.register.CreativeTabRegister;




public class FireBlock extends BlockFire{




        public FireBlock(int id) {
                super(id, Material.air);
                setCreativeTab(CreativeTabRegister.tabMain);
        }
        
        @Override
         public void registerIcons(IconRegister par1IconRegister) 
        {
        blockIcon = IconHelper.forBlock(par1IconRegister, this);
}

        @Override
        public boolean renderAsNormalBlock()
        {
        return true;
        }
}
