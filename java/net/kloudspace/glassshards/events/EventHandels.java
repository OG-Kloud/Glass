package net.kloudspace.glassshards.events;

import java.util.Random;

import net.kloudspace.glassshards.blocks.GSBlocks;
import net.kloudspace.glassshards.items.GSItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.event.world.BlockEvent.PlaceEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class EventHandels {
	
	private Random random = new Random();	
	
	@SubscribeEvent
	public void onPlace(PlaceEvent event) {
		if(event.placedBlock != null) {
			if(event.placedBlock == GSBlocks.crackedGlass) {
				int x = event.x;
				int y = event.y;
				int z = event.z;
				World world = event.world;
				Block block = event.placedBlock;
				EntityItem item = new EntityItem(world, x,y,z, new ItemStack(GSItems.glassShard, random.nextInt(3) + 1));
				
//				block.breakBlock(world, x, y, z, block, 0);
				world.spawnEntityInWorld(item);
				world.setBlockToAir(x, y, z);
			}
		}
		
	}
	@SubscribeEvent
	public void onBreak(HarvestDropsEvent event) {
		World world = event.world;
		int x = event.x;
		int y = event.y;
		int z = event.z;
		if(event.block != null) {
			EntityItem item = new EntityItem(event.world, event.x,event.y,event.z, new ItemStack(GSItems.glassShard, random.nextInt(1)+ 1));
			EntityItem diamondFrag = new EntityItem(event.world, event.x, event.y, event.z, new ItemStack(GSItems.diamondFragment, 2));
			EntityItem diamond =new EntityItem(world, x, y, z, new ItemStack(Items.diamond, 8)); 
			if(event.block == Blocks.glass) {
				if(!event.isSilkTouching) {
					event.world.spawnEntityInWorld(item);
				}
			}
			if(event.block.getMaterial() == Material.glass) {
				if(event.block.getHarvestLevel(0) == 0) {
					if(!event.block.canHarvestBlock(event.harvester, 0)) {
						if(!event.isSilkTouching) {
							event.world.spawnEntityInWorld(item);
						}
					}
				}
			}
			if(event.block == Blocks.diamond_block){
				if(!event.isSilkTouching) {
					world.spawnEntityInWorld(diamond);
					world.spawnEntityInWorld(diamondFrag);
					event.drops.clear();
				}
			}
		}
	}

}