package net.kloudspace.glassshards.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class CrackedGlass extends Block {
	
	private Item drop;
	private int meta;
	private int min;
	private int max;

	protected CrackedGlass(Item drop, int meta, int min, int max) {
		super(Material.glass);
		this.drop = drop;
		this.meta = meta;
		this.min = min;
		this.max = max;
	}
	
	protected CrackedGlass(Item drop) {
		this(drop, 0, 3, 4);
	}
	
	@Override
	public Item getItemDropped(int meta, Random random, int fortune) {
		return this.drop;
	}
	@Override
	public int damageDropped(int meta) {
		return this.meta;
	}
	@Override
	public int quantityDropped(int meta, int fortune, Random random) {
		if(this.min >= this.max) return this.min;
		return this.min +random.nextInt(this.max-this.min + fortune +1);
	}

}
