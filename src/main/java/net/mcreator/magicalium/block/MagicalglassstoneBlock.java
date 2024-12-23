
package net.mcreator.magicalium.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class MagicalglassstoneBlock extends Block {
	public MagicalglassstoneBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GLASS).strength(1f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}