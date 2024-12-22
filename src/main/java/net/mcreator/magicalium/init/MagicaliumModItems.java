
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magicalium.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.magicalium.item.ASTRONIUMIngotItem;
import net.mcreator.magicalium.MagicaliumMod;

public class MagicaliumModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MagicaliumMod.MODID);
	public static final RegistryObject<Item> ASTRONIUM_INGOT = REGISTRY.register("astronium_ingot", () -> new ASTRONIUMIngotItem());
	public static final RegistryObject<Item> ASTRONIUM_ORE = block(MagicaliumModBlocks.ASTRONIUM_ORE);
	public static final RegistryObject<Item> ASTRONIUM_BLOCK = block(MagicaliumModBlocks.ASTRONIUM_BLOCK);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
