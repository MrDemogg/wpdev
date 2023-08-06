
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wpsutilities.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.wpsutilities.block.SteamenginepistonBlock;
import net.mcreator.wpsutilities.block.SteamenginebaseBlock;
import net.mcreator.wpsutilities.block.EnchantmenttablebaseBlock;
import net.mcreator.wpsutilities.WpsUtilitiesMod;

public class WpsUtilitiesModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, WpsUtilitiesMod.MODID);
	public static final RegistryObject<Block> ENCHANTMENTTABLEBASE = REGISTRY.register("enchantmenttablebase", () -> new EnchantmenttablebaseBlock());
	public static final RegistryObject<Block> STEAMENGINEBASE = REGISTRY.register("steamenginebase", () -> new SteamenginebaseBlock());
	public static final RegistryObject<Block> STEAMENGINEPISTON = REGISTRY.register("steamenginepiston", () -> new SteamenginepistonBlock());
}
