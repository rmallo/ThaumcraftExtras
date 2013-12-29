package thaumcraftextras.api;

import java.util.ArrayList;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ChargerFunctions {

	public static ArrayList<Item> isFuel = new ArrayList<Item>();
	public static ArrayList<Item> isChargeAble = new ArrayList<Item>();

	public static void addChargeAble(Item item)
	{
		isChargeAble.add(item);
	}
	
	public static void removeChargeAble(Item item)
	{
		isChargeAble.remove(item);
	}
	
	public static void addFuel(Item item)
	{
		isFuel.add(item);
	}
	
	public static void removeFuel(Item item)
	{
		isFuel.remove(item);
	}
}
