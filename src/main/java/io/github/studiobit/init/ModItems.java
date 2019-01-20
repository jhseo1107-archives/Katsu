package io.github.studiobit.init;

import java.util.ArrayList;
import java.util.List;

import io.github.studiobit.creativetabs.tabKatsu;
import io.github.studiobit.items.ItemBase;
import io.github.studiobit.items.food.FoodBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModItems {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Items
	public static final Item FLOUR = new ItemBase("flour");
	public static final Item PORKCHOP_FRYER = new ItemBase("porkchop_fryer");
	public static final Item BEEF_FRYER = new ItemBase("beef_fryer");
	
	//Food
	public static final Item GYUKATSU = new FoodBase("gyukatsu", 14, 2.4f, false);
	public static final Item DONKATSU = new FoodBase("donkatsu", 12, 2.4f, false);
	
}
