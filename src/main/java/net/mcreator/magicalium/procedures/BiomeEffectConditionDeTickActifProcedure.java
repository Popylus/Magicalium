package net.mcreator.magicalium.procedures;

import net.minecraftforge.eventbus.api.Event;

public class BiomeEffectConditionDeTickActifProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		while (world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("magicalium:astroniumforest"))) {
			if (entity instanceof Player) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 60, 1, false, false));
			}
		}
	}
}
