package net.mcreator.magicalium.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.magicalium.init.MagicaliumModItems;
import net.mcreator.magicalium.init.MagicaliumModBlocks;

public class AstroniumsapplingitemRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (((world.getBlockState(BlockPos.containing(x, y, z))) == Blocks.GRASS_BLOCK.defaultBlockState() || (world.getBlockState(BlockPos.containing(x, y, z))) == Blocks.DIRT.defaultBlockState()
				|| (world.getBlockState(BlockPos.containing(x, y, z))) == Blocks.DIRT_PATH.defaultBlockState() || (world.getBlockState(BlockPos.containing(x, y, z))) == Blocks.COARSE_DIRT.defaultBlockState())
				&& ((world.getBlockState(BlockPos.containing(x, y + 1, z))) == Blocks.AIR.defaultBlockState() || (world.getBlockState(BlockPos.containing(x, y + 1, z))) == Blocks.VOID_AIR.defaultBlockState()
						|| (world.getBlockState(BlockPos.containing(x, y + 1, z))) == Blocks.CAVE_AIR.defaultBlockState())) {
			if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(MagicaliumModItems.ASTRONIUMSAPPLINGITEM.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.grass.place")), SoundSource.NEUTRAL, 1, (float) 0.8);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.grass.place")), SoundSource.NEUTRAL, 1, (float) 0.8, false);
				}
			}
			world.setBlock(BlockPos.containing(x, y + 1, z), MagicaliumModBlocks.ASTRONIUMSAPLING.get().defaultBlockState(), 3);
		}
	}
}
