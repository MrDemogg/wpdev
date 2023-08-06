
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wpsutilities.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class WpsUtilitiesModTabs {
	public static CreativeModeTab TAB_WPS_UTILITIES;

	public static void load() {
		TAB_WPS_UTILITIES = new CreativeModeTab("tabwps_utilities") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(WpsUtilitiesModItems.WPCICON.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
