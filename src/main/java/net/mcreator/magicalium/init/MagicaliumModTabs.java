
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magicalium.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.magicalium.MagicaliumMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MagicaliumModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MagicaliumMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {

			tabData.accept(MagicaliumModBlocks.ASTRONIUM_BLOCK.get().asItem());
			tabData.accept(MagicaliumModBlocks.ASTRONIUM_ORE.get().asItem());
			tabData.accept(MagicaliumModBlocks.MAGICALGLASS_ORE.get().asItem());
			tabData.accept(MagicaliumModBlocks.MAGICALGLASS_BLOCK.get().asItem());

		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {

			tabData.accept(MagicaliumModItems.ASTRONIUM_ARMOR_HELMET.get());
			tabData.accept(MagicaliumModItems.ASTRONIUM_ARMOR_CHESTPLATE.get());
			tabData.accept(MagicaliumModItems.ASTRONIUM_ARMOR_LEGGINGS.get());
			tabData.accept(MagicaliumModItems.ASTRONIUM_ARMOR_BOOTS.get());
			tabData.accept(MagicaliumModItems.MAGICAL_GLASS_ARMOR_ARMOR_HELMET.get());
			tabData.accept(MagicaliumModItems.MAGICAL_GLASS_ARMOR_ARMOR_CHESTPLATE.get());
			tabData.accept(MagicaliumModItems.MAGICAL_GLASS_ARMOR_ARMOR_LEGGINGS.get());
			tabData.accept(MagicaliumModItems.MAGICAL_GLASS_ARMOR_ARMOR_BOOTS.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {

			tabData.accept(MagicaliumModItems.ASTRONIUM_INGOT.get());
			tabData.accept(MagicaliumModItems.MAGICALGLASS.get());

		}
	}
}
