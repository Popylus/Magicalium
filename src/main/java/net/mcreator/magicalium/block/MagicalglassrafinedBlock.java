
package net.mcreator.magicalium.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class MagicalglassrafinedBlock extends Block {
	public MagicalglassrafinedBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GLASS).strength(1f, 10f).lightLevel(s -> 1).friction(0.7f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
	}

	@Override
	public boolean skipRendering(BlockState state, BlockState adjacentBlockState, Direction side) {
		return adjacentBlockState.getBlock() == this ? true : super.skipRendering(state, adjacentBlockState, side);
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 7;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}
}