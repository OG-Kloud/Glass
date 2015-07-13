package net.kloudspace.glassshards.items.tools;

import net.kloudspace.glassshards.items.GSItems;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class GSItemSword extends ItemSword{
	
	private float field_150934_a;

	public GSItemSword(ToolMaterial mat) {
		super(mat);
		this.maxStackSize = 16;
		this.setMaxDamage(mat.getMaxUses());
		this.field_150934_a = 4.0F + mat.getDamageVsEntity();
	}
	
	/**
     * Current implementations of this method in child classes do not use the entry argument beside ev. They just raise
     * the damage on the stack.
     */
	@Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase player, EntityLivingBase other) {
		if(stack.getItem() != GSItems.glassBlade && stack.getItem() != GSItems.glassLongBlade) {
		stack.splitStack(1);
		} else {
			stack.damageItem(1, other);
		}
        return true;
    }

}
