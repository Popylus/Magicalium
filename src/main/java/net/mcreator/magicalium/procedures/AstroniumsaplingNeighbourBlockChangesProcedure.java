package net.mcreator.magicalium.procedures;

import net.minecraftforge.eventbus.api.Event;

public class AstroniumsaplingNeighbourBlockChangesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.GRASS_BLOCK || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.DIRT_PATH
				|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.DIRT || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.ROOTED_DIRT)) {
			{
				BlockPos _pos = BlockPos.containing(x, y, z);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
	}
}