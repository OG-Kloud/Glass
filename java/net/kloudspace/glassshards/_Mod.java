package net.kloudspace.glassshards;

import java.util.Random;

import net.kloudspace.glassshards.blocks.GSBlocks;
import net.kloudspace.glassshards.events.EventHandels;
import net.kloudspace.glassshards.items.GSItems;
import net.kloudspace.glassshards.util.Ref;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "glassshards", name = "Glass Shards", version = "1.0.0")
public class _Mod {
	public static Random rand = new Random();
	public static ToolMaterial GLASS = EnumHelper.addToolMaterial("GLASS", 0, 0, 0, rand.nextInt(10) +1, 99);
	public static ToolMaterial DUSTEDGLASS = EnumHelper.addToolMaterial("DUSTEDGLASS", 0, 121, 5, 10, 75);
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		GSItems.reg();
		GSBlocks.reg();
		MinecraftForge.EVENT_BUS.register(new EventHandels());
	}
	@EventHandler
	public void init(FMLInitializationEvent event) {
		Ref.reg();
	}

}
