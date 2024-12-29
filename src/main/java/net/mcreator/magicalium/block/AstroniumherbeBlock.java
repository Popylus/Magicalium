
package net.mcreator.magicalium.block;

import net.minecraftforge.common.IPlantable;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.magicalium.procedures.AstroWorldLorsqueLeDeclencheurDuPortailEstUtiliseProcedure;

public class AstroniumherbeBlock extends Block {
	public AstroniumherbeBlock() {
		super(BlockBehaviour.Properties.of().mapColor(MapColor.GRASS).sound(SoundType.GRAVEL).strength(1f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public boolean canSustainPlant(BlockState state, BlockGetter world, BlockPos pos, Direction direction, IPlantable plantable) {
		return true;
	}

	@Override
	public void stepOn(Level world, BlockPos pos, BlockState blockstate, Entity entity) {
		super.stepOn(world, pos, blockstate, entity);
		AstroWorldLorsqueLeDeclencheurDuPortailEstUtiliseProcedure.execute(entity);
	}
}
