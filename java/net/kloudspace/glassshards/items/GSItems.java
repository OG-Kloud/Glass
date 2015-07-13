package net.kloudspace.glassshards.items;

import net.kloudspace.glassshards._Mod;
import net.kloudspace.glassshards.items.tools.GSItemSword;
import net.kloudspace.glassshards.util.Ref;
import net.kloudspace.glassshards.util.RegistryHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class GSItems {

	public static Item glassShard;
	public static Item diamondFragment;
	public static Item diamondDust;
	public static Item morter;
	public static Item glassStack;
	public static Item dustedStack;
	public static Item dustedGlass;
	public static Item glassBlade;
	public static Item glassLongBlade;
	
	public static Item glassSword;
	public static Item glassKnife;
	
	public static void reg() {
		glassShard = new GSItemSword(_Mod.GLASS).setMaxStackSize(16).setNoRepair().setUnlocalizedName("glassShard").setTextureName(Ref.folder + "glassShard");
		RegistryHelper.register(glassShard);
		RegistryHelper.addLanguageMapping(glassShard, "Shard of Glass");
//		GameRegistry.addSmelting(glassShard, new ItemStack(Blocks.glass_pane), 1);
		
		diamondFragment = new Item().setUnlocalizedName("diamondFragment").setTextureName(Ref.folder + "diamondFragment");
		RegistryHelper.register(diamondFragment);
		RegistryHelper.addLanguageMapping(diamondFragment, "Fragment of Diamond");
		
		diamondDust= new Item().setUnlocalizedName("diamondDust").setTextureName(Ref.folder + "diamondDust");
		RegistryHelper.register(diamondDust);
		RegistryHelper.addLanguageMapping(diamondDust, "Diamond Dust");
		
		morter = new MorterItem(morter).setUnlocalizedName("morter").setTextureName(Ref.folder + "morter").setMaxStackSize(1);
		RegistryHelper.register(morter);
		RegistryHelper.addLanguageMapping(morter, "Stone Morter");
		
		dustedGlass = new GSItemSword(_Mod.GLASS).setUnlocalizedName("dustedGlass").setTextureName(Ref.folder + "dustedGlass");
		RegistryHelper.register(dustedGlass);
		RegistryHelper.addLanguageMapping(dustedGlass, "Dusted Glass");
		
		glassStack = new Item().setUnlocalizedName("glassStack").setTextureName(Ref.folder + "glassStack");
		RegistryHelper.register(glassStack);
		RegistryHelper.addLanguageMapping(glassStack, "Stack of Glass Shards");
		
		glassBlade = new GSItemSword(_Mod.DUSTEDGLASS).setUnlocalizedName("glassBlade").setTextureName(Ref.folder + "glassBlade").setMaxStackSize(1).setMaxDamage(32);
		RegistryHelper.register(glassBlade);
		RegistryHelper.addLanguageMapping(glassBlade, "Glass Blade");
		GameRegistry.addSmelting(dustedGlass, new ItemStack(glassBlade), 2.0F);

		glassLongBlade = new GSItemSword(_Mod.DUSTEDGLASS).setUnlocalizedName("glassLongBlade").setTextureName(Ref.folder + "glassLongBlade").setMaxStackSize(1).setMaxDamage(49);
		RegistryHelper.register(glassLongBlade);
		RegistryHelper.addLanguageMapping(glassLongBlade, "Glass Long Blade");
		
		dustedStack = new Item().setUnlocalizedName("dustedStack").setTextureName(Ref.folder + "dustedStack");
		RegistryHelper.register(dustedStack);
		RegistryHelper.addLanguageMapping(dustedStack, "Stack of Dusted Glass Shards");
		GameRegistry.addSmelting(dustedStack, new ItemStack(glassLongBlade), 2.0F);
	}
}