package thaumcraftextras.api;

import java.util.ArrayList;

import net.minecraft.item.Item;

public class ExchangerFunctions {

	public static ArrayList<Item> canExchange = new ArrayList<Item>();
	
	public static void addItem(Item item)
	{
		canExchange.add(item);
	}
	
	public static void removeItem(Item item)
	{
		canExchange.remove(item);
	}
}
