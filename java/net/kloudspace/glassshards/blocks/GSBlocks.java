package net.kloudspace.glassshards.blocks;

import net.kloudspace.glassshards.items.GSItems;
import net.kloudspace.glassshards.util.Ref;
import net.kloudspace.glassshards.util.RegistryHelper;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class GSBlocks {
	
	public static Block crackedGlass;
	
	public static void reg() {
		crackedGlass = new CrackedGlass(GSItems.glassShard).setBlockTextureName(Ref.folder + "crackedGlass").setBlockName("crackedGlass");
		RegistryHelper.register(crackedGlass);
		RegistryHelper.addLanguageMapping(crackedGlass, "Cracked Glass");
		GameRegistry.addSmelting(crackedGlass, new ItemStack(Blocks.glass), 0);
//		GameRegistry.addShapelessRecipe(new ItemStack(crackedGlass), new Object[]{ "xx", "xx", 'x', new ItemStack(GSItems.glassShard)});
	}
	


}
