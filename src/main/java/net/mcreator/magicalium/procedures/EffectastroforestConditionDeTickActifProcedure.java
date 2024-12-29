package net.mcreator.magicalium.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class EffectastroforestConditionDeTickActifProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		while (world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("magicalium:astroniumforest"))) {
			if (entity instanceof Player) {
				entity.setMaxUpStep((float) 1.6);
			}
		}
	}
}
