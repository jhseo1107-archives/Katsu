package io.github.studiobit.items.food;

import io.github.studiobit.Main;
import io.github.studiobit.init.ModItems;
import io.github.studiobit.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood implements IHasModel{
	public FoodBase(String name, int amount, float saturation, boolean isAnimalFood)
	{
		super(amount, saturation, isAnimalFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.katsutab);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "Inventory");
	}
}
