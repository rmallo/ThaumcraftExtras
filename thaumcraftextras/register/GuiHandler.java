package thaumcraftextras.register;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import thaumcraftextras.blocks.container.ContainerTeleporter;
import thaumcraftextras.blocks.gui.GuiTeleporter;
import thaumcraftextras.blocks.tileEntity.TileEntityTeleporter;
import cpw.mods.fml.common.network.IGuiHandler;


public class GuiHandler implements IGuiHandler {
        @Override
        public Object getServerGuiElement(int id, EntityPlayer player, World world,
                        int x, int y, int z) 
        {
                TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
                if(id == 0)
                    return new ContainerTeleporter((TileEntityTeleporter) tileEntity, player.inventory);       
                else
                	return false;
        }


        @Override
        public Object getClientGuiElement(int id, EntityPlayer player, World world,
                        int x, int y, int z) 
        {
                TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
                if(id == 0)
                    return new GuiTeleporter((TileEntityTeleporter) tileEntity, player.inventory);
                else 
                	return false;
        }
}