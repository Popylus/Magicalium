
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

import net.mcreator.magicalium.item.MerlinshovelItem;
import net.mcreator.magicalium.item.MerlinpickaxeItem;
import net.mcreator.magicalium.item.MerlinSwordItem;
import net.mcreator.magicalium.item.MerlinHaxeItem;
import net.mcreator.magicalium.item.MagicalglassItem;
import net.mcreator.magicalium.item.Magical_glass_armorArmorItem;
import net.mcreator.magicalium.item.GlassstickItem;
import net.mcreator.magicalium.item.ASTRONIUMIngotItem;
import net.mcreator.magicalium.item.ASTRONIUMArmorItem;
import net.mcreator.magicalium.MagicaliumMod;

public class MagicaliumModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MagicaliumMod.MODID);
	public static final RegistryObject<Item> ASTRONIUM_BLOCK = block(MagicaliumModBlocks.ASTRONIUM_BLOCK);
	public static final RegistryObject<Item> ASTRONIUM_INGOT = REGISTRY.register("astronium_ingot", () -> new ASTRONIUMIngotItem());
	public static final RegistryObject<Item> ASTRONIUM_ORE = block(MagicaliumModBlocks.ASTRONIUM_ORE);
	public static final RegistryObject<Item> MAGICALGLASS_ORE = block(MagicaliumModBlocks.MAGICALGLASS_ORE);
	public static final RegistryObject<Item> MAGICALGLASS_BLOCK = block(MagicaliumModBlocks.MAGICALGLASS_BLOCK);
	public static final RegistryObject<Item> MAGICALGLASS = REGISTRY.register("magicalglass", () -> new MagicalglassItem());
	public static final RegistryObject<Item> MAGICAL_GLASS_ARMOR_ARMOR_HELMET = REGISTRY.register("magical_glass_armor_armor_helmet", () -> new Magical_glass_armorArmorItem.Helmet());
	public static final RegistryObject<Item> MAGICAL_GLASS_ARMOR_ARMOR_CHESTPLATE = REGISTRY.register("magical_glass_armor_armor_chestplate", () -> new Magical_glass_armorArmorItem.Chestplate());
	public static final RegistryObject<Item> MAGICAL_GLASS_ARMOR_ARMOR_LEGGINGS = REGISTRY.register("magical_glass_armor_armor_leggings", () -> new Magical_glass_armorArmorItem.Leggings());
	public static final RegistryObject<Item> MAGICAL_GLASS_ARMOR_ARMOR_BOOTS = REGISTRY.register("magical_glass_armor_armor_boots", () -> new Magical_glass_armorArmorItem.Boots());
	public static final RegistryObject<Item> ASTRONIUM_ARMOR_HELMET = REGISTRY.register("astronium_armor_helmet", () -> new ASTRONIUMArmorItem.Helmet());
	public static final RegistryObject<Item> ASTRONIUM_ARMOR_CHESTPLATE = REGISTRY.register("astronium_armor_chestplate", () -> new ASTRONIUMArmorItem.Chestplate());
	public static final RegistryObject<Item> ASTRONIUM_ARMOR_LEGGINGS = REGISTRY.register("astronium_armor_leggings", () -> new ASTRONIUMArmorItem.Leggings());
	public static final RegistryObject<Item> ASTRONIUM_ARMOR_BOOTS = REGISTRY.register("astronium_armor_boots", () -> new ASTRONIUMArmorItem.Boots());
	public static final RegistryObject<Item> ASTRONIUM_WOOD_WOOD = block(MagicaliumModBlocks.ASTRONIUM_WOOD_WOOD);
	public static final RegistryObject<Item> ASTRONIUM_WOOD_LOG = block(MagicaliumModBlocks.ASTRONIUM_WOOD_LOG);
	public static final RegistryObject<Item> ASTRONIUM_WOOD_PLANKS = block(MagicaliumModBlocks.ASTRONIUM_WOOD_PLANKS);
	public static final RegistryObject<Item> ASTRONIUM_WOOD_LEAVES = block(MagicaliumModBlocks.ASTRONIUM_WOOD_LEAVES);
	public static final RegistryObject<Item> ASTRONIUM_WOOD_STAIRS = block(MagicaliumModBlocks.ASTRONIUM_WOOD_STAIRS);
	public static final RegistryObject<Item> ASTRONIUM_WOOD_SLAB = block(MagicaliumModBlocks.ASTRONIUM_WOOD_SLAB);
	public static final RegistryObject<Item> ASTRONIUM_WOOD_FENCE = block(MagicaliumModBlocks.ASTRONIUM_WOOD_FENCE);
	public static final RegistryObject<Item> ASTRONIUM_WOOD_FENCE_GATE = block(MagicaliumModBlocks.ASTRONIUM_WOOD_FENCE_GATE);
	public static final RegistryObject<Item> ASTRONIUM_WOOD_PRESSURE_PLATE = block(MagicaliumModBlocks.ASTRONIUM_WOOD_PRESSURE_PLATE);
	public static final RegistryObject<Item> ASTRONIUM_WOOD_BUTTON = block(MagicaliumModBlocks.ASTRONIUM_WOOD_BUTTON);
	public static final RegistryObject<Item> MERLINPICKAXE = REGISTRY.register("merlinpickaxe", () -> new MerlinpickaxeItem());
	public static final RegistryObject<Item> MERLIN_HAXE = REGISTRY.register("merlin_haxe", () -> new MerlinHaxeItem());
	public static final RegistryObject<Item> MERLIN_SWORD = REGISTRY.register("merlin_sword", () -> new MerlinSwordItem());
	public static final RegistryObject<Item> MERLINSHOVEL = REGISTRY.register("merlinshovel", () -> new MerlinshovelItem());
	public static final RegistryObject<Item> GLASSSTICK = REGISTRY.register("glassstick", () -> new GlassstickItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
