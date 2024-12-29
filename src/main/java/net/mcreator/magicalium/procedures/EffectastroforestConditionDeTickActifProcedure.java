package net.mcreator.magicalium.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.magicalium.init.MagicaliumModBlocks;

public class EffectastroforestConditionDeTickActifProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		while ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == MagicaliumModBlocks.ASTRONIUMHERBE.get()) {
			if (entity instanceof Player) {
				entity.setMaxUpStep((float) 1.2);
			}
		}
	}
}
