
package net.mcreator.magicalium.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class MagicalglassstonestairsBlock extends StairBlock {
	public MagicalglassstonestairsBlock() {
		super(() -> Blocks.AIR.defaultBlockState(), BlockBehaviour.Properties.of().sound(SoundType.GLASS).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
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
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}
}