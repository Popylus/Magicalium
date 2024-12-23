
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
			tabData.accept(MagicaliumModBlocks.ASTRONIUM_WOOD_WOOD.get().asItem());
			tabData.accept(MagicaliumModBlocks.ASTRONIUM_WOOD_LOG.get().asItem());
			tabData.accept(MagicaliumModBlocks.ASTRONIUM_WOOD_PLANKS.get().asItem());
			tabData.accept(MagicaliumModBlocks.ASTRONIUM_WOOD_STAIRS.get().asItem());
			tabData.accept(MagicaliumModBlocks.ASTRONIUM_WOOD_SLAB.get().asItem());
			tabData.accept(MagicaliumModBlocks.ASTRONIUM_WOOD_FENCE.get().asItem());
			tabData.accept(MagicaliumModBlocks.ASTRONIUM_WOOD_FENCE_GATE.get().asItem());
			tabData.accept(MagicaliumModBlocks.ASTRONIUM_WOOD_PRESSURE_PLATE.get().asItem());
			tabData.accept(MagicaliumModBlocks.ASTRONIUM_WOOD_BUTTON.get().asItem());

		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {

			tabData.accept(MagicaliumModItems.MAGICAL_GLASS_ARMOR_ARMOR_HELMET.get());
			tabData.accept(MagicaliumModItems.MAGICAL_GLASS_ARMOR_ARMOR_CHESTPLATE.get());
			tabData.accept(MagicaliumModItems.MAGICAL_GLASS_ARMOR_ARMOR_LEGGINGS.get());
			tabData.accept(MagicaliumModItems.MAGICAL_GLASS_ARMOR_ARMOR_BOOTS.get());
			tabData.accept(MagicaliumModItems.ASTRONIUM_ARMOR_HELMET.get());
			tabData.accept(MagicaliumModItems.ASTRONIUM_ARMOR_CHESTPLATE.get());
			tabData.accept(MagicaliumModItems.ASTRONIUM_ARMOR_LEGGINGS.get());
			tabData.accept(MagicaliumModItems.ASTRONIUM_ARMOR_BOOTS.get());
			tabData.accept(MagicaliumModItems.ASTRONIUM_SWORD.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {

			tabData.accept(MagicaliumModItems.ASTRONIUM_INGOT.get());
			tabData.accept(MagicaliumModItems.MAGICALGLASS.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {

			tabData.accept(MagicaliumModBlocks.ASTRONIUM_WOOD_LEAVES.get().asItem());

		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {

			tabData.accept(MagicaliumModItems.MERLINPICKAXE.get());
			tabData.accept(MagicaliumModItems.MERLIN_HAXE.get());
			tabData.accept(MagicaliumModItems.MERLIN_SWORD.get());
			tabData.accept(MagicaliumModItems.MERLINSHOVEL.get());
			tabData.accept(MagicaliumModItems.ASTRONIUM_HOE.get());
			tabData.accept(MagicaliumModItems.ASTRONIUM_PICKAXE.get());
			tabData.accept(MagicaliumModItems.ASTRONIUM_AXE.get());
			tabData.accept(MagicaliumModItems.ASTRONIUM_SHOVEL.get());
			tabData.accept(MagicaliumModItems.MERLINPICKAXERAW.get());
			tabData.accept(MagicaliumModItems.MERLINSHOVELRAW.get());
			tabData.accept(MagicaliumModItems.MERLINAXERAW.get());
			tabData.accept(MagicaliumModItems.MERLINHOERAW.get());
			tabData.accept(MagicaliumModItems.MERLINHOE.get());

		}
	}
}
