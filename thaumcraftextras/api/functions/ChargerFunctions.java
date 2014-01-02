package thaumcraftextras.api.functions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import net.minecraft.item.Item;

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
