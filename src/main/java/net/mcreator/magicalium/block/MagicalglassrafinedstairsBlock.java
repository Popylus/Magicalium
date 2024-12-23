
package net.mcreator.magicalium.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class MagicalglassrafinedstairsBlock extends StairBlock {
	public MagicalglassrafinedstairsBlock() {
		super(() -> Blocks.AIR.defaultBlockState(), BlockBehaviour.Properties.of().sound(SoundType.GLASS).strength(1f, 10f).lightLevel(s -> 1).friction(0.7f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
	}

	@Override
	public float getExplosionResistance() {
		return 10f;
	}

	@Override
	public boolean isRandomlyTicking(BlockState state) {
		return false;
	}

	@Override
	public boolean skipRendering(BlockState state, BlockState adjacentBlockState, Direction side) {
		return adjacentBlockState.getBlock() == this ? true : super.skipRendering(state, adjacentBlockState, side);
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 7;
	}
}