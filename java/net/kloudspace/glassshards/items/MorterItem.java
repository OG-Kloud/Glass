package net.kloudspace.glassshards.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MorterItem extends Item {
	
	public MorterItem(Item item){
//		this.hasContainerItem(new ItemStack(item));
		this.doesContainerItemLeaveCraftingGrid(new ItemStack(item));
	}

}
