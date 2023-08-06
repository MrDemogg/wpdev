
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wpsutilities.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.wpsutilities.item.WpciconItem;
import net.mcreator.wpsutilities.item.ShutterthrustItem;
import net.mcreator.wpsutilities.item.ShotgunbodyItem;
import net.mcreator.wpsutilities.item.PistoltriggerItem;
import net.mcreator.wpsutilities.item.PistolcoilItem;
import net.mcreator.wpsutilities.item.PistolcapItem;
import net.mcreator.wpsutilities.item.PistolbodyItem;
import net.mcreator.wpsutilities.item.PistolammoItem;
import net.mcreator.wpsutilities.item.HotironingotItem;
import net.mcreator.wpsutilities.item.GrenadebaseItem;
import net.mcreator.wpsutilities.item.GrenadeammoItem;
import net.mcreator.wpsutilities.item.ForearmItem;
import net.mcreator.wpsutilities.WpsUtilitiesMod;

public class WpsUtilitiesModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, WpsUtilitiesMod.MODID);
	public static final RegistryObject<Item> TRIGGER = REGISTRY.register("trigger", () -> new PistoltriggerItem());
	public static final RegistryObject<Item> PISTOLBODY = REGISTRY.register("pistolbody", () -> new PistolbodyItem());
	public static final RegistryObject<Item> COIL = REGISTRY.register("coil", () -> new PistolcoilItem());
	public static final RegistryObject<Item> PISTOLAMMO = REGISTRY.register("pistolammo", () -> new PistolammoItem());
	public static final RegistryObject<Item> PISTOLCAP = REGISTRY.register("pistolcap", () -> new PistolcapItem());
	public static final RegistryObject<Item> GRENADEAMMO = REGISTRY.register("grenadeammo", () -> new GrenadeammoItem());
	public static final RegistryObject<Item> GRENADEBASE = REGISTRY.register("grenadebase", () -> new GrenadebaseItem());
	public static final RegistryObject<Item> WPCICON = REGISTRY.register("wpcicon", () -> new WpciconItem());
	public static final RegistryObject<Item> SHOTGUNBODY = REGISTRY.register("shotgunbody", () -> new ShotgunbodyItem());
	public static final RegistryObject<Item> SHUTTERTHRUST = REGISTRY.register("shutterthrust", () -> new ShutterthrustItem());
	public static final RegistryObject<Item> FOREARM = REGISTRY.register("forearm", () -> new ForearmItem());
	public static final RegistryObject<Item> ENCHANTMENTTABLEBASE = block(WpsUtilitiesModBlocks.ENCHANTMENTTABLEBASE, WpsUtilitiesModTabs.TAB_WPS_UTILITIES);
	public static final RegistryObject<Item> HOTIRONINGOT = REGISTRY.register("hotironingot", () -> new HotironingotItem());
	public static final RegistryObject<Item> STEAMENGINEBASE = block(WpsUtilitiesModBlocks.STEAMENGINEBASE, WpsUtilitiesModTabs.TAB_WPS_UTILITIES);
	public static final RegistryObject<Item> STEAMENGINEPISTON = block(WpsUtilitiesModBlocks.STEAMENGINEPISTON, WpsUtilitiesModTabs.TAB_WPS_UTILITIES);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
