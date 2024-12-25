
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magicalium.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.magicalium.block.MagicallglassbrickBlock;
import net.mcreator.magicalium.block.MagicalglassstonestairsBlock;
import net.mcreator.magicalium.block.MagicalglassstoneBlock;
import net.mcreator.magicalium.block.MagicalglassstairsBlock;
import net.mcreator.magicalium.block.MagicalglassslabmBlock;
import net.mcreator.magicalium.block.MagicalglassslabBlock;
import net.mcreator.magicalium.block.MagicalglassrafinedstairsBlock;
import net.mcreator.magicalium.block.MagicalglassrafinedslabBlock;
import net.mcreator.magicalium.block.MagicalglassrafinedBlock;
import net.mcreator.magicalium.block.MagicalglassbricksstairsBlock;
import net.mcreator.magicalium.block.MagicalglassbrickslabBlock;
import net.mcreator.magicalium.block.MagicalglassOreBlock;
import net.mcreator.magicalium.block.MagicalglassBlockBlock;
import net.mcreator.magicalium.block.AstroniumsaplingBlock;
import net.mcreator.magicalium.block.AstroniumherbeBlock;
import net.mcreator.magicalium.block.Astronium_woodWoodBlock;
import net.mcreator.magicalium.block.Astronium_woodStairsBlock;
import net.mcreator.magicalium.block.Astronium_woodSlabBlock;
import net.mcreator.magicalium.block.Astronium_woodPressurePlateBlock;
import net.mcreator.magicalium.block.Astronium_woodPlanksBlock;
import net.mcreator.magicalium.block.Astronium_woodLogBlock;
import net.mcreator.magicalium.block.Astronium_woodLeavesBlock;
import net.mcreator.magicalium.block.Astronium_woodFenceGateBlock;
import net.mcreator.magicalium.block.Astronium_woodFenceBlock;
import net.mcreator.magicalium.block.Astronium_woodButtonBlock;
import net.mcreator.magicalium.block.ASTRONIUMOreBlock;
import net.mcreator.magicalium.block.ASTRONIUMBlockBlock;
import net.mcreator.magicalium.MagicaliumMod;

public class MagicaliumModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MagicaliumMod.MODID);
	public static final RegistryObject<Block> ASTRONIUM_BLOCK = REGISTRY.register("astronium_block", () -> new ASTRONIUMBlockBlock());
	public static final RegistryObject<Block> ASTRONIUM_ORE = REGISTRY.register("astronium_ore", () -> new ASTRONIUMOreBlock());
	public static final RegistryObject<Block> MAGICALGLASS_ORE = REGISTRY.register("magicalglass_ore", () -> new MagicalglassOreBlock());
	public static final RegistryObject<Block> MAGICALGLASS_BLOCK = REGISTRY.register("magicalglass_block", () -> new MagicalglassBlockBlock());
	public static final RegistryObject<Block> ASTRONIUM_WOOD_WOOD = REGISTRY.register("astronium_wood_wood", () -> new Astronium_woodWoodBlock());
	public static final RegistryObject<Block> ASTRONIUM_WOOD_LOG = REGISTRY.register("astronium_wood_log", () -> new Astronium_woodLogBlock());
	public static final RegistryObject<Block> ASTRONIUM_WOOD_PLANKS = REGISTRY.register("astronium_wood_planks", () -> new Astronium_woodPlanksBlock());
	public static final RegistryObject<Block> ASTRONIUM_WOOD_LEAVES = REGISTRY.register("astronium_wood_leaves", () -> new Astronium_woodLeavesBlock());
	public static final RegistryObject<Block> ASTRONIUM_WOOD_STAIRS = REGISTRY.register("astronium_wood_stairs", () -> new Astronium_woodStairsBlock());
	public static final RegistryObject<Block> ASTRONIUM_WOOD_SLAB = REGISTRY.register("astronium_wood_slab", () -> new Astronium_woodSlabBlock());
	public static final RegistryObject<Block> ASTRONIUM_WOOD_FENCE = REGISTRY.register("astronium_wood_fence", () -> new Astronium_woodFenceBlock());
	public static final RegistryObject<Block> ASTRONIUM_WOOD_FENCE_GATE = REGISTRY.register("astronium_wood_fence_gate", () -> new Astronium_woodFenceGateBlock());
	public static final RegistryObject<Block> ASTRONIUM_WOOD_PRESSURE_PLATE = REGISTRY.register("astronium_wood_pressure_plate", () -> new Astronium_woodPressurePlateBlock());
	public static final RegistryObject<Block> ASTRONIUM_WOOD_BUTTON = REGISTRY.register("astronium_wood_button", () -> new Astronium_woodButtonBlock());
	public static final RegistryObject<Block> ASTRONIUMSAPLING = REGISTRY.register("astroniumsapling", () -> new AstroniumsaplingBlock());
	public static final RegistryObject<Block> MAGICALGLASSSLAB = REGISTRY.register("magicalglassslab", () -> new MagicalglassslabBlock());
	public static final RegistryObject<Block> MAGICALGLASSRAFINED = REGISTRY.register("magicalglassrafined", () -> new MagicalglassrafinedBlock());
	public static final RegistryObject<Block> MAGICALGLASSRAFINEDSLAB = REGISTRY.register("magicalglassrafinedslab", () -> new MagicalglassrafinedslabBlock());
	public static final RegistryObject<Block> MAGICALGLASSSTONE = REGISTRY.register("magicalglassstone", () -> new MagicalglassstoneBlock());
	public static final RegistryObject<Block> MAGICALGLASSSTONESTAIRS = REGISTRY.register("magicalglassstonestairs", () -> new MagicalglassstonestairsBlock());
	public static final RegistryObject<Block> MAGICALGLASSSTAIRS = REGISTRY.register("magicalglassstairs", () -> new MagicalglassstairsBlock());
	public static final RegistryObject<Block> MAGICALGLASSBRICKSSTAIRS = REGISTRY.register("magicalglassbricksstairs", () -> new MagicalglassbricksstairsBlock());
	public static final RegistryObject<Block> MAGICALGLASSBRICKSLAB = REGISTRY.register("magicalglassbrickslab", () -> new MagicalglassbrickslabBlock());
	public static final RegistryObject<Block> MAGICALGLASSRAFINEDSTAIRS = REGISTRY.register("magicalglassrafinedstairs", () -> new MagicalglassrafinedstairsBlock());
	public static final RegistryObject<Block> MAGICALGLASSSLABM = REGISTRY.register("magicalglassslabm", () -> new MagicalglassslabmBlock());
	public static final RegistryObject<Block> MAGICALLGLASSBRICK = REGISTRY.register("magicallglassbrick", () -> new MagicallglassbrickBlock());
	public static final RegistryObject<Block> ASTRONIUMHERBE = REGISTRY.register("astroniumherbe", () -> new AstroniumherbeBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
