
package net.mcreator.magicalium.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class DungeonflorrmagicalBlock extends Block {
	public DungeonflorrmagicalBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GLASS).strength(100f, 10f).lightLevel(s -> 1).friction(0.7f).speedFactor(1.1f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 13;
	}
}
