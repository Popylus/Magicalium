
package net.mcreator.magicalium.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class MagicalglassslabBlock extends SlabBlock {
	public MagicalglassslabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GRAVEL).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
	}

	@Override
	public boolean skipRendering(BlockState state, BlockState adjacentBlockState, Direction side) {
		return adjacentBlockState.getBlock() == this ? true : super.skipRendering(state, adjacentBlockState, side);
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}
}
