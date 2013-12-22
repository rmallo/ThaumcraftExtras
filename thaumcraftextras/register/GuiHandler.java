package thaumcraftextras.register;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import thaumcraftextras.blocks.container.ContainerColor;
import thaumcraftextras.blocks.container.ContainerInfusion;
import thaumcraftextras.blocks.gui.GuiColor;
import thaumcraftextras.blocks.gui.GuiInfuseInfo;
import thaumcraftextras.blocks.tileEntity.TileEntityColor;
import thaumcraftextras.blocks.tileEntity.TileEntityInfusion;
import cpw.mods.fml.common.network.IGuiHandler;


public class GuiHandler implements IGuiHandler {
        @Override
        public Object getServerGuiElement(int id, EntityPlayer player, World world,
                        int x, int y, int z) 
        {
                TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
                if(id == 0)
                	return new ContainerInfusion((TileEntityInfusion) tileEntity, player.inventory);
                //if(id == 1)
                	//return new ContainerColor((TileEntityColor) tileEntity, player.inventory);
                else
                	return false;
        }


        @Override
        public Object getClientGuiElement(int id, EntityPlayer player, World world,
                        int x, int y, int z) 
        {
                TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
                if(id == 0)
                	return new GuiInfuseInfo((TileEntityInfusion) tileEntity, player.inventory);
                //if(id == 1)
                	//return new GuiColor((TileEntityColor) tileEntity, player.inventory);
                else 
                	return false;
        }
}