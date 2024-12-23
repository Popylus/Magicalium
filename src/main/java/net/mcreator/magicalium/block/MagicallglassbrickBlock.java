
package net.mcreator.magicalium.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class MagicallglassbrickBlock extends Block {
	public MagicallglassbrickBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GRAVEL).strength(1f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 14;
	}
}