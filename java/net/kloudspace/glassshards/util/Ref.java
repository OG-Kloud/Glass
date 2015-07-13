package net.kloudspace.glassshards.util;

import net.kloudspace.glassshards.blocks.GSBlocks;
import net.kloudspace.glassshards.items.GSItems;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Ref {
	
	public static final String folder = "glassshards:";
	
	public static void reg() {
		GameRegistry.addRecipe(new ItemStack(GSBlocks.crackedGlass), new Object[] { "xx", "xx", 'x', new ItemStack(GSItems.glassShard)});
		GameRegistry.addRecipe(new ItemStack(GSItems.diamondDust), new Object[]{ "xy", 'x', GSItems.morter, 'y', GSItems.diamondFragment});
		GameRegistry.addRecipe(new ItemStack(GSItems.morter), new Object[] { "x  ", "x x", "x  ", 'x', Blocks.cobblestone});
		GameRegistry.addRecipe(new ItemStack(GSItems.dustedGlass), new Object[] {"x", "y", 'x', GSItems.diamondDust, 'y', GSItems.glassShard});
		GameRegistry.addRecipe(new ItemStack(GSItems.dustedStack), new Object[] { "xx", "xx", 'x', GSItems.dustedGlass});
		GameRegistry.addRecipe(new ItemStack(GSItems.glassStack), new Object[] { "xx", "xx", 'x', GSItems.glassShard});
	}

}