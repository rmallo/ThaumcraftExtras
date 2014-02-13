package thaumcraftextras.register;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityTameable;
import thaumcraftextras.api.functions.MiscFunctions;

public class MiscRegister {

	public static void load()
	{		
		addCleaner();
	}
	
	public static void addCleaner()
	{
		MiscFunctions.addToCleaner(Block.cobblestone);
		MiscFunctions.addToCleaner(Block.waterMoving);
		MiscFunctions.addToCleaner(Block.waterStill);
		MiscFunctions.addToCleaner(Block.lavaStill);
		MiscFunctions.addToCleaner(Block.lavaMoving);
		MiscFunctions.addToCleaner(Block.dirt);
		MiscFunctions.addToCleaner(Block.grass);
		MiscFunctions.addToCleaner(Block.blockSnow);
		MiscFunctions.addToCleaner(Block.leaves);
		MiscFunctions.addToCleaner(Block.stone);
	}
}
