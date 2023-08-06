
package net.mcreator.wpsutilities.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.mcreator.wpsutilities.procedures.IgniteProcedure;
import net.mcreator.wpsutilities.init.WpsUtilitiesModTabs;

public class HotironingotItem extends Item {
	public HotironingotItem() {
		super(new Item.Properties().tab(WpsUtilitiesModTabs.TAB_WPS_UTILITIES).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		IgniteProcedure.execute(entity);
	}
}
