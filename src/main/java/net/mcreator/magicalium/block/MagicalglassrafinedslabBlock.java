
package net.mcreator.magicalium.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class MagicalglassrafinedslabBlock extends SlabBlock {
	public MagicalglassrafinedslabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GLASS).strength(1f, 10f).lightLevel(s -> 1).friction(0.7f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 7;
	}
}