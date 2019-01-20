package io.github.studiobit.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init()
	{
		GameRegistry.addSmelting(ModItems.BEEF_FRYER, new ItemStack(ModItems.GYUKATSU), 0.5f);
		GameRegistry.addSmelting(ModItems.PORKCHOP_FRYER, new ItemStack(ModItems.DONKATSU), 0.5f);
	}
}
