package net.mcreator.magicalium.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class MerlinprocedureProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == entity) {
			world.setBlock(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), Blocks.AIR.defaultBlockState(), 3);
		}
	}
}
