
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magicalium.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.magicalium.block.MagicalglassOreBlock;
import net.mcreator.magicalium.block.MagicalglassBlockBlock;
import net.mcreator.magicalium.block.ASTRONIUMOreBlock;
import net.mcreator.magicalium.block.ASTRONIUMBlockBlock;
import net.mcreator.magicalium.MagicaliumMod;

public class MagicaliumModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MagicaliumMod.MODID);
	public static final RegistryObject<Block> ASTRONIUM_BLOCK = REGISTRY.register("astronium_block", () -> new ASTRONIUMBlockBlock());
	public static final RegistryObject<Block> ASTRONIUM_ORE = REGISTRY.register("astronium_ore", () -> new ASTRONIUMOreBlock());
	public static final RegistryObject<Block> MAGICALGLASS_ORE = REGISTRY.register("magicalglass_ore", () -> new MagicalglassOreBlock());
	public static final RegistryObject<Block> MAGICALGLASS_BLOCK = REGISTRY.register("magicalglass_block", () -> new MagicalglassBlockBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
