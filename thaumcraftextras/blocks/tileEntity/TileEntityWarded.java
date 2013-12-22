package thaumcraftextras.blocks.tileEntity;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet132TileEntityData;
import net.minecraft.tileentity.TileEntity;

public class TileEntityWarded extends TileEntity{
	public String username;
	
	public void setName(String value)
	{
		username = value;
	}
	
	@Override
	public void writeToNBT(NBTTagCompound par1)
	{
		par1.setString("name", username);
		super.writeToNBT(par1);
	}

	@Override
	public void readFromNBT(NBTTagCompound par1)
	{
		username = par1.getString("name");
		super.readFromNBT(par1);
	}
	
	@Override
	public Packet getDescriptionPacket() {
	    NBTTagCompound tagCompound = new NBTTagCompound();
	    writeToNBT(tagCompound);
	    return new Packet132TileEntityData(xCoord, yCoord, zCoord, 1, tagCompound);
	}
}
