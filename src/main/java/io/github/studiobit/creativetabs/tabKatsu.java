package io.github.studiobit.creativetabs;

import io.github.studiobit.init.ModItems;
import io.github.studiobit.util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class tabKatsu extends CreativeTabs{
	public tabKatsu(String label) {
		super(Reference.MOD_ID);
	}
	
	@Override
	public ItemStack getTabIconItem()
	{
		return new ItemStack(ModItems.GYUKATSU);
	}
}
